package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class gcs implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(TtmlNode.END)
    private int f34907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("start")
    private int f34908c;

    public int d() {
        return this.f34908c;
    }

    public int b() {
        return this.f34907b;
    }

    public String toString() {
        return "CpRelation{start='" + this.f34908c + ", end=" + this.f34907b + '}';
    }
}
