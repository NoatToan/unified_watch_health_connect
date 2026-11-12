package com.google.android.gms.internal.maps;

import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzbv extends zzbn {
    static final zzbn zza = new zzbv(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbv(Object obj, Object[] objArr, int i14) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    public static zzbv zzg(int i14, Object[] objArr, zzbm zzbmVar) {
        boolean z14;
        int i15;
        int i16;
        short[] sArr;
        boolean z15;
        Object obj;
        boolean z16;
        ?? r16;
        int i17 = i14;
        Object[] objArrCopyOf = objArr;
        if (i17 == 0) {
            return (zzbv) zza;
        }
        zzbl zzblVar = null;
        ?? r14 = 0;
        zzbl zzblVar2 = null;
        zzbl zzblVar3 = null;
        boolean z17 = false;
        int i18 = 1;
        if (i17 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzbf.zza(obj2, obj3);
            return new zzbv(null, objArrCopyOf, 1);
        }
        zzbc.zzb(i17, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzf = zzbo.zzf(i17);
        if (i17 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzbf.zza(obj4, obj5);
            r16 = 0;
            i17 = 1;
            i15 = 1;
        } else {
            int i19 = iZzf - 1;
            if (iZzf <= 128) {
                byte[] bArr = new byte[iZzf];
                Arrays.fill(bArr, (byte) -1);
                int i24 = 0;
                int i25 = 0;
                while (i24 < i17) {
                    int i26 = i25 + i25;
                    int i27 = i24 + i24;
                    Object obj6 = objArrCopyOf[i27];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i27 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzbf.zza(obj6, obj7);
                    int iZza = zzbg.zza(obj6.hashCode());
                    while (true) {
                        int i28 = iZza & i19;
                        z16 = z17;
                        int i29 = bArr[i28] & UnsignedBytes.MAX_VALUE;
                        if (i29 == 255) {
                            bArr[i28] = (byte) i26;
                            if (i25 < i24) {
                                objArrCopyOf[i26] = obj6;
                                objArrCopyOf[i26 ^ 1] = obj7;
                            }
                            i25++;
                            break;
                        }
                        if (obj6.equals(objArrCopyOf[i29 == true ? 1 : 0])) {
                            int i30 = ~i29;
                            Object obj8 = objArrCopyOf[i30 == true ? 1 : 0];
                            Objects.requireNonNull(obj8);
                            zzbl zzblVar4 = new zzbl(obj6, obj7, obj8);
                            objArrCopyOf[i30 == true ? 1 : 0] = obj7;
                            zzblVar2 = zzblVar4;
                            break;
                        }
                        iZza = i28 + 1;
                        z17 = z16;
                    }
                    i24++;
                    z17 = z16;
                }
                z14 = z17;
                obj = bArr;
                z15 = z14;
                if (i25 == i17) {
                    i15 = 1;
                    r14 = obj;
                    r16 = z15;
                } else {
                    sArr = new Object[3];
                    sArr[z14 ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i25);
                    sArr[2] = zzblVar2;
                    r14 = sArr;
                    i15 = 1;
                    r16 = z14;
                }
            } else {
                z14 = false;
                if (iZzf <= 32768) {
                    sArr = new short[iZzf];
                    Arrays.fill(sArr, (short) -1);
                    int i34 = 0;
                    for (int i35 = 0; i35 < i17; i35++) {
                        int i36 = i34 + i34;
                        int i37 = i35 + i35;
                        Object obj9 = objArrCopyOf[i37];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i37 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbf.zza(obj9, obj10);
                        int iZza2 = zzbg.zza(obj9.hashCode());
                        while (true) {
                            int i38 = iZza2 & i19;
                            char c14 = (char) sArr[i38];
                            if (c14 == 65535) {
                                sArr[i38] = (short) i36;
                                if (i34 < i35) {
                                    objArrCopyOf[i36] = obj9;
                                    objArrCopyOf[i36 ^ 1] = obj10;
                                }
                                i34++;
                                break;
                            }
                            if (obj9.equals(objArrCopyOf[c14])) {
                                int i39 = c14 ^ 1;
                                Object obj11 = objArrCopyOf[i39 == true ? 1 : 0];
                                Objects.requireNonNull(obj11);
                                zzbl zzblVar5 = new zzbl(obj9, obj10, obj11);
                                objArrCopyOf[i39 == true ? 1 : 0] = obj10;
                                zzblVar3 = zzblVar5;
                                break;
                            }
                            iZza2 = i38 + 1;
                        }
                    }
                    if (i34 == i17) {
                        r14 = sArr;
                        i15 = 1;
                        r16 = z14;
                    } else {
                        obj = new Object[]{sArr, Integer.valueOf(i34), zzblVar3};
                        z15 = z14;
                        i15 = 1;
                        r14 = obj;
                        r16 = z15;
                    }
                } else {
                    int[] iArr = new int[iZzf];
                    Arrays.fill(iArr, -1);
                    int i44 = 0;
                    int i45 = 0;
                    while (i44 < i17) {
                        int i46 = i45 + i45;
                        int i47 = i44 + i44;
                        Object obj12 = objArrCopyOf[i47];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i47 ^ i18];
                        Objects.requireNonNull(obj13);
                        zzbf.zza(obj12, obj13);
                        int iZza3 = zzbg.zza(obj12.hashCode());
                        while (true) {
                            int i48 = iZza3 & i19;
                            int i49 = iArr[i48];
                            if (i49 == -1) {
                                iArr[i48] = i46;
                                if (i45 < i44) {
                                    objArrCopyOf[i46] = obj12;
                                    objArrCopyOf[i46 ^ 1] = obj13;
                                }
                                i45++;
                                i16 = i18;
                                break;
                            }
                            i16 = i18;
                            if (obj12.equals(objArrCopyOf[i49])) {
                                int i54 = i49 ^ 1;
                                Object obj14 = objArrCopyOf[i54];
                                Objects.requireNonNull(obj14);
                                zzbl zzblVar6 = new zzbl(obj12, obj13, obj14);
                                objArrCopyOf[i54] = obj13;
                                zzblVar = zzblVar6;
                                break;
                            }
                            iZza3 = i48 + 1;
                            i18 = i16;
                        }
                        i44++;
                        i18 = i16;
                    }
                    i15 = i18;
                    if (i45 == i17) {
                        r14 = iArr;
                        r16 = z14;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i15] = Integer.valueOf(i45);
                        objArr2[2] = zzblVar;
                        r14 = objArr2;
                        r16 = z14;
                    }
                }
            }
        }
        boolean z18 = r14 instanceof Object[];
        ?? r15 = r14;
        if (z18) {
            Object[] objArr3 = (Object[]) r14;
            zzbmVar.zzc = (zzbl) objArr3[2];
            Object obj15 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i15]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r15 = obj15;
            i17 = iIntValue;
        }
        return new zzbv(r15, objArrCopyOf, i17);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.maps.zzbn, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i14 = this.zzd;
            Object[] objArr = this.zzb;
            if (i14 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzbg.zza(obj.hashCode());
                    while (true) {
                        int i15 = iZza & length;
                        int i16 = bArr[i15] & UnsignedBytes.MAX_VALUE;
                        if (i16 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            obj2 = objArr[i16 ^ 1];
                        } else {
                            iZza = i15 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzbg.zza(obj.hashCode());
                    while (true) {
                        int i17 = iZza2 & length2;
                        char c14 = (char) sArr[i17];
                        if (c14 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c14])) {
                            obj2 = objArr[c14 ^ 1];
                        } else {
                            iZza2 = i17 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzbg.zza(obj.hashCode());
                    while (true) {
                        int i18 = iZza3 & length3;
                        int i19 = iArr[i18];
                        if (i19 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i19])) {
                            obj2 = objArr[i19 ^ 1];
                        } else {
                            iZza3 = i18 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbh zza() {
        return new zzbu(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zzd() {
        return new zzbs(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zze() {
        return new zzbt(this, new zzbu(this.zzb, 0, this.zzd));
    }
}
