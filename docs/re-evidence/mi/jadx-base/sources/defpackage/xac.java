package defpackage;

import com.google.gson.GsonBuilder;
import com.service.mi.entity.CardType;
import com.service.mi.entity.HostRespAndCardTypeInfo;
import com.service.mi.wallet.entity.resp.HostResp;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class xac {
    public static void a(List<CardType> list) {
        qvf.g = list;
    }

    public static void b(List<HostResp> list) {
        String str = qvf.A;
        String str2 = qvf.u;
        for (HostResp hostResp : list) {
            fpe.e("HostUtils", hostResp.toString());
            try {
                Pattern patternCompile = Pattern.compile(hostResp.getCountries());
                Pattern patternCompile2 = Pattern.compile(hostResp.getDeviceModel());
                if (patternCompile.matcher(str).matches() && patternCompile2.matcher(str2).matches()) {
                    qvf.c(hostResp.getHost());
                    qvf.B = hostResp.getPrefix();
                    return;
                }
            } catch (Exception e) {
                fpe.g("parseHostConfig failed ", e.getMessage());
            }
        }
        for (HostResp hostResp2 : list) {
            if (hostResp2.isIsdefault()) {
                qvf.c(hostResp2.getHost());
                qvf.B = hostResp2.getPrefix();
                return;
            }
        }
        throw new IllegalArgumentException("host can not be empty!");
    }

    public static void c(String str) {
        HostRespAndCardTypeInfo hostRespAndCardTypeInfo = (HostRespAndCardTypeInfo) new GsonBuilder().disableHtmlEscaping().create().fromJson(str, HostRespAndCardTypeInfo.class);
        b(hostRespAndCardTypeInfo.getHostInfo());
        a(hostRespAndCardTypeInfo.getCardType());
    }
}
