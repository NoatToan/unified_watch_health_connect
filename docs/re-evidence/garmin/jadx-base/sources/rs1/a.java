package rs1;

import p005kotlin.Metadata;
import qs1.t;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.trails.data.paging.TrailImagesPagingSource", f = "TrailImagesPagingSource.kt", l = {45}, m = "load", v = 2)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f154345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f154347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(dVar);
        this.f154347c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154346b = obj;
        this.f154348d |= Integer.MIN_VALUE;
        return this.f154347c.e(null, this);
    }
}
