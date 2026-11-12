package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hbg extends CloudCommonReponse {

    @SerializedName("voiceBroadcastLists")
    private List<hbh> e = new ArrayList();

    public List<hbh> b() {
        return this.e;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "VoiceBroadcastListResponse{mVoiceBroadcastList=" + this.e + ", super='" + super.toString() + "'}";
    }
}
