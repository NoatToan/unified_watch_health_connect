package com.huawei.pluginsocialshare.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.socialshare.model.SaveBitampCallback;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.ShareButtonView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.view.RoundedImageView;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pmn;
import defpackage.pnq;
import defpackage.pns;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes42.dex */
public class MultiplePreviewActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f22434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22436c;
    private Context d;
    private BottomSheetBehavior<NestedScrollView> e;
    private pjm f;
    private gxy g;
    private int h;
    private gxt i;
    private ShareButtonView j;
    private int k;
    private RoundedImageView l;
    private gxt o;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackgroundDrawableResource(R.color.series_top_big_image_foreground);
        setContentView(R.layout.activity_share_multiple_preview_layout);
        this.d = this;
        i();
        a();
        f();
        g();
    }

    private void a() {
        Intent intent = getIntent();
        if (intent != null) {
            this.k = intent.getIntExtra("trackShareIndexKey", 0);
            this.h = intent.getIntExtra("tabPositionKey", 0);
        }
        this.i = pjm.e();
        this.o = e();
    }

    private void f() {
        ImageView imageView = (ImageView) findViewById(R.id.image_player);
        this.f22434a = imageView;
        if (this.f22436c || this.f22435b) {
            imageView.setVisibility(0);
        }
        this.j = (ShareButtonView) findViewById(R.id.share_button_view);
        this.l = (RoundedImageView) findViewById(R.id.share_img);
        this.e = BottomSheetBehavior.from((NestedScrollView) findViewById(R.id.choose_bottom_sheet));
        ImageView imageView2 = (ImageView) findViewById(R.id.share_bottom_close);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
        j();
        b();
        coordinatorLayout.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        c();
    }

    private void c() {
        int i = this.d.getResources().getConfiguration().uiMode;
        if (pnq.b() == 0 || (i & 48) == pnq.b()) {
            return;
        }
        finish();
    }

    private void b() {
        this.e.setState(3);
        this.e.setPeekHeight(0);
        this.e.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.huawei.pluginsocialshare.activity.MultiplePreviewActivity.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i) {
                if (i == 4 || i == 5) {
                    MultiplePreviewActivity.this.d();
                }
            }
        });
    }

    private void j() {
        RoundedImageView roundedImageView;
        ReleaseLogUtil.d("Share_MultiplePreviewActivity", "setPreviewBg enter");
        if (this.d == null || this.g == null || (roundedImageView = this.l) == null) {
            return;
        }
        roundedImageView.setRadius(qre.a(R.dimen.emui_corner_radius_mediums));
        d(this.l, this.g);
    }

    private void d(RoundedImageView roundedImageView, gxy gxyVar) {
        Bitmap bitmapD;
        if (this.f22435b) {
            bitmapD = c(gxyVar.b());
        } else {
            bitmapD = gxyVar.d();
        }
        if (bitmapD == null) {
            ReleaseLogUtil.d("Share_MultiplePreviewActivity", "getPreviewBitmap:read from path");
            String strC = gxyVar.c();
            if (TextUtils.isEmpty(strC)) {
                ReleaseLogUtil.e("Share_MultiplePreviewActivity", "getPreviewBitmap:bitmap and image path are both null!");
                return;
            } else {
                b(strC);
                bitmapD = qqf.c(strC);
            }
        }
        Bitmap bitmapA = a(bitmapD, gxyVar.c());
        if (bitmapA == null || bitmapA.getHeight() == 0) {
            ReleaseLogUtil.e("Share_MultiplePreviewActivity", "getPreviewBitmap previewBitmap is null or  previewBitmap.getHeight() == 0");
            return;
        }
        ReleaseLogUtil.d("Share_MultiplePreviewActivity", "setPreviewBitmap previewBitmapHeight=", Integer.valueOf(bitmapA.getHeight()));
        roundedImageView.setRadius(qre.a(R.dimen.emui_corner_radius_icon));
        roundedImageView.setImageBitmap(bitmapA);
        float width = (bitmapA.getWidth() * 1.0f) / bitmapA.getHeight();
        ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
        layoutParams.width = (int) (qrs.d(this.d, 280.0f) * width);
        roundedImageView.setLayoutParams(layoutParams);
    }

    private void b(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            LogUtil.a("Share_MultiplePreviewActivity", "printFileSize size: ", Float.valueOf(file.length() / 1000000.0f), " MB, filePath:", str);
        } else {
            LogUtil.j("Share_MultiplePreviewActivity", "printFileSize does not exist or is not a file: ", str);
        }
    }

    private Bitmap a(Bitmap bitmap, String str) {
        if (bitmap == null) {
            ReleaseLogUtil.d("Share_MultiplePreviewActivity", "compressImageFromPath read from path");
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.e("Share_MultiplePreviewActivity", "compressImageFromPath bitmapPath isEmpty");
                return bitmap;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            BitmapFactory.decodeFile(str, options);
            if (options.outHeight > 8192) {
                options.inSampleSize = 2;
            }
            options.inJustDecodeBounds = false;
            bitmap = qqf.c(str, options);
        }
        return pnq.a(bitmap, 6000);
    }

    private void g() {
        gxt gxtVarE = pjm.e();
        this.i = gxtVarE;
        this.j.setShareContent(gxtVarE);
        this.j.setToShareContent(this.o);
        this.f.a(this.d, 9, this.o);
        this.j.setShareBackground(qre.e(R.color.transparent));
        gxt gxtVar = this.o;
        if (gxtVar != null && gxtVar.u() == 8) {
            this.j.setShareWeChatFriendsVisibility(8);
        }
        this.j.setShareXhsVisibility(0);
        this.j.setShareDouyinVisibility(0);
        this.j.setBeforeClick(new ShareButtonView.DoBeforeClick() { // from class: com.huawei.pluginsocialshare.activity.MultiplePreviewActivity.3
            @Override // com.huawei.pluginsocialshare.view.ShareButtonView.DoBeforeClick
            public void onBeforeClick() {
                MultiplePreviewActivity.this.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        HashMap<String, String> map = new HashMap<>();
        map.put("currentSportType", Integer.toString(this.g.h()));
        map.put("shareLastTab" + this.g.h(), String.valueOf(this.k));
        ShareDataInfo shareDataInfoC = pmn.c(this.g.h());
        if (shareDataInfoC != null) {
            map.put("shareLastBackground" + this.g.h(), String.valueOf(shareDataInfoC.getId()));
            pmn.b(this.g.h(), shareDataInfoC);
        }
        String strD = pmn.d();
        if (!TextUtils.isEmpty(strD)) {
            map.put("shareLastSportDataAndMarkV2" + this.g.h(), strD);
        }
        this.j.setMap(map);
    }

    private void d(Map<String, Object> map) {
        if (this.g.m()) {
            ShareDataInfo shareDataInfoC = pmn.c(this.g.h());
            if (shareDataInfoC != null) {
                map.put("backgroundID", Integer.valueOf(shareDataInfoC.getId()));
                ReleaseLogUtil.d("Share_MultiplePreviewActivity", "bgId = " + shareDataInfoC.getId());
            }
            ShareDataInfo shareDataInfoA = pmn.a(this.g.h());
            if (shareDataInfoA != null) {
                map.put("stickerID", Integer.valueOf(shareDataInfoA.getId()));
                ReleaseLogUtil.d("Share_MultiplePreviewActivity", " stickerId = " + shareDataInfoA.getId());
            }
        }
        c(map, this.i.m());
        c(map, this.g.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("Share_MultiplePreviewActivity", "hide");
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private void i() {
        if (this.f == null) {
            this.f = pjm.d();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.share_bottom_close) {
            this.e.setState(4);
        } else if (id == R.id.coordinator_layout) {
            d();
        } else {
            LogUtil.a("Share_MultiplePreviewActivity", "onClick id:", Integer.valueOf(id));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        finish();
    }

    private gxt e() {
        gxt gxtVar;
        if (this.i == null) {
            return null;
        }
        HashMap map = new HashMap(16);
        ArrayList<gxy> arrayListE = this.i.e();
        if (!njy.c(arrayListE, this.h)) {
            ReleaseLogUtil.a("Share_MultiplePreviewActivity", "convertShareContent: position out of range:", Integer.valueOf(this.h));
            return null;
        }
        gxy gxyVar = arrayListE.get(this.h);
        this.g = gxyVar;
        Bitmap bitmapD = gxyVar.d();
        this.f22436c = pns.b(this.g);
        String strB = this.g.b();
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        this.f22435b = !zIsEmpty;
        if (this.f22436c) {
            gxtVar = new gxt(8);
            gxtVar.h(pns.d(this.g));
        } else if (!zIsEmpty) {
            gxtVar = new gxt(8);
            gxtVar.h(strB);
        } else if (bitmapD != null) {
            gxtVar = new gxt(1);
            gxtVar.d(this.g.d());
        } else {
            String strC = this.g.c();
            if (TextUtils.isEmpty(strC)) {
                return null;
            }
            gxtVar = new gxt(4);
            gxtVar.c(strC);
        }
        gxtVar.d(this.i.aa());
        gxtVar.a(this.i.h());
        gxtVar.f(this.i.ad());
        SaveBitampCallback saveBitampCallbackL = this.i.l();
        if (saveBitampCallbackL != null) {
            gxtVar.c(saveBitampCallbackL);
        }
        d(map);
        gxtVar.c(map);
        return gxtVar;
    }

    private void c(Map<String, Object> map, Map<String, Object> map2) {
        if (map == null || map2 == null) {
            return;
        }
        map.putAll(map2);
    }

    private Bitmap c(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Share_MultiplePreviewActivity", "getFirstFrameImage videoPath == null");
            return null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
            try {
                return frameAtTime;
            } catch (IOException unused) {
                return frameAtTime;
            }
        } catch (RuntimeException e) {
            ReleaseLogUtil.a("Share_MultiplePreviewActivity", "getFirstFrameImage exception" + e);
            return null;
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
                ReleaseLogUtil.d("Share_MultiplePreviewActivity", "getOriginalBitrate release IOException");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
