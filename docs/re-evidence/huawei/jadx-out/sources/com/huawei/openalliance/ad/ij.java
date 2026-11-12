package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii f18958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ik f18959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f18960c;

    public String a(VideoInfo videoInfo) {
        String strA = this.f18958a.a(videoInfo.g());
        return !com.huawei.openalliance.ad.utils.dg.b(strA) ? strA : b(videoInfo);
    }

    private String c(VideoInfo videoInfo) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(videoInfo.g(), "UTF-8");
        boolean zIsCheckSha256 = videoInfo.isCheckSha256();
        String string = this.f18960c.getString(R.string.player_local_host);
        Locale locale = Locale.ENGLISH;
        int iA = this.f18959b.a();
        return String.format(locale, "http://%s:%s/%s?nonsense=%s&sha256=%s&checkFlag=%s", string, Integer.valueOf(iA), strEncode, URLEncoder.encode(com.huawei.openalliance.ad.utils.cp.a(8), "UTF-8"), URLEncoder.encode(videoInfo.getSha256(), "UTF-8"), URLEncoder.encode(com.huawei.openalliance.ad.utils.dg.a(Integer.valueOf(!zIsCheckSha256 ? 1 : 0)), "UTF-8"));
    }

    private String b(VideoInfo videoInfo) {
        ik ikVar = this.f18959b;
        if (ikVar == null || !ikVar.b()) {
            return videoInfo.g();
        }
        try {
            return c(videoInfo);
        } catch (Throwable unused) {
            hw.d("CreativeHttpProxy", "Url encode failed,use origin url");
            return videoInfo.g();
        }
    }

    public ij(Context context, ii iiVar, ik ikVar) {
        this.f18958a = iiVar;
        this.f18959b = ikVar;
        this.f18960c = context;
    }
}
