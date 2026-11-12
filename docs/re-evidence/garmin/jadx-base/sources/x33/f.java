package x33;

import com.google.firebase.messaging.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Comparable<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188606b;

    private f(String str, boolean z14) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f188605a = str;
        this.f188606b = z14;
    }

    public static /* synthetic */ void a(int i14) {
        String str = (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) ? 2 : 3];
        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i14 == 1) {
            objArr[1] = "asString";
        } else if (i14 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i14 == 3 || i14 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f d(String str) {
        if (str != null) {
            return str.startsWith("<") ? g(str) : e(str);
        }
        a(9);
        throw null;
    }

    public static f e(String str) {
        if (str != null) {
            return new f(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f g(String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        vb.h.s("special name must start with '<': ".concat(str));
        return null;
    }

    public final String b() {
        String str = this.f188605a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (this.f188606b) {
            l.n(this, "not identifier: ");
            return null;
        }
        String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        return this.f188605a.compareTo(fVar.f188605a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f188606b == fVar.f188606b && this.f188605a.equals(fVar.f188605a);
    }

    public final int hashCode() {
        return (this.f188605a.hashCode() * 31) + (this.f188606b ? 1 : 0);
    }

    public final String toString() {
        return this.f188605a;
    }
}
