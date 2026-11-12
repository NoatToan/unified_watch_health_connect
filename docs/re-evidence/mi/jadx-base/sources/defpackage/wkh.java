package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.io.File;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public final class wkh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static jc4 f38062a = ocm.r("path parameter");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StringBuilder f38063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38064b;

        public a(String str, boolean z) {
            this.f38064b = z;
            this.f38063a = new StringBuilder(str);
        }

        public String toString() {
            return "Element(" + this.f38063a.toString() + "," + this.f38064b + ")";
        }
    }

    public static final class b {
        public final Iterator<zhp> c;
        public final uta d;
        public final xb4 e;
        public final ConfigSyntax f;
        public final jc4 g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38065a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Stack<c> f38066b = new Stack<>();
        public final LinkedList<qlh> h = new LinkedList<>();
        public int i = 0;
        public int j = 0;

        public b(ConfigSyntax configSyntax, jc4 jc4Var, Iterator<zhp> it, uta utaVar, xb4 xb4Var) {
            this.c = it;
            this.f = configSyntax;
            this.g = jc4Var;
            this.d = utaVar;
            this.e = xb4Var;
        }

        public static roo E(zhp zhpVar) {
            return new roo(wkh.g(oip.f(zhpVar).iterator(), zhpVar.d()), oip.e(zhpVar));
        }

        public static boolean e(zhp zhpVar) {
            return (oip.j(zhpVar) || zhpVar == oip.f29207a || zhpVar == oip.g || zhpVar == oip.i || zhpVar == oip.f29208b) ? false : true;
        }

        public static boolean f(zhp zhpVar) {
            return (oip.j(zhpVar) || zhpVar == oip.f29207a || zhpVar == oip.f || zhpVar == oip.h || zhpVar == oip.f29208b) ? false : true;
        }

        public static g00 j(qlh qlhVar, h00 h00Var) {
            ArrayList arrayList = new ArrayList();
            String strB = qlhVar.b();
            qlh qlhVarJ = qlhVar.j();
            while (strB != null) {
                arrayList.add(strB);
                if (qlhVarJ == null) {
                    break;
                }
                strB = qlhVarJ.b();
                qlhVarJ = qlhVarJ.j();
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            ncm ncmVar = new ncm(h00Var.g().u(null), Collections.singletonMap((String) listIterator.previous(), h00Var));
            while (listIterator.hasPrevious()) {
                ncmVar = new ncm(h00Var.g().u(null), Collections.singletonMap(listIterator.previous(), ncmVar));
            }
            return ncmVar;
        }

        public static boolean l(zhp zhpVar) {
            return oip.m(zhpVar) && oip.g(zhpVar).equals("include");
        }

        public static boolean n(zhp zhpVar) {
            if (!oip.m(zhpVar)) {
                return false;
            }
            String strG = oip.g(zhpVar);
            for (int i = 0; i < strG.length(); i++) {
                if (!wb4.c(strG.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        public final c A() {
            if (!this.f38066b.isEmpty()) {
                return this.f38066b.pop();
            }
            zhp next = this.c.next();
            if (!oip.i(next)) {
                return new c(next);
            }
            h(next);
            return this.f38066b.pop();
        }

        public final String B() {
            return C(null);
        }

        public final String C(qlh qlhVar) {
            if (qlhVar != null) {
                return qlhVar.k();
            }
            if (this.h.isEmpty()) {
                return null;
            }
            return this.h.peek().k();
        }

        public final void D(c cVar) {
            if (oip.i(cVar.f38067a)) {
                throw new ConfigException.BugOrBroken("comment token should have been stripped before it was available to put back");
            }
            this.f38066b.push(cVar);
        }

        public final h00 a(h00 h00Var) {
            c cVarP = p();
            if (cVarP.f38067a == oip.c) {
                D(cVarP.e());
                return h00Var.f0(cVarP.b(h00Var.g()));
            }
            D(cVarP);
            return h00Var;
        }

        public final String b(String str) {
            String strB = B();
            if (strB == null) {
                return str;
            }
            return "in value for key '" + strB + "': " + str;
        }

        public final String c(qlh qlhVar, boolean z, String str, String str2) {
            String str3;
            String strC = C(qlhVar);
            if (str.equals(oip.f29208b.toString())) {
                if (strC == null) {
                    return str2;
                }
                str3 = str2 + " (if you intended '" + strC + "' to be part of a value, instead of a key, try adding double quotes around the whole value";
            } else if (strC != null) {
                str3 = str2 + " (if you intended " + str + " to be part of the value for '" + strC + "', try enclosing the value in double quotes";
            } else {
                str3 = str2 + " (if you intended " + str + " to be part of a key or string value, try enclosing the key or value in double quotes";
            }
            if (z) {
                return str3 + ", or you may be able to rename the file .properties rather than .conf)";
            }
            return str3 + ")";
        }

        public final String d(String str, String str2) {
            return c(null, this.i > 0, str, str2);
        }

        public final boolean g() {
            boolean z = false;
            if (this.f == ConfigSyntax.JSON) {
                c cVarQ = q();
                if (cVarQ.f38067a == oip.c) {
                    return true;
                }
                D(cVarQ);
                return false;
            }
            c cVarP = p();
            while (oip.j(cVarP.f38067a)) {
                this.f38065a = cVarP.f38067a.b() + 1;
                cVarP = p();
                z = true;
            }
            if (cVarP.f38067a == oip.c) {
                return true;
            }
            D(cVarP);
            return z;
        }

        public final void h(zhp zhpVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            zhp zhpVar2 = null;
            while (true) {
                if (!oip.j(zhpVar)) {
                    if (!oip.i(zhpVar)) {
                        break;
                    } else {
                        arrayList2.add(zhpVar);
                    }
                } else {
                    if (zhpVar2 != null && oip.j(zhpVar2)) {
                        arrayList2.clear();
                    }
                    arrayList.add(zhpVar);
                }
                zhpVar2 = zhpVar;
                zhpVar = this.c.next();
            }
            if (!e(zhpVar)) {
                arrayList2.clear();
            }
            this.f38066b.push(new c(zhpVar, arrayList2));
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                this.f38066b.push(new c((zhp) listIterator.previous()));
            }
        }

        public final void i() {
            zhp zhpVar;
            if (this.f == ConfigSyntax.JSON) {
                return;
            }
            c cVarQ = q();
            ArrayList arrayList = null;
            while (true) {
                if (!oip.n(cVarQ.f38067a) && !oip.m(cVarQ.f38067a) && !oip.l(cVarQ.f38067a) && (zhpVar = cVarQ.f38067a) != oip.f && zhpVar != oip.h) {
                    D(cVarQ);
                    if (arrayList == null) {
                        return;
                    }
                    D(new c(oip.z(pb4.g0(arrayList))));
                    return;
                }
                h00 h00VarY = y(cVarQ);
                if (h00VarY == null) {
                    throw new ConfigException.BugOrBroken("no value");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(h00VarY);
                cVarQ = p();
            }
        }

        public final qlh k() {
            if (this.h.isEmpty()) {
                throw new ConfigException.BugOrBroken("Bug in parser; tried to get current path when at root");
            }
            return new qlh(this.h.descendingIterator());
        }

        public final boolean m(zhp zhpVar) {
            if (this.f == ConfigSyntax.JSON) {
                return zhpVar == oip.e;
            }
            return zhpVar == oip.e || zhpVar == oip.d || zhpVar == oip.j;
        }

        public final ocm o() {
            return ((ocm) this.g).v(this.f38065a);
        }

        public final c p() {
            c cVarZ = z();
            zhp zhpVar = cVarZ.f38067a;
            if (oip.k(zhpVar)) {
                jc4 jc4VarD = zhpVar.d();
                String strC = oip.c(zhpVar);
                throw new ConfigException.Parse(jc4VarD, oip.d(zhpVar) ? d(zhpVar.toString(), strC) : b(strC), oip.b(zhpVar));
            }
            if (this.f == ConfigSyntax.JSON) {
                if (oip.m(zhpVar)) {
                    throw t(b("Token not allowed in valid JSON: '" + oip.g(zhpVar) + "'"));
                }
                if (oip.l(zhpVar)) {
                    throw t(b("Substitutions (${} syntax) not allowed in JSON"));
                }
            }
            return cVarZ;
        }

        public final c q() {
            c cVarP = p();
            while (oip.j(cVarP.f38067a)) {
                this.f38065a = cVarP.f38067a.b() + 1;
                cVarP = p();
            }
            int iB = cVarP.f38067a.b();
            if (iB >= 0) {
                this.f38065a = iB;
            }
            return cVarP;
        }

        public h00 r() {
            h00 h00VarY;
            c cVarQ = q();
            if (cVarQ.f38067a != oip.f29207a) {
                throw new ConfigException.BugOrBroken("token stream did not begin with START, had " + cVarQ);
            }
            c cVarQ2 = q();
            zhp zhpVar = cVarQ2.f38067a;
            if (zhpVar == oip.f || zhpVar == oip.h) {
                h00VarY = y(cVarQ2);
            } else {
                if (this.f == ConfigSyntax.JSON) {
                    if (zhpVar == oip.f29208b) {
                        throw t("Empty document");
                    }
                    throw t("Document must have an object or array at root, unexpected token: " + cVarQ2);
                }
                D(cVarQ2);
                h00VarY = x(false);
            }
            c cVarQ3 = q();
            if (cVarQ3.f38067a == oip.f29208b) {
                return h00VarY;
            }
            throw t("Document has trailing tokens after first object or array: " + cVarQ3);
        }

        public final mcm s() {
            zhp zhpVar;
            zhp zhpVar2;
            this.j++;
            ocm ocmVarO = o();
            ArrayList arrayList = new ArrayList();
            i();
            c cVarQ = q();
            zhp zhpVar3 = cVarQ.f38067a;
            if (zhpVar3 == oip.i) {
                this.j--;
                return new mcm(cVarQ.b(ocmVarO), Collections.emptyList());
            }
            if (!oip.n(zhpVar3) && (zhpVar2 = cVarQ.f38067a) != oip.f && zhpVar2 != oip.h) {
                throw t(b("List should have ] or a first element after the open [, instead had token: " + cVarQ + " (if you want " + cVarQ + " to be part of a string value, then double-quote it)"));
            }
            arrayList.add(a(y(cVarQ)));
            while (g()) {
                i();
                c cVarQ2 = q();
                if (oip.n(cVarQ2.f38067a) || (zhpVar = cVarQ2.f38067a) == oip.f || zhpVar == oip.h) {
                    arrayList.add(a(y(cVarQ2)));
                } else {
                    if (this.f == ConfigSyntax.JSON || zhpVar != oip.i) {
                        throw t(b("List should have had new element after a comma, instead had token: " + cVarQ2 + " (if you want the comma or " + cVarQ2 + " to be part of a string value, then double-quote it)"));
                    }
                    D(cVarQ2);
                }
            }
            c cVarQ3 = q();
            if (cVarQ3.f38067a == oip.i) {
                this.j--;
                return new mcm(cVarQ3.b(ocmVarO), arrayList);
            }
            throw t(b("List should have ended with ] or had a comma, instead had token: " + cVarQ3 + " (if you want " + cVarQ3 + " to be part of a string value, then double-quote it)"));
        }

        public final ConfigException t(String str) {
            return u(str, null);
        }

        public final ConfigException u(String str, Throwable th) {
            return new ConfigException.Parse(o(), str, th);
        }

        public final void v(Map<String, h00> map) {
            g00 g00VarT0;
            c cVarQ = q();
            while (n(cVarQ.f38067a)) {
                cVarQ = q();
            }
            if (oip.m(cVarQ.f38067a)) {
                String strG = oip.g(cVarQ.f38067a);
                if (!strG.equals("url(") && !strG.equals("file(") && !strG.equals("classpath(")) {
                    throw t("expecting include parameter to be quoted filename, file(), classpath(), or url(). No spaces are allowed before the open paren. Not expecting: " + cVarQ);
                }
                c cVarQ2 = q();
                while (n(cVarQ2.f38067a)) {
                    cVarQ2 = q();
                }
                if (!oip.o(cVarQ2.f38067a, ConfigValueType.STRING)) {
                    throw t("expecting a quoted string inside file(), classpath(), or url(), rather than: " + cVarQ2);
                }
                String str = (String) oip.h(cVarQ2.f38067a).x();
                c cVarQ3 = q();
                while (n(cVarQ3.f38067a)) {
                    cVarQ3 = q();
                }
                if (!oip.m(cVarQ3.f38067a) || !oip.g(cVarQ3.f38067a).equals(")")) {
                    throw t("expecting a close parentheses ')' here, not: " + cVarQ3);
                }
                if (strG.equals("url(")) {
                    try {
                        g00VarT0 = (g00) this.d.b(this.e, new URL(str));
                    } catch (MalformedURLException e) {
                        throw u("include url() specifies an invalid URL: " + str, e);
                    }
                } else if (strG.equals("file(")) {
                    g00VarT0 = (g00) this.d.c(this.e, new File(str));
                } else {
                    if (!strG.equals("classpath(")) {
                        throw new ConfigException.BugOrBroken("should not be reached");
                    }
                    g00VarT0 = (g00) this.d.a(this.e, str);
                }
            } else {
                if (!oip.o(cVarQ.f38067a, ConfigValueType.STRING)) {
                    throw t("include keyword is not followed by a quoted string, but by: " + cVarQ);
                }
                g00VarT0 = (g00) this.d.d(this.e, (String) oip.h(cVarQ.f38067a).x());
            }
            if (this.j > 0 && g00VarT0.Z() != iqk.RESOLVED) {
                throw t("Due to current limitations of the config parser, when an include statement is nested inside a list value, ${} substitutions inside the included file cannot be resolved correctly. Either move the include outside of the list value or remove the ${} statements from the included file.");
            }
            if (!this.h.isEmpty()) {
                g00VarT0 = g00VarT0.V(k());
            }
            for (String str2 : g00VarT0.keySet()) {
                h00 h00VarI0 = g00VarT0.get(str2);
                h00 h00Var = map.get(str2);
                if (h00Var != null) {
                    map.put(str2, h00VarI0.e(h00Var));
                } else {
                    map.put(str2, h00VarI0);
                }
            }
        }

        public final qlh w(c cVar) {
            if (this.f == ConfigSyntax.JSON) {
                if (oip.o(cVar.f38067a, ConfigValueType.STRING)) {
                    return qlh.f((String) oip.h(cVar.f38067a).x());
                }
                throw t(b("Expecting close brace } or a field name here, got " + cVar));
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (!oip.n(cVar.f38067a) && !oip.m(cVar.f38067a)) {
                    break;
                }
                arrayList.add(cVar.f38067a);
                cVar = p();
            }
            if (!arrayList.isEmpty()) {
                D(cVar);
                return wkh.g(arrayList.iterator(), o());
            }
            throw t(b("expecting a close brace or a field name here, got " + cVar));
        }

        public final g00 x(boolean z) {
            boolean z2;
            c cVarC;
            Map<String, h00> map = new HashMap<>();
            ocm ocmVarO = o();
            qlh qlhVar = null;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                c cVarQ = q();
                zhp zhpVar = cVarQ.f38067a;
                zhp zhpVar2 = oip.g;
                if (zhpVar != zhpVar2) {
                    zhp zhpVar3 = oip.f29208b;
                    if (zhpVar == zhpVar3 && !z) {
                        D(cVarQ);
                        break;
                    }
                    ConfigSyntax configSyntax = this.f;
                    ConfigSyntax configSyntax2 = ConfigSyntax.JSON;
                    if (configSyntax == configSyntax2 || !l(zhpVar)) {
                        qlh qlhVarW = w(cVarQ);
                        c cVarQ2 = q();
                        this.h.push(qlhVarW);
                        zhp zhpVar4 = cVarQ2.f38067a;
                        zhp zhpVar5 = oip.j;
                        if (zhpVar4 == zhpVar5) {
                            int i = this.j;
                            if (i > 0) {
                                throw t("Due to current limitations of the config parser, += does not work nested inside a list. += expands to a ${} substitution and the path in ${} cannot currently refer to list elements. You might be able to move the += outside of the list and then refer to it from inside the list with ${}.");
                            }
                            this.j = i + 1;
                        }
                        if (this.f == ConfigSyntax.CONF && zhpVar4 == oip.f) {
                            cVarC = cVarQ2;
                            z2 = false;
                        } else {
                            if (!m(zhpVar4)) {
                                throw t(d(cVarQ2.toString(), "Key '" + qlhVarW.k() + "' may not be followed by token: " + cVarQ2));
                            }
                            if (cVarQ2.f38067a == oip.d) {
                                this.i++;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i();
                            cVarC = q().c(cVarQ2.f38068b);
                        }
                        h00 h00VarY = y(cVarC.c(cVarQ.f38068b));
                        if (cVarQ2.f38067a == zhpVar5) {
                            this.j--;
                            ArrayList arrayList = new ArrayList(2);
                            nc4 nc4Var = new nc4(h00VarY.g(), new roo(k(), true));
                            mcm mcmVar = new mcm(h00VarY.g(), Collections.singletonList(h00VarY));
                            arrayList.add(nc4Var);
                            arrayList.add(mcmVar);
                            h00VarY = pb4.g0(arrayList);
                        }
                        h00 h00VarA = a(h00VarY);
                        qlh qlhVarPop = this.h.pop();
                        if (z2) {
                            this.i--;
                        }
                        String strB = qlhVarW.b();
                        qlh qlhVarJ = qlhVarW.j();
                        if (qlhVarJ == null) {
                            h00 h00Var = map.get(strB);
                            if (h00Var != null) {
                                if (this.f == configSyntax2) {
                                    throw t("JSON does not allow duplicate fields: '" + strB + "' was already seen at " + h00Var.g().a());
                                }
                                h00VarA = h00VarA.e(h00Var);
                            }
                            map.put(strB, h00VarA);
                        } else {
                            if (this.f == configSyntax2) {
                                throw new ConfigException.BugOrBroken("somehow got multi-element path in JSON mode");
                            }
                            g00 g00VarJ = j(qlhVarJ, h00VarA);
                            h00 h00Var2 = map.get(strB);
                            if (h00Var2 != null) {
                                g00VarJ = g00VarJ.d0(h00Var2);
                            }
                            map.put(strB, g00VarJ);
                        }
                        qlhVar = qlhVarPop;
                        z4 = z2;
                    } else {
                        v(map);
                    }
                    if (!g()) {
                        c cVarQ3 = q();
                        zhp zhpVar6 = cVarQ3.f38067a;
                        if (zhpVar6 == zhpVar2) {
                            if (!z) {
                                throw t(c(qlhVar, z4, cVarQ3.toString(), "unbalanced close brace '}' with no open brace"));
                            }
                            ocmVarO = cVarQ3.b(ocmVarO);
                            break;
                        }
                        if (z) {
                            throw t(c(qlhVar, z4, cVarQ3.toString(), "Expecting close brace } or a comma, got " + cVarQ3));
                        }
                        if (zhpVar6 == zhpVar3) {
                            D(cVarQ3);
                            break;
                        }
                        throw t(c(qlhVar, z4, cVarQ3.toString(), "Expecting end of input or a comma, got " + cVarQ3));
                    }
                    z3 = true;
                } else {
                    if (this.f == ConfigSyntax.JSON && z3) {
                        throw t(d(cVarQ.toString(), "expecting a field name after a comma, got a close brace } instead"));
                    }
                    if (!z) {
                        throw t(d(cVarQ.toString(), "unbalanced close brace '}' with no open brace"));
                    }
                    ocmVarO = cVarQ.b(ocmVarO);
                    break;
                }
            }
            return new ncm(ocmVarO, map);
        }

        public final h00 y(c cVar) {
            h00 h00VarS;
            int i = this.j;
            int i2 = this.i;
            if (oip.n(cVar.f38067a)) {
                h00VarS = oip.h(cVar.f38067a);
            } else if (oip.m(cVar.f38067a)) {
                h00VarS = new qc4(cVar.f38067a.d(), oip.g(cVar.f38067a));
            } else if (oip.l(cVar.f38067a)) {
                h00VarS = new nc4(cVar.f38067a.d(), E(cVar.f38067a));
            } else {
                zhp zhpVar = cVar.f38067a;
                if (zhpVar == oip.f) {
                    h00VarS = x(true);
                } else {
                    if (zhpVar != oip.h) {
                        throw t(d(zhpVar.toString(), "Expecting a value but got wrong token: " + cVar.f38067a));
                    }
                    h00VarS = s();
                }
            }
            h00 h00VarF0 = h00VarS.f0(cVar.d(h00VarS.g()));
            if (this.j != i) {
                throw new ConfigException.BugOrBroken("Bug in config parser: unbalanced array count");
            }
            if (this.i == i2) {
                return h00VarF0;
            }
            throw new ConfigException.BugOrBroken("Bug in config parser: unbalanced equals count");
        }

        public final c z() {
            c cVarA = A();
            if (!f(cVarA.f38067a)) {
                return cVarA;
            }
            if (this.f38066b.isEmpty()) {
                zhp next = this.c.next();
                if (oip.i(next)) {
                    return cVarA.a(next);
                }
                this.f38066b.push(new c(next));
                return cVarA;
            }
            if (!oip.i(this.f38066b.peek().f38067a)) {
                return cVarA;
            }
            throw new ConfigException.BugOrBroken("comment token should not have been in buffer: " + this.f38066b);
        }
    }

    public static void b(List<a> list, boolean z, String str) {
        int iIndexOf = z ? -1 : str.indexOf(46);
        a aVar = list.get(list.size() - 1);
        if (iIndexOf >= 0) {
            aVar.f38063a.append(str.substring(0, iIndexOf));
            list.add(new a("", false));
            b(list, false, str.substring(iIndexOf + 1));
        } else {
            aVar.f38063a.append(str);
            if (z && aVar.f38063a.length() == 0) {
                aVar.f38064b = true;
            }
        }
    }

    public static void c(rlh rlhVar, String str) {
        int iIndexOf = str.indexOf(46);
        if (iIndexOf < 0) {
            rlhVar.a(str);
        } else {
            rlhVar.a(str.substring(0, iIndexOf));
            c(rlhVar, str.substring(iIndexOf + 1));
        }
    }

    public static boolean d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt) && cCharAt != '.') {
                return true;
            }
        }
        return false;
    }

    public static h00 e(Iterator<zhp> it, jc4 jc4Var, lc4 lc4Var, xb4 xb4Var) {
        return new b(lc4Var.g(), jc4Var, it, wcm.l(lc4Var.e()), xb4Var).r();
    }

    public static qlh f(String str) {
        qlh qlhVarI = i(str);
        if (qlhVarI != null) {
            return qlhVarI;
        }
        StringReader stringReader = new StringReader(str);
        try {
            Iterator<zhp> itC = mip.c(f38062a, stringReader, ConfigSyntax.CONF);
            itC.next();
            return h(itC, f38062a, str);
        } finally {
            stringReader.close();
        }
    }

    public static qlh g(Iterator<zhp> it, jc4 jc4Var) {
        return h(it, jc4Var, null);
    }

    public static qlh h(Iterator<zhp> it, jc4 jc4Var, String str) {
        String strG;
        ArrayList<a> arrayList = new ArrayList();
        arrayList.add(new a("", false));
        if (!it.hasNext()) {
            throw new ConfigException.BadPath(jc4Var, str, "Expecting a field name or path here, but got nothing");
        }
        while (it.hasNext()) {
            zhp next = it.next();
            if (oip.o(next, ConfigValueType.STRING)) {
                b(arrayList, true, oip.h(next).c0());
            } else if (next != oip.f29208b) {
                if (oip.n(next)) {
                    strG = oip.h(next).c0();
                } else {
                    if (!oip.m(next)) {
                        throw new ConfigException.BadPath(jc4Var, str, "Token not allowed in path expression: " + next + " (you can double-quote this token if you really want it here)");
                    }
                    strG = oip.g(next);
                }
                b(arrayList, false, strG);
            } else {
                continue;
            }
        }
        rlh rlhVar = new rlh();
        for (a aVar : arrayList) {
            if (aVar.f38063a.length() == 0 && !aVar.f38064b) {
                throw new ConfigException.BadPath(jc4Var, str, "path has a leading, trailing, or two adjacent period '.' (use quoted \"\" empty string if you want an empty element)");
            }
            rlhVar.a(aVar.f38063a.toString());
        }
        return rlhVar.d();
    }

    public static qlh i(String str) {
        String strG = wb4.g(str);
        if (strG.isEmpty() || d(strG) || strG.startsWith(".") || strG.endsWith(".") || strG.contains("..")) {
            return null;
        }
        rlh rlhVar = new rlh();
        c(rlhVar, strG);
        return rlhVar.d();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zhp f38067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<zhp> f38068b;

        public c(zhp zhpVar, List<zhp> list) {
            this.f38067a = zhpVar;
            this.f38068b = list;
            if (oip.i(zhpVar)) {
                throw new ConfigException.BugOrBroken("tried to annotate a comment with a comment");
            }
        }

        public c a(zhp zhpVar) {
            if (this.f38068b.isEmpty()) {
                return new c(this.f38067a, Collections.singletonList(zhpVar));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f38068b);
            arrayList.add(zhpVar);
            return new c(this.f38067a, arrayList);
        }

        public ocm b(ocm ocmVar) {
            if (this.f38068b.isEmpty()) {
                return ocmVar;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<zhp> it = this.f38068b.iterator();
            while (it.hasNext()) {
                arrayList.add(oip.a(it.next()));
            }
            return ocmVar.d(arrayList);
        }

        public c c(List<zhp> list) {
            if (list.isEmpty()) {
                return this;
            }
            if (this.f38068b.isEmpty()) {
                return new c(this.f38067a, list);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(this.f38068b);
            return new c(this.f38067a, arrayList);
        }

        public ocm d(ocm ocmVar) {
            if (this.f38068b.isEmpty()) {
                return ocmVar;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<zhp> it = this.f38068b.iterator();
            while (it.hasNext()) {
                arrayList.add(oip.a(it.next()));
            }
            return ocmVar.t(arrayList);
        }

        public c e() {
            return this.f38068b.isEmpty() ? this : new c(this.f38067a);
        }

        public String toString() {
            return this.f38067a.toString();
        }

        public c(zhp zhpVar) {
            this(zhpVar, Collections.emptyList());
        }
    }
}
