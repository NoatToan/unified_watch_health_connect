package z70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.data.DefaultPromosImageManager", f = "PromosImageManager.kt", l = {72, 78}, m = "fetchImageAtPath", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f202777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f202778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f202779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f202780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f202781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f202780d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f202779c = obj;
        this.f202781e |= Integer.MIN_VALUE;
        return this.f202780d.d(null, this);
    }
}
