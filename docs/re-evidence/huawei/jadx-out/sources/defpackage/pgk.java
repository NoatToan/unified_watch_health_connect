package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes42.dex */
public class pgk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pushType")
    private int f45325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("notifyTime")
    private long f45326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(TtmlNode.TAG_INFORMATION)
    private String f45327c;

    @SerializedName("huid")
    private long d;

    @SerializedName("memberHuid")
    private long e;

    public int e() {
        return this.f45325a;
    }

    public long d() {
        return this.e;
    }

    public String a() {
        return this.f45327c;
    }
}
