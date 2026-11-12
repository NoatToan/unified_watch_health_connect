package lg0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llg0/c;", "", "", "isFBTFlow", "showTags", "isCompleted", "", "completedDuration", "eventPriorityTag", "Lkotlin/Function0;", "", "analyticsLoggingAction", "onPlanDeletedAction", "onEventRemovedAction", "onEventUpdatedAction", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;Le23/a;Le23/a;Le23/a;Le23/a;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f112168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<Unit> f112169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f112170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e23.a<Unit> f112171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e23.a<Unit> f112172i;

    public /* synthetic */ c(boolean z14, boolean z15, boolean z16, String str, String str2, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? null : aVar2, (i14 & 128) != 0 ? null : aVar3, (i14 & 256) != 0 ? null : aVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f112164a == cVar.f112164a && this.f112165b == cVar.f112165b && this.f112166c == cVar.f112166c && s.g(this.f112167d, cVar.f112167d) && s.g(this.f112168e, cVar.f112168e) && s.g(this.f112169f, cVar.f112169f) && s.g(this.f112170g, cVar.f112170g) && s.g(this.f112171h, cVar.f112171h) && s.g(this.f112172i, cVar.f112172i);
    }

    public final int hashCode() {
        int iG = f.g(f.g(Boolean.hashCode(this.f112164a) * 31, 31, this.f112165b), 31, this.f112166c);
        String str = this.f112167d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f112168e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e23.a<Unit> aVar = this.f112169f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e23.a<Unit> aVar2 = this.f112170g;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        e23.a<Unit> aVar3 = this.f112171h;
        int iHashCode5 = (iHashCode4 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        e23.a<Unit> aVar4 = this.f112172i;
        return iHashCode5 + (aVar4 != null ? aVar4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("TrainingPlanDashboardEventData(isFBTFlow=", ", showTags=", ", isCompleted=", this.f112164a, this.f112165b);
        fb1.c.w(", completedDuration=", this.f112167d, ", eventPriorityTag=", sbM, this.f112166c);
        sbM.append(this.f112168e);
        sbM.append(", analyticsLoggingAction=");
        sbM.append(this.f112169f);
        sbM.append(", onPlanDeletedAction=");
        sbM.append(this.f112170g);
        sbM.append(", onEventRemovedAction=");
        sbM.append(this.f112171h);
        sbM.append(", onEventUpdatedAction=");
        return n23.j.i(sbM, this.f112172i, ")");
    }

    public c(boolean z14, boolean z15, boolean z16, String str, String str2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4) {
        this.f112164a = z14;
        this.f112165b = z15;
        this.f112166c = z16;
        this.f112167d = str;
        this.f112168e = str2;
        this.f112169f = aVar;
        this.f112170g = aVar2;
        this.f112171h = aVar3;
        this.f112172i = aVar4;
    }

    public c() {
        this(false, false, false, null, null, null, null, null, null, 511, null);
    }
}
