package ia0;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lia0/b;", "", "", "Lj90/b;", "activityOptionsItems", "", "activityMaximumLimitReached", "activityMinimumLimitReached", "", "formatDescriptionArgs", "", "descriptionText", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "isLoading", "customizationComplete", "<init>", "(Ljava/util/List;ZZLjava/util/List;IZZZ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j90.b> f92408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f92409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f92411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f92412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f92413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f92415h;

    public b(List list, boolean z14, boolean z15, List list2, int i14, boolean z16, boolean z17, boolean z18, int i15, j jVar) {
        this((i15 & 1) != 0 ? j0.f134944a : list, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? false : z15, list2, i14, (i15 & 32) != 0 ? false : z16, (i15 & 64) != 0 ? false : z17, (i15 & 128) != 0 ? false : z18);
    }

    public static b a(b bVar, ArrayList arrayList, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14) {
        List<j90.b> list = arrayList;
        if ((i14 & 1) != 0) {
            list = bVar.f92408a;
        }
        List<j90.b> list2 = list;
        if ((i14 & 2) != 0) {
            z14 = bVar.f92409b;
        }
        boolean z19 = z14;
        if ((i14 & 4) != 0) {
            z15 = bVar.f92410c;
        }
        boolean z24 = z15;
        List<String> list3 = bVar.f92411d;
        int i15 = bVar.f92412e;
        if ((i14 & 32) != 0) {
            z16 = bVar.f92413f;
        }
        boolean z25 = z16;
        boolean z26 = (i14 & 64) != 0 ? bVar.f92414g : z17;
        boolean z27 = (i14 & 128) != 0 ? bVar.f92415h : z18;
        bVar.getClass();
        list2.getClass();
        list3.getClass();
        return new b(list2, z19, z24, list3, i15, z25, z26, z27);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f92408a, bVar.f92408a) && this.f92409b == bVar.f92409b && this.f92410c == bVar.f92410c && s.g(this.f92411d, bVar.f92411d) && this.f92412e == bVar.f92412e && this.f92413f == bVar.f92413f && this.f92414g == bVar.f92414g && this.f92415h == bVar.f92415h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92415h) + q6.f.g(q6.f.g(q2.d(this.f92412e, u0.b(q6.f.g(q6.f.g(this.f92408a.hashCode() * 31, 31, this.f92409b), 31, this.f92410c), 31, this.f92411d), 31), 31, this.f92413f), 31, this.f92414g);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityOptionsUiState(activityOptionsItems=");
        sb3.append(this.f92408a);
        sb3.append(", activityMaximumLimitReached=");
        sb3.append(this.f92409b);
        sb3.append(", activityMinimumLimitReached=");
        sb3.append(this.f92410c);
        sb3.append(", formatDescriptionArgs=");
        sb3.append(this.f92411d);
        sb3.append(", descriptionText=");
        fb1.c.x(sb3, this.f92412e, ", error=", this.f92413f, ", isLoading=");
        return com.airbnb.lottie.animation.keyframe.a.f(", customizationComplete=", ")", sb3, this.f92414g, this.f92415h);
    }

    public b(List<j90.b> list, boolean z14, boolean z15, List<String> list2, int i14, boolean z16, boolean z17, boolean z18) {
        list.getClass();
        list2.getClass();
        this.f92408a = list;
        this.f92409b = z14;
        this.f92410c = z15;
        this.f92411d = list2;
        this.f92412e = i14;
        this.f92413f = z16;
        this.f92414g = z17;
        this.f92415h = z18;
    }
}
