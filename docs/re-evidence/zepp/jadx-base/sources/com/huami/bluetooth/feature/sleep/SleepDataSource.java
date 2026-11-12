package com.huami.bluetooth.feature.sleep;

import com.huami.bluetooth.profile.channel.module.sleep.DataFlag;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/feature/sleep/SleepDataSource;", "Ljava/io/Serializable;", "", "start", "end", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "flag", "", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "getData", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface SleepDataSource extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/feature/sleep/SleepDataSource$Companion;", "", "", "b", "J", "serialVersionUID", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final long serialVersionUID = 1;

        private Companion() {
        }
    }

    @NotNull
    List<SleepData> getData(@NotNull String start, @NotNull String end, @NotNull DataFlag flag);
}
