package kz.iitu.office.room.api.repository;

import kz.iitu.office.room.api.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, String> {
}
