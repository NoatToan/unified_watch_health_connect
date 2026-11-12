package qf1;

import jx2.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {238, 239, 245, 248}, m = "enableEcgFeatureOnDevice", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f144613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f144614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f144615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f144616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f144617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f144618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f144617e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144616d = obj;
        this.f144618f |= Integer.MIN_VALUE;
        return this.f144617e.g(0L, null, this);
    }
}
