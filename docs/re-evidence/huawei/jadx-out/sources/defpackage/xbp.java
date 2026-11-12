package defpackage;

import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;

/* JADX INFO: loaded from: classes20.dex */
public class xbp extends OauthManager {
    @Override // com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager
    public int getThirdAccountType() {
        return 26;
    }

    private xbp() {
    }

    public static xbp b() {
        return d.f52678a;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager
    public String getConnectTimeKey() {
        return "key_komoot_connect_time";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager
    public String getModuleId() {
        return String.valueOf(PrebakedEffectId.RT_SPRING);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static xbp f52678a = new xbp();
    }
}
