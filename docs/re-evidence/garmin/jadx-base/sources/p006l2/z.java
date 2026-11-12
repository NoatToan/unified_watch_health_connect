package p006l2;

import android.os.Trace;
import androidx.camera.core.impl.l0;
import f4.a;
import f4.f;
import g6.o;
import java.util.List;
import java.util.Map;
import p005kotlin.Unit;
import p13.j0;
import s5.c;
import s5.x0;
import s5.y;
import s5.y0;
import w5.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f108906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f108907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f108908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f108909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f108910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f108911g;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f108905a = i14;
        this.f108906b = obj;
        this.f108907c = obj2;
        this.f108908d = obj3;
        this.f108909e = obj4;
        this.f108910f = obj5;
        this.f108911g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f108905a;
        Object obj = this.f108911g;
        Object obj2 = this.f108910f;
        Object obj3 = this.f108909e;
        Object obj4 = this.f108908d;
        Object obj5 = this.f108907c;
        Object obj6 = this.f108906b;
        switch (i14) {
            case 0:
                x0 x0Var = (x0) obj6;
                o oVar = (o) obj5;
                List list = (List) obj4;
                c cVar = (c) obj3;
                g6.c cVar2 = (g6.c) obj2;
                q.b bVar = (q.b) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    f.f68735e.getClass();
                    a aVarG = f.a.g(null, null);
                    try {
                        f fVarJ = aVarG.j();
                        try {
                            x0 x0VarA = y0.a(x0Var, oVar);
                            if (list == null) {
                                list = j0.f134944a;
                            }
                            new s5.q(cVar, x0VarA, (List<c.d<y>>) list, cVar2, bVar).a();
                            Unit unit = Unit.INSTANCE;
                            f.q(fVarJ);
                            aVarG.w().a();
                            aVarG.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th3) {
                            f.q(fVarJ);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            aVarG.c();
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    Trace.endSection();
                    throw th6;
                }
            default:
                ((s0.f) obj6).a((l0) obj5, (l0) obj4, (r0.o) obj3, (r0.o) obj2, (Map.Entry) obj);
                return;
        }
    }
}
