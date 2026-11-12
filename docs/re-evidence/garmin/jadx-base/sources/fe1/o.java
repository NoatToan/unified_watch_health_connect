package fe1;

import b63.z;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfe1/o;", "", "", "isLoading", "Lo82/g;", "selectedIntervalType", "Lb63/o;", "selectedDate", "", "Lge1/c;", "selectedOverlaysList", "", "respirationVersion", "<init>", "(ZLo82/g;Lb63/o;Ljava/util/List;Ljava/lang/Integer;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f70579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82.g f70580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.o f70581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ge1.c> f70582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f70583e;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(boolean z14, o82.g gVar, b63.o oVar, List list, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        gVar = (i14 & 2) != 0 ? o82.g.f130850c : gVar;
        if ((i14 & 4) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            z.INSTANCE.getClass();
            oVar = b63.b.f(c0229a, z.Companion.a());
        }
        this(z14, gVar, oVar, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? null : num);
    }

    public static o a(o oVar, boolean z14, o82.g gVar, b63.o oVar2, ArrayList arrayList, Integer num, int i14) {
        if ((i14 & 1) != 0) {
            z14 = oVar.f70579a;
        }
        boolean z15 = z14;
        if ((i14 & 2) != 0) {
            gVar = oVar.f70580b;
        }
        o82.g gVar2 = gVar;
        if ((i14 & 4) != 0) {
            oVar2 = oVar.f70581c;
        }
        b63.o oVar3 = oVar2;
        List<ge1.c> list = arrayList;
        if ((i14 & 8) != 0) {
            list = oVar.f70582d;
        }
        List<ge1.c> list2 = list;
        if ((i14 & 16) != 0) {
            num = oVar.f70583e;
        }
        oVar.getClass();
        gVar2.getClass();
        oVar3.getClass();
        list2.getClass();
        return new o(z15, gVar2, oVar3, list2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f70579a == oVar.f70579a && this.f70580b == oVar.f70580b && s.g(this.f70581c, oVar.f70581c) && s.g(this.f70582d, oVar.f70582d) && s.g(this.f70583e, oVar.f70583e);
    }

    public final int hashCode() {
        int iB = u0.b(n23.j.a(this.f70581c.f16206a, q6.f.i(this.f70580b, Boolean.hashCode(this.f70579a) * 31, 31), 31), 31, this.f70582d);
        Integer num = this.f70583e;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RespirationUiState(isLoading=");
        sb3.append(this.f70579a);
        sb3.append(", selectedIntervalType=");
        sb3.append(this.f70580b);
        sb3.append(", selectedDate=");
        sb3.append(this.f70581c);
        sb3.append(", selectedOverlaysList=");
        sb3.append(this.f70582d);
        sb3.append(", respirationVersion=");
        return f3.i(sb3, this.f70583e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(boolean z14, o82.g gVar, b63.o oVar, List<? extends ge1.c> list, Integer num) {
        gVar.getClass();
        oVar.getClass();
        list.getClass();
        this.f70579a = z14;
        this.f70580b = gVar;
        this.f70581c = oVar;
        this.f70582d = list;
        this.f70583e = num;
    }

    public o() {
        this(false, null, null, null, null, 31, null);
    }
}
