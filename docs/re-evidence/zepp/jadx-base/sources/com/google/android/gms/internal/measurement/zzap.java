package com.google.android.gms.internal.measurement;

import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import java.util.Iterator;
import java.util.List;
import org.cybergarage.upnp.control.Control;

/* JADX INFO: loaded from: classes3.dex */
public interface zzap {
    public static final zzap zzf = new zzau();
    public static final zzap zzg = new zzan();
    public static final zzap zzh = new zzag(HMFwOnlineAnalyticsKt.TYPE_CONTINUE);
    public static final zzap zzi = new zzag("break");
    public static final zzap zzj = new zzag(Control.RETURN);
    public static final zzap zzk = new zzaf(Boolean.TRUE);
    public static final zzap zzl = new zzaf(Boolean.FALSE);
    public static final zzap zzm = new zzat("");

    zzap zzbK(String str, zzg zzgVar, List<zzap> list);

    zzap zzd();

    Boolean zzg();

    Double zzh();

    String zzi();

    Iterator<zzap> zzl();
}
