package cm2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "com.garmin.device.pairing.handlers.DualPairingRequestHandler", f = "DualPairingRequestHandler.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "enableBluetoothClassicOnDevice")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f27983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(dVar);
        this.f27983b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f27982a = obj;
        this.f27984c |= Integer.MIN_VALUE;
        return this.f27983b.c(this);
    }
}
