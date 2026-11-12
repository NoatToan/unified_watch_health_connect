package defpackage;

import com.huawei.ui.device.declaration.xmlparser.DeclarationConstants;

/* JADX INFO: loaded from: classes16.dex */
public class rbr extends rbn {
    private static final long serialVersionUID = -9205085941889233060L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeclarationConstants.Position f47101c;
    private String d;

    public String b() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public DeclarationConstants.Position d() {
        return this.f47101c;
    }

    public void d(DeclarationConstants.Position position) {
        this.f47101c = position;
    }

    public boolean e() {
        return this.f47100b;
    }

    public void a(boolean z) {
        this.f47100b = z;
    }

    public String toString() {
        return "Title{value='" + this.d + "', checkboxPosition=" + this.f47101c + ", isChecked=" + this.f47100b + '}';
    }
}
