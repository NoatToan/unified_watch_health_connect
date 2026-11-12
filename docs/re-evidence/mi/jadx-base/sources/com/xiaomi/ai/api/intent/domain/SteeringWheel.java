package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.sport_manager.utils.SportUtilsKt;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class SteeringWheel<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum SteerMode {
        Sport(1, SportUtilsKt.TAG),
        Comfortable(2, "Comfortable");

        private int id;
        private String name;

        SteerMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SteerMode find(String str) {
            for (SteerMode steerMode : values()) {
                if (steerMode.name.equals(str)) {
                    return steerMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SteerMode read(String str) {
            return find(str);
        }

        public static String write(SteerMode steerMode) {
            return steerMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class heating implements EntityType {
        public static heating read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new heating();
        }

        public static c4h write(heating heatingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {

        @Required
        private Slot<SteerMode> name;

        public mode() {
        }

        public mode(Slot<SteerMode> slot) {
            this.name = slot;
        }

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), SteerMode.class));
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<SteerMode> getName() {
            return this.name;
        }

        @Required
        public mode setName(Slot<SteerMode> slot) {
            this.name = slot;
            return this;
        }
    }

    public SteeringWheel() {
    }

    public static SteeringWheel read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new SteeringWheel(IntentUtils.readEntityType(zsdVar, AIApiConstants.SteeringWheel.NAME, optional));
    }

    public static zsd write(SteeringWheel steeringWheel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(steeringWheel.entity_type);
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
    public SteeringWheel setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public SteeringWheel(T t) {
        this.entity_type = t;
    }
}
