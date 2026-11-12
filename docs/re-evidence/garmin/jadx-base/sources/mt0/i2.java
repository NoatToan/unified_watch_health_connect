package mt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lmt0/i2;", "Lcom/garmin/android/apps/connectmobile/d0$a;", "", "currentUserDisplayName", "", "hasGCPlusSocialFeature", "<init>", "(Ljava/lang/String;Z)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i2 extends com.garmin.android.apps.connectmobile.d0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.leaderboard.challenges.c0 f120656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2 f120657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f120658e;

    static {
        new a(null);
    }

    public i2(String str, boolean z14) {
        str.getClass();
        this.f120656c = new com.garmin.android.apps.connectmobile.leaderboard.challenges.c0(str, z14);
        this.f120657d = new j2();
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void B() {
        z(this.f120656c);
        z(this.f120657d);
    }

    public final void C(boolean z14) {
        j2 j2Var = this.f120657d;
        if (z14) {
            int i14 = this.f120658e;
            com.garmin.android.apps.connectmobile.leaderboard.challenges.c0 c0Var = this.f120656c;
            c0Var.getClass();
            j2Var.i(i14 - c0Var.f37384d.size());
        }
        if (j2Var.f120672c != z14) {
            j2Var.f120672c = z14;
            if (z14) {
                j2Var.f().t(j2Var);
            } else {
                j2Var.f().x(j2Var, 0);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void clear() {
        com.garmin.android.apps.connectmobile.leaderboard.challenges.c0 c0Var = this.f120656c;
        c0Var.f37384d.clear();
        c0Var.g();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmt0/i2$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
