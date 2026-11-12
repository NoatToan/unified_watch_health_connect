package com.huawei.pluginsocialshare.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.adapter.EditShareAdapter;
import com.huawei.pluginsocialshare.view.ShareButtonView;
import com.huawei.pluginsocialshare.view.ShareRecycleScrollItemView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.view.ShareSquareLayout;
import defpackage.gxt;
import defpackage.gxz;
import defpackage.gyd;
import defpackage.gyg;
import defpackage.lsv;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pkm;
import defpackage.pld;
import defpackage.pmb;
import defpackage.pmc;
import defpackage.pmu;
import defpackage.pnn;
import defpackage.pnq;
import defpackage.pnx;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CustomizeShareActivity extends BaseActivity implements EditShareAdapter.OnBackgroundChangeListener, DownloadInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f22426a = {R.drawable.share_geometry_1, R.drawable.share_geometry_2, R.drawable.share_geometry_3};
    private gyd ab;
    private String ad;
    private HealthSubHeader ae;
    private CustomTitleBar af;
    private HealthSwitchButton ah;
    private EditShareAdapter ai;
    private HealthRecycleView aj;
    private String al;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EditShareAdapter f22428c;
    private Bitmap d;
    private FrameLayout g;
    private CustomizeShareActivity h;
    private RelativeLayout l;
    private int m;
    private TextView o;
    private ShareSquareLayout p;
    private boolean q;
    private View r;
    private List<gxz> t;
    private View u;
    private ShareButtonView v;
    private HealthRecycleView x;
    private gxt y;
    private pmb z;
    private List<Integer> k = new ArrayList();
    private List<ShareDataInfo> j = new ArrayList(8);
    private String ag = "id_type";
    private double aa = 4.0d;
    private int f = 1;
    private int am = 0;
    private List<ShareDataInfo> i = new ArrayList();
    private List<Integer> n = new ArrayList();
    private List<EditShareCommonView> w = new ArrayList();
    private Map<String, Object> ac = new HashMap(10);
    private boolean e = true;
    private boolean s = false;

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyBackgroudChanged(gyg gygVar) {
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyBackgroudFail() {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(R.anim.left_enter, R.anim.left_exit);
        super.onCreate(bundle);
        setContentView(R.layout.activity_step_detail_share);
        cancelAdaptRingRegion();
        this.h = this;
        if (!LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
            finish();
            return;
        }
        c();
        k();
        p();
        l();
        r();
        q();
    }

    private void r() {
        this.v = (ShareButtonView) findViewById(R.id.share_button_view);
        gxt gxtVar = new gxt(1);
        this.y = gxtVar;
        gxtVar.d(4);
        this.y.f(false);
        this.y.d(this.ad);
        int i = this.m;
        if (i == 10002) {
            this.ac.put("event", "1");
            this.ac.put("shareStyle", "customized_sharing");
        } else {
            this.ac.put(BleConstants.SPORT_TYPE, Integer.valueOf(i));
        }
        this.y.c(this.ac);
        this.v.setShareContent(this.y);
        this.v.setPerViewImage(this.p);
        this.v.setLogLayout(this.r);
    }

    private void c(gyg gygVar) {
        if (gygVar == null || njy.e(gygVar.d())) {
            n();
        } else {
            refreshDataMark(gygVar.d());
        }
    }

    private void n() {
        this.i.clear();
        for (EditShareCommonView editShareCommonView : this.w) {
            if (editShareCommonView != null && !editShareCommonView.getIsNeedHide()) {
                pmu pmuVar = new pmu();
                pmuVar.a(editShareCommonView.getBitmap());
                pmuVar.setId(editShareCommonView.getWatermarkId());
                this.i.add(pmuVar);
            }
        }
    }

    private void k() {
        for (int i : f22426a) {
            this.k.add(Integer.valueOf(i));
        }
    }

    private void d(gyg gygVar) {
        if (gygVar == null || njy.e(gygVar.b())) {
            this.ag = "id_type";
            a(this.k);
        } else {
            this.ag = "path_type";
            e(gygVar.b());
        }
    }

    private void c() {
        this.g = (FrameLayout) findViewById(R.id.hw_health_edit_share_activity_show);
        this.u = findViewById(R.id.share_watermark_icon);
        this.r = findViewById(R.id.logo_layout);
        this.o = (TextView) findViewById(R.id.share_watermark_text);
        this.af = (CustomTitleBar) findViewById(R.id.hw_health_edit_share_titlebar);
        this.p = (ShareSquareLayout) findViewById(R.id.hw_health_edit_share_show);
        this.aj = (HealthRecycleView) findViewById(R.id.rv_watermark);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.sub_watermark_header);
        this.ae = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(0);
        ((HealthSubHeader) findViewById(R.id.sub_header)).setSubHeaderBackgroundColor(0);
        a(false);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.download_error_layout);
        this.l = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.activity.CustomizeShareActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomizeShareActivity.this.l.setVisibility(8);
                CustomizeShareActivity.this.i();
            }
        });
        setViewSafeRegion(false, (LinearLayout) findViewById(R.id.multiple_source_choose));
        h();
        e();
        t();
        pnq.a((View) this.p, (Context) this.h, false);
    }

    private void q() {
        if (CommonUtil.bu() || CommonUtil.ap()) {
            return;
        }
        ((RelativeLayout) findViewById(R.id.layout_share_userinfo)).setVisibility(0);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.sub_header_userinfo);
        healthSubHeader.setVisibility(0);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.share_userinfo_switch);
        this.ah = healthSwitchButton;
        healthSwitchButton.setChecked(pnq.j());
        this.ah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.pluginsocialshare.activity.CustomizeShareActivity$$ExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.e.b(compoundButton, z);
            }
        });
    }

    /* synthetic */ void b(CompoundButton compoundButton, boolean z) {
        if (this.f22427b) {
            LogUtil.a("Share_StepDetailShareActivity", "just update status");
            this.f22427b = false;
            e();
        } else if (z) {
            pnq.c(true);
            e();
        } else {
            pnq.b(this.h, R.string.IDS_share_close_info_title, R.string.IDS_share_info_content_now, new View.OnClickListener() { // from class: pjq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45518b.a(view);
                }
            }, new View.OnClickListener() { // from class: pjy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.e(view);
                }
            });
        }
    }

    public /* synthetic */ void a(View view) {
        pnq.c(false);
        e();
    }

    public /* synthetic */ void e(View view) {
        this.ah.setChecked(true);
    }

    private void h() {
        File fileF;
        Intent intent = getIntent();
        if (intent == null) {
            ReleaseLogUtil.e("Share_StepDetailShareActivity", "getIntentData intent is null");
            return;
        }
        if (!(intent.getSerializableExtra("shareWaterMarkData") instanceof gyd) || !(intent.getSerializableExtra("waterMarkIds") instanceof List)) {
            LogUtil.j("Share_StepDetailShareActivity", "addCardBottomView, input error");
            finish();
            return;
        }
        this.ab = (gyd) intent.getSerializableExtra("shareWaterMarkData");
        int intExtra = intent.getIntExtra("downLoadId", 999);
        this.m = intExtra;
        if (intExtra == 10002 && ((fileF = f()) == null || !fileF.exists())) {
            LogUtil.j("Share_StepDetailShareActivity", "getWatermarkThumbnail no image");
            finish();
            return;
        }
        this.e = intent.getBooleanExtra("isDownloadMarkFromCloud", false);
        this.al = intent.getStringExtra("shareSource");
        String stringExtra = intent.getStringExtra("shareModuleId");
        this.ad = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.ad = AnalyticsValue.HEALTH_SHARE_STEP_DAILY_SHARE_2100001.value();
        }
        LogUtil.a("Share_StepDetailShareActivity", "getIntentData mShareModuleId: ", this.ad);
        this.t = (List) intent.getSerializableExtra("waterMarkIds");
    }

    private void e() {
        if (this.ab == null || this.t == null) {
            LogUtil.j("Share_StepDetailShareActivity", "addCardBottomView, input is null");
            finish();
            return;
        }
        pnx pnxVar = new pnx(this.ab, this.h);
        pnxVar.setDoMainColor(-1);
        pnxVar.setTopWidgetColor(-1);
        pnxVar.setWidgetColor(-1);
        pnxVar.constructLocalDefaultWatermarkViewList(this.t);
        List<EditShareCommonView> editShareCommonViewList = pnxVar.getEditShareCommonViewList();
        this.w = editShareCommonViewList;
        if (njy.e(editShareCommonViewList)) {
            return;
        }
        if (!this.e) {
            this.ae.setVisibility(8);
            this.aj.setVisibility(8);
        } else {
            this.ae.setVisibility(0);
            this.aj.setVisibility(0);
        }
        EditShareCommonView editShareCommonView = this.w.get(0);
        editShareCommonView.refreshUi(-1, -1);
        editShareCommonView.refreshTopUi(-1);
        View view = editShareCommonView.getView();
        if (view != null) {
            b(view);
        }
    }

    private void b(View view) {
        this.g.removeAllViews();
        this.g.removeAllViewsInLayout();
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.g.addView(view);
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void refreshDataMark(List<ShareDataInfo> list) {
        pnx pnxVar = new pnx(this.ab, this.h);
        pnxVar.constructDownloadWatermarkViewList(list);
        pnxVar.setDoMainColor(-1);
        pnxVar.setTopWidgetColor(-1);
        pnxVar.setWidgetColor(-1);
        this.w.clear();
        for (EditShareCommonView editShareCommonView : pnxVar.getEditShareCommonViewList()) {
            if (editShareCommonView != null) {
                if (editShareCommonView.getIsNeedHide()) {
                    this.n.add(Integer.valueOf(editShareCommonView.getWatermarkId()));
                } else {
                    this.w.add(editShareCommonView);
                    this.ac.put("dataID", Integer.valueOf(editShareCommonView.getWatermarkId()));
                }
            }
        }
        this.i.clear();
        d(list, this.n);
        this.i.addAll(list);
    }

    private void d(List<ShareDataInfo> list, List<Integer> list2) {
        Iterator<ShareDataInfo> it = list.iterator();
        while (it.hasNext()) {
            ShareDataInfo next = it.next();
            if (next != null && list2.contains(Integer.valueOf(next.getId()))) {
                it.remove();
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void refreshShareLayoutNoRecommend() {
        boolean z = EnvironmentInfo.m() || !(EnvironmentInfo.m() || this.f == 0);
        if (njy.b(this.j) && z && njy.c(this.j, this.f)) {
            if ("path_type".equals(this.ag)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                this.d = a(this.j.get(this.f).getPath(), options);
            } else if (this.j.get(this.f) instanceof pmu) {
                this.d = BitmapFactory.decodeResource(this.h.getResources(), ((pmu) this.j.get(this.f)).e());
            }
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            this.p.setBackground(qqf.d(bitmap));
        }
        if (njy.c(this.j, this.f)) {
            this.ac.put("backgroundID", Integer.valueOf(this.j.get(this.f).getId()));
        }
    }

    private Bitmap a(String str, BitmapFactory.Options options) {
        Bitmap bitmapC = qqf.c(str, options);
        if (bitmapC != null) {
            return bitmapC;
        }
        LogUtil.a("Share_StepDetailShareActivity", "decodeImageFromFile RGB_565");
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return qqf.c(str, options);
    }

    private void l() {
        GridLayoutManager gridLayoutManager;
        this.x = (HealthRecycleView) findViewById(R.id.rv_backgroud);
        if ((qrs.af(this.h) && this.j.size() > 15) || (!qrs.af(this.h) && this.j.size() > 9)) {
            gridLayoutManager = new GridLayoutManager((Context) this.h, 2, 0, false);
        } else {
            gridLayoutManager = new GridLayoutManager((Context) this.h, 1, 0, false);
        }
        this.x.setLayoutManager(gridLayoutManager);
        EditShareAdapter editShareAdapter = new EditShareAdapter(this, this.x, this.f, this, 1);
        this.f22428c = editShareAdapter;
        editShareAdapter.b(this.j, this.f, false);
        this.x.setAdapter(this.f22428c);
        this.aj.setLayoutManager(new GridLayoutManager((Context) this.h, 1, 0, false));
        EditShareAdapter editShareAdapter2 = new EditShareAdapter(this, this.aj, this.am, this, 2);
        this.ai = editShareAdapter2;
        editShareAdapter2.b(this.i, this.am, false);
        this.aj.setAdapter(this.ai);
    }

    private void t() {
        this.af.setLeftButtonVisibility(0);
        CustomizeShareActivity customizeShareActivity = this.h;
        if (customizeShareActivity != null) {
            this.af.setTitleBarBackgroundColor(customizeShareActivity.getResources().getColor(R.color.colorBackground));
        }
        this.af.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: pjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45520b.d(view);
            }
        });
        s();
    }

    public /* synthetic */ void d(View view) {
        finish();
        overridePendingTransition(0, R.anim.right_exit);
    }

    private void s() {
        if ("plan".equals(this.al) || "threeCircle".equals(this.al) || String.valueOf(16).equals(this.al)) {
            this.af.setRightTextContent(getResources().getString(R.string.IDS_contact_confirm));
            this.af.setRightTextVisible(0);
            this.af.setRightTextOnClickListener(new View.OnClickListener() { // from class: pjw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45529b.c(view);
                }
            });
        }
    }

    public /* synthetic */ void c(View view) {
        pjm.e(j());
        startActivity(new Intent(this.h, (Class<?>) CustomPreviewActivity.class));
    }

    private gxt j() {
        gxt gxtVar = (gxt) this.y.clone();
        Bitmap bitmapE = lsv.e(this.p);
        if (bitmapE == null) {
            return gxtVar;
        }
        Bitmap bitmapE2 = qqf.e(bitmapE, 0, pnq.c(this.r), bitmapE.getHeight());
        LogUtil.a("Share_StepDetailShareActivity", "onClick: screenCut: ", bitmapE2);
        if (bitmapE2 == null) {
            LogUtil.j("Share_StepDetailShareActivity", "onClick: screenCut is null!");
            return gxtVar;
        }
        int iB = pnq.b(bitmapE2);
        LogUtil.a("Share_StepDetailShareActivity", "initView all medal share bitmap size =", Integer.valueOf(iB));
        if ((iB / 1024) / 1024 >= 1) {
            String strE = pnq.e(this.h, "EditShareActivity_Share.webp", bitmapE2);
            gxtVar.c(strE);
            gxtVar.e(4);
            LogUtil.a("Share_StepDetailShareActivity", "onClick:saved= ", strE);
            return gxtVar;
        }
        gxtVar.d(bitmapE2);
        gxtVar.e(1);
        return gxtVar;
    }

    private void p() {
        if (CommonUtil.ca() || Utils.k()) {
            o();
            return;
        }
        this.q = Utils.o();
        if (CommonUtil.ab(this.h) && ((!this.q && LanguageUtil.l(this.h)) || this.q)) {
            this.ag = "path_type";
            m();
            i();
        } else if (!CommonUtil.ab(this.h) && ((!this.q && LanguageUtil.l(this.h)) || this.q)) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_connect_error);
            m();
        } else {
            o();
        }
    }

    private void m() {
        gyg gygVarD = pmc.a().d(this.m);
        d(gygVarD);
        if (this.e) {
            c(gygVarD);
        }
    }

    private void e(List<ShareDataInfo> list) {
        this.j.clear();
        d();
        this.j.addAll(list);
    }

    private void d() {
        if (EnvironmentInfo.m()) {
            return;
        }
        pmu pmuVar = new pmu();
        pmuVar.a(R.mipmap.hw_health_edit_share_photo_pic);
        pmuVar.setId(-1);
        this.j.add(0, pmuVar);
    }

    private void o() {
        this.ag = "id_type";
        a(this.k);
        if (this.e) {
            n();
        }
    }

    private void a(List<Integer> list) {
        this.j.clear();
        d();
        for (Integer num : list) {
            int iIntValue = num.intValue();
            pmu pmuVar = new pmu();
            pmuVar.a(iIntValue);
            Integer num2 = pld.d.get(num);
            if (num2 != null) {
                pmuVar.setId(num2.intValue());
            }
            this.j.add(pmuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        pmb pmbVar = new pmb(this);
        this.z = pmbVar;
        pmbVar.a(true, (Activity) this.h, this.m);
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyShareDataChanged(gyg gygVar) {
        LogUtil.a("Share_StepDetailShareActivity", "notifyShareDataChanged");
        this.ag = "path_type";
        e(gygVar);
        b(gygVar);
        updateAllFragment(true);
    }

    private void b(gyg gygVar) {
        List<ShareDataInfo> listC = pnq.c(gygVar.d());
        pnq.d(listC);
        refreshDataMark(listC);
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void notifyDownloadDataFail() {
        m();
        updateAllFragment(true);
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void updateAllFragment(boolean z) {
        LogUtil.a("Share_StepDetailShareActivity", "updateAllFragment enter");
        EditShareAdapter editShareAdapter = this.f22428c;
        if (editShareAdapter != null) {
            editShareAdapter.b(this.j, this.f, false);
        }
        EditShareAdapter editShareAdapter2 = this.ai;
        if (editShareAdapter2 == null || !this.e) {
            return;
        }
        editShareAdapter2.b(this.i, this.am, false);
        e(this.am);
    }

    private void e(gyg gygVar) {
        List<ShareDataInfo> listC = pnq.c(gygVar.b());
        pnq.d(listC);
        this.j.clear();
        d();
        this.j.addAll(listC);
        if (this.x.getLayoutManager() instanceof GridLayoutManager) {
            if ((qrs.af(this.h) && this.j.size() > 15) || (!qrs.af(this.h) && this.j.size() > 9)) {
                ((GridLayoutManager) this.x.getLayoutManager()).setSpanCount(2);
            } else {
                ((GridLayoutManager) this.x.getLayoutManager()).setSpanCount(1);
            }
        }
        this.f22428c.b(this.j, this.f, false);
    }

    @Override // com.huawei.pluginsocialshare.activity.DownloadInterface
    public void showDownloadError() {
        LogUtil.a("Share_StepDetailShareActivity", "showDownloadError");
        this.l.setVisibility(0);
    }

    public void d(int i, ShareRecycleScrollItemView shareRecycleScrollItemView) {
        this.f = i;
        if (i == 0 && !EnvironmentInfo.m()) {
            shareRecycleScrollItemView.c(this.h);
        } else {
            a(false);
            refreshShareLayoutNoRecommend();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        LogUtil.a("Share_StepDetailShareActivity", "refreshBackground");
        EditShareAdapter editShareAdapter = this.f22428c;
        if (editShareAdapter != null) {
            editShareAdapter.a(this.f);
        }
        if (this.p != null) {
            this.p.setBackground(new BitmapDrawable(this.h.getResources(), bitmap));
        }
    }

    private void a(boolean z) {
        if (this.q && z) {
            this.u.setVisibility(8);
            this.o.setText(R.string.IDS_hwh_motiontrack_edit_share_data);
        } else {
            this.u.setVisibility(0);
            this.o.setText(R.string.IDS_app_name_health);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 4 && intent == null) {
            LogUtil.j("Share_StepDetailShareActivity", "data == null and it's not camera callback");
            return;
        }
        if (i2 == -1) {
            a(true);
            if (i == 2) {
                b(intent);
            } else if (i == 3) {
                c(intent);
            } else {
                if (i != 4) {
                    return;
                }
                pkm.e(this.h);
            }
        }
    }

    private void b(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginsocialshare.activity.CustomizeShareActivity.4
            @Override // java.lang.Runnable
            public void run() {
                pkm.e(CustomizeShareActivity.this.h, intent);
            }
        });
    }

    private void c(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginsocialshare.activity.CustomizeShareActivity.2
            @Override // java.lang.Runnable
            public void run() {
                CustomizeShareActivity.this.e(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        LogUtil.a("Share_StepDetailShareActivity", "dealCropResult");
        String stringExtra = intent.getStringExtra("bitmap");
        if (stringExtra == null) {
            LogUtil.e("Share_StepDetailShareActivity", "dealCropResult:bitmapPath from intent is null!");
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapA = a(stringExtra, options);
        this.d = bitmapA;
        if (bitmapA != null) {
            c(bitmapA);
            e(stringExtra);
        } else {
            LogUtil.j("Share_StepDetailShareActivity", "dealCropResult:bitmap is null");
        }
    }

    private void e(String str) {
        pnn.b(str);
    }

    private void b() {
        gxt gxtVar = this.y;
        if (gxtVar == null) {
            LogUtil.j("Share_StepDetailShareActivity", "mShareContent == null");
            return;
        }
        if (gxtVar.u() == 4) {
            File file = new File(this.y.g());
            if (file.exists()) {
                LogUtil.a("Share_StepDetailShareActivity", "is delete file : ", Boolean.valueOf(file.delete()));
            }
        } else {
            Bitmap bitmapR = this.y.r();
            if (bitmapR != null && !bitmapR.isRecycled()) {
                bitmapR.recycle();
            }
        }
        if (String.valueOf(16).equals(this.al)) {
            g();
        }
    }

    private void g() {
        File fileF = f();
        if (fileF == null || !fileF.exists()) {
            return;
        }
        LogUtil.a("Share_StepDetailShareActivity", "deleteWatermarkThumbnail is delete file : ", Boolean.valueOf(fileF.delete()));
    }

    private File f() {
        gyd gydVar = this.ab;
        if (gydVar == null) {
            return null;
        }
        String strH = gydVar.h();
        LogUtil.a("Share_StepDetailShareActivity", "deleteWatermarkThumbnail path : ", strH);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        return new File(strH);
    }

    private void c(final Bitmap bitmap) {
        LogUtil.a("Share_StepDetailShareActivity", "refreshBackgroundOnUi");
        runOnUiThread(new Runnable() { // from class: com.huawei.pluginsocialshare.activity.CustomizeShareActivity.3
            @Override // java.lang.Runnable
            public void run() {
                CustomizeShareActivity.this.a(bitmap);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b();
        pmb pmbVar = this.z;
        if (pmbVar != null) {
            pmbVar.c(this.h);
            this.z.c();
            this.z = null;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginsocialshare.activity.CustomizeShareActivity.1
            @Override // java.lang.Runnable
            public void run() {
                pmc.a().e();
            }
        });
    }

    private void e(int i) {
        this.i.clear();
        this.i.addAll(this.ai.a());
        this.am = i;
        if (njy.c(this.w, i)) {
            EditShareCommonView editShareCommonView = this.w.get(this.am);
            editShareCommonView.refreshUi(-1, -1);
            editShareCommonView.refreshTopUi(-1);
            View view = editShareCommonView.getView();
            if (view != null) {
                b(view);
                this.ac.put("dataID", Integer.valueOf(editShareCommonView.getWatermarkId()));
            }
        }
    }

    public void a() {
        if (CommonUtil.bu() || CommonUtil.ap() || this.ah == null) {
            return;
        }
        if (this.ah.isChecked() == pnq.j()) {
            return;
        }
        this.f22427b = true;
        this.ah.setChecked(pnq.j());
    }

    @Override // com.huawei.pluginsocialshare.adapter.EditShareAdapter.OnBackgroundChangeListener
    public void onBackgroundChange(int i, int i2, View view) {
        if (view instanceof ShareRecycleScrollItemView) {
            if (i == 1) {
                d(i2, (ShareRecycleScrollItemView) view);
            } else {
                if (i != 2) {
                    return;
                }
                e(i2);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        pnq.a((View) this.p, (Context) this.h, false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        return !this.s ? pnq.e(resources) : resources;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        pnq.c(getResources());
        this.s = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a();
    }
}
