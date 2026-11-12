package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import am.j;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import j20.x;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzeh<MessageType extends zzeh<MessageType, BuilderType>, BuilderType extends zzeb<MessageType, BuilderType>> extends zzcq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgt zzc = zzgt.zzc();

    public static zzef zzI(zzfm zzfmVar, Object obj, zzfm zzfmVar2, zzek zzekVar, int i14, zzhf zzhfVar, Class cls) {
        return new zzef(zzfmVar, obj, zzfmVar2, new zzee(null, i14, zzhfVar, false, false), cls);
    }

    public static zzeh zzJ(Class cls) {
        Map map = zzb;
        zzeh zzehVar = (zzeh) map.get(cls);
        if (zzehVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzehVar = (zzeh) map.get(cls);
            } catch (ClassNotFoundException e4) {
                a.x("Class initialization cannot fail.", e4);
                return null;
            }
        }
        if (zzehVar != null) {
            return zzehVar;
        }
        zzeh zzehVar2 = (zzeh) ((zzeh) zzgz.zze(cls)).zzg(6, null, null);
        if (zzehVar2 != null) {
            map.put(cls, zzehVar2);
            return zzehVar2;
        }
        x.h();
        return null;
    }

    public static zzeh zzL(zzeh zzehVar, byte[] bArr, zzds zzdsVar) throws zzer {
        zzeh zzehVarZze = zze(zzehVar, bArr, 0, bArr.length, zzdsVar);
        if (zzehVarZze == null || zzX(zzehVarZze, true)) {
            return zzehVarZze;
        }
        throw new zzgr(zzehVarZze).zza();
    }

    public static zzem zzM() {
        return zzdz.zzf();
    }

    public static zzem zzN(zzem zzemVar) {
        int size = zzemVar.size();
        return zzemVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzen zzO() {
        return zzei.zzf();
    }

    public static zzeo zzP() {
        return zzfv.zze();
    }

    public static zzeo zzQ(zzeo zzeoVar) {
        int size = zzeoVar.size();
        return zzeoVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzR(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            q2.v("Couldn't use Java reflection to implement protocol message reflection.", e4);
            return null;
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            q2.v("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static Object zzS(zzfm zzfmVar, String str, Object[] objArr) {
        return new zzfw(zzfmVar, str, objArr);
    }

    public static void zzV(Class cls, zzeh zzehVar) {
        zzehVar.zzU();
        zzb.put(cls, zzehVar);
    }

    public static final boolean zzX(zzeh zzehVar, boolean z14) {
        byte bByteValue = ((Byte) zzehVar.zzg(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzfu.zza().zzb(zzehVar.getClass()).zzk(zzehVar);
        if (z14) {
            zzehVar.zzg(2, true != zZzk ? null : zzehVar, null);
        }
        return zZzk;
    }

    private final int zzc(zzge zzgeVar) {
        return zzfu.zza().zzb(getClass()).zza(this);
    }

    private static zzeh zze(zzeh zzehVar, byte[] bArr, int i14, int i15, zzds zzdsVar) throws zzer {
        if (i15 == 0) {
            return zzehVar;
        }
        zzeh zzehVarZzK = zzehVar.zzK();
        try {
            zzge zzgeVarZzb = zzfu.zza().zzb(zzehVarZzK.getClass());
            zzgeVarZzb.zzh(zzehVarZzK, bArr, 0, i15, new zzcu(zzdsVar));
            zzgeVarZzb.zzf(zzehVarZzK);
            return zzehVarZzK;
        } catch (zzer e4) {
            throw e4;
        } catch (zzgr e14) {
            throw e14.zza();
        } catch (IOException e15) {
            if (e15.getCause() instanceof zzer) {
                throw ((zzer) e15.getCause());
            }
            throw new zzer(e15);
        } catch (IndexOutOfBoundsException unused) {
            com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzfu.zza().zzb(getClass()).zzj(this, (zzeh) obj);
    }

    public final int hashCode() {
        if (zzY()) {
            return zzE();
        }
        int i14 = this.zza;
        if (i14 != 0) {
            return i14;
        }
        int iZzE = zzE();
        this.zza = iZzE;
        return iZzE;
    }

    public final String toString() {
        return zzfo.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq
    public final int zzB(zzge zzgeVar) {
        if (zzY()) {
            int iZza = zzgeVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            h.z(j.h(iZza, "serialized size must be non-negative, was "));
            return 0;
        }
        int i14 = this.zzd & Integer.MAX_VALUE;
        if (i14 != Integer.MAX_VALUE) {
            return i14;
        }
        int iZza2 = zzgeVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        h.z(j.h(iZza2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final int zzE() {
        return zzfu.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final int zzF() {
        if (zzY()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            h.z(j.h(iZzc, "serialized size must be non-negative, was "));
            return 0;
        }
        int i14 = this.zzd & Integer.MAX_VALUE;
        if (i14 != Integer.MAX_VALUE) {
            return i14;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        h.z(j.h(iZzc2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final zzeb zzG() {
        return (zzeb) zzg(5, null, null);
    }

    public final zzeb zzH() {
        zzeb zzebVar = (zzeb) zzg(5, null, null);
        zzebVar.zzg(this);
        return zzebVar;
    }

    public final zzeh zzK() {
        return (zzeh) zzg(4, null, null);
    }

    public final void zzT() {
        zzfu.zza().zzb(getClass()).zzf(this);
        zzU();
    }

    public final void zzU() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzW(int i14) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final /* synthetic */ zzfl zzZ() {
        return (zzeb) zzg(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final /* synthetic */ zzfl zzaa() {
        zzeb zzebVar = (zzeb) zzg(5, null, null);
        zzebVar.zzg(this);
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
    public final void zzab(zzdn zzdnVar) {
        zzfu.zza().zzb(getClass()).zzi(this, zzdo.zza(zzdnVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    public final /* synthetic */ zzfm zzac() {
        return (zzeh) zzg(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    public final boolean zzad() {
        return zzX(this, true);
    }

    public abstract Object zzg(int i14, Object obj, Object obj2);
}
