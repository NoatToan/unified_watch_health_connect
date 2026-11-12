package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes37.dex */
public class lox extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fileUploadList")
    private List<lpa> f40579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("maxPartSize")
    private int f40580b;

    @SerializedName("minPartSize")
    private int e;
}
