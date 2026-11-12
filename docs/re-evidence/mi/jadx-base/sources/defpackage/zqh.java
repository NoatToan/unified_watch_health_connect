package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;

/* JADX INFO: loaded from: classes3.dex */
public class zqh {
    public static final ConcurrentMap<String, Pattern> j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41565b;
    public int c;
    public boolean d;
    public f e;
    public List<Object> f;
    public boolean g;
    public boolean h;
    public c[] i;

    public static class a implements brh, arh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final brh[] f41566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final arh[] f41567b;

        public a(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.f41566a = null;
            } else {
                this.f41566a = (brh[]) arrayList.toArray(new brh[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.f41567b = null;
            } else {
                this.f41567b = (arh[]) arrayList2.toArray(new arh[arrayList2.size()]);
            }
        }

        @Override // defpackage.brh
        public int a(qgj qgjVar, int i, Locale locale) {
            brh[] brhVarArr = this.f41566a;
            int length = brhVarArr.length;
            int iA = 0;
            while (iA < i) {
                length--;
                if (length < 0) {
                    break;
                }
                iA += brhVarArr[length].a(qgjVar, Integer.MAX_VALUE, locale);
            }
            return iA;
        }

        @Override // defpackage.brh
        public void b(StringBuffer stringBuffer, qgj qgjVar, Locale locale) {
            for (brh brhVar : this.f41566a) {
                brhVar.b(stringBuffer, qgjVar, locale);
            }
        }

        @Override // defpackage.arh
        public int c(fgj fgjVar, String str, int i, Locale locale) {
            arh[] arhVarArr = this.f41567b;
            if (arhVarArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = arhVarArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = arhVarArr[i2].c(fgjVar, str, i, locale);
            }
            return i;
        }

        @Override // defpackage.brh
        public int d(qgj qgjVar, Locale locale) {
            brh[] brhVarArr = this.f41566a;
            int length = brhVarArr.length;
            int iD = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return iD;
                }
                iD += brhVarArr[length].d(qgjVar, locale);
            }
        }

        public final void e(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        public final void f(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof brh) {
                    if (obj instanceof a) {
                        e(list2, ((a) obj).f41566a);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof arh) {
                    if (obj2 instanceof a) {
                        e(list3, ((a) obj2).f41567b);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f41568b;
        public final f c;
        public final String[] d;

        public b(f fVar, f fVar2) {
            this.f41568b = fVar;
            this.c = fVar2;
            HashSet hashSet = new HashSet();
            for (String str : fVar.e()) {
                for (String str2 : this.c.e()) {
                    hashSet.add(str + str2);
                }
            }
            this.d = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // zqh.f
        public int a(String str, int i) {
            int iA;
            int iA2 = this.f41568b.a(str, i);
            if (iA2 < 0 || ((iA = this.c.a(str, this.f41568b.b(str, iA2))) >= 0 && g(this.c.b(str, iA) - iA2, str, i))) {
                return ~i;
            }
            return iA2 > 0 ? iA2 : iA;
        }

        @Override // zqh.f
        public int b(String str, int i) {
            int iB = this.f41568b.b(str, i);
            return (iB < 0 || (iB = this.c.b(str, iB)) < 0 || !g(b(str, iB) - iB, str, i)) ? iB : ~i;
        }

        @Override // zqh.f
        public void c(StringBuffer stringBuffer, int i) {
            this.f41568b.c(stringBuffer, i);
            this.c.c(stringBuffer, i);
        }

        @Override // zqh.f
        public int d(int i) {
            return this.f41568b.d(i) + this.c.d(i);
        }

        @Override // zqh.f
        public String[] e() {
            return (String[]) this.d.clone();
        }
    }

    public static abstract class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile String[] f41571a;

        @Override // zqh.f
        public void f(Set<f> set) {
            if (this.f41571a == null) {
                int length = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : e()) {
                    if (str2.length() < length) {
                        length = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (f fVar : set) {
                    if (fVar != null) {
                        for (String str3 : fVar.e()) {
                            if (str3.length() > length || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.f41571a = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        public boolean g(int i, String str, int i2) {
            if (this.f41571a != null) {
                for (String str2 : this.f41571a) {
                    int length = str2.length();
                    if (i < length && str.regionMatches(true, i2, str2, 0, length)) {
                        return true;
                    }
                    if (i == length && str.regionMatches(false, i2, str2, 0, length)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class e implements brh, arh {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f41572b = new e("");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41573a;

        public e(String str) {
            this.f41573a = str;
        }

        @Override // defpackage.brh
        public int a(qgj qgjVar, int i, Locale locale) {
            return 0;
        }

        @Override // defpackage.brh
        public void b(StringBuffer stringBuffer, qgj qgjVar, Locale locale) {
            stringBuffer.append(this.f41573a);
        }

        @Override // defpackage.arh
        public int c(fgj fgjVar, String str, int i, Locale locale) {
            String str2 = this.f41573a;
            return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.f41573a.length() : ~i;
        }

        @Override // defpackage.brh
        public int d(qgj qgjVar, Locale locale) {
            return this.f41573a.length();
        }
    }

    public interface f {
        int a(String str, int i);

        int b(String str, int i);

        void c(StringBuffer stringBuffer, int i);

        int d(int i);

        String[] e();

        void f(Set<f> set);
    }

    public static class g implements brh, arh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41575b;
        public final String[] c;
        public final boolean d;
        public final boolean e;
        public final brh f;
        public volatile brh g;
        public final arh h;
        public volatile arh i;

        public g(String str, String str2, String[] strArr, brh brhVar, arh arhVar, boolean z, boolean z2) {
            this.f41574a = str;
            this.f41575b = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.c = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.f = brhVar;
            this.h = arhVar;
            this.d = z;
            this.e = z2;
        }

        @Override // defpackage.brh
        public int a(qgj qgjVar, int i, Locale locale) {
            int iA = this.f.a(qgjVar, i, locale);
            return iA < i ? iA + this.g.a(qgjVar, i, locale) : iA;
        }

        @Override // defpackage.brh
        public void b(StringBuffer stringBuffer, qgj qgjVar, Locale locale) {
            brh brhVar = this.f;
            brh brhVar2 = this.g;
            brhVar.b(stringBuffer, qgjVar, locale);
            if (this.d) {
                if (brhVar.a(qgjVar, 1, locale) > 0) {
                    if (this.e) {
                        int iA = brhVar2.a(qgjVar, 2, locale);
                        if (iA > 0) {
                            stringBuffer.append(iA > 1 ? this.f41574a : this.f41575b);
                        }
                    } else {
                        stringBuffer.append(this.f41574a);
                    }
                }
            } else if (this.e && brhVar2.a(qgjVar, 1, locale) > 0) {
                stringBuffer.append(this.f41574a);
            }
            brhVar2.b(stringBuffer, qgjVar, locale);
        }

        @Override // defpackage.arh
        public int c(fgj fgjVar, String str, int i, Locale locale) {
            int i2;
            int iC = this.h.c(fgjVar, str, i, locale);
            if (iC < 0) {
                return iC;
            }
            int length = 0;
            if (iC > i) {
                String[] strArr = this.c;
                int length2 = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i2 = -1;
                    } else {
                        String str2 = strArr[i3];
                        if (str2 == null || str2.length() == 0 || str.regionMatches(true, iC, str2, 0, str2.length())) {
                            length = str2 != null ? str2.length() : 0;
                            iC += length;
                            int i4 = length;
                            length = 1;
                            i2 = i4;
                        } else {
                            i3++;
                        }
                    }
                }
            } else {
                i2 = -1;
            }
            int iC2 = this.i.c(fgjVar, str, iC, locale);
            if (iC2 < 0) {
                return iC2;
            }
            if (length == 0 || iC2 != iC || i2 <= 0) {
                return (iC2 <= iC || length != 0 || this.d) ? iC2 : ~iC;
            }
            return ~iC;
        }

        @Override // defpackage.brh
        public int d(qgj qgjVar, Locale locale) {
            int length;
            brh brhVar = this.f;
            brh brhVar2 = this.g;
            int iD = brhVar.d(qgjVar, locale) + brhVar2.d(qgjVar, locale);
            if (this.d) {
                if (brhVar.a(qgjVar, 1, locale) <= 0) {
                    return iD;
                }
                if (this.e) {
                    int iA = brhVar2.a(qgjVar, 2, locale);
                    if (iA <= 0) {
                        return iD;
                    }
                    length = (iA > 1 ? this.f41574a : this.f41575b).length();
                } else {
                    length = this.f41574a.length();
                }
            } else {
                if (!this.e || brhVar2.a(qgjVar, 1, locale) <= 0) {
                    return iD;
                }
                length = this.f41574a.length();
            }
            return iD + length;
        }

        public g g(brh brhVar, arh arhVar) {
            this.g = brhVar;
            this.i = arhVar;
            return this;
        }
    }

    public static class h extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41576b;

        public h(String str) {
            this.f41576b = str;
        }

        @Override // zqh.f
        public int a(String str, int i) {
            String str2 = this.f41576b;
            int length = str2.length();
            int length2 = str.length();
            for (int i2 = i; i2 < length2; i2++) {
                if (str.regionMatches(true, i2, str2, 0, length) && !g(length, str, i2)) {
                    return i2;
                }
                switch (str.charAt(i2)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                }
                return ~i;
            }
            return ~i;
        }

        @Override // zqh.f
        public int b(String str, int i) {
            String str2 = this.f41576b;
            int length = str2.length();
            return (!str.regionMatches(true, i, str2, 0, length) || g(length, str, i)) ? ~i : i + length;
        }

        @Override // zqh.f
        public void c(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.f41576b);
        }

        @Override // zqh.f
        public int d(int i) {
            return this.f41576b.length();
        }

        @Override // zqh.f
        public String[] e() {
            return new String[]{this.f41576b};
        }
    }

    public zqh() {
        p();
    }

    public static Object[] r(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            e eVar = e.f41572b;
            return new Object[]{eVar, eVar};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        a aVar = new a(list);
        return new Object[]{aVar, aVar};
    }

    public static yqh t(List<Object> list, boolean z, boolean z2) {
        if (z && z2) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof g)) {
            g gVar = (g) list.get(0);
            if (gVar.i == null && gVar.g == null) {
                yqh yqhVarT = t(list.subList(2, size), z, z2);
                g gVarG = gVar.g(yqhVarT.e(), yqhVarT.d());
                return new yqh(gVarG, gVarG);
            }
        }
        Object[] objArrR = r(list);
        if (z) {
            return new yqh(null, (arh) objArrR[1]);
        }
        return z2 ? new yqh((brh) objArrR[0], null) : new yqh((brh) objArrR[0], (arh) objArrR[1]);
    }

    public final zqh a(brh brhVar, arh arhVar) {
        this.f.add(brhVar);
        this.f.add(arhVar);
        this.g = (brhVar == null) | this.g;
        this.h |= arhVar == null;
        return this;
    }

    public zqh b() {
        c(3);
        return this;
    }

    public final void c(int i) {
        d(i, this.f41564a);
    }

    public final void d(int i, int i2) {
        c cVar = new c(i2, this.f41565b, this.c, this.d, i, this.i, this.e, null);
        a(cVar, cVar);
        this.i[i] = cVar;
        this.e = null;
    }

    public zqh e() {
        c(4);
        return this;
    }

    public zqh f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        q();
        e eVar = new e(str);
        a(eVar, eVar);
        return this;
    }

    public zqh g() {
        c(5);
        return this;
    }

    public zqh h() {
        c(1);
        return this;
    }

    public zqh i() {
        c(9);
        return this;
    }

    public final zqh j(String str, String str2, String[] strArr, boolean z, boolean z2) {
        g gVar;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        q();
        List<Object> listSubList = this.f;
        if (listSubList.size() == 0) {
            if (z2 && !z) {
                e eVar = e.f41572b;
                g gVar2 = new g(str, str2, strArr, eVar, eVar, z, z2);
                a(gVar2, gVar2);
            }
            return this;
        }
        int size = listSubList.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                gVar = null;
                break;
            }
            if (listSubList.get(i) instanceof g) {
                gVar = (g) listSubList.get(i);
                listSubList = listSubList.subList(size, listSubList.size());
                break;
            }
            size -= 2;
        }
        List<Object> list = listSubList;
        if (gVar != null && list.size() == 0) {
            throw new IllegalStateException("Cannot have two adjacent separators");
        }
        Object[] objArrR = r(list);
        list.clear();
        g gVar3 = new g(str, str2, strArr, (brh) objArrR[0], (arh) objArrR[1], z, z2);
        list.add(gVar3);
        list.add(gVar3);
        return this;
    }

    public zqh k(String str) {
        return j(str, str, null, false, true);
    }

    public final zqh l(f fVar) {
        Object obj;
        Object obj2;
        if (this.f.size() > 0) {
            List<Object> list = this.f;
            obj = list.get(list.size() - 2);
            List<Object> list2 = this.f;
            obj2 = list2.get(list2.size() - 1);
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj == null || obj2 == null || obj != obj2 || !(obj instanceof c)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        q();
        c cVar = new c((c) obj, fVar);
        List<Object> list3 = this.f;
        list3.set(list3.size() - 2, cVar);
        List<Object> list4 = this.f;
        list4.set(list4.size() - 1, cVar);
        this.i[cVar.f()] = cVar;
        return this;
    }

    public zqh m(String str) {
        if (str != null) {
            return l(new h(str));
        }
        throw new IllegalArgumentException();
    }

    public zqh n() {
        c(2);
        return this;
    }

    public zqh o() {
        c(0);
        return this;
    }

    public void p() {
        this.f41564a = 1;
        this.f41565b = 2;
        this.c = 10;
        this.d = false;
        this.e = null;
        List<Object> list = this.f;
        if (list == null) {
            this.f = new ArrayList();
        } else {
            list.clear();
        }
        this.g = false;
        this.h = false;
        this.i = new c[10];
    }

    public final void q() throws IllegalStateException {
        if (this.e != null) {
            throw new IllegalStateException("Prefix not followed by field");
        }
        this.e = null;
    }

    public yqh s() {
        yqh yqhVarT = t(this.f, this.g, this.h);
        for (c cVar : this.i) {
            if (cVar != null) {
                cVar.e(this.i);
            }
        }
        this.i = (c[]) this.i.clone();
        return yqhVarT;
    }

    public static class c implements brh, arh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41570b;
        public final int c;
        public final boolean d;
        public final int e;
        public final c[] f;
        public final f g;
        public final f h;

        public c(int i, int i2, int i3, boolean z, int i4, c[] cVarArr, f fVar, f fVar2) {
            this.f41569a = i;
            this.f41570b = i2;
            this.c = i3;
            this.d = z;
            this.e = i4;
            this.f = cVarArr;
            this.g = fVar;
            this.h = fVar2;
        }

        @Override // defpackage.brh
        public int a(qgj qgjVar, int i, Locale locale) {
            if (i <= 0) {
                return 0;
            }
            return (this.f41570b == 4 || g(qgjVar) != Long.MAX_VALUE) ? 1 : 0;
        }

        @Override // defpackage.brh
        public void b(StringBuffer stringBuffer, qgj qgjVar, Locale locale) {
            long jG = g(qgjVar);
            if (jG == Long.MAX_VALUE) {
                return;
            }
            int i = (int) jG;
            if (this.e >= 8) {
                i = (int) (jG / 1000);
            }
            f fVar = this.g;
            if (fVar != null) {
                fVar.c(stringBuffer, i);
            }
            int length = stringBuffer.length();
            int i2 = this.f41569a;
            if (i2 <= 1) {
                d1a.e(stringBuffer, i);
            } else {
                d1a.b(stringBuffer, i, i2);
            }
            if (this.e >= 8) {
                int iAbs = (int) (Math.abs(jG) % 1000);
                if (this.e == 8 || iAbs > 0) {
                    if (jG < 0 && jG > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    d1a.b(stringBuffer, iAbs, 3);
                }
            }
            f fVar2 = this.h;
            if (fVar2 != null) {
                fVar2.c(stringBuffer, i);
            }
        }

        @Override // defpackage.arh
        public int c(fgj fgjVar, String str, int i, Locale locale) {
            int iA;
            f fVar;
            int i2;
            char cCharAt;
            int iB = i;
            boolean z = this.f41570b == 4;
            if (iB >= str.length()) {
                return z ? ~iB : iB;
            }
            f fVar2 = this.g;
            if (fVar2 != null) {
                iB = fVar2.b(str, iB);
                if (iB < 0) {
                    return !z ? ~iB : iB;
                }
                z = true;
            }
            f fVar3 = this.h;
            int i3 = -1;
            if (fVar3 == null || z) {
                iA = -1;
            } else {
                iA = fVar3.a(str, iB);
                if (iA < 0) {
                    return !z ? ~iA : iA;
                }
                z = true;
            }
            if (!z && !h(fgjVar.getPeriodType(), this.e)) {
                return iB;
            }
            int iMin = iA > 0 ? Math.min(this.c, iA - iB) : Math.min(this.c, str.length() - iB);
            int i4 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i4 < iMin) {
                int i5 = iB + i4;
                char cCharAt2 = str.charAt(i5);
                if (i4 != 0 || (!(cCharAt2 == '-' || cCharAt2 == '+') || this.d)) {
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        z2 = true;
                    } else {
                        if ((cCharAt2 != '.' && cCharAt2 != ',') || (((i2 = this.e) != 8 && i2 != 9) || i3 >= 0)) {
                            break;
                        }
                        iMin = Math.min(iMin + 1, str.length() - iB);
                        i3 = i5 + 1;
                    }
                    i4++;
                } else {
                    z3 = cCharAt2 == '-';
                    int i6 = i4 + 1;
                    if (i6 >= iMin || (cCharAt = str.charAt(i5 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    if (z3) {
                        i4 = i6;
                    } else {
                        iB++;
                    }
                    iMin = Math.min(iMin + 1, str.length() - iB);
                }
            }
            if (!z2) {
                return ~iB;
            }
            if (iA >= 0 && iB + i4 != iA) {
                return iB;
            }
            int i7 = this.e;
            if (i7 != 8 && i7 != 9) {
                k(fgjVar, i7, j(str, iB, i4));
            } else if (i3 < 0) {
                k(fgjVar, 6, j(str, iB, i4));
                k(fgjVar, 7, 0);
            } else {
                int iJ = 0;
                int iJ2 = j(str, iB, (i3 - iB) - 1);
                k(fgjVar, 6, iJ2);
                int i8 = (iB + i4) - i3;
                if (i8 > 0) {
                    if (i8 >= 3) {
                        iJ = j(str, i3, 3);
                    } else {
                        int iJ3 = j(str, i3, i8);
                        iJ = i8 == 1 ? iJ3 * 100 : iJ3 * 10;
                    }
                    if (z3 || iJ2 < 0) {
                        iJ = -iJ;
                    }
                }
                k(fgjVar, 7, iJ);
            }
            int i9 = iB + i4;
            return (i9 < 0 || (fVar = this.h) == null) ? i9 : fVar.b(str, i9);
        }

        @Override // defpackage.brh
        public int d(qgj qgjVar, Locale locale) {
            long jG = g(qgjVar);
            if (jG == Long.MAX_VALUE) {
                return 0;
            }
            int iMax = Math.max(d1a.g(jG), this.f41569a);
            if (this.e >= 8) {
                int iMax2 = Math.max(iMax, jG < 0 ? 5 : 4);
                iMax = (this.e == 9 && Math.abs(jG) % 1000 == 0) ? iMax2 - 3 : iMax2 + 1;
                jG /= 1000;
            }
            int i = (int) jG;
            f fVar = this.g;
            if (fVar != null) {
                iMax += fVar.d(i);
            }
            f fVar2 = this.h;
            return fVar2 != null ? iMax + fVar2.d(i) : iMax;
        }

        public void e(c[] cVarArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (c cVar : cVarArr) {
                if (cVar != null && !equals(cVar)) {
                    hashSet.add(cVar.g);
                    hashSet2.add(cVar.h);
                }
            }
            f fVar = this.g;
            if (fVar != null) {
                fVar.f(hashSet);
            }
            f fVar2 = this.h;
            if (fVar2 != null) {
                fVar2.f(hashSet2);
            }
        }

        public int f() {
            return this.e;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:28:0x008c  */
        /* JADX WARN: Code duplicated, block: B:30:0x008f  */
        /* JADX WARN: Code duplicated, block: B:33:0x0093 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0094  */
        /* JADX WARN: Code duplicated, block: B:36:0x009a  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00be  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:63:0x00b4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00d6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00cc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        public long g(qgj qgjVar) {
            int i;
            long j;
            int i2;
            c[] cVarArr;
            int i3;
            int iMin;
            c[] cVarArr2;
            int i4;
            int i5;
            PeriodType periodType = this.f41570b == 4 ? null : qgjVar.getPeriodType();
            if (periodType != null && !h(periodType, this.e)) {
                return Long.MAX_VALUE;
            }
            switch (this.e) {
                case 0:
                    i = qgjVar.get(DurationFieldType.years());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin) || this.f[iMin] == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    for (i5 = i4 + 1; i5 <= 9; i5++) {
                                        if (!h(periodType, i5) && this.f[i5] != null) {
                                            return Long.MAX_VALUE;
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 1:
                    i = qgjVar.get(DurationFieldType.months());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 2:
                    i = qgjVar.get(DurationFieldType.weeks());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 3:
                    i = qgjVar.get(DurationFieldType.days());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 4:
                    i = qgjVar.get(DurationFieldType.hours());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 5:
                    i = qgjVar.get(DurationFieldType.minutes());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 6:
                    i = qgjVar.get(DurationFieldType.seconds());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 7:
                    i = qgjVar.get(DurationFieldType.millis());
                    j = i;
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                case 8:
                case 9:
                    j = (((long) qgjVar.get(DurationFieldType.seconds())) * 1000) + ((long) qgjVar.get(DurationFieldType.millis()));
                    if (j == 0) {
                        i2 = this.f41570b;
                        if (i2 == 1) {
                            if (i(qgjVar)) {
                                cVarArr = this.f;
                                i3 = this.e;
                                if (cVarArr[i3] == this) {
                                    iMin = Math.min(i3, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (h(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 2) {
                            if (i(qgjVar)) {
                                cVarArr2 = this.f;
                                i4 = this.e;
                                if (cVarArr2[i4] == this) {
                                    while (i5 <= 9) {
                                        if (!h(periodType, i5)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j;
                default:
                    return Long.MAX_VALUE;
            }
        }

        public boolean h(PeriodType periodType, int i) {
            switch (i) {
                case 0:
                    return periodType.isSupported(DurationFieldType.years());
                case 1:
                    return periodType.isSupported(DurationFieldType.months());
                case 2:
                    return periodType.isSupported(DurationFieldType.weeks());
                case 3:
                    return periodType.isSupported(DurationFieldType.days());
                case 4:
                    return periodType.isSupported(DurationFieldType.hours());
                case 5:
                    return periodType.isSupported(DurationFieldType.minutes());
                case 6:
                    return periodType.isSupported(DurationFieldType.seconds());
                case 7:
                    return periodType.isSupported(DurationFieldType.millis());
                case 8:
                case 9:
                    return periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis());
                default:
                    return false;
            }
        }

        public boolean i(qgj qgjVar) {
            int size = qgjVar.size();
            for (int i = 0; i < size; i++) {
                if (qgjVar.getValue(i) != 0) {
                    return false;
                }
            }
            return true;
        }

        public final int j(String str, int i, int i2) {
            if (i2 >= 10) {
                return Integer.parseInt(str.substring(i, i2 + i));
            }
            boolean z = false;
            if (i2 <= 0) {
                return 0;
            }
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            int i4 = i2 - 1;
            if (cCharAt == '-') {
                i4 = i2 - 2;
                if (i4 < 0) {
                    return 0;
                }
                cCharAt = str.charAt(i3);
                z = true;
                i3 = i + 2;
            }
            int i5 = cCharAt - '0';
            while (true) {
                int i6 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                int iCharAt = (((i5 << 3) + (i5 << 1)) + str.charAt(i3)) - 48;
                i4 = i6;
                i3++;
                i5 = iCharAt;
            }
            return z ? -i5 : i5;
        }

        public void k(fgj fgjVar, int i, int i2) {
            switch (i) {
                case 0:
                    fgjVar.setYears(i2);
                    break;
                case 1:
                    fgjVar.setMonths(i2);
                    break;
                case 2:
                    fgjVar.setWeeks(i2);
                    break;
                case 3:
                    fgjVar.setDays(i2);
                    break;
                case 4:
                    fgjVar.setHours(i2);
                    break;
                case 5:
                    fgjVar.setMinutes(i2);
                    break;
                case 6:
                    fgjVar.setSeconds(i2);
                    break;
                case 7:
                    fgjVar.setMillis(i2);
                    break;
            }
        }

        public c(c cVar, f fVar) {
            this.f41569a = cVar.f41569a;
            this.f41570b = cVar.f41570b;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            f fVar2 = cVar.h;
            this.h = fVar2 != null ? new b(fVar2, fVar) : fVar;
        }
    }
}
