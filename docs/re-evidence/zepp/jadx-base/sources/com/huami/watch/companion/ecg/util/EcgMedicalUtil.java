package com.huami.watch.companion.ecg.util;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0002R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgMedicalUtil;", "", "Landroid/content/Context;", "", "toHrv", "toStrength", "toRisk", "toAFib", "Lcom/huami/watch/companion/ecg/util/EcgMedicalService;", "ecgMedicalService", "Lcom/huami/watch/companion/ecg/util/EcgMedicalService;", "getEcgMedicalService", "()Lcom/huami/watch/companion/ecg/util/EcgMedicalService;", "setEcgMedicalService", "(Lcom/huami/watch/companion/ecg/util/EcgMedicalService;)V", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgMedicalUtil {

    @NotNull
    public static final EcgMedicalUtil INSTANCE = new EcgMedicalUtil();
    public static EcgMedicalService ecgMedicalService;

    private EcgMedicalUtil() {
    }

    @NotNull
    public final EcgMedicalService getEcgMedicalService() {
        EcgMedicalService ecgMedicalService2 = ecgMedicalService;
        if (ecgMedicalService2 != null) {
            return ecgMedicalService2;
        }
        return null;
    }

    public final void setEcgMedicalService(@NotNull EcgMedicalService ecgMedicalService2) {
        ecgMedicalService = ecgMedicalService2;
    }

    public final void toAFib(@NotNull Context context) {
        getEcgMedicalService().openWeb(context, EcgHelpType.Afib.INSTANCE.getNormalUrl());
    }

    public final void toHrv(@NotNull Context context) {
        getEcgMedicalService().openWeb(context, EcgHelpType.Hrv.INSTANCE.getNormalUrl());
    }

    public final void toRisk(@NotNull Context context) {
        getEcgMedicalService().openWeb(context, EcgHelpType.Risk.INSTANCE.getNormalUrl());
    }

    public final void toStrength(@NotNull Context context) {
        getEcgMedicalService().openWeb(context, EcgHelpType.Strength.INSTANCE.getNormalUrl());
    }
}
