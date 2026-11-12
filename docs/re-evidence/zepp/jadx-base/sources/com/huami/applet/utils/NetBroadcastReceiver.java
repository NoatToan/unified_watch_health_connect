package com.huami.applet.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huami.applet.extension.ContextExtKt;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/applet/utils/NetBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class NetBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NetBroadcastReceiver a = new NetBroadcastReceiver();

    @Nullable
    private static Function1<? super Boolean, Unit> b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R?\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/applet/utils/NetBroadcastReceiver$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isNetworkConnected", "", "onNetChange", "register", MiPushClient.COMMAND_UNREGISTER, "netChange", "Lkotlin/jvm/functions/Function1;", "getNetChange", "()Lkotlin/jvm/functions/Function1;", "setNetChange", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/huami/applet/utils/NetBroadcastReceiver;", "netBroadcastReceiver", "Lcom/huami/applet/utils/NetBroadcastReceiver;", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Function1<Boolean, Unit> getNetChange() {
            return NetBroadcastReceiver.b;
        }

        public final void register(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> onNetChange) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            context.registerReceiver(NetBroadcastReceiver.a, intentFilter);
            setNetChange(onNetChange);
        }

        public final void setNetChange(@Nullable Function1<? super Boolean, Unit> function1) {
            NetBroadcastReceiver.b = function1;
        }

        public final void unregister(@NotNull Context context) {
            context.unregisterReceiver(NetBroadcastReceiver.a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @NotNull Intent intent) {
        Function1<? super Boolean, Unit> function1;
        if (!Intrinsics.areEqual(intent.getAction(), ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION) || (function1 = b) == null) {
            return;
        }
        function1.invoke(Boolean.valueOf(context == null ? false : ContextExtKt.isNetworkConnected(context)));
    }
}
