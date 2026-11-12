package cv;

import android.content.Context;
import androidx.lifecycle.n0;
import ch.qos.logback.core.CoreConstants;
import ok2.a0;
import p005kotlin.Metadata;
import yr1.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcv/m;", "Landroidx/lifecycle/n;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f55821d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.e f55823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f55824c;

    static {
        new a(null);
    }

    public m(Context context) {
        context.getClass();
        this.f55822a = context;
        this.f55824c = new t(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 14));
    }

    @Override // androidx.lifecycle.n
    public final void onStart(n0 n0Var) {
        a0.f132585h.a().b(this.f55824c);
    }

    @Override // androidx.lifecycle.n
    public final void onStop(n0 n0Var) {
        a0.f132585h.a().j(this.f55824c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcv/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
