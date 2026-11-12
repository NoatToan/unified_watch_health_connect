package com.huami.watch.companion.ecg.util;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgMedicalService;", "", "", "source", "", "isMedicalSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "isMedicalCollectSource", "atrialText", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "", "openWeb", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public interface EcgMedicalService {
    int atrialText(int source);

    int atrialText(@NotNull HMDeviceSource source);

    boolean isMedicalCollectSource(int source);

    boolean isMedicalCollectSource(@NotNull HMDeviceSource source);

    boolean isMedicalSource(int source);

    boolean isMedicalSource(@NotNull HMDeviceSource source);

    void openWeb(@NotNull Context context, @NotNull String url);
}
