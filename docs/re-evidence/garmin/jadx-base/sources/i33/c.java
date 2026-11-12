package i33;

import com.garmin.android.gncs.NotificationConstants;
import java.util.Map;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.k0;
import p43.n0;
import p43.v0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public class c implements j33.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f90787f = {s0.f105811a.h(new i0(c.class, NotificationConstants.KEY_DATA_MIME_TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.c f90788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f90789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.j f90790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o33.b f90791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f90792e;

    public c(k33.i iVar, o33.a aVar, x33.c cVar) {
        y0 y0VarA;
        iVar.getClass();
        k33.c cVar2 = iVar.f102785a;
        cVar.getClass();
        this.f90788a = cVar;
        if (aVar != null) {
            y0VarA = cVar2.f102760j.a(aVar);
        } else {
            y0VarA = y0.f162076a;
            y0VarA.getClass();
        }
        this.f90789b = y0VarA;
        this.f90790c = cVar2.f102751a.g(new b(iVar, this));
        this.f90791d = aVar != null ? (o33.b) h0.c0(aVar.h()) : null;
        this.f90792e = false;
    }

    @Override // j33.g
    public final boolean a() {
        return this.f90792e;
    }

    @Override // u23.c
    public Map<x33.f, d43.g<?>> b() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }

    @Override // u23.c
    public final x33.c c() {
        return this.f90788a;
    }

    @Override // u23.c
    public final y0 getSource() {
        return this.f90789b;
    }

    @Override // u23.c
    public final n0 getType() {
        return (v0) gl1.d.B(this.f90790c, f90787f[0]);
    }
}
