package xn2;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxn2/e0;", "Lxy2/o;", "Lpn2/t;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements xy2.o<pn2.t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uy2.d f191702a;

    public e0() {
        uy2.e eVar = uy2.e.f173458a;
        pn2.t tVar = new pn2.t(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "2", "19700101", "0", "12345678901");
        eVar.getClass();
        this.f191702a = new uy2.d(tVar);
    }

    @Override // xy2.o
    /* JADX INFO: renamed from: getValue */
    public final pn2.t getF173457a() {
        return (pn2.t) this.f191702a.f173457a;
    }
}
