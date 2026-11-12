package com.xiaomi.hm.health.di.koin.spo2;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.zepp.usecase.MigrateSpo2DataUseCase;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2Dao;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OdiEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaEventEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaProcessEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.PSpo2Entity;
import com.xiaomi.hm.health.healthdata.koin.ScopesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/spo2/MigrateHelper;", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OdiEntity;", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "b", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/PSpo2Entity;", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "a", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaEventEntity;", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "c", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaProcessEntity;", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", GoogleApiAvailabilityLight.a, "", "migrateDataNotUploaded", "", "uploadDataNotMigrated", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MigrateHelper {

    @NotNull
    public static final MigrateHelper INSTANCE = new MigrateHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "MigrateHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.spo2.MigrateHelper$migrateDataNotUploaded$1", f = "MigrateHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MigrateHelper.INSTANCE.uploadDataNotMigrated();
            return Unit.INSTANCE;
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
            return "scope is null";
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
            return "MigrateSpo2DataUseCase is null";
        }
    }

    private MigrateHelper() {
    }

    private final ClickMeasuredSpo2 a(PSpo2Entity pSpo2Entity) {
        return new ClickMeasuredSpo2(pSpo2Entity.getUserId(), pSpo2Entity.getTimeStamp(), pSpo2Entity.getSpo2(), pSpo2Entity.getDeviceSource(), pSpo2Entity.getDeviceId(), pSpo2Entity.getSn(), null, null, null, false, 960, null);
    }

    private final Odi b(OdiEntity odiEntity) {
        return new Odi(odiEntity.getUserId(), odiEntity.getTimeStamp(), odiEntity.getOdTimes(), 0L, odiEntity.getOdi(), odiEntity.getDeviceSource(), null, odiEntity.getValid(), odiEntity.getDeviceId(), odiEntity.getSn(), null, 0, 0, null, false, 31816, null);
    }

    private final OsaEvent c(OsaEventEntity osaEventEntity) {
        String userId = osaEventEntity.getUserId();
        long timeStamp = osaEventEntity.getTimeStamp();
        int deviceSource = osaEventEntity.getDeviceSource();
        String deviceId = osaEventEntity.getDeviceId();
        String sn = osaEventEntity.getSn();
        return new OsaEvent(userId, timeStamp, osaEventEntity.getSpo2(), osaEventEntity.getHr(), osaEventEntity.getSpo2Decrease(), null, deviceSource, deviceId, sn, null, null, false, null, false, 15904, null);
    }

    private final OsaProcess d(OsaProcessEntity osaProcessEntity) {
        return new OsaProcess(osaProcessEntity.getUserId(), osaProcessEntity.getTimeStamp(), osaProcessEntity.getSpo2(), osaProcessEntity.getDuration(), null, osaProcessEntity.getDeviceSource(), osaProcessEntity.getDeviceId(), osaProcessEntity.getSn(), null, null, null, null, null, null, false, null, false, 130832, null);
    }

    public final void migrateDataNotUploaded() {
        BloodOxygenCoroutineScope bloodOxygenCoroutineScope = (BloodOxygenCoroutineScope) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().getOrNull(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null);
        if ((bloodOxygenCoroutineScope != null ? e.f(bloodOxygenCoroutineScope, null, null, new a(null), 3, null) : null) == null) {
            HMLog.info(TAG, b.a);
        }
    }

    public final boolean uploadDataNotMigrated() {
        Spo2Dao spo2Dao = ScopesKt.spo2Dao(GlobalContext.INSTANCE.get());
        long jYMDToTimestamp = BloodOxygenUtils.INSTANCE.yMDToTimestamp("2019-01-01");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = null;
        MigrateSpo2DataUseCase migrateSpo2DataUseCase = (MigrateSpo2DataUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().getOrNull(Reflection.getOrCreateKotlinClass(MigrateSpo2DataUseCase.class), null, null);
        if (migrateSpo2DataUseCase != null) {
            List<PSpo2Entity> pSpo2NotUploaded = spo2Dao.getPSpo2NotUploaded();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(pSpo2NotUploaded, 10));
            Iterator<T> it2 = pSpo2NotUploaded.iterator();
            while (it2.hasNext()) {
                arrayList.add(INSTANCE.a((PSpo2Entity) it2.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (true) {
                boolean z = false;
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                long utcTimestamp = ((ClickMeasuredSpo2) next).getUtcTimestamp();
                if (jYMDToTimestamp <= utcTimestamp && utcTimestamp <= jCurrentTimeMillis) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            List<OdiEntity> odiNotUploaded = spo2Dao.getOdiNotUploaded();
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(odiNotUploaded, 10));
            Iterator<T> it4 = odiNotUploaded.iterator();
            while (it4.hasNext()) {
                arrayList3.add(INSTANCE.b((OdiEntity) it4.next()));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                long utcTimestamp2 = ((Odi) obj).getUtcTimestamp();
                if (jYMDToTimestamp <= utcTimestamp2 && utcTimestamp2 <= jCurrentTimeMillis) {
                    arrayList4.add(obj);
                }
            }
            List<OsaEventEntity> osaEventNotUploaded = spo2Dao.getOsaEventNotUploaded();
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(osaEventNotUploaded, 10));
            Iterator<T> it5 = osaEventNotUploaded.iterator();
            while (it5.hasNext()) {
                arrayList5.add(INSTANCE.c((OsaEventEntity) it5.next()));
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                long utcTimestamp3 = ((OsaEvent) obj2).getUtcTimestamp();
                if (jYMDToTimestamp <= utcTimestamp3 && utcTimestamp3 <= jCurrentTimeMillis) {
                    arrayList6.add(obj2);
                }
            }
            boolValueOf = Boolean.valueOf(migrateSpo2DataUseCase.execute(arrayList2, arrayList4, arrayList6));
            if (boolValueOf.booleanValue()) {
                spo2Dao.clean();
            }
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        HMLog.info(TAG, c.a);
        return true;
    }
}
