package fe2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenTerminator", f = "DeviceDrivenTerminator.kt", l = {57, 60}, m = "handleSessionsTerminated", v = 2)
public final class b1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xd2.g1 f70659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f70660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f70661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f70662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(z0 z0Var, t13.d<? super b1> dVar) {
        super(dVar);
        this.f70662d = z0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70661c = obj;
        this.f70663e |= Integer.MIN_VALUE;
        int i14 = z0.f71018g;
        return this.f70662d.b(null, null, this);
    }
}
