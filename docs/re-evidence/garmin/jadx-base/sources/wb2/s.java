package wb2;

import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f184121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f184122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f184123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f184124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f184125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f184126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f184127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f184128h;

    public s(r rVar, a aVar, String str, String[] strArr, byte[] bArr, byte[] bArr2, j jVar, String str2, long j8) {
        this.f184121a = aVar;
        this.f184122b = str;
        this.f184123c = strArr;
        this.f184124d = bArr;
        this.f184125e = bArr2;
        this.f184126f = jVar;
        this.f184127g = str2;
        this.f184128h = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArr;
        a aVar = this.f184121a;
        try {
            if (aVar instanceof e) {
                String str = this.f184122b;
                String[] strArr = this.f184123c;
                byte[] bArr = this.f184124d;
                byte[] bArr2 = this.f184125e;
                d dVar = ((e) aVar).f183987o;
                dVar.getClass();
                if (strArr != null && bArr != null && bArr2 != null) {
                    if (strArr.length > 0) {
                        int length = strArr.length;
                        fileArr = new File[length];
                        for (int i14 = 0; i14 < length; i14++) {
                            fileArr[i14] = new File(str, strArr[i14]);
                        }
                    } else {
                        fileArr = null;
                    }
                    dVar.f183970b = fileArr;
                    dVar.f183971c = bArr;
                    dVar.f183972d = bArr2;
                }
                aVar.p(-1L, this.f184126f, this.f184127g);
            }
        } catch (Exception e4) {
            r.f184099d.error(h0.a(this.f184128h) + e4.getMessage(), (Throwable) e4);
        }
    }
}
