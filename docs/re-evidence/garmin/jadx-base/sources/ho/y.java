package ho;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lho/y;", "", "Li53/c;", "Ljo/c;", "filterData", "", "allowClearAllFilters", "allowShowResults", "", "resultsCount", "exactCount", "isLoadingResults", "", "searchQuery", "<init>", "(Li53/c;ZZLjava/lang/Integer;Ljava/lang/Boolean;ZLjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<jo.c> f84690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f84693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f84694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f84696g;

    public y(i53.c cVar, boolean z14, boolean z15, Integer num, Boolean bool, boolean z16, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j53.l.b() : cVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? true : z15, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? "" : str);
    }

    public static y a(y yVar, i53.c cVar, boolean z14, boolean z15, Integer num, Boolean bool, boolean z16, String str, int i14) {
        if ((i14 & 1) != 0) {
            cVar = yVar.f84690a;
        }
        i53.c cVar2 = cVar;
        if ((i14 & 2) != 0) {
            z14 = yVar.f84691b;
        }
        boolean z17 = z14;
        if ((i14 & 4) != 0) {
            z15 = yVar.f84692c;
        }
        boolean z18 = z15;
        if ((i14 & 8) != 0) {
            num = yVar.f84693d;
        }
        Integer num2 = num;
        if ((i14 & 16) != 0) {
            bool = yVar.f84694e;
        }
        Boolean bool2 = bool;
        if ((i14 & 32) != 0) {
            z16 = yVar.f84695f;
        }
        boolean z19 = z16;
        if ((i14 & 64) != 0) {
            str = yVar.f84696g;
        }
        String str2 = str;
        yVar.getClass();
        cVar2.getClass();
        str2.getClass();
        return new y(cVar2, z17, z18, num2, bool2, z19, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f84690a, yVar.f84690a) && this.f84691b == yVar.f84691b && this.f84692c == yVar.f84692c && p005kotlin.jvm.internal.s.g(this.f84693d, yVar.f84693d) && p005kotlin.jvm.internal.s.g(this.f84694e, yVar.f84694e) && this.f84695f == yVar.f84695f && p005kotlin.jvm.internal.s.g(this.f84696g, yVar.f84696g);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(this.f84690a.hashCode() * 31, 31, this.f84691b), 31, this.f84692c);
        Integer num = this.f84693d;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f84694e;
        return this.f84696g.hashCode() + q6.f.g((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f84695f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterUiState(filterData=");
        sb3.append(this.f84690a);
        sb3.append(", allowClearAllFilters=");
        sb3.append(this.f84691b);
        sb3.append(", allowShowResults=");
        sb3.append(this.f84692c);
        sb3.append(", resultsCount=");
        sb3.append(this.f84693d);
        sb3.append(", exactCount=");
        sb3.append(this.f84694e);
        sb3.append(", isLoadingResults=");
        sb3.append(this.f84695f);
        sb3.append(", searchQuery=");
        return am.j.o(this.f84696g, ")", sb3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(i53.c<? extends jo.c> cVar, boolean z14, boolean z15, Integer num, Boolean bool, boolean z16, String str) {
        cVar.getClass();
        str.getClass();
        this.f84690a = cVar;
        this.f84691b = z14;
        this.f84692c = z15;
        this.f84693d = num;
        this.f84694e = bool;
        this.f84695f = z16;
        this.f84696g = str;
    }

    public y() {
        this(null, false, false, null, null, false, null, 127, null);
    }
}
