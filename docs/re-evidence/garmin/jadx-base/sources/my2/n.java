package my2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {274, 275}, m = "getUploadStatus")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f121582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f121584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f121585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f121586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f121587f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f121586e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121585d = obj;
        this.f121587f |= Integer.MIN_VALUE;
        return this.f121586e.b(0L, null, null, this);
    }
}
