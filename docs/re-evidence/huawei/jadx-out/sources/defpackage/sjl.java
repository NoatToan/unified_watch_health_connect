package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity;
import health.compact.a.HiDateUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class sjl extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f48178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<HwHealthBarEntry> f48179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f48180c;
    private List<Integer> d;
    private List<Integer> e;
    private long f;
    private boolean g;
    private boolean h;
    private final HiDataReadResultListener i;
    private d j;

    static class e extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HiHealthData f48181a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<sjl> f48182c;
        private boolean d;
        private List<Integer> e;

        e(sjl sjlVar) {
            super("FunctionSetActiveHourCardReader", null);
            this.f48182c = new WeakReference<>(sjlVar);
        }

        void c(List<Integer> list) {
            this.e = list;
            if (list != null) {
                b(true).putString("_", marshallListToString(list));
            }
        }

        void e(boolean z) {
            HiHealthData hiHealthDataB;
            if (z) {
                sjl.setHasCardData(this.f48182c, true);
                hiHealthDataB = b(false);
            } else {
                sjl.setHasCardData(this.f48182c, false);
                this.e = null;
                hiHealthDataB = null;
            }
            this.f48181a = null;
            sjl.saveDataFromHealthApi("FunctionSetActiveHourCardReader", this.f48182c, hiHealthDataB);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            sjl sjlVar = this.f48182c.get();
            if (sjlVar == null) {
                LogUtil.j("FunctionSetActiveHourCardReader", "handleCacheData activeCardReader is null");
                return;
            }
            if (hiHealthData == null) {
                sjl.setHasCardData(this.f48182c, false);
                if (this.d && z) {
                    sjlVar.d();
                    return;
                }
                return;
            }
            this.d = true;
            List arrayList = this.e;
            if (!z || arrayList == null) {
                arrayList = new ArrayList();
                unmarshallListFromString(hiHealthData.getString("_"), arrayList);
            } else {
                this.e = null;
            }
            if (!arrayList.isEmpty()) {
                sjlVar.b((List<Integer>) arrayList);
                sjlVar.g = true;
                sjlVar.d(hiHealthData.getLong("_t"), hiHealthData.getInt("_s"), hiHealthData.getInt("_u"), z);
            } else {
                LogUtil.j("FunctionSetActiveHourCardReader", "handleCacheData activeHourValueList is empty");
                if (z) {
                    return;
                }
                sjlVar.refreshCardBySp(sjlVar.buildEmptyCardBean());
            }
        }

        private HiHealthData b(boolean z) {
            if (z && this.f48181a == null) {
                this.f48181a = new HiHealthData();
            }
            return this.f48181a;
        }
    }

    public sjl(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetActiveHourCardReader", cardConfig);
        this.h = false;
        this.d = new ArrayList(1);
        this.e = null;
        this.g = false;
        this.f48178a = new e(this);
        this.i = new HiDataReadResultListener() { // from class: sjl.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                List list = sjl.this.getList(obj, DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value());
                if (njy.e(list)) {
                    LogUtil.j("FunctionSetActiveHourCardReader", "dataList is empty!");
                    sjl.this.f48178a.e(false);
                    sjl.this.j.sendEmptyMessage(5);
                } else {
                    LogUtil.a("FunctionSetActiveHourCardReader", "readCardData success");
                    Message messageObtainMessage = sjl.this.j.obtainMessage();
                    messageObtainMessage.what = 3;
                    messageObtainMessage.obj = list;
                    sjl.this.j.sendMessage(messageObtainMessage);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("FunctionSetActiveHourCardReader", "onResultIntent : read failed errorCode is", Integer.valueOf(i2));
            }
        };
        this.j = new d(this);
        subscribeDataChange();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetActiveHourCardReader", "subscribeActiveHourData");
        this.d.add(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()));
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(this.d, new FunctionSetBeanReader.e("FunctionSetActiveHourCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetActiveHourCardReader", "unSubscribeActiveHourData");
        List<Integer> list = this.e;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.e, new FunctionSetBeanReader.c("FunctionSetActiveHourCardReader", "unSubscribeActiveHourData, isSuccess:"));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        d dVar = this.j;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        readCardData();
        ReleaseLogUtil.d("TimeEat_FunctionSetActiveHourCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        LogUtil.a("FunctionSetActiveHourCardReader", "readCardData start");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(24);
        HiHealthNativeApi.a(this.mContext).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).a(true).b(), this.i);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void initCardData() {
        sis.e().d(this.i);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetActiveHourCardReader", "unSubscribeActiveHourData, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetActiveHourCardReader", "registerActiveHourListener success");
        this.e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j, int i, int i2, boolean z) {
        setHasCardData(true);
        this.f = j;
        String strB = tfc.b(j);
        LogUtil.a("FunctionSetActiveHourCardReader", "requestDatas", "activeHourMeasureBean", strB, "---", "---", Integer.valueOf(i));
        if (i == 0) {
            if (z) {
                return;
            }
            refreshCardBySp(buildEmptyCardBean());
            return;
        }
        FunctionSetBean functionSetBeanA = a(strB, i);
        functionSetBeanA.d(i2);
        if (z) {
            Message messageObtainMessage = this.j.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = functionSetBeanA;
            this.j.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanA);
    }

    static class d extends BaseHandler<sjl> {
        d(sjl sjlVar) {
            super(Looper.getMainLooper(), sjlVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(sjl sjlVar, Message message) {
            int i = message.what;
            if (i == 1) {
                LogUtil.a("FunctionSetActiveHourCardReader", "handleMessageWhenReferenceNotNull");
                if (message.obj instanceof FunctionSetBean) {
                    sjlVar.notifyItemChanged((FunctionSetBean) message.obj);
                    return;
                }
                return;
            }
            if (i == 3) {
                sjlVar.b(message.obj);
                sjlVar.f48178a.e(true);
            } else if (i == 4) {
                LogUtil.a("FunctionSetActiveHourCardReader", "MSG_HAVE_ACTIVE_HOUR_DATA:");
                sjlVar.b(true);
            } else if (i == 5) {
                LogUtil.a("FunctionSetActiveHourCardReader", "MSG_NOT_HAVE_ACTIVE_HOUR_DATA:");
                sjlVar.b(false);
            } else {
                LogUtil.j("FunctionSetActiveHourCardReader", "unkonw msg");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("FunctionSetActiveHourCardReader", "show empty view!");
        FunctionSetBean functionSetBeanBuildEmptyCardBean = buildEmptyCardBean();
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = functionSetBeanBuildEmptyCardBean;
        this.j.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.mContext.getResources().getString(R.string.IDS_active_hours_title)).e(FunctionSetType.ACTIVE_HOUR_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).c(this.mContext.getResources().getString(R.string.IDS_active_hours_subtitle)).b(this.mContext).a();
    }

    private FunctionSetBean a(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(UnitUtil.e(i, 1, 0));
        stringBuffer.append("/");
        stringBuffer.append(UnitUtil.e(12.0d, 1, 0));
        return new FunctionSetBean.c(qre.f(R.string.IDS_active_hours_title)).d(str).g(tfc.d(this.f)).e(stringBuffer.toString()).j(qre.f(R.string.IDS_hw_show_main_home_page_hours)).e(FunctionSetType.ACTIVE_HOUR_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).b(this.mContext).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        if (obj instanceof List) {
            List<HiHealthData> list = (List) obj;
            HiHealthData hiHealthData = list.get(0);
            if (hiHealthData == null) {
                LogUtil.j("FunctionSetActiveHourCardReader", "data is empty");
            } else {
                e(list, HiDateUtil.p(hiHealthData.getStartTime()));
            }
        }
    }

    private void e(List<HiHealthData> list, long j) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            HiHealthData hiHealthData = list.get((size - i) - 1);
            if (TimeUtil.d(hiHealthData.getStartTime(), j)) {
                arrayList.add(Integer.valueOf(ltb.d(hiHealthData.getStartTime())));
            }
        }
        this.f48178a.c(arrayList);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("FunctionSetActiveHourCardReader", "createCardView");
        if (this.g) {
            LogUtil.a("FunctionSetActiveHourCardReader", "mIsDataUpdated");
            if (this.f48180c == null) {
                try {
                    this.f48180c = LayoutInflater.from(this.mContext).inflate(R.layout.card_active_hour_view, (ViewGroup) null);
                } catch (InflateException e2) {
                    LogUtil.j("FunctionSetActiveHourCardReader", e2.getClass().getSimpleName() + "inflate mCardActiveView fail!");
                }
            }
            e(this.f48179b);
            this.g = false;
        }
        return this.f48180c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Integer> list) {
        HwHealthBarEntry hwHealthBarEntry;
        ArrayList arrayList = new ArrayList(16);
        int size = list.size();
        LogUtil.a("FunctionSetActiveHourCardReader", "mPressureMeasureValueList , size ", Integer.valueOf(size));
        for (int i = 0; i < 16; i++) {
            if (i < size) {
                int iC = c(list.get(i).intValue());
                hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(list.get(i).intValue(), iC, iC));
            } else {
                int color = this.mContext.getResources().getColor(R.color.health_chart_extend_background_color);
                hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(20.0f, color, color));
            }
            arrayList.add(hwHealthBarEntry);
        }
        this.f48179b = arrayList;
        e(arrayList);
    }

    private int c(int i) {
        return this.mContext.getResources().getColor(R.color.sport_type_bg_0);
    }

    private void e(List<HwHealthBarEntry> list) {
        View view = this.f48180c;
        if (view == null) {
            LogUtil.j("FunctionSetActiveHourCardReader", "mCardActiveView is null");
            return;
        }
        LogUtil.a("FunctionSetActiveHourCardReader", "mCardActiveView ID: ", Integer.valueOf(view.getId()));
        HwHealthBarChart hwHealthBarChart = (HwHealthBarChart) this.f48180c.findViewById(R.id.barchart);
        if (hwHealthBarChart == null) {
            LogUtil.j("FunctionSetActiveHourCardReader", "initSet barChart is null");
            return;
        }
        float y = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getY() >= y) {
                y = list.get(i).getY();
            }
        }
        hwHealthBarChart.setTouchEnabled(false);
        HwHealthBarDataSet hwHealthBarDataSet = new HwHealthBarDataSet(list, "bar breif", "bar label", "bar unit");
        hwHealthBarDataSet.e(HwHealthBarDataSet.DrawColorMode.DATA_COLOR);
        hwHealthBarDataSet.setBarDrawWidth(0.5f);
        hwHealthBarDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        hwHealthBarChart.getXAxis().setEnabled(false);
        HwHealthYAxis axisFirstParty = hwHealthBarChart.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setDrawAxisLine(false);
        float f = y / 2.0f;
        axisFirstParty.setAxisMinimum(f - 50.0f);
        axisFirstParty.setAxisMaximum(f + 50.0f);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(hwHealthBarDataSet);
        hwHealthBarChart.setData(new qly(arrayList));
        hwHealthBarChart.refresh();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setClass(this.mContext, KnitActiveHoursActivity.class);
        iov.d(this.mContext, intent);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        ReleaseLogUtil.d("TimeEat_FunctionSetActiveHourCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        this.h = z;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_pressure);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.pressure_default_img_big;
        }
        return R.drawable.marketing_default_img_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        return R.color.function_marketing_big_card_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_stress;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f48178a;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetActiveHourCardReader";
    }
}
