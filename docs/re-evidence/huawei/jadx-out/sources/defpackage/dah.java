package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.framework.servicemgr.HmfProviderService;
import com.huawei.framework.servicemgr.Lazy;
import com.huawei.framework.servicemgr.ServiceManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.NaviConsumer;
import com.huawei.hmf.repository.ComponentRepository;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.Module;
import health.compact.a.LogUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class dah implements ServiceManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Repository f31573c;

    private dah() {
        this.f31573c = ComponentRepository.getRepository();
    }

    @Override // com.huawei.framework.servicemgr.ServiceManager
    public <T> Lazy<T> get(String str, Class<T> cls, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Missing required argument: provider is empty");
        }
        Module moduleLookup = this.f31573c.lookup(str);
        if (moduleLookup == null) {
            LogUtil.e("ServiceManagerImpl", "The provider module is NOT loaded: ", str);
            return new a(this.f31573c, str, cls, str2);
        }
        return new e(czy.b(moduleLookup, cls, str2));
    }

    public static final class c {
        public static final ServiceManager e = new dah();

        c() {
        }
    }

    static class e<T> implements Lazy<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f31578a;

        @Override // com.huawei.framework.servicemgr.Lazy
        public boolean isPresent() {
            return true;
        }

        private e(T t) {
            this.f31578a = t;
        }

        @Override // com.huawei.framework.servicemgr.Lazy
        public T get() throws IllegalStateException {
            return this.f31578a;
        }

        @Override // com.huawei.framework.servicemgr.Lazy
        public void load(Context context, Consumer<T> consumer, boolean z) throws IllegalStateException {
            if (consumer != null) {
                consumer.accept(get());
            }
        }
    }

    static class a<T> implements Lazy<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f31574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Module f31576c;
        private final String d;
        private final Repository e;

        private a(Repository repository, String str, Class<T> cls, String str2) {
            this.e = repository;
            this.d = str;
            this.f31574a = cls;
            this.f31575b = str2;
        }

        @Override // com.huawei.framework.servicemgr.Lazy
        public boolean isPresent() {
            if (this.f31576c == null) {
                Context contextB = BaseApplication.b();
                AppRouter.e(contextB, this.d);
                this.f31576c = this.e.lookup(this.d);
                if (this.f31576c == null) {
                    HmfProviderService.a(contextB.getClassLoader(), this.d);
                    this.f31576c = this.e.lookup(this.d);
                }
            }
            return this.f31576c != null;
        }

        @Override // com.huawei.framework.servicemgr.Lazy
        public T get() throws IllegalStateException {
            if (!isPresent()) {
                LogUtil.e("ServiceManagerImpl", "The provider module=", this.d, " NOT loaded, please call the load() first");
                throw new IllegalStateException("Provider unavailable: " + this.d);
            }
            return (T) czy.b(this.f31576c, this.f31574a, this.f31575b);
        }

        @Override // com.huawei.framework.servicemgr.Lazy
        public void load(Context context, final Consumer<T> consumer, boolean z) throws IllegalStateException {
            if (isPresent()) {
                LogUtil.c("ServiceManagerImpl", "The provider module has been loaded, instantiate it as needed.");
                if (consumer != null) {
                    consumer.accept(get());
                    return;
                }
                return;
            }
            String str = this.d;
            if (!TextUtils.isEmpty(this.f31575b)) {
                str = this.d + "/" + this.f31575b;
            }
            LogUtil.b("ServiceManagerImpl", "Trying to download the AppBundle with name=", str);
            AppRouter.e(str, this.f31574a, context, consumer != null ? new NaviConsumer<T>() { // from class: dah.a.5
                @Override // com.huawei.haf.router.NaviConsumer
                public void accept(T t) {
                    consumer.accept(t);
                }
            } : null, !z);
        }
    }
}
