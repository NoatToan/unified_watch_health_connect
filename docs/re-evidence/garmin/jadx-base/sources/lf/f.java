package lf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llf/f;", "", "Lhf/h;", "image", "", "isSampled", "<init>", "(Lhf/h;Z)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.h f112090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112091b;

    public f(hf.h hVar, boolean z14) {
        this.f112090a = hVar;
        this.f112091b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f112090a, fVar.f112090a) && this.f112091b == fVar.f112091b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112091b) + (this.f112090a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DecodeResult(image=");
        sb3.append(this.f112090a);
        sb3.append(", isSampled=");
        return am.j.t(sb3, this.f112091b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
