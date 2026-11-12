package com.huami.watch.companion.esim;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.perf.util.Constants;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ENUM_ESIM_SUB_DEV_CAPBILITY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/huami/watch/companion/esim/ESimCmdSubTag;", "", "", "getValue", "type", LogUtil.I, "getType", "()I", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Ljava/lang/Class;", "valueType", "Ljava/lang/Class;", "getValueType", "()Ljava/lang/Class;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/Class;)V", "Companion", "ENUM_ESIM_SUB_EID", "ENUM_ESIM_SUB_IMEI", "ENUM_ESIM_SUB_ICCID", "ENUM_ESIM_SUB_URL", "ENUM_ESIM_SUB_BODY", "ENUM_ESIM_SUB_RESP_CODE", "ENUM_ESIM_SUB_CARRIER", "ENUM_ESIM_SUB_RESP_DATA", "ENUM_ESIM_SUB_ENABLE_PROFILE", "ENUM_ESIM_SUB_SYNC_NOTIFY", "ENUM_ESIM_SUB_STATE", "ENUM_ESIM_SUB_SPN", "ENUM_ESIM_SUB_SPRN", "ENUM_ESIM_SUB_NICK_NAME", "ENUM_ESIM_SUB_MAJOR_VERSION", "ENUM_ESIM_SUB_MINOR_VERSION", "ENUM_ESIM_SUB_CONFIRMATION_CODE", "ENUM_ESIM_SUB_PROFILE_DOWN_SUBJECT_CODE", "ENUM_ESIM_SUB_PROFILE_DOWN_REASON_CODE", "ENUM_ESIM_SUB_DEV_CAPBILITY", "ENUM_ESIM_SUB_FIRMWARE_FLAG", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class ESimCmdSubTag {
    private static final /* synthetic */ ESimCmdSubTag[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ESimCmdSubTag ENUM_ESIM_SUB_DEV_CAPBILITY;
    public static final ESimCmdSubTag ENUM_ESIM_SUB_FIRMWARE_FLAG;

    @NotNull
    private final String key;
    private final int type;

    @NotNull
    private final Class<?> valueType;
    public static final ESimCmdSubTag ENUM_ESIM_SUB_EID = new ESimCmdSubTag("ENUM_ESIM_SUB_EID", 0, 1, AbsEsimOperation.KEY_EID, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_IMEI = new ESimCmdSubTag("ENUM_ESIM_SUB_IMEI", 1, 2, "imei", String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_ICCID = new ESimCmdSubTag("ENUM_ESIM_SUB_ICCID", 2, 3, AbsEsimOperation.KEY_ICCID, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_URL = new ESimCmdSubTag("ENUM_ESIM_SUB_URL", 3, 4, AbsEsimOperation.KEY_REQUEST_URL, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_BODY = new ESimCmdSubTag("ENUM_ESIM_SUB_BODY", 4, 5, AbsEsimOperation.KEY_REQUEST_BODY, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_RESP_CODE = new ESimCmdSubTag("ENUM_ESIM_SUB_RESP_CODE", 5, 6, AbsEsimOperation.KEY_RESPONSE_CODE, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_CARRIER = new ESimCmdSubTag("ENUM_ESIM_SUB_CARRIER", 6, 7, AbsEsimOperation.KEY_CARRIER_TYPE, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_RESP_DATA = new ESimCmdSubTag("ENUM_ESIM_SUB_RESP_DATA", 7, 8, AbsEsimOperation.KEY_RESPONSE_DATA, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_ENABLE_PROFILE = new ESimCmdSubTag("ENUM_ESIM_SUB_ENABLE_PROFILE", 8, 9, AbsEsimOperation.KEY_AUTO_ENABLE, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_SYNC_NOTIFY = new ESimCmdSubTag("ENUM_ESIM_SUB_SYNC_NOTIFY", 9, 10, AbsEsimOperation.KEY_SYNC_NOTIFICATION, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_STATE = new ESimCmdSubTag("ENUM_ESIM_SUB_STATE", 10, 11, Constants.ENABLE_DISABLE, Boolean.TYPE);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_SPN = new ESimCmdSubTag("ENUM_ESIM_SUB_SPN", 11, 12, "providerName", String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_SPRN = new ESimCmdSubTag("ENUM_ESIM_SUB_SPRN", 12, 13, HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_NICK_NAME = new ESimCmdSubTag("ENUM_ESIM_SUB_NICK_NAME", 13, 14, "nickName", String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_MAJOR_VERSION = new ESimCmdSubTag("ENUM_ESIM_SUB_MAJOR_VERSION", 14, 15, AbsEsimOperation.KEY_SUB_MAJOR_VERSION, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_MINOR_VERSION = new ESimCmdSubTag("ENUM_ESIM_SUB_MINOR_VERSION", 15, 16, AbsEsimOperation.KEY_SUB_MINOR_VERSION, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_CONFIRMATION_CODE = new ESimCmdSubTag("ENUM_ESIM_SUB_CONFIRMATION_CODE", 16, 17, "", String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_PROFILE_DOWN_SUBJECT_CODE = new ESimCmdSubTag("ENUM_ESIM_SUB_PROFILE_DOWN_SUBJECT_CODE", 17, 18, AbsEsimOperation.KEY_SUBJECT_CODE, String.class);
    public static final ESimCmdSubTag ENUM_ESIM_SUB_PROFILE_DOWN_REASON_CODE = new ESimCmdSubTag("ENUM_ESIM_SUB_PROFILE_DOWN_REASON_CODE", 18, 19, "errorCode", String.class);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/esim/ESimCmdSubTag$Companion;", "", "", "type", "Lcom/huami/watch/companion/esim/ESimCmdSubTag;", "fromValue", "", "key", "fromKey", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ESimCmdSubTag fromKey(@NotNull String key) {
            for (ESimCmdSubTag eSimCmdSubTag : ESimCmdSubTag.values()) {
                if (Intrinsics.areEqual(eSimCmdSubTag.getKey(), key)) {
                    return eSimCmdSubTag;
                }
            }
            return null;
        }

        @Nullable
        public final ESimCmdSubTag fromValue(int type) {
            for (ESimCmdSubTag eSimCmdSubTag : ESimCmdSubTag.values()) {
                if (eSimCmdSubTag.getValue() == type) {
                    return eSimCmdSubTag;
                }
            }
            return null;
        }
    }

    static {
        Class cls = Integer.TYPE;
        ENUM_ESIM_SUB_DEV_CAPBILITY = new ESimCmdSubTag("ENUM_ESIM_SUB_DEV_CAPBILITY", 19, 20, AbsEsimOperation.KEY_CAPBILITY, cls);
        ENUM_ESIM_SUB_FIRMWARE_FLAG = new ESimCmdSubTag("ENUM_ESIM_SUB_FIRMWARE_FLAG", 20, 21, "device_type", cls);
        $VALUES = a();
        INSTANCE = new Companion(null);
    }

    private ESimCmdSubTag(String str, int i, int i2, String str2, Class cls) {
        super(str, i);
        this.type = i2;
        this.key = str2;
        this.valueType = cls;
    }

    private static final /* synthetic */ ESimCmdSubTag[] a() {
        return new ESimCmdSubTag[]{ENUM_ESIM_SUB_EID, ENUM_ESIM_SUB_IMEI, ENUM_ESIM_SUB_ICCID, ENUM_ESIM_SUB_URL, ENUM_ESIM_SUB_BODY, ENUM_ESIM_SUB_RESP_CODE, ENUM_ESIM_SUB_CARRIER, ENUM_ESIM_SUB_RESP_DATA, ENUM_ESIM_SUB_ENABLE_PROFILE, ENUM_ESIM_SUB_SYNC_NOTIFY, ENUM_ESIM_SUB_STATE, ENUM_ESIM_SUB_SPN, ENUM_ESIM_SUB_SPRN, ENUM_ESIM_SUB_NICK_NAME, ENUM_ESIM_SUB_MAJOR_VERSION, ENUM_ESIM_SUB_MINOR_VERSION, ENUM_ESIM_SUB_CONFIRMATION_CODE, ENUM_ESIM_SUB_PROFILE_DOWN_SUBJECT_CODE, ENUM_ESIM_SUB_PROFILE_DOWN_REASON_CODE, ENUM_ESIM_SUB_DEV_CAPBILITY, ENUM_ESIM_SUB_FIRMWARE_FLAG};
    }

    public static ESimCmdSubTag valueOf(String str) {
        return (ESimCmdSubTag) Enum.valueOf(ESimCmdSubTag.class, str);
    }

    public static ESimCmdSubTag[] values() {
        return (ESimCmdSubTag[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValue() {
        return this.type;
    }

    @NotNull
    public final Class<?> getValueType() {
        return this.valueType;
    }
}
