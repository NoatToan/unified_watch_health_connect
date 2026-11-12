package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.networkclient.cache.ICacheStrategy;
import com.huawei.networkclient.repository.DataConverterRepository;
import health.compact.a.ReleaseLogUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class foj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataConverterRepository f34316a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ofj f34317c;

    public static boolean b(int i) {
        return i == 1;
    }

    private foj() {
        DataConverterRepository dataConverterRepository = new DataConverterRepository();
        this.f34316a = dataConverterRepository;
        dataConverterRepository.d(String.class, new ofn());
        this.f34317c = new ofj("knit_data_cache", dataConverterRepository);
    }

    public static foj b() {
        return e.e;
    }

    public boolean b(String str, String str2) {
        return a(str, new b(), str2);
    }

    public boolean a(String str, ICacheStrategy iCacheStrategy, String str2) {
        boolean zA;
        if (str == null || str2 == null) {
            zA = false;
        } else {
            try {
                zA = this.f34317c.a(str, iCacheStrategy, this.f34316a.d(String.class).revert(str2));
            } catch (Exception e2) {
                ReleaseLogUtil.d("R_KnitDataCacheMgr", "saveDiskCache failed with exception:", str, ExceptionUtils.c(e2));
                zA = false;
            }
        }
        if (zA) {
            ReleaseLogUtil.c("R_KnitDataCacheMgr", "saveDiskCache success. key=", str);
        } else {
            ReleaseLogUtil.d("R_KnitDataCacheMgr", "saveDiskCache failed. key=", str);
        }
        return zA;
    }

    public String a(String str) {
        return c(str, new b());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public String c(String str, ICacheStrategy iCacheStrategy) {
        String str2;
        boolean z;
        if (str == null || iCacheStrategy == null) {
            ReleaseLogUtil.d("R_KnitDataCacheMgr", "getDiskCache failed key: ", str, " cacheStrategy:", iCacheStrategy);
        } else {
            try {
                str2 = (String) this.f34317c.d(str, String.class, iCacheStrategy);
            } catch (Exception e2) {
                ReleaseLogUtil.d("R_KnitDataCacheMgr", "getDiskCache failed with exception:", str, ExceptionUtils.c(e2));
                str2 = null;
            }
            if (str2 != null || str2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            ReleaseLogUtil.d("R_KnitDataCacheMgr", "getDiskCache key: ", str, " result:", Boolean.valueOf(z));
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        str2 = null;
        if (str2 != null) {
            z = false;
        } else {
            z = false;
        }
        ReleaseLogUtil.d("R_KnitDataCacheMgr", "getDiskCache key: ", str, " result:", Boolean.valueOf(z));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String c(List<Integer> list) {
        if (!CollectionUtils.a(list)) {
            return lsp.b(BaseApplication.b(), qqt.b(list));
        }
        return lsp.b(BaseApplication.b(), "emptyKey");
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return lsp.b(BaseApplication.b(), str);
        }
        return lsp.b(BaseApplication.b(), "emptyKey");
    }

    public void c() {
        ReleaseLogUtil.c("R_KnitDataCacheMgr", "clearCache.");
        this.f34317c.b();
        this.f34317c = new ofj("knit_data_cache", this.f34316a);
    }

    static class b implements ICacheStrategy {
        @Override // com.huawei.networkclient.cache.ICacheStrategy
        public int getCacheStrategy() {
            return 7;
        }

        @Override // com.huawei.networkclient.cache.ICacheStrategy
        public String getKey() {
            return null;
        }

        @Override // com.huawei.networkclient.cache.ICacheStrategy
        public boolean needEncrypt() {
            return false;
        }

        private b() {
        }

        @Override // com.huawei.networkclient.cache.ICacheStrategy
        public Long getDiskTimeOut() {
            return 30L;
        }

        @Override // com.huawei.networkclient.cache.ICacheStrategy
        public TimeUnit getDiskTimeUnit() {
            return TimeUnit.DAYS;
        }
    }

    static class e {
        private static final foj e = new foj();
    }
}
