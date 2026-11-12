package p22;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp22/a;", "", "", "message", "actionMessage", "Lkotlin/Function0;", "", "actionCallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f135024c;

    public /* synthetic */ a(String str, String str2, e23.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f135022a, aVar.f135022a) && s.g(this.f135023b, aVar.f135023b) && s.g(this.f135024c, aVar.f135024c);
    }

    public final int hashCode() {
        String str = this.f135022a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f135023b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e23.a<Unit> aVar = this.f135024c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.i(b.i("SnackbarDataState(message=", this.f135022a, ", actionMessage=", this.f135023b, ", actionCallback="), this.f135024c, ")");
    }

    public a(String str, String str2, e23.a<Unit> aVar) {
        this.f135022a = str;
        this.f135023b = str2;
        this.f135024c = aVar;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
