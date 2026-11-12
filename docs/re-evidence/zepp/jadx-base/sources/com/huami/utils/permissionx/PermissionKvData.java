package com.huami.utils.permissionx;

import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/utils/permissionx/PermissionKvData;", "", "", "requestKey", "", "a", "Ljava/util/Date;", StatEvent.TP_FIRST, "second", "", "b", "time", "", "saveShowTime", "shouldShowRationaleOnceADay", "shouldShowRationaleOnlyOnce", "Ljava/lang/String;", "FILE_NAME", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionKvData {

    @NotNull
    public static final PermissionKvData INSTANCE = new PermissionKvData();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String FILE_NAME = "permission_rational";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final KvPersistence kv = KvKit.getKvPersistence$default(FILE_NAME, false, 2, null);

    private PermissionKvData() {
    }

    private final long a(String requestKey) {
        return ((Number) kv.getValue(requestKey, 0L)).longValue();
    }

    private final boolean b(Date first, Date second) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(first);
        calendar2.setTime(second);
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public final void saveShowTime(@NotNull String requestKey, long time) {
        kv.setValue(requestKey, Long.valueOf(time));
    }

    public final boolean shouldShowRationaleOnceADay(@NotNull String requestKey) {
        return !b(new Date(a(requestKey)), new Date());
    }

    public final boolean shouldShowRationaleOnlyOnce(@NotNull String requestKey) {
        return a(requestKey) == 0;
    }
}
