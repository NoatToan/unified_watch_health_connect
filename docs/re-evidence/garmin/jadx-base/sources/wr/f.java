package wr;

import androidx.viewpager.widget.ViewPager;
import p005kotlin.Metadata;
import qr.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwr/f;", "Landroidx/viewpager/widget/ViewPager$m;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends ViewPager.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f186738a;

    public f(e eVar) {
        this.f186738a = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i14) {
        ((t) this.f186738a.f186714a.getValue()).E1 = i14;
    }
}
