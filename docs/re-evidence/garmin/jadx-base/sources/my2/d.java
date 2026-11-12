package my2;

import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {297, 298}, m = "checkDeviceFirmwareUpdate")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f121537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RequestBody f121539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f121540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f121541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f121542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f121543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f121544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f121545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f121546j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f121545i = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121544h = obj;
        this.f121546j |= Integer.MIN_VALUE;
        return this.f121545i.d(0L, null, false, false, null, this);
    }
}
