package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gke implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f35362c;

    private gke(d dVar) {
        this.f35362c = dVar.f35363a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bo();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35363a;

        public d d(String str) {
            this.f35363a = str;
            return this;
        }

        public gke d() {
            return new gke(this);
        }
    }
}
