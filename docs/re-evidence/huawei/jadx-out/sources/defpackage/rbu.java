package defpackage;

import com.huawei.ui.device.declaration.xmlparser.DeclarationConstants;

/* JADX INFO: loaded from: classes16.dex */
public class rbu extends rbt {
    private static final long serialVersionUID = 232733746650473673L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47103a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeclarationConstants.SwitchFaceState f47104c;
    private String d;

    public String a() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public DeclarationConstants.SwitchFaceState e() {
        return this.f47104c;
    }

    public void b(DeclarationConstants.SwitchFaceState switchFaceState) {
        this.f47104c = switchFaceState;
    }

    public void a(String str) {
        this.f47103a = str;
    }

    public String toString() {
        return "SwitchFaceConfig{state=" + this.f47104c + ", action='" + this.f47103a + "'}";
    }
}
