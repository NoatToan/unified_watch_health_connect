package defpackage;

import android.text.TextUtils;
import com.huawei.wearengine.repository.ScopeResponseRepositoryImpl;
import com.huawei.wearengine.repository.api.ScopeResponseRepository;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import com.huawei.wearengine.scope.cache.ScopeCache;

/* JADX INFO: loaded from: classes20.dex */
public class yks implements ScopeCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScopeResponseRepository f53596a = new ScopeResponseRepositoryImpl(yiv.a());

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void saveScope(String str, ScopeInfoResponse scopeInfoResponse) {
        if (TextUtils.isEmpty(str) || scopeInfoResponse == null) {
            return;
        }
        this.f53596a.insertScopeResponse(scopeInfoResponse, str);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void deleteScope(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f53596a.deleteScopeResponse(str);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void updateScope(String str, ScopeInfoResponse scopeInfoResponse) {
        if (TextUtils.isEmpty(str) || scopeInfoResponse == null) {
            return;
        }
        this.f53596a.updateScopeResponse(scopeInfoResponse, str);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public ScopeInfoResponse getScope(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f53596a.getScopeResponse(str);
    }
}
