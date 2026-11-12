package com.xiaomi.hm.health.ednetwork;

import com.huami.ednetwork.EdNetWorkWhitePath;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/ednetwork/EdWhitePath;", "", "", "addWhitePath", "b", "a", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EdWhitePath {

    @NotNull
    public static final EdWhitePath INSTANCE = new EdWhitePath();

    private EdWhitePath() {
    }

    private final void a() {
        EdNetWorkWhitePath.INSTANCE.addHmRegexPath("/users/[0-9]+/deviceTypes/[^/]+/data");
    }

    @JvmStatic
    public static final void addWhitePath() {
        EdWhitePath edWhitePath = INSTANCE;
        edWhitePath.b();
        edWhitePath.a();
    }

    private final void b() {
        EdNetWorkWhitePath.INSTANCE.addHmPath("/encryption/whiteBoxKey").addHmPath("/v1/data/band_data.json").addHmPath("/v1/sport/run/summary.json").addHmPath("/v1/sport/run/detail.json").addHmPath("/v1/sport/run/history.json").addHmPath("/v2/sport/stat.json").addHmPath("/v1/sport/shareRoute").addHmPath("/v1/sport/config.json");
    }
}
