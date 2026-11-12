package com.huami.bluetooth.profile.channel.module.sleep.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\t\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "Lcom/huami/bluetooth/profile/Request$Command;", "", Constant.h, "<init>", "(I)V", "Companion", "ConfigResult", "DataResult", "QueryConfig", "QueryData", "QueryVersion", "VersionResult", "WriteData", "WriteDataResult", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$QueryConfig;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$ConfigResult;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$DataResult;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$WriteData;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$WriteDataResult;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class Command extends Request.Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$Companion;", "", "", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "toCommand", "", "CMD_BYTE_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Command toCommand(@NotNull byte[] bArr) {
            Object next;
            Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Command[]{QueryVersion.INSTANCE, VersionResult.INSTANCE, QueryConfig.INSTANCE, ConfigResult.INSTANCE, QueryData.INSTANCE, DataResult.INSTANCE, WriteData.INSTANCE, WriteDataResult.INSTANCE}).iterator();
            while (it2.hasNext()) {
                next = it2.next();
                Command command = (Command) next;
                if (bArr.length >= command.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String().length && Arrays.equals(command.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), Arrays.copyOf(bArr, command.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String().length))) {
                    return (Command) next;
                }
            }
            next = null;
            return (Command) next;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$ConfigResult;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ConfigResult extends Command {

        @NotNull
        public static final ConfigResult INSTANCE = new ConfigResult();

        private ConfigResult() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$DataResult;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DataResult extends Command {

        @NotNull
        public static final DataResult INSTANCE = new DataResult();

        private DataResult() {
            super(6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$QueryConfig;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryConfig extends Command {

        @NotNull
        public static final QueryConfig INSTANCE = new QueryConfig();

        private QueryConfig() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryData extends Command {

        @NotNull
        public static final QueryData INSTANCE = new QueryData();

        private QueryData() {
            super(5, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersion extends Command {

        @NotNull
        public static final QueryVersion INSTANCE = new QueryVersion();

        private QueryVersion() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VersionResult extends Command {

        @NotNull
        public static final VersionResult INSTANCE = new VersionResult();

        private VersionResult() {
            super(2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$WriteData;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class WriteData extends Command {

        @NotNull
        public static final WriteData INSTANCE = new WriteData();

        private WriteData() {
            super(7, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command$WriteDataResult;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class WriteDataResult extends Command {

        @NotNull
        public static final WriteDataResult INSTANCE = new WriteDataResult();

        private WriteDataResult() {
            super(8, null);
        }
    }

    private Command(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
    }

    public /* synthetic */ Command(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
