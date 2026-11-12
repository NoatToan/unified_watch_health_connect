package com.xiaomi.hm.health.nfc;

import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatusListener;", "Lcom/xiaomi/hm/health/nfc/INfcStatusListener;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", "status", "", "a", "", "onStatus", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NfcStatusListener implements INfcStatusListener {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMNFCStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMNFCStatus hMNFCStatus) {
            super(0);
            this.a = hMNFCStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onStatusChanged = " + this.a;
        }
    }

    private final boolean a(HMNFCStatus status) {
        return status.getStatus() == 1 || status.getStatus() == 37;
    }

    @Override // com.xiaomi.hm.health.nfc.INfcStatusListener
    public void onStatus(@NotNull HMNFCStatus status) {
        HMLog.error$default("NfcStatusListener", null, null, new a(status), 6, null);
        if (a(status)) {
            NfcStatusTipActivity.INSTANCE.launch(BraceletApp.getContext().getString(R.string.nfc_status_tips));
        }
    }
}
