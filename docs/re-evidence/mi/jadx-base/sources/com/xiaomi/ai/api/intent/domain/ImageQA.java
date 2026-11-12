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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class ImageQA<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum Direction {
        Front(0, "Front"),
        Left(1, "Left"),
        LeftFront(2, "LeftFront"),
        LeftBehind(3, "LeftBehind"),
        Right(4, "Right"),
        RightFront(5, "RightFront"),
        RightBehind(6, "RightBehind"),
        Behind(7, "Behind"),
        Side(8, "Side");

        private int id;
        private String name;

        Direction(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Direction find(String str) {
            for (Direction direction : values()) {
                if (direction.name.equals(str)) {
                    return direction;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Direction read(String str) {
            return find(str);
        }

        public static String write(Direction direction) {
            return direction.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class VehicleRecognize implements EntityType {
        private Optional<Slot<Direction>> direction = Optional.a();
        private Optional<Slot<String>> color = Optional.a();
        private Optional<Slot<String>> vehicleModel = Optional.a();

        public static VehicleRecognize read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            VehicleRecognize vehicleRecognize = new VehicleRecognize();
            if (zsdVar.z("direction")) {
                vehicleRecognize.setDirection(IntentUtils.readSlot(zsdVar.w("direction"), Direction.class));
            }
            if (zsdVar.z("color")) {
                vehicleRecognize.setColor(IntentUtils.readSlot(zsdVar.w("color"), String.class));
            }
            if (zsdVar.z("vehicleModel")) {
                vehicleRecognize.setVehicleModel(IntentUtils.readSlot(zsdVar.w("vehicleModel"), String.class));
            }
            return vehicleRecognize;
        }

        public static c4h write(VehicleRecognize vehicleRecognize) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (vehicleRecognize.direction.c()) {
                c4hVarCreateObjectNode.f0("direction", IntentUtils.writeSlot(vehicleRecognize.direction.b()));
            }
            if (vehicleRecognize.color.c()) {
                c4hVarCreateObjectNode.f0("color", IntentUtils.writeSlot(vehicleRecognize.color.b()));
            }
            if (vehicleRecognize.vehicleModel.c()) {
                c4hVarCreateObjectNode.f0("vehicleModel", IntentUtils.writeSlot(vehicleRecognize.vehicleModel.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getColor() {
            return this.color;
        }

        public Optional<Slot<Direction>> getDirection() {
            return this.direction;
        }

        public Optional<Slot<String>> getVehicleModel() {
            return this.vehicleModel;
        }

        public VehicleRecognize setColor(Slot<String> slot) {
            this.color = Optional.e(slot);
            return this;
        }

        public VehicleRecognize setDirection(Slot<Direction> slot) {
            this.direction = Optional.e(slot);
            return this;
        }

        public VehicleRecognize setVehicleModel(Slot<String> slot) {
            this.vehicleModel = Optional.e(slot);
            return this;
        }
    }

    public ImageQA() {
    }

    public static ImageQA read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new ImageQA(IntentUtils.readEntityType(zsdVar, AIApiConstants.ImageQA.NAME, optional));
    }

    public static zsd write(ImageQA imageQA) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(imageQA.entity_type);
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
    public ImageQA setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ImageQA(T t) {
        this.entity_type = t;
    }
}
