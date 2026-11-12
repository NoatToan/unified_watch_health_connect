package com.huawei.ui.homehealth.quickentrycard;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.quickentrycard.QuickEntryAdapter;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.quickentrycard.HealthQuickEntryCardViewHolder;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.ezg;
import defpackage.gdy;
import defpackage.irz;
import defpackage.iun;
import defpackage.ive;
import defpackage.lsx;
import defpackage.njy;
import defpackage.pjo;
import defpackage.qre;
import defpackage.sma;
import defpackage.smp;
import defpackage.sus;
import defpackage.ugs;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class HealthQuickEntryCardViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private QuickEntryAdapter.OnQuickEntryClickListener f25715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, Integer> f25716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView.Adapter f25717c;
    private final ImageView d;
    private HealthColumnSystem e;
    private final RecyclerView h;
    private QuickEntryAdapter i;
    private View.OnLongClickListener j;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:96:0x019b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a6  */
    public /* synthetic */ void b(View view, ezg ezgVar) {
        String strD = ezgVar.d();
        strD.hashCode();
        switch (strD) {
            case "entryRun":
                ive.c().c(getContext(), 258, -1, -1.0f);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryDietaryAnalysis":
                if (!irz.i()) {
                    H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                    builder.addPath("#/PrivilegeDetail?functionId=3");
                    ddv.b().loadH5ProApp(getContext(), "com.huawei.health.h5.vip", builder);
                } else if (TextUtils.isEmpty(ezgVar.b())) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(ezgVar.b()));
                    intent.setFlags(268435456);
                    intent.setPackage(BaseApplication.getContext().getPackageName());
                    lsx.c(intent, BaseApplication.getContext());
                }
                sus.e(1, "f2", ezgVar);
                break;
            case "entryDietLog":
                iun.i("Suggestion_HealthQuickEntryCardViewHolder");
                sus.e(1, "f2", ezgVar);
                break;
            case "entryBreath":
                d("2", "HEALTH_COURSE", 100063001);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryCustomizedRecipes":
            case "entryWarmUpStretch":
            case "entrySmartFatLoss":
            case "entrySmartTraining":
                if (TextUtils.isEmpty(ezgVar.b())) {
                    Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(ezgVar.b()));
                    intent2.setFlags(268435456);
                    intent2.setPackage(BaseApplication.getContext().getPackageName());
                    lsx.c(intent2, BaseApplication.getContext());
                    sus.e(1, "f2", ezgVar);
                    break;
                }
                break;
            case "entrySleepMusic":
                d("7", "HEALTH_COURSE", 0);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryHealthCourses":
                d("2", "HEALTH_COURSE", 100062001);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryRide":
                ive.c().c(getContext(), 259, -1, -1.0f);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryWalk":
                ive.c().c(getContext(), 257, -1, -1.0f);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryMindfulnessMeditation":
                d("2", "HEALTH_COURSE", 12701);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryHealthHeadline":
                c();
                sus.e(1, "f2", ezgVar);
                break;
            case "entryHealthAssessment":
                H5ProLaunchOption.Builder builder2 = new H5ProLaunchOption.Builder();
                builder2.addPath("#ServiceRedirection?scene=144&from=1");
                ddv.b().loadH5ProApp(getContext(), "com.huawei.health.h5.vip", builder2);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryFitnessCourse":
                d("1", "FITNESS_COURSE", 1001);
                sus.e(1, "f2", ezgVar);
                break;
            case "entryMonitoringSleep":
                pjo.b().c(getContext(), true, "3");
                sus.e(1, "f2", ezgVar);
                break;
            case "entryFamilyDoctor":
                j();
                sus.e(1, "f2", ezgVar);
                break;
            default:
                sus.e(1, "f2", ezgVar);
                break;
        }
    }

    public /* synthetic */ boolean e(View view) {
        f();
        return true;
    }

    private void c() {
        LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "goToHealthHeadLineH5Page");
        ddv ddvVarB = ddv.b();
        gdy gdyVarJ = smp.b().j();
        String strD = gdyVarJ != null ? gdyVarJ.d() : "";
        H5proUtil.initH5pro();
        H5ProClient.startH5MiniProgram(getContext(), "com.huawei.health.h5.health-headlines", new H5ProLaunchOption.Builder().addCustomizeJsModule("healthHeadlines", sma.class).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).addCustomizeArg("clickPosition", "normal").addCustomizeArg("date", strD).addCustomizeArg("enterPosition", "2").setImmerse().setStatusBarTextBlack(true).enableSlowWholeDocumentDraw().showStatusBar().build());
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
    }

    private void d(String str, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", i);
        bundle.putString("SKIP_ALL_COURSE_KEY", str2);
        bundle.putString("COURSE_PAGE_TYPE", str);
        bundle.putString(WebViewHelp.BI_KEY_PULL_FROM, "");
        bundle.putString("resourceId", "");
        bundle.putString("resourceName", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).b(getContext());
    }

    private static void j() {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("Suggestion_HealthQuickEntryCardViewHolder", "queryBenefitInfo payApi is null");
        } else {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: sun
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    HealthQuickEntryCardViewHolder.c(i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void c(int i, Object obj) {
        if (i != 0 || !(obj instanceof RepeatResourceBenefitInfo)) {
            LogUtil.j("Suggestion_HealthQuickEntryCardViewHolder", "queryBenefitInfo errorCode:", Integer.valueOf(i));
            e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=ExclusiveSubscribe");
            return;
        }
        RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
        if (repeatResourceBenefitInfo.getExpireTime().longValue() >= (repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis())) {
            b();
        } else {
            e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=ExclusiveSubscribe");
        }
    }

    private static void b() {
        LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "getDoctorBasicInfo");
        ugs.e().getDoctorBasicInfo(new DataCallback() { // from class: com.huawei.ui.homehealth.quickentrycard.HealthQuickEntryCardViewHolder.4
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_HealthQuickEntryCardViewHolder", "getDoctorBasicInfo errorCode:", Integer.valueOf(i), " errorInfo:", str);
                HealthQuickEntryCardViewHolder.e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&isImmerse&urlType=4&pName=com.huawei.health&path=ExclusiveGuardService");
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null || jSONObject.optInt("resultCode", -1) != 0) {
                    LogUtil.e("Suggestion_HealthQuickEntryCardViewHolder", "getDoctorBasicInfo resultCode not 0 ");
                    HealthQuickEntryCardViewHolder.e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&isNeedLogin=true&path=ServiceRedirection&scene=1");
                    return;
                }
                LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "getDoctorBasicInfo:", jSONObject.toString());
                String strOptString = jSONObject.optString("doctorId");
                if (!TextUtils.isEmpty(strOptString) && !"0".equals(strOptString)) {
                    HealthQuickEntryCardViewHolder.e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&isNeedLogin=true&path=ServiceRedirection&scene=3");
                } else {
                    LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "getDoctorBasicInfo doctorId is null");
                    HealthQuickEntryCardViewHolder.e("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&isNeedLogin=true&path=ServiceRedirection&scene=1");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_HealthQuickEntryCardViewHolder", "gotoFamilyDoctorPage url is empty");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.j("Suggestion_HealthQuickEntryCardViewHolder", "gotoFamilyDoctorPage marketRouterApi is null");
        } else {
            marketRouterApi.router(str);
        }
    }

    HealthQuickEntryCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.f25716b = new HashMap(5);
        this.f25715a = new QuickEntryAdapter.OnQuickEntryClickListener() { // from class: suq
            @Override // com.huawei.health.health.quickentrycard.QuickEntryAdapter.OnQuickEntryClickListener
            public final void onViewClick(View view2, ezg ezgVar) {
                this.f48711c.b(view2, ezgVar);
            }
        };
        this.j = new View.OnLongClickListener() { // from class: suv
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f48716b.e(view2);
            }
        };
        d(view);
        this.e = new HealthColumnSystem(getContext(), 1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.quick_entry_recycle_view);
        this.h = recyclerView;
        ImageView imageView = (ImageView) view.findViewById(R.id.quick_entry_add);
        this.d = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: suu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f48715c.a(view2);
            }
        });
        final int iB = qre.b(R.dimen.health_common_8dp);
        final int iB2 = qre.b(R.dimen.health_common_12dp);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.ui.homehealth.quickentrycard.HealthQuickEntryCardViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, RecyclerView.State state) {
                super.getItemOffsets(rect, view2, recyclerView2, state);
                rect.left = recyclerView2.getChildAdapterPosition(view2) > 0 ? iB : iB2;
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));
        imageView.setVisibility(0);
        b bVar = new b();
        this.f25717c = bVar;
        recyclerView.setAdapter(bVar);
    }

    public /* synthetic */ void a(View view) {
        f();
    }

    public void b(List<ezg> list) {
        int size = njy.e(list) ? 0 : list.size();
        LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "updateEntries size:", Integer.valueOf(size));
        this.h.getRecycledViewPool().clear();
        this.h.removeAllViews();
        if (size == 0 || LoginInit.getInstance(getContext()).isBrowseMode()) {
            this.h.setLayoutManager(new GridLayoutManager(getContext(), 1));
            this.d.setVisibility(0);
            this.f25717c = new b();
        } else {
            if (this.i == null) {
                QuickEntryAdapter quickEntryAdapter = new QuickEntryAdapter(getContext());
                this.i = quickEntryAdapter;
                quickEntryAdapter.c(this.f25715a);
                this.i.d(this.j);
            }
            this.i.b(list);
            int iJ = this.e.j();
            LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "updateEntries columCount:", Integer.valueOf(iJ));
            if (njy.e(this.f25716b)) {
                e();
            }
            Integer num = this.f25716b.get(Integer.valueOf(iJ));
            int iIntValue = num == null ? 2 : num.intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            numValueOf.getClass();
            if (size <= iIntValue) {
                RecyclerView recyclerView = this.h;
                Context context = getContext();
                if (size != 1) {
                    numValueOf.getClass();
                    size = iIntValue;
                }
                recyclerView.setLayoutManager(new GridLayoutManager(context, size));
                this.d.setVisibility(0);
                this.f25717c = this.i;
            } else {
                this.h.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                this.d.setVisibility(8);
                this.f25717c = new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this.i, new c()});
            }
        }
        this.h.setAdapter(this.f25717c);
    }

    private void e() {
        this.f25716b.put(4, 2);
        this.f25716b.put(6, 4);
        this.f25716b.put(8, 5);
        this.f25716b.put(10, 6);
        this.f25716b.put(12, 7);
    }

    private void d(View view) {
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int iB = qre.b(R.dimen.defaultPaddingStart);
        int iB2 = qre.b(R.dimen.defaultPaddingEnd);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(iB + ((Integer) safeRegionWidth.first).intValue());
            marginLayoutParams.setMarginEnd(iB2 + ((Integer) safeRegionWidth.second).intValue());
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public void d() {
        LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "onDestroy");
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.f25717c = null;
    }

    public class c extends RecyclerView.Adapter<b> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 1;
        }

        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            int iB = qre.b(R.dimen.health_common_6dp);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageDrawable(HealthQuickEntryCardViewHolder.this.d.getDrawable());
            imageView.setContentDescription(context.getString(R.string.IDS_contact_add));
            linearLayout.addView(imageView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i2 = iB * 2;
            layoutParams.setMargins(0, i2, i2, i2);
            linearLayout.setLayoutParams(layoutParams);
            return new b(linearLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i) {
            LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "AddButtonViewHolder onBindViewHolder:", Integer.valueOf(i));
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: sut
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48714c.b(view);
                }
            });
        }

        public /* synthetic */ void b(View view) {
            HealthQuickEntryCardViewHolder.this.f();
        }

        class b extends RecyclerView.ViewHolder {
            b(View view) {
                super(view);
            }
        }
    }

    public class b extends RecyclerView.Adapter<c> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 1;
        }

        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quick_entry_empty, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i) {
            LogUtil.a("Suggestion_HealthQuickEntryCardViewHolder", "emptyStateAdapter onBindViewHolder:", Integer.valueOf(i));
            cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: sur
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48712a.c(view);
                }
            });
        }

        public /* synthetic */ void c(View view) {
            HealthQuickEntryCardViewHolder.this.f();
        }

        class c extends RecyclerView.ViewHolder {
            c(View view) {
                super(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LoginInit.getInstance(getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: sup
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48710b.b(i, obj);
            }
        }, "");
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            QuickEntryFlowManager.d().c(getContext());
            sus.e(1, this.d.getVisibility() == 8 ? "f1" : "f5", null);
        } else {
            ReleaseLogUtil.d("Suggestion_HealthQuickEntryCardViewHolder", "errorCode is not success", Integer.valueOf(i));
        }
    }

    public void a() {
        ReleaseLogUtil.d("Suggestion_HealthQuickEntryCardViewHolder", "onConfigurationChanged");
        this.e.b(getContext());
        if (this.f25717c instanceof b) {
            ReleaseLogUtil.e("Suggestion_HealthQuickEntryCardViewHolder", "onConfigurationChanged EmptyState");
            return;
        }
        QuickEntryAdapter quickEntryAdapter = this.i;
        if (quickEntryAdapter != null) {
            b(quickEntryAdapter.a());
        }
    }
}
