package dy1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldy1/o;", "", "", "message", "actionMessage", "Lkotlin/Function0;", "", "actionCallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f61594c;

    public /* synthetic */ o(String str, String str2, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f61592a, oVar.f61592a) && p005kotlin.jvm.internal.s.g(this.f61593b, oVar.f61593b) && p005kotlin.jvm.internal.s.g(this.f61594c, oVar.f61594c);
    }

    public final int hashCode() {
        String str = this.f61592a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61593b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e23.a<Unit> aVar = this.f61594c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.i(p6.b.i("SnackbarDataState(message=", this.f61592a, ", actionMessage=", this.f61593b, ", actionCallback="), this.f61594c, ")");
    }

    public o(String str, String str2, e23.a<Unit> aVar) {
        this.f61592a = str;
        this.f61593b = str2;
        this.f61594c = aVar;
    }

    public o() {
        this(null, null, null, 7, null);
    }
}
