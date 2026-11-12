package defpackage;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ndq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f27823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27824b;

    public static String d(CharSequence charSequence) {
        qk1.u(charSequence, "Path segment must be not null!", new Object[0]);
        return "/".contentEquals(charSequence) ? "" : tt3.r0(tt3.S(tt3.Q(tt3.r0(charSequence), "/"), "/"));
    }

    public static ndq e(String str, Charset charset) {
        ndq ndqVar = new ndq();
        ndqVar.f(str, charset);
        return ndqVar;
    }

    public ndq a(CharSequence charSequence) {
        b(d(charSequence), false);
        return this;
    }

    public final void b(CharSequence charSequence, boolean z) {
        if (this.f27823a == null) {
            this.f27823a = new LinkedList();
        }
        String strJ0 = tt3.j0(charSequence);
        if (z) {
            this.f27823a.add(0, strJ0);
        } else {
            this.f27823a.add(strJ0);
        }
    }

    public String c(Charset charset) {
        if (CollUtil.h(this.f27823a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.f27823a) {
            sb.append('/');
            sb.append(d8q.f(str, charset));
        }
        if (this.f27824b || tt3.G(sb)) {
            sb.append('/');
        }
        return sb.toString();
    }

    public ndq f(String str, Charset charset) {
        if (tt3.I(str)) {
            if (tt3.q(str, '/')) {
                this.f27824b = true;
            }
            Iterator<String> it = tt3.X(d(str), '/').iterator();
            while (it.hasNext()) {
                b(URLDecoder.decodeForPath(it.next(), charset), false);
            }
        }
        return this;
    }

    public String toString() {
        return c(null);
    }
}
