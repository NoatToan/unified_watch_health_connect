package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0000\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0000\u001a\n\u0010\u001e\u001a\u00020\u001d*\u00020\u0000\u001a\n\u0010 \u001a\u00020\u001f*\u00020\u0000\u001a\u0014\u0010\"\u001a\u00020!*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\n\u0010$\u001a\u00020#*\u00020\u0000\u001a\n\u0010&\u001a\u00020%*\u00020\u0000\u001a\n\u0010\u0014\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010'\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u001a\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010(\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\"\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0016\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0012\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010)\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010*\u001a\u00020\u0003*\u00020\u0000¨\u0006+"}, d2 = {"Ljava/nio/ByteBuffer;", "Lbs;", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "", e.f13808a, "", Constants.DEVICE_TYPE_WEAR, "", "v", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "u", "Lkk;", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "containDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", PluginDeviceInfo.FICONOFFLINE, "Lnj;", PluginDeviceInfo.FICONON, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", PluginDeviceInfo.FICONOFF, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", PluginDeviceInfo.FDESC, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", PluginDeviceInfo.FLOCALIZATIONS, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/BooleanData;", "m", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "r", "", "q", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", PluginDeviceInfo.FBLUETOOTHPAIR, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "n", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "s", Constant.KeyValue.KEY_COLUMN, "i", "h", "j", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class z2 {
    @NotNull
    public static final EnumArray a(@NotNull ByteBuffer byteBuffer, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        int iW = w(byteBuffer);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iW; i++) {
            arrayList.add(Integer.valueOf(w(byteBuffer)));
        }
        EnumArray enumArray = new EnumArray(arrayList, null, z, 2, null);
        if (z) {
            int iW2 = w(byteBuffer);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i2 = 0; i2 < iW2; i2++) {
                arrayList2.add(Integer.valueOf(w(byteBuffer)));
            }
            enumArray.setEnums(arrayList2);
        }
        return enumArray;
    }

    @NotNull
    public static final EnumData b(@NotNull ByteBuffer byteBuffer, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        int iW = w(byteBuffer);
        if (!z) {
            return new EnumData(iW, new ArrayList(), false);
        }
        ArrayList arrayList = new ArrayList();
        int iW2 = w(byteBuffer);
        for (int i = 0; i < iW2; i++) {
            arrayList.add(Integer.valueOf(w(byteBuffer)));
        }
        return new EnumData(iW, arrayList, true);
    }

    @NotNull
    public static final Int32Data c(@NotNull ByteBuffer byteBuffer, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return z ? new Int32Data(byteBuffer.getInt(), Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()), true) : new Int32Data(byteBuffer.getInt());
    }

    @NotNull
    public static final IntegerArray d(@NotNull ByteBuffer byteBuffer, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        int iW = w(byteBuffer);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt___RangesKt.until(0, iW).iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Integer.valueOf(byteBuffer.getShort()));
        }
        if (z) {
            return new IntegerArray(iW, arrayList, Integer.valueOf(w(byteBuffer)), Integer.valueOf(w(byteBuffer)), Integer.valueOf(byteBuffer.getShort()), Integer.valueOf(byteBuffer.getShort()), true);
        }
        return new IntegerArray(iW, arrayList, null, null, null, null, false, 124, null);
    }

    @NotNull
    public static final IntData e(@NotNull ByteBuffer byteBuffer, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return z ? new IntData(byteBuffer.getShort(), Integer.valueOf(byteBuffer.getShort()), Integer.valueOf(byteBuffer.getShort()), true) : new IntData(byteBuffer.getShort());
    }

    @NotNull
    public static final StringData f(@NotNull ByteBuffer byteBuffer, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return !z ? new StringData(q(byteBuffer)) : new StringData(q(byteBuffer), Integer.valueOf(w(byteBuffer)), true);
    }

    @NotNull
    public static final StringEnum g(@NotNull ByteBuffer byteBuffer, boolean z) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (!z) {
            return new StringEnum(q(byteBuffer), 0, null, false, 14, null);
        }
        String strQ = q(byteBuffer);
        int iW = w(byteBuffer);
        int iW2 = w(byteBuffer);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iW2; i++) {
            arrayList.add(q(byteBuffer));
        }
        return new StringEnum(strQ, iW, arrayList, true);
    }

    public static final boolean h(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 32;
    }

    public static final boolean i(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 33;
    }

    public static final boolean j(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 48;
    }

    public static final boolean k(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 64;
    }

    public static final boolean l(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 1;
    }

    @NotNull
    public static final BooleanData m(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return new BooleanData(l(byteBuffer));
    }

    @NotNull
    public static final Flag n(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return new Flag(byteBuffer.getInt());
    }

    @NotNull
    public static final kk o(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        byte b2 = byteBuffer.get();
        return new kk(kk.b.a((byte) (b2 & 127)), kk.a.a((byte) ((b2 & 255) >>> 7)));
    }

    @NotNull
    public static final bs p(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return bs.u.a(byteBuffer.get());
    }

    @NotNull
    public static final String q(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte b2 = byteBuffer.get();
            if (b2 == 0) {
                byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
                Charset charsetDefaultCharset = Charset.defaultCharset();
                Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
                return new String(byteArray, charsetDefaultCharset);
            }
            arrayList.add(Byte.valueOf(b2));
        }
    }

    @NotNull
    public static final Time r(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return new Time(w(byteBuffer), w(byteBuffer));
    }

    @NotNull
    public static final TimeStamp s(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return new TimeStamp(byteBuffer.getLong());
    }

    public static final int t(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        byte b2 = byteBuffer.get();
        return ((byteBuffer.get() & 255) << 8) | (b2 & 255);
    }

    public static final long u(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return tet.v(new byte[]{byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get()}, 0, 4);
    }

    public static final short v(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return (short) (byteBuffer.get() & 255);
    }

    public static final int w(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() & 255;
    }

    public static final boolean c(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 17;
    }

    public static final boolean e(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 1;
    }

    public static final boolean f(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 3;
    }

    public static final boolean b(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 16;
    }

    public static final boolean d(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 80;
    }

    public static final boolean g(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 2;
    }

    public static final boolean a(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        return byteBuffer.get() == 11;
    }
}
