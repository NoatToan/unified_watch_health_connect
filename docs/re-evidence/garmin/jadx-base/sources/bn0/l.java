package bn0;

import androidx.lifecycle.u1;
import c22.a0;
import com.garmin.android.apps.connectmobile.a2;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbn0/l;", "Landroidx/lifecycle/u1;", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lc22/a0;)V", "a", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f19008d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f19009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f19010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f19011c;

    static {
        new a(null);
        f19008d = l.class.getSimpleName();
    }

    public l(a0 a0Var) {
        a0Var.getClass();
        this.f19009a = a0Var;
        this.f19010b = gt2.c.b(a2.GROUPRIDE.f28756a);
        this.f19011c = (d) KoinJavaComponent.get$default(d.class, null, null, 6, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbn0/l$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ l(a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }
}
