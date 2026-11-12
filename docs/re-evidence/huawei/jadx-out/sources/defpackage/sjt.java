package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
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
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.functionsetcard.view.EmotionChartView;
import health.compact.a.HiCommonUtil;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class sjt extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48206c;
    private int d;
    public int e;
    private int f;
    private List<Integer> g;
    private e h;
    private EmotionChartView i;
    private int j;
    private String k;
    private final int[] l;
    private final c m;
    private long n;
    private b o;
    private String p;
    private List<Integer> q;
    private View r;
    private HwHealthBarChart s;
    private List<HwHealthBarEntry> t;

    public sjt(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetEmotionCardReader", cardConfig);
        this.l = new int[]{ContextCompat.getColor(BaseApplication.getContext(), R.color.emotion_card_pleasures), ContextCompat.getColor(BaseApplication.getContext(), R.color.emotion_card_peaceful), ContextCompat.getColor(BaseApplication.getContext(), R.color.emotion_card_unpleasant)};
        this.q = new ArrayList(2);
        this.t = new ArrayList();
        this.g = new ArrayList();
        this.j = 50;
        this.f = 40;
        this.f48205b = 30;
        this.f48206c = 20;
        this.d = 10;
        this.f48204a = 0;
        this.m = new c(this);
        this.h = new e(this);
        subscribeDataChange();
        b bVar = new b(this);
        this.o = bVar;
        ObserverManagerUtil.d(bVar, ObserveLabels.SUMMARY_DATA_INIT);
    }

    static class b implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<sjt> f48209c;

        b(sjt sjtVar) {
            this.f48209c = new WeakReference<>(sjtVar);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            sjt sjtVar = this.f48209c.get();
            if (sjtVar == null || objArr == null || !ObserveLabels.SUMMARY_DATA_INIT.equals(str)) {
                ReleaseLogUtil.e("FunctionSetEmotionCardReader", "InnerObserver notify functionSetEmotionCardReader ", sjtVar, " objects ", objArr, " label ", str);
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Integer) || !(objArr[1] instanceof HashMap)) {
                ReleaseLogUtil.e("FunctionSetEmotionCardReader", "InnerObserver notify is not legal");
                return;
            }
            Integer num = (Integer) obj;
            num.intValue();
            HashMap map = (HashMap) objArr[1];
            LogUtil.a("FunctionSetEmotionCardReader", "initSummary errorCode： ", num);
            Message messageObtainMessage = sjtVar.m.obtainMessage();
            messageObtainMessage.what = 100;
            messageObtainMessage.obj = map.get("emotionalHealth");
            sjtVar.m.sendMessage(messageObtainMessage);
        }
    }

    static class e extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Integer> f48211c;
        private boolean d;
        private final WeakReference<sjt> e;

        e(sjt sjtVar) {
            super("FunctionSetEmotionCardReader", null);
            this.e = new WeakReference<>(sjtVar);
        }

        void a(String str, HiHealthData hiHealthData, List<Integer> list, int i, boolean z) {
            HiHealthData hiHealthData2;
            if (hiHealthData == null || njy.e(list)) {
                sjt.setHasCardData(this.e, false);
                hiHealthData2 = null;
                this.f48211c = null;
            } else {
                sjt.setHasCardData(this.e, true);
                this.f48211c = list;
                String strMarshallListToString = marshallListToString(list);
                hiHealthData2 = new HiHealthData();
                hiHealthData2.setStartTime(hiHealthData.getStartTime());
                hiHealthData2.putString("_c", str);
                hiHealthData2.putLong("_t", hiHealthData.getStartTime());
                hiHealthData2.putInt("_s", hiHealthData.getIntValue());
                hiHealthData2.putInt("_u", i);
                hiHealthData2.putBoolean("_es", z);
                hiHealthData2.putString("_", strMarshallListToString);
            }
            sjt.saveDataFromHealthApi("FunctionSetEmotionCardReader", this.e, hiHealthData2);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            FunctionSetBean functionSetBeanB;
            LogUtil.a("FunctionSetEmotionCardReader", "handleCacheData isNewData:", Boolean.valueOf(z));
            sjt sjtVar = this.e.get();
            if (sjtVar == null) {
                LogUtil.j("FunctionSetEmotionCardReader", "handleCacheData reader is null");
                return;
            }
            if (hiHealthData == null) {
                LogUtil.j("FunctionSetEmotionCardReader", "handleCacheData data is null");
                sjt.setHasCardData(this.e, false);
                if (this.d && z) {
                    sjtVar.b(sjtVar.buildEmptyCardBean());
                    return;
                }
                return;
            }
            LogUtil.a("FunctionSetEmotionCardReader", "handleCacheData data is:", hiHealthData.toString());
            this.d = true;
            String string = hiHealthData.getString("_c");
            sjtVar.k = string;
            List arrayList = this.f48211c;
            if (!z || arrayList == null) {
                arrayList = new ArrayList();
                unmarshallListFromString(hiHealthData.getString("_"), arrayList);
            } else {
                this.f48211c = null;
            }
            if (!njy.e(arrayList)) {
                sjtVar.setHasCardData(true);
                if ("emotionType".equals(string)) {
                    sjtVar.a((List<Integer>) arrayList);
                    sjtVar.g = arrayList;
                    functionSetBeanB = sjtVar.d(hiHealthData.getLong("_t"), sjtVar.b(hiHealthData.getInt("_s")), hiHealthData.getBoolean("_es"));
                } else {
                    sjtVar.t = sjtVar.d((List<Integer>) arrayList);
                    int i = hiHealthData.getInt("_s");
                    functionSetBeanB = sjtVar.b(hiHealthData.getLong("_t"), i, wvb.a(i));
                }
                functionSetBeanB.d(hiHealthData.getInt("_u"));
                if (z) {
                    if (sjtVar.a()) {
                        functionSetBeanB.b((CharSequence) sjtVar.p);
                    }
                    sjtVar.b(functionSetBeanB);
                    return;
                }
                sjtVar.refreshCardBySp(functionSetBeanB);
                return;
            }
            LogUtil.j("FunctionSetEmotionCardReader", "handleCacheData pressureValueList is empty");
            if (z) {
                return;
            }
            sjtVar.refreshCardBySp(sjtVar.buildEmptyCardBean());
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetEmotionCardReader", "subscribeEmotionData");
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(14);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.EMOTION_SET.value()));
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(arrayList, new FunctionSetBeanReader.e("FunctionSetEmotionCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        if (njy.e(this.q)) {
            LogUtil.j("FunctionSetEmotionCardReader", "onDestroy mSubscribeTypeList is empty");
        } else {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.q, new FunctionSetBeanReader.c("FunctionSetEmotionCardReader", "unSubscribeEmotionData, isSuccess :"));
        }
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
        return this.h;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean == null) {
            return;
        }
        if (a()) {
            functionSetBean.b((CharSequence) this.p);
        } else {
            functionSetBean.b("");
        }
        notifyItemChanged(functionSetBean);
        ReleaseLogUtil.d("R_FunctionSetEmotionCardReaderFunctionSetEmotionCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return (TextUtils.isEmpty(this.p) || qdm.o()) ? false : true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_pressure);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetEmotionCardReader";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void readCardData() {
        super.readCardData();
        LogUtil.a("FunctionSetEmotionCardReader", "readCardData");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c(new int[]{44307}));
        arrayList.add(c(new int[]{DicDataTypeUtil.DataType.EMOTION_STATUS_ALL_COUNT.value()}));
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthDataEx(arrayList, new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, List<HiHealthData> list2) {
        final int iValue;
        final int i;
        HiHealthData hiHealthData = njy.b(list) ? list.get(0) : null;
        HiHealthData hiHealthData2 = njy.b(list2) ? list2.get(0) : null;
        if (hiHealthData == null && hiHealthData2 == null) {
            this.h.a("noDataType", null, null, 0, false);
            return;
        }
        long startTime = hiHealthData != null ? hiHealthData.getStartTime() : 0L;
        long startTime2 = hiHealthData2 != null ? hiHealthData2.getStartTime() : 0L;
        if (startTime != 0) {
            SharedPreferenceManager.c("privacy_center", "pressure", String.valueOf(startTime));
        }
        if (startTime2 != 0) {
            SharedPreferenceManager.c("privacy_center", "emotion", String.valueOf(startTime2));
        }
        final int iA = DateFormatUtil.a(startTime);
        int iA2 = DateFormatUtil.a(startTime2);
        if (iA2 >= iA) {
            iValue = DicDataTypeUtil.DataType.EMOTION_STATUS.value();
            this.n = startTime2;
            i = 3;
            iA = iA2;
        } else {
            this.n = startTime;
            iValue = 2034;
            i = 2;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: sjv
            @Override // java.lang.Runnable
            public final void run() {
                this.f48219a.b(iA, iValue, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(int i, int i2, int i3) {
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(b(new int[]{i2}, i), new a(this, i2, i3));
    }

    private HiDataReadOption b(int[] iArr, int i) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(i), String.valueOf(i), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        return hiDataReadOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list) {
        if (njy.e(list)) {
            this.h.a("emotionType", null, null, 0, false);
            return;
        }
        LogUtil.a("FunctionSetEmotionCardReader", "handleEmotionData dataList size:", Integer.valueOf(list.size()));
        HiHealthData hiHealthData = list.get(0);
        ArrayList arrayList = new ArrayList(d(a(hiHealthData), list).values());
        LogUtil.a("FunctionSetEmotionCardReader", "handleEmotionData emotionValues:", arrayList.toString());
        this.h.a("emotionType", hiHealthData, arrayList, (list.toString() + list.size()).hashCode(), e(list));
    }

    private List<Long> a(HiHealthData hiHealthData) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData.getStartTime());
        LogUtil.a("FunctionSetEmotionCardReader", "getEmotionTimeList lastHiHealthData time :", Long.valueOf(hiHealthData.getStartTime()));
        calendar.set(12, (calendar.get(12) / 10) * 10);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long jR = lsl.r(hiHealthData.getStartTime());
        long timeInMillis = calendar.getTimeInMillis() - 21000000;
        if (timeInMillis >= jR) {
            jR = timeInMillis;
        }
        ArrayList arrayList = new ArrayList(36);
        for (int i = 0; i < 36; i++) {
            arrayList.add(Long.valueOf(jR));
            jR += 600000;
        }
        Collections.reverse(arrayList);
        LogUtil.a("FunctionSetEmotionCardReader", "getEmotionTimeList result :", arrayList.toString());
        return arrayList;
    }

    private TreeMap<Long, Integer> d(List<Long> list, List<HiHealthData> list2) {
        TreeMap<Long, Integer> treeMap = new TreeMap<>(new sjm());
        int i = 0;
        for (Long l : list) {
            long jLongValue = l.longValue();
            while (i < list2.size()) {
                HiHealthData hiHealthData = list2.get(i);
                if (hiHealthData.getStartTime() < jLongValue) {
                    break;
                }
                if (!treeMap.containsKey(l)) {
                    treeMap.put(l, Integer.valueOf(hiHealthData.getIntValue()));
                }
                i++;
            }
            if (!treeMap.containsKey(l)) {
                treeMap.put(l, 0);
            }
        }
        LogUtil.a("FunctionSetEmotionCardReader", "getEmotionValues result :", treeMap.toString());
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        if (1 == i) {
            return qre.f(R.string.IDS_hw_show_main_home_page_card_emotion_unhappy);
        }
        if (2 == i) {
            return qre.f(R.string.IDS_hw_show_main_home_page_card_emotion_peace);
        }
        return qre.f(R.string.IDS_hw_show_main_home_page_card_emotion_happy);
    }

    private boolean e(List<HiHealthData> list) {
        if (!njy.e(list) && list.size() >= 12) {
            int size = list.size();
            Iterator<HiHealthData> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().getIntValue() == 1) {
                    i++;
                }
            }
            if (i > ((double) size) * 0.3d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list) {
        List<Long> listD;
        if (njy.e(list)) {
            this.h.a("stressType", null, null, 0, false);
            return;
        }
        HiHealthData hiHealthData = list.get(0);
        int iC = c(hiHealthData);
        this.e = iC;
        ReleaseLogUtil.d("R_FunctionSetEmotionCardReader", "TimeType=", Integer.valueOf(iC));
        if (this.e == 1) {
            listD = b(hiHealthData);
        } else {
            listD = d(hiHealthData);
        }
        ArrayList arrayList = new ArrayList(c(listD, list).values());
        a(arrayList);
        this.h.a("stressType", hiHealthData, arrayList, (list.toString() + list.size()).hashCode(), false);
    }

    private int c(HiHealthData hiHealthData) {
        String metaData = hiHealthData.getMetaData();
        if (HiCommonUtil.a(metaData)) {
            return 0;
        }
        try {
            return new JSONObject(metaData).optInt("timeType") == 1 ? 1 : 0;
        } catch (JSONException unused) {
            ReleaseLogUtil.a("R_FunctionSetEmotionCardReader", "metadata jsonException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext() && it.next().intValue() == 0) {
            it.remove();
            i++;
        }
        for (int i2 = 0; i2 < i; i2++) {
            list.add(0);
        }
    }

    private List<Long> d(HiHealthData hiHealthData) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData.getStartTime());
        if (calendar.get(12) >= 30) {
            calendar.set(12, 30);
        } else {
            calendar.set(12, 0);
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
        long jR = lsl.r(hiHealthData.getStartTime());
        ArrayList arrayList = new ArrayList(16);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(calendar.getTimeInMillis());
        arrayList.add(Long.valueOf(bigDecimalValueOf.longValue()));
        for (int i = 1; i < 16; i++) {
            bigDecimalValueOf = bigDecimalValueOf.subtract(BigDecimal.valueOf(1800000L));
            long jLongValue = bigDecimalValueOf.longValue();
            if (jLongValue < jR) {
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

    private List<Long> b(HiHealthData hiHealthData) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData.getStartTime());
        int i = calendar.get(12);
        int i2 = this.j;
        if (i >= i2) {
            calendar.set(12, i2);
        } else {
            int i3 = calendar.get(12);
            int i4 = this.f;
            if (i3 >= i4) {
                calendar.set(12, i4);
            } else {
                int i5 = calendar.get(12);
                int i6 = this.f48205b;
                if (i5 >= i6) {
                    calendar.set(12, i6);
                } else {
                    int i7 = calendar.get(12);
                    int i8 = this.f48206c;
                    if (i7 >= i8) {
                        calendar.set(12, i8);
                    } else {
                        int i9 = calendar.get(12);
                        int i10 = this.d;
                        if (i9 >= i10) {
                            calendar.set(12, i10);
                        } else {
                            calendar.set(12, this.f48204a);
                        }
                    }
                }
            }
        }
        calendar.set(13, this.f48204a);
        calendar.set(14, this.f48204a);
        long jR = lsl.r(hiHealthData.getStartTime());
        ArrayList arrayList = new ArrayList(72);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(calendar.getTimeInMillis());
        arrayList.add(Long.valueOf(bigDecimalValueOf.longValue()));
        for (int i11 = 1; i11 < 72; i11++) {
            bigDecimalValueOf = bigDecimalValueOf.subtract(BigDecimal.valueOf(600000L));
            long jLongValue = bigDecimalValueOf.longValue();
            if (jLongValue < jR) {
                break;
            }
            arrayList.add(Long.valueOf(jLongValue));
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < 72 - size; i12++) {
            calendar.add(12, 10);
            arrayList.add(0, Long.valueOf(calendar.getTimeInMillis()));
        }
        return arrayList;
    }

    private TreeMap<Long, Integer> c(List<Long> list, List<HiHealthData> list2) {
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

    private HiDataReadProOption c(int[] iArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        hiDataReadOption.setType(iArr);
        return HiDataReadProOption.builder().e(hiDataReadOption).b();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        if (viewHolder instanceof FunctionSetBeanReader.MyHolder) {
            FunctionSetBeanReader.MyHolder myHolder = (FunctionSetBeanReader.MyHolder) viewHolder;
            if (myHolder.f7091a == null) {
                return;
            }
            if (fua.b(this.mContext)) {
                myHolder.f7091a.setSingleLine(false);
                myHolder.f7091a.setMaxLines(3);
            }
            if ("stressType".equals(this.k)) {
                return;
            }
            myHolder.f7091a.setAutoTextSize(2, 20.0f);
            myHolder.f7091a.setAutoTextInfo(14, 1, 2);
            myHolder.f7091a.setTypeface(Typeface.create(BaseApplication.getContext().getString(R.string.textFontFamilyMedium), 0));
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("FunctionSetEmotionCardReader", "createCardView start");
        if (this.r == null) {
            try {
                this.r = LayoutInflater.from(this.mContext).inflate(R.layout.card_emotion_view, (ViewGroup) null);
            } catch (InflateException e2) {
                LogUtil.j("FunctionSetEmotionCardReader", e2.getClass().getSimpleName() + "inflate mStressView fail!");
            }
            LogUtil.a("FunctionSetEmotionCardReader", "createCardView mStressView");
        }
        if ("stressType".equals(this.k)) {
            d();
        } else {
            b();
        }
        return this.r;
    }

    private void d() {
        ViewStub viewStub;
        if (this.s == null && (viewStub = (ViewStub) this.r.findViewById(R.id.barchart)) != null) {
            LogUtil.a("FunctionSetEmotionCardReader", "createCardView mStressChart");
            View viewInflate = viewStub.inflate();
            if (viewInflate instanceof HwHealthBarChart) {
                this.s = (HwHealthBarChart) viewInflate;
            }
        }
        if (this.s != null) {
            LogUtil.a("FunctionSetEmotionCardReader", "show mStressChart");
            d(this.t, this.s);
            this.s.setVisibility(0);
        } else {
            LogUtil.j("FunctionSetEmotionCardReader", "show STRESS_TYPE, but mStressChart is null");
        }
        EmotionChartView emotionChartView = this.i;
        if (emotionChartView != null) {
            emotionChartView.setVisibility(8);
        }
    }

    private void b() {
        ViewStub viewStub;
        if (this.i == null && (viewStub = (ViewStub) this.r.findViewById(R.id.emotion_chart)) != null) {
            LogUtil.a("FunctionSetEmotionCardReader", "createCardView mEmotionChart");
            View viewInflate = viewStub.inflate();
            if (viewInflate instanceof EmotionChartView) {
                this.i = (EmotionChartView) viewInflate;
            }
        }
        if (this.i != null) {
            LogUtil.a("FunctionSetEmotionCardReader", "show mEmotionChart");
            this.i.a(this.l);
            this.i.setEmotionChartDataList(this.g);
            this.i.setVisibility(0);
        } else {
            LogUtil.j("FunctionSetEmotionCardReader", "show EMOTION_TYPE, but mEmotionChart is null");
        }
        HwHealthBarChart hwHealthBarChart = this.s;
        if (hwHealthBarChart != null) {
            hwHealthBarChart.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HwHealthBarEntry> d(List<Integer> list) {
        HwHealthBarEntry hwHealthBarEntry;
        ArrayList arrayList = new ArrayList(16);
        int size = list.size();
        LogUtil.a("FunctionSetEmotionCardReader", "mPressureMeasureValueList , size ", Integer.valueOf(size));
        for (int i = 0; i < size; i++) {
            int iIntValue = list.get(i).intValue();
            if (iIntValue > 0) {
                int iC = c(iIntValue);
                hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(list.get(i).intValue(), iC, iC));
            } else {
                int color = ContextCompat.getColor(this.mContext, R.color.health_chart_extend_background_color);
                if (this.e == 1) {
                    hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(0.0f));
                } else {
                    hwHealthBarEntry = new HwHealthBarEntry(i, new qmf(20.0f, color, color));
                }
            }
            arrayList.add(hwHealthBarEntry);
        }
        return arrayList;
    }

    private int c(int i) {
        if (i >= 80) {
            return this.mContext.getResources().getColor(R.color.color_pressure_4);
        }
        if (i >= 60) {
            return this.mContext.getResources().getColor(R.color.color_pressure_3);
        }
        if (i >= 30) {
            return this.mContext.getResources().getColor(R.color.color_pressure_2);
        }
        return this.mContext.getResources().getColor(R.color.color_pressure_1);
    }

    private void d(List<HwHealthBarEntry> list, HwHealthBarChart hwHealthBarChart) {
        if (hwHealthBarChart == null) {
            LogUtil.j("FunctionSetEmotionCardReader", "initSet barChart is null");
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
        hwHealthBarDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        hwHealthBarChart.getXAxis().setEnabled(false);
        HwHealthYAxis axisFirstParty = hwHealthBarChart.getAxisFirstParty();
        axisFirstParty.setDrawLabels(false);
        axisFirstParty.setDrawGridLines(false);
        axisFirstParty.setDrawAxisLine(false);
        if (this.e == 1) {
            hwHealthBarDataSet.setBarDrawWidth(0.75f);
            hwHealthBarDataSet.setBarShadowColor(Color.argb(0.05f, 0.0f, 0.0f, 0.0f));
            axisFirstParty.setAxisMinimum(0.0f);
            axisFirstParty.setAxisMaximum(99.0f);
            hwHealthBarChart.setIsDrawBarShadow(true);
        } else {
            hwHealthBarDataSet.setBarDrawWidth(0.5f);
            hwHealthBarDataSet.setBarShadowColor(Color.rgb(com.huawei.hms.kit.awareness.barrier.internal.e.a.N, com.huawei.hms.kit.awareness.barrier.internal.e.a.N, com.huawei.hms.kit.awareness.barrier.internal.e.a.N));
            float f = y / 2.0f;
            axisFirstParty.setAxisMinimum(f - 50.0f);
            axisFirstParty.setAxisMaximum(f + 50.0f);
            hwHealthBarChart.setIsDrawBarShadow(false);
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(hwHealthBarDataSet);
        hwHealthBarChart.setData(new qly(arrayList));
        hwHealthBarChart.refresh();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == 14 || i == DicDataTypeUtil.DataType.EMOTION_SET.value();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetEmotionCardReader", "subscribeStressData, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetEmotionCardReader", "registerStressListener success");
        this.q = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FunctionSetBean functionSetBean) {
        LogUtil.a("FunctionSetEmotionCardReader", "updateUi with ", functionSetBean);
        Message messageObtainMessage = this.m.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = functionSetBean;
        this.m.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(qre.f(R.string.IDS_hw_show_main_home_page_card_emotion_title)).e(FunctionSetType.STRESS_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).c(qre.f(R.string.IDS_hw_show_main_home_page_card_emotion)).b(this.mContext).a();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        String str;
        String str2;
        if (this.mContext != null) {
            if (!"stressType".equals(this.k)) {
                str = "0";
                str2 = "emotion";
            } else {
                str = "1";
                str2 = "stress";
            }
            Intent intent = new Intent();
            intent.setClassName(this.mContext.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
            IntentParams intentParamsBuild = IntentParams.builder().addPageId(ArkUIXConstants.KNIT_EMOTION).addPageType("8").addTimeStamp(String.valueOf(this.n)).addRecord("{'cardType':" + str + ", 'entrance':\"" + str2 + "\"}").addBiFrom("Today_0001", "home_card", String.valueOf(this.mCardViewHolder.getLayoutPosition())).build();
            LogUtil.a("FunctionSetEmotionCardReader", "params start with: ", intentParamsBuild.toString());
            intent.putExtra(com.alipay.sdk.m.s.e.n, intentParamsBuild.toString());
            intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 1);
            tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, true);
            qdm.t();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        c cVar = this.m;
        if (cVar == null) {
            LogUtil.j("FunctionSetEmotionCardReader", "onDestroy mHandler is null");
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
        ObserverManagerUtil.c(this.o);
    }

    static class c extends BaseHandler<sjt> {
        c(sjt sjtVar) {
            super(Looper.getMainLooper(), sjtVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(sjt sjtVar, Message message) {
            int i = message.what;
            if (i == 1) {
                LogUtil.a("FunctionSetEmotionCardReader", "MSG_UPDATE_UI");
                sjtVar.notifyItemChanged((FunctionSetBean) message.obj);
                return;
            }
            if (i == 2) {
                LogUtil.a("FunctionSetEmotionCardReader", "MSG_HANDLE_DETAIL_STRESS_DATA");
                if (message.obj instanceof List) {
                    sjtVar.c((List<HiHealthData>) message.obj);
                    return;
                }
                return;
            }
            if (i == 3) {
                LogUtil.a("FunctionSetEmotionCardReader", "MSG_HANDLE_DETAIL_EMOTION_DATA");
                if (message.obj instanceof List) {
                    sjtVar.b((List<HiHealthData>) message.obj);
                    return;
                }
                return;
            }
            if (i != 100) {
                return;
            }
            boolean zL = qdm.l();
            LogUtil.a("FunctionSetEmotionCardReader", "handleMessageWhenReferenceNotNull isOpenActiveRecord ", Boolean.valueOf(zL));
            if (zL) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof Pair) {
                Pair pair = (Pair) obj;
                if (!(pair.first instanceof Integer) || !(pair.second instanceof String)) {
                    LogUtil.j("FunctionSetEmotionCardReader", "handleMessageWhenReferenceNotNull emotionHealthText is error");
                    return;
                }
                Integer num = (Integer) pair.first;
                num.intValue();
                String str = (String) pair.second;
                LogUtil.a("FunctionSetEmotionCardReader", "cardId is：", num, "emotionHealthText is：", str);
                sjtVar.p = str;
                if (TextUtils.isEmpty(str)) {
                    LogUtil.j("FunctionSetEmotionCardReader", "handleMessageWhenReferenceNotNull emotionHealthText ", str, " cardId ", num);
                    return;
                }
                FunctionSetBean functionSetBean = sjtVar.getFunctionSetBean();
                if (functionSetBean == null) {
                    ReleaseLogUtil.e("FunctionSetEmotionCardReader", "handleMessageWhenReferenceNotNull functionSetBean is null");
                    return;
                }
                LogUtil.a("FunctionSetEmotionCardReader", "activeRecordText: ", str);
                functionSetBean.b((CharSequence) str);
                sjtVar.notifyItemChanged(functionSetBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FunctionSetBean d(long j, String str, boolean z) {
        setBiHasData(j);
        setBiHasDataType("emotion");
        FunctionSetBean.c cVarB = new FunctionSetBean.c(qre.f(R.string.IDS_hw_show_main_home_page_card_emotion_title)).d(tfc.b(j)).g(tfc.d(j)).e(str).e(FunctionSetType.STRESS_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).b(this.mContext);
        if (z) {
            if (!lsl.aa(j)) {
                String str2 = qre.f(R.string.IDS_hw_show_main_home_page_card_emotion_more_unhappy) + " ↑";
                cVarB.d(str2);
                cVarB.g(str2);
            } else {
                cVarB.d((CharSequence) (qre.f(R.string.IDS_hw_show_main_home_page_card_emotion_more_unhappy) + " ↑"));
            }
        }
        return cVarB.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FunctionSetBean b(long j, int i, String str) {
        setBiHasData(j);
        setBiHasDataType("stress");
        return new FunctionSetBean.c(qre.f(R.string.IDS_settings_one_level_menu_settings_item_text_id14)).d(tfc.b(j)).g(tfc.d(j)).e(b(i, str)).e(FunctionSetType.STRESS_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).b(this.mContext).a();
    }

    private CharSequence b(int i, String str) {
        String strE = UnitUtil.e(i, 1, 0);
        return tfc.d(this.mContext.getResources().getString(R.string.IDS_home_card_emotion_stress_des, this.mContext.getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14), strE, str), strE);
    }

    static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<sjt> f48210c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        d(sjt sjtVar) {
            this.f48210c = new WeakReference<>(sjtVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            sjt sjtVar = this.f48210c.get();
            if (sjtVar == null) {
                LogUtil.j("FunctionSetEmotionCardReader", "FunctionSetEmotionCardReader cardReader is null");
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.e("FunctionSetEmotionCardReader", "data is not instanceof SparseArray");
                sjtVar.h.a("noDataType", null, null, 0, false);
            } else {
                ReleaseLogUtil.a("FunctionSetEmotionCardReader", "readCardData with ", obj);
                SparseArray sparseArray = (SparseArray) obj;
                sjtVar.e((List<HiHealthData>) sparseArray.get(44307), (List<HiHealthData>) sparseArray.get(DicDataTypeUtil.DataType.EMOTION_STATUS_ALL_COUNT.value()));
            }
        }
    }

    static class a implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48207a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<sjt> f48208c;
        private final int e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        a(sjt sjtVar, int i, int i2) {
            this.f48208c = new WeakReference<>(sjtVar);
            this.f48207a = i;
            this.e = i2;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("FunctionSetEmotionCardReader", "readStressData is ", obj);
            sjt sjtVar = this.f48208c.get();
            if (sjtVar != null) {
                List list = sjtVar.getList(obj, this.f48207a);
                Message messageObtainMessage = sjtVar.m.obtainMessage();
                messageObtainMessage.what = this.e;
                messageObtainMessage.obj = list;
                sjtVar.m.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("FunctionSetEmotionCardReader", "FunctionSetEmotionCardReader cardReader is null");
        }
    }
}
