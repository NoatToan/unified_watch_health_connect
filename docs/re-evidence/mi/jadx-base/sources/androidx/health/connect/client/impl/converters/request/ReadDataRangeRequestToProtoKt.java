package androidx.health.connect.client.impl.converters.request;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.impl.converters.datatype.DataTypeConverterKt;
import androidx.health.connect.client.impl.converters.time.TimeRangeFilterConverterKt;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.f1;
import androidx.health.platform.client.proto.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/records/Record;", "T", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "request", "Landroidx/health/platform/client/proto/f1;", "toReadDataRangeRequestProto", "(Landroidx/health/connect/client/request/ReadRecordsRequest;)Landroidx/health/platform/client/proto/f1;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nReadDataRangeRequestToProto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadDataRangeRequestToProto.kt\nandroidx/health/connect/client/impl/converters/request/ReadDataRangeRequestToProtoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1#3:55\n*S KotlinDebug\n*F\n+ 1 ReadDataRangeRequestToProto.kt\nandroidx/health/connect/client/impl/converters/request/ReadDataRangeRequestToProtoKt\n*L\n40#1:51\n40#1:52,3\n*E\n"})
public final class ReadDataRangeRequestToProtoKt {
    @NotNull
    public static final <T extends Record> f1 toReadDataRangeRequestProto(@NotNull ReadRecordsRequest<T> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        f1.a aVarA = f1.X().A(DataTypeConverterKt.toDataType(request.getRecordType$connect_client_release()));
        aVarA.D(TimeRangeFilterConverterKt.toProto(request.getTimeRangeFilter()));
        Set<DataOrigin> dataOriginFilter$connect_client_release = request.getDataOriginFilter$connect_client_release();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dataOriginFilter$connect_client_release, 10));
        Iterator<T> it = dataOriginFilter$connect_client_release.iterator();
        while (it.hasNext()) {
            arrayList.add(n.S().y(((DataOrigin) it.next()).getPackageName()).build());
        }
        aVarA.y(arrayList);
        aVarA.z(request.getAscendingOrder());
        aVarA.B(request.getPageSize());
        String pageToken = request.getPageToken();
        if (pageToken != null) {
            aVarA.C(pageToken);
        }
        GeneratedMessageLite generatedMessageLiteBuild = aVarA.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "newBuilder()\n        .se…       }\n        .build()");
        return (f1) generatedMessageLiteBuild;
    }
}
