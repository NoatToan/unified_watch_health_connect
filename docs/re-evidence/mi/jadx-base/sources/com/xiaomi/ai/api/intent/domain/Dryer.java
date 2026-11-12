package com.xiaomi.ai.api.intent.domain;

import com.facebook.react.modules.core.Timing;
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
public class Dryer<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum DryerMode {
        DailyDry(1, "DailyDry"),
        QuickDry(2, "QuickDry"),
        HeavyDry(3, "HeavyDry"),
        DownCoat(4, "DownCoat"),
        UserDefine(5, "UserDefine"),
        Cotton(6, "Cotton"),
        Synthetic(7, "Synthetic"),
        Shirt(8, "Shirt"),
        Wool(9, "Wool"),
        BabyCare(10, "BabyCare"),
        Silk(11, "Silk"),
        Jacket(12, "Jacket"),
        Underwear(13, "Underwear"),
        Degerming(14, "Degerming"),
        ColdAir(15, "ColdAir"),
        Timing(16, Timing.NAME),
        Towel(17, "Towel"),
        Jeans(18, "Jeans"),
        Bedding(19, "Bedding"),
        SmallClothes(20, "SmallClothes"),
        Heat(21, "Heat");

        private int id;
        private String name;

        DryerMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DryerMode find(String str) {
            for (DryerMode dryerMode : values()) {
                if (dryerMode.name.equals(str)) {
                    return dryerMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DryerMode read(String str) {
            return find(str);
        }

        public static String write(DryerMode dryerMode) {
            return dryerMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class __switch implements EntityType {
        public static __switch read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new __switch();
        }

        public static c4h write(__switch __switchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class childLock implements EntityType {
        public static childLock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new childLock();
        }

        public static c4h write(childLock childlock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class leftTime implements EntityType {
        public static leftTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leftTime();
        }

        public static c4h write(leftTime lefttime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<DryerMode>> value = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("value")) {
                modeVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), DryerMode.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(modeVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<DryerMode>> getValue() {
            return this.value;
        }

        public mode setValue(Slot<DryerMode> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public Dryer() {
    }

    public static Dryer read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Dryer dryer = new Dryer(IntentUtils.readEntityType(zsdVar, AIApiConstants.Dryer.NAME, optional));
        if (zsdVar.z("device")) {
            dryer.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            dryer.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            dryer.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            dryer.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            dryer.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            dryer.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            dryer.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return dryer;
    }

    public static zsd write(Dryer dryer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(dryer.entity_type);
        if (dryer.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(dryer.device.b()));
        }
        if (dryer.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(dryer.room.b()));
        }
        if (dryer.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(dryer.is_all_to_operate.b()));
        }
        if (dryer.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(dryer.sub_category.b()));
        }
        if (dryer.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(dryer.service_entity.b()));
        }
        if (dryer.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(dryer.description.b()));
        }
        if (dryer.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(dryer.timing.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDescription() {
        return this.description;
    }

    public Optional<Slot<String>> getDevice() {
        return this.device;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getIsAllToOperate() {
        return this.is_all_to_operate;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<String>> getServiceEntity() {
        return this.service_entity;
    }

    public Optional<Slot<String>> getSubCategory() {
        return this.sub_category;
    }

    public Optional<Slot<Miai.Datetime>> getTiming() {
        return this.timing;
    }

    public Dryer setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Dryer setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Dryer setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Dryer setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Dryer setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Dryer setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Dryer setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Dryer setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Dryer(T t) {
        this.entity_type = t;
    }
}
