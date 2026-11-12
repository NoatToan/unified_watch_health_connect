package com.huami.bloodoxygen.core.repository.delegate.interfaces;

import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.remote.api.event.EventItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&JF\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&J\u001e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H&¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IHttpDelegate;", "", "", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "events", "", "uploadEvents", "", "from", "to", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "syncNext", "reverse", "", "limit", "getDateEvents", "subType", "", "timestamps", "deleteEvents", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IHttpDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ List getDateEvents$default(IHttpDelegate iHttpDelegate, String str, String str2, BloodOxygen.SubType subType, boolean z, boolean z2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateEvents");
            }
            if ((i2 & 4) != 0) {
                subType = BloodOxygen.SubType.ALL;
            }
            return iHttpDelegate.getDateEvents(str, str2, subType, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 999 : i);
        }
    }

    boolean deleteEvents(@NotNull BloodOxygen.SubType subType, @NotNull List<Long> timestamps);

    @NotNull
    List<EventItem> getDateEvents(@NotNull String from, @NotNull String to, @NotNull BloodOxygen.SubType type, boolean syncNext, boolean reverse, int limit);

    boolean uploadEvents(@NotNull List<EventItem> events);
}
