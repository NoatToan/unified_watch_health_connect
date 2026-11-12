package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.CoordinatorAdapter;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.adapter.ClockingRankAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
public class jda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClockingRankAdapter f38399c;
    private HealthBottomSheet d;
    private Context e;
    private BaseResponseCallback<String> g;
    private TabLayout i;
    private ClockingRankAdapter j;
    private ViewPager k;
    private LinearLayout l;
    private CoordinatorAdapter o;
    private Map<String, gqc> m = new ConcurrentHashMap();
    private List<ClockingRankAdapter.c> h = new ArrayList();
    private List<ClockingRankAdapter.c> f = new ArrayList();

    public jda(Context context, TabLayout tabLayout, ViewPager viewPager) {
        this.e = context;
        this.i = tabLayout;
        this.k = viewPager;
    }

    public void d(HealthBottomSheet healthBottomSheet) {
        this.d = healthBottomSheet;
    }

    public void b(LinearLayout linearLayout) {
        this.l = linearLayout;
    }

    public void e(BaseResponseCallback baseResponseCallback) {
        this.g = baseResponseCallback;
    }

    public void a(gdm gdmVar) {
        LogUtil.a("RunningRouteRankHolder", "bindHotPathDetailToView, hotPathDetailInfo: ", gdmVar == null ? Constants.NULL : gdmVar.toString());
        if (gdmVar == null) {
            LogUtil.a("RunningRouteRankHolder", "hotPathDetailInfo is null");
            return;
        }
        List<ClockingRankAdapter.c> listE = e(gdmVar);
        List<ClockingRankAdapter.c> listD = d(gdmVar);
        this.f38397a = njy.b(listE);
        this.f38398b = njy.b(listD);
        if (this.f38397a) {
            this.h.addAll(listE);
        }
        if (this.f38398b) {
            this.f.addAll(listD);
        }
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.fragment_clocking_rank, (ViewGroup) null);
        View viewInflate2 = LayoutInflater.from(this.e).inflate(R.layout.fragment_clocking_rank, (ViewGroup) null);
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (this.f38397a) {
            HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.fragment_clocking_rank_recyclerview);
            healthRecycleView.b(false);
            healthRecycleView.e(false);
            int size = listE.size();
            this.k.getLayoutParams().height = (this.e.getResources().getDimensionPixelOffset(R.dimen.health_common_64dp) * (size <= 30 ? size + 1 : 31)) + this.e.getResources().getDimensionPixelOffset(R.dimen.health_common_12dp);
            ClockingRankAdapter clockingRankAdapter = new ClockingRankAdapter(listE);
            this.f38399c = clockingRankAdapter;
            healthRecycleView.setAdapter(clockingRankAdapter);
            healthRecycleView.setLayoutManager(new LinearLayoutManager(this.e));
            c();
            c(gdmVar);
            c(gdmVar, viewInflate);
        } else {
            qsp.c(viewInflate.findViewById(R.id.clock_rank_view), 8);
            qsp.c(viewInflate.findViewById(R.id.no_rank_cardview_layout), 0);
            this.k.getLayoutParams().height = this.e.getResources().getDimensionPixelOffset(R.dimen.health_common_328dp) - this.e.getResources().getDimensionPixelOffset(R.dimen.health_common_64dp);
            BaseResponseCallback<String> baseResponseCallback = this.g;
            if (baseResponseCallback == null) {
                LogUtil.j("RunningRouteRankHolder", "mPunchRankCallBack == null");
            } else {
                baseResponseCallback.onResponse(0, null);
            }
        }
        if (this.f38398b) {
            HealthRecycleView healthRecycleView2 = (HealthRecycleView) viewInflate2.findViewById(R.id.fragment_clocking_rank_recyclerview);
            healthRecycleView2.b(false);
            healthRecycleView2.e(false);
            ClockingRankAdapter clockingRankAdapter2 = new ClockingRankAdapter(listD);
            this.j = clockingRankAdapter2;
            healthRecycleView2.setAdapter(clockingRankAdapter2);
            healthRecycleView2.setLayoutManager(new LinearLayoutManager(this.e));
            b(gdmVar);
            b(gdmVar, viewInflate2);
        } else {
            viewInflate2 = LayoutInflater.from(this.e).inflate(R.layout.fragment_clocking_rank, (ViewGroup) null);
            qsp.c(viewInflate2.findViewById(R.id.clock_rank_view), 8);
            qsp.c(viewInflate2.findViewById(R.id.no_rank_cardview_layout), 0);
        }
        d(viewInflate, viewInflate2);
    }

    private void c(final gdm gdmVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: jda.4
            @Override // java.lang.Runnable
            public void run() {
                List<gdo> listI = gdmVar.i();
                CountDownLatch countDownLatch = new CountDownLatch(listI.size());
                for (int i = 0; i < listI.size(); i++) {
                    gdo gdoVar = listI.get(i);
                    if (gdoVar == null) {
                        LogUtil.j("RunningRouteRankHolder", "requestCloudBindNum userInfo == null");
                        countDownLatch.countDown();
                    } else {
                        jda.this.a(i, gdoVar.a(), countDownLatch);
                    }
                }
                try {
                    LogUtil.a("RunningRouteRankHolder", "requestCloudBindNum await:", Boolean.valueOf(countDownLatch.await(10L, TimeUnit.SECONDS)));
                    HandlerExecutor.b(new Runnable() { // from class: jda.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtil.a("RunningRouteRankHolder", "mNumRankAdapter notifyDataSetChanged");
                            jda.this.c();
                            jda.this.f38399c.notifyDataSetChanged();
                        }
                    });
                } catch (InterruptedException unused) {
                    LogUtil.a("RunningRouteRankHolder", "requestCloudBindNum InterruptedException");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    public void c() {
        String strC;
        LinearLayout linearLayout = this.l;
        if (linearLayout == null) {
            LogUtil.j("RunningRouteRankHolder", "mUserImageLayout == null");
            return;
        }
        linearLayout.removeAllViews();
        if (njy.b(this.h)) {
            int size = this.h.size();
            if (size > 4) {
                size = 4;
            }
            for (int i = 0; i < size; i++) {
                ImageView imageView = new ImageView(this.e);
                this.l.addView(imageView);
                int dimension = (int) this.e.getResources().getDimension(R.dimen.health_common_24dp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
                layoutParams.rightMargin = (int) this.e.getResources().getDimension(R.dimen.health_common_4dp);
                imageView.setLayoutParams(layoutParams);
                d(this.h.get(i), imageView);
            }
            if (size > 0) {
                strC = this.h.get(0).c();
                if (TextUtils.isEmpty(strC)) {
                    strC = "";
                }
            } else {
                strC = "";
            }
            BaseResponseCallback<String> baseResponseCallback = this.g;
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(1, strC);
            }
        }
    }

    private void d(ClockingRankAdapter.c cVar, final ImageView imageView) {
        if (imageView == null) {
            LogUtil.j("RunningRouteRankHolder", "setUserImage imageView==null");
        } else if (TextUtils.isEmpty(cVar.c())) {
            imageView.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
        } else {
            qqf.d(imageView, cVar.c(), 90, 0, new AsyncLoadDrawableCallback() { // from class: jde
                @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
                public final void getDrawable(Drawable drawable) {
                    jda.d(imageView, drawable);
                }
            });
        }
    }

    static /* synthetic */ void d(ImageView imageView, Drawable drawable) {
        if (drawable == null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
        }
    }

    private void b(final gdm gdmVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: jda.2
            @Override // java.lang.Runnable
            public void run() {
                List<gdo> listU = gdmVar.u();
                CountDownLatch countDownLatch = new CountDownLatch(listU.size());
                for (int i = 0; i < listU.size(); i++) {
                    gdo gdoVar = listU.get(i);
                    if (gdoVar == null) {
                        LogUtil.j("RunningRouteRankHolder", "requestCloudBindTime userInfo == null");
                        countDownLatch.countDown();
                    } else {
                        jda.this.e(i, gdoVar.a(), countDownLatch);
                    }
                }
                try {
                    LogUtil.a("RunningRouteRankHolder", "requestCloudBindTime await:", Boolean.valueOf(countDownLatch.await(10L, TimeUnit.SECONDS)));
                    HandlerExecutor.b(new Runnable() { // from class: jda.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtil.a("RunningRouteRankHolder", "mTimeRankAdapter notifyDataSetChanged");
                            jda.this.j.notifyDataSetChanged();
                        }
                    });
                } catch (InterruptedException unused) {
                    LogUtil.a("RunningRouteRankHolder", "requestCloudBindTime InterruptedException");
                }
            }
        });
    }

    private List<ClockingRankAdapter.c> e(gdm gdmVar) {
        if (gdmVar == null) {
            LogUtil.a("RunningRouteRankHolder", "hotPathDetailInfo is null");
            return null;
        }
        List<gdo> listI = gdmVar.i();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listI.size(); i++) {
            gdo gdoVar = listI.get(i);
            if (gdoVar != null) {
                arrayList.add(new ClockingRankAdapter.c(d(i), "", "", this.e.getResources().getQuantityString(R.plurals.IDS_clock_rank_running_times, gdoVar.c(), Integer.valueOf(gdoVar.c()))));
            }
        }
        return arrayList;
    }

    private List<ClockingRankAdapter.c> d(gdm gdmVar) {
        if (gdmVar == null) {
            LogUtil.a("RunningRouteRankHolder", "hotPathDetailInfo is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<gdo> listU = gdmVar.u();
        if (listU != null) {
            for (int i = 0; i < listU.size(); i++) {
                gdo gdoVar = listU.get(i);
                if (gdoVar != null) {
                    arrayList.add(new ClockingRankAdapter.c(d(i), "", "", RunningRouteUtils.c(gdoVar.e())));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final String str, final CountDownLatch countDownLatch) {
        LogUtil.a("RunningRouteRankHolder", "requestRunnerNumRankImage, huid: ", str);
        if (this.m.containsKey(str) && this.m.get(str) != null) {
            a(this.m.get(str), i, countDownLatch, this.h, this.f38399c);
            countDownLatch.countDown();
        } else {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getOtherUserInfo(str, new UserInfoCallback<gqc>() { // from class: jda.3
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void infoCallback(gqc gqcVar) {
                    LogUtil.a("RunningRouteRankHolder", "getOtherUserInfo infoCallback");
                    if (gqcVar == null || gqcVar.d() == null || gqcVar.d().a() == null) {
                        LogUtil.j("RunningRouteRankHolder", "requestRunnerNumRankImage info or GetOtherUserInfoRsp or otherUserInfo is null");
                        countDownLatch.countDown();
                    } else {
                        jda.this.m.put(str, gqcVar);
                        jda jdaVar = jda.this;
                        jdaVar.a(gqcVar, i, countDownLatch, jdaVar.h, jda.this.f38399c);
                        countDownLatch.countDown();
                    }
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i2) {
                    LogUtil.e("RunningRouteRankHolder", "errorCallback errorCode is ", Integer.valueOf(i2));
                    countDownLatch.countDown();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(gqc gqcVar, int i, CountDownLatch countDownLatch, List<ClockingRankAdapter.c> list, ClockingRankAdapter clockingRankAdapter) {
        gqc.c cVarA = gqcVar.d().a();
        if (cVarA == null) {
            return;
        }
        LogUtil.a("RunningRouteRankHolder", "userInfo: ", cVarA.toString());
        ClockingRankAdapter.c cVar = list.get(i);
        cVar.c(cVarA.e());
        cVar.a(cVarA.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i, final String str, final CountDownLatch countDownLatch) {
        LogUtil.a("RunningRouteRankHolder", "requestRunnerTimeRankImage, huid: ", str);
        if (this.m.containsKey(str) && this.m.get(str) != null) {
            a(this.m.get(str), i, countDownLatch, this.f, this.j);
            countDownLatch.countDown();
        } else {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getOtherUserInfo(str, new UserInfoCallback<gqc>() { // from class: jda.1
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void infoCallback(gqc gqcVar) {
                    LogUtil.a("RunningRouteRankHolder", "getOtherUserInfo infoCallback");
                    if (gqcVar == null || gqcVar.d() == null || gqcVar.d().a() == null) {
                        LogUtil.j("RunningRouteRankHolder", "requestRunnerTimeRankImage info or GetOtherUserInfoRsp or otherUserInfo is null");
                        countDownLatch.countDown();
                    } else {
                        jda.this.m.put(str, gqcVar);
                        jda jdaVar = jda.this;
                        jdaVar.a(gqcVar, i, countDownLatch, jdaVar.f, jda.this.j);
                        countDownLatch.countDown();
                    }
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i2) {
                    LogUtil.e("RunningRouteRankHolder", "errorCallback errorCode is ", Integer.valueOf(i2));
                    countDownLatch.countDown();
                }
            });
        }
    }

    private void d(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.e.getString(R.string.IDS_clock_rank_text));
        arrayList2.add(this.e.getString(R.string.IDS_clock_rank_run_performance_rank));
        CoordinatorAdapter coordinatorAdapter = new CoordinatorAdapter(arrayList, arrayList2);
        this.o = coordinatorAdapter;
        this.k.setAdapter(coordinatorAdapter);
        this.i.setupWithViewPager(this.k);
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass5());
    }

    /* JADX INFO: renamed from: jda$5, reason: invalid class name */
    class AnonymousClass5 implements ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass5() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            jda.this.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int tabCount = jda.this.i.getTabCount();
            for (final int i = 0; i < tabCount; i++) {
                TabLayout.Tab tabAt = jda.this.i.getTabAt(i);
                if (tabAt == null) {
                    LogUtil.j("RunningRouteRankHolder", "bindRankView tab is null");
                } else {
                    TabLayout.TabView tabView = tabAt.view;
                    if (tabView == null) {
                        LogUtil.j("RunningRouteRankHolder", "bindRankView tabView is null");
                    } else {
                        tabView.setOnLongClickListener(new View.OnLongClickListener() { // from class: jdc
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                return this.e.a(i, view);
                            }
                        });
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean a(int i, View view) {
            if (!jda.this.i.isSelected()) {
                jda.this.k.setCurrentItem(i);
            }
            if (jda.this.d == null) {
                return true;
            }
            jda.this.d.setSheetState(HwBottomSheet.SheetState.EXPANDED);
            return true;
        }
    }

    private void c(gdm gdmVar, View view) {
        List<gdo> listI = gdmVar.i();
        String huidOrDefault = LoginInit.getInstance(BaseApplication.b()).getHuidOrDefault();
        ImageView imageView = (ImageView) view.findViewById(R.id.user_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
        qsp.b((HealthTextView) view.findViewById(R.id.user_name), this.e.getString(R.string.IDS_clock_rank_self_text));
        d(huidOrDefault, imageView);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.rank_num);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.rank_image);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.clock_times);
        qsp.c((View) healthTextView, 0);
        qsp.b(healthTextView, "--");
        qsp.b(healthTextView2, "--");
        qsp.c((View) imageView2, 8);
        qsp.c((View) healthTextView, 0);
        for (int i = 0; i < listI.size(); i++) {
            LogUtil.a("RunningRouteRankHolder", "userHuid: ", huidOrDefault, ", otherRunnerHuid: ", String.valueOf(listI.get(i).a()));
            if (huidOrDefault.equals(listI.get(i).a())) {
                if (i == 0 || i == 1 || i == 2) {
                    imageView2.setImageResource(d(i));
                    qsp.c((View) imageView2, 0);
                    qsp.c((View) healthTextView, 8);
                } else {
                    qsp.b(healthTextView, String.valueOf(i + 1));
                    qsp.c((View) imageView2, 8);
                    qsp.c((View) healthTextView, 0);
                }
                int iC = listI.get(i).c();
                qsp.b(healthTextView2, this.e.getResources().getQuantityString(R.plurals.IDS_clock_rank_running_times, iC, Integer.valueOf(iC)));
                return;
            }
            if (gdmVar.f() != 0) {
                qsp.b(healthTextView2, this.e.getResources().getQuantityString(R.plurals.IDS_clock_rank_running_times, (int) gdmVar.f(), Integer.valueOf((int) gdmVar.f())));
                qsp.b(healthTextView, "--");
                qsp.c((View) imageView2, 8);
                qsp.c((View) healthTextView, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gqc gqcVar, final ImageView imageView) {
        final gqc.c cVarA = gqcVar.d().a();
        if (cVarA == null) {
            return;
        }
        LogUtil.a("RunningRouteRankHolder", "otherUserInfo: ", cVarA.toString());
        HandlerExecutor.b(new Runnable(this) { // from class: jda.9
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(cVarA.e())) {
                    return;
                }
                qqf.d(imageView, cVarA.e(), 90, 0, new AsyncLoadDrawableCallback() { // from class: jda.9.3
                    @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
                    public void getDrawable(Drawable drawable) {
                        if (drawable == null) {
                            imageView.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
                        }
                    }
                });
            }
        });
    }

    private void b(gdm gdmVar, View view) {
        String huidOrDefault = LoginInit.getInstance(BaseApplication.b()).getHuidOrDefault();
        ImageView imageView = (ImageView) view.findViewById(R.id.user_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.mipmap.ic_personal_head));
        qsp.b((HealthTextView) view.findViewById(R.id.user_name), this.e.getString(R.string.IDS_clock_rank_self_text));
        b(huidOrDefault, imageView);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.rank_image);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.rank_num);
        qsp.b(healthTextView, UnitUtil.e(30.0d, 1, 0) + Marker.ANY_NON_NULL_MARKER);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.clock_times);
        qsp.b(healthTextView, "--");
        qsp.b(healthTextView2, "--");
        qsp.c((View) healthTextView, 0);
        qsp.c((View) healthTextView2, 0);
        List<gdo> listU = gdmVar.u();
        for (int i = 0; i < listU.size(); i++) {
            LogUtil.a("RunningRouteRankHolder", "userHuid: ", huidOrDefault, ", otherRunnerHuid: ", String.valueOf(listU.get(i).a()));
            if (huidOrDefault.equals(listU.get(i).a())) {
                if (i == 0 || i == 1 || i == 2) {
                    imageView2.setImageResource(d(i));
                    qsp.c((View) imageView2, 0);
                    qsp.c((View) healthTextView, 8);
                } else {
                    qsp.b(healthTextView, String.valueOf(i + 1));
                    qsp.c((View) healthTextView, 0);
                    qsp.c((View) imageView2, 8);
                }
                qsp.b(healthTextView2, RunningRouteUtils.c(listU.get(i).e()));
                return;
            }
            if (gdmVar.j() != 0) {
                qsp.b(healthTextView2, RunningRouteUtils.c(gdmVar.j()));
                qsp.b(healthTextView, "--");
                qsp.c((View) healthTextView, 0);
                qsp.c((View) imageView2, 8);
            }
        }
    }

    private void d(final String str, final ImageView imageView) {
        if (this.m.containsKey(str) && this.m.get(str) != null) {
            d(this.m.get(str), imageView);
        } else {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getOtherUserInfo(str, new UserInfoCallback<gqc>() { // from class: jda.10
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void infoCallback(gqc gqcVar) {
                    LogUtil.a("RunningRouteRankHolder", "getOtherUserInfo infoCallback");
                    if (gqcVar == null || gqcVar.d() == null || gqcVar.d().a() == null) {
                        return;
                    }
                    jda.this.m.put(str, gqcVar);
                    jda.this.d(gqcVar, imageView);
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i) {
                    LogUtil.e("RunningRouteRankHolder", "errorCallback errorCode is ", Integer.valueOf(i));
                }
            });
        }
    }

    private void b(final String str, final ImageView imageView) {
        if (this.m.containsKey(str) && this.m.get(str) != null) {
            d(this.m.get(str), imageView);
        } else {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getOtherUserInfo(str, new UserInfoCallback<gqc>() { // from class: jda.6
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void infoCallback(gqc gqcVar) {
                    LogUtil.a("RunningRouteRankHolder", "getOtherUserInfo infoCallback");
                    if (gqcVar == null || gqcVar.d() == null || gqcVar.d().a() == null) {
                        return;
                    }
                    jda.this.m.put(str, gqcVar);
                    jda.this.d(gqcVar, imageView);
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i) {
                    LogUtil.e("RunningRouteRankHolder", "errorCallback errorCode is ", Integer.valueOf(i));
                }
            });
        }
    }

    private int d(int i) {
        if (i == 0) {
            return R.drawable.ic_ranking_1;
        }
        if (i == 1) {
            return R.drawable.ic_ranking_2;
        }
        return i == 2 ? R.drawable.ic_ranking_3 : i + 1;
    }
}
