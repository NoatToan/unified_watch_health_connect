package com.google.android.gms.internal.mlkit_common;

import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i14) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i14;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static zzaq zzg(int i14, Object[] objArr, zzah zzahVar) {
        int iHighestOneBit;
        boolean z14;
        int i15;
        char c14;
        ?? r14;
        char c15;
        short[] sArr;
        boolean z15;
        int i16;
        ?? r16;
        boolean z16;
        ?? r15;
        Object[] objArr2;
        zzag zzagVar;
        boolean z17;
        int i17 = i14;
        Object[] objArrCopyOf = objArr;
        if (i17 == 0) {
            return (zzaq) zza;
        }
        zzag zzagVar2 = null;
        ?? r17 = 0;
        zzag zzagVar3 = null;
        zzag zzagVar4 = null;
        boolean z18 = false;
        int i18 = 1;
        if (i17 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzw.zza(obj, obj2);
            return new zzaq(null, objArrCopyOf, 1);
        }
        zzt.zzb(i17, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        char c16 = 2;
        int iMax = Math.max(i17, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                h.s("collection too large");
                return null;
            }
        }
        if (i17 != 1) {
            int i19 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i24 = 0;
                int i25 = 0;
                while (i24 < i17) {
                    int i26 = i25 + i25;
                    int i27 = i24 + i24;
                    Object obj3 = objArrCopyOf[i27];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i27 ^ i18];
                    Objects.requireNonNull(obj4);
                    zzw.zza(obj3, obj4);
                    int iZza = zzy.zza(obj3.hashCode());
                    while (true) {
                        int i28 = iZza & i19;
                        z15 = z18;
                        i16 = i18;
                        int i29 = bArr[i28] & UnsignedBytes.MAX_VALUE;
                        if (i29 == 255) {
                            bArr[i28] = (byte) i26;
                            if (i25 < i24) {
                                objArrCopyOf[i26] = obj3;
                                objArrCopyOf[i26 ^ 1] = obj4;
                            }
                            i25++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i29 == true ? 1 : 0])) {
                            int i30 = ~i29;
                            Object obj5 = objArrCopyOf[i30 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzag zzagVar5 = new zzag(obj3, obj4, obj5);
                            objArrCopyOf[i30 == true ? 1 : 0] = obj4;
                            zzagVar3 = zzagVar5;
                            break;
                        }
                        iZza = i28 + 1;
                        z18 = z15;
                        i18 = i16;
                    }
                    i24++;
                    z18 = z15;
                    i18 = i16;
                }
                z14 = z18;
                i15 = i18;
                if (i25 == i17) {
                    c14 = 2;
                    r14 = bArr;
                    r16 = z14;
                } else {
                    sArr = new Object[3];
                    sArr[z14 ? 1 : 0] = bArr;
                    sArr[i15] = Integer.valueOf(i25);
                    sArr[2] = zzagVar3;
                    r17 = sArr;
                    z17 = z14;
                }
            } else {
                z14 = false;
                i15 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i34 = 0;
                    for (int i35 = 0; i35 < i17; i35++) {
                        int i36 = i34 + i34;
                        int i37 = i35 + i35;
                        Object obj6 = objArrCopyOf[i37];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i37 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzw.zza(obj6, obj7);
                        int iZza2 = zzy.zza(obj6.hashCode());
                        while (true) {
                            int i38 = iZza2 & i19;
                            char c17 = (char) sArr[i38];
                            if (c17 == 65535) {
                                sArr[i38] = (short) i36;
                                if (i34 < i35) {
                                    objArrCopyOf[i36] = obj6;
                                    objArrCopyOf[i36 ^ 1] = obj7;
                                }
                                i34++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c17])) {
                                int i39 = c17 ^ 1;
                                Object obj8 = objArrCopyOf[i39 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzag zzagVar6 = new zzag(obj6, obj7, obj8);
                                objArrCopyOf[i39 == true ? 1 : 0] = obj7;
                                zzagVar4 = zzagVar6;
                                break;
                            }
                            iZza2 = i38 + 1;
                        }
                    }
                    if (i34 == i17) {
                        r17 = sArr;
                        z17 = z14;
                    } else {
                        r17 = new Object[]{sArr, Integer.valueOf(i34), zzagVar4};
                        z17 = z14;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i44 = 0;
                    int i45 = 0;
                    while (i44 < i17) {
                        int i46 = i45 + i45;
                        int i47 = i44 + i44;
                        Object obj9 = objArrCopyOf[i47];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i47 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzw.zza(obj9, obj10);
                        int iZza3 = zzy.zza(obj9.hashCode());
                        while (true) {
                            int i48 = iZza3 & i19;
                            int i49 = iArr[i48];
                            if (i49 == -1) {
                                iArr[i48] = i46;
                                if (i45 < i44) {
                                    objArrCopyOf[i46] = obj9;
                                    objArrCopyOf[i46 ^ 1] = obj10;
                                }
                                i45++;
                                c15 = c16;
                                break;
                            }
                            c15 = c16;
                            if (obj9.equals(objArrCopyOf[i49])) {
                                int i54 = i49 ^ 1;
                                Object obj11 = objArrCopyOf[i54];
                                Objects.requireNonNull(obj11);
                                zzag zzagVar7 = new zzag(obj9, obj10, obj11);
                                objArrCopyOf[i54] = obj10;
                                zzagVar2 = zzagVar7;
                                break;
                            }
                            iZza3 = i48 + 1;
                            c16 = c15;
                        }
                        i44++;
                        c16 = c15;
                    }
                    c14 = c16;
                    if (i45 == i17) {
                        r14 = iArr;
                        r16 = z14;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i45);
                        objArr3[c14] = zzagVar2;
                        r14 = objArr3;
                        r16 = z14;
                    }
                }
            }
            z16 = r14 instanceof Object[];
            r15 = r14;
            if (z16) {
                objArr2 = (Object[]) r14;
                zzagVar = (zzag) objArr2[c14];
                if (zzahVar != null) {
                    throw zzagVar.zza();
                }
                zzahVar.zzc = zzagVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i15]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r15 = obj12;
                i17 = iIntValue;
            }
            return new zzaq(r15, objArrCopyOf, i17);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzw.zza(obj13, obj14);
        z17 = false;
        i17 = 1;
        i15 = 1;
        c14 = 2;
        r14 = r17;
        r16 = z17;
        z16 = r14 instanceof Object[];
        r15 = r14;
        if (z16) {
            objArr2 = (Object[]) r14;
            zzagVar = (zzag) objArr2[c14];
            if (zzahVar != null) {
                throw zzagVar.zza();
            }
            zzahVar.zzc = zzagVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i15]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r15 = obj15;
            i17 = iIntValue2;
        }
        return new zzaq(r15, objArrCopyOf, i17);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
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
                    int iZza = zzy.zza(obj.hashCode());
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
                    int iZza2 = zzy.zza(obj.hashCode());
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
                    int iZza3 = zzy.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
