package n63;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o63.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln63/q;", "Ln63/z;", "", TtmlNode.TAG_BODY, "", "isString", "Lk63/e;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLk63/e;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k63.e f123940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj, boolean z14, k63.e eVar) {
        super(null);
        obj.getClass();
        this.f123939a = z14;
        this.f123940b = eVar;
        this.f123941c = obj.toString();
        if (eVar == null || eVar.getF116965m()) {
            return;
        }
        vb.h.s("Failed requirement.");
        throw null;
    }

    @Override // n63.z
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF123941c() {
        return this.f123941c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f123939a == qVar.f123939a && p005kotlin.jvm.internal.s.g(this.f123941c, qVar.f123941c);
    }

    public final int hashCode() {
        return this.f123941c.hashCode() + (Boolean.hashCode(this.f123939a) * 31);
    }

    @Override // n63.z
    public final String toString() {
        boolean z14 = this.f123939a;
        String str = this.f123941c;
        if (!z14) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        f0.a(str, sb3);
        return sb3.toString();
    }

    public /* synthetic */ q(Object obj, boolean z14, k63.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, z14, (i14 & 4) != 0 ? null : eVar);
    }
}
