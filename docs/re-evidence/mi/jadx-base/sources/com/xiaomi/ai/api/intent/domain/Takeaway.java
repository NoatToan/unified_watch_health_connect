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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Takeaway<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();

    public static class arrivalTime implements EntityType {
        public static arrivalTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new arrivalTime();
        }

        public static c4h write(arrivalTime arrivaltime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class history implements EntityType {

        @Required
        private Slot<Miai.Datetime> datetime;

        public history() {
        }

        public history(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
        }

        public static history read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            history historyVar = new history();
            historyVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            return historyVar;
        }

        public static c4h write(history historyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(historyVar.datetime));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Datetime> getDatetime() {
            return this.datetime;
        }

        @Required
        public history setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
            return this;
        }
    }

    public static class trace implements EntityType {
        public static trace read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new trace();
        }

        public static c4h write(trace traceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Takeaway() {
    }

    public static Takeaway read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Takeaway takeaway = new Takeaway(IntentUtils.readEntityType(zsdVar, AIApiConstants.Takeaway.NAME, optional));
        if (zsdVar.z("name")) {
            takeaway.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("city")) {
            takeaway.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        return takeaway;
    }

    public static zsd write(Takeaway takeaway) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(takeaway.entity_type);
        if (takeaway.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(takeaway.name.b()));
        }
        if (takeaway.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(takeaway.city.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
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

    public Takeaway setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    @Required
    public Takeaway setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Takeaway setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Takeaway(T t) {
        this.entity_type = t;
    }
}
