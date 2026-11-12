package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.suggestion.model.fitness.FitnessAchieveInfoUseCase;
import com.huawei.hihealth.HiHealthData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public class ibp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("tahitiPicture")
    @Expose
    private String f37448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("buttonPicture")
    @Expose
    private String f37449c;

    @SerializedName("picture")
    @Expose
    private String d;

    @SerializedName("gridContents")
    @Expose
    private ArrayList<ibq> e;

    @Expose
    private ibt j = new ibt();
    private List<HiHealthData> f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Expose
    private FitnessAchieveInfoUseCase f37447a = new FitnessAchieveInfoUseCase();

    public ibt c() {
        return this.j;
    }

    public void b(ibt ibtVar) {
        this.j = ibtVar;
    }

    public ArrayList<ibq> b() {
        ArrayList<ibq> arrayList = this.e;
        return arrayList != null ? arrayList : new ArrayList<>();
    }

    public List<HiHealthData> a() {
        return this.f;
    }

    public void a(List<HiHealthData> list) {
        this.f.clear();
        this.f.addAll(list);
    }

    public FitnessAchieveInfoUseCase e() {
        return this.f37447a;
    }

    public void d(FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase) {
        this.f37447a = fitnessAchieveInfoUseCase;
    }

    public List<String> d() {
        return new ArrayList(Arrays.asList(this.d, this.f37448b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ibp ibpVar = (ibp) obj;
        return Objects.equals(this.f37449c, ibpVar.f37449c) && Objects.equals(this.d, ibpVar.d) && Objects.equals(this.f37448b, ibpVar.f37448b) && Objects.equals(this.e, ibpVar.e) && Objects.equals(this.j, ibpVar.j) && Objects.equals(this.f37447a, ibpVar.f37447a);
    }

    public int hashCode() {
        return Objects.hash(this.f37449c, this.d, this.f37448b, this.e, this.j, this.f37447a);
    }

    public String toString() {
        return "AchieveBean{mBtnPicture='" + this.f37449c + "', mBackground='" + this.d + "', mBackgroundTahiti='" + this.f37448b + "', mAchieveBannerBeans=" + this.e + ", mData=" + this.j + ", mHealthData=" + this.f + ", mAchieveInfoUseCase=" + this.f37447a + '}';
    }
}
