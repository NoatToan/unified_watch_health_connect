package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity;
import health.compact.a.HiDateUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class skn extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f48282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48283c;
    private StepsViewModel d;
    private List<Integer> e;
    private c f;
    private int g;
    private Observer<HashMap<String, Integer>> h;
    private int i;
    private FunctionSetBean j;
    private boolean k;
    private BroadcastReceiver l;
    private boolean m;
    private a n;
    private e o;
    private int p;
    private Resources q;
    private int r;
    private int s;
    private Observer<Bundle> t;
    private ThreeCircleView u;
    private List<Integer> v;
    private ArrayList<Integer> w;
    private View x;
    private List<Integer> y;

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public float getChartBottomMargin() {
        return -4.0f;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public float getChartTopMargin() {
        return 8.0f;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isMessageDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isOverseaDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i) {
        return false;
    }

    static class c extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Integer> f48284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HiHealthData f48285b;
        private final WeakReference<skn> e;

        c(skn sknVar) {
            super("FunctionSetThreeCircleCardReader", null);
            this.e = new WeakReference<>(sknVar);
        }

        void a(List<Integer> list) {
            this.f48284a = list;
            if (list != null) {
                c(true).putString("_", marshallListToString(list));
            }
        }

        void c(long j, int i, int i2) {
            HiHealthData hiHealthDataC = c(true);
            hiHealthDataC.putLong("_t", j);
            hiHealthDataC.putInt("COMPLETE_GOALS", i);
            hiHealthDataC.putInt("_u", i2);
        }

        void b(boolean z) {
            HiHealthData hiHealthDataC;
            LogUtil.a("FunctionSetThreeCircleCardReader", "saveHealthData isSave", Boolean.valueOf(z));
            if (z) {
                skn.setHasCardData(this.e, true);
                hiHealthDataC = c(false);
            } else {
                skn.setHasCardData(this.e, false);
                this.f48284a = null;
                hiHealthDataC = null;
            }
            this.f48285b = null;
            skn.saveDataFromHealthApi("FunctionSetThreeCircleCardReader", this.e, hiHealthDataC);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            LogUtil.a("FunctionSetThreeCircleCardReader", "handleCacheData threeCircleValueList data ", hiHealthData);
            skn sknVar = this.e.get();
            if (sknVar == null) {
                LogUtil.j("FunctionSetThreeCircleCardReader", "handleCacheData threeCirCleCardReader is null");
                return;
            }
            if (hiHealthData == null) {
                return;
            }
            List arrayList = this.f48284a;
            if (!z || arrayList == null) {
                arrayList = new ArrayList();
                unmarshallListFromString(hiHealthData.getString("_"), arrayList);
            } else {
                this.f48284a = null;
            }
            if (!njy.e(arrayList)) {
                sknVar.a((List<Integer>) arrayList);
                sknVar.m = true;
                sknVar.d(hiHealthData.getLong("_t"), hiHealthData.getInt("COMPLETE_GOALS"), hiHealthData.getInt("_u"), z);
            } else {
                LogUtil.j("FunctionSetThreeCircleCardReader", "handleCacheData threeCircleValueList is empty");
                if (z) {
                    return;
                }
                sknVar.refreshCardBySp(sknVar.buildEmptyCardBean());
            }
        }

        private HiHealthData c(boolean z) {
            if (z && this.f48285b == null) {
                this.f48285b = new HiHealthData();
            }
            return this.f48285b;
        }
    }

    public skn(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetThreeCircleCardReader", cardConfig);
        this.m = false;
        this.k = true;
        this.g = 0;
        this.i = 0;
        this.s = 0;
        this.r = 10000;
        this.v = new ArrayList(Collections.nCopies(6, 0));
        this.p = 0;
        this.e = new ArrayList(Collections.nCopies(6, 0));
        this.l = new d(this);
        this.t = new Observer() { // from class: com.huawei.ui.homehealth.functionsetcard.reader.FunctionSetThreeCircleCardReader$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f25452a.c((Bundle) obj);
            }
        };
        this.h = new Observer() { // from class: com.huawei.ui.homehealth.functionsetcard.reader.FunctionSetThreeCircleCardReader$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f25453a.b((HashMap<String, Integer>) obj);
            }
        };
        LogUtil.a("FunctionSetThreeCircleCardReader", "FunctionSetThreeCircleCardReader context ", context);
        this.n = new a(this);
        this.f = new c(this);
        b();
        e eVar = new e(this);
        this.o = eVar;
        ObserverManagerUtil.d(eVar, ObserveLabels.SUMMARY_DATA_INIT);
    }

    static class e implements com.huawei.haf.design.pattern.Observer {
        private final WeakReference<skn> e;

        e(skn sknVar) {
            this.e = new WeakReference<>(sknVar);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            skn sknVar = this.e.get();
            if (sknVar == null || objArr == null || !ObserveLabels.SUMMARY_DATA_INIT.equals(str)) {
                ReleaseLogUtil.e("FunctionSetThreeCircleCardReader", "InnerObserver notify functionSetThreeCircleCardReader ", sknVar, " objects ", objArr, " label ", str);
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Integer) || !(objArr[1] instanceof HashMap)) {
                ReleaseLogUtil.e("FunctionSetThreeCircleCardReader", "InnerObserver notify is not legal");
                return;
            }
            Integer num = (Integer) obj;
            num.intValue();
            HashMap map = (HashMap) objArr[1];
            LogUtil.a("FunctionSetThreeCircleCardReader", "initSummary errorCode ", num);
            Message messageObtainMessage = sknVar.n.obtainMessage();
            messageObtainMessage.what = 100;
            messageObtainMessage.obj = map.get("activityRings");
            sknVar.n.sendMessage(messageObtainMessage);
        }
    }

    private void b() {
        this.q = this.mContext.getResources();
        f();
        h();
        subscribeDataChange();
        c();
    }

    private void h() {
        if (njy.c(this.v, 5)) {
            this.v.set(1, 270000);
            this.v.set(3, 25);
            this.v.set(5, 12);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        if (this.w == null) {
            ArrayList<Integer> arrayList = new ArrayList<>(16);
            this.w = arrayList;
            arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()));
        }
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(this.w, new FunctionSetBeanReader.e("FunctionSetThreeCircleCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        LogUtil.a("FunctionSetThreeCircleCardReader", "unSubscribeThreeCircleData");
        List<Integer> list = this.y;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.y, new FunctionSetBeanReader.c("FunctionSetThreeCircleCardReader", "unSubscribeThreeCircleData, isSuccess:"));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        LogUtil.a("FunctionSetThreeCircleCardReader", "go to THREE CIRCLE CARD record");
        if (qrs.c(500)) {
            return;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: skq
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f48288c.a(i, obj);
                }
            }, "");
        } else {
            e();
        }
    }

    /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            e();
        }
    }

    private void e() {
        Intent intent = new Intent();
        intent.setClass(this.mContext, KnitActiveRecordActivity.class);
        intent.setFlags(268435456);
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("from", 2);
        c(map);
        intent.putExtra("activeRecordClickFrom", 2);
        boolean zL = qdm.l();
        LogUtil.a("FunctionSetThreeCircleCardReader", "jumpActiveRecordActivity isOpenActiveRecord ", Boolean.valueOf(zL), " mCardId ", Integer.valueOf(this.f48281a));
        if (!zL) {
            intent.putExtra("card_id", this.f48281a);
        }
        if (this.mContext != null) {
            e(intent);
            lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040091.value(), map, 0);
            tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
        }
    }

    private void c(Map<String, Object> map) {
        String[] strArr = {"calorie", "MVPA", "activity"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i += 2) {
            int i2 = i + 1;
            if (njy.e(this.v, i2)) {
                break;
            }
            if (this.v.get(i).intValue() >= this.v.get(i2).intValue() && this.v.get(i2).intValue() > 0) {
                arrayList.add(strArr[i / 2]);
            }
        }
        if (arrayList.size() == 3) {
            arrayList.add("perfect");
        }
        map.put("status", arrayList);
    }

    private void e(Intent intent) {
        if (njy.e(this.v, 5)) {
            LogUtil.j("FunctionSetThreeCircleCardReader", "list is out bound not init");
            return;
        }
        intent.putExtra("current_total_calorie", this.v.get(0));
        intent.putExtra("cur_calorie_goal", this.v.get(1));
        intent.putExtra("current_total_intensity", this.v.get(2));
        intent.putExtra("cur_intensity_goal", this.v.get(3));
        intent.putExtra("current_total_active", this.v.get(4));
        intent.putExtra("cur_active_goal", this.v.get(5));
        intent.putExtra("current_total_step", this.s);
        intent.putExtra("cur_step_goal", this.r);
        intent.putExtra("current_total_distance", this.g);
        intent.putExtra("current_total_floor", this.i);
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
        ReleaseLogUtil.d("TimeEat_FunctionSetThreeCircleCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j, int i, int i2, boolean z) {
        setHasCardData(true);
        FunctionSetBean functionSetBeanD = d(j, i);
        functionSetBeanD.d(i2);
        setFunctionSetBean(functionSetBeanD);
        boolean zH = BaseApplication.h();
        if (z && zH) {
            Message messageObtainMessage = this.n.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = functionSetBeanD;
            this.n.sendMessage(messageObtainMessage);
            return;
        }
        refreshCardBySp(functionSetBeanD);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        LogUtil.a("FunctionSetThreeCircleCardReader", "createCardView ");
        HealthImageView healthImageView = new HealthImageView(this.mContext);
        if (this.m || this.f48282b == null) {
            LogUtil.a("FunctionSetThreeCircleCardReader", "mIsDataUpdated ");
            View view = this.x;
            if (view == null || (view instanceof HealthImageView)) {
                try {
                    View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.card_three_circle_view, (ViewGroup) null);
                    this.x = viewInflate;
                    this.u = (ThreeCircleView) viewInflate.findViewById(R.id.circleProgressBar);
                } catch (InflateException e2) {
                    LogUtil.j("FunctionSetThreeCircleCardReader", e2.getClass().getSimpleName() + "inflate mThreeCircleCardView fail!");
                }
            }
            a(this.v);
            if (this.m) {
                this.m = false;
            }
            this.f48282b = d(this.x);
        }
        healthImageView.setImageBitmap(this.f48282b);
        return healthImageView;
    }

    private Bitmap d(View view) {
        if (view == null) {
            LogUtil.j("FunctionSetThreeCircleCardReader", "getThreeCircleBitmap view == null");
            return null;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec(qrs.q(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qrs.m(), Integer.MIN_VALUE));
        } catch (IllegalStateException e2) {
            LogUtil.j("FunctionSetThreeCircleCardReader", e2.getClass().getSimpleName() + "getThreeCircleBitmap measure fail!");
        }
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Integer> list) {
        this.v = list;
        LogUtil.a("FunctionSetThreeCircleCardReader", "initThreeCircle.");
        if (this.x == null || this.u == null || this.mContext == null) {
            LogUtil.e("FunctionSetThreeCircleCardReader", "initThreeCircle has null object.");
        } else {
            b(list);
        }
    }

    private FunctionSetBean d(long j, int i) {
        LogUtil.a("FunctionSetThreeCircleCardReader", "createFunctionSetBean completedGoals ", Integer.valueOf(i));
        setBiHasData(j);
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(this.q.getString(com.huawei.health.servicesui.R.string.IDS_three_circle_title)).b(this.mContext).e(FunctionSetType.THREE_CIRCLE_CARD).c(FunctionSetBean.ViewType.DATA_VIEW).e(tfc.b("[\\d\\/]", qre.e(R.plurals.IDS_three_circle_goal_reached, 3, UnitUtil.e(i, 1, 0), UnitUtil.e(3.0d, 1, 0)))).a();
        boolean zL = qdm.l();
        LogUtil.a("FunctionSetThreeCircleCardReader", "createFunctionSetBean isOpenActiveRecord ", Boolean.valueOf(zL), " mActiveRecordSummaryText ", this.f48283c);
        if (TextUtils.isEmpty(this.f48283c) || zL) {
            functionSetBeanA.d(tfc.b(j));
            functionSetBeanA.f(tfc.d(j));
            return functionSetBeanA;
        }
        functionSetBeanA.b((CharSequence) this.f48283c);
        return functionSetBeanA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("FunctionSetThreeCircleCardReader", "readSportGoalAchievementData");
        StepsViewModel stepsViewModel = this.d;
        if (stepsViewModel != null) {
            stepsViewModel.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final HashMap<String, Integer> map) {
        LogUtil.a("FunctionSetThreeCircleCardReader", "processGoalData goal value is ", map);
        HandlerExecutor.b(new Runnable() { // from class: skm
            @Override // java.lang.Runnable
            public final void run() {
                this.f48280a.e(map);
            }
        });
    }

    /* synthetic */ void e(HashMap map) {
        a((HashMap<String, Integer>) map);
        d(this.v.get(0).intValue(), this.v.get(2).intValue(), this.v.get(4).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        LogUtil.a("FunctionSetThreeCircleCardReader", "report step=", Integer.valueOf(bundle.getInt("step", -1)), ":calories=", Integer.valueOf(bundle.getInt("carior", -1)), ":floor=", Integer.valueOf(bundle.getInt("floor", -1)), ":distance=", Integer.valueOf(bundle.getInt("distance", -1)), " mTimes ", Integer.valueOf(bundle.getInt("intensityTime", -1)), " mActiveHours ", Integer.valueOf(bundle.getInt("activeCount", -1)));
        LogUtil.a("FunctionSetThreeCircleCardReader", "mCompleteGoals ", this.e, "mThreeCircleList", this.v);
        if (njy.e(this.v, 5)) {
            LogUtil.j("FunctionSetThreeCircleCardReader", "list is out bound or not init");
            return;
        }
        final int i = bundle.getInt("carior", -1);
        final int i2 = bundle.getInt("intensityTime", -1);
        final int i3 = bundle.getInt("activeCount", -1);
        this.s = bundle.getInt("step", -1);
        this.i = bundle.getInt("floor", -1);
        this.g = bundle.getInt("distance", -1);
        HandlerExecutor.b(new Runnable() { // from class: skp
            @Override // java.lang.Runnable
            public final void run() {
                this.f48286b.d(i, i2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(int i, int i2, int i3) {
        boolean zB = b(i, i2, i3);
        int iA = a();
        LogUtil.a("FunctionSetThreeCircleCardReader", "report isUpdated ", Boolean.valueOf(zB), " completeGoals ", Integer.valueOf(iA), "mCompleteGoals ", this.e, "mThreeCircleList", this.v);
        if (this.n != null && this.k && i == 0 && i3 == 0 && i2 == 0) {
            c(iA);
            this.k = false;
        }
        if (this.n == null || !zB) {
            return;
        }
        this.m = true;
        c(iA);
    }

    private void c(int i) {
        this.f.c(HiDateUtil.p(System.currentTimeMillis()), i, (this.v.toString() + i).hashCode());
        this.f.a(this.v);
        this.f.b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        Bitmap bitmapD;
        LogUtil.a("FunctionSetThreeCircleCardReader", "refreshCardView");
        if (njy.e(this.v)) {
            LogUtil.e("FunctionSetThreeCircleCardReader", "mThreeCircleList ", this.v);
            return;
        }
        HealthImageView healthImageView = new HealthImageView(this.mContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        healthImageView.setLayoutParams(layoutParams);
        if (z || this.f48282b == null) {
            View view = this.x;
            if (view == null || (view instanceof HealthImageView)) {
                try {
                    View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.card_three_circle_view, (ViewGroup) null);
                    this.x = viewInflate;
                    this.u = (ThreeCircleView) viewInflate.findViewById(R.id.circleProgressBar);
                } catch (InflateException e2) {
                    LogUtil.j("FunctionSetThreeCircleCardReader", e2.getClass().getSimpleName() + "inflate mThreeCircleCardView fail!");
                }
            }
            a(this.v);
            bitmapD = d(this.x);
            this.f48282b = bitmapD;
        } else {
            LogUtil.a("FunctionSetThreeCircleCardReader", "use mBitmap");
            bitmapD = this.f48282b;
        }
        healthImageView.setImageBitmap(bitmapD);
        this.x = healthImageView;
    }

    private boolean b(int i, int i2, int i3) {
        if (njy.e(this.v, 5)) {
            LogUtil.j("FunctionSetThreeCircleCardReader", "list is out bound or not init");
            return false;
        }
        boolean zC = c(0, i);
        boolean zC2 = c(2, i2);
        boolean zC3 = c(4, i3);
        LogUtil.a("FunctionSetThreeCircleCardReader", "updateThreeCircleData isCalUpdated ", Boolean.valueOf(zC), " calorie ", Integer.valueOf(i), " isIntensityUpdated ", Boolean.valueOf(zC2), " intensity ", Integer.valueOf(i2), " isActiveUpdated ", Boolean.valueOf(zC3), " activeHour ", Integer.valueOf(i3));
        return zC || zC2 || zC3;
    }

    private boolean c(int i, int i2) {
        boolean z;
        if (njy.e(this.v, i) || njy.e(this.e, i)) {
            LogUtil.j("FunctionSetThreeCircleCardReader", "list is out bound or not init");
            return false;
        }
        int i3 = i + 1;
        if (!njy.c(this.v, i3) || this.v.get(i3).intValue() == 0) {
            z = false;
        } else if (i2 >= this.v.get(i3).intValue()) {
            z = this.e.get(i).intValue() != 1;
            this.e.set(i, 1);
        } else {
            z = this.e.get(i).intValue() != 0;
            this.e.set(i, 0);
        }
        boolean z2 = this.v.get(i).intValue() != i2 || z;
        this.v.set(i, Integer.valueOf(i2));
        return z2;
    }

    private void c() {
        if (this.d == null) {
            this.d = (StepsViewModel) new ViewModelProvider((ViewModelStoreOwner) this.mContext).get(StepsViewModel.class);
        }
        this.d.c((LifecycleOwner) this.mContext, this.t);
        this.d.d((LifecycleOwner) this.mContext, this.h);
    }

    private void a(HashMap<String, Integer> map) {
        int iD = qgm.d(map, "900200007", 270000);
        if (iD != 0) {
            this.v.set(1, Integer.valueOf(iD));
        }
        int iD2 = qgm.d(map, "900200008", 25);
        if (iD2 != 0) {
            this.v.set(3, Integer.valueOf(iD2));
        }
        int iD3 = qgm.d(map, "900200009", 12);
        if (iD3 != 0) {
            this.v.set(5, Integer.valueOf(iD3));
        }
        int iD4 = qgm.d(map, "900200006", 10000);
        if (iD4 != 0) {
            this.r = iD4;
        }
    }

    private void b(List<Integer> list) {
        if (this.mContext == null || this.u == null || njy.e(list)) {
            return;
        }
        if (list.size() > 1) {
            this.u.a("firstCircle", list.get(0).intValue(), list.get(1).intValue());
        }
        if (list.size() > 2) {
            this.u.a("secondCircle", list.get(2).intValue(), list.get(3).intValue());
        }
        if (list.size() > 5) {
            this.u.a("thirdCircle", list.get(4).intValue(), list.get(5).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d(true);
        FunctionSetBean functionSetBeanD = d(System.currentTimeMillis(), a());
        functionSetBeanD.d(this.x);
        notifyItemChanged(functionSetBeanD);
    }

    private void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_sync_total_sport_data");
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        LocalBroadcastManager.getInstance().registerReceiver(this.l, intentFilter);
    }

    private void g() {
        if (this.l == null) {
            return;
        }
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.l);
            LogUtil.d("FunctionSetThreeCircleCardReader", "mHiBroadcastReceiver unregister");
        } catch (IllegalArgumentException unused) {
            LogUtil.d("FunctionSetThreeCircleCardReader", "IllegalArgumentException mHiBroadcastReceiver unregister");
        }
    }

    static class d extends BroadcastReceiver {
        private WeakReference<skn> e;

        d(skn sknVar) {
            this.e = new WeakReference<>(sknVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ReleaseLogUtil.e("FunctionSetThreeCircleCardReader", "threeCircleCard onReceive intent=null");
                return;
            }
            skn sknVar = this.e.get();
            if (sknVar == null) {
                ReleaseLogUtil.e("FunctionSetThreeCircleCardReader", "threeCircleCardReader is null");
            } else if ("com.huawei.hihealth.action_sync".equals(intent.getAction()) && intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6) == 2) {
                LogUtil.a("FunctionSetThreeCircleCardReader", "handleActionSyncByStatus");
                sknVar.i();
            }
        }
    }

    static class a extends BaseHandler<skn> {
        private WeakReference<skn> d;

        a(skn sknVar) {
            super(Looper.getMainLooper(), sknVar);
            this.d = new WeakReference<>(sknVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(skn sknVar, Message message) {
            if (message == null) {
                LogUtil.e("FunctionSetThreeCircleCardReader", "msg is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                LogUtil.a("FunctionSetThreeCircleCardReader", "MSG_UPDATE_THREE_CIRCLE");
                int iA = sknVar.a();
                if (iA <= 0) {
                    sknVar.d(sknVar.m);
                    if (message.obj instanceof FunctionSetBean) {
                        sknVar.notifyItemChanged((FunctionSetBean) message.obj);
                    }
                } else {
                    LogUtil.a("FunctionSetThreeCircleCardReader", "show new data, completeGoals=", Integer.valueOf(iA));
                    sknVar.d();
                }
                sknVar.m = false;
                return;
            }
            if (i == 2) {
                LogUtil.a("FunctionSetThreeCircleCardReader", "MSG_NOT_HAVE_THREE_CIRCLE_DATA");
                skn.setHasCardData(this.d, false);
                sknVar.notifyItemChanged(sknVar.buildEmptyCardBean());
                return;
            }
            if (i != 100) {
                LogUtil.j("FunctionSetThreeCircleCardReader", "handler message default");
                return;
            }
            boolean zL = qdm.l();
            LogUtil.a("FunctionSetThreeCircleCardReader", "handleMessageWhenReferenceNotNull isOpenActiveRecord ", Boolean.valueOf(zL));
            if (zL) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof Pair) {
                Pair pair = (Pair) obj;
                if (!(pair.first instanceof Integer) || !(pair.second instanceof String)) {
                    LogUtil.j("FunctionSetThreeCircleCardReader", "handleMessageWhenReferenceNotNull activeRecordText is error");
                    return;
                }
                Integer num = (Integer) pair.first;
                int iIntValue = num.intValue();
                String str = (String) pair.second;
                LogUtil.a("FunctionSetThreeCircleCardReader", "cardId is：", num, "activeRecordText is：", str);
                if (!TextUtils.isEmpty(str)) {
                    sknVar.f48283c = str;
                    FunctionSetBean functionSetBean = sknVar.getFunctionSetBean();
                    if (functionSetBean == null) {
                        ReleaseLogUtil.e("FunctionSetThreeCircleCardReader", "handleMessageWhenReferenceNotNull functionSetBean is null");
                        return;
                    }
                    functionSetBean.d("");
                    functionSetBean.f("");
                    functionSetBean.b((CharSequence) str);
                    sknVar.notifyItemChanged(functionSetBean);
                    sknVar.f48281a = iIntValue;
                    return;
                }
                LogUtil.j("FunctionSetThreeCircleCardReader", "handleMessageWhenReferenceNotNull activeRecordText is empty");
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void readCardData() {
        super.readCardData();
        i();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void initCardData() {
        LogUtil.a("FunctionSetThreeCircleCardReader", "initCardData");
        readCardData();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        LogUtil.a("FunctionSetThreeCircleCardReader", "setEmptyFunctionSetBean");
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(this.q.getString(com.huawei.health.servicesui.R.string.IDS_three_circle_title)).c(this.q.getString(com.huawei.health.servicesui.R.string.IDS_three_circle_subtitle)).e(FunctionSetType.THREE_CIRCLE_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(this.mContext).a(false).a();
        this.j = functionSetBeanA;
        return functionSetBeanA;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        readCardData();
        d();
        ReleaseLogUtil.d("TimeEat_FunctionSetThreeCircleCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        unsubscribeDataChange();
        g();
        a aVar = this.n;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        ObserverManagerUtil.c(this.o);
        this.d.d(this.t);
        this.d.e(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        Iterator<Integer> it = this.e.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        if (iIntValue > 3) {
            return 3;
        }
        return iIntValue;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetThreeCircleCardReader", "updateSuccessList, onResult");
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("FunctionSetThreeCircleCardReader", "registerThreeCircleListener success");
        this.y = list;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return com.huawei.ui.commonui.R.drawable.three_circle_default_img;
        }
        return com.huawei.ui.commonui.R.drawable.ic_three_circle;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return com.huawei.ui.commonui.R.string.IDS_three_circle_button;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.three_circle_default_img);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.f;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetThreeCircleCardReader";
    }
}
