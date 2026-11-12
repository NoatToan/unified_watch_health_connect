package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.PersistCommand;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand;", "Lcom/huami/bluetooth/profile/PersistCommand;", "", "c", LogUtil.I, "getCmd", "()I", Constant.h, "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getCommandName", "()Ljava/lang/String;", "commandName", "", "extraBytes", "<init>", "(I[B)V", "Companion", "ModifyCity", "QueryCityList", "QuerySetting", "QueryVersion", "SetCityList", "UpdateSetting", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class WeatherCommand extends PersistCommand {
    private static final int e = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int cmd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String commandName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand$ModifyCity;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifyCity extends WeatherCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public ModifyCity() {
            super(7, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand$QueryCityList;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryCityList extends WeatherCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public QueryCityList() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand$QuerySetting;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QuerySetting extends WeatherCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public QuerySetting() {
            super(11, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand$QueryVersion;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersion extends WeatherCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public QueryVersion() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand$SetCityList;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetCityList extends WeatherCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public SetCityList() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand$UpdateSetting;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateSetting extends WeatherCommand {
        /* JADX WARN: Multi-variable type inference failed */
        public UpdateSetting() {
            super(9, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ WeatherCommand(int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new byte[0] : bArr);
    }

    public final int getCmd() {
        return this.cmd;
    }

    @Override // com.huami.bluetooth.profile.PersistCommand
    @NotNull
    public String getCommandName() {
        return this.commandName;
    }

    public WeatherCommand(int i, @NotNull byte[] bArr) {
        super(ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(i, 1), bArr));
        this.cmd = i;
        this.commandName = "WeatherCommand";
    }
}
