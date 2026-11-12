package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.seekbar.HealthSeekBarExtend;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class sjq extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f48189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f48190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f48191c;
    private boolean d;
    private String e;
    private List<HiHealthData> f;
    private Observer g;
    private long h;
    private final String i;
    private c j;
    private f l;
    private HealthSeekBarExtend m;
    private final Resources o;

    public sjq(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetBloodPressureReader", cardConfig);
        this.d = false;
        this.f48190b = new d(this);
        this.f48191c = null;
        this.f = new ArrayList(3);
        this.o = e().getResources();
        this.f48189a = new a(this);
        subscribeDataChange();
        ThreadPoolManager.c().execute(new Runnable() { // from class: sjo
            @Override // java.lang.Runnable
            public final void run() {
                uth.b();
            }
        });
        i();
        fej.d((DownloadCallback<File>) null);
        BloodPressureUtil.i();
        c cVar = new c(this);
        this.j = cVar;
        ObserverManagerUtil.d(cVar, ObserveLabels.SUMMARY_DATA_INIT);
        this.i = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        LogUtil.a("FunctionSetBloodPressureReader", "subscribeDataChange");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(HiSubscribeType.f12261c));
        HiHealthNativeApi.a(e()).subscribeHiHealthData(arrayList, new FunctionSetBeanReader.e("FunctionSetBloodPressureReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetBloodPressureReader", "unsubscribeDataChange");
        if (njy.e(this.f48191c)) {
            LogUtil.j("FunctionSetBloodPressureReader", "onDestroy mBloodPressureSuccessList is empty");
        } else {
            HiHealthNativeApi.a(e()).unSubscribeHiHealthData(this.f48191c, new FunctionSetBeanReader.c("FunctionSetBloodPressureReader", "unSubscribeBloodPressureData, isSuccess :"));
        }
    }

    static class c implements Observer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<sjq> f48196b;

        c(sjq sjqVar) {
            this.f48196b = new WeakReference<>(sjqVar);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            sjq sjqVar = this.f48196b.get();
            if (sjqVar == null || objArr == null || !ObserveLabels.SUMMARY_DATA_INIT.equals(str)) {
                ReleaseLogUtil.e("FunctionSetBloodPressureReader", "InnerObserver notify functionSetBloodPressureReader ", sjqVar, " objects ", objArr, " label ", str);
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Integer) || !(objArr[1] instanceof HashMap)) {
                ReleaseLogUtil.e("FunctionSetBloodPressureReader", "InnerObserver notify is not legal");
                return;
            }
            Integer num = (Integer) obj;
            num.intValue();
            HashMap map = (HashMap) objArr[1];
            LogUtil.a("FunctionSetBloodPressureReader", "initSummary errorCode： ", num);
            Message messageObtainMessage = sjqVar.f48189a.obtainMessage();
            messageObtainMessage.what = 7;
            messageObtainMessage.obj = map.get(MessageConstant.BLOOD_PRESSURE_TYPE);
            sjqVar.f48189a.sendMessage(messageObtainMessage);
        }
    }

    private void i() {
        LogUtil.d("FunctionSetBloodPressureReader", "registerSyncDataBroadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        this.l = new f(this);
        LocalBroadcastManager.getInstance().registerReceiver(this.l, intentFilter);
        Observer observer = new Observer() { // from class: sjq.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!StringUtils.g(str)) {
                    sjq.this.b(str);
                } else {
                    LogUtil.e("FunctionSetBloodPressureReader", "label is null");
                }
            }
        };
        this.g = observer;
        ObserverManagerUtil.d(observer, "com.huawei.plugin.account.login");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if ("com.huawei.plugin.account.login".equals(str)) {
            LogUtil.a("FunctionSetBloodPressureReader", "actionLoginSuccess, clear mBloodPressureSummaryText");
            this.e = "";
            if (this.d) {
                LogUtil.a("FunctionSetBloodPressureReader", "isRegFailed true");
                subscribeDataChange();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(double d2, double d3, long j, int i, boolean z) {
        setHasCardData(true);
        this.h = j;
        setBiHasData(j);
        setBiHasDataType("single");
        String strB = tfc.b(j);
        LogUtil.a("FunctionSetBloodPressureReader", "refreshBloodPressureDataAndTime shortDate ", strB);
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(this.o.getString(R.string.IDS_hw_show_main_home_page_bloodpressure)).e(tfc.b("[\\d\\/]", qre.e(R.plurals.IDS_blood_pressure_result_unit, UnitUtil.b(d2, Locale.getDefault()), UnitUtil.e(d3, 1, 0), UnitUtil.e(d2, 1, 0)))).d((CharSequence) ftw.e((int) d3, (int) d2)).e(FunctionSetType.BLOOD_PRESSURE_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).d(strB).g(tfc.d(this.h)).b(e()).a(a()).a();
        if (g()) {
            functionSetBeanA.b((CharSequence) this.e);
        } else {
            functionSetBeanA.b("");
        }
        functionSetBeanA.d(i);
        setFunctionSetBean(functionSetBeanA);
        if (z) {
            Message messageObtainMessage = this.f48189a.obtainMessage();
            messageObtainMessage.what = 5;
            messageObtainMessage.obj = functionSetBeanA;
            this.f48189a.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanA);
    }

    public boolean a() {
        if (fua.p()) {
            return !"false".equals(this.mContext.getSharedPreferences(BleConstants.BLOOD_PRESSURE, 0).getString("has_new_data" + this.i, ""));
        }
        return lua.a("BloodPressure", "has_new_data", false);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        FunctionSetBean functionSetBean = functionSetSubCardData.getFunctionSetBean();
        if (!(viewHolder instanceof FunctionSetBeanReader.MyHolder) || functionSetBean == null) {
            LogUtil.j("FunctionSetBloodPressureReader", "onBindViewHolder viewHolder ", viewHolder);
            return;
        }
        View view = ((FunctionSetBeanReader.MyHolder) viewHolder).itemView;
        LogUtil.a("FunctionSetBloodPressureReader", "bloodPressureView: " + view);
        if (functionSetBean.r() == FunctionSetBean.ViewType.EMPTY_VIEW) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.function_set_empty_items_title);
            if (healthTextView == null) {
                LogUtil.e("FunctionSetBloodPressureReader", "cardView is null");
                return;
            }
            b(healthTextView);
        }
        ReleaseLogUtil.d("TimeEat_FunctionSetBloodPressureReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void b(HealthTextView healthTextView) {
        int dimensionPixelSize;
        int i;
        if (LanguageUtil.q(e()) || LanguageUtil.t(e()) || LanguageUtil.v(e()) || LanguageUtil.p(e()) || LanguageUtil.ax(e()) || LanguageUtil.g(e()) || LanguageUtil.az(e()) || LanguageUtil.ai(e()) || LanguageUtil.ab(e())) {
            dimensionPixelSize = this.o.getDimensionPixelSize(R.dimen.default_text_font_size_small);
        } else {
            dimensionPixelSize = this.o.getDimensionPixelSize(R.dimen.textSizeBody1);
        }
        float f2 = dimensionPixelSize;
        if (LanguageUtil.q(e())) {
            f2 = this.o.getDisplayMetrics().density * 13.0f;
            i = 2;
        } else {
            i = 0;
        }
        float f3 = this.o.getDisplayMetrics().density;
        if (healthTextView != null) {
            if (Math.abs(f3) > 1.0E-6f) {
                healthTextView.setTextSize(1, f2 / f3);
            }
            healthTextView.setPadding(0, i, 0, 0);
        }
    }

    private void d(String str) {
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("from", "1");
        lmf.d().c(e(), str, map, 0);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onBottomLayoutClickListener(ViewGroup viewGroup) {
        if (viewGroup == null) {
            LogUtil.j("FunctionSetBloodPressureReader", "relativeLayout is null");
        } else {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: sjq.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.r()) {
                        LogUtil.j("FunctionSetBloodPressureReader", "onBottomLayoutClickListener is fast click");
                    } else if (fua.p()) {
                        sjq.this.h();
                    } else {
                        sjq sjqVar = sjq.this;
                        sjqVar.e(sjqVar.g());
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return i == HiSubscribeType.f12261c;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        super.readCardData();
        c(System.currentTimeMillis(), new ArrayList());
        refreshRedDotSyncNotify(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j, List<HiHealthData> list) {
        LogUtil.a("FunctionSetBloodPressureReader", "start queryLastData endTime: ", Long.valueOf(j), " list size: ", Integer.valueOf(list.size()));
        HiAggregateOption hiAggregateOptionB = b();
        hiAggregateOptionB.setCount(1);
        hiAggregateOptionB.setTimeRange(0L, j);
        HiHealthManager.d(e()).aggregateHiHealthData(hiAggregateOptionB, new e(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j, long j2, List<HiHealthData> list) {
        LogUtil.a("FunctionSetBloodPressureReader", "start queryTimeRange startTime: ", Long.valueOf(j), " endTime: ", Long.valueOf(j2));
        HiAggregateOption hiAggregateOptionB = b();
        hiAggregateOptionB.setTimeRange(j, j2);
        HiHealthManager.d(e()).aggregateHiHealthData(hiAggregateOptionB, new b(j, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiHealthData e(List<HiHealthData> list) {
        HiHealthData hiHealthData = new HiHealthData();
        double d2 = 0.0d;
        long jMax = 0;
        double d3 = 0.0d;
        for (HiHealthData hiHealthData2 : list) {
            d2 += hiHealthData2.getDouble("BLOOD_PRESSURE_SYSTOLIC");
            d3 += hiHealthData2.getDouble("BLOOD_PRESSURE_DIASTOLIC");
            jMax = Math.max(jMax, hiHealthData2.getStartTime());
        }
        double size = list.size();
        hiHealthData.putDouble("BLOOD_PRESSURE_SYSTOLIC", Math.round(d2 / size));
        hiHealthData.putDouble("BLOOD_PRESSURE_DIASTOLIC", Math.round(d3 / size));
        hiHealthData.setStartTime(jMax);
        hiHealthData.setEndTime(jMax);
        return hiHealthData;
    }

    private HiAggregateOption b() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{2006, 2007});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("FunctionSetBloodPressureReader", "showEmptyView");
        FunctionSetBean functionSetBeanBuildEmptyCardBean = buildEmptyCardBean();
        Message messageObtainMessage = this.f48189a.obtainMessage();
        messageObtainMessage.what = 5;
        messageObtainMessage.obj = functionSetBeanBuildEmptyCardBean;
        this.f48189a.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(this.o.getString(R.string.IDS_hw_show_main_home_page_bloodpressure)).c(this.o.getString(R.string.IDS_hw_show_main_home_page_bloodpressure_description)).e(FunctionSetType.BLOOD_PRESSURE_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(e()).a(false).a();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetBloodPressureReader", "updateSuccessList");
        if (njy.e(list)) {
            LogUtil.j("FunctionSetBloodPressureReader", "updateSuccessList successList is empty");
            this.d = true;
        } else {
            this.f48191c = list;
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        j();
        return this.m;
    }

    private void j() {
        View viewInflate = LayoutInflater.from(e()).inflate(R.layout.card_blood_pressure_blood_sugar, (ViewGroup) null);
        LogUtil.a("FunctionSetBloodPressureReader", "initBloodPressureSeekBar inflated view: ", viewInflate);
        HealthSeekBarExtend healthSeekBarExtend = (HealthSeekBarExtend) viewInflate.findViewById(R.id.blood_sugar_seek_bar);
        this.m = healthSeekBarExtend;
        if (healthSeekBarExtend == null) {
            LogUtil.e("FunctionSetBloodPressureReader", "initBloodPressureSeekBar mSeekBarExtend is null");
            return;
        }
        int i = 100;
        healthSeekBarExtend.setMax(100);
        this.m.setThumb(ContextCompat.getDrawable(e(), R.drawable.ic_health_progressbar));
        List<HiHealthData> list = this.f;
        HiHealthData hiHealthData = list.get(list.size() - 1);
        double d2 = hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC");
        double d3 = hiHealthData.getDouble("BLOOD_PRESSURE_DIASTOLIC");
        int iA = BloodPressureUtil.a((int) d2, (int) d3);
        LogUtil.d("FunctionSetBloodPressureReader", "progress = ", Integer.valueOf(iA), "systolic ", Double.valueOf(d2), ", diastolic", Double.valueOf(d3));
        if (iA < 0) {
            i = 0;
        } else if (iA <= 100) {
            LogUtil.d("FunctionSetBloodPressureReader", "The progress is normal. No special handling is required.");
            i = iA;
        }
        int iA2 = ftw.a();
        if (iA2 == 6) {
            this.m.setRulerSrc(ContextCompat.getDrawable(e(), R.drawable.health_blood_pressure_six_grade_seekbar));
        } else if (iA2 == 5) {
            this.m.setRulerSrc(ContextCompat.getDrawable(e(), R.drawable.health_blood_pressure_five_grade_seekbar));
        } else {
            this.m.setRulerSrc(ContextCompat.getDrawable(e(), R.drawable.health_blood_pressure_four_grade_seekbar));
        }
        this.m.setProgress(i);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        if (qrs.c(500)) {
            return;
        }
        if (fua.p()) {
            h();
        } else {
            e(g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        refreshRedDotSyncNotify(false);
        d(AnalyticsValue.HEALTH_HOME_BLOOD_PRESSURE_DETAIL_2010025.value());
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) KnitBloodPressureActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("key_bundle_health_last_data_time", this.h);
        if (z) {
            intent.putExtra("is_scroll_to_summary", true);
        }
        tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        refreshRedDotSyncNotify(false);
        qdm.p();
        Bundle bundle = new Bundle();
        bundle.putString("page_id", ArkUIXConstants.KNIT_BLOOD_PRESSURE);
        bundle.putInt("module_type", 6);
        bundle.putString("time_stamp", String.valueOf(this.h));
        bundle.putString("bi_from_pullFrom", "Today_0001");
        bundle.putString("bi_from_resourceName", "home_card");
        bundle.putString("bi_from_pullOrder", String.valueOf(this.mCardViewHolder.getLayoutPosition()));
        Intent intentC = fti.c(this.mContext, bundle);
        if (intentC != null) {
            tfc.a(this.mContext, intentC, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, true);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        a aVar = this.f48189a;
        if (aVar == null) {
            LogUtil.j("FunctionSetBloodPressureReader", "onDestroy mHandler is null");
        } else {
            aVar.removeCallbacksAndMessages(null);
        }
        LocalBroadcastManager.getInstance().unregisterReceiver(this.l);
        ObserverManagerUtil.a(this.g, "com.huawei.plugin.account.login");
        ObserverManagerUtil.c(this.j);
    }

    public static class a extends BaseHandler<sjq> {
        a(sjq sjqVar) {
            super(Looper.getMainLooper(), sjqVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(sjq sjqVar, Message message) {
            Object obj = message.obj;
            int i = message.what;
            if (i == 5) {
                if (obj instanceof FunctionSetBean) {
                    sjqVar.notifyItemChanged((FunctionSetBean) obj);
                    return;
                }
                return;
            }
            if (i == 6) {
                if (obj instanceof List) {
                    List<HiHealthData> list = (List) obj;
                    if (njy.b(list)) {
                        sjqVar.f48190b.b(list);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 7) {
                boolean zN = qdm.n();
                LogUtil.a("FunctionSetBloodPressureReader", "handleMessageWhenReferenceNotNull isOpenBloodPressure ", Boolean.valueOf(zN));
                if (!zN && (obj instanceof Pair)) {
                    Pair pair = (Pair) obj;
                    if (!(pair.first instanceof Integer) || !(pair.second instanceof String)) {
                        LogUtil.j("FunctionSetBloodPressureReader", "handleMessageWhenReferenceNotNull bloodPressureText is error");
                        return;
                    }
                    Integer num = (Integer) pair.first;
                    num.intValue();
                    String str = (String) pair.second;
                    LogUtil.a("FunctionSetBloodPressureReader", "cardId is：", num, "bloodPressureText is：", str);
                    if (!TextUtils.isEmpty(str)) {
                        sjqVar.e = str;
                        FunctionSetBean functionSetBean = sjqVar.getFunctionSetBean();
                        if (functionSetBean == null) {
                            ReleaseLogUtil.e("FunctionSetBloodPressureReader", "handleMessageWhenReferenceNotNull functionSetBean is null");
                            return;
                        } else {
                            functionSetBean.b((CharSequence) str);
                            sjqVar.notifyItemChanged(functionSetBean);
                            return;
                        }
                    }
                    LogUtil.j("FunctionSetBloodPressureReader", "handleMessageWhenReferenceNotNull bloodPressureText ", str);
                    return;
                }
                return;
            }
            LogUtil.j("FunctionSetBloodPressureReader", "case default");
        }
    }

    static class d extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48197a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<sjq> f48198c;
        private List<HiHealthData> e;

        d(sjq sjqVar) {
            super("FunctionSetBloodPressureReader", null);
            this.f48198c = new WeakReference<>(sjqVar);
        }

        void b(List<HiHealthData> list) {
            HiHealthData hiHealthData;
            this.e = list;
            if (njy.b(list)) {
                sjq.setHasCardData(this.f48198c, true);
                hiHealthData = new HiHealthData();
                HiHealthData hiHealthData2 = list.get(list.size() - 1);
                hiHealthData.putDouble("BLOOD_PRESSURE_SYSTOLIC", hiHealthData2.getDouble("BLOOD_PRESSURE_SYSTOLIC"));
                hiHealthData.putDouble("BLOOD_PRESSURE_DIASTOLIC", hiHealthData2.getDouble("BLOOD_PRESSURE_DIASTOLIC"));
                hiHealthData.setStartTime(hiHealthData2.getStartTime());
                hiHealthData.putInt("_u", hiHealthData2.toString().hashCode());
                hiHealthData.putString("_", marshallListToString(list));
                hiHealthData.putInt("trackdata_deviceType", hiHealthData2.getInt("trackdata_deviceType"));
            } else {
                sjq.setHasCardData(this.f48198c, false);
                hiHealthData = null;
            }
            sjq.saveDataFromHealthApi("FunctionSetBloodPressureReader", this.f48198c, hiHealthData);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            sjq sjqVar = this.f48198c.get();
            if (sjqVar == null) {
                LogUtil.j("FunctionSetBloodPressureReader", "handleCacheData bloodPressureReader is null");
                return;
            }
            if (hiHealthData == null) {
                sjq.setHasCardData(this.f48198c, false);
                if (this.f48197a && z) {
                    sjqVar.h = 0L;
                    sjqVar.f();
                    return;
                }
                return;
            }
            this.f48197a = true;
            SharedPreferenceManager.c("privacy_center", BleConstants.BLOOD_PRESSURE, String.valueOf(hiHealthData.getStartTime()));
            List arrayList = this.e;
            if (!z || arrayList == null) {
                arrayList = new ArrayList(16);
                unmarshallListFromString(hiHealthData.getString("_"), arrayList);
            } else {
                this.e = null;
            }
            sjqVar.f = arrayList;
            if (arrayList.isEmpty()) {
                LogUtil.a("FunctionSetBloodPressureReader", "lineChartDataList is empty");
                sjqVar.h = 0L;
                if (z) {
                    return;
                }
                sjqVar.refreshCardBySp(sjqVar.buildEmptyCardBean());
                return;
            }
            double d = hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC");
            double d2 = hiHealthData.getDouble("BLOOD_PRESSURE_DIASTOLIC");
            long startTime = hiHealthData.getStartTime();
            sjqVar.setBiDataSource(hiHealthData.getInt("trackdata_deviceType"));
            sjqVar.b(d2, d, startTime, hiHealthData.getInt("_u"), z);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean == null) {
            return;
        }
        if (g()) {
            functionSetBean.b((CharSequence) this.e);
        } else {
            functionSetBean.b("");
        }
        functionSetBean.a(a());
        notifyItemChanged(functionSetBean);
        ReleaseLogUtil.d("TimeEat_FunctionSetBloodPressureReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (TextUtils.isEmpty(this.e) || qdm.n()) ? false : true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_blood_pressure);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.blood_pressure_default_img_big;
        }
        return R.drawable.marketing_default_img_bloodpressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_function_set_card_button_blood_pressure;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        if (qqs.e(e())) {
            return R.color.function_marketing_big_card_heart_dark;
        }
        return R.color.function_marketing_big_card_heart;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f48190b;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void refreshRedDotSyncNotify(boolean z) {
        utk utkVar = new utk();
        if (z) {
            utkVar.d(true, lsl.d(System.currentTimeMillis(), -60), System.currentTimeMillis(), new IBaseResponseCallback() { // from class: sjq.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    try {
                        boolean zB = sjq.this.b((List<uwh>) (obj instanceof List ? (List) obj : Collections.EMPTY_LIST));
                        LogUtil.a("FunctionSetBloodPressureReader", "sync, is have new bloodpressure data: ", Boolean.valueOf(zB));
                        if (zB) {
                            sjq.this.c(true);
                            sjq.this.d(true);
                        }
                    } catch (Exception unused) {
                        LogUtil.e("FunctionSetBloodPressureReader", "refreshRedDotSyncNotify Exception");
                        sjq.this.c(false);
                    }
                }
            });
        } else {
            c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (fua.p()) {
            this.mContext.getSharedPreferences(BleConstants.BLOOD_PRESSURE, 0).edit().putString("has_new_data" + this.i, String.valueOf(z)).apply();
            return;
        }
        lua.d("BloodPressure", "has_new_data", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<uwh> list) {
        if (njy.e(list)) {
            return false;
        }
        long jC = c();
        LogUtil.a("FunctionSetBloodPressureReader", "isHaveNewData lastDataStartTime = ", Long.valueOf(jC));
        for (uwh uwhVar : list) {
            if (uwhVar != null && !"-1".equals(uwhVar.i()) && uwhVar.g() > jC) {
                return true;
            }
        }
        return false;
    }

    private long c() {
        long jD = 0;
        if (!fua.p()) {
            jD = SharedPreferenceManager.d(Integer.toString(30002), "last_open_data_start_time", 0L);
        } else {
            String string = this.mContext.getSharedPreferences(BleConstants.BLOOD_PRESSURE, 0).getString("last_open_data_start_time" + this.i, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    jD = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                    LogUtil.j("FunctionSetBloodPressureReader", "getPreferenceLastTime parseLong error, lastDataTimeStr = ", string);
                }
            }
        }
        LogUtil.a("FunctionSetBloodPressureReader", "getPreferenceLastTime: ", Long.valueOf(jD));
        return jD;
    }

    protected Context e() {
        return this.mContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.j("FunctionSetBloodPressureReader", "refreshCloudDate isShowDot:", Boolean.valueOf(z));
        setIsShowRedDot(z);
        FunctionSetBean functionSetBean = getFunctionSetBean();
        if (functionSetBean == null) {
            LogUtil.j("FunctionSetBloodPressureReader", "refreshRedDotSyncNotify readData bean is null");
        } else {
            functionSetBean.a(z);
            notifyItemChanged(functionSetBean);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetBloodPressureReader";
    }

    static class f extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<sjq> f48201b;

        f(sjq sjqVar) {
            this.f48201b = new WeakReference<>(sjqVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("FunctionSetBloodPressureReader", "SyncBroadcastReceiver intent is null");
            } else if (intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6) == 2) {
                uth.b();
            }
        }
    }

    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<sjq> f48199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<HiHealthData> f48200c;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private e(sjq sjqVar, List<HiHealthData> list) {
            this.f48199b = new WeakReference<>(sjqVar);
            this.f48200c = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            sjq sjqVar = this.f48199b.get();
            if (sjqVar == null) {
                LogUtil.j("FunctionSetBloodPressureReader", "FunctionSetBloodPressureReader is null in InnerHiAggregateListener");
            } else if (njy.e(list)) {
                LogUtil.j("FunctionSetBloodPressureReader", "queryLastData dataList is empty");
                sjqVar.f48190b.b(this.f48200c);
            } else {
                HiHealthData hiHealthData = list.get(0);
                sjqVar.d(BloodPressureUtil.b(hiHealthData.getStartTime()), BloodPressureUtil.d(hiHealthData.getStartTime()), this.f48200c);
            }
        }
    }

    static class b implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<HiHealthData> f48194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<sjq> f48195c;
        private final long d;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private b(sjq sjqVar, long j, List<HiHealthData> list) {
            this.f48195c = new WeakReference<>(sjqVar);
            this.f48194b = list;
            this.d = j;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            sjq sjqVar = this.f48195c.get();
            if (sjqVar == null) {
                LogUtil.j("FunctionSetBloodPressureReader", "FunctionSetBloodPressureReader is null in InnerHiAggregateListener");
                return;
            }
            if (njy.e(list)) {
                LogUtil.j("FunctionSetBloodPressureReader", "queryTimeRange dataList is empty");
                sjqVar.f48190b.b(this.f48194b);
                return;
            }
            LogUtil.a("FunctionSetBloodPressureReader", "queryTimeRange dataList size: ", Integer.valueOf(list.size()));
            this.f48194b.add(0, sjqVar.e(list));
            if (this.f48194b.size() < 3) {
                sjqVar.c(this.d - 1, this.f48194b);
            } else {
                Message.obtain(sjqVar.f48189a, 6, this.f48194b).sendToTarget();
            }
        }
    }
}
