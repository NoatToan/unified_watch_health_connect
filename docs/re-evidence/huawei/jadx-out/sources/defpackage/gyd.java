package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gyd implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mMarkIndexList")
    private List<Integer> f36220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mPoints")
    private List<jpg> f36221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mDataMap")
    private Map<String, String> f36222c = new HashMap();

    @SerializedName("mDataList")
    private List<gyk> d;

    @SerializedName("mMarkPoints")
    private List<jpg> e;

    @SerializedName("mThumbnail")
    private String h;

    public void e(Map<String, String> map) {
        this.f36222c = map;
    }

    public Map<String, String> d() {
        return this.f36222c;
    }

    public void a(List<jpg> list) {
        this.f36221b = list;
    }

    public List<jpg> b() {
        return this.f36221b;
    }

    public String h() {
        return this.h;
    }

    public void e(String str) {
        this.h = str;
    }

    public List<gyk> a() {
        return this.d;
    }

    public void d(List<gyk> list) {
        this.d = list;
    }

    public List<jpg> e() {
        return this.e;
    }

    public void b(List<jpg> list) {
        this.e = list;
    }

    public List<Integer> c() {
        return this.f36220a;
    }

    public void c(List<Integer> list) {
        this.f36220a = list;
    }
}
