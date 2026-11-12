package defpackage;

import com.huawei.health.loginaccount.PluginThirdAuthorizeApi;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class fwr implements PluginThirdAuthorizeApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PluginThirdAuthorizeApi f34650a;

    static class c {
        public static final fwr e = new fwr();
    }

    private fwr() {
        try {
            this.f34650a = (PluginThirdAuthorizeApi) Class.forName("qgl").newInstance();
            LogUtil.a("PluginAccountLogin_PluginThirdAuthorizeApi", "init PluginThirdAuthorizeProxy ok");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            LogUtil.e("PluginAccountLogin_PluginThirdAuthorizeApi", "ClassNotFoundException");
        }
    }

    public static fwr d() {
        return c.e;
    }

    @Override // com.huawei.health.loginaccount.PluginThirdAuthorizeApi
    public void initThirdAuthorizeMgr() {
        PluginThirdAuthorizeApi pluginThirdAuthorizeApi = this.f34650a;
        if (pluginThirdAuthorizeApi != null) {
            pluginThirdAuthorizeApi.initThirdAuthorizeMgr();
        } else {
            LogUtil.j("PluginAccountLogin_PluginThirdAuthorizeApi", "initThirdAuthorizeMgr mPluginThirdAuthorizeApi is null");
        }
    }
}
