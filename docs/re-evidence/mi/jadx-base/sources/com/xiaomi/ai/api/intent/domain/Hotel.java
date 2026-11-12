package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.smarthome.homeroom.model.Home;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Hotel<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<String>> address = Optional.a();
    private Optional<Slot<Integer>> star_level = Optional.a();

    public enum RoomType {
        Standard_room(1, "standard_room"),
        Double_room(2, "double_room"),
        King_room(3, "king_room"),
        Single_room(4, "single_room");

        private int id;
        private String name;

        RoomType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static RoomType find(String str) {
            for (RoomType roomType : values()) {
                if (roomType.name.equals(str)) {
                    return roomType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static RoomType read(String str) {
            return find(str);
        }

        public static String write(RoomType roomType) {
            return roomType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class specificRoom implements EntityType {
        private Optional<Slot<RoomType>> type = Optional.a();
        private Optional<Slot<Integer>> min_price = Optional.a();
        private Optional<Slot<Integer>> max_price = Optional.a();

        public static specificRoom read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            specificRoom specificroom = new specificRoom();
            if (zsdVar.z("type")) {
                specificroom.setType(IntentUtils.readSlot(zsdVar.w("type"), RoomType.class));
            }
            if (zsdVar.z("min_price")) {
                specificroom.setMinPrice(IntentUtils.readSlot(zsdVar.w("min_price"), Integer.class));
            }
            if (zsdVar.z("max_price")) {
                specificroom.setMaxPrice(IntentUtils.readSlot(zsdVar.w("max_price"), Integer.class));
            }
            return specificroom;
        }

        public static c4h write(specificRoom specificroom) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (specificroom.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(specificroom.type.b()));
            }
            if (specificroom.min_price.c()) {
                c4hVarCreateObjectNode.f0("min_price", IntentUtils.writeSlot(specificroom.min_price.b()));
            }
            if (specificroom.max_price.c()) {
                c4hVarCreateObjectNode.f0("max_price", IntentUtils.writeSlot(specificroom.max_price.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getMaxPrice() {
            return this.max_price;
        }

        public Optional<Slot<Integer>> getMinPrice() {
            return this.min_price;
        }

        public Optional<Slot<RoomType>> getType() {
            return this.type;
        }

        public specificRoom setMaxPrice(Slot<Integer> slot) {
            this.max_price = Optional.e(slot);
            return this;
        }

        public specificRoom setMinPrice(Slot<Integer> slot) {
            this.min_price = Optional.e(slot);
            return this;
        }

        public specificRoom setType(Slot<RoomType> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public Hotel() {
    }

    public static Hotel read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Hotel hotel = new Hotel(IntentUtils.readEntityType(zsdVar, AIApiConstants.Hotel.NAME, optional));
        if (zsdVar.z("name")) {
            hotel.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("city")) {
            hotel.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z(Home.JSON_KEY_ADDRESS)) {
            hotel.setAddress(IntentUtils.readSlot(zsdVar.w(Home.JSON_KEY_ADDRESS), String.class));
        }
        if (zsdVar.z("star_level")) {
            hotel.setStarLevel(IntentUtils.readSlot(zsdVar.w("star_level"), Integer.class));
        }
        return hotel;
    }

    public static zsd write(Hotel hotel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(hotel.entity_type);
        if (hotel.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(hotel.name.b()));
        }
        if (hotel.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(hotel.city.b()));
        }
        if (hotel.address.c()) {
            c4hVar.f0(Home.JSON_KEY_ADDRESS, IntentUtils.writeSlot(hotel.address.b()));
        }
        if (hotel.star_level.c()) {
            c4hVar.f0("star_level", IntentUtils.writeSlot(hotel.star_level.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getAddress() {
        return this.address;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<Integer>> getStarLevel() {
        return this.star_level;
    }

    public Hotel setAddress(Slot<String> slot) {
        this.address = Optional.e(slot);
        return this;
    }

    public Hotel setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    @Required
    public Hotel setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Hotel setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Hotel setStarLevel(Slot<Integer> slot) {
        this.star_level = Optional.e(slot);
        return this;
    }

    public Hotel(T t) {
        this.entity_type = t;
    }
}
