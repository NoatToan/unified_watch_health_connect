package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.s;
import defpackage.csf;
import defpackage.h7i;
import defpackage.ykh;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends GeneratedMessageLite<a, C0029a> implements csf {
    private static final a DEFAULT_INSTANCE;
    private static volatile ykh<a> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private s.i<String> strings_ = GeneratedMessageLite.p();

    /* JADX INFO: renamed from: androidx.datastore.preferences.a$a, reason: collision with other inner class name */
    public static final class C0029a extends GeneratedMessageLite.a<a, C0029a> implements csf {
        public /* synthetic */ C0029a(h7i h7iVar) {
            this();
        }

        public C0029a u(Iterable<String> iterable) {
            l();
            ((a) this.f2174b).E(iterable);
            return this;
        }

        public C0029a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.A(a.class, aVar);
    }

    public static a G() {
        return DEFAULT_INSTANCE;
    }

    public static C0029a I() {
        return DEFAULT_INSTANCE.k();
    }

    public final void E(Iterable<String> iterable) {
        F();
        androidx.datastore.preferences.protobuf.a.b(iterable, this.strings_);
    }

    public final void F() {
        if (this.strings_.c()) {
            return;
        }
        this.strings_ = GeneratedMessageLite.v(this.strings_);
    }

    public List<String> H() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        h7i h7iVar = null;
        switch (h7i.f19778a[methodToInvoke.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new C0029a(h7iVar);
            case 3:
                return GeneratedMessageLite.x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ykh<a> bVar = PARSER;
                if (bVar == null) {
                    synchronized (a.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
