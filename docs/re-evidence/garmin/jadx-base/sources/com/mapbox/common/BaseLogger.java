package com.mapbox.common;

import com.google.firebase.messaging.Constants;
import com.mapbox.base.common.logger.Logger;
import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import com.nimbusds.jose.HeaderParameterNames;
import o13.l;
import o13.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\tR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/BaseLogger;", "", "<init>", "()V", "", HeaderParameterNames.AUTHENTICATION_TAG, "message", "", "debug", "(Ljava/lang/String;Ljava/lang/String;)V", "info", "warning", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/mapbox/base/common/logger/Logger;", "loggerInstance$delegate", "Lo13/l;", "getLoggerInstance", "()Lcom/mapbox/base/common/logger/Logger;", "loggerInstance", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BaseLogger {
    public static final BaseLogger INSTANCE = new BaseLogger();

    /* JADX INFO: renamed from: loggerInstance$delegate, reason: from kotlin metadata */
    private static final l loggerInstance = m.b(BaseLogger$loggerInstance$2.INSTANCE);

    private BaseLogger() {
    }

    public static final void debug(String tag, String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.d$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }

    public static final void error(String tag, String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.e$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }

    private final Logger getLoggerInstance() {
        return (Logger) loggerInstance.getValue();
    }

    public static final void info(String tag, String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.i$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }

    public static final void warning(String tag, String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.w$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }
}
