package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class t7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7p f34429a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s7p f34430b = new e(null, true);
    public static final s7p c;
    public static final s7p d;
    public static final s7p e;
    public static final s7p f;

    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34431b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f34432a;

        public a(boolean z) {
            this.f34432a = z;
        }

        @Override // t7p.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iA = t7p.a(Character.getDirectionality(charSequence.charAt(i)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f34432a) {
                        return 1;
                    }
                    i++;
                    z = z;
                } else if (this.f34432a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f34432a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34433a = new b();

        @Override // t7p.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iB = 2;
            while (i < i3 && iB == 2) {
                iB = t7p.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iB;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    public static abstract class d implements s7p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f34434a;

        public d(c cVar) {
            this.f34434a = cVar;
        }

        @Override // defpackage.s7p
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f34434a == null ? b() : c(charSequence, i, i2);
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i, int i2) {
            int iA = this.f34434a.a(charSequence, i, i2);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f34435b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.f34435b = z;
        }

        @Override // t7p.d
        public boolean b() {
            return this.f34435b;
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f34436b = new f();

        public f() {
            super(null);
        }

        @Override // t7p.d
        public boolean b() {
            return q8p.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f34433a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.f34431b, false);
        f = f.f34436b;
    }

    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
