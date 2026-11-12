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
import com.xiaomi.onetrack.OneTrack;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Device<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<DeviceType> device_type;

    @Required
    private T entity_type;
    private Optional<Slot<String>> device_name = Optional.a();
    private Optional<Slot<String>> device_id = Optional.a();

    public enum DeviceInfo {
        Imei(1, OneTrack.Param.IMEI_MD5),
        Model(2, "model"),
        Cpu(3, "cpu");

        private int id;
        private String name;

        DeviceInfo(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DeviceInfo find(String str) {
            for (DeviceInfo deviceInfo : values()) {
                if (deviceInfo.name.equals(str)) {
                    return deviceInfo;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DeviceInfo read(String str) {
            return find(str);
        }

        public static String write(DeviceInfo deviceInfo) {
            return deviceInfo.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DeviceType {
        Default(0, "Default"),
        Phone(1, AIApiConstants.Phone.NAME),
        SoundBox(2, "SoundBox"),
        HeadPhone(3, "HeadPhone"),
        TV(4, "TV"),
        Alarm(5, com.xiaomi.ai.api.intent.AIApiConstants.Alarm.NAME),
        Watch(6, "Watch"),
        Bluetooth(7, "Bluetooth"),
        PersonalComputer(8, "PersonalComputer"),
        Pad(9, "Pad");

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

    public static class bluetooth implements EntityType {
        public static bluetooth read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new bluetooth();
        }

        public static c4h write(bluetooth bluetoothVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class flashlight implements EntityType {
        public static flashlight read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new flashlight();
        }

        public static c4h write(flashlight flashlightVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mic implements EntityType {
        public static mic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mic();
        }

        public static c4h write(mic micVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class ringtone implements EntityType {
        public static ringtone read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ringtone();
        }

        public static c4h write(ringtone ringtoneVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class screen implements EntityType {
        public static screen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new screen();
        }

        public static c4h write(screen screenVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
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

    public static class status implements EntityType {
        private Optional<Slot<DeviceInfo>> info = Optional.a();

        public static status read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            status statusVar = new status();
            if (zsdVar.z("info")) {
                statusVar.setInfo(IntentUtils.readSlot(zsdVar.w("info"), DeviceInfo.class));
            }
            return statusVar;
        }

        public static c4h write(status statusVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (statusVar.info.c()) {
                c4hVarCreateObjectNode.f0("info", IntentUtils.writeSlot(statusVar.info.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<DeviceInfo>> getInfo() {
            return this.info;
        }

        public status setInfo(Slot<DeviceInfo> slot) {
            this.info = Optional.e(slot);
            return this;
        }
    }

    public static class storage implements EntityType {
        public static storage read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new storage();
        }

        public static c4h write(storage storageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class systemVersion implements EntityType {
        public static systemVersion read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new systemVersion();
        }

        public static c4h write(systemVersion systemversion) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Device() {
    }

    public static Device read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Device device = new Device(IntentUtils.readEntityType(zsdVar, com.xiaomi.ai.api.intent.AIApiConstants.Device.NAME, optional));
        device.setDeviceType(IntentUtils.readSlot(zsdVar.w(DeviceContractKt.COLUMN_DEVICE_TYPE), DeviceType.class));
        if (zsdVar.z("device_name")) {
            device.setDeviceName(IntentUtils.readSlot(zsdVar.w("device_name"), String.class));
        }
        if (zsdVar.z("device_id")) {
            device.setDeviceId(IntentUtils.readSlot(zsdVar.w("device_id"), String.class));
        }
        return device;
    }

    public static zsd write(Device device) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(device.entity_type);
        c4hVar.f0(DeviceContractKt.COLUMN_DEVICE_TYPE, IntentUtils.writeSlot(device.device_type));
        if (device.device_name.c()) {
            c4hVar.f0("device_name", IntentUtils.writeSlot(device.device_name.b()));
        }
        if (device.device_id.c()) {
            c4hVar.f0("device_id", IntentUtils.writeSlot(device.device_id.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDeviceId() {
        return this.device_id;
    }

    public Optional<Slot<String>> getDeviceName() {
        return this.device_name;
    }

    @Required
    public Slot<DeviceType> getDeviceType() {
        return this.device_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Device setDeviceId(Slot<String> slot) {
        this.device_id = Optional.e(slot);
        return this;
    }

    public Device setDeviceName(Slot<String> slot) {
        this.device_name = Optional.e(slot);
        return this;
    }

    @Required
    public Device setDeviceType(Slot<DeviceType> slot) {
        this.device_type = slot;
        return this;
    }

    @Required
    public Device setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Device(T t) {
        this.entity_type = t;
    }

    public Device(T t, Slot<DeviceType> slot) {
        this.entity_type = t;
        this.device_type = slot;
    }
}
