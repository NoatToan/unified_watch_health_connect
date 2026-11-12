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
public class ScreenLock<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class alwaysOnDisplay implements EntityType {
        public static alwaysOnDisplay read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new alwaysOnDisplay();
        }

        public static c4h write(alwaysOnDisplay alwaysondisplay) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class auto implements EntityType {

        @Required
        private Slot<Miai.Datetime> datetime;

        public auto() {
        }

        public auto(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
        }

        public static auto read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            auto autoVar = new auto();
            autoVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            return autoVar;
        }

        public static c4h write(auto autoVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(autoVar.datetime));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Datetime> getDatetime() {
            return this.datetime;
        }

        @Required
        public auto setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
            return this;
        }
    }

    public static class pictorial implements EntityType {
        public static pictorial read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new pictorial();
        }

        public static c4h write(pictorial pictorialVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sleep implements EntityType {
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<Boolean>> is_never_lock = Optional.a();

        public static sleep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sleep sleepVar = new sleep();
            if (zsdVar.z("duration")) {
                sleepVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("is_never_lock")) {
                sleepVar.setIsNeverLock(IntentUtils.readSlot(zsdVar.w("is_never_lock"), Boolean.class));
            }
            return sleepVar;
        }

        public static c4h write(sleep sleepVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (sleepVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(sleepVar.duration.b()));
            }
            if (sleepVar.is_never_lock.c()) {
                c4hVarCreateObjectNode.f0("is_never_lock", IntentUtils.writeSlot(sleepVar.is_never_lock.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<Boolean>> getIsNeverLock() {
            return this.is_never_lock;
        }

        public sleep setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public sleep setIsNeverLock(Slot<Boolean> slot) {
            this.is_never_lock = Optional.e(slot);
            return this;
        }
    }

    public static class speedCamera implements EntityType {
        public static speedCamera read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new speedCamera();
        }

        public static c4h write(speedCamera speedcamera) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public ScreenLock() {
    }

    public static ScreenLock read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new ScreenLock(IntentUtils.readEntityType(zsdVar, AIApiConstants.ScreenLock.NAME, optional));
    }

    public static zsd write(ScreenLock screenLock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(screenLock.entity_type);
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
    public ScreenLock setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ScreenLock(T t) {
        this.entity_type = t;
    }
}
