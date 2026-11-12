package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.option.OptionDefinition;

/* JADX INFO: loaded from: classes20.dex */
public final class zvi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f54608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f54609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zuv f54610c;
    private zuv d;
    private List<byte[]> e;
    private List<String> f;
    private List<String> g;
    private List<byte[]> h;
    private boolean i;
    private Long j;
    private String k;
    private byte[] l;
    private List<zvc> m;
    private Integer n;
    private zva o;
    private String p;
    private Integer q;
    private Integer r;
    private List<String> s;
    private String t;
    private List<String> u;
    private Integer v;
    private zvh y;

    public static boolean e(int i) {
        return i >= 0 && i <= 16777215;
    }

    public zvi() {
        this.h = null;
        this.p = null;
        this.e = null;
        this.i = false;
        this.v = null;
        this.g = null;
        this.s = null;
        this.f54608a = null;
        this.j = null;
        this.u = null;
        this.y = null;
        this.f54609b = null;
        this.f = null;
        this.t = null;
        this.k = null;
        this.f54610c = null;
        this.d = null;
        this.q = null;
        this.r = null;
        this.n = null;
        this.l = null;
        this.o = null;
        this.m = null;
    }

    public zvi(zvi zviVar) {
        if (zviVar == null) {
            throw new NullPointerException("option set must not be null!");
        }
        this.h = c(zviVar.h);
        this.p = zviVar.p;
        this.e = c(zviVar.e);
        this.i = zviVar.i;
        this.v = zviVar.v;
        this.g = c(zviVar.g);
        this.s = c(zviVar.s);
        this.f54608a = zviVar.f54608a;
        this.j = zviVar.j;
        this.u = c(zviVar.u);
        this.y = zviVar.y;
        this.f54609b = zviVar.f54609b;
        this.f = c(zviVar.f);
        this.t = zviVar.t;
        this.k = zviVar.k;
        this.f54610c = zviVar.f54610c;
        this.d = zviVar.d;
        this.q = zviVar.q;
        this.r = zviVar.r;
        this.n = zviVar.n;
        byte[] bArr = zviVar.l;
        if (bArr != null) {
            this.l = (byte[]) bArr.clone();
        }
        this.o = zviVar.o;
        this.m = c(zviVar.m);
    }

    public void a() {
        List<byte[]> list = this.h;
        if (list != null) {
            list.clear();
        }
        this.p = null;
        List<byte[]> list2 = this.e;
        if (list2 != null) {
            list2.clear();
        }
        this.i = false;
        this.v = null;
        List<String> list3 = this.g;
        if (list3 != null) {
            list3.clear();
        }
        List<String> list4 = this.s;
        if (list4 != null) {
            list4.clear();
        }
        this.f54608a = null;
        this.j = null;
        List<String> list5 = this.u;
        if (list5 != null) {
            list5.clear();
            this.y = null;
        }
        this.f54609b = null;
        List<String> list6 = this.f;
        if (list6 != null) {
            list6.clear();
        }
        this.t = null;
        this.k = null;
        this.f54610c = null;
        this.d = null;
        this.q = null;
        this.r = null;
        this.n = null;
        this.l = null;
        this.o = null;
        List<zvc> list7 = this.m;
        if (list7 != null) {
            list7.clear();
        }
    }

    private <T> List<T> c(List<T> list) {
        if (list == null) {
            return null;
        }
        return new LinkedList(list);
    }

    public List<byte[]> o() {
        synchronized (this) {
            if (this.h == null) {
                this.h = new LinkedList();
            }
        }
        return this.h;
    }

    public zvi e(byte[] bArr) {
        c(zvo.i, bArr);
        o().add(bArr);
        return this;
    }

    public String u() {
        return this.p;
    }

    public boolean ar() {
        return this.p != null;
    }

    public zvi h(String str) {
        d(zvo.w, str);
        this.p = str;
        return this;
    }

    public zvi au() {
        this.p = null;
        return this;
    }

    public List<byte[]> g() {
        synchronized (this) {
            if (this.e == null) {
                this.e = new LinkedList();
            }
        }
        return this.e;
    }

    public int i() {
        return g().size();
    }

    public boolean d(byte[] bArr) {
        List<byte[]> list = this.e;
        if (list == null) {
            return false;
        }
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            if (Arrays.equals(it.next(), bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zvi a(byte[] bArr) {
        c(zvo.f, bArr);
        if (!d(bArr)) {
            g().add(bArr.clone());
        }
        return this;
    }

    public boolean ag() {
        return this.i;
    }

    public zvi b(boolean z) {
        this.i = z;
        return this;
    }

    public Integer ac() {
        return this.v;
    }

    public boolean aq() {
        return this.v != null;
    }

    public zvi f(int i) {
        a(zvo.aa, i);
        this.v = Integer.valueOf(i);
        return this;
    }

    public zvi av() {
        this.v = null;
        return this;
    }

    public List<String> m() {
        synchronized (this) {
            if (this.g == null) {
                this.g = new LinkedList();
            }
        }
        return this.g;
    }

    public zvi c(String str) {
        d(zvo.j, str);
        m().add(str);
        return this;
    }

    public String ad() {
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        a(sb, w(), '/');
        if (v() > 0) {
            sb.append('?');
            a(sb, z(), '&');
        }
        return sb.toString();
    }

    public List<String> w() {
        synchronized (this) {
            if (this.s == null) {
                this.s = new LinkedList();
            }
        }
        return this.s;
    }

    public String y() {
        return b(w(), '/');
    }

    public zvi f(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        c();
        for (String str2 : str.split("/")) {
            e(str2);
        }
        return this;
    }

    public zvi e(String str) {
        d(zvo.u, str);
        w().add(str);
        return this;
    }

    public zvi c() {
        w().clear();
        return this;
    }

    public int h() {
        if (ae()) {
            return this.f54608a.intValue();
        }
        return -1;
    }

    public boolean ae() {
        return this.f54608a != null;
    }

    public zvi b(int i) {
        if (-1 == i) {
            this.f54608a = null;
            return this;
        }
        a(zvo.f54623c, i);
        this.f54608a = Integer.valueOf(i);
        return this;
    }

    public Long l() {
        Long l = this.j;
        return Long.valueOf(l != null ? l.longValue() : 60L);
    }

    public boolean ah() {
        return this.j != null;
    }

    public zvi d(long j) {
        a(zvo.o, j);
        this.j = Long.valueOf(j);
        return this;
    }

    public List<String> z() {
        synchronized (this) {
            if (this.u == null) {
                this.u = new LinkedList();
            }
        }
        return this.u;
    }

    public int v() {
        return z().size();
    }

    public String aa() {
        return b(z(), '&');
    }

    public zvi j(String str) {
        while (str.startsWith("?")) {
            str = str.substring(1);
        }
        b();
        for (String str2 : str.split("&")) {
            if (!str2.isEmpty()) {
                d(str2);
            }
        }
        return this;
    }

    public zvi d(String str) {
        d(zvo.z, str);
        z().add(str);
        this.y = null;
        return this;
    }

    public zvi b() {
        z().clear();
        this.y = null;
        return this;
    }

    public int e() {
        if (ab()) {
            return this.f54609b.intValue();
        }
        return -1;
    }

    public boolean ab() {
        return this.f54609b != null;
    }

    public zvi a(int i) {
        a(zvo.f54622b, i);
        this.f54609b = Integer.valueOf(i);
        return this;
    }

    public List<String> k() {
        synchronized (this) {
            if (this.f == null) {
                this.f = new LinkedList();
            }
        }
        return this.f;
    }

    public zvi b(String str) {
        d(zvo.n, str);
        k().add(str);
        return this;
    }

    public String t() {
        return this.t;
    }

    public boolean am() {
        return this.t != null;
    }

    public zvi i(String str) {
        d(zvo.r, str);
        this.t = str;
        return this;
    }

    public String r() {
        return this.k;
    }

    public boolean aj() {
        return this.k != null;
    }

    public zvi a(String str) {
        d(zvo.t, str);
        this.k = str;
        return this;
    }

    public zuv f() {
        return this.f54610c;
    }

    public boolean ai() {
        return this.f54610c != null;
    }

    public zvi c(int i, boolean z, int i2) {
        this.f54610c = new zuv(i, z, i2);
        return this;
    }

    public zvi c(byte[] bArr) {
        this.f54610c = new zuv(bArr);
        return this;
    }

    public zvi a(zuv zuvVar) {
        this.f54610c = zuvVar;
        return this;
    }

    public zvi ap() {
        this.f54610c = null;
        return this;
    }

    public zuv j() {
        return this.d;
    }

    public boolean af() {
        return this.d != null;
    }

    public zvi e(int i, boolean z, int i2) {
        this.d = new zuv(i, z, i2);
        return this;
    }

    public zvi b(byte[] bArr) {
        this.d = new zuv(bArr);
        return this;
    }

    public zvi d(zuv zuvVar) {
        this.d = zuvVar;
        return this;
    }

    public zvi at() {
        this.d = null;
        return this;
    }

    public Integer p() {
        return this.q;
    }

    public boolean ao() {
        return this.q != null;
    }

    public zvi g(int i) {
        this.q = Integer.valueOf(i);
        return this;
    }

    public zvi ax() {
        this.q = null;
        return this;
    }

    public Integer x() {
        return this.r;
    }

    public boolean as() {
        return this.r != null;
    }

    public zvi h(int i) {
        this.r = Integer.valueOf(i);
        return this;
    }

    public Integer q() {
        return this.n;
    }

    public boolean ak() {
        return this.n != null;
    }

    public zvi d(int i) {
        a(zvo.m, i);
        this.n = Integer.valueOf(i);
        return this;
    }

    public zvi aw() {
        this.n = null;
        return this;
    }

    public byte[] s() {
        return this.l;
    }

    public boolean al() {
        return this.l != null;
    }

    public zvi g(byte[] bArr) {
        c(zvo.l, bArr);
        this.l = (byte[]) bArr.clone();
        return this;
    }

    public zva n() {
        return this.o;
    }

    public boolean an() {
        return this.o != null;
    }

    public zvi c(int i) {
        this.o = new zva(i);
        return this;
    }

    private List<zvc> bc() {
        synchronized (this) {
            if (this.m == null) {
                this.m = new LinkedList();
            }
        }
        return this.m;
    }

    public List<zvc> d() {
        ArrayList arrayList = new ArrayList();
        List<byte[]> list = this.h;
        if (list != null) {
            Iterator<byte[]> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zvo.i.create(it.next()));
            }
        }
        if (ar()) {
            arrayList.add(zvo.w.create(u()));
        }
        List<byte[]> list2 = this.e;
        if (list2 != null) {
            Iterator<byte[]> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(zvo.f.create(it2.next()));
            }
        }
        if (ag()) {
            arrayList.add(zvo.g.create(zzg.f54809a));
        }
        if (aq()) {
            arrayList.add(zvo.aa.create(ac().intValue()));
        }
        List<String> list3 = this.g;
        if (list3 != null) {
            Iterator<String> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList.add(zvo.j.create(it3.next()));
            }
        }
        List<String> list4 = this.s;
        if (list4 != null) {
            Iterator<String> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList.add(zvo.u.create(it4.next()));
            }
        }
        if (ae()) {
            arrayList.add(zvo.f54623c.create(h()));
        }
        if (ah()) {
            arrayList.add(zvo.o.create(l().longValue()));
        }
        List<String> list5 = this.u;
        if (list5 != null) {
            Iterator<String> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList.add(zvo.z.create(it5.next()));
            }
        }
        if (ab()) {
            arrayList.add(zvo.f54622b.create(e()));
        }
        List<String> list6 = this.f;
        if (list6 != null) {
            Iterator<String> it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList.add(zvo.n.create(it6.next()));
            }
        }
        if (am()) {
            arrayList.add(zvo.r.create(t()));
        }
        if (aj()) {
            arrayList.add(zvo.t.create(r()));
        }
        if (ak()) {
            arrayList.add(zvo.m.create(q().intValue()));
        }
        if (ai()) {
            arrayList.add(zvo.d.create(f().e()));
        }
        if (af()) {
            arrayList.add(zvo.f54621a.create(j().e()));
        }
        if (ao()) {
            arrayList.add(zvo.v.create(p().intValue()));
        }
        if (as()) {
            arrayList.add(zvo.y.create(x().intValue()));
        }
        if (al()) {
            arrayList.add(zvo.l.create(s()));
        }
        if (an()) {
            arrayList.add(n().c());
        }
        List<zvc> list7 = this.m;
        if (list7 != null) {
            arrayList.addAll(list7);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public zvi b(zvc zvcVar) {
        if (zvo.x.contains(zvcVar.b())) {
            int iD = zvcVar.d();
            if (iD == 1) {
                e(zvcVar.h());
                return this;
            }
            if (iD == 17) {
                a(zvcVar.a());
                return this;
            }
            if (iD == 20) {
                b(zvcVar.e());
                return this;
            }
            if (iD == 23) {
                b(zvcVar.h());
                return this;
            }
            if (iD == 35) {
                i(zvcVar.e());
                return this;
            }
            if (iD == 39) {
                a(zvcVar.e());
                return this;
            }
            if (iD == 60) {
                g(zvcVar.a());
                return this;
            }
            if (iD == 258) {
                c(zvcVar.a());
                return this;
            }
            if (iD == 11) {
                e(zvcVar.e());
                return this;
            }
            if (iD == 12) {
                b(zvcVar.a());
                return this;
            }
            if (iD == 14) {
                d(zvcVar.c());
                return this;
            }
            if (iD == 15) {
                d(zvcVar.e());
                return this;
            }
            if (iD == 27) {
                c(zvcVar.h());
                return this;
            }
            if (iD != 28) {
                switch (iD) {
                    case 3:
                        h(zvcVar.e());
                        break;
                    case 4:
                        a(zvcVar.h());
                        break;
                    case 5:
                        b(true);
                        break;
                    case 6:
                        d(zvcVar.a());
                        break;
                    case 7:
                        f(zvcVar.a());
                        break;
                    case 8:
                        c(zvcVar.e());
                        break;
                    case 9:
                        g(zvcVar.h());
                        break;
                    default:
                        bc().add(zvcVar);
                        break;
                }
                return this;
            }
            h(zvcVar.a());
            return this;
        }
        bc().add(zvcVar);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder();
        int iD = -1;
        boolean z = false;
        for (zvc zvcVar : d()) {
            if (zvcVar.d() != iD) {
                if (iD != -1) {
                    if (z) {
                        sb2.append(']');
                    }
                    sb.append((CharSequence) sb2);
                    sb.append(", ");
                    sb2.setLength(0);
                }
                sb.append('\"');
                sb.append(zvcVar.b().getName());
                sb.append("\":");
                z = false;
            } else {
                if (!z) {
                    sb2.insert(0, '[');
                }
                sb2.append(",");
                z = true;
            }
            sb2.append(zvcVar.i());
            iD = zvcVar.d();
        }
        if (z) {
            sb2.append(']');
        }
        sb.append((CharSequence) sb2);
        sb.append('}');
        return sb.toString();
    }

    private String b(List<String> list, char c2) {
        StringBuilder sb = new StringBuilder();
        a(sb, list, c2);
        return sb.toString();
    }

    private void a(StringBuilder sb, List<String> list, char c2) {
        if (list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(c2);
        }
        sb.setLength(sb.length() - 1);
    }

    private void d(OptionDefinition optionDefinition, String str) {
        c(optionDefinition, str == null ? null : str.getBytes(CoAP.f44404a));
    }

    private void a(OptionDefinition optionDefinition, long j) {
        c(optionDefinition, zvk.b(j));
    }

    private void c(OptionDefinition optionDefinition, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException(optionDefinition.getName() + " option must not be null!");
        }
        optionDefinition.assertValue(bArr);
    }
}
