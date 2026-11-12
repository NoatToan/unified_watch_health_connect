package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("labelGroupName")
    private String f40596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("service")
    private int f40597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("description")
    private String f40598c;

    @SerializedName("labelGroupId")
    private String d;

    @SerializedName("labelRules")
    private List<lpi> e;

    public List<lpi> b() {
        return this.e;
    }
}
