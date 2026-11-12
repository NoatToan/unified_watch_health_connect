package com.xiaomi.fitness.devicesettings.export;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/N62SVersionPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", N62SVersionPreference.sN62SVersion, "setN62SVersion", "", "did", "version", "getN62SVersion", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class N62SVersionPreference extends PreferenceSupport {

    @NotNull
    public static final N62SVersionPreference INSTANCE = new N62SVersionPreference();

    @NotNull
    public static final String sN62SVersion = "sN62SVersion";

    private N62SVersionPreference() {
    }

    @NotNull
    public final String getN62SVersion(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (String) getValue("sN62SVersion_" + did, "");
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return sN62SVersion;
    }

    public final void setN62SVersion(@NotNull String did, @NotNull String version) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(version, "version");
        putValue("sN62SVersion_" + did, version);
    }
}
