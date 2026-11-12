package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.views.VideoView;

/* JADX INFO: loaded from: classes12.dex */
public class he implements hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18867c;
    private boolean d;
    private VideoView e;
    private VideoInfo f;
    private ha g;
    private int h = 0;
    private Context i;
    private String j;

    @Override // com.huawei.openalliance.ad.hf
    public void b() {
        this.h = 0;
    }

    @Override // com.huawei.openalliance.ad.hf
    public int a(boolean z, boolean z2) {
        hw.b("LinkedAlertAndPlayStrategy", "switchToNetworkConnected, isWifi: %s, needDataAlert: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (this.e == null) {
            return -1;
        }
        return z ? d() : a(z2);
    }

    @Override // com.huawei.openalliance.ad.hf
    public int a(int i, boolean z) {
        this.h = i;
        hw.a("LinkedAlertAndPlayStrategy", "startPlayVideo， mManualOrAuto %d", Integer.valueOf(i));
        if (!TextUtils.isEmpty(this.j) && !com.huawei.openalliance.ad.utils.dg.l(this.j)) {
            return i + 100;
        }
        if (!com.huawei.openalliance.ad.utils.cb.e(this.i)) {
            return 1;
        }
        if (c() && !pa.G(this.g.h())) {
            int autoPlayNetwork = this.g.n().getAutoPlayNetwork();
            hw.b("LinkedAlertAndPlayStrategy", "use videoConfig, autoPlay netWork is : %s, needDataAlert: %s", Integer.valueOf(autoPlayNetwork), Boolean.valueOf(z));
            if ((autoPlayNetwork == 2 || autoPlayNetwork == 0) && !com.huawei.openalliance.ad.utils.cb.c(this.i) && z) {
                return i + 200;
            }
            if (autoPlayNetwork == 2) {
                return i + 100;
            }
            if (autoPlayNetwork == 1 || autoPlayNetwork == 0) {
                return i + 100;
            }
        }
        if (com.huawei.openalliance.ad.utils.cb.c(this.i) || this.f18867c == 1) {
            return i + 100;
        }
        return !z ? i + 100 : this.h + 200;
    }

    @Override // com.huawei.openalliance.ad.hf
    public int a() {
        hw.a("LinkedAlertAndPlayStrategy", "switchToNoNetwork");
        if (this.e == null) {
            return -1;
        }
        if (TextUtils.isEmpty(this.j) || com.huawei.openalliance.ad.utils.dg.l(this.j)) {
            return 1;
        }
        return this.h == 0 ? 102 : 0;
    }

    private int d() {
        hw.a("LinkedAlertAndPlayStrategy", "switchWifi, mManualOrAuto is %d", Integer.valueOf(this.h));
        if (this.h == 0) {
            this.h = 2;
        }
        return this.h + 100;
    }

    private boolean c() {
        ha haVar = this.g;
        return (haVar == null || haVar.n() == null) ? false : true;
    }

    private boolean a(ha haVar) {
        return haVar.n() == null || haVar.n().getAutoPlayNetwork() == -1;
    }

    private int a(boolean z) {
        hw.b("LinkedAlertAndPlayStrategy", "switchData, needDataAlert is %s， autoPlayNet is %s", Boolean.valueOf(z), Integer.valueOf(this.f18867c));
        if (!z || this.f18867c == 1) {
            return this.h + 100;
        }
        if (!TextUtils.isEmpty(this.j) && !com.huawei.openalliance.ad.utils.dg.l(this.j)) {
            return this.h + 100;
        }
        if (this.h == 0) {
            this.h = 1;
        }
        return this.h + 200;
    }

    private int a(ha haVar, VideoInfo videoInfo) {
        if (haVar == null) {
            return 0;
        }
        return (a(haVar) || (pa.G(haVar.h()) && videoInfo != null)) ? videoInfo.getAutoPlayNetwork() : haVar.n().getAutoPlayNetwork();
    }

    public he(Context context, VideoView videoView, VideoInfo videoInfo, ha haVar) {
        this.i = context;
        this.e = videoView;
        this.f = videoInfo;
        this.f18867c = a(haVar, videoInfo);
        this.f18865a = this.f.getDownloadNetwork();
        this.f18866b = this.f.getVideoPlayMode();
        this.d = this.f.f();
        this.g = haVar;
        String strA = com.huawei.openalliance.ad.utils.as.a(this.i, videoInfo);
        this.j = strA;
        hw.b("LinkedAlertAndPlayStrategy", "mediaPath %s", com.huawei.openalliance.ad.utils.dg.h(strA));
        hw.a("LinkedAlertAndPlayStrategy", "isDirectReturn %s", Boolean.valueOf(this.d));
    }
}
