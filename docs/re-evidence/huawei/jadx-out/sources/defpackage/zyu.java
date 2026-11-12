package defpackage;

import org.eclipse.californium.elements.config.BasicDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zyu extends BasicDefinition<Integer> {
    private final Integer e;

    public zyu(String str, String str2) {
        super(str, str2, Integer.class, null);
        this.e = null;
    }

    public zyu(String str, String str2, Integer num) {
        super(str, str2, Integer.class, num);
        this.e = null;
    }

    public zyu(String str, String str2, Integer num, Integer num2) {
        super(str, str2, Integer.class, num);
        this.e = num2;
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public String getTypeName() {
        return "Integer";
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String writeValue(Integer num) {
        return num.toString();
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Integer checkValue(Integer num) throws zyw {
        if (this.e == null || num == null || num.intValue() >= this.e.intValue()) {
            return num;
        }
        throw new zyw("Value " + num + " must be not less than " + this.e + "!");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer parseValue(String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }
}
