package o63;

import com.google.common.primitives.UnsignedBytes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo63/i;", "Lo63/g;", "Lo63/l;", "writer", "", "forceQuoting", "<init>", "(Lo63/l;Z)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, boolean z14) {
        super(lVar);
        lVar.getClass();
        this.f129865c = z14;
    }

    @Override // o63.g
    public final void d(byte b14) {
        if (this.f129865c) {
            o13.v.a aVar = o13.v.f128608b;
            i(String.valueOf(b14 & UnsignedBytes.MAX_VALUE));
        } else {
            o13.v.a aVar2 = o13.v.f128608b;
            String strValueOf = String.valueOf(b14 & UnsignedBytes.MAX_VALUE);
            strValueOf.getClass();
            this.f129854a.c(strValueOf);
        }
    }

    @Override // o63.g
    public final void f(int i14) {
        if (this.f129865c) {
            o13.x.a aVar = o13.x.f128613b;
            i(Integer.toUnsignedString(i14));
        } else {
            o13.x.a aVar2 = o13.x.f128613b;
            String unsignedString = Integer.toUnsignedString(i14);
            unsignedString.getClass();
            this.f129854a.c(unsignedString);
        }
    }

    @Override // o63.g
    public final void g(long j8) {
        if (this.f129865c) {
            o13.z.a aVar = o13.z.f128618b;
            i(Long.toUnsignedString(j8));
        } else {
            o13.z.a aVar2 = o13.z.f128618b;
            String unsignedString = Long.toUnsignedString(j8);
            unsignedString.getClass();
            this.f129854a.c(unsignedString);
        }
    }

    @Override // o63.g
    public final void h(short s8) {
        if (this.f129865c) {
            o13.c0.a aVar = o13.c0.f128567b;
            i(String.valueOf(s8 & 65535));
        } else {
            o13.c0.a aVar2 = o13.c0.f128567b;
            String strValueOf = String.valueOf(s8 & 65535);
            strValueOf.getClass();
            this.f129854a.c(strValueOf);
        }
    }
}
