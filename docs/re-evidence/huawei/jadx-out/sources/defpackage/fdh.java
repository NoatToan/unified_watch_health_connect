package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fdh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(TrackConstants$Events.FEATURE)
    private Map<?, ?> f33891b;

    @SerializedName("countryList")
    private List<String> e;

    public List<String> b() {
        return this.e;
    }

    public Map<?, ?> e() {
        return this.f33891b;
    }

    public String toString() {
        return "CountryRule{mCountryList=" + this.e + ", mFeatureMap=" + this.f33891b + '}';
    }
}
