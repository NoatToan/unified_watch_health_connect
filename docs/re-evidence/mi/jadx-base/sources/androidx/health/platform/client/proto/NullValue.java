package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements f0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final f0.d<NullValue> internalValueMap = new f0.d<NullValue>() { // from class: androidx.health.platform.client.proto.NullValue.a
        @Override // androidx.health.platform.client.proto.f0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NullValue findValueByNumber(int i) {
            return NullValue.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements f0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0.e f2467a = new b();

        @Override // androidx.health.platform.client.proto.f0.e
        public boolean isInRange(int i) {
            return NullValue.forNumber(i) != null;
        }
    }

    NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static f0.d<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static f0.e internalGetVerifier() {
        return b.f2467a;
    }

    @Override // androidx.health.platform.client.proto.f0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
