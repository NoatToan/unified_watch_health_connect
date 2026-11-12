package com.huami.ai.speech.simplify.alexa.language;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.ai.helper.SpeechKeeper;
import com.huami.ai.speech.alexa.uitls.AlexaSupportUtilsKt;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.LanguageSetting;
import com.huami.bluetooth.profile.channel.module.voice.VoiceModule;
import com.huami.bluetooth.profile.channel.module.voice.content.VoiceVersion;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u001a\u0006\u0010\u0014\u001a\u00020\u0013\u001a\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u001a\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0002\u001a\u0006\u0010\u001a\u001a\u00020\u0019\u001a\b\u0010\u001b\u001a\u00020\u0019H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¨\u0006\u001f"}, d2 = {"", "countryCode", "", "deviceLanguage", "getAlexaDefaultLanguage", "a", "m", "h", GoogleApiAvailabilityLight.a, "e", "i", hl.k, "b", "g", z.j, "f", "l", "c", "getCurrentSavedAlexaLanguage", "", "clearSavedAlexaLanguage", "Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;", "getAlexaLanguageSettings", "languageIndex", "saveLanguageToLocal", "", "supportAlexaMultilingual", "supportAlexaMultilingualFromDevice", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", GoogleApiAvailabilityLight.b, "speech-simplify_release"}, k = 2, mv = {1, 5, 1})
public final class AlexaLanguageUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt$getAlexaLanguageSettings$1", f = "AlexaLanguageUtils.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LanguageSetting>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super LanguageSetting> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
                if (hMBaseDevice == null) {
                    return null;
                }
                this.a = 1;
                obj = DeviceUtilsKt.deviceAlexaLanguageSettings(hMBaseDevice, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (LanguageSetting) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("获取是否有语音助理版本号：", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取是否支持Alexa多语言，但是deviceInfo 为null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveLanguageToLocal,没有获取到绑定设备的deviceSource ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt$supportAlexaMultilingualFromDevice$1", f = "AlexaLanguageUtils.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ VoiceModule b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "获取是否支持Alexa多语言，但是获取语音助理版本号为null";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(VoiceModule voiceModule, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = voiceModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = this.b;
                this.a = 1;
                obj = voiceModule.getVersion(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            VoiceVersion voiceVersion = (VoiceVersion) obj;
            if (voiceVersion != null) {
                return Boxing.boxBoolean(voiceVersion.getSupportAlexaLanguageSettings());
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            boolBoxBoolean.booleanValue();
            HMLog.warn$default("speech", null, a.a, 2, null);
            return boolBoxBoolean;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取是否支持Alexa多语言，但是device为null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取是否支持Alexa多语言，但是获取VoiceModule为null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb A[ORIG_RETURN, RETURN] */
    private static final String a(String str) {
        if (str == null) {
            return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
        }
        switch (str.hashCode()) {
            case 2099:
                if (str.equals("AT")) {
                    return "de-DE";
                }
                return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
            case 2100:
                return !str.equals("AU") ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "en-AU";
            case 2128:
                return !str.equals(Country.BR) ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "pt-BR";
            case 2142:
                return !str.equals("CA") ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "en-CA";
            case 2177:
                if (str.equals("DE")) {
                    return "de-DE";
                }
                return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
            case 2222:
                return !str.equals("ES") ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "es-ES";
            case 2252:
                return !str.equals("FR") ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "fr-FR";
            case 2267:
                if (str.equals(SelectAreaManager.GB)) {
                    return "en-GB";
                }
                return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
            case 2332:
                if (str.equals("IE")) {
                    return "en-GB";
                }
                return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
            case 2341:
                return !str.equals("IN") ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "en-IN";
            case 2347:
                return !str.equals("IT") ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "it-IT";
            case 2374:
                return !str.equals("JP") ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "ja-JP";
            case 2475:
                return !str.equals(HTTP.MX) ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "es-MX";
            case 2508:
                if (str.equals(ToolKey.ALARM)) {
                    return "en-GB";
                }
                return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
            case 2718:
                str.equals("US");
                return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
            default:
                return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
        }
    }

    private static final String b(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 6) {
            return "fr-FR";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "en-AU" : "ja-JP";
        }
        return "it-IT";
    }

    private static final String c(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 6) {
            return "fr-FR";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "pt-BR" : "ja-JP";
        }
        return "it-IT";
    }

    public static final void clearSavedAlexaLanguage() {
        AlexaSaveLanguageProperty.INSTANCE.getSavedAlexaLanguage().set(null);
    }

    private static final String d(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 6) {
            return "fr-CA";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "en-CA" : "ja-JP";
        }
        return "it-IT";
    }

    private static final String e(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 6) {
            return "fr-FR";
        }
        if (i != 10) {
            return i != 11 ? "de-DE" : "ja-JP";
        }
        return "it-IT";
    }

    private static final String f(int i) {
        if (i == 6) {
            return "fr-FR";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "es-ES" : "ja-JP";
        }
        return "it-IT";
    }

    private static final String g(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "fr-FR" : "ja-JP";
        }
        return "it-IT";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r6.equals(com.xiaomi.hm.health.smalltool.model.ToolKey.ALARM) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        if (r6.equals("IE") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (r6.equals(com.huami.account.ui.areas.SelectAreaManager.GB) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
    
        if (r6.equals("DE") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (r6.equals("AT") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return e(r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getAlexaDefaultLanguage(@Nullable String str, int i) {
        if (!ArraysKt___ArraysKt.contains(new Integer[]{2, 3, 6, 7, 10, 11, 20}, Integer.valueOf(i))) {
            return a(str);
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 2099:
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        return b(i);
                    }
                    break;
                case 2128:
                    if (str.equals(Country.BR)) {
                        return c(i);
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        return d(i);
                    }
                    break;
                case 2177:
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        return f(i);
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        return g(i);
                    }
                    break;
                case 2267:
                    break;
                case 2332:
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        return i(i);
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        return j(i);
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        return k(i);
                    }
                    break;
                case 2475:
                    if (str.equals(HTTP.MX)) {
                        return l(i);
                    }
                    break;
                case 2508:
                    break;
                case 2718:
                    if (str.equals("US")) {
                        return m(i);
                    }
                    break;
            }
        }
        return AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE;
    }

    @Nullable
    public static final LanguageSetting getAlexaLanguageSettings() {
        return (LanguageSetting) kotlinx.coroutines.d.b(null, new a(null), 1, null);
    }

    @Nullable
    public static final String getCurrentSavedAlexaLanguage() {
        HMDeviceSource deviceSource;
        Object objM3845constructorimpl;
        Object next;
        Integer numValueOf;
        List<SavedAlexaDeviceLanguage> list = AlexaSaveLanguageProperty.INSTANCE.getSavedAlexaLanguage().get();
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        Integer numValueOf2 = (hMBaseDevice == null || (deviceSource = hMBaseDevice.getDeviceSource()) == null) ? null : Integer.valueOf(deviceSource.getValue());
        if (numValueOf2 == null) {
            return null;
        }
        if (numValueOf2.intValue() == HMDeviceSource.VDEVICE.getValue()) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(((SavedAlexaDeviceLanguage) next).getDeviceSource() == numValueOf2.intValue()));
                SavedAlexaDeviceLanguage savedAlexaDeviceLanguage = (SavedAlexaDeviceLanguage) next;
                numValueOf = savedAlexaDeviceLanguage == null ? null : Integer.valueOf(savedAlexaDeviceLanguage.getAlexaLanguageIndex());
            }
            if (numValueOf == null) {
                return null;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(AlexaSupportUtilsKt.getAllAlexaLanguage()[numValueOf.intValue() - 1].getLanguageCode());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private static final String h(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 6) {
            return "fr-FR";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "en-GB" : "ja-JP";
        }
        return "it-IT";
    }

    private static final String i(int i) {
        if (i == 2) {
            return "en-IN";
        }
        if (i == 3) {
            return "es-ES";
        }
        if (i == 6) {
            return "fr-FR";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "en-IN" : "ja-JP";
        }
        return "it-IT";
    }

    private static final String j(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 11) {
            return "ja-JP";
        }
        if (i != 6) {
            return i != 7 ? "it-IT" : "de-DE";
        }
        return "fr-FR";
    }

    private static final String k(int i) {
        if (i == 3) {
            return "es-ES";
        }
        if (i == 10) {
            return "it-IT";
        }
        if (i != 6) {
            return i != 7 ? "ja-JP" : "de-DE";
        }
        return "fr-FR";
    }

    private static final String l(int i) {
        if (i == 6) {
            return "fr-FR";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? "es-MX" : "ja-JP";
        }
        return "it-IT";
    }

    private static final String m(int i) {
        if (i == 3) {
            return "es-US";
        }
        if (i == 6) {
            return "fr-FR";
        }
        if (i == 7) {
            return "de-DE";
        }
        if (i != 10) {
            return i != 11 ? AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE : "ja-JP";
        }
        return "it-IT";
    }

    private static final boolean n(HMBaseDevice hMBaseDevice) {
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.warn$default("speech", null, c.a, 2, null);
            return false;
        }
        boolean zHasSw = deviceInfo.getDeviceFeature().hasSw(46);
        HMLog.warn$default("speech", null, new b(zHasSw), 2, null);
        return zHasSw;
    }

    public static final void saveLanguageToLocal(int i) {
        HMDeviceSource deviceSource;
        List<SavedAlexaDeviceLanguage> mutableList;
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        Integer numValueOf = (hMBaseDevice == null || (deviceSource = hMBaseDevice.getDeviceSource()) == null) ? null : Integer.valueOf(deviceSource.getValue());
        if (numValueOf == null || numValueOf.intValue() == HMDeviceSource.VDEVICE.getValue()) {
            HMLog.warn$default("speech", null, d.a, 2, null);
            return;
        }
        List<SavedAlexaDeviceLanguage> list = AlexaSaveLanguageProperty.INSTANCE.getSavedAlexaLanguage().get();
        SavedAlexaDeviceLanguage savedAlexaDeviceLanguage = new SavedAlexaDeviceLanguage(numValueOf.intValue(), i);
        if (list == null || list.isEmpty()) {
            mutableList = CollectionsKt__CollectionsKt.mutableListOf(savedAlexaDeviceLanguage);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((SavedAlexaDeviceLanguage) obj).getDeviceSource() == numValueOf.intValue())) {
                    arrayList.add(obj);
                }
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            mutableList.add(savedAlexaDeviceLanguage);
        }
        AlexaSaveLanguageProperty.INSTANCE.getSavedAlexaLanguage().set(mutableList);
    }

    public static final boolean supportAlexaMultilingual() {
        return SpeechKeeper.INSTANCE.supportAlexaMultilingualLocal();
    }

    public static final boolean supportAlexaMultilingualFromDevice() {
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        if (hMBaseDevice == null) {
            HMLog.warn$default("speech", null, f.a, 2, null);
            return false;
        }
        if (!n(hMBaseDevice) || !DeviceSpeechSupportFuncKt.featureSupportAlexa(hMBaseDevice)) {
            return false;
        }
        VoiceModule voiceModule = (VoiceModule) hMBaseDevice.getChannelModule(VoiceModule.class);
        if (voiceModule != null) {
            return ((Boolean) kotlinx.coroutines.d.b(null, new e(voiceModule, null), 1, null)).booleanValue();
        }
        HMLog.warn$default("speech", null, g.a, 2, null);
        return false;
    }
}
