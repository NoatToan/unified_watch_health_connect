package la2;

import androidx.recyclerview.widget.o;
import com.garmin.device.datatypes.DeviceProfile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p005kotlin.Unit;
import yc.j3;
import yc.k3;
import yc.l3;
import yc.m2;
import yc.m3;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f111636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f111637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f111638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f111639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f111640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f111641g;

    public /* synthetic */ d(Object obj, Object obj2, int i14, Object obj3, Object obj4, Object obj5, int i15) {
        this.f111635a = i15;
        this.f111637c = obj;
        this.f111638d = obj2;
        this.f111639e = obj3;
        this.f111636b = i14;
        this.f111640f = obj4;
        this.f111641g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f111635a) {
            case 0:
                e.a aVar = (e.a) this.f111637c;
                a aVar2 = (a) this.f111638d;
                DeviceProfile deviceProfile = (DeviceProfile) this.f111639e;
                int i14 = this.f111636b;
                Long l14 = (Long) this.f111640f;
                String str = (String) this.f111641g;
                try {
                    aVar2.onDeviceDisconnected(new h(deviceProfile, i14, l14));
                } catch (Throwable th3) {
                    e.this.f111648g.error("onDeviceDisconnected callback failed: " + str, th3);
                    return;
                }
                break;
            default:
                final m2 m2Var = (m2) this.f111637c;
                final m2 m2Var2 = (m2) this.f111638d;
                final yc.e eVar = (yc.e) this.f111639e;
                final m2 m2Var3 = (m2) this.f111640f;
                final m3 m3Var = (m3) this.f111641g;
                eVar.getClass();
                k3 k3Var = m2Var.f196223d;
                k3 k3Var2 = m2Var2.f196223d;
                o.f<T> fVar = eVar.f195860b.f10415c;
                fVar.getClass();
                final j3 j3VarA = l3.a(k3Var, k3Var2, fVar);
                final int i15 = this.f111636b;
                n.a.a().b(new Runnable() { // from class: yc.d
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = eVar;
                        eVar2.getClass();
                        if (eVar2.f195864f == i15) {
                            s2<T> s2Var = m2Var.f196223d;
                            int i16 = s2Var.f196448b + s2Var.f196453g;
                            e.C3648e c3648e = eVar2.f195868j;
                            m2<T> m2Var4 = m2Var3;
                            m2Var4.getClass();
                            k3 k3Var3 = m2Var2.f196223d;
                            m2 m2Var5 = eVar2.f195863e;
                            if (m2Var5 != null) {
                                k3 k3Var4 = m2Var5.f196223d;
                                if (eVar2.f195862d == null) {
                                    eVar2.f195862d = m2Var4;
                                    e23.p<? super c1, ? super z0, Unit> pVar = eVar2.f195866h;
                                    pVar.getClass();
                                    ArrayList arrayList = m2Var4.f196227h;
                                    p13.d0.B(n2.f196275a, arrayList);
                                    arrayList.add(new WeakReference(pVar));
                                    m2Var4.d(pVar);
                                    eVar2.f195863e = null;
                                    androidx.recyclerview.widget.y yVarB = eVar2.b();
                                    j3 j3Var = j3VarA;
                                    l3.b(k3Var4, yVarB, k3Var3, j3Var);
                                    c3648e.getClass();
                                    ArrayList arrayList2 = m3Var.f196241a;
                                    j23.j jVarN = j23.t.n(3, j23.t.o(0, arrayList2.size()));
                                    int i17 = jVarN.f96796a;
                                    int i18 = jVarN.f96797b;
                                    int i19 = jVarN.f96798c;
                                    int i24 = 1;
                                    if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                                        while (true) {
                                            int iIntValue = ((Number) arrayList2.get(i17)).intValue();
                                            if (iIntValue == 0) {
                                                c3648e.a(((Number) arrayList2.get(i17 + 1)).intValue(), ((Number) arrayList2.get(i17 + 2)).intValue());
                                            } else if (iIntValue == i24) {
                                                c3648e.b(((Number) arrayList2.get(i17 + 1)).intValue(), ((Number) arrayList2.get(i17 + 2)).intValue());
                                            } else {
                                                if (iIntValue != 2) {
                                                    vb.h.z("Unexpected recording value");
                                                    return;
                                                }
                                                c3648e.c(((Number) arrayList2.get(i17 + 1)).intValue(), ((Number) arrayList2.get(i17 + 2)).intValue());
                                            }
                                            if (i17 == i18) {
                                                break;
                                            }
                                            i17 += i19;
                                            i24 = i24;
                                        }
                                    }
                                    arrayList2.clear();
                                    m2Var4.c(c3648e);
                                    if (!m2Var4.isEmpty()) {
                                        m2Var4.j(j23.t.e(l3.c(k3Var4, j3Var, k3Var3, i16), 0, m2Var4.f196223d.getSize() - 1));
                                    }
                                    eVar2.c(m2Var5, eVar2.f195862d);
                                    return;
                                }
                            }
                            vb.h.z("must be in snapshot state to apply diff");
                        }
                    }
                });
                break;
        }
    }
}
