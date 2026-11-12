package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.ui.homehealth.search.template.SearchResultConfig;
import com.huawei.ui.homehealth.search.template.SearchSubTabConfig;

/* JADX INFO: loaded from: classes43.dex */
public class tan implements BaseTemplateConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("default_page")
    @Expose
    private SearchSubTabConfig f48872b;

    @SerializedName("result_page")
    @Expose
    private SearchResultConfig d;

    public SearchSubTabConfig b() {
        return this.f48872b;
    }

    public SearchResultConfig c() {
        return this.d;
    }
}
