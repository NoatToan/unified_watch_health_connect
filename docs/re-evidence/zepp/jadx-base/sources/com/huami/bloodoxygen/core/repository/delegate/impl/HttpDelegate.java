package com.huami.bloodoxygen.core.repository.delegate.impl;

import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.remote.api.event.EventApi;
import com.huami.bloodoxygen.core.remote.api.event.EventItem;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.http.HttpError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J>\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/HttpDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IHttpDelegate;", "", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "events", "", "uploadEvents", "", "from", "to", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "syncNext", "reverse", "", "limit", "getDateEvents", "subType", "", "timestamps", "deleteEvents", "Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;", "a", "Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;", "eventApi", "<init>", "(Lcom/huami/bloodoxygen/core/remote/api/event/EventApi;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class HttpDelegate implements IHttpDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EventApi eventApi;

    public HttpDelegate(@NotNull EventApi eventApi) {
        this.eventApi = eventApi;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    public boolean deleteEvents(@NotNull BloodOxygen.SubType subType, @NotNull List<Long> timestamps) {
        if (timestamps.isEmpty()) {
            return true;
        }
        return this.eventApi.deleteEvents(subType, timestamps);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    @NotNull
    public List<EventItem> getDateEvents(@NotNull String from, @NotNull String to, @NotNull BloodOxygen.SubType type, boolean syncNext, boolean reverse, int limit) throws HttpError {
        boolean z;
        String date;
        ArrayList arrayList = new ArrayList();
        String str = from;
        do {
            List<EventItem> events = this.eventApi.getEvents("blood_oxygen", type, str, to, limit, reverse);
            if (events.isEmpty()) {
                break;
            }
            EventItem eventItem = (EventItem) CollectionsKt.last((List) events);
            z = false;
            if (syncNext && eventItem.isNext()) {
                if (eventItem.getDate().length() > 0) {
                    arrayList.addAll(CollectionsKt___CollectionsKt.dropLast(events, 1));
                    date = eventItem.getDate();
                } else {
                    arrayList.addAll(events);
                    date = "";
                }
            } else {
                arrayList.addAll(events);
                date = "";
            }
            str = date;
            if (str.length() > 0) {
                z = true;
            }
        } while (z);
        return arrayList;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.IHttpDelegate
    public boolean uploadEvents(@NotNull List<EventItem> events) {
        if (events.isEmpty()) {
            return true;
        }
        return this.eventApi.postEvents(events, ExtensionKt.isOdi(((EventItem) CollectionsKt.first((List) events)).getSubType()));
    }
}
