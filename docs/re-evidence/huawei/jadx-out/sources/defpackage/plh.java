package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class plh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cursor")
    private String f45594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultInfo")
    private String f45595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("list")
    private List<plf> f45596c;

    @SerializedName("resultCode")
    private String d;

    public String b() {
        return this.d;
    }

    public List<plf> d() {
        return this.f45596c;
    }

    public String c() {
        return this.f45594a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("GetThemeListRsp{resultCode=");
        stringBuffer.append(this.d);
        stringBuffer.append("resultInfo=").append(this.f45595b);
        stringBuffer.append(", list=").append(this.f45596c);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
