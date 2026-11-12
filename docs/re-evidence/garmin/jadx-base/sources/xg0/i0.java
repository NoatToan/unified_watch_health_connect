package xg0;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.c1;
import ps.f1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxg0/i0;", "Lrs/c;", "Lwg0/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 implements rs.c<wg0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f190777a;

    public i0(Context context) {
        context.getClass();
        this.f190777a = context;
    }

    @Override // rs.c
    public final ArrayList a(Object obj) {
        wg0.d dVar = (wg0.d) obj;
        dVar.getClass();
        c1 c1Var = dVar.f185079b;
        if (c1Var != null) {
            return new f1(this.f190777a, c1Var, null, 4, null).b(true, null, null);
        }
        return null;
    }

    @Override // rs.c
    public final int b(wg0.d dVar) {
        dVar.getClass();
        return dVar.f185088k.getMapType();
    }

    @Override // rs.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List<com.garmin.android.library.mapsdkadapter.p> c(wg0.d dVar) {
        dVar.getClass();
        x0 x0Var = dVar.f185078a;
        ArrayList arrayList = new ArrayList();
        com.garmin.android.library.mapsdkadapter.f fVar = dVar.f185081d;
        Context context = this.f190777a;
        if (fVar != null) {
            Resources resources = context.getResources();
            resources.getClass();
            arrayList.add(lg.d.o(resources, fVar, x0Var, false));
        }
        com.garmin.android.library.mapsdkadapter.f fVar2 = dVar.f185080c;
        if (fVar2 != null) {
            Resources resources2 = context.getResources();
            resources2.getClass();
            arrayList.add(lg.d.o(resources2, fVar2, x0Var, true));
        }
        return arrayList;
    }
}
