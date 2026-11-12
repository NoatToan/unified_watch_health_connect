package gw;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.operations.MigrateLTAndIDInfoToGCContactsOperations", f = "MigrateLTAndIDInfoToGCContactsOperations.kt", l = {53, 61, 89}, m = "invoke", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l20.r f79531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f79532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f79533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f79533c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79532b = obj;
        this.f79534d |= Integer.MIN_VALUE;
        return this.f79533c.a(this);
    }
}
