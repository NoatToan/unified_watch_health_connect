package cv;

import androidx.lifecycle.n0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a1;
import com.garmin.android.apps.connectmobile.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcv/b;", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/n0;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/a1;", "", "onDeviceConnectionEvent", "<init>", "(Landroidx/lifecycle/n0;Le23/l;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f55774c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f55775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<a1, Unit> f55776b;

    /* JADX INFO: renamed from: cv.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1207b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f55777a;

        public C1207b(e23.l lVar) {
            lVar.getClass();
            this.f55777a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f55777a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55777a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(n0 n0Var, e23.l<? super a1, Unit> lVar) {
        n0Var.getClass();
        lVar.getClass();
        this.f55775a = n0Var;
        this.f55776b = lVar;
    }

    @Override // androidx.lifecycle.n
    public final void onCreate(n0 n0Var) {
        z.f49770a.getClass();
        z.f49771b.f(this.f55775a, new C1207b(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 11)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcv/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
