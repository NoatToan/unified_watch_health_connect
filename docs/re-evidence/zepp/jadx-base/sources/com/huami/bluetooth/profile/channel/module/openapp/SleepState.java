package com.huami.bluetooth.profile.channel.module.openapp;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState;", "", "", "a", LogUtil.I, "getType", "()I", "type", "", "b", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "<init>", "(ILjava/lang/String;)V", "Sleeping", "Waking", "Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState$Waking;", "Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState$Sleeping;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class SleepState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState$Sleeping;", "Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sleeping extends SleepState {

        @NotNull
        public static final Sleeping INSTANCE = new Sleeping();

        private Sleeping() {
            super(1, "睡着", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState$Waking;", "Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Waking extends SleepState {

        @NotNull
        public static final Waking INSTANCE = new Waking();

        private Waking() {
            super(0, "醒来", null);
        }
    }

    private SleepState(int i, String str) {
        this.type = i;
        this.desc = str;
    }

    public /* synthetic */ SleepState(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getType() {
        return this.type;
    }
}
