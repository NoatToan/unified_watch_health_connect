package n12;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel;
import com.yalantis.ucrop.view.GestureCropImageView;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileImageActivity f122228b;

    public /* synthetic */ d(EditProfileImageActivity editProfileImageActivity, int i14) {
        this.f122227a = i14;
        this.f122228b = editProfileImageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f122227a;
        EditProfileImageActivity editProfileImageActivity = this.f122228b;
        switch (i14) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MenuItem menuItem = editProfileImageActivity.f46583g;
                if (menuItem != null) {
                    menuItem.setEnabled(zBooleanValue);
                }
                return Unit.INSTANCE;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                EditProfileImageActivity.a aVar = EditProfileImageActivity.f46576j;
                if (zBooleanValue2) {
                    editProfileImageActivity.showProgressOverlay();
                } else {
                    editProfileImageActivity.hideProgressOverlay();
                }
                return Unit.INSTANCE;
            case 2:
                EditProfileImageActivity.a aVar2 = EditProfileImageActivity.f46576j;
                ((Unit) obj).getClass();
                d dVar = new d(editProfileImageActivity, 5);
                com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = editProfileImageActivity.f46578b;
                if (cVar == null) {
                    p005kotlin.jvm.internal.s.m("editProfileImageViewHolder");
                    throw null;
                }
                e eVar = new e(dVar, editProfileImageActivity);
                GestureCropImageView gestureCropImageView = cVar.f46668k;
                if (gestureCropImageView != null) {
                    gestureCropImageView.cropAndSaveImage(Bitmap.CompressFormat.PNG, 100, eVar);
                }
                return Unit.INSTANCE;
            case 3:
                EditProfileImageActivity.a aVar3 = EditProfileImageActivity.f46576j;
                ((Unit) obj).getClass();
                ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).l();
                editProfileImageActivity.setResult(-1);
                editProfileImageActivity.finish();
                return Unit.INSTANCE;
            case 4:
                Exception exc = (Exception) obj;
                EditProfileImageActivity.a aVar4 = EditProfileImageActivity.f46576j;
                exc.getClass();
                int i15 = exc instanceof EditProfileImageViewModel.UploadFailedException ? R.string.social_group_upload_failed : R.string.txt_error_occurred;
                r22.q0.b bVar = r22.q0.f149800b;
                View view2 = editProfileImageActivity.f46579c;
                if (view2 == null) {
                    p005kotlin.jvm.internal.s.m("rootContainer");
                    throw null;
                }
                bVar.getClass();
                r22.q0.b.a(view2, i15, 0).show();
                return Unit.INSTANCE;
            default:
                Uri uri = (Uri) obj;
                EditProfileImageActivity.a aVar5 = EditProfileImageActivity.f46576j;
                uri.getClass();
                EditProfileImageViewModel editProfileImageViewModelCa = editProfileImageActivity.ca();
                if (editProfileImageViewModelCa.E4() && editProfileImageViewModelCa.z4() && !editProfileImageViewModelCa.B4()) {
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var, "EditProfileImageViewModel", "Image is uploaded photo, upload a new photo, frame is not changed");
                    editProfileImageViewModelCa.H4(editProfileImageActivity, uri, com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO, null);
                } else if (editProfileImageViewModelCa.E4() && editProfileImageViewModelCa.z4() && editProfileImageViewModelCa.B4()) {
                    com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) editProfileImageViewModelCa.f46608l.d();
                    String uuid = eVar2 != null ? eVar2.getUuid() : null;
                    String strN = fb1.c.n("Image is uploaded photo, upload a new photo, change to new frame, frame key is: ", uuid);
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.b(a2Var2, "EditProfileImageViewModel", strN);
                    editProfileImageViewModelCa.H4(editProfileImageActivity, uri, com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO, uuid);
                } else if (editProfileImageViewModelCa.E4() && editProfileImageViewModelCa.z4() && editProfileImageViewModelCa.C4()) {
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.b(a2Var3, "EditProfileImageViewModel", "Image is uploaded photo, upload a new photo, change to no frame");
                    editProfileImageViewModelCa.H4(editProfileImageActivity, uri, com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO, "NO_FRAME");
                } else {
                    String strF = com.airbnb.lottie.animation.keyframe.a.f(", isNoFrame: ", " }", com.airbnb.lottie.animation.keyframe.a.m("error case in updateCroppedImage. Current stats is not for cropping. {isProfileImage: ", ", isImageChanged: ", ", isNewFrame: ", editProfileImageViewModelCa.E4(), editProfileImageViewModelCa.z4()), editProfileImageViewModelCa.B4(), editProfileImageViewModelCa.C4());
                    i2.a aVar9 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar9.getClass();
                    i2.a.f(a2Var4, "EditProfileImageViewModel", strF);
                    editProfileImageViewModelCa.G4(new Exception("Unhandled cases"));
                }
                return Unit.INSTANCE;
        }
    }
}
