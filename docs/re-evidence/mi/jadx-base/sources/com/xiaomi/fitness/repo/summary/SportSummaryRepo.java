package com.xiaomi.fitness.repo.summary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.gson.Gson;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.SportSummaryApiKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserver;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDaoKt;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryEntity;
import com.xiaomi.fit.fitness.persist.server.SportSummaryRequest;
import com.xiaomi.fit.fitness.persist.server.data.GetBatchSportSummary;
import com.xiaomi.fit.fitness.persist.server.data.GetSportSummary;
import com.xiaomi.fit.fitness.persist.server.data.SportCategoryRes;
import com.xiaomi.fit.fitness.persist.server.data.SportReportModel;
import com.xiaomi.fit.fitness.persist.server.data.SportSummaryRes;
import com.xiaomi.fit.fitness.persist.utils.SportSummaryUtilKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.repo.summary.SportSummaryRepo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010 \u001a\u00020\u0019H\u0002J\u001a\u0010!\u001a\u00020\u00192\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190#J\u001c\u0010&\u001a\u00020\u00192\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190#H\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(J\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020)J\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020-0(2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020)0(J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u0002000(2\u0006\u0010.\u001a\u00020)H\u0002JB\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\n\b\u0002\u00103\u001a\u0004\u0018\u00010+2\n\b\u0002\u00104\u001a\u0004\u0018\u00010+2\n\b\u0002\u00105\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0002\u00106J\u001c\u00108\u001a\u00020\u00192\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190#H\u0002J\u0006\u00109\u001a\u00020\u0019J\u001c\u0010:\u001a\b\u0012\u0004\u0012\u0002000(2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0(H\u0002JH\u0010=\u001a\u0004\u0018\u00010>2\u0006\u00102\u001a\u00020)2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)2\n\b\u0002\u00103\u001a\u0004\u0018\u00010+2\n\b\u0002\u00104\u001a\u0004\u0018\u00010+2\n\b\u0002\u00105\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0002\u00106J\u001e\u0010?\u001a\u0004\u0018\u00010>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020)0(H\u0082@¢\u0006\u0002\u0010AJ%\u0010B\u001a\n C*\u0004\u0018\u00010)0)2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(H\u0002¢\u0006\u0002\u0010DJ\u000e\u0010E\u001a\u00020+H\u0082@¢\u0006\u0002\u0010FJ\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020)0(H\u0082@¢\u0006\u0002\u0010FR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/repo/summary/SportSummaryRepo;", "", "request", "Lcom/xiaomi/fit/fitness/persist/server/SportSummaryRequest;", "<init>", "(Lcom/xiaomi/fit/fitness/persist/server/SportSummaryRequest;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "reportDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportDao;", "getReportDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportDao;", "reportObserverDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportObserverDao;", "getReportObserverDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportObserverDao;", "summaryDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryDao;", "getSummaryDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryDao;", "init", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "syncing", "", "updateCount", "", "onReportSynced", BaseJavaModule.METHOD_TYPE_SYNC, Constants.KEY_PAY_RESULT_RET, "Lkotlin/Function1;", "scopeOnline", "Lkotlinx/coroutines/CoroutineScope;", "syncOnline", "getCategories", "", "", "getStartSec", "", "getTotalSummary", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "category", "getNotUploadRecord", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "reqAndSaveSummaryRecursive", "dimen", "startSec", "endSec", "nextKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scopeOffline", "syncOffline", "createFakeData", "convertServerSportModelToDBEntity", "sportList", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "reqSummary", "Lcom/xiaomi/fit/fitness/persist/server/data/SportSummaryRes;", "reqBatchSpecificTotalSummary", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category2Str", "kotlin.jvm.PlatformType", "(Ljava/util/List;)Ljava/lang/String;", "reqSportStart0TZ", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reqCategory", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportSummaryRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSummaryRepo.kt\ncom/xiaomi/fitness/repo/summary/SportSummaryRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,506:1\n1611#2,9:507\n1863#2:516\n1864#2:518\n1620#2:519\n1611#2,9:520\n1863#2:529\n1864#2:531\n1620#2:532\n1557#2:534\n1628#2,3:535\n1#3:517\n1#3:530\n1#3:533\n*S KotlinDebug\n*F\n+ 1 SportSummaryRepo.kt\ncom/xiaomi/fitness/repo/summary/SportSummaryRepo\n*L\n294#1:507,9\n294#1:516\n294#1:518\n294#1:519\n295#1:520,9\n295#1:529\n295#1:531\n295#1:532\n479#1:534\n479#1:535,3\n294#1:517\n295#1:530\n*E\n"})
public final class SportSummaryRepo {
    public Gson gson;

    @NotNull
    private final SportSummaryRequest request;

    @Nullable
    private CoroutineScope scopeOffline;

    @Nullable
    private CoroutineScope scopeOnline;
    private boolean syncing;
    private int updateCount;

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.summary.SportSummaryRepo$createFakeData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo$createFakeData$1", f = "SportSummaryRepo.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportSummaryRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSummaryRepo.kt\ncom/xiaomi/fitness/repo/summary/SportSummaryRepo$createFakeData$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,506:1\n37#2:507\n36#2,3:508\n*S KotlinDebug\n*F\n+ 1 SportSummaryRepo.kt\ncom/xiaomi/fitness/repo/summary/SportSummaryRepo$createFakeData$1\n*L\n440#1:507\n440#1:508,3\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportSummaryRepo.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportSummaryRequest sportSummaryRequest = SportSummaryRepo.this.request;
                this.label = 1;
                obj = sportSummaryRequest.getFirstSport(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            FitnessLogUtils.i("SRecordSummaryRepo", "createFakeData: " + (list != null ? Boxing.boxInt(list.size()) : null));
            SportSummaryRepo sportSummaryRepo = SportSummaryRepo.this;
            Intrinsics.checkNotNull(list);
            SportReportEntity sportReportEntity = (SportReportEntity) CollectionsKt___CollectionsKt.first(sportSummaryRepo.convertServerSportModelToDBEntity(list));
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 730001; i2++) {
                SportReportEntity sportReportEntity2 = new SportReportEntity(String.valueOf(i2), "key-" + i2, jCurrentTimeMillis - (((long) i2) * 86400000));
                sportReportEntity2.setCategory(sportReportEntity.getCategory() + (i2 % 30));
                sportReportEntity2.setValue(sportReportEntity.getValue());
                arrayList.add(sportReportEntity2);
            }
            SportReportDao reportDao = SportSummaryRepo.this.getReportDao();
            Intrinsics.checkNotNull(reportDao);
            SportReportEntity[] sportReportEntityArr = (SportReportEntity[]) arrayList.toArray(new SportReportEntity[0]);
            reportDao.insertAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr, sportReportEntityArr.length));
            FitnessLogUtils.i("SRecordSummaryRepo", "createFakeData: consume = " + ((System.currentTimeMillis() - jCurrentTimeMillis) / ((long) 1000)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.summary.SportSummaryRepo$reqAndSaveSummaryRecursive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo", f = "SportSummaryRepo.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {319, 331}, m = "reqAndSaveSummaryRecursive", n = {"this", "dimen", "category", "startSec", "endSec", "nextKey", "sDao"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    public static final class C28621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C28621(Continuation<? super C28621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSummaryRepo.this.reqAndSaveSummaryRecursive(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.summary.SportSummaryRepo$reqCategory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo", f = "SportSummaryRepo.kt", i = {}, l = {505}, m = "reqCategory", n = {}, s = {})
    public static final class C28631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28631(Continuation<? super C28631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSummaryRepo.this.reqCategory(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.summary.SportSummaryRepo$reqSportStart0TZ$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo", f = "SportSummaryRepo.kt", i = {}, l = {493}, m = "reqSportStart0TZ", n = {}, s = {})
    public static final class C28641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28641(Continuation<? super C28641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSummaryRepo.this.reqSportStart0TZ(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.summary.SportSummaryRepo$syncOffline$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo$syncOffline$1", f = "SportSummaryRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportSummaryRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSummaryRepo.kt\ncom/xiaomi/fitness/repo/summary/SportSummaryRepo$syncOffline$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,506:1\n1863#2,2:507\n1863#2,2:509\n1863#2,2:511\n1#3:513\n37#4:514\n36#4,3:515\n*S KotlinDebug\n*F\n+ 1 SportSummaryRepo.kt\ncom/xiaomi/fitness/repo/summary/SportSummaryRepo$syncOffline$1\n*L\n356#1:507,2\n389#1:509,2\n393#1:511,2\n413#1:514\n413#1:515,3\n*E\n"})
    public static final class C28651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $ret;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28651(Function1<? super Boolean, Unit> function1, Continuation<? super C28651> continuation) {
            super(2, continuation);
            this.$ret = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportSummaryRepo.this.new C28651(this.$ret, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0162 A[Catch: Exception -> 0x0069, LOOP:1: B:40:0x015c->B:42:0x0162, LOOP_END, TryCatch #0 {Exception -> 0x0069, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0024, B:12:0x005d, B:16:0x006c, B:17:0x0078, B:19:0x007e, B:21:0x008a, B:24:0x0091, B:26:0x009c, B:27:0x00a8, B:28:0x00b0, B:32:0x00c6, B:39:0x00dd, B:40:0x015c, B:42:0x0162, B:43:0x017c, B:44:0x018b, B:46:0x0191, B:47:0x019f, B:48:0x01a9, B:50:0x01af, B:52:0x01cc, B:53:0x01cf, B:54:0x01ef, B:56:0x01f5, B:59:0x0208, B:61:0x0210, B:62:0x0213, B:64:0x0250, B:65:0x0253, B:66:0x0259, B:67:0x02a9), top: B:74:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0191 A[Catch: Exception -> 0x0069, LOOP:2: B:44:0x018b->B:46:0x0191, LOOP_END, TryCatch #0 {Exception -> 0x0069, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0024, B:12:0x005d, B:16:0x006c, B:17:0x0078, B:19:0x007e, B:21:0x008a, B:24:0x0091, B:26:0x009c, B:27:0x00a8, B:28:0x00b0, B:32:0x00c6, B:39:0x00dd, B:40:0x015c, B:42:0x0162, B:43:0x017c, B:44:0x018b, B:46:0x0191, B:47:0x019f, B:48:0x01a9, B:50:0x01af, B:52:0x01cc, B:53:0x01cf, B:54:0x01ef, B:56:0x01f5, B:59:0x0208, B:61:0x0210, B:62:0x0213, B:64:0x0250, B:65:0x0253, B:66:0x0259, B:67:0x02a9), top: B:74:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x01af A[Catch: Exception -> 0x0069, LOOP:3: B:48:0x01a9->B:50:0x01af, LOOP_END, TryCatch #0 {Exception -> 0x0069, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0024, B:12:0x005d, B:16:0x006c, B:17:0x0078, B:19:0x007e, B:21:0x008a, B:24:0x0091, B:26:0x009c, B:27:0x00a8, B:28:0x00b0, B:32:0x00c6, B:39:0x00dd, B:40:0x015c, B:42:0x0162, B:43:0x017c, B:44:0x018b, B:46:0x0191, B:47:0x019f, B:48:0x01a9, B:50:0x01af, B:52:0x01cc, B:53:0x01cf, B:54:0x01ef, B:56:0x01f5, B:59:0x0208, B:61:0x0210, B:62:0x0213, B:64:0x0250, B:65:0x0253, B:66:0x0259, B:67:0x02a9), top: B:74:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x01cc A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0024, B:12:0x005d, B:16:0x006c, B:17:0x0078, B:19:0x007e, B:21:0x008a, B:24:0x0091, B:26:0x009c, B:27:0x00a8, B:28:0x00b0, B:32:0x00c6, B:39:0x00dd, B:40:0x015c, B:42:0x0162, B:43:0x017c, B:44:0x018b, B:46:0x0191, B:47:0x019f, B:48:0x01a9, B:50:0x01af, B:52:0x01cc, B:53:0x01cf, B:54:0x01ef, B:56:0x01f5, B:59:0x0208, B:61:0x0210, B:62:0x0213, B:64:0x0250, B:65:0x0253, B:66:0x0259, B:67:0x02a9), top: B:74:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x01f5 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0024, B:12:0x005d, B:16:0x006c, B:17:0x0078, B:19:0x007e, B:21:0x008a, B:24:0x0091, B:26:0x009c, B:27:0x00a8, B:28:0x00b0, B:32:0x00c6, B:39:0x00dd, B:40:0x015c, B:42:0x0162, B:43:0x017c, B:44:0x018b, B:46:0x0191, B:47:0x019f, B:48:0x01a9, B:50:0x01af, B:52:0x01cc, B:53:0x01cf, B:54:0x01ef, B:56:0x01f5, B:59:0x0208, B:61:0x0210, B:62:0x0213, B:64:0x0250, B:65:0x0253, B:66:0x0259, B:67:0x02a9), top: B:74:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0210 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0024, B:12:0x005d, B:16:0x006c, B:17:0x0078, B:19:0x007e, B:21:0x008a, B:24:0x0091, B:26:0x009c, B:27:0x00a8, B:28:0x00b0, B:32:0x00c6, B:39:0x00dd, B:40:0x015c, B:42:0x0162, B:43:0x017c, B:44:0x018b, B:46:0x0191, B:47:0x019f, B:48:0x01a9, B:50:0x01af, B:52:0x01cc, B:53:0x01cf, B:54:0x01ef, B:56:0x01f5, B:59:0x0208, B:61:0x0210, B:62:0x0213, B:64:0x0250, B:65:0x0253, B:66:0x0259, B:67:0x02a9), top: B:74:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0250 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0024, B:12:0x005d, B:16:0x006c, B:17:0x0078, B:19:0x007e, B:21:0x008a, B:24:0x0091, B:26:0x009c, B:27:0x00a8, B:28:0x00b0, B:32:0x00c6, B:39:0x00dd, B:40:0x015c, B:42:0x0162, B:43:0x017c, B:44:0x018b, B:46:0x0191, B:47:0x019f, B:48:0x01a9, B:50:0x01af, B:52:0x01cc, B:53:0x01cf, B:54:0x01ef, B:56:0x01f5, B:59:0x0208, B:61:0x0210, B:62:0x0213, B:64:0x0250, B:65:0x0253, B:66:0x0259, B:67:0x02a9), top: B:74:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0208 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0207 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            long j2;
            ArrayList<SportSummaryEntity> arrayList;
            LinkedHashMap linkedHashMap;
            SportSummaryEntity sportSummaryEntity;
            SportSummaryEntity sportSummaryEntity2;
            SportSummaryEntity sportSummaryEntity3;
            List<Integer> listMinus;
            String str = "sport_stats_all";
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (SportSummaryRepo.this.getReportDao() != null && SportSummaryRepo.this.getSummaryDao() != null) {
                    SportReportDao reportDao = SportSummaryRepo.this.getReportDao();
                    Intrinsics.checkNotNull(reportDao);
                    SportSummaryDao summaryDao = SportSummaryRepo.this.getSummaryDao();
                    Intrinsics.checkNotNull(summaryDao);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    List<SportReportEntity> unUploadUnCount = reportDao.getUnUploadUnCount();
                    FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: size = " + unUploadUnCount.size());
                    if (unUploadUnCount.isEmpty()) {
                        this.$ret.invoke2(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (SportReportEntity sportReportEntity : unUploadUnCount) {
                        String category = sportReportEntity.getCategory();
                        if (category != null && category.length() != 0) {
                            sportReportEntity.setOfflineCounted(true);
                            ArrayList arrayList2 = (ArrayList) linkedHashMap2.get(category);
                            if (arrayList2 == null) {
                                linkedHashMap2.put(category, CollectionsKt__CollectionsKt.arrayListOf(sportReportEntity));
                            } else {
                                Boxing.boxBoolean(arrayList2.add(sportReportEntity));
                            }
                        }
                    }
                    long startSec0TZNotUpload = reportDao.getStartSec0TZNotUpload();
                    SummaryPrefer summaryPrefer = SummaryPrefer.INSTANCE;
                    long sport_start_sec_0tz = summaryPrefer.getSPORT_START_SEC_0TZ();
                    long jMin = 0;
                    if (startSec0TZNotUpload <= 0 || sport_start_sec_0tz <= 0) {
                        if (startSec0TZNotUpload > 0) {
                            j = startSec0TZNotUpload;
                            j2 = j;
                        } else if (sport_start_sec_0tz > 0) {
                            j = startSec0TZNotUpload;
                            j2 = sport_start_sec_0tz;
                        }
                        summaryPrefer.setSPORT_START_SEC_0TZ_OFFLINE(j2);
                        FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: startSec0TZ  online = " + sport_start_sec_0tz + "; notUpload = " + j + ", final = " + summaryPrefer.getSPORT_START_SEC_0TZ_OFFLINE());
                        List<String> preferCategory = SportSummaryUtilKt.getPreferCategory(true);
                        List<String> categoriesNotUpload = reportDao.getCategoriesNotUpload();
                        List<String> listDistinct = CollectionsKt___CollectionsKt.distinct(CollectionsKt___CollectionsKt.plus((Collection) preferCategory, (Iterable) categoriesNotUpload));
                        summaryPrefer.setSPORT_CATEGORY_OFFLINE(SportSummaryRepo.this.category2Str(listDistinct));
                        FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: notUploadCategory = " + categoriesNotUpload + ", online = " + preferCategory + ", final = " + listDistinct);
                        ListExtKt.add(listDistinct, "sport_stats_all");
                        arrayList = new ArrayList();
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            arrayList.add(SportSummaryUtilKt.toSummaryTotalEntity((ArrayList) entry.getValue(), (String) entry.getKey()));
                        }
                        linkedHashMap = new LinkedHashMap();
                        for (SportSummaryEntity sportSummaryEntity4 : summaryDao.getTotalSummaries(listDistinct)) {
                            linkedHashMap.put(sportSummaryEntity4.getCategory(), sportSummaryEntity4);
                        }
                        sportSummaryEntity = (SportSummaryEntity) linkedHashMap.get("sport_stats_all");
                        for (SportSummaryEntity sportSummaryEntity5 : arrayList) {
                            String category2 = sportSummaryEntity5.getCategory();
                            linkedHashMap.put(category2, SportSummaryUtilKt.add((SportSummaryEntity) linkedHashMap.get(category2), sportSummaryEntity5));
                            SportSummaryUtilKt.add(sportSummaryEntity, sportSummaryEntity5);
                        }
                        if (sportSummaryEntity != null) {
                            linkedHashMap.put("sport_stats_all", sportSummaryEntity);
                        }
                        List<SportReportEntity> unUploadDeletedUnCount = reportDao.getUnUploadDeletedUnCount();
                        FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: deleted size = " + unUploadDeletedUnCount.size());
                        for (SportReportEntity sportReportEntity2 : unUploadDeletedUnCount) {
                            sportSummaryEntity2 = (SportSummaryEntity) linkedHashMap.get(sportReportEntity2.getCategory());
                            if (sportSummaryEntity2 != null) {
                                sportSummaryEntity3 = (SportSummaryEntity) linkedHashMap.get(str);
                                if (sportSummaryEntity3 != null) {
                                    SportSummaryUtilKt.minus(sportSummaryEntity3, sportReportEntity2);
                                }
                                listMinus = SportSummaryUtilKt.minus(sportSummaryEntity2, sportReportEntity2);
                                String category3 = sportReportEntity2.getCategory();
                                String key = sportReportEntity2.getKey();
                                StringBuilder sb = new StringBuilder();
                                String str2 = str;
                                sb.append("syncOffline: deleted category = ");
                                sb.append(category3);
                                sb.append(", key = ");
                                sb.append(key);
                                sb.append(", hit = ");
                                sb.append(listMinus);
                                FitnessLogUtils.i("SRecordSummaryRepo", sb.toString());
                                if (!listMinus.isEmpty()) {
                                    SportSummaryUtilKt.findMaxData(sportSummaryEntity2, listMinus);
                                }
                                sportReportEntity2.setOfflineCounted(true);
                                str = str2;
                            }
                        }
                        summaryDao.insertSummary(CollectionsKt___CollectionsKt.toList(linkedHashMap.values()));
                        SportReportEntity[] sportReportEntityArr = (SportReportEntity[]) CollectionsKt___CollectionsKt.plus((Collection) unUploadUnCount, (Iterable) unUploadDeletedUnCount).toArray(new SportReportEntity[0]);
                        reportDao.updateAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr, sportReportEntityArr.length));
                        FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: total consume = " + (System.currentTimeMillis() - jCurrentTimeMillis));
                        this.$ret.invoke2(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    }
                    jMin = Math.min(startSec0TZNotUpload, sport_start_sec_0tz);
                    j = startSec0TZNotUpload;
                    j2 = jMin;
                    summaryPrefer.setSPORT_START_SEC_0TZ_OFFLINE(j2);
                    FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: startSec0TZ  online = " + sport_start_sec_0tz + "; notUpload = " + j + ", final = " + summaryPrefer.getSPORT_START_SEC_0TZ_OFFLINE());
                    List<String> preferCategory2 = SportSummaryUtilKt.getPreferCategory(true);
                    List<String> categoriesNotUpload2 = reportDao.getCategoriesNotUpload();
                    List<String> listDistinct2 = CollectionsKt___CollectionsKt.distinct(CollectionsKt___CollectionsKt.plus((Collection) preferCategory2, (Iterable) categoriesNotUpload2));
                    summaryPrefer.setSPORT_CATEGORY_OFFLINE(SportSummaryRepo.this.category2Str(listDistinct2));
                    FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: notUploadCategory = " + categoriesNotUpload2 + ", online = " + preferCategory2 + ", final = " + listDistinct2);
                    ListExtKt.add(listDistinct2, "sport_stats_all");
                    arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        arrayList.add(SportSummaryUtilKt.toSummaryTotalEntity((ArrayList) entry.getValue(), (String) entry.getKey()));
                    }
                    linkedHashMap = new LinkedHashMap();
                    while (r5.hasNext()) {
                        linkedHashMap.put(sportSummaryEntity4.getCategory(), sportSummaryEntity4);
                    }
                    sportSummaryEntity = (SportSummaryEntity) linkedHashMap.get("sport_stats_all");
                    while (r0.hasNext()) {
                        String category4 = sportSummaryEntity5.getCategory();
                        linkedHashMap.put(category4, SportSummaryUtilKt.add((SportSummaryEntity) linkedHashMap.get(category4), sportSummaryEntity5));
                        SportSummaryUtilKt.add(sportSummaryEntity, sportSummaryEntity5);
                    }
                    if (sportSummaryEntity != null) {
                        linkedHashMap.put("sport_stats_all", sportSummaryEntity);
                    }
                    List<SportReportEntity> unUploadDeletedUnCount2 = reportDao.getUnUploadDeletedUnCount();
                    FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: deleted size = " + unUploadDeletedUnCount2.size());
                    while (r5.hasNext()) {
                        sportSummaryEntity2 = (SportSummaryEntity) linkedHashMap.get(sportReportEntity2.getCategory());
                        if (sportSummaryEntity2 != null) {
                            sportSummaryEntity3 = (SportSummaryEntity) linkedHashMap.get(str);
                            if (sportSummaryEntity3 != null) {
                                SportSummaryUtilKt.minus(sportSummaryEntity3, sportReportEntity2);
                            }
                            listMinus = SportSummaryUtilKt.minus(sportSummaryEntity2, sportReportEntity2);
                            String category5 = sportReportEntity2.getCategory();
                            String key2 = sportReportEntity2.getKey();
                            StringBuilder sb2 = new StringBuilder();
                            String str3 = str;
                            sb2.append("syncOffline: deleted category = ");
                            sb2.append(category5);
                            sb2.append(", key = ");
                            sb2.append(key2);
                            sb2.append(", hit = ");
                            sb2.append(listMinus);
                            FitnessLogUtils.i("SRecordSummaryRepo", sb2.toString());
                            if (!listMinus.isEmpty()) {
                                SportSummaryUtilKt.findMaxData(sportSummaryEntity2, listMinus);
                            }
                            sportReportEntity2.setOfflineCounted(true);
                            str = str3;
                        }
                    }
                    summaryDao.insertSummary(CollectionsKt___CollectionsKt.toList(linkedHashMap.values()));
                    SportReportEntity[] sportReportEntityArr2 = (SportReportEntity[]) CollectionsKt___CollectionsKt.plus((Collection) unUploadUnCount, (Iterable) unUploadDeletedUnCount2).toArray(new SportReportEntity[0]);
                    reportDao.updateAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr2, sportReportEntityArr2.length));
                    FitnessLogUtils.i("SRecordSummaryRepo", "syncOffline: total consume = " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    this.$ret.invoke2(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            } catch (Exception e) {
                FitnessLogUtils.e("SRecordSummaryRepo", "syncOffline: " + e.getMessage());
                this.$ret.invoke2(Boxing.boxBoolean(false));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.summary.SportSummaryRepo$syncOnline$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.summary.SportSummaryRepo$syncOnline$1", f = "SportSummaryRepo.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4}, l = {175, 182, SportReportBaseParser.ReportType.entryTime, SportReportBaseParser.ReportType.targetValueNumber, SportReportBaseParser.ReportType.avgFreq}, m = "invokeSuspend", n = {"$this$scopeNet", "sDao", "$this$scopeNet", "sDao", "categoryTask", "curMills", "$this$scopeNet", "sDao", "curMills", "start0TZSec", "allTotalTask", "curMills", "curMills"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "J$1", "L$0", "J$0", "J$0"})
    public static final class C28661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $ret;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28661(Function1<? super Boolean, Unit> function1, Continuation<? super C28661> continuation) {
            super(2, continuation);
            this.$ret = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28661 c28661 = SportSummaryRepo.this.new C28661(this.$ret, continuation);
            c28661.L$0 = obj;
            return c28661;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0106 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x0107  */
        /* JADX WARN: Code duplicated, block: B:46:0x012b A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:10:0x001e, B:57:0x0182, B:17:0x0034, B:53:0x0173, B:20:0x0045, B:44:0x0108, B:46:0x012b, B:49:0x0133, B:58:0x01a6, B:23:0x005b, B:40:0x00ee, B:26:0x006b, B:36:0x009b, B:29:0x0078, B:31:0x0080, B:33:0x0083), top: B:63:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0170 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x0171  */
        /* JADX WARN: Code duplicated, block: B:55:0x0180 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:0x0181  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            SportSummaryDao summaryDao;
            Object objAwait;
            CoroutineScope coroutineScope2;
            SportSummaryDao sportSummaryDao;
            Deferred deferred;
            long j;
            long jLongValue;
            Object objAwait2;
            long j2;
            List list;
            List list2;
            Deferred deferredAsync$default;
            Deferred deferredAsync$default2;
            Deferred deferred2;
            long j3;
            long j4;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        summaryDao = (SportSummaryDao) this.L$1;
                        coroutineScope = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i == 2) {
                            j = this.J$0;
                            deferred = (Deferred) this.L$2;
                            SportSummaryDao sportSummaryDao2 = (SportSummaryDao) this.L$1;
                            coroutineScope2 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            sportSummaryDao = sportSummaryDao2;
                            objAwait = obj;
                            jLongValue = ((Number) objAwait).longValue();
                            this.L$0 = coroutineScope2;
                            this.L$1 = sportSummaryDao;
                            this.L$2 = null;
                            this.J$0 = j;
                            this.J$1 = jLongValue;
                            this.label = 3;
                            objAwait2 = deferred.await(this);
                            if (objAwait2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j2 = jLongValue;
                            list = (List) objAwait2;
                            FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: start0TZ = " + j2 + ", categories = " + list);
                            list2 = list;
                            if (list2 != null) {
                                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SportSummaryRepo$syncOnline$1$allTotalTask$1(SportSummaryRepo.this, null), 3, null);
                                deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SportSummaryRepo$syncOnline$1$specificTotalTask$1(SportSummaryRepo.this, list, sportSummaryDao, null), 3, null);
                                this.L$0 = deferredAsync$default;
                                this.L$1 = null;
                                this.J$0 = j;
                                this.label = 4;
                                if (deferredAsync$default2.await(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                deferred2 = deferredAsync$default;
                                j3 = j;
                                this.L$0 = null;
                                this.J$0 = j3;
                                this.label = 5;
                                if (deferred2.await(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                j4 = j3;
                            }
                            FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: category empty");
                            sportSummaryDao.clearSummary();
                            this.$ret.invoke2(Boxing.boxBoolean(true));
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            j2 = this.J$1;
                            j = this.J$0;
                            SportSummaryDao sportSummaryDao3 = (SportSummaryDao) this.L$1;
                            coroutineScope2 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            sportSummaryDao = sportSummaryDao3;
                            objAwait2 = obj;
                            list = (List) objAwait2;
                            FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: start0TZ = " + j2 + ", categories = " + list);
                            list2 = list;
                            if (list2 != null && !list2.isEmpty()) {
                                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SportSummaryRepo$syncOnline$1$allTotalTask$1(SportSummaryRepo.this, null), 3, null);
                                deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SportSummaryRepo$syncOnline$1$specificTotalTask$1(SportSummaryRepo.this, list, sportSummaryDao, null), 3, null);
                                this.L$0 = deferredAsync$default;
                                this.L$1 = null;
                                this.J$0 = j;
                                this.label = 4;
                                if (deferredAsync$default2.await(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                deferred2 = deferredAsync$default;
                                j3 = j;
                                this.L$0 = null;
                                this.J$0 = j3;
                                this.label = 5;
                                if (deferred2.await(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                j4 = j3;
                            }
                            FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: category empty");
                            sportSummaryDao.clearSummary();
                            this.$ret.invoke2(Boxing.boxBoolean(true));
                            return Unit.INSTANCE;
                        }
                        if (i == 4) {
                            j3 = this.J$0;
                            deferred2 = (Deferred) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            this.L$0 = null;
                            this.J$0 = j3;
                            this.label = 5;
                            if (deferred2.await(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j4 = j3;
                        } else {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j4 = this.J$0;
                            ResultKt.throwOnFailure(obj);
                        }
                    }
                    FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: consume = " + (System.currentTimeMillis() - j4));
                    this.$ret.invoke2(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (SportSummaryRepo.this.getSummaryDao() == null) {
                    return Unit.INSTANCE;
                }
                summaryDao = SportSummaryRepo.this.getSummaryDao();
                Intrinsics.checkNotNull(summaryDao);
                this.L$0 = coroutineScope;
                this.L$1 = summaryDao;
                this.label = 1;
                if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CoroutineScope coroutineScope3 = coroutineScope;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new SportSummaryRepo$syncOnline$1$startTask$1(SportSummaryRepo.this, null), 3, null);
                Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new SportSummaryRepo$syncOnline$1$categoryTask$1(SportSummaryRepo.this, null), 3, null);
                this.L$0 = coroutineScope3;
                this.L$1 = summaryDao;
                this.L$2 = deferredAsync$default4;
                this.J$0 = jCurrentTimeMillis;
                this.label = 2;
                objAwait = deferredAsync$default3.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope3;
                sportSummaryDao = summaryDao;
                deferred = deferredAsync$default4;
                j = jCurrentTimeMillis;
                jLongValue = ((Number) objAwait).longValue();
                this.L$0 = coroutineScope2;
                this.L$1 = sportSummaryDao;
                this.L$2 = null;
                this.J$0 = j;
                this.J$1 = jLongValue;
                this.label = 3;
                objAwait2 = deferred.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j2 = jLongValue;
                list = (List) objAwait2;
                FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: start0TZ = " + j2 + ", categories = " + list);
                list2 = list;
                if (list2 != null) {
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SportSummaryRepo$syncOnline$1$allTotalTask$1(SportSummaryRepo.this, null), 3, null);
                    deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SportSummaryRepo$syncOnline$1$specificTotalTask$1(SportSummaryRepo.this, list, sportSummaryDao, null), 3, null);
                    this.L$0 = deferredAsync$default;
                    this.L$1 = null;
                    this.J$0 = j;
                    this.label = 4;
                    if (deferredAsync$default2.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deferred2 = deferredAsync$default;
                    j3 = j;
                    this.L$0 = null;
                    this.J$0 = j3;
                    this.label = 5;
                    if (deferred2.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j4 = j3;
                    FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: consume = " + (System.currentTimeMillis() - j4));
                    this.$ret.invoke2(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                FitnessLogUtils.i("SRecordSummaryRepo", "syncOnline: category empty");
                sportSummaryDao.clearSummary();
                this.$ret.invoke2(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            } catch (Exception e) {
                FitnessLogUtils.e("SRecordSummaryRepo", "syncOnline: error = " + e.getMessage() + " " + e.getStackTrace());
                this.$ret.invoke2(Boxing.boxBoolean(false));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SportSummaryRepo(@NotNull SportSummaryRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String category2Str(List<String> categories) {
        List<String> list = categories;
        return (list == null || list.isEmpty()) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : getGson().toJson(categories);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SportReportEntity> convertServerSportModelToDBEntity(List<SportReportModel> sportList) {
        ArrayList arrayList = new ArrayList();
        for (SportReportModel sportReportModel : sportList) {
            SportReportEntity sportReportEntity = new SportReportEntity(sportReportModel.getSid(), sportReportModel.getKey(), sportReportModel.getTime());
            sportReportEntity.setCategory(sportReportModel.getCategory());
            boolean zBooleanValue = false;
            sportReportEntity.setZoneOffsetInSec(0);
            sportReportEntity.setValue(sportReportModel.getValue());
            if (sportReportModel.getIsDeleted() != null) {
                Boolean isDeleted = sportReportModel.getIsDeleted();
                Intrinsics.checkNotNull(isDeleted);
                zBooleanValue = isDeleted.booleanValue();
            }
            sportReportEntity.setUpload(true);
            sportReportEntity.setDeleted(zBooleanValue);
            arrayList.add(sportReportEntity);
        }
        return arrayList;
    }

    private final List<SportReportEntity> getNotUploadRecord(String category) {
        if (getReportDao() == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        SportReportDao reportDao = getReportDao();
        Intrinsics.checkNotNull(reportDao);
        try {
            return Intrinsics.areEqual(category, "sport_stats_all") ? reportDao.getUnUploadAndUndelete() : reportDao.getUnUploadAndUndelete(category);
        } catch (Exception e) {
            Logger.i("getNotUploadRecord", "exception=" + e);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SportReportDao getReportDao() {
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt != null && RegionExtKt.isRegionSelected(regionExtKt)) {
            return FitnessDatabase.INSTANCE.getInstance().sportReportDao();
        }
        FitnessLogUtils.i("SRecordSummaryRepo", "reportDao: region not selected");
        return null;
    }

    private final SportReportObserverDao getReportObserverDao() {
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt != null && RegionExtKt.isRegionSelected(regionExtKt)) {
            return FitnessDatabase.INSTANCE.getInstance().sportReportObserverDao();
        }
        FitnessLogUtils.i("SRecordSummaryRepo", "reportObserverDao: region not selected");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SportSummaryDao getSummaryDao() {
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt != null && RegionExtKt.isRegionSelected(regionExtKt)) {
            return FitnessSummaryDatabase.INSTANCE.getInstance().sportSummaryDao();
        }
        FitnessLogUtils.i("SRecordSummaryRepo", "summaryDao: region not selected");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReportSynced() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FitnessLogUtils.i("SRecordSummaryRepo", "onReportSynced: not login");
            return;
        }
        boolean defaultSyncWeb = RegionPreference.INSTANCE.getDefaultSyncWeb();
        FitnessLogUtils.i("SRecordSummaryRepo", "init, isSet = " + defaultSyncWeb);
        if (defaultSyncWeb) {
            final boolean sport_summary_synced = SummaryPrefer.INSTANCE.getSPORT_SUMMARY_SYNCED();
            if (getReportObserverDao() == null) {
                return;
            }
            final SportReportObserverDao reportObserverDao = getReportObserverDao();
            Intrinsics.checkNotNull(reportObserverDao);
            int count = reportObserverDao.getCount();
            FitnessLogUtils.i("SRecordSummaryRepo", "onReportSynced before: count = " + count + ", updateCount = " + this.updateCount + " syncing = " + this.syncing + ", synced = " + sport_summary_synced);
            if ((count <= 0 || this.updateCount == count) && (sport_summary_synced || this.syncing)) {
                return;
            }
            this.syncing = true;
            this.updateCount = count;
            sync(new Function1() { // from class: m3o
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportSummaryRepo.onReportSynced$lambda$0(this.f25719a, reportObserverDao, sport_summary_synced, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReportSynced$lambda$0(SportSummaryRepo this$0, SportReportObserverDao observerDao, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observerDao, "$observerDao");
        ScopeExtKt.scope$default(null, new SportSummaryRepo$onReportSynced$1$1(z2, this$0, observerDao, z, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object reqAndSaveSummaryRecursive(String str, String str2, Long l, Long l2, String str3, Continuation<? super Unit> continuation) {
        C28621 c28621;
        String str4;
        String str5;
        Long l3;
        Long l4;
        String str6;
        SportSummaryDao sportSummaryDao;
        SportSummaryRepo sportSummaryRepo;
        List<SportSummaryEntity> summaryList;
        if (continuation instanceof C28621) {
            c28621 = (C28621) continuation;
            int i = c28621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28621.label = i - Integer.MIN_VALUE;
            } else {
                c28621 = new C28621(continuation);
            }
        } else {
            c28621 = new C28621(continuation);
        }
        C28621 c28622 = c28621;
        Object objReqSummary = c28622.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28622.label;
        if (i2 != 0) {
            if (i2 == 1) {
                sportSummaryDao = (SportSummaryDao) c28622.L$6;
                str6 = (String) c28622.L$5;
                Long l5 = (Long) c28622.L$4;
                Long l6 = (Long) c28622.L$3;
                String str7 = (String) c28622.L$2;
                String str8 = (String) c28622.L$1;
                sportSummaryRepo = (SportSummaryRepo) c28622.L$0;
                ResultKt.throwOnFailure(objReqSummary);
                l4 = l5;
                l3 = l6;
                str5 = str7;
                str4 = str8;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objReqSummary);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objReqSummary);
        if (getSummaryDao() == null) {
            return Unit.INSTANCE;
        }
        SportSummaryDao summaryDao = getSummaryDao();
        Intrinsics.checkNotNull(summaryDao);
        c28622.L$0 = this;
        str4 = str;
        c28622.L$1 = str4;
        str5 = str2;
        c28622.L$2 = str5;
        l3 = l;
        c28622.L$3 = l3;
        l4 = l2;
        c28622.L$4 = l4;
        c28622.L$5 = str3;
        c28622.L$6 = summaryDao;
        c28622.label = 1;
        objReqSummary = reqSummary(str, str2, l, l2, str3, c28622);
        if (objReqSummary == coroutine_suspended) {
            return coroutine_suspended;
        }
        str6 = str3;
        sportSummaryDao = summaryDao;
        sportSummaryRepo = this;
        SportSummaryRes sportSummaryRes = (SportSummaryRes) objReqSummary;
        FitnessLogUtils.i("SRecordSummaryRepo", "reqSummaryRecursive: dimen = " + str4 + ", category = " + str5 + ", start = " + l3 + ", end = " + l4 + ", nextKey = " + str6);
        ArrayList<SportSummary> arrayList = sportSummaryRes != null ? sportSummaryRes.summaries : null;
        if ((arrayList == null || arrayList.isEmpty()) && (str6 == null || str6.length() == 0)) {
            FitnessLogUtils.i("SRecordSummaryRepo", "reqSummaryRecursive: empty");
            sportSummaryDao.deleteSummary(str5, str4);
        } else if (sportSummaryRes != null && (summaryList = SportSummaryUtilKt.toSummaryList(sportSummaryRes)) != null) {
            sportSummaryDao.insertSummary(summaryList);
        }
        String str9 = sportSummaryRes != null ? sportSummaryRes.next_key : null;
        if (str9 == null || str9.length() == 0 || Intrinsics.areEqual(str5, "sport_stats_all") || Intrinsics.areEqual(str9, str6)) {
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i("SRecordSummaryRepo", "reqSummaryRecursive: category = " + str5 + ", dim = " + str4 + " *****************************");
        String str10 = sportSummaryRes.next_key;
        c28622.L$0 = null;
        c28622.L$1 = null;
        c28622.L$2 = null;
        c28622.L$3 = null;
        c28622.L$4 = null;
        c28622.L$5 = null;
        c28622.L$6 = null;
        c28622.label = 2;
        if (sportSummaryRepo.reqAndSaveSummaryRecursive(str4, str5, l3, l4, str10, c28622) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reqBatchSpecificTotalSummary(List<String> list, Continuation<? super SportSummaryRes> continuation) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (String str : list2) {
            SportSummary.SummaryKey summaryKey = new SportSummary.SummaryKey();
            summaryKey.category = str;
            summaryKey.stats_type = SportSummaryDaoKt.SPORT_CATEGORY_SPECIFY;
            summaryKey.granularity = SportDataTypeKt.DIMEN_TOTAL;
            arrayList.add(summaryKey);
        }
        return this.request.getBatchSportSummary(new GetBatchSportSummary(arrayList), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object reqCategory(Continuation<? super List<String>> continuation) {
        C28631 c28631;
        if (continuation instanceof C28631) {
            c28631 = (C28631) continuation;
            int i = c28631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28631.label = i - Integer.MIN_VALUE;
            } else {
                c28631 = new C28631(continuation);
            }
        } else {
            c28631 = new C28631(continuation);
        }
        Object sportCategories = c28631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sportCategories);
            SportSummaryRequest sportSummaryRequest = this.request;
            c28631.label = 1;
            sportCategories = sportSummaryRequest.getSportCategories(c28631);
            if (sportCategories == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sportCategories);
        }
        List<String> list = ((SportCategoryRes) sportCategories).category_list;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object reqSportStart0TZ(Continuation<? super Long> continuation) {
        C28641 c28641;
        long jChangeToDestZeroTimeOneDay;
        if (continuation instanceof C28641) {
            c28641 = (C28641) continuation;
            int i = c28641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28641.label = i - Integer.MIN_VALUE;
            } else {
                c28641 = new C28641(continuation);
            }
        } else {
            c28641 = new C28641(continuation);
        }
        Object firstSport = c28641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(firstSport);
            SportSummaryRequest sportSummaryRequest = this.request;
            c28641.label = 1;
            firstSport = sportSummaryRequest.getFirstSport(c28641);
            if (firstSport == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(firstSport);
        }
        List list = (List) firstSport;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i("SRecordSummaryRepo", "reqSportStart0TZ: empty");
            jChangeToDestZeroTimeOneDay = 0;
        } else {
            SportReportModel sportReportModel = (SportReportModel) CollectionsKt___CollectionsKt.first(list);
            long time = sportReportModel.getTime();
            Integer zoneOffsetInSec = sportReportModel.getZoneOffsetInSec();
            jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(time, zoneOffsetInSec != null ? zoneOffsetInSec.intValue() : 0, 0);
            FitnessLogUtils.i("SRecordSummaryRepo", "reqSportStart0TZ: time = " + sportReportModel.getTime() + ", offset = $" + sportReportModel.getZoneOffsetInSec() + ", 0TZ = " + jChangeToDestZeroTimeOneDay);
        }
        return Boxing.boxLong(jChangeToDestZeroTimeOneDay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    public final Object reqSummary(String str, String str2, Long l, Long l2, String str3, Continuation<? super SportSummaryRes> continuation) {
        Long l3;
        Long lBoxLong;
        Long l4;
        Long lBoxLong2;
        String str4;
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        if (l == null || l.longValue() != 0) {
            if (l != null) {
                lBoxLong = Boxing.boxLong(l.longValue() - ((long) currentTZOffsetInSec));
            } else {
                l3 = null;
            }
            if (l == null || l.longValue() != Long.MAX_VALUE) {
                if (l2 != null) {
                    lBoxLong2 = Boxing.boxLong(l2.longValue() - ((long) currentTZOffsetInSec));
                } else {
                    l4 = null;
                }
                if (Intrinsics.areEqual(str2, "sport_stats_all")) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                return this.request.getSportSummary(new GetSportSummary(str4, str, l3, l4, 0, str3, null, 0, 208, null), continuation);
            }
            lBoxLong2 = Boxing.boxLong(Long.MAX_VALUE);
            l4 = lBoxLong2;
            if (Intrinsics.areEqual(str2, "sport_stats_all")) {
                str4 = null;
            } else {
                str4 = str2;
            }
            return this.request.getSportSummary(new GetSportSummary(str4, str, l3, l4, 0, str3, null, 0, 208, null), continuation);
        }
        lBoxLong = Boxing.boxLong(0L);
        l3 = lBoxLong;
        if (l == null) {
            lBoxLong2 = Boxing.boxLong(Long.MAX_VALUE);
            l4 = lBoxLong2;
        } else if (l2 != null) {
            lBoxLong2 = Boxing.boxLong(l2.longValue() - ((long) currentTZOffsetInSec));
            l4 = lBoxLong2;
        } else {
            l4 = null;
        }
        if (Intrinsics.areEqual(str2, "sport_stats_all")) {
            str4 = null;
        } else {
            str4 = str2;
        }
        return this.request.getSportSummary(new GetSportSummary(str4, str, l3, l4, 0, str3, null, 0, 208, null), continuation);
    }

    private final void syncOffline(Function1<? super Boolean, Unit> ret) {
        CoroutineScope coroutineScope = this.scopeOffline;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.scopeOffline = ScopeExtKt.scopeNet(Dispatchers.getIO(), new C28651(ret, null));
    }

    private final void syncOnline(Function1<? super Boolean, Unit> ret) {
        CoroutineScope coroutineScope = this.scopeOnline;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.scopeOnline = ScopeExtKt.scopeNet(Dispatchers.getIO(), new C28661(ret, null));
    }

    public final void createFakeData() {
        if (getReportDao() == null) {
            return;
        }
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(null));
    }

    @NotNull
    public final List<String> getCategories() {
        boolean syncWeb = RegionPreference.INSTANCE.getSyncWeb();
        FitnessLogUtils.i("SRecordSummaryRepo", "getCategories: online = " + syncWeb);
        if (!syncWeb) {
            return SportSummaryUtilKt.getPreferCategory(false);
        }
        if (getReportDao() == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        SportReportDao reportDao = getReportDao();
        Intrinsics.checkNotNull(reportDao);
        List<String> categoriesNotUpload = reportDao.getCategoriesNotUpload();
        List<String> preferCategory = SportSummaryUtilKt.getPreferCategory(true);
        List<String> listDistinct = CollectionsKt___CollectionsKt.distinct(CollectionsKt___CollectionsKt.plus((Collection) preferCategory, (Iterable) categoriesNotUpload));
        FitnessLogUtils.i("SRecordSummaryRepo", "getCategories: prefer = " + preferCategory + "; dbCategory = " + categoriesNotUpload + "; final = " + listDistinct);
        return listDistinct;
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    public final long getStartSec() {
        long startSec0TZNotUpload;
        if (!RegionPreference.INSTANCE.getSyncWeb()) {
            startSec0TZNotUpload = SummaryPrefer.INSTANCE.getSPORT_START_SEC_0TZ_OFFLINE();
        } else {
            if (getReportDao() == null) {
                return 0L;
            }
            SportReportDao reportDao = getReportDao();
            Intrinsics.checkNotNull(reportDao);
            startSec0TZNotUpload = reportDao.getStartSec0TZNotUpload();
            long sport_start_sec_0tz = SummaryPrefer.INSTANCE.getSPORT_START_SEC_0TZ();
            FitnessLogUtils.i("SRecordSummaryRepo", "getStartSec0TZ: db = " + startSec0TZNotUpload + ", prefer0TZ = " + sport_start_sec_0tz);
            if (startSec0TZNotUpload > 0 && sport_start_sec_0tz > 0) {
                startSec0TZNotUpload = Math.min(sport_start_sec_0tz, startSec0TZNotUpload);
            } else if (startSec0TZNotUpload <= 0) {
                startSec0TZNotUpload = sport_start_sec_0tz > 0 ? sport_start_sec_0tz : 0L;
            }
        }
        if (startSec0TZNotUpload <= 0) {
            startSec0TZNotUpload = SportSummaryApiKt.DEFAULT_START_0TZ_SEC;
        }
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(startSec0TZNotUpload, 0, FitnessDateUtils.getCurrentTZOffsetInSec());
        FitnessLogUtils.i("SRecordSummaryRepo", "getStartSec: " + jChangeToDestZeroTimeOneDay);
        return jChangeToDestZeroTimeOneDay;
    }

    @Nullable
    public final SportSummary getTotalSummary(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        if (getSummaryDao() == null) {
            return null;
        }
        SportSummaryDao summaryDao = getSummaryDao();
        Intrinsics.checkNotNull(summaryDao);
        SportSummaryEntity totalSummary = summaryDao.getTotalSummary(category);
        SportSummary summary = totalSummary != null ? totalSummary.getSummary() : null;
        FitnessLogUtils.i("SRecordSummaryRepo", "getSummary: db = " + summary);
        if (!RegionPreference.INSTANCE.getSyncWeb()) {
            return summary;
        }
        List<SportReportEntity> notUploadRecord = getNotUploadRecord(category);
        FitnessLogUtils.i("SRecordSummaryRepo", "getSummary: notUpload = " + notUploadRecord);
        List<SportReportEntity> list = notUploadRecord;
        if (list == null || list.isEmpty()) {
            return summary;
        }
        return (summary != null ? summary.key : null) == null ? SportSummaryUtilKt.toSummaryTotalEntity(notUploadRecord, category).getSummary() : SportSummaryUtilKt.addReports(summary, category, notUploadRecord);
    }

    public final void init(@NotNull final SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        FitnessLogUtils.i("SRecordSummaryRepo", "init: " + ApplicationExtKt.isMainProcess(AppUtil.getApp()));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = SportReportObserver.INSTANCE.observeReport(db);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.repo.summary.SportSummaryRepo$init$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                FitnessLogUtils.i("SRecordSummaryRepo", "received sync sign observer = " + booleanRef.element);
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (!booleanRef2.element) {
                    booleanRef2.element = SportReportObserver.INSTANCE.observeReport(db);
                }
                this.onReportSynced();
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        intentFilter.addAction(FitnessDataConstants.BROADCAST_ACTION_HISTORY_SPORT_REPORT_CHANGED);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }

    public final void sync(@NotNull Function1<? super Boolean, Unit> ret) {
        Intrinsics.checkNotNullParameter(ret, "ret");
        boolean syncWeb = RegionPreference.INSTANCE.getSyncWeb();
        FitnessLogUtils.i("SRecordSummaryRepo", "******* start sync: " + syncWeb + " *******");
        if (syncWeb) {
            syncOnline(ret);
        } else {
            syncOffline(ret);
        }
    }

    @NotNull
    public final List<SportSummary> getTotalSummary(@NotNull List<String> category) {
        Intrinsics.checkNotNullParameter(category, "category");
        if (getSummaryDao() == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        SportSummaryDao summaryDao = getSummaryDao();
        Intrinsics.checkNotNull(summaryDao);
        List<SportSummaryEntity> totalSummaries = summaryDao.getTotalSummaries(category);
        if (!RegionPreference.INSTANCE.getSyncWeb()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = totalSummaries.iterator();
            while (it.hasNext()) {
                SportSummary totalSummary = getTotalSummary(((SportSummaryEntity) it.next()).getCategory());
                if (totalSummary != null) {
                    arrayList.add(totalSummary);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = totalSummaries.iterator();
        while (it2.hasNext()) {
            SportSummary totalSummary2 = getTotalSummary(((SportSummaryEntity) it2.next()).getCategory());
            if (totalSummary2 != null) {
                arrayList2.add(totalSummary2);
            }
        }
        return arrayList2;
    }
}
