package defpackage;

import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class eaj implements Serializable {
    private static final long serialVersionUID = -1815768583998220679L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32578c;
    private String d;
    private String e;

    public String a() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public String c() {
        return this.f32578c;
    }

    public void b(String str) {
        this.f32578c = str;
    }

    public String b() {
        return this.f32576a;
    }

    public String d() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public String e() {
        return this.f32577b;
    }

    public void d(String str) {
        this.f32577b = ecb.c(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("SubUser{mHuid ='");
        String str = this.e;
        String str2 = Constants.NULL;
        stringBuffer.append(str == null ? Constants.NULL : dyg.b(str)).append("'mNickName ='");
        String str3 = this.f32578c;
        stringBuffer.append(str3 == null ? Constants.NULL : dyg.b(str3)).append("'mSid ='");
        String str4 = this.d;
        if (str4 == null) {
            str4 = Constants.NULL;
        }
        stringBuffer.append(str4).append("'mUserAccount ='");
        String str5 = this.f32577b;
        if (str5 == null) {
            str5 = Constants.NULL;
        }
        stringBuffer.append(str5).append("'mIconPath ='");
        String str6 = this.f32576a;
        if (str6 != null) {
            str2 = str6;
        }
        stringBuffer.append(str2);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public boolean f() {
        return TextUtils.isEmpty(this.e);
    }
}
