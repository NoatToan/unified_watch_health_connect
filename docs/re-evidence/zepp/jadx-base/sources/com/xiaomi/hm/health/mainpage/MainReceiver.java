package com.xiaomi.hm.health.mainpage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.manager.HMDownloadManager;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/MainReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "registerReceiver", "unRegisterReceiver", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MainReceiver extends BroadcastReceiver {

    @NotNull
    public static final String TAG = "MainTabActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "MainReceiver---> action: " + this.a;
        }
    }

    public MainReceiver(@NotNull Activity activity) {
        this.activity = activity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        String action = intent.getAction();
        HMLog.info("MainTabActivity", new a(action));
        if (Intrinsics.areEqual("android.intent.action.DOWNLOAD_COMPLETE", action)) {
            HMDownloadManager.getInstance().queryDownloadStatus(context);
            return;
        }
        if (Intrinsics.areEqual("android.bluetooth.adapter.action.STATE_CHANGED", action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10) {
                EventBus.getDefault().post(new EventBluetooth(false));
            } else {
                if (intExtra != 12) {
                    return;
                }
                EventBus.getDefault().post(new EventBluetooth(true));
            }
        }
    }

    public final void registerReceiver() {
        Activity activity = this.activity;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        Unit unit = Unit.INSTANCE;
        activity.registerReceiver(this, intentFilter);
    }

    public final void unRegisterReceiver() {
        this.activity.unregisterReceiver(this);
    }
}
