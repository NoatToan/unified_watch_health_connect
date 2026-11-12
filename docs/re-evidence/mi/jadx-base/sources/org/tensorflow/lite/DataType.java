package org.tensorflow.lite;

/* JADX INFO: loaded from: classes3.dex */
public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);

    private static final DataType[] values = values();
    private final int value;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29575a;

        static {
            int[] iArr = new int[DataType.values().length];
            f29575a = iArr;
            try {
                iArr[DataType.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29575a[DataType.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29575a[DataType.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29575a[DataType.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29575a[DataType.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29575a[DataType.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29575a[DataType.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29575a[DataType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    DataType(int i) {
        this.value = i;
    }

    public static DataType fromC(int i) {
        for (DataType dataType : values) {
            if (dataType.value == i) {
                return dataType;
            }
        }
        throw new IllegalArgumentException("DataType error: DataType " + i + " is not recognized in Java (version " + TensorFlowLite.b() + ")");
    }

    public int byteSize() {
        switch (a.f29575a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
            case 5:
                return 1;
            case 6:
                return 8;
            case 7:
            case 8:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    public int c() {
        return this.value;
    }

    public String toStringName() {
        switch (a.f29575a[ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return "long";
            case 7:
                return "bool";
            case 8:
                return "string";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
