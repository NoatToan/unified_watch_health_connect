package com.huami.ai.speech.alexa.capability.alerts;

import com.amazon.alexa.avs.AVSAPIConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/alerts/AlertDirectName;", "", "", "direct", "Ljava/lang/String;", "getDirect", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "SET_ALERT", "DELETE_ALERT", "DELETE_ALERTS", "SET_VOLUME", "ADJUST_VOLUME", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public enum AlertDirectName {
    SET_ALERT(AVSAPIConstants.Alerts.Directives.SetAlert.NAME),
    DELETE_ALERT(AVSAPIConstants.Alerts.Directives.DeleteAlert.NAME),
    DELETE_ALERTS("DeleteAlerts"),
    SET_VOLUME("SetVolume"),
    ADJUST_VOLUME(AVSAPIConstants.Speaker.Directives.AdjustVolume.NAME);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String direct;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/alerts/AlertDirectName$Companion;", "", "", "direct", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertDirectName;", "fromName", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x001c  */
        @NotNull
        public final AlertDirectName fromName(@NotNull String direct) {
            for (AlertDirectName alertDirectName : AlertDirectName.values()) {
                if (Intrinsics.areEqual(alertDirectName.getDirect(), direct)) {
                    if (alertDirectName != null) {
                        return alertDirectName;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("非法的参数:", direct));
                }
            }
            alertDirectName = null;
            if (alertDirectName != null) {
                return alertDirectName;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("非法的参数:", direct));
        }
    }

    AlertDirectName(String str) {
        this.direct = str;
    }

    @NotNull
    public final String getDirect() {
        return this.direct;
    }
}
