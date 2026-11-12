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
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class FindPhone<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> resource_id = Optional.a();
    private Optional<Slot<String>> phone_brief = Optional.a();
    private Optional<Slot<DeviceType>> device_type = Optional.a();

    public enum DeviceType {
        Phone(1, AIApiConstants.Phone.NAME),
        Pad(2, "Pad");

        private int id;
        private String name;

        DeviceType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DeviceType find(String str) {
            for (DeviceType deviceType : values()) {
                if (deviceType.name.equals(str)) {
                    return deviceType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DeviceType read(String str) {
            return find(str);
        }

        public static String write(DeviceType deviceType) {
            return deviceType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class setting implements EntityType {
        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new setting();
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public FindPhone() {
    }

    public static FindPhone read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        FindPhone findPhone = new FindPhone(IntentUtils.readEntityType(zsdVar, com.xiaomi.ai.api.intent.AIApiConstants.FindPhone.NAME, optional));
        findPhone.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("resource_id")) {
            findPhone.setResourceId(IntentUtils.readSlot(zsdVar.w("resource_id"), String.class));
        }
        if (zsdVar.z("phone_brief")) {
            findPhone.setPhoneBrief(IntentUtils.readSlot(zsdVar.w("phone_brief"), String.class));
        }
        if (zsdVar.z(DeviceContractKt.COLUMN_DEVICE_TYPE)) {
            findPhone.setDeviceType(IntentUtils.readSlot(zsdVar.w(DeviceContractKt.COLUMN_DEVICE_TYPE), DeviceType.class));
        }
        return findPhone;
    }

    public static zsd write(FindPhone findPhone) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(findPhone.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(findPhone.name));
        if (findPhone.resource_id.c()) {
            c4hVar.f0("resource_id", IntentUtils.writeSlot(findPhone.resource_id.b()));
        }
        if (findPhone.phone_brief.c()) {
            c4hVar.f0("phone_brief", IntentUtils.writeSlot(findPhone.phone_brief.b()));
        }
        if (findPhone.device_type.c()) {
            c4hVar.f0(DeviceContractKt.COLUMN_DEVICE_TYPE, IntentUtils.writeSlot(findPhone.device_type.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<DeviceType>> getDeviceType() {
        return this.device_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getPhoneBrief() {
        return this.phone_brief;
    }

    public Optional<Slot<String>> getResourceId() {
        return this.resource_id;
    }

    public FindPhone setDeviceType(Slot<DeviceType> slot) {
        this.device_type = Optional.e(slot);
        return this;
    }

    @Required
    public FindPhone setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public FindPhone setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public FindPhone setPhoneBrief(Slot<String> slot) {
        this.phone_brief = Optional.e(slot);
        return this;
    }

    public FindPhone setResourceId(Slot<String> slot) {
        this.resource_id = Optional.e(slot);
        return this;
    }

    public FindPhone(T t) {
        this.entity_type = t;
    }

    public FindPhone(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
