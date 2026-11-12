package qf1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {112, 113, 115}, m = "createGHSAccount", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f144608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jx2.b f144609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f144610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f144611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f144612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f144611d = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144610c = obj;
        this.f144612e |= Integer.MIN_VALUE;
        return this.f144611d.i(null, this);
    }
}
