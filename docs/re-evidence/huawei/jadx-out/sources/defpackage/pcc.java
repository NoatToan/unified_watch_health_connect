package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.Audio;
import com.huawei.pluginfitnessadvice.Cover;
import com.huawei.pluginfitnessadvice.Goal;
import com.huawei.pluginfitnessadvice.Pictures;
import com.huawei.pluginfitnessadvice.Video;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class pcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("audios")
    private List<Audio> f45136a;

    @SerializedName("type")
    private int aa;

    @SerializedName("videos")
    private List<Video> ab;

    @SerializedName("trainingpoints")
    private List<Attribute> ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("calorie")
    private String f45137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("actionStep")
    private String f45138c;

    @SerializedName("actionId")
    private String d;

    @SerializedName("breath")
    private String e;

    @SerializedName("covers")
    private List<Cover> f;

    @SerializedName("difficulty")
    private int g;

    @SerializedName("commonError")
    private String h;

    @SerializedName("description")
    private String i;

    @SerializedName("difficultyId")
    private String j;

    @SerializedName("equipments")
    private List<Attribute> k;

    @SerializedName("goals")
    private List<Goal> l;

    @SerializedName("frequency")
    private int m;

    @SerializedName("feeling")
    private String n;

    @SerializedName("gyro")
    private int o;

    @SerializedName("logoImgUrl")
    private String p;

    @SerializedName("measurementType")
    private int q;

    @SerializedName("id")
    private String r;

    @SerializedName("introduceLyric")
    private String s;

    @SerializedName("modified")
    private long t;

    @SerializedName("nameId")
    private String u;

    @SerializedName("showInActionLibrary")
    private String v;

    @SerializedName("publishDate")
    private long w;

    @SerializedName("pictures")
    private List<Pictures> x;

    @SerializedName("name")
    private String y;

    @SerializedName("version")
    private String z;

    public String toString() {
        return new Gson().toJson(this);
    }
}
