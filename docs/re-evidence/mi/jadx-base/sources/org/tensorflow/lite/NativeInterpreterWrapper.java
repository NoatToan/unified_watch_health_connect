package org.tensorflow.lite;

import defpackage.py5;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes3.dex */
final class NativeInterpreterWrapper implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29577b;
    public long c;
    public ByteBuffer e;
    public Map<String, Integer> f;
    public Map<String, Integer> g;
    public Tensor[] h;
    public Tensor[] i;
    public long d = 0;
    private long inferenceDurationNanoseconds = -1;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<py5> f29578k = new ArrayList();
    public final List<AutoCloseable> l = new ArrayList();

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, a.C1067a c1067a) {
        TensorFlowLite.a();
        if (byteBuffer == null || !((byteBuffer instanceof MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.e = byteBuffer;
        long jCreateErrorReporter = createErrorReporter(512);
        l(jCreateErrorReporter, createModelWithBuffer(this.e, jCreateErrorReporter), c1067a);
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native void applyDelegate(long j, long j2, long j3);

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getInputTensorIndexFromSignature(long j, String str, String str2);

    private static native int getOutputCount(long j);

    private static native int getOutputDataType(long j, int i);

    private static native String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    private static native int getOutputTensorIndexFromSignature(long j, String str, String str2);

    private static native String[] getSignatureDefNames(long j);

    private static native String[] getSignatureInputs(long j, String str);

    private static native String[] getSignatureOutputs(long j, String str);

    private static native boolean hasUnresolvedFlexOp(long j);

    public static py5 m(List<py5> list) {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator<py5> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance(it.next())) {
                    return null;
                }
            }
            return (py5) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static native void resetVariableTensors(long j, long j2);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    private static native void setCancelled(long j, long j2, boolean z);

    private static native void useXNNPACK(long j, long j2, int i, int i2);

    public final void a(a.C1067a c1067a) {
        py5 py5VarM;
        boolean zHasUnresolvedFlexOp = hasUnresolvedFlexOp(this.f29577b);
        if (zHasUnresolvedFlexOp && (py5VarM = m(c1067a.g)) != null) {
            this.l.add((AutoCloseable) py5VarM);
            applyDelegate(this.f29577b, this.f29576a, py5VarM.a());
        }
        try {
            for (py5 py5Var : c1067a.g) {
                applyDelegate(this.f29577b, this.f29576a, py5Var.a());
                this.f29578k.add(py5Var);
            }
            Boolean bool = c1067a.f32489b;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            NnApiDelegate nnApiDelegate = new NnApiDelegate();
            this.l.add(nnApiDelegate);
            applyDelegate(this.f29577b, this.f29576a, nnApiDelegate.a());
        } catch (IllegalArgumentException e) {
            if (!zHasUnresolvedFlexOp || hasUnresolvedFlexOp(this.f29577b)) {
                throw e;
            }
            System.err.println("Ignoring failed delegate application: " + e);
        }
    }

    public Tensor b(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.h;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.f29577b;
                Tensor tensorI = Tensor.i(j, getInputTensorIndex(j, i));
                tensorArr[i] = tensorI;
                return tensorI;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i);
    }

    public Tensor c(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.i;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.f29577b;
                Tensor tensorI = Tensor.i(j, getOutputTensorIndex(j, i));
                tensorArr[i] = tensorI;
                return tensorI;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i = 0;
        while (true) {
            Tensor[] tensorArr = this.h;
            if (i >= tensorArr.length) {
                break;
            }
            Tensor tensor = tensorArr[i];
            if (tensor != null) {
                tensor.b();
                this.h[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.i;
            if (i2 >= tensorArr2.length) {
                break;
            }
            Tensor tensor2 = tensorArr2[i2];
            if (tensor2 != null) {
                tensor2.b();
                this.i[i2] = null;
            }
            i2++;
        }
        delete(this.f29576a, this.c, this.f29577b);
        deleteCancellationFlag(this.d);
        this.f29576a = 0L;
        this.c = 0L;
        this.f29577b = 0L;
        this.d = 0L;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = false;
        this.f29578k.clear();
        Iterator<AutoCloseable> it = this.l.iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (Exception e) {
                System.err.println("Failed to close flex delegate: " + e);
            }
        }
        this.l.clear();
    }

    public String[] d() {
        return getSignatureDefNames(this.f29577b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v21 */
    public final void l(long j, long j2, a.C1067a c1067a) {
        if (c1067a == null) {
            c1067a = new a.C1067a();
        }
        this.f29576a = j;
        this.c = j2;
        this.f29577b = createInterpreter(j2, j, c1067a.f32488a);
        Boolean bool = c1067a.c;
        if (bool != null && bool.booleanValue()) {
            this.d = createCancellationFlag(this.f29577b);
        }
        this.h = new Tensor[getInputCount(this.f29577b)];
        this.i = new Tensor[getOutputCount(this.f29577b)];
        Boolean bool2 = c1067a.d;
        if (bool2 != null) {
            allowFp16PrecisionForFp32(this.f29577b, bool2.booleanValue());
        }
        Boolean bool3 = c1067a.e;
        if (bool3 != null) {
            allowBufferHandleOutput(this.f29577b, bool3.booleanValue());
        }
        a(c1067a);
        Boolean bool4 = c1067a.f;
        ?? BooleanValue = bool4 != null ? bool4.booleanValue() : -1;
        if (BooleanValue == 1) {
            useXNNPACK(this.f29577b, j, BooleanValue == true ? 1 : 0, c1067a.f32488a);
        }
        allocateTensors(this.f29577b, j);
        this.j = true;
    }

    public void n(int i, int[] iArr) {
        o(i, iArr, false);
    }

    public void o(int i, int[] iArr, boolean z) {
        if (resizeInput(this.f29577b, this.f29576a, i, iArr, z)) {
            this.j = false;
            Tensor tensor = this.h[i];
            if (tensor != null) {
                tensor.o();
            }
        }
    }

    public void p(Object[] objArr, Map<Integer, Object> map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            int[] iArrJ = b(i2).j(objArr[i2]);
            if (iArrJ != null) {
                n(i2, iArrJ);
            }
        }
        boolean z = !this.j;
        if (z) {
            allocateTensors(this.f29577b, this.f29576a);
            this.j = true;
        }
        for (int i3 = 0; i3 < objArr.length; i3++) {
            b(i3).p(objArr[i3]);
        }
        long jNanoTime = System.nanoTime();
        run(this.f29577b, this.f29576a);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (z) {
            while (true) {
                Tensor[] tensorArr = this.i;
                if (i >= tensorArr.length) {
                    break;
                }
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    tensor.o();
                }
                i++;
            }
        }
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                c(entry.getKey().intValue()).e(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }
}
