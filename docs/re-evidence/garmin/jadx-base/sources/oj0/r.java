package oj0;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository", f = "GCPlusRepository.kt", l = {286}, m = "fetchImageIfNecessary", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f132344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f132345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f132346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f132347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f132348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f fVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f132347d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132346c = obj;
        this.f132348e |= Integer.MIN_VALUE;
        int i14 = f.f132279m;
        return this.f132347d.k(null, null, this);
    }
}
