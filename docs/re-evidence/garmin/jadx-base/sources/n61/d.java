package n61;

import android.os.Parcel;
import android.os.Parcelable;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln61/d;", "Landroid/os/Parcelable;", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/performance/endurancescore/model/EnduranceScoreRange;", "recreationalRange", "intermediateRange", "trainedRange", "wellTrainedRange", "expertRange", "superiorRange", "eliteRange", "<init>", "(Lo13/p;Lo13/p;Lo13/p;Lo13/p;Lo13/p;Lo13/p;Lo13/p;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<Integer, Integer> f123840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<Integer, Integer> f123841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Integer, Integer> f123842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<Integer, Integer> f123843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<Integer, Integer> f123844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<Integer, Integer> f123845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p<Integer, Integer> f123846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f123847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f123848i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d((p) parcel.readSerializable(), (p) parcel.readSerializable(), (p) parcel.readSerializable(), (p) parcel.readSerializable(), (p) parcel.readSerializable(), (p) parcel.readSerializable(), (p) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, int i14, j jVar) {
        this((i14 & 1) != 0 ? new p(0, 1) : pVar, (i14 & 2) != 0 ? new p(2, 3) : pVar2, (i14 & 4) != 0 ? new p(4, 5) : pVar3, (i14 & 8) != 0 ? new p(6, 7) : pVar4, (i14 & 16) != 0 ? new p(8, 9) : pVar5, (i14 & 32) != 0 ? new p(10, 11) : pVar6, (i14 & 64) != 0 ? new p(12, 13) : pVar7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f123840a, dVar.f123840a) && s.g(this.f123841b, dVar.f123841b) && s.g(this.f123842c, dVar.f123842c) && s.g(this.f123843d, dVar.f123843d) && s.g(this.f123844e, dVar.f123844e) && s.g(this.f123845f, dVar.f123845f) && s.g(this.f123846g, dVar.f123846g);
    }

    public final int hashCode() {
        return this.f123846g.hashCode() + ((this.f123845f.hashCode() + ((this.f123844e.hashCode() + ((this.f123843d.hashCode() + ((this.f123842c.hashCode() + ((this.f123841b.hashCode() + (this.f123840a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnduranceScoreRanges(recreationalRange=" + this.f123840a + ", intermediateRange=" + this.f123841b + ", trainedRange=" + this.f123842c + ", wellTrainedRange=" + this.f123843d + ", expertRange=" + this.f123844e + ", superiorRange=" + this.f123845f + ", eliteRange=" + this.f123846g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.f123840a);
        parcel.writeSerializable(this.f123841b);
        parcel.writeSerializable(this.f123842c);
        parcel.writeSerializable(this.f123843d);
        parcel.writeSerializable(this.f123844e);
        parcel.writeSerializable(this.f123845f);
        parcel.writeSerializable(this.f123846g);
    }

    public d(p<Integer, Integer> pVar, p<Integer, Integer> pVar2, p<Integer, Integer> pVar3, p<Integer, Integer> pVar4, p<Integer, Integer> pVar5, p<Integer, Integer> pVar6, p<Integer, Integer> pVar7) {
        pVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        pVar4.getClass();
        pVar5.getClass();
        pVar6.getClass();
        pVar7.getClass();
        this.f123840a = pVar;
        this.f123841b = pVar2;
        this.f123842c = pVar3;
        this.f123843d = pVar4;
        this.f123844e = pVar5;
        this.f123845f = pVar6;
        this.f123846g = pVar7;
        this.f123847h = pVar.f128594a.intValue();
        this.f123848i = pVar7.f128595b.intValue();
    }

    public d() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
