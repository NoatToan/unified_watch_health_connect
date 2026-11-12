package tx2;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.garmin.samd.repository.ghs.account.GetAccountStatusKt", f = "GetAccountStatus.kt", l = {19}, m = "getAccountStatus")
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f166848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166849b;

    public b(d<? super b> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166848a = obj;
        this.f166849b |= Integer.MIN_VALUE;
        return oc.b.j(null, this);
    }
}
