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
public class VehicleWiper<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<VehiclePosition>> position = Optional.a();

    public enum WiperMode {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        FAST(0, "FAST"),
        SLOW(1, "SLOW"),
        CLEAN(2, "CLEAN");

        private int id;
        private String name;

        WiperMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WiperMode find(String str) {
            for (WiperMode wiperMode : values()) {
                if (wiperMode.name.equals(str)) {
                    return wiperMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WiperMode read(String str) {
            return find(str);
        }

        public static String write(WiperMode wiperMode) {
            return wiperMode.getName();
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
        private Slot<WiperMode> name;

        public mode() {
        }

        public mode(Slot<WiperMode> slot) {
            this.name = slot;
        }

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), WiperMode.class));
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<WiperMode> getName() {
            return this.name;
        }

        @Required
        public mode setName(Slot<WiperMode> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class speed implements EntityType {
        private Optional<Slot<Integer>> value = Optional.a();

        public static speed read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            speed speedVar = new speed();
            if (zsdVar.z("value")) {
                speedVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Integer.class));
            }
            return speedVar;
        }

        public static c4h write(speed speedVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (speedVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(speedVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getValue() {
            return this.value;
        }

        public speed setValue(Slot<Integer> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public VehicleWiper() {
    }

    public static VehicleWiper read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleWiper vehicleWiper = new VehicleWiper(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleWiper.NAME, optional));
        if (zsdVar.z("position")) {
            vehicleWiper.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
        }
        return vehicleWiper;
    }

    public static zsd write(VehicleWiper vehicleWiper) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vehicleWiper.entity_type);
        if (vehicleWiper.position.c()) {
            c4hVar.f0("position", IntentUtils.writeSlot(vehicleWiper.position.b()));
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

    public Optional<Slot<VehiclePosition>> getPosition() {
        return this.position;
    }

    @Required
    public VehicleWiper setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VehicleWiper setPosition(Slot<VehiclePosition> slot) {
        this.position = Optional.e(slot);
        return this;
    }

    public VehicleWiper(T t) {
        this.entity_type = t;
    }
}
