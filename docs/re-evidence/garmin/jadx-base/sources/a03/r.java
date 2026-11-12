package a03;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.FlexibleSheetState", f = "FlexibleSheetState.kt", l = {168, 169, 171}, m = "intermediatelyExpand")
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f167c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166b = obj;
        this.f168d |= Integer.MIN_VALUE;
        return this.f167c.e(this);
    }
}
