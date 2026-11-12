package com.xiaomi.hm.health.bt.profile.grsp;

import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0007\")\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\")\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f\")\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f\")\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\")\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f\")\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\")\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000f\")\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000f\")\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000f\")\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000f\")\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000f¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/grsp/SensorType;", BehaviorTaggingWebApi.g.w, "Lcom/xiaomi/hm/health/bt/profile/grsp/ChannelDescription;", "channelDescription", "", "isMatch", "", "", "configs", "config", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getGSENSOR", "()Ljava/util/ArrayList;", "GSENSOR", "b", "getPPG", SensorRecordsEnity.SensorType.SENSOR_PPG, "c", "getECG", SensorRecordsEnity.SensorType.SENSOR_ECG, GoogleApiAvailabilityLight.a, "getNMEA", "NMEA", "e", "getGYRO", SensorRecordsEnity.SensorType.SENSOR_G, "f", "getADATA", "ADATA", "g", "getGEO", "GEO", "h", "getSPO2", "SPO2", "i", "getHR", "HR", z.j, "getPRESSURE", "PRESSURE", hl.k, "getPRESSURE_NEW", "PRESSURE_NEW", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SensorDataConfigKt {

    @NotNull
    private static final ArrayList<String> a;

    @NotNull
    private static final ArrayList<String> b;

    @NotNull
    private static final ArrayList<String> c;

    @NotNull
    private static final ArrayList<String> d;

    @NotNull
    private static final ArrayList<String> e;

    @NotNull
    private static final ArrayList<String> f;

    @NotNull
    private static final ArrayList<String> g;

    @NotNull
    private static final ArrayList<String> h;

    @NotNull
    private static final ArrayList<String> i;

    @NotNull
    private static final ArrayList<String> j;

    @NotNull
    private static final ArrayList<String> k;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SensorType.values().length];
            iArr[SensorType.GSENSOR.ordinal()] = 1;
            iArr[SensorType.PPG.ordinal()] = 2;
            iArr[SensorType.ECG.ordinal()] = 3;
            iArr[SensorType.NMEA.ordinal()] = 4;
            iArr[SensorType.GYRO.ordinal()] = 5;
            iArr[SensorType.ADATA.ordinal()] = 6;
            iArr[SensorType.GEO.ordinal()] = 7;
            iArr[SensorType.SPO2.ordinal()] = 8;
            iArr[SensorType.HR.ordinal()] = 9;
            iArr[SensorType.PRESSURE.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        ChannelDataType channelDataType = ChannelDataType.INT_16;
        sb.append(channelDataType);
        sb.append(channelDataType);
        sb.append(channelDataType);
        a = CollectionsKt__CollectionsKt.arrayListOf(sb.toString());
        ChannelDataType channelDataType2 = ChannelDataType.INT_32;
        b = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(channelDataType), String.valueOf(ChannelDataType.UINT_16), String.valueOf(ChannelDataType.UINT_32), String.valueOf(channelDataType2));
        c = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(channelDataType), String.valueOf(channelDataType2));
        ChannelDataType channelDataType3 = ChannelDataType.INT_8;
        d = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(channelDataType3), String.valueOf(ChannelDataType.UINT_8));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(channelDataType);
        sb2.append(channelDataType);
        sb2.append(channelDataType);
        e = CollectionsKt__CollectionsKt.arrayListOf(sb2.toString());
        f = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(channelDataType3));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(channelDataType);
        sb3.append(channelDataType);
        sb3.append(channelDataType);
        g = CollectionsKt__CollectionsKt.arrayListOf(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(channelDataType2);
        sb4.append(channelDataType2);
        sb4.append(channelDataType2);
        h = CollectionsKt__CollectionsKt.arrayListOf(sb4.toString());
        i = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(channelDataType3));
        j = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(channelDataType));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(channelDataType);
        sb5.append(channelDataType);
        sb5.append(channelDataType);
        k = CollectionsKt__CollectionsKt.arrayListOf(sb5.toString());
    }

    @NotNull
    public static final ArrayList<String> getADATA() {
        return f;
    }

    @NotNull
    public static final ArrayList<String> getECG() {
        return c;
    }

    @NotNull
    public static final ArrayList<String> getGEO() {
        return g;
    }

    @NotNull
    public static final ArrayList<String> getGSENSOR() {
        return a;
    }

    @NotNull
    public static final ArrayList<String> getGYRO() {
        return e;
    }

    @NotNull
    public static final ArrayList<String> getHR() {
        return i;
    }

    @NotNull
    public static final ArrayList<String> getNMEA() {
        return d;
    }

    @NotNull
    public static final ArrayList<String> getPPG() {
        return b;
    }

    @NotNull
    public static final ArrayList<String> getPRESSURE() {
        return j;
    }

    @NotNull
    public static final ArrayList<String> getPRESSURE_NEW() {
        return k;
    }

    @NotNull
    public static final ArrayList<String> getSPO2() {
        return h;
    }

    public static final boolean isMatch(@NotNull SensorType sensorType, @Nullable ChannelDescription channelDescription) {
        ArrayList<String> arrayList;
        if (channelDescription == null) {
            return false;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[sensorType.ordinal()]) {
            case 1:
                arrayList = a;
                break;
            case 2:
                arrayList = b;
                break;
            case 3:
                arrayList = c;
                break;
            case 4:
                arrayList = d;
                break;
            case 5:
                arrayList = e;
                break;
            case 6:
                arrayList = f;
                break;
            case 7:
                arrayList = g;
                break;
            case 8:
                arrayList = h;
                break;
            case 9:
                arrayList = i;
                break;
            case 10:
                arrayList = j;
                break;
            default:
                arrayList = null;
                break;
        }
        if (arrayList == null) {
            return false;
        }
        return isMatch(arrayList, channelDescription.toString());
    }

    public static final boolean isMatch(@NotNull List<String> list, @NotNull String str) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals((String) it2.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
