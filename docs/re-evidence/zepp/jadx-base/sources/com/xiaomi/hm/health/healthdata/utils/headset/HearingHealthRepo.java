package com.xiaomi.hm.health.healthdata.utils.headset;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.gdsp.HearingHealthDayData;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.utils.KtUtilsKt;
import com.xiaomi.hm.health.healthdata.api.WebConst;
import com.xiaomi.hm.health.healthdata.core.HealthDataDb;
import com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI;
import com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao;
import com.xiaomi.hm.health.healthdata.core.entity.HearingEntityStatus;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntityKt;
import com.xiaomi.hm.health.healthdata.koin.ScopesKt;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000b\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\f\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\r\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/headset/HearingHealthRepo;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "data", "Lkotlin/Function0;", "", "onSuccess", "onFailed", "tryUploadHearingData", "fetchRemoteHistory", "a", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "b", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "remoteApi", "Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "()Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "healthDataDb", "Lcom/xiaomi/hm/health/healthdata/utils/headset/HearingHealthCoroutineScope;", "()Lcom/xiaomi/hm/health/healthdata/utils/headset/HearingHealthCoroutineScope;", "coroutineScope", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HearingHealthRepo implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HearingHealthRepo";

    @NotNull
    public static final HearingHealthRepo INSTANCE = new HearingHealthRepo();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy remoteApi = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy healthDataDb = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy coroutineScope = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/headset/HearingHealthCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HearingHealthCoroutineScope> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HearingHealthCoroutineScope invoke() {
            return ScopesKt.headsetCoroutineScope(HearingHealthRepo.INSTANCE.getKoin());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.utils.headset.HearingHealthRepo$fetchRemoteHistory$1", f = "HearingHealthRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<HearingHealthEntity> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<HearingHealthEntity> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fetchRemoteHistory " + this.a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                List<HearingHealthEntity> listSyncHhHearingData = HearingHealthRepo.INSTANCE.c().syncHhHearingData(0L, Calendar.getInstance().getTimeInMillis(), null);
                if (listSyncHhHearingData.isEmpty()) {
                    return Unit.INSTANCE;
                }
                HMLog.debug(HearingHealthRepo.TAG, new a(listSyncHhHearingData));
                return Unit.INSTANCE;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HealthDataDb> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthDataDb invoke() {
            return ScopesKt.healthDataDb(HearingHealthRepo.INSTANCE.getKoin());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<UserDataRemoteAPI> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserDataRemoteAPI invoke() {
            return ScopesKt.healthWebApi(HearingHealthRepo.INSTANCE.getKoin());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.utils.headset.HearingHealthRepo$tryUploadHearingData$1", f = "HearingHealthRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<HearingHealthDayData> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "There are no uploaded beans in the current database";
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
            public final String invoke() {
                return "success";
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
            public final String invoke() {
                return "failed";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<HearingHealthDayData> list, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = function0;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<HearingHealthDayData> list = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(HearingHealthEntityKt.toHearingHealthEntity((HearingHealthDayData) it2.next(), HearingHealthRepo.INSTANCE.d(), WebConst.Param.HEARING_HEALTH_RECORDS_TYPE));
            }
            HearingHealthRepo hearingHealthRepo = HearingHealthRepo.INSTANCE;
            HearingHealthEntityDao hearingHealthEntityDaoHearingHealthDao = hearingHealthRepo.b().hearingHealthDao();
            Object[] array = arrayList.toArray(new HearingHealthEntity[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            HearingHealthEntity[] hearingHealthEntityArr = (HearingHealthEntity[]) array;
            hearingHealthEntityDaoHearingHealthDao.insert((HearingHealthEntity[]) Arrays.copyOf(hearingHealthEntityArr, hearingHealthEntityArr.length));
            List<HearingHealthEntity> listQueryEntity = hearingHealthRepo.b().hearingHealthDao().queryEntity(HearingEntityStatus.NOTUPLOADED.getValue(), hearingHealthRepo.d());
            if (KtUtilsKt.isNullOrEmpty(listQueryEntity)) {
                HMLog.info(HearingHealthRepo.TAG, a.a);
                return Unit.INSTANCE;
            }
            UserDataRemoteAPI userDataRemoteAPIC = hearingHealthRepo.c();
            Object[] array2 = listQueryEntity.toArray(new HearingHealthEntity[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            HearingHealthEntity[] hearingHealthEntityArr2 = (HearingHealthEntity[]) array2;
            if (userDataRemoteAPIC.upHhHearingData((HearingHealthEntity[]) Arrays.copyOf(hearingHealthEntityArr2, hearingHealthEntityArr2.length))) {
                HMLog.debug(HearingHealthRepo.TAG, b.a);
                Iterator<T> it3 = listQueryEntity.iterator();
                while (it3.hasNext()) {
                    ((HearingHealthEntity) it3.next()).setStatus(HearingEntityStatus.UPLOADED.getValue());
                }
                HearingHealthEntityDao hearingHealthEntityDaoHearingHealthDao2 = HearingHealthRepo.INSTANCE.b().hearingHealthDao();
                Object[] array3 = listQueryEntity.toArray(new HearingHealthEntity[0]);
                Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                HearingHealthEntity[] hearingHealthEntityArr3 = (HearingHealthEntity[]) array3;
                hearingHealthEntityDaoHearingHealthDao2.update((HearingHealthEntity[]) Arrays.copyOf(hearingHealthEntityArr3, hearingHealthEntityArr3.length));
                this.c.invoke();
            } else {
                HMLog.debug(HearingHealthRepo.TAG, c.a);
                this.d.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private HearingHealthRepo() {
    }

    private final HearingHealthCoroutineScope a() {
        return (HearingHealthCoroutineScope) coroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthDataDb b() {
        return (HealthDataDb) healthDataDb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserDataRemoteAPI c() {
        return (UserDataRemoteAPI) remoteApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return HMPersonInfo.getInstance().getUserInfo().getUserid();
    }

    public final void fetchRemoteHistory() {
        kotlinx.coroutines.e.f(a(), HeadsetHealth.INSTANCE.getNET(), null, new b(null), 2, null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final synchronized void tryUploadHearingData(@NotNull List<HearingHealthDayData> data, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onFailed) {
        kotlinx.coroutines.e.f(a(), HeadsetHealth.INSTANCE.getNET(), null, new e(data, onSuccess, onFailed, null), 2, null);
    }
}
