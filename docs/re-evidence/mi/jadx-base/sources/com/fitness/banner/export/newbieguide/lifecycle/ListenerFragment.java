package com.fitness.banner.export.newbieguide.lifecycle;

import androidx.fragment.app.Fragment;
import defpackage.d9a;

/* JADX INFO: loaded from: classes4.dex */
public class ListenerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d9a f7746a;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        d9a d9aVar = this.f7746a;
        if (d9aVar != null) {
            d9aVar.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        d9a d9aVar = this.f7746a;
        if (d9aVar != null) {
            d9aVar.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        d9a d9aVar = this.f7746a;
        if (d9aVar != null) {
            d9aVar.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        d9a d9aVar = this.f7746a;
        if (d9aVar != null) {
            d9aVar.onStop();
        }
    }
}
