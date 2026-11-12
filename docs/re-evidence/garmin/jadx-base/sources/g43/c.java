package g43;

import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75851a;

    private c(String str) {
        if (str != null) {
            this.f75851a = str;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i14) {
        String str;
        int i15;
        if (i14 != 3 && i14 != 5) {
            switch (i14) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 3 && i14 != 5) {
            switch (i14) {
                case 8:
                case 9:
                case 10:
                    i15 = 2;
                    break;
                default:
                    i15 = 3;
                    break;
            }
        } else {
            i15 = 2;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i14 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i14 != 5) {
            switch (i14) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i14) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 3 && i14 != 5) {
            switch (i14) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static c b(x33.b bVar) {
        if (bVar != null) {
            return new c(f(bVar));
        }
        a(1);
        throw null;
    }

    public static c c(x33.c cVar) {
        if (cVar != null) {
            return new c(cVar.f188596a.f188600a.replace('.', IOUtils.DIR_SEPARATOR_UNIX));
        }
        a(4);
        throw null;
    }

    public static c d(String str) {
        if (str != null) {
            return new c(str);
        }
        a(0);
        throw null;
    }

    public static String f(x33.b bVar) {
        if (bVar == null) {
            a(2);
            throw null;
        }
        x33.c cVar = bVar.f188591a;
        String strReplace = bVar.f188592b.f188596a.f188600a.replace('.', '$');
        if (!cVar.f188596a.c()) {
            strReplace = cVar.f188596a.f188600a.replace('.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        a(3);
        throw null;
    }

    public final String e() {
        String str = this.f75851a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f75851a.equals(((c) obj).f75851a);
    }

    public final int hashCode() {
        return this.f75851a.hashCode();
    }

    public final String toString() {
        return this.f75851a;
    }
}
