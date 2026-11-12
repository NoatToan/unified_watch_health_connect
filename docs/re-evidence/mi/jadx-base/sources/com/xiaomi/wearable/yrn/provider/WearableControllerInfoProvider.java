package com.xiaomi.wearable.yrn.provider;

import android.app.Application;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.wearable.yrn.export.constants.YRNDebugConfig;
import com.xiaomi.wearable.yrn.helper.WearableRNRegisterInfoManager;
import defpackage.gur;
import defpackage.i1d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableControllerInfoProvider;", "Li1d;", "Landroid/app/Application;", "application", "", "Lgur;", "getConfigList", "(Landroid/app/Application;)Ljava/util/List;", "", "getDevMode", "(Landroid/app/Application;)Ljava/lang/Boolean;", "", "appName", RnReportConst.ApiReport.PARAM_MODULE, "url", "Ljava/util/ArrayList;", "needGaussInLargeScreenPathList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;", "Ljava/util/concurrent/ConcurrentHashMap;", "getUrlToRNAppNameMapping", "()Ljava/util/concurrent/ConcurrentHashMap;", "getUrlToRNModuleMapping", "needRNPageCountControl", "()Z", "getDefaultUrlWhenEmpty", "()Ljava/lang/String;", "assertIfFragmentParentActivityNoExtendBase", "()Ljava/lang/Boolean;", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableControllerInfoProvider implements i1d {
    @Override // defpackage.i1d
    @NotNull
    public Boolean assertIfFragmentParentActivityNoExtendBase() {
        return Boolean.TRUE;
    }

    @Override // defpackage.i1d
    @NotNull
    public List<gur> getConfigList(@Nullable Application application) {
        return WearableRNRegisterInfoManager.INSTANCE.yrnAppConfigList();
    }

    @Override // defpackage.i1d
    @NotNull
    public String getDefaultUrlWhenEmpty() {
        return "";
    }

    @Override // defpackage.i1d
    @NotNull
    public Boolean getDevMode(@Nullable Application application) {
        return application == null ? Boolean.FALSE : Boolean.valueOf(application.getSharedPreferences(YRNDebugConfig.PREF_NAME, 0).getBoolean(YRNDebugConfig.KEY_DEBUG_MODE, false));
    }

    @Override // defpackage.i1d
    @NotNull
    public ConcurrentHashMap<String, String> getUrlToRNAppNameMapping() {
        return new ConcurrentHashMap<>();
    }

    @Override // defpackage.i1d
    @NotNull
    public ConcurrentHashMap<String, String> getUrlToRNModuleMapping() {
        return new ConcurrentHashMap<>();
    }

    @Override // defpackage.i1d
    @NotNull
    public ArrayList<String> needGaussInLargeScreenPathList(@Nullable String appName, @Nullable String module, @Nullable String url) {
        return new ArrayList<>();
    }

    @Override // defpackage.i1d
    public boolean needRNPageCountControl() {
        return false;
    }
}
