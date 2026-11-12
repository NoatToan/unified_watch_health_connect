package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes42.dex */
public class pmx implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("smallMask")
    private int f45694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("id")
    private String f45695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bigMask")
    private int f45696c;

    @SerializedName(FaqConstants.FAQ_ISSELECTED)
    private boolean d;

    public pmx(String str, int i, int i2) {
        this.f45695b = str;
        this.f45694a = i;
        this.f45696c = i2;
    }

    public String d() {
        return this.f45695b;
    }

    public int e() {
        return this.f45694a;
    }

    public int c() {
        return this.f45696c;
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }
}
