package j70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj70/w;", "", "", "enabledSectionsCount", "Lj70/k$i;", "trainingPlans", "", "trainableEvents", "<init>", "(ILj70/k$i;Ljava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.i f97665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97666c;

    public w(int i14, k.i iVar, String str) {
        this.f97664a = i14;
        this.f97665b = iVar;
        this.f97666c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f97664a == wVar.f97664a && p005kotlin.jvm.internal.s.g(this.f97665b, wVar.f97665b) && p005kotlin.jvm.internal.s.g(this.f97666c, wVar.f97666c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f97664a) * 31;
        k.i iVar = this.f97665b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f97666c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingPlansData(enabledSectionsCount=");
        sb3.append(this.f97664a);
        sb3.append(", trainingPlans=");
        sb3.append(this.f97665b);
        sb3.append(", trainableEvents=");
        return am.j.o(this.f97666c, ")", sb3);
    }
}
