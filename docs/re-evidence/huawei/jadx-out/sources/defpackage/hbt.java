package defpackage;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
class hbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("sportMode")
    private int f36375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("producers")
    private List<hbs> f36376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f36377c;

    @SerializedName("sources")
    private List<hbs> d;

    @SerializedName("managers")
    private List<hbs> e;

    @SerializedName("sportTypeName")
    private String g;

    @SerializedName("sportTypeId")
    private int h;

    @SerializedName("sportTypeRes")
    private String j;

    hbt() {
    }

    public List<hbs> e() {
        return this.e;
    }

    public List<hbs> a() {
        return this.f36376b;
    }

    public List<hbs> b() {
        return this.d;
    }

    public boolean b(int i, int i2) {
        return this.h == i && this.f36375a == i2;
    }

    public void b(hbt hbtVar) {
        if (hbtVar == null) {
            return;
        }
        this.e = c(hbtVar.e, this.e);
        this.f36376b = c(hbtVar.f36376b, this.f36376b);
        this.d = c(hbtVar.d, this.d);
    }

    private <T> List<T> c(List<T> list, List<T> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }
}
