package com.huami.ai.koin.common;

import com.huami.ai.entity.template.Weather;
import com.huami.ai.skill.WeatherSkill;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/ai/koin/common/DefaultWeatherSkillImpl;", "Lcom/huami/ai/skill/WeatherSkill;", "Lcom/huami/ai/entity/template/Weather;", "weatherData", "", "weatherForecast", "<init>", "()V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultWeatherSkillImpl implements WeatherSkill {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Weather a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Weather weather) {
            super(0);
            this.a = weather;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("weather:", this.a);
        }
    }

    @Override // com.huami.ai.skill.WeatherSkill
    public boolean weatherForecast(@NotNull Weather weatherData) {
        HMLog.info("speech", new a(weatherData));
        return true;
    }
}
