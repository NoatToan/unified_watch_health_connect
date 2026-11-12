package com.huawei.health.recognizekit.api;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.router.routes.AppRoute$$Info$$HuaweiHealth;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.recognizekit.R;
import com.huawei.health.recognizekit.base.RecognizeBiApi;
import com.huawei.health.recognizekit.h5.RecognizeH5Helper;
import com.huawei.health.recognizekit.impl.RecognizeAuthListener;
import com.huawei.health.recognizekit.impl.RecognizeHelper;
import com.huawei.health.recognizekit.view.CenterLayoutManager;
import com.huawei.health.recognizekit.view.LoadingCircleView;
import com.huawei.health.recognizekit.view.OverLayerTopView;
import com.huawei.health.recognizekit.view.RecognizeModeRecyclerAdapter;
import com.huawei.health.recognizekit.view.RecognizeScanView;
import com.huawei.health.recognizekit.view.TabItemDecoration;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.camera.CameraStateListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.gud;
import defpackage.gug;
import defpackage.guh;
import defpackage.gum;
import defpackage.guo;
import defpackage.gup;
import defpackage.guq;
import defpackage.ifp;
import defpackage.lmf;
import defpackage.lmn;
import defpackage.lrk;
import defpackage.pfh;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class HealthRecognizeActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f8665a = "huaweischeme://healthapp/router/column?module=vipTypeSelect&from=2&name=" + ifp.b("饮食拍照识别") + "&payResourceType=" + ifp.b("专属升级体验") + "&pageId=food_camera_0001";
    private int aa;
    private int ab;
    private c ac;
    private RecognizeBiApi ad;
    private int ae;
    private HealthBubbleLayout af;
    private OverLayerTopView ag;
    private final RecognizeAuthListener ah;
    private final guh aj;
    private RecognizeHelper ak;
    private final gug al;
    private final guq am;
    private final RecognizeHelper.RecognizeListener an;
    private RecognizeModeRecyclerAdapter ao;
    private final RecognizeHelper.RecognizeListener ap;
    private final gum aq;
    private LinearLayout ar;
    private RecognizeScanView as;
    private HealthBubbleLayout at;
    private TextureView au;
    private RectF av;
    private HealthRecycleView aw;
    private RelativeLayout ax;
    private HealthTextView ay;
    private HealthTextView az;
    private HealthTextView ba;
    private HealthTextView bb;
    private HealthTextView bc;
    private HealthTextView bd;
    private LinearLayout be;
    private LinearLayout bg;
    private H5ProWebView bh;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f8667c;
    private int d;
    private lrk e;
    private RelativeLayout g;
    private boolean j;
    private ImageView k;
    private boolean m;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private gud r;
    private ImageView s;
    private LoadingCircleView t;
    private Context u;
    private NetStateChangeReceiver w;
    private CustomAlertDialog x;
    private int y;
    private int z;
    private boolean l = false;
    private boolean f = false;
    private boolean h = false;
    private Handler v = new a(this);
    private boolean n = false;
    private final TextureView.SurfaceTextureListener ai = new TextureView.SurfaceTextureListener() { // from class: com.huawei.health.recognizekit.api.HealthRecognizeActivity.4
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LogUtil.b("R_HealthRecognizeActivity", "onSurfaceTextureAvailable, openCamera... width=", Integer.valueOf(i), " height=", Integer.valueOf(i2));
            HealthRecognizeActivity.this.m();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            LogUtil.b("R_HealthRecognizeActivity", "onSurfaceTextureSizeChanged, width=", Integer.valueOf(i), " height=", Integer.valueOf(i2));
            if (HealthRecognizeActivity.this.e != null) {
                HealthRecognizeActivity.this.e.b(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LogUtil.b("R_HealthRecognizeActivity", "onSurfaceTextureDestroyed");
            return true;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraStateListener f8666b = new AnonymousClass1();
    private final RecognizeH5Helper.IH5Wrapper i = new AnonymousClass2();

    public HealthRecognizeActivity() {
        RecognizeHelper.RecognizeListener recognizeListener = new RecognizeHelper.RecognizeListener() { // from class: gtf
            @Override // com.huawei.health.recognizekit.impl.RecognizeHelper.RecognizeListener
            public final void onRecognized(String str) {
                this.f36018b.c(str);
            }
        };
        this.an = recognizeListener;
        RecognizeHelper.RecognizeListener recognizeListener2 = new RecognizeHelper.RecognizeListener() { // from class: gth
            @Override // com.huawei.health.recognizekit.impl.RecognizeHelper.RecognizeListener
            public final void onRecognized(String str) {
                this.f36023a.e(str);
            }
        };
        this.ap = recognizeListener2;
        this.al = new gug(recognizeListener);
        this.aj = new guh(recognizeListener2);
        this.am = new guq();
        this.aq = new gum();
        this.w = new NetStateChangeReceiver();
        this.ah = new RecognizeAuthListener() { // from class: gtl
            @Override // com.huawei.health.recognizekit.impl.RecognizeAuthListener
            public final void onRecognizedAuth(gud gudVar) {
                this.f36026b.e(gudVar);
            }
        };
    }

    /* JADX INFO: renamed from: com.huawei.health.recognizekit.api.HealthRecognizeActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements CameraStateListener {
        AnonymousClass1() {
        }

        @Override // com.huawei.hwcommonmodel.camera.CameraStateListener
        public void onPreviewFrame(Image image, int i) {
            if (image == null) {
                LogUtil.d("R_HealthRecognizeActivity", "image is null");
                return;
            }
            if (image.getPlanes() == null) {
                LogUtil.d("R_HealthRecognizeActivity", "image plane is null");
                return;
            }
            LogUtil.b("R_HealthRecognizeActivity", "frame captured, orientationAngle: " + i);
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            final Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining, null);
            if (i != 0) {
                bitmapDecodeByteArray = guo.a(bitmapDecodeByteArray, i);
            }
            if (HealthRecognizeActivity.this.aa == 1) {
                ((guh) HealthRecognizeActivity.this.ak).a(HealthRecognizeActivity.this.ag.getCenterRect());
            }
            HealthRecognizeActivity.this.l = false;
            HealthRecognizeActivity.this.runOnUiThread(new Runnable() { // from class: gua
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(bitmapDecodeByteArray);
                }
            });
            image.close();
        }

        public /* synthetic */ void e(Bitmap bitmap) {
            HealthRecognizeActivity.this.b(bitmap);
        }

        @Override // com.huawei.hwcommonmodel.camera.CameraStateListener
        public void onCameraOpened(int i) {
            LogUtil.b("R_HealthRecognizeActivity", "cameraOpened, sensorOrientation: " + i);
        }

        @Override // com.huawei.hwcommonmodel.camera.CameraStateListener
        public void onCameraError(String str) {
            LogUtil.e("R_HealthRecognizeActivity", "onCameraError: " + str);
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.recognizekit.api.HealthRecognizeActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements RecognizeH5Helper.IH5Wrapper {
        AnonymousClass2() {
        }

        @Override // com.huawei.health.recognizekit.h5.RecognizeH5Helper.IH5Wrapper
        public void inputManual() {
            LogUtil.b("R_HealthRecognizeActivity", "abandon shooting pic, finishing...");
            HealthRecognizeActivity.this.finish();
        }

        @Override // com.huawei.health.recognizekit.h5.RecognizeH5Helper.IH5Wrapper
        public void reShooting() {
            LogUtil.b("R_HealthRecognizeActivity", "dismiss fail dialog, shooting again...");
            HealthRecognizeActivity.this.runOnUiThread(new Runnable() { // from class: gub
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36036b.b();
                }
            });
        }

        public /* synthetic */ void b() {
            HealthRecognizeActivity.this.a(true);
        }

        @Override // com.huawei.health.recognizekit.h5.RecognizeH5Helper.IH5Wrapper
        public void finish() {
            LogUtil.b("R_HealthRecognizeActivity", "finishing shooting page...");
            HealthRecognizeActivity.this.finish();
        }
    }

    public /* synthetic */ void c(String str) {
        runOnUiThread(new Runnable() { // from class: gtw
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    public /* synthetic */ void c() {
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "native onRecognized done");
        if (this.t.e) {
            this.t.e();
        }
        Intent intent = new Intent();
        intent.putExtra("result", "true");
        setResult(-1, intent);
        finish();
        if (LanguageUtil.ba(this.u)) {
            overridePendingTransition(0, R.anim.left_exit);
        } else {
            overridePendingTransition(0, R.anim.right_exit);
        }
    }

    public /* synthetic */ void e(final String str) {
        runOnUiThread(new Runnable() { // from class: gti
            @Override // java.lang.Runnable
            public final void run() {
                this.f36024c.b(str);
            }
        });
    }

    public /* synthetic */ void b(String str) {
        this.ag.a();
        if (!this.l) {
            this.e.g();
        }
        if (!gup.b(str)) {
            ReleaseLogUtil.c("R_HealthRecognizeActivity", "nutrition recognize fail");
            v();
        } else {
            ReleaseLogUtil.c("R_HealthRecognizeActivity", "nutrition recognize success");
            gup.c(this, str);
            finish();
        }
        this.l = false;
    }

    public /* synthetic */ void e(gud gudVar) {
        if (gudVar != null) {
            this.r = gudVar;
            ReleaseLogUtil.c("R_HealthRecognizeActivity", "RecognizeAuthListener ", gudVar.toString());
            b(gudVar);
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class c implements Observer {
        private final WeakReference<HealthRecognizeActivity> e;

        c(HealthRecognizeActivity healthRecognizeActivity) {
            this.e = new WeakReference<>(healthRecognizeActivity);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            HealthRecognizeActivity healthRecognizeActivity = this.e.get();
            if (healthRecognizeActivity == null || healthRecognizeActivity.isFinishing() || healthRecognizeActivity.isDestroyed()) {
                ReleaseLogUtil.d("R_HealthRecognizeActivity", "RefreshVipTabObserver notify activity is null or finishing/destroyed");
                return;
            }
            if (ObserveLabels.VIP_INFO_CHANGED.equals(str)) {
                if (healthRecognizeActivity.al != null) {
                    ReleaseLogUtil.c("R_HealthRecognizeActivity", "RefreshVipTabObserver vip info changed");
                    healthRecognizeActivity.al.e();
                    return;
                } else {
                    ReleaseLogUtil.d("R_HealthRecognizeActivity", "recognizeFoodHelper is null");
                    return;
                }
            }
            ReleaseLogUtil.d("R_HealthRecognizeActivity", "RefreshVipTabObserver received unexpected label: ", str);
        }
    }

    private void l() {
        if (this.ac == null) {
            this.ac = new c(this);
        }
        ObserverManagerUtil.d(this.ac, ObserveLabels.VIP_INFO_CHANGED);
    }

    private void x() {
        c cVar = this.ac;
        if (cVar != null) {
            ObserverManagerUtil.c(cVar);
            this.ac = null;
        }
    }

    private void b(gud gudVar) {
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "enter handleRecognizeAuthCount ");
        if (!a(gudVar)) {
            d();
        } else {
            b(c(gudVar));
        }
    }

    private boolean a(gud gudVar) {
        if (gudVar != null) {
            return gudVar.c() == 1;
        }
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "isMember authRsq is null");
        return false;
    }

    private int c(gud gudVar) {
        if (gudVar == null) {
            ReleaseLogUtil.c("R_HealthRecognizeActivity", "getLimitCount authRsq is null");
            return 0;
        }
        return gudVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (!d(PermissionUtil.PermissionType.CAMERA)) {
            b(PermissionUtil.PermissionType.CAMERA);
            return;
        }
        this.n = false;
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "enter takePic");
        d((Bitmap) null);
        guo.a(this);
        this.e.c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.activity_scan_kit);
        if (getIntent().hasExtra("from")) {
            this.d = getIntent().getIntExtra("from", 0);
        } else {
            Uri uriB = AppRouterUtils.b(getIntent());
            if (uriB != null) {
                this.d = CommonUtil.e(uriB.getQueryParameter("from"), 0);
            }
        }
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "enter onCreate from:" + this.d);
        gug.e("");
        this.al.c(this.ah);
        this.al.e();
        h();
        j();
        RecognizeH5Helper.d(this.i);
        e(this.u);
        l();
    }

    private void h() {
        String string;
        this.au = (TextureView) findViewById(R.id.id_texture_camera);
        this.e = new lrk(this, this.au, this.f8666b, false, 256);
        this.q = (ImageView) findViewById(R.id.id_vip_arrow);
        ImageView imageView = (ImageView) findViewById(R.id.id_back_arrow);
        this.k = imageView;
        imageView.setImageDrawable(qqz.c(BaseApplication.b(), R.drawable.ic_chevron_backward));
        this.q.setImageDrawable(qqz.c(BaseApplication.b(), R.drawable.ic_member_arrow));
        this.ax = (RelativeLayout) findViewById(R.id.id_tip_btn_layout);
        this.t = (LoadingCircleView) findViewById(R.id.id_shot);
        this.o = (ImageView) findViewById(R.id.id_album);
        this.p = (ImageView) findViewById(R.id.id_tips_bubble);
        this.s = (ImageView) findViewById(R.id.id_background_pic);
        this.az = (HealthTextView) findViewById(R.id.id_title);
        this.bb = (HealthTextView) findViewById(R.id.id_tips_big);
        this.ay = (HealthTextView) findViewById(R.id.id_tips_small);
        this.bc = (HealthTextView) findViewById(R.id.tips_text);
        this.at = (HealthBubbleLayout) findViewById(R.id.id_bubble_container);
        RectF rectF = new RectF();
        this.av = rectF;
        rectF.set(this.at.getLeft(), this.at.getTop(), this.at.getRight(), this.at.getBottom());
        this.af = (HealthBubbleLayout) findViewById(R.id.recognize_mode_tips);
        this.bh = (H5ProWebView) findViewById(R.id.id_scan_failed);
        this.ar = (LinearLayout) findViewById(R.id.recognize_tab);
        this.bg = (LinearLayout) findViewById(R.id.id_tips_member);
        this.be = (LinearLayout) findViewById(R.id.id_tips_container);
        this.bd = (HealthTextView) findViewById(R.id.id_tv_vip);
        this.f8667c = (LinearLayout) findViewById(R.id.id_buy_layout);
        this.ag = (OverLayerTopView) findViewById(R.id.id_overLayerTopView);
        this.as = (RecognizeScanView) findViewById(R.id.id_recognizeScanView);
        this.ba = (HealthTextView) findViewById(R.id.network_tip_tv);
        if (NetworkUtil.i()) {
            string = NetworkUtil.f() ? getString(R.string.IDS_recognize_mobile_network_remind) : getString(R.string.IDS_recognize_wlan_network_remind);
        } else {
            string = getString(R.string.IDS_recognize_no_network_remind);
        }
        this.ba.setText(string);
        this.u = this;
        g();
        q();
        boolean zB = SharedPreferenceManager.b(AppRoute$$Info$$HuaweiHealth.M_36, "isFirstEnterRecognize", true);
        this.j = zB;
        if (zB) {
            SharedPreferenceManager.a(AppRoute$$Info$$HuaweiHealth.M_36, "isFirstEnterRecognize", false);
            r();
        } else {
            n();
        }
    }

    private void r() {
        this.o.setVisibility(8);
        this.t.setVisibility(8);
        this.ar.setVisibility(8);
        ((ViewStub) findViewById(R.id.recognize_guide_view_stub)).inflate();
        this.g = (RelativeLayout) findViewById(R.id.recognize_guide_relativeLayout);
        ((RelativeLayout) findViewById(R.id.recognize_guide_title_bar)).setOnClickListener(new View.OnClickListener() { // from class: gts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.i(view);
            }
        });
        ((ImageView) findViewById(R.id.id_guide_back_arrow)).setImageDrawable(qqz.c(BaseApplication.b(), R.drawable.ic_backward_arrow));
        ((HealthButton) findViewById(R.id.recognize_guide_start_button)).setOnClickListener(new d(this));
        k();
    }

    public /* synthetic */ void i(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (!d(PermissionUtil.PermissionType.CAMERA)) {
            b(PermissionUtil.PermissionType.CAMERA);
        } else {
            this.ad.onEnterEvent(this.d, "e2");
            u();
        }
    }

    private void g() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.recognize_tab_recycleView);
        this.aw = healthRecycleView;
        healthRecycleView.setIsScroll(false);
        this.aw.addItemDecoration(new TabItemDecoration());
        final LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(this.aw);
        this.aw.setLayoutManager(new CenterLayoutManager(this, 0, false));
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.IDS_recognize_tab_food));
        arrayList.add(getString(R.string.IDS_recognize_tab_nutrition));
        RecognizeModeRecyclerAdapter recognizeModeRecyclerAdapter = new RecognizeModeRecyclerAdapter(arrayList);
        this.ao = recognizeModeRecyclerAdapter;
        this.aw.setAdapter(recognizeModeRecyclerAdapter);
        this.ao.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: gtu
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                this.e.d(recyclerHolder, i, obj);
            }
        });
        this.aw.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.recognizekit.api.HealthRecognizeActivity.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && HealthRecognizeActivity.this.m) {
                    LogUtil.b("R_HealthRecognizeActivity", "tab scroll finish");
                    HealthRecognizeActivity.this.m = false;
                    View viewFindSnapView = linearSnapHelper.findSnapView(recyclerView.getLayoutManager());
                    if (viewFindSnapView == null) {
                        HealthRecognizeActivity.this.a();
                        return;
                    }
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView);
                    ReleaseLogUtil.c("R_HealthRecognizeActivity", "tab centerView position=", Integer.valueOf(childAdapterPosition));
                    HealthRecognizeActivity.this.c(childAdapterPosition);
                }
            }
        });
        this.aw.setOnTouchListener(new View.OnTouchListener() { // from class: gtx
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f36033b.d(view, motionEvent);
            }
        });
    }

    public /* synthetic */ void d(RecyclerHolder recyclerHolder, int i, Object obj) {
        LogUtil.b("R_HealthRecognizeActivity", "tab onClick");
        if (this.aa == i) {
            return;
        }
        c(i);
    }

    public /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        this.m = true;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int iQ = qrs.q() / 2;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.aw.getLayoutManager();
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition == -1) {
            return;
        }
        int i = (iFindLastCompletelyVisibleItemPosition - iFindFirstCompletelyVisibleItemPosition) / 2;
        int iMin = Math.min(i + 1, this.ao.getItemCount() - 1);
        for (int iMax = Math.max(0, i - 1); iMax <= iMin; iMax++) {
            View viewFindViewByPosition = this.aw.getLayoutManager().findViewByPosition(iMax);
            if (iQ == viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2)) {
                c(iMax);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        if (i == 0) {
            this.aa = i;
            q();
            o();
        } else if (i == 1) {
            if (pfh.a().isPluginAvaiable()) {
                this.aa = i;
                t();
                this.ad.onEnterEvent(this.d, "e2");
                o();
                return;
            }
            o();
            pfh.a().launchActivity(BaseApplication.b(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: gtj
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return this.d.d(i, context, intent);
                }
            });
        }
    }

    public /* synthetic */ boolean d(final int i, Context context, Intent intent) {
        pfh.a().a((AppBundleLauncher.InstallCallback) null);
        runOnUiThread(new Runnable() { // from class: gtm
            @Override // java.lang.Runnable
            public final void run() {
                this.f36028c.a(i);
            }
        });
        return false;
    }

    public /* synthetic */ void a(int i) {
        this.aa = i;
        t();
        this.ad.onEnterEvent(this.d, "e2");
        o();
    }

    private void o() {
        this.ao.a(this.aa);
        this.ao.notifyDataSetChanged();
        this.aw.smoothScrollToPosition(this.aa);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.b("R_HealthRecognizeActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        LogUtil.b("R_HealthRecognizeActivity", "isFromAlbum:", Boolean.valueOf(this.l), ", isFirstEnter:", Boolean.valueOf(this.j));
        if (!this.l && !this.j) {
            a(false);
        }
        if (d(PermissionUtil.PermissionType.CAMERA)) {
            if (this.au.isAvailable()) {
                LogUtil.b("R_HealthRecognizeActivity", "texture view is available, open camera...");
                m();
                return;
            } else {
                this.au.setSurfaceTextureListener(this.ai);
                return;
            }
        }
        LogUtil.b("R_HealthRecognizeActivity", "onResume without camera permission, will not open camera...");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.bh.getVisibility() == 0) {
            a(true);
        } else {
            super.onBackPressed();
        }
    }

    private void j() {
        this.k.setOnClickListener(new View.OnClickListener() { // from class: gtq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36031c.a(view);
            }
        });
        this.ax.setOnClickListener(new View.OnClickListener() { // from class: gtr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36032b.e(view);
            }
        });
        this.t.setOnClickListener(new View.OnClickListener() { // from class: gte
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36017a.c(view);
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: gtn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36029b.b(view);
            }
        });
        this.f8667c.setOnClickListener(new View.OnClickListener() { // from class: gto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36030a.d(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (this.bh.getVisibility() == 0) {
            a(true);
        } else {
            finish();
        }
    }

    public /* synthetic */ void e(View view) {
        if (this.at.getVisibility() == 8) {
            this.at.setVisibility(0);
            this.ay.setVisibility(8);
            this.ad.onTipsEvent("d1");
            a(this.at, 300L, true, null);
        }
    }

    public /* synthetic */ void c(View view) {
        a(view, "ivShot", new Runnable() { // from class: gtv
            @Override // java.lang.Runnable
            public final void run() {
                this.e.w();
            }
        });
    }

    public /* synthetic */ void b(View view) {
        a(view, "ivAlbum", new Runnable() { // from class: gtt
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
    }

    public /* synthetic */ void d(View view) {
        if (!NetworkUtil.i()) {
            qpx.e(this, getString(R.string.IDS_insights_network_tips));
        } else {
            this.am.onRecognizeEvent(AnalyticsValue.VIP_FUNC_INTRO_OPEN_BY_BUSINESS_SHOW.value(), d("1", "benefits_overview"));
            b(this.u);
        }
    }

    private void b(Context context) {
        AppRouter.c("/OperationBundle/MemberTypeSelectActivity").a("MEMBER_TYPE_SELECT_INDEX", 0).c("memberTypeSelectUri", f8665a).a(R.anim.fade_in, R.anim.fade_out).b(context);
    }

    public void a(final View view, long j, final boolean z, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        LogUtil.b("R_HealthRecognizeActivity", "animateView appear=", Boolean.valueOf(z));
        AnimatorSet animatorSet = new AnimatorSet();
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        float f3 = z ? 0.0f : 1.0f;
        float f4 = z ? 1.0f : 0.0f;
        float f5 = z ? 0.0f : 1.0f;
        float f6 = z ? 1.0f : 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", f, f2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f3, f4);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", f5, f6);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat3.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        } else {
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.huawei.health.recognizekit.api.HealthRecognizeActivity.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        view.setVisibility(0);
                    } else {
                        view.setVisibility(8);
                    }
                }
            });
        }
        animatorSet.start();
    }

    private void a(View view, String str, Runnable runnable) {
        if (qrs.r()) {
            LogUtil.e("R_HealthRecognizeActivity", str + " is fast click");
            return;
        }
        if (!NetworkUtil.i()) {
            qpx.e(this, getString(R.string.IDS_insights_network_tips));
            return;
        }
        gud gudVar = this.r;
        if (gudVar == null && this.aa == 0) {
            qpx.e(this, getString(R.string.IDS_recognize_auth_fail));
            ReleaseLogUtil.b("R_HealthRecognizeActivity", str + " mAuthRsq is null");
            return;
        }
        if (a(gudVar) && c(this.r) == 0 && this.aa == 0) {
            b(this.u);
        } else {
            runnable.run();
        }
    }

    private lmn d(String str, String str2) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "food_camera_0001");
        HashMap map2 = new HashMap();
        map2.put("event", str);
        map2.put("payResourceType", "专属升级体验");
        map2.put("name", "饮食拍照识别");
        map2.put(ParamConstants.Param.VIEW_TYPE, str2);
        map2.put("moduleName", "main_page");
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        return lmnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bitmap bitmap) {
        if (this.n) {
            ReleaseLogUtil.c("R_HealthRecognizeActivity", "recognize isProcessing");
            return;
        }
        this.n = true;
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "start recognizing...");
        d(bitmap);
        this.ak.recognize(bitmap);
        this.ad.onRecognizeEvent(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.b("R_HealthRecognizeActivity", "setUIToStandbyMod");
        this.au.setVisibility(0);
        this.az.setVisibility(0);
        this.ax.setVisibility(0);
        this.ar.setVisibility(0);
        this.o.setVisibility(0);
        this.t.setVisibility(0);
        if (this.t.e) {
            this.t.e();
            this.t.setClickable(true);
        }
        this.bb.setVisibility(8);
        this.ay.setVisibility(0);
        this.ay.setText(this.ae);
        if (this.ae == R.string.IDS_recognize_guide_tips_new) {
            e(3);
            c(3, 5000L);
        }
        this.at.setVisibility(this.j ? 0 : 8);
        this.bh.setVisibility(8);
        this.s.setVisibility(8);
        if (z) {
            this.e.g();
        }
    }

    private void d(Bitmap bitmap) {
        e(3);
        y();
        c(bitmap);
        f();
    }

    private void y() {
        if (this.aa == 0) {
            b(4, this.bb, this.ay, this.ba);
            return;
        }
        b(0, this.bb, this.ay, this.ba);
        this.ay.setText(this.ab);
        this.ag.b();
    }

    private void c(Bitmap bitmap) {
        if (!this.l || bitmap == null) {
            return;
        }
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "handleAlbumBitmap");
        this.s.setVisibility(0);
        this.au.setVisibility(8);
        this.s.setImageBitmap(bitmap);
    }

    private void f() {
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "hideBottomControls");
        if (this.l || this.aa != 0) {
            if (this.t.e) {
                this.t.e();
            }
            b(8, this.ar, this.az, this.ax, this.o, this.t);
        } else {
            b(0, this.t);
            this.t.b();
            this.t.setClickable(false);
            b(8, this.ar, this.az, this.ax, this.o);
        }
    }

    private void b(int i, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    private void p() {
        this.az.setVisibility(0);
        this.ax.setVisibility(8);
        this.bb.setVisibility(8);
        this.ay.setVisibility(8);
        this.s.setVisibility(8);
        this.au.setVisibility(0);
        this.ag.a();
    }

    private void q() {
        this.az.setText(R.string.IDS_recognize_title_food_new);
        this.p.setImageResource(R.drawable.recognize_demonstration_img_new);
        this.bc.setText(getString(R.string.IDS_recognize_guide_tips_new_1, new Object[]{UnitUtil.e(20.0d, 1, 0), UnitUtil.e(30.0d, 1, 0)}));
        gud gudVar = this.r;
        if (gudVar != null) {
            b(gudVar);
        }
        if (this.ay.getVisibility() == 8) {
            this.ay.setVisibility(0);
        }
        this.ay.setText(R.string.IDS_recognize_guide_tips_new);
        e(3);
        c(3, 5000L);
        this.ae = R.string.IDS_recognize_guide_tips_new;
        this.ab = R.string.IDS_recognize_processing_tips_2;
        this.ag.b(false);
        this.ak = this.al;
        this.ad = this.am;
    }

    private void t() {
        e(3);
        d();
        s();
        this.az.setText(R.string.IDS_recognize_title_food_new);
        this.p.setImageResource(this.z);
        this.bc.setText(R.string.IDS_ocr_take_photo_tips);
        this.ay.setVisibility(0);
        this.ay.setText(R.string.IDS_ocr_take_photo_tips);
        this.ae = R.string.IDS_ocr_take_photo_tips;
        this.ab = R.string.IDS_ocr_recognizing_nutritiontable_tips;
        this.ag.b(true);
        this.ak = this.aj;
        this.ad = this.aq;
    }

    private void b(int i) {
        if (this.bg.getVisibility() == 0) {
            ReleaseLogUtil.c("R_HealthRecognizeActivity", "showBuyVipTips vipTipsLinearlayout already visible");
            return;
        }
        this.bg.setVisibility(0);
        this.bd.setText(qre.e(R.plurals.IDS_recognize_member_vip_tips, Math.max(i, 0), Integer.valueOf(i)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.be.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, qrs.d(this.u, 60.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        this.be.setLayoutParams(marginLayoutParams);
        this.am.onRecognizeEvent(AnalyticsValue.VIP_FUNC_INTRO_OPEN_BY_BUSINESS_SHOW.value(), d("0", "benefits_overview"));
    }

    private void d() {
        this.bg.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.be.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, qrs.d(this.u, 24.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        this.be.setLayoutParams(marginLayoutParams);
    }

    private void v() {
        CustomAlertDialog customAlertDialog = this.x;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.b("R_HealthRecognizeActivity", "showNutritionRecognizeFailDialog already show");
            return;
        }
        p();
        View viewInflate = View.inflate(this, R.layout.nutritiontable_recognize_fail_tips_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.ocr_recognize_fail_dialog_tips);
        ((ImageView) viewInflate.findViewById(R.id.ocr_recognize_fail_dialog_img)).setImageResource(this.y);
        healthTextView.setText(getString(com.huawei.ui.commonui.R.string.IDS_ocr_recognize_fail_tips, new Object[]{1, 2, 3, 4}));
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.a(viewInflate);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.hw_nutrition_ocr_reshoot_bt);
        healthButton.setText(getString(com.huawei.ui.commonui.R.string.IDS_ocr_reshoot_after_fail).toUpperCase());
        CustomAlertDialog customAlertDialogB = builder.b();
        this.x = customAlertDialogB;
        customAlertDialogB.show();
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: gtk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.f(view);
            }
        });
        this.x.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: gtp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.e.c(dialogInterface);
            }
        });
    }

    public /* synthetic */ void f(View view) {
        CustomAlertDialog customAlertDialog = this.x;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        this.ad.onRecognizeResultEvent(false, false);
    }

    public /* synthetic */ void c(DialogInterface dialogInterface) {
        a(false);
        this.x = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    private void s() {
        byte b2;
        String language = getResources().getConfiguration().locale.getLanguage();
        LogUtil.b("R_HealthRecognizeActivity", "getImgResourceIdByLanguage language=", language);
        if (TextUtils.isEmpty(language)) {
            return;
        }
        String lowerCase = language.toLowerCase(Locale.ENGLISH);
        lowerCase.hashCode();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 3201) {
            if (iHashCode != 3371) {
                if (iHashCode == 3886 && lowerCase.equals(MLAsrConstants.LAN_ZH)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (lowerCase.equals("it")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (lowerCase.equals("de")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.z = R.drawable.ocr_detail_tips_de;
            this.y = R.drawable.recognize_fail_dialog_tips_de;
        } else if (b2 == 1) {
            this.z = R.drawable.ocr_detail_tips_it;
            this.y = R.drawable.recognize_fail_dialog_tips_it;
        } else if (b2 == 2) {
            this.z = R.drawable.ocr_detail_tips_cn;
            this.y = R.drawable.recognize_fail_dialog_tips_cn;
        } else {
            this.z = R.drawable.ocr_detail_tips_en;
            this.y = R.drawable.recognize_fail_dialog_tips_en;
        }
    }

    private void b(PermissionUtil.PermissionType permissionType) {
        LogUtil.b("R_HealthRecognizeActivity", "permission not granted, requesting: " + permissionType);
        this.ad.onEnterEvent(this.d, "e1");
        PermissionUtil.d(this, permissionType, new b(permissionType));
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static class b extends CustomPermissionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PermissionUtil.PermissionType f8675a;
        private final WeakReference<HealthRecognizeActivity> d;

        private b(HealthRecognizeActivity healthRecognizeActivity, PermissionUtil.PermissionType permissionType) {
            super(healthRecognizeActivity);
            this.d = new WeakReference<>(healthRecognizeActivity);
            this.f8675a = permissionType;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            HealthRecognizeActivity healthRecognizeActivity = this.d.get();
            if (healthRecognizeActivity == null) {
                LogUtil.e("R_HealthRecognizeActivity", "activity is null in WeakReferenceCustomPermissionAction");
                return;
            }
            if (this.f8675a.equals(PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES)) {
                LogUtil.b("R_HealthRecognizeActivity", "storage permission granted, jump to album...");
                healthRecognizeActivity.e();
            } else if (this.f8675a.equals(PermissionUtil.PermissionType.CAMERA)) {
                healthRecognizeActivity.ad.onEnterEvent(healthRecognizeActivity.d, "e2");
                healthRecognizeActivity.u();
                LogUtil.b("R_HealthRecognizeActivity", "camera permission granted, do nothing...");
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            if (this.f8675a.equals(PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES)) {
                LogUtil.b("R_HealthRecognizeActivity", "storage permission denied...");
            } else if (this.f8675a.equals(PermissionUtil.PermissionType.CAMERA)) {
                LogUtil.b("R_HealthRecognizeActivity", "camera permission denied...");
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            HealthRecognizeActivity healthRecognizeActivity = this.d.get();
            if (healthRecognizeActivity == null) {
                LogUtil.e("R_HealthRecognizeActivity", "activity is null in WeakReferenceCustomPermissionAction");
                return;
            }
            if (permissionType.equals(PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES)) {
                LogUtil.b("R_HealthRecognizeActivity", "storage permission FOREVER denied, show guide dialog");
                qrs.b(healthRecognizeActivity, permissionType);
            } else if (permissionType.equals(PermissionUtil.PermissionType.CAMERA)) {
                LogUtil.b("R_HealthRecognizeActivity", "camera permission FOREVER denied, show guide dialog");
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: gtz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LogUtil.e("R_HealthRecognizeActivity", "CAMERA permission forever denied, user is making choice...");
                    }
                };
                qrs.b(healthRecognizeActivity, permissionType, onClickListener, onClickListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (SharedPreferenceManager.b(AppRoute$$Info$$HuaweiHealth.M_36, "isFirstShowMultiModeTips", true)) {
            this.at.setVisibility(0);
            this.ay.setVisibility(8);
            SharedPreferenceManager.a(AppRoute$$Info$$HuaweiHealth.M_36, "isFirstShowMultiModeTips", false);
        }
    }

    private boolean d(PermissionUtil.PermissionType permissionType) {
        return PermissionUtil.e(this, permissionType) == PermissionUtil.PermissionResult.GRANTED;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.j) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            i();
            if (this.at.getVisibility() == 0 && !this.av.contains(motionEvent.getX(), motionEvent.getY())) {
                a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void i() {
        if (SharedPreferenceManager.b(AppRoute$$Info$$HuaweiHealth.M_36, "isShowMultiModeTipsBubble", true)) {
            this.af.setVisibility(0);
            SharedPreferenceManager.a(AppRoute$$Info$$HuaweiHealth.M_36, "isShowMultiModeTipsBubble", false);
        } else if (this.af.getVisibility() == 0) {
            this.af.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "goToAlbum");
        this.n = false;
        this.ad.onAlbumEvent("d2");
        qrs.c((Activity) this, 20230505);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.c("R_HealthRecognizeActivity", "onActivityResult requestCode: ", Integer.valueOf(i));
        if (intent == null) {
            ReleaseLogUtil.c("R_HealthRecognizeActivity", "onActivityResult data is empty");
            return;
        }
        if (i == 20230505 && i2 == -1 && intent.getData() != null) {
            Uri data = intent.getData();
            int iB = guo.b(data);
            if (this.aa == 0) {
                try {
                    Bitmap bitmapB = gup.b(BitmapFactory.decodeStream(getContentResolver().openInputStream(data)));
                    this.l = true;
                    b(guo.a(bitmapB, iB));
                } catch (FileNotFoundException | IllegalStateException e) {
                    a(true);
                    ReleaseLogUtil.b("R_HealthRecognizeActivity", "FileNotFoundException or IllegalStateException ", e);
                }
            } else {
                Intent intent2 = new Intent(this, (Class<?>) NutritionTableAlbumImgCropActivity.class);
                intent2.setData(data);
                intent2.putExtra(ParamConstants.Param.ORIENTATION, iB);
                startActivityForResult(intent2, 20251226);
            }
        }
        if (i == 20251226) {
            String stringExtra = intent.getStringExtra("ocrResult");
            boolean zIsEmpty = TextUtils.isEmpty(stringExtra);
            if (i2 == 101 && !zIsEmpty) {
                ReleaseLogUtil.c("R_HealthRecognizeActivity", "goto SnackControlPage");
                gup.c(this, stringExtra);
                finish();
            } else if (i2 == 100 && !zIsEmpty && stringExtra.equals("default")) {
                b();
            }
        }
    }

    private void b() {
        LogUtil.b("R_HealthRecognizeActivity", "onResume recognize album img fail");
        t();
        this.aa = 1;
        o();
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.e.b(this.au.getWidth(), this.au.getHeight(), true);
    }

    private void k() {
        HashMap map = new HashMap();
        map.put("from", String.valueOf(this.d));
        map.put("event", "0");
        map.put("scannedType", "");
        map.put("result", "");
        map.put("type", "");
        lmf.d().c(BaseApplication.b(), AnalyticsValue.RECOGNIZE_FOOD_EVENT_VALUE.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        lrk lrkVar = this.e;
        if (lrkVar != null) {
            lrkVar.d();
        }
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b("R_HealthRecognizeActivity", "enter onDestroy");
        x();
        d(this.u);
        guo.a();
        this.al.release();
        this.aj.release();
        RecognizeH5Helper.a();
        Handler handler = this.v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        LogUtil.b("R_HealthRecognizeActivity", "enter initViewTahiti");
        RecognizeModeRecyclerAdapter recognizeModeRecyclerAdapter = this.ao;
        if (recognizeModeRecyclerAdapter != null) {
            recognizeModeRecyclerAdapter.notifyDataSetChanged();
        }
        OverLayerTopView overLayerTopView = this.ag;
        if (overLayerTopView != null) {
            overLayerTopView.d();
        }
        LogUtil.b("R_HealthRecognizeActivity", "refresh center rectF");
        Point pointE = gup.e(this.u);
        int i = pointE.x;
        int i2 = pointE.y;
        LogUtil.b("R_HealthRecognizeActivity", "initViewTahiti screenWidth=", Integer.valueOf(i), " screenHeight=", Integer.valueOf(i2));
        if (this.au.isAvailable()) {
            LogUtil.b("R_HealthRecognizeActivity", "initViewTahiti textureView isAvailable()");
            this.e.d();
            this.e.b(i, i2, true);
        } else {
            LogUtil.b("R_HealthRecognizeActivity", "initViewTahiti textureView setListener");
            this.au.setSurfaceTextureListener(this.ai);
        }
    }

    private void e(Context context) {
        context.registerReceiver(this.w, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private void d(Context context) {
        NetStateChangeReceiver netStateChangeReceiver = this.w;
        if (netStateChangeReceiver != null) {
            context.unregisterReceiver(netStateChangeReceiver);
        }
    }

    private void e(int i) {
        Handler handler = this.v;
        if (handler == null) {
            LogUtil.e("R_HealthRecognizeActivity", "removeHandlerMessage mHandler is null");
        } else {
            handler.removeMessages(i);
        }
    }

    private void c(int i, long j) {
        Handler handler = this.v;
        if (handler == null) {
            LogUtil.e("R_HealthRecognizeActivity", "sendEmptyDelayedMessage mHandler is null");
        } else {
            handler.sendEmptyMessageDelayed(i, j);
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class d implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthRecognizeActivity> f8676c;

        d(HealthRecognizeActivity healthRecognizeActivity) {
            this.f8676c = new WeakReference<>(healthRecognizeActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HealthRecognizeActivity healthRecognizeActivity = this.f8676c.get();
            if (healthRecognizeActivity != null && !qrs.r()) {
                healthRecognizeActivity.j = false;
                healthRecognizeActivity.a(false);
                healthRecognizeActivity.g.setVisibility(8);
                healthRecognizeActivity.g = null;
                healthRecognizeActivity.n();
                LogUtil.b("R_HealthRecognizeActivity", "guide view dismissed, going feature...");
                return;
            }
            LogUtil.e("R_HealthRecognizeActivity", "InnerClickListener activity is null or fast click");
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public class NetStateChangeReceiver extends BroadcastReceiver {
        public NetStateChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (HealthRecognizeActivity.this.v == null) {
                return;
            }
            int i = NetworkUtil.k() ? 2 : -1;
            if (NetworkUtil.f()) {
                i = 1;
            }
            if (!NetworkUtil.i()) {
                i = 0;
            }
            HealthRecognizeActivity.this.v.sendMessage(HealthRecognizeActivity.this.v.obtainMessage(i));
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<HealthRecognizeActivity> f8674a;

        a(HealthRecognizeActivity healthRecognizeActivity) {
            this.f8674a = new WeakReference<>(healthRecognizeActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            HealthRecognizeActivity healthRecognizeActivity = this.f8674a.get();
            if (healthRecognizeActivity == null) {
                ReleaseLogUtil.b("R_HealthRecognizeActivity", "handleMessage mActivity is null");
                return;
            }
            if (message != null) {
                super.handleMessage(message);
                int i = message.what;
                if (i == 0) {
                    healthRecognizeActivity.ba.setText(R.string.IDS_recognize_no_network_remind);
                    return;
                }
                if (i == 1) {
                    healthRecognizeActivity.ba.setText(R.string.IDS_recognize_mobile_network_remind);
                    if (healthRecognizeActivity.al != null) {
                        healthRecognizeActivity.al.e();
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    healthRecognizeActivity.ay.setVisibility(8);
                } else {
                    healthRecognizeActivity.ba.setText(R.string.IDS_recognize_wlan_network_remind);
                    if (healthRecognizeActivity.al != null) {
                        healthRecognizeActivity.al.e();
                    }
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
