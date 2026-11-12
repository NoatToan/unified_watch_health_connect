package com.garmin.android.gncs.settings;

import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import ie2.j;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f49907b;

    public /* synthetic */ e(Fragment fragment, int i14) {
        this.f49906a = i14;
        this.f49907b = fragment;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
        int i15 = this.f49906a;
        Fragment fragment = this.f49907b;
        switch (i15) {
            case 0:
                return ((GNCSOptOutSettingsFragment) fragment).lambda$onCreateView$7(view2, i14, keyEvent);
            case 1:
                rv.a aVar = (rv.a) fragment;
                if (keyEvent.getAction() != 1 || i14 != 4) {
                    return false;
                }
                aVar.A6(new r22.a(aVar, 12));
                return true;
            default:
                w50.d dVar = (w50.d) fragment;
                int i16 = w50.d.f182192w;
                if (keyEvent == null || keyEvent.getAction() != 1 || i14 != 4) {
                    return false;
                }
                com.garmin.android.apps.connectmobile.courses.model.d dVar2 = dVar.f182203r;
                if (dVar2 != null) {
                    j jVar = (j) dVar.f182200o.get(dVar2.courseId);
                    if (jVar != null) {
                        jVar.k();
                    }
                    dVar.z6();
                } else {
                    dVar.requireActivity().getOnBackPressedDispatcher().d();
                }
                return true;
        }
    }
}
