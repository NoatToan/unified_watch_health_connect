package kotlinx.datetime.internal.format.parser;

import g11.e;
import g63.h;
import java.io.IOException;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Lg63/h;", "errors", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ParseException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ParseException(List<h> list) throws IOException {
        String string;
        list.getClass();
        if (list.size() == 1) {
            string = "Position " + list.get(0).f76140a + ": " + list.get(0).f76141b.invoke();
        } else {
            StringBuilder sb3 = new StringBuilder(list.size() * 33);
            h0.j0(list, sb3, ", ", "Errors: ", null, new e(11), 56);
            string = sb3.toString();
        }
        super(string);
    }
}
