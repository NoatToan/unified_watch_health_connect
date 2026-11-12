package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.tabtemplate.BaseTemplateConfig;

/* JADX INFO: loaded from: classes19.dex */
public class wpf<T extends BaseTemplateConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("template_config")
    @Expose
    private T f52307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("template_id")
    @Expose
    private String f52308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    @Expose
    private String f52309c;

    @SerializedName("template_parser")
    @Expose
    private String e;

    public String d() {
        return this.f52309c;
    }

    public T b() {
        return this.f52307a;
    }
}
