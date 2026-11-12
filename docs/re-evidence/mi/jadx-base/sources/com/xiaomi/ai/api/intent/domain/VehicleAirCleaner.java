package com.xiaomi.ai.api.intent.domain;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
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
public class VehicleAirCleaner<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum AirCleanerMode {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        AUTO(0, "AUTO"),
        OPERATION(1, "OPERATION"),
        MUTE(2, "MUTE");

        private int id;
        private String name;

        AirCleanerMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AirCleanerMode find(String str) {
            for (AirCleanerMode airCleanerMode : values()) {
                if (airCleanerMode.name.equals(str)) {
                    return airCleanerMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AirCleanerMode read(String str) {
            return find(str);
        }

        public static String write(AirCleanerMode airCleanerMode) {
            return airCleanerMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class mode implements EntityType {

        @Required
        private Slot<AirCleanerMode> name;

        @Required
        private Slot<VehiclePosition> position;

        public mode() {
        }

        public mode(Slot<AirCleanerMode> slot, Slot<VehiclePosition> slot2) {
            this.name = slot;
            this.position = slot2;
        }

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), AirCleanerMode.class));
            modeVar.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name));
            c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(modeVar.position));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<AirCleanerMode> getName() {
            return this.name;
        }

        @Required
        public Slot<VehiclePosition> getPosition() {
            return this.position;
        }

        @Required
        public mode setName(Slot<AirCleanerMode> slot) {
            this.name = slot;
            return this;
        }

        @Required
        public mode setPosition(Slot<VehiclePosition> slot) {
            this.position = slot;
            return this;
        }
    }

    public VehicleAirCleaner() {
    }

    public static VehicleAirCleaner read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new VehicleAirCleaner(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleAirCleaner.NAME, optional));
    }

    public static zsd write(VehicleAirCleaner vehicleAirCleaner) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(vehicleAirCleaner.entity_type);
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
    public VehicleAirCleaner setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VehicleAirCleaner(T t) {
        this.entity_type = t;
    }
}
