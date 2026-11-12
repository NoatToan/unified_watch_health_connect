package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements f0.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final f0.d<Syntax> internalValueMap = new f0.d<Syntax>() { // from class: androidx.health.platform.client.proto.Syntax.a
        @Override // androidx.health.platform.client.proto.f0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Syntax findValueByNumber(int i) {
            return Syntax.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements f0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0.e f2469a = new b();

        @Override // androidx.health.platform.client.proto.f0.e
        public boolean isInRange(int i) {
            return Syntax.forNumber(i) != null;
        }
    }

    Syntax(int i) {
        this.value = i;
    }

    public static Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static f0.d<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static f0.e internalGetVerifier() {
        return b.f2469a;
    }

    @Override // androidx.health.platform.client.proto.f0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }
}
