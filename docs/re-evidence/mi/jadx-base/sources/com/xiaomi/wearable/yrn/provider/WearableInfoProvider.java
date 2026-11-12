package com.xiaomi.wearable.yrn.provider;

import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.cej;
import defpackage.k1d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableInfoProvider;", "Lk1d;", "", "isEnableRN", "()Z", "", "Lcej;", "getReactPackages", "()Ljava/util/List;", "", "getPreLoadBundle", "getAssetsBuiltInBundleJsonPath", "()Ljava/lang/String;", "getCommonModuleName", RnReportConst.ApiReport.PARAM_MODULE, "getBundleFileName", "(Ljava/lang/String;)Ljava/lang/String;", "getJSMainModulePath", "", "getBizInjectJSGlobalMap", "(Ljava/lang/String;)Ljava/lang/Void;", "isSingleFullBundle", "packages", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableInfoProvider implements k1d {

    @NotNull
    private final List<cej> packages;

    /* JADX WARN: Multi-variable type inference failed */
    public WearableInfoProvider(@NotNull List<? extends cej> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.packages = packages;
    }

    @Override // defpackage.k1d
    @NotNull
    public String getAssetsBuiltInBundleJsonPath() {
        return "builtin_bundles_skytree/bundleInfo.json";
    }

    @Nullable
    /* JADX INFO: renamed from: getBizInjectJSGlobalMap, reason: collision with other method in class */
    public Void m869getBizInjectJSGlobalMap(@Nullable String module) {
        return null;
    }

    @Override // defpackage.k1d
    @NotNull
    public String getBundleFileName(@Nullable String module) {
        return "index.android.bundle";
    }

    @Override // defpackage.k1d
    @NotNull
    public String getCommonModuleName() {
        return "common";
    }

    @Override // defpackage.k1d
    @NotNull
    public String getJSMainModulePath() {
        return "index";
    }

    @Override // defpackage.k1d
    @NotNull
    public List<String> getPreLoadBundle() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"init", "sport"});
    }

    @Override // defpackage.k1d
    @NotNull
    public List<cej> getReactPackages() {
        return this.packages;
    }

    @Override // defpackage.k1d
    public boolean isEnableRN() {
        return true;
    }

    @Override // defpackage.k1d
    public boolean isSingleFullBundle() {
        return false;
    }

    @Override // defpackage.k1d
    public /* bridge */ /* synthetic */ WritableMap getBizInjectJSGlobalMap(String str) {
        return (WritableMap) m869getBizInjectJSGlobalMap(str);
    }
}
