package tx2;

import o72.t;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.samd.repository.ghs.account.CreateAccountKt", f = "CreateAccount.kt", l = {20}, m = "createAccount")
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f166846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166847b;

    public a(d<? super a> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166846a = obj;
        this.f166847b |= Integer.MIN_VALUE;
        return t.s(null, null, this);
    }
}
