package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w1 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f47886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f47887b;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.gcm_header_section_3_0, viewGroup, false);
        this.f47886a = (ViewGroup) viewGroup2.findViewById(R.id.section_header);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.section_container);
        this.f47887b = viewGroup3;
        this.f47887b.addView(u6(layoutInflater, viewGroup3));
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((f12.l) KoinJavaComponent.get(f12.l.class)).y();
    }

    public abstract View u6(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
