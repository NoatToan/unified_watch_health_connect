package com.xiaomi.hm.health.watermarkcamera.ui.activity;

import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Size;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.watermarkcamera.R;
import com.xiaomi.hm.health.watermarkcamera.event.EventGoBackToSummary;
import com.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkActivity;
import com.xiaomi.hm.health.watermarkcamera.ui.fragment.WatermarkCameraFragment;
import com.xiaomi.hm.health.watermarkcamera.utils.BitmapUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.ViewUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkAnalytics;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkFileUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkShareDataUtil;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.concurrent.Callable;
import rx.Single;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int REQ_PICKER_CODE = 101;
    private static final String q = "ARG_TRACK_ID";
    private static final String r = "ARG_DEVICE_SOURCE";
    private static final String s = "WatermarkActivity";
    private static final String t = "watermark_bottom_";
    private static final int u = 36;
    private ImageView a;
    private ImageView b;
    private ImageButton c;
    private ImageButton d;
    private RelativeLayout e;
    private RelativeLayout f;
    private RelativeLayout g;
    private RelativeLayout h;
    private FrameLayout i;
    private RelativeLayout j;
    private WatermarkCameraFragment k;
    private int l;
    private boolean m;
    private boolean n = false;
    private Bitmap o = null;
    private long p = -1;

    public class a extends SingleSubscriber<Bitmap> {
        public a() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            if (bitmap != null) {
                WatermarkActivity.this.b.setImageBitmap(bitmap);
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
        }
    }

    public class b implements Callable<Bitmap> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() throws Exception {
            return WatermarkActivity.this.r();
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            WatermarkActivity.this.g.setVisibility(0);
        }
    }

    public class d implements WatermarkCameraFragment.PictureListener {

        public class a implements Runnable {
            public final /* synthetic */ Bitmap a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkActivity$d$a$a, reason: collision with other inner class name */
            public class RunnableC1039a implements Runnable {
                public RunnableC1039a() {
                }

                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    WatermarkActivity.this.m();
                }
            }

            public a(Bitmap bitmap) {
                this.a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                WatermarkActivity.this.D(true);
                if (this.a != null) {
                    WatermarkActivity.this.a.setImageBitmap(this.a);
                    WatermarkActivity.this.a.postDelayed(new RunnableC1039a(), 500L);
                }
            }
        }

        public d() {
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.ui.fragment.WatermarkCameraFragment.PictureListener
        public void saveImage(Bitmap bitmap) {
            WatermarkActivity.this.runOnUiThread(new a(bitmap));
        }
    }

    private void A() {
        Analytics.event(this, WatermarkAnalytics.EVENT_RUNNING_WATERMARK_FLASH);
        B(!this.m);
    }

    private void B(boolean z) {
        if (this.c == null) {
            return;
        }
        this.m = z;
        this.k.setFlashMode(z);
        if (z) {
            this.c.setBackgroundResource(R.drawable.watermark_flash_lamp_on_normal);
        } else {
            this.c.setBackgroundResource(R.drawable.watermark_flash_lamp_off_normal);
        }
    }

    private void C() {
        Analytics.event(getApplicationContext(), WatermarkAnalytics.Params.RUN_CLICK_ALBUM);
        this.k.takePicture(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z) {
        this.j.setVisibility(z ? 8 : 0);
        this.i.setVisibility(z ? 8 : 0);
        this.a.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 8 : 0);
        this.d.setVisibility(z ? 8 : 0);
        Analytics.event(this, WatermarkAnalytics.Params.RUN_CUT_PHOTO_PAGE);
    }

    private void findViews() {
        this.c = (ImageButton) findViewById(R.id.btn_flash_lamp);
        this.d = (ImageButton) findViewById(R.id.btn_switch_camera);
        this.e = (RelativeLayout) findViewById(R.id.rl_share_area);
        this.j = (RelativeLayout) findViewById(R.id.share_pane_container);
        this.f = (RelativeLayout) findViewById(R.id.rl_share_area_mark);
        this.i = (FrameLayout) findViewById(R.id.fl_camera);
        this.a = (ImageView) findViewById(R.id.iv_cover);
        this.b = (ImageView) findViewById(R.id.gallery_thumbnail);
        this.g = (RelativeLayout) findViewById(R.id.ll_panel);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.watermark_title_layout);
        this.h = relativeLayout;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (int) (ViewUtils.dp2px(this, 36.0f) + ViewUtils.getStatusBarHeight(this));
        this.h.setLayoutParams(layoutParams);
    }

    private void initView() {
        w();
        t();
        l();
        x();
    }

    private void l() {
        this.k = WatermarkCameraFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_camera, this.k).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        Analytics.event(this, WatermarkAnalytics.EVENT_RUNNING_WATERMARK_FINISH);
        this.f.setDrawingCacheEnabled(true);
        this.f.destroyDrawingCache();
        this.f.buildDrawingCache();
        Bitmap drawingCache = this.f.getDrawingCache();
        String watermarkPath = WatermarkFileUtils.getWatermarkPath(this, t + System.currentTimeMillis() + ".jpg");
        boolean zSaveBitmapToFileWithOptimizeCompress = BitmapUtils.saveBitmapToFileWithOptimizeCompress(watermarkPath, drawingCache);
        if (drawingCache != null) {
            drawingCache.recycle();
        }
        if (!zSaveBitmapToFileWithOptimizeCompress) {
            CustomToast.showShort(this, R.string.running_share_img_failed_to_create);
        } else {
            u(watermarkPath);
            WatermarkShareActivity.start(this, watermarkPath, this.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(String str, Uri uri) {
        HMLog.e(s, "Scanned path:" + str + "-> uri=" + uri, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(DialogInterface dialogInterface, int i) {
        finish();
    }

    private void q() {
        Single.fromCallable(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00c6: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:33:0x00c6 */
    public Bitmap r() throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_data", "_id"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0 && cursorQuery.moveToLast()) {
                            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.watermark_gallery_thumbnail_size);
                            if (Build.VERSION.SDK_INT <= 29) {
                                Bitmap bitmapDecodeSampledBitmapFromFile = BitmapUtils.decodeSampledBitmapFromFile(cursorQuery.getString(0), dimensionPixelSize, dimensionPixelSize);
                                cursorQuery.close();
                                return bitmapDecodeSampledBitmapFromFile;
                            }
                            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")));
                            HMLog.i(s, "uri path ==" + uriWithAppendedId.getPath(), new Object[0]);
                            try {
                                Bitmap bitmapLoadThumbnail = getContentResolver().loadThumbnail(uriWithAppendedId, new Size(dimensionPixelSize, dimensionPixelSize), null);
                                cursorQuery.close();
                                return bitmapLoadThumbnail;
                            } catch (Exception e) {
                                HMLog.i(s, "loadLatestImagePath tobitmap Exception ==" + e.getMessage(), new Object[0]);
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        HMLog.i(s, "loadLatestImagePath Exception :" + e.getMessage(), new Object[0]);
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        return null;
    }

    private void s(Bundle bundle) {
        int intExtra;
        if (bundle != null) {
            this.p = bundle.getLong(q, -1L);
            intExtra = bundle.getInt(r, -1);
        } else {
            this.p = getIntent().getLongExtra(q, -1L);
            intExtra = getIntent().getIntExtra(r, -1);
        }
        WatermarkShareDataUtil.setCurrTrackId(this.p);
        WatermarkShareDataUtil.setDeviceSource(intExtra);
    }

    public static void start(Context context, long j, int i) {
        context.startActivity(new Intent(context, (Class<?>) WatermarkActivity.class).putExtra(q, j).putExtra(r, i));
    }

    private void t() {
        this.l = getResources().getDisplayMetrics().widthPixels;
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, this.l));
        WatermarkShareDataUtil.setWatermarkShareW(this.l);
        WatermarkShareDataUtil.setWatermarkShareH(this.l);
    }

    private void u(String str) {
        MediaScannerConnection.scanFile(getApplicationContext(), new String[]{str}, new String[]{MimeTypes.IMAGE_JPEG}, new MediaScannerConnection.OnScanCompletedListener() { // from class: yl8
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str2, Uri uri) {
                WatermarkActivity.n(str2, uri);
            }
        });
    }

    private void v() {
        Analytics.event(getApplicationContext(), WatermarkAnalytics.Params.RUN_CLICK_ALBUM);
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            bitmap.recycle();
            this.o = null;
        }
        startActivityForResult(new Intent(this, (Class<?>) GalleryPickerActivity.class), 101);
    }

    private void w() {
        findViewById(R.id.btn_back).setOnClickListener(this);
        findViewById(R.id.btn_take_photo).setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.b.setOnClickListener(this);
    }

    private void x() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.watermark_activity_scroll_to_top);
        animationLoadAnimation.setAnimationListener(new c());
        this.g.startAnimation(animationLoadAnimation);
    }

    private void y() {
        Analytics.event(this, WatermarkAnalytics.EVENT_RUNNING_WATERMARK_FRONT);
        z(!this.n);
    }

    private void z(boolean z) {
        this.n = z;
        this.k.changeCameraMode(z);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null) {
            return;
        }
        if (i != 101) {
            if (i == 102 && intent.getBooleanExtra(WatermarkClipActivity.EXTRA_SELECT_IMG, false)) {
                v();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("cn.com.smartdevices.bracelet.extra.DATA");
        if (stringExtra == null || !new File(stringExtra).exists()) {
            HMLog.w(s, "no image file picked!", new Object[0]);
            return;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(stringExtra, new BitmapFactory.Options());
        if (bitmapDecodeFile != null && bitmapDecodeFile.getWidth() != 0 && bitmapDecodeFile.getWidth() != 0) {
            bitmapDecodeFile.recycle();
            int i3 = this.l;
            WatermarkClipActivity.startByResult(this, stringExtra, i3, i3);
        } else {
            HMLog.w(s, "Image file is broken", new Object[0]);
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.btn_flash_lamp) {
            A();
            return;
        }
        if (id == R.id.btn_switch_camera) {
            y();
            return;
        }
        if (id == R.id.btn_take_photo) {
            C();
        } else if (id == R.id.btn_back) {
            finish();
        } else if (id == R.id.gallery_thumbnail) {
            v();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Analytics.event(this, WatermarkAnalytics.EVENT_RUNNING_WATERMARK_IN);
        super.onCreate(bundle);
        setContentView(R.layout.activity_watermark_main);
        s(bundle);
        findViews();
        initView();
        q();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            bitmap.recycle();
            this.o = null;
        }
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEventMainThread(EventGoBackToSummary eventGoBackToSummary) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        B(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        D(false);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong(q, WatermarkShareDataUtil.getCurrTrackId());
        bundle.putLong(r, WatermarkShareDataUtil.getDeviceSource());
    }

    public void showAlert() {
        new AlertDialogFragment.Builder(this).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: xl8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.o(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.running_tip_known), new DialogInterface.OnClickListener() { // from class: wl8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.p(dialogInterface, i);
            }
        }).setTitle(getString(R.string.alert_title_unable_start_camera)).setMessage(getString(R.string.alert_msg_unable_start_camera)).setCancelable(true).show(getSupportFragmentManager());
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, (Class<?>) WatermarkActivity.class));
    }
}
