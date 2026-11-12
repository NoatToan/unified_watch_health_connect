package com.google.android.gms.internal.measurement;

import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzv extends zzai {
    private final zzz zza;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        zzh.zza(this.zzd, 3, list);
        String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
        zzao zzaoVarZza = zzgVar.zza((zzao) list.get(1));
        if (!(zzaoVarZza instanceof zzan)) {
            h.s("Invalid callback type");
            return null;
        }
        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(2));
        if (!(zzaoVarZza2 instanceof zzal)) {
            h.s("Invalid callback params");
            return null;
        }
        zzal zzalVar = (zzal) zzaoVarZza2;
        if (!zzalVar.zzj(NotificationConstants.KEY_DATA_MIME_TYPE)) {
            h.s("Undefined rule type");
            return null;
        }
        this.zza.zza(strZzc, zzalVar.zzj("priority") ? zzh.zzg(zzalVar.zzk("priority").zzd().doubleValue()) : 1000, (zzan) zzaoVarZza, zzalVar.zzk(NotificationConstants.KEY_DATA_MIME_TYPE).zzc());
        return zzao.zzf;
    }
}
