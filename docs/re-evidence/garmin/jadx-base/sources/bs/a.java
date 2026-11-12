package bs;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.p;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.c1;
import ps.f1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbs/a;", "Lrs/c;", "Lwg0/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements rs.c<wg0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19644a;

    public a(Context context) {
        context.getClass();
        this.f19644a = context;
    }

    @Override // rs.c
    public final ArrayList a(Object obj) {
        wg0.d dVar = (wg0.d) obj;
        dVar.getClass();
        c1 c1Var = dVar.f185079b;
        if (c1Var == null) {
            return null;
        }
        return new f1(this.f19644a, c1Var, null, 4, null).b(true, null, null);
    }

    @Override // rs.c
    public final int b(wg0.d dVar) {
        dVar.getClass();
        return dVar.f185088k.getMapType();
    }

    @Override // rs.c
    public final List c(wg0.d dVar) {
        dVar.getClass();
        x0 x0Var = dVar.f185078a;
        ArrayList arrayList = new ArrayList();
        List<ls.c> list = dVar.f185083f;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ls.c cVar : list) {
                p pVar = new p();
                pVar.b(cVar.f114477a.f114484a);
                pVar.a(0.5f, 0.9f);
                pVar.d(cVar.f114478b);
                pVar.f50327a.f50312d = cVar.f114479c;
                arrayList2.add(pVar);
            }
            arrayList.addAll(arrayList2);
        }
        f fVar = dVar.f185081d;
        Context context = this.f19644a;
        if (fVar != null) {
            Resources resources = context.getResources();
            resources.getClass();
            arrayList.add(lg.d.o(resources, fVar, x0Var, false));
        }
        f fVar2 = dVar.f185080c;
        if (fVar2 != null) {
            Resources resources2 = context.getResources();
            resources2.getClass();
            arrayList.add(lg.d.o(resources2, fVar2, x0Var, true));
        }
        return arrayList;
    }
}
