package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("playList")
    private List<gdy> f48406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("detailList")
    private List<snk> f48407b;

    public List<gdy> b() {
        return this.f48406a;
    }

    public void c(List<gdy> list) {
        this.f48406a = list;
    }

    public List<snk> e() {
        return this.f48407b;
    }

    public void b(List<snk> list) {
        this.f48407b = list;
    }

    public String toString() {
        return "{,\"mPlayList\":" + this.f48406a + ",\"mDetailList\":" + this.f48407b + '}';
    }
}
