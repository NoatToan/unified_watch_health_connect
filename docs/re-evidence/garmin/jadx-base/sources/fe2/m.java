package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession", f = "ClassicSession.kt", l = {271}, m = "unsubscribeFromDevice", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f70841b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70840a = obj;
        this.f70842c |= Integer.MIN_VALUE;
        return b.s(this.f70841b, this);
    }
}
