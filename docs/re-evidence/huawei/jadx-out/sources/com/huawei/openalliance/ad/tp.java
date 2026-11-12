package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.listeners.LandingPageAction;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class tp extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private final boolean e;
    private hg f;
    private boolean g;

    protected boolean a(AdLandingPageData adLandingPageData) {
        Throwable th;
        boolean zOpenLandingPage;
        LandingPageAction landingPageActionB = HiAd.a(this.f20323a).b();
        if (landingPageActionB == null || pa.d(this.f20324b.X())) {
            if (!pa.b(this.f20324b.X()) && !com.huawei.openalliance.ad.utils.cb.e(this.f20323a)) {
                a("network error", "com.huawei.openalliance.ad.activity.PPSActivity");
                return b();
            }
            c(ClickDestination.WEB);
            String strA = ca.a(this.f20323a, adLandingPageData, this.f, this.f20324b, this.g);
            if (!"success".equals(strA)) {
                a(strA, "com.huawei.openalliance.ad.activity.PPSActivity");
            }
            return true;
        }
        try {
            zOpenLandingPage = landingPageActionB.openLandingPage(this.f20323a, adLandingPageData);
            try {
                c(ClickDestination.WEB);
            } catch (Throwable th2) {
                th = th2;
                hw.c("InnerWebAction", "openLandingPage Exception");
                hw.a(5, th);
                a("api openLandingPage exception: " + th.getClass().getSimpleName(), null);
                new com.huawei.openalliance.ad.analysis.c(this.f20323a).a(th);
            }
        } catch (Throwable th3) {
            th = th3;
            zOpenLandingPage = false;
        }
        if (!zOpenLandingPage) {
            a("api openLandingPage failed", null);
        }
        return zOpenLandingPage || b();
    }

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        String str;
        if (this.f20324b == null) {
            str = "contentRecord is null";
        } else {
            hw.b("InnerWebAction", "handle inner web action");
            AdLandingPageData adLandingPageData = new AdLandingPageData(this.f20324b, this.f20323a, this.e);
            if (!TextUtils.isEmpty(adLandingPageData.getLandingUrl())) {
                return a(adLandingPageData);
            }
            str = "clickUrl is empty";
        }
        a(str, null);
        return b();
    }

    public void a(String str, String str2) {
        try {
            new com.huawei.openalliance.ad.analysis.c(this.f20323a).a("2100089", this.f20324b, str, this.f20323a.getPackageName(), str2);
        } catch (Exception e) {
            hw.c("InnerWebAction", "reportActionFail, ex: %s", e.getClass().getSimpleName());
        }
    }

    private void d() {
        String str;
        String str2;
        if (this.f == null || this.f20324b == null) {
            return;
        }
        hw.b("InnerWebAction", "config : %s", this.f20324b.aJ());
        Map<String, String> mapAK = this.f20324b.aK();
        if (mapAK != null) {
            str = mapAK.get(Constants.VIDEO_AUTO_PLAY);
            str2 = mapAK.get(Constants.VIDEO_PLAY_SOUND);
        } else {
            str = null;
            str2 = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "y";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "n";
        }
        this.f.e(str);
        this.f.f(str2);
    }

    private void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.g = MapKeyNames.FROM_LIFECYCLE_LISTENER.equals(map.get(MapKeyNames.FROM_LIFECYCLE_LISTENER));
        this.f.a(this.f20324b.T());
        this.f.a(this.f20324b.S());
        this.f.a(this.f20324b.ag());
        String orDefault = map.getOrDefault(MapKeyNames.LINKED_CUSTOM_SHOW_ID, String.valueOf(0));
        String orDefault2 = map.getOrDefault(MapKeyNames.LINKED_CUSTOM_RETURN_VIDEO_DIRECT, "false");
        String orDefault3 = map.getOrDefault(MapKeyNames.LINKED_CUSTOM_VIDEO_PROGRESS, null);
        String orDefault4 = map.getOrDefault(MapKeyNames.LINKED_CUSTOM_VIDEO_SOUND_SWITCH, "n");
        String orDefault5 = map.getOrDefault(MapKeyNames.LINKED_SPLASH_MEDIA_PATH, null);
        String orDefault6 = map.getOrDefault(MapKeyNames.USE_TEMPLATE, "false");
        this.f.c(orDefault);
        Integer numJ = com.huawei.openalliance.ad.utils.dg.j(orDefault3);
        if (numJ != null) {
            this.f.a(numJ.intValue());
            hw.b("InnerWebAction", "set progress from native view " + numJ);
        } else {
            this.f.a(0);
        }
        if (!TextUtils.isEmpty(orDefault6)) {
            this.f.d(orDefault6);
        }
        this.f.a(orDefault4);
        this.f.a("true".equals(orDefault2));
        this.f.b(orDefault5);
        d();
        String strValueOf = map.containsKey(MapKeyNames.AUTO_PLAY_VIDEO_NETWORK) ? map.get(MapKeyNames.AUTO_PLAY_VIDEO_NETWORK) : null;
        String str = map.containsKey(MapKeyNames.PLAY_VIDEO_IS_MUTE) ? map.get(MapKeyNames.PLAY_VIDEO_IS_MUTE) : null;
        if (strValueOf == null && str == null) {
            return;
        }
        if (com.huawei.openalliance.ad.utils.dg.b(strValueOf)) {
            strValueOf = String.valueOf(0);
        }
        this.f.a(new VideoConfiguration.Builder().setAutoPlayNetwork(com.huawei.openalliance.ad.utils.dg.a(strValueOf, 0)).setMute(Boolean.parseBoolean(com.huawei.openalliance.ad.utils.dg.b(str) ? "true" : str)).build());
    }

    public tp(Context context, ContentRecord contentRecord, boolean z, Map<String, String> map) {
        super(context, contentRecord);
        this.f = new hg();
        this.g = false;
        this.e = z;
        a(map);
    }
}
