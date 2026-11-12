package ta0;

import android.view.KeyEvent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l implements e23.l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f163383a;

    public l(e23.a<Unit> aVar) {
        this.f163383a = aVar;
    }

    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        Boolean bool = Boolean.FALSE;
        KeyEvent keyEvent = bVar.f202306a;
        keyEvent.getClass();
        long jA = z4.f.a(keyEvent.getKeyCode());
        z4.a.f202280b.getClass();
        if (z4.a.a(jA, z4.a.f202299u)) {
            int iB = z4.d.b(keyEvent);
            z4.c.f202307b.getClass();
            if (iB == z4.c.f202308c) {
                this.f163383a.invoke();
            }
        }
        return bool;
    }
}
