package com.fitness.banner.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/fitness/banner/export/BannerModule;", "", "<init>", "()V", "bindBannerImpl", "Lcom/fitness/banner/export/IBanner;", "impl", "Lcom/fitness/banner/export/BannerImpl;", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BannerModule {
    @NotNull
    public abstract IBanner bindBannerImpl(@NotNull BannerImpl impl);
}
