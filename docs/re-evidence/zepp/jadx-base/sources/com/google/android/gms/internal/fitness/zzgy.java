package com.google.android.gms.internal.fitness;

import com.google.android.gms.internal.fitness.zzgy;
import com.google.android.gms.internal.fitness.zzgy.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgy<MessageType extends zzgy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzfo<MessageType, BuilderType> {
    private static Map<Object, zzgy<?, ?>> zzxv = new ConcurrentHashMap();
    public zzjr zzxt = zzjr.zzdp();
    private int zzxu = -1;

    public static final class a implements zzgv<a> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgv
        public final zzij zza(zzij zzijVar, zzik zzikVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgv
        public final zzkg zzbl() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgv
        public final zzkj zzbm() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgv
        public final boolean zzbn() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgv
        public final boolean zzbo() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgv
        public final int zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.fitness.zzgv
        public final zziq zza(zziq zziqVar, zziq zziqVar2) {
            throw new NoSuchMethodError();
        }
    }

    public static class zza<T extends zzgy<T, ?>> extends zzft<T> {
        private final T b;

        public zza(T t) {
            this.b = t;
        }
    }

    public static abstract class zzb<MessageType extends zzgy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzfr<MessageType, BuilderType> {
        private final MessageType a;
        private MessageType b;
        private boolean c = false;

        public zzb(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.zza(zze.zzyg, null, null);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            t3.a().c(messagetype).c(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.fitness.zzfr
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.a.zza(zze.zzyh, null, null);
            zzbVar.zza((zzgy) zzbz());
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.fitness.zzim
        public final boolean isInitialized() {
            return zzgy.zza(this.b, false);
        }

        @Override // com.google.android.gms.internal.fitness.zzfr
        public final BuilderType zza(MessageType messagetype) {
            if (this.c) {
                zzbw();
                this.c = false;
            }
            a(this.b, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.fitness.zzfr
        /* JADX INFO: renamed from: zzap */
        public final /* synthetic */ zzfr clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.fitness.zzim
        public final /* synthetic */ zzik zzbu() {
            return this.a;
        }

        public void zzbw() {
            MessageType messagetype = (MessageType) this.b.zza(zze.zzyg, null, null);
            a(messagetype, this.b);
            this.b = messagetype;
        }

        @Override // com.google.android.gms.internal.fitness.zzij
        /* JADX INFO: renamed from: zzbx, reason: merged with bridge method [inline-methods] */
        public MessageType zzbz() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            t3.a().c(messagetype).a(messagetype);
            this.c = true;
            return this.b;
        }

        @Override // com.google.android.gms.internal.fitness.zzij
        /* JADX INFO: renamed from: zzby, reason: merged with bridge method [inline-methods] */
        public final MessageType zzca() {
            MessageType messagetype = (MessageType) zzbz();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzjp(messagetype);
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzgy<MessageType, BuilderType> implements zzim {
        public q2<a> zzya = q2.o();
    }

    public static final enum zze {
        private static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzyd = 1;
        public static final int zzye = 2;
        public static final int zzyf = 3;
        public static final int zzyg = 4;
        public static final int zzyh = 5;
        public static final int zzyi = 6;
        public static final int zzyj = 7;

        public static int[] zzcc() {
            return (int[]) a.clone();
        }
    }

    public static <T extends zzgy<?, ?>> T c(Class<T> cls) {
        zzgy<?, ?> zzgyVar = zzxv.get(cls);
        if (zzgyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgyVar = zzxv.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgyVar == null) {
            zzgyVar = (T) ((zzgy) s4.x(cls)).zza(zze.zzyi, (Object) null, (Object) null);
            if (zzgyVar == null) {
                throw new IllegalStateException();
            }
            zzxv.put(cls, zzgyVar);
        }
        return (T) zzgyVar;
    }

    public static Object d(Method method, Object obj, Object... objArr) {
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

    public static <T extends zzgy<?, ?>> void zza(Class<T> cls, T t) {
        zzxv.put(cls, t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.fitness.u2, com.google.android.gms.internal.fitness.zzhg] */
    public static zzhg zzbq() {
        return u2.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.fitness.d3, com.google.android.gms.internal.fitness.zzhi] */
    public static zzhi zzbr() {
        return d3.c();
    }

    public static <E> zzhh<E> zzbs() {
        return v3.c();
    }

    @Override // com.google.android.gms.internal.fitness.zzfo
    public final int a() {
        return this.zzxu;
    }

    @Override // com.google.android.gms.internal.fitness.zzfo
    public final void b(int i) {
        this.zzxu = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return t3.a().c(this).equals(this, (zzgy) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zztu;
        if (i != 0) {
            return i;
        }
        int iHashCode = t3.a().c(this).hashCode(this);
        this.zztu = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.fitness.zzim
    public final boolean isInitialized() {
        return zza(this, true);
    }

    public String toString() {
        return m3.a(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.fitness.zzik
    public final void zzb(zzgk zzgkVar) throws IOException {
        t3.a().c(this).e(this, l2.P(zzgkVar));
    }

    @Override // com.google.android.gms.internal.fitness.zzik
    public final int zzbp() {
        if (this.zzxu == -1) {
            this.zzxu = t3.a().c(this).b(this);
        }
        return this.zzxu;
    }

    @Override // com.google.android.gms.internal.fitness.zzik
    public final /* synthetic */ zzij zzbt() {
        zzb zzbVar = (zzb) zza(zze.zzyh, (Object) null, (Object) null);
        zzbVar.zza(this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzim
    public final /* synthetic */ zzik zzbu() {
        return (zzgy) zza(zze.zzyi, (Object) null, (Object) null);
    }

    public static Object zza(zzik zzikVar, String str, Object[] objArr) {
        return new u3(zzikVar, str, objArr);
    }

    public static final <T extends zzgy<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((Byte) t.zza(zze.zzyd, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = t3.a().c(t).d(t);
        if (z) {
            t.zza(zze.zzye, zD ? t : null, null);
        }
        return zD;
    }
}
