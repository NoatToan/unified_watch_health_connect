package com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApi;", "Ljava/io/Serializable;", "getHrZoneType", "", "getHrZoneValue", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface HrZoneWrapperApi extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long serialVersionUID = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/hrzone/HrZoneWrapperApi$Companion;", "", "()V", "serialVersionUID", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long serialVersionUID = 1;

        private Companion() {
        }
    }

    int getHrZoneType();

    @NotNull
    String getHrZoneValue();
}
