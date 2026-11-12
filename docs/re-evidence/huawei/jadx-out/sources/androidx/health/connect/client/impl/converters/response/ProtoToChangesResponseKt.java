package androidx.health.connect.client.impl.converters.response;

import androidx.health.connect.client.changes.Change;
import androidx.health.connect.client.changes.DeletionChange;
import androidx.health.connect.client.changes.UpsertionChange;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.platform.client.proto.ChangeProto;
import androidx.health.platform.client.proto.DataProto;
import androidx.health.platform.client.proto.ResponseProto;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002¨\u0006\t"}, d2 = {"toChangesResponse", "Landroidx/health/connect/client/response/ChangesResponse;", "proto", "Landroidx/health/platform/client/proto/ResponseProto$GetChangesResponse;", "extractChanges", "", "Landroidx/health/connect/client/changes/Change;", "changes", "Landroidx/health/platform/client/proto/ChangeProto$DataChange;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProtoToChangesResponseKt {
    public static final ChangesResponse toChangesResponse(ResponseProto.GetChangesResponse getChangesResponse) {
        zcp.c(getChangesResponse, "");
        List<ChangeProto.DataChange> changesList = getChangesResponse.getChangesList();
        zcp.b((Object) changesList, "");
        List<Change> listExtractChanges = extractChanges(changesList);
        String nextChangesToken = getChangesResponse.getNextChangesToken();
        zcp.b((Object) nextChangesToken, "");
        return new ChangesResponse(listExtractChanges, nextChangesToken, getChangesResponse.getHasMore(), getChangesResponse.getChangesTokenExpired());
    }

    private static final List<Change> extractChanges(List<ChangeProto.DataChange> list) {
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
