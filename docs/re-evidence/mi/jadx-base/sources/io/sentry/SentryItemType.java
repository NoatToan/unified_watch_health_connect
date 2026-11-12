package io.sentry;

import com.google.android.gms.common.Scopes;
import com.mibi.sdk.common.CommonConstants;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public enum SentryItemType implements cud {
    Session(CommonConstants.KEY_SESSION),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Statsd("statsd"),
    Feedback("feedback"),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements fsd<SentryItemType> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SentryItemType a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            return SentryItemType.valueOfLabel(f4hVar.nextString().toLowerCase(Locale.ROOT));
        }
    }

    SentryItemType(String str) {
        this.itemType = str;
    }

    public static SentryItemType resolve(Object obj) {
        if (obj instanceof s) {
            return Event;
        }
        if (obj instanceof io.sentry.protocol.w) {
            return Transaction;
        }
        if (obj instanceof Session) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    @NotNull
    public static SentryItemType valueOfLabel(String str) {
        for (SentryItemType sentryItemType : values()) {
            if (sentryItemType.itemType.equals(str)) {
                return sentryItemType;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.c(this.itemType);
    }
}
