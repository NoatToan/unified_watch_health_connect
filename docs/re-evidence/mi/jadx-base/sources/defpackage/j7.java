package defpackage;

import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0007\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Lj7;", "", "Lcom/huami/bluetooth/profile/channel/module/WiFiControllerModule;", RnReportConst.ApiReport.PARAM_MODULE, "Lg4s;", "deviceInfo", "", PluginDeviceInfo.FMODEL, "(Lcom/huami/bluetooth/profile/channel/module/WiFiControllerModule;Lg4s;)Z", "", PluginDeviceInfo.FDESC, "(Lg4s;)Ljava/lang/String;", "Ljava/util/Locale;", "(Lg4s;)Ljava/util/Locale;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f22474a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lj7$a;", "", "", "ACCESS_TOKEN", "Ljava/lang/String;", "LOGIN_TOKEN", "PACKAGE_NAME", "", "PLATFORM_ANDROID", "I", "REGION_CHINA", "TAG", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.sdk.DeviceTokenHelper$setToken$1", f = "DeviceTokenHelper.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ WiFiControllerModule u;
        public final /* synthetic */ j7 v;
        public final /* synthetic */ g4s w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WiFiControllerModule wiFiControllerModule, j7 j7Var, g4s g4sVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.u = wiFiControllerModule;
            this.v = j7Var;
            this.w = g4sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.u == null) {
                    return Boxing.boxBoolean(false);
                }
                String strB = this.v.b(this.w);
                t5t.d("DeviceTokenHelper", "versionName: " + HuamiDevice.VERSION_NAME + ", localeStr: " + strB);
                WiFiControllerModule wiFiControllerModule = this.u;
                this.t = 1;
                obj = wiFiControllerModule.sendToken("login_key", "access_key", 1, 0, MiSportImportUtilKt.MI_SPORT_PKG, HuamiDevice.VERSION_NAME, strB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public final String b(g4s deviceInfo) {
        Locale localeA = a(deviceInfo);
        return HMLanguage.getLanguageCode(localeA) + '_' + localeA.getCountry();
    }

    public final boolean a(@Nullable WiFiControllerModule module, @Nullable g4s deviceInfo) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new b(module, this, deviceInfo, null), 1, null)).booleanValue();
    }

    public final Locale a(g4s deviceInfo) {
        Locale locale = Locale.getDefault();
        if (deviceInfo == null) {
            Intrinsics.checkNotNullExpressionValue(locale, "locale");
            return locale;
        }
        if (!deviceInfo.k0().d()) {
            Intrinsics.checkNotNullExpressionValue(locale, "locale");
            return locale;
        }
        com.xiaomi.hm.health.bt.profile.base.a aVarM0 = deviceInfo.m0();
        if (aVarM0 == null) {
            Intrinsics.checkNotNullExpressionValue(locale, "locale");
            return locale;
        }
        HMLanguage hMLanguageG = aVarM0.g();
        if (hMLanguageG == null) {
            Intrinsics.checkNotNullExpressionValue(locale, "locale");
            return locale;
        }
        try {
            Locale localeA = wg.a(hMLanguageG.getLanguage());
            Intrinsics.checkNotNullExpressionValue(localeA, "{\n            HmLocale.g…guage.language)\n        }");
            return localeA;
        } catch (Throwable th) {
            t5t.d("DeviceTokenHelper", "exception: " + th.getMessage());
            Intrinsics.checkNotNullExpressionValue(locale, "{\n            Debug.fi(T…         locale\n        }");
            return locale;
        }
    }
}
