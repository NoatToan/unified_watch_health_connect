package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class RingTone<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<RingType>> target = Optional.a();

    public enum RingType {
        Phone(1, AIApiConstants.Phone.NAME),
        Alarm(2, com.xiaomi.ai.api.intent.AIApiConstants.Alarm.NAME),
        Schedule(3, "Schedule"),
        Notice(4, "Notice");

        private int id;
        private String name;

        RingType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static RingType find(String str) {
            for (RingType ringType : values()) {
                if (ringType.name.equals(str)) {
                    return ringType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static RingType read(String str) {
            return find(str);
        }

        public static String write(RingType ringType) {
            return ringType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public RingTone() {
    }

    public static RingTone read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        RingTone ringTone = new RingTone(IntentUtils.readEntityType(zsdVar, com.xiaomi.ai.api.intent.AIApiConstants.RingTone.NAME, optional));
        if (zsdVar.z("target")) {
            ringTone.setTarget(IntentUtils.readSlot(zsdVar.w("target"), RingType.class));
        }
        return ringTone;
    }

    public static zsd write(RingTone ringTone) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(ringTone.entity_type);
        if (ringTone.target.c()) {
            c4hVar.f0("target", IntentUtils.writeSlot(ringTone.target.b()));
        }
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

    public Optional<Slot<RingType>> getTarget() {
        return this.target;
    }

    @Required
    public RingTone setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public RingTone setTarget(Slot<RingType> slot) {
        this.target = Optional.e(slot);
        return this;
    }

    public RingTone(T t) {
        this.entity_type = t;
    }
}
