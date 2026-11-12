package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.measurement.a;
import java.util.Iterator;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzfq implements zzge {
    private final zzfm zza;
    private final zzgs zzb;
    private final boolean zzc;
    private final zzdt zzd;

    private zzfq(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        this.zzb = zzgsVar;
        this.zzc = zzfmVar instanceof zzed;
        this.zzd = zzdtVar;
        this.zza = zzfmVar;
    }

    public static zzfq zzc(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        return new zzfq(zzgsVar, zzdtVar, zzfmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int iZzb = ((zzeh) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzed) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int iHashCode = ((zzeh) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzed) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        zzfm zzfmVar = this.zza;
        return zzfmVar instanceof zzeh ? ((zzeh) zzfmVar).zzK() : zzfmVar.zzZ().zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzgg.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgg.zzo(this.zzd, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i14, int i15, zzcu zzcuVar) throws zzer {
        int iZzj;
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVarZzf = zzehVar.zzc;
        if (zzgtVarZzf == zzgt.zzc()) {
            zzgtVarZzf = zzgt.zzf();
            zzehVar.zzc = zzgtVarZzf;
        }
        zzgt zzgtVar = zzgtVarZzf;
        zzdx zzdxVarZzc = ((zzed) obj).zzc();
        zzef zzefVarZzb = null;
        while (i14 < i15) {
            int iZzj2 = zzcv.zzj(bArr, i14, zzcuVar);
            int i16 = zzcuVar.zza;
            if (i16 == 11) {
                int i17 = i15;
                zzcu zzcuVar2 = zzcuVar;
                int i18 = 0;
                zzdf zzdfVar = null;
                while (true) {
                    if (iZzj2 >= i17) {
                        iZzj = iZzj2;
                        break;
                    }
                    iZzj = zzcv.zzj(bArr, iZzj2, zzcuVar2);
                    int i19 = zzcuVar2.zza;
                    int i24 = i19 >>> 3;
                    int i25 = i19 & 7;
                    if (i24 == 2) {
                        if (i25 != 0) {
                            if (i19 != 12) {
                                break;
                                break;
                            }
                            iZzj2 = zzcv.zzp(i19, bArr, iZzj, i17, zzcuVar2);
                        } else {
                            iZzj2 = zzcv.zzj(bArr, iZzj, zzcuVar2);
                            i18 = zzcuVar2.zza;
                            zzefVarZzb = zzcuVar2.zzd.zzb(this.zza, i18);
                        }
                    } else {
                        if (i24 == 3) {
                            if (zzefVarZzb != null) {
                                iZzj2 = zzcv.zze(zzfu.zza().zzb(zzefVarZzb.zza.getClass()), bArr, iZzj, i17, zzcuVar2);
                                zzdxVarZzc.zzi(zzefVarZzb.zzb, zzcuVar2.zzc);
                            } else if (i25 == 2) {
                                iZzj2 = zzcv.zza(bArr, iZzj, zzcuVar2);
                                zzdfVar = (zzdf) zzcuVar2.zzc;
                            }
                        }
                        if (i19 != 12) {
                            break;
                        } else {
                            iZzj2 = zzcv.zzp(i19, bArr, iZzj, i17, zzcuVar2);
                        }
                    }
                }
                if (zzdfVar != null) {
                    zzgtVar.zzj((i18 << 3) | 2, zzdfVar);
                }
                i14 = iZzj;
                i15 = i17;
                zzcuVar = zzcuVar2;
            } else if ((i16 & 7) == 2) {
                zzefVarZzb = zzcuVar.zzd.zzb(this.zza, i16 >>> 3);
                if (zzefVarZzb != null) {
                    i14 = zzcv.zze(zzfu.zza().zzb(zzefVarZzb.zza.getClass()), bArr, iZzj2, i15, zzcuVar);
                    zzdxVarZzc.zzi(zzefVarZzb.zzb, zzcuVar.zzc);
                } else {
                    i14 = zzcv.zzi(i16, bArr, iZzj2, i15, zzgtVar, zzcuVar);
                }
            } else {
                i14 = zzcv.zzp(i16, bArr, iZzj2, i15, zzcuVar);
            }
        }
        if (i14 == i15) {
            return;
        }
        a.r("Failed to parse the message.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzi(Object obj, zzhh zzhhVar) {
        Iterator itZzf = ((zzed) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzdw zzdwVar = (zzdw) entry.getKey();
            if (zzdwVar.zze() != zzhg.MESSAGE) {
                h.z("Found invalid MessageSet item.");
                return;
            }
            zzdwVar.zzg();
            zzdwVar.zzf();
            if (entry instanceof zzeu) {
                zzhhVar.zzw(zzdwVar.zza(), ((zzeu) entry).zza().zzb());
            } else {
                zzhhVar.zzw(zzdwVar.zza(), entry.getValue());
            }
        }
        ((zzeh) obj).zzc.zzk(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        return ((zzed) obj).zzb.zzk();
    }
}
