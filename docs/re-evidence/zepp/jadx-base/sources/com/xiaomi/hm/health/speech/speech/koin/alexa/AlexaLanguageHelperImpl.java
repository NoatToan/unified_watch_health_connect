package com.xiaomi.hm.health.speech.speech.koin.alexa;

import android.content.Context;
import android.content.Intent;
import com.huami.ai.speech.alexa.uitls.AlexaLanguage;
import com.huami.ai.speech.alexa.uitls.AlexaSupportUtilsKt;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.third.alexa.AlexaLanguageHelper;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/speech/speech/koin/alexa/AlexaLanguageHelperImpl;", "Lcom/huami/third/alexa/AlexaLanguageHelper;", "Lorg/koin/core/component/KoinComponent;", "", "currentAlexaLanguage", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "goToSelectAlexaLanguage", "Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;", "a", "Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;", "alexaLanguageRepo", "", "getShowSelectLanguage", "()Z", "showSelectLanguage", "<init>", "(Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlexaLanguageHelperImpl implements AlexaLanguageHelper, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaLanguageRepo alexaLanguageRepo;

    public AlexaLanguageHelperImpl(@NotNull AlexaLanguageRepo alexaLanguageRepo) {
        this.alexaLanguageRepo = alexaLanguageRepo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.third.alexa.AlexaLanguageHelper
    @NotNull
    public String currentAlexaLanguage() {
        String languageName;
        AlexaLanguage alexaLanguage = null;
        if (ConfigHelperKt.hasFeature(Feature.ZEPP_OS_DEVICE, ((DeviceManagerApi) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), null, null)).getBoundDeviceSource(HMDeviceType.MILI))) {
            this.alexaLanguageRepo.cleanCache();
        }
        String strCurrentAlexaLanguage = this.alexaLanguageRepo.currentAlexaLanguage();
        AlexaLanguage[] allAlexaLanguage = AlexaSupportUtilsKt.getAllAlexaLanguage();
        int i = 0;
        int length = allAlexaLanguage.length;
        while (i < length) {
            AlexaLanguage alexaLanguage2 = allAlexaLanguage[i];
            i++;
            if (Intrinsics.areEqual(alexaLanguage2.getLanguageCode(), strCurrentAlexaLanguage)) {
                alexaLanguage = alexaLanguage2;
                break;
            }
        }
        return (alexaLanguage == null || (languageName = alexaLanguage.getLanguageName()) == null) ? "" : languageName;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.third.alexa.AlexaLanguageHelper
    public boolean getShowSelectLanguage() {
        return AlexaLanguageUtilsKt.supportAlexaMultilingual();
    }

    @Override // com.huami.third.alexa.AlexaLanguageHelper
    public void goToSelectAlexaLanguage(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) AlexaLanguageSettingActivity.class));
    }
}
