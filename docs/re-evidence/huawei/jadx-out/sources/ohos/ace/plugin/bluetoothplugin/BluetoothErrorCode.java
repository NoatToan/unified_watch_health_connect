package ohos.ace.plugin.bluetoothplugin;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BT_ERR_SERVICE_DISCONNECTED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes46.dex */
public final class BluetoothErrorCode {
    private static final /* synthetic */ BluetoothErrorCode[] $VALUES;
    public static final BluetoothErrorCode BT_ERR_AUDIO_NOT_IDLE;
    public static final BluetoothErrorCode BT_ERR_BASE_SYSCAP;
    public static final BluetoothErrorCode BT_ERR_CAPABILITY_NOT_SUPPORT;
    public static final BluetoothErrorCode BT_ERR_DEVICE_DISCONNECTED;
    public static final BluetoothErrorCode BT_ERR_DISCONNECT_SCO_FAILED;
    public static final BluetoothErrorCode BT_ERR_GATT_MAX_SERVER;
    public static final BluetoothErrorCode BT_ERR_GATT_READ_NOT_PERMITTED;
    public static final BluetoothErrorCode BT_ERR_GATT_WRITE_NOT_PERMITTED;
    public static final BluetoothErrorCode BT_ERR_HFP_NOT_CONNECT;
    public static final BluetoothErrorCode BT_ERR_INTERNAL_ERROR;
    public static final BluetoothErrorCode BT_ERR_INVALID_PARAM;
    public static final BluetoothErrorCode BT_ERR_INVALID_STATE;
    public static final BluetoothErrorCode BT_ERR_IPC_TRANS_FAILED;
    public static final BluetoothErrorCode BT_ERR_MAX_CONNECTION;
    public static final BluetoothErrorCode BT_ERR_NO_ACTIVE_HFP_DEVICE;
    public static final BluetoothErrorCode BT_ERR_NULL_HFP_STATE_MACHINE;
    public static final BluetoothErrorCode BT_ERR_PERMISSION_FAILED;
    public static final BluetoothErrorCode BT_ERR_PROFILE_DISABLED;
    public static final BluetoothErrorCode BT_ERR_PROHIBITED_BY_EDM;
    public static final BluetoothErrorCode BT_ERR_SCO_HAS_BEEN_CONNECTED;
    public static final BluetoothErrorCode BT_ERR_SERVICE_DISCONNECTED;
    public static final BluetoothErrorCode BT_ERR_SPP_BUSY;
    public static final BluetoothErrorCode BT_ERR_SPP_DEVICE_NOT_FOUND;
    public static final BluetoothErrorCode BT_ERR_SPP_IO;
    public static final BluetoothErrorCode BT_ERR_SPP_SERVER_STATE;
    public static final BluetoothErrorCode BT_ERR_SYSTEM_PERMISSION_FAILED;
    public static final BluetoothErrorCode BT_ERR_TIMEOUT;
    public static final BluetoothErrorCode BT_ERR_UNAVAILABLE_PROXY;
    public static final BluetoothErrorCode BT_ERR_UNBONDED_DEVICE;
    public static final BluetoothErrorCode BT_ERR_VIRTUAL_CALL_NOT_STARTED;
    public static final BluetoothErrorCode BT_ERR_VR_HAS_BEEN_STARTED;
    public static final BluetoothErrorCode BT_NO_ERROR;
    private String errorMessage;
    private int id;

    public static BluetoothErrorCode valueOf(String str) {
        return (BluetoothErrorCode) Enum.valueOf(BluetoothErrorCode.class, str);
    }

    public static BluetoothErrorCode[] values() {
        return (BluetoothErrorCode[]) $VALUES.clone();
    }

    static {
        BluetoothErrorCode bluetoothErrorCode = new BluetoothErrorCode("BT_ERR_PERMISSION_FAILED", 0, 201, "Permission Failed");
        BT_ERR_PERMISSION_FAILED = bluetoothErrorCode;
        BluetoothErrorCode bluetoothErrorCode2 = new BluetoothErrorCode("BT_ERR_SYSTEM_PERMISSION_FAILED", 1, 202, "System Permission Failed");
        BT_ERR_SYSTEM_PERMISSION_FAILED = bluetoothErrorCode2;
        BluetoothErrorCode bluetoothErrorCode3 = new BluetoothErrorCode("BT_ERR_PROHIBITED_BY_EDM", 2, 203, "Prohibited By Edm");
        BT_ERR_PROHIBITED_BY_EDM = bluetoothErrorCode3;
        BluetoothErrorCode bluetoothErrorCode4 = new BluetoothErrorCode("BT_ERR_INVALID_PARAM", 3, 401, "Invalid Param");
        BT_ERR_INVALID_PARAM = bluetoothErrorCode4;
        BluetoothErrorCode bluetoothErrorCode5 = new BluetoothErrorCode("BT_ERR_CAPABILITY_NOT_SUPPORT", 4, 801, "Capability Not Support");
        BT_ERR_CAPABILITY_NOT_SUPPORT = bluetoothErrorCode5;
        BluetoothErrorCode bluetoothErrorCode6 = new BluetoothErrorCode("BT_NO_ERROR", 5, 0, "Correct");
        BT_NO_ERROR = bluetoothErrorCode6;
        BluetoothErrorCode bluetoothErrorCode7 = new BluetoothErrorCode("BT_ERR_BASE_SYSCAP", 6, 2900000, "Base Syscap");
        BT_ERR_BASE_SYSCAP = bluetoothErrorCode7;
        BluetoothErrorCode bluetoothErrorCode8 = new BluetoothErrorCode("BT_ERR_SERVICE_DISCONNECTED", 7, bluetoothErrorCode7.getId() + 1, "Service Disconnected");
        BT_ERR_SERVICE_DISCONNECTED = bluetoothErrorCode8;
        BluetoothErrorCode bluetoothErrorCode9 = new BluetoothErrorCode("BT_ERR_UNBONDED_DEVICE", 8, bluetoothErrorCode7.getId() + 2, "Unbonded Device");
        BT_ERR_UNBONDED_DEVICE = bluetoothErrorCode9;
        BluetoothErrorCode bluetoothErrorCode10 = new BluetoothErrorCode("BT_ERR_INVALID_STATE", 9, bluetoothErrorCode7.getId() + 3, "Invalid State");
        BT_ERR_INVALID_STATE = bluetoothErrorCode10;
        BluetoothErrorCode bluetoothErrorCode11 = new BluetoothErrorCode("BT_ERR_PROFILE_DISABLED", 10, bluetoothErrorCode7.getId() + 4, "Profile Disabled");
        BT_ERR_PROFILE_DISABLED = bluetoothErrorCode11;
        BluetoothErrorCode bluetoothErrorCode12 = new BluetoothErrorCode("BT_ERR_DEVICE_DISCONNECTED", 11, bluetoothErrorCode7.getId() + 5, "Device Disconnected");
        BT_ERR_DEVICE_DISCONNECTED = bluetoothErrorCode12;
        BluetoothErrorCode bluetoothErrorCode13 = new BluetoothErrorCode("BT_ERR_MAX_CONNECTION", 12, bluetoothErrorCode7.getId() + 6, "Max Connection");
        BT_ERR_MAX_CONNECTION = bluetoothErrorCode13;
        BluetoothErrorCode bluetoothErrorCode14 = new BluetoothErrorCode("BT_ERR_TIMEOUT", 13, bluetoothErrorCode7.getId() + 7, "Timeout");
        BT_ERR_TIMEOUT = bluetoothErrorCode14;
        BluetoothErrorCode bluetoothErrorCode15 = new BluetoothErrorCode("BT_ERR_UNAVAILABLE_PROXY", 14, bluetoothErrorCode7.getId() + 8, "Unavailable Proxy");
        BT_ERR_UNAVAILABLE_PROXY = bluetoothErrorCode15;
        BluetoothErrorCode bluetoothErrorCode16 = new BluetoothErrorCode("BT_ERR_INTERNAL_ERROR", 15, bluetoothErrorCode7.getId() + 99, "Internal Error");
        BT_ERR_INTERNAL_ERROR = bluetoothErrorCode16;
        BluetoothErrorCode bluetoothErrorCode17 = new BluetoothErrorCode("BT_ERR_IPC_TRANS_FAILED", 16, bluetoothErrorCode7.getId() + 100, "Ipc Trans Failed");
        BT_ERR_IPC_TRANS_FAILED = bluetoothErrorCode17;
        BluetoothErrorCode bluetoothErrorCode18 = new BluetoothErrorCode("BT_ERR_GATT_READ_NOT_PERMITTED", 17, bluetoothErrorCode7.getId() + 1000, "Gatt Read Not Permitted");
        BT_ERR_GATT_READ_NOT_PERMITTED = bluetoothErrorCode18;
        BluetoothErrorCode bluetoothErrorCode19 = new BluetoothErrorCode("BT_ERR_GATT_WRITE_NOT_PERMITTED", 18, bluetoothErrorCode7.getId() + 1001, "Gatt Write Not Permitted");
        BT_ERR_GATT_WRITE_NOT_PERMITTED = bluetoothErrorCode19;
        BluetoothErrorCode bluetoothErrorCode20 = new BluetoothErrorCode("BT_ERR_GATT_MAX_SERVER", 19, bluetoothErrorCode7.getId() + 1002, "Gatt Max Server");
        BT_ERR_GATT_MAX_SERVER = bluetoothErrorCode20;
        BluetoothErrorCode bluetoothErrorCode21 = new BluetoothErrorCode("BT_ERR_SPP_SERVER_STATE", 20, bluetoothErrorCode7.getId() + 1050, "Spp Server State");
        BT_ERR_SPP_SERVER_STATE = bluetoothErrorCode21;
        BluetoothErrorCode bluetoothErrorCode22 = new BluetoothErrorCode("BT_ERR_SPP_BUSY", 21, bluetoothErrorCode7.getId() + 1051, "Spp Busy");
        BT_ERR_SPP_BUSY = bluetoothErrorCode22;
        BluetoothErrorCode bluetoothErrorCode23 = new BluetoothErrorCode("BT_ERR_SPP_DEVICE_NOT_FOUND", 22, bluetoothErrorCode7.getId() + 1052, " Spp Device Not Found");
        BT_ERR_SPP_DEVICE_NOT_FOUND = bluetoothErrorCode23;
        BluetoothErrorCode bluetoothErrorCode24 = new BluetoothErrorCode("BT_ERR_SPP_IO", 23, bluetoothErrorCode22.getId() + 1054, " Spp Io");
        BT_ERR_SPP_IO = bluetoothErrorCode24;
        BluetoothErrorCode bluetoothErrorCode25 = new BluetoothErrorCode("BT_ERR_NO_ACTIVE_HFP_DEVICE", 24, bluetoothErrorCode22.getId() + 2000, "No Active Hfp Device");
        BT_ERR_NO_ACTIVE_HFP_DEVICE = bluetoothErrorCode25;
        BluetoothErrorCode bluetoothErrorCode26 = new BluetoothErrorCode("BT_ERR_NULL_HFP_STATE_MACHINE", 25, bluetoothErrorCode22.getId() + 2001, "Null Hfp State Machine");
        BT_ERR_NULL_HFP_STATE_MACHINE = bluetoothErrorCode26;
        BluetoothErrorCode bluetoothErrorCode27 = new BluetoothErrorCode("BT_ERR_HFP_NOT_CONNECT", 26, bluetoothErrorCode22.getId() + 2002, "Hfp Not Connect");
        BT_ERR_HFP_NOT_CONNECT = bluetoothErrorCode27;
        BluetoothErrorCode bluetoothErrorCode28 = new BluetoothErrorCode("BT_ERR_SCO_HAS_BEEN_CONNECTED", 27, bluetoothErrorCode22.getId() + 2003, "Sco Has Been Connected");
        BT_ERR_SCO_HAS_BEEN_CONNECTED = bluetoothErrorCode28;
        BluetoothErrorCode bluetoothErrorCode29 = new BluetoothErrorCode("BT_ERR_VR_HAS_BEEN_STARTED", 28, bluetoothErrorCode22.getId() + 2004, "Vr Has Been Started");
        BT_ERR_VR_HAS_BEEN_STARTED = bluetoothErrorCode29;
        BluetoothErrorCode bluetoothErrorCode30 = new BluetoothErrorCode("BT_ERR_AUDIO_NOT_IDLE", 29, bluetoothErrorCode22.getId() + 2005, "Audio Not Idle");
        BT_ERR_AUDIO_NOT_IDLE = bluetoothErrorCode30;
        BluetoothErrorCode bluetoothErrorCode31 = new BluetoothErrorCode("BT_ERR_VIRTUAL_CALL_NOT_STARTED", 30, bluetoothErrorCode22.getId() + 2006, "Virtual Call Not Started");
        BT_ERR_VIRTUAL_CALL_NOT_STARTED = bluetoothErrorCode31;
        BluetoothErrorCode bluetoothErrorCode32 = new BluetoothErrorCode("BT_ERR_DISCONNECT_SCO_FAILED", 31, bluetoothErrorCode22.getId() + 2007, "Disconnect Sco Failed");
        BT_ERR_DISCONNECT_SCO_FAILED = bluetoothErrorCode32;
        $VALUES = new BluetoothErrorCode[]{bluetoothErrorCode, bluetoothErrorCode2, bluetoothErrorCode3, bluetoothErrorCode4, bluetoothErrorCode5, bluetoothErrorCode6, bluetoothErrorCode7, bluetoothErrorCode8, bluetoothErrorCode9, bluetoothErrorCode10, bluetoothErrorCode11, bluetoothErrorCode12, bluetoothErrorCode13, bluetoothErrorCode14, bluetoothErrorCode15, bluetoothErrorCode16, bluetoothErrorCode17, bluetoothErrorCode18, bluetoothErrorCode19, bluetoothErrorCode20, bluetoothErrorCode21, bluetoothErrorCode22, bluetoothErrorCode23, bluetoothErrorCode24, bluetoothErrorCode25, bluetoothErrorCode26, bluetoothErrorCode27, bluetoothErrorCode28, bluetoothErrorCode29, bluetoothErrorCode30, bluetoothErrorCode31, bluetoothErrorCode32};
    }

    private BluetoothErrorCode(String str, int i, int i2, String str2) {
        super(str, i);
        this.id = i2;
        this.errorMessage = str2;
    }

    public int getId() {
        return this.id;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
