package com.xiaomi.hm.health.healthdata.core;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.hmchartui.utils.Constant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.core.dao.DateConverter;
import com.xiaomi.hm.health.healthdata.core.dao.HealthTypeConverter;
import com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao;
import com.xiaomi.hm.health.healthdata.core.dao.PrimitiveListConverter;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2Dao;
import com.xiaomi.hm.health.healthdata.core.dao.Spo2DataLogDao;
import com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao;
import com.xiaomi.hm.health.healthdata.core.dao.UserHealthDataDao;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import com.xiaomi.hm.health.healthdata.core.entity.SyncLogEntity;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OdiEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaEventEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaProcessEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.PSpo2Entity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2DataSyncLogEntity;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@TypeConverters({HealthTypeConverter.class, DateConverter.class, PrimitiveListConverter.class})
@Database(entities = {UserDataEntity.class, SyncLogEntity.class, PSpo2Entity.class, OsaProcessEntity.class, OsaEventEntity.class, OdiEntity.class, Spo2DataSyncLogEntity.class, HearingHealthEntity.class}, exportSchema = true, version = 16)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "Landroidx/room/RoomDatabase;", "Lcom/xiaomi/hm/health/healthdata/core/dao/UserHealthDataDao;", "userHealthDataDao", "Lcom/xiaomi/hm/health/healthdata/core/dao/SyncLogDao;", "syncLogDao", "Lcom/xiaomi/hm/health/healthdata/core/dao/Spo2Dao;", "spo2Dao", "Lcom/xiaomi/hm/health/healthdata/core/dao/Spo2DataLogDao;", "spo2LogDao", "Lcom/xiaomi/hm/health/healthdata/core/dao/HearingHealthEntityDao;", "hearingHealthDao", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class HealthDataDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "userId";

    @NotNull
    private static final String b = "health_data_userId.db";

    @Nullable
    private static HealthDataDb c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "a", "", "b", PointCategory.INIT, "getInstance", "", WorkoutExercises.CLEAN, "DB_NAME", "Ljava/lang/String;", Constant.USER_ID, DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.HealthDataDb$Companion$clean$1", f = "HealthDataDb.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.core.HealthDataDb$Companion$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0957a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0957a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return String.valueOf(this.a);
                }
            }

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(HealthDataDb healthDataDb) {
                healthDataDb.syncLogDao().clean();
                healthDataDb.userHealthDataDao().clean();
                healthDataDb.spo2LogDao().clean();
                healthDataDb.spo2Dao().clean();
                healthDataDb.hearingHealthDao().clean();
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
                try {
                    final HealthDataDb healthDataDb = HealthDataDb.c;
                    if (healthDataDb != null) {
                        healthDataDb.runInTransaction(new Runnable() { // from class: com.xiaomi.hm.health.healthdata.core.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                HealthDataDb.Companion.a.b(healthDataDb);
                            }
                        });
                    }
                } catch (Throwable th) {
                    HMLog.error$default("clean-db", null, th, new C0957a(th), 2, null);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return String.valueOf(this.a);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HealthDataDb a(Context context) {
            return (HealthDataDb) Room.databaseBuilder(context, HealthDataDb.class, b()).fallbackToDestructiveMigration().build();
        }

        private final String b() {
            try {
                String userid = HMPersonInfo.getInstance().getUserInfo().getUserid();
                if (userid == null) {
                    userid = "";
                }
                return m.replace$default(HealthDataDb.b, "userId", userid, false, 4, (Object) null);
            } catch (Exception e) {
                HMLog.error$default("INIT-DB", null, e, new b(e), 2, null);
                return HealthDataDb.b;
            }
        }

        public final void clean() {
            e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(null), 2, null);
        }

        @NotNull
        public final HealthDataDb getInstance() {
            HealthDataDb healthDataDb = HealthDataDb.c;
            Objects.requireNonNull(healthDataDb, "db not init");
            return healthDataDb;
        }

        @NotNull
        public final synchronized HealthDataDb init(@NotNull Context context) {
            if (HealthDataDb.c == null) {
                HealthDataDb.c = a(context);
            }
            return HealthDataDb.c;
        }
    }

    @NotNull
    public abstract HearingHealthEntityDao hearingHealthDao();

    @NotNull
    public abstract Spo2Dao spo2Dao();

    @NotNull
    public abstract Spo2DataLogDao spo2LogDao();

    @NotNull
    public abstract SyncLogDao syncLogDao();

    @NotNull
    public abstract UserHealthDataDao userHealthDataDao();
}
