package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
class dkd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("countryCodeList")
    private List<String> f31844a = new ArrayList();

    dkd() {
    }

    public List<String> a() {
        return this.f31844a;
    }

    public String toString() {
        return "CountryCodeStruct{countryCodeList='" + this.f31844a + '}';
    }
}
