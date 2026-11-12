package d53;

import java.io.IOException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class m {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Appendable appendable, T t7, e23.l<? super T, ? extends CharSequence> lVar) throws IOException {
        appendable.getClass();
        if (lVar != null) {
            appendable.append(lVar.invoke(t7));
            return;
        }
        if (t7 == 0 ? true : t7 instanceof CharSequence) {
            appendable.append((CharSequence) t7);
        } else if (t7 instanceof Character) {
            appendable.append(((Character) t7).charValue());
        } else {
            appendable.append(t7.toString());
        }
    }
}
