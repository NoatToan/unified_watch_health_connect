package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wsi {

    @SerializedName("mediaEvaluationSwitch")
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("countryBlocklist")
    private List<String> f52403a = new ArrayList();

    public boolean b() {
        return this.d;
    }

    public List<String> c() {
        return this.f52403a;
    }

    public String toString() {
        return "BetaSubmissionConfigBean MediaEvaluationSwitch = " + this.d + " CountryBlocklist = " + this.f52403a;
    }
}
