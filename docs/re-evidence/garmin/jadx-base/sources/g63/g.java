package g63;

import ew1.c2;
import fe2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg63/g;", "Output", "Lg63/m;", "", "Lg63/e;", "consumers", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<Output> implements m<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e<Output>> f76137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76139c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends e<? super Output>> list) {
        boolean z14;
        boolean z15;
        int i14;
        list.getClass();
        this.f76137a = list;
        Iterator it = list.iterator();
        int i15 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer f76130a = ((e) it.next()).getF76130a();
            if (f76130a != null) {
                iIntValue = f76130a.intValue();
            }
            i15 += iIntValue;
        }
        this.f76138b = i15;
        List<e<Output>> list2 = this.f76137a;
        if (list2.isEmpty()) {
            z14 = false;
            break;
        }
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (((e) it3.next()).getF76130a() == null) {
                    z14 = true;
                    break;
                }
            } else {
                z14 = false;
                break;
            }
        }
        this.f76139c = z14;
        List<e<Output>> list3 = this.f76137a;
        if (list3.isEmpty()) {
            z15 = true;
            break;
        }
        Iterator<T> it4 = list3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z15 = true;
                break;
            }
            Integer f76130a2 = ((e) it4.next()).getF76130a();
            if (!((f76130a2 != null ? f76130a2.intValue() : Integer.MAX_VALUE) > 0)) {
                z15 = false;
                break;
            }
        }
        if (!z15) {
            vb.h.s("Failed requirement.");
            throw null;
        }
        List<e<Output>> list4 = this.f76137a;
        if (list4.isEmpty()) {
            i14 = 0;
        } else {
            Iterator<T> it5 = list4.iterator();
            i14 = 0;
            while (it5.hasNext()) {
                if ((((e) it5.next()).getF76130a() == null) && (i14 = i14 + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        }
        if (i14 <= 1) {
            return;
        }
        List<e<Output>> list5 = this.f76137a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((e) obj).getF76130a() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((e) it6.next()).f76131b);
        }
        androidx.core.view.j.s("At most one variable-length numeric field in a row is allowed, but got several: ", arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.");
        throw null;
    }

    @Override // g63.m
    public final Object a(c cVar, CharSequence charSequence, int i14) {
        charSequence.getClass();
        int i15 = this.f76138b;
        if (i14 + i15 > charSequence.length()) {
            i.a aVar = i.f76142b;
            z zVar = new z(this, 13);
            aVar.getClass();
            return new h(i14, zVar);
        }
        p0 p0Var = new p0();
        while (p0Var.f105807a + i14 < charSequence.length() && dh.b.G(charSequence.charAt(p0Var.f105807a + i14))) {
            p0Var.f105807a++;
        }
        if (p0Var.f105807a < i15) {
            i.a aVar2 = i.f76142b;
            c2 c2Var = new c2(25, p0Var, this);
            aVar2.getClass();
            return new h(i14, c2Var);
        }
        List<e<Output>> list = this.f76137a;
        int size = list.size();
        int i16 = 0;
        while (i16 < size) {
            Integer f76130a = list.get(i16).getF76130a();
            int iIntValue = (f76130a != null ? f76130a.intValue() : (p0Var.f105807a - i15) + 1) + i14;
            f fVarA = list.get(i16).a(cVar, charSequence, i14, iIntValue);
            if (fVarA != null) {
                String string = charSequence.subSequence(i14, iIntValue).toString();
                i.a aVar3 = i.f76142b;
                b21.k kVar = new b21.k(string, this, i16, fVarA, 2);
                aVar3.getClass();
                return new h(i14, kVar);
            }
            i16++;
            i14 = iIntValue;
        }
        i.f76142b.getClass();
        return Integer.valueOf(i14);
    }

    public final String b() {
        String str;
        List<e<Output>> list = this.f76137a;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            StringBuilder sb3 = new StringBuilder();
            Integer f76130a = eVar.getF76130a();
            if (f76130a == null) {
                str = "at least one digit";
            } else {
                str = f76130a + " digits";
            }
            sb3.append(str);
            sb3.append(" for ");
            sb3.append(eVar.f76131b);
            arrayList.add(sb3.toString());
        }
        boolean z14 = this.f76139c;
        int i14 = this.f76138b;
        if (z14) {
            return "a number with at least " + i14 + " digits: " + arrayList;
        }
        return "a number with exactly " + i14 + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
