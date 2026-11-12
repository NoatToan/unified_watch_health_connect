package com.xiaomi.hm.health.play.card.sport;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.utils.SportRecordQueryConstrainUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import com.xiaomi.hm.health.play.bean.SportDataBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016J\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016J\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/ISportDataManagerIml;", "Lcom/xiaomi/hm/health/play/card/sport/ISportDataManager;", "Lcom/xiaomi/hm/health/play/card/sport/a;", "sportType", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "a", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/play/bean/SportDataBean;", "getRecentlyRunData", "getRecentlyWalkData", "getRecentlyBikeData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ISportDataManagerIml implements ISportDataManager {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.xiaomi.hm.health.play.card.sport.a.values().length];
            iArr[com.xiaomi.hm.health.play.card.sport.a.RUN.ordinal()] = 1;
            iArr[com.xiaomi.hm.health.play.card.sport.a.WALK.ordinal()] = 2;
            iArr[com.xiaomi.hm.health.play.card.sport.a.BIKE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Trackrecord> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Trackrecord invoke() {
            return ISportDataManagerIml.this.a(com.xiaomi.hm.health.play.card.sport.a.BIKE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Trackrecord> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Trackrecord invoke() {
            return ISportDataManagerIml.this.a(com.xiaomi.hm.health.play.card.sport.a.RUN);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Trackrecord> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Trackrecord invoke() {
            return ISportDataManagerIml.this.a(com.xiaomi.hm.health.play.card.sport.a.WALK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Trackrecord a(com.xiaomi.hm.health.play.card.sport.a sportType) {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        Property property = TrackrecordDao.Properties.State;
        WhereCondition whereConditionNotEq = property.notEq(Integer.valueOf(SyncedState.SYNC_STATE_DEFAULT.getValue()));
        Property property2 = TrackrecordDao.Properties.Trackid;
        queryBuilder.where(whereConditionNotEq, property.notEq(Integer.valueOf(SyncedState.STATE_TO_BE_DELETED.getValue())), property.notEq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), SportRecordQueryConstrainUtils.querySportRecordBySportType(), property2.le(Long.valueOf(jCurrentTimeMillis)));
        int i = WhenMappings.$EnumSwitchMapping$0[sportType.ordinal()];
        if (i == 1) {
            queryBuilder.where(TrackrecordDao.Properties.Type.in(1, 8, 25, 26, 7, 110), new WhereCondition[0]);
        } else if (i == 2) {
            queryBuilder.where(TrackrecordDao.Properties.Type.in(6, 40, 131), new WhereCondition[0]);
        } else if (i == 3) {
            queryBuilder.where(TrackrecordDao.Properties.Type.in(9, 10, 47, 48), new WhereCondition[0]);
        }
        List<Trackrecord> list = queryBuilder.orderDesc(property2).list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return TrackRecordManager.getInstance().parseOriginalJsonData2Trackrecord(list.get(0));
    }

    @Override // com.xiaomi.hm.health.play.card.sport.ISportDataManager
    @NotNull
    public LiveData<SportDataBean> getRecentlyBikeData() {
        return Transformations.map(LiveDataSupportKt.queryByLiveData(new String[]{"TRACKRECORD"}, new a()), new Function<Trackrecord, SportDataBean>() { // from class: com.xiaomi.hm.health.play.card.sport.ISportDataManagerIml$getRecentlyBikeData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final SportDataBean apply(Trackrecord trackrecord) {
                Trackrecord trackrecord2 = trackrecord;
                if (trackrecord2 == null) {
                    return null;
                }
                return ISportDataManagerKt.a(trackrecord2);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.sport.ISportDataManager
    @NotNull
    public LiveData<SportDataBean> getRecentlyRunData() {
        return Transformations.map(LiveDataSupportKt.queryByLiveData(new String[]{"TRACKRECORD"}, new b()), new Function<Trackrecord, SportDataBean>() { // from class: com.xiaomi.hm.health.play.card.sport.ISportDataManagerIml$getRecentlyRunData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final SportDataBean apply(Trackrecord trackrecord) {
                Trackrecord trackrecord2 = trackrecord;
                if (trackrecord2 == null) {
                    return null;
                }
                return ISportDataManagerKt.a(trackrecord2);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.sport.ISportDataManager
    @NotNull
    public LiveData<SportDataBean> getRecentlyWalkData() {
        return Transformations.map(LiveDataSupportKt.queryByLiveData(new String[]{"TRACKRECORD"}, new c()), new Function<Trackrecord, SportDataBean>() { // from class: com.xiaomi.hm.health.play.card.sport.ISportDataManagerIml$getRecentlyWalkData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final SportDataBean apply(Trackrecord trackrecord) {
                Trackrecord trackrecord2 = trackrecord;
                if (trackrecord2 == null) {
                    return null;
                }
                return ISportDataManagerKt.a(trackrecord2);
            }
        });
    }
}
