package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gis implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f35225a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("trainModeType")
    private int f35226c;

    public gis(String str, int i) {
        this.f35225a = str;
        this.f35226c = i;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ck();
    }
}
