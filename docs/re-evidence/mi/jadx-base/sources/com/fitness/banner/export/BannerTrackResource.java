package com.fitness.banner.export;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/fitness/banner/export/BannerTrackResource;", "", "<init>", "()V", DeviceTypes.UNKNOWN, "", "POP_UP", "POP_UP_FACE", "BANNER", "BANNER_FACE", "PUSH", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerTrackResource {
    public static final int BANNER = 3;
    public static final int BANNER_FACE = 4;

    @NotNull
    public static final BannerTrackResource INSTANCE = new BannerTrackResource();
    public static final int POP_UP = 1;
    public static final int POP_UP_FACE = 2;
    public static final int PUSH = 5;
    public static final int UNKNOWN = 0;

    private BannerTrackResource() {
    }
}
