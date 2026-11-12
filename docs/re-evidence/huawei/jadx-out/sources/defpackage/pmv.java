package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pmv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BleConstants.SPORT_TYPE)
    private int f45689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("lastEnterTime")
    private long f45690c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("backgroundList")
    private List<Integer> f45688a = new ArrayList();

    @SerializedName("recommendList")
    private List<Integer> e = new ArrayList();

    @SerializedName("stickerList")
    private List<Integer> d = new ArrayList();

    @SerializedName("watermarkList")
    private List<Integer> j = new ArrayList();

    public pmv(int i) {
        this.f45689b = i;
    }

    public void d(long j) {
        this.f45690c = j;
    }

    public List<Integer> b() {
        return this.e;
    }

    public void c(List<Integer> list) {
        this.e = list;
    }

    public List<Integer> c() {
        return this.f45688a;
    }

    public void a(List<Integer> list) {
        this.f45688a = list;
    }

    public List<Integer> d() {
        return this.j;
    }

    public void e(List<Integer> list) {
        this.j = list;
    }

    public List<Integer> e() {
        return this.d;
    }

    public void b(List<Integer> list) {
        this.d = list;
    }

    public List<Integer> e(int i) {
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.f45688a;
        }
        if (i == 3) {
            return this.j;
        }
        if (i == 4) {
            return this.d;
        }
        return Collections.EMPTY_LIST;
    }
}
