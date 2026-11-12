package sa0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel", f = "WiFiNetworksViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "storeNetworks", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f158247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f158248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f158249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n nVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f158248b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f158247a = obj;
        this.f158249c |= Integer.MIN_VALUE;
        return n.y4(this.f158248b, null, null, this);
    }
}
