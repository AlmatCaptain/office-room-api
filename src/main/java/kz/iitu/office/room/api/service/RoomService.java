package kz.iitu.office.room.api.service;

import kz.iitu.office.room.api.model.Room;
import kz.iitu.office.room.api.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public void deleteRoom(String id) {
        roomRepository.deleteById(id);
    }

    public void addRoom(Room room) {
        roomRepository.saveAndFlush(room);
    }
}
