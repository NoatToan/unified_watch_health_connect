package defpackage;

import com.nimbusds.jose.shaded.json.JSONObject;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class yh2 implements zud<Object> {
    @Override // defpackage.zud
    public <E> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
        th2 th2VarB = th2.b(e.getClass(), wpd.f38213a);
        appendable.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = false;
        for (r80 r80Var : th2VarB.d()) {
            Object objC = th2VarB.c(e, r80Var.a());
            if (objC != null || !vpdVar.g()) {
                if (z) {
                    appendable.append(',');
                } else {
                    z = true;
                }
                JSONObject.writeJSONKV(r80Var.b(), objC, appendable, vpdVar);
            }
        }
        appendable.append(AbstractJsonLexerKt.END_OBJ);
    }
}
