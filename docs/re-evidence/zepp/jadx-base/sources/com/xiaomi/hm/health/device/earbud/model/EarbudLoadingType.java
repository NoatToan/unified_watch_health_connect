package com.xiaomi.hm.health.device.earbud.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOAD_SLEEP_NOT_DISTURB' uses external variables
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
/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016B+\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "", "", "loadingRes", LogUtil.I, "getLoadingRes", "()I", "setLoadingRes", "(I)V", "successRes", "getSuccessRes", "setSuccessRes", "failRes", "getFailRes", "setFailRes", "", "isDialogTrans", "Z", "()Z", "setDialogTrans", "(Z)V", "<init>", "(Ljava/lang/String;IIZ)V", "(Ljava/lang/String;IIIIZ)V", "LOAD_SLEEP_NOT_DISTURB", "SET_SLEEP_NOT_DISTURB", "LOAD_OPER_SETTING", "SET_OPER_SETTING", "LOAD_PLAY_TIME", "SET_PLAY_TIME", "SET_SMART_PLAY", "LOAD_CURRENT_MUSIC", "SET_MUSIC", "SET_VOLUME", "RESET_DEVICE", "LOAD_ALARM", "DELETE_ALARM", "TURN_ON_ALARM", "TURN_OFF_ALARM", "SAVE_ALARM", "LOAD_DEVICE_REBOOT_TIME", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudLoadingType {
    private static final /* synthetic */ EarbudLoadingType[] $VALUES;
    public static final EarbudLoadingType DELETE_ALARM;
    public static final EarbudLoadingType LOAD_ALARM;
    public static final EarbudLoadingType LOAD_CURRENT_MUSIC;
    public static final EarbudLoadingType LOAD_DEVICE_REBOOT_TIME;
    public static final EarbudLoadingType LOAD_OPER_SETTING;
    public static final EarbudLoadingType LOAD_PLAY_TIME;
    public static final EarbudLoadingType LOAD_SLEEP_NOT_DISTURB;
    public static final EarbudLoadingType RESET_DEVICE;
    public static final EarbudLoadingType SAVE_ALARM;
    public static final EarbudLoadingType SET_MUSIC;
    public static final EarbudLoadingType SET_OPER_SETTING;
    public static final EarbudLoadingType SET_PLAY_TIME;
    public static final EarbudLoadingType SET_SLEEP_NOT_DISTURB;
    public static final EarbudLoadingType SET_SMART_PLAY;
    public static final EarbudLoadingType SET_VOLUME;
    public static final EarbudLoadingType TURN_OFF_ALARM;
    public static final EarbudLoadingType TURN_ON_ALARM;
    private int failRes;
    private boolean isDialogTrans;
    private int loadingRes;
    private int successRes;

    static {
        int i = R.string.loading;
        int i2 = R.string.load_fail;
        int i3 = 0;
        boolean z = false;
        int i4 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        LOAD_SLEEP_NOT_DISTURB = new EarbudLoadingType("LOAD_SLEEP_NOT_DISTURB", 0, i, i3, i2, z, i4, defaultConstructorMarker);
        SET_SLEEP_NOT_DISTURB = new EarbudLoadingType("SET_SLEEP_NOT_DISTURB", 1, i, true);
        LOAD_OPER_SETTING = new EarbudLoadingType("LOAD_OPER_SETTING", 2, i, i3, i2, z, i4, defaultConstructorMarker);
        SET_OPER_SETTING = new EarbudLoadingType("SET_OPER_SETTING", 3, i, true);
        LOAD_PLAY_TIME = new EarbudLoadingType("LOAD_PLAY_TIME", 4, i, true);
        SET_PLAY_TIME = new EarbudLoadingType("SET_PLAY_TIME", 5, i, true);
        SET_SMART_PLAY = new EarbudLoadingType("SET_SMART_PLAY", 6, i, true);
        LOAD_CURRENT_MUSIC = new EarbudLoadingType("LOAD_CURRENT_MUSIC", 7, i, i3, i2, z, i4, defaultConstructorMarker);
        SET_MUSIC = new EarbudLoadingType("SET_MUSIC", 8, i, true);
        SET_VOLUME = new EarbudLoadingType("SET_VOLUME", 9, i, true);
        RESET_DEVICE = new EarbudLoadingType("RESET_DEVICE", 10, i, R.string.earbud_reset_success, R.string.earbud_reset_fail, z, i4, defaultConstructorMarker);
        LOAD_ALARM = new EarbudLoadingType("LOAD_ALARM", 11, i, 0, i2, z, i4, defaultConstructorMarker);
        DELETE_ALARM = new EarbudLoadingType("DELETE_ALARM", 12, R.string.delete_alarm, R.string.delete_alarm_success, R.string.alarm_delete_failed, false, 8, null);
        int i5 = R.string.alarm_save;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 8;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        TURN_ON_ALARM = new EarbudLoadingType("TURN_ON_ALARM", 13, i5, i6, R.string.alarm_open_failed, z2, i7, defaultConstructorMarker2);
        TURN_OFF_ALARM = new EarbudLoadingType("TURN_OFF_ALARM", 14, i5, i6, R.string.alarm_close_failed, z2, i7, defaultConstructorMarker2);
        SAVE_ALARM = new EarbudLoadingType("SAVE_ALARM", 15, i5, R.string.alarm_save_success, R.string.alarm_save_failed, z2, i7, defaultConstructorMarker2);
        LOAD_DEVICE_REBOOT_TIME = new EarbudLoadingType("LOAD_DEVICE_REBOOT_TIME", 16, 0, false, 3, (DefaultConstructorMarker) null);
        $VALUES = a();
    }

    private EarbudLoadingType(String str, int i, int i2, boolean z) {
        super(str, i);
        this.loadingRes = i2;
        this.isDialogTrans = z;
    }

    private static final /* synthetic */ EarbudLoadingType[] a() {
        return new EarbudLoadingType[]{LOAD_SLEEP_NOT_DISTURB, SET_SLEEP_NOT_DISTURB, LOAD_OPER_SETTING, SET_OPER_SETTING, LOAD_PLAY_TIME, SET_PLAY_TIME, SET_SMART_PLAY, LOAD_CURRENT_MUSIC, SET_MUSIC, SET_VOLUME, RESET_DEVICE, LOAD_ALARM, DELETE_ALARM, TURN_ON_ALARM, TURN_OFF_ALARM, SAVE_ALARM, LOAD_DEVICE_REBOOT_TIME};
    }

    public static EarbudLoadingType valueOf(String str) {
        return (EarbudLoadingType) Enum.valueOf(EarbudLoadingType.class, str);
    }

    public static EarbudLoadingType[] values() {
        return (EarbudLoadingType[]) $VALUES.clone();
    }

    public final int getFailRes() {
        return this.failRes;
    }

    public final int getLoadingRes() {
        return this.loadingRes;
    }

    public final int getSuccessRes() {
        return this.successRes;
    }

    /* JADX INFO: renamed from: isDialogTrans, reason: from getter */
    public final boolean getIsDialogTrans() {
        return this.isDialogTrans;
    }

    public final void setDialogTrans(boolean z) {
        this.isDialogTrans = z;
    }

    public final void setFailRes(int i) {
        this.failRes = i;
    }

    public final void setLoadingRes(int i) {
        this.loadingRes = i;
    }

    public final void setSuccessRes(int i) {
        this.successRes = i;
    }

    public /* synthetic */ EarbudLoadingType(String str, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? R.string.loading : i2, (i3 & 2) != 0 ? false : z);
    }

    private EarbudLoadingType(String str, int i, int i2, int i3, int i4, boolean z) {
        super(str, i);
        this.loadingRes = i2;
        this.successRes = i3;
        this.failRes = i4;
        this.isDialogTrans = z;
    }

    public /* synthetic */ EarbudLoadingType(String str, int i, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, i4, (i5 & 8) != 0 ? false : z);
    }
}
