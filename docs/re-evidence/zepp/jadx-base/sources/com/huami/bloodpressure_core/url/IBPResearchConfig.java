package com.huami.bloodpressure_core.url;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "", "", "getAppName", "", "researchEnable", "url", "", "onResearchClick", "onResearchCardEnabled", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBPResearchConfig {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean onResearchCardEnabled(@NotNull IBPResearchConfig iBPResearchConfig) {
            return false;
        }

        public static boolean researchEnable(@NotNull IBPResearchConfig iBPResearchConfig) {
            return false;
        }
    }

    @NotNull
    String getAppName();

    boolean onResearchCardEnabled();

    void onResearchClick(@NotNull String url);

    boolean researchEnable();
}
