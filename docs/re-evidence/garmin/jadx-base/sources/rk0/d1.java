package rk0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import r53.a2;
import r53.p2;
import r53.q2;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lrk0/d1;", "Landroidx/lifecycle/u1;", "Lmk0/h;", "getGearActivitiesUseCase", "", "gearUUID", "Lam/x0;", "parentActivityType", "", "availableActivityTypes", "", "isWheelchairUser", "<init>", "(Lmk0/h;Ljava/lang/String;Lam/x0;Ljava/util/List;Z)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.h f153089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f153090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f153091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f153092d;

    public d1(mk0.h hVar, String str, am.x0 x0Var, List<? extends am.x0> list, boolean z14) {
        hVar.getClass();
        str.getClass();
        x0Var.getClass();
        list.getClass();
        this.f153089a = hVar;
        this.f153090b = q2.a(new c1(str, x0Var, list, null, z14));
        this.f153091c = new LinkedHashMap();
        this.f153092d = q2.a(x4());
    }

    public final r53.i<v2<wo0.a>> x4() {
        c1 c1Var = (c1) this.f153090b.getValue();
        am.x0 x0Var = c1Var.f153084d;
        LinkedHashMap linkedHashMap = this.f153091c;
        r53.i<v2<wo0.a>> iVar = (r53.i) linkedHashMap.get(x0Var);
        if (iVar != null) {
            return iVar;
        }
        u2 u2Var = new u2(20, 0, false, 20, 0, 0, 54, null);
        am.x0 x0Var2 = c1Var.f153084d;
        a2 a2VarA = yc.o.a(new t2(u2Var, null, new q42.v(this, 16, c1Var, x0Var2 != null ? p13.w.c(x0Var2) : c1Var.f153083c), 2, null).f196485a, v1.a(this));
        linkedHashMap.put(x0Var, a2VarA);
        return a2VarA;
    }
}
