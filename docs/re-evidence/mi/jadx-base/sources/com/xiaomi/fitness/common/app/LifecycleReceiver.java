package com.xiaomi.fitness.common.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J'\u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010\u0016J>\u0010\u0017\u001a\u00020\b26\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u0006J>\u0010\u001b\u001a\u00020\b26\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u0006R&\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/common/app/LifecycleReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mLifecycleListeners", "", "Lkotlin/Function2;", "", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleAction", "action", "data", "dispatchLifecycle", LifecycleConstantKt.TYPE_ACTIVITY, "lifecycle", "collectActivityLifecycleCallbacks", "", "()[Lkotlin/jvm/functions/Function2;", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/ParameterName;", "name", "unregisterListener", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLifecycleReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleReceiver.kt\ncom/xiaomi/fitness/common/app/LifecycleReceiver\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,129:1\n37#2:130\n36#2,3:131\n*S KotlinDebug\n*F\n+ 1 LifecycleReceiver.kt\ncom/xiaomi/fitness/common/app/LifecycleReceiver\n*L\n112#1:130\n112#1:131,3\n*E\n"})
public final class LifecycleReceiver extends BroadcastReceiver {

    @NotNull
    private final List<Function2<String, String, Unit>> mLifecycleListeners = new ArrayList();

    private final Function2<String, String, Unit>[] collectActivityLifecycleCallbacks() {
        Object[] array;
        synchronized (this.mLifecycleListeners) {
            try {
                array = this.mLifecycleListeners.size() > 0 ? this.mLifecycleListeners.toArray(new Function2[0]) : null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (Function2[]) array;
    }

    private final void dispatchLifecycle(String activity, String lifecycle) {
        Function2<String, String, Unit>[] function2ArrCollectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        boolean zIsMainThread = AppUtil.INSTANCE.isMainThread();
        if (function2ArrCollectActivityLifecycleCallbacks != null) {
            int length = function2ArrCollectActivityLifecycleCallbacks.length;
            for (int i = 0; i < length; i++) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                function2ArrCollectActivityLifecycleCallbacks[i].invoke(activity, lifecycle);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                Logger.i("LifecycleReceiver", "dispatchLifecycle: " + function2ArrCollectActivityLifecycleCallbacks[i] + ", isMain=" + zIsMainThread + ", cost=" + jCurrentTimeMillis2);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handleAction(@Nullable String action, @Nullable String data) {
        if (action == null || action.length() == 0 || data == null || data.length() == 0 || action == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1274442605:
                if (action.equals("finish")) {
                    for (Activity activity : ActivityStack.INSTANCE.getActivities()) {
                        if (TextUtils.equals(data, activity.getClass().getName()) || TextUtils.equals(data, ActivityStack.INSTANCE.getUniqueId(activity))) {
                            activity.finish();
                        }
                    }
                    break;
                }
                break;
            case -934610812:
                if (action.equals("remove")) {
                    ActivityCache.INSTANCE.remove(data);
                    dispatchLifecycle(data, LifecycleConstantKt.ON_DESTROY);
                    break;
                }
                break;
            case 111375:
                if (action.equals(LifecycleConstantKt.ACTION_PUT)) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data, new String[]{LifecycleConstantKt.DATA_DELIMITER}, false, 2, 2, (Object) null);
                    ActivityCache.INSTANCE.put((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    dispatchLifecycle((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    AppManager.INSTANCE.getInstance().onLifecycleReceive((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    break;
                }
                break;
            case 3127582:
                if (action.equals(LifecycleConstantKt.ACTION_EXIT)) {
                    if (TextUtils.isEmpty(data) || TextUtils.equals(data, ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication()))) {
                        Iterator<Activity> it = ActivityStack.INSTANCE.getActivities().iterator();
                        while (it.hasNext()) {
                            it.next().finish();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            String stringExtra = intent.getStringExtra("type");
            String stringExtra2 = intent.getStringExtra("action");
            Logger.i(ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication()) + " receive lifecycle event, " + stringExtra2 + ": " + stringExtra, new Object[0]);
            if (TextUtils.equals(stringExtra, LifecycleConstantKt.TYPE_ACTIVITY)) {
                int intExtra = intent.getIntExtra("pid", 0);
                if (!ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication())) {
                    if (intExtra == 0 || intExtra == Process.myPid()) {
                        Logger.i("onReceive: handleAction:" + intExtra + LifecycleConstantKt.DATA_DELIMITER + stringExtra2, new Object[0]);
                        handleAction(stringExtra2, intent.getStringExtra("data"));
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(stringExtra2, "init")) {
                    for (String str : ActivityCache.INSTANCE.getCACHE().keySet()) {
                        Intrinsics.checkNotNullExpressionValue(str, "next(...)");
                        String str2 = str;
                        ActivityStack.INSTANCE.sendBroadcast(intExtra, LifecycleConstantKt.ACTION_PUT, str2 + LifecycleConstantKt.DATA_DELIMITER + ((Object) ActivityCache.INSTANCE.getCACHE().get(str2)));
                    }
                }
            }
        } catch (Exception e) {
            Logger.e("handle lifecycle exception, " + e, new Object[0]);
        }
    }

    public final void registerListener(@NotNull Function2<? super String, ? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.mLifecycleListeners) {
            this.mLifecycleListeners.add(listener);
        }
    }

    public final void unregisterListener(@NotNull Function2<? super String, ? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.mLifecycleListeners) {
            this.mLifecycleListeners.remove(listener);
        }
    }
}
