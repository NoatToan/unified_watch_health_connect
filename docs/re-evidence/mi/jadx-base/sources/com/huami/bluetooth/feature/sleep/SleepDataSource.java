package com.huami.bluetooth.feature.sleep;

import com.huami.bluetooth.profile.channel.module.sleep.DataFlag;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/feature/sleep/SleepDataSource;", "Ljava/io/Serializable;", "", StatConstants.PARAM_START, StatConstants.PARAM_END, "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "flag", "", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "getData", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface SleepDataSource extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f9854a;

    /* JADX INFO: renamed from: com.huami.bluetooth.feature.sleep.SleepDataSource$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/feature/sleep/SleepDataSource$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9854a = new Companion();
    }

    @NotNull
    List<SleepData> getData(@NotNull String start, @NotNull String end, @NotNull DataFlag flag);
}
