package com.huami.bluetooth.profile.channel.module.schedule.action;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.schedule.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.dto.VersionThreeItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.ByteIterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u0002J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00112\u0006\u0010\u0010\u001a\u00020\u0002J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/QueryResultAction;", "", "", "data", "", "itemCount", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "b", "", "supportAddress", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "c", "Lcom/huami/bluetooth/profile/channel/module/schedule/dto/ItemDto;", "dto", "a", "responseBody", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "responseProtocolVersion", "responseDataChanged", AbstractJSONTokenResponse.RESPONSE, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class QueryResultAction {
    private final ScheduleModel a(ItemDto dto) {
        Long lEnsureValue;
        UInt32 uInt32 = dto.id;
        long jLongValue = 0;
        if (uInt32 != null && (lEnsureValue = uInt32.ensureValue()) != null) {
            jLongValue = lEnsureValue.longValue();
        }
        return new ScheduleModel(jLongValue, dto.title, dto.description, dto.startTime.ensureValue().longValue(), dto.stopTime.ensureValue().longValue(), dto.alertTime, dto.repeatMode.ensureValue().longValue(), dto.repeatStopTime.ensureValue().longValue(), dto.isAllDayEvent, dto.imageUrl, dto.source.ensureValue().intValue(), 0L, dto instanceof VersionThreeItemDto ? ((VersionThreeItemDto) dto).address : "", 2048, null);
    }

    private final List<ScheduleStatus> b(byte[] data, int itemCount) {
        if (itemCount == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < itemCount; i2++) {
            int i3 = i + 5;
            if (data.length >= i3) {
                arrayList.add(new ScheduleStatus(GattUtils.bytesToLong(data, i, 4), data[i + 4], GattUtils.bytesToLong(data, i3, 4)));
                i = i3;
            }
        }
        return arrayList;
    }

    private final List<ScheduleModel> c(byte[] data, int itemCount, boolean supportAddress) {
        if (itemCount == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int iDecode = 0;
        for (int i = 0; i < itemCount; i++) {
            Layout versionThreeItemDto = supportAddress ? new VersionThreeItemDto() : new ItemDto();
            iDecode = BinaryDecoder.decode(versionThreeItemDto, data, iDecode);
            arrayList.add(versionThreeItemDto);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a((ItemDto) it2.next()));
        }
        return arrayList2;
    }

    public static /* synthetic */ List d(QueryResultAction queryResultAction, byte[] bArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return queryResultAction.c(bArr, i, z);
    }

    public static /* synthetic */ Response response$default(QueryResultAction queryResultAction, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return queryResultAction.response(bArr, z);
    }

    @NotNull
    public final Response<List<ScheduleModel>> response(@NotNull byte[] responseBody, boolean supportAddress) {
        if (responseBody.length < 3) {
            return Response.Companion.fail$default(Response.INSTANCE, Intrinsics.stringPlus("data error ", GattUtils.bytesToHexString(responseBody)), 0, 2, null);
        }
        return Response.INSTANCE.success(c(ArraysKt___ArraysKt.sliceArray(responseBody, e.until(3, responseBody.length)), GattUtils.bytesToInt(responseBody, 1, 2), supportAddress));
    }

    @NotNull
    public final Response<List<ScheduleStatus>> responseDataChanged(@NotNull byte[] responseBody) {
        if (responseBody.length < 3) {
            return Response.Companion.fail$default(Response.INSTANCE, Intrinsics.stringPlus("data error ", GattUtils.bytesToHexString(responseBody)), 0, 2, null);
        }
        return Response.INSTANCE.success(b(ArraysKt___ArraysKt.sliceArray(responseBody, e.until(3, responseBody.length)), GattUtils.bytesToInt(responseBody, 1, 2)));
    }

    @NotNull
    public final Response<ScheduleVersion> responseProtocolVersion(@NotNull byte[] responseBody) {
        ByteIterator it2 = ArrayIteratorsKt.iterator(responseBody);
        if (responseBody.length < 2) {
            return Response.Companion.fail$default(Response.INSTANCE, Intrinsics.stringPlus("data error ", GattUtils.bytesToHexString(responseBody)), 0, 2, null);
        }
        it2.nextByte();
        return Response.INSTANCE.success(new ScheduleVersion(it2.nextByte(), it2.hasNext() ? ByteUtilsKt.toBoolean(it2.nextByte()) : false, it2.hasNext() ? ByteUtilsKt.toBoolean(it2.nextByte()) : false));
    }
}
