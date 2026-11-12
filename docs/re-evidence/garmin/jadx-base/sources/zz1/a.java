package zz1;

import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzz1/a;", "", "Lkotlin/Function0;", "", "cardTopContentClick", "cardBottomContentClick", "cardContentClick", "<init>", "(Le23/a;Le23/a;Le23/a;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f207631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f207632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f207633c;

    public a(e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.f207631a = aVar;
        this.f207632b = aVar2;
        this.f207633c = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f207631a.equals(aVar.f207631a) && this.f207632b.equals(aVar.f207632b) && this.f207633c.equals(aVar.f207633c);
    }

    public final int hashCode() {
        return this.f207633c.hashCode() + f.f(this.f207631a.hashCode() * 31, 31, this.f207632b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntensityMinutesCardActions(cardTopContentClick=");
        sb3.append(this.f207631a);
        sb3.append(", cardBottomContentClick=");
        sb3.append(this.f207632b);
        sb3.append(", cardContentClick=");
        return j.i(sb3, this.f207633c, ")");
    }
}
