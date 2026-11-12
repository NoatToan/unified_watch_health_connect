package defpackage;

import com.huawei.featureuserprofile.target.cloud.ActiveTargetManager;
import com.huawei.hmf.services.ModuleProvider;

/* JADX INFO: loaded from: classes23.dex */
public class cwg extends ModuleProvider {
    @Override // com.huawei.hmf.services.ModuleProvider
    public void initialize() {
        super.initialize();
        ActiveTargetManager.c().a();
    }
}
