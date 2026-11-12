package com.huami.ai.speech.alexa.entity.payload;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.avs.AVSAPIConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.ai.speech.alexa.directive.AlexaCommander;
import com.huami.ai.speech.alexa.entity.Header;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/PayloadFactory;", "", "<init>", "()V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class PayloadFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Gson> a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\f\u0018\u00012\u0006\u0010\r\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0002R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/PayloadFactory$Companion;", "", "", "name", "payload", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", GoogleApiAvailabilityLight.a, "e", "a", "f", "c", "b", ExifInterface.GPS_DIRECTION_TRUE, "value", "g", "(Ljava/lang/String;)Ljava/lang/Object;", "namespace", "", "i", "Lcom/huami/ai/speech/alexa/entity/Header;", "header", "createPayloadByHeader", "Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "h", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final Payload a(String name, String payload) throws UnsupportedPayloadException {
            switch (name.hashCode()) {
                case -1620484612:
                    if (name.equals("SetVolume")) {
                        return (Payload) h().fromJson(payload, new TypeToken<VolumePayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createAlertsPayload$$inlined$fromJson$4
                        }.getType());
                    }
                    break;
                case -1118815166:
                    if (name.equals("DeleteAlerts")) {
                        return (Payload) h().fromJson(payload, new TypeToken<TokensPayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createAlertsPayload$$inlined$fromJson$3
                        }.getType());
                    }
                    break;
                case 518098513:
                    if (name.equals(AVSAPIConstants.Alerts.Directives.DeleteAlert.NAME)) {
                        return (Payload) h().fromJson(payload, new TypeToken<TokenPayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createAlertsPayload$$inlined$fromJson$2
                        }.getType());
                    }
                    break;
                case 1118451625:
                    if (name.equals(AVSAPIConstants.Speaker.Directives.AdjustVolume.NAME)) {
                        return (Payload) h().fromJson(payload, new TypeToken<VolumePayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createAlertsPayload$$inlined$fromJson$5
                        }.getType());
                    }
                    break;
                case 1452256826:
                    if (name.equals(AVSAPIConstants.Alerts.Directives.SetAlert.NAME)) {
                        return (Payload) h().fromJson(payload, new TypeToken<SetAlertPayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createAlertsPayload$$inlined$fromJson$1
                        }.getType());
                    }
                    break;
            }
            i("Alerts", name);
            throw new KotlinNothingValueException();
        }

        private final Payload b(String name, String payload) throws UnsupportedPayloadException {
            if (Intrinsics.areEqual(name, "Play")) {
                return (Payload) h().fromJson(payload, new TypeToken<PlayPayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createAudioPlayerPayload$$inlined$fromJson$1
                }.getType());
            }
            i(AlexaCommander.AudioPlayer.getNamespace(), name);
            throw new KotlinNothingValueException();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
        
            if (r1.equals("BodyTemplate1") != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        
            return (com.huami.ai.speech.alexa.entity.payload.Payload) h().fromJson(r4, new com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createRenderTemplatePayload$$inlined$fromJson$2().getType());
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
        
            if (r1.equals("BodyTemplate2") != false) goto L13;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Payload c(String payload) throws UnsupportedPayloadException {
            BaseTemplateRuntimePayload baseTemplateRuntimePayload = (BaseTemplateRuntimePayload) h().fromJson(payload, new TypeToken<BaseTemplateRuntimePayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createRenderTemplatePayload$$inlined$fromJson$1
            }.getType());
            String type = baseTemplateRuntimePayload.getType();
            switch (type.hashCode()) {
                case 463924334:
                    if (type.equals("WeatherTemplate")) {
                        return (Payload) h().fromJson(payload, new TypeToken<WeatherTemplatePayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createRenderTemplatePayload$$inlined$fromJson$4
                        }.getType());
                    }
                    i(AlexaCommander.TemplateRuntime.getNamespace(), Intrinsics.stringPlus("type:", baseTemplateRuntimePayload.getType()));
                    throw new KotlinNothingValueException();
                case 1634438997:
                    break;
                case 1634438998:
                    break;
                case 2018980825:
                    if (type.equals("ListTemplate1")) {
                        return (Payload) h().fromJson(payload, new TypeToken<ListTemplatePayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createRenderTemplatePayload$$inlined$fromJson$3
                        }.getType());
                    }
                    i(AlexaCommander.TemplateRuntime.getNamespace(), Intrinsics.stringPlus("type:", baseTemplateRuntimePayload.getType()));
                    throw new KotlinNothingValueException();
                default:
                    i(AlexaCommander.TemplateRuntime.getNamespace(), Intrinsics.stringPlus("type:", baseTemplateRuntimePayload.getType()));
                    throw new KotlinNothingValueException();
            }
        }

        private final Payload d(String name, String payload) throws UnsupportedPayloadException {
            if (Intrinsics.areEqual(name, AVSAPIConstants.SpeechRecognizer.Directives.StopCapture.NAME)) {
                return new EmptyPayload();
            }
            if (Intrinsics.areEqual(name, AVSAPIConstants.SpeechRecognizer.Directives.ExpectSpeech.NAME)) {
                return (Payload) h().fromJson(payload, new TypeToken<ExpectSpeechPayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createSpeechRecognizerPayload$$inlined$fromJson$1
                }.getType());
            }
            i("SpeechRecognizer", name);
            throw new KotlinNothingValueException();
        }

        private final Payload e(String name, String payload) throws UnsupportedPayloadException {
            if (Intrinsics.areEqual(name, AVSAPIConstants.SpeechSynthesizer.Directives.Speak.NAME)) {
                return (Payload) h().fromJson(payload, new TypeToken<SpeakPayload>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$createSpeechSynthesizerPayload$$inlined$fromJson$1
                }.getType());
            }
            i("SpeechSynthesizer", name);
            throw new KotlinNothingValueException();
        }

        private final Payload f(String name, String payload) throws UnsupportedPayloadException {
            if (Intrinsics.areEqual(name, AVSAPIConstants.TemplateRuntime.Directives.RenderTemplate.NAME)) {
                return c(payload);
            }
            i(AlexaCommander.TemplateRuntime.getNamespace(), name);
            throw new KotlinNothingValueException();
        }

        private final /* synthetic */ <T> T g(String value) {
            Gson gsonH = h();
            Intrinsics.needClassReification();
            return (T) gsonH.fromJson(value, new TypeToken<T>() { // from class: com.huami.ai.speech.alexa.entity.payload.PayloadFactory$Companion$fromJson$1
            }.getType());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Gson h() {
            return (Gson) PayloadFactory.a.getValue();
        }

        private final Void i(String namespace, String name) throws UnsupportedPayloadException {
            throw new UnsupportedPayloadException(namespace, name);
        }

        public static /* synthetic */ Void j(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.i(str, str2);
        }

        @NotNull
        public final Payload createPayloadByHeader(@NotNull Header header, @NotNull String payload) {
            String namespace = header.getNamespace();
            if (Intrinsics.areEqual(namespace, AlexaCommander.SpeechRecognizer.getNamespace())) {
                return d(header.getName(), payload);
            }
            if (Intrinsics.areEqual(namespace, AlexaCommander.SpeechSynthesizer.getNamespace())) {
                return e(header.getName(), payload);
            }
            if (Intrinsics.areEqual(namespace, AlexaCommander.Alerts.getNamespace())) {
                return a(header.getName(), payload);
            }
            if (Intrinsics.areEqual(namespace, AlexaCommander.TemplateRuntime.getNamespace())) {
                return f(header.getName(), payload);
            }
            if (Intrinsics.areEqual(namespace, AlexaCommander.AudioPlayer.getNamespace())) {
                return b(header.getName(), payload);
            }
            j(this, header.getNamespace(), null, 2, null);
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }
}
