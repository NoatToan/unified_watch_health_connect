package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/m3;", "Landroidx/lifecycle/x1$c;", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m3 implements androidx.lifecycle.x1.c {
    @Override // androidx.lifecycle.x1.c
    public final <T extends androidx.lifecycle.u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(i3.class)) {
            return new i3(e20.a.C1315a.a(e20.a.f62587b));
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
