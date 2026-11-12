package com.xiaomi.hm.health.running;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.StringRes;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.sport.ui.activity.SportDetailPageActivity;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.webapi.GetRunningHistoryRecordAPI;
import com.huami.moving.webapi.GetTrackDataAPI;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.heartrate.reserve.HRReserveHelper;
import com.huami.watch.companion.heartrate.reserve.bean.HeartRateReserveInfo;
import com.huami.watch.companion.sport.helper.SportDetailNavigate;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.running.SportDetailPageNavigator;
import com.xiaomi.hm.health.training.ui.activity.TrainingHistoryActivity;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseDeviceIdentifier;
import com.xiaomi.hm.health.ui.sportfitness.utils.SportUseGaodeMapChecker;
import com.xiaomi.hm.health.ui.sportfitness.utils.TriathlonChildSportUtil;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkShareDataUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b@\u00104J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0002J(\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J8\u0010!\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J?\u0010&\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J0\u0010)\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J2\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0016\u0010-\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010.\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010?\u001a\n <*\u0004\u0018\u00010\u00120\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/xiaomi/hm/health/running/SportDetailPageNavigator;", "Lcom/huami/watch/companion/sport/helper/SportDetailNavigate;", "", "msg", "", "v", "r", hl.k, "Lcom/huami/sport/service/model/HistoryRecord;", "historyRecord", "Landroid/app/Activity;", "belongActivity", SOAP.XMLNS, "u", "record", z.j, "", "trackId", "", "source", "cf", "g", "sourceValue", "", GoogleApiAvailabilityLight.b, "t", "f", "deviceSource", "runType", "o", "type", "isGaodeMap", SportDetailPageActivity.HAS_TRACK, DTransferConstants.SEARCH_KEY, "", "", "childs", "sportType", "l", "(J[[JIILjava/lang/String;)V", "childJson", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "naviSportDetailPage", "jump2DetailPage", "jump2DetailPageForTreadmill", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "c", "Landroid/app/Activity;", "activity", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "TAG", "<init>", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportDetailPageNavigator implements SportDetailNavigate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Activity activity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String TAG = SportDetailPageNavigator.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get summary failed";
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
            return "";
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
            return "empty source";
        }
    }

    public SportDetailPageNavigator(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(long trackId, int deviceSource, int runType, String childJson, String cf) {
        long[][] jArrAnaChildSport = TriathlonChildSportUtil.anaChildSport(childJson);
        if (jArrAnaChildSport == null) {
            return;
        }
        GetTrackDataAPI.getSubSportsDetailData(jArrAnaChildSport[0], DataTypeSource.RunSource.getSourceByValue(deviceSource), jArrAnaChildSport[1]).subscribe((Subscriber<? super Trackdata>) new SportDetailPageNavigator$batchRequestChildDetail$1(this, trackId, jArrAnaChildSport, deviceSource, runType, cf));
    }

    private final void f(final HistoryRecord record) {
        v(R.string.running_history_progress_loading);
        t(record);
        final long jLongValue = record.getTrackid().longValue();
        final int iIntValue = record.getSource().intValue();
        final int iIntValue2 = record.getType().intValue();
        final String childListJson = record.getChildListJson();
        if (!TrackRecordManager.getInstance().hasExistedTrackData(jLongValue, iIntValue)) {
            if (NetUtil.isNetworkConnected(this.context)) {
                GetTrackDataAPI.getRunningTrackData(jLongValue, DataTypeSource.RunSource.getSourceByValue(iIntValue), new GetTrackDataAPI.TrackdataNotifyListener() { // from class: com.xiaomi.hm.health.running.SportDetailPageNavigator$checkEnterSingleOrComplexDetailPage$1
                    @Override // com.huami.moving.webapi.GetTrackDataAPI.TrackdataNotifyListener
                    public void fetchNetErrorListener() {
                        this.r();
                        IconToast.showError(this.getContext(), this.getContext().getString(R.string.network_request_fail));
                    }

                    @Override // com.huami.moving.webapi.GetTrackDataAPI.TrackdataNotifyListener
                    public void fetchTrackRecordSuccessListener(@NotNull Trackdata trackdata) {
                        TrackRecordManager.getInstance().insertDetailIfNotExist(trackdata);
                        if (SportTypeIdentifier.isComplexSport(iIntValue2)) {
                            this.e(jLongValue, iIntValue, iIntValue2, childListJson, record.getCf());
                        } else {
                            this.o(trackdata.getTrackid().longValue(), trackdata.getSource().intValue(), trackdata.getType().intValue(), record.getCf());
                        }
                    }
                }, iIntValue2);
                return;
            }
            r();
            Context context = this.context;
            IconToast.showError(context, context.getString(R.string.no_network_connection));
            return;
        }
        if (!SportTypeIdentifier.isComplexSport(iIntValue2)) {
            o(jLongValue, iIntValue, iIntValue2, record.getCf());
            return;
        }
        long[][] jArrAnaChildSport = TriathlonChildSportUtil.anaChildSport(childListJson);
        if (jArrAnaChildSport != null) {
            int i = 0;
            long[] jArr = jArrAnaChildSport[0];
            int length = jArr.length;
            while (i < length) {
                long j = jArr[i];
                i++;
                if (TrackRecordManager.getInstance().hasExistedTrackData(j, iIntValue)) {
                    e(jLongValue, iIntValue, iIntValue2, childListJson, record.getCf());
                    return;
                }
            }
            l(jLongValue, jArrAnaChildSport, iIntValue, iIntValue2, record.getCf());
        }
    }

    private final void g(final long trackId, String source, final String cf) {
        v(R.string.running_history_progress_loading);
        final int valueBySource = DataTypeSource.RunSource.getValueBySource(source);
        if (n(trackId, valueBySource, cf)) {
            return;
        }
        GetRunningHistoryRecordAPI.fetchSpecificSportRecordInRx(trackId, valueBySource).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: l97
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportDetailPageNavigator.h(this.a, trackId, valueBySource, cf, (Boolean) obj);
            }
        }, new Action1() { // from class: m97
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportDetailPageNavigator.i((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SportDetailPageNavigator sportDetailPageNavigator, long j, int i, String str, Boolean bool) {
        if (!bool.booleanValue()) {
            HMLog.error$default("SportDetailPageNavigator", null, null, a.a, 6, null);
            sportDetailPageNavigator.k();
            IconToast.showError(sportDetailPageNavigator.getContext(), sportDetailPageNavigator.getContext().getString(R.string.network_request_fail));
        } else {
            if (sportDetailPageNavigator.n(j, i, str)) {
                return;
            }
            sportDetailPageNavigator.k();
            IconToast.showError(sportDetailPageNavigator.getContext(), sportDetailPageNavigator.getContext().getString(R.string.sport_record_deleted_tip));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    private final void j(HistoryRecord record) {
        final long trainingId = record.getTrainingId();
        final long trainingStartTime = record.getTrainingStartTime();
        long trainingCreateTime = record.getTrainingCreateTime();
        if (Intrinsics.areEqual("EXCELLENT_COURSE", record.getTrainingType())) {
            TrainingInjection.get().getNavigationController().navigateToFeaturedCourseDetail(this.context, String.valueOf(trainingId));
            return;
        }
        if (TrainingHistoryHelper.getInstance().checkLocalTrainingHistoryDetailDataIsValid(trainingId, trainingStartTime)) {
            Activity activity = this.activity;
            if (activity == null) {
                return;
            }
            TrainingHistoryActivity.launch(activity, trainingId, trainingStartTime);
            return;
        }
        if (NetUtil.isNetworkConnected(this.context)) {
            v(R.string.running_history_progress_loading);
            TrainingHistoryHelper.getInstance().loadTrainingHistoryDetailFromWeb(trainingId, trainingStartTime, trainingCreateTime).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new SingleSubscriber<TrainingRecord>() { // from class: com.xiaomi.hm.health.running.SportDetailPageNavigator$checkTrainingHistoryDetailDataThenEnterDetailPage$2
                @Override // rx.SingleSubscriber
                public void onError(@NotNull Throwable throwable) {
                    throwable.printStackTrace();
                    this.b.r();
                    IconToast.showError(this.b.getContext(), this.b.getContext().getString(R.string.network_request_fail));
                }

                @Override // rx.SingleSubscriber
                public void onSuccess(@NotNull TrainingRecord webTrainingRecord) {
                    this.b.r();
                    Activity activity2 = this.b.activity;
                    if (activity2 == null) {
                        return;
                    }
                    TrainingHistoryActivity.launch(activity2, trainingId, trainingStartTime);
                }
            });
        } else {
            Context context = this.context;
            IconToast.showError(context, context.getString(R.string.no_network_connection));
        }
    }

    private final void k() {
        r();
        this.loadingDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final long trackId, final long[][] childs, final int deviceSource, final int sportType, final String cf) {
        Observable.fromCallable(new Callable() { // from class: k97
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SportDetailPageNavigator.m(childs, deviceSource);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new SingleSubscriber<ParsedSportDetailData>() { // from class: com.xiaomi.hm.health.running.SportDetailPageNavigator$getChildsDetailThenGoToComplexPage$2
            @Override // rx.SingleSubscriber
            public void onError(@NotNull Throwable error) {
                error.printStackTrace();
                this.b.r();
                IconToast.showError(this.b.getContext(), this.b.getContext().getString(R.string.network_request_fail));
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(@NotNull ParsedSportDetailData parsedSportDetailData) {
                this.b.r();
                boolean z = !parsedSportDetailData.getPointLocationList().isEmpty();
                SportDetailPageNavigator sportDetailPageNavigator = this.b;
                sportDetailPageNavigator.q(trackId, deviceSource, sportType, SportUseGaodeMapChecker.INSTANCE.checkUseGaodeMap(sportDetailPageNavigator.getContext()), z, cf);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParsedSportDetailData m(long[][] jArr, int i) {
        return TrackDataManager.getInstance().getTrackData(jArr[0][0], i, (int) jArr[1][0]);
    }

    private final boolean n(long trackId, int sourceValue, String cf) {
        Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(trackId, sourceValue);
        if (trackRecordById == null) {
            return false;
        }
        HistoryRecord historyRecordConvertTrackRecord = HistoryRecord.convertTrackRecord(trackRecordById);
        historyRecordConvertTrackRecord.setCf(cf);
        u(historyRecordConvertTrackRecord);
        f(historyRecordConvertTrackRecord);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final long trackId, final int deviceSource, final int runType, final String cf) {
        Observable.fromCallable(new Callable() { // from class: j97
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SportDetailPageNavigator.p(trackId, deviceSource, runType);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new SingleSubscriber<ParsedSportDetailData>() { // from class: com.xiaomi.hm.health.running.SportDetailPageNavigator$getTrackDataByIdThenGoToDetailPage$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return this.a.getMessage();
                }
            }

            @Override // rx.SingleSubscriber
            public void onError(@NotNull Throwable throwable) {
                throwable.printStackTrace();
                HMLog.info(this.b.TAG, new a(throwable));
                this.b.r();
                IconToast.showError(this.b.getContext(), this.b.getContext().getString(R.string.network_request_fail));
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(@NotNull ParsedSportDetailData trackData) {
                this.b.r();
                boolean z = !trackData.getPointLocationList().isEmpty();
                SportDetailPageNavigator sportDetailPageNavigator = this.b;
                sportDetailPageNavigator.q(trackId, deviceSource, runType, SportUseGaodeMapChecker.INSTANCE.checkUseGaodeMap(sportDetailPageNavigator.getContext()), z, cf);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParsedSportDetailData p(long j, int i, int i2) {
        return TrackDataManager.getInstance().getTrackData(j, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long trackId, int deviceSource, int type, boolean isGaodeMap, boolean hasTrack, String cf) {
        Intent intent = new Intent(this.context, (Class<?>) SportDetailPageActivity.class);
        intent.putExtra("START_ACTIVITY_FROM", 2);
        intent.putExtra("trackId", trackId);
        intent.putExtra("deviceSource", deviceSource);
        intent.putExtra("sportType", type);
        intent.putExtra(StatEvent.CF, cf);
        intent.putExtra("oversea", false);
        intent.putExtra("isGaodeMap", isGaodeMap);
        intent.putExtra(SportDetailPageActivity.HAS_TRACK, hasTrack);
        try {
            this.context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void s(HistoryRecord historyRecord, Activity belongActivity) {
        this.activity = belongActivity;
        u(historyRecord);
        if (historyRecord.isTraining()) {
            j(historyRecord);
        } else {
            f(historyRecord);
        }
    }

    private final void t(HistoryRecord record) {
        HeartRateReserveInfo info = SportDeviceManager.getInstance(this.context).supportHRR(record.getSource().intValue()) ? HRReserveHelper.getInstance(this.context).getInfo() : new HeartRateReserveInfo();
        float[] fArr = new float[5];
        int i = 0;
        if (info.getHeartRateType() != 1) {
            int[] section = info.getSection();
            float[] fArr2 = new float[6];
            int length = section.length - 1;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    fArr2[i2] = section[i2];
                    if (i3 > length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            int i4 = (int) fArr2[5];
            while (true) {
                int i5 = i + 1;
                fArr[i] = fArr2[i];
                if (i5 > 4) {
                    break;
                } else {
                    i = i5;
                }
            }
            if (i4 > 0) {
                HeartRateConstant.saveReserveHRArray(record.getSource().intValue(), i4);
            }
        } else {
            HeartRateConstant.saveReserveHRArray(record.getSource().intValue(), -1);
            int age = 220 - RunnerData.getRunner().getAge();
            while (true) {
                int i6 = i + 1;
                fArr[i] = RunUtils.scaleFloat(age * ((i + 5) / 10.0f), 1);
                if (i6 > 4) {
                    break;
                } else {
                    i = i6;
                }
            }
        }
        HeartRateConstant.setRangeArray(fArr);
    }

    private final void u(HistoryRecord historyRecord) {
        String deviceNameId = ExerciseDeviceIdentifier.getDeviceNameId(this.context, (historyRecord.getSource() != null ? historyRecord.getSource() : -1).intValue(), historyRecord.getDevice());
        if (deviceNameId == null) {
            deviceNameId = this.context.getString(R.string.training_component_app_name);
        }
        WatermarkShareDataUtil.setDeviceName(deviceNameId);
        WatermarkShareDataUtil.setLogoDrawableId(R.drawable.watermark_logo);
    }

    private final void v(@StringRes int msg) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.show();
        } else {
            Context context = this.context;
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context, context.getString(msg));
            this.loadingDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog == null) {
                return;
            }
            loadingDialogShowDialog.setCancelable(false);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void jump2DetailPage(@NotNull HistoryRecord historyRecord, @NotNull Activity belongActivity) {
        s(historyRecord, belongActivity);
    }

    public final void jump2DetailPageForTreadmill(@NotNull HistoryRecord historyRecord, @NotNull Context context, @NotNull Activity belongActivity) {
        Intent intent = new Intent(context, (Class<?>) SportDetailPageActivity.class);
        intent.putExtra("trackId", historyRecord.getTrackid().longValue());
        intent.putExtra("sportType", historyRecord.getType().intValue());
        intent.putExtra("deviceSource", historyRecord.getSource().intValue());
        intent.putExtra(StatEvent.CF, StatEvent.EventParams.TYPE_SPORT_END);
        boolean z = false;
        intent.putExtra("oversea", false);
        Integer type = historyRecord.getType();
        if (type != null && type.intValue() == 26) {
            z = true;
        }
        intent.putExtra(SportDetailPageActivity.HAS_TRACK, z);
        intent.putExtra("START_ACTIVITY_FROM", 1);
        if (historyRecord.getType() != null && historyRecord.getTrackid() != null && StatEvent.EventParams.SPORT_LIST.equals(historyRecord.getCf())) {
            HashMap map = new HashMap();
            map.put("sportstype", String.valueOf(historyRecord.getType()));
            map.put("id", String.valueOf(historyRecord.getTrackid()));
            Analytics.recordEvent(new CountEventBuilder("ENTER_SPORT_DETAIL_C").putExtras(map).setAnonymous(Utils.isOverseaUser()));
        }
        belongActivity.startActivity(intent);
    }

    @Override // com.huami.watch.companion.sport.helper.SportDetailNavigate
    public int naviSportDetailPage(@NotNull Context context, long trackId, @Nullable String source, int sportType, @NotNull String cf) {
        Unit unit = null;
        if (source != null) {
            this.loadingDialog = null;
            setContext(context);
            g(trackId, source, cf);
            unit = Unit.INSTANCE;
        }
        if (unit != null) {
            return 0;
        }
        HMLog.error$default("SportDetailPageNavigator", null, null, c.a, 6, null);
        return 0;
    }

    public final void setContext(@NotNull Context context) {
        this.context = context;
    }
}
