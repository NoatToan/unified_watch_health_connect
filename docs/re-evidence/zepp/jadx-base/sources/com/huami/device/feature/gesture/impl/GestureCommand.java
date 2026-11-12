package com.huami.device.feature.gesture.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000f\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "", "c", "[B", "getExtra", "()[B", "extra", "<init>", "(I[B)V", "Companion", "DisableGestureCommand", "NotifyStateCommand", "QueryAllGestureStateCommand", "QueryGestureStateCommand", "QueryVersionCommand", "SetGestureStateCommand", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public class GestureCommand extends Request.Command {
    private static final int d = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final byte[] extra;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureCommand$DisableGestureCommand;", "Lcom/huami/device/feature/gesture/impl/GestureCommand;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class DisableGestureCommand extends GestureCommand {

        @NotNull
        public static final DisableGestureCommand INSTANCE = new DisableGestureCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private DisableGestureCommand() {
            super(10, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureCommand$NotifyStateCommand;", "Lcom/huami/device/feature/gesture/impl/GestureCommand;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class NotifyStateCommand extends GestureCommand {

        @NotNull
        public static final NotifyStateCommand INSTANCE = new NotifyStateCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private NotifyStateCommand() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureCommand$QueryAllGestureStateCommand;", "Lcom/huami/device/feature/gesture/impl/GestureCommand;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryAllGestureStateCommand extends GestureCommand {

        @NotNull
        public static final QueryAllGestureStateCommand INSTANCE = new QueryAllGestureStateCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private QueryAllGestureStateCommand() {
            super(8, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureCommand$QueryGestureStateCommand;", "Lcom/huami/device/feature/gesture/impl/GestureCommand;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryGestureStateCommand extends GestureCommand {

        @NotNull
        public static final QueryGestureStateCommand INSTANCE = new QueryGestureStateCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private QueryGestureStateCommand() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureCommand$QueryVersionCommand;", "Lcom/huami/device/feature/gesture/impl/GestureCommand;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends GestureCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private QueryVersionCommand() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureCommand$SetGestureStateCommand;", "Lcom/huami/device/feature/gesture/impl/GestureCommand;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetGestureStateCommand extends GestureCommand {

        @NotNull
        public static final SetGestureStateCommand INSTANCE = new SetGestureStateCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private SetGestureStateCommand() {
            super(6, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ GestureCommand(int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new byte[0] : bArr);
    }

    public final int getCmd() {
        return this.cmd;
    }

    @NotNull
    public final byte[] getExtra() {
        return this.extra;
    }

    public GestureCommand(int i, @NotNull byte[] bArr) {
        super(ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(i, 1), bArr));
        this.cmd = i;
        this.extra = bArr;
    }
}
