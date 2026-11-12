package kotlinx.serialization.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "", "ch", "", "a", "", SOAP.XMLNS, "", "parseHexBinary", "data", "", "lowerCase", "printHexBinary", GoogleApiAvailabilityLight.b, "toHexString", "Ljava/lang/String;", "hexCode", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
public final class InternalHexConverter {

    @NotNull
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String hexCode = "0123456789ABCDEF";

    private InternalHexConverter() {
    }

    private final int a(char ch) {
        if ('0' <= ch && ch <= '9') {
            return ch - '0';
        }
        char c = 'A';
        if (!('A' <= ch && ch <= 'F')) {
            c = 'a';
            if (!('a' <= ch && ch <= 'f')) {
                return -1;
            }
        }
        return (ch - c) + 10;
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return internalHexConverter.printHexBinary(bArr, z);
    }

    @NotNull
    public final byte[] parseHexBinary(@NotNull String s) {
        int length = s.length();
        if (!(length % 2 == 0)) {
            throw new IllegalArgumentException("HexBinary string must be even length".toString());
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iA = a(s.charAt(i));
            int i2 = i + 1;
            int iA2 = a(s.charAt(i2));
            if (!((iA == -1 || iA2 == -1) ? false : true)) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(i) + s.charAt(i2)).toString());
            }
            bArr[i / 2] = (byte) ((iA << 4) + iA2);
        }
        return bArr;
    }

    @NotNull
    public final String printHexBinary(@NotNull byte[] data, boolean lowerCase) {
        StringBuilder sb = new StringBuilder(data.length * 2);
        int length = data.length;
        int i = 0;
        while (i < length) {
            byte b = data[i];
            i++;
            sb.append(hexCode.charAt((b >> 4) & 15));
            sb.append(hexCode.charAt(b & 15));
        }
        String string = sb.toString();
        return lowerCase ? string.toLowerCase(Locale.ROOT) : string;
    }

    @NotNull
    public final String toHexString(int n) {
        byte[] bArr = new byte[4];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            bArr[i] = (byte) (n >> (24 - (i * 8)));
            if (i2 >= 4) {
                break;
            }
            i = i2;
        }
        String strTrimStart = StringsKt__StringsKt.trimStart(printHexBinary(bArr, true), '0');
        if (!(strTrimStart.length() > 0)) {
            strTrimStart = null;
        }
        return strTrimStart == null ? "0" : strTrimStart;
    }
}
