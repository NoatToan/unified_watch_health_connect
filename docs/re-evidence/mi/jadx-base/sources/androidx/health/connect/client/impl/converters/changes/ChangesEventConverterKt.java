package androidx.health.connect.client.impl.converters.changes;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.changes.ChangesEvent;
import androidx.health.connect.client.changes.DeletionChange;
import androidx.health.connect.client.changes.UpsertionChange;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.platform.client.proto.ChangeProto$DataChange;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/health/platform/client/proto/g;", "proto", "Landroidx/health/connect/client/changes/ChangesEvent;", "toApiChangesEvent", "(Landroidx/health/platform/client/proto/g;)Landroidx/health/connect/client/changes/ChangesEvent;", "", "Landroidx/health/platform/client/proto/ChangeProto$DataChange;", "changes", "", "extractApiChanges", "(Ljava/util/List;)Ljava/util/List;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nChangesEventConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangesEventConverter.kt\nandroidx/health/connect/client/impl/converters/changes/ChangesEventConverterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1603#2,9:46\n1855#2:55\n1856#2:57\n1612#2:58\n1#3:56\n*S KotlinDebug\n*F\n+ 1 ChangesEventConverter.kt\nandroidx/health/connect/client/impl/converters/changes/ChangesEventConverterKt\n*L\n37#1:46,9\n37#1:55\n37#1:57\n37#1:58\n37#1:56\n*E\n"})
public final class ChangesEventConverterKt {
    private static final List<Object> extractApiChanges(List<ChangeProto$DataChange> list) {
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
    public static final ChangesEvent toApiChangesEvent(@NotNull g proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        List<ChangeProto$DataChange> listO = proto.O();
        Intrinsics.checkNotNullExpressionValue(listO, "proto.changesList");
        List<Object> listExtractApiChanges = extractApiChanges(listO);
        String nextChangesToken = proto.Q();
        Intrinsics.checkNotNullExpressionValue(nextChangesToken, "nextChangesToken");
        return new ChangesEvent(nextChangesToken, listExtractApiChanges);
    }
}
