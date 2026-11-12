package com.xiaomi.fitness.sport_eco.view.lockscreen.entity;

import android.telephony.PhoneStateListener;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/lockscreen/entity/PhoneListener;", "Landroid/telephony/PhoneStateListener;", "<init>", "()V", "onCallStateChanged", "", "state", "", TSMAuthContants.PARAM_PHONE_NUMBER, "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneListener extends PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int state, @Nullable String phoneNumber) {
        if (state == 0) {
            SportDataInstance.INSTANCE.setRunLockScreen(true);
        } else if (state == 1 || state == 2) {
            SportDataInstance.INSTANCE.setRunLockScreen(false);
        }
    }
}
