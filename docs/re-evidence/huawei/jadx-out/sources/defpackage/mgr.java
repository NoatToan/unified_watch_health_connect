package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class mgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    private e f41658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("des")
    private String f41659b;

    @SerializedName("code")
    private String e;

    public String d() {
        return this.e;
    }

    public e e() {
        return this.f41658a;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("time")
        private long f41660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("applyStatus")
        private int f41661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("queryResult")
        private int f41662c;

        @SerializedName("voiQueryResult")
        private int d;

        @SerializedName("picQueryResult")
        private int e;

        public int e() {
            return this.f41662c;
        }
    }
}
