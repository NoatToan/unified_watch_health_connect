package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.seekbar.HealthSeekBarExtend;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ska extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f48228c;
    private List<Integer> d;
    private d f;
    private long g;
    private int h;
    private double i;
    private b j;
    private a k;
    private HwHealthLineDataSet l;
    private HwHealthLineChart m;
    private List<HiHealthData> n;
    private String o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f48226a = R.drawable.ic_health_progressbar;
    private static final int e = Color.parseColor("#4cFF4065");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f48227b = Color.parseColor("#00FF4065");

    static class b extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Float> f48230a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ska> f48231c;
        private boolean d;

        b(ska skaVar) {
            super("FunctionSetBloodSugarCardReader", null);
            this.f48231c = new WeakReference<>(skaVar);
        }

        void d(HiHealthData hiHealthData, List<Float> list) {
            ska skaVar = this.f48231c.get();
            if (skaVar == null) {
                LogUtil.j("FunctionSetBloodSugarCardReader", "saveHealthData bloodSugarCardReader is null");
                return;
            }
            if (hiHealthData == null) {
                ska.setHasCardData(this.f48231c, false);
                ska.saveDataFromHealthApi("FunctionSetBloodSugarCardReader", this.f48231c, (HiHealthData) null);
                return;
            }
            ska.setHasCardData(this.f48231c, true);
            HiHealthData hiHealthData2 = new HiHealthData();
            hiHealthData2.setStartTime(hiHealthData.getStartTime());
            hiHealthData2.setEndTime(hiHealthData.getEndTime());
            hiHealthData2.putInt("_u", hiHealthData.toString().hashCode());
            hiHealthData2.putDouble("point_value", hiHealthData.getDouble("point_value"));
            hiHealthData2.putString("_t", uvz.b(skaVar.mContext, hiHealthData.getType()));
            hiHealthData2.putInt("_l", hiHealthData.getType());
            if (hiHealthData.getType() == 2108) {
                hiHealthData2.putString("_", marshallListToString(list));
                this.f48230a = list;
            }
            LogUtil.a("FunctionSetBloodSugarCardReader", "showBloodSugar onResult called save, ", hiHealthData2.toString());
            ska.saveDataFromHealthApi("FunctionSetBloodSugarCardReader", this.f48231c, hiHealthData2);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            ska skaVar = this.f48231c.get();
            if (skaVar == null) {
                LogUtil.j("FunctionSetBloodSugarCardReader", "handleCacheData bloodSugarCardReader is null");
                return;
            }
            if (hiHealthData == null) {
                ska.setHasCardData(this.f48231c, false);
                if (this.d && z) {
                    skaVar.h();
                    return;
                }
                return;
            }
            this.d = true;
            skaVar.i = hiHealthData.getDouble("point_value");
            skaVar.h = hiHealthData.getInt("_l");
            String string = hiHealthData.getString("_t");
            if (skaVar.h == 2108) {
                skaVar.o = "BLOOD_SUGAR_CONTINUE";
                if (!z) {
                    ArrayList arrayList = new ArrayList(0);
                    unmarshallListFromString(hiHealthData.getString("_"), arrayList);
                    this.f48230a = arrayList;
                }
                skaVar.d(this.f48230a);
            } else {
                skaVar.o = "BLOOD_SUGAR_FINGER_TIP";
                LogUtil.a("FunctionSetBloodSugarCardReader", "handleCacheData showBloodSugarDataView : timePeriod = ", string, ", mLastDataType = ", Integer.valueOf(skaVar.h), ", mLastBloodSugar = ", Double.valueOf(skaVar.i));
            }
            LogUtil.a("FunctionSetBloodSugarCardReader", "showBloodSugar onResult called refresh, ", hiHealthData.toString());
            skaVar.c(hiHealthData.getDouble("point_value"), hiHealthData.getEndTime(), hiHealthData.getInt("_u"), string, z);
        }
    }

    public static class d extends BaseHandler<ska> {
        public d(ska skaVar) {
            super(Looper.getMainLooper(), skaVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ska skaVar, Message message) {
            LogUtil.a("FunctionSetBloodSugarCardReader", "handleMessageWhenReferenceNotNull()");
            if (skaVar == null || message == null) {
                LogUtil.a("FunctionSetBloodSugarCardReader", "handleMessageWhenReferenceNotNull obj or msg == null !");
                return;
            }
            int i = message.what;
            if (i == 0) {
                LogUtil.a("FunctionSetBloodSugarCardReader", "handleMessageWhenReferenceNotNull : refreshData");
                skaVar.notifyItemChanged((FunctionSetBean) message.obj);
                return;
            }
            if (i == 1) {
                if (message.obj instanceof List) {
                    skaVar.g = message.getData().getLong("key_last_time");
                    skaVar.n = (List) message.obj;
                    LogUtil.a("FunctionSetBloodSugarCardReader", "MSG_UPDATE_DAY_DATA, size=", Integer.valueOf(skaVar.n.size()));
                    return;
                } else {
                    skaVar.g = 0L;
                    skaVar.n = null;
                    LogUtil.a("FunctionSetBloodSugarCardReader", "MSG_UPDATE_DAY_DATA, size= ");
                    return;
                }
            }
            LogUtil.j("FunctionSetBloodSugarCardReader", "unkonw msg");
        }
    }

    public ska(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetBloodSugarCardReader", cardConfig);
        this.f48228c = new ArrayList(3);
        this.j = new b(this);
        this.d = null;
        this.h = 0;
        this.g = 0L;
        this.i = 0.0d;
        this.f = new d(this);
        subscribeDataChange();
        c();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: sjz
            @Override // java.lang.Runnable
            public final void run() {
                ska.e();
            }
        });
    }

    static /* synthetic */ void e() {
        HiUserPreference hiUserPreferenceA = nkb.d().a(BaseApplication.b(), "BLOOD_SUGAR_CONTINUE_MAX_THRESHOLD");
        HiUserPreference hiUserPreferenceA2 = nkb.d().a(BaseApplication.b(), "BLOOD_SUGAR_CONTINUE_MIN_THRESHOLD");
        String strValueOf = String.valueOf(10.0f);
        if (hiUserPreferenceA != null && StringUtils.j(hiUserPreferenceA.getValue())) {
            strValueOf = hiUserPreferenceA.getValue();
        }
        String strValueOf2 = String.valueOf(3.9f);
        if (hiUserPreferenceA2 != null && StringUtils.j(hiUserPreferenceA2.getValue())) {
            strValueOf2 = hiUserPreferenceA2.getValue();
        }
        emq.a("BLOOD_SUGAR_CONTINUE_MAX_THRESHOLD", strValueOf);
        emq.a("BLOOD_SUGAR_CONTINUE_MIN_THRESHOLD", strValueOf2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(double d2, long j, int i, String str, boolean z) {
        String strA;
        CommonUtil.d("FunctionSetBloodSugarCardReader", "-refreshBloodSugarDataAndTime enter");
        setHasCardData(true);
        setBiHasData(j);
        CharSequence charSequenceD = tfc.d(j);
        if (lsl.i(j, System.currentTimeMillis())) {
            strA = DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MD) + " " + str;
            LogUtil.a("FunctionSetBloodSugarCardReader", "shortDate", strA);
            charSequenceD = ((Object) charSequenceD) + " " + str;
        } else {
            strA = DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD);
        }
        double d3 = UnitUtil.d(Math.abs(d2), 1);
        String strE = UnitUtil.e(d3, 1, 1);
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(qre.f(R.string.IDS_hw_show_main_home_page_bloodsugar)).d(strA).g(charSequenceD).e(tfc.d(BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_health_bloodsugar_mmol, UnitUtil.e(d3), strE), strE)).e(FunctionSetType.BLOOD_SUGAR_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).b(this.mContext).a();
        functionSetBeanA.d(i);
        if (z) {
            Message messageObtainMessage = this.f.obtainMessage();
            messageObtainMessage.what = 0;
            messageObtainMessage.obj = functionSetBeanA;
            this.f.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanA);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        ReleaseLogUtil.d("TimeEat_FunctionSetBloodSugarCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void c(String str) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.mContext.getApplicationContext(), str, map, 0);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return this.f48228c.contains(Integer.valueOf(i));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        super.readCardData();
        LogUtil.a("FunctionSetBloodSugarCardReader", "showBloodSugar readCardData called");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(uvz.e());
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setReadType(0);
        nkb.d().c(this.mContext, HiDataReadProOption.builder().e(hiDataReadOption).a(true).b(), new e(this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void initCardData() {
        sis.e().d(new nkb.a(new e(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            HiHealthData hiHealthData = list.get(size);
            if (hiHealthData.getEndTime() <= jCurrentTimeMillis) {
                break;
            } else {
                LogUtil.j("FunctionSetBloodSugarCardReader", "bloodSugarTime=", Long.valueOf(hiHealthData.getEndTime()), ", currentTime=", Long.valueOf(jCurrentTimeMillis));
            }
        }
        HiHealthData hiHealthData2 = list.get(size);
        SharedPreferenceManager.c("privacy_center", "blood_sugar", String.valueOf(hiHealthData2.getStartTime()));
        LogUtil.a("FunctionSetBloodSugarCardReader", "showBloodSugar onResult called data, ", hiHealthData2.toString());
        this.j.d(hiHealthData2, hiHealthData2.getType() == 2108 ? e(list.subList(0, size)) : null);
    }

    private List<Float> e(List<HiHealthData> list) {
        int iRound;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((HiHealthData) it.next()).getType() != 2108) {
                it.remove();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(arrayList)) {
            LogUtil.j("FunctionSetBloodSugarCardReader", "tempList is empty");
            return arrayList2;
        }
        if (arrayList.size() > 50.0f) {
            iRound = Math.round(arrayList.size() / 50.0f);
            LogUtil.a("FunctionSetBloodSugarCardReader", "size = ", Integer.valueOf(arrayList.size()), ", interval = ", Integer.valueOf(iRound));
        } else {
            iRound = 1;
        }
        long endTime = 0;
        int i = 0;
        while (true) {
            int i2 = iRound * i;
            if (i2 >= arrayList.size() - 1) {
                break;
            }
            HiHealthData hiHealthData = (HiHealthData) arrayList.get(i2);
            if (hiHealthData.getEndTime() - endTime > 2100000) {
                arrayList2.add(Float.valueOf(0.0f));
            }
            arrayList2.add(Float.valueOf(hiHealthData.getFloatValue()));
            endTime = hiHealthData.getEndTime();
            i++;
        }
        HiHealthData hiHealthData2 = (HiHealthData) arrayList.get(arrayList.size() - 1);
        if (hiHealthData2.getEndTime() - endTime > 2100000) {
            arrayList2.add(Float.valueOf(0.0f));
        }
        arrayList2.add(Float.valueOf(hiHealthData2.getFloatValue()));
        return arrayList2;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetBloodSugarCardReader", "subscribeBloodSugarData, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetBloodSugarCardReader", "registerBloodSugarListener success");
        this.d = list;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetBloodSugarCardReader", "subscribeBloodSugarData");
        if (njy.e(this.f48228c)) {
            this.f48228c.add(102);
            this.f48228c.add(Integer.valueOf(HiSubscribeType.f12260b));
            this.f48228c.add(Integer.valueOf(HiSubscribeType.e));
        }
        this.k = new a("FunctionSetBloodSugarCardReader", this);
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(this.f48228c, this.k);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetBloodSugarCardReader", "unSubscribeBloodSugarData");
        List<Integer> list = this.d;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.d, new FunctionSetBeanReader.c("FunctionSetBloodSugarCardReader", "unSubscribeBloodSugarData, isSuccess :"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("FunctionSetBloodSugarCardReader", "show empty view!");
        setHasCardData(false);
        FunctionSetBean functionSetBeanBuildEmptyCardBean = buildEmptyCardBean();
        Message messageObtainMessage = this.f.obtainMessage();
        messageObtainMessage.what = 0;
        messageObtainMessage.obj = functionSetBeanBuildEmptyCardBean;
        this.f.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.mContext.getResources().getString(R.string.IDS_hw_show_main_home_page_bloodsugar)).e(FunctionSetType.BLOOD_SUGAR_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).c(this.mContext.getResources().getString(R.string.IDS_hw_show_main_home_page_bloodsugar_description)).b(this.mContext).a();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        if ("BLOOD_SUGAR_CONTINUE".equals(this.o)) {
            return a();
        }
        return d();
    }

    private View a() {
        HwHealthLineChart hwHealthLineChart = this.m;
        if (hwHealthLineChart == null) {
            hwHealthLineChart = (HwHealthLineChart) View.inflate(this.mContext, R.layout.card_heart_view, null).findViewById(R.id.linechart);
            this.m = hwHealthLineChart;
            int intrinsicWidth = ContextCompat.getDrawable(this.mContext, f48226a).getIntrinsicWidth() / 2;
            this.m.setPadding(intrinsicWidth, 0, intrinsicWidth, 0);
            hwHealthLineChart.setTouchEnabled(false);
            hwHealthLineChart.getXAxis().setEnabled(false);
            hwHealthLineChart.getDescription().setEnabled(false);
            HwHealthYAxis axisFirstParty = hwHealthLineChart.getAxisFirstParty();
            axisFirstParty.setDrawLabels(false);
            axisFirstParty.setDrawGridLines(false);
            axisFirstParty.setDrawAxisLine(false);
            hwHealthLineChart.disableLabelsForce();
        }
        HwHealthLineDataSet hwHealthLineDataSet = this.l;
        if (hwHealthLineDataSet == null) {
            LogUtil.j("FunctionSetBloodSugarCardReader", "createCardView bloodSugarSet is null");
            return null;
        }
        qnt qntVar = (qnt) hwHealthLineChart.getData();
        if (qntVar == null) {
            qntVar = new qnt(new ArrayList(1));
            hwHealthLineChart.setData(qntVar);
        }
        List dataSets = qntVar.getDataSets();
        if (dataSets == null) {
            dataSets = new ArrayList(1);
        }
        if (dataSets.size() != 0 && dataSets.get(0) == hwHealthLineDataSet) {
            return hwHealthLineChart;
        }
        HwHealthYAxis axisFirstParty2 = hwHealthLineChart.getAxisFirstParty();
        axisFirstParty2.setAxisMinimum(hwHealthLineDataSet.getYMin() - 10.0f);
        axisFirstParty2.setAxisMaximum(hwHealthLineDataSet.getYMax() + 10.0f);
        dataSets.clear();
        dataSets.add(hwHealthLineDataSet);
        hwHealthLineChart.refresh();
        return hwHealthLineChart;
    }

    private View d() {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.card_blood_pressure_blood_sugar, (ViewGroup) null);
        HealthSeekBarExtend healthSeekBarExtend = (HealthSeekBarExtend) viewInflate.findViewById(R.id.blood_sugar_seek_bar);
        int i = 460;
        healthSeekBarExtend.setMax(460);
        healthSeekBarExtend.setThumb(this.mContext.getResources().getDrawable(f48226a));
        int iC = uvz.c(this.h, (float) this.i);
        LogUtil.d("FunctionSetBloodSugarCardReader", "progress = ", Integer.valueOf(iC));
        if (iC < 0) {
            i = 0;
        } else if (iC <= 460) {
            LogUtil.d("FunctionSetBloodSugarCardReader", "The progress is normal. No special handling is required.");
            i = iC;
        }
        healthSeekBarExtend.setProgress(i);
        if (this.h == 2008) {
            healthSeekBarExtend.setRulerSrc(this.mContext.getResources().getDrawable(R.drawable.card_blood_sugar_limosis_bar));
            return viewInflate;
        }
        healthSeekBarExtend.setRulerSrc(this.mContext.getResources().getDrawable(R.drawable.card_blood_sugar_not_limosis_bar));
        return viewInflate;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public int getExtraWidth() {
        return ContextCompat.getDrawable(this.mContext, f48226a).getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Float> list) {
        if (njy.e(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            float fFloatValue = list.get(i).floatValue();
            if (fFloatValue > 0.0f) {
                arrayList.add(new HwHealthBaseEntry(i, fFloatValue));
            }
        }
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, "line brief", "line label", "line unit");
        hwHealthLineDataSet.c(1);
        hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: ska.4
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i2, int i3, int i4) {
                return i3 - i2 <= i4;
            }
        });
        hwHealthLineDataSet.setColor(ContextCompat.getColor(this.mContext, R.color.function_set_view_rate));
        hwHealthLineDataSet.a(e, f48227b, true);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        hwHealthLineDataSet.setLineWidth(2.0f);
        this.l = hwHealthLineDataSet;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        if (viewType == FunctionSetBean.ViewType.DATA_VIEW) {
            LogUtil.a("FunctionSetBloodSugarCardReader", "go to bloodDataView BLOOD_SUGAR_CARD record");
            c(AnalyticsValue.HEALTH_HOME_BLOOD_SUGAR_DETAIL_2010027.value());
            HashMap map = new HashMap(16);
            map.put("type", 0);
            String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_JUMP_DETAIL_2040132.value();
            map.put("click", "1");
            idy.b(strValue, map);
            if (this.n != null) {
                ula.c().d(HiDateUtil.p(this.g), this.n);
            }
            c("BloodSugarCardConstructor", 8, this.g);
            return;
        }
        LogUtil.a("FunctionSetBloodSugarCardReader", "go to forEmptyView BLOOD_SUGAR_CARD record");
        c(AnalyticsValue.HEALTH_HOME_BLOOD_SUGAR_DETAIL_2010027.value());
        c("BloodSugarCardConstructor", 8, 0L);
    }

    private void c(String str, int i, long j) {
        Intent intent = new Intent(this.mContext, (Class<?>) HealthDataDetailActivity.class);
        intent.putExtra("extra_service_id", str);
        intent.putExtra("extra_time_stamp", j);
        intent.putExtra("extra_page_type", i);
        tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        String strD = uvz.d(this.mContext, "key_day_data");
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e("FunctionSetBloodSugarCardReader", "data is null");
            return;
        }
        try {
            lsr.c(strD, getClass().getClassLoader(), null, arrayList);
            if (!arrayList.isEmpty()) {
                Object obj = arrayList.get(arrayList.size() - 1);
                if (obj instanceof HiHealthData) {
                    this.g = ((HiHealthData) obj).getStartTime();
                }
            }
            this.n = arrayList;
            LogUtil.a("FunctionSetBloodSugarCardReader", "refreshDayDataFromSp, size=", Integer.valueOf(arrayList.size()));
        } catch (ClassCastException unused) {
            LogUtil.e("FunctionSetBloodSugarCardReader", "ClassCastException");
            this.n = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list) {
        String strE;
        if (list != null && !list.isEmpty()) {
            strE = lsr.e(list, null);
        } else {
            strE = "";
        }
        uvz.d(this.mContext, "key_day_data", strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list) {
        Message messageObtain = Message.obtain();
        if (list != null && !list.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putLong("key_last_time", list.get(list.size() - 1).getStartTime());
            messageObtain.setData(bundle);
            messageObtain.obj = list;
        }
        messageObtain.what = 1;
        this.f.sendMessage(messageObtain);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        d dVar = this.f;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
    }

    static class a extends FunctionSetBeanReader.e {
        private WeakReference<FunctionSetBeanReader> e;

        public a(String str, FunctionSetBeanReader functionSetBeanReader) {
            super(str, functionSetBeanReader);
            this.e = new WeakReference<>(functionSetBeanReader);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.e, com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            FunctionSetBeanReader functionSetBeanReader = this.e.get();
            if (functionSetBeanReader instanceof ska) {
                ska skaVar = (ska) functionSetBeanReader;
                if (i == 102) {
                    if ("BLOOD_SUGAR_CONTINUE_MAX_THRESHOLD".equals(str) || "BLOOD_SUGAR_CONTINUE_MIN_THRESHOLD".equals(str)) {
                        skaVar.c();
                        return;
                    }
                    return;
                }
                if (i == HiSubscribeType.e || i == HiSubscribeType.f12260b) {
                    skaVar.g = 0L;
                }
                super.onChange(i, hiHealthClient, str, hiHealthData, j);
            }
        }
    }

    static class e implements IBaseResponseCallback {
        private final WeakReference<ska> d;

        e(ska skaVar) {
            this.d = new WeakReference<>(skaVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("FunctionSetBloodSugarCardReader", "showBloodSugar onResult called, error=", Integer.valueOf(i), ", data: ", obj);
            ska skaVar = this.d.get();
            if (skaVar == null) {
                LogUtil.j("FunctionSetBloodSugarCardReader", "BloodSugarHiDataReadResultListener cardReader is null");
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                if (njy.b(list)) {
                    LogUtil.a("FunctionSetBloodSugarCardReader", "list: ", list.toString());
                    Collections.sort(list, new Comparator() { // from class: sjx
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return Long.compare(((HiHealthData) obj2).getStartTime(), ((HiHealthData) obj3).getStartTime());
                        }
                    });
                    skaVar.b((List<HiHealthData>) list);
                    skaVar.c((List<HiHealthData>) list);
                    skaVar.a((List<HiHealthData>) list);
                    return;
                }
            }
            LogUtil.j("FunctionSetBloodSugarCardReader", "data none");
            skaVar.b((List<HiHealthData>) null);
            skaVar.c((List<HiHealthData>) null);
            skaVar.j.d(null, null);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.bloodsugar_default_img_big;
        }
        return R.drawable.marketing_default_img_bloodsugar;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_blood_blood_sugar;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        if (qqs.e(this.mContext)) {
            return R.color.function_marketing_big_card_heart_dark;
        }
        return R.color.function_marketing_big_card_heart;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_blood_sugar);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.j;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetBloodSugarCardReader";
    }
}
