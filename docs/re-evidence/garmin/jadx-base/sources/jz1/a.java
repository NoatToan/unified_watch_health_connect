package jz1;

import android.os.Parcelable;
import fg0.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljz1/a;", "", "Ldg0/a;", "selectedPriority", "Lfg0/k;", "nextPrimaryEvent", "<init>", "(Ldg0/a;Lfg0/k;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dg0.a f101902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f101903b;

    static {
        Parcelable.Creator<k> creator = k.CREATOR;
    }

    public a(dg0.a aVar, k kVar) {
        aVar.getClass();
        this.f101902a = aVar;
        this.f101903b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f101902a == aVar.f101902a && s.g(this.f101903b, aVar.f101903b);
    }

    public final int hashCode() {
        int iHashCode = this.f101902a.hashCode() * 31;
        k kVar = this.f101903b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "SelectedTrainingPriorityModel(selectedPriority=" + this.f101902a + ", nextPrimaryEvent=" + this.f101903b + ")";
    }
}
