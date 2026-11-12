package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\t\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¨\u0006\u000b"}, d2 = {"", "", "offset", "maxBytes", "", PluginDeviceInfo.FMODEL, "", "ignoreContinuousEnd", "", PluginDeviceInfo.FICONON, PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class y2 {
    @NotNull
    public static final String a(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i > bArr.length) {
            return "";
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2 > 0 ? Math.min(i2 + i, bArr.length) : bArr.length);
        int length = bArrCopyOfRange.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (bArrCopyOfRange[i3] == 0) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArrCopyOfRange, 0, i3);
        }
        return new String(bArrCopyOfRange, Charsets.UTF_8);
    }

    @NotNull
    public static final byte[] b(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        return ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(2, bArr.length - 1));
    }

    @NotNull
    public static final String c(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return "";
        }
        String strX = tet.x(bArr);
        Intrinsics.checkNotNullExpressionValue(strX, "bytesToHexString(this)");
        return StringsKt__StringsJVMKt.replace$default(strX, " ", "", false, 4, (Object) null);
    }

    public static /* synthetic */ List a(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        return a(bArr, i, i2, z);
    }

    @NotNull
    public static final List<String> a(@NotNull byte[] bArr, int i, int i2, boolean z) {
        int length;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i <= bArr.length) {
            if (i2 > 0) {
                length = Math.min(i2 + i, bArr.length);
            } else {
                length = bArr.length;
            }
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, length);
            ArrayList arrayList = new ArrayList();
            String thisHexToString = tet.x(bArrCopyOfRange);
            Intrinsics.checkNotNullExpressionValue(thisHexToString, "thisHexToString");
            for (String str : StringsKt__StringsKt.split$default((CharSequence) thisHexToString, new String[]{"00"}, false, 0, 6, (Object) null)) {
                if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() != 0) {
                    byte[] bytes = tet.y(StringsKt__StringsJVMKt.replace$default(str, " ", "", false, 4, (Object) null));
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    arrayList.add(a(bytes, 0, bytes.length));
                } else if (!z) {
                    arrayList.add("");
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final byte[] a(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        return ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(1, bArr.length - 1));
    }
}
