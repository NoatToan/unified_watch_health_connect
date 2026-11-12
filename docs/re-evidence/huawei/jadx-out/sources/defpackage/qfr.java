package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qfr extends qet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("metadata")
    private String f46131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("scheduleResults")
    private List<qfl> f46132b;

    public List<qfl> d() {
        return this.f46132b;
    }

    @Override // defpackage.qet
    public String toString() {
        return "UpdateScheduleResp{" + super.toString() + ",scheduleResults=" + this.f46132b + ", metadata='" + this.f46131a + '}';
    }
}
