package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements s.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final s.d<NullValue> internalValueMap = new s.d<NullValue>() { // from class: androidx.datastore.preferences.protobuf.NullValue.a
        @Override // androidx.datastore.preferences.protobuf.s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NullValue findValueByNumber(int i) {
            return NullValue.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements s.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s.e f2180a = new b();

        @Override // androidx.datastore.preferences.protobuf.s.e
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

    public static s.d<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static s.e internalGetVerifier() {
        return b.f2180a;
    }

    @Override // androidx.datastore.preferences.protobuf.s.c
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
