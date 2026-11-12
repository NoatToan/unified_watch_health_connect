package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
final class zzop {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzoo zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z14;
        boolean z15;
        zzoo zzooVar;
        Unsafe unsafeZzq = zzq();
        zzc = unsafeZzq;
        int i14 = zzkv.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzr = zzr(cls);
        zze = zZzr;
        Class cls2 = Integer.TYPE;
        boolean zZzr2 = zzr(cls2);
        zzoo zzomVar = null;
        if (unsafeZzq != null) {
            if (zZzr) {
                zzomVar = new zzon(unsafeZzq);
            } else if (zZzr2) {
                zzomVar = new zzom(unsafeZzq);
            }
        }
        zzf = zzomVar;
        if (zzomVar == null) {
            z14 = false;
        } else {
            try {
                Class<?> cls3 = zzomVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } catch (Throwable th3) {
                zzy(th3);
            }
        }
        zzg = z14;
        zzoo zzooVar2 = zzf;
        if (zzooVar2 == null) {
            z15 = false;
        } else {
            try {
                Class<?> cls4 = zzooVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z15 = true;
            } catch (Throwable th4) {
                zzy(th4);
                z15 = false;
            }
        }
        zzh = z15;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzooVar = zzf) != null) {
            zzooVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzop() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i14 = zzkv.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j8, byte b14) {
        Unsafe unsafe = zzf.zza;
        long j14 = (-4) & j8;
        int i14 = unsafe.getInt(obj, j14);
        int i15 = ((~((int) j8)) & 3) << 3;
        unsafe.putInt(obj, j14, ((255 & b14) << i15) | (i14 & (~(255 << i15))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j8, byte b14) {
        Unsafe unsafe = zzf.zza;
        long j14 = (-4) & j8;
        int i14 = (((int) j8) & 3) << 3;
        unsafe.putInt(obj, j14, ((255 & b14) << i14) | (unsafe.getInt(obj, j14) & (~(255 << i14))));
    }

    public static boolean zza() {
        return zzh;
    }

    public static boolean zzb() {
        return zzg;
    }

    public static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            l2.p(e4);
            return null;
        }
    }

    public static int zzd(Object obj, long j8) {
        return zzf.zza.getInt(obj, j8);
    }

    public static void zze(Object obj, long j8, int i14) {
        zzf.zza.putInt(obj, j8, i14);
    }

    public static long zzf(Object obj, long j8) {
        return zzf.zza.getLong(obj, j8);
    }

    public static void zzg(Object obj, long j8, long j14) {
        zzf.zza.putLong(obj, j8, j14);
    }

    public static boolean zzh(Object obj, long j8) {
        return zzf.zzb(obj, j8);
    }

    public static void zzi(Object obj, long j8, boolean z14) {
        zzf.zzc(obj, j8, z14);
    }

    public static float zzj(Object obj, long j8) {
        return zzf.zzd(obj, j8);
    }

    public static void zzk(Object obj, long j8, float f14) {
        zzf.zze(obj, j8, f14);
    }

    public static double zzl(Object obj, long j8) {
        return zzf.zzf(obj, j8);
    }

    public static void zzm(Object obj, long j8, double d14) {
        zzf.zzg(obj, j8, d14);
    }

    public static Object zzn(Object obj, long j8) {
        return zzf.zza.getObject(obj, j8);
    }

    public static void zzo(Object obj, long j8, Object obj2) {
        zzf.zza.putObject(obj, j8, obj2);
    }

    public static void zzp(byte[] bArr, long j8, byte b14) {
        zzf.zza(bArr, zza + j8, b14);
    }

    public static Unsafe zzq() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzol());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzr(Class cls) {
        int i14 = zzkv.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzu(Object obj, long j8) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzv(Object obj, long j8) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void zzy(Throwable th3) {
        Logger.getLogger(zzop.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
