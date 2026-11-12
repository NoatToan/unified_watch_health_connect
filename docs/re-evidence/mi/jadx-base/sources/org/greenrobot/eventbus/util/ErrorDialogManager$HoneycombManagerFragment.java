package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import defpackage.ld8;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ld8 f29530a;

    @Override // android.app.Fragment
    public void onPause() {
        this.f29530a.r(this);
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        throw null;
    }
}
