package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.operation.utils.Constants;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cardShowGroups")
    private List<six> f48149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("configId")
    private String f48150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("isEdited")
    private boolean f48151c = false;

    @SerializedName("updateConfigs")
    private List<siv> d;

    @SerializedName("cardConfigList")
    private LinkedList<CardConfig> e;

    @SerializedName("version")
    private String j;

    public boolean e() {
        return this.f48151c;
    }

    public String b() {
        return this.j;
    }

    public void a(String str) {
        this.j = str;
    }

    public void a(boolean z) {
        this.f48151c = z;
    }

    public String d() {
        return this.f48150b;
    }

    public LinkedList<CardConfig> c() {
        return this.e;
    }

    public void e(LinkedList<CardConfig> linkedList) {
        this.e = linkedList;
    }

    public List<six> a() {
        return this.f48149a;
    }

    public void d(List<six> list) {
        this.f48149a = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FunctionCardSetConfig{mVersion='");
        sb.append(this.j);
        sb.append("', mIsEdited=");
        sb.append(this.f48151c);
        sb.append(", mConfigId='");
        sb.append(this.f48150b);
        sb.append("', mCardConfigList=");
        LinkedList<CardConfig> linkedList = this.e;
        String string = Constants.NULL;
        sb.append(linkedList == null ? Constants.NULL : Arrays.toString(linkedList.toArray()));
        sb.append(", mUpdateConfigs=");
        List<siv> list = this.d;
        sb.append(list == null ? Constants.NULL : Arrays.toString(list.toArray()));
        sb.append(", mCardShowGroups=");
        List<six> list2 = this.f48149a;
        if (list2 != null) {
            string = Arrays.toString(list2.toArray());
        }
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
