package ak2;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.garmin.device.deeplinking.DeepLinkingDataHandler", f = "DeepLinkingDataHandler.kt", l = {137, 147}, m = "handleRequest$deep_linking_release")
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f3706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f3708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(dVar);
        this.f3708c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f3707b = obj;
        this.f3709d |= Integer.MIN_VALUE;
        return this.f3708c.c(null, null, this);
    }
}
