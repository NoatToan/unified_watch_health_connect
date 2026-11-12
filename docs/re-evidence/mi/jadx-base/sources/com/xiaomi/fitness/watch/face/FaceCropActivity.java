package com.xiaomi.fitness.watch.face;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import defpackage.isi;
import defpackage.ovi;

/* JADX INFO: loaded from: classes10.dex */
public class FaceCropActivity extends BaseActivity {
    public Fragment h;

    public static void p(Activity activity, Parcelable parcelable, int i, String str, FaceData.BgStyle[] bgStyleArr, String str2, String str3, boolean z, boolean z2, int i2, boolean z3) {
        Intent intent = new Intent(activity, (Class<?>) FaceCropActivity.class);
        intent.putExtra("img_uri", parcelable);
        intent.putExtra(FaceEditPhotoPickerFragment.FACE_ID, str);
        intent.putExtra("multi_photos", z2);
        intent.putExtra("image_format", i2);
        intent.putExtra(FaceBlePhotoFragmentKt.EXTRA_STYLES, bgStyleArr);
        intent.putExtra(FaceBlePhotoFragmentKt.EXTRA_STYLE, str2);
        intent.putExtra(FaceBlePhotoFragmentKt.EXTRA_RET_PNG, z);
        intent.putExtra(FaceBlePhotoFragmentKt.EXTRA_BG, str3);
        intent.putExtra("wear_os_photos", z3);
        activity.startActivityForResult(intent, i);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.f29735a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || intent.getParcelableExtra("img_uri") == null) {
            finish();
            return;
        }
        setActionBarDisplayable(false);
        int intExtra = intent.getIntExtra("image_format", 0);
        k kVarO = getSupportFragmentManager().o();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("img_uri", intent.getParcelableExtra("img_uri"));
        String stringExtra = intent.getStringExtra(FaceEditPhotoPickerFragment.FACE_ID);
        boolean booleanExtra = intent.getBooleanExtra("multi_photos", false);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.h = new FaceBlePhotoFragment();
            bundle2.putString(FaceEditPhotoPickerFragment.FACE_ID, stringExtra);
            bundle2.putBoolean("multi_photos", booleanExtra);
            bundle2.putInt("image_format", intExtra);
            bundle2.putString(FaceBlePhotoFragmentKt.EXTRA_STYLE, intent.getStringExtra(FaceBlePhotoFragmentKt.EXTRA_STYLE));
            bundle2.putParcelableArray(FaceBlePhotoFragmentKt.EXTRA_STYLES, intent.getParcelableArrayExtra(FaceBlePhotoFragmentKt.EXTRA_STYLES));
            bundle2.putString(FaceBlePhotoFragmentKt.EXTRA_BG, intent.getStringExtra(FaceBlePhotoFragmentKt.EXTRA_BG));
            bundle2.putBoolean(FaceBlePhotoFragmentKt.EXTRA_RET_PNG, intent.getBooleanExtra(FaceBlePhotoFragmentKt.EXTRA_RET_PNG, false));
            bundle2.putBoolean("wear_os_photos", intent.getBooleanExtra("wear_os_photos", false));
        }
        this.h.setArguments(bundle2);
        kVarO.w(isi.F2, this.h);
        kVarO.m();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        Fragment fragment = this.h;
        if (fragment != null) {
            fragment.onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
