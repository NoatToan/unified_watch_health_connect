package cv;

import android.content.Context;
import androidx.lifecycle.n0;
import androidx.lifecycle.z0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q92.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcv/a;", "Landroidx/lifecycle/n;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/lifecycle/n0;", "lifecycleOwner", "Lbv/c;", "baseModuleAppDelegate", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/n0;Lbv/c;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f55769d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f55771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv.c f55772c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f55773a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f55773a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f55773a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55773a.invoke(obj);
        }
    }

    static {
        new C1206a(null);
    }

    public a(Context context, n0 n0Var, bv.c cVar) {
        context.getClass();
        n0Var.getClass();
        cVar.getClass();
        this.f55770a = context;
        this.f55771b = n0Var;
        this.f55772c = cVar;
    }

    @Override // androidx.lifecycle.n
    public final void onCreate(n0 n0Var) {
        p92.o oVar = p92.o.f136619a;
        x xVar = x.DI_CONNECT_UPLOAD;
        oVar.getClass();
        xVar.getClass();
        p92.o.m().g(xVar).f(this.f55771b, new b(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 10)));
    }

    /* JADX INFO: renamed from: cv.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcv/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1206a {
        public /* synthetic */ C1206a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1206a() {
        }
    }
}
