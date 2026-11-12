package defpackage;

import android.content.Context;
import android.content.Intent;
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
import com.huawei.haf.handler.BaseHandler;
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
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.seekbar.HealthSeekBarExtend;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity;
import com.tencent.open.apireq.BaseResp;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes43.dex */
public class sji extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f48172a = R.drawable.ic_health_progressbar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f48173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f48174c;
    private List<HwHealthBarEntry> d;
    private List<Integer> e;
    private boolean f;
    private final e g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private HealthSeekBarExtend l;
    private HwHealthLineDataSet m;
    private int n;
    private long o;

    static /* synthetic */ boolean d(int i, int i2, int i3) {
        return i2 - i <= i3;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == 18;
    }

    static class a extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Integer> f48176b;
        private List<Integer> d;
        private final WeakReference<sji> e;

        a(sji sjiVar) {
            super("FunctionSetBloodOxygenCardReader", null);
            this.e = new WeakReference<>(sjiVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(HiHealthData hiHealthData, List<Integer> list, int i, List<Integer> list2) {
            LogUtil.a("FunctionSetBloodOxygenCardReader", BleConstants.SAVE_HEALTH_DATA);
            if (hiHealthData == null) {
                sji.setHasCardData(this.e, false);
                sji.saveDataFromHealthApi("FunctionSetBloodOxygenCardReader", this.e, (HiHealthData) null);
                return;
            }
            sji.setHasCardData(this.e, true);
            HiHealthData hiHealthData2 = new HiHealthData();
            hiHealthData2.putInt("point_value", hiHealthData.getIntValue());
            hiHealthData2.setStartTime(hiHealthData.getStartTime());
            hiHealthData2.putInt("_u", hiHealthData.toString().hashCode());
            hiHealthData2.putInt("_t", i);
            this.f48176b = list;
            if (list != null) {
                hiHealthData2.putString("_", marshallListToString(list));
            }
            this.d = list2;
            if (njy.b(list2)) {
                hiHealthData2.putString("_a", marshallListToString(list2));
            }
            sji.saveDataFromHealthApi("FunctionSetBloodOxygenCardReader", this.e, hiHealthData2);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            LogUtil.a("FunctionSetBloodOxygenCardReader", "handleCacheData");
            sji sjiVar = this.e.get();
            if (sjiVar == null) {
                LogUtil.j("FunctionSetBloodOxygenCardReader", "handleCacheData bloodOxygenCardReader is null");
                return;
            }
            if (hiHealthData == null) {
                sji.setHasCardData(this.e, false);
                if (this.f48175a && z) {
                    LogUtil.a("FunctionSetBloodOxygenCardReader", "handleCacheData data is null and mIsShowData is true and isNewData is true");
                    Message messageObtainMessage = sjiVar.g.obtainMessage();
                    messageObtainMessage.what = 4;
                    messageObtainMessage.obj = sjiVar.buildEmptyCardBean();
                    sjiVar.g.sendMessage(messageObtainMessage);
                    sjiVar.o = 0L;
                    return;
                }
                return;
            }
            String strE = SharedPreferenceManager.e(sjiVar.mContext, String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS");
            sjiVar.i = (TextUtils.isEmpty(strE) || "false".equals(strE)) ? false : true;
            this.f48175a = true;
            if (sjiVar.f) {
                if (!z) {
                    this.f48176b = new ArrayList(0);
                    unmarshallListFromString(hiHealthData.getString("_"), this.f48176b);
                    if (sjiVar.i) {
                        this.d = new ArrayList(0);
                        unmarshallListFromString(hiHealthData.getString("_a"), this.d);
                    }
                }
                sjiVar.a(this.f48176b);
                sjiVar.b(this.d);
            }
            sjiVar.setHasCardData(true);
            sjiVar.c(hiHealthData.getInt("point_value"), hiHealthData.getStartTime(), hiHealthData.getInt("_u"), hiHealthData.getInt("_t"), z);
        }
    }

    public static class e extends BaseHandler<sji> {
        private e(sji sjiVar) {
            super(Looper.getMainLooper(), sjiVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(sji sjiVar, Message message) {
            int i = message.what;
            if (i == 4) {
                LogUtil.a("FunctionSetBloodOxygenCardReader", "handleMessageWhenReferenceNotNull MSG_UPDATE_BLOOD_OXYGEN");
                sjiVar.notifyItemChanged((FunctionSetBean) message.obj);
            } else if (i != 2333) {
                LogUtil.j("FunctionSetBloodOxygenCardReader", "handleMessageWhenReferenceNotNull what ", Integer.valueOf(i));
            } else {
                sjiVar.subscribeDataChange();
            }
        }
    }

    public sji(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetBloodOxygenCardReader", cardConfig);
        this.e = null;
        this.f = false;
        this.i = false;
        this.k = false;
        this.f48174c = new a(this);
        this.j = true;
        this.h = true;
        LogUtil.a("FunctionSetBloodOxygenCardReader", "FunctionSetBloodOxygenCardReader create, ", Integer.valueOf(hashCode()));
        this.g = new e();
        LogUtil.a("FunctionSetBloodOxygenCardReader", "FunctionSetBloodOxygenCardReader create finish, ", Integer.valueOf(hashCode()));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        this.j = false;
        ReleaseLogUtil.d("TimeEat_FunctionSetBloodOxygenCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isNeedRefreshOnResume() {
        if (!this.j) {
            String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS");
            boolean z = (TextUtils.isEmpty(strE) || "false".equals(strE)) ? false : true;
            boolean z2 = this.i;
            if (z2 != z) {
                LogUtil.a("FunctionSetBloodOxygenCardReader", "BLOOD_OXYGEN_CURVE_STATUS, mIsCurveOpen=", Boolean.valueOf(z2));
                readCardData();
                this.i = z;
                return false;
            }
        }
        return super.isNeedRefreshOnResume();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public int getExtraWidth() {
        return ContextCompat.getDrawable(this.mContext, f48172a).getIntrinsicWidth();
    }

    private void g() {
        LogUtil.a("FunctionSetBloodOxygenCardReader", "initSeekBar mSeekBarExtend is null");
        HealthSeekBarExtend healthSeekBarExtend = new HealthSeekBarExtend(this.mContext);
        this.l = healthSeekBarExtend;
        healthSeekBarExtend.setThumb(ContextCompat.getDrawable(this.mContext, f48172a));
        this.l.setProgressDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.health_halthdata_weight_seekbar_background));
        this.l.setRulerSrc(ContextCompat.getDrawable(this.mContext, R.drawable.health_seekbar_bg));
        this.l.setMax(460);
        this.l.setProgress(this.n);
    }

    private void b() {
        LogUtil.a("FunctionSetBloodOxygenCardReader", "initChartView mCardBloodOxygenView");
        if (this.f48173b == null) {
            this.f48173b = View.inflate(this.mContext, R.layout.card_blood_oxygen_view, null);
        }
        a();
        d();
    }

    private void a() {
        if (this.d == null) {
            LogUtil.j("FunctionSetBloodOxygenCardReader", "configBarChart mBarEntryValues is null");
            return;
        }
        HwHealthBarChart hwHealthBarChart = (HwHealthBarChart) this.f48173b.findViewById(R.id.blood_oxygen_barchart);
        if (hwHealthBarChart != null) {
            hwHealthBarChart.setTouchEnabled(false);
        }
        HwHealthBarDataSet hwHealthBarDataSet = new HwHealthBarDataSet(this.d, "bar breif", "bar label", "bar unit");
        hwHealthBarDataSet.e(HwHealthBarDataSet.DrawColorMode.DATA_COLOR);
        hwHealthBarDataSet.setBarDrawWidth(0.5f);
        hwHealthBarDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        if (hwHealthBarChart != null) {
            hwHealthBarChart.getXAxis().setEnabled(false);
            HwHealthYAxis axisFirstParty = hwHealthBarChart.getAxisFirstParty();
            axisFirstParty.setDrawLabels(false);
            axisFirstParty.setDrawGridLines(false);
            axisFirstParty.setDrawAxisLine(false);
            axisFirstParty.setAxisMinimum(0.0f);
            axisFirstParty.setAxisMaximum(100.0f);
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(hwHealthBarDataSet);
            hwHealthBarChart.setData(new qly(arrayList));
            hwHealthBarChart.refresh();
        }
    }

    private void d() {
        HwHealthLineChart hwHealthLineChart = (HwHealthLineChart) this.f48173b.findViewById(R.id.blood_oxygen_linechart);
        if (hwHealthLineChart == null) {
            LogUtil.e("FunctionSetBloodOxygenCardReader", "lineChart is null");
            return;
        }
        LogUtil.a("FunctionSetBloodOxygenCardReader", "configLineChart mIsCurveOpen:", Boolean.valueOf(this.i), " mLineDataSet is null?", Boolean.valueOf(this.m == null));
        if (this.m == null || !this.i) {
            hwHealthLineChart.setVisibility(8);
            return;
        }
        hwHealthLineChart.setVisibility(0);
        hwHealthLineChart.setTouchEnabled(false);
        hwHealthLineChart.getXAxis().setEnabled(false);
        hwHealthLineChart.getDescription().setEnabled(false);
        HwHealthYAxis axisFirstParty = hwHealthLineChart.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setDrawAxisLine(false);
        hwHealthLineChart.disableLabelsForce();
        ArrayList arrayList = new ArrayList(0);
        arrayList.add(this.m);
        hwHealthLineChart.setData(new qnt(arrayList));
        hwHealthLineChart.refresh();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetBloodOxygenCardReader", "initViewData mIsContinuousBloodOxygen is ", Boolean.valueOf(this.f));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(18);
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(arrayList, new FunctionSetBeanReader.e("FunctionSetBloodOxygenCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetBloodOxygenCardReader", "unsubscribeDataChange");
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.e, new FunctionSetBeanReader.c("FunctionSetBloodOxygenCardReader", "onDestroy unSubscribeBloodOxygenData isSuccess :"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(double d, long j, int i, int i2, boolean z) {
        this.o = j;
        setBiHasData(j);
        setBiHasDataType(this.f ? "continuous" : "single");
        String strB = tfc.b(j);
        LogUtil.a("FunctionSetBloodOxygenCardReader", "refreshBloodOxygenDataAndTime mIsContinuousBloodOxygen= ", Boolean.valueOf(this.f), " ,mLastDataTime= ", Long.valueOf(j), " ,lastBloodOxygen= ", Double.valueOf(d), " ,mIsCurveOpen= ", Boolean.valueOf(this.i), ", altitude= ", Integer.valueOf(i2), ", uniqueCode= ", Integer.valueOf(i), ", isNewData= ", Boolean.valueOf(z));
        if (!this.f) {
            this.n = d(qqg.e(d));
        }
        String strE = UnitUtil.e(d, 2, 0);
        FunctionSetBean.c cVar = new FunctionSetBean.c(this.mContext.getResources().getString(R.string.IDS_hw_health_blood_oxygen));
        cVar.e(c(strE));
        cVar.d(strB);
        cVar.g(tfc.d(this.o));
        cVar.e(FunctionSetType.BLOOD_OXYGEN_CARD);
        cVar.c(FunctionSetBean.ViewType.DATA_VIEW);
        cVar.b(this.mContext);
        cVar.c(this.f + "," + this.i);
        if (this.f && this.i && i2 > -1001) {
            cVar.j(this.mContext.getResources().getQuantityString(R.plurals.IDS_blood_oxygen_altitude, i2, UnitUtil.e(i2, 1, 0)));
            this.k = true;
        }
        FunctionSetBean functionSetBeanA = cVar.a();
        functionSetBeanA.d(i);
        if (z) {
            Message messageObtainMessage = this.g.obtainMessage();
            messageObtainMessage.what = 4;
            messageObtainMessage.obj = functionSetBeanA;
            this.g.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanA);
    }

    private CharSequence c(String str) {
        return tfc.b("[\\d\\-]", str);
    }

    private int d(int i) {
        LogUtil.d("FunctionSetBloodOxygenCardReader", "the last progress data is ", Integer.valueOf(i));
        if (i < 0) {
            return 0;
        }
        if (i > 460) {
            return 460;
        }
        LogUtil.d("FunctionSetBloodOxygenCardReader", "the progress is normal");
        return i;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        ReleaseLogUtil.d("TimeEat_FunctionSetBloodOxygenCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        super.readCardData();
        LogUtil.a("FunctionSetBloodOxygenCardReader", "readCardData");
        if (this.h) {
            this.h = false;
            mhs.a().getSwitchSetting("custom.blood.oxygen.switch", new IBaseResponseCallback() { // from class: sjk
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f48177c.d(i, obj);
                }
            });
        } else if (this.f) {
            c();
        } else {
            e();
        }
    }

    /* synthetic */ void d(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            LogUtil.j("FunctionSetBloodOxygenCardReader", "getSwitchSetting errorCode ", Integer.valueOf(i));
        } else {
            String str = (String) obj;
            LogUtil.a("FunctionSetBloodOxygenCardReader", "getSwitchSetting buttonSwitch ", str);
            this.f = "1".equals(str);
        }
        this.g.sendEmptyMessage(2333);
        readCardData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HiHealthData hiHealthData, List<HiHealthData> list, int i, List<HiHealthData> list2) {
        List<Long> listB = b(hiHealthData);
        TreeMap<Long, Integer> treeMapA = a(listB, list);
        ArrayList arrayList = null;
        List<List<Integer>> listE = njy.b(list2) ? e(listB, treeMapA, list2) : null;
        ArrayList arrayList2 = new ArrayList(treeMapA.values());
        c(arrayList2, listE);
        if (njy.b(listE)) {
            arrayList = new ArrayList(0);
            for (List<Integer> list3 : listE) {
                for (int size = list3.size() - 1; size >= 0; size--) {
                    arrayList.add(Integer.valueOf(list3.get(size).intValue() + 1001));
                }
            }
        }
        this.f48174c.e(hiHealthData, arrayList2, i, arrayList);
    }

    private void c(List<Integer> list, List<List<Integer>> list2) {
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext() && it.next().intValue() == 0) {
            it.remove();
            i++;
        }
        for (int i2 = 0; i2 < i; i2++) {
            list.add(0);
        }
        if (njy.b(list2)) {
            Collections.reverse(list2);
            Iterator<List<Integer>> it2 = list2.iterator();
            for (int i3 = i; i3 > 0 && it2.hasNext(); i3--) {
                it2.next();
                it2.remove();
            }
            for (int i4 = 0; i4 < i; i4++) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(BaseResp.CODE_QQ_LOW_VERSION));
                list2.add(arrayList);
            }
        }
    }

    private List<Long> b(HiHealthData hiHealthData) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData.getStartTime());
        if (calendar.get(12) >= 30) {
            calendar.set(12, 30);
        } else {
            calendar.set(12, 0);
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
        long jP = HiDateUtil.p(hiHealthData.getStartTime());
        ArrayList arrayList = new ArrayList(16);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(calendar.getTimeInMillis());
        arrayList.add(Long.valueOf(bigDecimalValueOf.longValue()));
        for (int i = 1; i < 16; i++) {
            bigDecimalValueOf = bigDecimalValueOf.subtract(BigDecimal.valueOf(1800000L));
            long jLongValue = bigDecimalValueOf.longValue();
            if (jLongValue < jP) {
                break;
            }
            arrayList.add(Long.valueOf(jLongValue));
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < 16 - size; i2++) {
            calendar.add(12, 30);
            arrayList.add(0, Long.valueOf(calendar.getTimeInMillis()));
        }
        return arrayList;
    }

    private TreeMap<Long, Integer> a(List<Long> list, List<HiHealthData> list2) {
        TreeMap<Long, Integer> treeMap = new TreeMap<>(new sjm());
        int i = 0;
        for (Long l : list) {
            long jLongValue = l.longValue();
            int intValue = 0;
            int i2 = 0;
            while (i < list2.size()) {
                HiHealthData hiHealthData = list2.get(i);
                if (hiHealthData.getStartTime() < jLongValue) {
                    break;
                }
                i++;
                intValue += hiHealthData.getIntValue();
                i2++;
            }
            if (i2 == 0) {
                treeMap.put(l, 0);
            } else {
                treeMap.put(l, Integer.valueOf(Math.round(intValue / i2)));
            }
        }
        return treeMap;
    }

    private List<List<Integer>> e(List<Long> list, TreeMap<Long, Integer> treeMap, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<Long> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            while (i < list2.size()) {
                HiHealthData hiHealthData = list2.get(i);
                if (hiHealthData.getStartTime() < jLongValue) {
                    break;
                }
                i++;
                arrayList2.add(Integer.valueOf(hiHealthData.getIntValue()));
            }
            ArrayList arrayList3 = new ArrayList(3);
            if (arrayList2.isEmpty()) {
                arrayList3.add(Integer.valueOf(BaseResp.CODE_QQ_LOW_VERSION));
                arrayList.add(arrayList3);
            } else if (arrayList2.size() > 3) {
                arrayList3.add((Integer) arrayList2.get(0));
                arrayList3.add((Integer) arrayList2.get(arrayList2.size() / 2));
                arrayList3.add((Integer) arrayList2.get(arrayList2.size() - 1));
                arrayList.add(arrayList3);
            } else {
                arrayList3.addAll(arrayList2);
                arrayList.add(arrayList3);
            }
            arrayList2.clear();
        }
        return arrayList;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        if (njy.e(list)) {
            LogUtil.j("FunctionSetBloodOxygenCardReader", "updateSuccessList successList is empty");
        } else {
            this.e = list;
            LogUtil.a("FunctionSetBloodOxygenCardReader", "updateSuccessList mBloodOxygenSuccessList size ", Integer.valueOf(list.size()));
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("FunctionSetBloodOxygenCardReader", "createCardView mIsContinuousBloodOxygen ", Boolean.valueOf(this.f));
        if (this.f) {
            b();
            return this.f48173b;
        }
        g();
        return this.l;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        if (qrs.c(500)) {
            LogUtil.j("FunctionSetBloodOxygenCardReader", "onCardViewClickListener is fast click");
            return;
        }
        LogUtil.a("FunctionSetBloodOxygenCardReader", "onCardViewClickListener");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("from", "1");
        String strValue = AnalyticsValue.HEALTH_HOME_BLOOD_OXYGEN_DETAIL_2010099.value();
        if (!this.hasCardData) {
            map.put("click", "0");
        } else {
            map.put("click", "1");
        }
        if (this.k) {
            map.put("click", "2");
        }
        lmf.d().c(this.mContext, strValue, map, 0);
        try {
            ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).clickRecord(Integer.parseInt(strValue), getHuid());
        } catch (NumberFormatException e2) {
            LogUtil.e("FunctionSetBloodOxygenCardReader", "onCardViewClickListener exception ", LogAnonymous.b(e2));
        }
        Intent intent = new Intent(this.mContext, (Class<?>) KnitBloodOxygenDetailActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("key_bundle_health_last_data_time", this.o);
        tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        if (njy.e(this.e)) {
            LogUtil.j("FunctionSetBloodOxygenCardReader", "onDestroy mBloodOxygenSuccessList is empty");
        } else {
            unsubscribeDataChange();
        }
        e eVar = this.g;
        if (eVar == null) {
            LogUtil.j("FunctionSetBloodOxygenCardReader", "onDestroy mHandler is null");
        } else {
            eVar.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Integer> list) {
        HwHealthBarEntry hwHealthBarEntry;
        if (njy.e(list)) {
            return;
        }
        LogUtil.a("FunctionSetBloodOxygenCardReader", "initBarChart size ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(16);
        Pair<Integer, Integer> pairD = d(list);
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            int iIntValue = num.intValue();
            if (iIntValue > 0) {
                int iE = e(iIntValue);
                hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(a(pairD, list.get(i).intValue()), iE, iE));
                LogUtil.d("FunctionSetBloodOxygenCardReader", "initBarChart data value ", num);
            } else {
                int color = ContextCompat.getColor(this.mContext, R.color.health_chart_extend_background_color);
                hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(20.0f, color, color));
            }
            arrayList.add(hwHealthBarEntry);
        }
        this.d = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Integer> list) {
        if (!this.i || njy.e(list)) {
            this.m = null;
            return;
        }
        LogUtil.a("FunctionSetBloodOxygenCardReader", "setLineDataSet size ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(0);
        for (int i = 0; i < list.size(); i++) {
            float fIntValue = list.get(i).intValue();
            if (fIntValue > 0.0f) {
                arrayList.add(new HwHealthBaseEntry(i, fIntValue));
            }
        }
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, "line brief", "line label", "line unit");
        hwHealthLineDataSet.c(1);
        hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: sjj
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i2, int i3, int i4) {
                return sji.d(i2, i3, i4);
            }
        });
        hwHealthLineDataSet.setColor(ContextCompat.getColor(this.mContext, R.color.blood_oxygen_altitude_blue_color));
        hwHealthLineDataSet.a(Color.argb(102, 0, 199, com.huawei.hms.kit.awareness.barrier.internal.e.a.A), Color.argb(0, 0, 199, com.huawei.hms.kit.awareness.barrier.internal.e.a.A), true);
        hwHealthLineDataSet.setDrawFilled(true);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        this.m = hwHealthLineDataSet;
    }

    private float a(Pair<Integer, Integer> pair, int i) {
        int iIntValue = ((Integer) pair.first).intValue();
        int iIntValue2 = ((Integer) pair.second).intValue();
        if (iIntValue == iIntValue2) {
            return 100;
        }
        return 40 + ((i - iIntValue) * (60 / (iIntValue2 - iIntValue)));
    }

    private Pair<Integer, Integer> d(List<Integer> list) {
        int iIntValue = 100;
        int iIntValue2 = 0;
        for (Integer num : list) {
            if (num.intValue() != 0) {
                if (num.intValue() < iIntValue) {
                    iIntValue = num.intValue();
                }
                if (num.intValue() > iIntValue2) {
                    iIntValue2 = num.intValue();
                }
            }
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    private int e(int i) {
        int i2;
        if (i >= 90) {
            i2 = com.huawei.ui.main.R.color.blood_oxygen_level_deep_green_selected_color;
        } else if (i >= 70) {
            i2 = com.huawei.ui.main.R.color.blood_oxygen_level_orange_selected_color;
        } else {
            i2 = com.huawei.ui.main.R.color.blood_oxygen_level_red_selected_color;
        }
        return ContextCompat.getColor(this.mContext, i2);
    }

    private void e() {
        HiDataReadOption hiDataReadOptionC = c(0L, System.currentTimeMillis(), 1);
        hiDataReadOptionC.setType(new int[]{2103});
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOptionC, new b(0));
    }

    private void c() {
        HiDataReadOption hiDataReadOptionC = c(0L, System.currentTimeMillis(), 0);
        hiDataReadOptionC.setType(new int[]{2103, DicDataTypeUtil.DataType.ALTITUDE_TYPE.value()});
        HiHealthManager.d(this.mContext).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOptionC).a(true).b(), new b(1));
    }

    private HiDataReadOption c(long j, long j2, int i) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(i);
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(1);
        return hiDataReadOption;
    }

    static class b implements HiDataReadResultListener {
        private final WeakReference<sji> d;
        private final int e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private b(sji sjiVar, int i) {
            this.d = new WeakReference<>(sjiVar);
            this.e = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            sji sjiVar = this.d.get();
            if (sjiVar == null) {
                LogUtil.j("FunctionSetBloodOxygenCardReader", "onResult reader is null");
                return;
            }
            LogUtil.a("FunctionSetBloodOxygenCardReader", "onResult, errorCode= ", Integer.valueOf(i));
            boolean z = obj instanceof SparseArray;
            int intValue = BaseResp.CODE_QQ_LOW_VERSION;
            if (!z) {
                LogUtil.j("FunctionSetBloodOxygenCardReader", "data not instanceof SparseArray");
                sjiVar.f48174c.e(null, null, BaseResp.CODE_QQ_LOW_VERSION, null);
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            Object obj2 = sparseArray.get(2103);
            if (!(obj2 instanceof List)) {
                LogUtil.j("FunctionSetBloodOxygenCardReader", "bloodOxygenData not instanceof List");
                sjiVar.f48174c.e(null, null, BaseResp.CODE_QQ_LOW_VERSION, null);
                return;
            }
            List list = (List) obj2;
            if (list.isEmpty()) {
                LogUtil.j("FunctionSetBloodOxygenCardReader", "bloodOxygenData isEmpty");
                sjiVar.f48174c.e(null, null, BaseResp.CODE_QQ_LOW_VERSION, null);
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            SharedPreferenceManager.c("privacy_center", "blood_oxygen", String.valueOf(hiHealthData.getStartTime()));
            if (this.e == 0) {
                sjiVar.f48174c.e(hiHealthData, null, BaseResp.CODE_QQ_LOW_VERSION, null);
                return;
            }
            Object obj3 = sparseArray.get(DicDataTypeUtil.DataType.ALTITUDE_TYPE.value());
            List list2 = obj3 instanceof List ? (List) obj3 : null;
            if (!njy.b(list2)) {
                LogUtil.j("FunctionSetBloodOxygenCardReader", "altitudes is null");
            } else {
                intValue = ((HiHealthData) list2.get(0)).getIntValue();
            }
            sjiVar.d(hiHealthData, list, intValue, list2);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_blood_oxygen);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.blood_oxygen_default_img_big;
        }
        return R.drawable.marketing_default_img_bloodoxygen;
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
        return R.string.IDS_function_set_card_button_blood_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f48174c;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetBloodOxygenCardReader";
    }
}
