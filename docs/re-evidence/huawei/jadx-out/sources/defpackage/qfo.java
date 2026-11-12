package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qfo extends qek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("scheduleResultList")
    private List<qfm> f46124a;

    public List<qfm> c() {
        return this.f46124a;
    }

    public void c(List<qfm> list) {
        this.f46124a = list;
    }

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "scheduleResults";
    }

    @Override // defpackage.qek
    public String toString() {
        return "ScheduleResultCreateReq{" + super.toString() + ",scheduleResultList=" + this.f46124a + '}';
    }
}
