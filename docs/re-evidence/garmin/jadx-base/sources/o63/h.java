package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo63/h;", "Lo63/g;", "Lo63/l;", "writer", "", "forceQuoting", "<init>", "(Lo63/l;Z)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, boolean z14) {
        super(lVar);
        lVar.getClass();
        this.f129864c = z14;
    }

    @Override // o63.g
    public final void i(String str) {
        str.getClass();
        boolean z14 = this.f129864c;
        l lVar = this.f129854a;
        if (z14) {
            lVar.b(str);
        } else {
            lVar.c(str);
        }
    }
}
