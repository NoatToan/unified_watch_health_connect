package defpackage;

import android.content.Context;
import com.huawei.health.adapterwear.api.AdapterWearMgrApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.pluginbase.PluginBaseAdapter;

/* JADX INFO: loaded from: classes35.dex */
@ApiDefine(uri = AdapterWearMgrApi.class)
@Singleton
public class lkx implements AdapterWearMgrApi {
    @Override // com.huawei.health.adapterwear.api.AdapterWearMgrApi
    public PluginBaseAdapter getPayAdapterImpl(Context context) {
        return lkw.t();
    }
}
