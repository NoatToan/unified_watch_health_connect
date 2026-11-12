package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.jsoperation.JsUtil;

/* JADX INFO: loaded from: classes.dex */
public class gwy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(JsUtil.SCORE)
    private int f36164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("question")
    private int f36165b;

    public void a(int i) {
        this.f36165b = i;
    }

    public void b(int i) {
        this.f36164a = i;
    }

    public String toString() {
        return "{\"Questionnaire\": {\"question\":" + this.f36165b + ", \"score\":" + this.f36164a + "}}";
    }
}
