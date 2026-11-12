package he;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;

/* JADX INFO: loaded from: classes7.dex */
public class b extends v.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f83467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f83468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f83469c;

    public b(a aVar, Fragment fragment, FrameLayout frameLayout) {
        this.f83469c = aVar;
        this.f83467a = fragment;
        this.f83468b = frameLayout;
    }

    @Override // androidx.fragment.app.v.m
    public final void onFragmentViewCreated(v vVar, Fragment fragment, View view2, Bundle bundle) {
        if (fragment == this.f83467a) {
            vVar.s0(this);
            this.f83469c.getClass();
            a.r(view2, this.f83468b);
        }
    }
}
