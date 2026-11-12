package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.json.JsonSanitizer;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.algorithm.api.TrackFeatureExtractionApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.adapter.ShareBottomDataAdapter;
import com.huawei.pluginsocialshare.cloud.bean.ContinuesSportCallback;
import com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel;
import com.huawei.pluginsocialshare.view.ShareBottomDataView;
import com.huawei.route.Point;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.swiperefreshlayout.HealthSwipeRefreshLayout;
import com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout;
import defpackage.gxy;
import defpackage.gyb;
import defpackage.gyd;
import defpackage.gyk;
import defpackage.jpg;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pma;
import defpackage.pmn;
import defpackage.pmw;
import defpackage.pmy;
import defpackage.pmz;
import defpackage.pna;
import defpackage.pnq;
import defpackage.pns;
import defpackage.pnt;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes42.dex */
public class ShareBottomDataView extends BaseShareBottomView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FragmentActivity f22595a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22596c;
    private gyb d;
    private ShareBottomDataAdapter f;
    private String g;
    private HealthSwipeRefreshLayout h;
    private String i;
    private Handler j;
    private boolean k;
    private HealthRecycleView l;
    private List<pmy> m;
    private pmw n;
    private boolean o;
    private pmz p;
    private pma q;
    private gxy r;
    private pmz s;
    private List<pmz> t;
    private List<pmy> u;
    private ShareViewModel v;
    private pna w;
    private int x;
    private pna y;

    public ShareBottomDataView(Context context) {
        super(context);
        this.j = new Handler(Looper.getMainLooper());
        this.t = new ArrayList();
        this.u = new ArrayList();
        if (context instanceof FragmentActivity) {
            this.f22595a = (FragmentActivity) this.f22574b;
        }
        if (this.f22595a == null) {
            return;
        }
        b(context);
        g();
    }

    public void b(Context context) {
        this.e = View.inflate(context, R.layout.fragment_bottom_data_layout, null);
        this.l = (HealthRecycleView) this.e.findViewById(R.id.data_recyclerView);
        f();
        a();
    }

    public void a() {
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = (HealthSwipeRefreshLayout) this.e.findViewById(R.id.swiperefreshlayout);
        this.h = healthSwipeRefreshLayout;
        healthSwipeRefreshLayout.setPadding(0, 0, 0, 0);
        this.h.setEnabled(false);
        this.h.setProgressBarColor(qre.e(R.color.common_white_80alpha));
        j();
    }

    private void j() {
        this.h.setCallback(new HwSwipeRefreshLayout.Callback() { // from class: com.huawei.pluginsocialshare.view.ShareBottomDataView.4
            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean isEnabled() {
                return false;
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean needToWait() {
                return true;
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onRefreshStart() {
                LogUtil.a("Share_ShareBottomDataView", "PullRefresh onRefreshStart");
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onScrollUp() {
                LogUtil.a("Share_ShareBottomDataView", "PullRefresh onScrollUp");
            }
        });
    }

    private void g() {
        this.n = new pmw();
        this.v = (ShareViewModel) new ViewModelProvider(this.f22595a).get(ShareViewModel.class);
        gxy gxyVarC = pjm.c();
        this.r = gxyVarC;
        if (gxyVarC == null) {
            LogUtil.a("Share_ShareBottomDataView", "initData mShareEditContent is null");
            return;
        }
        this.x = gxyVarC.h();
        e(SharedPreferenceManager.e(this.f22574b, Integer.toString(20002), "shareLastSportDataAndMarkV2" + this.x));
        i();
        if (this.r.i() != 8) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        LogUtil.a("Share_ShareBottomDataView", "readFromSpRemember dataSpStr=", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.u = (List) HiJsonUtil.d(JsonSanitizer.sanitize(str), new TypeToken<List<pmy>>() { // from class: com.huawei.pluginsocialshare.view.ShareBottomDataView.2
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("Share_ShareBottomDataView", "parse readFromSpRemember error");
        }
    }

    private void c() {
        this.q = new pma(this);
        int iB = pnq.b(this.x);
        String strB = this.n.b();
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("Share_ShareBottomDataView", "downloadContinuesSport, sportTime is empty");
            return;
        }
        try {
            String strC = DateFormatUtil.c(Long.parseLong(strB), "yyyyMMdd");
            if (TextUtils.isEmpty(strC)) {
                ReleaseLogUtil.d("Share_ShareBottomDataView", "downloadContinuesSport, date is empty");
            } else {
                this.q.d(strC, iB, new AnonymousClass3());
            }
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.d("Share_ShareBottomDataView", "downloadContinuesSport, NumberFormatException, sportTime:", strB);
        }
    }

    /* JADX INFO: renamed from: com.huawei.pluginsocialshare.view.ShareBottomDataView$3, reason: invalid class name */
    public class AnonymousClass3 implements ContinuesSportCallback {
        AnonymousClass3() {
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.ContinuesSportCallback
        public void onSuccess(int i, gyb gybVar) {
            ReleaseLogUtil.c("Share_ShareBottomDataView", "onSuccess resultCode:", Integer.valueOf(i));
            if (i == 0) {
                ShareBottomDataView.this.d = gybVar;
                ShareBottomDataView shareBottomDataView = ShareBottomDataView.this;
                shareBottomDataView.e(shareBottomDataView.d());
                HandlerExecutor.c(new Runnable() { // from class: pov
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45752a.a();
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            ShareBottomDataView.this.i();
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.ContinuesSportCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.b("Share_ShareBottomDataView", "downloadContinuesSport onFailure errorCode: ", Integer.valueOf(i), " errorInfo:", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        if (njy.e(this.m)) {
            return "";
        }
        String strD = HiJsonUtil.d(this.m);
        for (pmy pmyVar : this.m) {
            if ("continues_data".equals(pmyVar.d()) || "thumbnail_data".equals(pmyVar.d()) || "track_data".equals(pmyVar.d())) {
                return strD;
            }
        }
        if (njy.e(this.u)) {
            return strD;
        }
        for (pmy pmyVar2 : this.u) {
            if ("continues_data".equals(pmyVar2.d()) || "thumbnail_data".equals(pmyVar2.d()) || "track_data".equals(pmyVar2.d())) {
                this.m.add(pmyVar2);
                return HiJsonUtil.d(this.m);
            }
        }
        return strD;
    }

    private void f() {
        this.l.setHasFixedSize(true);
        this.l.setLayoutManager(new LinearLayoutManager(this.f22574b, 1, false));
        this.f = new ShareBottomDataAdapter(this.f22574b, this.t, new ShareBottomDataAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.view.ShareBottomDataView.1
            @Override // com.huawei.pluginsocialshare.adapter.ShareBottomDataAdapter.OnItemClickListener
            public void onItemClick(int i, List<pna> list, pna pnaVar) {
                if (!njy.e(list)) {
                    ShareBottomDataView.this.n.b(list);
                }
                if (pnaVar != null) {
                    ShareBottomDataView.this.n.d(pnaVar);
                    ShareBottomDataView.this.d(pnaVar);
                }
                if (ShareBottomDataView.this.n != null) {
                    ShareBottomDataView.this.v.b(ShareBottomDataView.this.n);
                    pmn.a(ShareBottomDataView.this.b());
                }
            }
        });
        this.l.setNestedScrollingEnabled(false);
        this.l.setAdapter(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(pna pnaVar) {
        if (pnaVar == null) {
            return;
        }
        this.o = "0".equals(pnaVar.b());
        this.k = "1".equals(pnaVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        if (this.n == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        List<pna> listD = this.n.d();
        if (njy.e(listD)) {
            return "";
        }
        for (pna pnaVar : listD) {
            arrayList.add(new pmy(pnaVar.b(), pnaVar.a(), pnaVar.n()));
        }
        pna pnaVarH = this.n.h();
        if (pnaVarH != null && pnaVarH.o()) {
            arrayList.add(new pmy(pnaVarH.b(), pnaVarH.a(), pnaVarH.n()));
        }
        this.m = arrayList;
        String strD = HiJsonUtil.d(arrayList);
        LogUtil.a("Share_ShareBottomDataView", "getDataItemListToStr dataStr:", strD);
        return strD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.t.clear();
        this.t.add(b(qre.f(R.string.IDS_hwh_edit_share_sport_data)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        this.t.add(d(1, arrayList2));
        this.n.b(g(arrayList));
        List<pna> listE = e();
        if (njy.b(listE)) {
            this.s = b(qre.f(R.string.IDS_hwh_edit_share_fragemt_text_data_mark));
            this.p = d(2, listE);
            this.t.add(this.s);
            this.t.add(this.p);
        }
        int i = this.f22596c;
        if (i == 3 || i == 0) {
            h();
        }
        this.n.a(this.y);
        this.v.b(this.n);
        this.f.e(this.t);
    }

    private List<pna> g(List<pna> list) {
        if (njy.e(this.u)) {
            return list;
        }
        final HashMap map = new HashMap();
        for (int i = 0; i < this.u.size(); i++) {
            map.put(this.u.get(i).d(), Integer.valueOf(i));
        }
        list.sort(new Comparator() { // from class: poq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Map map2 = map;
                return Integer.compare(((Integer) Optional.ofNullable((Integer) map2.get(((pna) obj).a())).orElse(0)).intValue(), ((Integer) Optional.ofNullable((Integer) map2.get(((pna) obj2).a())).orElse(0)).intValue());
            }
        });
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    private List<pna> e() {
        pna pnaVar;
        LogUtil.j("Share_ShareBottomDataView", "constructWaterList enter.");
        ArrayList arrayList = new ArrayList();
        gxy gxyVar = this.r;
        if (gxyVar == null || gxyVar.k() == null) {
            LogUtil.j("Share_ShareBottomDataView", "constructWaterList mShareEditContent is empty.");
            return arrayList;
        }
        List<jpg> listB = this.r.k().b();
        if (njy.b(listB)) {
            List<jpg> listE = e(this.r.k());
            LogUtil.a("Share_ShareBottomDataView", "constructWaterList samplePoints.size=", Integer.valueOf(listB.size()), " points.size=", Integer.valueOf(listE.size()));
            if (njy.b(listE)) {
                pna pnaVarJ = j(listE);
                pnaVar = pnaVarJ.o() ? pnaVarJ : null;
                this.y = pnaVarJ;
                arrayList.add(pnaVarJ);
            } else {
                pnaVar = null;
            }
        } else {
            pnaVar = null;
        }
        String strH = this.r.k().h();
        if (!TextUtils.isEmpty(strH)) {
            LogUtil.a("Share_ShareBottomDataView", "constructWaterList thumbnail=", strH);
            pna pnaVarA = a(strH);
            pnaVar = pnaVarA.o() ? pnaVarA : null;
            this.w = pnaVarA;
            arrayList.add(pnaVarA);
        }
        gyb gybVar = this.d;
        if (gybVar != null && gybVar.c() > 0) {
            ReleaseLogUtil.c("Share_ShareBottomDataView", "constructWaterList getContinuesDay=", Integer.valueOf(this.d.c()));
            pna pnaVarC = c(this.d);
            pna pnaVar2 = pnaVarC.o() ? pnaVarC : null;
            arrayList.add(pnaVarC);
            pnaVar = pnaVar2;
        }
        if (pnaVar == null) {
            if (njy.b(arrayList) && njy.e(this.u)) {
                this.n.d((pna) arrayList.get(0));
                ((pna) arrayList.get(0)).d(true);
                d((pna) arrayList.get(0));
            }
            return arrayList;
        }
        this.n.d(pnaVar);
        return arrayList;
    }

    private pna c(gyb gybVar) {
        pna pnaVar = new pna("2", 0, false, qre.f(R.string.IDS_hwh_edit_share_con_sign), String.valueOf(gybVar.c()), b(gybVar.a()), null, null);
        pnaVar.d(gybVar);
        pnaVar.a("continues_data");
        pnaVar.e(this.g);
        pnaVar.b(this.i);
        if (a(pnaVar)) {
            pnaVar.d(true);
        }
        return pnaVar;
    }

    private pna a(String str) {
        pna pnaVar = new pna("1", 0, false, qre.f(R.string.IDS_hwh_edit_share_graffiti), "", "", null, str);
        pnaVar.a("thumbnail_data");
        if (a(pnaVar)) {
            pnaVar.d(true);
            this.k = true;
            return pnaVar;
        }
        this.k = false;
        return pnaVar;
    }

    private pna j(List<jpg> list) {
        pna pnaVar = new pna("0", 0, false, qre.f(R.string.IDS_hwh_edit_share_track), "", "", list, "");
        pnaVar.a("track_data");
        pnaVar.e(this.r.k().e());
        pnaVar.b(this.i);
        pnaVar.e(this.g);
        pnaVar.d(this.r.k().c());
        if (a(pnaVar)) {
            pnaVar.d(true);
            this.o = true;
            return pnaVar;
        }
        this.o = false;
        return pnaVar;
    }

    private String b(int i) {
        ReleaseLogUtil.c("Share_ShareBottomDataView", "getContinuesName sportType:", Integer.valueOf(i));
        if (i == 1) {
            return qre.f(R.string.IDS_hwh_edit_share_con_walk_days);
        }
        if (i == 2) {
            return qre.f(R.string.IDS_hwh_edit_share_con_run_days);
        }
        if (i == 3) {
            return qre.f(R.string.IDS_hwh_edit_share_con_ride_days);
        }
        if (i == 4) {
            return qre.f(R.string.IDS_hwh_edit_share_con_rope_days);
        }
        return "";
    }

    private void d(List<pna> list, List<pna> list2) {
        gxy gxyVar = this.r;
        if (gxyVar == null || gxyVar.k() == null) {
            return;
        }
        List<gyk> listA = this.r.k().a();
        Map<String, String> mapD = this.r.k().d();
        if (mapD != null) {
            this.n.d(mapD.getOrDefault("sport_type", ""));
            this.n.e(mapD.getOrDefault("sport_date", ""));
            this.n.c(mapD.getOrDefault("sport_source", ""));
            this.n.b(mapD.getOrDefault("sport_time", ""));
            this.g = mapD.getOrDefault("distance", "");
            this.i = mapD.getOrDefault("distance_unit", "");
        }
        if (njy.e(listA)) {
            ReleaseLogUtil.d("Share_ShareBottomDataView", "constructDataList dataList size=0");
            return;
        }
        ReleaseLogUtil.c("Share_ShareBottomDataView", "constructDataList dataList size=", Integer.valueOf(listA.size()));
        for (int i = 0; i < listA.size(); i++) {
            gyk gykVar = listA.get(i);
            if (gykVar != null) {
                LogUtil.a("Share_ShareBottomDataView", "constructDataList detailBean=", gykVar.toString());
                pna pnaVar = new pna(String.valueOf(i), c(gykVar.e(), gykVar.c()), gykVar.h(), d(gykVar.a()), d(gykVar.f()), d(gykVar.d()), null, "");
                pnaVar.a(d(gykVar.e()));
                pnaVar.c(d(gykVar.b()));
                pnaVar.e(this.g);
                pnaVar.b(this.i);
                e(list, pnaVar, i);
                list2.add(pnaVar);
            }
        }
    }

    private void e(List<pna> list, pna pnaVar, int i) {
        if (njy.e(this.u)) {
            if (i < 3) {
                pnaVar.d(true);
                list.add(pnaVar);
                return;
            }
            return;
        }
        if (e(pnaVar)) {
            pnaVar.d(true);
            list.add(pnaVar);
        }
    }

    private boolean e(pna pnaVar) {
        if (njy.e(this.u) || pnaVar == null) {
            return false;
        }
        Iterator<pmy> it = this.u.iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next().d(), pnaVar.a())) {
                return true;
            }
        }
        return false;
    }

    private boolean a(pna pnaVar) {
        if (njy.e(this.u) || pnaVar == null) {
            return false;
        }
        Iterator<pmy> it = this.u.iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next().d(), pnaVar.a())) {
                return true;
            }
        }
        return false;
    }

    private int c(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            Integer numD = pnt.d(str);
            LogUtil.a("Share_ShareBottomDataView", "getSelectIcon detailItemType=", str, " selectIcon=", Integer.valueOf(i), " h5SportTypeByKey=", numD);
            if (numD.intValue() != 0) {
                return numD.intValue();
            }
        }
        return i;
    }

    private String d(String str) {
        return str == null ? "" : str;
    }

    private pmz b(String str) {
        pmz pmzVar = new pmz();
        pmzVar.c(0);
        pmzVar.d(str);
        return pmzVar;
    }

    private pmz d(int i, List<pna> list) {
        pmz pmzVar = new pmz();
        pmzVar.c(i);
        if (i == 1) {
            pmzVar.d(list);
            return pmzVar;
        }
        pmzVar.e(list);
        return pmzVar;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public View getRootView() {
        return this.e;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public void onTemplateSelected(int i) {
        LogUtil.a("Share_ShareBottomDataView", "onTemplateSelected position =", Integer.valueOf(i));
        this.f22596c = i;
        this.j.removeCallbacksAndMessages(null);
        this.j.postDelayed(new Runnable() { // from class: com.huawei.pluginsocialshare.view.ShareBottomDataView.5
            @Override // java.lang.Runnable
            public void run() {
                ShareBottomDataView.this.h();
            }
        }, 800L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        pmz pmzVar;
        if (this.s == null || (pmzVar = this.p) == null) {
            return;
        }
        List<pna> listE = pmzVar.e();
        if (listE == null) {
            ReleaseLogUtil.d("Share_ShareBottomDataView", "updateWaterListShow waterItemModels is null!");
            return;
        }
        int i = this.f22596c;
        if (i == 0) {
            f(listE);
            i(listE);
        } else if (i == 1 || i == 2) {
            d(listE);
            b(listE);
        } else if (i != 3) {
            LogUtil.a("Share_ShareBottomDataView", "updateWaterListShow default branch");
        } else {
            f(listE);
        }
        h(listE);
        this.f.e(this.t);
    }

    private void b(List<pna> list) {
        pna pnaVar;
        if (list == null || (pnaVar = this.y) == null || list.contains(pnaVar)) {
            return;
        }
        this.y.d(this.o);
        list.add(0, this.y);
    }

    private void d(List<pna> list) {
        pna pnaVar;
        if (list == null || (pnaVar = this.w) == null || list.contains(pnaVar)) {
            return;
        }
        this.w.d(this.k);
        list.add(0, this.w);
    }

    private void f(List<pna> list) {
        pna pnaVar;
        if (list == null || (pnaVar = this.y) == null) {
            return;
        }
        list.remove(pnaVar);
    }

    private void i(List<pna> list) {
        pna pnaVar;
        if (list == null || (pnaVar = this.w) == null) {
            return;
        }
        list.remove(pnaVar);
    }

    private void h(List<pna> list) {
        if (njy.e(list)) {
            if (this.t.contains(this.s) && this.t.contains(this.p)) {
                this.t.remove(this.s);
                this.t.remove(this.p);
                return;
            }
            return;
        }
        if (this.t.contains(this.s) || this.t.contains(this.p)) {
            return;
        }
        this.t.add(this.s);
        this.t.add(this.p);
    }

    private List<jpg> e(gyd gydVar) {
        List<jpg> listB = gydVar.b();
        if (!njy.e(listB)) {
            ReleaseLogUtil.c("Share_ShareBottomDataView", "samplePoints points size:", Integer.valueOf(listB.size()));
            if (listB.size() < 200) {
                ReleaseLogUtil.d("Share_ShareBottomDataView", "samplePoints points less than MIN_TRACK_POINTS");
                return listB;
            }
            if (pns.d(this.x, listB) && !njy.e(gydVar.e()) && !njy.e(gydVar.c())) {
                return e(listB, gydVar.e());
            }
            if (listB.size() > 20000) {
                return e(listB);
            }
            TrackFeatureExtractionApi trackFeatureExtractionApi = (TrackFeatureExtractionApi) Services.d("TrackFeatureExtractionAlgorithmService", TrackFeatureExtractionApi.class);
            if (trackFeatureExtractionApi != null) {
                int iMax = Math.max((listB.size() / 500) + 1, 2);
                List<jpg> listA = a(trackFeatureExtractionApi.featurePointExtraction(c(listB), iMax));
                ReleaseLogUtil.c("Share_ShareBottomDataView", "samplePoints LatLngPoints.size=", Integer.valueOf(listA.size()), " step=", Integer.valueOf(iMax));
                return listA;
            }
        }
        return listB;
    }

    private List<jpg> e(List<jpg> list) {
        int iMax = Math.max((list.size() / 500) + 1, 2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            jpg jpgVar = list.get(i);
            if (i == 0 || i == list.size() - 1 || i % iMax == 0) {
                arrayList.add(jpgVar);
            }
        }
        ReleaseLogUtil.c("Share_ShareBottomDataView", "getCommonPoints LatLngPoints.size= ", Integer.valueOf(arrayList.size()), " points.size=", Integer.valueOf(list.size()), " step=", Integer.valueOf(iMax));
        return arrayList;
    }

    private List<jpg> e(List<jpg> list, List<jpg> list2) {
        ArrayList arrayList = new ArrayList();
        a(list, list2);
        int iMax = Math.max((list.size() / 500) + 1, 2);
        HashSet hashSet = new HashSet(list2);
        for (int i = 0; i < list.size(); i++) {
            jpg jpgVar = list.get(i);
            if (i == 0 || i == list.size() - 1 || hashSet.contains(jpgVar) || i % iMax == 0) {
                arrayList.add(jpgVar);
            }
        }
        ReleaseLogUtil.c("Share_ShareBottomDataView", "samplePoints getMarathonPoints LatLngPoints.size=", Integer.valueOf(arrayList.size()), " points.size=", Integer.valueOf(list.size()), " step=", Integer.valueOf(iMax));
        return arrayList;
    }

    private void a(List<jpg> list, List<jpg> list2) {
        if (CommonUtil.bu()) {
            return;
        }
        d("points", list);
        d("markPoints", list2);
    }

    private void d(String str, List<jpg> list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).d);
            sb.append(",");
            sb2.append(list.get(i).f38787a);
            sb2.append(",");
        }
        LogUtil.a("Share_ShareBottomDataView", "samplePoints ", str, " latitudes:", sb.toString());
        LogUtil.a("Share_ShareBottomDataView", "samplePoints ", str, " longitudes:", sb2.toString());
    }

    private List<jpg> a(List<Point> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        return (List) list.stream().map(new Function() { // from class: pou
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ShareBottomDataView.c((Point) obj);
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ jpg c(Point point) {
        return new jpg(point.getLatitude(), point.getLongitude());
    }

    private List<Point> c(List<jpg> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        return (List) list.stream().map(new Function() { // from class: por
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ShareBottomDataView.c((jpg) obj);
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ Point c(jpg jpgVar) {
        Point point = new Point();
        point.setLatitude(jpgVar.d);
        point.setLongitude(jpgVar.f38787a);
        return point;
    }
}
