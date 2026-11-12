package defpackage;

import com.huawei.ui.device.declaration.xmlparser.DeclarationConstants;

/* JADX INFO: loaded from: classes16.dex */
public class rcb extends rbn {
    private static final long serialVersionUID = 7974573066439337805L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected DeclarationConstants.PlaceholderType f47113c;
    protected String e;

    public String c() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public DeclarationConstants.PlaceholderType d() {
        return this.f47113c;
    }

    public void d(DeclarationConstants.PlaceholderType placeholderType) {
        this.f47113c = placeholderType;
    }

    public String toString() {
        return "Placeholder{value='" + this.e + "', placeholderType=" + this.f47113c + '}';
    }
}
