package com.huami.ai.speech.alexa.filter;

import com.amap.api.mapcore.util.hl;
import com.amazon.alexa.avs.AVSAPIConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.speech.alexa.capability.alerts.AlertDirectName;
import com.huami.ai.speech.alexa.directive.AlexaCommander;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.BodyTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.ListTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SetAlertPayload;
import com.huami.ai.speech.alexa.entity.payload.TokenPayload;
import com.huami.ai.speech.alexa.entity.payload.WeatherTemplatePayload;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\":\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\":\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\":\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n\":\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\":\u0010\u0017\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n\":\u0010\u001a\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\n\":\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\n\":\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\n\":\u0010#\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\"\u0010\n\":\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b%\u0010\n\":\u0010)\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b(\u0010\n\":\u0010,\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b+\u0010\n\":\u0010/\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\n\":\u00102\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b1\u0010\n\":\u00105\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00008\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b4\u0010\n¨\u00066"}, d2 = {"Lkotlin/Function1;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "Lkotlin/ParameterName;", "name", "directive", "", "a", "Lkotlin/jvm/functions/Function1;", "getCheckAlerts", "()Lkotlin/jvm/functions/Function1;", "checkAlerts", "b", "getCheckAlertsAndNotSetTimer", "checkAlertsAndNotSetTimer", "c", "getCheckAlertsAndNotSetTimerNotDeleteAlarm", "checkAlertsAndNotSetTimerNotDeleteAlarm", GoogleApiAvailabilityLight.a, "getCheckSetAlarm", "checkSetAlarm", "e", "getCheckSetTimer", "checkSetTimer", "f", "getCheckSetAlert", "checkSetAlert", "g", "getCheckSpeechSynthesizer", "checkSpeechSynthesizer", "h", "getCheckWeather", "checkWeather", "i", "getCheckListTemplate", "checkListTemplate", z.j, "getCheckBodyTemplate", "checkBodyTemplate", hl.k, "getCheckWikipediaBodyTemplate", "checkWikipediaBodyTemplate", "l", "getCheckReminder", "checkReminder", "m", "getCheckStopCapture", "checkStopCapture", GoogleApiAvailabilityLight.b, "getCheckExpectSpeech", "checkExpectSpeech", "o", "getCheckAudioPlay", "checkAudioPlay", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class DirectiveCheckKt {

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> a = a.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> b = b.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> c = c.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> d = i.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> e = k.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> f = j.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> g = l.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> h = n.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> i = g.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> j = e.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> k = o.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> l = h.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> m = m.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> n = f.a;

    @NotNull
    private static final Function1<DirectiveContent<Payload>, Boolean> o = d.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.Alerts.getNamespace());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return DirectiveCheckKt.getCheckAlerts().invoke(directiveContent).booleanValue() && !DirectiveCheckKt.getCheckSetTimer().invoke(directiveContent).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return DirectiveCheckKt.getCheckAlertsAndNotSetTimer().invoke(directiveContent).booleanValue() && !(Intrinsics.areEqual(directiveContent.getHeader().getName(), AlertDirectName.DELETE_ALERT.getDirect()) && StringsKt__StringsKt.contains((CharSequence) ((TokenPayload) directiveContent.getPayload()).getToken(), (CharSequence) "Alarms", true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.AudioPlayer.getNamespace());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.TemplateRuntime.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.TemplateRuntime.Directives.RenderTemplate.NAME) && (directiveContent.getPayload() instanceof BodyTemplatePayload);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.SpeechRecognizer.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.SpeechRecognizer.Directives.ExpectSpeech.NAME);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.TemplateRuntime.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.TemplateRuntime.Directives.RenderTemplate.NAME) && (directiveContent.getPayload() instanceof ListTemplatePayload);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.Alerts.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.Alerts.Directives.SetAlert.NAME) && Intrinsics.areEqual(((SetAlertPayload) directiveContent.getPayload()).getType(), "REMINDER");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.Alerts.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.Alerts.Directives.SetAlert.NAME) && Intrinsics.areEqual(((SetAlertPayload) directiveContent.getPayload()).getType(), "ALARM");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.Alerts.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.Alerts.Directives.SetAlert.NAME);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.Alerts.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.Alerts.Directives.SetAlert.NAME) && Intrinsics.areEqual(((SetAlertPayload) directiveContent.getPayload()).getType(), "TIMER");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.SpeechSynthesizer.getNamespace());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.SpeechRecognizer.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.SpeechRecognizer.Directives.StopCapture.NAME);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final n a = new n();

        public n() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return Intrinsics.areEqual(directiveContent.getHeader().getNamespace(), AlexaCommander.TemplateRuntime.getNamespace()) && Intrinsics.areEqual(directiveContent.getHeader().getName(), AVSAPIConstants.TemplateRuntime.Directives.RenderTemplate.NAME) && (directiveContent.getPayload() instanceof WeatherTemplatePayload);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<DirectiveContent<Payload>, Boolean> {
        public static final o a = new o();

        public o() {
            super(1);
        }

        public final boolean a(@NotNull DirectiveContent<Payload> directiveContent) {
            return DirectiveCheckKt.getCheckBodyTemplate().invoke(directiveContent).booleanValue() && Intrinsics.areEqual(((BodyTemplatePayload) directiveContent.getPayload()).getTitle().getSubTitle(), "Wikipedia");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(DirectiveContent<Payload> directiveContent) {
            return Boolean.valueOf(a(directiveContent));
        }
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckAlerts() {
        return a;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckAlertsAndNotSetTimer() {
        return b;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckAlertsAndNotSetTimerNotDeleteAlarm() {
        return c;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckAudioPlay() {
        return o;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckBodyTemplate() {
        return j;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckExpectSpeech() {
        return n;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckListTemplate() {
        return i;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckReminder() {
        return l;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckSetAlarm() {
        return d;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckSetAlert() {
        return f;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckSetTimer() {
        return e;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckSpeechSynthesizer() {
        return g;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckStopCapture() {
        return m;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckWeather() {
        return h;
    }

    @NotNull
    public static final Function1<DirectiveContent<Payload>, Boolean> getCheckWikipediaBodyTemplate() {
        return k;
    }
}
