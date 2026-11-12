package com.xiaomi.ai.api.local;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;

/* JADX INFO: loaded from: classes7.dex */
public class VehicleControl {

    @NamespaceName(name = "ConfirmCancelResult", namespace = "Internal")
    public static class ConfirmCancelResult implements EventPayload {

        @Required
        private boolean confirm;

        @Required
        public boolean isConfirm() {
            return this.confirm;
        }

        @Required
        public void setConfirm(boolean z) {
            this.confirm = z;
        }
    }
}
