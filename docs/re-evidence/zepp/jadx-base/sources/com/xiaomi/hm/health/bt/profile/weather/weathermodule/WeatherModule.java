package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@ChannelModule(id = 14)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nJ\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", AbstractJSONTokenResponse.RESPONSE, "", GoogleApiAvailabilityLight.a, "(Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;)Ljava/lang/Integer;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "Lkotlin/collections/ArrayList;", "c", "", "e", "queryVersion", "()Ljava/lang/Integer;", "cityList", "setCityList", "queryCityList", "city", TransportUri.ACTION_ADD, "modifyCity", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "weatherSettings", "updateWeatherSettings", "queryWeatherSettings", "toByteArray", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WeatherModule extends BaseModule {
    public static final byte CODE_SUCCESS = 1;
    public static final int PROTOCOL_VERSION_1 = 1;
    public static final int PROTOCOL_VERSION_2 = 2;
    public static final int WEATHER_MODULE_ID = 14;
    private static final long g = 5000;

    public WeatherModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
    }

    private final ArrayList<City> c(ModuleResult<byte[]> response) {
        Object objM3845constructorimpl;
        ArrayList arrayList;
        try {
            Result.Companion companion = Result.Companion;
            if (response instanceof Success) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) ((Success) response).getData());
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferWrap.get();
                if (byteBufferWrap.get() != 1) {
                    arrayList = null;
                } else {
                    byte b = byteBufferWrap.get();
                    arrayList = new ArrayList();
                    Iterator<Integer> it2 = e.until(0, b).iterator();
                    while (it2.hasNext()) {
                        ((IntIterator) it2).nextInt();
                        arrayList.add(new City(ByteBufferExtendsKt.getString(byteBufferWrap), ByteBufferExtendsKt.getString(byteBufferWrap)));
                    }
                }
            } else {
                arrayList = null;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("decodeCityList: ", thM3848exceptionOrNullimpl));
        }
        return (ArrayList) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private final Integer d(ModuleResult<byte[]> response) {
        if (!(response instanceof Success)) {
            return null;
        }
        byte[] bArr = (byte[]) ((Success) response).getData();
        if (bArr.length != 2) {
            return null;
        }
        return Integer.valueOf(bArr[1]);
    }

    private final boolean e(ModuleResult<byte[]> moduleResult) {
        if (moduleResult instanceof Success) {
            Success success = (Success) moduleResult;
            if (((byte[]) success.getData()).length == 2 && ((byte[]) success.getData())[1] == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean modifyCity(@NotNull City city, boolean add) {
        return e(sendRequest(new ModuleRequest(new WeatherCommand.ModifyCity().withBytes(city.toByteArray()).withBoolean(add), IncreasePredict.INSTANCE, 5000L, null, false, 24, null)));
    }

    @Nullable
    public final ArrayList<City> queryCityList() {
        return c(sendRequest(new ModuleRequest(new WeatherCommand.QueryCityList(), IncreasePredict.INSTANCE, 5000L, null, false, 24, null)));
    }

    @Nullable
    public final Integer queryVersion() {
        return d(sendRequest(new ModuleRequest(new WeatherCommand.QueryVersion(), IncreasePredict.INSTANCE, 5000L, null, false, 24, null)));
    }

    @Nullable
    public final WeatherSetting queryWeatherSettings() {
        WeatherSetting weatherSettingFromByteArray = WeatherSetting.INSTANCE.fromByteArray(sendRequest(new ModuleRequest(new WeatherCommand.QuerySetting(), IncreasePredict.INSTANCE, 5000L, null, false, 24, null)));
        Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("queryWeatherSetting ret: ", weatherSettingFromByteArray));
        return weatherSettingFromByteArray;
    }

    public final boolean setCityList(@NotNull ArrayList<City> cityList) {
        byte[] byteArray = toByteArray(cityList);
        if (byteArray == null) {
            return false;
        }
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(new WeatherCommand.SetCityList().withBytes(byteArray), IncreasePredict.INSTANCE, 5000L, null, false, 24, null));
        if (!(moduleResultSendRequest instanceof Success)) {
            return false;
        }
        Success success = (Success) moduleResultSendRequest;
        return ((byte[]) success.getData()).length == 2 && ((byte[]) success.getData())[1] == 1;
    }

    @Nullable
    public final byte[] toByteArray(@NotNull ArrayList<City> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(arrayList.size());
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(((City) it2.next()).toByteArray());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean updateWeatherSettings(@NotNull WeatherSetting weatherSettings) {
        byte[] byteArray = weatherSettings.toByteArray();
        if (byteArray == null) {
            return false;
        }
        boolean zE = e(sendRequest(new ModuleRequest(new WeatherCommand.UpdateSetting().withBytes(byteArray), IncreasePredict.INSTANCE, 5000L, null, false, 24, null)));
        Debug.fi(BaseModule.TAG, "updateWeatherSettings: " + weatherSettings + ", ret: " + zE);
        return zE;
    }
}
