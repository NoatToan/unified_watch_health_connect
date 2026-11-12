package uq;

import java.util.LinkedHashSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Luq/c;", "", "Ljava/util/LinkedHashSet;", "Luq/h;", "Lkotlin/collections/LinkedHashSet;", "readOnlyPortraitSplitColumns", "alternatePortraitSplitColumns", "landscapeSplitColumns", "alternateLandscapeSplitColumns", "fixedLandscapeSplitColumns", "editableSplitColumns", "fixedLandscapeComparisonSplitColumns", "portraitComparisonSplitColumns", "landscapeComparisonSplitColumns", "", "supportsTotals", "<init>", "(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<h> f172178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<h> f172179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<h> f172180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<h> f172181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet<h> f172182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet<h> f172183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet<h> f172184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet<h> f172185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet<h> f172186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f172187j;

    public /* synthetic */ c(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, LinkedHashSet linkedHashSet5, LinkedHashSet linkedHashSet6, LinkedHashSet linkedHashSet7, LinkedHashSet linkedHashSet8, LinkedHashSet linkedHashSet9, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashSet() : linkedHashSet, (i14 & 2) != 0 ? new LinkedHashSet() : linkedHashSet2, (i14 & 4) != 0 ? new LinkedHashSet() : linkedHashSet3, (i14 & 8) != 0 ? new LinkedHashSet() : linkedHashSet4, (i14 & 16) != 0 ? new LinkedHashSet() : linkedHashSet5, (i14 & 32) != 0 ? new LinkedHashSet() : linkedHashSet6, (i14 & 64) != 0 ? new LinkedHashSet() : linkedHashSet7, (i14 & 128) != 0 ? new LinkedHashSet() : linkedHashSet8, (i14 & 256) != 0 ? new LinkedHashSet() : linkedHashSet9, (i14 & 512) != 0 ? true : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f172178a, cVar.f172178a) && s.g(this.f172179b, cVar.f172179b) && s.g(this.f172180c, cVar.f172180c) && s.g(this.f172181d, cVar.f172181d) && s.g(this.f172182e, cVar.f172182e) && s.g(this.f172183f, cVar.f172183f) && s.g(this.f172184g, cVar.f172184g) && s.g(this.f172185h, cVar.f172185h) && s.g(this.f172186i, cVar.f172186i) && this.f172187j == cVar.f172187j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172187j) + ((this.f172186i.hashCode() + ((this.f172185h.hashCode() + ((this.f172184g.hashCode() + ((this.f172183f.hashCode() + ((this.f172182e.hashCode() + ((this.f172181d.hashCode() + ((this.f172180c.hashCode() + ((this.f172179b.hashCode() + (this.f172178a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActivityTypeSplitColumns(readOnlyPortraitSplitColumns=" + this.f172178a + ", alternatePortraitSplitColumns=" + this.f172179b + ", landscapeSplitColumns=" + this.f172180c + ", alternateLandscapeSplitColumns=" + this.f172181d + ", fixedLandscapeSplitColumns=" + this.f172182e + ", editableSplitColumns=" + this.f172183f + ", fixedLandscapeComparisonSplitColumns=" + this.f172184g + ", portraitComparisonSplitColumns=" + this.f172185h + ", landscapeComparisonSplitColumns=" + this.f172186i + ", supportsTotals=" + this.f172187j + ")";
    }

    public c(LinkedHashSet<h> linkedHashSet, LinkedHashSet<h> linkedHashSet2, LinkedHashSet<h> linkedHashSet3, LinkedHashSet<h> linkedHashSet4, LinkedHashSet<h> linkedHashSet5, LinkedHashSet<h> linkedHashSet6, LinkedHashSet<h> linkedHashSet7, LinkedHashSet<h> linkedHashSet8, LinkedHashSet<h> linkedHashSet9, boolean z14) {
        linkedHashSet.getClass();
        linkedHashSet2.getClass();
        linkedHashSet3.getClass();
        linkedHashSet4.getClass();
        linkedHashSet5.getClass();
        linkedHashSet6.getClass();
        linkedHashSet7.getClass();
        linkedHashSet8.getClass();
        linkedHashSet9.getClass();
        this.f172178a = linkedHashSet;
        this.f172179b = linkedHashSet2;
        this.f172180c = linkedHashSet3;
        this.f172181d = linkedHashSet4;
        this.f172182e = linkedHashSet5;
        this.f172183f = linkedHashSet6;
        this.f172184g = linkedHashSet7;
        this.f172185h = linkedHashSet8;
        this.f172186i = linkedHashSet9;
        this.f172187j = z14;
    }

    public c() {
        this(null, null, null, null, null, null, null, null, null, false, 1023, null);
    }
}
