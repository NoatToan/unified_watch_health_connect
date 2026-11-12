package mt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmt0/h4;", "Lmt0/f4;", "", "challengeId", "invitationId", "", "currentUserProfileId", "Lyt0/f1;", "teamChallengeRepo", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLyt0/f1;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h4 extends f4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f120647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f120648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.w0 f120649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.w0 f120650p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(String str, String str2, long j8, yt0.f1 f1Var) {
        super(str, str2, j8, f1Var);
        str.getClass();
        str2.getClass();
        f1Var.getClass();
        this.f120649o = androidx.lifecycle.t1.a(this.f120607g, new mh1.x(this, 14));
        androidx.lifecycle.w0 w0Var = new androidx.lifecycle.w0();
        w0Var.m(Boolean.valueOf(this.f120603c.length() == 0));
        w0Var.n(this.f120608h, new i4.a(new ml0.e(8, w0Var, this)));
        this.f120650p = w0Var;
    }
}
