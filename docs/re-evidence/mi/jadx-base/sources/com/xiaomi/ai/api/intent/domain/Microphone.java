package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class Microphone<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class frontPosition implements EntityType {
        public static frontPosition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new frontPosition();
        }

        public static c4h write(frontPosition frontposition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class rearPosition implements EntityType {
        public static rearPosition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new rearPosition();
        }

        public static c4h write(rearPosition rearposition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class timer implements EntityType {

        @Required
        private Slot<Miai.Duration> duration;

        public timer() {
        }

        public timer(Slot<Miai.Duration> slot) {
            this.duration = slot;
        }

        public static timer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            timer timerVar = new timer();
            timerVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            return timerVar;
        }

        public static c4h write(timer timerVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(timerVar.duration));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Duration> getDuration() {
            return this.duration;
        }

        @Required
        public timer setDuration(Slot<Miai.Duration> slot) {
            this.duration = slot;
            return this;
        }
    }

    public Microphone() {
    }

    public static Microphone read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new Microphone(IntentUtils.readEntityType(zsdVar, "Microphone", optional));
    }

    public static zsd write(Microphone microphone) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(microphone.entity_type);
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
    public Microphone setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Microphone(T t) {
        this.entity_type = t;
    }
}
