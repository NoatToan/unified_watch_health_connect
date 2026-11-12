package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.ClassifyInfo;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class pcf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("levels")
    private List<Attribute> f45153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("classifyInfos")
    private List<ClassifyInfo> f45154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("classes")
    private List<Attribute> f45155c;

    @SerializedName("trainingPoints")
    private List<Attribute> d;

    @SerializedName("equipments")
    private List<Attribute> e;

    public String toString() {
        return "Filter:{mClasses='" + this.f45155c + ", mTrainingPoints=" + this.d + ", mLevels=" + this.f45153a + ", mEquipments=" + this.e + ", mClassifyInfos=mClassifyInfos}";
    }
}
