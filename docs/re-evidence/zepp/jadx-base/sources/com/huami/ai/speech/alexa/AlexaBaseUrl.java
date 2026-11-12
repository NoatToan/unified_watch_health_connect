package com.huami.ai.speech.alexa;

import com.huami.ai.speech.alexa.uitls.AlexaSupportUtilsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaBaseUrl;", "", "", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Asia", "Europe", "NorthAmerica", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public enum AlexaBaseUrl {
    Asia("https://alexa.fe.gateway.devices.a2z.com"),
    Europe("https://alexa.eu.gateway.devices.a2z.com"),
    NorthAmerica("https://alexa.na.gateway.devices.a2z.com");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String baseUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaBaseUrl$Companion;", "", "", "baseUrl", "Lcom/huami/ai/speech/alexa/AlexaBaseUrl;", "from", "countryCode", "getEndPoint", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x001c  */
        @JvmStatic
        @NotNull
        public final AlexaBaseUrl from(@NotNull String baseUrl) {
            for (AlexaBaseUrl alexaBaseUrl : AlexaBaseUrl.values()) {
                if (Intrinsics.areEqual(alexaBaseUrl.getBaseUrl(), baseUrl)) {
                    if (alexaBaseUrl != null) {
                        return alexaBaseUrl;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("No AlexaBaseUrl with value: ", baseUrl).toString());
                }
            }
            alexaBaseUrl = null;
            if (alexaBaseUrl != null) {
                return alexaBaseUrl;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("No AlexaBaseUrl with value: ", baseUrl).toString());
        }

        @NotNull
        public final AlexaBaseUrl getEndPoint(@NotNull String countryCode) {
            if (!AlexaSupportUtilsKt.isCountrySupportAlexa(countryCode)) {
                throw new RuntimeException("alexa region not support");
            }
            String upperCase = countryCode.toUpperCase(Locale.US);
            if (ArraysKt___ArraysKt.contains(AlexaSupportUtilsKt.getASIA_COUNTRY(), upperCase)) {
                return AlexaBaseUrl.Asia;
            }
            if (ArraysKt___ArraysKt.contains(AlexaSupportUtilsKt.getEU_COUNTRY(), upperCase)) {
                return AlexaBaseUrl.Europe;
            }
            if (ArraysKt___ArraysKt.contains(AlexaSupportUtilsKt.getNA_COUNTRY(), upperCase)) {
                return AlexaBaseUrl.NorthAmerica;
            }
            throw new RuntimeException("alexa region not support");
        }
    }

    AlexaBaseUrl(String str) {
        this.baseUrl = str;
    }

    @JvmStatic
    @NotNull
    public static final AlexaBaseUrl from(@NotNull String str) {
        return INSTANCE.from(str);
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }
}
