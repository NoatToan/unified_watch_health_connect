package com.xiaomi.fit.fitness.remote;

import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.DailyRecordItemModel;
import com.xiaomi.fit.fitness.DataExtKt;
import com.xiaomi.fit.fitness.FitnessDBKey;
import com.xiaomi.fit.fitness.SportDBKey;
import com.xiaomi.fit.fitness.a;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fit.fitness.remote.FitnessDBDataUpdater;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bR/\u0010%\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessDBDataUpdater;", "", "", "checkForceRemoteService", "()Z", "", "persistKey", "sid", "", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "itemList", "allowSwitchProcess", "recordDailyRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Z", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "recordSportReport", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "recordList", "deleteDailyRecord", "(Ljava/lang/String;Ljava/util/List;Z)Z", "reportList", "deleteSportReport", "(Ljava/util/List;)Z", "", "startSyncDataToHealthConnect", "()V", "disconnectHealthConnect", "Lcom/xiaomi/fit/fitness/a;", "<set-?>", "mRemoteService$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteService", "()Lcom/xiaomi/fit/fitness/a;", "setMRemoteService", "(Lcom/xiaomi/fit/fitness/a;)V", "mRemoteService", "<init>", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FitnessDBDataUpdater {

    @NotNull
    private static final String TAG = "FitnessDBDataUpdater";

    /* JADX INFO: renamed from: mRemoteService$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteService = new BinderDelegate(FitnessDataRemoteImpl.BINDER_NAME);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDBDataUpdater.class, "mRemoteService", "getMRemoteService()Lcom/xiaomi/fit/fitness/FitnessDataCenterRemote;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessDBDataUpdater instance = new FitnessDBDataUpdater();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessDBDataUpdater$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fit/fitness/remote/FitnessDBDataUpdater;", "getInstance", "()Lcom/xiaomi/fit/fitness/remote/FitnessDBDataUpdater;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessDBDataUpdater getInstance() {
            return FitnessDBDataUpdater.instance;
        }
    }

    private FitnessDBDataUpdater() {
        ServiceConnector.INSTANCE.getBinder(12, new Function1() { // from class: xo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FitnessDBDataUpdater._init_$lambda$0(this.f39310a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(FitnessDBDataUpdater this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "getBinder");
        if (iBinder != null) {
            FitnessLogUtils.i(TAG, "init server sync impl");
            this$0.setMRemoteService(a.AbstractBinderC0362a.asInterface(iBinder));
        }
        return Unit.INSTANCE;
    }

    private final boolean checkForceRemoteService() {
        return ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication()) && getMRemoteService() != null;
    }

    private final a getMRemoteService() {
        return (a) this.mRemoteService.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMRemoteService(a aVar) {
        this.mRemoteService.setValue((Object) this, $$delegatedProperties[0], aVar);
    }

    public final boolean deleteDailyRecord(@NotNull String persistKey, @NotNull List<? extends DailyRecordItem> recordList, boolean allowSwitchProcess) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        if (recordList.isEmpty()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        String dbKey = null;
        for (DailyRecordItem dailyRecordItem : recordList) {
            FitnessDBKey fitnessDBKey$default = DataExtKt.toFitnessDBKey$default(dailyRecordItem, persistKey, null, 2, null);
            if (fitnessDBKey$default == null) {
                FitnessLogUtils.w(TAG, "no support key (" + dailyRecordItem + ")");
            } else {
                dbKey = dailyRecordItem.getDbKey();
                arrayList.add(fitnessDBKey$default);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        if (dbKey != null) {
            persistKey = dbKey;
        }
        if (!allowSwitchProcess || getMRemoteService() == null) {
            return DailyRecordDaoUtils.INSTANCE.softDeleteDailyRecord(persistKey, arrayList);
        }
        a mRemoteService = getMRemoteService();
        Intrinsics.checkNotNull(mRemoteService);
        return mRemoteService.deleteDailyRecord(persistKey, arrayList);
    }

    public final boolean deleteSportReport(@NotNull List<SportBasicReport> reportList) {
        a mRemoteService;
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        if (reportList.isEmpty()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<SportBasicReport> it = reportList.iterator();
        while (it.hasNext()) {
            SportDBKey sportDBKey$default = DataExtKt.toSportDBKey$default(it.next(), null, 1, null);
            if (sportDBKey$default != null) {
                arrayList.add(sportDBKey$default);
            }
        }
        if (arrayList.isEmpty() || (mRemoteService = getMRemoteService()) == null) {
            return false;
        }
        return mRemoteService.deleteSportReport(arrayList);
    }

    public final void disconnectHealthConnect() throws RemoteException {
        a mRemoteService = getMRemoteService();
        if (mRemoteService != null) {
            mRemoteService.disconnectHealthConnect();
        } else {
            Logger.i(TAG, "disconnectHealthConnect with null mRemoteService");
        }
    }

    public final boolean recordDailyRecord(@NotNull String persistKey, @NotNull String sid, @NotNull List<DailyRecordItemModel> itemList, boolean allowSwitchProcess) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        if (itemList.isEmpty()) {
            return true;
        }
        if (!allowSwitchProcess || !checkForceRemoteService()) {
            return DailyRecordDaoUtils.INSTANCE.recordDailyRecordToDB(persistKey, sid, itemList);
        }
        FitnessLogUtils.i(TAG, "mRemoteService#recordDailyRecordToDB");
        a mRemoteService = getMRemoteService();
        Intrinsics.checkNotNull(mRemoteService);
        return mRemoteService.recordDailyRecordToDB(persistKey, sid, itemList);
    }

    public final boolean recordSportReport(@NotNull String sid, @NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        SportDBKey sportDBKey = DataExtKt.toSportDBKey(sportReport, sid);
        if (sportDBKey == null) {
            return false;
        }
        String sid2 = sportReport.getSid();
        Long dbKeyTime = sportReport.getDbKeyTime();
        sportReport.setDbKeyTime(null);
        sportReport.setSid(null);
        if (sportReport.getEntityStartTime() != null && sportReport.getEntityEndTime() != null) {
            Long entityStartTime = sportReport.getEntityStartTime();
            Intrinsics.checkNotNull(entityStartTime);
            sportReport.setStartTime(entityStartTime.longValue());
            Long entityEndTime = sportReport.getEntityEndTime();
            Intrinsics.checkNotNull(entityEndTime);
            sportReport.setEndTime(entityEndTime.longValue());
        }
        String json = FitnessPersistUtils.INSTANCE.toJson(sportReport);
        sportReport.setSid(sid2);
        sportReport.setDbKeyTime(dbKeyTime);
        if (!checkForceRemoteService()) {
            return SportReportDaoUtils.INSTANCE.recordSportReportToDB(sportDBKey, json);
        }
        FitnessLogUtils.i(TAG, "mRemoteService#recordSportReportToDB");
        a mRemoteService = getMRemoteService();
        Intrinsics.checkNotNull(mRemoteService);
        return mRemoteService.recordSportReportToDB(sportDBKey, json);
    }

    public final void startSyncDataToHealthConnect() throws RemoteException {
        a mRemoteService = getMRemoteService();
        if (mRemoteService != null) {
            mRemoteService.startSyncDataToHealthConnect();
        } else {
            Logger.i(TAG, "startSyncDataToHealthConnect with null mRemoteService");
        }
    }
}
