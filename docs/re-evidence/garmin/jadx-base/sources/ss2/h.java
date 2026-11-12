package ss2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lss2/h;", "Lss2/w;", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f160812a;

    public h(c cVar) {
        this.f160812a = cVar;
    }

    @Override // ss2.w
    public final void a(byte[] bArr) {
        c cVar = this.f160812a;
        cVar.f160787e.debug("Out-of-band mode requested! OOB passkey available, proceeding...");
        cVar.h(bArr);
    }

    @Override // ss2.w
    public final void b(String str) {
        w.a.a(str, this);
    }
}
