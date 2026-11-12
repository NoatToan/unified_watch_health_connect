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
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class TransportTicket<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<Integer> round;

    @Required
    private Slot<TransportType> transport_type;
    private Optional<Slot<TicketType>> ticket_type = Optional.a();
    private Optional<Slot<Miai.City>> from_city = Optional.a();
    private Optional<Slot<Miai.City>> to_city = Optional.a();
    private Optional<Slot<Miai.Datetime>> begin_time = Optional.a();
    private Optional<Slot<Miai.Datetime>> end_time = Optional.a();

    public enum TicketType {
        NormalTicket(1, "NormalTicket"),
        BusinessClassSeat(2, "BusinessClassSeat"),
        FirstClassSeat(3, "FirstClassSeat"),
        EconomyClassSeat(4, "EconomyClassSeat"),
        HighSpeedRail(5, "HighSpeedRail");

        private int id;
        private String name;

        TicketType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static TicketType find(String str) {
            for (TicketType ticketType : values()) {
                if (ticketType.name.equals(str)) {
                    return ticketType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static TicketType read(String str) {
            return find(str);
        }

        public static String write(TicketType ticketType) {
            return ticketType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum TransportType {
        Train(1, "Train"),
        Flight(2, "Flight"),
        Bus(3, "Bus");

        private int id;
        private String name;

        TransportType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static TransportType find(String str) {
            for (TransportType transportType : values()) {
                if (transportType.name.equals(str)) {
                    return transportType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static TransportType read(String str) {
            return find(str);
        }

        public static String write(TransportType transportType) {
            return transportType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class arrivalTime implements EntityType {
        public static arrivalTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new arrivalTime();
        }

        public static c4h write(arrivalTime arrivaltime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class availableTime implements EntityType {
        public static availableTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new availableTime();
        }

        public static c4h write(availableTime availabletime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class boardingGate implements EntityType {
        public static boardingGate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new boardingGate();
        }

        public static c4h write(boardingGate boardinggate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class bought implements EntityType {
        public static bought read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new bought();
        }

        public static c4h write(bought boughtVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class daysToSale implements EntityType {
        public static daysToSale read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new daysToSale();
        }

        public static c4h write(daysToSale daystosale) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class delayInfo implements EntityType {
        public static delayInfo read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new delayInfo();
        }

        public static c4h write(delayInfo delayinfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class departureTime implements EntityType {
        public static departureTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new departureTime();
        }

        public static c4h write(departureTime departuretime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class itinerary implements EntityType {
        public static itinerary read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new itinerary();
        }

        public static c4h write(itinerary itineraryVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class panic implements EntityType {
        public static panic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new panic();
        }

        public static c4h write(panic panicVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class saleDate implements EntityType {
        public static saleDate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new saleDate();
        }

        public static c4h write(saleDate saledate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class seatNumber implements EntityType {
        public static seatNumber read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new seatNumber();
        }

        public static c4h write(seatNumber seatnumber) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class timeCost implements EntityType {
        public static timeCost read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new timeCost();
        }

        public static c4h write(timeCost timecost) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class trafficNumber implements EntityType {
        public static trafficNumber read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new trafficNumber();
        }

        public static c4h write(trafficNumber trafficnumber) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public TransportTicket() {
    }

    public static TransportTicket read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TransportTicket transportTicket = new TransportTicket(IntentUtils.readEntityType(zsdVar, AIApiConstants.TransportTicket.NAME, optional));
        transportTicket.setTransportType(IntentUtils.readSlot(zsdVar.w("transport_type"), TransportType.class));
        transportTicket.setRound(IntentUtils.readSlot(zsdVar.w("round"), Integer.class));
        if (zsdVar.z("ticket_type")) {
            transportTicket.setTicketType(IntentUtils.readSlot(zsdVar.w("ticket_type"), TicketType.class));
        }
        if (zsdVar.z("from_city")) {
            transportTicket.setFromCity(IntentUtils.readSlot(zsdVar.w("from_city"), Miai.City.class));
        }
        if (zsdVar.z("to_city")) {
            transportTicket.setToCity(IntentUtils.readSlot(zsdVar.w("to_city"), Miai.City.class));
        }
        if (zsdVar.z("begin_time")) {
            transportTicket.setBeginTime(IntentUtils.readSlot(zsdVar.w("begin_time"), Miai.Datetime.class));
        }
        if (zsdVar.z(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)) {
            transportTicket.setEndTime(IntentUtils.readSlot(zsdVar.w(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME), Miai.Datetime.class));
        }
        return transportTicket;
    }

    public static zsd write(TransportTicket transportTicket) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(transportTicket.entity_type);
        c4hVar.f0("transport_type", IntentUtils.writeSlot(transportTicket.transport_type));
        c4hVar.f0("round", IntentUtils.writeSlot(transportTicket.round));
        if (transportTicket.ticket_type.c()) {
            c4hVar.f0("ticket_type", IntentUtils.writeSlot(transportTicket.ticket_type.b()));
        }
        if (transportTicket.from_city.c()) {
            c4hVar.f0("from_city", IntentUtils.writeSlot(transportTicket.from_city.b()));
        }
        if (transportTicket.to_city.c()) {
            c4hVar.f0("to_city", IntentUtils.writeSlot(transportTicket.to_city.b()));
        }
        if (transportTicket.begin_time.c()) {
            c4hVar.f0("begin_time", IntentUtils.writeSlot(transportTicket.begin_time.b()));
        }
        if (transportTicket.end_time.c()) {
            c4hVar.f0(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, IntentUtils.writeSlot(transportTicket.end_time.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Datetime>> getBeginTime() {
        return this.begin_time;
    }

    public Optional<Slot<Miai.Datetime>> getEndTime() {
        return this.end_time;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.City>> getFromCity() {
        return this.from_city;
    }

    @Required
    public Slot<Integer> getRound() {
        return this.round;
    }

    public Optional<Slot<TicketType>> getTicketType() {
        return this.ticket_type;
    }

    public Optional<Slot<Miai.City>> getToCity() {
        return this.to_city;
    }

    @Required
    public Slot<TransportType> getTransportType() {
        return this.transport_type;
    }

    public TransportTicket setBeginTime(Slot<Miai.Datetime> slot) {
        this.begin_time = Optional.e(slot);
        return this;
    }

    public TransportTicket setEndTime(Slot<Miai.Datetime> slot) {
        this.end_time = Optional.e(slot);
        return this;
    }

    @Required
    public TransportTicket setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TransportTicket setFromCity(Slot<Miai.City> slot) {
        this.from_city = Optional.e(slot);
        return this;
    }

    @Required
    public TransportTicket setRound(Slot<Integer> slot) {
        this.round = slot;
        return this;
    }

    public TransportTicket setTicketType(Slot<TicketType> slot) {
        this.ticket_type = Optional.e(slot);
        return this;
    }

    public TransportTicket setToCity(Slot<Miai.City> slot) {
        this.to_city = Optional.e(slot);
        return this;
    }

    @Required
    public TransportTicket setTransportType(Slot<TransportType> slot) {
        this.transport_type = slot;
        return this;
    }

    public TransportTicket(T t) {
        this.entity_type = t;
    }

    public TransportTicket(T t, Slot<TransportType> slot, Slot<Integer> slot2) {
        this.entity_type = t;
        this.transport_type = slot;
        this.round = slot2;
    }
}
