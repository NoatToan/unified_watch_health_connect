package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class ple {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("previewUrl")
    private String f45588a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("language")
    private String f45589c;

    @SerializedName("previewName")
    private String e;

    public String b() {
        return this.f45588a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PreviewInfo{previewUrl=");
        stringBuffer.append(this.f45588a);
        stringBuffer.append(", previewName=").append(this.e);
        stringBuffer.append(", language=").append(this.f45589c);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
