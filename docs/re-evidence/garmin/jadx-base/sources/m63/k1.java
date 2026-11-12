package m63;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k63.e[] f116969a = new k63.e[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i63.c[] f116970b = new i63.c[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f116971c = new Object();

    public static final j0 a(String str, i63.c cVar) {
        cVar.getClass();
        return new j0(str, new k0(cVar));
    }

    public static final Set b(k63.e eVar) {
        eVar.getClass();
        if (eVar instanceof k) {
            return ((k) eVar).a();
        }
        HashSet hashSet = new HashSet(eVar.getF116985c());
        int iC = eVar.getF116985c();
        for (int i14 = 0; i14 < iC; i14++) {
            hashSet.add(eVar.d(i14));
        }
        return hashSet;
    }

    public static final k63.e[] c(List list) {
        k63.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (k63.e[]) list.toArray(new k63.e[0])) == null) ? f116969a : eVarArr;
    }

    public static final b0 d(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        a0 a0Var = new a0(str, enumArr.length);
        int length = enumArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            Enum r14 = enumArr[i14];
            int i16 = i15 + 1;
            String strName = (String) p13.u.L(i15, strArr);
            if (strName == null) {
                strName = r14.name();
            }
            a0Var.j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) p13.u.L(i15, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i17 = a0Var.f116986d;
                    List<Annotation>[] listArr = a0Var.f116988f;
                    List<Annotation> arrayList = listArr[i17];
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(1);
                        listArr[a0Var.f116986d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i14++;
            i15 = i16;
        }
        return new b0(str, enumArr, a0Var);
    }

    public static final int e(k63.e eVar, k63.e[] eVarArr) {
        eVarArr.getClass();
        int iHashCode = (eVar.getF116983a().hashCode() * 31) + Arrays.hashCode(eVarArr);
        k63.i iVar = new k63.i(eVar);
        Iterator<k63.e> it = iVar.iterator();
        int iHashCode2 = 1;
        int i14 = 1;
        while (true) {
            k63.g gVar = (k63.g) it;
            int iHashCode3 = 0;
            if (!gVar.hasNext()) {
                break;
            }
            int i15 = i14 * 31;
            String f117004c = ((k63.e) gVar.next()).getF116983a();
            if (f117004c != null) {
                iHashCode3 = f117004c.hashCode();
            }
            i14 = i15 + iHashCode3;
        }
        Iterator<k63.e> it3 = iVar.iterator();
        while (true) {
            k63.g gVar2 = (k63.g) it3;
            if (!gVar2.hasNext()) {
                return (((iHashCode * 31) + i14) * 31) + iHashCode2;
            }
            int i16 = iHashCode2 * 31;
            k63.l kind = ((k63.e) gVar2.next()).getF103234b();
            iHashCode2 = i16 + (kind != null ? kind.hashCode() : 0);
        }
    }

    public static final k23.d f(k23.p pVar) {
        k23.e eVarG = pVar.getF105782a();
        if (eVarG instanceof k23.d) {
            return (k23.d) eVarG;
        }
        if (!(eVarG instanceof k23.q)) {
            com.google.firebase.messaging.l.j(eVarG, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + eVarG + " from generic non-reified function. Such functionality cannot be supported because " + eVarG + " is erased, either specify serializer explicitly or make calling function inline with reified " + eVarG + '.');
    }

    public static final String g(k23.d dVar) {
        dVar.getClass();
        String strD = dVar.D();
        if (strD == null) {
            strD = "<local class name not available>";
        }
        return am.j.m("Serializer for class '", strD, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final void h(int i14, int i15, k63.e eVar) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i16 = (~i14) & i15;
        for (int i17 = 0; i17 < 32; i17++) {
            if ((i16 & 1) != 0) {
                arrayList.add(eVar.d(i17));
            }
            i16 >>>= 1;
        }
        throw new MissingFieldException(arrayList, eVar.getF116983a());
    }

    public static final void i(String str, k23.d dVar) {
        String string;
        dVar.getClass();
        String str2 = "in the polymorphic scope of '" + dVar.D() + CoreConstants.SINGLE_QUOTE_CHAR;
        if (str == null) {
            string = o2.c.c('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbI = p6.b.i("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            sn.a.t(sbI, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbI.append(dVar.D());
            sbI.append("' has to be sealed and '@Serializable'.");
            string = sbI.toString();
        }
        throw new SerializationException(string);
    }

    public static final String j(k63.e eVar) {
        return p13.h0.k0(j23.t.o(0, eVar.getF116985c()), ", ", eVar.getF116983a() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", new kp2.a(eVar, 23), 24);
    }
}
