package jz1;

import fg0.k;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import ww1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljz1/b;", "", "", "list", "", "hidePrimaryItemEntry", "hideSupportingEntry", "Lfg0/k;", "primaryEventDTO", "replacePrimaryEventDTO", "Lww1/g;", "activeTrainingPlanDTO", "<init>", "(Ljava/util/List;ZZLfg0/k;Lfg0/k;Lww1/g;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Object> f101904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f101907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f101908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f101909f;

    public /* synthetic */ b(List list, boolean z14, boolean z15, k kVar, k kVar2, g gVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? null : kVar, (i14 & 16) != 0 ? null : kVar2, (i14 & 32) != 0 ? null : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f101904a, bVar.f101904a) && this.f101905b == bVar.f101905b && this.f101906c == bVar.f101906c && s.g(this.f101907d, bVar.f101907d) && s.g(this.f101908e, bVar.f101908e) && s.g(this.f101909f, bVar.f101909f);
    }

    public final int hashCode() {
        List<Object> list = this.f101904a;
        int iG = f.g(f.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f101905b), 31, this.f101906c);
        k kVar = this.f101907d;
        int iHashCode = (iG + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.f101908e;
        int iHashCode2 = (iHashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        g gVar = this.f101909f;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrainingPriorityUIModel(list=" + this.f101904a + ", hidePrimaryItemEntry=" + this.f101905b + ", hideSupportingEntry=" + this.f101906c + ", primaryEventDTO=" + this.f101907d + ", replacePrimaryEventDTO=" + this.f101908e + ", activeTrainingPlanDTO=" + this.f101909f + ")";
    }

    public b(List<Object> list, boolean z14, boolean z15, k kVar, k kVar2, g gVar) {
        this.f101904a = list;
        this.f101905b = z14;
        this.f101906c = z15;
        this.f101907d = kVar;
        this.f101908e = kVar2;
        this.f101909f = gVar;
    }

    public b() {
        this(null, false, false, null, null, null, 63, null);
    }
}
