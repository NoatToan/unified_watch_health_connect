package bs;

import am.f2;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.newmodel.a0;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p13.j0;
import ps.x1;
import qs.x;
import uw0.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbs/d;", "Lrs/c;", "Lwg0/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements rs.c<wg0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19647a;

    public d(Context context) {
        context.getClass();
        this.f19647a = context;
    }

    @Override // rs.c
    public final ArrayList a(Object obj) {
        List immutableList;
        wg0.d dVar = (wg0.d) obj;
        dVar.getClass();
        List<a0> list = dVar.f185085h;
        List<x1> list2 = dVar.f185084g;
        if (list2 == null || list2.isEmpty() || list == null || list.isEmpty()) {
            return null;
        }
        if (!list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((x1) it.next()).a2() == x.VIRTUAL_ACTIVITY_SECTION) {
                    return dh.b.y(this.f19647a, dVar.f185079b, list2);
                }
            }
        }
        uo.a aVarD = d(dVar.f185078a, list, list2);
        if (aVarD == null || (immutableList = Util.toImmutableList(aVarD.f172067a)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : immutableList) {
            if (!((q) obj2).f50328a.f93153a.isEmpty()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // rs.c
    public final int b(wg0.d dVar) {
        dVar.getClass();
        return dVar.f185088k.getMapType();
    }

    @Override // rs.c
    public final List c(wg0.d dVar) {
        dVar.getClass();
        List<a0> list = dVar.f185085h;
        x0 x0Var = dVar.f185078a;
        List<x1> list2 = dVar.f185084g;
        List immutableList = null;
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            if (!list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((x1) it.next()).a2() == x.VIRTUAL_ACTIVITY_SECTION) {
                        ArrayList arrayList = new ArrayList();
                        f fVar = dVar.f185081d;
                        Context context = this.f19647a;
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
            }
            uo.a aVarD = d(x0Var, list, list2);
            immutableList = aVarD != null ? Util.toImmutableList(aVarD.f172068b) : null;
            if (immutableList == null) {
                return j0.f134944a;
            }
        }
        return immutableList;
    }

    public final uo.a d(x0 x0Var, List<? extends a0> list, List<x1> list2) {
        g.a aVar = new g.a();
        x0Var.getClass();
        aVar.f172998b = x0Var;
        boolean z14 = true;
        aVar.f172997a = true;
        Resources resources = this.f19647a.getResources();
        resources.getClass();
        g gVarA = aVar.a(resources);
        String str = x0Var.f4358a;
        boolean zB = z0.b(x0.W1, str);
        boolean zB2 = z0.b(x0.X1, str);
        boolean zX = z0.X(str);
        boolean zX2 = z0.x(str);
        if (!zB && !zB2 && !zX2) {
            z14 = false;
        }
        return f2.b(gVarA, list, list2, z14, zX);
    }
}
