package my2;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {150, 151}, m = "getDeviceMessages")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f121567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f121569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f121570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f121571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f121572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f121573g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f121572f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121571e = obj;
        this.f121573g |= Integer.MIN_VALUE;
        return this.f121572f.h(0L, null, null, this);
    }
}
