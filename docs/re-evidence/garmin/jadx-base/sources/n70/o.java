package n70;

import java.util.ArrayList;
import java.util.List;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/o;", "T", "Ln70/a0;", "", "Lr70/a;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o<T> implements a0<List<? extends r70.a>> {
    public abstract ArrayList c();

    public abstract o70.b d();

    @Override // n70.a0
    public final List<? extends r70.a> invoke() {
        r70.a aVar;
        ArrayList arrayList = new ArrayList();
        ArrayList<j70.d> arrayListC = c();
        if (arrayListC != null) {
            for (j70.d dVar : arrayListC) {
                r70.a.C2840a c2840a = r70.a.f151035s0;
                String strA = d().a();
                c2840a.getClass();
                try {
                    aVar = (r70.a) KoinJavaComponent.get(r70.a.class, QualifierKt.named(strA), new c53.p(dVar, 2));
                } catch (Exception unused) {
                    com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    aVar2.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.o(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "Failed to get activity workout item state holder with qualifier: " + strA + " and params");
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }
}
