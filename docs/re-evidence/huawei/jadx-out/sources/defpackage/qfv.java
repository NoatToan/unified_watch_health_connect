package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qfv extends qek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("metadata")
    private String f46137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planId")
    private String f46138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("overwrite")
    private boolean f46139c;

    @SerializedName("deleteTaskIds")
    private List<String> d;

    @SerializedName(NetworkService.Constants.CONFIG_SERVICE)
    private qfw e;

    @SerializedName(ParsedFieldTag.TASKS)
    private List<qfu> h;

    public String d() {
        return this.f46138b;
    }

    public void c(String str) {
        this.f46138b = str;
    }

    public List<qfu> i() {
        return this.h;
    }

    public void b(List<qfu> list) {
        this.h = list;
    }

    public List<String> b() {
        return this.d;
    }

    public String c() {
        return this.f46137a;
    }

    public void d(String str) {
        this.f46137a = str;
    }

    public qfw a() {
        return this.e;
    }

    public void b(qfw qfwVar) {
        this.e = qfwVar;
    }

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "plans/" + this.f46138b + "/tasks";
    }

    @Override // defpackage.qek
    public String toString() {
        return "CreateTasksReq {planId='" + this.f46138b + "', tasks=" + this.h + ", deleteTaskIds=" + this.d + ", metadata='" + this.f46137a + "', overwrite=" + this.f46139c + ", config=" + this.e + '}';
    }
}
