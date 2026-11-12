package defpackage;

import com.google.gson.annotations.SerializedName;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.basefitnessadvice.model.Introduction;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintConstants;
import com.tencent.open.SocialConstants;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pcp extends PlanInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("groupType")
    private int f45174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("imgUrl")
    private String f45175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("alias")
    private String f45176c;

    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String d;

    @SerializedName(ComplaintConstants.GROUP_NAME_PARAM_KEY)
    private String e;

    @SerializedName("name")
    private String f;

    @SerializedName(CardMgrSdkConst.KEY_RECOMMEND)
    private boolean g;
    private int h;

    @SerializedName("introduction")
    private Introduction i;
    private List<String> j;

    @SerializedName("planType")
    private int m;

    @SerializedName("type")
    private int n = 0;

    public Introduction h() {
        return this.i;
    }

    public int e() {
        return this.m;
    }

    public void b(int i) {
        this.m = i;
    }

    public int b() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public String c() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String f() {
        return this.f;
    }

    public void b(String str) {
        this.f = str;
    }

    public int d() {
        return this.f45174a;
    }

    public String a() {
        return this.f45175b;
    }

    @Override // com.huawei.basefitnessadvice.model.PlanInfo
    public int getType() {
        return this.n;
    }

    @Override // com.huawei.basefitnessadvice.model.PlanInfo
    public List<String> getLabels() {
        return this.j;
    }

    @Override // com.huawei.basefitnessadvice.model.PlanInfo
    public void setLabels(List<String> list) {
        this.j = list;
    }

    public String toString() {
        return "RunPlanInfo{mName='" + this.f + "', mAbbPlanName='" + this.f45176c + "', mDescription='" + this.d + "', mImageView=" + this.h + ", mPlanType=" + this.m + ", mType=" + this.n + ", mGroupType=" + this.f45174a + ", mGroupName='" + this.e + "', mImageUrl='" + this.f45175b + "', mIsRecommended=" + this.g + ", mLabels=" + this.j + ", mPriceTagBeanList=" + this.mPriceTagBeanList + ", mCommodityFlag=" + this.mCommodityFlag + ", mCornerImgDisplay=" + this.mCornerImgDisplay + ", mTransactionStatus=" + this.mTransactionStatus + '}';
    }
}
