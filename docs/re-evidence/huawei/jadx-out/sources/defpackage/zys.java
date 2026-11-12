package defpackage;

import org.eclipse.californium.elements.config.BasicDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zys extends BasicDefinition<Float> {
    private final Float e;

    public zys(String str, String str2, Float f) {
        super(str, str2, Float.class, f);
        this.e = null;
    }

    public zys(String str, String str2, Float f, Float f2) {
        super(str, str2, Float.class, f);
        this.e = f2;
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public String getTypeName() {
        return "Float";
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String writeValue(Float f) {
        return f.toString();
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float checkValue(Float f) throws zyw {
        if (this.e == null || f == null || f.floatValue() >= this.e.floatValue()) {
            return f;
        }
        throw new zyw("Value " + f + " must be not less than " + this.e + "!");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float parseValue(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }
}
