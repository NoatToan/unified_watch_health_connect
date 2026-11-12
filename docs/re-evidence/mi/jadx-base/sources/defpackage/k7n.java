package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class k7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt3 f23560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23561b;
    public final c c;
    public final int d;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pt3 f23562a;

        /* JADX INFO: renamed from: k7n$a$a, reason: collision with other inner class name */
        public class C0989a extends b {
            public C0989a(k7n k7nVar, CharSequence charSequence) {
                super(k7nVar, charSequence);
            }

            @Override // k7n.b
            public int e(int i) {
                return i + 1;
            }

            @Override // k7n.b
            public int f(int i) {
                return a.this.f23562a.e(this.c, i);
            }
        }

        public a(pt3 pt3Var) {
            this.f23562a = pt3Var;
        }

        @Override // k7n.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(k7n k7nVar, CharSequence charSequence) {
            return new C0989a(k7nVar, charSequence);
        }
    }

    public static abstract class b extends a10<String> {
        public final CharSequence c;
        public final pt3 d;
        public final boolean e;
        public int f = 0;
        public int g;

        public b(k7n k7nVar, CharSequence charSequence) {
            this.d = k7nVar.f23560a;
            this.e = k7nVar.f23561b;
            this.g = k7nVar.d;
            this.c = charSequence;
        }

        @Override // defpackage.a10
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i = this.f;
            while (true) {
                int i2 = this.f;
                if (i2 == -1) {
                    return b();
                }
                int iF = f(i2);
                if (iF == -1) {
                    iF = this.c.length();
                    this.f = -1;
                } else {
                    this.f = e(iF);
                }
                int i3 = this.f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f = i4;
                    if (i4 > this.c.length()) {
                        this.f = -1;
                    }
                } else {
                    while (i < iF && this.d.g(this.c.charAt(i))) {
                        i++;
                    }
                    while (iF > i && this.d.g(this.c.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.e || i != iF) {
                        int i5 = this.g;
                        if (i5 == 1) {
                            iF = this.c.length();
                            this.f = -1;
                            while (iF > i && this.d.g(this.c.charAt(iF - 1))) {
                                iF--;
                            }
                        } else {
                            this.g = i5 - 1;
                        }
                        return this.c.subSequence(i, iF).toString();
                    }
                    i = this.f;
                }
            }
        }

        public abstract int e(int i);

        public abstract int f(int i);
    }

    public interface c {
        Iterator<String> a(k7n k7nVar, CharSequence charSequence);
    }

    public k7n(c cVar) {
        this(cVar, false, pt3.i(), Integer.MAX_VALUE);
    }

    public static k7n d(char c2) {
        return e(pt3.f(c2));
    }

    public static k7n e(pt3 pt3Var) {
        c6i.o(pt3Var);
        return new k7n(new a(pt3Var));
    }

    public List<String> f(CharSequence charSequence) {
        c6i.o(charSequence);
        Iterator<String> itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add(itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public k7n(c cVar, boolean z, pt3 pt3Var, int i) {
        this.c = cVar;
        this.f23561b = z;
        this.f23560a = pt3Var;
        this.d = i;
    }
}
