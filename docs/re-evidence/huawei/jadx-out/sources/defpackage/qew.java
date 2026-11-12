package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class qew extends qet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("plan")
    private qey f46083c;

    public qey c() {
        return this.f46083c;
    }

    @Override // defpackage.qet
    public String toString() {
        return "CreatePlanResp{" + super.toString() + "plan=" + this.f46083c + '}';
    }
}
