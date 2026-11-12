package il2;

import al2.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.legacy.LegacySyncManager", f = "LegacySyncManager.kt", l = {223}, m = "requestDeviceXml$suspendImpl")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f94028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ea2.f f94029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f94030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f94031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f94031d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94030c = obj;
        this.f94032e |= Integer.MIN_VALUE;
        return a.g(this.f94031d, null, this);
    }
}
