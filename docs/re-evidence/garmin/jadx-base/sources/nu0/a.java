package nu0;

import d53.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.k;
import l20.l;
import l20.m;
import l20.p;
import lc.u0;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import pu0.h;
import pu0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: nu0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2452a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127891a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.AUTO_LIVE_TRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127891a = iArr;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final pu0.b a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final l20.a b(pu0.b bVar) {
        bVar.getClass();
        String str = bVar.f141183a;
        String str2 = bVar.f141184b;
        String str3 = bVar.f141185c;
        if (str3 == null) {
            str3 = "";
        }
        Boolean bool = bVar.f141189g;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean zG = s.g(bVar.f141188f, pu0.d.b.f141213a);
        Boolean bool2 = bVar.f141190h;
        List<pu0.f> list = bVar.f141186d;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (pu0.f fVar : list) {
            Long l14 = fVar.f141220a;
            String str4 = fVar.f141221b;
            pu0.g gVar = fVar.f141222c;
            Integer numF = gVar != null ? f(gVar) : null;
            Boolean bool3 = fVar.f141223d;
            Integer num = fVar.f141224e;
            int iIntValue = num != null ? num.intValue() : k.OTHER.f109012a;
            int i14 = fVar.f141225f;
            Boolean bool4 = fVar.f141226g;
            String str5 = str;
            Boolean bool5 = fVar.f141228i;
            Boolean bool6 = fVar.f141230k;
            List<qu0.c> list2 = fVar.f141227h;
            List<l20.b> listE = list2 != null ? e(list2) : null;
            arrayList.add(new l20.c(l14, str4, bool3, numF, Integer.valueOf(iIntValue), null, fVar.f141229j, fVar.f141233n, bool5, fVar.f141232m, null, null, bool6, null, null, null, bool4, listE, null, i14, 322592, null));
            str = str5;
        }
        String str6 = str;
        List<i> list3 = bVar.f141191i;
        ArrayList arrayList2 = new ArrayList(y.r(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(g((i) it.next()));
        }
        List<h> list4 = bVar.f141192j;
        ArrayList arrayList3 = new ArrayList(y.r(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            h hVar = (h) it3.next();
            hVar.getClass();
            Long l15 = hVar.f141237a;
            String str7 = hVar.f141238b;
            pu0.g gVar2 = hVar.f141239c;
            Integer numF2 = gVar2 != null ? f(gVar2) : null;
            Boolean bool7 = hVar.f141240d;
            Integer num2 = hVar.f141241e;
            int iIntValue2 = num2 != null ? num2.intValue() : p.OTHER.f109040a;
            int i15 = hVar.f141242f;
            Iterator it4 = it3;
            Boolean bool8 = hVar.f141243g;
            Boolean bool9 = hVar.f141245i;
            Boolean bool10 = hVar.f141247k;
            Boolean bool11 = hVar.f141246j;
            String str8 = hVar.f141250n;
            String str9 = hVar.f141251o;
            String str10 = hVar.f141252p;
            h.a aVar = hVar.f141249m;
            String str11 = aVar != null ? aVar.f141259a : null;
            com.garmin.android.apps.connectmobile.contacts.model.a.C0538a c0538a = com.garmin.android.apps.connectmobile.contacts.model.a.f32736b;
            String str12 = hVar.f141248l;
            c0538a.getClass();
            arrayList3.add(new l20.c(l15, str7, bool7, numF2, Integer.valueOf(iIntValue2), null, bool11, str10, bool9, str9, null, str8, bool10, com.garmin.android.apps.connectmobile.contacts.model.a.C0538a.a(str12), hVar.f141251o, null, bool8, null, str11, i15, 131104, null));
            it3 = it4;
        }
        List<pu0.c> list5 = bVar.f141193k;
        ArrayList arrayList4 = new ArrayList(y.r(list5, 10));
        for (Iterator it5 = list5.iterator(); it5.hasNext(); it5 = it5) {
            pu0.c cVar = (pu0.c) it5.next();
            arrayList4.add(new l20.g(cVar.f141199a, cVar.f141200b, cVar.f141201c, cVar.f141202d, cVar.f141203e, cVar.f141204f, cVar.f141205g, cVar.f141206h, cVar.f141207i, cVar.f141208j, cVar.f141209k, cVar.f141210l, cVar.f141211m));
        }
        return new l20.a(str6, str2, str3, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zG), bool2, arrayList, arrayList2, arrayList3, arrayList4, bVar.f141194l, bVar.f141196n, bVar.f141195m);
    }

    public static final List<pu0.b> c(List<l20.a> list) {
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((l20.a) it.next()));
        }
        return arrayList;
    }

    public static final pu0.g d(Integer num) {
        if (num == null) {
            return null;
        }
        m.f109021b.getClass();
        int i14 = C2452a.f127891a[m.a.a(num).ordinal()];
        if (i14 == 1) {
            return pu0.g.b.f141235a;
        }
        if (i14 == 2) {
            return pu0.g.a.f141234a;
        }
        if (i14 == 3) {
            return pu0.g.c.f141236a;
        }
        u0.r();
        return null;
    }

    public static final List<l20.b> e(List<qu0.c> list) {
        l lVar;
        String str;
        Object next;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (qu0.c cVar : list) {
            qu0.d dVar = cVar.f147880a;
            String str2 = null;
            if (dVar == null || (str = dVar.f147886a) == null) {
                lVar = null;
            } else {
                l.f109015b.getClass();
                Iterator<T> it = l.f109019f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!u.q(((l) next).f109020a, str, true));
                lVar = (l) next;
            }
            com.garmin.android.apps.connectmobile.contacts.model.a.C0538a c0538a = com.garmin.android.apps.connectmobile.contacts.model.a.f32736b;
            qu0.b bVar = cVar.f147881b;
            if (bVar != null) {
                str2 = bVar.f147878a;
            }
            c0538a.getClass();
            arrayList.add(new l20.b(lVar, com.garmin.android.apps.connectmobile.contacts.model.a.C0538a.a(str2), null, null, null, null, 60, null));
        }
        return arrayList;
    }

    public static final Integer f(pu0.g gVar) {
        if (gVar == null) {
            return null;
        }
        if (gVar.equals(pu0.g.b.f141235a)) {
            return Integer.valueOf(m.NONE.f109026a);
        }
        if (gVar.equals(pu0.g.a.f141234a)) {
            return Integer.valueOf(m.AUTO_LIVE_TRACK.f109026a);
        }
        if (gVar.equals(pu0.g.c.f141236a)) {
            return Integer.valueOf(m.PRIMARY.f109026a);
        }
        u0.r();
        return null;
    }

    public static final l20.c g(i iVar) {
        iVar.getClass();
        Long l14 = iVar.f141260a;
        String str = iVar.f141261b;
        pu0.g gVar = iVar.f141262c;
        Integer numF = gVar != null ? f(gVar) : null;
        Boolean bool = iVar.f141263d;
        Integer num = iVar.f141264e;
        int iIntValue = num != null ? num.intValue() : p.OTHER.f109040a;
        int i14 = iVar.f141265f;
        Boolean bool2 = iVar.f141266g;
        Boolean bool3 = iVar.f141269j;
        Boolean bool4 = iVar.f141271l;
        Boolean bool5 = iVar.f141270k;
        String str2 = iVar.f141273n;
        List<l20.b> listE = e(iVar.f141268i);
        return new l20.c(l14, str, bool, numF, Integer.valueOf(iIntValue), null, bool5, iVar.f141275p, bool3, iVar.f141274o, null, str2, bool4, null, null, null, bool2, listE, null, i14, 320544, null);
    }

    public static final ArrayList h(List list) {
        Object next;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l20.b bVar = (l20.b) it.next();
            qu0.d.a aVar = qu0.d.f147882b;
            l featureName = bVar.getFeatureName();
            Object obj = null;
            String str = featureName != null ? featureName.f109020a : null;
            aVar.getClass();
            Iterator<T> it3 = qu0.d.f147885e.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((qu0.d) next).f147886a, str));
            qu0.d dVar = (qu0.d) next;
            qu0.b.a aVar2 = qu0.b.f147871c;
            com.garmin.android.apps.connectmobile.contacts.model.a featureConfirmationStatus = bVar.getFeatureConfirmationStatus();
            String str2 = featureConfirmationStatus != null ? featureConfirmationStatus.f32745a : null;
            aVar2.getClass();
            for (Object obj2 : qu0.b.f147877i) {
                if (s.g(((qu0.b) obj2).f147878a, str2)) {
                    obj = obj2;
                    break;
                }
            }
            qu0.b bVar2 = (qu0.b) obj;
            if (bVar2 == null) {
                bVar2 = qu0.b.f147872d;
            }
            arrayList.add(new qu0.c(dVar, bVar2));
        }
        return arrayList;
    }
}
