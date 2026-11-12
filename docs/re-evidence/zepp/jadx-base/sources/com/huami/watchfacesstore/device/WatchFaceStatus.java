package com.huami.watchfacesstore.device;

import androidx.annotation.StringRes;
import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watchfacesstore.R;
import com.xiaomi.hm.health.bt.profile.running.RunningProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WAITE_DOWNLOAD' uses external variables
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
/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/huami/watchfacesstore/device/WatchFaceStatus;", "", "", "msgId", LogUtil.I, "getMsgId", "()I", "", "msg", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "WAITE_PAY", "WAITE_DOWNLOAD", "WAITE_UPDATE", "WAITE_SYNC", "START", c.p, "SYNCING", "USING", "FAIL", "SPORT_ONGOING", "TIME_ONGOING", "MUSIC_ONGOING", "STORAGE_FULL", "FW_LOW", "BATTERY_LOW", "BLUETOOTH_NOT_OPEN", "CONNECTING", RunningProfile.TYPE_SYNC_DATA, "AGPS_UPDATE", "FW_UPDATE", "DELETE_SUCCESS", "DELETE_FAIL", "REPLACE_SUCCESS", "REPLACE_FAIL", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceStatus {
    private static final /* synthetic */ WatchFaceStatus[] $VALUES;
    public static final WatchFaceStatus AGPS_UPDATE;
    public static final WatchFaceStatus BATTERY_LOW;
    public static final WatchFaceStatus BLUETOOTH_NOT_OPEN;
    public static final WatchFaceStatus CONNECTING;
    public static final WatchFaceStatus DELETE_FAIL;
    public static final WatchFaceStatus DELETE_SUCCESS;
    public static final WatchFaceStatus FAIL;
    public static final WatchFaceStatus FW_LOW;
    public static final WatchFaceStatus FW_UPDATE;
    public static final WatchFaceStatus MUSIC_ONGOING;
    public static final WatchFaceStatus REPLACE_FAIL;
    public static final WatchFaceStatus REPLACE_SUCCESS;
    public static final WatchFaceStatus SPORT_ONGOING;
    public static final WatchFaceStatus START;
    public static final WatchFaceStatus STORAGE_FULL;
    public static final WatchFaceStatus SUCCESS;
    public static final WatchFaceStatus SYNCING;
    public static final WatchFaceStatus SYNC_DATA;
    public static final WatchFaceStatus TIME_ONGOING;
    public static final WatchFaceStatus USING;
    public static final WatchFaceStatus WAITE_DOWNLOAD;
    public static final WatchFaceStatus WAITE_PAY = new WatchFaceStatus("WAITE_PAY", 0, 0, null, 3, null);
    public static final WatchFaceStatus WAITE_SYNC;
    public static final WatchFaceStatus WAITE_UPDATE;

    @Nullable
    private String msg;
    private final int msgId;

    static {
        int i = R.string.wf_sync_watch_face;
        String str = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        WAITE_DOWNLOAD = new WatchFaceStatus("WAITE_DOWNLOAD", 1, i, str, 2, defaultConstructorMarker);
        String str2 = null;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        WAITE_UPDATE = new WatchFaceStatus("WAITE_UPDATE", 2, R.string.wf_update_watch_now, str2, i2, defaultConstructorMarker2);
        String str3 = null;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        WAITE_SYNC = new WatchFaceStatus("WAITE_SYNC", 3, i, str3, 2, defaultConstructorMarker3);
        int i3 = 0;
        int i4 = 3;
        START = new WatchFaceStatus("START", 4, i3, str, i4, defaultConstructorMarker);
        int i5 = 0;
        int i6 = 3;
        SUCCESS = new WatchFaceStatus(c.p, 5, i5, str3, i6, defaultConstructorMarker3);
        SYNCING = new WatchFaceStatus("SYNCING", 6, i3, str, i4, defaultConstructorMarker);
        USING = new WatchFaceStatus("USING", 7, i5, str3, i6, defaultConstructorMarker3);
        int i7 = R.string.wf_sync_watch_face_fail;
        FAIL = new WatchFaceStatus("FAIL", 8, i7, str, 2, defaultConstructorMarker);
        SPORT_ONGOING = new WatchFaceStatus("SPORT_ONGOING", 9, R.string.wf_sync_sport_ongoing, str2, i2, defaultConstructorMarker2);
        String str4 = null;
        int i8 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        TIME_ONGOING = new WatchFaceStatus("TIME_ONGOING", 10, R.string.wf_sync_time_ongoing, str4, i8, defaultConstructorMarker4);
        String str5 = null;
        int i9 = 2;
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        MUSIC_ONGOING = new WatchFaceStatus("MUSIC_ONGOING", 11, R.string.wf_sync_music_ongoing, str5, i9, defaultConstructorMarker5);
        STORAGE_FULL = new WatchFaceStatus("STORAGE_FULL", 12, R.string.wf_sync_storage_full, str4, i8, defaultConstructorMarker4);
        FW_LOW = new WatchFaceStatus("FW_LOW", 13, R.string.wf_sync_low_version, str5, i9, defaultConstructorMarker5);
        BATTERY_LOW = new WatchFaceStatus("BATTERY_LOW", 14, R.string.wf_sync_low_battery, str4, i8, defaultConstructorMarker4);
        BLUETOOTH_NOT_OPEN = new WatchFaceStatus("BLUETOOTH_NOT_OPEN", 15, R.string.wf_sync_ble_un_connected, str5, i9, defaultConstructorMarker5);
        CONNECTING = new WatchFaceStatus("CONNECTING", 16, R.string.wf_sync_watch_un_connected, str4, i8, defaultConstructorMarker4);
        SYNC_DATA = new WatchFaceStatus(RunningProfile.TYPE_SYNC_DATA, 17, R.string.wf_sync_other_data, str5, i9, defaultConstructorMarker5);
        AGPS_UPDATE = new WatchFaceStatus("AGPS_UPDATE", 18, R.string.wf_sync_agps_update, str4, i8, defaultConstructorMarker4);
        FW_UPDATE = new WatchFaceStatus("FW_UPDATE", 19, R.string.wf_sync_watch_updating, str5, i9, defaultConstructorMarker5);
        int i10 = 0;
        int i11 = 3;
        DELETE_SUCCESS = new WatchFaceStatus("DELETE_SUCCESS", 20, i10, str4, i11, defaultConstructorMarker4);
        DELETE_FAIL = new WatchFaceStatus("DELETE_FAIL", 21, R.string.wf_delete_fail, str5, i9, defaultConstructorMarker5);
        REPLACE_SUCCESS = new WatchFaceStatus("REPLACE_SUCCESS", 22, i10, str4, i11, defaultConstructorMarker4);
        REPLACE_FAIL = new WatchFaceStatus("REPLACE_FAIL", 23, i7, null, 2, null);
        $VALUES = a();
    }

    private WatchFaceStatus(@StringRes String str, int i, int i2, String str2) {
        super(str, i);
        this.msgId = i2;
        this.msg = str2;
    }

    private static final /* synthetic */ WatchFaceStatus[] a() {
        return new WatchFaceStatus[]{WAITE_PAY, WAITE_DOWNLOAD, WAITE_UPDATE, WAITE_SYNC, START, SUCCESS, SYNCING, USING, FAIL, SPORT_ONGOING, TIME_ONGOING, MUSIC_ONGOING, STORAGE_FULL, FW_LOW, BATTERY_LOW, BLUETOOTH_NOT_OPEN, CONNECTING, SYNC_DATA, AGPS_UPDATE, FW_UPDATE, DELETE_SUCCESS, DELETE_FAIL, REPLACE_SUCCESS, REPLACE_FAIL};
    }

    public static WatchFaceStatus valueOf(String str) {
        return (WatchFaceStatus) Enum.valueOf(WatchFaceStatus.class, str);
    }

    public static WatchFaceStatus[] values() {
        return (WatchFaceStatus[]) $VALUES.clone();
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final int getMsgId() {
        return this.msgId;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public /* synthetic */ WatchFaceStatus(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? "" : str2);
    }
}
