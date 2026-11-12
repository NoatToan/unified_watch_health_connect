package com.facebook.react;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.gsh;
import defpackage.mcj;
import defpackage.prh;
import defpackage.xdj;
import defpackage.zcj;

/* JADX INFO: loaded from: classes4.dex */
public class ReactFragment extends Fragment implements prh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zcj f7144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gsh f7145b;

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f7144a.f(i, i2, intent, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        Bundle bundle2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            string = getArguments().getString("arg_component_name");
            bundle2 = getArguments().getBundle("arg_launch_options");
        } else {
            string = null;
            bundle2 = null;
        }
        if (string == null) {
            throw new IllegalStateException("Cannot loadApp if component name is null");
        }
        FragmentActivity activity = getActivity();
        s();
        this.f7144a = new zcj(activity, null, string, bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7144a.d();
        return this.f7144a.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7144a.h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f7144a.i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        gsh gshVar = this.f7145b;
        if (gshVar == null || !gshVar.onRequestPermissionsResult(i, strArr, iArr)) {
            return;
        }
        this.f7145b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f7144a.j();
    }

    @Override // defpackage.prh
    @TargetApi(23)
    public void requestPermissions(String[] strArr, int i, gsh gshVar) {
        this.f7145b = gshVar;
        requestPermissions(strArr, i);
    }

    public xdj s() {
        ((mcj) getActivity().getApplication()).a();
        return null;
    }
}
