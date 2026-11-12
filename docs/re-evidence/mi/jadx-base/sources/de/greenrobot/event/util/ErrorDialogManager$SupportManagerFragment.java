package de.greenrobot.event.util;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import defpackage.kd8;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorDialogManager$SupportManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kd8 f15424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15425b;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f15424a.l(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f15425b) {
            throw null;
        }
        this.f15425b = false;
    }
}
