package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class peb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("actionId")
    private String f45231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("actions")
    private List<pdm> f45232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("operationType")
    private int f45233c;

    @SerializedName("dayNo")
    private int d;

    @SerializedName(ParsedFieldTag.ACTION_TYPE)
    private int e;

    @SerializedName("planId")
    private String f;

    @SerializedName("planType")
    private int h;

    @SerializedName("weekNo")
    private int i;

    public String e() {
        return this.f;
    }

    public void b(String str) {
        this.f = str;
    }

    public int a() {
        return this.f45233c;
    }

    public void e(int i) {
        this.f45233c = i;
    }

    public void c(int i) {
        this.i = i;
    }

    public int d() {
        return this.i;
    }

    public void d(int i) {
        this.d = i;
    }

    public int c() {
        return this.d;
    }

    public List<pdm> b() {
        return this.f45232b;
    }

    public void c(List<pdm> list) {
        this.f45232b = list;
    }
}
