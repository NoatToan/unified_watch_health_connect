package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qez extends qet {

    @SerializedName("plans")
    private List<qey> e;

    public List<qey> b() {
        return this.e;
    }

    @Override // defpackage.qet
    public String toString() {
        return "QueryPlanResp{" + super.toString() + "plans=" + this.e + '}';
    }
}
