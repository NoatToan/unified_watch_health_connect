package com.mi.health.qrcode;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.mi.health.qrcode.CaptureActivity;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.widget.view.ViewfinderView;
import defpackage.cj2;
import defpackage.eh3;
import defpackage.gzi;
import defpackage.lfi;
import defpackage.n0b;
import defpackage.r7h;
import defpackage.sqi;
import defpackage.v6j;
import defpackage.wsk;
import defpackage.wti;
import defpackage.yj3;
import java.io.IOException;
import java.util.Hashtable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Route(path = QRCodeExportKt.PATH_CAPTURE)
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB\u0007¢\u0006\u0004\bQ\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0005J\u0017\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R(\u0010?\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010=8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010\u0019\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0011\u0010H\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bG\u0010DR\u0011\u0010J\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bI\u0010DR\u0011\u0010L\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010P\u001a\u00020M8G¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/mi/health/qrcode/CaptureActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lr7h;", "", "initUI", "()V", "Landroid/content/Intent;", "intent", "initRelativeButtons", "(Landroid/content/Intent;)V", "decodeQRCode", "Landroid/graphics/Bitmap;", "srcBitmap", "Lwsk;", "identifyQrCode", "(Landroid/graphics/Bitmap;)Lwsk;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isDeviceSupportOrientationRotate", "()Z", "initCaptureHelper", "", "layoutId", "isContentView", "(I)Z", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "result", "onResultCallback", "(Ljava/lang/String;)Z", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/view/SurfaceView;", "Lcom/xiaomi/fitness/widget/view/ViewfinderView;", "viewfinderView", "Lcom/xiaomi/fitness/widget/view/ViewfinderView;", "Landroid/view/View;", "ivTorch", "Landroid/view/View;", "Landroid/view/OrientationEventListener;", "orientationEventListener", "Landroid/view/OrientationEventListener;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "Ljava/lang/Runnable;", "timer", "Ljava/lang/Runnable;", "getTimer", "()Ljava/lang/Runnable;", "Lyj3;", "value", "captureHelper", "Lyj3;", "getCaptureHelper", "()Lyj3;", "getMLayoutId", "()I", "mLayoutId", "getLayoutId", "getViewfinderViewId", "viewfinderViewId", "getSurfaceViewId", "surfaceViewId", "getIvTorchId", "ivTorchId", "Leh3;", "getCameraManager", "()Leh3;", "cameraManager", "<init>", "Companion", "qrcode_release"}, k = 1, mv = {2, 0, 0})
public final class CaptureActivity extends BaseActivity implements r7h {

    @NotNull
    public static final String KEY_RESULT = "scan_result";

    @NotNull
    public static final String QR_CODE_ID = "qr_code_id";

    @NotNull
    public static final String RELATIVE_CARE_QR_CODE_ID_PREFIX = "com.mi.health://relativecare/qrcodeid/";

    @NotNull
    public static final String SCAN_ACTIVITY_KEY_GO_TO_MY_QR_CODE_INTENT = "scan_go_to_my_qr_code";

    @NotNull
    public static final String TAG = "CaptureActivity";

    @Nullable
    private yj3 captureHelper;

    @Nullable
    private View ivTorch;

    @Nullable
    private OrientationEventListener orientationEventListener;

    @Nullable
    private SurfaceView surfaceView;

    @Nullable
    private ViewfinderView viewfinderView;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final Runnable timer = new Runnable() { // from class: com.mi.health.qrcode.CaptureActivity$timer$1
        @Override // java.lang.Runnable
        public void run() {
            ToastUtil.showLongToast(gzi.f19497a);
            this.this$0.getHandler().postDelayed(this, 20000L);
        }
    };

    private final void decodeQRCode(Intent intent) {
        final Bitmap bitmap;
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data);
        } catch (IOException e) {
            e.printStackTrace();
            finish();
            bitmap = null;
        }
        ExecutorHelper.runInBackground(new Runnable() { // from class: kj3
            @Override // java.lang.Runnable
            public final void run() {
                CaptureActivity.decodeQRCode$lambda$4(bitmap, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decodeQRCode$lambda$4(Bitmap bitmap, CaptureActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap == null) {
            Application application = this$0.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            ToastExtKt.toastShort(application, gzi.common_not_support);
            return;
        }
        wsk wskVarIdentifyQrCode = this$0.identifyQrCode(bitmap);
        String strF = wskVarIdentifyQrCode != null ? wskVarIdentifyQrCode.f() : null;
        if (strF == null || strF.length() == 0) {
            Application application2 = this$0.getApplication();
            Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
            ToastExtKt.toastShort(application2, gzi.common_not_support);
            return;
        }
        Intent intent = new Intent();
        if (!StringsKt__StringsJVMKt.startsWith$default(strF, "com.mi.health://relativecare/qrcodeid/", false, 2, null)) {
            Application application3 = this$0.getApplication();
            Intrinsics.checkNotNullExpressionValue(application3, "getApplication(...)");
            ToastExtKt.toastShort(application3, gzi.common_not_support);
            Logger.i(TAG, "resultUrl=" + strF + " doesn't start with RELATIVE_CARE_QR_CODE_ID_PREFIX");
            return;
        }
        String strSubstring = strF.substring(38);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        try {
            long j = Long.parseLong(strSubstring);
            Logger.d(TAG, "identifyQRCode identifyResult=" + wskVarIdentifyQrCode.f() + " qrCodeId=" + j);
            intent.putExtra("qr_code_id", j);
            this$0.setResult(-1, intent);
            this$0.finish();
        } catch (Exception e) {
            Logger.i(TAG, "qrCodeIdStr parse to long failed. ErrorMessage=" + e.getMessage());
            Application application4 = this$0.getApplication();
            Intrinsics.checkNotNullExpressionValue(application4, "getApplication(...)");
            ToastExtKt.toastShort(application4, gzi.common_not_support);
        }
    }

    private final wsk identifyQrCode(Bitmap srcBitmap) {
        Hashtable hashtable = new Hashtable();
        int width = srcBitmap.getWidth();
        int height = srcBitmap.getHeight();
        int[] iArr = new int[width * height];
        srcBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        try {
            return new lfi().a(new cj2(new n0b(new v6j(width, height, iArr))), hashtable);
        } catch (ChecksumException e) {
            e.printStackTrace();
            return null;
        } catch (FormatException e2) {
            e2.printStackTrace();
            return null;
        } catch (NotFoundException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private final void initRelativeButtons(Intent intent) {
        final Intent intent2 = (Intent) intent.getParcelableExtra("scan_go_to_my_qr_code");
        boolean booleanExtra = intent.getBooleanExtra(QRCodeExportKt.SCAN_ACTIVITY_KEY_MY_QR_CODE, false);
        boolean booleanExtra2 = intent.getBooleanExtra(QRCodeExportKt.SCAN_ACTIVITY_KEY_CHOOSE_FROM_GALLERY, false);
        TextView textView = (TextView) findViewById(sqi.f);
        if (booleanExtra) {
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: hj3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CaptureActivity.initRelativeButtons$lambda$1(this.f20118a, intent2, view);
                }
            });
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) findViewById(sqi.f33888a);
        if (!booleanExtra2) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: ij3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CaptureActivity.initRelativeButtons$lambda$3(this.f21190a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRelativeButtons$lambda$1(CaptureActivity this$0, Intent intent, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRelativeButtons$lambda$3(final CaptureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent data = new Intent("android.intent.action.PICK").setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        this$0.startForActivityResult(data, new Function2() { // from class: lj3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CaptureActivity.initRelativeButtons$lambda$3$lambda$2(this.f25118a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRelativeButtons$lambda$3$lambda$2(CaptureActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (intent == null) {
            return Unit.INSTANCE;
        }
        this$0.decodeQRCode(intent);
        return Unit.INSTANCE;
    }

    private final void initUI() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(QRCodeExportKt.SCAN_ACTIVITY_KEY_TITLE);
        String stringExtra2 = intent.getStringExtra(QRCodeExportKt.SCAN_ACTIVITY_KEY_SCAN_DES);
        findViewById(sqi.j).setOnClickListener(new View.OnClickListener() { // from class: jj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureActivity.initUI$lambda$0(this.f22853a, view);
            }
        });
        View viewFindViewById = findViewById(sqi.f33890k);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        textView.setContentDescription(stringExtra);
        textView.setText(stringExtra);
        setActionBarDisplayable(false);
        this.surfaceView = (SurfaceView) findViewById(getSurfaceViewId());
        int viewfinderViewId = getViewfinderViewId();
        if (viewfinderViewId != 0) {
            this.viewfinderView = (ViewfinderView) findViewById(viewfinderViewId);
        }
        ViewfinderView viewfinderView = this.viewfinderView;
        Intrinsics.checkNotNull(viewfinderView);
        viewfinderView.setLabelText(stringExtra2);
        ViewfinderView viewfinderView2 = this.viewfinderView;
        Intrinsics.checkNotNull(viewfinderView2);
        viewfinderView2.setContentDescription(stringExtra2);
        int ivTorchId = getIvTorchId();
        if (ivTorchId != 0) {
            View viewFindViewById2 = findViewById(ivTorchId);
            this.ivTorch = viewFindViewById2;
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(4);
            }
        }
        Intrinsics.checkNotNull(intent);
        initRelativeButtons(intent);
        initCaptureHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUI$lambda$0(CaptureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Deprecated(message = "")
    @NotNull
    public final eh3 getCameraManager() {
        yj3 yj3Var = this.captureHelper;
        Intrinsics.checkNotNull(yj3Var);
        eh3 eh3VarG = yj3Var.g();
        Intrinsics.checkNotNullExpressionValue(eh3VarG, "getCameraManager(...)");
        return eh3VarG;
    }

    @Nullable
    public final yj3 getCaptureHelper() {
        return this.captureHelper;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    public final int getIvTorchId() {
        return sqi.e;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return -1;
    }

    public final int getMLayoutId() {
        return wti.f38344a;
    }

    public final int getSurfaceViewId() {
        return sqi.i;
    }

    @NotNull
    public final Runnable getTimer() {
        return this.timer;
    }

    public final int getViewfinderViewId() {
        return sqi.l;
    }

    public final void initCaptureHelper() {
        yj3 yj3Var = new yj3(this, this.surfaceView, this.viewfinderView, this.ivTorch);
        this.captureHelper = yj3Var;
        Intrinsics.checkNotNull(yj3Var);
        yj3Var.y(this);
    }

    public final boolean isContentView(int layoutId) {
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity
    public boolean isDeviceSupportOrientationRotate() {
        return SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || UIUtils.INSTANCE.isTablet();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int mLayoutId = getMLayoutId();
        if (isContentView(mLayoutId)) {
            setContentView(mLayoutId);
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.hideSystemUI(window);
        initUI();
        yj3 yj3Var = this.captureHelper;
        Intrinsics.checkNotNull(yj3Var);
        yj3Var.p();
        this.orientationEventListener = new OrientationEventListener() { // from class: com.mi.health.qrcode.CaptureActivity.onCreate.1
            {
                super(CaptureActivity.this, 3);
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                Logger.d("onOrientationChanged orientation=" + orientation, new Object[0]);
                if (orientation != -1 && SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand()) {
                    if (230 <= orientation && orientation < 301) {
                        yj3 captureHelper = CaptureActivity.this.getCaptureHelper();
                        if (captureHelper != null) {
                            captureHelper.x(1);
                            return;
                        }
                        return;
                    }
                    int rotation = CaptureActivity.this.getWindowManager().getDefaultDisplay().getRotation();
                    yj3 captureHelper2 = CaptureActivity.this.getCaptureHelper();
                    if (captureHelper2 != null) {
                        captureHelper2.x(rotation);
                    }
                }
            }
        };
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        yj3 yj3Var = this.captureHelper;
        Intrinsics.checkNotNull(yj3Var);
        yj3Var.q();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.handler.removeCallbacks(this.timer);
        yj3 yj3Var = this.captureHelper;
        Intrinsics.checkNotNull(yj3Var);
        yj3Var.r();
    }

    @Override // defpackage.r7h
    public boolean onResultCallback(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        this.handler.postDelayed(this.timer, 20000L);
        yj3 yj3Var = this.captureHelper;
        Intrinsics.checkNotNull(yj3Var);
        yj3Var.u();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        yj3 yj3Var = this.captureHelper;
        Intrinsics.checkNotNull(yj3Var);
        yj3Var.v(event);
        return super.onTouchEvent(event);
    }
}
