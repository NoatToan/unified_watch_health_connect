package defpackage;

import com.xiaomi.smarthome.framework.plugin.rn.core.api.IStandPluginProvider;

/* JADX INFO: loaded from: classes5.dex */
public class hao implements IStandPluginProvider {
    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IStandPluginProvider
    public String getI18N(String str) {
        return mvk.e().b().getI18N(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IStandPluginProvider
    public String getSpecInstance(String str) {
        return mvk.e().b().getSpecInstance(str);
    }
}
