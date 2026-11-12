package defpackage;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes11.dex */
public final class ovc extends GeneratedMessageLite<ovc, a> implements bsf {
    public static final ovc e;
    public static volatile vkh<ovc> f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29727b;
    public int c;
    public int d;

    public static final class a extends GeneratedMessageLite.a<ovc, a> implements bsf {
        public /* synthetic */ a(nvc nvcVar) {
            this();
        }

        public a a(int i) {
            copyOnWrite();
            ((ovc) this.instance).g(i);
            return this;
        }

        public a b(int i) {
            copyOnWrite();
            ((ovc) this.instance).h(i);
            return this;
        }

        public a c(int i) {
            copyOnWrite();
            ((ovc) this.instance).i(i);
            return this;
        }

        public a d(int i) {
            copyOnWrite();
            ((ovc) this.instance).j(i);
            return this;
        }

        public a() {
            super(ovc.e);
        }
    }

    static {
        ovc ovcVar = new ovc();
        e = ovcVar;
        GeneratedMessageLite.registerDefaultInstance(ovc.class, ovcVar);
    }

    public static a f() {
        return e.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        nvc nvcVar = null;
        switch (nvc.f28476a[methodToInvoke.ordinal()]) {
            case 1:
                return new ovc();
            case 2:
                return new a(nvcVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(e, "\u0000\u0004\u0000\u0000\u0003\u0006\u0004\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004", new Object[]{"fragmentSize_", "fragmentOffset_", "blockId_", "blockSize_"});
            case 4:
                return e;
            case 5:
                vkh<ovc> bVar = f;
                if (bVar == null) {
                    synchronized (ovc.class) {
                        try {
                            bVar = f;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(e);
                                f = bVar;
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

    public final void g(int i) {
        this.c = i;
    }

    public final void h(int i) {
        this.d = i;
    }

    public final void i(int i) {
        this.f29727b = i;
    }

    public final void j(int i) {
        this.f29726a = i;
    }
}
