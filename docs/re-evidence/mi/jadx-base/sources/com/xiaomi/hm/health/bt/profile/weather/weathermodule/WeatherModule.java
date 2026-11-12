package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import defpackage.ax;
import defpackage.d4;
import defpackage.fu;
import defpackage.mj;
import defpackage.nl;
import defpackage.ol;
import defpackage.r3;
import defpackage.t5t;
import defpackage.z2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nJ\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lol;", "", b.I, "", "decodeVersion", "(Lol;)Ljava/lang/Integer;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "Lkotlin/collections/ArrayList;", "decodeCityList", "", "isSuccess", "queryVersion", "()Ljava/lang/Integer;", "cityList", "setCityList", "queryCityList", "city", "add", "modifyCity", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "weatherSettings", "updateWeatherSettings", "queryWeatherSettings", "toByteArray", "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 14)
public final class WeatherModule extends a {
    public static final byte CODE_SUCCESS = 1;
    public static final int PROTOCOL_VERSION_1 = 1;
    public static final int PROTOCOL_VERSION_2 = 2;
    private static final long TIMEOUT = 5000;
    public static final int WEATHER_MODULE_ID = 14;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0070, please report this as an issue */
    private final ArrayList<City> decodeCityList(ol<byte[]> response) {
        Object objM886constructorimpl;
        Throwable thM889exceptionOrNullimpl;
        ArrayList arrayList;
        try {
            Result.Companion companion = Result.Companion;
            if (response instanceof fu) {
                ByteBuffer byteBuffer = ByteBuffer.wrap((byte[]) ((fu) response).a());
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer.get();
                if (byteBuffer.get() == 1) {
                    byte b2 = byteBuffer.get();
                    arrayList = new ArrayList();
                    Iterator<Integer> it = RangesKt___RangesKt.until(0, b2).iterator();
                    while (it.hasNext()) {
                        ((IntIterator) it).nextInt();
                        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                        arrayList.add(new City(z2.q(byteBuffer), z2.q(byteBuffer)));
                    }
                }
                objM886constructorimpl = Result.m886constructorimpl(arrayList);
                thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                if (thM889exceptionOrNullimpl != null) {
                    t5t.d(a.TAG, "decodeCityList: " + thM889exceptionOrNullimpl);
                }
                return (ArrayList) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
            }
            arrayList = null;
            objM886constructorimpl = Result.m886constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(a.TAG, "decodeCityList: " + thM889exceptionOrNullimpl);
        }
        return (ArrayList) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
    }

    private final Integer decodeVersion(ol<byte[]> response) {
        if (!(response instanceof fu)) {
            return null;
        }
        byte[] bArr = (byte[]) ((fu) response).a();
        if (bArr.length != 2) {
            return null;
        }
        return Integer.valueOf(bArr[1]);
    }

    private final boolean isSuccess(ol<byte[]> olVar) {
        if (olVar instanceof fu) {
            fu fuVar = (fu) olVar;
            if (((byte[]) fuVar.a()).length == 2 && ((byte[]) fuVar.a())[1] == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean modifyCity(@NotNull City city, boolean add) {
        Intrinsics.checkNotNullParameter(city, "city");
        return isSuccess(sendRequest(new nl(new ax.b().withBytes(city.toByteArray()).withBoolean(add), mj.t, 5000L, null, false, 24, null)));
    }

    @Nullable
    public final ArrayList<City> queryCityList() {
        return decodeCityList(sendRequest(new nl(new ax.c(), mj.t, 5000L, null, false, 24, null)));
    }

    @Nullable
    public final Integer queryVersion() {
        return decodeVersion(sendRequest(new nl(new ax.e(), mj.t, 5000L, null, false, 24, null)));
    }

    @Nullable
    public final WeatherSetting queryWeatherSettings() {
        WeatherSetting weatherSettingA = WeatherSetting.INSTANCE.a(sendRequest(new nl(new ax.d(), mj.t, 5000L, null, false, 24, null)));
        t5t.d(a.TAG, "queryWeatherSetting ret: " + weatherSettingA);
        return weatherSettingA;
    }

    public final boolean setCityList(@NotNull ArrayList<City> cityList) {
        Intrinsics.checkNotNullParameter(cityList, "cityList");
        byte[] byteArray = toByteArray(cityList);
        if (byteArray == null) {
            return false;
        }
        ol<byte[]> olVarSendRequest = sendRequest(new nl(new ax.f().withBytes(byteArray), mj.t, 5000L, null, false, 24, null));
        if (!(olVarSendRequest instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) olVarSendRequest;
        return ((byte[]) fuVar.a()).length == 2 && ((byte[]) fuVar.a())[1] == 1;
    }

    @Nullable
    public final byte[] toByteArray(@NotNull ArrayList<City> arrayList) throws IOException {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(arrayList.size());
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(((City) it.next()).toByteArray());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean updateWeatherSettings(@NotNull WeatherSetting weatherSettings) {
        Intrinsics.checkNotNullParameter(weatherSettings, "weatherSettings");
        byte[] byteArray = weatherSettings.toByteArray();
        if (byteArray == null) {
            return false;
        }
        boolean zIsSuccess = isSuccess(sendRequest(new nl(new ax.g().withBytes(byteArray), mj.t, 5000L, null, false, 24, null)));
        t5t.d(a.TAG, "updateWeatherSettings: " + weatherSettings + ", ret: " + zIsSuccess);
        return zIsSuccess;
    }
}
