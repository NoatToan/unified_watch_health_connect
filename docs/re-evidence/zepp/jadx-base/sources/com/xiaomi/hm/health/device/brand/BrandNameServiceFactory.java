package com.xiaomi.hm.health.device.brand;

import com.huami.watch.companion.device.brand.BrandNameService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/brand/BrandNameServiceFactory;", "", "Lcom/huami/watch/companion/device/brand/BrandNameService;", "create", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BrandNameServiceFactory {

    @NotNull
    public static final BrandNameServiceFactory INSTANCE = new BrandNameServiceFactory();

    private BrandNameServiceFactory() {
    }

    @NotNull
    public final BrandNameService create() {
        return new BrandNameServiceIml();
    }
}
