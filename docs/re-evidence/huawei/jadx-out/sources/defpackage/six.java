package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class six {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cardIds")
    private List<String> f48159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("groupType")
    private int f48160b;

    public int e() {
        return this.f48160b;
    }

    public void b(int i) {
        this.f48160b = i;
    }

    public List<String> a() {
        return this.f48159a;
    }

    public void c(List<String> list) {
        this.f48159a = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardShowGroup{mGroupType=");
        sb.append(this.f48160b);
        sb.append(", mCardIds=");
        List<String> list = this.f48159a;
        sb.append(list == null ? Constants.NULL : Arrays.toString(list.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
