package com.xiaomi.fitness.sport_capture.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.hed;
import defpackage.ied;
import defpackage.s7r;
import defpackage.udd;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007J\b\u0010\u0012\u001a\u00020\u000eH\u0007J\b\u0010\u0013\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/DevicePreviewNotifyUtils;", "", "<init>", "()V", "TAG", "", "STATUS_SUCCESS", "", "STATUS_FAIL", "STATUS_BACKGROUND", "STATUS_WAIT_PERMISSION", "ACTION_START", "ACTION_STOP", "notifySuccess", "", "notifyFail", "respAppBackground", "notifyWaitPermission", "respFinished", "reqFinished", "notifyPreviewStatus", "status", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DevicePreviewNotifyUtils {
    public static final int ACTION_START = 2;
    public static final int ACTION_STOP = 3;

    @NotNull
    public static final DevicePreviewNotifyUtils INSTANCE = new DevicePreviewNotifyUtils();
    private static final int STATUS_BACKGROUND = 2;
    private static final int STATUS_FAIL = 1;
    private static final int STATUS_SUCCESS = 0;
    private static final int STATUS_WAIT_PERMISSION = 3;

    @NotNull
    private static final String TAG = "DeviceNotifyUtils";

    private DevicePreviewNotifyUtils() {
    }

    @JvmStatic
    public static final void notifyFail() {
        Logger.i(TAG, "notifyFail");
        INSTANCE.notifyPreviewStatus(1);
    }

    private final void notifyPreviewStatus(final int status) {
        s7r s7rVar = new s7r();
        s7rVar.e = 23;
        s7rVar.f = 12;
        udd uddVar = new udd();
        ied iedVar = new ied();
        iedVar.c = "app";
        iedVar.d = status;
        uddVar.B(iedVar);
        s7rVar.U(uddVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_capture.utils.DevicePreviewNotifyUtils.notifyPreviewStatus.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(DevicePreviewNotifyUtils.TAG, "notifyPreviewStatus(" + status + ") fail!! did:" + did + " type:" + type + " code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(DevicePreviewNotifyUtils.TAG, "notifyPreviewStatus(" + status + ") success");
            }
        }, 0, 8, null);
    }

    @JvmStatic
    public static final void notifySuccess() {
        Logger.i(TAG, "notifySuccess");
        INSTANCE.notifyPreviewStatus(0);
    }

    @JvmStatic
    public static final void notifyWaitPermission() {
        Logger.i(TAG, "notifyWaitPermission");
        INSTANCE.notifyPreviewStatus(3);
    }

    @JvmStatic
    public static final void reqFinished() {
        s7r s7rVar = new s7r();
        s7rVar.e = 23;
        s7rVar.f = 11;
        udd uddVar = new udd();
        hed hedVar = new hed();
        hedVar.c = "app";
        hedVar.d = 3;
        uddVar.A(hedVar);
        s7rVar.U(uddVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_capture.utils.DevicePreviewNotifyUtils.reqFinished.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(DevicePreviewNotifyUtils.TAG, "reqFinished fail!! did:" + did + " type:" + type + " code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(DevicePreviewNotifyUtils.TAG, "reqFinished success");
            }
        }, 0, 8, null);
    }

    @JvmStatic
    public static final void respAppBackground() {
        Logger.i(TAG, "respAppBackground");
        INSTANCE.notifyPreviewStatus(2);
    }

    @JvmStatic
    public static final void respFinished() {
        Logger.i(TAG, "respFinished");
        INSTANCE.notifyPreviewStatus(0);
    }
}
