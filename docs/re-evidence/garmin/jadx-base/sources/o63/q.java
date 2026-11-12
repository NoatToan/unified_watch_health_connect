package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo63/q;", "Lo63/b;", "Ln63/b;", "json", "Ln63/i;", "value", "", "polymorphicDiscriminator", "<init>", "(Ln63/b;Ln63/i;Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n63.i f129878h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n63.b bVar, n63.i iVar, String str) {
        super(bVar, iVar, str, null);
        bVar.getClass();
        iVar.getClass();
        this.f129878h = iVar;
        this.f117055b.add("primitive");
    }

    @Override // o63.b
    public final n63.i W(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f129878h;
        }
        vb.h.s("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // o63.b
    /* JADX INFO: renamed from: Y, reason: from getter */
    public final n63.i getF129878h() {
        return this.f129878h;
    }

    @Override // l63.c
    public final int e(k63.e eVar) {
        eVar.getClass();
        return 0;
    }

    public /* synthetic */ q(n63.b bVar, n63.i iVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, iVar, (i14 & 4) != 0 ? null : str);
    }
}
