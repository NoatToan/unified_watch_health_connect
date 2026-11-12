package com.xiaomi.ai.android.track;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.track.TrackData;

/* JADX INFO: loaded from: classes18.dex */
public class a extends com.xiaomi.ai.track.a {
    private com.xiaomi.ai.android.core.d a;

    public a(com.xiaomi.ai.android.core.d dVar) {
        super(dVar.g());
        this.a = dVar;
        a("sdk.type", "android");
        a("sdk.version", "1.16.4");
        a("android.androidsdk.version", Build.VERSION.SDK_INT);
        a("android.app.package", this.a.a().getPackageName());
        a("channel.type", this.a.g().getChannelType());
        String strF = f();
        if (strF != null) {
            a("android.app.version", strF);
        }
        String string = dVar.b().getString(AivsConfig.Track.DEVICE);
        a("android.device", TextUtils.isEmpty(string) ? Build.MODEL : string);
    }

    private String f() {
        Context contextA = this.a.a();
        try {
            return contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.d("AndroidTrackInfo", Log.getStackTraceString(e));
            return null;
        }
    }

    @Override // com.xiaomi.ai.track.a
    public TrackData a() {
        TrackData trackDataA = super.a();
        String strC = NetworkUtils.c(this.a.a());
        trackDataA.set("network", strC);
        if ("WIFI".equals(strC)) {
            trackDataA.set("network.wifi.signal.level", NetworkUtils.e(this.a.a()));
        } else {
            int iD = NetworkUtils.d(this.a.a());
            if (iD != Integer.MAX_VALUE) {
                trackDataA.set("network.dbm", iD);
            }
            trackDataA.set("network.data.carrier.type", NetworkUtils.f(this.a.a()));
        }
        return trackDataA;
    }

    public void b() {
        a("channel.type", this.a.g().getChannelType());
    }
}
