package com.huami.bluetooth.profile.channel.module.settings.utils;

import com.huami.bluetooth.profile.channel.module.settings.SettingsError;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Int32Data;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0000\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\u0014\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0000\u001a\n\u0010\u001e\u001a\u00020\u001d*\u00020\u0000\u001a\n\u0010 \u001a\u00020\u001f*\u00020\u0000\u001a\u0014\u0010\"\u001a\u00020!*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u001a\n\u0010$\u001a\u00020#*\u00020\u0000\u001a\n\u0010&\u001a\u00020%*\u00020\u0000\u001a\n\u0010'\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010(\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010)\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010*\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010+\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010,\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010-\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010.\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010/\u001a\u00020\u0003*\u00020\u0000\u001a\n\u00100\u001a\u00020\u0003*\u00020\u0000\u001a\n\u00101\u001a\u00020\u0003*\u00020\u0000¨\u00062"}, d2 = {"Ljava/nio/ByteBuffer;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsError;", "getSettingsError", "", "getBoolean", "", "getUInt8ToInt", "", "getUInt8", "getUInt16", "", "getUInt32", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "getLocation", "containDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getIntData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Int32Data;", "getInt32Data", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "getIntArray", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getEnumData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "getStringEnumData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "getEnumArray", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/BooleanData;", "getBooleanData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getTimeData", "", "getString", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "getStringData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "getFlag", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "getTimeStamp", "checkFlag", "checkTimeStamp", "checkBoolean", "checkStringEnum", "checkInt", "checkInt32", "checkIntArray", "checkEnum", "checkEnumArray", "checkString", "checkTime", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ByteBufferExtendsKt {
    public static final boolean checkBoolean(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 11;
    }

    public static final boolean checkEnum(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 16;
    }

    public static final boolean checkEnumArray(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 17;
    }

    public static final boolean checkFlag(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 80;
    }

    public static final boolean checkInt(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 1;
    }

    public static final boolean checkInt32(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 3;
    }

    public static final boolean checkIntArray(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 2;
    }

    public static final boolean checkString(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 32;
    }

    public static final boolean checkStringEnum(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 33;
    }

    public static final boolean checkTime(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 48;
    }

    public static final boolean checkTimeStamp(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 64;
    }

    public static final boolean getBoolean(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() == 1;
    }

    @NotNull
    public static final BooleanData getBooleanData(@NotNull ByteBuffer byteBuffer) {
        return new BooleanData(getBoolean(byteBuffer));
    }

    @NotNull
    public static final EnumArray getEnumArray(@NotNull ByteBuffer byteBuffer, boolean z) {
        int uInt8ToInt = getUInt8ToInt(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (uInt8ToInt > 0) {
            int i2 = 0;
            do {
                i2++;
                arrayList.add(Integer.valueOf(getUInt8ToInt(byteBuffer)));
            } while (i2 < uInt8ToInt);
        }
        EnumArray enumArray = new EnumArray(arrayList, null, z, 2, null);
        if (z) {
            int uInt8ToInt2 = getUInt8ToInt(byteBuffer);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            if (uInt8ToInt2 > 0) {
                do {
                    i++;
                    arrayList2.add(Integer.valueOf(getUInt8ToInt(byteBuffer)));
                } while (i < uInt8ToInt2);
            }
            enumArray.setEnums(arrayList2);
        }
        return enumArray;
    }

    public static /* synthetic */ EnumArray getEnumArray$default(ByteBuffer byteBuffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getEnumArray(byteBuffer, z);
    }

    @NotNull
    public static final EnumData getEnumData(@NotNull ByteBuffer byteBuffer, boolean z) {
        int uInt8ToInt = getUInt8ToInt(byteBuffer);
        int i = 0;
        if (!z) {
            return new EnumData(uInt8ToInt, new ArrayList(), false);
        }
        ArrayList arrayList = new ArrayList();
        int uInt8ToInt2 = getUInt8ToInt(byteBuffer);
        if (uInt8ToInt2 > 0) {
            do {
                i++;
                arrayList.add(Integer.valueOf(getUInt8ToInt(byteBuffer)));
            } while (i < uInt8ToInt2);
        }
        return new EnumData(uInt8ToInt, arrayList, true);
    }

    public static /* synthetic */ EnumData getEnumData$default(ByteBuffer byteBuffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getEnumData(byteBuffer, z);
    }

    @NotNull
    public static final Flag getFlag(@NotNull ByteBuffer byteBuffer) {
        return new Flag(byteBuffer.getInt());
    }

    @NotNull
    public static final Int32Data getInt32Data(@NotNull ByteBuffer byteBuffer, boolean z) {
        return z ? new Int32Data(byteBuffer.getInt(), Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()), true) : new Int32Data(byteBuffer.getInt());
    }

    public static /* synthetic */ Int32Data getInt32Data$default(ByteBuffer byteBuffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getInt32Data(byteBuffer, z);
    }

    @NotNull
    public static final IntegerArray getIntArray(@NotNull ByteBuffer byteBuffer, boolean z) {
        int uInt8ToInt = getUInt8ToInt(byteBuffer);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = e.until(0, uInt8ToInt).iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            arrayList.add(Integer.valueOf(byteBuffer.getShort()));
        }
        return !z ? new IntegerArray(uInt8ToInt, arrayList, null, null, null, null, false, 124, null) : new IntegerArray(uInt8ToInt, arrayList, Integer.valueOf(getUInt8ToInt(byteBuffer)), Integer.valueOf(getUInt8ToInt(byteBuffer)), Integer.valueOf(byteBuffer.getShort()), Integer.valueOf(byteBuffer.getShort()), true);
    }

    public static /* synthetic */ IntegerArray getIntArray$default(ByteBuffer byteBuffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getIntArray(byteBuffer, z);
    }

    @NotNull
    public static final IntData getIntData(@NotNull ByteBuffer byteBuffer, boolean z) {
        return z ? new IntData(byteBuffer.getShort(), Integer.valueOf(byteBuffer.getShort()), Integer.valueOf(byteBuffer.getShort()), true) : new IntData(byteBuffer.getShort());
    }

    public static /* synthetic */ IntData getIntData$default(ByteBuffer byteBuffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getIntData(byteBuffer, z);
    }

    @NotNull
    public static final LocationExt getLocation(@NotNull ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        return new LocationExt(LocationExt.Wear.fromValue((byte) (b & 127)), LocationExt.Way.fromValue((byte) ((b & 255) >>> 7)));
    }

    @NotNull
    public static final SettingsError getSettingsError(@NotNull ByteBuffer byteBuffer) {
        return SettingsError.INSTANCE.fromValue(byteBuffer.get());
    }

    @NotNull
    public static final String getString(@NotNull ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte b = byteBuffer.get();
            if (b == 0) {
                return new String(CollectionsKt___CollectionsKt.toByteArray(arrayList), Charset.defaultCharset());
            }
            arrayList.add(Byte.valueOf(b));
        }
    }

    @NotNull
    public static final StringData getStringData(@NotNull ByteBuffer byteBuffer, boolean z) {
        return !z ? new StringData(getString(byteBuffer)) : new StringData(getString(byteBuffer), Integer.valueOf(getUInt8ToInt(byteBuffer)), true);
    }

    public static /* synthetic */ StringData getStringData$default(ByteBuffer byteBuffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getStringData(byteBuffer, z);
    }

    @NotNull
    public static final StringEnum getStringEnumData(@NotNull ByteBuffer byteBuffer, boolean z) {
        if (!z) {
            return new StringEnum(getString(byteBuffer), 0, null, false, 14, null);
        }
        String string = getString(byteBuffer);
        int uInt8ToInt = getUInt8ToInt(byteBuffer);
        int uInt8ToInt2 = getUInt8ToInt(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (uInt8ToInt2 > 0) {
            do {
                i++;
                arrayList.add(getString(byteBuffer));
            } while (i < uInt8ToInt2);
        }
        return new StringEnum(string, uInt8ToInt, arrayList, true);
    }

    public static /* synthetic */ StringEnum getStringEnumData$default(ByteBuffer byteBuffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getStringEnumData(byteBuffer, z);
    }

    @NotNull
    public static final Time getTimeData(@NotNull ByteBuffer byteBuffer) {
        return new Time(getUInt8ToInt(byteBuffer), getUInt8ToInt(byteBuffer));
    }

    @NotNull
    public static final TimeStamp getTimeStamp(@NotNull ByteBuffer byteBuffer) {
        return new TimeStamp(byteBuffer.getLong());
    }

    public static final int getUInt16(@NotNull ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        return ((byteBuffer.get() & 255) << 8) | (b & 255);
    }

    public static final long getUInt32(@NotNull ByteBuffer byteBuffer) {
        return GattUtils.bytesToLong(new byte[]{byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get()}, 0, 4);
    }

    public static final short getUInt8(@NotNull ByteBuffer byteBuffer) {
        return (short) (byteBuffer.get() & 255);
    }

    public static final int getUInt8ToInt(@NotNull ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }
}
