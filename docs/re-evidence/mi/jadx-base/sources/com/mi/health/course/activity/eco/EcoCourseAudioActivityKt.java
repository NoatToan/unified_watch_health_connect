package com.mi.health.course.activity.eco;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.czi;
import defpackage.ku9;
import defpackage.u7r;
import defpackage.vr9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"startBikeAudio", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoCourseAudioActivityKt {
    public static final void startBikeAudio(@NotNull final Context context, @NotNull final Intent intent) {
        String did;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 29;
        u7rVar.B(new vr9());
        EcoDeviceContact ecoDeviceSyncExtKt = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
        if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
            did = "";
        }
        EcoDeviceContact.DefaultImpls.call$default(ecoDeviceSyncExtKt, did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseAudioActivityKt.startBikeAudio.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                ToastUtil.showShortToast(czi.course_device_busy);
                FitnessLogUtils.i("startBikeAudio", "GYM is not sport , code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                u7r packet = result != null ? result.getPacket() : null;
                if (packet == null || packet.e != 8) {
                    FitnessLogUtils.w("startBikeAudio", "wearPacket is null or no fitness response type");
                    return;
                }
                vr9 vr9VarR = packet.r();
                if (vr9VarR == null) {
                    FitnessLogUtils.w("startBikeAudio", "no fitness proto");
                    return;
                }
                ku9 ku9VarE = vr9VarR.E();
                if (ku9VarE == null) {
                    FitnessLogUtils.w("startBikeAudio", "no fitness sportStatus proto");
                    return;
                }
                boolean z = ku9VarE.h;
                int i = ku9VarE.c;
                int i2 = ku9VarE.e;
                if (!FitnessSportTypeUtils.INSTANCE.supportSport(i) || i2 == 0 || z) {
                    intent.setClass(context, EcoCourseAudioActivity.class);
                    context.startActivity(intent);
                } else {
                    FitnessLogUtils.i("startBikeAudio", "GYM is sporting ");
                    ToastUtil.showShortToast(czi.course_device_busy);
                }
            }
        }, 0, 16, null);
    }
}
