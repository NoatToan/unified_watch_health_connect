package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Tensor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataType f29580b;
    public int[] c;
    public final int[] d;
    public final a e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f29581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29582b;

        public a(float f, int i) {
            this.f29581a = f;
            this.f29582b = i;
        }
    }

    public Tensor(long j) {
        this.f29579a = j;
        this.f29580b = DataType.fromC(dtype(j));
        this.c = shape(j);
        this.d = shapeSignature(j);
        this.e = new a(quantizationScale(j), quantizationZeroPoint(j));
    }

    private static native ByteBuffer buffer(long j);

    public static int c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j, int i);

    private static native void delete(long j);

    private static native int dtype(long j);

    public static void h(Object obj, int i, int[] iArr) {
        if (iArr == null || i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)));
        }
        for (int i3 = 0; i3 < length; i3++) {
            h(Array.get(obj, i3), i + 1, iArr);
        }
    }

    private static native boolean hasDelegateBufferHandle(long j);

    public static Tensor i(long j, int i) {
        return new Tensor(create(j, i));
    }

    private static native int index(long j);

    public static boolean k(Object obj) {
        return obj instanceof Buffer;
    }

    public static boolean l(Object obj) {
        return obj instanceof ByteBuffer;
    }

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    public final ByteBuffer a() {
        return buffer(this.f29579a).order(ByteOrder.nativeOrder());
    }

    public void b() {
        delete(this.f29579a);
        this.f29579a = 0L;
    }

    public int[] d(Object obj) {
        int iC = c(obj);
        if (this.f29580b == DataType.STRING) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iC--;
                }
            }
        }
        int[] iArr = new int[iC];
        h(obj, 0, iArr);
        return iArr;
    }

    public Object e(Object obj) {
        if (obj == null) {
            if (hasDelegateBufferHandle(this.f29579a)) {
                return obj;
            }
            throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
        t(obj);
        r(obj);
        if (k(obj)) {
            f((Buffer) obj);
        } else {
            readMultiDimensionalArray(this.f29579a, obj);
        }
        return obj;
    }

    public final void f(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(a());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(a().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(a().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(a().asIntBuffer());
        } else {
            if (buffer instanceof ShortBuffer) {
                ((ShortBuffer) buffer).put(a().asShortBuffer());
                return;
            }
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    public DataType g(Object obj) {
        if (obj != null) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Float.TYPE.equals(componentType)) {
                    return DataType.FLOAT32;
                }
                if (Integer.TYPE.equals(componentType)) {
                    return DataType.INT32;
                }
                if (Short.TYPE.equals(componentType)) {
                    return DataType.INT16;
                }
                if (Byte.TYPE.equals(componentType)) {
                    DataType dataType = this.f29580b;
                    DataType dataType2 = DataType.STRING;
                    return dataType == dataType2 ? dataType2 : DataType.UINT8;
                }
                if (Long.TYPE.equals(componentType)) {
                    return DataType.INT64;
                }
                if (Boolean.TYPE.equals(componentType)) {
                    return DataType.BOOL;
                }
                if (String.class.equals(componentType)) {
                    return DataType.STRING;
                }
            } else {
                if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                    return DataType.FLOAT32;
                }
                if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                    return DataType.INT32;
                }
                if (Short.class.equals(componentType) || (obj instanceof ShortBuffer)) {
                    return DataType.INT16;
                }
                if (Byte.class.equals(componentType)) {
                    return DataType.UINT8;
                }
                if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                    return DataType.INT64;
                }
                if (Boolean.class.equals(componentType)) {
                    return DataType.BOOL;
                }
                if (String.class.equals(componentType)) {
                    return DataType.STRING;
                }
            }
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + obj.getClass().getName());
    }

    public int[] j(Object obj) {
        if (obj == null || k(obj)) {
            return null;
        }
        t(obj);
        int[] iArrD = d(obj);
        if (Arrays.equals(this.c, iArrD)) {
            return null;
        }
        return iArrD;
    }

    public String m() {
        return name(this.f29579a);
    }

    public int n() {
        return numBytes(this.f29579a);
    }

    public void o() {
        this.c = shape(this.f29579a);
    }

    public void p(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f29579a)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        t(obj);
        s(obj);
        if (k(obj)) {
            q((Buffer) obj);
            return;
        }
        if (this.f29580b == DataType.STRING && this.c.length == 0) {
            writeScalar(this.f29579a, obj);
        } else if (obj.getClass().isArray()) {
            writeMultiDimensionalArray(this.f29579a, obj);
        } else {
            writeScalar(this.f29579a, obj);
        }
    }

    public final void q(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f29579a, buffer);
                return;
            } else {
                a().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f29579a, buffer);
                return;
            } else {
                a().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f29579a, buffer);
                return;
            } else {
                a().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f29579a, buffer);
                return;
            } else {
                a().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer instanceof ShortBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
        }
        ShortBuffer shortBuffer = (ShortBuffer) buffer;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f29579a, buffer);
        } else {
            a().asShortBuffer().put(shortBuffer);
        }
    }

    public final void r(Object obj) {
        if (!k(obj)) {
            int[] iArrD = d(obj);
            if (!Arrays.equals(iArrD, this.c)) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", m(), Arrays.toString(this.c), Arrays.toString(iArrD)));
            }
        } else {
            Buffer buffer = (Buffer) obj;
            int iN = n();
            int iCapacity = l(obj) ? buffer.capacity() : buffer.capacity() * this.f29580b.byteSize();
            if (iN > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", m(), Integer.valueOf(iN), Integer.valueOf(iCapacity)));
            }
        }
    }

    public final void s(Object obj) {
        if (!k(obj)) {
            int[] iArrD = d(obj);
            if (!Arrays.equals(iArrD, this.c)) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", m(), Arrays.toString(this.c), Arrays.toString(iArrD)));
            }
        } else {
            Buffer buffer = (Buffer) obj;
            int iN = n();
            int iCapacity = l(obj) ? buffer.capacity() : buffer.capacity() * this.f29580b.byteSize();
            if (iN != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", m(), Integer.valueOf(iN), Integer.valueOf(iCapacity)));
            }
        }
    }

    public final void t(Object obj) {
        DataType dataTypeG;
        if (!l(obj) && (dataTypeG = g(obj)) != this.f29580b && !dataTypeG.toStringName().equals(this.f29580b.toStringName())) {
            throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.f29580b, obj.getClass().getName(), dataTypeG));
        }
    }
}
