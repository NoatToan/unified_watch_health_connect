package com.xiaomi.hm.health.bodyfat.manager;

import androidx.p008lifecycle.LiveData;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.databases.model.WeightInfosDao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0001NB\t\b\u0002¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bJ\u0014\u0010\u0014\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bJ\u0014\u0010\u0019\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u0006J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u0006J$\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#J\u000e\u0010&\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010'\u001a\u00020!J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\u0010\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020!J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020!J\b\u0010*\u001a\u0004\u0018\u00010\u000bJ\b\u0010-\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010'\u001a\u00020!J\u0010\u0010.\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\bJ \u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!J \u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!J\u000e\u00102\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bJ\u0006\u00103\u001a\u00020!J\u000e\u00104\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bJ\u0010\u00105\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bJ$\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b072\u0006\u0010\t\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\u0006\u0010'\u001a\u00020!J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020!J\u0018\u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010<\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u000e0;2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010=\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010?\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010>\u001a\u00020!J\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010'\u001a\u00020!J\u001c\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0;2\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0;2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u00020\bJ\u0018\u0010E\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bJ\u001c\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0;2\u0006\u0010\t\u001a\u00020\bR\u001c\u0010K\u001a\u00020G8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRepository;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfosDao;", "a", "", ParamKey.weightData, "", "b", "", "uid", "c", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weight", "addWeightInfo", "", "weightInfos", "addWeightInfos", "", "deleteWeightInfo", "weights", "deleteWeightInfos", "id", "deleteWeightById", "deleteAll", "updateWeightInfo", "updateWeightInfos", "getGuestWeightInfo", "getWeightInfo", "timestamp", "containsDeleted", "getWeightInfoByTimestamp", "orderByDesc", "getWeightInfos", "", "count", "Lorg/greenrobot/greendao/Property;", "property", "getWeightInfosByProperty", "getWeightInfosCount", "limit", "getWeightInfosDelete", "getWeightInfosSync", "getLatestInfo", "getLatestInfoFromDevice", "getLatestInfos", "getLatestWeightScaleWeightInfo", "getLatestBdfatInfo", "getBodyFatInfosAsc", "getLatestBodyScoreInfos", "getLatestBmiInfos", "getUserWeightCount", "getWeightInfoBodyFatCount", "getValidBodyFatCount", "getFirstWeightInfo", "time", "", "getLatestBodyFatInfos", "getLatestOftInfos", "getOftInfos", "Landroidx/lifecycle/LiveData;", "getOftInfosLiveData", "getOftInfosCount", "index", "getOftRecordByIndex", "getWeightInfosNeedSync", "getWeightInfosAsc", "getBodyFatInfosAsLiveData", "fromServerTime", "compareWithSeverTime", "getLatestInfoBeforeTime", "getWeightInfosBalance", "", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightInfoRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile WeightInfoRepository b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRepository$Companion;", "", "Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRepository;", "getInstance", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRepository;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WeightInfoRepository getInstance() {
            WeightInfoRepository weightInfoRepository = WeightInfoRepository.b;
            if (weightInfoRepository == null) {
                synchronized (this) {
                    weightInfoRepository = WeightInfoRepository.b;
                    if (weightInfoRepository == null) {
                        weightInfoRepository = new WeightInfoRepository(null);
                        Companion companion = WeightInfoRepository.INSTANCE;
                        WeightInfoRepository.b = weightInfoRepository;
                    }
                }
            }
            return weightInfoRepository;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Delete All Infos!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<? extends WeightInfos>> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends WeightInfos> invoke() {
            return WeightInfoRepository.this.getBodyFatInfosAsc(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<WeightInfos> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends WeightInfos> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("bodyfat size = ", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<List<? extends WeightInfos>> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends WeightInfos> invoke() {
            return WeightInfoRepository.this.getOftInfos(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<List<? extends WeightInfos>> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends WeightInfos> invoke() {
            return WeightInfoRepository.this.getWeightInfos(this.b, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<List<? extends WeightInfos>> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends WeightInfos> invoke() {
            return WeightInfoRepository.this.a().queryBuilder().where(WeightInfosDao.Properties.Sync.gt(-1), WeightInfosDao.Properties.Type.eq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(WeightInfoRepository.this.c(this.b)))).list();
        }
    }

    private WeightInfoRepository() {
        this.TAG = "WeightInfoRepository";
    }

    public /* synthetic */ WeightInfoRepository(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightInfosDao a() {
        return HMDaoManager.getInstance().getWeightInfosDao();
    }

    private final boolean b(float weightData) {
        return weightData <= 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c(long uid) {
        if (uid == Long.parseLong(BFCallback.getHMPersonInfo().getUserid())) {
            return -1L;
        }
        return uid;
    }

    public static /* synthetic */ WeightInfos getWeightInfoByTimestamp$default(WeightInfoRepository weightInfoRepository, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return weightInfoRepository.getWeightInfoByTimestamp(j, z);
    }

    public static /* synthetic */ List getWeightInfos$default(WeightInfoRepository weightInfoRepository, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return weightInfoRepository.getWeightInfos(j, z);
    }

    public final long addWeightInfo(@NotNull WeightInfos weight) {
        weight.setTimestamp(Long.valueOf(ExtentionUtilsKt.millsToSecond(weight.getTimestamp().longValue(), true)));
        if (Intrinsics.areEqual(weight.getUserId(), Long.valueOf(BFCallback.getHMPersonInfo().getUserid()))) {
            weight.setUserId(-1L);
        }
        Long userId = weight.getUserId();
        if (userId != null && userId.longValue() == -3) {
            weight.setId(-3L);
            weight.setSync(1);
        } else {
            weight.setId(weight.getTimestamp());
        }
        a().insertOrReplace(weight);
        Long userId2 = weight.getUserId();
        if (userId2 == null || userId2.longValue() != -3) {
            WeightInfoManager.getManager().notifyDataInsert(weight);
        }
        return weight.getId().longValue();
    }

    @NotNull
    public final List<WeightInfos> addWeightInfos(@NotNull List<? extends WeightInfos> weightInfos) {
        ArrayList arrayList = new ArrayList();
        for (WeightInfos weightInfos2 : weightInfos) {
            if (!b(weightInfos2.getWeight().floatValue())) {
                if (Intrinsics.areEqual(weightInfos2.getUserId(), Long.valueOf(BFCallback.getHMPersonInfo().getUserid()))) {
                    weightInfos2.setUserId(-1L);
                }
                weightInfos2.setTimestamp(Long.valueOf(ExtentionUtilsKt.millsToSecond(weightInfos2.getTimestamp().longValue(), true)));
                weightInfos2.setId(weightInfos2.getTimestamp());
                arrayList.add(weightInfos2);
            }
        }
        if (!arrayList.isEmpty()) {
            a().insertOrReplaceInTx(arrayList);
        }
        return arrayList;
    }

    public final long compareWithSeverTime(long fromServerTime) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        Property property = WeightInfosDao.Properties.Timestamp;
        return queryBuilder.where(property.ge(Long.valueOf(fromServerTime)), property.lt(Long.valueOf(fromServerTime + ((long) 1000))), WeightInfosDao.Properties.UserId.notEq(-3L)).count();
    }

    public final void deleteAll() {
        HMLog.info(this.TAG, a.a);
        a().deleteAll();
    }

    public final void deleteWeightById(long id) {
        a().deleteByKey(Long.valueOf(id));
    }

    public final void deleteWeightInfo(@NotNull WeightInfos weight) {
        a().delete(weight);
    }

    public final void deleteWeightInfos(@NotNull List<? extends WeightInfos> weights) {
        a().deleteInTx(weights);
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getBodyFatInfosAsLiveData(long uid) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new b(uid));
    }

    @Nullable
    public final List<WeightInfos> getBodyFatInfosAsc(long uid) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.Height;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Body_fat.isNotNull(), WeightInfosDao.Properties.Score.isNotNull(), property2.ge(90), property2.le(220)).orderAsc(WeightInfosDao.Properties.Timestamp).list();
        HMLog.info(this.TAG, new c(list));
        return list;
    }

    @Nullable
    public final WeightInfos getFirstWeightInfo(long uid) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).orderAsc(WeightInfosDao.Properties.Timestamp).list();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Nullable
    public final WeightInfos getGuestWeightInfo() {
        List<WeightInfos> list = a().queryBuilder().where(WeightInfosDao.Properties.UserId.eq(-3L), new WhereCondition[0]).list();
        if (list.isEmpty()) {
            return null;
        }
        return (WeightInfos) CollectionsKt.first((List) list);
    }

    @Nullable
    public final WeightInfos getLatestBdfatInfo(long uid) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Body_fat.isNotNull()).orderDesc(WeightInfosDao.Properties.Timestamp).limit(1).list();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Nullable
    public final List<WeightInfos> getLatestBmiInfos(long uid, int count) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        return queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Bmi.isNotNull()).orderDesc(WeightInfosDao.Properties.Timestamp).limit(count).list();
    }

    @NotNull
    public final List<WeightInfos> getLatestBodyFatInfos(long uid, long time, int limit) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Height;
        Property property2 = WeightInfosDao.Properties.Timestamp;
        return queryBuilder.where(whereConditionGt, WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Body_fat.isNotNull(), WeightInfosDao.Properties.Muscle.isNotNull(), property.ge(90), property.le(220), property2.le(Long.valueOf(time))).orderDesc(property2).limit(limit).list();
    }

    @Nullable
    public final List<WeightInfos> getLatestBodyScoreInfos(long uid, int count) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        return queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Score.gt(0)).orderDesc(WeightInfosDao.Properties.Timestamp).limit(count).list();
    }

    @Nullable
    public final WeightInfos getLatestInfo(long uid) {
        List<WeightInfos> latestInfos = getLatestInfos(uid, 1);
        if (!latestInfos.isEmpty()) {
            return (WeightInfos) CollectionsKt.first((List) latestInfos);
        }
        return null;
    }

    @Nullable
    public final WeightInfos getLatestInfoBeforeTime(long uid, long timestamp) {
        QueryBuilder<WeightInfos> queryBuilder = HMDaoManager.getInstance().getWeightInfosDao().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.Height;
        Property property3 = WeightInfosDao.Properties.Timestamp;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Body_fat.isNotNull(), property2.ge(90), property2.le(220), property3.lt(Long.valueOf(timestamp))).orderDesc(property3).list();
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Nullable
    public final WeightInfos getLatestInfoFromDevice(long uid) {
        List<WeightInfos> latestInfoFromDevice = getLatestInfoFromDevice(uid, 1);
        if (!latestInfoFromDevice.isEmpty()) {
            return (WeightInfos) CollectionsKt.first((List) latestInfoFromDevice);
        }
        return null;
    }

    @NotNull
    public final List<WeightInfos> getLatestInfos(long uid, int limit) {
        if (!(limit > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        return queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).orderDesc(WeightInfosDao.Properties.Timestamp).limit(limit).list();
    }

    @NotNull
    public final List<WeightInfos> getLatestOftInfos(long uid, int limit) {
        if (limit > 0) {
            return a().queryBuilder().where(WeightInfosDao.Properties.Sync.gt(-1), WeightInfosDao.Properties.Type.eq(3), WeightInfosDao.Properties.Ofmt.isNotNull(), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).orderDesc(WeightInfosDao.Properties.Timestamp).limit(limit).list();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Nullable
    public final WeightInfos getLatestWeightScaleWeightInfo() {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.UserId;
        return queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), property2.notEq(0L), property2.notEq(-3L), property.notEq(1), WeightInfosDao.Properties.Source.eq(Integer.valueOf(HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()))).orderDesc(WeightInfosDao.Properties.Timestamp).limit(1).unique();
    }

    @Nullable
    public final List<WeightInfos> getOftInfos(long uid) {
        return a().queryBuilder().where(WeightInfosDao.Properties.Sync.gt(-1), WeightInfosDao.Properties.Type.eq(3), WeightInfosDao.Properties.Ofmt.isNotNull(), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).orderAsc(WeightInfosDao.Properties.Timestamp).list();
    }

    public final int getOftInfosCount(long uid) {
        return (int) a().queryBuilder().where(WeightInfosDao.Properties.Sync.gt(-1), WeightInfosDao.Properties.Type.eq(3), WeightInfosDao.Properties.Ofmt.isNotNull(), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).count();
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getOftInfosLiveData(long uid) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new d(uid));
    }

    @Nullable
    public final WeightInfos getOftRecordByIndex(long uid, int index) {
        return a().queryBuilder().where(WeightInfosDao.Properties.Sync.gt(-1), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Type.eq(3), WeightInfosDao.Properties.Ofmt.isNotNull()).orderAsc(WeightInfosDao.Properties.Timestamp).limit(1).offset(index).unique();
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final int getUserWeightCount(long uid) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        Property property = WeightInfosDao.Properties.Type;
        return (int) queryBuilder.where(property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).count();
    }

    public final int getValidBodyFatCount(long uid) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.Height;
        return (int) queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))), WeightInfosDao.Properties.Body_fat.isNotNull(), WeightInfosDao.Properties.Score.isNotNull(), property2.ge(90), property2.le(220)).count();
    }

    @Nullable
    public final WeightInfos getWeightInfo(long id) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.Id.eq(Long.valueOf(id))).list();
        if (list.isEmpty()) {
            return null;
        }
        return (WeightInfos) CollectionsKt.first((List) list);
    }

    public final int getWeightInfoBodyFatCount() {
        return (int) a().queryBuilder().where(WeightInfosDao.Properties.Body_fat.isNotNull(), WeightInfosDao.Properties.UserId.notEq(-3L)).count();
    }

    @Nullable
    public final WeightInfos getWeightInfoByTimestamp(long timestamp, boolean containsDeleted) {
        if (containsDeleted) {
            List<WeightInfos> list = a().queryBuilder().where(WeightInfosDao.Properties.Timestamp.eq(Long.valueOf(timestamp)), new WhereCondition[0]).list();
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        List<WeightInfos> list2 = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.Timestamp.eq(Long.valueOf(timestamp))).list();
        if (list2.isEmpty()) {
            return null;
        }
        return list2.get(0);
    }

    @NotNull
    public final List<WeightInfos> getWeightInfos(long uid, boolean orderByDesc) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        QueryBuilder<WeightInfos> queryBuilderWhere = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid))));
        List<WeightInfos> list = orderByDesc ? queryBuilderWhere.orderDesc(WeightInfosDao.Properties.Timestamp).list() : queryBuilderWhere.orderAsc(WeightInfosDao.Properties.Timestamp).list();
        for (WeightInfos weightInfos : list) {
            if (weightInfos.getBmi() == null) {
                Integer height = UserInfoManager.getManager().getInfo(BFCallback.getHMLoginManager().getValidUid()).getHeight();
                if (height.intValue() > 0 && weightInfos.getWeight() != null && weightInfos.getWeight().floatValue() > 0.0f) {
                    weightInfos.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(height.intValue(), weightInfos.getWeight().floatValue())));
                }
            }
        }
        return list;
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getWeightInfosAsc(long uid) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new e(uid));
    }

    @NotNull
    public final LiveData<List<WeightInfos>> getWeightInfosBalance(long uid) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new f(uid));
    }

    @NotNull
    public final List<WeightInfos> getWeightInfosByProperty(long uid, int count, @NotNull Property property) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionEq = WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)));
        Property property2 = WeightInfosDao.Properties.Timestamp;
        return queryBuilder.where(whereConditionEq, property.isNotNull(), property2.le(Long.valueOf(jCurrentTimeMillis))).orderDesc(property2).limit(count).list();
    }

    public final int getWeightInfosCount(long uid) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        return (int) queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).count();
    }

    @NotNull
    public final List<WeightInfos> getWeightInfosDelete(int limit) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionEq = WeightInfosDao.Properties.Sync.eq(-1);
        Property property = WeightInfosDao.Properties.UserId;
        QueryBuilder<WeightInfos> queryBuilderWhere = queryBuilder.where(whereConditionEq, property.notEq(0L), property.notEq(-3L));
        return limit > 0 ? queryBuilderWhere.limit(limit).list() : queryBuilderWhere.list();
    }

    @NotNull
    public final List<WeightInfos> getWeightInfosNeedSync(int limit) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionEq = WeightInfosDao.Properties.Sync.eq(0);
        Property property = WeightInfosDao.Properties.UserId;
        QueryBuilder<WeightInfos> queryBuilderWhere = queryBuilder.where(whereConditionEq, property.notEq(0L), property.notEq(-3L));
        return limit > 0 ? queryBuilderWhere.limit(limit).list() : queryBuilderWhere.list();
    }

    @NotNull
    public final List<WeightInfos> getWeightInfosSync() {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionEq = WeightInfosDao.Properties.Sync.eq(0);
        Property property = WeightInfosDao.Properties.UserId;
        return queryBuilder.where(whereConditionEq, property.notEq(0L), property.notEq(-3L)).list();
    }

    public final void updateWeightInfo(@NotNull WeightInfos weight) {
        a().update(weight);
    }

    public final void updateWeightInfos(@NotNull List<? extends WeightInfos> weights) {
        a().updateInTx(weights);
    }

    @Nullable
    public final WeightInfos getLatestInfo() {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.UserId;
        return queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), property2.notEq(0L), property2.notEq(-3L)).orderDesc(WeightInfosDao.Properties.Timestamp).limit(1).unique();
    }

    @NotNull
    public final List<WeightInfos> getLatestInfoFromDevice(long uid, int limit) {
        if (limit > 0) {
            QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
            WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
            Property property = WeightInfosDao.Properties.Type;
            return queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(1), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(c(uid)))).orderDesc(WeightInfosDao.Properties.Timestamp).limit(limit).list();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public final List<WeightInfos> getLatestInfos(int limit) {
        QueryBuilder<WeightInfos> queryBuilder = a().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.UserId;
        return queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), property2.notEq(-3L), property2.notEq(0L)).orderDesc(WeightInfosDao.Properties.Timestamp).limit(limit).list();
    }
}
