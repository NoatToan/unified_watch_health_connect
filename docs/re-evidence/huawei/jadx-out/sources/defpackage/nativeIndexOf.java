package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: renamed from: zfe, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0081\b\u001a \u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\f\u0010\u0016\u001a\u00020\u0002*\u00020\u0017H\u0007\u001a \u0010\u0016\u001a\u00020\u0002*\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a \u0010\u001a\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0007\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u001cH\u0007\u001a*\u0010\u001b\u001a\u00020\u0002*\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\f\u0010\u001e\u001a\u00020\u001c*\u00020\u0002H\u0007\u001a*\u0010\u001e\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u0002H\u0087\b\u001a3\u0010\u001a\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a*\u0010!\u001a\u00020\u0002*\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010%\u001a2\u0010!\u001a\u00020\u0002*\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010'\u001a4\u0010!\u001a\u00020\u0002*\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010)2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010*\u001a<\u0010!\u001a\u00020\u0002*\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020\u00022\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010$0#\"\u0004\u0018\u00010$H\u0087\b¢\u0006\u0002\u0010+\u001a\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-*\u00020.2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\u0001\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\b\u001a\u001d\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a$\u00103\u001a\u00020\t*\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u001c\u00105\u001a\u00020\t*\u00020\u00022\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a)\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0087\b\u001a\u0019\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001cH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0017H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a!\u00107\u001a\u00020\u00022\u0006\u0010>\u001a\u00020?2\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010@\u001a\u00020AH\u0087\b\u001a\u0011\u00107\u001a\u00020\u00022\u0006\u0010B\u001a\u00020CH\u0087\b\u001a\u0015\u0010D\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010F\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u0001H\u0087\b\u001a\u001d\u0010G\u001a\u00020\u0001*\u00020\u00022\u0006\u0010H\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b\u001a\u001c\u0010I\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010K\u001a\u00020.H\u0087\b\u001a\u0015\u0010J\u001a\u00020\t*\u00020\u00022\u0006\u0010B\u001a\u00020AH\u0087\b\u001a\u0019\u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.H\u0087\u0004\u001a \u0010J\u001a\u00020\t*\u0004\u0018\u00010.2\b\u0010\n\u001a\u0004\u0018\u00010.2\u0006\u0010\u000b\u001a\u00020\tH\u0007\u001a\r\u0010L\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u001d\u0010M\u001a\u00020\u0001*\u00020\u00022\u0006\u0010E\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0001H\u0087\b\u001a4\u0010O\u001a\u00020\t*\u00020.2\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a4\u0010O\u001a\u00020\t*\u00020\u00022\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\u0015\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0087\b\u001a\u0017\u0010R\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010;\u001a\u00020<H\u0087\b\u001a\u0017\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0087\b\u001a\f\u0010U\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\f\u0010V\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020)H\u0007\u001a\u0012\u0010W\u001a\u00020\u0002*\u00020.2\u0006\u0010X\u001a\u00020\u0001\"%\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00020Zj\b\u0012\u0004\u0012\u00020\u0002`[*\u00020&8F¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006^"}, d2 = {"nativeIndexOf", "", "", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "equals", "", "other", "ignoreCase", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "toUpperCase", "uppercase", "toLowerCase", "lowercase", "concatToString", "", "startIndex", "endIndex", "toCharArray", "decodeToString", "", "throwOnInvalidSequence", "encodeToByteArray", "destination", "destinationOffset", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "split", "", "", "regex", "Ljava/util/regex/Pattern;", BleConstants.LIMIT, "substring", "startsWith", "prefix", "endsWith", "suffix", "String", "bytes", TypedValues.CycleType.S_WAVE_OFFSET, "length", "charset", "Ljava/nio/charset/Charset;", "chars", "codePoints", "", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "compareTo", "contentEquals", "charSequence", "intern", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "toByteArray", "toPattern", ParamConstants.Param.FLAGS, "capitalize", "decapitalize", "repeat", "n", "CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class nativeIndexOf extends toByteOrNull {
    public static final boolean d(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ String c(String str, char c2, char c3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return zes.e(str, c2, c3, z);
    }

    public static final String e(String str, char c2, char c3, boolean z) {
        zcp.c(str, "");
        if (!z) {
            String strReplace = str.replace(c2, c3);
            zcp.b((Object) strReplace, "");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if (zek.e(cCharAt, c2, z)) {
                cCharAt = c3;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static /* synthetic */ String a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return zes.b(str, str2, str3, z);
    }

    public static final String b(String str, String str2, String str3, boolean z) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        String str4 = str;
        int i = 0;
        int iC = zes.c(str4, str2, 0, z);
        if (iC < 0) {
            return str;
        }
        int length = str2.length();
        int iC2 = zdm.c(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str4, i, iC);
            sb.append(str3);
            i = iC + length;
            if (iC >= str.length()) {
                break;
            }
            iC = zes.c(str4, str2, iC + iC2, z);
        } while (iC > 0);
        sb.append((CharSequence) str4, i, str.length());
        String string = sb.toString();
        zcp.b((Object) string, "");
        return string;
    }

    public static final String e(char[] cArr) {
        zcp.c(cArr, "");
        return new String(cArr);
    }

    public static final String e(char[] cArr, int i, int i2) {
        zcp.c(cArr, "");
        AbstractList.INSTANCE.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static /* synthetic */ boolean e(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return zes.e(str, str2, z);
    }

    public static final boolean e(String str, String str2, boolean z) {
        zcp.c(str, "");
        zcp.c(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return zes.b(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean e(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return zes.e(str, str2, i, z);
    }

    public static final boolean e(String str, String str2, int i, boolean z) {
        zcp.c(str, "");
        zcp.c(str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return zes.b(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean c(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return zes.a(str, str2, z);
    }

    public static final boolean a(String str, String str2, boolean z) {
        zcp.c(str, "");
        zcp.c(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return zes.b(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean d(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return zes.b(str, i, str2, i2, i3, z);
    }

    public static final boolean b(String str, int i, String str2, int i2, int i3, boolean z) {
        zcp.c(str, "");
        zcp.c(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String a(CharSequence charSequence, int i) {
        zcp.c(charSequence, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        zcp.e((Object) string);
        return string;
    }

    public static final Comparator<String> d(zda zdaVar) {
        zcp.c(zdaVar, "");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        zcp.b((Object) comparator, "");
        return comparator;
    }
}
