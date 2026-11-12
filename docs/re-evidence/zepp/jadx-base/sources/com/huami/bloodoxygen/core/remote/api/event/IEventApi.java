package com.huami.bloodoxygen.core.remote.api.event;

import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J \u0010\u0011\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\nH&J\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH&¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/event/IEventApi;", "", "", "eventType", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "subType", "from", "to", "", "limit", "", "reverse", "", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "getEvents", "items", "flattening", "postEvents", "", "timestamps", "deleteEvents", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IEventApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ boolean postEvents$default(IEventApi iEventApi, List list, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postEvents");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return iEventApi.postEvents(list, z);
        }
    }

    boolean deleteEvents(@NotNull BloodOxygen.SubType subType, @NotNull List<Long> timestamps);

    @NotNull
    List<EventItem> getEvents(@NotNull String eventType, @NotNull BloodOxygen.SubType subType, @NotNull String from, @NotNull String to, int limit, boolean reverse);

    boolean postEvents(@NotNull List<EventItem> items, boolean flattening);
}
