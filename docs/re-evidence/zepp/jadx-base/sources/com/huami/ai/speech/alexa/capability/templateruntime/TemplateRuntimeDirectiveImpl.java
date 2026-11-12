package com.huami.ai.speech.alexa.capability.templateruntime;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.entity.template.Image;
import com.huami.ai.entity.template.ImageSource;
import com.huami.ai.entity.template.ListTemplate;
import com.huami.ai.entity.template.ListTemplateItem;
import com.huami.ai.entity.template.Weather;
import com.huami.ai.entity.template.WeatherItem;
import com.huami.ai.helper.Locales;
import com.huami.ai.skill.ArticleSkill;
import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.skill.ListTemplateSkill;
import com.huami.ai.skill.WeatherSkill;
import com.huami.ai.speech.alexa.entity.payload.BodyTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.ListItem;
import com.huami.ai.speech.alexa.entity.payload.ListTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.WeatherForecast;
import com.huami.ai.speech.alexa.entity.payload.WeatherTemplatePayload;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001b\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirectiveImpl;", "Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirective;", "", "local", "dateString", "", "c", "", "year", GoogleApiAvailabilityLight.a, "Ljava/util/Locale;", "b", "", "Lcom/huami/ai/speech/alexa/entity/payload/ImageSource;", "sourceList", "Lcom/huami/ai/entity/template/ImageSource;", "a", "Lcom/huami/ai/speech/alexa/entity/payload/BodyTemplatePayload;", "bodyTemplatePayload", "", "renderBodyTemplate", "Lcom/huami/ai/speech/alexa/entity/payload/ListTemplatePayload;", "listTemplatePayload", "renderListTemplate", "Lcom/huami/ai/speech/alexa/entity/payload/WeatherTemplatePayload;", "weatherTemplatePayload", "renderWeatherTemplate", "(Lcom/huami/ai/speech/alexa/entity/payload/WeatherTemplatePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LogUtil.I, BehaviorTaggingWebApi.g.g, "Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirectiveImpl$TemplateSkills;", "Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirectiveImpl$TemplateSkills;", "templateSkills", "Lcom/huami/ai/helper/Locales;", "Lcom/huami/ai/helper/Locales;", "locales", "<init>", "(ILcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirectiveImpl$TemplateSkills;Lcom/huami/ai/helper/Locales;)V", "TemplateSkills", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class TemplateRuntimeDirectiveImpl implements TemplateRuntimeDirective {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int protocolVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TemplateSkills templateSkills;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Locales locales;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirectiveImpl$TemplateSkills;", "", "Lcom/huami/ai/skill/WeatherSkill;", "a", "Lcom/huami/ai/skill/WeatherSkill;", "getWeatherSkill", "()Lcom/huami/ai/skill/WeatherSkill;", "weatherSkill", "Lcom/huami/ai/skill/ListTemplateSkill;", "b", "Lcom/huami/ai/skill/ListTemplateSkill;", "getListTemplateSkill", "()Lcom/huami/ai/skill/ListTemplateSkill;", "listTemplateSkill", "Lcom/huami/ai/skill/CaptionChannel;", "c", "Lcom/huami/ai/skill/CaptionChannel;", "getCaptionChannel", "()Lcom/huami/ai/skill/CaptionChannel;", "captionChannel", "Lcom/huami/ai/skill/ArticleSkill;", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/skill/ArticleSkill;", "getArticleSkill", "()Lcom/huami/ai/skill/ArticleSkill;", "articleSkill", "<init>", "(Lcom/huami/ai/skill/WeatherSkill;Lcom/huami/ai/skill/ListTemplateSkill;Lcom/huami/ai/skill/CaptionChannel;Lcom/huami/ai/skill/ArticleSkill;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class TemplateSkills {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeatherSkill weatherSkill;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ListTemplateSkill listTemplateSkill;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final CaptionChannel captionChannel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final ArticleSkill articleSkill;

        public TemplateSkills(@NotNull WeatherSkill weatherSkill, @NotNull ListTemplateSkill listTemplateSkill, @NotNull CaptionChannel captionChannel, @NotNull ArticleSkill articleSkill) {
            this.weatherSkill = weatherSkill;
            this.listTemplateSkill = listTemplateSkill;
            this.captionChannel = captionChannel;
            this.articleSkill = articleSkill;
        }

        @NotNull
        public final ArticleSkill getArticleSkill() {
            return this.articleSkill;
        }

        @NotNull
        public final CaptionChannel getCaptionChannel() {
            return this.captionChannel;
        }

        @NotNull
        public final ListTemplateSkill getListTemplateSkill() {
            return this.listTemplateSkill;
        }

        @NotNull
        public final WeatherSkill getWeatherSkill() {
            return this.weatherSkill;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "非Wikipedia，renderBodyTemplate未实现";
        }
    }

    public TemplateRuntimeDirectiveImpl(int i, @NotNull TemplateSkills templateSkills, @NotNull Locales locales) {
        this.protocolVersion = i;
        this.templateSkills = templateSkills;
        this.locales = locales;
    }

    private final List<ImageSource> a(List<com.huami.ai.speech.alexa.entity.payload.ImageSource> sourceList) {
        ArrayList arrayList = new ArrayList();
        for (com.huami.ai.speech.alexa.entity.payload.ImageSource imageSource : sourceList) {
            arrayList.add(new ImageSource(imageSource.getUrl(), imageSource.getDarkBackgroundUrl(), imageSource.getSize(), Long.valueOf(imageSource.getWidthPixels()), Long.valueOf(imageSource.getHeightPixels())));
        }
        return arrayList;
    }

    private final Locale b(String local) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) local, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
        return new Locale((String) listSplit$default.get(0), (String) listSplit$default.get(1));
    }

    private final long c(String local, String dateString) {
        try {
            Date date = DateFormat.getDateInstance(0, b(local)).parse(dateString);
            if (date == null) {
                return 0L;
            }
            return date.getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    private final long d(String local, String dateString, int year) {
        String str;
        switch (local) {
            case "de-DE":
                str = "dd. MMMM";
                break;
            case "en-AU":
            case "en-GB":
            case "en-IN":
            case "es-ES":
            case "es-MX":
            case "es-US":
            case "fr-CA":
            case "fr-FR":
            case "it-IT":
                str = "dd MMMMM";
                break;
            case "ja-JP":
                str = "MM月dd日";
                break;
            case "pt-BR":
                str = "d 'de' MMMM";
                break;
            default:
                str = "MMMM dd";
                break;
        }
        Date date = new SimpleDateFormat(str, b(local)).parse(dateString);
        if (date == null) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(1, year);
        return calendar.getTime().getTime();
    }

    @Override // com.huami.ai.speech.alexa.capability.templateruntime.TemplateRuntimeDirective
    public void renderBodyTemplate(@NotNull BodyTemplatePayload bodyTemplatePayload) {
        if (this.protocolVersion >= 3) {
            this.templateSkills.getArticleSkill().sendArticle(bodyTemplatePayload.getTitle().getMainTitle(), bodyTemplatePayload.getTitle().getSubTitle(), bodyTemplatePayload.getTextField());
        } else if (Intrinsics.areEqual(bodyTemplatePayload.getTitle().getSubTitle(), "Wikipedia")) {
            this.templateSkills.getCaptionChannel().showCaption(bodyTemplatePayload.getTextField());
        } else {
            HMLog.warn$default("speech", null, a.a, 2, null);
        }
    }

    @Override // com.huami.ai.speech.alexa.capability.templateruntime.TemplateRuntimeDirective
    public void renderListTemplate(@NotNull ListTemplatePayload listTemplatePayload) {
        ArrayList arrayList = new ArrayList();
        for (ListItem listItem : listTemplatePayload.getListItems()) {
            arrayList.add(new ListTemplateItem(listItem.getLeftTextField(), listItem.getRightTextField(), ""));
        }
        this.templateSkills.getListTemplateSkill().renderList(new ListTemplate(listTemplatePayload.getTitle().getMainTitle(), listTemplatePayload.getTitle().getSubTitle(), arrayList.size(), arrayList));
    }

    @Override // com.huami.ai.speech.alexa.capability.templateruntime.TemplateRuntimeDirective
    @Nullable
    public Object renderWeatherTemplate(@NotNull WeatherTemplatePayload weatherTemplatePayload, @NotNull Continuation<? super Unit> continuation) {
        ArrayList arrayList = new ArrayList();
        String str = this.locales.getLocales()[0];
        int i = Calendar.getInstance().get(1);
        arrayList.add(new WeatherItem(null, c(str, weatherTemplatePayload.getTitle().getSubTitle()), weatherTemplatePayload.getHighTemperature().getValue(), weatherTemplatePayload.getLowTemperature().getValue(), weatherTemplatePayload.getCurrentWeather(), weatherTemplatePayload.getDescription(), null, new Image(weatherTemplatePayload.getCurrentWeatherIcon().getContentDescription(), a(weatherTemplatePayload.getCurrentWeatherIcon().getSources())), weatherTemplatePayload.getTitle().getMainTitle(), weatherTemplatePayload.getTitle().getSubTitle(), 65, null));
        for (WeatherForecast weatherForecast : weatherTemplatePayload.getWeatherForecast()) {
            arrayList.add(new WeatherItem(null, d(str, weatherForecast.getDate(), i), weatherForecast.getHighTemperature(), weatherForecast.getLowTemperature(), null, null, null, new Image(weatherForecast.getImage().getContentDescription(), a(weatherForecast.getImage().getSources())), null, null, 881, null));
        }
        this.templateSkills.getWeatherSkill().weatherForecast(new Weather(arrayList));
        return Unit.INSTANCE;
    }
}
