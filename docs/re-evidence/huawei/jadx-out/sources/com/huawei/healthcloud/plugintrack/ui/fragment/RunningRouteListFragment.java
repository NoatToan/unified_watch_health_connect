package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.runningroute.view.RouteAttributeAdapter;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linearlayout.LineWrappingLinearLayout;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import defpackage.gch;
import defpackage.gcm;
import defpackage.gdj;
import defpackage.gdk;
import defpackage.gdp;
import defpackage.gdr;
import defpackage.gdw;
import defpackage.ien;
import defpackage.izt;
import defpackage.jcs;
import defpackage.jct;
import defpackage.jdn;
import defpackage.jpg;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class RunningRouteListFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LoadMoreRecyclerViewAdapter f11064a;
    private RouteAttributeAdapter aa;
    private HealthSpinner ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f11065b;
    private Context d;
    private ImageView e;
    private HealthSpinner f;
    private RouteAttributeAdapter g;
    private boolean h;
    private TextView i;
    private gdk j;
    private boolean l;
    private View n;
    private HealthRecycleView p;
    private HotPathListCallBack r;
    private View s;
    private int t;
    private HealthSpinner v;
    private RouteAttributeAdapter w;
    private HealthSpinner x;
    private RouteAttributeAdapter y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11066c = 1;
    private int m = 1;
    private boolean o = false;
    private boolean k = true;
    private jct q = new jct();
    private final Map<Integer, Integer> u = new HashMap();
    private jpg ac = null;

    public interface HotPathListCallBack {
        void onError(int i, String str);

        void onSuccess(gdj gdjVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l();
        this.d = getActivity();
        return e(layoutInflater, viewGroup);
    }

    private void l() {
        gdk gdkVar = new gdk();
        this.j = gdkVar;
        gdkVar.b(20);
    }

    private View e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.s = layoutInflater.inflate(R.layout.layout_runing_route_list, viewGroup, false);
        n();
        o();
        m();
        if (this.h) {
            a();
        }
        return this.s;
    }

    private void o() {
        this.p = (HealthRecycleView) this.s.findViewById(R.id.recyclerView);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.p.setItemAnimator(defaultItemAnimator);
        this.p.setNestedScrollingEnabled(false);
        this.p.b(false);
        this.p.addItemDecoration(new ColumnLayoutItemDecoration(0, getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), 1, new int[]{getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart), 0, getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd), 0}));
        ien.a(this.d, this.p, new HealthLinearLayoutManager(this.d, 1, false));
        e();
        this.p.setAdapter(this.f11064a);
        t();
    }

    private void m() {
        this.f11065b = (ViewGroup) this.s.findViewById(R.id.common_no_data_layout);
        this.e = (ImageView) this.s.findViewById(R.id.common_no_data_img);
        this.i = (TextView) this.s.findViewById(R.id.common_no_data_text);
        this.n = this.s.findViewById(R.id.loading_layout);
    }

    private void n() {
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.s.findViewById(R.id.running_route_type_list);
        horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
        horizontalScrollView.setOverScrollMode(1);
    }

    private void d(List<gdp> list, final int i) {
        HealthSpinner healthSpinnerD = d(i);
        if (healthSpinnerD == null) {
            ReleaseLogUtil.a("RunningPathListFragment", "spinner is null with ", Integer.valueOf(i));
            return;
        }
        if (njy.e(list) || list.size() < 2) {
            healthSpinnerD.setVisibility(8);
            ReleaseLogUtil.d("RunningPathListFragment", "pathAttributes less than 2.");
            return;
        }
        final RouteAttributeAdapter routeAttributeAdapter = new RouteAttributeAdapter(BaseApplication.b(), R.layout.multiple_line_hwspinner_item, list);
        routeAttributeAdapter.setDropDownViewResource(R.layout.hwspinner_dropdown_item);
        c(i, routeAttributeAdapter);
        u();
        healthSpinnerD.setDynamicWidthEnabled(true);
        healthSpinnerD.setDropDownHorizontalOffset(getResources().getDimensionPixelSize(R.dimen.health_common_14dp));
        healthSpinnerD.setAdapter((SpinnerAdapter) routeAttributeAdapter);
        healthSpinnerD.setTag(false);
        healthSpinnerD.setSelection(b(i), false);
        healthSpinnerD.setVisibility(0);
        healthSpinnerD.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                if (RunningRouteListFragment.this.b(i) == i2) {
                    ReleaseLogUtil.d("RunningPathListFragment", "spinner not changed");
                    return;
                }
                RunningRouteListFragment.this.u.put(Integer.valueOf(i), Integer.valueOf(i2));
                RunningRouteListFragment.this.e(i, routeAttributeAdapter.b(i2));
                RunningRouteListFragment.this.d();
            }
        });
    }

    private HealthSpinner d(int i) {
        if (R.id.spinner_pathTheme == i) {
            if (this.v == null) {
                this.v = (HealthSpinner) this.s.findViewById(i);
            }
            return this.v;
        }
        if (R.id.spinner_distance == i) {
            if (this.f == null) {
                this.f = (HealthSpinner) this.s.findViewById(i);
            }
            return this.f;
        }
        if (R.id.spinner_pathType == i) {
            if (this.ad == null) {
                this.ad = (HealthSpinner) this.s.findViewById(i);
            }
            return this.ad;
        }
        if (this.x == null) {
            this.x = (HealthSpinner) this.s.findViewById(i);
        }
        return this.x;
    }

    private void c(int i, RouteAttributeAdapter routeAttributeAdapter) {
        if (R.id.spinner_distance == i) {
            this.g = routeAttributeAdapter;
            return;
        }
        if (R.id.spinner_pathType == i) {
            this.aa = routeAttributeAdapter;
        } else if (R.id.spinner_pathTheme == i) {
            this.y = routeAttributeAdapter;
        } else {
            this.w = routeAttributeAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(int i) {
        Integer num;
        if (!this.u.containsKey(Integer.valueOf(i)) || (num = this.u.get(Integer.valueOf(i))) == null) {
            return 0;
        }
        return num.intValue();
    }

    private List<String> a(int i, List<Integer> list) {
        gcm gcmVarB = this.q.b();
        if (gcmVarB == null || njy.e(list)) {
            return new ArrayList();
        }
        if (i == 0) {
            return RunningRouteUtils.c(gcmVarB.b(), list);
        }
        return RunningRouteUtils.c(gcmVarB.e(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        for (Attribute attribute : RunningRouteUtils.d(getActivity())) {
            if (attribute.getId().equals(str)) {
                return attribute.getName();
            }
        }
        return "";
    }

    private void e() {
        LogUtil.a("RunningPathListFragment", "get user current location");
        this.f11064a = new AnonymousClass5(new ArrayList(), this.p, R.layout.list_item_running_route);
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment$5, reason: invalid class name */
    public class AnonymousClass5 extends LoadMoreRecyclerViewAdapter<gdr> {
        AnonymousClass5(List list, RecyclerView recyclerView, int i) {
            super(list, recyclerView, i);
        }

        @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void convert(final RecyclerHolder recyclerHolder, int i, gdr gdrVar) {
            recyclerHolder.a(R.id.title, gdrVar.h());
            recyclerHolder.a(R.id.totalDistance, RunningRouteUtils.c(R.plurals.IDS_distance_km, R.plurals.IDS_distance_mi, gdrVar.n()));
            int i2 = R.id.distanceToUser;
            int i3 = R.plurals.IDS_track_route_draw_from_you;
            int i4 = R.plurals.IDS_track_route_draw_from_you_unit_mi;
            RunningRouteListFragment runningRouteListFragment = RunningRouteListFragment.this;
            recyclerHolder.a(i2, RunningRouteUtils.a(i3, i4, runningRouteListFragment.e(gdrVar, runningRouteListFragment.ac), 2));
            recyclerHolder.a(R.id.people_num_check_in, UnitUtil.e(gdrVar.b(), 1, 0));
            recyclerHolder.e(R.id.distanceToUser, RunningRouteListFragment.this.k ? 0 : 8);
            final LineWrappingLinearLayout lineWrappingLinearLayout = (LineWrappingLinearLayout) recyclerHolder.itemView.findViewById(R.id.distanceParent);
            RunningRouteListFragment.this.e(lineWrappingLinearLayout, recyclerHolder.itemView);
            lineWrappingLinearLayout.postDelayed(new Runnable() { // from class: jnr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38757c.b(lineWrappingLinearLayout, recyclerHolder);
                }
            }, 100L);
            RunningRouteListFragment.this.d(recyclerHolder, gdrVar);
            if (!njy.e(gdrVar.g())) {
                recyclerHolder.e(R.id.flag, 0);
                recyclerHolder.a(R.id.flag, RunningRouteListFragment.this.a(gdrVar.g().get(0)));
            } else {
                recyclerHolder.e(R.id.flag, 8);
            }
            ImageView imageView = (ImageView) recyclerHolder.d(R.id.image);
            String str = imageView.getTag() instanceof String ? (String) imageView.getTag() : null;
            gdw gdwVarI = gdrVar.i();
            if ((TextUtils.isEmpty(str) || !(str == null || str.equals(gdwVarI.c()))) && gdwVarI != null) {
                imageView.setTag(gdwVarI.c());
                recyclerHolder.d(R.id.image, gdwVarI.c(), qqf.e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(LineWrappingLinearLayout lineWrappingLinearLayout, RecyclerHolder recyclerHolder) {
            RunningRouteListFragment.this.e(lineWrappingLinearLayout, recyclerHolder.itemView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(RecyclerHolder recyclerHolder, gdr gdrVar) {
        LinearLayout linearLayout = (LinearLayout) recyclerHolder.itemView.findViewById(R.id.labelList);
        linearLayout.removeAllViews();
        e(a(1, gdrVar.l()), linearLayout);
        e(a(0, gdrVar.k()), linearLayout);
    }

    private void e(List<String> list, LinearLayout linearLayout) {
        if (njy.b(list)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    linearLayout.addView(c(str), i());
                }
            }
        }
    }

    private View c(String str) {
        TextView textView = (TextView) LayoutInflater.from(this.d).inflate(R.layout.list_item_running_route_label, (ViewGroup) null).findViewById(R.id.text1);
        qsp.b(textView, str);
        return textView;
    }

    private LinearLayout.LayoutParams i() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.health_common_4dp));
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double e(gdr gdrVar, jpg jpgVar) {
        if (this.ac == null) {
            this.ac = RunningRouteUtils.a();
            return gdrVar.e();
        }
        return RunningRouteUtils.a(jpgVar, RunningRouteUtils.c(gdrVar.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(LineWrappingLinearLayout lineWrappingLinearLayout, View view) {
        HealthTextView healthTextView;
        if (lineWrappingLinearLayout.b() && this.k && (healthTextView = (HealthTextView) view.findViewById(R.id.distanceToUser)) != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams.setMarginStart(0);
            healthTextView.setLayoutParams(layoutParams);
        }
    }

    private void t() {
        this.f11064a.setLoadMoreWhenLoadingViewShow(true);
        this.f11064a.setOnMoreListener(new LoadMoreRecyclerViewAdapter.OnMoreListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment.2
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.OnMoreListener
            public void onLoadingMore() {
                if (RunningRouteListFragment.this.o) {
                    return;
                }
                RunningRouteListFragment.this.o = true;
                RunningRouteListFragment.this.r();
            }
        });
        this.f11064a.setOnItemClickListener(new LoadMoreRecyclerViewAdapter.OnItemClickListener<gdr>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment.4
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.OnItemClickListener
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, gdr gdrVar) {
                Intent intent = new Intent(RunningRouteListFragment.this.getActivity(), (Class<?>) ClockingRankActivity.class);
                intent.putExtra("PATH_ID", gdrVar.j());
                intent.putExtra("ENTRANCE_ACTIVITY", 1);
                intent.putExtra("pathClass", gdrVar.a());
                intent.putExtra("ROUTE_INFO", RunningRouteListFragment.this.q);
                intent.putExtra("pathLocation", izt.b(gdrVar.f()));
                RunningRouteListFragment.this.startActivity(intent);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerView.LayoutManager layoutManager = this.p.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ien.a(this.d, this.p, (LinearLayoutManager) layoutManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        int i = this.m + 1;
        this.f11066c = i;
        LogUtil.a("RunningPathListFragment", "up to loadMore currpage:", Integer.valueOf(i), "--->old dataSize: ", Integer.valueOf(this.f11064a.size()));
        this.j.c(this.f11066c);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        d(false);
        if (this.f11066c == 1) {
            this.f11064a.clear();
        }
        h();
        if (this.f11064a.size() != 0) {
            this.f11064a.loadError();
        }
        this.o = false;
    }

    private void d(boolean z) {
        if (this.f11066c != 1) {
            return;
        }
        if (this.q.g()) {
            LogUtil.a("RunningPathListFragment", "first init list, no bi");
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("searchResult", z + "");
        map.put(DistrictSearchQuery.KEYWORDS_CITY, jdn.a() != null ? jdn.a().getCityName() : "");
        map.put("routeStyle", Integer.valueOf(this.j.f()));
        map.put(BleConstants.SPORT_TYPE, 258);
        map.put("orderType", this.j.g() == 1 ? "distance" : "popular");
        map.put(CommonUtil.PAGE_TYPE, 1);
        lmf.d().c(BaseApplication.b(), "1040082", map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<gdr> list, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        if (this.f11066c == 1) {
            this.f11064a.clear();
        }
        this.m = this.f11066c;
        if (njy.b(list)) {
            LogUtil.a("RunningPathListFragment", "getData Size: ", Integer.valueOf(list.size()), " ,totalSize: ", Integer.valueOf(i), " , adapter data size: ", Integer.valueOf(this.f11064a.getData().size()), " ,mPageFlag: ", Integer.valueOf(this.m));
            if (this.f11064a.getData().size() + list.size() >= i) {
                this.f11064a.noMoreLoad(list);
            } else {
                this.f11064a.enableMoreLoad(list);
            }
        } else {
            this.f11064a.noMoreLoad();
            z = false;
        }
        if (i != 0) {
            d(z);
        }
        this.o = false;
        h();
        RunningRouteUtils.e(1004, SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    private void h() {
        if (this.n.getVisibility() == 0) {
            this.n.setVisibility(8);
        }
    }

    private void s() {
        this.n.setVisibility(0);
    }

    public void a() {
        LogUtil.a("RunningPathListFragment", "refreshFilter");
        if (this.f11064a == null || !isAdded()) {
            ReleaseLogUtil.e("RunningPathListFragment", "onCreateView not finish");
            this.h = true;
            return;
        }
        HotPathCityInfo hotPathCityInfoA = jdn.a();
        String cityId = hotPathCityInfoA != null ? hotPathCityInfoA.getCityId() : "";
        c();
        s();
        jpg jpgVarC = RunningRouteUtils.c(new d(this, SystemClock.elapsedRealtime()));
        if (this.l || jpgVarC == null || Math.abs(jpgVarC.d) <= 1.0E-6d || Math.abs(jpgVarC.f38787a) <= 1.0E-6d) {
            return;
        }
        this.l = true;
        gdk gdkVarA = new gdk.d().d(jpgVarC.d).c(jpgVarC.f38787a).b(cityId).f(this.q.c()).i(this.q.a()).e(this.q.h()).b(this.q.e()).c(1).a();
        gdkVarA.i(this.t);
        a(jpgVarC, gdkVarA);
        this.h = false;
    }

    private void u() {
        RouteAttributeAdapter routeAttributeAdapter = this.aa;
        if (routeAttributeAdapter != null) {
            this.u.put(Integer.valueOf(R.id.spinner_pathType), Integer.valueOf(routeAttributeAdapter.a(this.q.a())));
        }
        RouteAttributeAdapter routeAttributeAdapter2 = this.g;
        if (routeAttributeAdapter2 != null) {
            this.u.put(Integer.valueOf(R.id.spinner_distance), Integer.valueOf(routeAttributeAdapter2.a(this.q.e())));
        }
        RouteAttributeAdapter routeAttributeAdapter3 = this.w;
        if (routeAttributeAdapter3 != null) {
            this.u.put(Integer.valueOf(R.id.spinner_sortType), Integer.valueOf(routeAttributeAdapter3.a(this.q.c())));
        }
        RouteAttributeAdapter routeAttributeAdapter4 = this.y;
        if (routeAttributeAdapter4 != null) {
            this.u.put(Integer.valueOf(R.id.spinner_pathTheme), Integer.valueOf(routeAttributeAdapter4.a(this.q.h())));
        }
    }

    private void g() {
        HealthSpinner healthSpinner = this.x;
        if (healthSpinner != null) {
            healthSpinner.setVisibility(8);
        }
        HealthSpinner healthSpinner2 = this.ad;
        if (healthSpinner2 != null) {
            healthSpinner2.setVisibility(8);
        }
        HealthSpinner healthSpinner3 = this.f;
        if (healthSpinner3 != null) {
            healthSpinner3.setVisibility(8);
        }
        HealthSpinner healthSpinner4 = this.v;
        if (healthSpinner4 != null) {
            healthSpinner4.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        qsp.c((View) this.f11065b, 0);
        qsp.a(this.e, qre.c(R.drawable.pic_no_line_available));
        qsp.e(this.i, R.string.IDS_track_runing_route_city_not_support);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        qsp.c((View) this.f11065b, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("RunningPathListFragment", "refreshFilter");
        if (this.f11064a == null) {
            return;
        }
        c();
        s();
        f();
    }

    static class d implements GolfGetLocation.GetLocationCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<RunningRouteListFragment> f11070b;
        private final long d;

        d(RunningRouteListFragment runningRouteListFragment, long j) {
            this.f11070b = new WeakReference<>(runningRouteListFragment);
            this.d = j;
        }

        @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
        public void onSuccess(jpg jpgVar) {
            RunningRouteListFragment runningRouteListFragment = this.f11070b.get();
            if (runningRouteListFragment == null || !runningRouteListFragment.isAdded()) {
                LogUtil.a("RunningPathListFragment", "get location onSuccess fragment == null");
            } else {
                if (runningRouteListFragment.l) {
                    return;
                }
                RunningRouteUtils.e(1002, SystemClock.elapsedRealtime() - this.d);
                runningRouteListFragment.l = true;
                runningRouteListFragment.a(jpgVar, runningRouteListFragment.j);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
        public void onFailure(int i, String str) {
            LogUtil.a("RunningPathListFragment", "get location fail, errCode: ", Integer.valueOf(i), ", errMsg: ", str);
        }
    }

    public void c() {
        this.l = false;
        this.f11066c = 1;
        this.m = 1;
        gdk gdkVar = this.j;
        if (gdkVar != null) {
            gdkVar.c(1);
        }
        LoadMoreRecyclerViewAdapter loadMoreRecyclerViewAdapter = this.f11064a;
        if (loadMoreRecyclerViewAdapter != null) {
            loadMoreRecyclerViewAdapter.clear();
            this.f11064a.noMoreLoad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(jpg jpgVar, gdk gdkVar) {
        if (jpgVar != null) {
            LogUtil.a("RunningPathListFragment", "get location success");
            this.j.b(jpgVar.d);
            this.j.c(jpgVar.f38787a);
        }
        this.j.d(gdkVar.e());
        this.j.f(gdkVar.g());
        this.j.g(gdkVar.f());
        this.j.e(gdkVar.a());
        this.j.e(gdkVar.c());
        this.j.a(gdkVar.d());
        this.j.d(gdkVar.i());
        this.j.c(this.f11066c);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        if (R.id.spinner_pathTheme == i) {
            this.j.d(i2);
            this.q.d(i2);
            return;
        }
        if (R.id.spinner_distance == i) {
            this.j.e(i2);
            this.q.a(i2);
        } else if (R.id.spinner_pathType == i) {
            this.j.g(i2);
            this.q.e(i2);
        } else if (R.id.spinner_sortType == i) {
            this.j.f(i2);
            this.q.b(i2);
        } else {
            ReleaseLogUtil.a("RunningPathListFragment", "refreshFilterParam with error spinner");
        }
    }

    public void e(gcm gcmVar) {
        q();
        if (gcmVar == null) {
            return;
        }
        a(gcmVar.b(), R.id.spinner_pathType);
        if (!UnitUtil.f()) {
            a(gcmVar.c(), R.id.spinner_distance);
        }
        a(gcmVar.e(), R.id.spinner_pathTheme);
    }

    private void a(List<gdp> list, int i) {
        if (njy.e(list)) {
            return;
        }
        list.sort(Comparator.comparingInt(new jcs()));
        d(list, i);
    }

    private void q() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new gdp(qre.f(R.string.IDS_track_runing_route_distance), 1));
        arrayList.add(new gdp(qre.f(R.string.IDS_track_runing_route_hot), 4));
        d(arrayList, R.id.spinner_sortType);
    }

    private void f() {
        final boolean zH = this.j.h();
        LogUtil.a("RunningPathListFragment", "getHotPathsData", Boolean.valueOf(zH));
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        gch.b().getHotPaths(this.j, new UiCallback<gdj>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdj gdjVar) {
                if (!RunningRouteListFragment.this.isAdded()) {
                    ReleaseLogUtil.e("RunningPathListFragment", "fragment not add");
                    return;
                }
                RunningRouteUtils.e(1003, SystemClock.elapsedRealtime() - jElapsedRealtime);
                RunningRouteListFragment.this.k();
                List<gdr> listC = gdjVar.c();
                if (RunningRouteListFragment.this.r != null && RunningRouteListFragment.this.getUserVisibleHint()) {
                    RunningRouteListFragment.this.r.onSuccess(gdjVar);
                }
                if (zH) {
                    RunningRouteListFragment.this.q.b(gdjVar.e());
                }
                RunningRouteListFragment runningRouteListFragment = RunningRouteListFragment.this;
                runningRouteListFragment.e(runningRouteListFragment.q.b());
                RunningRouteListFragment.this.e(listC, gdjVar.d());
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                if (!RunningRouteListFragment.this.isAdded()) {
                    ReleaseLogUtil.e("RunningPathListFragment", "fragment not add");
                    return;
                }
                LogUtil.c("RunningPathListFragment", "getHotPaths errorCode ", Integer.valueOf(i), " , errorInfo", str);
                if (RunningRouteListFragment.this.f11066c == 1 && RunningRouteListFragment.this.r != null && RunningRouteListFragment.this.getUserVisibleHint()) {
                    RunningRouteListFragment.this.r.onError(i, str);
                }
                RunningRouteListFragment.this.j();
                if (zH) {
                    RunningRouteListFragment.this.p();
                    return;
                }
                RunningRouteListFragment.this.k();
                RunningRouteListFragment runningRouteListFragment = RunningRouteListFragment.this;
                runningRouteListFragment.e(runningRouteListFragment.q.b());
            }
        });
    }

    public void d(HotPathListCallBack hotPathListCallBack) {
        this.r = hotPathListCallBack;
    }

    public void e(int i) {
        this.t = i;
        this.q.c(i);
    }

    public jct b() {
        return this.q;
    }

    public void c(jct jctVar) {
        if (jctVar != null) {
            this.q = jctVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("RunningPathListFragment", "onActivityResult");
        if (intent == null) {
            LogUtil.a("RunningPathListFragment", "Intent is null");
            return;
        }
        this.ac = RunningRouteUtils.a();
        if (intent.getBooleanExtra("IS_CITY_CHANGE", false)) {
            ReleaseLogUtil.d("RunningPathListFragment", "city is change, init param");
            c(new jct(this.t));
            g();
            k();
        }
        Serializable serializableExtra = intent.getSerializableExtra("ROUTE_INFO");
        if (serializableExtra instanceof jct) {
            jct jctVar = (jct) serializableExtra;
            if (jctVar.d() == this.t) {
                c(jctVar);
            }
        }
        a();
    }
}
