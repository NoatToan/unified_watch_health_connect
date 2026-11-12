package o63;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo63/f;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f129849a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f129850b = new char[117];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f129851c = new byte[126];

    static {
        for (int i14 = 0; i14 < 32; i14++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a(IOUtils.DIR_SEPARATOR_UNIX, 47);
        a(CoreConstants.DOUBLE_QUOTE_CHAR, 34);
        a('\\', 92);
        f129849a.getClass();
        byte[] bArr = f129851c;
        for (int i15 = 0; i15 < 33; i15++) {
            bArr[i15] = Ascii.DEL;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    private f() {
    }

    public static void a(char c14, int i14) {
        if (c14 != 'u') {
            f129850b[c14] = (char) i14;
        }
    }
}
