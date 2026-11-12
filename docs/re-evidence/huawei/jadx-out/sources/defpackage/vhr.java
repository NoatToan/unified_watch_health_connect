package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes19.dex */
public class vhr implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("category")
    private int f51119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.GOAL)
    private vhy f51120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("subCategory")
    private int f51121c;

    @SerializedName("stage")
    private int d;

    @SerializedName("startDay")
    private int e;

    @SerializedName("weightManagerType")
    private int f;

    @SerializedName("userInfo")
    private vib h;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/simplefat/v1/calculateGoal";
    }

    public int b() {
        return this.f51119a;
    }

    public void d(int i) {
        this.f51119a = i;
    }

    public int a() {
        return this.f51121c;
    }

    public void c(int i) {
        this.f51121c = i;
    }

    public int h() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public vhy c() {
        return this.f51120b;
    }

    public void d(vhy vhyVar) {
        this.f51120b = vhyVar;
    }

    public vib f() {
        return this.h;
    }

    public void a(vib vibVar) {
        this.h = vibVar;
    }

    public int d() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public String toString() {
        return "CreateGoalReq{category=" + this.f51119a + ", subCategory=" + this.f51121c + ", weightManagerType=" + this.f + ", startDay=" + this.e + ", stage=" + this.d + ", goal=" + this.f51120b + ", userInfo=" + this.h + '}';
    }
}
