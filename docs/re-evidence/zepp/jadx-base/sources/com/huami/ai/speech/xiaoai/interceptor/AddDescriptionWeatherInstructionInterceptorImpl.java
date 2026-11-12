package com.huami.ai.speech.xiaoai.interceptor;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.entity.template.Image;
import com.huami.ai.entity.template.ImageSource;
import com.huami.ai.entity.template.Weather;
import com.huami.ai.entity.template.WeatherItem;
import com.huami.ai.skill.WeatherSkill;
import com.huami.ai.speech.xiaoai.utils.CheckInstructionKt;
import com.huami.ai.uitls.TrancateTextKt;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0013H\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/AddDescriptionWeatherInstructionInterceptorImpl;", "Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "Lcom/xiaomi/ai/api/common/Instruction;", "", "ttsIns", "weatherIns", "", "a", "Lcom/xiaomi/common/Optional;", "", "optTemp", "e", "date", "", "b", "Lcom/xiaomi/ai/api/Template$WeatherItem;", "item", "Lcom/huami/ai/entity/template/Image;", GoogleApiAvailabilityLight.a, "", "instruction", "intercept", "Lcom/huami/ai/skill/WeatherSkill;", "Lcom/huami/ai/skill/WeatherSkill;", "weatherSkill", "Ljava/text/SimpleDateFormat;", "Lkotlin/Lazy;", "c", "()Ljava/text/SimpleDateFormat;", TrainingWebConst.QueryParam.VIDEO_FORMAT, "<init>", "(Lcom/huami/ai/skill/WeatherSkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class AddDescriptionWeatherInstructionInterceptorImpl implements InstructionInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeatherSkill weatherSkill;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy format = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SimpleDateFormat> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        }
    }

    public AddDescriptionWeatherInstructionInterceptorImpl(@NotNull WeatherSkill weatherSkill) {
        this.weatherSkill = weatherSkill;
    }

    private final void a(Instruction<Object> ttsIns, Instruction<Object> weatherIns) {
        AddDescriptionWeatherInstructionInterceptorImpl addDescriptionWeatherInstructionInterceptorImpl = this;
        Object payload = weatherIns.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.Weather");
        WeatherSkill weatherSkill = addDescriptionWeatherInstructionInterceptorImpl.weatherSkill;
        List<Template.WeatherItem> weather = ((Template.Weather) payload).getWeather();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(weather, 10));
        for (Template.WeatherItem weatherItem : weather) {
            String strE = addDescriptionWeatherInstructionInterceptorImpl.e(weatherItem.getAqi());
            long jB = addDescriptionWeatherInstructionInterceptorImpl.b(weatherItem.getDate());
            String strE2 = addDescriptionWeatherInstructionInterceptorImpl.e(weatherItem.getHighTemperature());
            String strE3 = addDescriptionWeatherInstructionInterceptorImpl.e(weatherItem.getLowTemperature());
            String strE4 = addDescriptionWeatherInstructionInterceptorImpl.e(weatherItem.getCurrentTemperature());
            Object payload2 = ttsIns.getPayload();
            Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechSynthesizer.Speak");
            arrayList.add(new WeatherItem(strE, jB, strE2, strE3, strE4, TrancateTextKt.truncateSpeechChatCharacters(((SpeechSynthesizer.Speak) payload2).getText(), 100), weatherItem.getLocation(), addDescriptionWeatherInstructionInterceptorImpl.d(weatherItem), null, null, 768, null));
            addDescriptionWeatherInstructionInterceptorImpl = this;
        }
        weatherSkill.weatherForecast(new Weather(arrayList));
    }

    private final long b(String date) {
        Date date2 = c().parse(date);
        if (date2 == null) {
            return 0L;
        }
        return date2.getTime();
    }

    private final SimpleDateFormat c() {
        return (SimpleDateFormat) this.format.getValue();
    }

    private final Image d(Template.WeatherItem item) {
        if (!item.getIcon().isPresent()) {
            return null;
        }
        String description = item.getIcon().get().getDescription();
        List<Template.ImageSource> sources = item.getIcon().get().getSources();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sources, 10));
        Iterator<T> it2 = sources.iterator();
        while (it2.hasNext()) {
            arrayList.add(new ImageSource(((Template.ImageSource) it2.next()).getUrl(), null, null, null, null, 30, null));
        }
        return new Image(description, arrayList);
    }

    private final String e(Optional<String> optTemp) {
        if (optTemp.isPresent()) {
            return optTemp.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.xiaoai.interceptor.InstructionInterceptor
    @NotNull
    public List<Instruction<Object>> intercept(@NotNull List<? extends Instruction<Object>> instruction) {
        Instruction<Object> instruction2 = null;
        Instruction<Object> instruction3 = null;
        for (Instruction<Object> instruction4 : instruction) {
            if (CheckInstructionKt.getCheckWeatherInstruction().invoke(instruction4).booleanValue()) {
                instruction2 = instruction4;
            }
            if (CheckInstructionKt.getCheckSpeechSynthesizerInstruction().invoke(instruction4).booleanValue()) {
                instruction3 = instruction4;
            }
            if (instruction2 != null && instruction3 != null) {
                a(instruction3, instruction2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : instruction) {
                    if (!CheckInstructionKt.getCheckWeatherInstruction().invoke((Instruction) obj).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return instruction;
    }
}
