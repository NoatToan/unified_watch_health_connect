package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("postId")
    private String f51413a;

    @SerializedName("memberHuid")
    private String e;

    public String d() {
        return this.f51413a;
    }

    public String toString() {
        return "MemberPostId{mMemberHuid='" + this.e + "', mPostId='" + this.f51413a + "'}";
    }
}
