package com.huami.bluetooth.profile.channel.module.lumberjack.impl;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u000b\u0007\b\u0006\t\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "value", "<init>", "(I)V", "Companion", "CloseLogStream", "CloseLogStreamResult", AVSAPIConstants.System.Exception.NAME, "LogStream", "OpenLogStream", "OpenLogStreamResult", "Ping", "Pong", "QueryVersion", "VersionResult", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$OpenLogStream;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$OpenLogStreamResult;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$CloseLogStream;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$CloseLogStreamResult;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$LogStream;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$Ping;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$Pong;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$Exception;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class LaumberjackCommand extends Request.Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$CloseLogStream;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CloseLogStream extends LaumberjackCommand {

        @NotNull
        public static final CloseLogStream INSTANCE = new CloseLogStream();

        private CloseLogStream() {
            super(5, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$CloseLogStreamResult;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CloseLogStreamResult extends LaumberjackCommand {

        @NotNull
        public static final CloseLogStreamResult INSTANCE = new CloseLogStreamResult();

        private CloseLogStreamResult() {
            super(6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$Companion;", "", "", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "toCommand", "", "CMD_BYTES", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LaumberjackCommand toCommand(@NotNull byte[] bArr) {
            Object next;
            byte[] bArr2;
            Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new LaumberjackCommand[]{QueryVersion.INSTANCE, VersionResult.INSTANCE, OpenLogStream.INSTANCE, OpenLogStreamResult.INSTANCE, CloseLogStream.INSTANCE, CloseLogStreamResult.INSTANCE, LogStream.INSTANCE, Ping.INSTANCE, Pong.INSTANCE, Exception.INSTANCE}).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                bArr2 = ((LaumberjackCommand) next).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
            } while (!(bArr.length >= bArr2.length && Arrays.equals(bArr2, Arrays.copyOf(bArr, bArr2.length))));
            LaumberjackCommand laumberjackCommand = (LaumberjackCommand) next;
            if (laumberjackCommand != null) {
                return laumberjackCommand;
            }
            throw new RuntimeException("Unknown command!");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$Exception;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Exception extends LaumberjackCommand {

        @NotNull
        public static final Exception INSTANCE = new Exception();

        private Exception() {
            super(10, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$LogStream;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class LogStream extends LaumberjackCommand {

        @NotNull
        public static final LogStream INSTANCE = new LogStream();

        private LogStream() {
            super(7, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$OpenLogStream;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class OpenLogStream extends LaumberjackCommand {

        @NotNull
        public static final OpenLogStream INSTANCE = new OpenLogStream();

        private OpenLogStream() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$OpenLogStreamResult;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class OpenLogStreamResult extends LaumberjackCommand {

        @NotNull
        public static final OpenLogStreamResult INSTANCE = new OpenLogStreamResult();

        private OpenLogStreamResult() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$Ping;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Ping extends LaumberjackCommand {

        @NotNull
        public static final Ping INSTANCE = new Ping();

        private Ping() {
            super(8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$Pong;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Pong extends LaumberjackCommand {

        @NotNull
        public static final Pong INSTANCE = new Pong();

        private Pong() {
            super(9, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersion extends LaumberjackCommand {

        @NotNull
        public static final QueryVersion INSTANCE = new QueryVersion();

        private QueryVersion() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VersionResult extends LaumberjackCommand {

        @NotNull
        public static final VersionResult INSTANCE = new VersionResult();

        private VersionResult() {
            super(2, null);
        }
    }

    private LaumberjackCommand(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
    }

    public /* synthetic */ LaumberjackCommand(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
