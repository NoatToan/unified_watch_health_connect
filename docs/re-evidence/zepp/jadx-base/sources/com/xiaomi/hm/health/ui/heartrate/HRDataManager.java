package com.xiaomi.hm.health.ui.heartrate;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.LiveData;
import com.huami.chart.data.ChartData;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.common.SmartExecutor;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.webapi.HeartRateWeb;
import com.xiaomi.hm.health.eventbus.EventHeartRateChanged;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.summery.HMSummery;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class HRDataManager {
    public static final int FULL_HR_CHART_POINT_COUNT = 240;
    public static final int HR_CHART_MERGE_POINT_COUNT = 5;
    private static final String b = "HRDataManager";
    private static final int c = 100;
    private static final int d = 500;
    private static final int e = 500;
    private static final int f = 255;
    private boolean a;

    public static class NoWholeDayHeartRateException extends IllegalArgumentException {
        public NoWholeDayHeartRateException() {
            super("There is no whole day heart rate data");
        }
    }

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ List a;
        public final /* synthetic */ boolean[] b;

        public a(final List val$dataList, final boolean[] val$result) {
            this.a = val$dataList;
            this.b = val$result;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData item) {
            if (item.isSuccess()) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    ((HeartRate) it2.next()).setState(1);
                }
                com.xiaomi.hm.health.ui.heartrate.d.z(this.a);
                HRDataManager.this.o();
                HMLog.i(HRDataManager.b, "sync to server success", new Object[0]);
            } else {
                HMLog.i(HRDataManager.b, "sync to server failed", new Object[0]);
            }
            this.b[0] = item.isSuccess();
        }
    }

    public class b extends SingleSubscriber<Boolean> {
        public b() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean isAllHrDataDeleted) {
            HMLog.i(HRDataManager.b, "isAllHrDataDeleted:" + isAllHrDataDeleted, new Object[0]);
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable error) {
            error.printStackTrace();
            HMLog.i(HRDataManager.b, "deleteFromServer:" + error.getMessage(), new Object[0]);
        }
    }

    public class c implements Func1<List<HeartRate>, Observable<Boolean>> {

        public class a implements Func2<Boolean, Boolean, Boolean> {
            public a() {
            }

            @Override // rx.functions.Func2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call(Boolean isPreviousSuccess, Boolean isCurrentSuccess) {
                return Boolean.valueOf(isPreviousSuccess.booleanValue() && isCurrentSuccess.booleanValue());
            }
        }

        public c() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<Boolean> call(List<HeartRate> heartRates) {
            if (heartRates == null || heartRates.size() <= 0) {
                HMLog.i(HRDataManager.b, "No hr to delete", new Object[0]);
                return Observable.just(Boolean.TRUE);
            }
            HMLog.i(HRDataManager.b, "try to delete " + heartRates.size() + " hr", new Object[0]);
            int size = heartRates.size();
            int i = ((size + (-1)) / 500) + 1;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 500;
                int i4 = i3 + 500;
                arrayList.add(HRDataManager.this.j(size > i4 ? heartRates.subList(i3, i4) : heartRates.subList(i3, size)));
            }
            if (arrayList.size() == 1) {
                return (Observable) arrayList.get(0);
            }
            Observable<Boolean> observableZipWith = (Observable) arrayList.get(0);
            for (int i5 = 1; i5 < arrayList.size(); i5++) {
                observableZipWith = observableZipWith.zipWith((Observable) arrayList.get(i5), new a());
            }
            return observableZipWith;
        }
    }

    public class d implements Callable<Boolean> {
        public final /* synthetic */ List a;

        public d(final List val$heartRates) {
            this.a = val$heartRates;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(HRDataManager.this.i(this.a));
        }
    }

    public class e extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ List a;
        public final /* synthetic */ boolean[] b;

        public e(final List val$heartRates, final boolean[] val$result) {
            this.a = val$heartRates;
            this.b = val$result;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData item) {
            HMLog.d(HRDataManager.b, "failed to request delete hr ", new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse response, HMHttpResponseData item) {
            HMLog.d(HRDataManager.b, "response : " + response.toString(), new Object[0]);
            if (!response.success()) {
                HMLog.i(HRDataManager.b, "failed to delete hr from server", new Object[0]);
                return;
            }
            com.xiaomi.hm.health.ui.heartrate.d.d(this.a);
            this.b[0] = true;
            HMLog.i(HRDataManager.b, "deleted " + this.a.size() + " hr", new Object[0]);
        }
    }

    public class f implements Func1<byte[], Pair<SparseArray<ChartData>, Integer>> {
        public final /* synthetic */ Function1 a;

        public f(final Function1 val$heartRateCheck) {
            this.a = val$heartRateCheck;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair<SparseArray<ChartData>, Integer> call(byte[] hrDataList) {
            Pair<SparseArray<ChartData>, Integer> chartDataListFromWholeDayHr = HRDataManager.this.parseChartDataListFromWholeDayHr(hrDataList, this.a);
            SparseArray sparseArray = (SparseArray) chartDataListFromWholeDayHr.first;
            int iIntValue = ((Integer) chartDataListFromWholeDayHr.second).intValue();
            if (((Boolean) this.a.invoke(Integer.valueOf(iIntValue))).booleanValue()) {
                return new Pair<>(sparseArray, Integer.valueOf(iIntValue));
            }
            throw Exceptions.propagate(new NoWholeDayHeartRateException());
        }
    }

    public class g implements Callable<byte[]> {
        public final /* synthetic */ String a;

        public g(final String val$date) {
            this.a = val$date;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] call() throws Exception {
            return HRDataManager.getInstance().queryWholeDayHeartRateByDay(this.a);
        }
    }

    public class h implements Function1<Integer, Boolean> {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(Integer integer) {
            return Boolean.valueOf(HRDataManager.this.isNormalHeartRate(integer.intValue()));
        }
    }

    public class i extends Subscriber<Boolean> {
        public i() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean aBoolean) {
            HMLog.i(HRDataManager.b, "心率删除结果=" + aBoolean, new Object[0]);
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable e) {
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HeartRate latestHeartRate = HRDataManager.this.getLatestHeartRate();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            List<HeartRate> manualHeartRateDataByTimeInSyncWay = HeartRateWeb.getManualHeartRateDataByTimeInSyncWay(latestHeartRate != null ? latestHeartRate.getTime().longValue() : 0L, jCurrentTimeMillis, 100);
            if (manualHeartRateDataByTimeInSyncWay == null || manualHeartRateDataByTimeInSyncWay.isEmpty()) {
                return;
            }
            com.xiaomi.hm.health.ui.heartrate.d.f(manualHeartRateDataByTimeInSyncWay, Long.valueOf(jCurrentTimeMillis));
        }
    }

    public class k extends SingleSubscriber<List<HeartRate>> {
        public k() {
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
            HMLog.i(HRDataManager.b, "sync from server error", new Object[0]);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(List<HeartRate> hrList) {
            if (hrList != null) {
                HMKeeper.setHeartRateDataSyncState(true);
                if (hrList.isEmpty()) {
                    return;
                }
                HRDataManager.this.o();
            }
        }
    }

    public class l implements Action1<List<HeartRate>> {
        public final /* synthetic */ long a;

        public l(final long val$queryEndTime) {
            this.a = val$queryEndTime;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(List<HeartRate> hrList) {
            if (hrList == null || hrList.isEmpty()) {
                return;
            }
            com.xiaomi.hm.health.ui.heartrate.d.f(hrList, Long.valueOf(this.a));
        }
    }

    public class m implements Callable<List<HeartRate>> {
        public final /* synthetic */ long a;

        public m(final long val$queryEndTime) {
            this.a = val$queryEndTime;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<HeartRate> call() throws Exception {
            return HeartRateWeb.getManualHeartRateDataByTimeInSyncWay(Long.valueOf(this.a), 100);
        }
    }

    public class n implements Func1<List<HeartRate>, List<HeartRate>> {
        public final /* synthetic */ Long a;

        public n(final Long val$queryEndTime) {
            this.a = val$queryEndTime;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<HeartRate> call(List<HeartRate> webHrList) {
            if (webHrList != null && !webHrList.isEmpty()) {
                com.xiaomi.hm.health.ui.heartrate.d.f(webHrList, this.a);
            }
            List<HeartRate> listM = com.xiaomi.hm.health.ui.heartrate.d.m(this.a.longValue(), 100);
            if (webHrList != null || (listM != null && !listM.isEmpty())) {
                return listM;
            }
            throw new IllegalStateException("fetch hr list from web failed, queryEndTime:" + this.a);
        }
    }

    public class o implements Callable<List<HeartRate>> {
        public final /* synthetic */ Long a;

        public o(final Long val$queryEndTime) {
            this.a = val$queryEndTime;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<HeartRate> call() throws Exception {
            return HeartRateWeb.getManualHeartRateDataByTimeInSyncWay(this.a, 100);
        }
    }

    public class p extends Subscriber<Boolean> {
        public p() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean isUploadAllHrDataSuccess) {
            HMLog.d(HRDataManager.b, "isUploadAllHrDataSuccess:" + isUploadAllHrDataSuccess, new Object[0]);
        }

        @Override // rx.Observer
        public void onCompleted() {
            HRDataManager.this.a = false;
        }

        @Override // rx.Observer
        public void onError(Throwable error) {
            error.printStackTrace();
            HRDataManager.this.a = false;
        }
    }

    public class q implements Func1<List<HeartRate>, Observable<Boolean>> {

        public class a implements Func2<Boolean, Boolean, Boolean> {
            public a() {
            }

            @Override // rx.functions.Func2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call(Boolean isPreviousSuccess, Boolean isCurrentSuccess) {
                return Boolean.valueOf(isPreviousSuccess.booleanValue() && isCurrentSuccess.booleanValue());
            }
        }

        public q() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<Boolean> call(List<HeartRate> heartRates) {
            if (heartRates == null || heartRates.size() <= 0) {
                HMLog.d(HRDataManager.b, "No need sync hr data", new Object[0]);
                return Observable.just(Boolean.TRUE);
            }
            int size = heartRates.size();
            int i = ((size - 1) / 500) + 1;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 500;
                int i4 = i3 + 500;
                arrayList.add(HRDataManager.this.q(size > i4 ? heartRates.subList(i3, i4) : heartRates.subList(i3, size)));
            }
            if (arrayList.size() == 1) {
                return (Observable) arrayList.get(0);
            }
            Observable<Boolean> observableZipWith = (Observable) arrayList.get(0);
            for (int i5 = 1; i5 < arrayList.size(); i5++) {
                observableZipWith = observableZipWith.zipWith((Observable) arrayList.get(i5), new a());
            }
            return observableZipWith;
        }
    }

    public class r implements Callable<Boolean> {
        public final /* synthetic */ List a;

        public r(final List val$dataList) {
            this.a = val$dataList;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(HRDataManager.this.p(this.a));
        }
    }

    public static class s {
        public static final HRDataManager a = new HRDataManager();

        private s() {
        }
    }

    private HRDataManager() {
        this.a = false;
    }

    public static int findLastValidChartDataListIndex(SparseArray<ChartData> chartDataList) {
        int index = -1;
        if (chartDataList != null && chartDataList.size() != 0) {
            for (int size = chartDataList.size() - 1; size >= 0; size--) {
                ChartData chartDataValueAt = chartDataList.valueAt(size);
                if (chartDataValueAt != null && ((int) chartDataValueAt.getSumValue()) > 0 && index < chartDataValueAt.getIndex()) {
                    index = chartDataValueAt.getIndex();
                }
            }
        }
        return index;
    }

    public static Pair<Integer, Integer> findMaxMinChartData(SparseArray<ChartData> chartDataList) {
        int i2;
        int i3 = -1;
        if (chartDataList == null || chartDataList.size() == 0) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = Integer.MAX_VALUE;
            for (int size = chartDataList.size() - 1; size >= 0; size--) {
                ChartData chartDataValueAt = chartDataList.valueAt(size);
                if (chartDataValueAt != null) {
                    int sumValue = (int) chartDataValueAt.getSumValue();
                    if (sumValue > 0 && sumValue < i2) {
                        i2 = sumValue;
                    }
                    if (sumValue > i3) {
                        i3 = sumValue;
                    }
                }
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = 0;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static HRDataManager getInstance() {
        return s.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(final List<HeartRate> heartRates) {
        boolean[] zArr = {false};
        HeartRateWeb.deleteManualHeartRateData(heartRates, new e(heartRates, zArr));
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<Boolean> j(final List<HeartRate> heartRates) {
        return Observable.fromCallable(new d(heartRates)).subscribeOn(Schedulers.io());
    }

    private HeartRate k(int hr, int type, long time, int state, int timeZone, HMDeviceType deviceType, HMDeviceSource deviceSource) {
        HeartRate heartRate = new HeartRate();
        heartRate.setHr(Integer.valueOf(hr));
        heartRate.setTime(Long.valueOf(time));
        heartRate.setType(Integer.valueOf(type));
        heartRate.setState(Integer.valueOf(state));
        heartRate.setTime_zone(Integer.valueOf(timeZone));
        heartRate.setDevice_id(HMDeviceManager.getInstance().getBoundDeviceId(deviceType));
        heartRate.setDevice_type(Integer.valueOf(deviceType.getValue()));
        heartRate.setDevice_source(Integer.valueOf(deviceSource.getValue()));
        return heartRate;
    }

    private HeartRate l(int hr, int type, long time, int state, HMDeviceType deviceType, HMDeviceSource deviceSource) {
        return k(hr, type, time, state, TimeZone.getDefault().getRawOffset(), deviceType, deviceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean m(Integer num) {
        return Boolean.valueOf(isValidHeartRate(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean n(Integer num) {
        return Boolean.valueOf(isValidHeartRate(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        HMLog.d(b, "notifyHeartRateDataChange ", new Object[0]);
        EventBus.getDefault().post(new EventHeartRateChanged());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(final List<HeartRate> dataList) {
        boolean[] zArr = new boolean[1];
        HeartRateWeb.syncHeartRateDataToServer(dataList, new a(dataList, zArr));
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<Boolean> q(final List<HeartRate> dataList) {
        return Observable.fromCallable(new r(dataList)).subscribeOn(Schedulers.io());
    }

    private Observable<Boolean> r() {
        return com.xiaomi.hm.health.ui.heartrate.d.s().flatMap(new q()).subscribeOn(Schedulers.io());
    }

    public void deleteFromServer() {
        com.xiaomi.hm.health.ui.heartrate.d.r().flatMap(new c()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new b());
    }

    public void deleteHeartRateByKeys(List<Long> keys) {
        List<HeartRate> listL = com.xiaomi.hm.health.ui.heartrate.d.l(keys);
        if (listL == null || listL.isEmpty()) {
            return;
        }
        j(listL).subscribe((Subscriber<? super Boolean>) new i());
    }

    @Nullable
    public Calendar getBoundDeviceSyncTime() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (hMDeviceManager.hasBound(hMDeviceType)) {
            return hMDeviceManager.getBoundDeviceSyncTime(hMDeviceType);
        }
        HMDeviceType hMDeviceType2 = HMDeviceType.WATCH;
        if (hMDeviceManager.hasBound(hMDeviceType2)) {
            return hMDeviceManager.getBoundDeviceSyncTime(hMDeviceType2);
        }
        return null;
    }

    public HeartRate getEarliestSyncedHeartRate() {
        return com.xiaomi.hm.health.ui.heartrate.d.k();
    }

    public HeartRate getLatestHeartRate() {
        return com.xiaomi.hm.health.ui.heartrate.d.p();
    }

    public HeartRate getManualHR(int hr, long time, int state, HMDeviceSource deviceSource) {
        return l(hr, 2, time, state, HMDeviceType.MILI, deviceSource);
    }

    public Observable<List<HeartRate>> getManualHeartRateListInRx(Long syncTime) {
        if (syncTime == null) {
            syncTime = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        return Observable.fromCallable(new o(syncTime)).subscribeOn(Schedulers.io()).map(new n(syncTime));
    }

    public int getMaxHeartRate() {
        return 220 - HMPersonInfo.getInstance().getUserInfo().getAge();
    }

    public void insertHeartRateList(Iterable<HeartRate> iterable) {
        com.xiaomi.hm.health.ui.heartrate.d.h(iterable);
    }

    public void insertItem(HeartRate heartRate) {
        com.xiaomi.hm.health.ui.heartrate.d.g(heartRate);
        o();
    }

    public boolean isNormalHeartRate(int hr) {
        return hr >= 9 && hr < 254;
    }

    public boolean isValidHeartRate(int hr) {
        return hr >= 30 && hr <= 240;
    }

    public Observable<Pair<SparseArray<ChartData>, Integer>> loadWholeDayHeartRateAndMapToChartData(final String date) {
        return loadWholeDayHeartRateAndMapToChartData(date, new Function1() { // from class: ur3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.m((Integer) obj);
            }
        });
    }

    public Observable<Pair<SparseArray<ChartData>, Integer>> loadWholeDayHeartRateAndMapToChartDataWithOutCheck(final String date) {
        return loadWholeDayHeartRateAndMapToChartData(date, new h());
    }

    public Pair<SparseArray<ChartData>, Integer> parseChartDataListFromWholeDayHr(byte[] hrDataList) {
        return parseChartDataListFromWholeDayHr(hrDataList, new Function1() { // from class: vr3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.n((Integer) obj);
            }
        });
    }

    public List<HeartRate> queryHeartRateListByDay(String day) {
        return com.xiaomi.hm.health.ui.heartrate.d.n(day);
    }

    public List<HeartRate> queryHeartRateListByDayRange(long fromDay, long endDay) {
        return com.xiaomi.hm.health.ui.heartrate.d.o(fromDay, endDay);
    }

    public List<HeartRate> queryHeartRateListForFirstPage() {
        return com.xiaomi.hm.health.ui.heartrate.d.m(System.currentTimeMillis() / 1000, 100);
    }

    public LiveData<HeartRate> queryLatestHeartRateByLiveData() {
        return com.xiaomi.hm.health.ui.heartrate.d.q();
    }

    public int queryRestHeartRateByDay(String day) {
        return com.xiaomi.hm.health.ui.heartrate.d.t(day);
    }

    public Observable<HMSummery> queryRestingHeartRateInMonth(String startDateInMonth, String lastDateInMonth) {
        return com.xiaomi.hm.health.ui.heartrate.d.u(startDateInMonth, lastDateInMonth);
    }

    public byte[] queryWholeDayHeartRateByDay(String day) {
        return com.xiaomi.hm.health.ui.heartrate.d.v(day);
    }

    public Map<String, byte[]> queryWholeDayHeartRateByRange(String fromDay, String endDay) {
        return com.xiaomi.hm.health.ui.heartrate.d.w(fromDay, endDay);
    }

    public void s(HeartRate heartRate) {
        com.xiaomi.hm.health.ui.heartrate.d.y(heartRate);
        o();
    }

    public void syncFromServer(boolean isForce) {
        boolean zIsSyncedHeartRateData = HMKeeper.isSyncedHeartRateData();
        HMLog.i(b, "isSyncedHeartRateData : " + zIsSyncedHeartRateData, new Object[0]);
        if (isForce || !zIsSyncedHeartRateData) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Observable.fromCallable(new m(jCurrentTimeMillis)).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).doOnNext(new l(jCurrentTimeMillis)).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new k());
        }
    }

    public void syncLatestDataFromServer() {
        SmartExecutor.getExecutor().execute(new j());
    }

    public void syncToServer() {
        if (this.a) {
            HMLog.d(b, "Hr data is already uploading", new Object[0]);
        } else {
            this.a = true;
            r().observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe((Subscriber<? super Boolean>) new p());
        }
    }

    public boolean syncToServerInSyncWay() {
        try {
            return r().toBlocking().single().booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public Observable<Pair<SparseArray<ChartData>, Integer>> loadWholeDayHeartRateAndMapToChartData(final String date, Function1<Integer, Boolean> heartRateCheck) {
        return Observable.fromCallable(new g(date)).subscribeOn(Schedulers.io()).map(new f(heartRateCheck));
    }

    public Pair<SparseArray<ChartData>, Integer> parseChartDataListFromWholeDayHr(byte[] hrDataList, Function1<Integer, Boolean> checkHeartRate) {
        SparseArray sparseArray = new SparseArray();
        int i2 = -1;
        int i3 = -1;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < hrDataList.length; i6++) {
            int i7 = hrDataList[i6] & 255;
            if (checkHeartRate.invoke(Integer.valueOf(i7)).booleanValue()) {
                if (i7 > i4) {
                    i3 = i6 / 5;
                    i4 = i7;
                }
                if (i7 > 0 && i7 < i5) {
                    i2 = i6 / 5;
                    i5 = i7;
                }
            }
        }
        HMLog.d(b, "maxHr: " + i4 + ", minHr: " + i5, new Object[0]);
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < hrDataList.length; i12++) {
            if (z) {
                z = false;
            } else {
                int i13 = hrDataList[i12] & 255;
                if (checkHeartRate.invoke(Integer.valueOf(i13)).booleanValue()) {
                    i9 += i13;
                    i10++;
                }
                if ((i12 + 1) % 5 == 0) {
                    if (i10 > 0) {
                        int i14 = (int) ((i9 * 1.0f) / i10);
                        int i15 = i12 / 5;
                        if (i5 != i4 && i15 == i2 && i15 == i3) {
                            if (i15 == 0) {
                                sparseArray.put(i11, new ChartData(i11, i5));
                                sparseArray.put(i11, new ChartData(i11, i4));
                                i8 = i14;
                                z = true;
                            } else {
                                int i16 = i11 - 1;
                                sparseArray.put(i16, new ChartData(i16, i5));
                                i14 = i4;
                            }
                        } else if (i2 == i15) {
                            i14 = i5;
                        } else if (i3 == i15) {
                            i14 = i4;
                        }
                        if (!z) {
                            sparseArray.put(i11, new ChartData(i11, i14));
                            i8 = i14;
                        }
                    } else {
                        sparseArray.put(i11, new ChartData(i11, 0.0f));
                    }
                    i11++;
                    i9 = 0;
                    i10 = 0;
                }
            }
        }
        return new Pair<>(sparseArray, Integer.valueOf(i8));
    }
}
