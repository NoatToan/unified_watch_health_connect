package com.mapbox.common.logger;

import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.mapbox.base.common.logger.Logger;
import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import com.nimbusds.jose.HeaderParameterNames;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.a;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0018J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u001aJ+\u0010\u0016\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001aJ+\u0010\u001c\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001aJ+\u0010\u001d\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001aJ+\u0010\u001e\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u001aJ+\u0010\u001f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R(\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0003\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*¨\u0006+"}, d2 = {"Lcom/mapbox/common/logger/MapboxLogger;", "Lcom/mapbox/base/common/logger/Logger;", "<init>", "()V", "", "requiredLogLevel", "", HeaderParameterNames.AUTHENTICATION_TAG, "msg", "", "tr", "Lkotlin/Function0;", "", "logBlock", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Le23/a;)V", "Lcom/mapbox/common/logger/LoggerObserver;", "observer", "setObserver", "(Lcom/mapbox/common/logger/LoggerObserver;)V", "removeObserver", "Lcom/mapbox/base/common/logger/model/Message;", "v", "(Lcom/mapbox/base/common/logger/model/Message;)V", "(Lcom/mapbox/base/common/logger/model/Message;Ljava/lang/Throwable;)V", "Lcom/mapbox/base/common/logger/model/Tag;", "(Lcom/mapbox/base/common/logger/model/Tag;Lcom/mapbox/base/common/logger/model/Message;)V", "(Lcom/mapbox/base/common/logger/model/Tag;Lcom/mapbox/base/common/logger/model/Message;Ljava/lang/Throwable;)V", "d", IntegerTokenConverter.CONVERTER_KEY, "w", JWKParameterNames.RSA_EXPONENT, "DEFAULT_TAG", "Ljava/lang/String;", "logLevel", "I", "getLogLevel", "()I", "setLogLevel", "(I)V", "getLogLevel$annotations", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "liblogger_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxLogger implements Logger {
    private static final String DEFAULT_TAG = "MapboxLogger";
    public static final MapboxLogger INSTANCE = new MapboxLogger();
    private static volatile int logLevel = 2;
    private static final AtomicReference<LoggerObserver> observer = new AtomicReference<>();

    private MapboxLogger() {
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    private final void log(int requiredLogLevel, String tag, String msg, Throwable tr3, a<Unit> logBlock) {
        if (logLevel <= requiredLogLevel) {
            logBlock.invoke();
            LoggerObserver loggerObserver = observer.get();
            if (loggerObserver != null) {
                loggerObserver.log(requiredLogLevel, new LogEntry(tag, msg, tr3));
            }
        }
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void d(Tag tag, Message msg, Throwable tr3) {
        msg.getClass();
        log(3, tag != null ? tag.getTag() : null, msg.getMessage(), tr3, new AnonymousClass1(tag, msg, tr3));
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void e(Tag tag, Message msg, Throwable tr3) {
        msg.getClass();
        log(6, tag != null ? tag.getTag() : null, msg.getMessage(), tr3, new C39531(tag, msg, tr3));
    }

    public final int getLogLevel() {
        return logLevel;
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void i(Tag tag, Message msg, Throwable tr3) {
        msg.getClass();
        log(4, tag != null ? tag.getTag() : null, msg.getMessage(), tr3, new C39541(tag, msg, tr3));
    }

    public final void removeObserver() {
        observer.set(null);
    }

    public final void setLogLevel(int i14) {
        logLevel = i14;
    }

    public final void setObserver(LoggerObserver observer2) {
        observer2.getClass();
        observer.set(observer2);
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void v(Tag tag, Message msg, Throwable tr3) {
        msg.getClass();
        log(2, tag != null ? tag.getTag() : null, msg.getMessage(), tr3, new C39551(tag, msg, tr3));
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void w(Tag tag, Message msg, Throwable tr3) {
        msg.getClass();
        log(5, tag != null ? tag.getTag() : null, msg.getMessage(), tr3, new C39561(tag, msg, tr3));
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$d$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements a<Unit> {
        final /* synthetic */ Message $msg;
        final /* synthetic */ Tag $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Tag tag, Message message, Throwable th3) {
            super(0);
            this.$tag = tag;
            this.$msg = message;
            this.$tr = th3;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Tag tag = this.$tag;
            if (tag != null) {
                tag.getTag();
            }
            this.$msg.getMessage();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$e$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39531 extends w implements a<Unit> {
        final /* synthetic */ Message $msg;
        final /* synthetic */ Tag $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39531(Tag tag, Message message, Throwable th3) {
            super(0);
            this.$tag = tag;
            this.$msg = message;
            this.$tr = th3;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Tag tag = this.$tag;
            if (tag != null) {
                tag.getTag();
            }
            this.$msg.getMessage();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$i$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39541 extends w implements a<Unit> {
        final /* synthetic */ Message $msg;
        final /* synthetic */ Tag $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39541(Tag tag, Message message, Throwable th3) {
            super(0);
            this.$tag = tag;
            this.$msg = message;
            this.$tr = th3;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Tag tag = this.$tag;
            if (tag != null) {
                tag.getTag();
            }
            this.$msg.getMessage();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$v$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39551 extends w implements a<Unit> {
        final /* synthetic */ Message $msg;
        final /* synthetic */ Tag $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39551(Tag tag, Message message, Throwable th3) {
            super(0);
            this.$tag = tag;
            this.$msg = message;
            this.$tr = th3;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Tag tag = this.$tag;
            if (tag != null) {
                tag.getTag();
            }
            this.$msg.getMessage();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$w$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39561 extends w implements a<Unit> {
        final /* synthetic */ Message $msg;
        final /* synthetic */ Tag $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39561(Tag tag, Message message, Throwable th3) {
            super(0);
            this.$tag = tag;
            this.$msg = message;
            this.$tr = th3;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Tag tag = this.$tag;
            if (tag != null) {
                tag.getTag();
            }
            this.$msg.getMessage();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final void d(Message msg, Throwable tr3) {
        msg.getClass();
        tr3.getClass();
        d(null, msg, tr3);
    }

    public final void e(Message msg, Throwable tr3) {
        msg.getClass();
        tr3.getClass();
        e(null, msg, tr3);
    }

    public final void i(Message msg, Throwable tr3) {
        msg.getClass();
        tr3.getClass();
        i(null, msg, tr3);
    }

    public final void v(Message msg, Throwable tr3) {
        msg.getClass();
        tr3.getClass();
        v(null, msg, tr3);
    }

    public final void w(Message msg, Throwable tr3) {
        msg.getClass();
        tr3.getClass();
        w(null, msg, tr3);
    }

    public final void d(Tag tag, Message msg) {
        tag.getClass();
        msg.getClass();
        d(tag, msg, null);
    }

    public final void e(Tag tag, Message msg) {
        tag.getClass();
        msg.getClass();
        e(tag, msg, null);
    }

    public final void i(Tag tag, Message msg) {
        tag.getClass();
        msg.getClass();
        i(tag, msg, null);
    }

    public final void v(Tag tag, Message msg) {
        tag.getClass();
        msg.getClass();
        v(tag, msg, null);
    }

    public final void w(Tag tag, Message msg) {
        tag.getClass();
        msg.getClass();
        w(tag, msg, null);
    }

    public final void d(Message msg) {
        msg.getClass();
        d(null, msg, null);
    }

    public final void e(Message msg) {
        msg.getClass();
        e(null, msg, null);
    }

    public final void i(Message msg) {
        msg.getClass();
        i(null, msg, null);
    }

    public final void v(Message msg) {
        msg.getClass();
        v(null, msg, null);
    }

    public final void w(Message msg) {
        msg.getClass();
        w(null, msg, null);
    }
}
