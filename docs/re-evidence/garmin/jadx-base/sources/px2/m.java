package px2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.samd.protoimpl.GarminHealthServiceHandler", f = "GarminHealthServiceHandler.kt", l = {127}, m = "sendFileTransferReadyForNext")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f141826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f141828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f141828c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141827b = obj;
        this.f141829d |= Integer.MIN_VALUE;
        return this.f141828c.l(this);
    }
}
