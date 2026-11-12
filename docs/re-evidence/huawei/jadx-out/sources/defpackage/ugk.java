package defpackage;

import com.huawei.networkclient.cache.ICacheStrategy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ugk implements ICacheStrategy {
    private String e;

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
        return this.e;
    }

    public ugk e(String str) {
        this.e = str;
        return this;
    }
}
