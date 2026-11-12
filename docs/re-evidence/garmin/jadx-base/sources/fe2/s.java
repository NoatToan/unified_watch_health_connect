package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicTerminator", f = "ClassicTerminator.kt", l = {49}, m = "handleSessionsTerminated", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public de2.g0.b f70912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xd2.g1 f70913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f70914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f70915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f70915d = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70914c = obj;
        this.f70916e |= Integer.MIN_VALUE;
        int i14 = q.f70890f;
        return this.f70915d.b(null, null, this);
    }
}
