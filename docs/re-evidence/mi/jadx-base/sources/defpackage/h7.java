package defpackage;

import android.os.ConditionVariable;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lh7;", "", "Lkd;", "device", "", "", PluginDeviceInfo.FDESC, "Ltg;", "data", PluginDeviceInfo.FMODEL, "", "Lne;", "Ljava/util/Calendar;", "time", "rawData", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h7 f19763a = new h7();

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"h7$a", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ltg;", "data", "", PluginDeviceInfo.FMODEL, "", "result", "onFinish", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a extends HMCallback<HmGdspRawData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<HmGdspRawData> f19764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f19765b;
        public final /* synthetic */ ConditionVariable c;

        public a(List<HmGdspRawData> list, Ref.BooleanRef booleanRef, ConditionVariable conditionVariable) {
            this.f19764a = list;
            this.f19765b = booleanRef;
            this.c = conditionVariable;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(@Nullable HmGdspRawData data) {
            super.onData(data);
            if ((data != null ? data.getRawData() : null) == null || data.getRawData().length == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("sync data being invalid: ");
                sb.append(data != null ? data.getRawData() : null);
                t5t.d("StatisticV2Syncer", sb.toString());
                return;
            }
            t5t.d("StatisticV2Syncer", "sync data length: " + data.getRawData().length);
            this.f19764a.add(data);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            this.f19765b.element = result;
            t5t.d("StatisticV2Syncer", "device sync finish, result: " + result);
            this.c.open();
        }
    }

    @JvmStatic
    @Nullable
    public static final List<byte[]> b(@NotNull kd device) {
        Intrinsics.checkNotNullParameter(device, "device");
        t5t.d("StatisticV2Syncer", "start sync statistic data");
        h7 h7Var = f19763a;
        if (!h7Var.a(device)) {
            t5t.d("StatisticV2Syncer", "device do not have feature");
            return null;
        }
        if (!(device instanceof ne)) {
            t5t.d("StatisticV2Syncer", "device not support");
            return null;
        }
        try {
            Calendar time = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(time, "time");
            return h7Var.a(h7Var.a((ne) device, time));
        } catch (Exception e) {
            t5t.d("StatisticV2Syncer", "DeviceStatisticV2Collector exception: " + e);
            return null;
        }
    }

    public final List<HmGdspRawData> a(ne device, Calendar time) {
        ConditionVariable conditionVariable = new ConditionVariable(false);
        ArrayList arrayList = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        t5t.d("StatisticV2Syncer", "device sync start");
        device.M2(time, 44, new a(arrayList, booleanRef, conditionVariable));
        conditionVariable.block();
        if (!booleanRef.element) {
            arrayList.clear();
        }
        return arrayList;
    }

    public final List<byte[]> a(HmGdspRawData rawData) {
        byte[] rawData2 = rawData.getRawData();
        t5t.d("StatisticV2Syncer", "raw data: " + tet.x(rawData2));
        ArrayList arrayList = new ArrayList();
        int length = rawData2.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            if (i2 > length) {
                t5t.d("StatisticV2Syncer", "parse data failed as index out of bounds before parsing magic");
            } else {
                int iD = tet.d(rawData2, i, 2);
                int i3 = i + 4;
                if (i3 > length) {
                    t5t.d("StatisticV2Syncer", "parse data failed as index out of bounds after parsing magic");
                } else {
                    int iD2 = tet.d(rawData2, i2, 2);
                    int i4 = i3 + iD2;
                    if (i4 <= length) {
                        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(rawData2, i3, i4);
                        t5t.d("StatisticV2Syncer", "parse a protobuf data: {magic: " + iD + ", protobufLength: " + iD2 + AbstractJsonLexerKt.END_OBJ);
                        arrayList.add(bArrCopyOfRange);
                        i = i4;
                    } else {
                        t5t.d("StatisticV2Syncer", "parse data failed as index out of bounds after parsing protobuf length");
                    }
                }
            }
            arrayList.clear();
            break;
        }
        return arrayList;
    }

    public final boolean a(@NotNull kd device) {
        Intrinsics.checkNotNullParameter(device, "device");
        return device.O().A().hasSw(40);
    }

    @NotNull
    public final List<byte[]> a(@NotNull List<HmGdspRawData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, f19763a.a((HmGdspRawData) it.next()));
        }
        t5t.d("StatisticV2Syncer", "sync statistic data finish and data size: " + data.size() + "; parsed data size: " + arrayList.size());
        return arrayList;
    }
}
