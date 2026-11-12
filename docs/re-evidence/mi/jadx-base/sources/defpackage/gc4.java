package defpackage;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class gc4 extends h00 implements Serializable {
    private static final long serialVersionUID = 2;

    public gc4(jc4 jc4Var) {
        super(jc4Var);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.h00
    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        sb.append(AbstractJsonLexerKt.NULL);
    }

    @Override // defpackage.h00
    public String c0() {
        return AbstractJsonLexerKt.NULL;
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public gc4 T(jc4 jc4Var) {
        return new gc4(jc4Var);
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        return ConfigValueType.NULL;
    }

    @Override // defpackage.rc4
    public Object x() {
        return null;
    }
}
