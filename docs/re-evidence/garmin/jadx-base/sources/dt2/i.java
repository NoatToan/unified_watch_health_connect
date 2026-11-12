package dt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.protobuf.ProtobufRequestListenerKt", f = "ProtobufRequestListener.kt", l = {26}, m = "respondSilently")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f61200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61201b;

    public i(t13.d<? super i> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f61200a = obj;
        this.f61201b |= Integer.MIN_VALUE;
        return j.a(null, null, this);
    }
}
