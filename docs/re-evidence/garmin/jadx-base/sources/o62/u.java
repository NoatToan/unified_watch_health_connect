package o62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo62/u;", "Lx5/r0;", "", "suffix", "<init>", "(Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements x5.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f129775b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o62/u$a", "Lx5/c0;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements x5.c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s5.c f129776b;

        public a(s5.c cVar) {
            this.f129776b = cVar;
        }

        @Override // x5.c0
        public final int a(int i14) {
            s5.c cVar = this.f129776b;
            if (cVar.length() == 0) {
                return 0;
            }
            return i14 >= cVar.f157138b.length() ? cVar.f157138b.length() : i14;
        }

        @Override // x5.c0
        public final int b(int i14) {
            return i14;
        }
    }

    public u(String str) {
        str.getClass();
        this.f129775b = str;
    }

    @Override // x5.r0
    public final x5.q0 a(s5.c cVar) {
        cVar.getClass();
        return new x5.q0(cVar.d(new s5.c(this.f129775b, null, 2, null)), new a(cVar));
    }
}
