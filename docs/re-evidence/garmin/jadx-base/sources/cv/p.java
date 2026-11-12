package cv;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcv/p;", "Lcv/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbv/c;", "baseModuleAppDelegate", "<init>", "(Landroid/content/Context;Lbv/c;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv.c f55834b;

    static {
        new a(null);
    }

    public p(Context context, bv.c cVar) {
        context.getClass();
        cVar.getClass();
        this.f55833a = context;
        this.f55834b = cVar;
    }

    @Override // cv.c
    public final void a(a1 a1Var) {
        a1Var.getClass();
        if (a1Var.f28731i) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "VirtualRunConnectedHandler", "Device Connected is Virtual Run -> navigate to Virtual Training Mode");
            this.f55834b.g(this.f55833a, a1Var.f28724b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcv/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
