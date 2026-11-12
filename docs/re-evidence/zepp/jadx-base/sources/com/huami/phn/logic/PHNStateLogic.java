package com.huami.phn.logic;

import android.content.Context;
import android.widget.Toast;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.usecase.OpenPHNPlanPageUseCase;
import com.huami.phn.coach.usecase.PHNInitUseCase;
import com.huami.phn.core.device.Device;
import com.huami.phn.core.device.DeviceManager;
import com.huami.phn.util.AppSettingHelper;
import com.huami.phn.util.WebHelper;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/huami/phn/logic/PHNStateLogic;", "", "", "inited", "a", "", "jsonData", "phnProjectInit", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "hasInited", "gotoSettingOrDetailPage", "", "gotoPHNDetailPage", "Ljava/lang/String;", "PHN_SETTING", "b", "TAG", "c", "phnSettingUrl", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNStateLogic {

    @NotNull
    public static final PHNStateLogic INSTANCE = new PHNStateLogic();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PHN_SETTING = "phn-setting";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "PHNStateLogic";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static String phnSettingUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.logic.PHNStateLogic$gotoSettingOrDetailPage$1", f = "PHNStateLogic.kt", i = {0}, l = {51}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Context c;

        /* JADX INFO: renamed from: com.huami.phn.logic.PHNStateLogic$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.phn.logic.PHNStateLogic$gotoSettingOrDetailPage$1$1", f = "PHNStateLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0538a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public C0538a(Continuation<? super C0538a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0538a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0538a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PHNStateLogic pHNStateLogic = PHNStateLogic.INSTANCE;
                PHNStateLogic.phnSettingUrl = AppSettingHelper.INSTANCE.getAppSettings(PHNStateLogic.PHN_SETTING);
                HMLog.i(PHNStateLogic.TAG, "phn setting-url:" + PHNStateLogic.phnSettingUrl, new Object[0]);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Unit unit = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                if (PHNStateLogic.phnSettingUrl == null) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0538a c0538a = new C0538a(null);
                    this.b = coroutineScope;
                    this.a = 1;
                    if (BuildersKt.withContext(io2, c0538a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = PHNStateLogic.phnSettingUrl;
            if (str != null) {
                HMLog.i(PHNStateLogic.TAG, "start phn setting with:" + PHNStateLogic.phnSettingUrl, new Object[0]);
                WebHelper.launch(str, true, true);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                Context context = this.c;
                HMLog.i(PHNStateLogic.TAG, "phn setting-url is null", new Object[0]);
                Toast.makeText(context, "setting-url is null", 1).show();
            }
            return Unit.INSTANCE;
        }
    }

    private PHNStateLogic() {
    }

    private final boolean a(boolean inited) {
        if (inited) {
            return true;
        }
        Device activeDevice = ((DeviceManager) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(DeviceManager.class), null, null)).getActiveDevice();
        if (activeDevice == null) {
            return false;
        }
        return activeDevice.getIsPhnEnable();
    }

    public final void gotoPHNDetailPage(@NotNull Context context) {
        ((OpenPHNPlanPageUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(OpenPHNPlanPageUseCase.class), null, null)).execute(context);
    }

    public final boolean gotoSettingOrDetailPage(@NotNull Context context, boolean hasInited) {
        if (!a(hasInited)) {
            HMLog.i(TAG, "phn not support", new Object[0]);
            return false;
        }
        if (!hasInited) {
            e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(context, null), 3, null);
            return true;
        }
        HMLog.i(TAG, "phn has inited goto detail page", new Object[0]);
        gotoPHNDetailPage(context);
        return true;
    }

    public final boolean phnProjectInit(@NotNull String jsonData) {
        return ((PHNInitUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(PHNInitUseCase.class), null, null)).execute(jsonData);
    }
}
