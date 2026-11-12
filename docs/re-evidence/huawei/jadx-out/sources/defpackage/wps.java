package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.ui.main.stories.template.health.config.HealthHasDataConfig;
import com.huawei.ui.main.stories.template.health.config.HealthNoDeviceConfig;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wps implements BaseTemplateConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activity_presenter")
    @Expose
    private String f52327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("operation_data")
    @Expose
    private wpw f52328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("has_data_config")
    @Expose
    private HealthHasDataConfig f52329c;

    @SerializedName(CloudParamKeys.INFO)
    @Expose
    private wpu d;

    @SerializedName("no_device_config")
    @Expose
    private HealthNoDeviceConfig e;

    @SerializedName("version_controller")
    @Expose
    private List<wpv> f;

    public wpu d() {
        return this.d;
    }

    public String c() {
        return this.f52327a;
    }

    public wpw e() {
        return this.f52328b;
    }

    public HealthHasDataConfig a() {
        return this.f52329c;
    }

    public HealthNoDeviceConfig b() {
        return this.e;
    }
}
