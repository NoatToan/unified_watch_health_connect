package defpackage;

import android.text.TextUtils;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import com.huawei.wearengine.scope.cache.ScopeCache;

/* JADX INFO: loaded from: classes20.dex */
public class yku implements ScopeCache {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScopeCache f53600b = new yks();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScopeCache f53601c = new ykq();

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void saveScope(String str, ScopeInfoResponse scopeInfoResponse) {
        yit.a("ScopeCacheManager", "saveScope, scopeKey=" + str);
        if (TextUtils.isEmpty(str) || scopeInfoResponse == null) {
            return;
        }
        this.f53601c.saveScope(str, scopeInfoResponse);
        this.f53600b.saveScope(str, scopeInfoResponse);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void deleteScope(String str) {
        yit.a("ScopeCacheManager", "deleteScope, scopeKey=" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f53601c.deleteScope(str);
        this.f53600b.deleteScope(str);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void updateScope(String str, ScopeInfoResponse scopeInfoResponse) {
        yit.a("ScopeCacheManager", "updateScope, scopeKey=" + str);
        if (TextUtils.isEmpty(str) || scopeInfoResponse == null) {
            return;
        }
        this.f53601c.updateScope(str, scopeInfoResponse);
        this.f53600b.updateScope(str, scopeInfoResponse);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public ScopeInfoResponse getScope(String str) {
        yit.a("ScopeCacheManager", "getScope, scopeKey=" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        yit.a("ScopeCacheManager", "getScope from memory, scopeKey=" + str);
        ScopeInfoResponse scope = this.f53601c.getScope(str);
        if (scope != null) {
            return scope;
        }
        yit.a("ScopeCacheManager", "getScope from db, scopeKey=" + str);
        return this.f53600b.getScope(str);
    }
}
