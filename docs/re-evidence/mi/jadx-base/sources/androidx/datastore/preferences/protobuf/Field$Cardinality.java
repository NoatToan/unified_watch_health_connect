package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum Field$Cardinality implements s.c {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);

    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final s.d<Field$Cardinality> internalValueMap = new s.d<Field$Cardinality>() { // from class: androidx.datastore.preferences.protobuf.Field$Cardinality.a
        @Override // androidx.datastore.preferences.protobuf.s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Field$Cardinality findValueByNumber(int i) {
            return Field$Cardinality.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements s.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s.e f2167a = new b();

        @Override // androidx.datastore.preferences.protobuf.s.e
        public boolean isInRange(int i) {
            return Field$Cardinality.forNumber(i) != null;
        }
    }

    Field$Cardinality(int i) {
        this.value = i;
    }

    public static Field$Cardinality forNumber(int i) {
        if (i == 0) {
            return CARDINALITY_UNKNOWN;
        }
        if (i == 1) {
            return CARDINALITY_OPTIONAL;
        }
        if (i == 2) {
            return CARDINALITY_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return CARDINALITY_REPEATED;
    }

    public static s.d<Field$Cardinality> internalGetValueMap() {
        return internalValueMap;
    }

    public static s.e internalGetVerifier() {
        return b.f2167a;
    }

    @Override // androidx.datastore.preferences.protobuf.s.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Field$Cardinality valueOf(int i) {
        return forNumber(i);
    }
}
