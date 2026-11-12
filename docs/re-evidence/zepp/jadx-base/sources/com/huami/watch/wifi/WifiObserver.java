package com.huami.watch.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.data.NotificationData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002\u0004\u0013B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001b\u0010\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/huami/watch/wifi/WifiObserver;", "Lcom/huami/watch/wifi/IWifiObserver;", "Landroid/content/BroadcastReceiver;", "", "a", "", "timeout", "startObserve", "stopObserve", "persistentObserve", "Landroid/content/Intent;", "intent", "onReceive", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onTimeout", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "b", "Landroid/content/Context;", "app", "", "", "c", "Ljava/util/List;", NotificationData.WearableExtrasData.KEY_ACTIONS, "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "action", "(Landroid/content/Context;Ljava/lang/String;)V", "f", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public class WifiObserver extends BroadcastReceiver implements IWifiObserver {
    private static final int d = 0;
    private static final String e = "WifiObserver";

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context app;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> actions;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/watch/wifi/WifiObserver$a", "", "", "MSG_TRIGGER_TIMEOUT", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/huami/watch/wifi/WifiObserver$b", "Landroid/os/Handler$Callback;", "Landroid/os/Message;", "msg", "", "handleMessage", "<init>", "(Lcom/huami/watch/wifi/WifiObserver;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NotNull Message msg) {
            if (msg.what != 0) {
                return true;
            }
            WifiObserver.this.onTimeout();
            return true;
        }
    }

    public WifiObserver(@NotNull Context context, @NotNull List<String> list) {
        this.app = context;
        this.actions = list;
        this.handler = new Handler(Looper.getMainLooper(), new b());
    }

    private final void a() {
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it2 = this.actions.iterator();
        while (it2.hasNext()) {
            intentFilter.addAction((String) it2.next());
        }
        this.app.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (CollectionsKt___CollectionsKt.contains(this.actions, intent != null ? intent.getAction() : null)) {
            if (this.handler.hasMessages(0)) {
                stopObserve();
            }
            onReceive(intent);
        }
    }

    public void onReceive(@Nullable Intent intent) {
    }

    public void onTimeout() {
        stopObserve();
    }

    @Override // com.huami.watch.wifi.IWifiObserver
    public void persistentObserve() {
        stopObserve();
        a();
    }

    @Override // com.huami.watch.wifi.IWifiObserver
    public void startObserve(long timeout) {
        stopObserve();
        a();
        this.handler.sendEmptyMessageDelayed(0, timeout);
    }

    @Override // com.huami.watch.wifi.IWifiObserver
    public void stopObserve() {
        this.handler.removeMessages(0);
        try {
            this.app.unregisterReceiver(this);
        } catch (Exception e2) {
            LogUtils.INSTANCE.log(e, e2.getMessage());
        }
    }

    public WifiObserver(@NotNull Context context, @NotNull String str) {
        this(context, (List<String>) e.listOf(str));
    }
}
