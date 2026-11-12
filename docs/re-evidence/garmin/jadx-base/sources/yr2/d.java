package yr2;

import p005kotlin.Metadata;
import q03.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyr2/d;", "Lul2/b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements ul2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s<byte[]> f199138a;

    public d(s<byte[]> sVar) {
        this.f199138a = sVar;
    }

    @Override // ul2.b
    public final void a(ul2.a aVar, byte[] bArr) {
        aVar.getClass();
        s<byte[]> sVar = this.f199138a;
        if (bArr != null) {
            ((e13.a.C1312a) sVar).c(bArr);
        } else {
            ((e13.a.C1312a) sVar).a(new Exception());
        }
    }
}
