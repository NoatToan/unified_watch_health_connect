package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.adapter.StickerItemAdapter;
import com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.swiperefreshlayout.HealthSwipeRefreshLayout;
import com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout;
import defpackage.gxy;
import defpackage.gyf;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pma;
import defpackage.pmn;
import defpackage.pmr;
import defpackage.pmx;
import defpackage.pnb;
import defpackage.pnc;
import defpackage.pnq;
import defpackage.pns;
import defpackage.qqs;
import defpackage.qre;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes42.dex */
public class ShareBottomStickerView extends BaseShareBottomView {
    private Handler f;
    private FragmentActivity g;
    private StickerItemAdapter h;
    private int i;
    private View k;
    private HealthRecycleView l;
    private HealthSwipeRefreshLayout m;
    private Map<Integer, Integer> n;
    private boolean o;
    private pnb p;
    private ShareViewModel q;
    private gxy r;
    private List<pnc> s;
    private pma t;
    private List<ShareDataInfo> v;
    private int y;
    private static final int[] d = {R.mipmap.hw_health_edit_share_pic_stickers_gas, R.mipmap.hw_health_edit_share_pic_stickers_lightning, R.mipmap.hw_health_edit_share_pic_stickers_lightning2, R.mipmap.hw_health_edit_share_pic_stickers_sweat};
    private static final int[] j = {R.drawable.small_mask_empty, R.drawable.small_mask_1_0, R.drawable.small_mask_2_0, R.drawable.small_mask_3_0, R.drawable.small_mask_4_0, R.drawable.small_mask_5_0, R.drawable.small_mask_6_0, R.drawable.small_mask_7_0, R.drawable.small_mask_8_0, R.drawable.small_mask_9_0, R.drawable.small_mask_10_0, R.drawable.small_mask_11_0, R.drawable.small_mask_12_0, R.drawable.small_mask_13_0, R.drawable.small_mask_14_0, R.drawable.small_mask_15_0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f22608c = {0, R.drawable.mask_1, R.drawable.mask_2, R.drawable.mask_3, R.drawable.mask_4, R.drawable.mask_5, R.drawable.mask_6, R.drawable.mask_7, R.drawable.mask_8, R.drawable.mask_9, R.drawable.mask_10, R.drawable.mask_11, R.drawable.mask_12, R.drawable.mask_13, R.drawable.mask_14, R.drawable.mask_15};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f22607a = {R.color.share_text_white_color, R.color.share_text_black_color, R.color.share_text_color1, R.color.share_text_color2, R.color.share_text_color3, R.color.share_text_color4, R.color.share_text_color5};

    public ShareBottomStickerView(Context context) {
        super(context);
        this.f = new Handler(Looper.getMainLooper());
        this.s = new ArrayList();
        this.o = true;
        this.n = new HashMap();
        if (context instanceof FragmentActivity) {
            this.g = (FragmentActivity) this.f22574b;
        }
        if (this.g == null) {
            return;
        }
        a(context);
        d();
    }

    public void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.fragment_bottom_data_layout, null);
        this.k = viewInflate;
        this.l = (HealthRecycleView) viewInflate.findViewById(R.id.data_recyclerView);
        j();
        a();
    }

    public void a() {
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = (HealthSwipeRefreshLayout) this.k.findViewById(R.id.swiperefreshlayout);
        this.m = healthSwipeRefreshLayout;
        healthSwipeRefreshLayout.setPadding(0, 0, 0, 0);
        this.m.setEnabled(false);
        this.m.setProgressBarColor(qre.e(R.color.common_white_80alpha));
        i();
    }

    private void i() {
        this.m.setCallback(new HwSwipeRefreshLayout.Callback() { // from class: com.huawei.pluginsocialshare.view.ShareBottomStickerView.5
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
                LogUtil.a("Share_ShareBottomStickerView", "PullRefresh onRefreshStart");
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onScrollUp() {
                LogUtil.a("Share_ShareBottomStickerView", "PullRefresh onScrollUp");
            }
        });
    }

    private void d() {
        gxy gxyVarC = pjm.c();
        this.r = gxyVarC;
        if (gxyVarC == null) {
            LogUtil.a("Share_ShareBottomStickerView", "EditShareActivity_data mShareEditContent is null");
            return;
        }
        this.y = gxyVarC.h();
        pnb pnbVar = new pnb();
        this.p = pnbVar;
        pnbVar.c(true);
        this.p.b(true);
        this.q = (ShareViewModel) new ViewModelProvider(this.g).get(ShareViewModel.class);
        f();
    }

    private void j() {
        this.l.setHasFixedSize(true);
        this.l.setLayoutManager(new LinearLayoutManager(this.f22574b, 1, false));
        pmn.b(true);
        pmn.b();
        pmn.a();
        this.h = new StickerItemAdapter(this.f22574b, this.s, new StickerItemAdapter.OnItemClickListener() { // from class: com.huawei.pluginsocialshare.view.ShareBottomStickerView.4
            @Override // com.huawei.pluginsocialshare.adapter.StickerItemAdapter.OnItemClickListener
            public void onItemClick(int i, int i2, int i3, pmx pmxVar, int i4, ShareDataInfo shareDataInfo) {
                String strValueOf = "0";
                String strD = pmxVar == null ? "0" : pmxVar.d();
                if (shareDataInfo != null) {
                    strValueOf = String.valueOf(shareDataInfo.getId());
                }
                LogUtil.a("Share_ShareBottomStickerView", "stickerItemAdapter initRecyclerView position =", Integer.valueOf(i), " textColor:", Integer.valueOf(i2), "layoutID:", Integer.valueOf(i3), " maskId:", strD, " maskColor:", Integer.valueOf(i4), " stickerId:", strValueOf);
                if (i2 != 0) {
                    ShareBottomStickerView.this.c(i, i2);
                }
                if (i3 != -1) {
                    ShareBottomStickerView.this.n.put(Integer.valueOf(ShareBottomStickerView.this.i), Integer.valueOf(i3));
                    ShareBottomStickerView.this.b(i3);
                }
                if (i4 != 0) {
                    ShareBottomStickerView.this.b(i, i4);
                }
                if (pmxVar != null) {
                    ShareBottomStickerView.this.d(pmxVar, i);
                }
                if (shareDataInfo != null) {
                    ShareBottomStickerView.this.e(shareDataInfo, i);
                }
                ShareBottomStickerView.this.p.c(ShareBottomStickerView.this.i);
                ShareBottomStickerView.this.q.b(ShareBottomStickerView.this.p);
            }
        });
        this.l.setNestedScrollingEnabled(false);
        this.l.setAdapter(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.p.d(i);
        b(this.p.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        pnb pnbVar = this.p;
        if (i == 0) {
            i2 = pns.d(this.f22574b, this.y);
        }
        pnbVar.a(i2);
        this.p.c(i == 0);
        pmn.b(i == 0);
        b(this.p.c());
        pmn.b(this.y, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        pnb pnbVar = this.p;
        if (i == 0) {
            i2 = pns.c(this.f22574b, this.y);
        }
        pnbVar.b(i2);
        this.p.b(i == 0);
        pmn.d(i == 0);
        b(this.p.c());
        pmn.b(this.y, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ShareDataInfo shareDataInfo, int i) {
        shareDataInfo.setValidityType(i);
        this.p.b(shareDataInfo);
        pmn.a(this.y, shareDataInfo);
        b(this.p.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(pmx pmxVar, int i) {
        String strD;
        pnb pnbVarE = pmn.e(this.y);
        if (pnbVarE != null && pnbVarE.c() != null) {
            strD = pnbVarE.c().d();
        } else {
            strD = "";
        }
        if (pmxVar.d().equals(strD)) {
            if (pnbVarE == null || !this.p.f()) {
                return;
            }
            this.p.b(pnbVarE.d());
            return;
        }
        if ("0".equals(pmxVar.d())) {
            this.p.d(0);
            this.h.e(0);
            this.o = true;
            this.h.notifyDataSetChanged();
        } else if (this.o) {
            this.o = false;
            this.p.d(1);
            this.h.e(1);
            this.h.notifyDataSetChanged();
        }
        b(pmxVar);
        this.p.a(pmxVar);
        pmn.b(this.y, this.p);
    }

    private void b(pmx pmxVar) {
        if (this.p.i()) {
            if (pmxVar != null && pmxVar.b() && !"0".equals(pmxVar.d())) {
                c();
                return;
            } else {
                this.p.a(pns.d(this.f22574b, this.y));
                return;
            }
        }
        if (pmxVar == null || !pmxVar.b() || "0".equals(pmxVar.d())) {
            return;
        }
        c();
    }

    private void c() {
        if (this.p.f()) {
            this.p.b(pns.c(this.f22574b, this.y));
            if (this.p.i()) {
                this.p.a(pns.c(pns.b(this.f22574b, this.y)));
                return;
            }
            return;
        }
        if (this.p.i()) {
            this.p.a(pns.c(qre.e(this.f22574b, this.p.d())));
        }
    }

    private void f() {
        h();
        g();
        if (CommonUtil.ab(this.f22574b)) {
            e();
        }
    }

    private void h() {
        List<ShareDataInfo> arrayList = new ArrayList<>();
        for (int i : d) {
            pmr pmrVar = new pmr();
            pmrVar.e(i);
            arrayList.add(pmrVar);
        }
        c(arrayList);
    }

    private void g() {
        gyf gyfVarB = pmn.e().b(this.y);
        if (gyfVarB == null) {
            return;
        }
        c(gyfVarB.c());
    }

    private void e() {
        pma pmaVar = new pma(this);
        this.t = pmaVar;
        pmaVar.b(this.g, this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<ShareDataInfo> list) {
        if (njy.e(list)) {
            return;
        }
        this.v = list;
        this.s.clear();
        int i = this.i;
        if (i == 2 || i == 3) {
            this.s.add(e(qre.f(R.string.IDS_hwh_edit_share_text_color)));
            this.s.add(e(f22607a, 1));
        }
        int i2 = this.i;
        if (i2 == 2 || i2 == 0) {
            this.s.add(e(qre.f(R.string.IDS_hwh_edit_share_layout)));
            m();
        }
        if (this.i != 0) {
            this.s.add(e(qre.f(R.string.IDS_custom_share_mask)));
            this.s.add(l());
            this.s.add(e(qre.f(R.string.IDS_custom_share_mask_color)));
            this.s.add(e(f22607a, 4));
        }
        this.s.add(e(qre.f(R.string.IDS_hwh_edit_share_texture)));
        this.s.add(e(list));
        this.h.e(this.s);
    }

    private void m() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.i == 0) {
            if (pns.k()) {
                arrayList.add(Integer.valueOf(R.mipmap.share_center_up_select));
                arrayList.add(Integer.valueOf(R.mipmap.share_center_down_select));
                arrayList2.add(Integer.valueOf(qqs.e(this.f22574b) ? R.mipmap.share_center_up_unselect_dark : R.mipmap.share_center_up_unselect));
                arrayList2.add(Integer.valueOf(qqs.e(this.f22574b) ? R.mipmap.share_center_down_unselect_dark : R.mipmap.share_center_down_unselect));
                this.s.add(b(new int[]{0, 1}, arrayList, arrayList2));
                return;
            }
            arrayList.add(Integer.valueOf(R.mipmap.share_center_up_select));
            arrayList.add(Integer.valueOf(R.mipmap.share_center_middle_select));
            arrayList.add(Integer.valueOf(R.mipmap.share_center_down_select));
            arrayList2.add(Integer.valueOf(qqs.e(this.f22574b) ? R.mipmap.share_center_up_unselect_dark : R.mipmap.share_center_up_unselect));
            arrayList2.add(Integer.valueOf(qqs.e(this.f22574b) ? R.mipmap.share_center_middle_unselect_dark : R.mipmap.share_center_middle_unselect));
            arrayList2.add(Integer.valueOf(qqs.e(this.f22574b) ? R.mipmap.share_center_down_unselect_dark : R.mipmap.share_center_down_unselect));
            this.s.add(b(new int[]{0, 1, 2}, arrayList, arrayList2));
            return;
        }
        arrayList.add(Integer.valueOf(R.mipmap.share_layout_up_select));
        arrayList.add(Integer.valueOf(R.mipmap.share_layout_down_select));
        arrayList2.add(Integer.valueOf(qqs.e(this.f22574b) ? R.mipmap.share_layout_up_unselect_dark : R.mipmap.share_layout_up_unselect));
        arrayList2.add(Integer.valueOf(qqs.e(this.f22574b) ? R.mipmap.share_layout_down_unselect_dark : R.mipmap.share_layout_down_unselect));
        this.s.add(b(new int[]{0, 1}, arrayList, arrayList2));
    }

    private pnc e(String str) {
        pnc pncVar = new pnc();
        pncVar.c(0);
        pncVar.c(str);
        return pncVar;
    }

    private pnc e(int[] iArr, int i) {
        pnc pncVar = new pnc();
        pncVar.c(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(pns.d(this.f22574b, this.y)));
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        pncVar.a(arrayList);
        return pncVar;
    }

    private pnc b(int[] iArr, List<Integer> list, List<Integer> list2) {
        pnc pncVar = new pnc();
        pncVar.c(2);
        pncVar.d(iArr);
        pncVar.c(list);
        pncVar.b(list2);
        return pncVar;
    }

    private pnc e(List<ShareDataInfo> list) {
        pnc pncVar = new pnc();
        pncVar.c(5);
        pncVar.d(list);
        return pncVar;
    }

    private pnc l() {
        pnc pncVar = new pnc();
        pncVar.c(3);
        pncVar.e(b());
        return pncVar;
    }

    private List<pmx> b() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int[] iArr = j;
            if (i >= iArr.length) {
                return arrayList;
            }
            arrayList.add(new pmx(String.valueOf(i), iArr[i], f22608c[i]));
            i++;
        }
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.activity.SportDownloadInterface
    public void downloadedAllShareDataCallback(gyf gyfVar) {
        LogUtil.a("Share_ShareBottomStickerView", "notifyShareDataChanged");
        a(gyfVar);
    }

    private void a(gyf gyfVar) {
        List<ShareDataInfo> listC = pnq.c(gyfVar.c());
        pnq.d(listC);
        if (njy.e(listC)) {
            return;
        }
        c(listC);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public void onTemplateSelected(final int i) {
        LogUtil.a("Share_ShareBottomStickerView", "onTemplateSelected position =", Integer.valueOf(i));
        this.i = i;
        this.f.removeCallbacksAndMessages(null);
        this.f.postDelayed(new Runnable() { // from class: com.huawei.pluginsocialshare.view.ShareBottomStickerView.1
            @Override // java.lang.Runnable
            public void run() {
                ShareBottomStickerView.this.h.d(0);
                if (ShareBottomStickerView.this.n.containsKey(Integer.valueOf(i))) {
                    ShareBottomStickerView.this.p.d(((Integer) ShareBottomStickerView.this.n.get(Integer.valueOf(i))).intValue());
                    ShareBottomStickerView.this.h.e(((Integer) ShareBottomStickerView.this.n.get(Integer.valueOf(i))).intValue());
                } else {
                    ShareBottomStickerView.this.p.d(0);
                    ShareBottomStickerView.this.h.e(0);
                }
                ShareBottomStickerView shareBottomStickerView = ShareBottomStickerView.this;
                shareBottomStickerView.c((List<ShareDataInfo>) shareBottomStickerView.v);
            }
        }, 800L);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public void onDeleteSticker(int i) {
        pnb pnbVar;
        LogUtil.a("Share_ShareBottomStickerView", "onDeleteSticker position =", Integer.valueOf(i));
        if (this.h == null || (pnbVar = this.p) == null) {
            return;
        }
        if (pnbVar.b() != null) {
            this.p.b().setValidityType(-1);
            this.q.b(this.p);
        }
        this.h.d(-1);
        c(this.v);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public View getRootView() {
        return this.k;
    }
}
