package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.schedule.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.dto.VersionThreeItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
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
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\t\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¨\u0006\u0014"}, d2 = {"Lsp;", "", "", "responseBody", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lnr;", PluginDeviceInfo.FDESC, "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", PluginDeviceInfo.FMODEL, "", "supportAddress", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "data", "", "itemCount", "Lcom/huami/bluetooth/profile/channel/module/schedule/dto/ItemDto;", DeviceTagInterface.CUSTOM_TAG_DISPLAY_TYPE_ORDER, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class sp {
    @NotNull
    public final Response<List<ScheduleStatus>> a(@NotNull byte[] responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        if (responseBody.length >= 3) {
            return Response.INSTANCE.a(a(ArraysKt___ArraysKt.sliceArray(responseBody, RangesKt___RangesKt.until(3, responseBody.length)), tet.d(responseBody, 1, 2)));
        }
        return Response.Companion.a(Response.INSTANCE, "data error " + tet.x(responseBody), 0, 2, null);
    }

    @NotNull
    public final Response<ScheduleVersion> b(@NotNull byte[] responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        ByteIterator it = ArrayIteratorsKt.iterator(responseBody);
        if (responseBody.length >= 2) {
            it.nextByte();
            return Response.INSTANCE.a(new ScheduleVersion(it.nextByte(), it.hasNext() ? c3.a(it.nextByte()) : false, it.hasNext() ? c3.a(it.nextByte()) : false));
        }
        return Response.Companion.a(Response.INSTANCE, "data error " + tet.x(responseBody), 0, 2, null);
    }

    public final List<ScheduleStatus> a(byte[] data, int itemCount) {
        if (itemCount == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < itemCount; i2++) {
            int i3 = i + 5;
            if (data.length >= i3) {
                arrayList.add(new ScheduleStatus(tet.v(data, i, 4), data[i + 4], tet.v(data, i3, 4)));
                i = i3;
            }
        }
        return arrayList;
    }

    @NotNull
    public final Response<List<ScheduleModel>> a(@NotNull byte[] responseBody, boolean supportAddress) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        if (responseBody.length < 3) {
            return Response.Companion.a(Response.INSTANCE, "data error " + tet.x(responseBody), 0, 2, null);
        }
        return Response.INSTANCE.a(a(ArraysKt___ArraysKt.sliceArray(responseBody, RangesKt___RangesKt.until(3, responseBody.length)), tet.d(responseBody, 1, 2), supportAddress));
    }

    public final List<ScheduleModel> a(byte[] data, int itemCount, boolean supportAddress) {
        Layout itemDto;
        if (itemCount == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int iDecode = 0;
        for (int i = 0; i < itemCount; i++) {
            if (supportAddress) {
                itemDto = new VersionThreeItemDto();
            } else {
                itemDto = new ItemDto();
            }
            iDecode = BinaryDecoder.decode(itemDto, data, iDecode);
            arrayList.add(itemDto);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a((ItemDto) it.next()));
        }
        return arrayList2;
    }

    public final ScheduleModel a(ItemDto dto) {
        String str;
        UInt32 uInt32 = dto.id;
        long jLongValue = uInt32 != null ? uInt32.ensureValue().longValue() : 0L;
        String title = dto.title;
        String description = dto.description;
        long jLongValue2 = dto.startTime.ensureValue().longValue();
        long jLongValue3 = dto.stopTime.ensureValue().longValue();
        long j = dto.alertTime;
        boolean z = dto.isAllDayEvent;
        long jLongValue4 = dto.repeatMode.ensureValue().longValue();
        long jLongValue5 = dto.repeatStopTime.ensureValue().longValue();
        String imageUrl = dto.imageUrl;
        int iIntValue = dto.source.ensureValue().intValue();
        if (dto instanceof VersionThreeItemDto) {
            str = ((VersionThreeItemDto) dto).address;
        } else {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(title, "title");
        Intrinsics.checkNotNullExpressionValue(description, "description");
        Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
        Intrinsics.checkNotNullExpressionValue(str, "if (dto is VersionThreeI…         \"\"\n            }");
        return new ScheduleModel(jLongValue, title, description, jLongValue2, jLongValue3, j, jLongValue4, jLongValue5, z, imageUrl, iIntValue, 0L, str, 2048, null);
    }
}
