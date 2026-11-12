package com.mi.health.qrcode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.widget.view.ViewfinderView;
import defpackage.r7h;
import defpackage.sqi;
import defpackage.wti;
import defpackage.yj3;

/* JADX INFO: loaded from: classes5.dex */
public class CaptureFragment extends Fragment implements r7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f10048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceView f10049b;
    public ViewfinderView c;
    public View d;
    public yj3 e;

    public int getLayoutId() {
        return wti.f38344a;
    }

    public void initUI() {
        this.f10049b = (SurfaceView) this.f10048a.findViewById(t());
        int iU = u();
        if (iU != 0) {
            this.c = (ViewfinderView) this.f10048a.findViewById(iU);
        }
        int iS = s();
        if (iS != 0) {
            View viewFindViewById = this.f10048a.findViewById(iS);
            this.d = viewFindViewById;
            viewFindViewById.setVisibility(4);
        }
        v();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.e.p();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (w(getLayoutId())) {
            this.f10048a = layoutInflater.inflate(getLayoutId(), viewGroup, false);
        }
        initUI();
        return this.f10048a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.e.q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.e.r();
    }

    @Override // defpackage.r7h
    public boolean onResultCallback(String str) {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.e.u();
    }

    public int s() {
        return sqi.e;
    }

    public int t() {
        return sqi.i;
    }

    public int u() {
        return sqi.l;
    }

    public void v() {
        yj3 yj3Var = new yj3(this, this.f10049b, this.c, this.d);
        this.e = yj3Var;
        yj3Var.y(this);
    }

    public boolean w(int i) {
        return true;
    }
}
