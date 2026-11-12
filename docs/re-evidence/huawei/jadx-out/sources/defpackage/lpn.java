package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lpn {

    @SerializedName("labelName")
    private String d;

    @SerializedName("labelValue")
    private List<String> e;

    public String b() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public List<String> a() {
        return this.e;
    }

    public void c(List<String> list) {
        this.e = list;
    }
}
