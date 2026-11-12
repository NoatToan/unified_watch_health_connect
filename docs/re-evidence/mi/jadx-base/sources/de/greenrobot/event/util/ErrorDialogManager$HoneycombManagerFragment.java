package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import defpackage.kd8;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kd8 f15423a;

    @Override // android.app.Fragment
    public void onPause() {
        this.f15423a.l(this);
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        throw null;
    }
}
