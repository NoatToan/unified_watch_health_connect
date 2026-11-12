package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.tabtemplate.SportSubTabConfig;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qen implements BaseTemplateConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_tab")
    @Expose
    private List<SportSubTabConfig> f46066b;

    public List<SportSubTabConfig> d() {
        return this.f46066b;
    }
}
