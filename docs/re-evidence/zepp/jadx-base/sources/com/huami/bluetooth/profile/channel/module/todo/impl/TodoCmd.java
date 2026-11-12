package com.huami.bluetooth.profile.channel.module.todo.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\f\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "value", "<init>", "(I)V", "Companion", "DataChanged", "Delete", "DeleteResult", "QueryData", "QueryDataResult", "QueryVersion", "SyncData", "SyncDataResult", "UpdateData", "UpdateDataResult", "VersionResult", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$QueryDataResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$UpdateData;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$UpdateDataResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$Delete;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$DeleteResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$SyncData;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$SyncDataResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$DataChanged;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class TodoCmd extends Request.Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$Companion;", "", "", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "toCommand", "", "CMD_BYTES", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", Constant.h, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<TodoCmd, Boolean> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(byte[] bArr) {
                super(1);
                this.a = bArr;
            }

            public final boolean a(@NotNull TodoCmd todoCmd) {
                byte[] bArr = todoCmd.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                byte[] bArr2 = this.a;
                return bArr2.length >= bArr.length && Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr.length));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(TodoCmd todoCmd) {
                return Boolean.valueOf(a(todoCmd));
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TodoCmd toCommand(@NotNull byte[] bArr) throws Exception {
            a aVar = new a(bArr);
            TodoCmd todoCmd = QueryVersion.INSTANCE;
            if (!aVar.invoke(todoCmd).booleanValue()) {
                todoCmd = VersionResult.INSTANCE;
                if (!aVar.invoke(todoCmd).booleanValue()) {
                    todoCmd = QueryData.INSTANCE;
                    if (!aVar.invoke(todoCmd).booleanValue()) {
                        todoCmd = QueryDataResult.INSTANCE;
                        if (!aVar.invoke(todoCmd).booleanValue()) {
                            todoCmd = UpdateData.INSTANCE;
                            if (!aVar.invoke(todoCmd).booleanValue()) {
                                todoCmd = UpdateDataResult.INSTANCE;
                                if (!aVar.invoke(todoCmd).booleanValue()) {
                                    todoCmd = Delete.INSTANCE;
                                    if (!aVar.invoke(todoCmd).booleanValue()) {
                                        todoCmd = DeleteResult.INSTANCE;
                                        if (!aVar.invoke(todoCmd).booleanValue()) {
                                            todoCmd = SyncData.INSTANCE;
                                            if (!aVar.invoke(todoCmd).booleanValue()) {
                                                todoCmd = SyncDataResult.INSTANCE;
                                                if (!aVar.invoke(todoCmd).booleanValue()) {
                                                    todoCmd = DataChanged.INSTANCE;
                                                    if (!aVar.invoke(todoCmd).booleanValue()) {
                                                        throw new Exception("Unknown command!");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return todoCmd;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$DataChanged;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DataChanged extends TodoCmd {

        @NotNull
        public static final DataChanged INSTANCE = new DataChanged();

        private DataChanged() {
            super(13, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$Delete;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Delete extends TodoCmd {

        @NotNull
        public static final Delete INSTANCE = new Delete();

        private Delete() {
            super(7, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$DeleteResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteResult extends TodoCmd {

        @NotNull
        public static final DeleteResult INSTANCE = new DeleteResult();

        private DeleteResult() {
            super(8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryData extends TodoCmd {

        @NotNull
        public static final QueryData INSTANCE = new QueryData();

        private QueryData() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$QueryDataResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryDataResult extends TodoCmd {

        @NotNull
        public static final QueryDataResult INSTANCE = new QueryDataResult();

        private QueryDataResult() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersion extends TodoCmd {

        @NotNull
        public static final QueryVersion INSTANCE = new QueryVersion();

        private QueryVersion() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$SyncData;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SyncData extends TodoCmd {

        @NotNull
        public static final SyncData INSTANCE = new SyncData();

        private SyncData() {
            super(9, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$SyncDataResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SyncDataResult extends TodoCmd {

        @NotNull
        public static final SyncDataResult INSTANCE = new SyncDataResult();

        private SyncDataResult() {
            super(10, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$UpdateData;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateData extends TodoCmd {

        @NotNull
        public static final UpdateData INSTANCE = new UpdateData();

        private UpdateData() {
            super(5, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$UpdateDataResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateDataResult extends TodoCmd {

        @NotNull
        public static final UpdateDataResult INSTANCE = new UpdateDataResult();

        private UpdateDataResult() {
            super(6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VersionResult extends TodoCmd {

        @NotNull
        public static final VersionResult INSTANCE = new VersionResult();

        private VersionResult() {
            super(2, null);
        }
    }

    private TodoCmd(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
    }

    public /* synthetic */ TodoCmd(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
