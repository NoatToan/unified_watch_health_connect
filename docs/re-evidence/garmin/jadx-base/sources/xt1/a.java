package xt1;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lxt1/a;", "Liu1/c;", "", "activityId", "Liu1/k;", "Lps/m;", "objectResultListener", "objectToCache", "<init>", "(JLiu1/k;Lps/m;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends iu1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f192160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iu1.k<ps.m> f192161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ps.m f192162e;

    static {
        new C3583a(null);
    }

    public /* synthetic */ a(long j8, iu1.k kVar, ps.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, (i14 & 2) != 0 ? null : kVar, (i14 & 4) != 0 ? null : mVar);
    }

    @Override // iu1.c
    public final void b() {
        iu1.k<ps.m> kVar;
        rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
        long j8 = this.f192160c;
        if (j8 != -1 && (kVar = this.f192161d) != null) {
            ps.m mVarE = mVar.e(j8);
            if (mVarE != null) {
                kVar.onSuccess(mVarE);
            } else {
                kVar.a(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
            }
        }
        ps.m mVar2 = this.f192162e;
        if (mVar2 != null) {
            mVar.G(mVar2);
        }
    }

    /* JADX INFO: renamed from: xt1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxt1/a$a;", "", "<init>", "()V", "", "NO_ACTIVITY_ID", "J", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3583a {
        public /* synthetic */ C3583a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3583a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(long j8, iu1.k<? super ps.m> kVar, ps.m mVar) {
        this.f192160c = j8;
        this.f192161d = kVar;
        this.f192162e = mVar;
    }

    public a() {
        this(0L, null, null, 7, null);
    }
}
