package mb0;

import i3.e5;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;
import z80.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmb0/a;", "", "", "bedTimeSeconds", "wakeTimeSeconds", "", "Lz80/j;", "sleepWindows", "Lmb0/b;", "daysOfWeekItems", "", "showOverlappingWindowsAlert", "<init>", "(IILjava/util/List;Ljava/util/List;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f117712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b> f117713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f117714e;

    public a(int i14, int i15, List list, List list2, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 79200 : i14, (i16 & 2) != 0 ? 21600 : i15, (i16 & 4) != 0 ? j0.f134944a : list, (i16 & 8) != 0 ? j0.f134944a : list2, (i16 & 16) != 0 ? false : z14);
    }

    public static a a(a aVar, int i14, int i15, List list, ArrayList arrayList, boolean z14, int i16) {
        if ((i16 & 1) != 0) {
            i14 = aVar.f117710a;
        }
        int i17 = i14;
        if ((i16 & 2) != 0) {
            i15 = aVar.f117711b;
        }
        int i18 = i15;
        if ((i16 & 4) != 0) {
            list = aVar.f117712c;
        }
        List list2 = list;
        List<b> list3 = arrayList;
        if ((i16 & 8) != 0) {
            list3 = aVar.f117713d;
        }
        List<b> list4 = list3;
        if ((i16 & 16) != 0) {
            z14 = aVar.f117714e;
        }
        aVar.getClass();
        list2.getClass();
        list4.getClass();
        return new a(i17, i18, list2, list4, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f117710a == aVar.f117710a && this.f117711b == aVar.f117711b && s.g(this.f117712c, aVar.f117712c) && s.g(this.f117713d, aVar.f117713d) && this.f117714e == aVar.f117714e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117714e) + u0.b(u0.b(q2.d(this.f117711b, Integer.hashCode(this.f117710a) * 31, 31), 31, this.f117712c), 31, this.f117713d);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f117710a, this.f117711b, "AdvancedSleepData(bedTimeSeconds=", ", wakeTimeSeconds=", ", sleepWindows=");
        n23.j.z(sbJ, this.f117712c, ", daysOfWeekItems=", this.f117713d, ", showOverlappingWindowsAlert=");
        return hb.a.k(sbJ, this.f117714e, ")");
    }

    public a(int i14, int i15, List<j> list, List<b> list2, boolean z14) {
        list.getClass();
        list2.getClass();
        this.f117710a = i14;
        this.f117711b = i15;
        this.f117712c = list;
        this.f117713d = list2;
        this.f117714e = z14;
    }

    public a() {
        this(0, 0, null, null, false, 31, null);
    }
}
