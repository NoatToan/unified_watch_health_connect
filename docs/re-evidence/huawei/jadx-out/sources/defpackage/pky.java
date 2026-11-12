package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;

/* JADX INFO: loaded from: classes15.dex */
public class pky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(WatchFaceConstant.HASHCODE)
    private String f45574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("algorithmName")
    private String f45575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fileType")
    private String f45576c;

    @SerializedName(ContentResource.FILE_NAME)
    private String d;

    @SerializedName(RecommendConstants.DOWNLOAD_URL)
    private String e;

    @SerializedName("size")
    private String h;

    public String c() {
        return this.e;
    }

    public String a() {
        return this.h;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(255);
        stringBuffer.append("BriefFileInfo{fileName=");
        stringBuffer.append(this.d);
        stringBuffer.append(", fileType=").append(this.f45576c);
        stringBuffer.append(", size=").append(this.h);
        stringBuffer.append(", algorithmName=").append(this.f45575b);
        stringBuffer.append(", hashCode=").append(this.f45574a);
        stringBuffer.append(", downloadUrl=").append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
