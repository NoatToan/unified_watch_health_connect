package com.huami.ai.koin.common;

import com.huami.ai.entity.template.Weather;
import com.huami.ai.entity.template.WeatherItem;
import com.huami.ai.skill.WeatherSkill;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.WeatherContent;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/koin/common/NewBleWeatherSkillImpl;", "Lcom/huami/ai/skill/WeatherSkill;", "Lcom/huami/ai/entity/template/WeatherItem;", "item", "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;", "b", "", "time", "a", "Lcom/huami/ai/entity/template/Weather;", "weatherData", "", "weatherForecast", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleWeatherSkillImpl implements WeatherSkill {
    private static final int b = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送天气的指令：", Boolean.valueOf(this.a));
        }
    }

    public NewBleWeatherSkillImpl(@NotNull HMBaseDevice hMBaseDevice) {
        this.baseDevice = hMBaseDevice;
    }

    private final long a(long time) {
        return ((long) Calendar.getInstance().get(15)) + time;
    }

    private final WeatherContent.Icon b(WeatherItem item) {
        if (item.getImage() != null) {
            return new WeatherContent.Icon(item.getImage().getContentDescription(), item.getImage().getSources().get(0).getUrl());
        }
        return null;
    }

    @Override // com.huami.ai.skill.WeatherSkill
    public boolean weatherForecast(@NotNull Weather weatherData) {
        ArrayList arrayList;
        if (weatherData.getWeather().size() > 1) {
            List<WeatherItem> listDrop = CollectionsKt___CollectionsKt.drop(weatherData.getWeather(), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDrop, 10));
            for (WeatherItem weatherItem : listDrop) {
                arrayList.add(new WeatherContent.ForecastWeather(a(weatherItem.getDate()) / ((long) 1000), weatherItem.getHTemperature(), weatherItem.getLTemperature(), b(weatherItem)));
            }
        } else {
            arrayList = null;
        }
        WeatherItem weatherItem2 = weatherData.getWeather().get(0);
        boolean zSendCommand$default = DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new WeatherContent(new WeatherContent.WeatherInfo(Long.valueOf(weatherItem2.getDate() / ((long) 1000)), weatherItem2.getLocation(), weatherItem2.getTitle(), weatherItem2.getSubTitle(), weatherItem2.getDescription(), b(weatherItem2), weatherItem2.getCTemperature(), weatherItem2.getHTemperature(), weatherItem2.getLTemperature(), arrayList, weatherItem2.getAqi()))), null, 2, null);
        HMLog.info("speech", new a(zSendCommand$default));
        return zSendCommand$default;
    }
}
