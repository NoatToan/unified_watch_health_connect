package ju;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.b1;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIAudioPromptsExtension;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import i3.e5;
import iu.b;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import jt1.d;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import rs2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lju/a;", "Ldt2/a;", "Ldt2/h;", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements dt2.a, h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f100865c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f100866b;

    static {
        new C1942a(null);
    }

    public final void c(GDIAudioPromptsProto.AudioPromptsService audioPromptsService) {
        iu.c.f95001a.getClass();
        b bVarA = b.a(iu.c.a(audioPromptsService), "audioPrompts", d());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AudioPromptsProtobufRequestHandler", "enqueueForPlayback: " + bVarA);
        iu.a.f94990a.getClass();
        iu.a.f94991b.offer(bVarA);
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b bVarA2 = com.garmin.android.apps.connectmobile.audioprompts.b.a.a();
        long jD = d();
        c cVar = this.f100866b;
        bVarA2.getClass();
        bVarA2.c(null, audioPromptsService, jD, cVar);
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AudioPromptsProtobufRequestHandler", "close [connectionId: " + str + "]");
    }

    public final long d() {
        c cVar = this.f100866b;
        if (cVar != null) {
            return cVar.getF92746j();
        }
        return 0L;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        HashSet hashSet = new HashSet();
        hashSet.add(36);
        hashSet.add(37);
        hashSet.add(38);
        hashSet.add(39);
        hashSet.add(40);
        hashSet.add(41);
        hashSet.add(50);
        hashSet.add(101);
        return hashSet;
    }

    public final long l(hu.a aVar, lu.a aVar2) {
        if (hu.a.V(d(), aVar2)) {
            return hu.a.P(d(), aVar2).f114925c;
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0228  */
    /* JADX WARN: Code duplicated, block: B:60:0x025e  */
    /* JADX WARN: Code duplicated, block: B:62:0x026a  */
    /* JADX WARN: Code duplicated, block: B:63:0x027e  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x026a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x027e, please report this as an issue */
    public final void m(GDIAudioPromptsProto.AudioPromptsService audioPromptsService, k kVar) {
        Locale locale;
        Locale locale2;
        Locale locale3;
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        if (!((f12.b) obj).c()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "AudioPromptsProtobufRequestHandler", "Aborting. No user is currently signed in to GCM.");
            return;
        }
        if (audioPromptsService.hasAudioSettingsRequest()) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "AudioPromptsProtobufRequestHandler", "Received [audioSettingsRequest]");
            hu.a aVarA = hu.a.f85684b.a();
            long jD = d();
            lu.a aVar3 = lu.a.LAP;
            aVarA.getClass();
            boolean zV = hu.a.V(jD, aVar3);
            long jL = l(aVarA, lu.a.HEART_RATE);
            long jL2 = l(aVarA, lu.a.PACE_SPEED);
            GDIAudioPromptsProto.AudioSettingsResponse audioSettingsResponseBuild = GDIAudioPromptsProto.AudioSettingsResponse.newBuilder().setSpeakLaps(zV).setHrIntervalTime(jL).setSpeedIntervalTime(jL2).setPowerIntervalTime(l(aVarA, lu.a.POWER)).setSpeakNavigation(hu.a.V(d(), lu.a.NAVIGATION)).build();
            ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
            GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
            builderNewBuilder.getClass();
            GDIAudioPromptsProto.AudioPromptsService.Builder audioSettingsResponse = GDIAudioPromptsProto.AudioPromptsService.newBuilder().setAudioSettingsResponse(audioSettingsResponseBuild);
            audioSettingsResponse.getClass();
            GDISmartProto.Smart smartBuild = companion.setAudioPromptsService(builderNewBuilder, audioSettingsResponse).build();
            smartBuild.getClass();
            companion.sendResponse(smartBuild, kVar, new d(3, this, audioSettingsResponseBuild));
            return;
        }
        if (audioPromptsService.hasLapNotification()) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var3, "AudioPromptsProtobufRequestHandler", "Received [lapNotification]");
            c(audioPromptsService);
            return;
        }
        if (audioPromptsService.hasHeartRateNotification()) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var4, "AudioPromptsProtobufRequestHandler", "Received [heartRateNotification]");
            c(audioPromptsService);
            return;
        }
        if (audioPromptsService.hasPaceNotification()) {
            i2.a aVar6 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var5, "AudioPromptsProtobufRequestHandler", "Received [paceNotification]");
            c(audioPromptsService);
            return;
        }
        if (audioPromptsService.hasSpeedNotification()) {
            i2.a aVar7 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar7.getClass();
            i2.a.b(a2Var6, "AudioPromptsProtobufRequestHandler", "Received [speedNotification]");
            c(audioPromptsService);
            return;
        }
        if (audioPromptsService.hasPowerNotification()) {
            i2.a aVar8 = i2.f36769a;
            a2 a2Var7 = a2.GENERAL;
            aVar8.getClass();
            i2.a.b(a2Var7, "AudioPromptsProtobufRequestHandler", "Received [powerNotification]");
            c(audioPromptsService);
            return;
        }
        if (audioPromptsService.hasSpeechNotification()) {
            i2.a aVar9 = i2.f36769a;
            a2 a2Var8 = a2.GENERAL;
            aVar9.getClass();
            i2.a.b(a2Var8, "AudioPromptsProtobufRequestHandler", "Received [speechNotification]");
            c(audioPromptsService);
            return;
        }
        if (audioPromptsService.hasPhraseNotification()) {
            String str = "Received [phraseNotification] getPriority : " + audioPromptsService.getPhraseNotification().getPriority() + " getPhraseId: " + audioPromptsService.getPhraseNotification().getPhrasesList();
            i2.a aVar10 = i2.f36769a;
            a2 a2Var9 = a2.GENERAL;
            aVar10.getClass();
            i2.a.b(a2Var9, "AudioPromptsProtobufRequestHandler", str);
            c(audioPromptsService);
            return;
        }
        if (audioPromptsService.hasSupportedLanguagesRequest()) {
            i2.a aVar11 = i2.f36769a;
            a2 a2Var10 = a2.GENERAL;
            aVar11.getClass();
            i2.a.b(a2Var10, "AudioPromptsProtobufRequestHandler", "Received [supportedLanguagesRequest]");
            com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
            com.garmin.android.apps.connectmobile.audioprompts.b bVarA = com.garmin.android.apps.connectmobile.audioprompts.b.a.a();
            hc0.c cVar = new hc0.c(20, kVar, this);
            bVarA.getClass();
            bVarA.b(new df.d(24, bVarA, cVar));
            return;
        }
        if (audioPromptsService.hasSetLanguageRequest()) {
            i2.a aVar12 = i2.f36769a;
            a2 a2Var11 = a2.GENERAL;
            aVar12.getClass();
            i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Received [setLanguagesRequest]");
            GDIAudioPromptsProto.SetLanguageRequest setLanguageRequest = audioPromptsService.getSetLanguageRequest();
            setLanguageRequest.getClass();
            hy.d dVar = new hy.d(kVar, 11);
            if (!setLanguageRequest.hasLang()) {
                i2.a.f(a2Var11, "AudioPromptsProtobufRequestHandler", "Protobuf message is missing the language object.");
                dVar.f(Boolean.FALSE);
                return;
            }
            GDIAudioPromptsProto.Language lang = setLanguageRequest.getLang();
            String languageCode = lang.getLanguageCode();
            languageCode.getClass();
            Locale locale4 = Locale.ROOT;
            String upperCase = languageCode.toUpperCase(locale4);
            upperCase.getClass();
            String countryCode = lang.getCountryCode();
            countryCode.getClass();
            String upperCase2 = countryCode.toUpperCase(locale4);
            upperCase2.getClass();
            String strG = e5.g(upperCase, "_", upperCase2);
            i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "[setLanguagesRequest] language code from device: ".concat(strG));
            c cVar2 = this.f100866b;
            if (cVar2 != null) {
                gu.a aVar13 = gu.a.f79026a;
                int f92744h = cVar2.getF92744h();
                int f92745i = cVar2.getF92745i();
                aVar13.getClass();
                if (gu.a.a(f92744h, f92745i)) {
                    locale2 = Locale.getDefault();
                    i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with workaround phone default locale: " + locale2);
                } else {
                    zb0.a.f203414e.getClass();
                    if (TextUtils.isEmpty(strG) && zb0.a.AudioPromptsInvalid != zb0.a.C3799a.a(strG)) {
                        zb0.a aVarA2 = zb0.a.C3799a.a(strG);
                        aVarA2.getClass();
                        locale = new Locale(aVarA2.f203420c, aVarA2.f203421d);
                        i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with dialect locale: " + locale);
                    } else if (s.g(lang.getLanguageCode(), "tw")) {
                        locale2 = Locale.TRADITIONAL_CHINESE;
                        i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with legacy tw locale: " + locale2);
                    } else {
                        locale = new Locale(lang.getLanguageCode(), lang.getCountryCode());
                        i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with legacy locale: " + locale);
                    }
                    locale3 = locale;
                }
                locale3 = locale2;
            } else {
                zb0.a.f203414e.getClass();
                if (TextUtils.isEmpty(strG)) {
                    if (s.g(lang.getLanguageCode(), "tw")) {
                        locale2 = Locale.TRADITIONAL_CHINESE;
                        i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with legacy tw locale: " + locale2);
                        locale3 = locale2;
                    } else {
                        locale = new Locale(lang.getLanguageCode(), lang.getCountryCode());
                        i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with legacy locale: " + locale);
                    }
                } else if (s.g(lang.getLanguageCode(), "tw")) {
                    locale2 = Locale.TRADITIONAL_CHINESE;
                    i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with legacy tw locale: " + locale2);
                    locale3 = locale2;
                } else {
                    locale = new Locale(lang.getLanguageCode(), lang.getCountryCode());
                    i2.a.b(a2Var11, "AudioPromptsProtobufRequestHandler", "Handle [setLanguagesRequest] with legacy locale: " + locale);
                }
                locale3 = locale;
            }
            com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
            com.garmin.android.apps.connectmobile.audioprompts.b bVarA2 = com.garmin.android.apps.connectmobile.audioprompts.b.a.a();
            locale3.getClass();
            long jD2 = d();
            bVarA2.getClass();
            i2.a.b(a2.DEVICE_SERVICES, "AudioPromptsManager", "setLocale");
            bVarA2.b(new b1(bVarA2, dVar, locale3, jD2));
        }
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        synchronized (this) {
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAudioPromptsProto.AudioPromptsService> generatedExtension = GDIAudioPromptsExtension.audioPromptsService;
            if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return false;
            }
            Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
            extension.getClass();
            m((GDIAudioPromptsProto.AudioPromptsService) extension, kVar);
            return true;
        }
    }

    @Override // dt2.a
    public final void start(c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f100866b = cVar;
        extensionRegistryLite.add(GDIAudioPromptsExtension.audioPromptsService);
        ((dt2.d) gVar).f61154i.add(this);
    }

    /* JADX INFO: renamed from: ju.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lju/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PHRASE_NOTIFICATION_IDENTIFIER", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1942a {
        public /* synthetic */ C1942a(j jVar) {
            this();
        }

        private C1942a() {
        }
    }
}
