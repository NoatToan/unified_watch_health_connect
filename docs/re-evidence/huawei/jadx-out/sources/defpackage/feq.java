package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class feq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("commentInfo")
    private String f33960c;

    @SerializedName("commentTime")
    private String d;

    public String e() {
        return this.d;
    }

    public String toString() {
        return "CommentInfoMap{mCommentTime=" + this.d + ", mCommentInfo=" + this.f33960c + "}";
    }
}
