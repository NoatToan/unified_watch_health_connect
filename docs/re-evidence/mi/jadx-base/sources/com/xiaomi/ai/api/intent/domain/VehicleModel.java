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
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class VehicleModel<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<VehicleModelPosition>> vehicle_model_position = Optional.a();
    private Optional<Slot<String>> style = Optional.a();

    public enum VehicleModelPosition {
        CarPainting(0, "CarPainting"),
        FrontTrunk(1, "FrontTrunk"),
        RearTrunk(2, "RearTrunk"),
        LeftRow1Door(3, "LeftRow1Door"),
        RightRow1Door(4, "RightRow1Door"),
        LeftRow2Door(5, "LeftRow2Door"),
        RightRow2Door(6, "RightRow2Door"),
        LeftRow3Door(7, "LeftRow3Door"),
        RightRow3Door(8, "RightRow3Door");

        private int id;
        private String name;

        VehicleModelPosition(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static VehicleModelPosition find(String str) {
            for (VehicleModelPosition vehicleModelPosition : values()) {
                if (vehicleModelPosition.name.equals(str)) {
                    return vehicleModelPosition;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static VehicleModelPosition read(String str) {
            return find(str);
        }

        public static String write(VehicleModelPosition vehicleModelPosition) {
            return vehicleModelPosition.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class original implements EntityType {
        public static original read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new original();
        }

        public static c4h write(original originalVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sticker implements EntityType {
        private Optional<Slot<String>> content = Optional.a();

        public static sticker read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sticker stickerVar = new sticker();
            if (zsdVar.z(MiuiCursorConstants.CONTENT)) {
                stickerVar.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
            }
            return stickerVar;
        }

        public static c4h write(sticker stickerVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (stickerVar.content.c()) {
                c4hVarCreateObjectNode.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(stickerVar.content.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getContent() {
            return this.content;
        }

        public sticker setContent(Slot<String> slot) {
            this.content = Optional.e(slot);
            return this;
        }
    }

    public static class style implements EntityType {
        public static style read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new style();
        }

        public static c4h write(style styleVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public VehicleModel() {
    }

    public static VehicleModel read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleModel vehicleModel = new VehicleModel(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleModel.NAME, optional));
        if (zsdVar.z("vehicle_model_position")) {
            vehicleModel.setVehicleModelPosition(IntentUtils.readSlot(zsdVar.w("vehicle_model_position"), VehicleModelPosition.class));
        }
        if (zsdVar.z("style")) {
            vehicleModel.setStyle(IntentUtils.readSlot(zsdVar.w("style"), String.class));
        }
        return vehicleModel;
    }

    public static zsd write(VehicleModel vehicleModel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vehicleModel.entity_type);
        if (vehicleModel.vehicle_model_position.c()) {
            c4hVar.f0("vehicle_model_position", IntentUtils.writeSlot(vehicleModel.vehicle_model_position.b()));
        }
        if (vehicleModel.style.c()) {
            c4hVar.f0("style", IntentUtils.writeSlot(vehicleModel.style.b()));
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

    public Optional<Slot<String>> getStyle() {
        return this.style;
    }

    public Optional<Slot<VehicleModelPosition>> getVehicleModelPosition() {
        return this.vehicle_model_position;
    }

    @Required
    public VehicleModel setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VehicleModel setStyle(Slot<String> slot) {
        this.style = Optional.e(slot);
        return this;
    }

    public VehicleModel setVehicleModelPosition(Slot<VehicleModelPosition> slot) {
        this.vehicle_model_position = Optional.e(slot);
        return this;
    }

    public VehicleModel(T t) {
        this.entity_type = t;
    }
}
