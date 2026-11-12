package h2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g2.v0;
import p005kotlin.Metadata;
import p3.a2;
import p3.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh2/e0;", "", "", "currentPage", "", "currentPageOffsetFraction", "Lh2/j0;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(IFLh2/j0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f80894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f80895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f80896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f80898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f80899f;

    public e0(int i14, float f14, j0 j0Var) {
        this.f80894a = j0Var;
        this.f80895b = new a2(i14);
        this.f80896c = new z1(f14);
        this.f80899f = new v0(i14, 30, 100);
    }

    public /* synthetic */ e0(int i14, float f14, j0 j0Var, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? 0.0f : f14, j0Var);
    }
}
