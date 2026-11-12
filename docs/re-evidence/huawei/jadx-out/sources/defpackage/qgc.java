package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qgc extends qet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.TASKS)
    private List<qfy> f46155c;

    @SerializedName("metadata")
    private String d;

    public List<qfy> b() {
        return this.f46155c;
    }

    public void d(List<qfy> list) {
        this.f46155c = list;
    }

    public void d(String str) {
        this.d = str;
    }

    @Override // defpackage.qet
    public String toString() {
        return "QueryTasksResp{" + super.toString() + ",tasks=" + this.f46155c + ", metadata='" + this.d + '}';
    }
}
