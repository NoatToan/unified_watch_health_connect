package hc0;

import android.widget.Toast;
import bd0.s;

/* JADX INFO: loaded from: classes8.dex */
public class m extends j83.m<byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd2.f f83264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gc0.e f83265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f83266d;

    public m(k kVar, sd2.f fVar, gc0.e eVar) {
        this.f83266d = kVar;
        this.f83264b = fVar;
        this.f83265c = eVar;
    }

    @Override // j83.m
    public final void b(Throwable th3) {
        Toast.makeText(this.f83266d.getActivity(), "There is a problem, please retry", 0).show();
    }

    @Override // j83.m
    public final void c(byte[] bArr) {
        new s(this.f83264b.getUnitID(), bArr, new l(this)).a();
    }
}
