package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import java.io.File;
import java.io.IOException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/CropImageActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CropImageActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f45671f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GestureCropImageView f45672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MenuItem f45673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MenuItem f45674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f45676e;

    public final void ca() {
        setResult(0);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        ca();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.ti_add_event_crop_image_activity);
        initActionBar(true, R.string.social_choose_photo);
        Intent intent = getIntent();
        if (intent == null) {
            p92.y.f136664a.getClass();
            p92.y.a.b("No intent pass to CropImageActivity. Now close CropImageActivity");
            ca();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("CropImageSource", Uri.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("CropImageSource");
            if (!(parcelableExtra instanceof Uri)) {
                parcelableExtra = null;
            }
            parcelable = (Uri) parcelableExtra;
        }
        Uri uri = (Uri) parcelable;
        this.f45675d = intent.getBooleanExtra("IsFromReviewEntries", false);
        if (uri == null) {
            p92.y.f136664a.getClass();
            p92.y.a.b("Input Uri is null, close CropImageActivity");
            ca();
            return;
        }
        try {
            this.f45676e = Uri.fromFile(File.createTempFile("cropped", ".png", getCacheDir()));
            UCropView uCropView = (UCropView) findViewById(R.id.uCropView);
            OverlayView overlayView = uCropView.getOverlayView();
            overlayView.getClass();
            overlayView.setCircleDimmedLayer(true);
            overlayView.setDimmedColor(getColor(R.color.gcm3_window_black_50_opacity));
            overlayView.setShowCropFrame(true);
            overlayView.setShowCropGrid(true);
            GestureCropImageView cropImageView = uCropView.getCropImageView();
            l92.d dVar = l92.d.f111599a;
            cropImageView.getClass();
            dVar.getClass();
            cropImageView.setTransformImageListener(new l92.c(cropImageView, null, 0.0f));
            this.f45672a = cropImageView;
            cropImageView.setTargetAspectRatio(1.0f);
            GestureCropImageView gestureCropImageView = this.f45672a;
            if (gestureCropImageView != null) {
                gestureCropImageView.setMaxResultImageSizeX(298);
            }
            GestureCropImageView gestureCropImageView2 = this.f45672a;
            if (gestureCropImageView2 != null) {
                gestureCropImageView2.setMaxResultImageSizeY(298);
            }
            GestureCropImageView gestureCropImageView3 = this.f45672a;
            if (gestureCropImageView3 != null) {
                gestureCropImageView3.setRotateEnabled(false);
            }
            GestureCropImageView gestureCropImageView4 = this.f45672a;
            if (gestureCropImageView4 != null) {
                gestureCropImageView4.setScaleEnabled(true);
            }
            try {
                GestureCropImageView gestureCropImageView5 = this.f45672a;
                if (gestureCropImageView5 != null) {
                    gestureCropImageView5.setImageUri(uri, this.f45676e);
                }
                ((TextView) findViewById(R.id.select_different_image)).setOnClickListener(new t61.m(this, 9));
            } catch (Exception e4) {
                String strN = fb1.c.n("Failed to load image. Exception: ", e4.getMessage());
                p92.y.f136664a.getClass();
                p92.y.a.b(strN);
                ca();
            }
        } catch (IOException e14) {
            String strN2 = fb1.c.n("Failed to create output uri. Exception: ", e14.getMessage());
            p92.y.f136664a.getClass();
            p92.y.a.b(strN2);
            ca();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.share_image_crop, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.crop_image_menu_rotate_left);
        this.f45673b = menuItemFindItem;
        Drawable icon = menuItemFindItem != null ? menuItemFindItem.getIcon() : null;
        if (icon != null) {
            icon.setTintList(ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_primary)));
            MenuItem menuItem = this.f45673b;
            if (menuItem != null) {
                menuItem.setIcon(icon);
            }
        }
        MenuItem menuItem2 = this.f45673b;
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        this.f45674c = menu.findItem(R.id.menu_item_next);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_next) {
            if (menuItem.getItemId() == R.id.crop_image_menu_rotate_left) {
                GestureCropImageView gestureCropImageView = this.f45672a;
                if (gestureCropImageView != null) {
                    gestureCropImageView.postRotate(-90);
                }
                return true;
            }
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            ca();
            return true;
        }
        showProgressOverlay();
        MenuItem menuItem2 = this.f45673b;
        menuItem2.getClass();
        menuItem2.setEnabled(false);
        MenuItem menuItem3 = this.f45674c;
        menuItem3.getClass();
        menuItem3.setEnabled(false);
        TrainingInitiativeEventActivity.f45718o.getClass();
        TrainingInitiativeEventActivity.a.b().ka().a6().m(this.f45676e);
        GestureCropImageView gestureCropImageView2 = this.f45672a;
        if (gestureCropImageView2 != null) {
            gestureCropImageView2.cropAndSaveImage(Bitmap.CompressFormat.PNG, 100, new ty1.c(this));
        }
        if (!this.f45675d) {
            TrainingInitiativeEventActivity.a.b().na();
            return true;
        }
        EditEventImageActivity.f45677f.getClass();
        EditEventImageActivity editEventImageActivity = EditEventImageActivity.f45678g;
        if (editEventImageActivity != null) {
            editEventImageActivity.finish();
        }
        ImageMultiPickerActivity.f46078j.getClass();
        ImageMultiPickerActivity imageMultiPickerActivity = ImageMultiPickerActivity.f46079k;
        if (imageMultiPickerActivity != null) {
            imageMultiPickerActivity.finish();
            return true;
        }
        p005kotlin.jvm.internal.s.m("instance");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/CropImageActivity$a;", "", "<init>", "()V", "", "MAX_IMAGE_SIZE", "I", "", "PARAM_IS_FROM_REVIEW", "Ljava/lang/String;", "PARAM_CROP_IMAGE_SOURCE", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
