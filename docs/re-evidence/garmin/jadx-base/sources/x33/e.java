package x33;

import d53.u;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188604a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f188604a = iArr;
        }
    }

    public static final c a(c cVar, c cVar2) {
        cVar.getClass();
        d dVar = cVar.f188596a;
        cVar2.getClass();
        d dVar2 = cVar2.f188596a;
        if (!cVar.equals(cVar2) && !dVar2.c()) {
            String str = dVar.f188600a;
            String str2 = dVar2.f188600a;
            if (!u.y(str, str2, false) || str.charAt(str2.length()) != '.') {
                return cVar;
            }
        }
        if (dVar2.c()) {
            return cVar;
        }
        return cVar.equals(cVar2) ? c.f188595d : new c(dVar.f188600a.substring(dVar2.f188600a.length() + 1));
    }
}
