package kotlin.text;

import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class f extends e {

    public static final class a extends Lambda implements Function1<String, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String str) {
            return str;
        }
    }

    public static final class b extends Lambda implements Function1<String, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String str) {
            return Intrinsics.stringPlus(this.a, str);
        }
    }

    public static final class c extends Lambda implements Function1<String, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String str) {
            if (m.isBlank(str)) {
                return str.length() < this.a.length() ? this.a : str;
            }
            return Intrinsics.stringPlus(this.a, str);
        }
    }

    private static final Function1<String, String> d(String str) {
        return str.length() == 0 ? a.a : new b(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (!kotlin.text.a.isWhitespace(str.charAt(i))) {
                if (i == -1) {
                    return str.length();
                }
                return i;
            }
            i = i2;
        }
        i = -1;
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    private static final String f(List<String> list, int i, Function1<? super String, String> function1, Function1<? super String, String> function2) {
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String strInvoke = (String) obj;
            if ((i2 == 0 || i2 == lastIndex) && m.isBlank(strInvoke)) {
                strInvoke = null;
            } else {
                String strInvoke2 = function2.invoke(strInvoke);
                if (strInvoke2 != null) {
                    strInvoke = function1.invoke(strInvoke2);
                }
            }
            if (strInvoke != null) {
                arrayList.add(strInvoke);
            }
            i2 = i3;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(i), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
    }

    @NotNull
    public static final String prependIndent(@NotNull String str, @NotNull String str2) {
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new c(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    @NotNull
    public static final String replaceIndent(@NotNull String str, @NotNull String str2) {
        List<String> listLines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLines) {
            if (!m.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(e((String) it2.next())));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int i = 0;
        int iIntValue = num == null ? 0 : num.intValue();
        int length = str.length() + (str2.length() * listLines.size());
        Function1<String, String> function1D = d(str2);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String strInvoke = (String) obj2;
            if ((i == 0 || i == lastIndex) && m.isBlank(strInvoke)) {
                strInvoke = null;
            } else {
                String strDrop = StringsKt___StringsKt.drop(strInvoke, iIntValue);
                if (strDrop != null) {
                    strInvoke = function1D.invoke(strDrop);
                }
            }
            if (strInvoke != null) {
                arrayList3.add(strInvoke);
            }
            i = i2;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList3, new StringBuilder(length), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    @NotNull
    public static final String replaceIndentByMargin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i;
        if (!(!m.isBlank(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listLines = StringsKt__StringsKt.lines(str);
        int length = str.length() + (str2.length() * listLines.size());
        Function1<String, String> function1D = d(str2);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listLines) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String strInvoke = (String) obj;
            String strSubstring = null;
            if ((i2 == 0 || i2 == lastIndex) && m.isBlank(strInvoke)) {
                strInvoke = null;
            } else {
                int length2 = strInvoke.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    }
                    int i5 = i4 + 1;
                    if (!kotlin.text.a.isWhitespace(strInvoke.charAt(i4))) {
                        i = i4;
                        break;
                    }
                    i4 = i5;
                }
                if (i != -1 && m.startsWith$default(strInvoke, str3, i, false, 4, null)) {
                    strSubstring = strInvoke.substring(i + str3.length());
                }
                if (strSubstring != null) {
                    strInvoke = function1D.invoke(strSubstring);
                }
            }
            if (strInvoke != null) {
                arrayList.add(strInvoke);
            }
            i2 = i3;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(length), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = AESEncryptionHelper.SEPARATOR;
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    @NotNull
    public static String trimIndent(@NotNull String str) {
        return replaceIndent(str, "");
    }

    @NotNull
    public static final String trimMargin(@NotNull String str, @NotNull String str2) {
        return replaceIndentByMargin(str, "", str2);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = AESEncryptionHelper.SEPARATOR;
        }
        return trimMargin(str, str2);
    }
}
