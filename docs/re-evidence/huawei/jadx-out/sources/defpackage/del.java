package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
class del {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("version")
    private String f31709a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sportWordsList")
    private ArrayList<den> f31710c;

    del() {
    }

    public String c() {
        return this.f31709a;
    }

    public ArrayList<den> d() {
        return (ArrayList) this.f31710c.clone();
    }
}
