package pt0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import mt0.k4;
import p005kotlin.Metadata;
import yt0.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpt0/j0;", "Landroidx/lifecycle/u1;", "Lyt0/t0;", "leaderboardRepo", "<init>", "(Lyt0/t0;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f140715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<k4> f140718d;

    static {
        new a(null);
    }

    public j0(t0 t0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            t0.f199591b.getClass();
            t0Var = new t0((lt0.e) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lt0.e.class, new c83.h.a[0], null, null, null, 120));
        }
        this(t0Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpt0/j0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j0(t0 t0Var) {
        t0Var.getClass();
        this.f140715a = t0Var;
        this.f140716b = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        this.f140717c = "999";
        this.f140718d = new y0<>(k4.CurrentWeek);
    }

    public j0() {
        this(null, 1, null);
    }
}
