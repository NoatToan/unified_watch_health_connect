package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zev, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001\u001a\u0011\u0010\t\u001a\u00020\n*\u00020\u0001H\u0002¢\u0006\u0002\b\u000b\u001a!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001aJ\u0010\u000f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0082\b¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"trimMargin", "", "marginPrefix", "replaceIndentByMargin", "newIndent", "trimIndent", "replaceIndent", "prependIndent", "indent", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "getIndentFunction", "Lkotlin/Function1;", "getIndentFunction$StringsKt__IndentKt", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class trimMargin extends appendRange {
    public static /* synthetic */ String d(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return zes.b(str, str2);
    }

    public static final String b(String str, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        return zes.d(str, "", str2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    public static final String d(String str, String str2, String str3) {
        int i;
        String strInvoke;
        String str4;
        String strSubstring;
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        if (zes.d((CharSequence) str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listC = zes.c((CharSequence) str);
        int length = str.length();
        int length2 = str2.length();
        int size = listC.size();
        Function1<String, String> function1B = b(str2);
        int iA = yzp.a((List) listC);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listC) {
            if (i2 < 0) {
                yzp.a();
            }
            String str5 = (String) obj;
            if ((i2 == 0 || i2 == iA) && zes.d((CharSequence) str5)) {
                i = i2;
                strInvoke = null;
            } else {
                String str6 = str5;
                int length3 = str6.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        i3 = -1;
                        break;
                    }
                    if (!zek.b(str6.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    str4 = str5;
                    i = i2;
                } else {
                    int i4 = i3;
                    str4 = str5;
                    i = i2;
                    if (zes.e(str5, str3, i3, false, 4, null)) {
                        int length4 = str3.length();
                        zcp.e(str4, "");
                        strSubstring = str4.substring(i4 + length4);
                        zcp.b((Object) strSubstring, "");
                    }
                    if (strSubstring != null || (strInvoke = function1B.invoke(strSubstring)) == null) {
                        strInvoke = str4;
                    }
                }
                strSubstring = null;
                if (strSubstring != null) {
                    strInvoke = str4;
                } else {
                    strInvoke = str4;
                }
            }
            if (strInvoke != null) {
                arrayList.add(strInvoke);
            }
            i2 = i + 1;
        }
        return ((StringBuilder) yzp.a(arrayList, new StringBuilder(length + (length2 * size)), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String d(String str) {
        zcp.c(str, "");
        return zes.e(str, "");
    }

    public static final String e(String str, String str2) {
        String strInvoke;
        zcp.c(str, "");
        zcp.c(str2, "");
        List<String> listC = zes.c((CharSequence) str);
        List<String> list = listC;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!zes.d((CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(yzp.e(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(a((String) it.next())));
        }
        Integer num = (Integer) yzp.d((Iterable) arrayList3);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length();
        int length2 = str2.length();
        int size = listC.size();
        Function1<String, String> function1B = b(str2);
        int iA = yzp.a((List) listC);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (i < 0) {
                yzp.a();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == iA) && zes.d((CharSequence) str3)) {
                str3 = null;
            } else {
                String strA = zes.a(str3, iIntValue);
                if (strA != null && (strInvoke = function1B.invoke(strA)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList4.add(str3);
            }
            i++;
        }
        return ((StringBuilder) yzp.a(arrayList4, new StringBuilder(length + (length2 * size)), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[RETURN] */
    private static final int a(String str) {
        String str2 = str;
        int length = str2.length();
        int i = 0;
        while (i < length) {
            if (!zek.b(str2.charAt(i))) {
                if (i == -1) {
                    return str.length();
                }
                return i;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    private static final Function1<String, String> b(final String str) {
        return str.length() == 0 ? new Function1() { // from class: zew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trimMargin.c((String) obj);
            }
        } : new Function1() { // from class: zez
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trimMargin.d(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(String str, String str2) {
        zcp.c(str2, "");
        return str + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(String str) {
        zcp.c(str, "");
        return str;
    }
}
