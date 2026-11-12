package com.mi.fitness.checkupdate.util;

import android.os.Handler;
import android.os.RemoteException;
import com.mi.fitness.checkupdate.util.DeviceSender$startOta$otaListener$1;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.qch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/mi/fitness/checkupdate/util/DeviceSender$startOta$otaListener$1", "Lqch;", "", LifecycleConstantKt.ON_START, "()V", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onProgress", "(I)V", "onComplete", "code", "", "msg", "onError", "(ILjava/lang/String;)V", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceSender$startOta$otaListener$1 implements qch {
    final /* synthetic */ qch $listener;

    public DeviceSender$startOta$otaListener$1(qch qchVar) {
        this.$listener = qchVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$2(qch listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$3(qch listener, int i, String msg) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(msg, "$msg");
        listener.onError(i, msg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onProgress$lambda$1(qch listener, int i) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onProgress(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$0(qch listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onStart();
    }

    @Override // defpackage.qch
    public void onComplete() {
        try {
            Handler mMainHandler = DeviceSender.INSTANCE.getMMainHandler();
            final qch qchVar = this.$listener;
            mMainHandler.post(new Runnable() { // from class: cc6
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceSender$startOta$otaListener$1.onComplete$lambda$2(qchVar);
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.qch
    public void onError(final int code, final String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        try {
            Handler mMainHandler = DeviceSender.INSTANCE.getMMainHandler();
            final qch qchVar = this.$listener;
            mMainHandler.post(new Runnable() { // from class: bc6
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceSender$startOta$otaListener$1.onError$lambda$3(qchVar, code, msg);
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.qch
    public void onProgress(final int progress) {
        try {
            Handler mMainHandler = DeviceSender.INSTANCE.getMMainHandler();
            final qch qchVar = this.$listener;
            mMainHandler.post(new Runnable() { // from class: zb6
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceSender$startOta$otaListener$1.onProgress$lambda$1(qchVar, progress);
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.qch
    public void onStart() {
        try {
            Handler mMainHandler = DeviceSender.INSTANCE.getMMainHandler();
            final qch qchVar = this.$listener;
            mMainHandler.post(new Runnable() { // from class: ac6
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceSender$startOta$otaListener$1.onStart$lambda$0(qchVar);
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
