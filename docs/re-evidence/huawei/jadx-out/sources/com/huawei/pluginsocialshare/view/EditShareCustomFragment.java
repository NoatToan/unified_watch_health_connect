package com.huawei.pluginsocialshare.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.activity.DownloadInterface;
import com.huawei.pluginsocialshare.adapter.EditShareAdapter;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.view.ShareSquareLayout;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.gxz;
import defpackage.gya;
import defpackage.gyc;
import defpackage.gyd;
import defpackage.gyg;
import defpackage.gyj;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pkm;
import defpackage.pld;
import defpackage.plg;
import defpackage.plm;
import defpackage.pmb;
import defpackage.pmc;
import defpackage.pmo;
import defpackage.pmu;
import defpackage.pnn;
import defpackage.pnq;
import defpackage.pnx;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class EditShareCustomFragment extends BaseFragment implements EditShareAdapter.OnBackgroundChangeListener, DownloadInterface {
    private boolean aa;
    private float ab;
    private String ac;
    private String ad;
    private RelativeLayout ae;
    private float af;
    private ImageView ag;
    private RelativeLayout ai;
    private HealthScrollView am;
    private int an;
    private gxy ao;
    private gxt ap;
    private ShareSquareLayout aq;
    private ShareButtonView ar;
    private ImageView as;
    private HealthRecycleView at;
    private pmb au;
    private gyd av;
    private String aw;
    private EditShareAdapter ax;
    private HealthRecycleView ay;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22577b;
    private HealthSwitchButton ba;
    private EditShareAdapter bb;
    private boolean f;
    private boolean g;
    private boolean h;
    private EditShareAdapter i;
    private HealthRecycleView j;
    private float k;
    private HealthColumnSystem m;
    private Bitmap n;
    private FrameLayout p;
    private Context q;
    private RelativeLayout u;
    private HealthTextView v;
    private boolean y;
    private String z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Rect f22576c = new Rect(0, 720, 1080, 1080);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Rect f22575a = new Rect(800, 48, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, 168);
    private static final Rect d = new Rect(0, 1046, 660, 1436);
    private static final int[] e = {R.mipmap.hw_health_edit_share_pic_stickers_gas, R.mipmap.hw_health_edit_share_pic_stickers_lightning, R.mipmap.hw_health_edit_share_pic_stickers_lightning2, R.mipmap.hw_health_edit_share_pic_stickers_sweat};
    private List<ShareDataInfo> o = new ArrayList(8);
    private List<ShareDataInfo> s = new ArrayList(8);
    private List<ShareDataInfo> ak = new ArrayList(8);
    private List<ShareDataInfo> aj = new ArrayList(8);
    private List<EditShareCommonView> r = new ArrayList(8);
    private int bf = -1;
    private int w = -1;
    private int az = -1;
    private int t = 0;
    private int l = 1;
    private int ah = -1;
    private int bc = -1;
    private int al = 0;
    private List<Integer> x = new ArrayList();

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyShareDataChanged(gyg gygVar) {
        LogUtil.a("Share_EditShareCustomFragment", "notifyShareDataChanged");
        this.aw = "path_type";
        e(gygVar);
        j(gygVar);
        g(gygVar);
        h(gygVar);
        updateAllFragment(true);
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyBackgroudChanged(gyg gygVar) {
        List<ShareDataInfo> listC = pnq.c(gygVar.b());
        pnq.d(listC);
        if (this.i != null) {
            if (this.aa || LanguageUtil.l(this.q)) {
                this.i.c(listC);
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyBackgroudFail() {
        if (this.i != null) {
            if ((this.aa || !LanguageUtil.l(this.q)) && !this.aa) {
                return;
            }
            this.i.b();
        }
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyDownloadDataFail() {
        c(this.ao.h());
        updateAllFragment(true);
    }

    private void e(gyg gygVar) {
        this.f22577b = true;
        List<ShareDataInfo> listC = pnq.c(gygVar.b());
        pnq.d(listC);
        this.o.clear();
        g();
        this.o.addAll(listC);
        d(listC);
    }

    private void j(gyg gygVar) {
        List<ShareDataInfo> listC = pnq.c(gygVar.d());
        pnq.d(listC);
        refreshDataMark(listC);
    }

    private void d(List<ShareDataInfo> list, boolean z) {
        Iterator<ShareDataInfo> it = list.iterator();
        while (it.hasNext()) {
            ShareDataInfo next = it.next();
            if (z && (next instanceof gya)) {
                if (this.x.contains(Integer.valueOf(((gya) next).b()))) {
                    it.remove();
                }
            } else if (next != null && this.x.contains(Integer.valueOf(next.getId()))) {
                it.remove();
            }
        }
    }

    private void g(gyg gygVar) {
        List<ShareDataInfo> listC = pnq.c(gygVar.c());
        pnq.d(listC);
        this.ak.clear();
        this.ak.addAll(listC);
    }

    private void h(gyg gygVar) {
        List<ShareDataInfo> listC = pnq.c(gygVar.e());
        pnq.d(listC);
        d(listC, true);
        this.aj.clear();
        this.aj.addAll(listC);
    }

    private void p() {
        j();
        if ((!TextUtils.isEmpty(this.ac) || (TextUtils.isEmpty(this.ad) && TextUtils.isEmpty(this.z))) && njy.c(this.aj, this.al) && (this.aj.get(this.al) instanceof gya)) {
            s();
        } else {
            r();
            refreshShareLayoutNoRecommend();
        }
    }

    private void r() {
        if (TextUtils.isEmpty(this.ad) || TextUtils.isEmpty(this.z)) {
            return;
        }
        d(CommonUtil.j(this.ad), CommonUtil.j(this.z), -1);
        if (this.l == -1) {
            this.l = 1;
        }
        if (this.t == -1) {
            this.t = 0;
        }
    }

    private void j() {
        if (!TextUtils.isEmpty(this.ac)) {
            for (int i = 0; i < this.aj.size(); i++) {
                ShareDataInfo shareDataInfo = this.aj.get(i);
                if (shareDataInfo != null && shareDataInfo.getId() == CommonUtil.j(this.ac)) {
                    this.al = i;
                    return;
                }
            }
            return;
        }
        if (TextUtils.isEmpty(this.ad) || TextUtils.isEmpty(this.z)) {
            return;
        }
        this.al = -1;
    }

    private void s() {
        if (njy.c(this.aj, this.al) && (this.aj.get(this.al) instanceof gya)) {
            gya gyaVar = (gya) this.aj.get(this.al);
            int iB = gyaVar.b();
            EditShareCommonView editShareCommonViewB = b(iB);
            if (editShareCommonViewB == null && !this.r.isEmpty() && this.r.get(0) != null) {
                editShareCommonViewB = this.r.get(0);
                iB = editShareCommonViewB.getWatermarkId();
            }
            int iE = gyaVar.e();
            String strD = d(iE, 2);
            if (TextUtils.isEmpty(strD) && this.o.size() > 1) {
                strD = this.o.get(1).getPath();
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            this.n = BitmapFactory.decodeFile(strD, options);
            this.aq.setBackground(new BitmapDrawable(this.q.getResources(), this.n));
            Bitmap bitmap = this.n;
            Rect rect = f22576c;
            this.bf = qqf.a(qqf.e(bitmap, rect));
            this.w = qqf.a(qqf.b(this.n, rect));
            this.az = qqf.a(qqf.e(this.n, f22575a));
            int iC = gyaVar.c();
            d(iE, iB, iC);
            if (this.l == -1) {
                this.l = 1;
            }
            w();
            if (editShareCommonViewB != null) {
                editShareCommonViewB.refreshUi(this.bf, this.w);
                editShareCommonViewB.refreshTopUi(this.az);
                View view = editShareCommonViewB.getView();
                if (view != null) {
                    b(view);
                }
            } else {
                u();
            }
            String strD2 = d(iC, 4);
            if (strD2 != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.q.getResources(), BitmapFactory.decodeFile(strD2, options));
                this.ag.setVisibility(0);
                this.ag.setBackground(bitmapDrawable);
            }
        }
    }

    private void d(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            if (this.o.get(i4).getId() == i) {
                this.l = i4;
                break;
            }
            this.l = -1;
        }
        for (int i5 = 0; i5 < this.s.size(); i5++) {
            if (this.s.get(i5).getId() == i2) {
                this.t = i5;
                break;
            }
            this.t = -1;
        }
        for (int i6 = 0; i6 < this.ak.size(); i6++) {
            if (this.ak.get(i6).getId() == i3) {
                this.ah = i6;
                this.bc = i6;
                return;
            } else {
                this.ah = -1;
                this.bc = -1;
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void refreshShareLayoutNoRecommend() {
        boolean z = EnvironmentInfo.m() || !(EnvironmentInfo.m() || this.l == 0);
        if (njy.b(this.o) && z && njy.c(this.o, this.l)) {
            ShareDataInfo shareDataInfo = this.o.get(this.l);
            if (shareDataInfo instanceof pmu) {
                this.n = BitmapFactory.decodeResource(this.q.getResources(), ((pmu) shareDataInfo).e());
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                this.n = BitmapFactory.decodeFile(this.o.get(this.l).getPath(), options);
            }
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            a(bitmap);
            this.aq.setBackground(qqf.d(this.n));
        }
        q();
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void updateAllFragment(boolean z) {
        p();
        EditShareAdapter editShareAdapter = this.ax;
        if (editShareAdapter != null) {
            editShareAdapter.b(this.ak, this.ah, false);
        }
        EditShareAdapter editShareAdapter2 = this.bb;
        if (editShareAdapter2 != null) {
            editShareAdapter2.b(this.s, this.t, false);
        }
        if (this.i != null) {
            if (this.j.getLayoutManager() instanceof GridLayoutManager) {
                if ((qrs.af(this.q) && this.o.size() > 15) || (!qrs.af(this.q) && this.o.size() > 9)) {
                    ((GridLayoutManager) this.j.getLayoutManager()).setSpanCount(2);
                } else {
                    ((GridLayoutManager) this.j.getLayoutManager()).setSpanCount(1);
                }
            }
            this.i.b(this.o, this.l, true);
        }
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void refreshDataMark(List<ShareDataInfo> list) {
        pnx pnxVar = new pnx(this.av, this.q);
        e(pnxVar);
        pnxVar.constructDownloadWatermarkViewList(list);
        pnxVar.setDoMainColor(this.w);
        pnxVar.setTopWidgetColor(this.az);
        pnxVar.setWidgetColor(this.bf);
        this.r.clear();
        for (EditShareCommonView editShareCommonView : pnxVar.getEditShareCommonViewList()) {
            if (editShareCommonView != null) {
                if (editShareCommonView.getIsNeedHide()) {
                    this.x.add(Integer.valueOf(editShareCommonView.getWatermarkId()));
                } else {
                    this.r.add(editShareCommonView);
                }
            }
        }
        this.s.clear();
        d(list, false);
        this.s.addAll(list);
    }

    private void e(pnx pnxVar) {
        gxt gxtVarE = this.ap;
        if (gxtVarE == null) {
            gxtVarE = pjm.e();
            LogUtil.a("Share_EditShareCustomFragment", "setRequestShareModule getShareContent");
        }
        if (gxtVarE == null) {
            LogUtil.j("Share_EditShareCustomFragment", "setRequestShareModule shareContent is null");
        } else {
            pnxVar.e(gxtVarE.o());
        }
    }

    private void q() {
        w();
        if (njy.c(this.r, this.t)) {
            EditShareCommonView editShareCommonView = this.r.get(this.t);
            editShareCommonView.refreshUi(this.bf, this.w);
            editShareCommonView.refreshTopUi(this.az);
            View view = editShareCommonView.getView();
            if (view != null) {
                b(view);
            }
        }
    }

    private void w() {
        if (njy.c(this.s, this.t) && (this.s.get(this.t) instanceof gyj)) {
            String strE = ((gyj) this.s.get(this.t)).e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strE, options);
            Rect rect = d;
            this.bf = qqf.a(qqf.e(bitmapDecodeFile, rect));
            this.w = qqf.a(qqf.b(bitmapDecodeFile, rect));
            this.az = qqf.a(qqf.e(bitmapDecodeFile, rect));
        }
    }

    private void a(Bitmap bitmap) {
        Rect rect = f22576c;
        this.bf = qqf.a(qqf.e(bitmap, rect));
        this.w = qqf.a(qqf.b(bitmap, rect));
        this.az = qqf.a(qqf.e(bitmap, f22575a));
    }

    private EditShareCommonView b(int i) {
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            EditShareCommonView editShareCommonView = this.r.get(i2);
            if (editShareCommonView.getWatermarkId() == i) {
                this.t = i2;
                return editShareCommonView;
            }
        }
        return null;
    }

    private String d(int i, int i2) {
        List arrayList = new ArrayList();
        if (i2 == 2) {
            arrayList = this.o;
        } else if (i2 == 4) {
            arrayList = this.ak;
        } else {
            LogUtil.a("Share_EditShareCustomFragment", "type is unknow");
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ShareDataInfo shareDataInfo = (ShareDataInfo) arrayList.get(i3);
            if (shareDataInfo.getId() == i) {
                if (i2 == 2) {
                    this.l = i3;
                } else {
                    this.ah = i3;
                }
                return shareDataInfo.getPath();
            }
        }
        return "";
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Share_EditShareCustomFragment", "onCreate");
        this.q = getContext();
        gxt gxtVarE = pjm.e();
        this.ap = gxtVarE;
        if (gxtVarE == null) {
            LogUtil.a("Share_EditShareCustomFragment", "EditShareActivity_data mShareContent is null");
            return;
        }
        for (gxy gxyVar : gxtVarE.e()) {
            if (gxyVar != null && gxyVar.m()) {
                pjm.d().c(this.q, gxyVar, ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo());
                break;
            }
        }
        gxy gxyVarC = pjm.c();
        this.ao = gxyVarC;
        if (gxyVarC == null) {
            LogUtil.a("Share_EditShareCustomFragment", "EditShareActivity_data mShareEditContent is null");
            return;
        }
        this.au = new pmb(this);
        this.m = new HealthColumnSystem(this.q, 1);
        this.y = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a("Share_EditShareCustomFragment", "enter onResume");
        setUserVisibleHint(getUserVisibleHint());
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        LogUtil.a("Share_EditShareCustomFragment", "setUserVisibleHint, isVisibleToUser :", Boolean.valueOf(z), " mIsFirst :", Boolean.valueOf(this.y));
        if (z && this.y) {
            t();
            o();
            f();
            this.y = false;
        }
    }

    private void f() {
        GridLayoutManager gridLayoutManager;
        if ((qrs.af(this.q) && this.o.size() > 15) || (!qrs.af(this.q) && this.o.size() > 9)) {
            gridLayoutManager = new GridLayoutManager(this.q, 2, 0, false);
        } else {
            gridLayoutManager = new GridLayoutManager(this.q, 1, 0, false);
        }
        this.j.setLayoutManager(gridLayoutManager);
        this.i = new EditShareAdapter(getActivity(), this.j, this.l, this, 1);
        if (!this.aa && LanguageUtil.l(this.q)) {
            this.i.a(new EditShareAdapter.OnMoreListener() { // from class: pob
                @Override // com.huawei.pluginsocialshare.adapter.EditShareAdapter.OnMoreListener
                public final void onLoadingMore() {
                    this.e.e();
                }
            });
        }
        this.i.b(this.o, this.l, true);
        this.j.setAdapter(this.i);
        this.ay.setLayoutManager(new GridLayoutManager(this.q, 1, 0, false));
        EditShareAdapter editShareAdapter = new EditShareAdapter(getActivity(), this.ay, this.t, this, 2);
        this.bb = editShareAdapter;
        editShareAdapter.b(this.s, this.t, false);
        this.ay.setAdapter(this.bb);
        this.at.setLayoutManager(new GridLayoutManager(this.q, 1, 0, false));
        EditShareAdapter editShareAdapter2 = new EditShareAdapter(getActivity(), this.at, this.ah, this, 3);
        this.ax = editShareAdapter2;
        editShareAdapter2.b(this.ak, this.ah, false);
        this.at.setAdapter(this.ax);
    }

    public /* synthetic */ void e() {
        int iH = this.ao.h();
        if (this.f22577b) {
            pmb pmbVar = this.au;
            if (pmbVar != null) {
                pmbVar.c(true, getActivity(), iH);
            }
            this.i.c();
        }
    }

    private void d(List<ShareDataInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ShareDataInfo shareDataInfo : list) {
            if (!(shareDataInfo instanceof plg) && !(shareDataInfo instanceof pmu)) {
                arrayList.add(shareDataInfo);
            }
        }
        this.i.a(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.hw_health_custom_layout, viewGroup, false);
        this.ae = (RelativeLayout) viewInflate.findViewById(R.id.activity_main);
        if (LanguageUtil.ba(this.q)) {
            this.ae.setRotationY(180.0f);
        }
        a(viewInflate);
        l();
        e(viewInflate);
        return viewInflate;
    }

    private void e(View view) {
        ShareButtonView shareButtonView = (ShareButtonView) view.findViewById(R.id.share_button_view);
        this.ar = shareButtonView;
        shareButtonView.setShareContent(this.ap);
        this.ar.setPerViewImage(this.aq);
        this.ar.setLogLayout(this.ai);
        this.ar.setBeforeClick(new ShareButtonView.DoBeforeClick() { // from class: com.huawei.pluginsocialshare.view.EditShareCustomFragment.2
            @Override // com.huawei.pluginsocialshare.view.ShareButtonView.DoBeforeClick
            public void onBeforeClick() {
                HashMap<String, String> map = new HashMap<>();
                EditShareCustomFragment.this.b(map);
                EditShareCustomFragment.this.ar.setMap(map);
            }
        });
    }

    private void l() {
        this.ac = SharedPreferenceManager.e(this.q, Integer.toString(20002), "shareLastRecommend" + this.ao.h());
        this.ad = SharedPreferenceManager.e(this.q, Integer.toString(20002), "shareLastBackground" + this.ao.h());
        String strE = SharedPreferenceManager.e(this.q, Integer.toString(20002), "shareLastDataMark" + this.ao.h());
        this.z = strE;
        LogUtil.a("Share_EditShareCustomFragment", "mLastRecommendId --", this.ac, "--mLastBackgroundId--", this.ad, "--mLastDataMarkId--", strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, int i) {
        LogUtil.a("Share_EditShareCustomFragment", "enter downLoadShareSource");
        if (z) {
            pmo.d(i);
        }
        pmb pmbVar = this.au;
        if (pmbVar != null) {
            if (this.aa) {
                pmbVar.d(true, (Activity) getActivity(), i, false);
            } else {
                pmbVar.d(true, (Activity) getActivity(), i, true);
            }
        }
    }

    private void a(View view) {
        this.ai = (RelativeLayout) view.findViewById(R.id.hw_health_share_log);
        this.as = (ImageView) view.findViewById(R.id.hw_health_edit_share_logo);
        this.v = (HealthTextView) view.findViewById(R.id.hw_health_edit_share_tv);
        this.aq = (ShareSquareLayout) view.findViewById(R.id.hw_health_edit_share_show);
        this.u = (RelativeLayout) view.findViewById(R.id.download_error_layout);
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.sub_header_backgroud);
        HealthSubHeader healthSubHeader2 = (HealthSubHeader) view.findViewById(R.id.sub_header_watermark);
        HealthSubHeader healthSubHeader3 = (HealthSubHeader) view.findViewById(R.id.sub_header_stick);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        healthSubHeader2.setSubHeaderBackgroundColor(0);
        healthSubHeader3.setSubHeaderBackgroundColor(0);
        this.u.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.view.EditShareCustomFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                EditShareCustomFragment.this.u.setVisibility(8);
                EditShareCustomFragment.this.d(true, EditShareCustomFragment.this.ao.h());
            }
        });
        b(false);
        this.p = (FrameLayout) view.findViewById(R.id.hw_health_edit_share_activity_show);
        this.ag = (ImageView) view.findViewById(R.id.water_mack_imgview);
        HealthScrollView healthScrollView = (HealthScrollView) view.findViewById(R.id.hw_health_edit_share_scrollview);
        this.am = healthScrollView;
        healthScrollView.setOverScrollable(false);
        this.j = (HealthRecycleView) view.findViewById(R.id.rv_backgroud);
        this.ay = (HealthRecycleView) view.findViewById(R.id.rv_watermark);
        this.at = (HealthRecycleView) view.findViewById(R.id.rv_stick);
        f(view);
        ad();
    }

    private void f(View view) {
        if (CommonUtil.bu() || CommonUtil.ap()) {
            return;
        }
        ((RelativeLayout) view.findViewById(R.id.layout_share_userinfo)).setVisibility(0);
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.sub_header_userinfo);
        healthSubHeader.setVisibility(0);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) view.findViewById(R.id.share_userinfo_switch);
        this.ba = healthSwitchButton;
        healthSwitchButton.setChecked(pnq.j());
        this.ba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.pluginsocialshare.view.EditShareCustomFragment$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f22578b.e(compoundButton, z);
            }
        });
    }

    /* synthetic */ void e(CompoundButton compoundButton, boolean z) {
        if (this.f) {
            LogUtil.a("Share_EditShareCustomFragment", "just update status");
            this.f = false;
            d(z);
        } else if (z) {
            pnq.c(true);
            d(true);
        } else {
            pnq.b(this.q, R.string.IDS_share_close_info_title, R.string.IDS_share_info_content_now, new View.OnClickListener() { // from class: pnw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.c(view);
                }
            }, new View.OnClickListener() { // from class: poc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.d(view);
                }
            });
        }
    }

    public /* synthetic */ void c(View view) {
        pnq.c(false);
        d(false);
    }

    public /* synthetic */ void d(View view) {
        this.ba.setChecked(true);
    }

    public void b(boolean z) {
        if (Utils.o() && z) {
            this.as.setVisibility(8);
            this.v.setText(R.string.IDS_hwh_motiontrack_edit_share_data);
        } else {
            this.as.setVisibility(0);
            this.v.setText(R.string.IDS_app_name_health);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ad();
    }

    private void ad() {
        if (this.aq == null || this.q == null || this.ai == null) {
            LogUtil.j("Share_EditShareCustomFragment", "mShareLayout mContext or mLogoLayout is null");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.g = activity.isInMultiWindowMode();
        }
        LogUtil.a("Share_EditShareCustomFragment", "tahitiAdaptation isMultiWindowMode:", Boolean.valueOf(this.g));
        this.an = getResources().getDisplayMetrics().widthPixels;
        this.h = EnvironmentInfo.m() && qrs.ab(this.q);
        if (qrs.af(this.q) || this.m.j() >= 8 || this.h) {
            aa();
            return;
        }
        if (this.g) {
            v();
            return;
        }
        ImageView imageView = this.ag;
        HealthScrollView healthScrollView = this.am;
        int i = this.an;
        imageView.setOnTouchListener(new plm(healthScrollView, i, i));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.ag.setLayoutParams(layoutParams);
        this.aq.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.height = qrs.d(this.q, 48.0f);
        this.ai.setLayoutParams(layoutParams2);
    }

    private void v() {
        ImageView imageView = this.ag;
        HealthScrollView healthScrollView = this.am;
        int i = this.an;
        imageView.setOnTouchListener(new plm(healthScrollView, i, i));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        int iD = qrs.d(this.q, this.an < 1080 || getResources().getDisplayMetrics().heightPixels > 1800 ? 24.0f : 100.0f);
        int iD2 = qrs.d(this.q, 0.0f);
        layoutParams.setMargins(iD, iD2, iD, iD2);
        layoutParams.width = this.an;
        layoutParams.height = -2;
        this.aq.setLayoutParams(layoutParams);
    }

    private void aa() {
        float f;
        HealthColumnSystem healthColumnSystem;
        this.af = this.q.getResources().getDimension(R.dimen.maxPaddingStart);
        if (this.h) {
            this.k = this.m.a(2) + this.q.getResources().getDimension(R.dimen.hw_group_view_height_64dp);
            f = 0.0f;
        } else {
            int i = 4;
            if (qrs.ah(this.q)) {
                if (this.g) {
                    healthColumnSystem = this.m;
                } else {
                    healthColumnSystem = this.m;
                    i = 6;
                }
                this.k = healthColumnSystem.a(i);
            } else {
                this.k = this.m.a(4) + this.q.getResources().getDimension(R.dimen.hw_show_public_margin_20dp);
            }
            f = 28.0f;
        }
        float f2 = this.af;
        float f3 = this.k;
        this.ab = f2 + f3;
        int i2 = (int) f3;
        this.ag.setOnTouchListener(new plm(this.am, i2, i2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.ag.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.height = (int) this.k;
        layoutParams2.width = (int) this.k;
        layoutParams2.addRule(13);
        layoutParams2.setMargins(qrs.d(this.q, this.ab), qrs.d(this.q, f), qrs.d(this.q, this.ab), qrs.d(this.q, 0.0f));
        this.aq.setLayoutParams(layoutParams2);
        int iD = qrs.d(this.q, 28.0f);
        int iA = (int) (this.m.a(2) + qqp.b(this.q) + this.af);
        if (qrs.ah(this.q)) {
            iA = (int) (this.m.a(1) + qqp.b(this.q) + this.af);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, iD + qrs.d(this.q, 8.0f));
        layoutParams3.setMarginStart(iA);
        layoutParams3.setMarginEnd(iA);
        this.ai.setLayoutParams(layoutParams3);
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void showDownloadError() {
        LogUtil.a("Share_EditShareCustomFragment", "showDownloadError");
        this.u.setVisibility(0);
    }

    private void d(gyg gygVar) {
        if (gygVar == null || njy.e(gygVar.d())) {
            k();
        } else {
            this.ak.clear();
            this.ak.addAll(gygVar.c());
        }
    }

    private void k() {
        this.ak.clear();
        h();
    }

    private void h() {
        this.ak.clear();
        for (int i : e) {
            pmu pmuVar = new pmu();
            pmuVar.a(i);
            this.ak.add(pmuVar);
        }
    }

    private void t() {
        if (CommonUtil.ca() || Utils.k()) {
            m();
            return;
        }
        int iH = this.ao.h();
        this.aa = Utils.o();
        this.av = this.ao.k();
        if (CommonUtil.ab(this.q) && ((!this.aa && LanguageUtil.l(this.q)) || this.aa)) {
            this.aw = "path_type";
            c(iH);
            d(true, iH);
        } else if (!CommonUtil.ab(BaseApplication.getContext()) && ((!this.aa && LanguageUtil.l(BaseApplication.getContext())) || this.aa)) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_connect_error);
            c(iH);
        } else {
            m();
        }
    }

    private void c(int i) {
        gyg gygVarD = pmc.a().d(i);
        b(gygVarD);
        a(gygVarD);
        d(gygVarD);
        c(gygVarD);
    }

    private void c(gyg gygVar) {
        if (gygVar == null || !njy.b(gygVar.e())) {
            return;
        }
        List<ShareDataInfo> listE = gygVar.e();
        d(listE, true);
        this.aj.clear();
        this.aj.addAll(listE);
    }

    private void b(gyg gygVar) {
        List<Integer> listN = this.ao.n();
        if (gygVar == null || njy.e(gygVar.b())) {
            this.aw = "id_type";
            b(listN);
        } else {
            this.aw = "path_type";
            c(gygVar.b());
        }
    }

    private void m() {
        this.aw = "id_type";
        b(this.ao.n());
        n();
        k();
    }

    private void a(gyg gygVar) {
        if (gygVar == null || njy.e(gygVar.d())) {
            n();
        } else {
            refreshDataMark(gygVar.d());
        }
    }

    private void n() {
        List<EditShareCommonView> listA = a(this.ao.o());
        this.s.clear();
        this.r.clear();
        for (EditShareCommonView editShareCommonView : listA) {
            if (editShareCommonView != null && !editShareCommonView.getIsNeedHide()) {
                pmu pmuVar = new pmu();
                pmuVar.a(editShareCommonView.getBitmap());
                pmuVar.setId(editShareCommonView.getWatermarkId());
                this.s.add(pmuVar);
                this.r.add(editShareCommonView);
            }
        }
    }

    private List<EditShareCommonView> a(List<gxz> list) {
        if (njy.e(list)) {
            LogUtil.j("Share_EditShareCustomFragment", "constructLocalDefaultWatermark localDefaultWatermarkInfoList is null");
            return new ArrayList(0);
        }
        LogUtil.a("Share_EditShareCustomFragment", "constructLocalDefaultWatermark");
        pnx pnxVar = new pnx(this.ao.k(), this.q);
        pnxVar.setDoMainColor(this.w);
        pnxVar.setTopWidgetColor(this.bf);
        pnxVar.setWidgetColor(this.bf);
        e(pnxVar);
        LogUtil.a("Share_EditShareCustomFragment", "localDefaultWatermarkInfoList size:", Integer.valueOf(list.size()));
        pnxVar.constructLocalDefaultWatermarkViewList(list);
        LogUtil.a("Share_EditShareCustomFragment", "editShareCommonViewList size:", Integer.valueOf(pnxVar.getEditShareCommonViewList().size()));
        ArrayList arrayList = new ArrayList(8);
        for (EditShareCommonView editShareCommonView : pnxVar.getEditShareCommonViewList()) {
            if (editShareCommonView != null && !editShareCommonView.getIsNeedHide()) {
                arrayList.add(editShareCommonView);
            }
        }
        return arrayList;
    }

    private void b(List<Integer> list) {
        this.o.clear();
        g();
        if (njy.e(list)) {
            return;
        }
        for (Integer num : list) {
            int iIntValue = num.intValue();
            pmu pmuVar = new pmu();
            pmuVar.a(iIntValue);
            Integer num2 = pld.d.get(num);
            if (num2 != null) {
                pmuVar.setId(num2.intValue());
            }
            this.o.add(pmuVar);
        }
    }

    private void g() {
        if (EnvironmentInfo.m()) {
            return;
        }
        pmu pmuVar = new pmu();
        pmuVar.a(R.mipmap.hw_health_edit_share_photo_pic);
        pmuVar.setId(-1);
        this.o.add(0, pmuVar);
    }

    private void c(List<ShareDataInfo> list) {
        this.o.clear();
        g();
        this.o.addAll(list);
    }

    private void o() {
        p();
    }

    private void x() {
        Bitmap bitmapDecodeResource;
        LogUtil.a("Share_EditShareCustomFragment", "refreshSticker");
        this.ag.setVisibility(0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        if (njy.c(this.ak, this.ah)) {
            if ("path_type".equals(this.aw)) {
                bitmapDecodeResource = BitmapFactory.decodeFile(this.ak.get(this.ah).getPath(), options);
            } else {
                if (!(this.ak.get(this.ah) instanceof pmu)) {
                    return;
                }
                bitmapDecodeResource = BitmapFactory.decodeResource(this.q.getResources(), ((pmu) this.ak.get(this.ah)).e(), options);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.q.getResources(), bitmapDecodeResource);
            b(this.ag, bitmapDrawable);
            this.ag.setBackground(bitmapDrawable);
        }
    }

    private void b(View view, Drawable drawable) {
        int top = ((ViewGroup) view.getParent()).getTop();
        int top2 = view.getTop() + (view.getHeight() / 2);
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i = (left + width) - (intrinsicWidth / 2);
        int i2 = top2 - (intrinsicHeight / 2);
        ((RelativeLayout.LayoutParams) view.getLayoutParams()).setMargins(i, i2, 0, 0);
        if (this.an - view.getLeft() < intrinsicWidth && (this.an + top) - top2 < intrinsicHeight) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            int i3 = this.an;
            layoutParams.setMargins(i3 - intrinsicWidth, (top + i3) - intrinsicHeight, 0, 0);
        } else if (this.an - view.getLeft() < intrinsicWidth) {
            ((RelativeLayout.LayoutParams) view.getLayoutParams()).setMargins(this.an - intrinsicWidth, i2, 0, 0);
        } else if ((this.an + top) - top2 < intrinsicHeight) {
            ((RelativeLayout.LayoutParams) view.getLayoutParams()).setMargins(i, (top + this.an) - intrinsicHeight, 0, 0);
        }
    }

    private void b(View view) {
        this.p.removeAllViews();
        this.p.removeAllViewsInLayout();
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.p.addView(view);
    }

    private void u() {
        this.p.removeAllViews();
        this.p.removeAllViewsInLayout();
    }

    private Bitmap i() {
        this.ai.setVisibility(0);
        LogUtil.a("Share_EditShareCustomFragment", "getWatermarkBitmap mWaterMarkLayout");
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(this.ai.getMeasuredWidth(), this.ai.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            this.ai.draw(canvas);
            canvas.save();
            canvas.restore();
        } catch (IllegalArgumentException | IllegalStateException | OutOfMemoryError unused) {
            LogUtil.a("Share_EditShareCustomFragment", "createBitmap failed!");
        }
        this.ai.setVisibility(4);
        return bitmapCreateBitmap;
    }

    public void b(int i, Intent intent) {
        b(true);
        if (i == 2) {
            d(intent);
        } else if (i == 3) {
            e(intent);
        } else {
            if (i != 4) {
                return;
            }
            pkm.e(getActivity());
        }
    }

    private void d(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginsocialshare.view.EditShareCustomFragment.5
            @Override // java.lang.Runnable
            public void run() {
                pkm.e(EditShareCustomFragment.this.getActivity(), intent);
            }
        });
    }

    private void e(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginsocialshare.view.EditShareCustomFragment.4
            @Override // java.lang.Runnable
            public void run() {
                EditShareCustomFragment.this.a(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        LogUtil.a("Share_EditShareCustomFragment", "dealCropResult");
        String stringExtra = intent.getStringExtra("bitmap");
        if (stringExtra == null) {
            LogUtil.e("Share_EditShareCustomFragment", "dealCropResult:bitmapPath from intent is null!");
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        this.n = qqf.c(stringExtra, options);
        FragmentActivity activity = getActivity();
        if (this.n == null || activity == null) {
            LogUtil.j("Share_EditShareCustomFragment", "dealCropResult:bitmap or activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: poe
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d();
                }
            });
            a(stringExtra);
        }
    }

    public /* synthetic */ void d() {
        this.i.e();
        b(this.n);
    }

    private void a(String str) {
        pnn.b(str);
    }

    private void b(Bitmap bitmap) {
        LogUtil.a("Share_EditShareCustomFragment", "refreshBackgroundOnUi");
        e(bitmap);
    }

    private void e(Bitmap bitmap) {
        LogUtil.a("Share_EditShareCustomFragment", "refreshBackground");
        if (this.aq != null) {
            this.aq.setBackground(new BitmapDrawable(this.q.getResources(), bitmap));
        }
        a(bitmap);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HashMap<String, String> map) {
        map.put("currentSportType", Integer.toString(this.ao.h()));
        int i = this.l;
        if (i == 0) {
            if (this.o != null && this.i.d().size() > 0) {
                this.o.add(1, this.i.d().get(0));
            }
            i = 1;
        }
        map.put("shareLastRecommend" + this.ao.h(), "");
        if (njy.c(this.o, i)) {
            ShareDataInfo shareDataInfo = this.o.get(i);
            pjm.e(shareDataInfo instanceof gyc ? (gyc) shareDataInfo : null);
            map.put("shareLastBackground" + this.ao.h(), Integer.toString(shareDataInfo.getId()));
        }
        if (njy.c(this.s, this.t)) {
            map.put("shareLastDataMark" + this.ao.h(), Integer.toString(this.s.get(this.t).getId()));
        }
    }

    private void y() {
        View view;
        pmb pmbVar = this.au;
        if (pmbVar != null) {
            pmbVar.c(getActivity());
            this.au.c();
            this.au = null;
        }
        if (this.p == null) {
            LogUtil.a("Share_EditShareCustomFragment", "removeView: mDataModelLayout null");
            return;
        }
        List<EditShareCommonView> list = this.r;
        if (list == null || list.isEmpty()) {
            LogUtil.a("Share_EditShareCustomFragment", "removeView:mDataMarkViewList empty");
            return;
        }
        LogUtil.a("Share_EditShareCustomFragment", "removeView:start");
        this.p.removeAllViews();
        this.p.removeAllViewsInLayout();
        int i = this.t;
        if (i < 0 || i >= this.r.size() || (view = this.r.get(this.t).getView()) == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public void a() {
        gxt gxtVar;
        Bitmap bitmapC = qqf.c(this.aq);
        if (bitmapC == null) {
            LogUtil.a("Share_EditShareCustomFragment", "share pic is null ");
            return;
        }
        Bitmap bitmapE = qqf.e(bitmapC, 0, i(), bitmapC.getHeight());
        LogUtil.a("Share_EditShareCustomFragment", "onClick: screenCut: ", bitmapE);
        if (bitmapE == null) {
            LogUtil.j("Share_EditShareCustomFragment", "onClick: screenCut is null!");
            return;
        }
        LogUtil.a("Share_EditShareCustomFragment", "onClick:screenCut.getByteCount() size: ", Integer.valueOf(bitmapE.getByteCount()));
        if (bitmapE.getByteCount() > 1048576) {
            gxtVar = new gxt(4);
            String strE = pnq.e(this.q, "EditShareActivity_Share.webp", bitmapE);
            LogUtil.a("Share_EditShareCustomFragment", "onClick:saved= ", strE);
            gxtVar.c(strE);
        } else {
            gxtVar = new gxt(1);
            gxtVar.d(bitmapE);
        }
        gxtVar.f(false);
        gxtVar.d(this.ao.g());
        HashMap<String, String> map = new HashMap<>();
        b(map);
        gxtVar.c(this.ao.e());
        gxtVar.b(map);
        gxtVar.e(false);
        pjm.e(gxtVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ThreadPoolManager.c().execute(new Runnable() { // from class: pnz
            @Override // java.lang.Runnable
            public final void run() {
                pmc.a().e();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        y();
    }

    @Override // com.huawei.pluginsocialshare.adapter.EditShareAdapter.OnBackgroundChangeListener
    public void onBackgroundChange(int i, int i2, View view) {
        if (view instanceof ShareRecycleScrollItemView) {
            ShareRecycleScrollItemView shareRecycleScrollItemView = (ShareRecycleScrollItemView) view;
            if (i == 1) {
                this.o.clear();
                this.o.addAll(this.i.a());
                this.l = i2;
                if (i2 == 0 && getActivity() != null && !EnvironmentInfo.m()) {
                    shareRecycleScrollItemView.c(getActivity());
                    return;
                } else {
                    b(false);
                    refreshShareLayoutNoRecommend();
                    return;
                }
            }
            if (i == 2) {
                this.s.clear();
                this.s.addAll(this.bb.a());
                this.t = i2;
                refreshShareLayoutNoRecommend();
                return;
            }
            if (i != 3) {
                return;
            }
            this.ak.clear();
            this.ak.addAll(this.ax.a());
            if (this.bc == i2 && !shareRecycleScrollItemView.isSelected()) {
                this.ah = -1;
                this.ag.setVisibility(8);
                this.bc = -1;
            } else {
                this.ah = i2;
                x();
                this.bc = i2;
            }
        }
    }

    public void b() {
        boolean zJ;
        if (CommonUtil.bu() || CommonUtil.ap() || this.ba == null || this.ba.isChecked() == (zJ = pnq.j())) {
            return;
        }
        this.f = true;
        this.ba.setChecked(zJ);
    }

    private void d(boolean z) {
        if (njy.e(this.r)) {
            return;
        }
        for (EditShareCommonView editShareCommonView : this.r) {
            if (editShareCommonView != null) {
                if (!z) {
                    editShareCommonView.setUserInfo(null, null);
                } else {
                    editShareCommonView.setUserInfo(pnq.d(this.q), pnq.a());
                }
            }
        }
    }
}
