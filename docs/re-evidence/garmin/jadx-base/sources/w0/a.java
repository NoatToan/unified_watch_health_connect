package w0;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f180990a;

    public a(List<d> list) {
        this.f180990a = list;
    }

    @Override // w0.d
    public final d.a a(SessionConfiguration sessionConfiguration) {
        Iterator<d> it = this.f180990a.iterator();
        while (it.hasNext()) {
            d.a aVarA = it.next().a(sessionConfiguration);
            if (aVarA.f180993a != 0) {
                return aVarA;
            }
        }
        return new d.a(0, 0, 0L);
    }
}
