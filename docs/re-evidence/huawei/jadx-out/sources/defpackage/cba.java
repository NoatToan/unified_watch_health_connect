package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.HealthModelH5ProService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.view.Clover;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes23.dex */
public class cba extends FunctionSetBeanReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicLong f1415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Clover f1416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f1417c;
    private Context d;
    private final Observer e;
    private FunctionSetBean f;
    private boolean g;
    private int h;
    private View i;
    private c j;
    private AtomicLong k;
    private String l;
    private SpannableString m;
    private final Observer n;
    private final SparseArray<String> o;
    private AtomicInteger q;
    private final SparseArray<String> r;
    private AtomicLong s;
    private final SparseIntArray t;

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return null;
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

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
    }

    public cba(Context context, CardConfig cardConfig) {
        super(context, "HL_HealthModelCardReader", cardConfig);
        this.n = new Observer() { // from class: cba.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (BaseApplication.h()) {
                    if ("HEALTH_LIFE_CONS_INFO".equals(str) && objArr != null && objArr.length == 4) {
                        if (!(objArr[0] instanceof HealthLifeTaskBean) || !(objArr[1] instanceof ArrayList) || !(objArr[2] instanceof Integer) || !(objArr[3] instanceof Map)) {
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("HEALTH_LIFT_TASK_BEAN", (HealthLifeTaskBean) objArr[0]);
                        bundle.putIntegerArrayList("HEALTH_LIFT_TASK_CONS", (ArrayList) objArr[1]);
                        bundle.putInt("HEALTH_LIFT_TASK_CONS_MAX_DAYS", ((Integer) objArr[2]).intValue());
                        cba.this.f1417c = (Map) objArr[3];
                        cbg.a(cba.this.j, 6, bundle);
                    }
                    if ("PluginHealthModel".equals(str) || "HEALTH_LIFE_DAY_RECORD".equals(str)) {
                        cbg.d(cba.this.j, 1);
                    }
                }
            }
        };
        this.e = new Observer() { // from class: cba.5
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!"HOME_PAGE_SPORT_TASK_UPDATE".equals(str) || objArr == null || objArr.length <= 0) {
                    LogUtil.j("HL_HealthModelCardReader", "mBasicSportDataObserver notify label ", str, " objects ", objArr);
                    return;
                }
                if (BaseApplication.h()) {
                    Object obj = objArr[0];
                    if (!(obj instanceof HealthLifeBean)) {
                        LogUtil.j("HL_HealthModelCardReader", "mBasicSportDataObserver object instanceof HealthLifeBean false");
                        return;
                    }
                    HealthLifeBean healthLifeBean = (HealthLifeBean) obj;
                    int id = healthLifeBean.getId();
                    LogUtil.a("HL_HealthModelCardReader", "mBasicSportDataObserver id ", Integer.valueOf(id), " bean ", healthLifeBean);
                    if (id == 2 || id == 3) {
                        if (cba.this.t.get(id) > 0) {
                            return;
                        }
                        int iJ = CommonUtils.j((String) cba.this.r.get(id));
                        if (iJ <= 0) {
                            cbg.d(cba.this.j, 1);
                            return;
                        }
                        float f = iJ;
                        if (Float.compare(cbg.a(CommonUtils.j((String) cba.this.o.get(id)) / f, false), cbg.a(CommonUtils.j(healthLifeBean.getResult()) / f, healthLifeBean.getComplete() > 0)) == 0) {
                            return;
                        }
                        cbg.d(cba.this.j, 1);
                        return;
                    }
                    LogUtil.j("HL_HealthModelCardReader", "mBasicSportDataObserver default object ", obj);
                }
            }
        };
        this.r = new SparseArray<>();
        this.o = new SparseArray<>();
        this.t = new SparseIntArray();
        this.f1417c = new HashMap();
        LogUtil.a("HL_HealthModelCardReader", "FunctionSetHealthModelCardReader context ", context);
        c cVar = new c(this);
        this.j = cVar;
        cVar.sendEmptyMessageDelayed(100, 6000L);
        if (context instanceof Activity) {
            this.d = context;
        } else {
            this.d = BaseApplication.j();
        }
        c();
        j();
    }

    private void j() {
        ObserverManagerUtil.e("HEALTH_MODEL_CARD_KEY_NEW", new Object[0]);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean handleHealthModelSp(String str) {
        LogUtil.a("HL_HealthModelCardReader", "handleHealthModelSp");
        if (!cbg.ac()) {
            h();
            return false;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        List<HealthLifeBean> arrayList = new ArrayList<>();
        try {
            arrayList = (List) HiJsonUtil.d(str, new TypeToken<List<HealthLifeBean>>() { // from class: com.huawei.basichealthmodel.ui.reader.FunctionSetHealthModelCardReader$3
            }.getType());
        } catch (JsonParseException | IllegalStateException e) {
            LogUtil.e("HL_HealthModelCardReader", "handleHealthModelSp exception ", LogAnonymous.b(e));
        }
        if (c(arrayList, sparseIntArray, sparseIntArray2)) {
            setHasCardData(true);
            b(sparseIntArray, sparseIntArray2, arrayList, true);
            return true;
        }
        h();
        cbg.d(this.j, 1);
        return false;
    }

    private void h() {
        setHasCardData(false);
        setFunctionSetBean(buildEmptyCardBean());
        refreshCardBySp(this.f);
    }

    private void c() {
        this.g = cbg.ae();
        this.q = new AtomicInteger();
        this.k = new AtomicLong();
        this.s = new AtomicLong();
        this.f1415a = new AtomicLong();
        ObserverManagerUtil.d(this.e, "HOME_PAGE_SPORT_TASK_UPDATE");
        ObserverManagerUtil.d(this.n, "PluginHealthModel");
        ObserverManagerUtil.d(this.n, "HEALTH_LIFE_DAY_RECORD");
        ObserverManagerUtil.d(this.n, "HEALTH_LIFE_CONS_INFO");
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void readCardData() {
        super.readCardData();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        g();
        ReleaseLogUtil.c("TimeEat_HL_HealthModelCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < lsl.a(jCurrentTimeMillis, 1, 0)) {
            cfu.c(cbg.q());
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(jElapsedRealtime - this.k.get()) < 1000 || this.g) {
            LogUtil.j("HL_HealthModelCardReader", "refreshData repeated refresh mIsUseNewHealthModel ", Boolean.valueOf(this.g));
            return;
        }
        this.k.set(jElapsedRealtime);
        if (this.j != null) {
            ccu.d(new ResponseCallback() { // from class: cbb
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.e.b(i, (bwx) obj);
                }
            });
        }
        if (cbg.ac()) {
            return;
        }
        cbg.c(ThreadPoolManager.c(), "HealthModelUpdateUserProtocolStatus", new Runnable() { // from class: cbc
            @Override // java.lang.Runnable
            public final void run() {
                LogUtil.a("HL_HealthModelCardReader", "refreshData isAgreeUserProtocol ", Boolean.valueOf(cbg.y()));
            }
        });
    }

    /* synthetic */ void b(int i, bwx bwxVar) {
        this.g = cbg.ae();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("HL_HealthModelCardReader", "onDestroy");
        c cVar = this.j;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        ObserverManagerUtil.a(this.e, "HOME_PAGE_SPORT_TASK_UPDATE");
        ObserverManagerUtil.c(this.n);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        FunctionSetBean functionSetBean = functionSetSubCardData.getFunctionSetBean();
        if (functionSetBean == null || !(viewHolder instanceof FunctionSetBeanReader.MyHolder)) {
            LogUtil.j("HL_HealthModelCardReader", "onBindViewHolder functionSetBean is null or holder null");
            return;
        }
        ImageView imageView = (ImageView) ((FunctionSetBeanReader.MyHolder) viewHolder).itemView.findViewById(R.id.function_set_empty_red_dot);
        if (imageView == null) {
            return;
        }
        if (functionSetBean.r() == FunctionSetBean.ViewType.EMPTY_VIEW) {
            qsp.c((View) imageView, 8);
        } else if (functionSetBean.r() == FunctionSetBean.ViewType.DATA_VIEW) {
            if (functionSetBean.g()) {
                qsp.c((View) imageView, 0);
            } else {
                qsp.c((View) imageView, 8);
            }
        }
        ReleaseLogUtil.c("TimeEat_HL_HealthModelCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void b(boolean z) {
        if (String.valueOf(true).equals(ccy.c("health_model_is_join_future"))) {
            qpx.e(this.mContext, com.huawei.basichealthmodel.R.string.IDS_effective_tomorrow_life_new);
            return;
        }
        Uri uriBuild = Uri.parse("").buildUpon().appendQueryParameter("from", z ? "HealthModel_Cons_FunctionSetHealthModelCardReader" : "HealthModel_FunctionSetHealthModelCardReader").build();
        Context context = this.d;
        if ((context instanceof Activity) && VersionControlUtil.isSupportActivityTransitionAnimation((Activity) context) && !isShowHomePageRecommendLayout()) {
            ffv.e(this.d, uriBuild, this.mCardViewHolder.itemView);
        } else {
            ffv.a(this.d, uriBuild);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("HL_HealthModelCardReader", "refreshCard");
        if (this.g) {
            return;
        }
        this.g = cbg.ae();
        this.q.set(0);
        if (cbg.ac()) {
            e();
        } else {
            cbg.d(this.j, 4);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        boolean zAc = cbg.ac();
        LogUtil.a("HL_HealthModelCardReader", "createCardView isJoin ", Boolean.valueOf(zAc));
        if (zAc) {
            a(true);
            return this.i;
        }
        c(buildEmptyCardBean());
        return null;
    }

    private void a(boolean z) {
        if (this.i == null) {
            LogUtil.j("HL_HealthModelCardReader", "initClover mHealthModelLayout is null");
            View viewA = qre.a(this.mContext, com.huawei.basichealthmodel.R.layout.home_card_view, (ViewGroup) null);
            this.i = viewA;
            if (viewA == null) {
                return;
            }
        }
        if (this.f1416b == null) {
            LogUtil.j("HL_HealthModelCardReader", "initClover mClover is null");
            this.f1416b = (Clover) this.i.findViewById(com.huawei.basichealthmodel.R.id.home_card_clover);
            if (z) {
                LogUtil.a("HL_HealthModelCardReader", "initClover0");
                this.f1416b.setClover(0.0f, 0.0f, 0.0f);
            }
        }
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: cba.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                cba.this.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int iMin = Math.min(cba.this.i.getWidth(), cba.this.i.getHeight());
                ViewGroup.LayoutParams layoutParams = cba.this.f1416b.getLayoutParams();
                layoutParams.width = iMin;
                layoutParams.height = iMin;
                cba.this.f1416b.setLayoutParams(layoutParams);
            }
        });
    }

    private void e() {
        this.s.set(SystemClock.elapsedRealtime());
        List<HealthLifeBean> listD = cgc.d();
        LogUtil.a("HL_HealthModelCardReader", "getHealthModelData list ", listD);
        if (njy.e(listD) || listD.size() < 3) {
            cbg.d(this.j, 3);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("arrayList", new ArrayList<>(listD));
        cbg.a(this.j, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bundle bundle) {
        int continueDays;
        if (this.f == null) {
            LogUtil.j("HL_HealthModelCardReader", "mFunctionSetBean is null");
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("HEALTH_LIFT_TASK_CONS");
        if (njy.e(integerArrayList)) {
            return;
        }
        HealthLifeTaskBean healthLifeTaskBean = (HealthLifeTaskBean) bundle.getParcelable("HEALTH_LIFT_TASK_BEAN");
        int i = bundle.getInt("HEALTH_LIFT_TASK_CONS_MAX_DAYS");
        if (healthLifeTaskBean != null) {
            HealthLifeBean healthLifeBean = healthLifeTaskBean.getHealthLifeBean();
            continueDays = healthLifeBean != null ? healthLifeBean.getContinueDays() : 0;
            this.h = healthLifeTaskBean.getIconId();
        } else {
            continueDays = 0;
        }
        if (integerArrayList.size() == 1) {
            e(healthLifeTaskBean, continueDays, i);
        } else {
            d(integerArrayList);
        }
        LogUtil.a("HL_HealthModelCardReader", "message is ", this.m.toString());
        this.f.b(this.m);
        this.f.a(qre.c(this.h));
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119097.value(), this.f1417c, 0);
    }

    private void e(HealthLifeTaskBean healthLifeTaskBean, int i, int i2) {
        int i3;
        int i4 = com.huawei.basichealthmodel.R.plurals.IDS_multi_task_cons_info_for_other;
        if (LanguageUtil.f(this.mContext)) {
            if (i > i2) {
                i4 = com.huawei.basichealthmodel.R.plurals.IDS_over_max_cons_complte_info;
                i3 = i2;
            } else {
                i3 = i;
            }
            SpannableString spannableString = new SpannableString(qre.e(i4, i3, healthLifeTaskBean.getName(), UnitUtil.e(i3, 1, 0)));
            this.m = spannableString;
            c(spannableString, healthLifeTaskBean.getName(), healthLifeTaskBean.getColorResourcesId());
            qri.e(this.m, healthLifeTaskBean.getName(), com.huawei.basichealthmodel.R.string.textFontFamilyMedium);
        } else {
            if (i > i2) {
                i4 = com.huawei.basichealthmodel.R.plurals.IDS_over_max_cons_complte_tips;
                i3 = i2;
            } else {
                i3 = i;
            }
            SpannableString spannableString2 = new SpannableString(qre.e(i4, i3, UnitUtil.e(i3, 1, 0)));
            this.m = spannableString2;
            c(spannableString2, spannableString2.toString(), com.huawei.basichealthmodel.R.color.textColorSecondary);
        }
        LogUtil.a("HL_HealthModelCardReader", "setMessageWhenSingleCons tempConsDays ", Integer.valueOf(i3), " consDays ", Integer.valueOf(i), " maxDays ", Integer.valueOf(i2));
    }

    private void d(List<Integer> list) {
        SpannableString spannableString = new SpannableString(qre.e(com.huawei.basichealthmodel.R.plurals.IDS_multi_tasks_complte, list.size(), UnitUtil.e(list.size(), 1, 0)));
        this.m = spannableString;
        c(spannableString, spannableString.toString(), com.huawei.basichealthmodel.R.color.textColorSecondary);
    }

    private void c(SpannableString spannableString, String str, int i) {
        qri.b(spannableString, spannableString.toString(), com.huawei.basichealthmodel.R.color.textColorSecondary);
        qri.b(spannableString, str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(FunctionSetBean functionSetBean) {
        LogUtil.a("HL_HealthModelCardReader", "notifyDataView functionSetBean ", functionSetBean, " mCardViewHolder ", this.mCardViewHolder);
        if (functionSetBean == null) {
            return;
        }
        notifyItemChanged(functionSetBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.q.get() == 1) {
            LogUtil.a("HL_HealthModelCardReader", "retry request end");
            if (cbg.ac()) {
                return;
            }
            cbg.d(this.j, 4);
            return;
        }
        this.q.getAndIncrement();
        e();
        LogUtil.a("HL_HealthModelCardReader", "retry request retryCount:", Integer.valueOf(this.q.get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HealthLifeBean> list) {
        LogUtil.a("HL_HealthModelCardReader", "showTaskData");
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        if (c(list, sparseIntArray, sparseIntArray2)) {
            b(sparseIntArray, sparseIntArray2, list, false);
        } else {
            cbg.d(this.j, 3);
        }
    }

    private void b(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, List<HealthLifeBean> list, boolean z) {
        LogUtil.a("HL_HealthModelCardReader", "showDataCard");
        if (sparseIntArray2 == null || sparseIntArray == null) {
            LogUtil.j("HL_HealthModelCardReader", "showDataCard totalTasks ", sparseIntArray2, " completeTasks ", sparseIntArray);
            if (z) {
                refreshCardBySp(buildEmptyCardBean());
                return;
            }
            return;
        }
        String string = this.mContext.getResources().getString(com.huawei.basichealthmodel.R.string.IDS_current_total_time, cbg.d(sparseIntArray.size(), 1, 0), cbg.d(sparseIntArray2.size(), 1, 0));
        if (this.g) {
            string = this.mContext.getResources().getString(com.huawei.basichealthmodel.R.string.IDS_current_total_time, "--", "--");
        }
        this.f = d(list, string);
        a(false);
        if (this.g) {
            this.f1416b.setClover(0.0f, 0.0f, 0.0f);
            if (z) {
                refreshCardBySp(this.f);
                return;
            } else {
                c(this.f);
                return;
            }
        }
        d(sparseIntArray, sparseIntArray2, list);
        if (z) {
            refreshCardBySp(this.f);
        } else {
            c(this.f);
        }
        if (string.equals(this.l)) {
            return;
        }
        this.l = string;
    }

    private FunctionSetBean d(List<HealthLifeBean> list, String str) {
        long jB;
        if (njy.e(list)) {
            LogUtil.j("HL_HealthModelCardReader", "createFunctionSetBean list ", list);
            jB = System.currentTimeMillis();
        } else {
            HealthLifeBean healthLifeBean = list.get(0);
            if (healthLifeBean == null) {
                LogUtil.j("HL_HealthModelCardReader", "createFunctionSetBean bean is null");
                jB = System.currentTimeMillis();
            } else {
                jB = cbg.b(healthLifeBean);
            }
        }
        Drawable drawable = this.h != 0 ? ContextCompat.getDrawable(this.mContext, this.h) : null;
        setBiHasData(System.currentTimeMillis());
        return new FunctionSetBean.c(cbg.f()).b(this.mContext).e(FunctionSetType.HEALTH_MODEL_CARD).d(DateFormatUtil.a(jB, DateFormatUtil.DateFormatType.DATE_FORMAT_MD)).g(UnitUtil.a(new Date(jB), 24)).c(FunctionSetBean.ViewType.DATA_VIEW).e(str).j(qre.f(com.huawei.basichealthmodel.R.string.IDS_card_task_attainment)).b(this.m).e(drawable).a();
    }

    private void d(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, List<HealthLifeBean> list) {
        float fA;
        float fA2;
        float fC;
        boolean zG;
        if (this.f1416b == null) {
            LogUtil.j("HL_HealthModelCardReader", "setCloverScale mClover is null");
            return;
        }
        if (cbg.ah()) {
            int iW = cbg.w();
            fC = cbg.c(list, 3, iW);
            fA = cbg.c(list, 1, iW);
            fA2 = cbg.c(list, 2, iW);
            if (fA < 1.0f || fC < 1.0f || fA2 < 1.0f) {
                zG = false;
            } else {
                zG = cbg.a(list) > 0 ? cbg.g(list) : true;
                bxp.b().j();
            }
            this.f1416b.setAllFull(zG);
        } else {
            fA = a(sparseIntArray.get(2) + sparseIntArray.get(3) + sparseIntArray.get(4), sparseIntArray2.get(2) + sparseIntArray2.get(3) + sparseIntArray2.get(4));
            float fA3 = a(sparseIntArray.get(5) + sparseIntArray.get(8), sparseIntArray2.get(5) + sparseIntArray2.get(8));
            fA2 = a(sparseIntArray.get(6) + sparseIntArray.get(7), sparseIntArray2.get(6) + sparseIntArray2.get(7));
            fC = fA3;
        }
        LogUtil.a("HL_HealthModelCardReader", "setCloverScale top ", Float.valueOf(fA), " left ", Float.valueOf(fC), " right ", Float.valueOf(fA2));
        this.f1416b.setClover(fA, fC, fA2);
    }

    private float a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0f;
        }
        return cbg.e(i / i2);
    }

    private boolean c(List<HealthLifeBean> list, SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        LogUtil.a("HL_HealthModelCardReader", "isResolveData list ", list);
        if (njy.e(list)) {
            return false;
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                int complete = healthLifeBean.getComplete();
                this.t.append(id, complete);
                this.r.append(id, healthLifeBean.getTarget());
                this.o.append(id, healthLifeBean.getResult());
                sparseIntArray2.put(id, 1);
                if (complete > 0) {
                    sparseIntArray.put(id, 1);
                }
                if (!cbg.b(id)) {
                    LogUtil.j("HL_HealthModelCardReader", "isResolveData taskId ", Integer.valueOf(id));
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getCardTitle() {
        FunctionSetBean functionSetBean = this.f;
        if (functionSetBean == null) {
            LogUtil.j("HL_HealthModelCardReader", "getCardTitle mFunctionSetBean is null");
            return cbg.f();
        }
        return functionSetBean.m();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        LogUtil.a("HL_HealthModelCardReader", "setEmptyFunctionSetBean");
        FunctionSetBean functionSetBeanA = new FunctionSetBean.c(cbg.f()).c(qre.f(R.string.IDS_health_model_home_card_description)).e(FunctionSetType.HEALTH_MODEL_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(this.mContext).a();
        this.f = functionSetBeanA;
        return functionSetBeanA;
    }

    private void b() {
        this.h = 0;
        this.m = null;
        FunctionSetBean functionSetBean = this.f;
        if (functionSetBean != null) {
            functionSetBean.a((Drawable) null);
            this.f.b((CharSequence) null);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.a("HL_HealthModelCardReader", "onBindViewHolder onClick elapsedRealtime ", Long.valueOf(jElapsedRealtime));
        if (Math.abs(jElapsedRealtime - this.f1415a.get()) < 800) {
            LogUtil.j("HL_HealthModelCardReader", "onBindViewHolder onClick fast click");
            return;
        }
        final boolean z = false;
        if (this.h != 0 && this.m != null) {
            lmf.d().c(this.mContext, AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119097.value(), this.f1417c, 0);
            z = true;
        }
        this.f1415a.set(jElapsedRealtime);
        b();
        if (LoginInit.getInstance(this.mContext).getIsLogined()) {
            b(z);
        } else {
            LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: cax
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f1414c.a(z, i, obj);
                }
            }, "");
        }
    }

    /* synthetic */ void a(final boolean z, int i, Object obj) {
        if (i != 0) {
            LogUtil.j("HL_HealthModelCardReader", "onBindViewHolder browsingToLogin fail");
        } else if (cbg.ac()) {
            a();
            b(z);
        } else {
            ccu.d(new ResponseCallback() { // from class: cbf
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj2) {
                    this.f1421c.c(z, i2, (bwx) obj2);
                }
            });
        }
    }

    /* synthetic */ void c(boolean z, int i, bwx bwxVar) {
        a();
        b(z);
    }

    static class c extends BaseHandler<cba> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<cba> f1419b;

        c(cba cbaVar) {
            super(Looper.getMainLooper(), cbaVar);
            this.f1419b = new WeakReference<>(cbaVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(cba cbaVar, Message message) {
            if (message == null) {
                LogUtil.e("HL_HealthModelCardReader", "msg is null");
                return;
            }
            int i = message.what;
            if (i != 100) {
                switch (i) {
                    case 1:
                        cbaVar.a();
                        break;
                    case 2:
                        Bundle data = message.getData();
                        if (data != null) {
                            cba.setHasCardData(this.f1419b, true);
                            cbaVar.c(data.getParcelableArrayList("arrayList"));
                        } else {
                            LogUtil.e("HL_HealthModelCardReader", "bundle is null");
                        }
                        break;
                    case 3:
                        cbaVar.f();
                        break;
                    case 4:
                        cba.setHasCardData(this.f1419b, false);
                        cbaVar.c(cbaVar.buildEmptyCardBean());
                        break;
                    case 5:
                        cba.setHasCardData(this.f1419b, true);
                        cbaVar.c(cbaVar.f);
                        break;
                    case 6:
                        cba.setHasCardData(this.f1419b, true);
                        cbaVar.b(message.getData());
                        cbaVar.c(cbaVar.f);
                        break;
                    default:
                        LogUtil.j("HL_HealthModelCardReader", "handler message default");
                        break;
                }
                return;
            }
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cbd
                @Override // java.lang.Runnable
                public final void run() {
                    cba.c.a();
                }
            });
        }

        static /* synthetic */ void a() {
            ddv.b().initH5Pro();
            H5ProClient.getServiceManager().registerService(HealthModelH5ProService.class);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return com.huawei.ui.commonui.R.drawable.helath_life_default_img_big;
        }
        return com.huawei.ui.commonui.R.drawable.health_life_default_img_small;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return com.huawei.ui.commonui.R.string.IDS_function_set_card_button_health_life;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "HL_HealthModelCardReader";
    }
}
