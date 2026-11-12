package wq0;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwq0/z;", "", "", "isLoading", "", "Lwq0/a0$b;", "visibleItems", "hiddenItems", "showError", "showMinInsightsDialog", "hasSavedChanges", "<init>", "(ZLjava/util/List;Ljava/util/List;ZZZ)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f186616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a0.b> f186617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a0.b> f186618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f186619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f186620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f186621f;

    public z(boolean z14, List list, List list2, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? j0.f134944a : list2, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17);
    }

    public static z a(z zVar, boolean z14, List list, List list2, boolean z15, boolean z16, boolean z17, int i14) {
        if ((i14 & 1) != 0) {
            z14 = zVar.f186616a;
        }
        boolean z18 = z14;
        if ((i14 & 2) != 0) {
            list = zVar.f186617b;
        }
        List list3 = list;
        if ((i14 & 4) != 0) {
            list2 = zVar.f186618c;
        }
        List list4 = list2;
        if ((i14 & 8) != 0) {
            z15 = zVar.f186619d;
        }
        boolean z19 = z15;
        if ((i14 & 16) != 0) {
            z16 = zVar.f186620e;
        }
        boolean z24 = z16;
        if ((i14 & 32) != 0) {
            z17 = zVar.f186621f;
        }
        zVar.getClass();
        list3.getClass();
        list4.getClass();
        return new z(z18, list3, list4, z19, z24, z17);
    }

    public final List<a0> b() {
        w0 w0Var = new w0(4);
        w0Var.a(new a0.a(R.string.common_visible, "visible"));
        w0Var.b(this.f186617b.toArray(new a0.b[0]));
        w0Var.a(new a0.a(R.string.common_hidden, "hidden"));
        w0Var.b(this.f186618c.toArray(new a0.b[0]));
        ArrayList<Object> arrayList = w0Var.f105816a;
        return p13.x.k(arrayList.toArray(new a0[arrayList.size()]));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f186616a == zVar.f186616a && p005kotlin.jvm.internal.s.g(this.f186617b, zVar.f186617b) && p005kotlin.jvm.internal.s.g(this.f186618c, zVar.f186618c) && this.f186619d == zVar.f186619d && this.f186620e == zVar.f186620e && this.f186621f == zVar.f186621f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186621f) + q6.f.g(q6.f.g(u0.b(u0.b(Boolean.hashCode(this.f186616a) * 31, 31, this.f186617b), 31, this.f186618c), 31, this.f186619d), 31, this.f186620e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InsightsEditUIState(isLoading=");
        sb3.append(this.f186616a);
        sb3.append(", visibleItems=");
        sb3.append(this.f186617b);
        sb3.append(", hiddenItems=");
        sb3.append(this.f186618c);
        sb3.append(", showError=");
        sb3.append(this.f186619d);
        sb3.append(", showMinInsightsDialog=");
        return com.airbnb.lottie.animation.keyframe.a.f(", hasSavedChanges=", ")", sb3, this.f186620e, this.f186621f);
    }

    public z() {
        this(false, null, null, false, false, false, 63, null);
    }

    public z(boolean z14, List<a0.b> list, List<a0.b> list2, boolean z15, boolean z16, boolean z17) {
        list.getClass();
        list2.getClass();
        this.f186616a = z14;
        this.f186617b = list;
        this.f186618c = list2;
        this.f186619d = z15;
        this.f186620e = z16;
        this.f186621f = z17;
    }
}
