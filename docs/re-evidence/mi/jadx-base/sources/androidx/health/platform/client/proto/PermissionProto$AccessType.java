package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public enum PermissionProto$AccessType implements f0.c {
    ACCESS_TYPE_UNKNOWN(0),
    ACCESS_TYPE_READ(1),
    ACCESS_TYPE_WRITE(2);

    public static final int ACCESS_TYPE_READ_VALUE = 1;
    public static final int ACCESS_TYPE_UNKNOWN_VALUE = 0;
    public static final int ACCESS_TYPE_WRITE_VALUE = 2;
    private static final f0.d<PermissionProto$AccessType> internalValueMap = new f0.d<PermissionProto$AccessType>() { // from class: androidx.health.platform.client.proto.PermissionProto$AccessType.a
        @Override // androidx.health.platform.client.proto.f0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PermissionProto$AccessType findValueByNumber(int i) {
            return PermissionProto$AccessType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements f0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0.e f2468a = new b();

        @Override // androidx.health.platform.client.proto.f0.e
        public boolean isInRange(int i) {
            return PermissionProto$AccessType.forNumber(i) != null;
        }
    }

    PermissionProto$AccessType(int i) {
        this.value = i;
    }

    public static PermissionProto$AccessType forNumber(int i) {
        if (i == 0) {
            return ACCESS_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ACCESS_TYPE_READ;
        }
        if (i != 2) {
            return null;
        }
        return ACCESS_TYPE_WRITE;
    }

    public static f0.d<PermissionProto$AccessType> internalGetValueMap() {
        return internalValueMap;
    }

    public static f0.e internalGetVerifier() {
        return b.f2468a;
    }

    @Override // androidx.health.platform.client.proto.f0.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static PermissionProto$AccessType valueOf(int i) {
        return forNumber(i);
    }
}
