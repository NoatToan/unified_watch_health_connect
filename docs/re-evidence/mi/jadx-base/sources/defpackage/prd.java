package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class prd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30677a;

    public class a extends prd {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30678b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(prd prdVar, String str) {
            super(prdVar, null);
            this.f30678b = str;
        }

        @Override // defpackage.prd
        public CharSequence h(Object obj) {
            return obj == null ? this.f30678b : prd.this.h(obj);
        }

        @Override // defpackage.prd
        public prd i(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public /* synthetic */ prd(prd prdVar, a aVar) {
        this(prdVar);
    }

    public static prd f(char c) {
        return new prd(String.valueOf(c));
    }

    public static prd g(String str) {
        return new prd(str);
    }

    public <A extends Appendable> A a(A a2, Iterator<? extends Object> it) throws IOException {
        c6i.o(a2);
        if (it.hasNext()) {
            a2.append(h(it.next()));
            while (it.hasNext()) {
                a2.append(this.f30677a);
                a2.append(h(it.next()));
            }
        }
        return a2;
    }

    public final StringBuilder b(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String c(Iterable<? extends Object> iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator<? extends Object> it) {
        return b(new StringBuilder(), it).toString();
    }

    public final String e(Object[] objArr) {
        return c(Arrays.asList(objArr));
    }

    public CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public prd i(String str) {
        c6i.o(str);
        return new a(this, str);
    }

    public prd(String str) {
        this.f30677a = (String) c6i.o(str);
    }

    public prd(prd prdVar) {
        this.f30677a = prdVar.f30677a;
    }
}
