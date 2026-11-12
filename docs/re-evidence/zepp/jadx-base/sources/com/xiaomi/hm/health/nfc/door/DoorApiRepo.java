package com.xiaomi.hm.health.nfc.door;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.discovery.WebHelper;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0006\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/nfc/door/DoorApiRepo;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/feedback/api/FeedbackService;", "a", "Lkotlin/Lazy;", "()Lcom/huami/feedback/api/FeedbackService;", "feedbackService", "<init>", "()V", "Companion", "f", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DoorApiRepo implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy feedbackService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/nfc/door/DoorApiRepo$Companion;", "", "Lcom/xiaomi/hm/health/nfc/door/DoorApiRepo;", "get", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DoorApiRepo get() {
            return f.a.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return NfcDeviceConfigKt.isSupportNfcTag();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n"}, d2 = {"Landroid/content/Context;", "fromActivity", "", "feedbackInfo", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function4<Context, String, Boolean, Boolean, Boolean> {
        public b() {
            super(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(@NotNull Context context, @NotNull String str, boolean z, boolean z2) {
            if (!(context instanceof FragmentActivity)) {
                return true;
            }
            DoorApiRepo.this.a().feedback(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context), context, ((FragmentActivity) context).getSupportFragmentManager(), new FeedbackParams(str, null, null, null, false, 30, null));
            return true;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Boolean invoke(Context context, String str, Boolean bool, Boolean bool2) {
            return Boolean.valueOf(a(context, str, bool.booleanValue(), bool2.booleanValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            WebHelper.launch(str);
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
            return DeviceXFunctionsKt.getBuildConfigApi().isDebug() || GlobalConfig.get().isBuildInner();
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
            return !GlobalConfig.get().isBuildMidong();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/nfc/door/DoorApiRepo$f", "", "Lcom/xiaomi/hm/health/nfc/door/DoorApiRepo;", "b", "Lcom/xiaomi/hm/health/nfc/door/DoorApiRepo;", "a", "()Lcom/xiaomi/hm/health/nfc/door/DoorApiRepo;", DefaultSettingsSpiCall.n, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class f {

        @NotNull
        public static final f a = new f();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final DoorApiRepo instance = new DoorApiRepo();

        private f() {
        }

        @NotNull
        public final DoorApiRepo a() {
            return instance;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DoorApiRepo() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.feedbackService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FeedbackService>() { // from class: com.xiaomi.hm.health.nfc.door.DoorApiRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.feedback.api.FeedbackService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FeedbackService invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FeedbackService.class), qualifier, objArr);
            }
        });
        FunctionsConfig.setSupportNfcTag(a.a);
        FunctionsConfig.setOnErrorToFeedback(new b());
        FunctionsConfig.setOpenWebUrl(c.a);
        FunctionsConfig.setShowDetailMessage(d.a);
        FunctionsConfig.setMiFit(e.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackService a() {
        return (FeedbackService) this.feedbackService.getValue();
    }

    @JvmStatic
    @NotNull
    public static final DoorApiRepo get() {
        return INSTANCE.get();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
