package org.greenrobot.eventbus.util;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import defpackage.ld8;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorDialogManager$SupportManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ld8 f29531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29532b;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f29531a.r(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f29532b) {
            throw null;
        }
        this.f29532b = false;
    }
}
