package androidx.health.connect.client.impl.converters.response;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.response.ReadRecordsResponse;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.s1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/records/Record;", "T", "Landroidx/health/platform/client/proto/s1;", "proto", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "toReadRecordsResponse", "(Landroidx/health/platform/client/proto/s1;)Landroidx/health/connect/client/response/ReadRecordsResponse;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nProtoToReadRecordsResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoToReadRecordsResponse.kt\nandroidx/health/connect/client/impl/converters/response/ProtoToReadRecordsResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,3:39\n*S KotlinDebug\n*F\n+ 1 ProtoToReadRecordsResponse.kt\nandroidx/health/connect/client/impl/converters/response/ProtoToReadRecordsResponseKt\n*L\n34#1:38\n34#1:39,3\n*E\n"})
public final class ProtoToReadRecordsResponseKt {
    @NotNull
    public static final <T extends Record> ReadRecordsResponse<T> toReadRecordsResponse(@NotNull s1 proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        List<o> listO = proto.O();
        Intrinsics.checkNotNullExpressionValue(listO, "proto.dataPointList");
        List<o> list = listO;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (o it : list) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Record record = ProtoToRecordConvertersKt.toRecord(it);
            Intrinsics.checkNotNull(record, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.converters.response.ProtoToReadRecordsResponseKt.toReadRecordsResponse$lambda$0");
            arrayList.add(record);
        }
        return new ReadRecordsResponse<>(arrayList, proto.Q());
    }
}
