package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.4")
public class AdaptedFunctionReference implements FunctionBase, Serializable {
    private final Class a;
    private final String b;
    private final String c;
    private final boolean d;
    private final int e;
    private final int f;
    public final Object receiver;

    public AdaptedFunctionReference(int i, Class cls, String str, String str2, int i2) {
        this(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.d == adaptedFunctionReference.d && this.e == adaptedFunctionReference.e && this.f == adaptedFunctionReference.f && Intrinsics.areEqual(this.receiver, adaptedFunctionReference.receiver) && Intrinsics.areEqual(this.a, adaptedFunctionReference.a) && this.b.equals(adaptedFunctionReference.b) && this.c.equals(adaptedFunctionReference.c);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.e;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.a;
        if (cls == null) {
            return null;
        }
        return this.d ? Reflection.getOrCreateKotlinPackage(cls) : Reflection.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.a;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e) * 31) + this.f;
    }

    public String toString() {
        return Reflection.renderLambdaToString(this);
    }

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.a = cls;
        this.b = str;
        this.c = str2;
        this.d = (i2 & 1) == 1;
        this.e = i;
        this.f = i2 >> 1;
    }
}
