package c63;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25088a = a.f25089a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/z0$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f25089a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lc63/z0$c;", "Lc63/z0;", "format", "<init>", "(Lc63/z0;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z0 f25160b;

        public c(z0 z0Var) {
            z0Var.getClass();
            this.f25160b = z0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f25160b.equals(((c) obj).f25160b);
        }

        public final int hashCode() {
            return this.f25160b.hashCode();
        }

        public final String toString() {
            return "[" + this.f25160b + ']';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$d;", "Lc63/z0;", "", "formats", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<z0> f25161b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends z0> list) {
            list.getClass();
            this.f25161b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f25161b.equals(((d) obj).f25161b);
        }

        public final int hashCode() {
            return this.f25161b.hashCode();
        }

        public final String toString() {
            return p13.h0.k0(this.f25161b, "", null, null, null, 62);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$e;", "Lc63/z0;", "", "literal", "<init>", "(Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25162b;

        public e(String str) {
            str.getClass();
            this.f25162b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f25162b.equals(((e) obj).f25162b);
        }

        public final int hashCode() {
            return this.f25162b.hashCode();
        }

        public final String toString() {
            String str = this.f25162b;
            if (str.equals("'")) {
                return "''";
            }
            for (int i14 = 0; i14 < str.length(); i14++) {
                if (Character.isLetter(str.charAt(i14))) {
                    return o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "'", str);
                }
            }
            return str.length() == 0 ? "" : str;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lc63/z0$b;", "Lc63/z0;", "<init>", "()V", "d", "a", "c", JWKParameterNames.RSA_EXPONENT, "b", "Lc63/z0$b$a;", "Lc63/z0$b$b;", "Lc63/z0$b$c;", "Lc63/z0$b$e;", "Lc63/b1;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b implements z0 {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract int getF25158b();

        /* JADX INFO: renamed from: b */
        public abstract char getF25159c();

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return getF25159c() == bVar.getF25159c() && getF25158b() == bVar.getF25158b();
        }

        public final int hashCode() {
            return getF25158b() + (Character.hashCode(getF25159c()) * 31);
        }

        public final String toString() {
            return d53.u.u(String.valueOf(getF25159c()), getF25158b());
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lc63/z0$b$c;", "Lc63/z0$b;", "<init>", "()V", "b", "a", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "Lc63/z0$b$c$a;", "Lc63/z0$b$c$b;", "Lc63/z0$b$c$c;", "Lc63/z0$b$c$d;", "Lc63/z0$b$c$e;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class c extends b {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$a;", "Lc63/z0$b$c;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a extends c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25118b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25119c;

                public a(int i14) {
                    super(null);
                    this.f25118b = i14;
                    this.f25119c = 'h';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25118b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25119c;
                }

                @Override // c63.z0.b.c
                public final void c(s.d dVar) {
                    dVar.getClass();
                    a1.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$c$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$b;", "Lc63/z0$b$c;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0365b extends c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25120b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25121c;

                public C0365b(int i14) {
                    super(null);
                    this.f25120b = i14;
                    this.f25121c = 'a';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25120b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25121c;
                }

                @Override // c63.z0.b.c
                public final void c(s.d dVar) {
                    dVar.getClass();
                    a1.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$c$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$c;", "Lc63/z0$b$c;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0366c extends c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25122b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25123c;

                public C0366c(int i14) {
                    super(null);
                    this.f25122b = i14;
                    this.f25123c = 'H';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25122b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25123c;
                }

                @Override // c63.z0.b.c
                public final void c(s.d dVar) {
                    dVar.getClass();
                    int i14 = this.f25122b;
                    if (i14 == 1) {
                        dVar.e(r0.NONE);
                    } else if (i14 == 2) {
                        dVar.e(r0.ZERO);
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$d;", "Lc63/z0$b$c;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d extends c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25124b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25125c;

                public d(int i14) {
                    super(null);
                    this.f25124b = i14;
                    this.f25125c = 'm';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25124b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25125c;
                }

                @Override // c63.z0.b.c
                public final void c(s.d dVar) {
                    dVar.getClass();
                    int i14 = this.f25124b;
                    if (i14 == 1) {
                        dVar.m(r0.NONE);
                    } else if (i14 == 2) {
                        dVar.m(r0.ZERO);
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }
            }

            private c() {
                super(null);
            }

            public abstract void c(s.d dVar);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lc63/z0$b$c$e;", "Lc63/z0$b$c;", "<init>", "()V", "a", "Lc63/z0$b$c$e$a;", "Lc63/z0$b$c$f;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static abstract class e extends c {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$e$a;", "Lc63/z0$b$c$e;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a extends e {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f25126b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final char f25127c;

                    public a(int i14) {
                        super(null);
                        this.f25126b = i14;
                        this.f25127c = 's';
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final int getF25158b() {
                        return this.f25126b;
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final char getF25159c() {
                        return this.f25127c;
                    }

                    @Override // c63.z0.b.c
                    public final void c(s.d dVar) {
                        dVar.getClass();
                        int i14 = this.f25126b;
                        if (i14 == 1) {
                            dVar.n(r0.NONE);
                        } else if (i14 == 2) {
                            dVar.n(r0.ZERO);
                        } else {
                            a1.b(this);
                            throw null;
                        }
                    }
                }

                private e() {
                    super(null);
                }

                public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
                    this();
                }
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lc63/z0$b$c$f;", "Lc63/z0$b$c$e;", "<init>", "()V", "a", "b", "d", "c", "Lc63/z0$b$c$f$a;", "Lc63/z0$b$c$f$b;", "Lc63/z0$b$c$f$c;", "Lc63/z0$b$c$f$d;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static abstract class f extends e {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$f$a;", "Lc63/z0$b$c$f;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a extends f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f25128b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final char f25129c;

                    public a(int i14) {
                        super(null);
                        this.f25128b = i14;
                        this.f25129c = 'S';
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final int getF25158b() {
                        return this.f25128b;
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final char getF25159c() {
                        return this.f25129c;
                    }

                    @Override // c63.z0.b.c
                    public final void c(s.d dVar) {
                        dVar.getClass();
                        dVar.H(this.f25128b);
                    }
                }

                /* JADX INFO: renamed from: c63.z0$b$c$f$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$f$b;", "Lc63/z0$b$c$f;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class C0367b extends f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f25130b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final char f25131c;

                    public C0367b(int i14) {
                        super(null);
                        this.f25130b = i14;
                        this.f25131c = 'A';
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final int getF25158b() {
                        return this.f25130b;
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final char getF25159c() {
                        return this.f25131c;
                    }

                    @Override // c63.z0.b.c
                    public final void c(s.d dVar) {
                        dVar.getClass();
                        a1.f("millisecond-of-day", null);
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: c63.z0$b$c$f$c, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$f$c;", "Lc63/z0$b$c$f;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class C0368c extends f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f25132b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final char f25133c;

                    public C0368c(int i14) {
                        super(null);
                        this.f25132b = i14;
                        this.f25133c = 'N';
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final int getF25158b() {
                        return this.f25132b;
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final char getF25159c() {
                        return this.f25133c;
                    }

                    @Override // c63.z0.b.c
                    public final void c(s.d dVar) {
                        dVar.getClass();
                        a1.f("nanosecond-of-day", null);
                        throw null;
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$c$f$d;", "Lc63/z0$b$c$f;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class d extends f {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f25134b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final char f25135c;

                    public d(int i14) {
                        super(null);
                        this.f25134b = i14;
                        this.f25135c = 'n';
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final int getF25158b() {
                        return this.f25134b;
                    }

                    @Override // c63.z0.b
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final char getF25159c() {
                        return this.f25135c;
                    }

                    @Override // c63.z0.b.c
                    public final void c(s.d dVar) {
                        dVar.getClass();
                        a1.f("nano-of-second", "Maybe you meant 'S' instead of 'n'?");
                        throw null;
                    }
                }

                private f() {
                    super(null);
                }

                public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
                    this();
                }
            }

            public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lc63/z0$b$a;", "Lc63/z0$b;", "<init>", "()V", "d", "a", "f", "h", "j", IntegerTokenConverter.CONVERTER_KEY, "b", JWKParameterNames.RSA_EXPONENT, "g", "c", "Lc63/z0$b$a$a;", "Lc63/z0$b$a$b;", "Lc63/z0$b$a$c;", "Lc63/z0$b$a$d;", "Lc63/z0$b$a$e;", "Lc63/z0$b$a$f;", "Lc63/z0$b$a$g;", "Lc63/z0$b$a$h;", "Lc63/z0$b$a$i;", "Lc63/z0$b$a$j;", "Lc63/z0$b$d;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class a extends b {

            /* JADX INFO: renamed from: c63.z0$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$a;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0361a extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25090b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25091c;

                public C0361a(int i14) {
                    super(null);
                    this.f25090b = i14;
                    this.f25091c = 'd';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25090b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25091c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    int i14 = this.f25090b;
                    if (i14 == 1) {
                        aVar.h(r0.NONE);
                    } else if (i14 == 2) {
                        aVar.h(r0.ZERO);
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$b;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0362b extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25092b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25093c;

                public C0362b(int i14) {
                    super(null);
                    this.f25092b = i14;
                    this.f25093c = 'E';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25092b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25093c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.e(this, null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$c;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25094b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25095c;

                public c(int i14) {
                    super(null);
                    this.f25094b = i14;
                    this.f25095c = 'F';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25094b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25095c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.f("day-of-week-in-month", null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$d;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25096b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25097c;

                public d(int i14) {
                    super(null);
                    this.f25096b = i14;
                    this.f25097c = 'D';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25096b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25097c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    int i14 = this.f25096b;
                    if (i14 == 1) {
                        aVar.c(r0.NONE);
                    } else if (i14 == 3) {
                        aVar.c(r0.ZERO);
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$e;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class e extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25098b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25099c;

                public e(int i14) {
                    super(null);
                    this.f25098b = i14;
                    this.f25099c = 'e';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25098b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25099c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.e(this, null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$f;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class f extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25100b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25101c;

                public f(int i14) {
                    super(null);
                    this.f25100b = i14;
                    this.f25101c = 'g';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25100b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25101c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.f("modified-julian-day", null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$g;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class g extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25102b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25103c;

                public g(int i14) {
                    super(null);
                    this.f25102b = i14;
                    this.f25103c = 'c';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25102b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25103c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.e(this, null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$h;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class h extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25104b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25105c;

                public h(int i14) {
                    super(null);
                    this.f25104b = i14;
                    this.f25105c = 'Y';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25104b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25105c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.f("week-based-year", null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$i;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class i extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25106b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25107c;

                public i(int i14) {
                    super(null);
                    this.f25106b = i14;
                    this.f25107c = 'W';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25106b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25107c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.f("week-of-month", null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$a$j;", "Lc63/z0$b$a;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class j extends a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25108b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25109c;

                public j(int i14) {
                    super(null);
                    this.f25108b = i14;
                    this.f25109c = 'w';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25108b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25109c;
                }

                @Override // c63.z0.b.a
                public final void c(s.a aVar) {
                    aVar.getClass();
                    a1.f("week-of-week-based-year", null);
                    throw null;
                }
            }

            private a() {
                super(null);
            }

            public abstract void c(s.a aVar);

            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        /* JADX INFO: renamed from: c63.z0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lc63/z0$b$b;", "Lc63/z0$b;", "<init>", "()V", "a", "b", "c", "d", "Lc63/z0$b$b$a;", "Lc63/z0$b$b$b;", "Lc63/z0$b$b$c;", "Lc63/z0$b$b$d;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class AbstractC0363b extends b {

            /* JADX INFO: renamed from: c63.z0$b$b$a */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$b$a;", "Lc63/z0$b$b;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a extends AbstractC0363b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25110b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25111c;

                public a(int i14) {
                    super(null);
                    this.f25110b = i14;
                    this.f25111c = 'O';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25110b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25111c;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final void c(s.e eVar) {
                    eVar.getClass();
                    a1.e(this, null);
                    throw null;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 e() {
                    a1.e(this, null);
                    throw null;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 f() {
                    a1.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$b$b;", "Lc63/z0$b$b;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0364b extends AbstractC0363b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25112b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25113c;

                public C0364b(int i14) {
                    super(null);
                    this.f25112b = i14;
                    this.f25113c = 'X';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25112b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25113c;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final void c(s.e eVar) {
                    eVar.getClass();
                    int i14 = this.f25112b;
                    if (i14 == 1) {
                        d(eVar, true, false);
                        return;
                    }
                    if (i14 == 2) {
                        d(eVar, true, false);
                        return;
                    }
                    if (i14 == 3) {
                        d(eVar, true, true);
                        return;
                    }
                    if (i14 == 4) {
                        d(eVar, true, false);
                    } else if (i14 == 5) {
                        d(eVar, true, true);
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 e() {
                    return this.f25112b == 1 ? j1.IF_NONZERO : j1.ALWAYS;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 f() {
                    return this.f25112b <= 3 ? j1.NEVER : j1.IF_NONZERO;
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$b$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$b$c;", "Lc63/z0$b$b;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c extends AbstractC0363b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25114b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25115c;

                public c(int i14) {
                    super(null);
                    this.f25114b = i14;
                    this.f25115c = 'x';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25114b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25115c;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final void c(s.e eVar) {
                    eVar.getClass();
                    int i14 = this.f25114b;
                    if (i14 == 1) {
                        d(eVar, false, false);
                        return;
                    }
                    if (i14 == 2) {
                        d(eVar, false, false);
                        return;
                    }
                    if (i14 == 3) {
                        d(eVar, false, true);
                        return;
                    }
                    if (i14 == 4) {
                        d(eVar, false, false);
                    } else if (i14 == 5) {
                        d(eVar, false, true);
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 e() {
                    return this.f25114b == 1 ? j1.IF_NONZERO : j1.ALWAYS;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 f() {
                    return this.f25114b <= 3 ? j1.NEVER : j1.IF_NONZERO;
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$b$d */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$b$d;", "Lc63/z0$b$b;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d extends AbstractC0363b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25116b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25117c;

                public d(int i14) {
                    super(null);
                    this.f25116b = i14;
                    this.f25117c = 'Z';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25116b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25117c;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final void c(s.e eVar) {
                    eVar.getClass();
                    int i14 = this.f25116b;
                    if (i14 == 1 || i14 == 2 || i14 == 3) {
                        d(eVar, false, false);
                        return;
                    }
                    if (i14 == 4) {
                        a1.e(new a(4), null);
                        throw null;
                    }
                    if (i14 == 5) {
                        d(eVar, false, true);
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 e() {
                    return j1.ALWAYS;
                }

                @Override // c63.z0.b.AbstractC0363b
                public final j1 f() {
                    return this.f25116b <= 3 ? j1.NEVER : j1.IF_NONZERO;
                }
            }

            private AbstractC0363b() {
                super(null);
            }

            public abstract void c(s.e eVar);

            public final void d(s.e eVar, boolean z14, boolean z15) {
                eVar.getClass();
                j1 j1VarE = e();
                j1 j1VarF = f();
                o13.t tVar = f1.f24972a;
                j1VarE.getClass();
                j1VarF.getClass();
                if (j1VarE.compareTo(j1VarF) < 0) {
                    vb.h.s("Seconds cannot be included without minutes");
                } else if (z14) {
                    t.c(eVar, "Z", new e1(j1VarE, z15, j1VarF, 0));
                } else {
                    eVar.g(r0.ZERO);
                    f1.a(eVar, j1VarE, new as2.d(z15, j1VarF, 4));
                }
            }

            public abstract j1 e();

            public abstract j1 f();

            public /* synthetic */ AbstractC0363b(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lc63/z0$b$d;", "Lc63/z0$b$a;", "<init>", "()V", "b", "h", IntegerTokenConverter.CONVERTER_KEY, "a", JWKParameterNames.RSA_EXPONENT, "c", "f", "d", "g", "Lc63/z0$b$d$a;", "Lc63/z0$b$d$b;", "Lc63/z0$b$d$c;", "Lc63/z0$b$d$d;", "Lc63/z0$b$d$e;", "Lc63/z0$b$d$f;", "Lc63/z0$b$d$g;", "Lc63/z0$b$d$h;", "Lc63/z0$b$d$i;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class d extends a {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$a;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25136b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25137c;

                public a(int i14) {
                    super(null);
                    this.f25136b = i14;
                    this.f25137c = 'U';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25136b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25137c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    a1.f("cyclic-year", null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$d$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$b;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0369b extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25138b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25139c;

                public C0369b(int i14) {
                    super(null);
                    this.f25138b = i14;
                    this.f25139c = 'G';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25138b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25139c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    a1.e(this, null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$c;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25140b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25141c;

                public c(int i14) {
                    super(null);
                    this.f25140b = i14;
                    this.f25141c = 'M';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25140b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25141c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    int i14 = this.f25140b;
                    if (i14 == 1) {
                        fVar.r(r0.NONE);
                        return;
                    }
                    if (i14 == 2) {
                        fVar.r(r0.ZERO);
                    } else {
                        if (i14 == 3 || i14 == 4 || i14 == 5) {
                            a1.e(this, null);
                            throw null;
                        }
                        a1.b(this);
                        throw null;
                    }
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$d$d, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$d;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0370d extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25142b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25143c;

                public C0370d(int i14) {
                    super(null);
                    this.f25142b = i14;
                    this.f25143c = 'Q';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25142b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25143c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    int i14 = this.f25142b;
                    if (i14 == 1 || i14 == 2) {
                        a1.f("quarter-of-year", null);
                        throw null;
                    }
                    if (i14 == 3 || i14 == 4 || i14 == 5) {
                        a1.e(this, null);
                        throw null;
                    }
                    a1.b(this);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$e;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class e extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25144b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25145c;

                public e(int i14) {
                    super(null);
                    this.f25144b = i14;
                    this.f25145c = 'r';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25144b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25145c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    a1.f("related-gregorian-year", null);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$f;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class f extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25146b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25147c;

                public f(int i14) {
                    super(null);
                    this.f25146b = i14;
                    this.f25147c = 'L';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25146b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25147c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    int i14 = this.f25146b;
                    if (i14 == 1) {
                        fVar.r(r0.NONE);
                        return;
                    }
                    if (i14 == 2) {
                        fVar.r(r0.ZERO);
                    } else {
                        if (i14 == 3 || i14 == 4 || i14 == 5) {
                            a1.e(this, null);
                            throw null;
                        }
                        a1.b(this);
                        throw null;
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$g;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class g extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25148b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25149c;

                public g(int i14) {
                    super(null);
                    this.f25148b = i14;
                    this.f25149c = 'q';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25148b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25149c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    int i14 = this.f25148b;
                    if (i14 == 1 || i14 == 2) {
                        a1.f("standalone-quarter-of-year", null);
                        throw null;
                    }
                    if (i14 == 3 || i14 == 4 || i14 == 5) {
                        a1.e(this, null);
                        throw null;
                    }
                    a1.b(this);
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$h;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class h extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25150b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25151c;

                public h(int i14) {
                    super(null);
                    this.f25150b = i14;
                    this.f25151c = 'u';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25150b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25151c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    int i14 = this.f25150b;
                    if (i14 == 1) {
                        fVar.o(r0.NONE);
                        return;
                    }
                    if (i14 == 2) {
                        fVar.j();
                        return;
                    }
                    if (i14 == 3) {
                        a1.c(this, i14);
                        throw null;
                    }
                    if (i14 == 4) {
                        fVar.o(r0.ZERO);
                    } else {
                        a1.c(this, i14);
                        throw null;
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$d$i;", "Lc63/z0$b$d;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class i extends d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25152b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25153c;

                public i(int i14) {
                    super(null);
                    this.f25152b = i14;
                    this.f25153c = 'y';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25152b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25153c;
                }

                @Override // c63.z0.b.d
                public final void d(s.f fVar) {
                    fVar.getClass();
                    int i14 = this.f25152b;
                    if (i14 == 1) {
                        r0 r0Var = r0.NONE;
                        e0 e0Var = o1.f25034a;
                        r0Var.getClass();
                        if (fVar instanceof c63.g) {
                            ((c63.g) fVar).v(new e63.e(new k1(r0Var, true)));
                            return;
                        }
                        return;
                    }
                    if (i14 == 2) {
                        e0 e0Var2 = o1.f25034a;
                        if (fVar instanceof c63.g) {
                            ((c63.g) fVar).v(new e63.e(new s0(2000, true)));
                            return;
                        }
                        return;
                    }
                    if (i14 == 3) {
                        a1.c(this, i14);
                        throw null;
                    }
                    if (i14 != 4) {
                        a1.c(this, i14);
                        throw null;
                    }
                    r0 r0Var2 = r0.ZERO;
                    e0 e0Var3 = o1.f25034a;
                    r0Var2.getClass();
                    if (fVar instanceof c63.g) {
                        ((c63.g) fVar).v(new e63.e(new k1(r0Var2, true)));
                    }
                }
            }

            private d() {
                super(null);
            }

            @Override // c63.z0.b.a
            public final void c(s.a aVar) {
                aVar.getClass();
                d(aVar);
            }

            public abstract void d(s.f fVar);

            public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lc63/z0$b$e;", "Lc63/z0$b;", "<init>", "()V", "b", "a", "c", "Lc63/z0$b$e$a;", "Lc63/z0$b$e$b;", "Lc63/z0$b$e$c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class e extends b {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$e$a;", "Lc63/z0$b$e;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a extends e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25154b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25155c;

                public a(int i14) {
                    super(null);
                    this.f25154b = i14;
                    this.f25155c = 'v';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25154b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25155c;
                }

                @Override // c63.z0.b.e
                public final void c(s.c cVar) {
                    cVar.getClass();
                    a1.e(this, null);
                    throw null;
                }
            }

            /* JADX INFO: renamed from: c63.z0$b$e$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$e$b;", "Lc63/z0$b$e;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0371b extends e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25156b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25157c;

                public C0371b(int i14) {
                    super(null);
                    this.f25156b = i14;
                    this.f25157c = 'V';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25156b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25157c;
                }

                @Override // c63.z0.b.e
                public final void c(s.c cVar) {
                    cVar.getClass();
                    if (this.f25156b == 2) {
                        cVar.G();
                    } else {
                        a1.b(this);
                        throw null;
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc63/z0$b$e$c;", "Lc63/z0$b$e;", "", "formatLength", "<init>", "(I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c extends e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f25158b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final char f25159c;

                public c(int i14) {
                    super(null);
                    this.f25158b = i14;
                    this.f25159c = 'z';
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF25158b() {
                    return this.f25158b;
                }

                @Override // c63.z0.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public final char getF25159c() {
                    return this.f25159c;
                }

                @Override // c63.z0.b.e
                public final void c(s.c cVar) {
                    cVar.getClass();
                    a1.e(this, "Format 'V' can be used to format time zone IDs in a locale-invariant manner.");
                    throw null;
                }
            }

            private e() {
                super(null);
            }

            public abstract void c(s.c cVar);

            public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        private b() {
        }
    }
}
