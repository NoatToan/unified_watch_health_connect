package com.xiaomi.fitness.active.pk.net.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/InviteActionResultCode;", "", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public @interface InviteActionResultCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int INVITATION_REGION_LIMITED = 1011;
    public static final int INVITE_EXPIRED = 1003;
    public static final int INVITE_FROM_OWN = 1005;
    public static final int INVITE_HANDLED = 1009;
    public static final int INVITE_NOT_FOUND = 1004;
    public static final int INVITE_PROCESS = 1008;
    public static final int INVITE_SERVER_ERROR = 1007;
    public static final int OPP_UPPER_LIMIT = 1002;
    public static final int OWN_UPPER_LIMIT = 1001;
    public static final int SUCCESS = 1000;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/InviteActionResultCode$Companion;", "", "<init>", "()V", "SUCCESS", "", "OWN_UPPER_LIMIT", "OPP_UPPER_LIMIT", "INVITE_EXPIRED", "INVITE_NOT_FOUND", "INVITE_FROM_OWN", "INVITE_SERVER_ERROR", "INVITE_PROCESS", "INVITE_HANDLED", "INVITATION_REGION_LIMITED", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int INVITATION_REGION_LIMITED = 1011;
        public static final int INVITE_EXPIRED = 1003;
        public static final int INVITE_FROM_OWN = 1005;
        public static final int INVITE_HANDLED = 1009;
        public static final int INVITE_NOT_FOUND = 1004;
        public static final int INVITE_PROCESS = 1008;
        public static final int INVITE_SERVER_ERROR = 1007;
        public static final int OPP_UPPER_LIMIT = 1002;
        public static final int OWN_UPPER_LIMIT = 1001;
        public static final int SUCCESS = 1000;

        private Companion() {
        }
    }
}
