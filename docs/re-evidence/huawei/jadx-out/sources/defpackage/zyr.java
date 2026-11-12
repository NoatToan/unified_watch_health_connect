package defpackage;

import java.util.Arrays;
import java.util.List;
import org.eclipse.californium.elements.config.BasicDefinition;

/* JADX INFO: loaded from: classes20.dex */
public class zyr extends BasicDefinition<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f54788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54789c;

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String writeValue(String str) {
        return str;
    }

    public zyr(String str, String str2, String... strArr) {
        super(str, str2, String.class, null);
        if (strArr == null) {
            throw new NullPointerException("Value set must not be null!");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("Value set must not be empty!");
        }
        for (String str3 : strArr) {
            if (str3 == null) {
                throw new IllegalArgumentException("Value set must not contain null!");
            }
        }
        String str4 = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].equals(str4)) {
                this.f54789c = str4;
                this.f54788b = Arrays.asList(Arrays.copyOfRange(strArr, 1, strArr.length));
                this.f54787a = zyn.e(this.f54788b, true);
            }
        }
        this.f54789c = null;
        this.f54788b = Arrays.asList(Arrays.copyOf(strArr, strArr.length));
        this.f54787a = zyn.e(this.f54788b, true);
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public String getTypeName() {
        return "StringSet";
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public String getDocumentation() {
        return super.getDocumentation() + "\n" + this.f54787a + ".";
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String getDefaultValue() {
        return this.f54789c;
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String checkValue(String str) throws zyw {
        if (str == null || this.f54788b.contains(str)) {
            return str;
        }
        throw new IllegalArgumentException(str + " is not in " + this.f54787a);
    }

    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    public boolean isAssignableFrom(Object obj) {
        if (this.f54788b.contains(obj)) {
            return true;
        }
        if (!super.isAssignableFrom(obj)) {
            return false;
        }
        throw new IllegalArgumentException(obj + " is not in " + this.f54787a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.eclipse.californium.elements.config.DocumentedDefinition
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String parseValue(String str) throws zyw {
        if (this.f54788b.contains(str)) {
            return str;
        }
        throw new zyw(str + " is not in " + this.f54787a);
    }
}
