package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ITTicketForCredentialExchanger", f = "ITTicketForCredentialExchanger.kt", l = {283}, m = "scheduleSaveUserTimezone")
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f164276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, t13.d<? super r1> dVar) {
        super(dVar);
        this.f164276b = s1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164275a = obj;
        this.f164277c |= Integer.MIN_VALUE;
        return s1.a(this.f164276b, null, this);
    }
}
