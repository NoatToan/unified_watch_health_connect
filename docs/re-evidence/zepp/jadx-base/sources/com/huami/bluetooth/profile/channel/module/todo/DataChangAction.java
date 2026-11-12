package com.huami.bluetooth.profile.channel.module.todo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction;", "", "<init>", "()V", "Add", "Delete", "Update", "Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction$Add;", "Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction$Delete;", "Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction$Update;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class DataChangAction {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction$Add;", "Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Add extends DataChangAction {

        @NotNull
        public static final Add INSTANCE = new Add();

        private Add() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction$Delete;", "Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Delete extends DataChangAction {

        @NotNull
        public static final Delete INSTANCE = new Delete();

        private Delete() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction$Update;", "Lcom/huami/bluetooth/profile/channel/module/todo/DataChangAction;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Update extends DataChangAction {

        @NotNull
        public static final Update INSTANCE = new Update();

        private Update() {
            super(null);
        }
    }

    private DataChangAction() {
    }

    public /* synthetic */ DataChangAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
