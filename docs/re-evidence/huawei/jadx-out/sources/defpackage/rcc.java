package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes16.dex */
public class rcc extends rcb {
    private static final long serialVersionUID = 8128932739017579301L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47114a;

    public rcc(String str) {
        this.f47114a = str;
    }

    public String a() {
        return this.f47114a;
    }

    public void b(String str) {
        this.f47114a = str;
    }

    public rbm b() {
        rbm rbmVar = new rbm();
        if (TextUtils.isEmpty(this.f47114a)) {
            LogUtil.j("JsonPlaceholder", "getJsonObject: clazz is null or json is null");
            return rbmVar;
        }
        try {
            return (rbm) new Gson().fromJson(CommonUtil.ac(this.f47114a), rbm.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("JsonPlaceholder", "getJsonObject: JsonSyntaxException occurred with parsing json.", this.f47114a);
            return rbmVar;
        }
    }

    @Override // defpackage.rcb
    public String toString() {
        return "JsonPlaceholder{mJson='" + this.f47114a + "', mValue='" + this.e + "', mPlaceholderType=" + this.f47113c + '}';
    }
}
