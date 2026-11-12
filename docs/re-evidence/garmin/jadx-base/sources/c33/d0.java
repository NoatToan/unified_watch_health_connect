package c33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f24171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f24172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f24173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0 f24175e;

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("KmVersionRequirement(kind=");
        f0 f0Var = this.f24171a;
        if (f0Var == null) {
            p005kotlin.jvm.internal.s.m("kind");
            throw null;
        }
        sb3.append(f0Var);
        sb3.append(", level=");
        e0 e0Var = this.f24172b;
        if (e0Var == null) {
            p005kotlin.jvm.internal.s.m("level");
            throw null;
        }
        sb3.append(e0Var);
        sb3.append(", version=");
        c0 c0Var = this.f24175e;
        if (c0Var == null) {
            p005kotlin.jvm.internal.s.m("version");
            throw null;
        }
        sb3.append(c0Var);
        sb3.append(", errorCode=");
        sb3.append(this.f24173c);
        sb3.append(", message=");
        return androidx.room.a0.m(sb3, this.f24174d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
