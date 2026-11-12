package com.miot.spec.entity;

import com.miot.spec.exception.NotSupportValueException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public enum SpecValueType {
    BOOL((byte) 0, 1, 0, 0),
    UINT8((byte) 1, 1, 0, 255),
    INT8((byte) 2, 1, -128, 127),
    UINT16((byte) 3, 2, 0, WebSocketProtocol.PAYLOAD_SHORT_MAX),
    INT16((byte) 4, 2, -32768, 32767),
    UINT32((byte) 5, 4, 0, 4294967295L),
    INT32((byte) 6, 4, -2147483648L, 2147483647L),
    UINT64((byte) 7, 8, 0, Long.MAX_VALUE),
    INT64((byte) 8, 8, Long.MIN_VALUE, Long.MAX_VALUE),
    FLOAT((byte) 9, 4, 0, 0),
    STRING((byte) 10, 0, 0, 0);

    private byte bitValue;
    private int byteLength;
    private long valueMax;
    private long valueMin;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10279a;

        static {
            int[] iArr = new int[SpecValueType.values().length];
            f10279a = iArr;
            try {
                iArr[SpecValueType.INT8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10279a[SpecValueType.UINT8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10279a[SpecValueType.UINT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10279a[SpecValueType.INT16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10279a[SpecValueType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10279a[SpecValueType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10279a[SpecValueType.UINT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10279a[SpecValueType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10279a[SpecValueType.BOOL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10279a[SpecValueType.FLOAT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10279a[SpecValueType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    SpecValueType(byte b2, int i, long j, long j2) {
        this.bitValue = b2;
        this.byteLength = i;
        this.valueMin = j;
        this.valueMax = j2;
    }

    public static SpecValueType convert2ValueType(int i) {
        switch (i) {
            case 0:
                return BOOL;
            case 1:
                return UINT8;
            case 2:
                return INT8;
            case 3:
                return UINT16;
            case 4:
                return INT16;
            case 5:
                return UINT32;
            case 6:
                return INT32;
            case 7:
                return UINT64;
            case 8:
                return INT64;
            case 9:
                return FLOAT;
            case 10:
                return STRING;
            default:
                throw new UnsupportedOperationException("SpecValueType:unsupport bitvalue " + i);
        }
    }

    public static Object convertBytes2Value(SpecValueType specValueType, byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        switch (a.f10279a[specValueType.ordinal()]) {
            case 1:
                return Byte.valueOf(byteBufferOrder.get());
            case 2:
                return Byte.valueOf(byteBufferOrder.get());
            case 3:
                return Short.valueOf(byteBufferOrder.getShort());
            case 4:
                return Short.valueOf(byteBufferOrder.getShort());
            case 5:
                return Integer.valueOf(byteBufferOrder.getInt());
            case 6:
                return Integer.valueOf(byteBufferOrder.getInt());
            case 7:
            case 8:
                return Long.valueOf(byteBufferOrder.getLong());
            case 9:
                return Boolean.valueOf(byteBufferOrder.get() == 1);
            case 10:
                return Float.valueOf(byteBufferOrder.getFloat());
            case 11:
                return new String(bArr);
            default:
                return null;
        }
    }

    public int byteLength() {
        return this.byteLength;
    }

    public long getMaxValue() {
        return this.valueMax;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    public boolean isValueValid(Object obj) throws NotSupportValueException {
        long jShortValue;
        switch (a.f10279a[ordinal()]) {
            case 1:
            case 2:
                if (obj instanceof Byte) {
                    jShortValue = ((Byte) obj).byteValue();
                }
                if (obj instanceof Short) {
                    jShortValue = ((Short) obj).shortValue();
                }
                if (obj instanceof Integer) {
                    jShortValue = ((Integer) obj).intValue();
                }
                if (obj instanceof Long) {
                    jShortValue = ((Long) obj).longValue();
                }
                if (jShortValue == Long.MIN_VALUE && jShortValue >= this.valueMin && jShortValue <= this.valueMax) {
                    return true;
                }
                throw new NotSupportValueException("the value " + obj + ",should belong【 " + this.valueMin + "," + this.valueMax + "】");
            case 3:
            case 4:
                jShortValue = Long.MIN_VALUE;
                if (obj instanceof Short) {
                    jShortValue = ((Short) obj).shortValue();
                }
                if (obj instanceof Integer) {
                    jShortValue = ((Integer) obj).intValue();
                }
                if (obj instanceof Long) {
                    jShortValue = ((Long) obj).longValue();
                }
                if (jShortValue == Long.MIN_VALUE) {
                    break;
                }
                throw new NotSupportValueException("the value " + obj + ",should belong【 " + this.valueMin + "," + this.valueMax + "】");
            case 5:
            case 6:
                jShortValue = Long.MIN_VALUE;
                if (obj instanceof Integer) {
                    jShortValue = ((Integer) obj).intValue();
                }
                if (obj instanceof Long) {
                    jShortValue = ((Long) obj).longValue();
                }
                if (jShortValue == Long.MIN_VALUE) {
                    break;
                }
                throw new NotSupportValueException("the value " + obj + ",should belong【 " + this.valueMin + "," + this.valueMax + "】");
            case 7:
            case 8:
                jShortValue = Long.MIN_VALUE;
                if (obj instanceof Long) {
                    jShortValue = ((Long) obj).longValue();
                }
                if (jShortValue == Long.MIN_VALUE) {
                    break;
                }
                throw new NotSupportValueException("the value " + obj + ",should belong【 " + this.valueMin + "," + this.valueMax + "】");
            case 9:
            case 10:
            case 11:
                return true;
            default:
                jShortValue = Long.MIN_VALUE;
                if (jShortValue == Long.MIN_VALUE) {
                    break;
                }
                throw new NotSupportValueException("the value " + obj + ",should belong【 " + this.valueMin + "," + this.valueMax + "】");
        }
    }

    public byte value() {
        return this.bitValue;
    }

    public static SpecValueType convert2ValueType(String str) {
        str.hashCode();
        switch (str) {
            case "string":
                return STRING;
            case "uint16":
                return UINT16;
            case "uint32":
                return UINT32;
            case "uint64":
                return UINT64;
            case "bool":
                return BOOL;
            case "int8":
                return INT8;
            case "float":
                return FLOAT;
            case "int16":
                return INT16;
            case "int32":
                return INT32;
            case "int64":
                return INT64;
            case "uint8":
                return UINT8;
            default:
                throw new UnsupportedOperationException("SpecValueType:unsupport value type " + str);
        }
    }
}
