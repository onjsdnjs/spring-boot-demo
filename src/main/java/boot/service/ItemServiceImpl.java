package boot.service;

import boot.entity.Item;
import boot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kaha on 2014. 10. 8..
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }
}
