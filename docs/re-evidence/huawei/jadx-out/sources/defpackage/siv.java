package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class siv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("oldVersion")
    private String f48154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("newVersion")
    private String f48155b;

    @SerializedName("updateRecords")
    private List<b> e;

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("type")
        private int f48156c;

        @SerializedName("cardIds")
        private List<String> e;
    }

    public String toString() {
        return "CardUpdateConfig{mOldVersion='" + this.f48154a + "', mNewVersion='" + this.f48155b + "', mUpdateRecords=" + this.e + '}';
    }
}
