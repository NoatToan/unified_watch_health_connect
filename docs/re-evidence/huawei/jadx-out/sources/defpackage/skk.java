package defpackage;

import android.content.Context;
import android.content.Intent;
import android.icu.util.MeasureUnit;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.seekbar.HealthSeekBarExtend;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes43.dex */
public class skk extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48275a;
    private final b d;
    private String e;
    private boolean f;
    private boolean g;
    private final e h;
    private boolean i;
    private ImageView j;
    private volatile long k;
    private final AtomicBoolean l;
    private double m;
    private final boolean n;
    private boolean o;
    private long p;
    private List<Integer> q;
    private HealthSeekBarExtend r;
    private final vbk t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f48274c = DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f48273b = R.drawable.ic_health_progressbar;

    static class b extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<skk> f48278a;
        private boolean d;

        b(skk skkVar) {
            super("FunctionSetTemperatureCardReader", null);
            this.f48278a = new WeakReference<>(skkVar);
        }

        void e(HiHealthData hiHealthData) {
            HiHealthData hiHealthData2;
            if (hiHealthData != null) {
                skk.setHasCardData(this.f48278a, true);
                hiHealthData2 = new HiHealthData();
                hiHealthData2.setStartTime(hiHealthData.getStartTime());
                hiHealthData2.setEndTime(hiHealthData.getEndTime());
                hiHealthData2.setType(hiHealthData.getType());
                hiHealthData2.putLong("_t", hiHealthData.getStartTime());
                hiHealthData2.putDouble("point_value", hiHealthData.getDouble("point_value"));
                hiHealthData2.putInt("_u", hiHealthData.toString().hashCode());
            } else {
                skk.setHasCardData(this.f48278a, false);
                hiHealthData2 = null;
            }
            skk.saveDataFromHealthApi("FunctionSetTemperatureCardReader", this.f48278a, hiHealthData2);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            String strA;
            skk skkVar = this.f48278a.get();
            if (skkVar == null) {
                LogUtil.j("FunctionSetTemperatureCardReader", "handleCacheData reader is null");
                return;
            }
            if (hiHealthData == null) {
                if (this.d && z) {
                    skkVar.e();
                    return;
                }
                return;
            }
            this.d = true;
            skkVar.m = hiHealthData.getDouble("point_value");
            LogUtil.a("FunctionSetTemperatureCardReader", "handleCacheData showTemperatureDataView : last = ", Long.valueOf(hiHealthData.getStartTime()), ", mLastTemperature = ", Double.valueOf(skkVar.m));
            skkVar.k = hiHealthData.getStartTime();
            if (hiHealthData.getType() == skk.f48274c) {
                skkVar.f = true;
                strA = "";
            } else {
                skkVar.f = false;
                strA = vbr.a((float) skkVar.m);
            }
            skkVar.e(strA, hiHealthData.getStartTime(), hiHealthData.getInt("_u"), z);
        }
    }

    public skk(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetTemperatureCardReader", cardConfig);
        this.q = null;
        this.k = 0L;
        this.m = 0.0d;
        this.g = true;
        this.d = new b(this);
        boolean zO = Utils.o();
        this.n = zO;
        this.t = vbk.c();
        this.l = new AtomicBoolean(false);
        this.h = new e();
        if (zO) {
            this.e = this.mContext.getResources().getString(R.string.IDS_health_skin_temperature);
            this.f48275a = this.mContext.getResources().getString(R.string.IDS_skin_temperature_desc);
        } else {
            this.e = this.mContext.getResources().getString(R.string.IDS_settings_health_temperature);
            this.f48275a = this.mContext.getResources().getString(R.string.IDS_health_temperature_desc);
        }
        LogUtil.d("FunctionSetTemperatureCardReader", "TemperatureCardReader mCardTitle is ", this.e);
        subscribeDataChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, long j, int i, boolean z) {
        LogUtil.a("FunctionSetTemperatureCardReader", "refreshTemperatureDataAndTime called", "lastTemperature:", str, ", time = ", Long.valueOf(j), ", uniqueCode = ", Integer.valueOf(i));
        setHasCardData(true);
        setBiHasData(j);
        String strB = tfc.b(j);
        CharSequence charSequenceE = e(str);
        if (this.f) {
            charSequenceE = d();
        }
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(this.e).d(strB).g(tfc.d(j)).e(charSequenceE).a(a()).e(FunctionSetType.TEMPERATURE_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).b(this.mContext).a();
        functionSetBeanA.a(this.l.get());
        functionSetBeanA.d(i);
        setFunctionSetBean(functionSetBeanA);
        if (z) {
            LogUtil.a("FunctionSetTemperatureCardReader", "async show data card");
            Message messageObtainMessage = this.h.obtainMessage();
            messageObtainMessage.what = 101;
            messageObtainMessage.obj = functionSetBeanA;
            this.h.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanA);
    }

    private CharSequence a() {
        String strA = UnitUtil.a(Float.valueOf(vbr.c((float) this.m)), UnitUtil.a() ? MeasureUnit.CELSIUS : MeasureUnit.FAHRENHEIT);
        return !this.f ? strA : qre.a(R.string.IDS_temp_over_suspected, strA);
    }

    private CharSequence d() {
        String string;
        String strA = vbr.a((float) this.m);
        if (UnitUtil.a()) {
            string = BaseApplication.b().getString(R.string.IDS_temp_over_suspected_celsius_unit, strA);
        } else {
            string = BaseApplication.b().getString(R.string.IDS_temp_over_suspected_fahrenheit_unit, strA);
        }
        return tfc.d(string, strA);
    }

    public static class e extends BaseHandler<skk> {
        private e(skk skkVar) {
            super(Looper.getMainLooper(), skkVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(skk skkVar, Message message) {
            LogUtil.a("FunctionSetTemperatureCardReader", "handleMessageWhenReferenceNotNull()");
            if (skkVar == null) {
                LogUtil.j("FunctionSetTemperatureCardReader", "handleMessageWhenReferenceNotNull temperatureCardReader == null!");
                return;
            }
            int i = message.what;
            if (i != 101) {
                if (i == 102) {
                    skkVar.h();
                    return;
                } else {
                    LogUtil.j("FunctionSetTemperatureCardReader", "FunctionSetTemperatureCardReaderHandler unknown msg");
                    return;
                }
            }
            LogUtil.a("FunctionSetTemperatureCardReader", "FunctionSetTemperatureCardReaderHandler: refreshData");
            if (message.obj instanceof FunctionSetBean) {
                skkVar.notifyItemChanged((FunctionSetBean) message.obj);
            }
        }
    }

    private void b() {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.card_blood_pressure_blood_sugar, (ViewGroup) null);
        LogUtil.a("FunctionSetTemperatureCardReader", "initTemperatureSeekBar inflated view: ", viewInflate);
        HealthSeekBarExtend healthSeekBarExtend = (HealthSeekBarExtend) viewInflate.findViewById(R.id.blood_sugar_seek_bar);
        this.r = healthSeekBarExtend;
        if (healthSeekBarExtend == null) {
            LogUtil.e("FunctionSetTemperatureCardReader", "initTemperatureSeekBar mSeekBarExtend is null");
            return;
        }
        int i = TsExtractor.TS_STREAM_TYPE_DTS_HD;
        healthSeekBarExtend.setMax(TsExtractor.TS_STREAM_TYPE_DTS_HD);
        this.r.setThumb(this.mContext.getResources().getDrawable(f48273b));
        int iE = vbr.e((float) this.m);
        LogUtil.d("FunctionSetTemperatureCardReader", "progress = ", Integer.valueOf(iE), "mLastTemperature ", Double.valueOf(this.m));
        if (iE < 0) {
            i = 0;
        } else if (iE <= 136) {
            LogUtil.d("FunctionSetTemperatureCardReader", "The progress is normal. No special handling is required.");
            i = iE;
        }
        this.r.setProgress(i);
        this.r.setRulerSrc(this.mContext.getResources().getDrawable(R.drawable.health_temperature_seekbar_bg));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public int getExtraWidth() {
        return ContextCompat.getDrawable(this.mContext, f48273b).getIntrinsicWidth();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        if (viewType == FunctionSetBean.ViewType.DATA_VIEW) {
            LogUtil.a("FunctionSetTemperatureCardReader", "go to setViewForTemperatureCards record");
            if (this.mContext != null) {
                b(0);
                long j = this.p;
                if (j != 0) {
                    vbl.d(j);
                }
                long jMax = Math.max(this.k, this.p);
                Intent intent = new Intent(this.mContext, (Class<?>) KnitTemperatureActivity.class);
                intent.putExtra("key_bundle_health_last_data_time", jMax);
                tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
                if (this.l.get()) {
                    this.o = true;
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.a("FunctionSetTemperatureCardReader", "go to setEmptyViewInTemperatureCards record ", Boolean.valueOf(this.l.get()));
        if (this.mContext != null) {
            b(0);
            tfc.a(this.mContext, new Intent(this.mContext, (Class<?>) KnitTemperatureActivity.class), isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
            if (this.l.get()) {
                this.o = true;
            }
        }
    }

    private void b(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this.mContext.getApplicationContext(), AnalyticsValue.TEMPERATURE_2060073.value(), map, 0);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void readCardData() {
        int[] iArr;
        super.readCardData();
        LogUtil.a("FunctionSetTemperatureCardReader", "temperature readCardData called");
        final HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        if (this.n) {
            iArr = new int[]{this.t.l(), this.t.f(), this.t.g()};
        } else {
            iArr = new int[]{2104, this.t.a(), this.t.f(), this.t.g(), this.t.q(), this.t.o()};
        }
        hiDataReadOption.setCount(1);
        hiDataReadOption.setType(iArr);
        if (this.mCardRefreshType == 0) {
            this.mCardRefreshType = -1;
            this.h.postDelayed(new Runnable() { // from class: skk.3
                @Override // java.lang.Runnable
                public void run() {
                    HiHealthManager.d(skk.this.mContext).readHiHealthData(hiDataReadOption, new d(skk.this));
                }
            }, 100L);
        } else {
            HiHealthManager.d(this.mContext).readHiHealthData(hiDataReadOption, new d(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("FunctionSetTemperatureCardReader", "show temperature empty view!");
        setHasCardData(false);
        setFunctionSetBean(buildEmptyCardBean());
        Message messageObtainMessage = this.h.obtainMessage();
        messageObtainMessage.what = 101;
        messageObtainMessage.obj = getFunctionSetBean();
        this.h.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.e).e(FunctionSetType.TEMPERATURE_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).c(this.f48275a).b(this.mContext).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SparseArray<Object> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (this.n) {
            Object obj = sparseArray.get(this.t.l());
            if (obj instanceof List) {
                arrayList.addAll((List) obj);
            }
            LogUtil.a("FunctionSetTemperatureCardReader", "dealWithData skin size ", Integer.valueOf(arrayList.size()));
        } else {
            Object obj2 = sparseArray.get(this.t.a());
            if (obj2 instanceof List) {
                arrayList.addAll((List) obj2);
            }
            Object obj3 = sparseArray.get(2104);
            if (obj3 instanceof List) {
                arrayList.addAll((List) obj3);
            }
            Object obj4 = sparseArray.get(this.t.q());
            if (obj4 instanceof List) {
                arrayList.addAll((List) obj4);
            }
            LogUtil.a("FunctionSetTemperatureCardReader", "dealWithData body size ", Integer.valueOf(arrayList.size()));
        }
        if (njy.e(arrayList)) {
            LogUtil.j("FunctionSetTemperatureCardReader", "dealWithData temperatureValueList is empty");
            this.d.e(null);
            return;
        }
        HiHealthData hiHealthDataD = d(arrayList);
        if (hiHealthDataD != null) {
            SharedPreferenceManager.c("privacy_center", "body_temperature", String.valueOf(hiHealthDataD.getStartTime()));
            this.d.e(hiHealthDataD);
            LogUtil.a("FunctionSetTemperatureCardReader", "getBarChartData healthData:", Long.valueOf(hiHealthDataD.getStartTime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SparseArray<Object> sparseArray) {
        if (Utils.o()) {
            LogUtil.j("FunctionSetTemperatureCardReader", "isOversea no remind data");
            this.p = 0L;
            this.l.set(false);
            this.h.sendEmptyMessage(102);
            return;
        }
        List<HiHealthData> arrayList = new ArrayList<>(16);
        Object obj = sparseArray.get(this.t.f());
        Object obj2 = sparseArray.get(this.t.g());
        Object obj3 = sparseArray.get(this.t.o());
        if (obj instanceof List) {
            List list = (List) obj;
            LogUtil.a("FunctionSetTemperatureCardReader", "highData data size ", Integer.valueOf(list.size()));
            arrayList.addAll(list);
        }
        if (obj2 instanceof List) {
            List list2 = (List) obj2;
            LogUtil.a("FunctionSetTemperatureCardReader", "lowData data size ", Integer.valueOf(list2.size()));
            arrayList.addAll(list2);
        }
        if (obj3 instanceof List) {
            List list3 = (List) obj3;
            LogUtil.a("FunctionSetTemperatureCardReader", "newHighData data size ", Integer.valueOf(list3.size()));
            arrayList.addAll(list3);
        }
        if (njy.e(arrayList)) {
            LogUtil.j("FunctionSetTemperatureCardReader", "getRemindDataList remind List is null");
            this.p = 0L;
            this.l.set(false);
            this.h.sendEmptyMessage(102);
            return;
        }
        HiHealthData hiHealthDataD = d(arrayList);
        if (hiHealthDataD == null) {
            LogUtil.j("FunctionSetTemperatureCardReader", "getRemindDataList remindData is null");
            this.p = 0L;
            this.l.set(false);
            this.h.sendEmptyMessage(102);
            return;
        }
        vbl.a(true);
        long jE = vbl.e();
        long endTime = hiHealthDataD.getEndTime();
        this.p = endTime;
        LogUtil.a("FunctionSetTemperatureCardReader", "remindData lastTime is ", Long.valueOf(jE), " remindTime ", Long.valueOf(endTime));
        this.l.set(this.p > jE);
        this.h.sendEmptyMessage(102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (getFunctionSetBean() == null) {
            LogUtil.j("FunctionSetTemperatureCardReader", "updateRedDot cardBean is null");
            return;
        }
        LogUtil.a("FunctionSetTemperatureCardReader", "updateRedDot ", Boolean.valueOf(this.l.get()));
        getFunctionSetBean().a(this.l.get());
        notifyItemChanged(getFunctionSetBean());
    }

    private HiHealthData d(List<HiHealthData> list) {
        HiHealthData hiHealthData;
        if (njy.e(list)) {
            hiHealthData = null;
        } else {
            Collections.sort(list, new Comparator() { // from class: sko
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((HiHealthData) obj2).getEndTime(), ((HiHealthData) obj).getEndTime());
                }
            });
            hiHealthData = list.get(0);
        }
        LogUtil.d("FunctionSetTemperatureCardReader", "the last healthData ", hiHealthData);
        return hiHealthData;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        if (this.n) {
            ImageView imageView = new ImageView(this.mContext);
            this.j = imageView;
            imageView.setImageResource(R.drawable.card_temperature_overseas);
            return this.j;
        }
        b();
        return this.r;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        this.g = false;
        ReleaseLogUtil.d("TimeEat_FunctionSetTemperatureCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isNeedRefreshOnResume() {
        if (super.isNeedRefreshOnResume()) {
            return true;
        }
        if (this.g) {
            return false;
        }
        long jE = vbl.e();
        this.l.set(this.p > jE);
        LogUtil.a("FunctionSetTemperatureCardReader", "onResume mIsUpdateView ", Boolean.valueOf(this.o), " mIsShowRedDot ", Boolean.valueOf(this.l.get()), " endTime ", Long.valueOf(jE));
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean != null) {
            if (this.o) {
                LogUtil.d("FunctionSetTemperatureCardReader", "mIsShowRedDot ", Boolean.valueOf(this.l.get()));
                functionSetBean.a(this.l.get());
                this.o = false;
            }
            if (this.i != UnitUtil.a()) {
                if (this.f) {
                    functionSetBean.c(d());
                } else {
                    functionSetBean.c(e(vbr.a((float) this.m)));
                }
                functionSetBean.a(a());
            }
            notifyItemChanged(functionSetBean);
        }
        return false;
    }

    private CharSequence e(String str) {
        String strA;
        if (UnitUtil.a()) {
            this.i = true;
            strA = qre.a(R.string.IDS_settings_health_temperature_unit, str);
        } else {
            this.i = false;
            strA = qre.a(R.string.IDS_temp_desc_fahrenheit_unit, str);
        }
        return tfc.d(strA, str);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == this.t.h() || i == this.t.m() || i == this.t.d() || i == this.t.b() || i == this.t.t() || i == this.t.p();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetTemperatureCardReader", "subscribeTemperatureData, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetTemperatureCardReader", "registerTemperatureListener success");
        this.q = list;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetTemperatureCardReader", "subscribeTemperatureData");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(this.t.h()));
        arrayList.add(Integer.valueOf(this.t.m()));
        arrayList.add(Integer.valueOf(this.t.d()));
        arrayList.add(Integer.valueOf(this.t.b()));
        arrayList.add(Integer.valueOf(this.t.t()));
        arrayList.add(Integer.valueOf(this.t.p()));
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(arrayList, new FunctionSetBeanReader.e("FunctionSetTemperatureCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetTemperatureCardReader", "unSubscribeTemperatureData");
        List<Integer> list = this.q;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.q, new FunctionSetBeanReader.c("FunctionSetTemperatureCardReader", "unSubscribeTemperatureData, isSuccess :"));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        e eVar = this.h;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
        }
    }

    static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<skk> f48279a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        d(skk skkVar) {
            this.f48279a = new WeakReference<>(skkVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("FunctionSetTemperatureCardReader", "showTemperature onResult called ", Integer.valueOf(i));
            skk skkVar = this.f48279a.get();
            if (skkVar == null) {
                LogUtil.j("FunctionSetTemperatureCardReader", "TemperatureHiDataReadResultListener cardReader is null");
                return;
            }
            LogUtil.d("FunctionSetTemperatureCardReader", "data ", obj);
            if (!(obj instanceof SparseArray)) {
                skkVar.d.e(null);
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() > 0) {
                skkVar.d((SparseArray<Object>) sparseArray);
                skkVar.a((SparseArray<Object>) sparseArray);
            } else {
                LogUtil.j("FunctionSetTemperatureCardReader", "Temperature data none");
                skkVar.d.e(null);
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_temperature);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.temperature_default_img_big;
        }
        return R.drawable.marketing_default_img_temperature;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        return R.color.function_marketing_big_card_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_blood_temperature;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.d;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetTemperatureCardReader";
    }
}
