package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.ui.main.stories.privacy.template.model.config.PrivacyDataFragmentConfig;

/* JADX INFO: loaded from: classes19.dex */
public class why implements BaseTemplateConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("day_data_config")
    @Expose
    private PrivacyDataFragmentConfig f52070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("group_data_config")
    @Expose
    private PrivacyDataFragmentConfig f52071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(CloudParamKeys.INFO)
    @Expose
    private wpu f52072c;

    @SerializedName("double_group_data_config")
    @Expose
    private PrivacyDataFragmentConfig d;

    @SerializedName("activity_presenter")
    @Expose
    private String e;

    public wpu b() {
        return this.f52072c;
    }

    public String e() {
        return this.e;
    }

    public PrivacyDataFragmentConfig d() {
        return this.f52071b;
    }

    public PrivacyDataFragmentConfig c() {
        return this.f52070a;
    }

    public PrivacyDataFragmentConfig a() {
        return this.d;
    }
}
