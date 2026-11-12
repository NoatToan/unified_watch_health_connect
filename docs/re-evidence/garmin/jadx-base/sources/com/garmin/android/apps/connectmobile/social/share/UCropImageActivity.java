package com.garmin.android.apps.connectmobile.social.share;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import androidx.lifecycle.b0;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import f.j;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import ro0.g;
import ro1.r0;
import ro1.s0;
import ro1.t0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/UCropImageActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UCropImageActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f44623o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UCropView f44624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureCropImageView f44625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f44626c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f44632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f44633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuItem f44634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f44635l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f44627d = m.b(new g(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f44628e = b.RECTANGLE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44629f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44630g = 100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44631h = 1024;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f44636m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.c<j> f44637n = registerForActivityResult(new g.e(), new jp.a(this, 26));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/UCropImageActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        OVAL,
        RECTANGLE
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/share/UCropImageActivity$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            UCropImageActivity uCropImageActivity = UCropImageActivity.this;
            uCropImageActivity.setResult(0);
            uCropImageActivity.finish();
        }
    }

    public static final Intent ca(Context context, Uri uri) {
        a aVar = f44623o;
        aVar.getClass();
        uri.getClass();
        return a.a(aVar, context, uri, 375, 180, null, null, 0.0f, PsExtractor.VIDEO_STREAM_MASK);
    }

    public final void da() {
        UCropView uCropView = this.f44624a;
        if (uCropView == null) {
            p005kotlin.jvm.internal.s.m("uCropView");
            throw null;
        }
        uCropView.resetCropImageView();
        UCropView uCropView2 = this.f44624a;
        if (uCropView2 == null) {
            p005kotlin.jvm.internal.s.m("uCropView");
            throw null;
        }
        GestureCropImageView cropImageView = uCropView2.getCropImageView();
        cropImageView.getClass();
        cropImageView.setTargetAspectRatio(this.f44629f / this.f44630g);
        int i14 = this.f44631h;
        if (i14 > 0) {
            cropImageView.setMaxResultImageSizeX(i14);
            cropImageView.setMaxResultImageSizeY(this.f44631h);
        }
        cropImageView.setRotateEnabled(false);
        cropImageView.setScaleEnabled(false);
        this.f44625b = cropImageView;
        Uri uri = this.f44626c;
        if (uri == null) {
            p005kotlin.jvm.internal.s.m("imageUri");
            throw null;
        }
        String string = uri.toString();
        string.getClass();
        boolean zIsHttpUrl = URLUtil.isHttpUrl(string);
        boolean zIsHttpsUrl = URLUtil.isHttpsUrl(string);
        Uri uri2 = this.f44626c;
        if (uri2 == null) {
            p005kotlin.jvm.internal.s.m("imageUri");
            throw null;
        }
        boolean zEquals = "android.resource".equals(uri2.getScheme());
        if (zIsHttpUrl || zIsHttpsUrl || zEquals) {
            Uri uri3 = this.f44626c;
            if (uri3 == null) {
                p005kotlin.jvm.internal.s.m("imageUri");
                throw null;
            }
            zp0.c.f206560v.getClass();
            zp0.c cVar = new zp0.c((androidx.fragment.app.m) this);
            cVar.f206568h = uri3;
            cVar.d(new t0(this));
            return;
        }
        Uri uri4 = this.f44626c;
        if (uri4 == null) {
            p005kotlin.jvm.internal.s.m("imageUri");
            throw null;
        }
        Uri uri5 = (Uri) this.f44627d.getValue();
        GestureCropImageView gestureCropImageView = this.f44625b;
        if (gestureCropImageView != null) {
            l92.d dVar = l92.d.f111599a;
            Rect rect = this.f44632i;
            float f14 = this.f44633j;
            dVar.getClass();
            gestureCropImageView.setTransformImageListener(new l92.c(gestureCropImageView, rect, f14));
            gestureCropImageView.setImageUri(uri4, uri5);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object serializableExtra;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_u_crop_image_activity);
        getOnBackPressedDispatcher().a(this.f44636m);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("input_uri", Uri.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("input_uri") : null;
            if (!(parcelableExtra instanceof Uri)) {
                parcelableExtra = null;
            }
            parcelable = (Uri) parcelableExtra;
        }
        Uri uri = (Uri) parcelable;
        if (uri == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "UCropImageActivity", "Did not provide image uri");
            finish();
        } else {
            this.f44626c = uri;
            Intent intent2 = getIntent();
            if (i14 >= 33) {
                serializableExtra = intent2 != null ? intent2.getSerializableExtra("Sharp", b.class) : null;
            } else {
                Object serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("Sharp") : null;
                if (!(serializableExtra2 instanceof b)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (b) serializableExtra2;
            }
            b bVar = (b) serializableExtra;
            if (bVar == null) {
                bVar = b.RECTANGLE;
            }
            this.f44628e = bVar;
            this.f44629f = getIntent().getIntExtra("Aspect_Ratio_X", 100);
            this.f44630g = getIntent().getIntExtra("Aspect_Ratio_Y", 100);
            this.f44631h = getIntent().getIntExtra("Max_Image_size", 1024);
            Intent intent3 = getIntent();
            if (i14 >= 33) {
                parcelable2 = intent3 != null ? (Parcelable) intent3.getParcelableExtra("crop_rect", Rect.class) : null;
            } else {
                Parcelable parcelableExtra2 = intent3 != null ? intent3.getParcelableExtra("crop_rect") : null;
                if (!(parcelableExtra2 instanceof Rect)) {
                    parcelableExtra2 = null;
                }
                parcelable2 = (Rect) parcelableExtra2;
            }
            this.f44632i = (Rect) parcelable2;
            this.f44633j = getIntent().getFloatExtra("rotate_angle", 0.0f);
        }
        initActionBar(true, R.string.social_zoom_and_crop);
        View viewFindViewById = findViewById(R.id.cropView);
        viewFindViewById.getClass();
        UCropView uCropView = (UCropView) viewFindViewById;
        this.f44624a = uCropView;
        OverlayView overlayView = uCropView.getOverlayView();
        overlayView.setDimmedColor(getColor(R.color.edit_profile_image_overlay_mask_color));
        overlayView.setCropFrameColor(getColor(R.color.gcm_border_selected));
        overlayView.setCropGridColor(getColor(R.color.gcm_border_selected));
        overlayView.setCircleDimmedLayer(this.f44628e == b.OVAL);
        overlayView.setShowCropFrame(true);
        overlayView.setShowCropGrid(true);
        UCropView uCropView2 = this.f44624a;
        if (uCropView2 == null) {
            p005kotlin.jvm.internal.s.m("uCropView");
            throw null;
        }
        uCropView2.addOnLayoutChangeListener(new s0(this));
        View viewFindViewById2 = findViewById(R.id.new_photo_btn);
        viewFindViewById2.getClass();
        ((Button) viewFindViewById2).setOnClickListener(new oq.a(this, 19));
        addMenuProvider(new r0(this), this, b0.b.RESUMED);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/UCropImageActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PARAM_INPUT_URI", "PARAM_ORIGINAL_URI", "PARAM_CROP_RECT", "PARAM_ROTATE_ANGLE", "PARAM_SHARP", "PARAM_ASPECT_RATIO_X", "PARAM_ASPECT_RATIO_Y", "PARAM_MAX_IMAGE_SIZE", "", "DEFAULT_ASPECT_RATIO", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, Uri uri, int i14, int i15, b bVar, Rect rect, float f14, int i16) {
            if ((i16 & 4) != 0) {
                i14 = 100;
            }
            if ((i16 & 8) != 0) {
                i15 = 100;
            }
            if ((i16 & 16) != 0) {
                bVar = b.RECTANGLE;
            }
            int i17 = (i16 & 32) != 0 ? 1024 : -1;
            if ((i16 & 64) != 0) {
                rect = null;
            }
            if ((i16 & 128) != 0) {
                f14 = 0.0f;
            }
            aVar.getClass();
            context.getClass();
            uri.getClass();
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) UCropImageActivity.class);
            intent.putExtra("input_uri", uri);
            intent.putExtra("Sharp", bVar);
            intent.putExtra("Aspect_Ratio_X", i14);
            intent.putExtra("Aspect_Ratio_Y", i15);
            intent.putExtra("Max_Image_size", i17);
            intent.putExtra("crop_rect", rect);
            intent.putExtra("rotate_angle", f14);
            return intent;
        }

        private a() {
        }
    }
}
