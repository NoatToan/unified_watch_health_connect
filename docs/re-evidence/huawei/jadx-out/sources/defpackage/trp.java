package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes43.dex */
public class trp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f49589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f49590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49591c;
    private String d;
    private String e;

    public trp(Context context, String str, boolean z) {
        this.e = str;
        this.f49589a = z;
        this.f49590b = context;
    }

    public String b() {
        return this.e;
    }

    public boolean d() {
        return this.f49589a;
    }

    public void c(boolean z) {
        this.f49589a = z;
    }

    public String e(String str, boolean z) {
        String strC = trq.c(this.f49590b, this.e, str, z);
        this.d = strC;
        return strC;
    }

    public String d(boolean z) {
        String strD = trq.d(this.f49590b, this.e, z);
        this.f49591c = strD;
        return strD;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AuthCapabilityBean{authType=");
        stringBuffer.append(this.e);
        stringBuffer.append(", authName='").append(this.f49591c).append("', authSubName='");
        stringBuffer.append(this.d).append("', isOpen=");
        stringBuffer.append(this.f49589a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
