package j7;

import android.text.TextUtils;
import java.util.Locale;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f97453a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f97454b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f97455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f97456d;

    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f97457b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97458a;

        private a(boolean z14) {
            this.f97458a = z14;
        }

        @Override // j7.d.c
        public final int a(int i14, CharSequence charSequence) {
            int i15 = 0;
            boolean z14 = false;
            while (true) {
                boolean z15 = this.f97458a;
                if (i15 >= i14) {
                    if (z14) {
                        return z15 ? 1 : 0;
                    }
                    return 2;
                }
                byte directionality = Character.getDirectionality(charSequence.charAt(i15));
                e eVar = d.f97453a;
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (z15) {
                            return 0;
                        }
                    }
                    i15++;
                    z14 = z14;
                } else if (!z15) {
                    return 1;
                }
                z14 = true;
                i15++;
                z14 = z14;
            }
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f97459a = new b();

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0020  */
        @Override // j7.d.c
        public final int a(int i14, CharSequence charSequence) {
            int i15 = 0;
            i15 = 2;
            for (int i16 = 0; i16 < i14 && i15 == 2; i16++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i16));
                e eVar = d.f97453a;
                if (directionality == 0) {
                    i15 = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            i15 = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            i15 = 2;
                            continue;
                    }
                }
            }
            return i15;
        }
    }

    public interface c {
        int a(int i14, CharSequence charSequence);
    }

    /* JADX INFO: renamed from: j7.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC1861d implements j7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f97460a;

        public AbstractC1861d(c cVar) {
            this.f97460a = cVar;
        }

        public abstract boolean a();

        public final boolean b(int i14, CharSequence charSequence) {
            if (charSequence == null || i14 < 0 || charSequence.length() - i14 < 0) {
                h.w();
                return false;
            }
            c cVar = this.f97460a;
            if (cVar == null) {
                return a();
            }
            int iA = cVar.a(i14, charSequence);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }
    }

    public static class e extends AbstractC1861d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97461b;

        public e(c cVar, boolean z14) {
            super(cVar);
            this.f97461b = z14;
        }

        @Override // j7.d.AbstractC1861d
        public final boolean a() {
            return this.f97461b;
        }
    }

    public static class f extends AbstractC1861d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f97462b = 0;

        static {
            new f();
        }

        public f() {
            super(null);
        }

        @Override // j7.d.AbstractC1861d
        public final boolean a() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f97459a;
        f97455c = new e(bVar, false);
        f97456d = new e(bVar, true);
        new e(a.f97457b, false);
        int i14 = f.f97462b;
    }

    private d() {
    }
}
