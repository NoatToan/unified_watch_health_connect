package ix;

import b63.o;
import b63.z;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lix/l;", "", "", "isLoading", "Lo82/g;", "initialSelectedIntervalType", "Lb63/o;", "initialSelectedDate", "isSummarySelected", "showBodyBatteryTooltipPortrait", "showBodyBatteryTooltipLandscape", "isScreenInPortrait", "isAutorotateEnabled", "", "Ljx/c;", "selectedOverlaysList", "<init>", "(ZLo82/g;Lb63/o;ZZZZZLjava/util/List;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f95662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f95663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f95665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f95667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f95668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<jx.c> f95669i;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(boolean z14, o82.g gVar, o oVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        gVar = (i14 & 2) != 0 ? o82.g.f130850c : gVar;
        if ((i14 & 4) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(z14, gVar, oVar, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? true : z18, (i14 & 128) != 0 ? false : z19, (i14 & 256) != 0 ? h0.b1(jx.c.f101391g) : list);
    }

    public static l a(l lVar, boolean z14, o82.g gVar, o oVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, ArrayList arrayList, int i14) {
        if ((i14 & 1) != 0) {
            z14 = lVar.f95661a;
        }
        boolean z24 = z14;
        if ((i14 & 2) != 0) {
            gVar = lVar.f95662b;
        }
        o82.g gVar2 = gVar;
        if ((i14 & 4) != 0) {
            oVar = lVar.f95663c;
        }
        o oVar2 = oVar;
        if ((i14 & 8) != 0) {
            z15 = lVar.f95664d;
        }
        boolean z25 = z15;
        if ((i14 & 16) != 0) {
            z16 = lVar.f95665e;
        }
        boolean z26 = z16;
        boolean z27 = (i14 & 32) != 0 ? lVar.f95666f : z17;
        boolean z28 = (i14 & 64) != 0 ? lVar.f95667g : z18;
        boolean z29 = (i14 & 128) != 0 ? lVar.f95668h : z19;
        List<jx.c> list = (i14 & 256) != 0 ? lVar.f95669i : arrayList;
        lVar.getClass();
        gVar2.getClass();
        oVar2.getClass();
        list.getClass();
        return new l(z24, gVar2, oVar2, z25, z26, z27, z28, z29, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f95661a == lVar.f95661a && this.f95662b == lVar.f95662b && s.g(this.f95663c, lVar.f95663c) && this.f95664d == lVar.f95664d && this.f95665e == lVar.f95665e && this.f95666f == lVar.f95666f && this.f95667g == lVar.f95667g && this.f95668h == lVar.f95668h && s.g(this.f95669i, lVar.f95669i);
    }

    public final int hashCode() {
        return this.f95669i.hashCode() + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(n23.j.a(this.f95663c.f16206a, q6.f.i(this.f95662b, Boolean.hashCode(this.f95661a) * 31, 31), 31), 31, this.f95664d), 31, this.f95665e), 31, this.f95666f), 31, this.f95667g), 31, this.f95668h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BodyBatteryUiState(isLoading=");
        sb3.append(this.f95661a);
        sb3.append(", initialSelectedIntervalType=");
        sb3.append(this.f95662b);
        sb3.append(", initialSelectedDate=");
        sb3.append(this.f95663c);
        sb3.append(", isSummarySelected=");
        sb3.append(this.f95664d);
        sb3.append(", showBodyBatteryTooltipPortrait=");
        kg.f.q(", showBodyBatteryTooltipLandscape=", ", isScreenInPortrait=", sb3, this.f95665e, this.f95666f);
        kg.f.q(", isAutorotateEnabled=", ", selectedOverlaysList=", sb3, this.f95667g, this.f95668h);
        return u62.z.c(sb3, this.f95669i, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(boolean z14, o82.g gVar, o oVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, List<? extends jx.c> list) {
        gVar.getClass();
        oVar.getClass();
        list.getClass();
        this.f95661a = z14;
        this.f95662b = gVar;
        this.f95663c = oVar;
        this.f95664d = z15;
        this.f95665e = z16;
        this.f95666f = z17;
        this.f95667g = z18;
        this.f95668h = z19;
        this.f95669i = list;
    }

    public l() {
        this(false, null, null, false, false, false, false, false, null, 511, null);
    }
}
