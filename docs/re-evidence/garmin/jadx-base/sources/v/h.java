package v;

import java.io.File;
import java.util.ArrayList;
import org.apache.commons.lang3.function.FailableDoubleFunction;
import org.apache.commons.lang3.function.FailableDoubleToIntFunction;
import org.apache.commons.lang3.function.FailableDoubleToLongFunction;
import org.apache.commons.lang3.function.FailableIntFunction;
import org.apache.commons.lang3.function.FailableIntToDoubleFunction;
import org.apache.commons.lang3.function.FailableIntToLongFunction;
import org.apache.commons.lang3.function.FailableLongFunction;
import org.apache.commons.lang3.function.FailableLongToDoubleFunction;
import org.apache.commons.lang3.function.FailableLongToIntFunction;
import org.apache.commons.lang3.function.FailableObjDoubleConsumer;
import org.apache.commons.lang3.function.FailableObjIntConsumer;
import org.apache.commons.lang3.function.FailableObjLongConsumer;
import org.apache.commons.lang3.function.FailableToDoubleBiFunction;
import org.apache.commons.lang3.function.FailableToDoubleFunction;
import org.apache.commons.lang3.function.FailableToIntBiFunction;
import org.apache.commons.lang3.function.FailableToIntFunction;
import org.apache.commons.lang3.function.FailableToLongBiFunction;
import org.apache.commons.lang3.function.FailableToLongFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.concurrent.futures.b.c, FailableDoubleFunction, FailableDoubleToIntFunction, FailableDoubleToLongFunction, FailableIntFunction, FailableIntToDoubleFunction, FailableIntToLongFunction, FailableLongFunction, FailableLongToDoubleFunction, FailableLongToIntFunction, FailableObjDoubleConsumer, FailableObjIntConsumer, FailableObjLongConsumer, FailableToDoubleBiFunction, FailableToDoubleFunction, FailableToIntBiFunction, FailableToIntFunction, FailableToLongBiFunction, FailableToLongFunction {
    public static void A(int i14, p3.o0 o0Var, int i15, h5.g.a.b bVar) {
        o0Var.K(Integer.valueOf(i14));
        o0Var.apply(bVar, Integer.valueOf(i15));
    }

    public static void B(e23.p pVar, p3.m mVar, int i14) {
        pVar.invoke(mVar, Integer.valueOf(i14));
        mVar.y();
    }

    public static void C(String str, String str2, String str3, StringBuilder sb3, boolean z14) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(z14);
        sb3.append(str3);
    }

    public static void D(p3.m mVar, int i14, e23.p pVar, p3.m mVar2, Integer num) {
        mVar.C(i14);
        pVar.invoke(mVar2, num);
        mVar.f();
    }

    public static long t(p3.o0 o0Var) {
        return d92.b.a(o0Var).c().a();
    }

    public static String u(long j8, String str, String str2, String str3) {
        return str + j8 + str2 + str3;
    }

    public static String v(File file, String str) {
        return str + file;
    }

    public static StringBuilder w(int i14, String str, String str2, long j8) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(j8);
        sb3.append(str2);
        sb3.append(i14);
        return sb3;
    }

    public static ArrayList x(Object obj) {
        o13.r.b(obj);
        return new ArrayList();
    }

    public static void y(int i14, h4.r rVar, Integer num, p3.m mVar) {
        num.getClass();
        rVar.getClass();
        mVar.C(i14);
    }

    public static void z(int i14, p3.m mVar, int i15, h5.g.a.b bVar) {
        mVar.K(Integer.valueOf(i14));
        mVar.apply(bVar, Integer.valueOf(i15));
    }

    @Override // org.apache.commons.lang3.function.FailableObjDoubleConsumer
    public void accept(Object obj, double d14) {
        FailableObjDoubleConsumer.lambda$static$0(obj, d14);
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleFunction
    public Object apply(double d14) {
        return FailableDoubleFunction.lambda$static$0(d14);
    }

    @Override // org.apache.commons.lang3.function.FailableIntToDoubleFunction
    public double applyAsDouble(int i14) {
        return FailableIntToDoubleFunction.lambda$static$0(i14);
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleToIntFunction
    public int applyAsInt(double d14) {
        return FailableDoubleToIntFunction.lambda$static$0(d14);
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleToLongFunction
    public int applyAsLong(double d14) {
        return FailableDoubleToLongFunction.lambda$static$0(d14);
    }

    @Override // org.apache.commons.lang3.function.FailableObjIntConsumer
    public void accept(Object obj, int i14) {
        FailableObjIntConsumer.lambda$static$0(obj, i14);
    }

    @Override // org.apache.commons.lang3.function.FailableObjLongConsumer
    public void accept(Object obj, long j8) {
        FailableObjLongConsumer.lambda$static$0(obj, j8);
    }

    @Override // org.apache.commons.lang3.function.FailableIntFunction
    public Object apply(int i14) {
        return FailableIntFunction.lambda$static$0(i14);
    }

    @Override // org.apache.commons.lang3.function.FailableLongToDoubleFunction
    public double applyAsDouble(long j8) {
        return FailableLongToDoubleFunction.lambda$static$0(j8);
    }

    @Override // org.apache.commons.lang3.function.FailableLongToIntFunction
    public int applyAsInt(long j8) {
        return FailableLongToIntFunction.lambda$static$0(j8);
    }

    @Override // org.apache.commons.lang3.function.FailableIntToLongFunction
    public long applyAsLong(int i14) {
        return FailableIntToLongFunction.lambda$static$0(i14);
    }

    @Override // org.apache.commons.lang3.function.FailableLongFunction
    public Object apply(long j8) {
        return FailableLongFunction.lambda$static$0(j8);
    }

    @Override // org.apache.commons.lang3.function.FailableToDoubleFunction
    public double applyAsDouble(Object obj) {
        return FailableToDoubleFunction.lambda$static$0(obj);
    }

    @Override // org.apache.commons.lang3.function.FailableToIntFunction
    public int applyAsInt(Object obj) {
        return FailableToIntFunction.lambda$static$0(obj);
    }

    @Override // org.apache.commons.lang3.function.FailableToLongFunction
    public long applyAsLong(Object obj) {
        return FailableToLongFunction.lambda$static$0(obj);
    }

    @Override // org.apache.commons.lang3.function.FailableToDoubleBiFunction
    public double applyAsDouble(Object obj, Object obj2) {
        return FailableToDoubleBiFunction.lambda$static$0(obj, obj2);
    }

    @Override // org.apache.commons.lang3.function.FailableToIntBiFunction
    public int applyAsInt(Object obj, Object obj2) {
        return FailableToIntBiFunction.lambda$static$0(obj, obj2);
    }

    @Override // org.apache.commons.lang3.function.FailableToLongBiFunction
    public long applyAsLong(Object obj, Object obj2) {
        return FailableToLongBiFunction.lambda$static$0(obj, obj2);
    }
}
