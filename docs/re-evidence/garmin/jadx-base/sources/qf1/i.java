package qf1;

import jx2.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {198, 201, 202, 208}, m = "isEcgFeatureEnabledOnDevice", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f144628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f144629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f144630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f144631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f144632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f144633f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f144632e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144631d = obj;
        this.f144633f |= Integer.MIN_VALUE;
        return this.f144632e.k(0L, null, this);
    }
}
