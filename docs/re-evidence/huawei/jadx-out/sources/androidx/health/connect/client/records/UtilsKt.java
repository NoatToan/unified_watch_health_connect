package androidx.health.connect.client.records;

import android.os.ext.SdkExtensions;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.operation.utils.Constants;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zcp;
import defpackage.zdm;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0001\u001a1\u0010\u0003\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0006*\u0002H\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\u0010\n\u001a1\u0010\u000b\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0006*\u0002H\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011H\u0000\u001a9\u0010\u0013\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0006*\u0002H\u00052\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\u0010\u0016\u001a&\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011H\u0000¨\u0006\u001b"}, d2 = {"isAtLeastSdkExtension13", "", "isAtLeastSdkExtension15", "requireNotLess", "", ExifInterface.GPS_DIRECTION_TRUE, "", "other", "name", "", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V", "requireNotMore", "requireNonNegative", "value", "", "", "reverse", "", "", "requireInRange", "min", "max", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V", "toString", "obj", "", "fieldMap", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UtilsKt {
    public static final boolean isAtLeastSdkExtension13() {
        return SdkExtensions.getExtensionVersion(34) >= 13;
    }

    public static final boolean isAtLeastSdkExtension15() {
        return SdkExtensions.getExtensionVersion(34) >= 15;
    }

    public static final <T extends Comparable<? super T>> void requireNotLess(T t, T t2, String str) {
        zcp.c(t, "");
        zcp.c(t2, "");
        zcp.c(str, "");
        if (t.compareTo(t2) >= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be less than " + t2 + ", currently " + t + FilenameUtils.EXTENSION_SEPARATOR).toString());
    }

    public static final <T extends Comparable<? super T>> void requireNotMore(T t, T t2, String str) {
        zcp.c(t, "");
        zcp.c(t2, "");
        zcp.c(str, "");
        if (t.compareTo(t2) <= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be more than " + t2 + ", currently " + t + FilenameUtils.EXTENSION_SEPARATOR).toString());
    }

    public static final void requireNonNegative(long j, String str) {
        zcp.c(str, "");
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be negative").toString());
    }

    public static final void requireNonNegative(double d, String str) {
        zcp.c(str, "");
        if (d >= 0.0d) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be negative").toString());
    }

    public static final Map<Integer, String> reverse(Map<String, Integer> map) {
        zcp.c(map, "");
        Set<Map.Entry<String, Integer>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getValue()).intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), (String) entry.getKey());
        }
        return linkedHashMap;
    }

    public static final <T extends Comparable<? super T>> void requireInRange(T t, T t2, T t3, String str) {
        zcp.c(t, "");
        zcp.c(t2, "");
        zcp.c(t3, "");
        zcp.c(str, "");
        requireNotLess(t, t2, str);
        requireNotMore(t, t3, str);
    }

    public static final String toString(Object obj, Map<String, ? extends Object> map) {
        zcp.c(obj, "");
        zcp.c(map, "");
        return obj.getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(obj)) + ": " + yzp.c(map.entrySet(), ", ", Constants.LEFT_BRACKET_ONLY, Constants.RIGHT_BRACKET_ONLY, 0, null, new Function1<Map.Entry<? extends String, ? extends Object>, CharSequence>() { // from class: androidx.health.connect.client.records.UtilsKt$toString$content$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
                return invoke2((Map.Entry<String, ? extends Object>) entry);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Map.Entry<String, ? extends Object> entry) {
                zcp.c(entry, "");
                return entry.getKey() + '=' + entry.getValue();
            }
        }, 24, null);
    }
}
