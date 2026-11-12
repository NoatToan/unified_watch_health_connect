package com.huawei.ui.main.stories.route.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.route.CpInfo;
import com.huawei.route.GetRouteDetailRsp;
import com.huawei.route.Manger.MyRouteInfoManager;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.route.Point;
import com.huawei.route.RouteTrackInfo;
import com.huawei.route.SceneType;
import com.huawei.route.utils.RouteSourceUtils;
import com.huawei.thirdpartservice.OauthStatusCallback;
import com.huawei.thirdpartservice.komootapi.KomootProviderApi;
import com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.swiperefreshlayout.HealthSwipeRefreshLayout;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.route.activity.MyRouteActivity;
import com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout;
import defpackage.ecu;
import defpackage.gcn;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.xjz;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class MyRouteActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28766b;
    private long d;
    private LoadMoreRecyclerViewAdapter<RouteData> e;
    private HealthSwipeRefreshLayout f;
    private RelativeLayout k;
    private LinkedHashMap<Long, d> l;
    private Iterator<Map.Entry<Long, d>> m;
    private RelativeLayout n;
    private CustomViewDialog o;
    private CustomTitleBar p;
    private HealthRecycleView s;
    private HealthToolBar v;
    private int w;
    private int y;
    private final List<Long> q = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Long, Bitmap> f28767c = new HashMap();
    private boolean j = false;
    private boolean h = false;
    private boolean g = false;
    private final Handler i = new e();
    private final List<RouteData> t = new ArrayList();
    private final List<RouteData> r = new ArrayList();

    static /* synthetic */ int k(MyRouteActivity myRouteActivity) {
        int i = myRouteActivity.f28766b;
        myRouteActivity.f28766b = i + 1;
        return i;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d("Track_MyRouteActivity", "onCreate");
        setContentView(R.layout.hw_show_user_route_activity);
        overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
        n();
        d(false);
        e();
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra(RouteDataStorageManager.IS_ADD_NEW_ROUTE, false)) {
            ReleaseLogUtil.d("Track_MyRouteActivity", "autoSendRouteToDevice IS_ADD_NEW_ROUTE false");
            return;
        }
        ReleaseLogUtil.d("Track_MyRouteActivity", "auto routeToDevice start.");
        RouteTransferDataHolder routeTransferDataHolder = new RouteTransferDataHolder(this);
        List<RouteData> routeDataList = RouteDataStorageManager.getRouteDataList();
        if (njy.e(routeDataList)) {
            routeTransferDataHolder.a(getString(R.string.IDS_track_rt_save_sus_and_send_fail), true);
            return;
        }
        routeTransferDataHolder.b(true);
        int size = routeDataList.size();
        if (size == 1) {
            RouteData routeData = routeDataList.get(0);
            routeTransferDataHolder.d(routeData.getRouteName(), routeData);
            routeTransferDataHolder.q();
        } else {
            this.f28766b = 0;
            routeTransferDataHolder.a(routeDataList);
            c(routeTransferDataHolder, new LinkedList(routeTransferDataHolder.o()), ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_MyRouteActivity"));
            ReleaseLogUtil.d("Track_MyRouteActivity", "autoSendSize = ", Integer.valueOf(size));
        }
        RouteDataStorageManager.clearRouteData();
        intent.putExtra(RouteDataStorageManager.IS_ADD_NEW_ROUTE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i, final RouteTransferDataHolder routeTransferDataHolder) {
        HandlerExecutor.c(new Runnable() { // from class: wkp
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(i, routeTransferDataHolder);
            }
        });
    }

    public /* synthetic */ void d(int i, RouteTransferDataHolder routeTransferDataHolder) {
        if (this.f28766b == 0) {
            qpx.b(this, getString(R.string.IDS_track_rt_save_sus_and_send_suc));
            return;
        }
        int i2 = R.string.IDS_track_rt_save_sus_and_send_komoot_fail;
        String strE = qre.e(R.plurals.IDS_track_route_unit, i, Integer.valueOf(i));
        int i3 = R.plurals.IDS_track_route_unit;
        int i4 = this.f28766b;
        routeTransferDataHolder.a(qre.a(i2, strE, qre.e(i3, i4, Integer.valueOf(i4))), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final RouteTransferDataHolder routeTransferDataHolder, final Queue<RouteTrackInfo> queue, final DeviceInfo deviceInfo) {
        routeTransferDataHolder.b(queue.poll(), deviceInfo, new RouteTransferDataHolder.SendFileCallback() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity.1
            @Override // com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.SendFileCallback
            public void onSuccess() {
                ReleaseLogUtil.d("Track_MyRouteActivity", "onSuccess holder.getSendIndex() = ", Integer.valueOf(routeTransferDataHolder.n()));
                if (routeTransferDataHolder.p()) {
                    MyRouteActivity.this.c(routeTransferDataHolder.o().size(), routeTransferDataHolder);
                    return;
                }
                RouteTransferDataHolder routeTransferDataHolder2 = routeTransferDataHolder;
                routeTransferDataHolder2.c(routeTransferDataHolder2.n() + 1);
                MyRouteActivity.this.c(routeTransferDataHolder, (Queue<RouteTrackInfo>) queue, deviceInfo);
            }

            @Override // com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.SendFileCallback
            public void onFail() {
                ReleaseLogUtil.d("Track_MyRouteActivity", "onSuccess holder.onFail() = ", Integer.valueOf(routeTransferDataHolder.n()));
                MyRouteActivity.k(MyRouteActivity.this);
                if (routeTransferDataHolder.p()) {
                    MyRouteActivity.this.c(routeTransferDataHolder.o().size(), routeTransferDataHolder);
                    return;
                }
                RouteTransferDataHolder routeTransferDataHolder2 = routeTransferDataHolder;
                routeTransferDataHolder2.c(routeTransferDataHolder2.n() + 1);
                MyRouteActivity.this.c(routeTransferDataHolder, (Queue<RouteTrackInfo>) queue, deviceInfo);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LogUtil.a("Track_MyRouteActivity", "onNewIntent");
        this.n.setVisibility(0);
        this.k.setVisibility(8);
        LoadMoreRecyclerViewAdapter<RouteData> loadMoreRecyclerViewAdapter = this.e;
        if (loadMoreRecyclerViewAdapter != null) {
            loadMoreRecyclerViewAdapter.noMoreLoad();
            this.e.clear();
        }
        d(false);
        e();
    }

    private void n() {
        getWindow().setBackgroundDrawableResource(R.color.colorSubBackground);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.title_bar);
        this.p = customTitleBar;
        customTitleBar.setLeftButtonVisibility(0);
        this.p.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.hwsearchview_ic_public_back), qre.f(R.string.accessibility_go_back));
        this.p.setTitleText(getString(R.string.IDS_hwh_my_route));
        this.k = (RelativeLayout) findViewById(R.id.rel_no_data);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lin_no_data);
        if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, (int) (((double) qrs.m()) * 0.3d), 0, 0);
            linearLayout.setLayoutParams(layoutParams);
        }
        this.n = (RelativeLayout) findViewById(R.id.rel_route_loading);
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = (HealthSwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.f = healthSwipeRefreshLayout;
        healthSwipeRefreshLayout.setPadding(0, 0, 0, 0);
        o();
        m();
        this.v = (HealthToolBar) findViewById(R.id.toolbar_route);
        View viewInflate = View.inflate(this, R.layout.hw_toolbar_bottomview, null);
        this.v.d(viewInflate);
        viewInflate.findViewById(R.id.lin_root_view).setBackgroundColor(ContextCompat.getColor(this, R.color.colorSubBackground));
        b(false, false, 0);
        this.v.setIconEnabled(1, true);
        this.v.setIconEnabled(3, true);
        this.v.setIconVisible(2, 8);
        p();
        i();
    }

    private void p() {
        this.v.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: wkl
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f52141c.c(i);
            }
        });
    }

    public /* synthetic */ void c(int i) {
        if (this.j) {
            LogUtil.a("Track_MyRouteActivity", "don't click to fast");
            return;
        }
        this.v.postDelayed(new Runnable() { // from class: wkq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        }, 500L);
        this.j = true;
        if (i == 1) {
            b(b.f28777a);
            if (this.h) {
                if (!njy.e(this.q)) {
                    d(-1);
                    return;
                } else {
                    qpx.e(this, getString(R.string.IDS_my_route_pls_select_route));
                    return;
                }
            }
            b(true, false, 0);
            this.e.notifyDataSetChanged();
            return;
        }
        if (i != 3) {
            LogUtil.a("Track_MyRouteActivity", "position is not right");
            return;
        }
        b(b.f28778c);
        if (this.h) {
            if (this.g) {
                this.q.clear();
            } else {
                c();
            }
            boolean z = this.g;
            b(true, !z, z ? 0 : this.q.size());
            this.e.notifyDataSetChanged();
            return;
        }
        k();
    }

    public /* synthetic */ void a() {
        this.j = false;
    }

    private void c() {
        for (RouteData routeData : this.e.getData()) {
            if (!this.q.contains(Long.valueOf(routeData.getRouteVersion()))) {
                this.q.add(Long.valueOf(routeData.getRouteVersion()));
            }
        }
    }

    private void i() {
        this.p.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MyRouteActivity.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MyRouteActivity myRouteActivity = MyRouteActivity.this;
                myRouteActivity.y = myRouteActivity.p.getHeight();
            }
        });
        this.v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MyRouteActivity.this.v.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MyRouteActivity myRouteActivity = MyRouteActivity.this;
                myRouteActivity.w = myRouteActivity.v.getHeight();
                MyRouteActivity.this.v.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (!CommonUtil.ab(this)) {
            qrs.e((Context) this, MyRouteActivity.class.getName(), getString(R.string.IDS_hwh_my_route), false);
            finish();
        } else {
            MyRouteInfoManager.queryRouteDetailOrSummary(0, 0L, new a(this, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        HashMap map = new HashMap(1);
        map.put("click", "1");
        map.put("MY_ROUTE_SIZE", Integer.valueOf(i));
        lmf.d().c(this, AnalyticsValue.MY_ROUTE_ACTIVITY_EVENT.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", 2);
        map.put("pageStatus", z ? "true" : "false");
        lmf.d().c(BaseApplication.b(), RouteSourceUtils.RUNNING_ROUTE_ANALYSIS_1040087, map, 0);
    }

    private void b(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.b(), RouteSourceUtils.RUNNING_ROUTE_ANALYSIS_1040088, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, Long l, int i, long j) {
        MyRouteInfoManager.queryRouteDetailOrSummary(1, l.longValue(), new c(this, l, i, j, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Long l) {
        LinkedHashMap<Long, d> linkedHashMap = this.l;
        if (linkedHashMap == null) {
            LogUtil.a("mNextOperationLinkedHashMap is empty", new Object[0]);
            return;
        }
        Iterator<Map.Entry<Long, d>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (l.equals(it.next().getKey())) {
                this.f28765a = l.longValue();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(GetRouteDetailRsp getRouteDetailRsp) {
        if (njy.e(this.r)) {
            return;
        }
        getRouteDetailRsp.getRouteDatas().addAll(0, this.r);
        this.r.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<Long, d> e(Long[] lArr) {
        int length = lArr.length;
        if (length == 0) {
            return new LinkedHashMap<>();
        }
        int i = length % 6;
        int i2 = length / 6;
        if (i != 0) {
            i2++;
        }
        LinkedHashMap<Long, d> linkedHashMap = new LinkedHashMap<>();
        int i3 = 0;
        while (true) {
            if (i3 >= i2 - 1) {
                break;
            }
            if (i != 0) {
                int i4 = (length - (i3 * 6)) - i;
                linkedHashMap.put(lArr[i4 - 1], new d(i3 == 0 ? i : 6, lArr[i4 + 3 > length ? 0 : i4 + 2].longValue()));
            } else {
                int i5 = length - ((i3 + 1) * 6);
                linkedHashMap.put(lArr[i5 - 1], new d(6, lArr[i5 + 2].longValue()));
            }
            i3++;
        }
        if (length >= 6) {
            i = 6;
        }
        linkedHashMap.put(0L, new d(i, length > 2 ? lArr[2].longValue() : 0L));
        return linkedHashMap;
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28782c;
        long d;

        d(int i, long j) {
            this.f28782c = i;
            this.d = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final long j) {
        runOnUiThread(new Runnable() { // from class: wkr
            @Override // java.lang.Runnable
            public final void run() {
                this.f52144b.a(j);
            }
        });
    }

    public /* synthetic */ void a(long j) {
        if (isFinishing()) {
            return;
        }
        if (j == 0) {
            t();
        } else {
            this.e.loadError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        if (this.f28765a == this.d) {
            if (message.obj != null) {
                if (message.obj instanceof GetRouteDetailRsp) {
                    d(message, (GetRouteDetailRsp) message.obj);
                    return;
                }
                return;
            }
            t();
            return;
        }
        if (message.obj != null) {
            if (message.obj instanceof GetRouteDetailRsp) {
                GetRouteDetailRsp getRouteDetailRsp = (GetRouteDetailRsp) message.obj;
                if (!njy.e(getRouteDetailRsp.getRouteDatas())) {
                    LogUtil.a("Track_MyRouteActivity", "load more success,", ",data size = " + getRouteDetailRsp.getRouteDatas().size());
                    b(this.h, false, this.q.size());
                    e(false, true, getRouteDetailRsp.getRouteDatas());
                    return;
                }
                l();
                return;
            }
            return;
        }
        l();
        this.e.loadError();
    }

    private void d(Message message, GetRouteDetailRsp getRouteDetailRsp) {
        if (!njy.e(getRouteDetailRsp.getRouteDatas())) {
            LogUtil.a("Track_MyRouteActivity", "refresh,", "data size = " + getRouteDetailRsp.getRouteDatas().size());
            e(message.arg1 == 1, false, getRouteDetailRsp.getRouteDatas());
            return;
        }
        t();
    }

    public static /* synthetic */ int c(RouteData routeData, RouteData routeData2) {
        return -Long.compare(routeData.getRouteVersion(), routeData2.getRouteVersion());
    }

    private void e(boolean z, boolean z2, List<RouteData> list) {
        Iterator<Map.Entry<Long, d>> it;
        Collections.sort(list, new Comparator() { // from class: wkh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MyRouteActivity.c((RouteData) obj, (RouteData) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        if (!njy.e(this.t)) {
            arrayList.addAll(this.t);
        } else if (!njy.e(this.e.getData()) && z2) {
            arrayList.addAll(this.e.getData());
        } else {
            LogUtil.a("Track_MyRouteActivity", "mTempRouteDataList and mAdapter.getData() is both empty");
        }
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList(new LinkedHashSet(arrayList));
        if ((((qrs.m() - qrs.s(this)) - this.y) - this.w) - ((getResources().getDimensionPixelOffset(R.dimen.health_common_116dp) * arrayList2.size()) + getResources().getDimensionPixelOffset(R.dimen.health_common_8dp)) > 0 && (it = this.m) != null && it.hasNext()) {
            this.s.setVisibility(z ? 0 : 8);
            this.t.addAll(list);
            Map.Entry<Long, d> next = this.m.next();
            LogUtil.a("Track_MyRouteActivity", "Data can't fill all screen,request next page");
            c(false, next.getKey(), next.getValue().f28782c, next.getValue().d);
            return;
        }
        this.e.notifyDataChange(arrayList2, true);
        this.t.clear();
        l();
    }

    private void l() {
        this.s.setVisibility(0);
        this.v.setVisibility(0);
        this.k.setVisibility(8);
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = this.f;
        if (healthSwipeRefreshLayout != null) {
            healthSwipeRefreshLayout.a();
        }
        this.n.setVisibility(8);
        Iterator<Map.Entry<Long, d>> it = this.m;
        if (it != null && it.hasNext()) {
            this.e.enableMoreLoad();
        } else {
            this.e.noMoreLoad();
        }
    }

    private void m() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.rv_route);
        this.s = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this));
        LoadMoreRecyclerViewAdapter<RouteData> loadMoreRecyclerViewAdapter = new LoadMoreRecyclerViewAdapter<RouteData>(new ArrayList(), this.s, R.layout.item_route_data) { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity.3
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, RouteData routeData) {
                MyRouteActivity.this.b(recyclerHolder, i, routeData);
                MyRouteActivity.this.c(recyclerHolder, routeData);
            }
        };
        this.e = loadMoreRecyclerViewAdapter;
        loadMoreRecyclerViewAdapter.setOnItemClickListener(new LoadMoreRecyclerViewAdapter.OnItemClickListener<RouteData>() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity.4
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.OnItemClickListener
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, RouteData routeData) {
                if (!qrs.c(500)) {
                    if (MyRouteActivity.this.h) {
                        return;
                    }
                    RouteDataStorageManager.setRouteData(routeData);
                    Intent intent = new Intent();
                    intent.setClassName(BaseApplication.d(), "com.huawei.ui.main.stories.route.activity.MyRouteDetailActivity");
                    intent.putExtra("fromFlag", "route_flag");
                    intent.putExtra("delete_position", i);
                    MyRouteActivity.this.startActivityForResult(intent, 200);
                    return;
                }
                LogUtil.j("Track_MyRouteActivity", "view click too fast.");
            }
        });
        this.e.setOnMoreListener(new LoadMoreRecyclerViewAdapter.OnMoreListener() { // from class: wkf
            @Override // com.huawei.ui.commonui.adapter.LoadMoreRecyclerViewAdapter.OnMoreListener
            public final void onLoadingMore() {
                this.d.b();
            }
        });
        this.e.setDefaultPageSize(3);
        this.s.setAdapter(this.e);
    }

    public /* synthetic */ void b() {
        Iterator<Map.Entry<Long, d>> it = this.m;
        if (it == null || !it.hasNext()) {
            return;
        }
        Map.Entry<Long, d> next = this.m.next();
        c(false, next.getKey(), next.getValue().f28782c, next.getValue().d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(RecyclerHolder recyclerHolder, RouteData routeData) {
        LinearLayout linearLayout = (LinearLayout) recyclerHolder.itemView.findViewById(R.id.labelList);
        linearLayout.removeAllViews();
        String strE = e(routeData.getSceneType());
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        linearLayout.addView(e(strE));
    }

    private String e(int i) {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(SceneType.OTHER.sceneType()), Integer.valueOf(R.string.IDS_route_type_other));
        map.put(Integer.valueOf(SceneType.WR.sceneType()), Integer.valueOf(R.string.IDS_route_walk_run));
        map.put(Integer.valueOf(SceneType.BIKE.sceneType()), Integer.valueOf(R.string.IDS_route_type_bike));
        map.put(Integer.valueOf(SceneType.EXP.sceneType()), Integer.valueOf(R.string.IDS_route_type_exp));
        if (map.get(Integer.valueOf(i)) != null) {
            return getString(((Integer) map.get(Integer.valueOf(i))).intValue());
        }
        return "";
    }

    private View e(String str) {
        TextView textView = (TextView) LayoutInflater.from(this).inflate(com.huawei.healthcloud.plugintrack.R.layout.list_item_running_route_label, (ViewGroup) null).findViewById(com.huawei.healthcloud.plugintrack.R.id.text1);
        qsp.b(textView, str);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(RecyclerHolder recyclerHolder, final int i, final RouteData routeData) {
        a(recyclerHolder, i);
        d(recyclerHolder, routeData);
        CheckBox checkBox = (CheckBox) recyclerHolder.d(R.id.ck_select);
        checkBox.setVisibility(this.h ? 0 : 8);
        if (!njy.e(this.q)) {
            checkBox.setChecked(this.q.contains(Long.valueOf(routeData.getRouteVersion())));
        } else {
            checkBox.setChecked(false);
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity$$ExternalSyntheticLambda6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.d.c(routeData, compoundButton, z);
            }
        });
        ((HealthTextView) recyclerHolder.d(R.id.tv_route_name)).setText(routeData.getRouteName());
        ImageView imageView = (ImageView) recyclerHolder.d(R.id.img_thumb);
        if (qqs.e(this)) {
            imageView.setBackgroundResource(R.drawable.route_map_bg_dark);
        } else {
            imageView.setBackgroundResource(R.drawable.route_map_bg_normal);
        }
        e(imageView, routeData.getRoutePoints(), routeData.getRouteVersion(), routeData.getRouteType());
        ((HealthTextView) recyclerHolder.d(R.id.tv_route_distance)).setText(d(new BigDecimal(Double.toString(routeData.getRouteDistance())).divide(new BigDecimal(Double.toString(1000.0d)), 2, 4).doubleValue()));
        recyclerHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: wkw
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f52147c.a(i, view);
            }
        });
    }

    /* synthetic */ void c(RouteData routeData, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                if (!this.q.contains(Long.valueOf(routeData.getRouteVersion()))) {
                    this.q.add(Long.valueOf(routeData.getRouteVersion()));
                }
            } else {
                this.q.remove(Long.valueOf(routeData.getRouteVersion()));
            }
            if (this.h) {
                boolean z2 = this.q.size() == this.e.getData().size();
                this.g = z2;
                b(true, z2, this.q.size());
            }
        }
    }

    public /* synthetic */ boolean a(int i, View view) {
        if (this.h) {
            return false;
        }
        d(i);
        return true;
    }

    private void a(RecyclerHolder recyclerHolder, int i) {
        ViewGroup.LayoutParams layoutParams = recyclerHolder.d(R.id.root_view).getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (i == 0) {
                layoutParams2.topMargin = getResources().getDimensionPixelOffset(R.dimen.elementsMarginVerticalM);
            } else {
                layoutParams2.topMargin = 0;
            }
            recyclerHolder.d(R.id.root_view).setLayoutParams(layoutParams2);
        }
    }

    private void e(final ImageView imageView, List<Point> list, final long j, int i) {
        if (this.f28767c.containsKey(Long.valueOf(j))) {
            imageView.setImageBitmap(this.f28767c.get(Long.valueOf(j)));
            return;
        }
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Point point = list.get(i2);
            if (!xjz.b(point.getLatitude(), point.getLongitude())) {
                CpInfo cpInfo = point.getCpInfo();
                if (!xjz.c(i, cpInfo) && !xjz.d(arrayList2, i, cpInfo, point)) {
                    arrayList2.add(point);
                    treeMap.put(Long.valueOf(i2), new double[]{point.getLatitude(), point.getLongitude()});
                }
            }
        }
        arrayList.add(treeMap);
        gcn.c().getTrackDraw(arrayList, new IBaseResponseCallback() { // from class: wke
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.f52136b.d(j, imageView, i3, obj);
            }
        });
    }

    public /* synthetic */ void d(long j, ImageView imageView, int i, Object obj) {
        if (obj instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) obj;
            this.f28767c.put(Long.valueOf(j), bitmap);
            imageView.setImageBitmap(bitmap);
        }
    }

    private String d(double d2) {
        if (UnitUtil.f()) {
            return getResources().getQuantityString(R.plurals.IDS_distance_mi, (int) d2, UnitUtil.e(UnitUtil.e(d2, 3), 1, 2));
        }
        return getResources().getQuantityString(R.plurals.IDS_distance_km, (int) d2, UnitUtil.e(d2, 1, 2));
    }

    private void d(RecyclerHolder recyclerHolder, RouteData routeData) {
        String string;
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.tv_route_source);
        int type = routeData.getType();
        if (type == 1) {
            string = getString(R.string.IDS_my_route_import_local);
        } else if (type == 2) {
            string = getString(R.string.IDS_my_route_import_motion);
        } else if (type == 3) {
            string = getString(R.string.IDS_my_route_import_form_komoot);
        } else {
            string = "";
        }
        healthTextView.setText(string);
    }

    private void o() {
        this.f.setCallback(new HwSwipeRefreshLayout.Callback() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity.9
            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean needToWait() {
                return true;
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onScrollUp() {
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean isEnabled() {
                return !MyRouteActivity.this.h;
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onRefreshStart() {
                LogUtil.a("Track_MyRouteActivity", "PullRefresh start");
                MyRouteActivity.this.d(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.n.setVisibility(8);
        this.v.setVisibility(8);
        this.k.setVisibility(0);
        this.q.clear();
        this.f28767c.clear();
        this.e.clear();
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = this.f;
        if (healthSwipeRefreshLayout != null) {
            healthSwipeRefreshLayout.a();
        }
        HealthButton healthButton = (HealthButton) findViewById(R.id.button_import_route);
        if (healthButton != null) {
            float fA = new HealthColumnSystem(this, 1).a(2);
            LogUtil.a("Track_MyRouteActivity", "set button width");
            healthButton.setMinWidth((int) fA);
            healthButton.setVisibility(0);
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: wkd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52135a.d(view);
                }
            });
        }
    }

    public /* synthetic */ void d(View view) {
        b(b.d);
        k();
    }

    private void d(final int i) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_confirm_delete_route, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.a(getString(R.string.IDS_hwh_my_route)).b(viewInflate, 0, 0).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: wks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_MyRouteActivity", "createRouteDialog onClick Negative view");
            }
        }).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: wkt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52145c.d(i, view);
            }
        });
        builder.d().show();
    }

    public /* synthetic */ void d(int i, View view) {
        LogUtil.a("Track_MyRouteActivity", "createRouteDialog onClick positive view");
        if (this.j) {
            LogUtil.a("Track_MyRouteActivity", "don't click to fast");
            return;
        }
        this.v.postDelayed(new Runnable() { // from class: wkn
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        }, 500L);
        this.j = true;
        if (!CommonUtil.ab(this)) {
            qpx.e(this, com.huawei.health.servicesui.R.string.IDS_hw_show_set_about_privacy_connectting_error);
            return;
        }
        List<Long> arrayList = new ArrayList<>();
        if (i == -1) {
            arrayList = this.q;
        } else {
            LoadMoreRecyclerViewAdapter<RouteData> loadMoreRecyclerViewAdapter = this.e;
            if (loadMoreRecyclerViewAdapter != null) {
                arrayList.add(Long.valueOf(loadMoreRecyclerViewAdapter.get(i).getRouteVersion()));
            } else {
                LogUtil.a("Track_MyRouteActivity", "mAdapter is empty");
            }
        }
        d(i, arrayList);
    }

    public /* synthetic */ void d() {
        this.j = false;
    }

    private void d(final int i, List<Long> list) {
        MyRouteInfoManager.deleteRoutes(list, new RouteResultCallBack<CloudCommonReponse>() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteActivity.8
            @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                if (cloudCommonReponse.getResultCode().intValue() == 0) {
                    LogUtil.a("Track_MyRouteActivity", "delete success");
                    Message messageObtainMessage = MyRouteActivity.this.i.obtainMessage();
                    messageObtainMessage.what = 2;
                    messageObtainMessage.obj = Integer.valueOf(i);
                    MyRouteActivity.this.i.sendMessage(messageObtainMessage);
                    return;
                }
                qpx.b(MyRouteActivity.this, R.string.IDS_watchface_delete_failed);
                LogUtil.d("Track_MyRouteActivity", "delete resp resultCode:", cloudCommonReponse.getResultCode(), ",resp resultDesc:", cloudCommonReponse.getResultDesc());
            }

            @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
            public void onFailure(Throwable th) {
                qpx.b(MyRouteActivity.this, R.string.IDS_watchface_delete_failed);
                LogUtil.e("Track_MyRouteActivity", "delete onFailure:", th.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, boolean z2, int i) {
        String string;
        this.h = z;
        this.g = z2;
        this.v.setIconTitle(1, getString(R.string.hiad_calender_delete));
        this.v.setIcon(1, R.drawable.measure_weight_data_delete);
        if (this.h) {
            this.v.setIcon(3, z2 ? R.drawable.all_check : R.drawable.ic_public_select_all);
            this.v.setIconTitle(3, z2 ? getString(R.string.IDS_my_route_cancel_select_all) : getString(R.string.IDS_my_route_select_all));
            this.p.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.hwappbarpattern_cancel), qre.f(R.string.accessibility_close));
            CustomTitleBar customTitleBar = this.p;
            if (i > 0) {
                string = getResources().getQuantityString(R.plurals.IDS_my_route_select_count, i, Integer.valueOf(i));
            } else {
                string = getString(R.string.IDS_my_route_selectNone);
            }
            customTitleBar.setTitleText(string);
            this.p.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: wkj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(view);
                }
            });
            return;
        }
        this.v.setIcon(3, R.drawable.ic_import);
        this.v.setIconTitle(3, getString(R.string.IDS_hwh_my_route_import_line));
        this.p.setTitleText(getString(R.string.IDS_hwh_my_route));
        this.p.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.hwsearchview_ic_public_back), qre.f(R.string.accessibility_go_back));
        this.p.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: wko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52142b.e(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        j();
    }

    public /* synthetic */ void e(View view) {
        finish();
    }

    private void j() {
        this.p.setLeftButtonDrawable(ContextCompat.getDrawable(this, R.drawable.hwsearchview_ic_public_back), qre.f(R.string.accessibility_go_back));
        this.p.setTitleText(getString(R.string.IDS_hwh_my_route));
        this.q.clear();
        this.e.notifyDataSetChanged();
        b(false, false, 0);
    }

    private void f() {
        if (EnvironmentInfo.m() && CommonUtil.ca()) {
            return;
        }
        PermissionUtil.d(this, PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE, new h(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class h extends CustomPermissionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<MyRouteActivity> f28783a;

        public h(MyRouteActivity myRouteActivity) {
            super(myRouteActivity);
            this.f28783a = new WeakReference<>(myRouteActivity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            MyRouteActivity myRouteActivity = this.f28783a.get();
            if (myRouteActivity != null) {
                myRouteActivity.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/gpx+xml", "application/vnd.garmin.tcx+xml", "application/vnd.google-earth.kml+xml", FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM});
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_MyRouteActivity", "openSystemFileManager, ActivityNotFoundException");
            qpx.e(this, getString(R.string.IDS_watchface_open_filemanager_fail));
        } catch (AndroidRuntimeException e2) {
            e = e2;
            LogUtil.e("Track_MyRouteActivity", "Permission denied: " + LogAnonymous.b(e));
        } catch (SecurityException e3) {
            e = e3;
            LogUtil.e("Track_MyRouteActivity", "Permission denied: " + LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = this.f;
        if (healthSwipeRefreshLayout != null) {
            healthSwipeRefreshLayout.setCallback(null);
            this.f = null;
        }
        RouteDataStorageManager.clearRouteData();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        int intExtra;
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Track_MyRouteActivity", "onActivityResult requestCode = ", Integer.valueOf(i), " resultCode = ", Integer.valueOf(i2));
        if (i == 100) {
            d(i2, intent);
        } else if (i == 201) {
            d(true);
            if (i2 == -1) {
                getIntent().putExtra(RouteDataStorageManager.IS_ADD_NEW_ROUTE, true);
                e();
            }
        } else if (i != 200) {
            LogUtil.a("Track_MyRouteActivity", "unknown resultCode");
        } else if (i2 == -1 && intent != null && (intExtra = intent.getIntExtra("delete_position", -1)) > -1) {
            Message messageObtainMessage = this.i.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.obj = Integer.valueOf(intExtra);
            this.i.sendMessage(messageObtainMessage);
        }
        CustomViewDialog customViewDialog = this.o;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    private void d(int i, Intent intent) throws Throwable {
        if (i != -1) {
            LogUtil.a("Track_MyRouteActivity", "no select route file");
            return;
        }
        if (intent == null) {
            LogUtil.j("Track_MyRouteActivity", "handleRouteFile, intent is null.");
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            LogUtil.a("Track_MyRouteActivity", "uri is null");
            return;
        }
        LogUtil.d("Track_MyRouteActivity", "File uri is: ", data.toString());
        String trackFileName = "";
        try {
            Cursor cursorQuery = getContentResolver().query(data, null, null, null, null);
            try {
                trackFileName = RouteSourceUtils.getTrackFileName(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SecurityException unused) {
            LogUtil.e("Track_MyRouteActivity", "query file address, catch securityException");
        }
        if (TextUtils.isEmpty(trackFileName) || (!trackFileName.endsWith("gpx") && !trackFileName.endsWith(NavigationFileParser.TCX) && !trackFileName.endsWith(NavigationFileParser.KML) && !trackFileName.endsWith(NavigationFileParser.KMZ) && !trackFileName.endsWith(NavigationFileParser.BIN))) {
            LogUtil.e("Track_MyRouteActivity", "handleRouteFile is error fileName : ", trackFileName);
            Toast.makeText(this, R.string.IDS_my_route_incorrect_file, 0).show();
        } else {
            AppRouter.c("/Main/MyRouteDetailActivity").c("fromFlag", "file_flag").c("filePath", RouteSourceUtils.parseFileCopyToRoutePath(data, trackFileName)).b(this);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0 && this.h) {
            j();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e extends BaseHandler<MyRouteActivity> {
        private e(MyRouteActivity myRouteActivity) {
            super(myRouteActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MyRouteActivity myRouteActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                myRouteActivity.e(message);
                return;
            }
            if (i != 2) {
                return;
            }
            int iIntValue = ((Integer) message.obj).intValue();
            if (iIntValue == -1) {
                int i2 = 0;
                while (i2 < myRouteActivity.e.getData().size()) {
                    RouteData routeData = (RouteData) myRouteActivity.e.get(i2);
                    Iterator it = myRouteActivity.q.iterator();
                    while (it.hasNext()) {
                        if (routeData.getRouteVersion() == ((Long) it.next()).longValue()) {
                            myRouteActivity.e.remove(i2);
                            i2--;
                        }
                    }
                    i2++;
                }
                myRouteActivity.q.clear();
            } else {
                myRouteActivity.q.remove(Long.valueOf(((RouteData) myRouteActivity.e.get(iIntValue)).getRouteVersion()));
                myRouteActivity.e.remove(iIntValue);
            }
            qpx.b(myRouteActivity, R.string.IDS_device_wifi_clear_user_success);
            if (myRouteActivity.e.getData().isEmpty()) {
                myRouteActivity.t();
            }
            myRouteActivity.b(false, false, 0);
            myRouteActivity.e.notifyDataSetChanged();
            if (myRouteActivity.getResources().getDimensionPixelOffset(R.dimen.health_common_116dp) * myRouteActivity.e.size() >= myRouteActivity.s.getHeight() || myRouteActivity.m == null || !myRouteActivity.m.hasNext()) {
                return;
            }
            LogUtil.a("Track_MyRouteActivity", "first page show complete, load next page");
            Map.Entry entry = (Map.Entry) myRouteActivity.m.next();
            myRouteActivity.c(false, (Long) entry.getKey(), ((d) entry.getValue()).f28782c, ((d) entry.getValue()).d);
        }
    }

    private void k() {
        if (!Utils.f() || !String.valueOf(7).equals(LoginInit.getInstance(this).getAccountInfo(1009))) {
            f();
        } else {
            r();
        }
    }

    private void r() {
        if (this.o == null) {
            if (!(getSystemService("layout_inflater") instanceof LayoutInflater)) {
                return;
            }
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.dialog_route_import_select, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.htv_local_import);
            CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this).b(false).d(viewInflate).d(R.string.IDS_emergency_cancel, new View.OnClickListener() { // from class: wkm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.c(view);
                }
            }).d();
            this.o = customViewDialogD;
            customViewDialogD.setCancelable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: wkk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52140a.j(view);
                }
            });
            viewInflate.findViewById(R.id.htv_komoot_import).setOnClickListener(new View.OnClickListener() { // from class: wki
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52139a.f(view);
                }
            });
        }
        this.o.show();
    }

    public /* synthetic */ void c(View view) {
        this.o.dismiss();
    }

    public /* synthetic */ void j(View view) {
        if (qrs.r()) {
            return;
        }
        f();
    }

    public /* synthetic */ void f(View view) {
        if (qrs.r()) {
            return;
        }
        final KomootProviderApi komootProviderApi = (KomootProviderApi) Services.b("FeatureDataOpen", KomootProviderApi.class);
        komootProviderApi.isOauth(new OauthStatusCallback() { // from class: wkg
            @Override // com.huawei.thirdpartservice.OauthStatusCallback
            public final void onOauthStatusCallback(boolean z) {
                this.f52138a.b(komootProviderApi, z);
            }
        });
    }

    public /* synthetic */ void b(KomootProviderApi komootProviderApi, boolean z) {
        if (z) {
            Intent intent = new Intent();
            intent.setClassName(this, "com.huawei.featureuserprofile.route.activity.RouteImportActivity");
            intent.putExtra("maxCapacity", h());
            startActivityForResult(intent, 201);
            return;
        }
        komootProviderApi.performOauth(this);
    }

    private int h() {
        LoadMoreRecyclerViewAdapter<RouteData> loadMoreRecyclerViewAdapter = this.e;
        if (loadMoreRecyclerViewAdapter == null || loadMoreRecyclerViewAdapter.size() == 0) {
            return 5;
        }
        return Math.min(50 - this.e.size(), 5);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements RouteResultCallBack<GetRouteDetailRsp> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28776a;
        private final WeakReference<MyRouteActivity> e;

        a(MyRouteActivity myRouteActivity, boolean z) {
            this.e = new WeakReference<>(myRouteActivity);
            this.f28776a = z;
        }

        @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(GetRouteDetailRsp getRouteDetailRsp) {
            MyRouteActivity myRouteActivity = this.e.get();
            if (myRouteActivity == null || myRouteActivity.isFinishing()) {
                LogUtil.j("Track_MyRouteActivity", "queryRouteDetailOrSummary success is finishing");
                return;
            }
            if (getRouteDetailRsp.getResultCode().intValue() == 0) {
                myRouteActivity.m = null;
                myRouteActivity.l = null;
                ArrayList arrayList = new ArrayList();
                Iterator<RouteData> it = getRouteDetailRsp.getRouteDatas().iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(it.next().getRouteVersion()));
                }
                int size = getRouteDetailRsp.getRouteDatas() != null ? getRouteDetailRsp.getRouteDatas().size() : 0;
                myRouteActivity.a(size);
                myRouteActivity.b(size != 0);
                myRouteActivity.l = MyRouteActivity.e((Long[]) arrayList.toArray(new Long[0]));
                if (myRouteActivity.l.size() > 0) {
                    myRouteActivity.m = myRouteActivity.l.entrySet().iterator();
                    Map.Entry entry = (Map.Entry) myRouteActivity.m.next();
                    myRouteActivity.d = ((Long) entry.getKey()).longValue();
                    myRouteActivity.c(this.f28776a, Long.valueOf(myRouteActivity.d), ((d) entry.getValue()).f28782c, ((d) entry.getValue()).d);
                    return;
                }
                LogUtil.a("Track_MyRouteActivity", "mPaginateVersionArray size is zero");
                myRouteActivity.c(0L);
                return;
            }
            LogUtil.a("Track_MyRouteActivity", "get track summary fail ", "resultDesc:", getRouteDetailRsp.getResultDesc());
            myRouteActivity.c(0L);
            myRouteActivity.b(false);
        }

        @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
        public void onFailure(Throwable th) {
            MyRouteActivity myRouteActivity = this.e.get();
            if (myRouteActivity != null && !myRouteActivity.isFinishing()) {
                myRouteActivity.c(0L);
                LogUtil.a("Track_MyRouteActivity", "get track summary onFailure");
            } else {
                LogUtil.j("Track_MyRouteActivity", "queryRouteDetailOrSummary failed is finishing");
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements RouteResultCallBack<GetRouteDetailRsp> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f28780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28781c;
        private long d;
        private final WeakReference<MyRouteActivity> e;

        c(MyRouteActivity myRouteActivity, Long l, int i, long j, boolean z) {
            this.e = new WeakReference<>(myRouteActivity);
            this.f28780b = l;
            this.f28781c = i;
            this.d = j;
            this.f28779a = z;
        }

        @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(GetRouteDetailRsp getRouteDetailRsp) {
            MyRouteActivity myRouteActivity = this.e.get();
            if (myRouteActivity == null || myRouteActivity.isFinishing()) {
                LogUtil.j("Track_MyRouteActivity", "getRouteDetail success is finishing");
                return;
            }
            if (getRouteDetailRsp.getResultCode().intValue() != 0 || njy.e(getRouteDetailRsp.getRouteDatas())) {
                myRouteActivity.c(this.f28780b.longValue());
                LogUtil.d("Track_MyRouteActivity", "query,resp resultCode:", getRouteDetailRsp.getResultCode(), ",resp resultDesc:", getRouteDetailRsp.getResultDesc());
                return;
            }
            myRouteActivity.c(this.f28780b);
            if (this.f28781c == 0 || getRouteDetailRsp.getRouteDatas().size() >= this.f28781c) {
                myRouteActivity.b(getRouteDetailRsp);
                Message messageObtainMessage = myRouteActivity.i.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = getRouteDetailRsp;
                messageObtainMessage.arg1 = this.f28779a ? 1 : 0;
                myRouteActivity.i.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.a("Track_MyRouteActivity", "size:", Integer.valueOf(getRouteDetailRsp.getRouteDatas().size()), ",times:", Integer.valueOf(this.f28781c), " request continue");
            myRouteActivity.r.addAll(getRouteDetailRsp.getRouteDatas());
            myRouteActivity.c(this.f28779a, Long.valueOf(this.d), 0, 0L);
        }

        @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
        public void onFailure(Throwable th) {
            MyRouteActivity myRouteActivity = this.e.get();
            if (myRouteActivity != null && !myRouteActivity.isFinishing()) {
                myRouteActivity.c(this.f28780b.longValue());
                LogUtil.e("Track_MyRouteActivity", "queryRouteDetail onFailure:", th.getMessage());
            } else {
                LogUtil.j("Track_MyRouteActivity", "getRouteDetail failed is finishing");
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f28777a = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f28778c = 1;
        private static int d = 2;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
