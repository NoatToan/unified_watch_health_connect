package defpackage;

import android.text.TextUtils;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import com.huawei.wearengine.scope.cache.ScopeCache;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class ykq implements ScopeCache {
    private Map<String, ScopeInfoResponse> d = new ConcurrentHashMap();

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void saveScope(String str, ScopeInfoResponse scopeInfoResponse) {
        if (scopeInfoResponse == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, scopeInfoResponse);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void deleteScope(String str) {
        if (this.d.containsKey(str)) {
            this.d.remove(str);
        }
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public void updateScope(String str, ScopeInfoResponse scopeInfoResponse) {
        if (scopeInfoResponse == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, scopeInfoResponse);
    }

    @Override // com.huawei.wearengine.scope.cache.ScopeCache
    public ScopeInfoResponse getScope(String str) {
        if (this.d.containsKey(str)) {
            return this.d.get(str);
        }
        return null;
    }
}
