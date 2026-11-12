package defpackage;

import com.huawei.networkclient.cache.ICacheStrategy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes29.dex */
public class gkx implements ICacheStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35446a;

    @Override // com.huawei.networkclient.cache.ICacheStrategy
    public int getCacheStrategy() {
        return 7;
    }

    @Override // com.huawei.networkclient.cache.ICacheStrategy
    public boolean needEncrypt() {
        return false;
    }

    @Override // com.huawei.networkclient.cache.ICacheStrategy
    public Long getDiskTimeOut() {
        return 2L;
    }

    @Override // com.huawei.networkclient.cache.ICacheStrategy
    public TimeUnit getDiskTimeUnit() {
        return TimeUnit.HOURS;
    }

    @Override // com.huawei.networkclient.cache.ICacheStrategy
    public String getKey() {
        return this.f35446a;
    }

    public gkx e(String str) {
        this.f35446a = str;
        return this;
    }
}
