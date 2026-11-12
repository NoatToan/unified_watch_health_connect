package qi2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqi2/b;", "Lqi2/c;", "Lui2/a;", "environment", "", "applicationId", "requestId", "", "isAppDebugBuild", "<init>", "(Lui2/a;Ljava/lang/String;Ljava/lang/String;Z)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f144947e;

    public /* synthetic */ b(ui2.a aVar, String str, String str2, boolean z14, int i14, j jVar) {
        this(aVar, str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? false : z14);
    }

    @Override // qi2.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && obj != null && b.class == obj.getClass()) {
            return s.g(this.f144947e, ((b) obj).f144947e);
        }
        return false;
    }

    @Override // qi2.c
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f144947e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ui2.a aVar, String str, String str2, boolean z14) {
        super(aVar, str, d.CREATE_CHILD_ACCOUNT, z14);
        aVar.getClass();
        str.getClass();
        this.f144947e = str2;
    }
}
