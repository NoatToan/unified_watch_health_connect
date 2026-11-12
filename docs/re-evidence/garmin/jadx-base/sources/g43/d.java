package g43;

import com.garmin.android.gncs.NotificationConstants;
import i3.e5;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.commons.io.IOUtils;
import q23.h;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    BOOLEAN(h.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(h.CHAR, "char", "C", "java.lang.Character"),
    BYTE(h.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(h.SHORT, "short", "S", "java.lang.Short"),
    INT(h.INT, "int", "I", "java.lang.Integer"),
    FLOAT(h.FLOAT, "float", "F", "java.lang.Float"),
    LONG(h.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(h.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f75860m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumMap f75861n = new EnumMap(h.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f75862o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HashSet f75863p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final HashMap f75864q = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f75866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x33.c f75869d;

    static {
        for (d dVar : values()) {
            HashMap map = f75860m;
            String str = dVar.f75867b;
            if (str == null) {
                a(13);
                throw null;
            }
            map.put(str, dVar);
            f75861n.put(dVar.d(), dVar);
            f75862o.put(dVar.c(), dVar);
            String strReplace = dVar.f75869d.f188596a.f188600a.replace('.', IOUtils.DIR_SEPARATOR_UNIX);
            f75863p.add(strReplace);
            f75864q.put(strReplace, e5.h(new StringBuilder("("), dVar.f75868c, ")L", strReplace, ";"));
        }
    }

    d(h hVar, String str, String str2, String str3) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (str == null) {
            a(9);
            throw null;
        }
        if (str2 == null) {
            a(10);
            throw null;
        }
        if (str3 == null) {
            a(11);
            throw null;
        }
        this.f75866a = hVar;
        this.f75867b = str;
        this.f75868c = str2;
        this.f75869d = new x33.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i14) {
        String str;
        int i15;
        if (i14 != 4 && i14 != 6) {
            switch (i14) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i14 != 4 && i14 != 6) {
            switch (i14) {
                case 12:
                case 13:
                case 14:
                case 15:
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
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i14 != 4 && i14 != 6) {
            switch (i14) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i14) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 4 && i14 != 6) {
            switch (i14) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static d b(String str) {
        d dVar = (d) f75860m.get(str);
        if (dVar != null) {
            return dVar;
        }
        vb.h.q("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final String c() {
        String str = this.f75868c;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final h d() {
        h hVar = this.f75866a;
        if (hVar != null) {
            return hVar;
        }
        a(12);
        throw null;
    }
}
