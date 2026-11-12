package gk1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgk1/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.googlehealthconnect.a f77742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a<Set<String>, Set<String>> f77743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f77744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f77745d;

    public e() {
        com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar = (com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null);
        this.f77742a = aVar;
        this.f77743b = aVar.h();
        Boolean bool = Boolean.FALSE;
        this.f77744c = p0.n(bool);
        this.f77745d = p0.n(bool);
        ge1.b.T(v1.a(this), null, null, new d(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x4() {
        return ((Boolean) this.f77744c.getF182175a()).booleanValue();
    }
}
