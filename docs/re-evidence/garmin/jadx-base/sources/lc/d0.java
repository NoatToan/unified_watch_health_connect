package lc;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\t¨\u0006\u000e"}, d2 = {"Llc/d0;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "(Ljava/lang/String;)V", "d", "c", "a", "b", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d53.k f111726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d53.k f111727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d53.k f111728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d53.k f111729t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d53.k f111730u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d53.k f111731v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f111735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f111737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f111738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f111739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f111740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f111741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f111742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f111743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f111744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f111745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o13.t f111746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f111747p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llc/d0$c;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f111751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f111752b;

        public c(String str) {
            List listS0;
            str.getClass();
            List listG = new d53.k("/").g(0, str);
            if (listG.isEmpty()) {
                listS0 = p13.j0.f134944a;
            } else {
                ListIterator listIterator = listG.listIterator(listG.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listS0 = p13.h0.S0(listG, listIterator.nextIndex() + 1);
                    }
                }
                listS0 = p13.j0.f134944a;
            }
            this.f111751a = (String) listS0.get(0);
            this.f111752b = (String) listS0.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(c cVar) {
            cVar.getClass();
            int i14 = p005kotlin.jvm.internal.s.g(this.f111751a, cVar.f111751a) ? 2 : 0;
            return p005kotlin.jvm.internal.s.g(this.f111752b, cVar.f111752b) ? i14 + 1 : i14;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/d0$d;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f111753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f111754b = new ArrayList();
    }

    static {
        new b(null);
        f111726q = new d53.k("^[a-zA-Z]+[+\\w\\-.]*:");
        f111727r = new d53.k("\\{(.+?)\\}");
        f111728s = new d53.k("http[s]?://");
        f111729t = new d53.k(".*");
        f111730u = new d53.k("([^/]*?|)");
        f111731v = new d53.k("^[^?#]+\\?([^#]*).*");
    }

    public d0(String str, String str2, String str3) {
        this.f111732a = str;
        this.f111733b = str2;
        this.f111734c = str3;
        ArrayList arrayList = new ArrayList();
        this.f111735d = arrayList;
        final int i14 = 0;
        this.f111737f = o13.m.b(new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i15 = i14;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i15) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i16 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i16) {
                                        String strSubstring = str8.substring(i16, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i16 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i16 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i16);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i15 = 1;
        this.f111738g = o13.m.b(new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i16 = i15;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i16) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i17 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i17) {
                                        String strSubstring = str8.substring(i17, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i17 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i17 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i17);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        o13.n nVar = o13.n.NONE;
        final int i16 = 2;
        this.f111739h = o13.m.a(nVar, new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i17 = i16;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i17) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i18 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i18) {
                                        String strSubstring = str8.substring(i18, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i18 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i18 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i18);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i17 = 3;
        this.f111741j = o13.m.a(nVar, new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i18 = i17;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i18) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i19 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i19) {
                                        String strSubstring = str8.substring(i19, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i19 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i19 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i19);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i18 = 4;
        this.f111742k = o13.m.a(nVar, new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i19 = i18;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i19) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i110 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i110) {
                                        String strSubstring = str8.substring(i110, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i110 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i110 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i110);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i19 = 5;
        this.f111743l = o13.m.a(nVar, new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i110 = i19;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i110) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i111 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i111) {
                                        String strSubstring = str8.substring(i111, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i111 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i111 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i111);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i24 = 6;
        this.f111744m = o13.m.b(new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i110 = i24;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i110) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i111 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i111) {
                                        String strSubstring = str8.substring(i111, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i111 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i111 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i111);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i25 = 7;
        this.f111746o = o13.m.b(new e23.a(this) { // from class: lc.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f111723b;

            {
                this.f111723b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [d53.j$b] */
            /* JADX WARN: Type inference failed for: r16v1 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v32 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
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
            @Override // e23.a
            public final Object invoke() {
                List list;
                int i110 = i25;
                ?? r14 = 1;
                d0 d0Var = this.f111723b;
                switch (i110) {
                    case 0:
                        String str4 = d0Var.f111736e;
                        if (str4 != null) {
                            return new d53.k(str4, d53.l.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = d0Var.f111732a;
                        return Boolean.valueOf(str5 != null && d0.f111731v.d(str5));
                    case 2:
                        String str6 = d0Var.f111732a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) d0Var.f111738g.getValue()).booleanValue()) {
                            r0 r0Var = r0.f111862a;
                            str6.getClass();
                            r0Var.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb3 = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r14) {
                                    vb.h.x(v.e0.g("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) p13.h0.d0(queryParameters);
                                if (str8 == null) {
                                    d0Var.f111740i = r14;
                                    str8 = str7;
                                }
                                d53.j jVarB = d0.f111727r.b(0, str8);
                                d0.d dVar = new d0.d();
                                int i111 = 0;
                                ?? r15 = r14;
                                while (jVarB != null) {
                                    d53.h hVarB = jVarB.f57693c.b(r15);
                                    hVarB.getClass();
                                    ?? r16 = r15;
                                    dVar.f111754b.add(hVarB.f57688a);
                                    if (jVarB.b().f96796a > i111) {
                                        String strSubstring = str8.substring(i111, jVarB.b().f96796a);
                                        d53.k.f57697b.getClass();
                                        String strQuote = Pattern.quote(strSubstring);
                                        strQuote.getClass();
                                        sb3.append(strQuote);
                                    }
                                    sb3.append("([\\s\\S]+?)?");
                                    i111 = jVarB.b().f96797b + 1;
                                    jVarB = jVarB.c();
                                    r15 = r16 == true ? 1 : 0;
                                }
                                ?? r17 = r15;
                                if (i111 < str8.length()) {
                                    d53.k.a aVar = d53.k.f57697b;
                                    String strSubstring2 = str8.substring(i111);
                                    aVar.getClass();
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    strQuote2.getClass();
                                    sb3.append(strQuote2);
                                }
                                sb3.append("$");
                                dVar.f111753a = d0.g(sb3.toString());
                                linkedHashMap.put(str7, dVar);
                                r14 = r17 == true ? 1 : 0;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = d0Var.f111732a;
                        if (str9 == null) {
                            return null;
                        }
                        r0.f111862a.getClass();
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        fragment.getClass();
                        d0.a(fragment, arrayList2, sb4);
                        return new o13.p(arrayList2, sb4.toString());
                    case 4:
                        d53.k kVar = d0.f111726q;
                        o13.p pVar = (o13.p) d0Var.f111741j.getValue();
                        return (pVar == null || (list = (List) pVar.f128594a) == null) ? new ArrayList() : list;
                    case 5:
                        d53.k kVar2 = d0.f111726q;
                        o13.p pVar2 = (o13.p) d0Var.f111741j.getValue();
                        if (pVar2 != null) {
                            return (String) pVar2.f128595b;
                        }
                        return null;
                    case 6:
                        String str10 = (String) d0Var.f111743l.getValue();
                        if (str10 != null) {
                            return new d53.k(str10, d53.l.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str11 = d0Var.f111745n;
                        if (str11 != null) {
                            return new d53.k(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb3 = new StringBuilder("^");
            if (!f111726q.a(str)) {
                String strPattern = f111728s.f57698a.pattern();
                strPattern.getClass();
                sb3.append(strPattern);
            }
            d53.j jVarB = new d53.k("(\\?|#|$)").b(0, str);
            if (jVarB != null) {
                a(str.substring(0, jVarB.b().f96796a), arrayList, sb3);
                this.f111747p = (f111729t.a(sb3) || f111730u.a(sb3)) ? false : true;
                sb3.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.f111736e = g(sb3.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new d53.k("^[\\s\\S]+/[\\s\\S]+$").d(str3)) {
            vb.h.x(am.j.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        c cVar = new c(str3);
        StringBuilder sb4 = new StringBuilder("^(");
        sb4.append(cVar.f111751a);
        sb4.append("|[*]+)/(");
        this.f111745n = d53.u.v(am.j.o(cVar.f111752b, "|[*]+)$", sb4), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb3) {
        int i14 = 0;
        for (d53.j jVarB = f111727r.b(0, str); jVarB != null; jVarB = jVarB.c()) {
            d53.h hVarB = jVarB.f57693c.b(1);
            hVarB.getClass();
            arrayList.add(hVarB.f57688a);
            if (jVarB.b().f96796a > i14) {
                d53.k.a aVar = d53.k.f57697b;
                String strSubstring = str.substring(i14, jVarB.b().f96796a);
                aVar.getClass();
                String strQuote = Pattern.quote(strSubstring);
                strQuote.getClass();
                sb3.append(strQuote);
            }
            String strPattern = f111730u.f57698a.pattern();
            strPattern.getClass();
            sb3.append(strPattern);
            i14 = jVarB.b().f96797b + 1;
        }
        if (i14 < str.length()) {
            d53.k.a aVar2 = d53.k.f57697b;
            String strSubstring2 = str.substring(i14);
            aVar2.getClass();
            String strQuote2 = Pattern.quote(strSubstring2);
            strQuote2.getClass();
            sb3.append(strQuote2);
        }
    }

    public static void f(Bundle bundle, String str, String str2, t tVar) {
        if (tVar == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            q0<Object> q0Var = tVar.f111866a;
            str.getClass();
            q0Var.e(bundle, str, q0Var.h(str2));
        }
    }

    public static String g(String str) {
        if (d53.w.z(str, "\\Q", false) && d53.w.z(str, "\\E", false)) {
            return d53.u.v(str, ".*", "\\E.*\\Q", false);
        }
        return d53.w.z(str, "\\.\\*", false) ? d53.u.v(str, "\\.\\*", ".*", false) : str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    public final ArrayList b() {
        Collection collectionValues = ((Map) this.f111739h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            p13.d0.v(arrayList, ((d) it.next()).f111754b);
        }
        return p13.h0.C0(p13.h0.C0(this.f111735d, arrayList), (List) this.f111742k.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, o13.l] */
    public final Bundle c(Uri uri, LinkedHashMap linkedHashMap) {
        d53.j jVarC;
        d53.j jVarC2;
        String strDecode;
        uri.getClass();
        linkedHashMap.getClass();
        d53.k kVar = (d53.k) this.f111737f.getValue();
        if (kVar != null && (jVarC = kVar.c(uri.toString())) != null) {
            p13.k0.f134949a.getClass();
            int i14 = 0;
            Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            if (d(jVarC, bundleA, linkedHashMap) && (!((Boolean) this.f111738g.getValue()).booleanValue() || e(uri, bundleA, linkedHashMap))) {
                String fragment = uri.getFragment();
                d53.k kVar2 = (d53.k) this.f111744m.getValue();
                if (kVar2 != null && (jVarC2 = kVar2.c(String.valueOf(fragment))) != null) {
                    List list = (List) this.f111742k.getValue();
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    for (Object obj : list) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        String str = (String) obj;
                        d53.h hVarB = jVarC2.f57693c.b(i15);
                        if (hVarB != null) {
                            String str2 = hVarB.f57688a;
                            r0.f111862a.getClass();
                            strDecode = Uri.decode(str2);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            f(bundleA, str, strDecode, (t) linkedHashMap.get(str));
                            arrayList.add(Unit.INSTANCE);
                            i14 = i15;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (gl1.y.D(linkedHashMap, new c0(0, bundleA)).isEmpty()) {
                    return bundleA;
                }
            }
        }
        return null;
    }

    public final boolean d(d53.j jVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f111735d;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            String strDecode = null;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            String str = (String) obj;
            d53.h hVarB = jVar.f57693c.b(i15);
            if (hVarB != null) {
                String str2 = hVarB.f57688a;
                r0.f111862a.getClass();
                strDecode = Uri.decode(str2);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                f(bundle, str, strDecode, (t) map.get(str));
                arrayList2.add(Unit.INSTANCE);
                i14 = i15;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
    public final boolean e(Uri uri, Bundle bundle, Map<String, t> map) {
        Object objValueOf;
        boolean z14;
        String query;
        for (Map.Entry entry : ((Map) this.f111739h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f111740i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = p13.w.c(query);
            }
            p13.k0.f134949a.getClass();
            boolean z15 = false;
            Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
            Iterator it = dVar.f111754b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                t tVar = map.get(str2);
                q0<Object> q0Var = tVar != null ? tVar.f111866a : null;
                if ((q0Var instanceof g) && !tVar.f111868c) {
                    g gVar = (g) q0Var;
                    gVar.e(bundleA, str2, gVar.h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = dVar.f111753a;
                d53.j jVarC = str4 != null ? new d53.k(str4).c(str3) : null;
                if (jVarC == null) {
                    return z15;
                }
                ArrayList arrayList = dVar.f111754b;
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                ?? r14 = z15;
                for (Object obj : arrayList) {
                    int i14 = r14 + 1;
                    if (r14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    String str5 = (String) obj;
                    d53.h hVarB = jVarC.f57693c.b(i14);
                    String str6 = hVarB != null ? hVarB.f57688a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    t tVar2 = map.get(str5);
                    try {
                        str5.getClass();
                        if (bundleA.containsKey(str5)) {
                            if (bundleA.containsKey(str5)) {
                                if (tVar2 != null) {
                                    q0<Object> q0Var2 = tVar2.f111866a;
                                    Object objA = q0Var2.a(bundleA, str5);
                                    if (!bundleA.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    q0Var2.e(bundleA, str5, q0Var2.c(objA, str6));
                                }
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            objValueOf = Boolean.valueOf(z14);
                        } else {
                            f(bundleA, str5, str6, tVar2);
                            objValueOf = Unit.INSTANCE;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = Unit.INSTANCE;
                    }
                    arrayList2.add(objValueOf);
                    r14 = i14;
                    z15 = false;
                }
            }
            bundle.putAll(bundleA);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof d0)) {
            d0 d0Var = (d0) obj;
            if (p005kotlin.jvm.internal.s.g(this.f111732a, d0Var.f111732a) && p005kotlin.jvm.internal.s.g(this.f111733b, d0Var.f111733b) && p005kotlin.jvm.internal.s.g(this.f111734c, d0Var.f111734c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f111732a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f111733b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f111734c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llc/d0$a;", "", "<init>", "()V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f111748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f111749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f111750c;

        static {
            new C2142a(null);
        }

        public final d0 a() {
            return new d0(this.f111748a, this.f111749b, this.f111750c);
        }

        public final void b(String str) {
            str.getClass();
            if (str.length() > 0) {
                this.f111749b = str;
            } else {
                vb.h.s("The NavDeepLink cannot have an empty action.");
            }
        }

        /* JADX INFO: renamed from: lc.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/d0$a$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2142a {
            public /* synthetic */ C2142a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2142a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llc/d0$b;", "", "<init>", "()V", "Ld53/k;", "SCHEME_PATTERN", "Ld53/k;", "FILL_IN_PATTERN", "SCHEME_REGEX", "WILDCARD_REGEX", "PATH_REGEX", "QUERY_PATTERN", "", "ANY_SYMBOLS_IN_THE_TAIL", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(String str) {
        this(str, null, null);
        str.getClass();
    }
}
