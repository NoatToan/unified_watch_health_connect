package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.KnitHeartRateActivity;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class skb extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Float> f48232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwHealthLineDataSet f48233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthLineChart f48234c;
    private final b d;
    private final a e;
    private List<Integer> f;
    private final Resources g;
    private String h;
    private d i;
    private long j;
    private String m;

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isMessageDefaultLargeCard() {
        return true;
    }

    static class e implements HiDataReadResultListener {
        private WeakReference<skb> e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public e(skb skbVar) {
            this.e = new WeakReference<>(skbVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            HiHealthData hiHealthDataE;
            List<Float> listA;
            List<Float> listD;
            if (this.e.get() == null) {
                LogUtil.e("FunctionSetHeartRateReader", "mRef is null");
                return;
            }
            skb skbVar = this.e.get();
            HashMap map = new HashMap(10);
            b(map, skbVar.getList(obj, 2018));
            b(map, skbVar.getList(obj, 2105));
            b(map, skbVar.getList(obj, 2002));
            List list = skbVar.getList(obj, DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY.value());
            ArrayList arrayList = new ArrayList(10);
            arrayList.addAll(map.values());
            LogUtil.a("FunctionSetHeartRateReader", "readCardData onResult hearRateList size = ", Integer.valueOf(arrayList.size()));
            HiHealthData hiHealthData = null;
            if (njy.e(arrayList) && njy.e(list)) {
                LogUtil.j("FunctionSetHeartRateReader", "readCardData onResult dataList is empty");
                skbVar.d.b(null, null, null, null);
                return;
            }
            if (njy.b(arrayList)) {
                hiHealthDataE = skbVar.e(obj, arrayList);
                listA = skt.a(skbVar.d(arrayList, HiDateUtil.p(hiHealthDataE.getStartTime())));
            } else {
                hiHealthDataE = null;
                listA = null;
            }
            if (njy.b(list)) {
                Collections.sort(list, Comparator.comparingLong(new lgd()));
                hiHealthData = (HiHealthData) list.get(list.size() - 1);
                listD = skt.d(skbVar.d((List<HiHealthData>) list, HiDateUtil.p(hiHealthData.getStartTime())));
            } else {
                listD = null;
            }
            skbVar.d.b(hiHealthDataE, hiHealthData, listA, listD);
        }

        private void b(Map<Long, HiHealthData> map, List<HiHealthData> list) {
            if (njy.e(list)) {
                LogUtil.j("FunctionSetHeartRateReader", "processHeartDate heartRateLists isEmpty");
                return;
            }
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData == null) {
                    LogUtil.j("FunctionSetHeartRateReader", "loadDayValue healthData is null");
                } else {
                    map.put(Long.valueOf(hiHealthData.getStartTime()), hiHealthData);
                }
            }
        }
    }

    private void a(SparseArray<List<HiHealthData>> sparseArray, long j) {
        SharedPreferenceManager.c("privacy_center", "heart_health", String.valueOf(j));
        String strC = qrk.c(j);
        if (!ueh.b(ueh.b(strC), sparseArray)) {
            LogUtil.a("FunctionSetHeartRateReader", "setHeartRateCache same cache");
        } else {
            ueh.c(strC, sparseArray);
        }
    }

    static class b extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48235a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Float> f48236c;
        private final WeakReference<skb> e;

        b(skb skbVar) {
            super("FunctionSetHeartRateReader", null);
            this.e = new WeakReference<>(skbVar);
        }

        void b(HiHealthData hiHealthData, HiHealthData hiHealthData2, List<Float> list, List<Float> list2) {
            String str;
            boolean z;
            HiHealthData hiHealthData3;
            boolean z2 = true;
            if (hiHealthData != null && njy.b(list)) {
                LogUtil.a("FunctionSetHeartRateReader", "saveHealthData heartList size is:", Integer.valueOf(list.size()));
                skb.setHasCardData(this.e, true);
                this.f48236c = list;
                String strMarshallListToString = marshallListToString(list);
                hiHealthData3 = new HiHealthData();
                hiHealthData3.putDouble("point_value", hiHealthData.getValue());
                hiHealthData3.setStartTime(hiHealthData.getStartTime());
                hiHealthData3.putString("_", strMarshallListToString);
                str = hiHealthData.toString() + list.size();
                z = true;
            } else {
                str = "";
                z = false;
                hiHealthData3 = null;
            }
            if (hiHealthData2 == null || !njy.b(list2)) {
                z2 = z;
            } else {
                LogUtil.a("FunctionSetHeartRateReader", "saveHealthData hrvList size is:", Integer.valueOf(list2.size()));
                skb.setHasCardData(this.e, true);
                if (hiHealthData3 == null) {
                    hiHealthData3 = new HiHealthData();
                }
                String strMarshallListToString2 = marshallListToString(list2);
                hiHealthData3.putLong("_ht", hiHealthData2.getStartTime());
                hiHealthData3.putDouble("hrv_value", hiHealthData2.getValue());
                hiHealthData3.putString("_h", strMarshallListToString2);
                str = str + hiHealthData2.toString() + list2.size();
            }
            if (!z2) {
                skb.setHasCardData(this.e, false);
                this.f48236c = null;
            } else {
                int iHashCode = str.hashCode();
                LogUtil.a("FunctionSetHeartRateReader", "saveHealthData uniqueCode is:", Integer.valueOf(iHashCode));
                hiHealthData3.putInt("_u", iHashCode);
            }
            skb.saveDataFromHealthApi("FunctionSetHeartRateReader", this.e, hiHealthData3);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            double d;
            long startTime;
            skb skbVar = this.e.get();
            if (skbVar == null) {
                LogUtil.j("FunctionSetHeartRateReader", "handleCacheData heartRateReader is null");
                return;
            }
            if (hiHealthData == null) {
                if (this.f48235a && z) {
                    skbVar.a();
                    return;
                }
                return;
            }
            this.f48235a = true;
            List<Float> listE = e(hiHealthData, z);
            ArrayList arrayList = new ArrayList();
            unmarshallListFromString(hiHealthData.getString("_h"), arrayList);
            if (!njy.e(listE) || !njy.e(arrayList)) {
                if ((!skbVar.d() || !njy.b(arrayList)) && !njy.e(listE)) {
                    skbVar.h = "heart_rate";
                    d = hiHealthData.getDouble("point_value");
                    startTime = hiHealthData.getStartTime();
                } else {
                    LogUtil.a("FunctionSetHeartRateReader", "handleCacheData hrv size ", Integer.valueOf(arrayList.size()));
                    skbVar.h = "HRV";
                    listE = arrayList;
                    d = hiHealthData.getDouble("hrv_value");
                    startTime = hiHealthData.getLong("_ht");
                }
                if (njy.e(listE)) {
                    LogUtil.j("FunctionSetHeartRateReader", "handleCacheData chartList ", listE, " isNewData ", Boolean.valueOf(z));
                    if (z) {
                        return;
                    }
                    skbVar.refreshCardBySp(skbVar.buildEmptyCardBean());
                    return;
                }
                LogUtil.a("FunctionSetHeartRateReader", "handleCacheData refresh");
                skbVar.c(listE);
                skbVar.e(d, startTime, hiHealthData.getInt("_u"), z);
                return;
            }
            LogUtil.j("FunctionSetHeartRateReader", "handleCacheData all data list is empty, isNewData", Boolean.valueOf(z));
            if (z) {
                return;
            }
            skbVar.refreshCardBySp(skbVar.buildEmptyCardBean());
        }

        private List<Float> e(HiHealthData hiHealthData, boolean z) {
            List<Float> list = this.f48236c;
            if (!z || list == null) {
                ArrayList arrayList = new ArrayList();
                unmarshallListFromString(hiHealthData.getString("_"), arrayList);
                return arrayList;
            }
            this.f48236c = null;
            return list;
        }
    }

    public static class a extends BaseHandler<skb> {
        public a(skb skbVar) {
            super(Looper.getMainLooper(), skbVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(skb skbVar, Message message) {
            if (skbVar == null || message == null) {
                LogUtil.j("FunctionSetHeartRateReader", "handleMessageWhenReferenceNotNull reader or message is null");
                return;
            }
            int i = message.what;
            LogUtil.a("FunctionSetHeartRateReader", "handleMessageWhenReferenceNotNull what ", Integer.valueOf(i));
            if (i == 4) {
                Object obj = message.obj;
                if (!(obj instanceof FunctionSetBean)) {
                    LogUtil.j("FunctionSetHeartRateReader", "handleMessageWhenReferenceNotNull object instanceof FunctionSetBean is false");
                    return;
                }
                FunctionSetBean functionSetBean = (FunctionSetBean) obj;
                if (skbVar.e()) {
                    functionSetBean.b((CharSequence) skbVar.m);
                }
                skbVar.notifyItemChanged(functionSetBean);
                return;
            }
            if (i == 100) {
                boolean zM = qdm.m();
                LogUtil.a("FunctionSetHeartRateReader", "handleMessageWhenReferenceNotNull isOpenActiveRecord ", Boolean.valueOf(zM));
                if (zM) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof Pair) {
                    Pair pair = (Pair) obj2;
                    if (!(pair.first instanceof Integer) || !(pair.second instanceof String)) {
                        LogUtil.j("FunctionSetHeartRateReader", "handleMessageWhenReferenceNotNull heartRateText is error");
                        return;
                    }
                    Integer num = (Integer) pair.first;
                    num.intValue();
                    String str = (String) pair.second;
                    LogUtil.a("FunctionSetHeartRateReader", "cardId is：", num, "heartRateText is：", str);
                    skbVar.m = str;
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("FunctionSetHeartRateReader", "handleMessageWhenReferenceNotNull heartRateText ", str, " cardId ", num);
                        return;
                    }
                    FunctionSetBean functionSetBean2 = skbVar.getFunctionSetBean();
                    if (functionSetBean2 == null) {
                        ReleaseLogUtil.e("FunctionSetHeartRateReader", "handleMessageWhenReferenceNotNull functionSetBean is null");
                        return;
                    }
                    LogUtil.a("FunctionSetHeartRateReader", "activeRecordText: ", str);
                    functionSetBean2.b((CharSequence) str);
                    skbVar.notifyItemChanged(functionSetBean2);
                }
            }
        }
    }

    public skb(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetHeartRateReader", cardConfig);
        this.d = new b(this);
        this.f = null;
        this.g = this.mContext.getResources();
        this.e = new a(this);
        subscribeDataChange();
        d dVar = new d(this);
        this.i = dVar;
        ObserverManagerUtil.d(dVar, ObserveLabels.SUMMARY_DATA_INIT);
    }

    static class d implements Observer {
        private final WeakReference<skb> d;

        d(skb skbVar) {
            this.d = new WeakReference<>(skbVar);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            skb skbVar = this.d.get();
            if (skbVar == null || objArr == null || !ObserveLabels.SUMMARY_DATA_INIT.equals(str)) {
                ReleaseLogUtil.e("FunctionSetHeartRateReader", "InnerObserver notify functionSetHeartRateReader ", skbVar, " objects ", objArr, " label ", str);
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Integer) || !(objArr[1] instanceof HashMap)) {
                ReleaseLogUtil.e("FunctionSetHeartRateReader", "InnerObserver notify is not legal");
                return;
            }
            Integer num = (Integer) obj;
            num.intValue();
            HashMap map = (HashMap) objArr[1];
            LogUtil.a("FunctionSetHeartRateReader", "initSummary errorCode： ", num);
            Message messageObtainMessage = skbVar.e.obtainMessage();
            messageObtainMessage.what = 100;
            messageObtainMessage.obj = map.get("heartHealth");
            skbVar.e.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(double d2, long j, int i, boolean z) {
        String strE;
        LogUtil.a("FunctionSetHeartRateReader", "refreshHeartRateDataAndTime isNewData=", Boolean.valueOf(z), " lastHeartRate:", Double.valueOf(d2), " time:", Long.valueOf(j));
        setHasCardData(true);
        this.j = j;
        setBiHasData(j);
        String strB = tfc.b(j);
        String strE2 = UnitUtil.e(d2, 1, 0);
        if ("heart_rate".equals(this.h)) {
            strE = qre.e(R.plurals.IDS_card_heart_rate_unit, (int) d2, strE2);
        } else {
            strE = qre.e(R.plurals.IDS_card_heart_hrv_unit, (int) d2, strE2);
        }
        setBiHasDataType(this.h);
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(this.g.getString(R.string.IDS_main_heart_health_string)).e(tfc.d(strE, strE2)).e(FunctionSetType.HEART_RATE_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).g(tfc.d(this.j)).d(strB).b(this.mContext).a();
        functionSetBeanA.d(i);
        if (z) {
            Message messageObtainMessage = this.e.obtainMessage();
            messageObtainMessage.what = 4;
            messageObtainMessage.obj = functionSetBeanA;
            this.e.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanA);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == 5 || i == DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY.value();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetHeartRateReader", "subscribeDataChange");
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(5);
        if (fua.h()) {
            arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY.value()));
        }
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(arrayList, new FunctionSetBeanReader.e("FunctionSetHeartRateReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        if (njy.e(this.f)) {
            LogUtil.j("FunctionSetHeartRateReader", "onDestroy mHeartRateSuccessList is empty");
        } else {
            HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.f, new FunctionSetBeanReader.c("FunctionSetHeartRateReader", "unSubscribeHeartRateData, isSuccess :"));
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        super.readCardData();
        LogUtil.a("FunctionSetHeartRateReader", "readCardData");
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(new int[]{46016}));
        arrayList.add(a(new int[]{DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY.value()}));
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthDataEx(arrayList, new c(this));
    }

    private HiDataReadProOption a(int[] iArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        hiDataReadOption.setType(iArr);
        return HiDataReadProOption.builder().e(hiDataReadOption).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        ReleaseLogUtil.e("FunctionSetHeartRateReader", "readDetailData queryDate = ", Integer.valueOf(i));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        if (fua.h()) {
            hiDataReadOption.setType(new int[]{2002, 2018, 2105, 2101, 2102, DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY.value()});
        } else {
            hiDataReadOption.setType(new int[]{2002, 2018, 2105, 2101, 2102});
        }
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        long jA = lsl.a(System.currentTimeMillis(), 6, 0);
        long jA2 = lsl.a(System.currentTimeMillis(), 8, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis >= jA && jCurrentTimeMillis < jA2;
    }

    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<skb> f48237a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        c(skb skbVar) {
            this.f48237a = new WeakReference<>(skbVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            long startTime;
            final skb skbVar = this.f48237a.get();
            if (skbVar == null) {
                LogUtil.j("FunctionSetHeartRateReader", "FunctionSetHeartRateReader cardReader is null");
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.e("FunctionSetHeartRateReader", "data is not instanceof SparseArray");
                skbVar.d.b(null, null, null, null);
                return;
            }
            ReleaseLogUtil.d("FunctionSetHeartRateReader", "readLastDataData success");
            SparseArray sparseArray = (SparseArray) obj;
            List list = (List) sparseArray.get(46016);
            List list2 = (List) sparseArray.get(DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY.value());
            if (njy.e(list) && njy.e(list2)) {
                ReleaseLogUtil.e("FunctionSetHeartRateReader", "readCardData all empty");
                skbVar.d.b(null, null, null, null);
                return;
            }
            long startTime2 = 0;
            if (njy.b(list)) {
                ReleaseLogUtil.d("FunctionSetHeartRateReader", "readLastDataData heartRateData:", list.toString());
                startTime = ((HiHealthData) list.get(0)).getStartTime();
            } else {
                startTime = 0;
            }
            if (njy.b(list2)) {
                ReleaseLogUtil.d("FunctionSetHeartRateReader", "readLastDataData hrvData:", list2.toString());
                startTime2 = ((HiHealthData) list2.get(0)).getStartTime();
            }
            final int iA = DateFormatUtil.a(startTime);
            final int iA2 = DateFormatUtil.a(startTime2);
            ThreadPoolManager.c().execute(new Runnable() { // from class: sjy
                @Override // java.lang.Runnable
                public final void run() {
                    skbVar.a(Math.max(iA, iA2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("FunctionSetHeartRateReader", "showEmptyView");
        setHasCardData(false);
        FunctionSetBean functionSetBeanBuildEmptyCardBean = buildEmptyCardBean();
        Message messageObtainMessage = this.e.obtainMessage();
        messageObtainMessage.what = 4;
        messageObtainMessage.obj = functionSetBeanBuildEmptyCardBean;
        this.e.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.g.getString(R.string.IDS_main_heart_health_string)).c(this.g.getString(R.string.IDS_hw_health_show_healthdata_heart_description)).e(FunctionSetType.HEART_RATE_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(this.mContext).a();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetHeartRateReader", "updateSuccessList");
        if (njy.e(list)) {
            LogUtil.j("FunctionSetHeartRateReader", "updateSuccessList successList is empty");
        } else {
            this.f = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiHealthData e(Object obj, List<HiHealthData> list) {
        Collections.sort(list, Comparator.comparingLong(new lgd()));
        HiHealthData hiHealthData = list.get(list.size() - 1);
        long jP = HiDateUtil.p(hiHealthData.getStartTime());
        a((SparseArray<List<HiHealthData>>) obj, jP);
        if (list.size() != 1) {
            HiHealthData hiHealthData2 = list.get(list.size() - 2);
            if (jP != HiDateUtil.p(hiHealthData2.getStartTime())) {
                list.remove(list.size() - 1);
                return hiHealthData2;
            }
        }
        return hiHealthData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthData> d(List<HiHealthData> list, long j) {
        ArrayList arrayList = new ArrayList(2);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && j == HiDateUtil.p(hiHealthData.getStartTime())) {
                arrayList.add(hiHealthData);
            }
        }
        LogUtil.a("FunctionSetHeartRateReader", "getCardViewLastDayData size ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        List dataSets;
        if (this.f48234c == null) {
            HwHealthLineChart hwHealthLineChart = (HwHealthLineChart) View.inflate(this.mContext, R.layout.card_heart_view, null).findViewById(R.id.linechart);
            this.f48234c = hwHealthLineChart;
            hwHealthLineChart.setTouchEnabled(false);
            this.f48234c.getXAxis().setEnabled(false);
            this.f48234c.getDescription().setEnabled(false);
            HwHealthYAxis axisFirstParty = this.f48234c.getAxisFirstParty();
            axisFirstParty.setDrawLabels(false);
            axisFirstParty.setDrawGridLines(false);
            axisFirstParty.setDrawAxisLine(false);
            this.f48234c.disableLabelsForce();
        }
        HwHealthLineDataSet hwHealthLineDataSet = this.f48233b;
        if (hwHealthLineDataSet == null) {
            LogUtil.j("FunctionSetHeartRateReader", "createCardView heartRateSet is null");
            return null;
        }
        qnt qntVar = (qnt) this.f48234c.getData();
        if (qntVar == null) {
            dataSets = new ArrayList(1);
            this.f48234c.setData(new qnt(dataSets));
        } else {
            dataSets = qntVar.getDataSets();
        }
        if (dataSets == null) {
            dataSets = new ArrayList(1);
        }
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean != null) {
            this.f48234c.setAccessibilityDescription(String.valueOf(functionSetBean.c()));
        }
        if (njy.b(dataSets) && dataSets.get(0) == hwHealthLineDataSet) {
            LogUtil.a("FunctionSetHeartRateReader", "createCardView same chart data");
            return this.f48234c;
        }
        HwHealthYAxis axisFirstParty2 = this.f48234c.getAxisFirstParty();
        axisFirstParty2.setAxisMinimum(hwHealthLineDataSet.getYMin() - 10.0f);
        axisFirstParty2.setAxisMaximum(hwHealthLineDataSet.getYMax() + 10.0f);
        dataSets.clear();
        dataSets.add(hwHealthLineDataSet);
        this.f48234c.setData(new qnt(dataSets));
        this.f48234c.refresh();
        LogUtil.a("FunctionSetHeartRateReader", "createCardView mHeartRateChart refresh");
        return this.f48234c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<Float> list) {
        if (njy.c(list, this.f48232a, true)) {
            LogUtil.j("FunctionSetHeartRateReader", "initLineChart same list no need to refresh chart");
            return;
        }
        this.f48232a = list;
        ArrayList arrayList = new ArrayList(16);
        int size = list.size();
        LogUtil.a("FunctionSetHeartRateReader", "initLineChart valueSize ", Integer.valueOf(size));
        for (int i = 0; i < size; i++) {
            float fFloatValue = list.get(i).floatValue();
            if (fFloatValue != 0.0f) {
                arrayList.add(new HwHealthBaseEntry(i, fFloatValue));
            }
        }
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, "line brief", "line label", "line unit");
        if ("heart_rate".equals(this.h)) {
            hwHealthLineDataSet.c(1);
            hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: skb.5
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
                public boolean drawLine(int i2, int i3, int i4) {
                    return i3 - i2 <= i4;
                }
            });
        }
        hwHealthLineDataSet.setColor(ContextCompat.getColor(this.mContext, R.color.function_set_view_rate));
        hwHealthLineDataSet.a(Color.parseColor("#4cFF4065"), Color.parseColor("#00FF4065"), true);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        this.f48233b = hwHealthLineDataSet;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        if (fua.h()) {
            d(map);
        } else {
            c(map);
        }
        qdm.r();
    }

    private void d(Map<String, Object> map) {
        if (this.mContext == null) {
            LogUtil.a("FunctionSetHeartRateReader", "gotoHeartRateArkuiPage context is null");
            return;
        }
        LogUtil.a("FunctionSetHeartRateReader", "arkui OHProBridge start EntryEntryAbilityActivity");
        String str = this.h;
        String str2 = "HRV".equals(str) ? "1" : "0";
        map.put("arkUI", "1");
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_HEART_RATE_DETAIL_2010029.value(), map, 0);
        Intent intent = new Intent();
        intent.setClassName(this.mContext.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
        IntentParams intentParamsBuild = IntentParams.builder().addPageId(ArkUIXConstants.HEART_RATE).addPageType("0").addRecord("{'chooserType':" + str2 + ", 'entrance':\"" + str + "\"}").addBiFrom("Today_0001", "home_card", String.valueOf(this.mCardViewHolder.getLayoutPosition())).addTimeStamp(String.valueOf(this.j)).build();
        LogUtil.a("FunctionSetHeartRateReader", "params.toString()", intentParamsBuild.toString());
        intent.putExtra(com.alipay.sdk.m.s.e.n, intentParamsBuild.toString());
        intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 2);
        tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, true);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        FunctionSetBeanReader.MyHolder myHolder = (FunctionSetBeanReader.MyHolder) viewHolder;
        if (myHolder.f7091a == null) {
            return;
        }
        if (fua.b(this.mContext)) {
            myHolder.f7091a.setSingleLine(false);
            myHolder.f7091a.setMaxLines(3);
        }
        ReleaseLogUtil.d("TimeEat_FunctionSetHeartRateReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void c(Map<String, Object> map) {
        Intent intent;
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_HEART_RATE_DETAIL_2010029.value(), map, 0);
        try {
            ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).clickRecord(Integer.parseInt(AnalyticsValue.HEALTH_HOME_HEART_RATE_DETAIL_2010029.value()), getHuid());
        } catch (NumberFormatException e2) {
            LogUtil.e("FunctionSetHeartRateReader", "gotoHeartRateActivity exception ", LogAnonymous.b(e2));
        }
        if (fua.d(this.mContext)) {
            intent = new Intent(this.mContext, (Class<?>) HeartRateDetailActivity.class);
        } else {
            intent = new Intent(this.mContext, (Class<?>) KnitHeartRateActivity.class);
        }
        intent.putExtra("key_bundle_health_last_data_time", this.j);
        intent.setFlags(268435456);
        tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        a aVar = this.e;
        if (aVar == null) {
            LogUtil.j("FunctionSetHeartRateReader", "onDestroy mHandler is null");
        } else {
            aVar.removeCallbacksAndMessages(null);
        }
        ObserverManagerUtil.c(this.i);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_heart_rate);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.heart_default_img_big;
        }
        return R.drawable.marketing_default_img_heartrate;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        if (qqs.e(this.mContext)) {
            return R.color.function_marketing_big_card_heart_dark;
        }
        return R.color.function_marketing_big_card_heart;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_heart;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.d;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetHeartRateReader";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean == null) {
            return;
        }
        if (e()) {
            functionSetBean.b((CharSequence) this.m);
        } else {
            functionSetBean.b("");
        }
        notifyItemChanged(functionSetBean);
        ReleaseLogUtil.d("TimeEat_FunctionSetHeartRateReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return (TextUtils.isEmpty(this.m) || qdm.m()) ? false : true;
    }
}
