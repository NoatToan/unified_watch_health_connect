package l72;

import i3.te;
import i3.wd;
import i3.yd;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f111258a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f111259b = new z3.e(-1985559542, false, new q(5));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l72/t0$a", "Li3/wd;", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2127a f111260a = new C2127a();

        /* JADX INFO: renamed from: l72.t0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l72/t0$a$a", "Li3/te;", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2127a implements te {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final yd f111261a = yd.Indefinite;

            @Override // i3.te
            /* JADX INFO: renamed from: a */
            public final String getF88112b() {
                return "Action";
            }

            @Override // i3.te
            /* JADX INFO: renamed from: b */
            public final boolean getF88113c() {
                return false;
            }

            @Override // i3.te
            /* JADX INFO: renamed from: getDuration, reason: from getter */
            public final yd getF111263a() {
                return this.f111261a;
            }

            @Override // i3.te
            /* JADX INFO: renamed from: getMessage */
            public final String getF88111a() {
                return "Message text.";
            }
        }

        @Override // i3.wd
        /* JADX INFO: renamed from: a */
        public final te getF88109a() {
            return this.f111260a;
        }

        @Override // i3.wd
        public final void b() {
        }

        @Override // i3.wd
        public final void dismiss() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l72/t0$b", "Li3/wd;", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements wd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f111262a = new a();

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l72/t0$b$a", "Li3/te;", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements te {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final yd f111263a = yd.Indefinite;

            @Override // i3.te
            /* JADX INFO: renamed from: a */
            public final String getF88112b() {
                return "Action";
            }

            @Override // i3.te
            /* JADX INFO: renamed from: b */
            public final boolean getF88113c() {
                return false;
            }

            @Override // i3.te
            /* JADX INFO: renamed from: getDuration, reason: from getter */
            public final yd getF111263a() {
                return this.f111263a;
            }

            @Override // i3.te
            /* JADX INFO: renamed from: getMessage */
            public final String getF88111a() {
                return "This is a longer message.";
            }
        }

        @Override // i3.wd
        /* JADX INFO: renamed from: a */
        public final te getF88109a() {
            return this.f111262a;
        }

        @Override // i3.wd
        public final void b() {
        }

        @Override // i3.wd
        public final void dismiss() {
        }
    }

    static {
        new z3.e(704455141, false, new l71.i(10));
        new z3.e(-1345627721, false, new l71.i(11));
    }
}
