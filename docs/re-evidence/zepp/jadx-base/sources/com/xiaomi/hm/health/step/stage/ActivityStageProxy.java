package com.xiaomi.hm.health.step.stage;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.datautil.HMBraceletDateDataUtil;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.step.stage.local.entity.StageEntity;
import com.xiaomi.hm.health.step.stage.model.StageInfo;
import com.xiaomi.hm.health.step.stage.model.StageItem;
import com.xiaomi.hm.health.step.stage.repo.IActivityStageRepo;
import com.xiaomi.hm.health.step.stage.util.StageCoroutineScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J0\u0010\f\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\f\u0010\u000e\u001a\u00020\r*\u00020\u0005H\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0010\u0018\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u001f\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/step/stage/ActivityStageProxy;", "Lorg/koin/core/component/KoinComponent;", "", "date", "", "Lcom/xiaomi/hm/health/step/stage/model/StageInfo;", "stageItems", "", "c", "userId", "", "source", GoogleApiAvailabilityLight.a, "", "e", "handleBandData", ExifInterface.GPS_DIRECTION_TRUE, "value", "fromJson$app_midongPlayRelease", "(Ljava/lang/String;)Ljava/lang/Object;", "fromJson", "a", "Ljava/lang/String;", "tag", "Lcom/google/gson/Gson;", "b", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "Lcom/xiaomi/hm/health/step/stage/util/StageCoroutineScope;", "()Lcom/xiaomi/hm/health/step/stage/util/StageCoroutineScope;", "scope", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ActivityStageProxy implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "ActivityStageProxy";

    @NotNull
    public static final ActivityStageProxy INSTANCE = new ActivityStageProxy();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy gson = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy scope = LazyKt__LazyJVMKt.lazy(e.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final Gson getA() {
            return new Gson();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Handle band step stage data.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Handle companion step stage data.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.step.stage.ActivityStageProxy$handleCompanionData$2", f = "ActivityStageProxy.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<StageInfo> b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<StageInfo> list, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strUserId = AccountServiceExtKt.userId(AccountModuleKt.getAccountService());
            if (strUserId == null) {
                return Unit.INSTANCE;
            }
            ActivityStageProxy.INSTANCE.d(this.b, strUserId, this.c, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH).getValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/util/StageCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<StageCoroutineScope> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StageCoroutineScope getA() {
            return (StageCoroutineScope) ActivityStageProxy.INSTANCE.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(StageCoroutineScope.class), null, null);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.step.stage.ActivityStageProxy$handleBandData$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.step.stage.ActivityStageProxy$handleBandData$2", f = "ActivityStageProxy.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strUserId = AccountServiceExtKt.userId(AccountModuleKt.getAccountService());
            if (strUserId == null) {
                return Unit.INSTANCE;
            }
            DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(this.b);
            if (specifyDayData != null) {
                String str = this.b;
                ActivityStageProxy activityStageProxy = ActivityStageProxy.INSTANCE;
                String stageStepsSummary = specifyDayData.getStageStepsSummary();
                ArrayList arrayList = null;
                List list = (List) (stageStepsSummary == null ? null : activityStageProxy.a().fromJson(stageStepsSummary, new TypeToken<List<? extends StageInfo>>() { // from class: com.xiaomi.hm.health.step.stage.ActivityStageProxy$handleBandData$2$invokeSuspend$lambda-1$$inlined$fromJson$app_midongPlayRelease$1
                }.getType()));
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (Boxing.boxBoolean(!ActivityStageProxy.INSTANCE.e((StageInfo) obj2)).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                }
                ActivityStageProxy activityStageProxy2 = ActivityStageProxy.INSTANCE;
                Integer source = specifyDayData.getSource();
                activityStageProxy2.d(arrayList, strUserId, str, source == null ? -1 : source.intValue());
            }
            return Unit.INSTANCE;
        }
    }

    private ActivityStageProxy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson a() {
        return (Gson) gson.getValue();
    }

    private final StageCoroutineScope b() {
        return (StageCoroutineScope) scope.getValue();
    }

    private final void c(String date, List<StageInfo> stageItems) {
        HMLog.info(tag, c.a);
        kotlinx.coroutines.e.f(b(), null, null, new d(stageItems, date, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List<StageInfo> stageItems, String userId, String date, int source) {
        if (stageItems == null || stageItems.isEmpty()) {
            return;
        }
        IActivityStageRepo iActivityStageRepo = (IActivityStageRepo) getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IActivityStageRepo.class), null, null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stageItems, 10));
        for (StageInfo stageInfo : stageItems) {
            arrayList.add(new StageItem(stageInfo.getTime(), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(stageInfo.getCount()), Integer.valueOf(stageInfo.getDis()), Integer.valueOf(stageInfo.getCal()), Integer.valueOf(stageInfo.getStep())})));
        }
        iActivityStageRepo.addStageInfo(new StageEntity(userId, date, null, source, arrayList, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(StageInfo stageInfo) {
        return stageInfo.getCount() == 0 && stageInfo.getDis() == 0 && stageInfo.getStep() == 0;
    }

    public final /* synthetic */ <T> T fromJson$app_midongPlayRelease(String value) {
        if (value == null) {
            return null;
        }
        Gson gsonA = INSTANCE.a();
        Intrinsics.needClassReification();
        return (T) gsonA.fromJson(value, new TypeToken<T>() { // from class: com.xiaomi.hm.health.step.stage.ActivityStageProxy$fromJson$1$1
        }.getType());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void handleBandData(@NotNull String date) {
        HMLog.info(tag, b.a);
        kotlinx.coroutines.e.f(b(), null, null, new AnonymousClass2(date, null), 3, null);
    }
}
