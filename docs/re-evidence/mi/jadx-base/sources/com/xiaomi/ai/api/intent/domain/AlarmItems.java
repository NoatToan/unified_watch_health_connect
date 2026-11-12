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
public class AlarmItems<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<c4h> value;

    public static class origin implements EntityType {
        private Optional<Slot<String>> event = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.Duration>> duration = Optional.a();

        public static origin read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            origin originVar = new origin();
            if (zsdVar.z("event")) {
                originVar.setEvent(IntentUtils.readSlot(zsdVar.w("event"), String.class));
            }
            if (zsdVar.z("datetime")) {
                originVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("duration")) {
                originVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            return originVar;
        }

        public static c4h write(origin originVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (originVar.event.c()) {
                c4hVarCreateObjectNode.f0("event", IntentUtils.writeSlot(originVar.event.b()));
            }
            if (originVar.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(originVar.datetime.b()));
            }
            if (originVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(originVar.duration.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<String>> getEvent() {
            return this.event;
        }

        public origin setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public origin setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public origin setEvent(Slot<String> slot) {
            this.event = Optional.e(slot);
            return this;
        }
    }

    public static class selected implements EntityType {

        @Required
        private Slot<Boolean> all;

        @Required
        private Slot<Integer> index;

        @Required
        private Slot<AlarmStatus> status;

        public selected() {
        }

        public selected(Slot<Integer> slot, Slot<AlarmStatus> slot2, Slot<Boolean> slot3) {
            this.index = slot;
            this.status = slot2;
            this.all = slot3;
        }

        public static selected read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            selected selectedVar = new selected();
            selectedVar.setIndex(IntentUtils.readSlot(zsdVar.w("index"), Integer.class));
            selectedVar.setStatus(IntentUtils.readSlot(zsdVar.w("status"), AlarmStatus.class));
            selectedVar.setAll(IntentUtils.readSlot(zsdVar.w("all"), Boolean.class));
            return selectedVar;
        }

        public static c4h write(selected selectedVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("index", IntentUtils.writeSlot(selectedVar.index));
            c4hVarCreateObjectNode.f0("status", IntentUtils.writeSlot(selectedVar.status));
            c4hVarCreateObjectNode.f0("all", IntentUtils.writeSlot(selectedVar.all));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Boolean> getAll() {
            return this.all;
        }

        @Required
        public Slot<Integer> getIndex() {
            return this.index;
        }

        @Required
        public Slot<AlarmStatus> getStatus() {
            return this.status;
        }

        @Required
        public selected setAll(Slot<Boolean> slot) {
            this.all = slot;
            return this;
        }

        @Required
        public selected setIndex(Slot<Integer> slot) {
            this.index = slot;
            return this;
        }

        @Required
        public selected setStatus(Slot<AlarmStatus> slot) {
            this.status = slot;
            return this;
        }
    }

    public AlarmItems() {
    }

    public static AlarmItems read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AlarmItems alarmItems = new AlarmItems(IntentUtils.readEntityType(zsdVar, AIApiConstants.AlarmItems.NAME, optional));
        alarmItems.setValue(IntentUtils.readSlot(zsdVar.w("value"), zsd.class));
        return alarmItems;
    }

    public static zsd write(AlarmItems alarmItems) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(alarmItems.entity_type);
        c4hVar.f0("value", IntentUtils.writeSlot(alarmItems.value));
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<c4h> getValue() {
        return this.value;
    }

    @Required
    public AlarmItems setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public AlarmItems setValue(Slot<c4h> slot) {
        this.value = slot;
        return this;
    }

    public AlarmItems(T t) {
        this.entity_type = t;
    }

    public AlarmItems(T t, Slot<c4h> slot) {
        this.entity_type = t;
        this.value = slot;
    }
}
