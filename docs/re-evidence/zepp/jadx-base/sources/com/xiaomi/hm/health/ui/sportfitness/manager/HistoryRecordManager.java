package com.xiaomi.hm.health.ui.sportfitness.manager;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.SparseLongArray;
import com.google.gson.reflect.TypeToken;
import com.huami.account.HMLoginManager;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.event.FetchLatestSportRecordFinish;
import com.huami.moving.ui.sport.home.manager.SportStatManager;
import com.huami.moving.ui.utils.SportRecordQueryConstrainUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.webapi.DeleteHistoryRecordAPI;
import com.huami.moving.webapi.GetRunningHistoryRecordAPI;
import com.huami.moving.webapi.GetSportStatAPI;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.moving.webapi.PutRunningSummaryToServer;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareExerClassifyTimesCallback;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.training.utils.ShareTrainingTimesGetter;
import com.xiaomi.hm.health.traininglib.model.TrainingRecordStatInfo;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper;
import com.xiaomi.hm.health.ui.sportfitness.event.EventUpdateStatUI;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatData;
import com.xiaomi.hm.health.ui.sportfitness.utils.ShareSportTimesGetter;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import defpackage.cw1;
import defpackage.f14;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Emitter;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class HistoryRecordManager {
    public static final int DATA_PAGE_LIMIT = 20;
    public static final int TIME_KEY_SPORT = -2;
    public static final int TIME_KEY_TRAINING = -1;
    private static final String h = "HistoryRecordManager";
    private static volatile HistoryRecordManager i;
    private String d;
    private final int a = 3;
    private final int b = 4;
    private final int c = 7;
    private int e = 7;
    private boolean f = false;
    private List<HistoryRecordSyncCallback> g = new ArrayList();

    public interface HistoryRecordSyncCallback {
        void onEnd(int unSyncedCount);

        void onStart();
    }

    public class a extends TypeToken<List<GetSportStatAPI.StatDataEntity>> {
        public a() {
        }
    }

    public class b extends TypeToken<List<GetSportStatAPI.StatDataEntity>> {
        public b() {
        }
    }

    public class c extends TypeToken<List<GetSportStatAPI.StatDataEntity>> {
        public c() {
        }
    }

    public class d implements TrainingHistoryHelper.TrainingHistoryRecordSyncCallback {
        public final /* synthetic */ Emitter a;

        public d(final Emitter val$emitter) {
            this.a = val$emitter;
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
        public void notifySyncBegin(int dataCount) {
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
        public void notifySyncEnd(List<TrainingRecord> failedRecords) {
            this.a.onNext(Integer.valueOf(failedRecords.size()));
            this.a.onCompleted();
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
        public void notifySyncFail(TrainingRecord unSyncedTrainingRecord) {
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.TrainingHistoryRecordSyncCallback
        public void notifySyncSuccess(TrainingRecord syncedTrainingRecord) {
        }
    }

    public class e implements PostRunningDataToServer.IHistoryRecordSyncCallBack {
        public final /* synthetic */ Emitter a;

        public e(final Emitter val$emitter) {
            this.a = val$emitter;
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncBegin(int count) {
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncEnd(@Nullable List<? extends Trackrecord> unSyncedTrackRecords) {
            if (unSyncedTrackRecords != null) {
                this.a.onNext(Integer.valueOf(unSyncedTrackRecords.size()));
            }
            this.a.onCompleted();
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncFail(@NotNull Trackrecord unSyncedTrackRecord) {
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncSuccess(@NotNull Trackrecord syncedTrackRecord) {
        }
    }

    public class f implements PostRunningDataToServer.IHistoryRecordSyncCallBack {
        public final /* synthetic */ Emitter a;

        public f(final Emitter val$emitter) {
            this.a = val$emitter;
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncBegin(int count) {
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncEnd(@Nullable List<? extends Trackrecord> unSyncedTrackRecords) {
            if (unSyncedTrackRecords != null) {
                this.a.onNext(Integer.valueOf(unSyncedTrackRecords.size()));
            }
            this.a.onCompleted();
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncFail(@NotNull Trackrecord unSyncedTrackRecord) {
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncSuccess(@NotNull Trackrecord syncedTrackRecord) {
        }
    }

    public class g extends SingleSubscriber<Integer> {
        public g() {
        }

        private void a(int unSyncedCount) {
            Iterator it2 = HistoryRecordManager.this.g.iterator();
            while (it2.hasNext()) {
                ((HistoryRecordSyncCallback) it2.next()).onEnd(unSyncedCount);
            }
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Integer unSyncedCount) {
            a(unSyncedCount.intValue());
            HistoryRecordManager.this.f = false;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable error) {
            error.printStackTrace();
            a(-1);
            HistoryRecordManager.this.f = false;
        }
    }

    public class h implements DeleteHistoryRecordAPI.DeleteHistoryRecordNotifyListener {
        public final /* synthetic */ Emitter a;

        public h(final Emitter val$emitter) {
            this.a = val$emitter;
        }

        @Override // com.huami.moving.webapi.DeleteHistoryRecordAPI.DeleteHistoryRecordNotifyListener
        public void fetchNetErrorListener(boolean isConnected) {
            this.a.onError(new IllegalStateException("Failed to delete running history record"));
        }

        @Override // com.huami.moving.webapi.DeleteHistoryRecordAPI.DeleteHistoryRecordNotifyListener
        public void fetchTrackRecordSuccessListener(Boolean isDeleteSuccess, long trackid, String source) {
            if (!isDeleteSuccess.booleanValue()) {
                this.a.onError(new IllegalStateException("Failed to delete running history record"));
            } else {
                this.a.onNext(null);
                this.a.onCompleted();
            }
        }
    }

    public class i extends Subscriber<Void> {
        public i() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Void voidParam) {
        }

        @Override // rx.Observer
        public void onCompleted() {
            HMLog.d(HistoryRecordManager.h, "reqLatestExerciseHistoryInRx doOnCompleted", new Object[0]);
            EventBus.getDefault().post(new FetchLatestSportRecordFinish());
            HMKeeper.setReqStatData(true);
        }

        @Override // rx.Observer
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public class j implements ShareExerClassifyTimesCallback {

        public class a extends TypeToken<List<GetSportStatAPI.StatDataEntity>> {
            public a() {
            }
        }

        private j() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:26:0x0055  */
        /* JADX WARN: Code duplicated, block: B:27:0x0059  */
        /* JADX WARN: Code duplicated, block: B:28:0x005d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0061  */
        /* JADX WARN: Code duplicated, block: B:30:0x0064  */
        /* JADX WARN: Code duplicated, block: B:31:0x0067  */
        /* JADX WARN: Code duplicated, block: B:32:0x006a  */
        /* JADX WARN: Code duplicated, block: B:33:0x006d  */
        /* JADX WARN: Code duplicated, block: B:34:0x0070  */
        /* JADX WARN: Code duplicated, block: B:36:0x0076  */
        /* JADX WARN: Code duplicated, block: B:37:0x0079  */
        /* JADX WARN: Code duplicated, block: B:39:0x008e  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
        @Override // com.huami.widget.share.ShareExerClassifyTimesCallback
        public int getExerTimesBySportType(int sportType) {
            if (sportType <= 0) {
                TrainingRecordStatInfo trainingRecordStatInfo = (TrainingRecordStatInfo) Utils.getGson().fromJson(HMKeeper.getExerTrainStatData(), TrainingRecordStatInfo.class);
                if (trainingRecordStatInfo != null && trainingRecordStatInfo.totalCount > 0) {
                    return (int) trainingRecordStatInfo.totalCount;
                }
                return 0;
            }
            List<GetSportStatAPI.StatDataEntity> list = (List) Utils.getGson().fromJson(HMKeeper.getExerSubSportList(), new a().getType());
            String str = "";
            boolean zIsSubSport = SportTypeIdentifier.isSubSport(sportType);
            if (zIsSubSport) {
                sportType -= 1000;
            }
            if (sportType == 1 || sportType == 192) {
                str = "1,8,7,110,192";
            } else if (sportType == 2001) {
                str = "2001";
            } else if (sportType != 25 && sportType != 26) {
                switch (sportType) {
                    case 6:
                        str = "6";
                        break;
                    case 7:
                    case 8:
                        str = "1,8,7,110,192";
                        break;
                    case 9:
                    case 10:
                        str = "9,10";
                        break;
                    default:
                        switch (sportType) {
                            case 12:
                                str = "12";
                                break;
                            case 13:
                                str = "13";
                                break;
                            case 14:
                            case 15:
                                str = "14,15,155,156";
                                break;
                            case 16:
                                str = "16";
                                break;
                            default:
                                switch (sportType) {
                                    case 40:
                                        str = "40,131";
                                        break;
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                        str = "41,42,43,44,45,105,46,125,126,127,128,136,178";
                                        break;
                                    case 47:
                                    case 48:
                                        str = "47,48";
                                        break;
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                        str = "49,50,51,52,53,54,55,57,58,59,60,61,108,109,111,114,130,143,149,150,183,167";
                                        break;
                                    default:
                                        switch (sportType) {
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                                str = "49,50,51,52,53,54,55,57,58,59,60,61,108,109,111,114,130,143,149,150,183,167";
                                                break;
                                            case 62:
                                            case 65:
                                            case 68:
                                                str = "65,68,62,106,123,124,140,141,138,172,139,157";
                                                break;
                                            case 63:
                                            case 64:
                                            case 66:
                                            case 67:
                                            case 69:
                                            case 70:
                                                str = "63,64,66,67,69,70,129,190,137";
                                                break;
                                            case 71:
                                            case 72:
                                            case 73:
                                            case 74:
                                            case 75:
                                                str = "71,72,73,74,75,77,112,113,185,165,186,166,187,168,146";
                                                break;
                                            default:
                                                switch (sportType) {
                                                    case 77:
                                                        str = "71,72,73,74,75,77,112,113,185,165,186,166,187,168,146";
                                                        break;
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                        str = "78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,121,122,188,142,145,151,152,153,154,158,162,164,169,170,171";
                                                        break;
                                                    case 93:
                                                    case 94:
                                                        str = "93,94,132";
                                                        break;
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                        str = "95,96,97,98,99,100,101,102,103,104,147,148";
                                                        break;
                                                    case 105:
                                                        str = "41,42,43,44,45,105,46,125,126,127,128,136,178";
                                                        break;
                                                    case 106:
                                                        str = "65,68,62,106,123,124,140,141,138,172,139,157";
                                                        break;
                                                    default:
                                                        switch (sportType) {
                                                            case 108:
                                                            case 109:
                                                            case 111:
                                                            case 114:
                                                            case 130:
                                                                str = "49,50,51,52,53,54,55,57,58,59,60,61,108,109,111,114,130,143,149,150,183,167";
                                                                break;
                                                            case 110:
                                                                str = "1,8,7,110,192";
                                                                break;
                                                            case 112:
                                                            case 113:
                                                                str = "71,72,73,74,75,77,112,113,185,165,186,166,187,168,146";
                                                                break;
                                                            case 115:
                                                            case 116:
                                                            case 117:
                                                            case 118:
                                                            case 119:
                                                            case 120:
                                                                str = "115,116,117,118,119,120,189,144,159,160,161,163,179";
                                                                break;
                                                            case 121:
                                                            case 122:
                                                                str = "78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,121,122,188,142,145,151,152,153,154,158,162,164,169,170,171";
                                                                break;
                                                            case 123:
                                                            case 124:
                                                                str = "65,68,62,106,123,124,140,141,138,172,139,157";
                                                                break;
                                                            case 125:
                                                            case 126:
                                                            case 127:
                                                            case 128:
                                                                str = "41,42,43,44,45,105,46,125,126,127,128,136,178";
                                                                break;
                                                            case 129:
                                                                str = "63,64,66,67,69,70,129,190,137";
                                                                break;
                                                            case 131:
                                                                str = "40,131";
                                                                break;
                                                            case 132:
                                                                str = "93,94,132";
                                                                break;
                                                            case 133:
                                                                str = "133,180,181,182";
                                                                break;
                                                            default:
                                                                switch (sportType) {
                                                                    case 136:
                                                                    case DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING /* 178 */:
                                                                        str = "41,42,43,44,45,105,46,125,126,127,128,136,178";
                                                                        break;
                                                                    case 137:
                                                                        str = "63,64,66,67,69,70,129,190,137";
                                                                        break;
                                                                    case 138:
                                                                    case 139:
                                                                    case 140:
                                                                    case 141:
                                                                    case 157:
                                                                    case 172:
                                                                        str = "65,68,62,106,123,124,140,141,138,172,139,157";
                                                                        break;
                                                                    case 142:
                                                                    case 145:
                                                                    case 151:
                                                                    case 152:
                                                                    case 153:
                                                                    case 154:
                                                                    case 158:
                                                                    case 162:
                                                                    case 164:
                                                                    case 169:
                                                                    case 170:
                                                                    case 171:
                                                                        str = "78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,121,122,188,142,145,151,152,153,154,158,162,164,169,170,171";
                                                                        break;
                                                                    case 143:
                                                                    case 149:
                                                                    case 150:
                                                                    case 167:
                                                                    case 183:
                                                                        str = "49,50,51,52,53,54,55,57,58,59,60,61,108,109,111,114,130,143,149,150,183,167";
                                                                        break;
                                                                    case 144:
                                                                    case 159:
                                                                    case 160:
                                                                    case 161:
                                                                    case 163:
                                                                    case DataTypeSource.SPORT_TYPE_SHOOT /* 179 */:
                                                                        str = "115,116,117,118,119,120,189,144,159,160,161,163,179";
                                                                        break;
                                                                    case 146:
                                                                    case 165:
                                                                    case 166:
                                                                    case 168:
                                                                        str = "71,72,73,74,75,77,112,113,185,165,186,166,187,168,146";
                                                                        break;
                                                                    case 147:
                                                                    case 148:
                                                                        str = "95,96,97,98,99,100,101,102,103,104,147,148";
                                                                        break;
                                                                    case 155:
                                                                    case 156:
                                                                        str = "14,15,155,156";
                                                                        break;
                                                                    case DataTypeSource.SPORT_TYPE_CHESS /* 173 */:
                                                                    case DataTypeSource.SPORT_TYPE_CHECKERS /* 174 */:
                                                                    case 175:
                                                                    case DataTypeSource.SPORT_TYPE_BRIDGE /* 176 */:
                                                                    case 177:
                                                                        str = "173,174,175,176,177";
                                                                        break;
                                                                    case 180:
                                                                    case DataTypeSource.SPORT_TYPE_DOWNHILL /* 181 */:
                                                                    case DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING /* 182 */:
                                                                        str = "133,180,181,182";
                                                                        break;
                                                                    default:
                                                                        switch (sportType) {
                                                                            case DataTypeSource.SPORT_TYPE_MODERN_DANCE /* 185 */:
                                                                            case DataTypeSource.SPORT_TYPE_DISCO /* 186 */:
                                                                            case DataTypeSource.SPORT_TYPE_TAP_DANCE /* 187 */:
                                                                                str = "71,72,73,74,75,77,112,113,185,165,186,166,187,168,146";
                                                                                break;
                                                                            case 188:
                                                                                str = "78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,121,122,188,142,145,151,152,153,154,158,162,164,169,170,171";
                                                                                break;
                                                                            case 189:
                                                                                str = "115,116,117,118,119,120,189,144,159,160,161,163,179";
                                                                                break;
                                                                            case 190:
                                                                                str = "63,64,66,67,69,70,129,190,137";
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                str = "1,8,7,110,192";
            }
            if (TextUtils.isEmpty(str) || list == null) {
                return 0;
            }
            int i = 0;
            for (GetSportStatAPI.StatDataEntity statDataEntity : list) {
                for (String str2 : str.split(",")) {
                    int i2 = Integer.parseInt(str2);
                    if (zIsSubSport) {
                        i2 += 1000;
                    }
                    if (i2 == statDataEntity.sportType) {
                        i += statDataEntity.count;
                    }
                }
            }
            return i;
        }
    }

    private HistoryRecordManager() {
        j jVar = new j();
        ShareSportTimesGetter.getInstance().setClient(jVar);
        ShareTrainingTimesGetter.getInstance().setClient(jVar);
    }

    private String A(long timeInMillis) {
        return TimeUtils.formatDate("yyyy/MM/dd-HH:mm:ss", new Date(timeInMillis));
    }

    private Observable<ExerciseStatData> B() {
        return Observable.zip(Observable.fromCallable(new Callable() { // from class: o14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return HistoryRecordManager.P();
            }
        }), Observable.fromCallable(new Callable() { // from class: v04
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Q();
            }
        }), new f14(this)).subscribeOn(Schedulers.io());
    }

    @SuppressLint({"UseSparseArrays"})
    private SparseLongArray C(SparseLongArray timeMap) {
        if (timeMap != null) {
            return timeMap;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        long jCurrentTimeMillis = System.currentTimeMillis();
        sparseLongArray.put(-1, jCurrentTimeMillis);
        sparseLongArray.put(-2, jCurrentTimeMillis);
        return sparseLongArray;
    }

    private void D(ExerciseStatData statData) {
        HMKeeper.setExerStatData(Utils.getGson().toJson(statData));
    }

    private void E(List<GetSportStatAPI.StatDataEntity> list) {
        HMKeeper.setExerSubSportList(Utils.getGson().toJson(list));
    }

    private void F(TrainingRecordStatInfo statData) {
        HMKeeper.setExerTrainStatData(Utils.getGson().toJson(statData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(long j2, HistoryRecord historyRecord, String str, Emitter emitter) {
        if (TrackRecordManager.getInstance().getTrackRecordById(j2, historyRecord.getSource().intValue()).getState().intValue() > SyncedState.STATE_UNSYNCED.getValue()) {
            DeleteHistoryRecordAPI.deleteHistoryRecord(j2, str, new h(emitter));
        } else {
            emitter.onNext(null);
            emitter.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(long j2, String str, Void r3) {
        TrackRecordManager.getInstance().deleteLocalRunningHistoryRecord(j2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long I() throws Exception {
        if ((this.e & 4) == 4) {
            return Long.valueOf(TrackRecordManager.getInstance().getAllTrackRecordsCount());
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long J() throws Exception {
        if ((this.e & 3) == 3) {
            return Long.valueOf(isOverSea() ? 0L : TrainingHistoryHelper.getInstance().queryAllTrainingHistoryRecordCount());
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long K(Long l, Long l2) {
        return Long.valueOf(l.longValue() + l2.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long L(Long l, Long l2, Long l3) {
        return Long.valueOf(l.longValue() + l2.longValue() + l3.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long M() throws Exception {
        return Long.valueOf(TrackRecordManager.getInstance().getUnSyncedTrackRecordsCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long N() throws Exception {
        return Long.valueOf(isOverSea() ? 0L : TrainingHistoryHelper.getInstance().queryUnSyncedTrainingHistoryRecordCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long O() throws Exception {
        return Long.valueOf(TrackRecordManager.getInstance().getSyncAgainTrackRecordsCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ GetSportStatAPI.StatDataEntity P() throws Exception {
        return SportStatManager.getInstance().getRecordsStatInfo(null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TrainingRecordStatInfo Q() throws Exception {
        return isOverSea() ? new TrainingRecordStatInfo() : TrainingDBUtils.getRecordsStatInfo(null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExerciseStatData R() throws Exception {
        if (HMKeeper.getExerStatData().isEmpty()) {
            return null;
        }
        return (ExerciseStatData) Utils.getGson().fromJson(HMKeeper.getExerStatData(), ExerciseStatData.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean S(ExerciseStatData exerciseStatData) {
        return Boolean.valueOf(exerciseStatData != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            HistoryRecord historyRecord = (HistoryRecord) list.get(i2);
            HMLog.d(h, "从本地查询运动和训练历史数据 ->[" + i2 + "] " + historyRecord, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean U(List list) {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean V(Throwable th) {
        th.printStackTrace();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean W(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void X(Void r1, TrainingRecord trainingRecord) {
        HMLog.d(h, "reqLatestExerciseHistoryInRx", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Emitter emitter) {
        TrainingHistoryHelper.getInstance().syncAllUnSyncedTrainingHistoryRecord(new d(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(Emitter emitter) {
        PostRunningDataToServer.postRunningData(new e(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(Emitter emitter) {
        PutRunningSummaryToServer.putRunSummary(new f(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer b0(Integer num, Integer num2, Integer num3) {
        return Integer.valueOf(num.intValue() + num2.intValue() + num3.intValue());
    }

    private Observable<List<HistoryRecord>> c0(Long startTime, Long endTime, SparseLongArray timeMap) {
        String str = h;
        StringBuilder sb = new StringBuilder();
        sb.append("从本地查询运动和训练历史数据 -> startTime:");
        sb.append(startTime != null ? A(startTime.longValue()) : null);
        sb.append(", endTime:");
        sb.append(endTime != null ? A(endTime.longValue()) : null);
        HMLog.d(str, sb.toString(), new Object[0]);
        SparseLongArray sparseLongArrayC = C(timeMap);
        ArrayList arrayList = new ArrayList();
        if ((this.e & 3) == 3) {
            arrayList.add(e0(startTime, endTime, Long.valueOf(sparseLongArrayC.get(-1))));
        }
        if ((this.e & 4) == 4) {
            arrayList.add(d0(startTime, endTime, Long.valueOf(sparseLongArrayC.get(-2))));
        }
        return Observable.merge(arrayList).toSortedList(cw1.a).subscribeOn(Schedulers.io()).doOnNext(new Action1() { // from class: z04
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HistoryRecordManager.T((List) obj);
            }
        });
    }

    private Observable<HistoryRecord> d0(Long startTime, Long endTime, Long runningSyncTime) {
        return TrackRecordManager.getInstance().loadLocalTrackRecordsInRx(startTime, endTime, runningSyncTime, 20).map(new Func1() { // from class: a14
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HistoryRecord.convertTrackRecord((Trackrecord) obj);
            }
        });
    }

    private Observable<HistoryRecord> e0(Long startTime, Long endTime, Long trainingSyncTime) {
        if (isOverSea()) {
            return Observable.from(new ArrayList());
        }
        boolean z = (startTime == null || endTime == null) ? false : true;
        if (trainingSyncTime == null) {
            trainingSyncTime = Long.valueOf(System.currentTimeMillis());
        }
        return (z ? TrainingHistoryHelper.getInstance().loadTrainingHistoryListFromLocalByTimeRange(startTime, endTime) : TrainingHistoryHelper.getInstance().loadTrainingHistoryListFromLocalBySyncTime(trainingSyncTime, 20)).map(new Func1() { // from class: b14
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HistoryRecord.convertTrainingRecord((TrainingRecord) obj);
            }
        });
    }

    private Observable<Boolean> f0(Long startTime, Long endTime, SparseLongArray timeMap, SimpleDateFormat dateFormat) {
        Observable observableJust;
        String str;
        String str2 = h;
        StringBuilder sb = new StringBuilder();
        sb.append("从网络请求运动和训练历史数据 -> startTime:");
        String str3 = null;
        sb.append(startTime != null ? A(startTime.longValue()) : null);
        sb.append(", endTime:");
        sb.append(endTime != null ? A(endTime.longValue()) : null);
        boolean z = false;
        HMLog.d(str2, sb.toString(), new Object[0]);
        if (startTime != null && endTime != null) {
            z = true;
        }
        SparseLongArray sparseLongArrayC = C(timeMap);
        if (isOverSea() || this.e == 4) {
            observableJust = Observable.just(Boolean.TRUE);
        } else {
            observableJust = (z ? TrainingHistoryHelper.getInstance().loadTrainingHistoryListFromWebByTimeRange(startTime, endTime) : TrainingHistoryHelper.getInstance().loadTrainingHistoryListFromWebBySyncTime(Long.valueOf(sparseLongArrayC.get(-1)), 20)).map(new Func1() { // from class: e14
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return HistoryRecordManager.U((List) obj);
                }
            }).onErrorReturn(new Func1() { // from class: d14
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return HistoryRecordManager.V((Throwable) obj);
                }
            });
        }
        if (z) {
            str3 = dateFormat.format(new Date(startTime.longValue()));
            str = dateFormat.format(new Date(endTime.longValue()));
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.e != 3) {
            if (z) {
                arrayList.add(GetRunningHistoryRecordAPI.loadRunningHistoryRecordInRxByTimeRange(str3, str));
            } else {
                arrayList.add(GetRunningHistoryRecordAPI.loadRunningHistoryRecordInRxBySyncTime(sparseLongArrayC.get(-2), 20));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            observableJust = observableJust.zipWith((Observable) it2.next(), new Func2() { // from class: h14
                @Override // rx.functions.Func2
                public final Object call(Object obj, Object obj2) {
                    return HistoryRecordManager.W((Boolean) obj, (Boolean) obj2);
                }
            });
        }
        return observableJust.observeOn(AndroidSchedulers.mainThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ExerciseStatData g0(GetSportStatAPI.StatDataEntity sportStatData, TrainingRecordStatInfo trainingStatData) {
        ExerciseStatData exerciseStatData = new ExerciseStatData();
        exerciseStatData.totalDistance = sportStatData.distance;
        exerciseStatData.totalCostTime = ((long) sportStatData.costTime) + (trainingStatData.totalDuration / 1000);
        exerciseStatData.totalExerciseCount = ((long) sportStatData.count) + trainingStatData.totalCount;
        exerciseStatData.totalCalorie = sportStatData.calorie + trainingStatData.totalConsumption;
        D(exerciseStatData);
        E(sportStatData.subStatList);
        F(trainingStatData);
        return exerciseStatData;
    }

    public static HistoryRecordManager getInstance() {
        if (i == null) {
            synchronized (HistoryRecordManager.class) {
                if (i == null) {
                    i = new HistoryRecordManager();
                }
            }
        }
        return i;
    }

    private List<GetSportStatAPI.StatDataEntity> h0(List<GetSportStatAPI.StatDataEntity> subList, Trackrecord record) {
        if (subList == null) {
            subList = new ArrayList<>();
        }
        boolean z = false;
        for (GetSportStatAPI.StatDataEntity statDataEntity : subList) {
            if (statDataEntity.sportType == record.getType().intValue()) {
                statDataEntity.costTime += record.getCosttime().intValue();
                statDataEntity.distance += record.getDistance().intValue();
                statDataEntity.calorie += record.getCal().intValue();
                statDataEntity.count++;
                z = true;
                break;
            }
        }
        if (!z) {
            GetSportStatAPI.StatDataEntity statDataEntity2 = new GetSportStatAPI.StatDataEntity();
            statDataEntity2.sportType = record.getType().intValue();
            statDataEntity2.costTime = record.getCosttime().intValue();
            statDataEntity2.distance = record.getDistance().intValue();
            statDataEntity2.calorie = record.getCal().intValue();
            statDataEntity2.count++;
            subList.add(statDataEntity2);
        }
        return subList;
    }

    public void addSyncCallback(HistoryRecordSyncCallback callback) {
        this.g.add(callback);
    }

    public Observable<Void> deleteRunningHistoryRecord(final HistoryRecord historyRecord) {
        final long jLongValue = historyRecord.getTrackid().longValue();
        final String sourceByValue = DataTypeSource.RunSource.getSourceByValue(historyRecord.getSource().intValue());
        return Observable.create(new Action1() { // from class: y04
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.G(jLongValue, historyRecord, sourceByValue, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER).observeOn(Schedulers.io()).doOnNext(new Action1() { // from class: s14
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HistoryRecordManager.H(jLongValue, sourceByValue, (Void) obj);
            }
        });
    }

    public Observable<Long> getAllLocalHistoryRecordCountInRx() {
        return Observable.zip(Observable.fromCallable(new Callable() { // from class: m14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.I();
            }
        }), Observable.fromCallable(new Callable() { // from class: g14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.J();
            }
        }), new Func2() { // from class: i14
            @Override // rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return HistoryRecordManager.K((Long) obj, (Long) obj2);
            }
        }).subscribeOn(Schedulers.io());
    }

    public Observable<Long> getAllUnSyncedHistoryRecordCountInRx() {
        return Observable.zip(Observable.fromCallable(new Callable() { // from class: q14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return HistoryRecordManager.M();
            }
        }), Observable.fromCallable(new Callable() { // from class: n14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.N();
            }
        }), Observable.fromCallable(new Callable() { // from class: r14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return HistoryRecordManager.O();
            }
        }), new Func3() { // from class: l14
            @Override // rx.functions.Func3
            public final Object call(Object obj, Object obj2, Object obj3) {
                return HistoryRecordManager.L((Long) obj, (Long) obj2, (Long) obj3);
            }
        }).subscribeOn(Schedulers.io());
    }

    public String getExerTypes() {
        return this.d;
    }

    public Trackrecord getLatestTrackRecord() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        Property property = TrackrecordDao.Properties.State;
        WhereCondition whereConditionNotEq = property.notEq(Integer.valueOf(SyncedState.SYNC_STATE_DEFAULT.getValue()));
        Property property2 = TrackrecordDao.Properties.Trackid;
        List<Trackrecord> list = queryBuilder.where(whereConditionNotEq, property.notEq(Integer.valueOf(SyncedState.STATE_TO_BE_DELETED.getValue())), property.notEq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), SportRecordQueryConstrainUtils.querySportRecordBySportType(), property2.le(Long.valueOf(jCurrentTimeMillis))).orderDesc(property2).limit(1).list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return TrackRecordManager.getInstance().parseOriginalJsonData2Trackrecord(list.get(0));
    }

    public Trackrecord getLineTrackRecord(long trackId) {
        return GetRunningHistoryRecordAPI.fetchLineRecordById(trackId, String.valueOf(0));
    }

    public long getLocalHistoryRecordCountByTimeRange(long startTime, long endTime) {
        return (((this.e & 3) != 3 || isOverSea()) ? 0L : TrainingHistoryHelper.getInstance().queryTrainingHistoryRecordCountByTimeRange(startTime, endTime)) + ((this.e & 4) == 4 ? TrackRecordManager.getInstance().getTrackRecordsCountByTimeRange(startTime, endTime) : 0L);
    }

    public Observable<ExerciseStatData> getLocalStatInfoUseCacheInRx() {
        return Observable.concat(Observable.fromCallable(new Callable() { // from class: p14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return HistoryRecordManager.R();
            }
        }).subscribeOn(Schedulers.io()), B()).takeFirst(new Func1() { // from class: c14
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HistoryRecordManager.S((ExerciseStatData) obj);
            }
        });
    }

    public Observable<ExerciseStatData> getStatInfoInRx() {
        return Observable.zip(GetSportStatAPI.getAllRecordsStatInfoInRx(), isOverSea() ? Observable.just(new TrainingRecordStatInfo()) : TrainingHistoryHelper.getInstance().getAllRecordsStatInfoInRx(), new f14(this)).subscribeOn(Schedulers.io());
    }

    public boolean isOverSea() {
        return (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) ? false : true;
    }

    public boolean isSyncingRecords() {
        return this.f;
    }

    public Observable<List<HistoryRecord>> loadLocalDataBySyncTimeInRx(SparseLongArray timeMap) {
        return c0(null, null, timeMap);
    }

    public Observable<List<HistoryRecord>> loadLocalDataByTimeRangeInRx(Long startTime, Long endTime) {
        return c0(startTime, endTime, null);
    }

    public Observable<Boolean> loadWebDataBySyncTimeInRx(SparseLongArray timeMap) {
        return f0(null, null, timeMap, null);
    }

    public Observable<Boolean> loadWebDataByTimeRangeInRx(Long startTime, Long endTime, SimpleDateFormat dateFormat) {
        return f0(startTime, endTime, null, dateFormat);
    }

    public HistoryRecord queryLatestExerciseHistory() {
        char c2;
        Trackrecord latestTrackRecord = getLatestTrackRecord();
        TrainingRecord trainingRecordQueryLatestTrainingRecord = isOverSea() ? null : TrainingHistoryHelper.getInstance().queryLatestTrainingRecord();
        if (latestTrackRecord != null) {
            c2 = trainingRecordQueryLatestTrainingRecord != null ? (char) 3 : (char) 1;
        } else {
            c2 = trainingRecordQueryLatestTrainingRecord != null ? (char) 2 : (char) 0;
        }
        if (c2 == 1) {
            return HistoryRecord.convertTrackRecord(latestTrackRecord);
        }
        if (c2 == 2) {
            return HistoryRecord.convertTrainingRecord(trainingRecordQueryLatestTrainingRecord);
        }
        if (c2 != 3) {
            return null;
        }
        return latestTrackRecord.getTrackid().longValue() * 1000 < trainingRecordQueryLatestTrainingRecord.getStartTime().longValue() ? HistoryRecord.convertTrainingRecord(trainingRecordQueryLatestTrainingRecord) : HistoryRecord.convertTrackRecord(latestTrackRecord);
    }

    public void removeSyncCallback(HistoryRecordSyncCallback callback) {
        this.g.remove(callback);
    }

    public void reqLatestExerciseHistoryInRx() {
        Observable.zip(GetRunningHistoryRecordAPI.fetchLatestSportRecordInRx(), isOverSea() ? Observable.just(null) : TrainingHistoryHelper.getInstance().loadLatestTrainingRecordFromWeb(), new Func2() { // from class: j14
            @Override // rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return HistoryRecordManager.X((Void) obj, (TrainingRecord) obj2);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe((Subscriber) new i());
    }

    public void reset() {
        setExerTypes(String.valueOf(0));
    }

    public void setExerTypes(String exerTypes) {
        this.d = exerTypes;
        if (exerTypes.equals(String.valueOf(-1))) {
            this.e = 3;
        } else if (this.d.equals(String.valueOf(0))) {
            this.e = 7;
        } else {
            this.e = 4;
        }
        int i2 = this.e;
        if (i2 == 4) {
            TrackRecordManager.getInstance().setContionSportTypes(this.d);
            GetRunningHistoryRecordAPI.setQueryType(this.d);
        } else if (i2 == 7) {
            TrackRecordManager.getInstance().setContionSportTypes("");
            GetRunningHistoryRecordAPI.setQueryType(this.d);
        }
    }

    public ExerciseStatData updateStatDataWhenDelete(HistoryRecord record) {
        ExerciseStatData exerciseStatData;
        try {
            exerciseStatData = (ExerciseStatData) Utils.getGson().fromJson(HMKeeper.getExerStatData(), ExerciseStatData.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            exerciseStatData = null;
        }
        if (exerciseStatData != null && record != null) {
            exerciseStatData.totalCostTime -= record.getConsumeTime();
            exerciseStatData.totalDistance -= record.isTraining() ? 0.0f : record.getDistance().intValue();
            exerciseStatData.totalCalorie -= record.getConsumeCal();
            exerciseStatData.totalExerciseCount--;
            D(exerciseStatData);
            if (record.isTraining()) {
                TrainingRecordStatInfo trainingRecordStatInfo = (TrainingRecordStatInfo) Utils.getGson().fromJson(HMKeeper.getExerTrainStatData(), TrainingRecordStatInfo.class);
                trainingRecordStatInfo.totalDuration -= record.getConsumeTime() * 1000;
                trainingRecordStatInfo.totalCount--;
                F(trainingRecordStatInfo);
            } else {
                List<GetSportStatAPI.StatDataEntity> list = (List) Utils.getGson().fromJson(HMKeeper.getExerSubSportList(), new a().getType());
                if (list != null) {
                    Iterator<GetSportStatAPI.StatDataEntity> it2 = list.iterator();
                    while (it2.hasNext()) {
                        GetSportStatAPI.StatDataEntity next = it2.next();
                        if (next.sportType == record.getType().intValue()) {
                            next.costTime = (int) (((long) next.costTime) - record.getConsumeTime());
                            next.distance -= record.getDistance().intValue();
                            next.calorie -= record.getCal().intValue();
                            int i2 = next.count - 1;
                            next.count = i2;
                            if (i2 == 0) {
                                it2.remove();
                                break;
                            }
                        }
                    }
                    E(list);
                }
            }
        }
        return exerciseStatData;
    }

    public ExerciseStatData updateTrackRecordToStatData(long trackid, int source) {
        ExerciseStatData exerciseStatData;
        Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(trackid, source);
        try {
            exerciseStatData = (ExerciseStatData) Utils.getGson().fromJson(HMKeeper.getExerStatData(), ExerciseStatData.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            exerciseStatData = null;
        }
        if (exerciseStatData != null && trackRecordById != null) {
            exerciseStatData.totalCostTime += (long) trackRecordById.getCosttime().intValue();
            exerciseStatData.totalDistance += trackRecordById.getDistance().intValue();
            exerciseStatData.totalCalorie += trackRecordById.getCal().intValue();
            exerciseStatData.totalExerciseCount++;
            D(exerciseStatData);
            E(h0((List) Utils.getGson().fromJson(HMKeeper.getExerSubSportList(), new b().getType()), trackRecordById));
        }
        return exerciseStatData;
    }

    public void updateTrackRecordsToStatData(List<Trackrecord> trackrecords) {
        ExerciseStatData exerciseStatData;
        if (HMKeeper.getExerStatData().isEmpty()) {
            exerciseStatData = new ExerciseStatData();
        } else {
            try {
                exerciseStatData = (ExerciseStatData) Utils.getGson().fromJson(HMKeeper.getExerStatData(), ExerciseStatData.class);
            } catch (Exception e2) {
                e2.printStackTrace();
                exerciseStatData = null;
            }
        }
        if (exerciseStatData == null || trackrecords == null) {
            return;
        }
        List<GetSportStatAPI.StatDataEntity> list = (List) Utils.getGson().fromJson(HMKeeper.getExerSubSportList(), new c().getType());
        for (Trackrecord trackrecord : trackrecords) {
            if (trackrecord.getSynced().intValue() != SyncedState.STATE_UNKNOW.getValue()) {
                exerciseStatData.totalCostTime += (long) trackrecord.getCosttime().intValue();
                exerciseStatData.totalDistance += trackrecord.getDistance().intValue();
                exerciseStatData.totalCalorie += trackrecord.getCal().intValue();
                exerciseStatData.totalExerciseCount++;
                h0(list, trackrecord);
            }
        }
        D(exerciseStatData);
        E(list);
        EventBus.getDefault().post(new EventUpdateStatUI(exerciseStatData));
    }

    public ExerciseStatData updateTrainingRecordToStatData(TrainingRecord record) {
        ExerciseStatData exerciseStatData;
        try {
            exerciseStatData = (ExerciseStatData) Utils.getGson().fromJson(HMKeeper.getExerStatData(), ExerciseStatData.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            exerciseStatData = null;
        }
        if (exerciseStatData != null && record != null) {
            exerciseStatData.totalCostTime += record.getDuration().longValue() / 1000;
            exerciseStatData.totalCalorie += record.getConsumption().intValue();
            exerciseStatData.totalExerciseCount++;
            D(exerciseStatData);
            TrainingRecordStatInfo trainingRecordStatInfo = (TrainingRecordStatInfo) Utils.getGson().fromJson(HMKeeper.getExerTrainStatData(), TrainingRecordStatInfo.class);
            if (trainingRecordStatInfo == null) {
                trainingRecordStatInfo = new TrainingRecordStatInfo();
            }
            trainingRecordStatInfo.totalDuration += record.getDuration().longValue();
            trainingRecordStatInfo.totalCount++;
            F(trainingRecordStatInfo);
        }
        return exerciseStatData;
    }

    public void uploadAllUnsyncedRecords() {
        if (this.f) {
            return;
        }
        this.f = true;
        Iterator<HistoryRecordSyncCallback> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().onStart();
        }
        Action1 action1 = new Action1() { // from class: w04
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.Y((Emitter) obj);
            }
        };
        Emitter.BackpressureMode backpressureMode = Emitter.BackpressureMode.LATEST;
        Observable.zip(Observable.create(action1, backpressureMode), Observable.create(new Action1() { // from class: x04
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.Z((Emitter) obj);
            }
        }, backpressureMode), Observable.create(new Action1() { // from class: t14
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.a0((Emitter) obj);
            }
        }, backpressureMode), new Func3() { // from class: k14
            @Override // rx.functions.Func3
            public final Object call(Object obj, Object obj2, Object obj3) {
                return HistoryRecordManager.b0((Integer) obj, (Integer) obj2, (Integer) obj3);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new g());
    }
}
