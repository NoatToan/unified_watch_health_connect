package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProCommand;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.MenstrualModule;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.functionsetcard.view.PhysiologicalCycleDotMatrixView;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class skg extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PhysiologicalCycleDotMatrixView f48258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48259c;
    private List<HiHealthData> d;
    private List<HiHealthData> e;
    private long f;
    private e g;
    private List<Integer> i;
    private long j;

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isMessageDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isNeedRefreshOnResume() {
        return false;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return false;
    }

    public skg(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetPhysiologicalCycleCardReader", cardConfig);
        this.f48259c = -1;
        this.d = new ArrayList();
        this.g = new e();
        this.f48257a = true;
        setFunctionSetBean(buildEmptyCardBean());
        xkb.d("900300050", new b(this));
        subscribeDataChange();
        ReleaseLogUtil.d("TimeEat_FunctionSetPhysiologicalCycleCardReader", "FunctionSetPhysiologicalCycleCardReader ");
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "createCardView");
        if (!njy.e(this.d)) {
            PhysiologicalCycleDotMatrixView physiologicalCycleDotMatrixView = new PhysiologicalCycleDotMatrixView(this.mContext, this.d);
            this.f48258b = physiologicalCycleDotMatrixView;
            physiologicalCycleDotMatrixView.setDrawingCacheEnabled(true);
            this.f48258b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            PhysiologicalCycleDotMatrixView physiologicalCycleDotMatrixView2 = this.f48258b;
            physiologicalCycleDotMatrixView2.layout(0, 0, physiologicalCycleDotMatrixView2.getMeasuredWidth(), this.f48258b.getMeasuredHeight());
            this.f48258b.buildDrawingCache();
            ImageView imageView = new ImageView(this.mContext);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageBitmap(this.f48258b.getDrawingCache());
            return imageView;
        }
        return this.f48258b;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(103);
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(arrayList, new c("FunctionSetPhysiologicalCycleCardReader", this));
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "subscribeDataChange typeList:", arrayList);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "unsubscribeDataChange");
        if (njy.b(this.i)) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.i, new FunctionSetBeanReader.c("FunctionSetPhysiologicalCycleCardReader", "onDestroy unSubscribeHiHealthData"));
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void readCardData() {
        super.readCardData();
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "readCardData");
        i();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "updateSuccessList successList ", list);
        if (njy.e(list)) {
            return;
        }
        this.i = list;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public int getCardType() {
        return this.f48259c;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        if (b()) {
            LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "onBindViewHolder is fast click");
        } else {
            LoginInit.getInstance(this.mContext).browsingToLogin(new IBaseResponseCallback() { // from class: skg.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        skg.this.d();
                    } else {
                        LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "browsingToLogin errorCode is not success", Integer.valueOf(i));
                    }
                }
            }, AnalyticsValue.HEALTH_HOME_PHYSIOLOGICAL_CYCLE_CARD_2010102.value());
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        if (!(viewHolder instanceof FunctionSetBeanReader.MyHolder)) {
            LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "onBindViewHolder viewHolder ", viewHolder);
            return;
        }
        FunctionSetBeanReader.MyHolder myHolder = (FunctionSetBeanReader.MyHolder) viewHolder;
        if (myHolder.f7091a == null) {
            return;
        }
        myHolder.f7091a.setSingleLine(false);
        myHolder.f7091a.setMaxLines(2);
        ReleaseLogUtil.d("TimeEat_FunctionSetPhysiologicalCycleCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j) {
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "requestData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(j);
        hiDataReadOption.setType(new int[]{47401, 47405});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(720);
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "readHiHealthData : ", hiDataReadOption.toString());
        HiHealthNativeApi.a(this.mContext).readHiHealthData(hiDataReadOption, new a(this, 0));
    }

    private void i() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{47401});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).b(HiJsonUtil.d(new HiDataFilter(new HiDataFilter.DataFilterExpression(47401, "=", 101.0d)))).b();
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "requestLastData : ", hiDataReadProOptionB.toString());
        HiHealthNativeApi.a(this.mContext).readHiHealthDataPro(hiDataReadProOptionB, new a(this, 1));
    }

    private long e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.setFirstDayOfWeek(1);
        calendar.add(5, calendar.getFirstDayOfWeek() - calendar.get(7));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        e();
    }

    private void e() {
        f();
        HashMap map = new HashMap(1);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HOME_PHYSIOLOGICAL_CYCLE_CARD_2010102.value(), map, 0);
    }

    private void f() {
        final H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?from=0");
        HandlerExecutor.c(new Runnable() { // from class: skg.3
            @Override // java.lang.Runnable
            public void run() {
                ddv.b().initH5Pro();
            }
        }, 6000L);
        builder.setImmerse().showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true).enableOnPauseCallback().enableOnResumeCallback().setNeedSoftInputAdapter();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("menstrual", MenstrualModule.class);
        if (!VersionControlUtil.isSupportActivityTransitionAnimation((Activity) this.mContext) || isShowHomePageRecommendLayout()) {
            ddv.b().loadH5ProApp(this.mContext, "com.huawei.health.h5.cycle-calendar", builder);
            a();
        } else {
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "start cycle calendar");
            pez.d().launchActivity(BaseApplication.getContext(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: skd
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return this.f48256c.d(builder, context, intent);
                }
            });
        }
    }

    /* synthetic */ boolean d(H5ProLaunchOption.Builder builder, Context context, Intent intent) {
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "cycle calendar plugin has download");
        tfc.d(this.mContext, new H5ProCommand.Builder().setupLoad().setPackageName("com.huawei.health.h5.cycle-calendar").setLaunchOption(H5proUtil.buildOption("com.huawei.health.h5.cycle-calendar", builder)).build(), this.mCardViewHolder.itemView);
        a();
        return false;
    }

    private void a() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: skf
            @Override // java.lang.Runnable
            public final void run() {
                skg.c();
            }
        });
    }

    static /* synthetic */ void c() {
        try {
            String strJ = tfi.j(BaseApplication.getContext());
            if (TextUtils.isEmpty(strJ)) {
                LogUtil.e("FunctionSetPhysiologicalCycleCardReader", "getMenstrualSwitch is null.");
                return;
            }
            JSONObject jSONObject = new JSONObject(strJ);
            int i = jSONObject.getInt("masterSwitch");
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "getMenstrualSwitch is ", Integer.valueOf(i));
            if (i == 1) {
                return;
            }
            jSONObject.put("masterSwitch", 1);
            HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("com.huawei.health.mc");
            if (userPreference == null) {
                ReleaseLogUtil.e("FunctionSetPhysiologicalCycleCardReader", "activateMenstrual userPreference is null");
                return;
            }
            userPreference.setValue(jSONObject.toString());
            userPreference.setSyncStatus(0);
            HiHealthManager.d(BaseApplication.getContext()).setUserPreference(userPreference);
        } catch (JSONException unused) {
            LogUtil.e("FunctionSetPhysiologicalCycleCardReader", "activateMenstrual JSONException.");
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        Context context = BaseApplication.getContext();
        Resources resources = context.getResources();
        return new FunctionSetBean.c(resources.getString(R.string.IDS_physiological_cycle)).c(resources.getString(R.string.IDS_physiological_cycle_description)).e(FunctionSetType.PHYSIOLOGICAL_CYCLE_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(context).a();
    }

    private FunctionSetBean e(List<HiHealthData> list, String str, CharSequence charSequence, CharSequence charSequence2) {
        setBiHasData(this.j);
        Context context = BaseApplication.getContext();
        Resources resources = context.getResources();
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(resources.getString(R.string.IDS_physiological_cycle)).c(resources.getString(R.string.IDS_physiological_cycle_description)).e(charSequence).e(FunctionSetType.PHYSIOLOGICAL_CYCLE_CARD).b(context).c(FunctionSetBean.ViewType.DATA_VIEW).d(str).g(charSequence2).d(list).a();
        functionSetBeanA.d(String.valueOf(wuw.e()).hashCode());
        return functionSetBeanA;
    }

    private boolean b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f < 500) {
            return true;
        }
        this.f = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list) {
        String strValueOf;
        boolean z;
        FunctionSetBean functionSetBeanE;
        int iB;
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "handleData data size ", Integer.valueOf(list.size()));
        c(list);
        long jC = ltb.c(System.currentTimeMillis());
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                strValueOf = "101.0";
                z = true;
                break;
            } else {
                if (jC == list.get(i3).getStartTime()) {
                    z = false;
                    int i4 = i3;
                    strValueOf = String.valueOf(list.get(i3).getDouble("point_value"));
                    i = i4;
                    break;
                }
                if (this.j == list.get(i3).getStartTime()) {
                    i2 = i3;
                }
                i3++;
            }
        }
        if (!z && (iB = wuw.b("FunctionSetPhysiologicalCycleCardReader", list, i, this.j)) >= 0) {
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "handleData lastIndexTemp ", Integer.valueOf(iB), " lastIndex ", Integer.valueOf(i2), " isLong ", Boolean.valueOf(z));
            z = true;
            i2 = iB;
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "M/d"));
        String string = "";
        if (z) {
            long j = this.j;
            long jC2 = c(list, i2);
            date.setTime(j);
            String str = simpleDateFormat.format(date);
            date.setTime(jC2);
            String str2 = simpleDateFormat.format(date);
            e(i2, list);
            functionSetBeanE = e(list, String.format(Locale.ROOT, this.mContext.getString(R.string.IDS_physiology_scope), str, str2), tfc.d(this.mContext.getResources().getString(R.string.IDS_physiology_none), ""), qre.a(R.string.accessibility_range, UnitUtil.a(new Date(j), 24), UnitUtil.a(new Date(jC2), 24)));
            setFunctionSetBean(functionSetBeanE);
            this.f48259c = 6;
        } else {
            date.setTime(System.currentTimeMillis());
            String str3 = simpleDateFormat.format(date);
            int iA = (i - 21) + a(jC);
            int iA2 = a(jC);
            this.d.clear();
            if (iA < 0) {
                a(list, iA);
                this.d.addAll(list.subList(0, 21));
            } else {
                this.d.addAll(list.subList(iA, iA2 + i));
            }
            if (iA < 0) {
                i -= iA;
            }
            int iB2 = wuw.b("FunctionSetPhysiologicalCycleCardReader", strValueOf, list, i);
            Pair<Integer, CharSequence> pairA = wuw.a("FunctionSetPhysiologicalCycleCardReader", strValueOf, list, i);
            this.f48259c = ((Integer) pairA.first).intValue();
            functionSetBeanE = e(list, str3, tfc.d(String.valueOf(pairA.second), UnitUtil.e(iB2, 1, 0)), UnitUtil.a(date, 24));
            setFunctionSetBean(functionSetBeanE);
        }
        if (functionSetBeanE != null) {
            string = functionSetBeanE.toString();
        }
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "handleData, bean: ", string);
    }

    private static void a(List<HiHealthData> list, int i) {
        for (int i2 = 0; i2 < Math.abs(i); i2++) {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setStartTime(lsl.d(list.get(0).getStartTime(), 1));
            list.add(0, hiHealthData);
        }
        if (list.size() < 21) {
            int size = list.size();
            for (int i3 = 0; i3 < 21 - size; i3++) {
                HiHealthData hiHealthData2 = new HiHealthData();
                hiHealthData2.setStartTime(lsl.d(list.get(list.size() - 1).getStartTime(), -1));
                list.add(hiHealthData2);
            }
        }
    }

    private void e(int i, List<HiHealthData> list) {
        this.d.clear();
        int iMax = Math.max((i - 21) + a(this.j), 0);
        int size = iMax + 21;
        if (size > list.size()) {
            size = list.size();
            iMax = size - 21;
        }
        this.d.addAll(list.subList(iMax, size));
    }

    private void c(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "data is invalid");
            return;
        }
        while (list.size() > 0 && Math.abs(list.get(0).getDouble("point_value")) < 1.0E-6d) {
            list.remove(0);
        }
    }

    private long c(List<HiHealthData> list, int i) {
        long jE = e(this.j) + 1728000000;
        while (i >= 0) {
            if ("102.0".equals(String.valueOf(list.get(i).getDouble("point_value")))) {
                jE = list.get(i).getStartTime();
                break;
            }
            i--;
        }
        LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "getEndMenstrual : ", Long.valueOf(jE));
        return jE;
    }

    private int a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(7);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (this.f48257a) {
            this.f48257a = false;
            return;
        }
        readCardData();
        ReleaseLogUtil.d("TimeEat_FunctionSetPhysiologicalCycleCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
    }

    static class e extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<skg> f48263a;
        private boolean e;

        private e(skg skgVar) {
            super("FunctionSetPhysiologicalCycleCardReader", null);
            this.f48263a = new WeakReference<>(skgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(List<HiHealthData> list) {
            if (njy.e(list)) {
                skg.saveDataFromHealthApi("FunctionSetPhysiologicalCycleCardReader", this.f48263a, (HiHealthData) null);
                return;
            }
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "dataList size: ", Integer.valueOf(list.size()));
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.putString("_", marshallListToString(list));
            skg.saveDataFromHealthApi("FunctionSetPhysiologicalCycleCardReader", this.f48263a, hiHealthData);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            skg skgVar = this.f48263a.get();
            if (skgVar == null) {
                LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "handleCacheData bloodPressureReader is null");
                return;
            }
            if (hiHealthData == null) {
                skg.setHasCardData(this.f48263a, false);
                if (!z) {
                    skgVar.refreshCardBySp(skgVar.buildEmptyCardBean());
                }
                if (this.e && z) {
                    skgVar.notifyItemChanged(skgVar.buildEmptyCardBean());
                    return;
                }
                return;
            }
            this.e = true;
            ArrayList arrayList = new ArrayList(16);
            unmarshallListFromString(hiHealthData.getString("_"), arrayList);
            if (arrayList.isEmpty()) {
                LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "lineChartDataList is empty");
                skg.setHasCardData(this.f48263a, false);
                if (!z) {
                    skgVar.refreshCardBySp(skgVar.buildEmptyCardBean());
                    return;
                } else {
                    skgVar.notifyItemChanged(skgVar.buildEmptyCardBean());
                    return;
                }
            }
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "refresh data card");
            skgVar.e = arrayList;
            skgVar.b(arrayList);
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "handleData end");
            skg.setHasCardData(this.f48263a, true);
            if (!z) {
                skgVar.refreshCardBySp(skgVar.getFunctionSetBean());
            } else {
                skgVar.notifyItemChanged(skgVar.getFunctionSetBean());
            }
        }
    }

    static class c extends FunctionSetBeanReader.e {
        private final WeakReference<FunctionSetBeanReader> e;

        public c(String str, FunctionSetBeanReader functionSetBeanReader) {
            super(str, functionSetBeanReader);
            this.e = new WeakReference<>(functionSetBeanReader);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader.e, com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, final String str, HiHealthData hiHealthData, long j) {
            if (i == 103 && "900300050".equals(str)) {
                LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "InnerSubscribeListener onChange changeKey ", str);
                ThreadPoolManager.c().execute(new Runnable() { // from class: ske
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.b(str);
                    }
                });
            }
            super.onChange(i, hiHealthClient, str, hiHealthData, j);
        }

        /* synthetic */ void b(String str) {
            xkb.d(str, new b(this.e.get()));
        }
    }

    static class b implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FunctionSetBeanReader> f48262a;

        b(FunctionSetBeanReader functionSetBeanReader) {
            this.f48262a = new WeakReference<>(functionSetBeanReader);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "InnerSampleConfigListener onResult errorCode ", Integer.valueOf(i), " object ", obj);
            if (i == 0 && wuw.a("FunctionSetPhysiologicalCycleCardReader", obj) != null) {
                FunctionSetBeanReader functionSetBeanReader = this.f48262a.get();
                if (!(functionSetBeanReader instanceof skg)) {
                    ReleaseLogUtil.e("TimeEat_FunctionSetPhysiologicalCycleCardReader", "InnerSampleConfigListener onResult reader ", functionSetBeanReader);
                    return;
                }
                skg skgVar = (skg) functionSetBeanReader;
                if (!njy.e(skgVar.e)) {
                    skgVar.b((List<HiHealthData>) skgVar.e);
                    skgVar.notifyItemChanged(functionSetBeanReader.getFunctionSetBean());
                } else {
                    ReleaseLogUtil.e("TimeEat_FunctionSetPhysiologicalCycleCardReader", "InnerSampleConfigListener onResult cardReader.mDataList is null");
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            ReleaseLogUtil.e("TimeEat_FunctionSetPhysiologicalCycleCardReader", "InnerSampleConfigListener onResultIntent errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3), " intentType ", Integer.valueOf(i), " object ", obj);
        }
    }

    static class a implements HiDataReadResultListener {
        private WeakReference<skg> d;
        private int e;

        a(skg skgVar, int i) {
            this.d = new WeakReference<>(skgVar);
            this.e = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "onResult, errorCode: ", Integer.valueOf(i), ", mType: ", Integer.valueOf(this.e));
            skg skgVar = this.d.get();
            if (skgVar == null) {
                LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "reader is null!");
                return;
            }
            if (obj == null) {
                LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "data is null!");
                skgVar.g.c(null);
                return;
            }
            if (!(obj instanceof SparseArray)) {
                skgVar.g.c(null);
                return;
            }
            SparseArray<List<HiHealthData>> sparseArray = (SparseArray) obj;
            if (sparseArray.size() == 0) {
                LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "map.size() == 0");
                skgVar.g.c(null);
                return;
            }
            int i3 = this.e;
            if (i3 == 1) {
                d(sparseArray.get(47401).get(0), skgVar);
            } else {
                if (i3 == 0) {
                    List<HiHealthData> list = sparseArray.get(47401);
                    b(sparseArray, list);
                    skgVar.g.c(list);
                    return;
                }
                LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "mType is error");
            }
        }

        private void b(SparseArray<List<HiHealthData>> sparseArray, List<HiHealthData> list) {
            if (sparseArray == null) {
                LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "insertOvulation: map is null");
                return;
            }
            List<HiHealthData> list2 = sparseArray.get(47405);
            Object objValueOf = Constants.NULL;
            Object objValueOf2 = list != null ? Integer.valueOf(list.size()) : Constants.NULL;
            if (list2 != null) {
                objValueOf = Integer.valueOf(list2.size());
            }
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "insertOvulation: ", "list size: ", objValueOf2, ", ovulationList size: ", objValueOf);
            if (list == null || list2 == null) {
                return;
            }
            int iMin = Math.min(list.size(), list2.size());
            for (int i = 0; i < iMin; i++) {
                String strValueOf = String.valueOf(list.get(i).getDouble("point_value"));
                if (("400.0".equals(strValueOf) || "401.0".equals(strValueOf) || "402.0".equals(strValueOf) || "403.0".equals(strValueOf)) && "2.0".equals(String.valueOf(list2.get(i).getDouble("point_value")))) {
                    LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "ovulation day: ", new Date(list2.get(i).getStartTime()));
                    list.get(i).putDouble("point_value", list2.get(i).getDouble("point_value"));
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("FunctionSetPhysiologicalCycleCardReader", "onResultIntent : read failed errorCode is", Integer.valueOf(i2));
        }

        private void d(HiHealthData hiHealthData, skg skgVar) {
            if (hiHealthData == null || !String.valueOf(hiHealthData.getDouble("point_value")).equals("101.0")) {
                LogUtil.j("FunctionSetPhysiologicalCycleCardReader", "handleLastData : list is error");
                return;
            }
            long j = hiHealthData.getLong("start_time");
            skgVar.j = j;
            SharedPreferenceManager.c("privacy_center", "physiological_cycle", String.valueOf(j));
            skgVar.d(j + 31104000000L);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.marketing_default_img_physiological_cycle_new);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.recycle_default_img_big;
        }
        return R.drawable.marketing_default_img_physiological_cycle;
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
        return R.string.IDS_function_set_card_button_recycle;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.g;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetPhysiologicalCycleCardReader";
    }
}
