package vm0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvm0/k;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f178773i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<Unit> f178774a = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f178775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f178776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f178777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f178778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f178779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f178780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f178781h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f178782a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f178782a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f178782a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f178782a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public k() {
        ym0.a.f197886f.getClass();
        this.f178775b = ym0.a.C3709a.a();
        this.f178777d = -1L;
    }

    public final boolean x4() {
        return (this.f178778e == null || this.f178779f == null || this.f178780g == null || this.f178781h == null) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lvm0/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SEARCH_KEYWORD_MINIMUM_LENGTH", "I", "PAGE_SIZE", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
