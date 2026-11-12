package androidx.health.connect.client.impl.converters.response;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.changes.DeletionChange;
import androidx.health.connect.client.changes.UpsertionChange;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.platform.client.proto.ChangeProto$DataChange;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.p1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/health/platform/client/proto/p1;", "proto", "Landroidx/health/connect/client/response/ChangesResponse;", "toChangesResponse", "(Landroidx/health/platform/client/proto/p1;)Landroidx/health/connect/client/response/ChangesResponse;", "", "Landroidx/health/platform/client/proto/ChangeProto$DataChange;", "changes", "", "extractChanges", "(Ljava/util/List;)Ljava/util/List;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nProtoToChangesResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoToChangesResponse.kt\nandroidx/health/connect/client/impl/converters/response/ProtoToChangesResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1603#2,9:51\n1855#2:60\n1856#2:62\n1612#2:63\n1#3:61\n*S KotlinDebug\n*F\n+ 1 ProtoToChangesResponse.kt\nandroidx/health/connect/client/impl/converters/response/ProtoToChangesResponseKt\n*L\n42#1:51,9\n42#1:60\n42#1:62\n42#1:63\n42#1:61\n*E\n"})
public final class ProtoToChangesResponseKt {
    private static final List<Object> extractChanges(List<ChangeProto$DataChange> list) {
        Object upsertionChange;
        ArrayList arrayList = new ArrayList();
        for (ChangeProto$DataChange changeProto$DataChange : list) {
            if (changeProto$DataChange.R()) {
                String strO = changeProto$DataChange.O();
                Intrinsics.checkNotNullExpressionValue(strO, "it.deleteUid");
                upsertionChange = new DeletionChange(strO);
            } else if (changeProto$DataChange.S()) {
                o oVarQ = changeProto$DataChange.Q();
                Intrinsics.checkNotNullExpressionValue(oVarQ, "it.upsertDataPoint");
                upsertionChange = new UpsertionChange(ProtoToRecordConvertersKt.toRecord(oVarQ));
            } else {
                upsertionChange = null;
            }
            if (upsertionChange != null) {
                arrayList.add(upsertionChange);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final ChangesResponse toChangesResponse(@NotNull p1 proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        List<ChangeProto$DataChange> listO = proto.O();
        Intrinsics.checkNotNullExpressionValue(listO, "proto.changesList");
        List<Object> listExtractChanges = extractChanges(listO);
        String strS = proto.S();
        Intrinsics.checkNotNullExpressionValue(strS, "proto.nextChangesToken");
        return new ChangesResponse(listExtractChanges, strS, proto.R(), proto.Q());
    }
}
