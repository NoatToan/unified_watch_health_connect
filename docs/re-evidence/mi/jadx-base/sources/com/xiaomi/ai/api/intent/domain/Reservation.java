package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Reservation<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Integer>> num_person = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<Integer>> index = Optional.a();

    public static Reservation read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Reservation reservation = new Reservation();
        if (zsdVar.z("datetime")) {
            reservation.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("num_person")) {
            reservation.setNumPerson(IntentUtils.readSlot(zsdVar.w("num_person"), Integer.class));
        }
        if (zsdVar.z("city")) {
            reservation.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            reservation.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("index")) {
            reservation.setIndex(IntentUtils.readSlot(zsdVar.w("index"), Integer.class));
        }
        return reservation;
    }

    public static zsd write(Reservation reservation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (reservation.datetime.c()) {
            c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(reservation.datetime.b()));
        }
        if (reservation.num_person.c()) {
            c4hVarCreateObjectNode.f0("num_person", IntentUtils.writeSlot(reservation.num_person.b()));
        }
        if (reservation.city.c()) {
            c4hVarCreateObjectNode.f0("city", IntentUtils.writeSlot(reservation.city.b()));
        }
        if (reservation.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(reservation.keyword.b()));
        }
        if (reservation.index.c()) {
            c4hVarCreateObjectNode.f0("index", IntentUtils.writeSlot(reservation.index.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<Integer>> getIndex() {
        return this.index;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public Optional<Slot<Integer>> getNumPerson() {
        return this.num_person;
    }

    public Reservation setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    public Reservation setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public Reservation setIndex(Slot<Integer> slot) {
        this.index = Optional.e(slot);
        return this;
    }

    public Reservation setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public Reservation setNumPerson(Slot<Integer> slot) {
        this.num_person = Optional.e(slot);
        return this;
    }
}
