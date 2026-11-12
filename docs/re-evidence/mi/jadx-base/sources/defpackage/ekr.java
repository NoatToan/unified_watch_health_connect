package defpackage;

import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes8.dex */
public final class ekr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16749a;

    public ekr(int i) {
        this.f16749a = i;
    }

    public static ekr a(int i) {
        if (i >= 1) {
            return new ekr(1 << (i - 1));
        }
        throw new InvalidParameterException("styleIndex < 1");
    }

    public int b() {
        return this.f16749a;
    }
}
