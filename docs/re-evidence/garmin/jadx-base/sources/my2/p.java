package my2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {222, 241}, m = "uploadFile")
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f121589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dz2.b f121591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f121592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f121593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f121594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f121595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f121596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f121597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f121598j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a aVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f121597i = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121596h = obj;
        this.f121598j |= Integer.MIN_VALUE;
        return this.f121597i.g(0L, null, null, null, null, false, null, this);
    }
}
