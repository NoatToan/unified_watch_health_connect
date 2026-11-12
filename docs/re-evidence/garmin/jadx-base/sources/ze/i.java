package ze;

import android.os.Build;
import cf.t;
import p005kotlin.Metadata;
import ue.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lze/i;", "Lze/b;", "Lye/f;", "Laf/g;", "tracker", "<init>", "(Laf/g;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends b<ye.f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(af.g<ye.f> gVar) {
        super(gVar);
        gVar.getClass();
        this.f204258b = 7;
    }

    @Override // ze.e
    public final boolean a(t tVar) {
        tVar.getClass();
        v vVar = tVar.f26950j.f170043a;
        if (vVar != v.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && vVar == v.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // ze.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF204258b() {
        return this.f204258b;
    }

    @Override // ze.b
    public final boolean d(ye.f fVar) {
        ye.f fVar2 = fVar;
        fVar2.getClass();
        return !fVar2.f196791a || fVar2.f196793c;
    }
}
