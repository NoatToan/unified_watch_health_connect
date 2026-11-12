package com.huawei.ui.main.stories.history;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.SportGroupData;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.SportTypeData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.LeftListSportAdapter;
import com.huawei.ui.main.stories.history.adapter.RightListSportAdapter;
import com.huawei.ui.main.stories.history.adapter.SearchTypeAdapter;
import com.huawei.ui.main.stories.history.model.SearchSportThreadManager;
import com.huawei.ui.main.stories.history.model.SpacesItemDecoration;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.coq;
import defpackage.jqq;
import defpackage.jry;
import defpackage.lmf;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.vqq;
import defpackage.vqr;
import defpackage.vqs;
import defpackage.vqx;
import defpackage.vre;
import defpackage.yls;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ChooseSportTypeActivity extends BaseActivity implements SearchSportThreadManager.SearchCallback, RightListSportAdapter.SportOnSelectPositionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28231a;
    private String ab;
    private int ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f28232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f28233c;
    private a d;
    private LeftListSportAdapter g;
    private HealthRecycleView h;
    private jry i;
    private RightListSportAdapter k;
    private SearchTypeAdapter l;
    private HealthRecycleView m;
    private ImageView n;
    private HealthTextView p;
    private String q;
    private List<vre> r;
    private LinearLayout t;
    private LinearLayout u;
    private HealthRecycleView v;
    private SearchSportThreadManager w;
    private HealthSearchView x;
    private LinearLayout y;
    private Map<Integer, Integer> f = new HashMap(16);
    private List<vqq> j = new ArrayList(16);
    private List<vqr> o = new ArrayList(16);
    private List<vre> s = new ArrayList(16);
    private boolean e = false;

    @Override // com.huawei.ui.main.stories.history.model.SearchSportThreadManager.SearchCallback
    public void onSearchResult(List<vre> list) {
        LogUtil.a("Track_SportMotionTypeActivity", "onSearchResult");
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = list;
        this.d.sendMessage(messageObtain);
    }

    @Override // com.huawei.ui.main.stories.history.adapter.RightListSportAdapter.SportOnSelectPositionListener
    public void selectedPosition(int i, int i2) {
        if (yls.e(this.o, i)) {
            LogUtil.d("Track_SportMotionTypeActivity", "selectedPosition parentPosition is out of bounds.");
            return;
        }
        vqr vqrVar = this.o.get(i);
        if (vqrVar == null) {
            LogUtil.d("Track_SportMotionTypeActivity", "selectedPosition motionTypeItem is null.");
            return;
        }
        List<vre> listB = vqrVar.b();
        if (yls.e(listB, i2)) {
            LogUtil.d("Track_SportMotionTypeActivity", "selectedPosition position is out of typeItemList.");
        } else {
            e(listB.get(i2));
        }
    }

    protected static class a extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<ChooseSportTypeActivity> f28238c;

        a(ChooseSportTypeActivity chooseSportTypeActivity) {
            this.f28238c = new WeakReference<>(chooseSportTypeActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ChooseSportTypeActivity chooseSportTypeActivity = this.f28238c.get();
            if (chooseSportTypeActivity == null || message == null) {
                LogUtil.c("Track_SportMotionTypeActivity", "handleMessage mActivity is null");
            } else if (message.what != 1) {
                LogUtil.d("Track_SportMotionTypeActivity", "other message");
            } else if (message.obj instanceof List) {
                chooseSportTypeActivity.b((List<vre>) message.obj);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28231a = this;
        this.d = new a(this);
        setContentView(R.layout.activity_sport_motion_type);
        this.w = SearchSportThreadManager.a();
        this.i = jry.a(this);
        Intent intent = getIntent();
        if (intent != null) {
            this.ac = intent.getIntExtra("sportTypeId", 0);
            this.ab = intent.getStringExtra("sportGroupTypeId");
        }
        e();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<vre> list) {
        this.r.clear();
        if (list.isEmpty()) {
            LogUtil.a("Track_SportMotionTypeActivity", "deviceListData is empty");
            SearchTypeAdapter searchTypeAdapter = this.l;
            if (searchTypeAdapter != null) {
                searchTypeAdapter.notifyDataSetChanged();
            }
            this.p.setText("");
            this.p.setVisibility(8);
            this.v.setVisibility(8);
            return;
        }
        if (this.l == null) {
            SearchTypeAdapter searchTypeAdapter2 = new SearchTypeAdapter(this.r);
            this.l = searchTypeAdapter2;
            this.v.setAdapter(searchTypeAdapter2);
        }
        this.p.setVisibility(0);
        this.v.setVisibility(0);
        this.r.addAll(list);
        this.l.b(this.q);
        this.l.notifyDataSetChanged();
        this.p.setText(getResources().getQuantityString(R.plurals.IDS_search_sport_type_count, this.r.size(), Integer.valueOf(this.r.size())));
        this.l.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.4
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (obj instanceof vre) {
                    ChooseSportTypeActivity.this.c(i);
                    vre vreVar = (vre) obj;
                    ChooseSportTypeActivity.this.e(vreVar);
                    ChooseSportTypeActivity.this.b(2, vreVar.c());
                    ChooseSportTypeActivity.this.c();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (i2 == i) {
                this.r.get(i2).c(true);
            } else {
                this.r.get(i2).c(false);
            }
        }
        this.l.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(vre vreVar) {
        if (vreVar == null) {
            LogUtil.d("Track_SportMotionTypeActivity", "setSportMotionResults item is null.");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("itemNameId", vreVar.b());
        intent.putExtra("resIconName", vreVar.h());
        intent.putExtra("sportTypeId", vreVar.c());
        intent.putExtra("sportGroupTypeId", vreVar.d());
        intent.putExtra("distanceFlag", vreVar.j());
        intent.putExtra("typeMet", vreVar.a());
        setResult(-1, intent);
        finish();
    }

    private void e() {
        this.j.clear();
        this.o.clear();
        this.s.clear();
        SportGroupData sportGroupDataA = this.i.a();
        SportTypeData sportTypeDataC = this.i.c();
        if (sportGroupDataA.getVersion().equals("0") || sportTypeDataC.getVersion().equals("0")) {
            LogUtil.d("Track_SportMotionTypeActivity", "sportGroupData or sportTypeData is null");
            return;
        }
        for (int i = 0; i < sportGroupDataA.getSportTypeGroups().size(); i++) {
            vqq vqqVar = new vqq();
            vqqVar.b(vqx.c(sportGroupDataA.getSportTypeGroups().get(i).getGroupNameRse()));
            String groupId = sportGroupDataA.getSportTypeGroups().get(i).getGroupId();
            vqqVar.c(groupId.equals(this.ab));
            vqqVar.b(groupId);
            this.j.add(vqqVar);
        }
        b();
        a(this.j, sportTypeDataC);
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            this.s.addAll(this.o.get(i2).b());
        }
        a();
    }

    private void b() {
        if (yls.c(vqx.e(this.ac, this.ab))) {
            LogUtil.d("Track_SportMotionTypeActivity", "handleRecentyAdd typeItems is null");
            return;
        }
        vqq vqqVar = new vqq();
        vqqVar.b(R.string.IDS_type_motion_add);
        vqqVar.b("recentlyAdded");
        this.j.add(0, vqqVar);
    }

    private void a(List<vqq> list, SportTypeData sportTypeData) {
        for (int i = 0; i < list.size(); i++) {
            vqr vqrVar = new vqr();
            if (list.get(i).a().equals("recentlyAdded")) {
                vqrVar.e(list.get(i).d());
                vqrVar.b(i);
                vqrVar.e(vqx.e(this.ac, this.ab));
            } else {
                vqrVar.e(list.get(i).d());
                vqrVar.b(i);
                vqrVar.e(a(sportTypeData, this.j.get(i).a()));
            }
            this.o.add(vqrVar);
        }
    }

    private List<vre> a(SportTypeData sportTypeData, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sportTypeData.getSportTypeInfos().size(); i++) {
            if (!str.equals(sportTypeData.getSportTypeInfos().get(i).getGroup()) || vqx.e(sportTypeData.getSportTypeInfos().get(i).getSportTypeId())) {
                LogUtil.d("Track_SportMotionTypeActivity", "groupId is not equals ,triathlon or golf is not supported");
            } else {
                vre vreVar = new vre();
                vreVar.c(str);
                vreVar.a(sportTypeData.getSportTypeInfos().get(i).getSportTypeId());
                vreVar.d(sportTypeData.getSportTypeInfos().get(i).getMet());
                vreVar.c(sportTypeData.getSportTypeInfos().get(i).getSportTypeId() == this.ac && str.equals(this.ab));
                vreVar.c(vqx.c(sportTypeData.getSportTypeInfos().get(i).getSportTypeRes()));
                vreVar.a(sportTypeData.getSportTypeInfos().get(i).getHistoryList().getItemImg());
                vreVar.a(sportTypeData.getSportTypeInfos().get(i).getHistoryList().getItemDrawable());
                vreVar.b(jqq.d(sportTypeData.getSportTypeInfos().get(i).getSportTypeId()));
                arrayList.add(vreVar);
            }
        }
        return arrayList;
    }

    private void i() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.search_custom_title);
        this.f28232b = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.x = (HealthSearchView) qsp.a(this, R.id.device_search_view);
        this.n = (ImageView) qsp.a(this, R.id.iv_search_back);
        this.u = (LinearLayout) qsp.a(this, R.id.search_mask_layer);
        this.t = (LinearLayout) qsp.a(this, R.id.search_container);
        this.y = (LinearLayout) qsp.a(this, R.id.search_holder);
        this.h = (HealthRecycleView) qsp.a(this, R.id.left_sport_type);
        this.m = (HealthRecycleView) qsp.a(this, R.id.right_sport_type);
        this.p = (HealthTextView) qsp.a(this, R.id.search_result_header);
        this.v = (HealthRecycleView) qsp.a(this, R.id.search_device_result_list);
        this.f28233c = (RelativeLayout) qsp.a(this, R.id.data_layout);
        this.v.setLayoutManager(new LinearLayoutManager(this));
        this.r = new ArrayList(16);
        int dimensionPixelOffset = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.hw_show_public_size_24);
        this.x.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        d();
        g();
        o();
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        int iD = qrs.d(BaseApplication.getContext(), 84.0f);
        if (!LanguageUtil.f(this.f28231a)) {
            iD = qrs.d(BaseApplication.getContext(), 64.0f);
        }
        layoutParams.width = iD;
        this.h.setLayoutParams(layoutParams);
        j();
    }

    private void a() {
        this.f.clear();
        for (int i = 0; i < this.o.size(); i++) {
            if (this.o.get(i).a() != -1 && !this.f.containsKey(Integer.valueOf(this.o.get(i).a()))) {
                this.f.put(Integer.valueOf(this.o.get(i).a()), Integer.valueOf(i));
            }
        }
    }

    private void d() {
        LogUtil.a("Track_SportMotionTypeActivity", "enter initLeftRecyclerView");
        this.h.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.ItemAnimator itemAnimator = this.h.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        LogUtil.a("Track_SportMotionTypeActivity", "mLeftList.size ", Integer.valueOf(this.j.size()));
        LeftListSportAdapter leftListSportAdapter = new LeftListSportAdapter(this.j);
        this.g = leftListSportAdapter;
        this.h.setAdapter(leftListSportAdapter);
        this.g.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.3
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (obj instanceof vqq) {
                    LogUtil.a("Track_SportMotionTypeActivity", "mLeftAdapter onItemClicked position: ", Integer.valueOf(i), " name: ", Integer.valueOf(((vqq) obj).d()));
                    ChooseSportTypeActivity.this.e = true;
                    ChooseSportTypeActivity.this.g.b(i);
                    if (ChooseSportTypeActivity.this.m.getLayoutManager() == null) {
                        return;
                    }
                    RecyclerView.LayoutManager layoutManager = ChooseSportTypeActivity.this.m.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(((Integer) ChooseSportTypeActivity.this.f.get(Integer.valueOf(i))).intValue(), 0);
                    }
                }
            }
        });
    }

    private void j() {
        if (TextUtils.isEmpty(this.ab)) {
            LogUtil.d("Track_SportMotionTypeActivity", "mSportGroupTypeId is bull");
            return;
        }
        if (coq.d(this.j)) {
            LogUtil.d("Track_SportMotionTypeActivity", "mLeftList is bull");
            return;
        }
        LogUtil.a("Track_SportMotionTypeActivity", "scrollToTargetGroupType:", this.ab);
        int i = 0;
        while (true) {
            if (i >= this.j.size()) {
                i = 0;
                break;
            }
            if (this.ab.equals(this.j.get(i).a())) {
                break;
            } else {
                i++;
            }
        }
        if (i == 0) {
            this.g.b(0);
            return;
        }
        Integer num = this.f.get(Integer.valueOf(i));
        if (num == null || num.intValue() == 0) {
            LogUtil.d("Track_SportMotionTypeActivity", "scrollToTargetKindType rightPosition is invalid");
            return;
        }
        this.g.b(i);
        if (this.h.getLayoutManager() instanceof LinearLayoutManager) {
            this.h.getLayoutManager().scrollToPosition(i);
        }
        RecyclerView.LayoutManager layoutManager = this.m.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(num.intValue(), 0);
        }
    }

    private void g() {
        LogUtil.a("Track_SportMotionTypeActivity", "enter initRightRecyclerView");
        RecyclerView.ItemAnimator itemAnimator = this.m.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        LogUtil.a("Track_SportMotionTypeActivity", "mRightList.size ", Integer.valueOf(this.o.size()));
        this.m.setLayoutManager(new LinearLayoutManager(this));
        RightListSportAdapter rightListSportAdapter = new RightListSportAdapter(this.o, this);
        this.k = rightListSportAdapter;
        rightListSportAdapter.b(this);
        this.m.setAdapter(this.k);
        this.m.addItemDecoration(new SpacesItemDecoration(28));
        this.m.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChooseSportTypeActivity.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int iA;
        LogUtil.a("Track_SportMotionTypeActivity", "Right onScrollRightListScrolled ");
        RecyclerView.LayoutManager layoutManager = this.m.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            LogUtil.d("Track_SportMotionTypeActivity", "layoutManager is not LinearLayoutManager");
            return;
        }
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > this.o.size()) {
            iFindFirstVisibleItemPosition = 0;
        }
        if (coq.d(this.o) || this.o.get(iFindFirstVisibleItemPosition) == null || (iA = this.o.get(iFindFirstVisibleItemPosition).a()) == -1 || this.g.a() == iA) {
            return;
        }
        LogUtil.a("Track_SportMotionTypeActivity", "onScrollRightListScrolled currentPosition:", Integer.valueOf(iA));
        b(iA);
        if (this.h.getLayoutManager() instanceof LinearLayoutManager) {
            this.h.getLayoutManager().scrollToPosition(iA);
        }
    }

    private void b(int i) {
        if (!this.e) {
            this.g.b(i);
        }
        this.e = false;
    }

    private void o() {
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ChooseSportTypeActivity.this.c();
            }
        });
        this.f28232b.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ChooseSportTypeActivity.this.finish();
            }
        });
        this.u.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ChooseSportTypeActivity.this.c();
            }
        });
        n();
    }

    private void n() {
        this.x.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.6
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                LogUtil.a("Track_SportMotionTypeActivity", "onFocusChange:", Boolean.valueOf(z));
                if (!z) {
                    ChooseSportTypeActivity.this.f28232b.setTitleBarBackgroundColor(ChooseSportTypeActivity.this.getResources().getColor(R.color.colorInputBoxSubBg));
                    ChooseSportTypeActivity.this.f28233c.setBackgroundColor(ChooseSportTypeActivity.this.getResources().getColor(R.color.colorInputBoxSubBg));
                    ChooseSportTypeActivity.this.t.setVisibility(8);
                    ChooseSportTypeActivity.this.k();
                    ChooseSportTypeActivity.this.w.e();
                    return;
                }
                ChooseSportTypeActivity.this.f28232b.setTitleBarBackgroundColor(ChooseSportTypeActivity.this.getResources().getColor(R.color.colorInputBoxSubBg));
                ChooseSportTypeActivity.this.f28233c.setBackgroundColor(ChooseSportTypeActivity.this.getResources().getColor(R.color.colorInputBoxSubBg));
                ChooseSportTypeActivity.this.t.setVisibility(0);
                ChooseSportTypeActivity.this.l();
                ChooseSportTypeActivity.this.m();
            }
        });
        this.x.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.huawei.ui.main.stories.history.ChooseSportTypeActivity.8
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                ChooseSportTypeActivity.this.t.setVisibility(0);
                ChooseSportTypeActivity.this.a(str);
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                ChooseSportTypeActivity.this.t.setVisibility(0);
                ChooseSportTypeActivity.this.a(str);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        b(1, 0);
        this.u.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object systemService = getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 2);
            }
        }
        this.u.setVisibility(8);
        this.x.setQuery("", false);
        this.x.clearFocus();
        this.t.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LogUtil.a("Track_SportMotionTypeActivity", "start do search");
        if (TextUtils.isEmpty(str)) {
            this.p.setText("");
            this.r.clear();
            SearchTypeAdapter searchTypeAdapter = this.l;
            if (searchTypeAdapter != null) {
                searchTypeAdapter.notifyDataSetChanged();
            }
            this.v.setVisibility(8);
            return;
        }
        this.q = str;
        this.w.e(str, this.s);
        this.w.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        vqs.b(this, h());
        this.n.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        vqs.e(this, h());
        this.n.setVisibility(4);
    }

    private vqs.c h() {
        vqs.c cVar = new vqs.c();
        cVar.b(this.f28232b);
        cVar.e(this.y);
        cVar.b(this.u);
        cVar.a(this.x);
        return cVar;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SearchSportThreadManager searchSportThreadManager = this.w;
        if (searchSportThreadManager != null) {
            searchSportThreadManager.e();
            this.w.c();
            this.w = null;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.d = null;
        }
        HealthSearchView healthSearchView = this.x;
        if (healthSearchView != null) {
            healthSearchView.setOnQueryTextListener(null);
            this.x.setOnQueryTextFocusChangeListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        LogUtil.a("Track_SportMotionTypeActivity", "setBiEvent eventValue is", Integer.valueOf(i));
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        if (i2 != 0) {
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i2));
        }
        lmf.d().c(this.f28231a, AnalyticsValue.MOTION_RECORD_SEARCH_CLICK_EVENT.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
