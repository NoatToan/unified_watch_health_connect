package com.xiaomi.ai.android.track;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.gt3;
import defpackage.klp;
import defpackage.nnp;
import defpackage.wpe;

/* JADX INFO: loaded from: classes6.dex */
public class a extends nnp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.xiaomi.ai.android.core.e f10967b;

    public a(com.xiaomi.ai.android.core.e eVar) {
        super(eVar.e());
        this.f10967b = eVar;
        setEnv("sdk.type", PluginPackageConstant.RN_DIR_A);
        setEnv("sdk.version", "1.45.29");
        setEnv("android.androidsdk.version", Build.VERSION.SDK_INT);
        setEnv("android.app.package", this.f10967b.j().getPackageName());
        if (this.f10967b.e() != null) {
            setEnv("channel.type", this.f10967b.e().getChannelType());
        }
        String strA = a();
        if (strA != null) {
            setEnv("android.app.version", strA);
        }
        String strI = eVar.i().i("track.device");
        setEnv("android.device", TextUtils.isEmpty(strI) ? Build.MODEL : strI);
    }

    private String a() {
        Context contextJ = this.f10967b.j();
        try {
            return contextJ.getPackageManager().getPackageInfo(contextJ.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            wpe.e("AndroidTrackInfo", Log.getStackTraceString(e));
            return null;
        }
    }

    public void b() {
        gt3 gt3VarE = this.f10967b.e();
        if (gt3VarE != null) {
            setEnv("channel.type", gt3VarE.getChannelType());
        }
    }

    @Override // defpackage.nnp
    public klp createTrackData() {
        klp klpVarCreateTrackData = super.createTrackData();
        String networkType = NetworkUtils.getNetworkType(this.f10967b.j());
        klpVarCreateTrackData.h("network", networkType);
        if (NetworkUtils.NETWORK_TYPE_WIFI.equals(networkType)) {
            klpVarCreateTrackData.g("network.wifi.signal.level", NetworkUtils.getWifiLevel(this.f10967b.j()));
        } else {
            klpVarCreateTrackData.h("network.data.carrier.type", NetworkUtils.getCurrentCarrierType(this.f10967b.j()));
        }
        return klpVarCreateTrackData;
    }
}
