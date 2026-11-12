package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gfg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("controlDatas")
    private List<gfo> f35015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("button")
    private gfs f35016c;

    public gfg(List<gfo> list, gfs gfsVar) {
        this.f35015b = list;
        this.f35016c = gfsVar;
    }

    public gfs a() {
        return this.f35016c;
    }
}
