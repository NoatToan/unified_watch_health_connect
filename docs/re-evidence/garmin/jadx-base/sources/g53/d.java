package g53;

import androidx.core.view.j;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
public class d extends c {
    public static final void c(int i14, String str, String str2) {
        StringBuilder sbK = j.k(i14, "Expected ", str2, " at index ", ", but was '");
        sbK.append(str.charAt(i14));
        sbK.append(CoreConstants.SINGLE_QUOTE_CHAR);
        throw new IllegalArgumentException(sbK.toString());
    }
}
