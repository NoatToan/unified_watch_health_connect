package androidx.health.connect.client.impl.converters.changes;

import androidx.health.connect.client.changes.Change;
import androidx.health.connect.client.changes.ChangesEvent;
import androidx.health.connect.client.changes.DeletionChange;
import androidx.health.connect.client.changes.UpsertionChange;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.platform.client.proto.ChangeProto;
import androidx.health.platform.client.proto.DataProto;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002¨\u0006\t"}, d2 = {"toApiChangesEvent", "Landroidx/health/connect/client/changes/ChangesEvent;", "proto", "Landroidx/health/platform/client/proto/ChangeProto$ChangesEvent;", "extractApiChanges", "", "Landroidx/health/connect/client/changes/Change;", "changes", "Landroidx/health/platform/client/proto/ChangeProto$DataChange;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChangesEventConverterKt {
    public static final ChangesEvent toApiChangesEvent(ChangeProto.ChangesEvent changesEvent) {
        zcp.c(changesEvent, "");
        List<ChangeProto.DataChange> changesList = changesEvent.getChangesList();
        zcp.b((Object) changesList, "");
        List<Change> listExtractApiChanges = extractApiChanges(changesList);
        String nextChangesToken = changesEvent.getNextChangesToken();
        zcp.b((Object) nextChangesToken, "");
        return new ChangesEvent(nextChangesToken, listExtractApiChanges);
    }

    private static final List<Change> extractApiChanges(List<ChangeProto.DataChange> list) {
        UpsertionChange upsertionChange;
        ArrayList arrayList = new ArrayList();
        for (ChangeProto.DataChange dataChange : list) {
            if (dataChange.hasDeleteUid()) {
                String deleteUid = dataChange.getDeleteUid();
                zcp.b((Object) deleteUid, "");
                upsertionChange = new DeletionChange(deleteUid);
            } else if (dataChange.hasUpsertDataPoint()) {
                DataProto.DataPoint upsertDataPoint = dataChange.getUpsertDataPoint();
                zcp.b((Object) upsertDataPoint, "");
                upsertionChange = new UpsertionChange(ProtoToRecordConvertersKt.toRecord(upsertDataPoint));
            } else {
                upsertionChange = null;
            }
            if (upsertionChange != null) {
                arrayList.add(upsertionChange);
            }
        }
        return arrayList;
    }
}
