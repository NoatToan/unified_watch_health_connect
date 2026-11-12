package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.o;
import androidx.media3.exoplayer.source.c;
import androidx.media3.exoplayer.source.d;
import androidx.media3.exoplayer.source.t;
import fa.j;
import fa.z;
import j20.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53135b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f53134a = i14;
        this.f53135b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i14 = this.f53134a;
        Object obj = this.f53135b;
        switch (i14) {
            case 0:
                return ((ListenerSet) obj).handleMessage(message);
            case 1:
                j jVar = (j) obj;
                Iterator it = jVar.f70021d.iterator();
                while (it.hasNext()) {
                    j.c cVar = (j.c) it.next();
                    j.b<T> bVar = jVar.f70020c;
                    if (!cVar.f70030d && cVar.f70029c) {
                        o oVarB = cVar.f70028b.b();
                        cVar.f70028b = new o.b();
                        cVar.f70029c = false;
                        bVar.c(cVar.f70027a, oVarB);
                    }
                    if (jVar.f70019b.c()) {
                        return true;
                    }
                }
                return true;
            default:
                d dVar = (d) obj;
                ArrayList arrayList = dVar.f9449n;
                switch (message.what) {
                    case 1:
                        Object obj2 = message.obj;
                        int i15 = z.f70071a;
                        d.f fVar = (d.f) obj2;
                        t tVar = dVar.f9457v;
                        int i16 = fVar.f9473a;
                        Collection<d.e> collection = (Collection) fVar.f9474b;
                        dVar.f9457v = tVar.cloneAndInsert(i16, collection.size());
                        dVar.x(fVar.f9473a, collection);
                        dVar.C(fVar.f9475c);
                        break;
                    case 2:
                        Object obj3 = message.obj;
                        int i17 = z.f70071a;
                        d.f fVar2 = (d.f) obj3;
                        int i18 = fVar2.f9473a;
                        int iIntValue = ((Integer) fVar2.f9474b).intValue();
                        if (i18 == 0 && iIntValue == dVar.f9457v.getLength()) {
                            dVar.f9457v = dVar.f9457v.cloneAndClear();
                        } else {
                            dVar.f9457v = dVar.f9457v.cloneAndRemove(i18, iIntValue);
                        }
                        for (int i19 = iIntValue - 1; i19 >= i18; i19--) {
                            d.e eVar = (d.e) arrayList.remove(i19);
                            dVar.f9451p.remove(eVar.f9468b);
                            dVar.z(i19, -1, -eVar.f9467a.f9510o.f158114b.o());
                            eVar.f9472f = true;
                            if (eVar.f9469c.isEmpty()) {
                                dVar.f9452q.remove(eVar);
                                c.b bVar2 = (c.b) dVar.f9435h.remove(eVar);
                                bVar2.getClass();
                                androidx.media3.exoplayer.source.j jVar2 = bVar2.f9442a;
                                jVar2.b(bVar2.f9443b);
                                c<T>.a aVar = bVar2.f9444c;
                                jVar2.i(aVar);
                                jVar2.j(aVar);
                            }
                        }
                        dVar.C(fVar2.f9475c);
                        break;
                    case 3:
                        Object obj4 = message.obj;
                        int i24 = z.f70071a;
                        d.f fVar3 = (d.f) obj4;
                        t tVar2 = dVar.f9457v;
                        int i25 = fVar3.f9473a;
                        T t7 = fVar3.f9474b;
                        t.a aVarCloneAndRemove = tVar2.cloneAndRemove(i25, i25 + 1);
                        dVar.f9457v = aVarCloneAndRemove;
                        Integer num = (Integer) t7;
                        dVar.f9457v = aVarCloneAndRemove.cloneAndInsert(num.intValue(), 1);
                        int i26 = fVar3.f9473a;
                        int iIntValue2 = num.intValue();
                        int iMin = Math.min(i26, iIntValue2);
                        int iMax = Math.max(i26, iIntValue2);
                        int iO = ((d.e) arrayList.get(iMin)).f9471e;
                        arrayList.add(iIntValue2, (d.e) arrayList.remove(i26));
                        while (iMin <= iMax) {
                            d.e eVar2 = (d.e) arrayList.get(iMin);
                            eVar2.f9470d = iMin;
                            eVar2.f9471e = iO;
                            iO += eVar2.f9467a.f9510o.f158114b.o();
                            iMin++;
                        }
                        dVar.C(fVar3.f9475c);
                        break;
                    case 4:
                        Object obj5 = message.obj;
                        int i27 = z.f70071a;
                        d.f fVar4 = (d.f) obj5;
                        dVar.f9457v = (t) fVar4.f9474b;
                        dVar.C(fVar4.f9475c);
                        break;
                    case 5:
                        dVar.D();
                        break;
                    case 6:
                        Object obj6 = message.obj;
                        int i28 = z.f70071a;
                        dVar.B((Set) obj6);
                        break;
                    default:
                        x.h();
                        return false;
                }
                return true;
        }
    }
}
