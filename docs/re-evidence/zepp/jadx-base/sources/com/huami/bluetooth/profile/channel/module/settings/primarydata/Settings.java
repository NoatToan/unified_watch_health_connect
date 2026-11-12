package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0004H&J\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\nH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\u001f\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\u001b\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\u001e\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010!\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010%2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010'\u001a\u0004\u0018\u00010%2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010)\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010(2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010,\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010+2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010/\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010.2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u00100\u001a\u0004\u0018\u00010.2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u00102\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u0001012\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u00103\u001a\u0004\u0018\u0001012\u0006\u0010\u0007\u001a\u00020\u0004J\"\u00107\u001a\u001e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000004j\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0000`6R5\u0010;\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b04j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`68\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u0016\u0010>\u001a\u0002058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001c\u0010F\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006J"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "a", "", "count", "", "key", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "get", "", "keyToString", "", "checkValid", "toString", "", "toByteArray", "", "value", "setBoolean", "(Ljava/lang/Boolean;I)V", "getBoolean", "(I)Ljava/lang/Boolean;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "setStringEnum", "getStringEnum", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "setFlag", "getFlag", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "setTimeStamp", "getTimeStamp", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntPrimaryData;", "setInt", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getInt", "getIntPrimaryData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "setIntArray", "getIntArray", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setEnum", "getEnum", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "setEnumArray", "getEnumArray", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setTime", "getTime", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "setString", "getString", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lkotlin/collections/HashMap;", "toMap", "Ljava/util/HashMap;", "getValues", "()Ljava/util/HashMap;", "values", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class Settings implements Serializable {

    @NotNull
    private static final String b = "Settings";
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Byte, IPrimaryData> values = new HashMap<>();

    private final ByteArrayOutputStream a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(getGroupType().getValue());
        byteArrayOutputStream.write(getGroupVersion());
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(count());
        return byteArrayOutputStream;
    }

    public final void checkValid() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Byte, IPrimaryData> entry : this.values.entrySet()) {
            if (!entry.getValue().checkValid()) {
                Debug.fi("Settings", getGroupType() + JsonLexerKt.COLON + ((Object) keyToString(entry.getKey().byteValue())) + " invalid");
                arrayList.add(entry.getKey());
            }
        }
    }

    public final int count() {
        return this.values.size();
    }

    @Nullable
    public final IPrimaryData get(byte key) {
        return this.values.get(Byte.valueOf(key));
    }

    @Nullable
    public final Boolean getBoolean(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        BooleanData booleanData = iPrimaryData instanceof BooleanData ? (BooleanData) iPrimaryData : null;
        if (booleanData == null) {
            return null;
        }
        return Boolean.valueOf(booleanData.getValue());
    }

    @Nullable
    public final EnumData getEnum(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof EnumData) {
            return (EnumData) iPrimaryData;
        }
        return null;
    }

    @Nullable
    public final EnumArray getEnumArray(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof EnumArray) {
            return (EnumArray) iPrimaryData;
        }
        return null;
    }

    @Nullable
    public final Flag getFlag(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof Flag) {
            return (Flag) iPrimaryData;
        }
        return null;
    }

    @NotNull
    public abstract SettingsGroupType getGroupType();

    public abstract int getGroupVersion();

    @Nullable
    public final IntData getInt(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof IntData) {
            return (IntData) iPrimaryData;
        }
        return null;
    }

    @Nullable
    public final IntegerArray getIntArray(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof IntegerArray) {
            return (IntegerArray) iPrimaryData;
        }
        return null;
    }

    @Nullable
    public final IntPrimaryData getIntPrimaryData(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof IntPrimaryData) {
            return (IntPrimaryData) iPrimaryData;
        }
        return null;
    }

    @NotNull
    public abstract String getSettingsGroupName();

    @Nullable
    public final StringData getString(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof StringData) {
            return (StringData) iPrimaryData;
        }
        return null;
    }

    @Nullable
    public final StringEnum getStringEnum(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof StringEnum) {
            return (StringEnum) iPrimaryData;
        }
        return null;
    }

    @Nullable
    public final Time getTime(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof Time) {
            return (Time) iPrimaryData;
        }
        return null;
    }

    @Nullable
    public final TimeStamp getTimeStamp(int key) {
        IPrimaryData iPrimaryData = this.values.get(Byte.valueOf((byte) key));
        if (iPrimaryData instanceof TimeStamp) {
            return (TimeStamp) iPrimaryData;
        }
        return null;
    }

    @NotNull
    public final HashMap<Byte, IPrimaryData> getValues() {
        return this.values;
    }

    @Nullable
    public abstract String keyToString(int key);

    public final void setBoolean(@Nullable Boolean value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), new BooleanData(value.booleanValue()));
        }
    }

    public final void setEnum(@Nullable EnumData value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public final void setEnumArray(@Nullable EnumArray value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public final void setFlag(@Nullable Flag value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public abstract void setGroupVersion(int i);

    public final void setInt(@Nullable IntPrimaryData value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public final void setIntArray(@Nullable IntegerArray value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public final void setString(@Nullable StringData value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public final void setStringEnum(@Nullable StringEnum value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public final void setTime(@Nullable Time value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    public final void setTimeStamp(@Nullable TimeStamp value, int key) {
        if (value == null) {
            this.values.remove(Byte.valueOf((byte) key));
        } else {
            this.values.put(Byte.valueOf((byte) key), value);
        }
    }

    @NotNull
    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStreamA = a();
        for (Map.Entry entry : q.toSortedMap(this.values).entrySet()) {
            byteArrayOutputStreamA.write(((Number) entry.getKey()).byteValue());
            ((IPrimaryData) entry.getValue()).write(byteArrayOutputStreamA);
        }
        return byteArrayOutputStreamA.toByteArray();
    }

    @NotNull
    public final HashMap<SettingsGroupType, Settings> toMap() {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        map.put(getGroupType(), this);
        return map;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder('\n' + getSettingsGroupName() + '{');
        for (Map.Entry entry : CollectionsKt___CollectionsKt.sortedWith(this.values.entrySet(), new Comparator<T>() { // from class: com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings$toString$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues((Byte) ((Map.Entry) t).getKey(), (Byte) ((Map.Entry) t2).getKey());
            }
        })) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('\n');
            sb2.append((Object) keyToString(((Number) entry.getKey()).byteValue()));
            sb2.append(JsonLexerKt.COLON);
            sb2.append(entry.getValue());
            sb.append(sb2.toString());
        }
        sb.append("}\n");
        return sb.toString();
    }
}
