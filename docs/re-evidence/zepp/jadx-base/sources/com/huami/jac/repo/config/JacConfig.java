package com.huami.jac.repo.config;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010\u0010RX\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019Ri\u0010*\u001aI\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\b0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R(\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R(\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0015\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R(\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0015\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0015\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0015\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019¨\u0006@"}, d2 = {"Lcom/huami/jac/repo/config/JacConfig;", "", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "errorCode", "errorMsg", "", "a", "Lkotlin/jvm/functions/Function2;", "getOnJacHttpError", "()Lkotlin/jvm/functions/Function2;", "setOnJacHttpError", "(Lkotlin/jvm/functions/Function2;)V", "getOnJacHttpError$annotations", "()V", "onJacHttpError", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "getShowErrorDetail", "()Lkotlin/jvm/functions/Function0;", "setShowErrorDetail", "(Lkotlin/jvm/functions/Function0;)V", "showErrorDetail", "Landroid/content/Context;", MimeTypes.BASE_TYPE_APPLICATION, "getApplication", "setApplication", "Lkotlin/Function3;", DbUtils.Const.Table.CONTEXT, "url", "Landroid/os/Bundle;", "extras", "c", "Lkotlin/jvm/functions/Function3;", "getGoToWeb", "()Lkotlin/jvm/functions/Function3;", "setGoToWeb", "(Lkotlin/jvm/functions/Function3;)V", "goToWeb", GoogleApiAvailabilityLight.a, "getHost", "setHost", "host", "e", "getQaUrl", "setQaUrl", "qaUrl", "f", "isLogin", "setLogin", "g", "isBtConnected", "setBtConnected", "h", "isDeviceSupport", "setDeviceSupport", "i", "isHasBondingDevice", "setHasBondingDevice", "<init>", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacConfig {
    public static Function0<? extends Context> application;

    @NotNull
    public static final JacConfig INSTANCE = new JacConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static Function2<? super String, ? super String, Unit> onJacHttpError = g.a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static Function0<Boolean> showErrorDetail = i.a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static Function3<? super Context, ? super String, ? super Bundle, Unit> goToWeb = a.a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static Function0<String> host = b.a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static Function0<String> qaUrl = h.a;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static Function0<Boolean> isLogin = f.a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static Function0<Boolean> isBtConnected = c.a;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static Function0<Boolean> isDeviceSupport = d.a;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static Function0<Boolean> isHasBondingDevice = e.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Landroid/os/Bundle;", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function3<Context, String, Bundle, Unit> {
        public static final a a = new a();

        public a() {
            super(3);
        }

        public final void a(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Context context, String str, Bundle bundle) {
            a(context, str, bundle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Boolean> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Boolean> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Boolean> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<String, String, Unit> {
        public static final g a = new g();

        public g() {
            super(2);
        }

        public final void a(@NotNull String str, @NotNull String str2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            a(str, str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "https://upload-cdn.huami.com/tposts/714275";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Boolean> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return false;
        }
    }

    private JacConfig() {
    }

    @NotNull
    public static final Function2<String, String, Unit> getOnJacHttpError() {
        return onJacHttpError;
    }

    @JvmStatic
    public static /* synthetic */ void getOnJacHttpError$annotations() {
    }

    public static final void setOnJacHttpError(@NotNull Function2<? super String, ? super String, Unit> function2) {
        onJacHttpError = function2;
    }

    @NotNull
    public final Function0<Context> getApplication() {
        Function0 function0 = application;
        Objects.requireNonNull(function0);
        return function0;
    }

    @NotNull
    public final Function3<Context, String, Bundle, Unit> getGoToWeb() {
        return goToWeb;
    }

    @NotNull
    public final Function0<String> getHost() {
        return host;
    }

    @NotNull
    public final Function0<String> getQaUrl() {
        return qaUrl;
    }

    @NotNull
    public final Function0<Boolean> getShowErrorDetail() {
        return showErrorDetail;
    }

    @NotNull
    public final Function0<Boolean> isBtConnected() {
        return isBtConnected;
    }

    @NotNull
    public final Function0<Boolean> isDeviceSupport() {
        return isDeviceSupport;
    }

    @NotNull
    public final Function0<Boolean> isHasBondingDevice() {
        return isHasBondingDevice;
    }

    @NotNull
    public final Function0<Boolean> isLogin() {
        return isLogin;
    }

    public final void setApplication(@NotNull Function0<? extends Context> function0) {
        application = function0;
    }

    public final void setBtConnected(@NotNull Function0<Boolean> function0) {
        isBtConnected = function0;
    }

    public final void setDeviceSupport(@NotNull Function0<Boolean> function0) {
        isDeviceSupport = function0;
    }

    public final void setGoToWeb(@NotNull Function3<? super Context, ? super String, ? super Bundle, Unit> function3) {
        goToWeb = function3;
    }

    public final void setHasBondingDevice(@NotNull Function0<Boolean> function0) {
        isHasBondingDevice = function0;
    }

    public final void setHost(@NotNull Function0<String> function0) {
        host = function0;
    }

    public final void setLogin(@NotNull Function0<Boolean> function0) {
        isLogin = function0;
    }

    public final void setQaUrl(@NotNull Function0<String> function0) {
        qaUrl = function0;
    }

    public final void setShowErrorDetail(@NotNull Function0<Boolean> function0) {
        showErrorDetail = function0;
    }
}
