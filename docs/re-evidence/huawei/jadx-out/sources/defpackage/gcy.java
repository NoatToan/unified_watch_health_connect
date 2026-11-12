package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class gcy implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    private double f34913c;

    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    private double d;

    private gcy(e eVar) {
        this.f34913c = eVar.d;
        this.d = eVar.f34914a;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f34914a;
        private double d;

        public e c(double d) {
            this.d = d;
            return this;
        }

        public e a(double d) {
            this.f34914a = d;
            return this;
        }

        public gcy e() {
            return new gcy(this);
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/getCityInfoWithGps";
    }

    public String toString() {
        return "GetCityInfoWithGpsReq{longitude=" + this.f34913c + ", latitude=" + this.d + '}';
    }
}
