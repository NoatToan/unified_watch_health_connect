package com.huami.sync;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bT\u0010UJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%RC\u00104\u001a#\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103RR\u0010?\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u001106¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(7\u0012\u0004\u0012\u000208058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010C\u001a\b\u0012\u0004\u0012\u0002080\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010!\u001a\u0004\bA\u0010#\"\u0004\bB\u0010%R(\u0010G\u001a\b\u0012\u0004\u0012\u0002080\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010!\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%R=\u0010L\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002080'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101\"\u0004\bK\u00103RT\u0010S\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110N¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(O\u0012\u0004\u0012\u000208\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010<\"\u0004\bR\u0010>¨\u0006V"}, d2 = {"Lcom/huami/sync/Config;", "", "", "getThreadNum", "", "a", "J", "getPollPeriod", "()J", "setPollPeriod", "(J)V", "pollPeriod", "b", "getUploadTimeout", "setUploadTimeout", "uploadTimeout", "c", LogUtil.I, "getNotificationPeriod", "()I", "setNotificationPeriod", "(I)V", "notificationPeriod", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "host", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getNotificationIcon", "()Lkotlin/jvm/functions/Function0;", "setNotificationIcon", "(Lkotlin/jvm/functions/Function0;)V", "notificationIcon", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "Landroid/content/Intent;", "f", "Lkotlin/jvm/functions/Function1;", "getNotificationIntents", "()Lkotlin/jvm/functions/Function1;", "setNotificationIntents", "(Lkotlin/jvm/functions/Function1;)V", "notificationIntents", "Lkotlin/Function2;", "", "isOpen", "", "g", "Lkotlin/jvm/functions/Function2;", "getOnToggle", "()Lkotlin/jvm/functions/Function2;", "setOnToggle", "(Lkotlin/jvm/functions/Function2;)V", "onToggle", "h", "getOnAutoOpen", "setOnAutoOpen", "onAutoOpen", "i", "getOnHmOpenClick", "setOnHmOpenClick", "onHmOpenClick", "enable", z.j, "getOnBLEStateChange", "setOnBLEStateChange", "onBLEStateChange", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", hl.k, "getDeviceStateFragment", "setDeviceStateFragment", "deviceStateFragment", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class Config {

    @NotNull
    public static final Config INSTANCE = new Config();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static long pollPeriod = 5000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static long uploadTimeout = 30000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static int notificationPeriod = 14400000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static String host = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static Function0<Integer> notificationIcon = a.a;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static Function1<? super Context, ? extends List<Intent>> notificationIntents = b.a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static Function2<? super Context, ? super Boolean, Unit> onToggle = f.a;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static Function0<Unit> onAutoOpen = c.a;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static Function0<Unit> onHmOpenClick = e.a;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static Function1<? super Boolean, Unit> onBLEStateChange = d.a;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private static Function2<? super Integer, ? super FragmentManager, Unit> deviceStateFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "Ljava/util/ArrayList;", "Landroid/content/Intent;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Context, ArrayList<Intent>> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<Intent> invoke(@NotNull Context context) {
            return new ArrayList<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Context, Boolean, Unit> {
        public static final f a = new f();

        public f() {
            super(2);
        }

        public final void a(@NotNull Context context, boolean z) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Context context, Boolean bool) {
            a(context, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    private Config() {
    }

    @Nullable
    public final Function2<Integer, FragmentManager, Unit> getDeviceStateFragment() {
        return deviceStateFragment;
    }

    @NotNull
    public final String getHost() {
        return host;
    }

    @NotNull
    public final Function0<Integer> getNotificationIcon() {
        return notificationIcon;
    }

    @NotNull
    public final Function1<Context, List<Intent>> getNotificationIntents() {
        return notificationIntents;
    }

    public final int getNotificationPeriod() {
        return notificationPeriod;
    }

    @NotNull
    public final Function0<Unit> getOnAutoOpen() {
        return onAutoOpen;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnBLEStateChange() {
        return onBLEStateChange;
    }

    @NotNull
    public final Function0<Unit> getOnHmOpenClick() {
        return onHmOpenClick;
    }

    @NotNull
    public final Function2<Context, Boolean, Unit> getOnToggle() {
        return onToggle;
    }

    public final long getPollPeriod() {
        return pollPeriod;
    }

    public final int getThreadNum() {
        return (int) (uploadTimeout / pollPeriod);
    }

    public final long getUploadTimeout() {
        return uploadTimeout;
    }

    public final void setDeviceStateFragment(@Nullable Function2<? super Integer, ? super FragmentManager, Unit> function2) {
        deviceStateFragment = function2;
    }

    public final void setHost(@NotNull String str) {
        host = str;
    }

    public final void setNotificationIcon(@NotNull Function0<Integer> function0) {
        notificationIcon = function0;
    }

    public final void setNotificationIntents(@NotNull Function1<? super Context, ? extends List<Intent>> function1) {
        notificationIntents = function1;
    }

    public final void setNotificationPeriod(int i) {
        notificationPeriod = i;
    }

    public final void setOnAutoOpen(@NotNull Function0<Unit> function0) {
        onAutoOpen = function0;
    }

    public final void setOnBLEStateChange(@NotNull Function1<? super Boolean, Unit> function1) {
        onBLEStateChange = function1;
    }

    public final void setOnHmOpenClick(@NotNull Function0<Unit> function0) {
        onHmOpenClick = function0;
    }

    public final void setOnToggle(@NotNull Function2<? super Context, ? super Boolean, Unit> function2) {
        onToggle = function2;
    }

    public final void setPollPeriod(long j) {
        pollPeriod = j;
    }

    public final void setUploadTimeout(long j) {
        uploadTimeout = j;
    }
}
