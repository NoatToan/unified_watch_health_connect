package j30;

import java.util.ArrayList;
import k30.n;
import k30.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj30/j;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f96863a = 0;

    static {
        new j();
    }

    private j() {
    }

    public static final ArrayList a(n nVar) {
        nVar.getClass();
        i53.c<o> cVar = nVar.f102576b;
        ArrayList arrayList = new ArrayList();
        for (o oVar : cVar) {
            com.garmin.android.apps.connectmobile.courses.model.i iVar = oVar.f102580b ? oVar.f102579a : null;
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }
}
