package defpackage;

import com.chinaums.pppay.unify.UnifyPayListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public class wns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f38185a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        return b(bArr, true);
    }

    public static String b(byte[] bArr, boolean z) {
        if (bArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        int length = bArr.length - 1;
        if (length == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance();
        decimalFormat.applyPattern(UnifyPayListener.ERR_OK);
        DecimalFormat decimalFormat2 = (DecimalFormat) NumberFormat.getInstance();
        decimalFormat2.applyPattern("000");
        sb.append("<L : ");
        sb.append(bArr.length);
        sb.append(", ");
        sb.append(bArr.toString());
        int i = 0;
        while (true) {
            if (i % 24 == 0) {
                sb.append("\n\t");
                sb.append(decimalFormat.format(((i + 1) / 24) + 1));
                sb.append("\t");
            } else {
                sb.append(' ');
                if (i % 12 == 0) {
                    sb.append('\t');
                }
            }
            if (z) {
                String hexString = Integer.toHexString(bArr[i] & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            } else {
                sb.append(decimalFormat2.format(bArr[i] & 255));
            }
            if (i == length) {
                sb.append(Typography.greater);
                return sb.toString();
            }
            i++;
        }
    }
}
