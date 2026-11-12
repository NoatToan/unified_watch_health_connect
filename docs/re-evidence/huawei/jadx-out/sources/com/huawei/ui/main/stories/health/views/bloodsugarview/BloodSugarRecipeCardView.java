package com.huawei.ui.main.stories.health.views.bloodsugarview;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.Constants;
import com.huawei.ui.main.stories.template.health.view.BaseNoDataView;
import defpackage.hcz;
import defpackage.hdg;
import defpackage.hdh;
import defpackage.irz;
import defpackage.njy;
import defpackage.npt;
import defpackage.qhq;
import defpackage.qpx;
import defpackage.qqt;
import defpackage.qre;
import defpackage.vfb;
import defpackage.vfy;
import defpackage.vgo;
import defpackage.vil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarRecipeCardView extends BaseNoDataView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28198a;
    private TextView ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f28199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28200c;
    private long d;
    private HealthCardView e;
    private HealthRecycleView f;
    private boolean g;
    private TextView h;
    private TextView i;
    private boolean j;
    private int k;
    private TextView l;
    private boolean m;
    private Constants.PageType n;
    private HealthSpinner o;
    private HealthCardView p;
    private Handler q;
    private vfb r;
    private FrameLayout s;
    private TextView t;
    private FitnessAdviceApi u;
    private HealthCardView v;
    private View w;
    private HealthSubHeader x;
    private ImageView y;

    public BloodSugarRecipeCardView(Context context) {
        super(context);
        this.m = false;
        this.k = 0;
        this.g = false;
        this.j = false;
        this.f28200c = context;
        c();
    }

    public BloodSugarRecipeCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.k = 0;
        this.g = false;
        this.j = false;
        this.f28200c = context;
        c();
    }

    public BloodSugarRecipeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = false;
        this.k = 0;
        this.g = false;
        this.j = false;
        this.f28200c = context;
        c();
    }

    private void c() {
        View viewInflate = LayoutInflater.from(this.f28200c).inflate(R.layout.layout_blood_sugar_recipe_card, (ViewGroup) this, true);
        this.w = viewInflate;
        this.x = (HealthSubHeader) viewInflate.findViewById(R.id.health_blood_sugar_recipe_subheader_content);
        this.s = (FrameLayout) this.w.findViewById(R.id.recipe_card_container);
        this.e = (HealthCardView) this.w.findViewById(R.id.default_recipe_card);
        this.p = (HealthCardView) this.w.findViewById(R.id.recipe_detail_card);
        this.v = (HealthCardView) this.w.findViewById(R.id.recipe_loading_card);
        HealthSubHeader healthSubHeader = this.x;
        if (healthSubHeader != null) {
            healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.b(), com.huawei.health.servicesui.R.color.common_transparent));
        }
        this.y = (ImageView) this.w.findViewById(R.id.default_sugar_recipe_icon);
        this.ab = (TextView) this.w.findViewById(R.id.default_sugar_title);
        this.i = (TextView) this.w.findViewById(R.id.default_sugar_description);
        this.f28199b = (HealthButton) this.w.findViewById(R.id.default_sugar_customize_button);
        this.f28199b.setMaxWidth(this.f28200c.getResources().getDisplayMetrics().widthPixels / 4);
        this.t = (TextView) this.w.findViewById(R.id.recipe_card_title);
        this.o = (HealthSpinner) this.w.findViewById(R.id.meal_type_spinner);
        this.l = (TextView) this.w.findViewById(R.id.meal_type_title);
        this.h = (TextView) this.w.findViewById(R.id.meal_recommend);
        this.f = (HealthRecycleView) this.w.findViewById(R.id.food_list);
        this.u = (FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class);
        this.q = new Handler(Looper.getMainLooper());
        d();
        i();
        j();
        f();
        LogUtil.a("BloodSugarRecipeCardView", "initViews success");
    }

    private void d() {
        this.f28199b.setOnClickListener(new View.OnClickListener() { // from class: vey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51014a.a(view);
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: veu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        this.m = true;
        LogUtil.a("BloodSugarRecipeCardView", "Customize button clicked, jump to H5 page");
        e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.intelligent-recipe-customization?h5pro=true&isNeedLogin=true&urlType=4&pName=com.huawei.health&healthGoal=1&pullfrom=bloodSugar");
    }

    public /* synthetic */ void c(View view) {
        this.m = true;
        LogUtil.a("BloodSugarRecipeCardView", "Recipe detail card clicked, jump to detail page");
        e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.intelligent-recipe-customization?h5pro=true&isNeedLogin=true&urlType=4&pName=com.huawei.health&healthGoal=1&pullfrom=bloodSugar");
    }

    private void i() {
        this.o.setListShadowEnabled(true);
        this.o.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.ui.main.stories.health.views.bloodsugarview.BloodSugarRecipeCardView.3
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (BloodSugarRecipeCardView.this.r != null) {
                    String strD = BloodSugarRecipeCardView.this.r.d(i);
                    LogUtil.a("BloodSugarRecipeCardView", "Spinner selected mealType: " + strD + ", position: " + i);
                    BloodSugarRecipeCardView.this.d(strD);
                }
            }
        });
    }

    private void j() {
        this.f.setLayoutManager(new HealthLinearLayoutManager(this.f28200c, 1, false));
        this.f.setIsScroll(false);
        this.f.setNestedScrollingEnabled(false);
        LogUtil.a("BloodSugarRecipeCardView", "setupRecyclerView success");
    }

    private void f() {
        this.v.setOnClickListener(new View.OnClickListener() { // from class: vev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        if (this.g) {
            LogUtil.a("BloodSugarRecipeCardView", "Recipe is generating, show toast");
            qpx.e(this.f28200c, qre.f(R.string.IDS_recipe_toast));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        vfb vfbVar = this.r;
        if (vfbVar == null) {
            LogUtil.j("BloodSugarRecipeCardView", "updateFoodList failed: mRecipeDataModel is null");
            return;
        }
        List<vfb.c> listB = vfbVar.b(str);
        String strA = this.r.a(str);
        this.l.setText(this.r.d(str));
        this.h.setText(strA);
        this.f.setAdapter(new e(this.f28200c, listB));
        LogUtil.a("BloodSugarRecipeCardView", "updateFoodList success, mealType: " + str + ", food count: " + listB.size());
    }

    @Override // com.huawei.ui.main.stories.template.health.view.BaseNoDataView, com.huawei.ui.main.stories.template.BaseComponent
    public void setDateStamp(long j) {
        this.d = j;
        this.f28198a = a(j);
        LogUtil.a("BloodSugarRecipeCardView", "setDateStamp: " + this.f28198a);
        d(j);
    }

    @Override // com.huawei.ui.main.stories.template.health.view.BaseNoDataView, com.huawei.ui.main.stories.template.BaseComponent
    public void setPageType(Constants.PageType pageType) {
        this.n = pageType;
    }

    @Override // com.huawei.ui.main.stories.template.health.view.BaseNoDataView, com.huawei.ui.main.stories.template.BaseComponent
    public void onResume() {
        super.onResume();
        if (this.m) {
            this.m = false;
            LogUtil.a("BloodSugarRecipeCardView", "onResume: need refresh data");
            d(this.d);
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.view.BaseNoDataView, com.huawei.ui.main.stories.template.BaseComponent
    public void onDestory() {
        super.onDestory();
        k();
        LogUtil.a("BloodSugarRecipeCardView", "onDestory");
    }

    private void d(long j) {
        b(j, false);
    }

    private void b(final long j, final boolean z) {
        if (this.n != Constants.PageType.DAY || LoginInit.getInstance(BaseApplication.b()).isMinorAccount()) {
            this.w.setVisibility(8);
            LogUtil.a("BloodSugarRecipeCardView", "loadRecipeData skip: not day view or is minor account");
            return;
        }
        this.s.setVisibility(0);
        if (!irz.i()) {
            LogUtil.a("BloodSugarRecipeCardView", "loadRecipeData: not vip user, show default card");
            h();
        } else {
            e(new UiCallback<hdg>() { // from class: com.huawei.ui.main.stories.health.views.bloodsugarview.BloodSugarRecipeCardView.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.d("R_BloodSugarRecipeCardView", "getRecipeType onFailure ", Integer.valueOf(i));
                    LogUtil.e("BloodSugarRecipeCardView", "getRecipeType failed: " + i + ", " + str);
                    BloodSugarRecipeCardView.this.h();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(hdg hdgVar) {
                    if (hdgVar == null) {
                        LogUtil.a("BloodSugarRecipeCardView", "getRecipeType fail: data is null");
                        BloodSugarRecipeCardView.this.h();
                    } else {
                        if (hdgVar.d() == 0) {
                            BloodSugarRecipeCardView.this.h();
                            return;
                        }
                        if (!z) {
                            BloodSugarRecipeCardView.this.n();
                        }
                        BloodSugarRecipeCardView.this.d(j, hdgVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final long j, final hdg hdgVar) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        vil.d(iA, iA, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: vew
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f51012b.e(hdgVar, j, i, (List) obj);
            }
        });
    }

    public /* synthetic */ void e(hdg hdgVar, final long j, int i, List list) {
        LogUtil.a("BloodSugarRecipeCardView", "getDietData errorCode ", Integer.valueOf(i), " list ", list);
        if (njy.e(list)) {
            LogUtil.j("BloodSugarRecipeCardView", "getDietRecord list is empty ");
            h();
            return;
        }
        vgo vgoVar = (vgo) list.get(0);
        if (vgoVar == null) {
            LogUtil.j("BloodSugarRecipeCardView", "getDietRecord is null ");
            h();
            return;
        }
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD == null) {
            LogUtil.j("BloodSugarRecipeCardView", "overview is null");
            h();
            return;
        }
        int iMin = Math.min(Math.max(1000, Math.round(vfyVarD.e())), 10000);
        final hcz hczVar = new hcz();
        hczVar.a(vfyVarD);
        hczVar.c(String.valueOf(iMin));
        hczVar.e(hdgVar.b());
        ThreadPoolManager.c().execute(new Runnable() { // from class: vet
            @Override // java.lang.Runnable
            public final void run() {
                this.f51011a.e(j, hczVar);
            }
        });
    }

    private void e(final UiCallback<hdg> uiCallback) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900300069");
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.health.views.bloodsugarview.BloodSugarRecipeCardView.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_BloodSugarRecipeCardView", npt.d("onResult errorCode: ", Integer.valueOf(i), ", data: ", obj));
                if (BloodSugarRecipeCardView.this.d(obj)) {
                    String configData = ((HiSampleConfig) ((List) obj).get(0)).getConfigData();
                    ReleaseLogUtil.d("R_BloodSugarRecipeCardView", npt.d("onResult json: ", configData));
                    hdg hdgVar = (hdg) qqt.e(configData, hdg.class);
                    LogUtil.a("BloodSugarRecipeCardView", "getRecipeType success");
                    uiCallback.onSuccess(hdgVar);
                    return;
                }
                LogUtil.j("BloodSugarRecipeCardView", "getRecipeType: invalid sample config data");
                uiCallback.onSuccess(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Object obj) {
        if (!njy.b(obj, HiSampleConfig.class)) {
            ReleaseLogUtil.e("R_BloodSugarRecipeCardView", "list getSampleConfigData isListTypeMatch false ");
            return false;
        }
        if (!njy.e((List) obj)) {
            return true;
        }
        ReleaseLogUtil.e("R_BloodSugarRecipeCardView", "list getSampleConfigData list is empty ");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(final long j, hcz hczVar) {
        String strA = a(System.currentTimeMillis());
        LogUtil.a("BloodSugarRecipeCardView", "queryRecipeData recipesDate:", strA, " FoodConditions: ", HiJsonUtil.d(hczVar));
        this.u.getFoodRecommendDetail("", strA, hczVar, new UiCallback<hdh>() { // from class: com.huawei.ui.main.stories.health.views.bloodsugarview.BloodSugarRecipeCardView.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(hdh hdhVar) {
                if (hdhVar == null || hdhVar.c() != 0) {
                    LogUtil.j("BloodSugarRecipeCardView", "getRecipebyDate failed: response is null or resultCode != 0");
                    BloodSugarRecipeCardView.this.h();
                    BloodSugarRecipeCardView.this.k();
                    return;
                }
                if (hdhVar.b() == 0) {
                    LogUtil.a("BloodSugarRecipeCardView", "Recipe is generating, start polling");
                    BloodSugarRecipeCardView.this.l();
                    BloodSugarRecipeCardView.this.c(j);
                } else if (hdhVar.d() == null) {
                    LogUtil.j("BloodSugarRecipeCardView", "getRecipebyDate: recommendDetail is null");
                    BloodSugarRecipeCardView.this.h();
                    BloodSugarRecipeCardView.this.k();
                } else {
                    BloodSugarRecipeCardView.this.r = new vfb(hdhVar.d());
                    LogUtil.a("BloodSugarRecipeCardView", "getRecipebyDate success, show detail card");
                    BloodSugarRecipeCardView.this.o();
                    BloodSugarRecipeCardView.this.k();
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("BloodSugarRecipeCardView", "loadRecipeData failed: " + str);
                BloodSugarRecipeCardView.this.h();
                BloodSugarRecipeCardView.this.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        HandlerExecutor.c(new Runnable() { // from class: vex
            @Override // java.lang.Runnable
            public final void run() {
                this.f51013c.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.e.setVisibility(0);
        if (this.j) {
            this.f28199b.setText(R.string.IDS_recipe_detail);
        } else {
            this.f28199b.setText(R.string.IDS_blood_sugar_go_customize);
        }
        this.p.setVisibility(8);
        this.v.setVisibility(8);
        LogUtil.a("BloodSugarRecipeCardView", "showDefaultCard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        HandlerExecutor.c(new Runnable() { // from class: vep
            @Override // java.lang.Runnable
            public final void run() {
                this.f51007c.a();
            }
        });
    }

    public /* synthetic */ void a() {
        this.e.setVisibility(8);
        this.p.setVisibility(0);
        this.v.setVisibility(8);
        if (this.r == null) {
            LogUtil.j("BloodSugarRecipeCardView", "showDetailCard failed: mRecipeDataModel is null");
            return;
        }
        g();
        String strC = this.r.c();
        d(strC);
        LogUtil.a("BloodSugarRecipeCardView", "showDetailCard success, curMealType: " + strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        HandlerExecutor.c(new Runnable() { // from class: veq
            @Override // java.lang.Runnable
            public final void run() {
                this.f51008c.b();
            }
        });
    }

    public /* synthetic */ void b() {
        this.e.setVisibility(8);
        this.p.setVisibility(8);
        this.v.setVisibility(0);
        LogUtil.a("BloodSugarRecipeCardView", "showLoadingCard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.g) {
            LogUtil.a("BloodSugarRecipeCardView", "Polling already in progress");
            return;
        }
        this.g = true;
        this.k = 0;
        LogUtil.a("BloodSugarRecipeCardView", "Start polling for recipe generation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final long j) {
        if (this.g) {
            int i = this.k + 1;
            this.k = i;
            this.j = false;
            if (i > 10) {
                LogUtil.j("BloodSugarRecipeCardView", "Polling exceeded max count: 10");
                k();
                this.j = true;
                h();
                LogUtil.a("BloodSugarRecipeCardView", "Recipe genera too long, show toast");
                qpx.e(this.f28200c, qre.f(R.string.IDS_health_recipe_creating_err));
                return;
            }
            LogUtil.a("BloodSugarRecipeCardView", "Scheduling poll #" + this.k);
            this.q.postDelayed(new Runnable() { // from class: ves
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51009b.e(j);
                }
            }, 1000L);
        }
    }

    public /* synthetic */ void e(long j) {
        b(j, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.g) {
            LogUtil.a("BloodSugarRecipeCardView", "Stop polling");
            this.g = false;
            this.k = 0;
            this.q.removeCallbacksAndMessages(null);
        }
    }

    private void g() {
        vfb vfbVar = this.r;
        if (vfbVar == null) {
            LogUtil.j("BloodSugarRecipeCardView", "setupSpinnerData failed: mRecipeDataModel is null");
            return;
        }
        List<vfb.a> listE = vfbVar.e();
        ArrayList arrayList = new ArrayList();
        Iterator<vfb.a> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f51022a);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f28200c, R.layout.hwspinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.hwspinner_dropdown_item);
        this.o.setAdapter((SpinnerAdapter) arrayAdapter);
        String strC = this.r.c();
        int iC = this.r.c(strC);
        this.o.setSelection(iC);
        LogUtil.a("BloodSugarRecipeCardView", "setupSpinnerData success, curMealType: " + strC + ", index: " + iC);
    }

    private void e(String str) {
        try {
            AppRouter.e(Uri.parse(str)).b(this.f28200c);
        } catch (Exception e2) {
            LogUtil.e("BloodSugarRecipeCardView", "jumpToH5Page failed: " + e2.getMessage());
        }
    }

    private String a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(j));
    }

    static class e extends RecyclerView.Adapter<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f28204a;
        private List<vfb.c> d;

        public e(Context context, List<vfb.c> list) {
            this.f28204a = context;
            this.d = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new c(LayoutInflater.from(this.f28204a).inflate(R.layout.layout_blood_sugar_recipe_food_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i) {
            vfb.c cVar2 = this.d.get(i);
            cVar.e.setText(cVar2.d);
            cVar.f28205c.setText(cVar2.e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<vfb.c> list = this.d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        static class c extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            TextView f28205c;
            TextView e;

            public c(View view) {
                super(view);
                this.e = (TextView) view.findViewById(R.id.food_name);
                this.f28205c = (TextView) view.findViewById(R.id.food_portion);
            }
        }
    }
}
