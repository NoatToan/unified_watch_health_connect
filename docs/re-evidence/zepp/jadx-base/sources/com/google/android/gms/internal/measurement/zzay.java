package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzay extends zzaw {
    public zzay() {
        this.a.add(zzbl.EQUALS);
        this.a.add(zzbl.GREATER_THAN);
        this.a.add(zzbl.GREATER_THAN_EQUALS);
        this.a.add(zzbl.IDENTITY_EQUALS);
        this.a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.a.add(zzbl.LESS_THAN);
        this.a.add(zzbl.LESS_THAN_EQUALS);
        this.a.add(zzbl.NOT_EQUALS);
    }

    private static boolean b(zzap zzapVar, zzap zzapVar2) {
        if (zzapVar.getClass().equals(zzapVar2.getClass())) {
            if ((zzapVar instanceof zzau) || (zzapVar instanceof zzan)) {
                return true;
            }
            if (zzapVar instanceof zzah) {
                return (Double.isNaN(zzapVar.zzh().doubleValue()) || Double.isNaN(zzapVar2.zzh().doubleValue()) || zzapVar.zzh().doubleValue() != zzapVar2.zzh().doubleValue()) ? false : true;
            }
            if (zzapVar instanceof zzat) {
                return zzapVar.zzi().equals(zzapVar2.zzi());
            }
            if (zzapVar instanceof zzaf) {
                return zzapVar.zzg().equals(zzapVar2.zzg());
            }
            return zzapVar == zzapVar2;
        }
        if (((zzapVar instanceof zzau) || (zzapVar instanceof zzan)) && ((zzapVar2 instanceof zzau) || (zzapVar2 instanceof zzan))) {
            return true;
        }
        boolean z = zzapVar instanceof zzah;
        if (z && (zzapVar2 instanceof zzat)) {
            return b(zzapVar, new zzah(zzapVar2.zzh()));
        }
        boolean z2 = zzapVar instanceof zzat;
        if (z2 && (zzapVar2 instanceof zzah)) {
            return b(new zzah(zzapVar.zzh()), zzapVar2);
        }
        if (zzapVar instanceof zzaf) {
            return b(new zzah(zzapVar.zzh()), zzapVar2);
        }
        if (zzapVar2 instanceof zzaf) {
            return b(zzapVar, new zzah(zzapVar2.zzh()));
        }
        if ((z2 || z) && (zzapVar2 instanceof zzal)) {
            return b(zzapVar, new zzat(zzapVar2.zzi()));
        }
        if ((zzapVar instanceof zzal) && ((zzapVar2 instanceof zzat) || (zzapVar2 instanceof zzah))) {
            return b(new zzat(zzapVar.zzi()), zzapVar2);
        }
        return false;
    }

    private static boolean c(zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof zzal) {
            zzapVar = new zzat(zzapVar.zzi());
        }
        if (zzapVar2 instanceof zzal) {
            zzapVar2 = new zzat(zzapVar2.zzi());
        }
        if ((zzapVar instanceof zzat) && (zzapVar2 instanceof zzat)) {
            return zzapVar.zzi().compareTo(zzapVar2.zzi()) < 0;
        }
        double dDoubleValue = zzapVar.zzh().doubleValue();
        double dDoubleValue2 = zzapVar2.zzh().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean d(zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof zzal) {
            zzapVar = new zzat(zzapVar.zzi());
        }
        if (zzapVar2 instanceof zzal) {
            zzapVar2 = new zzat(zzapVar2.zzi());
        }
        return (((zzapVar instanceof zzat) && (zzapVar2 instanceof zzat)) || !(Double.isNaN(zzapVar.zzh().doubleValue()) || Double.isNaN(zzapVar2.zzh().doubleValue()))) && !c(zzapVar2, zzapVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        boolean zB;
        boolean zB2;
        zzh.zzh(zzh.zze(str).name(), 2, list);
        zzap zzapVarZzb = zzgVar.zzb(list.get(0));
        zzap zzapVarZzb2 = zzgVar.zzb(list.get(1));
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zB2 = b(zzapVarZzb, zzapVarZzb2);
            } else if (iOrdinal == 42) {
                zB = c(zzapVarZzb, zzapVarZzb2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zB = c(zzapVarZzb2, zzapVarZzb);
                        break;
                    case 38:
                        zB = d(zzapVarZzb2, zzapVarZzb);
                        break;
                    case 39:
                        zB = zzh.zzl(zzapVarZzb, zzapVarZzb2);
                        break;
                    case 40:
                        zB2 = zzh.zzl(zzapVarZzb, zzapVarZzb2);
                        break;
                    default:
                        return super.a(str);
                }
            } else {
                zB = d(zzapVarZzb, zzapVarZzb2);
            }
            zB = !zB2;
        } else {
            zB = b(zzapVarZzb, zzapVarZzb2);
        }
        return zB ? zzap.zzk : zzap.zzl;
    }
}
