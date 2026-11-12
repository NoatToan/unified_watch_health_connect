package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
final class zzgz {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z14;
        boolean z15;
        zzgy zzgyVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        int i14 = zzct.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzv = zzv(cls);
        zze = zZzv;
        Class cls2 = Integer.TYPE;
        boolean zZzv2 = zzv(cls2);
        zzgy zzgwVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzgwVar = new zzgx(unsafeZzg);
            } else if (zZzv2) {
                zzgwVar = new zzgw(unsafeZzg);
            }
        }
        zzf = zzgwVar;
        if (zzgwVar == null) {
            z14 = false;
        } else {
            try {
                Class<?> cls3 = zzgwVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } catch (Throwable th3) {
                zzh(th3);
            }
        }
        zzg = z14;
        zzgy zzgyVar2 = zzf;
        if (zzgyVar2 == null) {
            z15 = false;
        } else {
            try {
                Class<?> cls4 = zzgyVar2.zza.getClass();
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
                zzh(th4);
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
        if (fieldZzB != null && (zzgyVar = zzf) != null) {
            zzgyVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzgz() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i14 = zzct.zza;
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
        zzgy zzgyVar = zzf;
        long j14 = (-4) & j8;
        int i14 = zzgyVar.zza.getInt(obj, j14);
        int i15 = ((~((int) j8)) & 3) << 3;
        zzgyVar.zza.putInt(obj, j14, ((255 & b14) << i15) | (i14 & (~(255 << i15))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j8, byte b14) {
        zzgy zzgyVar = zzf;
        long j14 = (-4) & j8;
        int i14 = (((int) j8) & 3) << 3;
        zzgyVar.zza.putInt(obj, j14, ((255 & b14) << i14) | (zzgyVar.zza.getInt(obj, j14) & (~(255 << i14))));
    }

    public static double zza(Object obj, long j8) {
        return zzf.zza(obj, j8);
    }

    public static float zzb(Object obj, long j8) {
        return zzf.zzb(obj, j8);
    }

    public static int zzc(Object obj, long j8) {
        return zzf.zza.getInt(obj, j8);
    }

    public static long zzd(Object obj, long j8) {
        return zzf.zza.getLong(obj, j8);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            l2.p(e4);
            return null;
        }
    }

    public static Object zzf(Object obj, long j8) {
        return zzf.zza.getObject(obj, j8);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th3) {
        Logger.getLogger(zzgz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
    }

    public static void zzm(Object obj, long j8, boolean z14) {
        zzf.zzc(obj, j8, z14);
    }

    public static void zzn(byte[] bArr, long j8, byte b14) {
        zzf.zzd(bArr, zza + j8, b14);
    }

    public static void zzo(Object obj, long j8, double d14) {
        zzf.zze(obj, j8, d14);
    }

    public static void zzp(Object obj, long j8, float f14) {
        zzf.zzf(obj, j8, f14);
    }

    public static void zzq(Object obj, long j8, int i14) {
        zzf.zza.putInt(obj, j8, i14);
    }

    public static void zzr(Object obj, long j8, long j14) {
        zzf.zza.putLong(obj, j8, j14);
    }

    public static void zzs(Object obj, long j8, Object obj2) {
        zzf.zza.putObject(obj, j8, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j8) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j8) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzv(Class cls) {
        int i14 = zzct.zza;
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

    public static boolean zzw(Object obj, long j8) {
        return zzf.zzg(obj, j8);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
