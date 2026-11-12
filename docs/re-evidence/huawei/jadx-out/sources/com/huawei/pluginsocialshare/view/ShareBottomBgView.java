package com.huawei.pluginsocialshare.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.MimeTypeMap;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.adapter.ShareBackgroundAdapter;
import com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel;
import com.huawei.pluginsocialshare.view.ShareBottomBgView;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.swiperefreshlayout.HealthSwipeRefreshLayout;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout;
import defpackage.gxy;
import defpackage.gye;
import defpackage.gyf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pkm;
import defpackage.pld;
import defpackage.pma;
import defpackage.pmm;
import defpackage.pmn;
import defpackage.pmr;
import defpackage.pmt;
import defpackage.pmx;
import defpackage.pnb;
import defpackage.pnn;
import defpackage.pnq;
import defpackage.pns;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes42.dex */
public class ShareBottomBgView extends BaseShareBottomView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f22586a = {R.mipmap.share_default_img};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f22587c = {R.mipmap.share_default_thumbnail};
    private static final HashSet<String> d;
    private static final HashSet<String> g;
    private static int h;
    private CustomViewDialog ab;
    private List<ShareDataInfo> f;
    private Bitmap i;
    private FragmentActivity j;
    private int k;
    private Handler l;
    private HealthBubbleLayout m;
    private int n;
    private HealthSwipeRefreshLayout o;
    private View p;
    private String q;
    private b r;
    private boolean s;
    private HealthRecycleView t;
    private ShareViewModel u;
    private gxy v;
    private pma w;
    private int x;
    private ShareBackgroundAdapter y;

    public static /* synthetic */ void d(View view) {
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        g = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        d = hashSet2;
        hashSet.add("mp4");
        hashSet.add("mkv");
        hashSet.add("mov");
        hashSet.add("webm");
        hashSet2.add("kona");
        hashSet2.add("bengal");
    }

    public ShareBottomBgView(Context context) {
        super(context);
        this.n = 0;
        this.l = new Handler(Looper.getMainLooper());
        this.f = new CopyOnWriteArrayList();
        if (context instanceof FragmentActivity) {
            this.j = (FragmentActivity) this.f22574b;
        }
        if (this.j == null) {
            return;
        }
        this.r = new b();
        pmn.c(false);
        b(context);
        l();
    }

    public void d() {
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = (HealthSwipeRefreshLayout) this.p.findViewById(R.id.swiperefreshlayout);
        this.o = healthSwipeRefreshLayout;
        healthSwipeRefreshLayout.setPadding(0, 0, 0, 0);
        this.o.setEnabled(false);
        this.o.setProgressBarColor(qre.e(R.color.common_white_80alpha));
        o();
    }

    private void o() {
        this.o.setCallback(new HwSwipeRefreshLayout.Callback() { // from class: com.huawei.pluginsocialshare.view.ShareBottomBgView.3
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
                LogUtil.a("Share_ShareBottomBgView", "PullRefresh onRefreshStart");
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onScrollUp() {
                LogUtil.a("Share_ShareBottomBgView", "PullRefresh onScrollUp");
            }
        });
    }

    public void b(Context context) {
        View viewInflate = View.inflate(context, R.layout.fragment_bottom_bg_layout, null);
        this.p = viewInflate;
        this.t = (HealthRecycleView) viewInflate.findViewById(R.id.bg_recyclerView);
        k();
        d();
        r();
    }

    private void l() {
        gxy gxyVarC = pjm.c();
        this.v = gxyVarC;
        if (gxyVarC == null) {
            LogUtil.a("Share_ShareBottomBgView", "EditShareActivity_data mShareEditContent is null");
            return;
        }
        this.x = gxyVarC.h();
        this.u = (ShareViewModel) new ViewModelProvider(this.j).get(ShareViewModel.class);
        p();
    }

    private void k() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f22574b, pns.e());
        gridLayoutManager.setOrientation(1);
        this.t.setHasFixedSize(true);
        this.t.setLayoutManager(gridLayoutManager);
    }

    private void b(ShareDataInfo shareDataInfo) {
        if (shareDataInfo != null) {
            ReleaseLogUtil.d("Share_ShareBottomBgView", "refreshPreviewChange shareDataInfo id=", Integer.valueOf(shareDataInfo.getId()));
            d(shareDataInfo);
            this.u.e(shareDataInfo);
        }
    }

    private void d(ShareDataInfo shareDataInfo) {
        this.q = String.valueOf(shareDataInfo.getId());
        pmn.c(this.x, shareDataInfo);
        pnb pnbVar = new pnb();
        pnbVar.c(pmn.c());
        a(pnbVar);
        pnbVar.d(-1);
        this.u.b(pnbVar);
    }

    private void a(pnb pnbVar) {
        int iA;
        int iA2;
        pnb pnbVarE = pmn.e(this.x);
        if (pnbVarE == null) {
            if (pmn.c()) {
                pnbVar.a(pns.d(this.f22574b, this.x));
                return;
            }
            return;
        }
        pmx pmxVarC = pnbVarE.c();
        if (pmxVarC != null && pmxVarC.b() && !"0".equals(pmxVarC.d())) {
            if (pnbVarE.f()) {
                pnbVar.b(true);
                pnbVar.b(pns.c(this.f22574b, this.x));
                if (pmn.c()) {
                    iA2 = pns.c(pns.b(this.f22574b, this.x));
                } else {
                    iA2 = pnbVarE.a();
                }
                pnbVar.a(iA2);
                pnbVar.a(pmxVarC);
            } else {
                pnbVar.b(false);
                pnbVar.b(pnbVarE.d());
                if (pmn.c()) {
                    iA = pns.c(qre.e(this.f22574b, pnbVarE.d()));
                } else {
                    iA = pnbVarE.a();
                }
                pnbVar.a(iA);
                pnbVar.a(pmxVarC);
            }
        } else {
            pnbVar.a(pmn.c() ? pns.d(this.f22574b, this.x) : pnbVarE.a());
        }
        pmn.b(this.x, pnbVar);
    }

    private void r() {
        ShareBackgroundAdapter shareBackgroundAdapter = new ShareBackgroundAdapter(this.f22574b, this.f, new ShareBackgroundAdapter.OnItemClickListener() { // from class: pop
            @Override // com.huawei.pluginsocialshare.adapter.ShareBackgroundAdapter.OnItemClickListener
            public final void onItemClick(int i, ShareDataInfo shareDataInfo) {
                this.f45748c.a(i, shareDataInfo);
            }
        }, new ShareBackgroundAdapter.OnLongItemClickListener() { // from class: poi
            @Override // com.huawei.pluginsocialshare.adapter.ShareBackgroundAdapter.OnLongItemClickListener
            public final void onOnLongItemClick(int i, ShareDataInfo shareDataInfo) {
                this.d.c(i, shareDataInfo);
            }
        });
        this.y = shareBackgroundAdapter;
        shareBackgroundAdapter.a(this.r);
        this.t.setNestedScrollingEnabled(false);
        this.t.setAdapter(this.y);
        this.r.e(this.t);
        qsp.a(this.t, this.r);
    }

    public /* synthetic */ void a(int i, ShareDataInfo shareDataInfo) {
        this.n = 0;
        h = 4;
        y();
        if (i == 0 && !EnvironmentInfo.m()) {
            c((Activity) this.f22574b);
            return;
        }
        if (lrd.d()) {
            this.r.b(i);
        }
        if (shareDataInfo instanceof gye) {
            gye gyeVar = (gye) shareDataInfo;
            if (!TextUtils.isEmpty(gyeVar.getPath())) {
                if (!new File(gyeVar.getPath()).exists()) {
                    d(gyeVar);
                } else {
                    b(shareDataInfo);
                    this.y.c(shareDataInfo);
                    this.y.notifyDataSetChanged();
                }
            }
        } else {
            b(shareDataInfo);
            this.y.c(shareDataInfo);
            this.y.notifyDataSetChanged();
        }
        if (this.y.c() != null) {
            lrd.c(this.y.c().itemView, qre.a(R.string.accessibility_selected, qre.f(R.string.IDS_hwh_edit_share_background) + i));
        }
    }

    public /* synthetic */ void c(int i, ShareDataInfo shareDataInfo) {
        e(shareDataInfo);
    }

    private void d(gye gyeVar) {
        if (!CommonUtil.ab(this.f22574b)) {
            qpx.e(this.f22574b, qre.f(R.string.IDS_connect_error));
        } else {
            c(gyeVar);
        }
    }

    private void p() {
        this.q = t();
        if (!m()) {
            n();
        }
        s();
        if (CommonUtil.ab(this.f22574b)) {
            i();
        }
    }

    private String t() {
        return SharedPreferenceManager.e(this.f22574b, Integer.toString(20002), "shareLastBackground" + this.x);
    }

    private boolean m() {
        List<ShareDataInfo> listH = h();
        if (njy.e(listH)) {
            return false;
        }
        this.f.clear();
        g();
        for (int i = 0; i < listH.size(); i++) {
            ShareDataInfo shareDataInfo = listH.get(i);
            if (shareDataInfo instanceof gye) {
                gye gyeVar = (gye) shareDataInfo;
                if (pnn.c(gyeVar.getPath())) {
                    gyeVar.b(2);
                }
                if (pnn.c(gyeVar.h())) {
                    ReleaseLogUtil.d("Share_ShareBottomBgView", "initLocalCacheSourceData id= ", Integer.valueOf(gyeVar.getId()));
                    this.f.add(shareDataInfo);
                }
            }
        }
        return true;
    }

    private List<ShareDataInfo> h() {
        gyf gyfVarB = pmn.e().b(this.x);
        if (gyfVarB == null) {
            return new ArrayList();
        }
        return gyfVarB.e();
    }

    private void i() {
        pma pmaVar = new pma(this);
        this.w = pmaVar;
        pmaVar.e(this.j, this.x);
    }

    private void n() {
        this.f.clear();
        g();
        int i = 0;
        while (true) {
            int[] iArr = f22586a;
            if (i >= iArr.length) {
                return;
            }
            int i2 = iArr[i];
            pmr pmrVar = new pmr();
            pmrVar.e(i2);
            int[] iArr2 = f22587c;
            if (i < iArr2.length) {
                pmrVar.b(iArr2[i]);
            }
            Integer num = pld.d.get(Integer.valueOf(i2));
            if (num != null) {
                pmrVar.setId(num.intValue());
            }
            if (i == 0) {
                pmrVar.setSelect(true);
            }
            this.f.add(pmrVar);
            i++;
        }
    }

    private void g() {
        if (EnvironmentInfo.m()) {
            return;
        }
        pmr pmrVar = new pmr();
        if (qqs.e(this.f22574b)) {
            pmrVar.b(R.mipmap.share_photo_bg_dark);
        } else {
            pmrVar.b(R.mipmap.share_photo_bg);
        }
        pmrVar.setId(-1);
        this.f.add(0, pmrVar);
    }

    public void c(final Activity activity) {
        Object systemService = activity.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            ReleaseLogUtil.a("Share_ShareBottomBgView", "object is not instanceof Inflater");
            return;
        }
        View viewInflate = ((LayoutInflater) systemService).inflate(com.huawei.health.servicesui.R.layout.hw_health_edit_share_camera_dialog, (ViewGroup) null);
        if (this.ab == null) {
            this.ab = new CustomViewDialog.Builder(activity).d(viewInflate).d();
        }
        this.ab.show();
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_share_caerma)).setOnClickListener(new View.OnClickListener() { // from class: poj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45743a.e(activity, view);
            }
        });
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_share_gallery)).setOnClickListener(new View.OnClickListener() { // from class: poh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45742b.b(activity, view);
            }
        });
        String strF = CommonUtil.f();
        ReleaseLogUtil.e("Share_ShareBottomBgView", "clickCameraView cpuPlatform = ", strF);
        if (d.contains(strF)) {
            return;
        }
        viewInflate.findViewById(R.id.hw_health_edit_share_local_video_divider).setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_health_edit_share_local_video);
        linearLayout.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_custom_menu_video);
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_edit_custom_menu_video_limit)).setText(qre.a(R.string.IDS_share_custom_menu_video_limit, qre.e(R.plurals.IDS_second_single_unit, 30, UnitUtil.e(30, 1, 0))));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (CommonUtil.w(this.f22574b)) {
            linearLayout.setOrientation(0);
            layoutParams.setMargins(0, 0, qrs.d(this.f22574b, 2.0f), 0);
        } else {
            linearLayout.setOrientation(1);
            layoutParams.setMargins(0, 0, 0, qrs.d(this.f22574b, 2.0f));
        }
        healthTextView.setLayoutParams(layoutParams);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: pog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45740b.c(activity, view);
            }
        });
    }

    public /* synthetic */ void e(Activity activity, View view) {
        PermissionUtil.d(activity, PermissionUtil.PermissionType.CAMERA, new e(activity));
        CustomViewDialog customViewDialog = this.ab;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    public /* synthetic */ void b(Activity activity, View view) {
        qrs.c(activity, 2);
        CustomViewDialog customViewDialog = this.ab;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    public /* synthetic */ void c(Activity activity, View view) {
        qrs.d(activity, 6);
        CustomViewDialog customViewDialog = this.ab;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    static class e extends CustomPermissionAction {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<Activity> f22594c;

        private e(Activity activity) {
            super(activity);
            this.f22594c = new WeakReference<>(activity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            Activity activity = this.f22594c.get();
            if (activity == null) {
                ReleaseLogUtil.e("Share_ShareBottomBgView", "activity is null in WeakReferenceCustomPermissionAction");
            } else {
                pmn.c(true);
                pkm.d(activity);
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public void onActivityResult(int i, Intent intent) throws Throwable {
        super.onActivityResult(i, intent);
        ReleaseLogUtil.e("Share_ShareBottomBgView", "onActivityResult requestCode:", Integer.valueOf(i));
        this.n = i;
        if (i == 2) {
            c(intent);
            return;
        }
        if (i == 3) {
            a(intent);
            return;
        }
        if (i == 4) {
            pkm.b(this.j);
            return;
        }
        if (i != 6) {
            return;
        }
        if (intent == null || intent.getData() == null) {
            ReleaseLogUtil.a("Share_ShareBottomBgView", "onActivityResult data or data.data is null", intent);
            return;
        }
        String strA = pnq.a(intent.getData());
        LogUtil.a("Share_ShareBottomBgView", "onActivityResult filePath = ", strA);
        String lowerCase = MimeTypeMap.getFileExtensionFromUrl(strA).toLowerCase();
        if (!TextUtils.isEmpty(lowerCase) && !g.contains(lowerCase)) {
            ReleaseLogUtil.d("Share_ShareBottomBgView", "onPlayerError video is not supported fileExtension = ", lowerCase);
            HandlerExecutor.b(new Runnable() { // from class: poo
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(BaseApplication.getContext(), qre.f(R.string.IDS_share_custom_video_format_limit_new), 0).show();
                }
            });
            return;
        }
        pmt pmtVar = new pmt();
        pmtVar.c(intent.getData());
        a(intent.getData());
        ReleaseLogUtil.d("Share_ShareBottomBgView", "refreshPreviewChange shareDataInfo id=", Integer.valueOf(pmtVar.getId()));
        this.u.e(pmtVar);
        this.l.postDelayed(new Runnable() { // from class: pol
            @Override // java.lang.Runnable
            public final void run() {
                this.f45745c.e();
            }
        }, 1000L);
        j(j());
    }

    public /* synthetic */ void e() {
        pnb pnbVar = new pnb();
        pnbVar.c(pmn.c());
        pnbVar.a(pns.d(this.f22574b, this.x));
        pnbVar.d(-1);
        this.u.b(pnbVar);
    }

    private void a(Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.f22574b, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata == null) {
                ReleaseLogUtil.e("Share_ShareBottomBgView", "showVideoLimitToast durationStr is null");
            } else {
                if (Long.parseLong(strExtractMetadata) > 30000) {
                    Toast.makeText(BaseApplication.getContext(), qre.a(R.string.IDS_share_custom_picker_video_limit, qre.e(R.plurals.IDS_second_single_unit, 30, UnitUtil.e(30, 1, 0))), 0).show();
                }
            }
        } catch (RuntimeException e2) {
            ReleaseLogUtil.a("Share_ShareBottomBgView", "showVideoLimitToast exception" + e2);
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused) {
                ReleaseLogUtil.d("Share_ShareBottomBgView", "showVideoLimitToast release IOException");
            }
        }
    }

    private void c(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pof
            @Override // java.lang.Runnable
            public final void run() {
                this.f45739b.b(intent);
            }
        });
    }

    public /* synthetic */ void b(Intent intent) {
        pkm.c(this.j, intent);
    }

    private void a(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pod
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(Intent intent) {
        ReleaseLogUtil.d("Share_ShareBottomBgView", "dealCropResult");
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("bitmap");
        if (stringExtra == null) {
            ReleaseLogUtil.a("Share_ShareBottomBgView", "dealCropResult:bitmapPath from intent is null!");
            return;
        }
        LogUtil.a("Share_ShareBottomBgView", "dealCropResult:bitmapPath=", stringExtra);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapC = qqf.c(stringExtra, options);
        this.i = bitmapC;
        if (bitmapC == null) {
            ReleaseLogUtil.e("Share_ShareBottomBgView", "dealCropResult:bitmap is null");
            return;
        }
        pns.e(bitmapC);
        this.s = true;
        s();
        ReleaseLogUtil.d("Share_ShareBottomBgView", "dealCropResult setIsTakePhone false");
        pmn.c(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pok
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.s();
                }
            });
            return;
        }
        ArrayList<String> arrayListD = pns.d();
        if (njy.e(arrayListD)) {
            f();
            q();
            return;
        }
        f();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        arrayListD.sort(Comparator.naturalOrder());
        for (int i = 0; i < arrayListD.size(); i++) {
            pmm pmmVar = new pmm();
            Bitmap bitmapC = qqf.c(arrayListD.get(i), options);
            if (bitmapC == null) {
                ReleaseLogUtil.e("Share_ShareBottomBgView", "initCameraBackground:bitmap is null");
            } else {
                pmmVar.a(bitmapC);
                pmmVar.setPath(arrayListD.get(i));
                c(pmmVar, i);
            }
        }
        q();
    }

    private void c(ShareDataInfo shareDataInfo, int i) {
        if (EnvironmentInfo.m()) {
            shareDataInfo.setId(-(i + 1));
            this.f.add(0, shareDataInfo);
        } else {
            d(shareDataInfo, i);
        }
    }

    private void d(ShareDataInfo shareDataInfo, int i) {
        shareDataInfo.setId(-(i + 2));
        if (this.f.isEmpty()) {
            this.f.add(shareDataInfo);
        } else {
            this.f.add(1, shareDataInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.j.runOnUiThread(new Runnable() { // from class: pos
            @Override // java.lang.Runnable
            public final void run() {
                this.f45750c.b();
            }
        });
    }

    public /* synthetic */ void b() {
        List<ShareDataInfo> listJ = j();
        if (njy.e(listJ)) {
            ReleaseLogUtil.e("Share_ShareBottomBgView", "notifyBgList backgroundList isEmpty");
            return;
        }
        ReleaseLogUtil.d("Share_ShareBottomBgView", "notifyBgList backgroundList size = ", Integer.valueOf(listJ.size()));
        ShareDataInfo shareDataInfoD = d(listJ);
        this.y.d(listJ);
        if (shareDataInfoD != null) {
            ReleaseLogUtil.d("Share_ShareBottomBgView", "notifyBgList selectBgInfo id = ", Integer.valueOf(shareDataInfoD.getId()));
            b(shareDataInfoD);
        }
    }

    private void j(List<ShareDataInfo> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Share_ShareBottomBgView", "notifyBgList backgroundList isEmpty");
            return;
        }
        Iterator<ShareDataInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().setSelect(false);
        }
        ReleaseLogUtil.d("Share_ShareBottomBgView", "notifyBgListAllUnSelect size = ", Integer.valueOf(list.size()));
        this.y.d(list);
    }

    private ShareDataInfo d(List<ShareDataInfo> list) {
        if (njy.e(list)) {
            return null;
        }
        if (e(list) && !this.s) {
            return h(list);
        }
        this.s = false;
        return a(list);
    }

    private boolean e(List<ShareDataInfo> list) {
        if (TextUtils.isEmpty(this.q)) {
            return false;
        }
        return list.stream().anyMatch(new Predicate() { // from class: pot
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f45751c.c((ShareDataInfo) obj);
            }
        });
    }

    public /* synthetic */ boolean c(ShareDataInfo shareDataInfo) {
        return String.valueOf(shareDataInfo.getId()).equals(this.q);
    }

    private ShareDataInfo h(List<ShareDataInfo> list) {
        ShareDataInfo shareDataInfo = list.get(b(list));
        for (ShareDataInfo shareDataInfo2 : list) {
            if (String.valueOf(shareDataInfo2.getId()).equals(this.q)) {
                shareDataInfo2.setSelect(true);
                pmn.b(this.x, shareDataInfo2);
                shareDataInfo = shareDataInfo2;
            } else {
                shareDataInfo2.setSelect(false);
            }
        }
        return shareDataInfo;
    }

    private int b(List<ShareDataInfo> list) {
        if (EnvironmentInfo.m()) {
            return 0;
        }
        return njy.c(list, 1) ? 1 : 0;
    }

    private ShareDataInfo a(List<ShareDataInfo> list) {
        ShareDataInfo shareDataInfo = list.get(b(list));
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ShareDataInfo shareDataInfo2 = list.get(i2);
            if (shareDataInfo2.getId() == -1) {
                i++;
            } else if (i2 == i) {
                shareDataInfo2.setSelect(true);
                shareDataInfo = shareDataInfo2;
            } else {
                shareDataInfo2.setSelect(false);
            }
        }
        return shareDataInfo;
    }

    private void f() {
        if (njy.e(this.f)) {
            return;
        }
        this.f.removeIf(new Predicate() { // from class: poa
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ShareBottomBgView.a((ShareDataInfo) obj);
            }
        });
    }

    public static /* synthetic */ boolean a(ShareDataInfo shareDataInfo) {
        return shareDataInfo.getId() < -1;
    }

    private void e(final ShareDataInfo shareDataInfo) {
        if (shareDataInfo instanceof pmm) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f22574b).b(R.string.IDS_hwh_delete_share_bg).c(R.string.IDS_contact_delete, new View.OnClickListener() { // from class: pon
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45746a.a(shareDataInfo, view);
                }
            }).a(R.string.IDS_cancel_button, new View.OnClickListener() { // from class: pom
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareBottomBgView.d(view);
                }
            }).c();
            noTitleCustomAlertDialogC.setWindowGravityParams(17);
            noTitleCustomAlertDialogC.show();
        }
    }

    public /* synthetic */ void a(ShareDataInfo shareDataInfo, View view) {
        pnq.c(shareDataInfo.getPath());
        if (String.valueOf(shareDataInfo.getId()).equals(this.q)) {
            this.s = true;
        }
        s();
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.activity.SportDownloadInterface
    public void downloadedAllShareDataCallback(gyf gyfVar) {
        ReleaseLogUtil.d("Share_ShareBottomBgView", "downloadedAllShareDataCallback enter");
        List<ShareDataInfo> listC = pnq.c(gyfVar.e());
        pnq.d(listC);
        g(listC);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.activity.SportDownloadInterface
    public void downloadedSingleCallback(ShareDataInfo shareDataInfo) {
        gye gyeVar;
        ReleaseLogUtil.d("Share_ShareBottomBgView", "downloadedSingleCallback enter");
        if (this.u == null || shareDataInfo == null || njy.e(this.f)) {
            return;
        }
        ReleaseLogUtil.d("Share_ShareBottomBgView", "downloadedSingleCallback id=", Integer.valueOf(shareDataInfo.getId()));
        Iterator<ShareDataInfo> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                gyeVar = null;
                break;
            }
            ShareDataInfo next = it.next();
            if ((next instanceof gye) && shareDataInfo.getId() == next.getId()) {
                gyeVar = (gye) next;
                break;
            }
        }
        if (gyeVar == null) {
            return;
        }
        String path = gyeVar.getPath();
        if (TextUtils.isEmpty(path)) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            long length = file.length();
            ReleaseLogUtil.d("Share_ShareBottomBgView", "notifyBackgroundChanged fileSize=", Long.valueOf(length), " cloudImageSize=", Integer.valueOf(gyeVar.getImageSize()), " id:", Integer.valueOf(gyeVar.getId()), " name:", gyeVar.d(), " index:", Integer.valueOf(gyeVar.c()));
            if (length < gyeVar.getImageSize()) {
                ReleaseLogUtil.d("Share_ShareBottomBgView", "notifyBackgroundChanged deleteFileByPath");
                pnq.c(gyeVar.getPath());
                gyeVar.b(0);
            } else {
                gyeVar.b(2);
                ReleaseLogUtil.d("Share_ShareBottomBgView", "notifyBackgroundChanged deleteFileByPath downloaded");
                if (gyeVar.c() == -1) {
                    this.y.a();
                }
                if (gyeVar.isSelect()) {
                    b(gyeVar);
                }
            }
            this.y.notifyDataSetChanged();
        }
    }

    private void c(gye gyeVar) {
        if (gyeVar == null || njy.e(this.f)) {
            return;
        }
        if (gyeVar.b() == 1) {
            ReleaseLogUtil.e("Share_ShareBottomBgView", "startDownloadBackgroundItem is double click.");
            return;
        }
        gyeVar.b(1);
        this.y.b();
        ReleaseLogUtil.d("Share_ShareBottomBgView", "notifyBackgroundChanged deleteFileByPath downloading");
        this.y.notifyDataSetChanged();
        pma pmaVar = this.w;
        if (pmaVar == null) {
            return;
        }
        pmaVar.d(gyeVar);
    }

    private void g(List<ShareDataInfo> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Share_ShareBottomBgView", "notifyBackgroundDataChanged shareDataInfoList isEmpty");
            return;
        }
        ReleaseLogUtil.d("Share_ShareBottomBgView", "share_sport notifyBackgroundDataChanged size= ", Integer.valueOf(list.size()));
        this.f.clear();
        g();
        ArrayList arrayList = new ArrayList();
        gye gyeVar = null;
        gye gyeVar2 = null;
        gye gyeVar3 = null;
        gye gyeVar4 = null;
        for (int i = 0; i < list.size(); i++) {
            ShareDataInfo shareDataInfo = list.get(i);
            if (shareDataInfo instanceof gye) {
                gye gyeVar5 = (gye) shareDataInfo;
                List<String> listE = gyeVar5.e();
                if (njy.b(listE)) {
                    if (gyeVar == null && listE.contains(String.valueOf(1))) {
                        gyeVar = gyeVar5;
                    }
                    if (gyeVar2 == null && listE.contains(String.valueOf(2))) {
                        gyeVar2 = gyeVar5;
                    }
                    if (gyeVar3 == null && listE.contains(String.valueOf(3))) {
                        gyeVar3 = gyeVar5;
                    }
                    if (gyeVar4 == null && listE.contains(String.valueOf(0))) {
                        gyeVar4 = gyeVar5;
                    }
                }
                if (arrayList.size() < 4) {
                    arrayList.add(gyeVar5);
                }
                if (pnn.c(gyeVar5.getPath())) {
                    LogUtil.a("Share_ShareBottomBgView", "share_sport notifyBackgroundDataChanged getPath id= ", Integer.valueOf(gyeVar5.getId()));
                    gyeVar5.b(2);
                }
                if (pnn.c(gyeVar5.h())) {
                    LogUtil.a("Share_ShareBottomBgView", "share_sport notifyBackgroundDataChanged getThumbnailPath id= ", Integer.valueOf(gyeVar5.getId()));
                    this.f.add(gyeVar5);
                }
            }
        }
        a(arrayList, gyeVar, gyeVar2, gyeVar3, gyeVar4);
        s();
    }

    private void a(List<gye> list, gye gyeVar, gye gyeVar2, gye gyeVar3, gye gyeVar4) {
        if (njy.e(list)) {
            return;
        }
        if (gyeVar != null && !list.contains(gyeVar)) {
            list.add(gyeVar);
        }
        if (gyeVar2 != null && !list.contains(gyeVar2)) {
            list.add(gyeVar2);
        }
        if (gyeVar3 != null && !list.contains(gyeVar3)) {
            list.add(gyeVar3);
        }
        if (gyeVar4 != null && !list.contains(gyeVar4)) {
            list.add(gyeVar4);
        }
        int size = list.size();
        ReleaseLogUtil.d("Share_ShareBottomBgView", "downFourBgList size =", Integer.valueOf(size));
        for (int i = 0; i < size; i++) {
            gye gyeVar5 = list.get(i);
            int id = gyeVar5.getId();
            ReleaseLogUtil.d("Share_ShareBottomBgView", "downFourBgList id =", Integer.valueOf(id), " name =", gyeVar5.d());
            gyeVar5.c(i);
            a(gyeVar5);
        }
    }

    private void a(gye gyeVar) {
        if (TextUtils.isEmpty(gyeVar.getPath()) || new File(gyeVar.getPath()).exists()) {
            return;
        }
        d(gyeVar);
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public View getRootView() {
        return this.p;
    }

    @Override // com.huawei.pluginsocialshare.view.BaseShareBottomView, com.huawei.pluginsocialshare.view.BaseBottomView
    public void onTemplateSelected(int i) {
        LogUtil.a("Share_ShareBottomBgView", "onTemplateSelected position=", Integer.valueOf(i), ",choose=", Integer.valueOf(this.n));
        this.k = i;
        if (this.n == 6) {
            return;
        }
        this.l.removeCallbacksAndMessages(null);
        this.l.postDelayed(new Runnable() { // from class: com.huawei.pluginsocialshare.view.ShareBottomBgView.1
            @Override // java.lang.Runnable
            public void run() {
                ShareBottomBgView.this.q();
            }
        }, 800L);
    }

    private List<ShareDataInfo> j() {
        if (njy.e(this.f)) {
            return this.f;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator<ShareDataInfo> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ShareDataInfo next = it.next();
            if (!(next instanceof gye)) {
                a(copyOnWriteArrayList, next);
            } else {
                List<String> listE = ((gye) next).e();
                if (njy.e(listE)) {
                    copyOnWriteArrayList.add(next);
                } else {
                    boolean z = this.k == 0 && listE.contains(String.valueOf(1));
                    if (listE.contains(String.valueOf(this.k)) || z) {
                        copyOnWriteArrayList.add(next);
                    }
                }
            }
        }
        if (copyOnWriteArrayList.size() <= 1) {
            c(copyOnWriteArrayList);
        }
        return copyOnWriteArrayList;
    }

    private void c(List<ShareDataInfo> list) {
        if (list.isEmpty() || list.get(0).getId() == -1) {
            list.add(new pmr() { // from class: com.huawei.pluginsocialshare.view.ShareBottomBgView.4
                {
                    e(R.mipmap.share_default_img);
                    b(R.mipmap.share_default_thumbnail);
                    setSelect(true);
                }
            });
        }
    }

    private void a(List<ShareDataInfo> list, ShareDataInfo shareDataInfo) {
        if (list.contains(shareDataInfo)) {
            ReleaseLogUtil.e("Share_ShareBottomBgView", "getTemplateTypeBgList addLocalAndCameraBg repeats id=", Integer.valueOf(shareDataInfo.getId()));
        } else {
            list.add(shareDataInfo);
        }
    }

    static class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f22591b;
        private int e;

        private b() {
        }

        public void b(int i) {
            this.e = i;
        }

        public void e(RecyclerView recyclerView) {
            this.f22591b = recyclerView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f22591b != null && ShareBottomBgView.h == 4) {
                c(this.e);
                int unused = ShareBottomBgView.h = -1;
            }
        }

        private void c(final int i) {
            RecyclerView recyclerView;
            if (i < 0 || (recyclerView = this.f22591b) == null) {
                return;
            }
            recyclerView.post(new Runnable() { // from class: com.huawei.pluginsocialshare.view.ShareBottomBgView.b.3
                @Override // java.lang.Runnable
                public void run() {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = b.this.f22591b.findViewHolderForAdapterPosition(i);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        viewHolderFindViewHolderForAdapterPosition.itemView.requestFocus();
                        lrd.b(viewHolderFindViewHolderForAdapterPosition.itemView, 8);
                    }
                }
            });
        }
    }

    private void y() {
        HealthBubbleLayout healthBubbleLayout = this.m;
        if (healthBubbleLayout != null) {
            healthBubbleLayout.setVisibility(8);
        }
    }

    public void d(HealthBubbleLayout healthBubbleLayout) {
        this.m = healthBubbleLayout;
    }
}
