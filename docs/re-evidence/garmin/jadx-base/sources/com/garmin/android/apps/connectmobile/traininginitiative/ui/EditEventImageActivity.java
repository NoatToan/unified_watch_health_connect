package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.annotation.SuppressLint;
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
import android.view.View;
import android.webkit.URLUtil;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.i0;
import c22.k3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EditEventImageActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/EditEventImageActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditEventImageActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f45677f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static EditEventImageActivity f45678g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UCropView f45679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureCropImageView f45680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f45681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MenuItem f45682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MenuItem f45683e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.EditEventImageActivity$loadImageToCropView$2", f = "EditEventImageActivity.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f45685b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f45687d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f45687d = uri;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = EditEventImageActivity.this.new b(this.f45687d, dVar);
            bVar.f45685b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o53.b0 b0Var = (o53.b0) this.f45685b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45684a;
            EditEventImageActivity editEventImageActivity = EditEventImageActivity.this;
            if (i14 == 0) {
                o13.r.b(obj);
                k3 k3Var = k3.f23115a;
                this.f45685b = b0Var;
                this.f45684a = 1;
                obj = k3Var.b(editEventImageActivity, this.f45687d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Uri uri = (Uri) obj;
            if (uri == null) {
                p92.y.f136664a.getClass();
                p92.y.a.b("Store bitmap failed, uri is null");
            } else {
                GestureCropImageView gestureCropImageView = editEventImageActivity.f45680b;
                if (gestureCropImageView != null) {
                    gestureCropImageView.setImageUri(uri, editEventImageActivity.f45681c);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void ca(Uri uri) {
        UCropView uCropView = this.f45679a;
        if (uCropView == null) {
            p005kotlin.jvm.internal.s.m("uCropView");
            throw null;
        }
        uCropView.resetCropImageView();
        UCropView uCropView2 = this.f45679a;
        if (uCropView2 == null) {
            p005kotlin.jvm.internal.s.m("uCropView");
            throw null;
        }
        GestureCropImageView cropImageView = uCropView2.getCropImageView();
        cropImageView.getClass();
        cropImageView.setTargetAspectRatio(1.0f);
        cropImageView.setMaxResultImageSizeX(2048);
        cropImageView.setMaxResultImageSizeY(2048);
        cropImageView.setRotateEnabled(false);
        cropImageView.setScaleEnabled(true);
        l92.d.f111599a.getClass();
        cropImageView.setTransformImageListener(new l92.c(cropImageView, null, 0.0f));
        this.f45680b = cropImageView;
        if (URLUtil.isHttpUrl(uri.toString()) || URLUtil.isHttpsUrl(uri.toString())) {
            i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new b(uri, null), 2);
            return;
        }
        try {
            GestureCropImageView gestureCropImageView = this.f45680b;
            if (gestureCropImageView != null) {
                gestureCropImageView.setImageUri(uri, this.f45681c);
            }
        } catch (Exception e4) {
            String strN = fb1.c.n("Failed to load image. Exception: ", e4.getMessage());
            p92.y.f136664a.getClass();
            p92.y.a.b(strN);
        }
    }

    public final void da() {
        setResult(0);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 101 && i15 == -1 && intent != null) {
            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("imageData", hz1.e.class) : intent.getParcelableArrayListExtra("imageData");
            hz1.e eVar = parcelableArrayListExtra != null ? (hz1.e) parcelableArrayListExtra.get(0) : null;
            if (eVar != null) {
                ca(eVar.f86534a);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        da();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.ti_review_entries_edit_event_image);
        initActionBar(true, R.string.event_image);
        f45678g = this;
        Intent intent = getIntent();
        if (intent == null) {
            p92.y.f136664a.getClass();
            p92.y.a.b("No intent pass to EditEventImageActivity. Now close EditEventImageActivity");
            da();
            return;
        }
        try {
            this.f45681c = Uri.fromFile(File.createTempFile("cropped", ".png", getCacheDir()));
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
            if (uri == null) {
                p92.y.f136664a.getClass();
                p92.y.a.b("Input Uri is null, close CropImageActivity");
                da();
                return;
            }
            View viewFindViewById = findViewById(R.id.uCropView);
            viewFindViewById.getClass();
            UCropView uCropView = (UCropView) viewFindViewById;
            this.f45679a = uCropView;
            OverlayView overlayView = uCropView.getOverlayView();
            overlayView.getClass();
            overlayView.setCircleDimmedLayer(true);
            overlayView.setDimmedColor(getColor(R.color.gcm3_window_black_50_opacity));
            overlayView.setShowCropFrame(true);
            overlayView.setShowCropGrid(true);
            ca(uri);
            AppCompatButton appCompatButton = (AppCompatButton) findViewById(R.id.replace_image_button);
            AppCompatButton appCompatButton2 = (AppCompatButton) findViewById(R.id.delete_image_button);
            final int i14 = 0;
            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ EditEventImageActivity f167087b;

                {
                    this.f167087b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i14;
                    EditEventImageActivity editEventImageActivity = this.f167087b;
                    switch (i15) {
                        case 0:
                            EditEventImageActivity.a aVar = EditEventImageActivity.f45677f;
                            ImageMultiPickerActivity.f46078j.getClass();
                            editEventImageActivity.startActivityForResult(ImageMultiPickerActivity.a.a(editEventImageActivity, true), 101);
                            break;
                        default:
                            EditEventImageActivity.a aVar2 = EditEventImageActivity.f45677f;
                            TrainingInitiativeEventActivity.f45718o.getClass();
                            TrainingInitiativeEventActivity.a.b().ka().a6().m(null);
                            editEventImageActivity.finish();
                            break;
                    }
                }
            });
            final int i15 = 1;
            appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ EditEventImageActivity f167087b;

                {
                    this.f167087b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    EditEventImageActivity editEventImageActivity = this.f167087b;
                    switch (i16) {
                        case 0:
                            EditEventImageActivity.a aVar = EditEventImageActivity.f45677f;
                            ImageMultiPickerActivity.f46078j.getClass();
                            editEventImageActivity.startActivityForResult(ImageMultiPickerActivity.a.a(editEventImageActivity, true), 101);
                            break;
                        default:
                            EditEventImageActivity.a aVar2 = EditEventImageActivity.f45677f;
                            TrainingInitiativeEventActivity.f45718o.getClass();
                            TrainingInitiativeEventActivity.a.b().ka().a6().m(null);
                            editEventImageActivity.finish();
                            break;
                    }
                }
            });
        } catch (IOException e4) {
            String strN = fb1.c.n("Failed to create output uri. Exception: ", e4.getMessage());
            p92.y.f136664a.getClass();
            p92.y.a.b(strN);
            da();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.edit_event_image, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.crop_image_menu_rotate_left);
        this.f45682d = menuItemFindItem;
        Drawable icon = menuItemFindItem != null ? menuItemFindItem.getIcon() : null;
        if (icon != null) {
            icon.setTintList(ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_primary)));
        }
        MenuItem menuItem = this.f45682d;
        if (menuItem != null) {
            menuItem.setIcon(icon);
        }
        MenuItem menuItem2 = this.f45682d;
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        this.f45683e = menu.findItem(R.id.menu_item_done);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_done) {
            if (menuItem.getItemId() == R.id.crop_image_menu_rotate_left) {
                GestureCropImageView gestureCropImageView = this.f45680b;
                if (gestureCropImageView != null) {
                    gestureCropImageView.postRotate(-90);
                }
                return true;
            }
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            da();
            return true;
        }
        showProgressOverlay();
        MenuItem menuItem2 = this.f45682d;
        if (menuItem2 != null) {
            menuItem2.setEnabled(false);
        }
        MenuItem menuItem3 = this.f45683e;
        if (menuItem3 != null) {
            menuItem3.setEnabled(false);
        }
        TrainingInitiativeEventActivity.f45718o.getClass();
        TrainingInitiativeEventActivity.a.b().ka().a6().m(this.f45681c);
        GestureCropImageView gestureCropImageView2 = this.f45680b;
        if (gestureCropImageView2 != null) {
            gestureCropImageView2.cropAndSaveImage(Bitmap.CompressFormat.PNG, 100, new ty1.e(this));
        }
        TrainingInitiativeEventActivity.a.b().na();
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/EditEventImageActivity$a;", "", "<init>", "()V", "", "MAX_IMAGE_SIZE", "I", "REQUEST_CODE_SELECT_IMAGES", "", "PARAM_CROP_IMAGE_SOURCE", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
