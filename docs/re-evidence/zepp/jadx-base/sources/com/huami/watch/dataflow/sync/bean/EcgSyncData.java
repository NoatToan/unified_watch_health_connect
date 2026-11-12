package com.huami.watch.dataflow.sync.bean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTagValue;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class EcgSyncData {

    @SerializedName("summary")
    public EcgData summary;

    @SerializedName("tag")
    public EcgTagValue tag;

    @SerializedName("voiceData")
    public String voiceData;

    @SerializedName("zipData")
    public String zipData;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Summary: '");
        sb.append(this.summary);
        sb.append('\'');
        sb.append(", ZipDataSize: '");
        sb.append(TextUtils.isEmpty(this.zipData) ? 0 : this.zipData.length());
        sb.append('\'');
        sb.append(", VoiceDataSize: '");
        sb.append(TextUtils.isEmpty(this.voiceData) ? 0 : this.zipData.length());
        sb.append('\'');
        sb.append(", Tag: '");
        sb.append(this.tag);
        sb.append('\'');
        sb.append(Typography.greater);
        return sb.toString();
    }
}
