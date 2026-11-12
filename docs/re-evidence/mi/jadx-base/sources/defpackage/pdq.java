package defpackage;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.TableMap;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public class pdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TableMap<CharSequence, CharSequence> f30303a;

    public pdq() {
        this(null);
    }

    public static pdq e(String str, Charset charset, boolean z) {
        pdq pdqVar = new pdq();
        pdqVar.f(str, charset, z);
        return pdqVar;
    }

    public static String g(Object obj) {
        if (obj instanceof Iterable) {
            return CollUtil.k((Iterable) obj, ",");
        }
        return obj instanceof Iterator ? apd.c((Iterator) obj, ",") : yj4.w(obj);
    }

    public pdq a(CharSequence charSequence, Object obj) {
        this.f30303a.put(charSequence, g(obj));
        return this;
    }

    public pdq b(Map<? extends CharSequence, ?> map) {
        if (v4f.p(map)) {
            map.forEach(new BiConsumer() { // from class: odq
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f29045a.a((CharSequence) obj, obj2);
                }
            });
        }
        return this;
    }

    public final void c(String str, String str2, Charset charset) {
        if (str != null) {
            this.f30303a.put(d8q.b(str, charset), tt3.M(d8q.b(str2, charset)));
        } else if (str2 != null) {
            this.f30303a.put(d8q.b(str2, charset), null);
        }
    }

    public String d(Charset charset) {
        if (v4f.o(this.f30303a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<CharSequence, CharSequence> entry : this.f30303a) {
            if (z) {
                z = false;
            } else {
                sb.append(gv5.CONNECT_STR);
            }
            CharSequence key = entry.getKey();
            if (key != null) {
                sb.append(d8q.e(tt3.j0(key), charset));
                CharSequence value = entry.getValue();
                if (value != null) {
                    sb.append("=");
                    sb.append(d8q.e(tt3.j0(value), charset));
                }
            }
        }
        return sb.toString();
    }

    public pdq f(String str, Charset charset, boolean z) {
        int iIndexOf;
        if (tt3.F(str)) {
            return this;
        }
        if (z && (iIndexOf = str.indexOf(63)) > -1) {
            str = tt3.n0(str, iIndexOf + 1);
            if (tt3.F(str)) {
                return this;
            }
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        String strSubstring = null;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '&') {
                c(strSubstring, str.substring(i2, i), charset);
                int i3 = i + 4;
                if (i3 < length && "amp;".equals(str.substring(i + 1, i + 5))) {
                    i = i3;
                }
                i2 = i + 1;
                strSubstring = null;
            } else if (cCharAt == '=' && strSubstring == null) {
                strSubstring = str.substring(i2, i);
                i2 = i + 1;
            }
            i++;
        }
        if (i - i2 == length && (str.startsWith("http") || str.contains("/"))) {
            return this;
        }
        c(strSubstring, str.substring(i2, i), charset);
        return this;
    }

    public String toString() {
        return d(null);
    }

    public pdq(Map<? extends CharSequence, ?> map) {
        if (v4f.p(map)) {
            this.f30303a = new TableMap<>(map.size());
            b(map);
        } else {
            this.f30303a = new TableMap<>(16);
        }
    }
}
