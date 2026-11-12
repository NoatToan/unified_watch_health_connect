package tm0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostViewModel", f = "CreatePostViewModel.kt", l = {63}, m = "prepareBodyPart", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f165404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f165405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f165405b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165404a = obj;
        this.f165406c |= Integer.MIN_VALUE;
        return l.x4(this.f165405b, null, null, this);
    }
}
