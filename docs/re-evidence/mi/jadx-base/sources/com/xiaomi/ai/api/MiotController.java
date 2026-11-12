package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MiotController {

    public static class CameraParam {

        @Required
        private List<String> ids;

        public CameraParam() {
        }

        public CameraParam(List<String> list) {
            this.ids = list;
        }

        @Required
        public List<String> getIds() {
            return this.ids;
        }

        @Required
        public CameraParam setIds(List<String> list) {
            this.ids = list;
            return this;
        }
    }

    public enum DeviceType {
        UNKNOWN(-1),
        CAMERA(0),
        SOUNDBOX_LAMP_EFFECT(1);

        private int id;

        DeviceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "OfflineExecute", namespace = AIApiConstants.MiotController.NAME)
    public static class OfflineExecute implements InstructionPayload {
        private Optional<OfflineExecuteTTSInfo> tts_info = Optional.a();
        private Optional<c4h> timing_param = Optional.a();
        private Optional<c4h> action_param = Optional.a();
        private Optional<c4h> property_param = Optional.a();

        public Optional<c4h> getActionParam() {
            return this.action_param;
        }

        public Optional<c4h> getPropertyParam() {
            return this.property_param;
        }

        public Optional<c4h> getTimingParam() {
            return this.timing_param;
        }

        public Optional<OfflineExecuteTTSInfo> getTtsInfo() {
            return this.tts_info;
        }

        public OfflineExecute setActionParam(c4h c4hVar) {
            this.action_param = Optional.e(c4hVar);
            return this;
        }

        public OfflineExecute setPropertyParam(c4h c4hVar) {
            this.property_param = Optional.e(c4hVar);
            return this;
        }

        public OfflineExecute setTimingParam(c4h c4hVar) {
            this.timing_param = Optional.e(c4hVar);
            return this;
        }

        public OfflineExecute setTtsInfo(OfflineExecuteTTSInfo offlineExecuteTTSInfo) {
            this.tts_info = Optional.e(offlineExecuteTTSInfo);
            return this;
        }
    }

    public enum OfflineExecuteActionType {
        UNKNOWN(-1),
        QUERY(0),
        OPERATE(1);

        private int id;

        OfflineExecuteActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class OfflineExecuteDeviceSlot {
        private Optional<String> name = Optional.a();
        private Optional<OfflineExecuteDeviceSlotValue> value = Optional.a();

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<OfflineExecuteDeviceSlotValue> getValue() {
            return this.value;
        }

        public OfflineExecuteDeviceSlot setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public OfflineExecuteDeviceSlot setValue(OfflineExecuteDeviceSlotValue offlineExecuteDeviceSlotValue) {
            this.value = Optional.e(offlineExecuteDeviceSlotValue);
            return this;
        }
    }

    public static class OfflineExecuteDeviceSlotValue {
        private Optional<Integer> int_value = Optional.a();
        private Optional<String> string_value = Optional.a();
        private Optional<Boolean> bool_value = Optional.a();

        public Optional<Integer> getIntValue() {
            return this.int_value;
        }

        public Optional<String> getStringValue() {
            return this.string_value;
        }

        public Optional<Boolean> isBoolValue() {
            return this.bool_value;
        }

        public OfflineExecuteDeviceSlotValue setBoolValue(boolean z) {
            this.bool_value = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public OfflineExecuteDeviceSlotValue setIntValue(int i) {
            this.int_value = Optional.e(Integer.valueOf(i));
            return this;
        }

        public OfflineExecuteDeviceSlotValue setStringValue(String str) {
            this.string_value = Optional.e(str);
            return this;
        }
    }

    public static class OfflineExecuteRoomInfo {

        @Required
        private String id;

        @Required
        private String name;

        public OfflineExecuteRoomInfo() {
        }

        public OfflineExecuteRoomInfo(String str, String str2) {
            this.name = str;
            this.id = str2;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public OfflineExecuteRoomInfo setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public OfflineExecuteRoomInfo setName(String str) {
            this.name = str;
            return this;
        }
    }

    public static class OfflineExecuteTTSInfo {
        private Optional<OfflineExecuteActionType> action = Optional.a();
        private Optional<List<OfflineExecuteDeviceInfo>> device_infos = Optional.a();
        private Optional<String> entity = Optional.a();
        private Optional<List<OfflineExecuteRoomInfo>> rooms = Optional.a();
        private Optional<String> device_extra_info = Optional.a();
        private Optional<String> sub_device = Optional.a();
        private Optional<Boolean> is_device_extended = Optional.a();
        private Optional<Integer> offline_number = Optional.a();
        private Optional<Long> timing_value = Optional.a();

        public Optional<OfflineExecuteActionType> getAction() {
            return this.action;
        }

        public Optional<String> getDeviceExtraInfo() {
            return this.device_extra_info;
        }

        public Optional<List<OfflineExecuteDeviceInfo>> getDeviceInfos() {
            return this.device_infos;
        }

        public Optional<String> getEntity() {
            return this.entity;
        }

        public Optional<Integer> getOfflineNumber() {
            return this.offline_number;
        }

        public Optional<List<OfflineExecuteRoomInfo>> getRooms() {
            return this.rooms;
        }

        public Optional<String> getSubDevice() {
            return this.sub_device;
        }

        public Optional<Long> getTimingValue() {
            return this.timing_value;
        }

        public Optional<Boolean> isDeviceExtended() {
            return this.is_device_extended;
        }

        public OfflineExecuteTTSInfo setAction(OfflineExecuteActionType offlineExecuteActionType) {
            this.action = Optional.e(offlineExecuteActionType);
            return this;
        }

        public OfflineExecuteTTSInfo setDeviceExtraInfo(String str) {
            this.device_extra_info = Optional.e(str);
            return this;
        }

        public OfflineExecuteTTSInfo setDeviceInfos(List<OfflineExecuteDeviceInfo> list) {
            this.device_infos = Optional.e(list);
            return this;
        }

        public OfflineExecuteTTSInfo setEntity(String str) {
            this.entity = Optional.e(str);
            return this;
        }

        public OfflineExecuteTTSInfo setIsDeviceExtended(boolean z) {
            this.is_device_extended = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public OfflineExecuteTTSInfo setOfflineNumber(int i) {
            this.offline_number = Optional.e(Integer.valueOf(i));
            return this;
        }

        public OfflineExecuteTTSInfo setRooms(List<OfflineExecuteRoomInfo> list) {
            this.rooms = Optional.e(list);
            return this;
        }

        public OfflineExecuteTTSInfo setSubDevice(String str) {
            this.sub_device = Optional.e(str);
            return this;
        }

        public OfflineExecuteTTSInfo setTimingValue(long j) {
            this.timing_value = Optional.e(Long.valueOf(j));
            return this;
        }
    }

    public enum OpType {
        UNKNOWN(-1),
        OPEN(0),
        CLOSE(1),
        ZOOM_IN(2),
        ZOOM_OUT(3);

        private int id;

        OpType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Operate", namespace = AIApiConstants.MiotController.NAME)
    public static class Operate implements InstructionPayload {

        @Required
        private DeviceType device;

        @Required
        private OpType op;

        @Required
        private c4h params;

        public Operate() {
        }

        public Operate(DeviceType deviceType, OpType opType, c4h c4hVar) {
            this.device = deviceType;
            this.op = opType;
            this.params = c4hVar;
        }

        @Required
        public DeviceType getDevice() {
            return this.device;
        }

        @Required
        public OpType getOp() {
            return this.op;
        }

        @Required
        public c4h getParams() {
            return this.params;
        }

        @Required
        public Operate setDevice(DeviceType deviceType) {
            this.device = deviceType;
            return this;
        }

        @Required
        public Operate setOp(OpType opType) {
            this.op = opType;
            return this;
        }

        @Required
        public Operate setParams(c4h c4hVar) {
            this.params = c4hVar;
            return this;
        }
    }

    @NamespaceName(name = "WaitForOperation", namespace = AIApiConstants.MiotController.NAME)
    public static class WaitForOperation implements InstructionPayload {

        @Required
        private Template.Image icon;

        @Required
        private String text;

        public WaitForOperation() {
        }

        public WaitForOperation(Template.Image image, String str) {
            this.icon = image;
            this.text = str;
        }

        @Required
        public Template.Image getIcon() {
            return this.icon;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public WaitForOperation setIcon(Template.Image image) {
            this.icon = image;
            return this;
        }

        @Required
        public WaitForOperation setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class OfflineExecuteDeviceInfo {

        @Required
        private String name;
        private Optional<String> type = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<String> did = Optional.a();
        private Optional<String> rid = Optional.a();
        private Optional<List<OfflineExecuteDeviceSlot>> slots = Optional.a();

        public OfflineExecuteDeviceInfo() {
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<String> getDid() {
            return this.did;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getRid() {
            return this.rid;
        }

        public Optional<List<OfflineExecuteDeviceSlot>> getSlots() {
            return this.slots;
        }

        public Optional<String> getType() {
            return this.type;
        }

        public OfflineExecuteDeviceInfo setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public OfflineExecuteDeviceInfo setDid(String str) {
            this.did = Optional.e(str);
            return this;
        }

        @Required
        public OfflineExecuteDeviceInfo setName(String str) {
            this.name = str;
            return this;
        }

        public OfflineExecuteDeviceInfo setRid(String str) {
            this.rid = Optional.e(str);
            return this;
        }

        public OfflineExecuteDeviceInfo setSlots(List<OfflineExecuteDeviceSlot> list) {
            this.slots = Optional.e(list);
            return this;
        }

        public OfflineExecuteDeviceInfo setType(String str) {
            this.type = Optional.e(str);
            return this;
        }

        public OfflineExecuteDeviceInfo(String str) {
            this.name = str;
        }
    }
}
