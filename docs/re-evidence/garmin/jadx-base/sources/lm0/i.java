package lm0;

import java.util.Iterator;
import java.util.Map;
import kotlin.m3;
import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f113544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f113545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f113546d;

    public /* synthetic */ i(m4.q qVar, m3 m3Var, e23.a aVar) {
        this.f113543a = 0;
        this.f113546d = aVar;
        this.f113544b = qVar;
        this.f113545c = m3Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f113543a) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                if (!map.isEmpty()) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            this.f113546d.invoke();
                            this.f113544b.y(false);
                            m3 m3Var = this.f113545c;
                            if (m3Var != null) {
                                m3Var.hide();
                            }
                        }
                    }
                }
                break;
            case 1:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "SAVE")) {
                    this.f113544b.y(false);
                    m3 m3Var2 = this.f113545c;
                    if (m3Var2 != null) {
                        m3Var2.hide();
                    }
                    this.f113546d.invoke();
                }
                break;
            default:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (s.g(i3Var2.f111063a, "DONE")) {
                    this.f113544b.y(false);
                    m3 m3Var3 = this.f113545c;
                    if (m3Var3 != null) {
                        m3Var3.hide();
                    }
                    this.f113546d.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(m4.q qVar, m3 m3Var, e23.a aVar, int i14) {
        this.f113543a = i14;
        this.f113544b = qVar;
        this.f113545c = m3Var;
        this.f113546d = aVar;
    }
}
