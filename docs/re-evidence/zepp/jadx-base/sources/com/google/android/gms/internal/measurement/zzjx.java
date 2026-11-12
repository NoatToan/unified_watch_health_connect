package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzjx;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzjx<MessageType extends zzjx<MessageType, BuilderType>, BuilderType extends zzjt<MessageType, BuilderType>> extends zzih<MessageType, BuilderType> {
    private static final Map<Object, zzjx<?, ?>> zza = new ConcurrentHashMap();
    public zzmc zzc = zzmc.zzc();
    public int zzd = -1;

    public static Object c(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends zzjx> T d(Class<T> cls) {
        Map<Object, zzjx<?, ?>> map = zza;
        zzjx<?, ?> zzjxVar = map.get(cls);
        if (zzjxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjxVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzjxVar == null) {
            zzjxVar = (zzjx) ((zzjx) w4.j(cls)).zzl(6, null, null);
            if (zzjxVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzjxVar);
        }
        return zzjxVar;
    }

    public static <E> zzke<E> zzbA() {
        return y3.a();
    }

    public static <E> zzke<E> zzbB(zzke<E> zzkeVar) {
        int size = zzkeVar.size();
        return zzkeVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzbF(zzlc zzlcVar, String str, Object[] objArr) {
        return new z3(zzlcVar, str, objArr);
    }

    public static <T extends zzjx> void zzbG(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    public static zzkc zzbx() {
        return e3.b();
    }

    public static zzkd zzby() {
        return j3.a();
    }

    public static zzkd zzbz(zzkd zzkdVar) {
        int size = zzkdVar.size();
        return zzkdVar.zzd(size == 0 ? 10 : size + size);
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final int a() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final void b(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return x3.a().b(getClass()).g(this, (zzjx) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iC = x3.a().b(getClass()).c(this);
        this.zzb = iC;
        return iC;
    }

    public final String toString() {
        return r3.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final /* synthetic */ zzlb zzbC() {
        return (zzjt) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final /* synthetic */ zzlb zzbD() {
        zzjt zzjtVar = (zzjt) zzl(5, null, null);
        zzjtVar.zzay(this);
        return zzjtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void zzbH(zzje zzjeVar) throws IOException {
        x3.a().b(getClass()).h(this, u2.l(zzjeVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final /* synthetic */ zzlc zzbL() {
        return (zzjx) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int zzbt() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int iD = x3.a().b(getClass()).d(this);
        this.zzd = iD;
        return iD;
    }

    public final <MessageType extends zzjx<MessageType, BuilderType>, BuilderType extends zzjt<MessageType, BuilderType>> BuilderType zzbu() {
        return (BuilderType) zzl(5, null, null);
    }

    public final BuilderType zzbv() {
        BuilderType buildertype = (BuilderType) zzl(5, null, null);
        buildertype.zzay(this);
        return buildertype;
    }

    public abstract Object zzl(int i, Object obj, Object obj2);
}
