package com.huami.bluetooth.profile.channel.module.schedule.action;

import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/DefaultInterceptor;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "", Constant.h, "", "result", "", "onFinishSend", "", "data", "onSend", "onReceive", "", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "<init>", "(Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultInterceptor implements IDataInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ byte a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte b, boolean z) {
            super(0);
            this.a = b;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "on Send 0x" + ((Object) Integer.toHexString(this.a)) + " result: " + this.b + ';';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ byte a;
        public final /* synthetic */ byte[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte b, byte[] bArr) {
            super(0);
            this.a = b;
            this.b = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onReceive cmd: 0x" + ((Object) Integer.toHexString(this.a)) + "; response: " + ((Object) GattUtils.bytesToHexString(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ byte a;
        public final /* synthetic */ byte[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte b, byte[] bArr) {
            super(0);
            this.a = b;
            this.b = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onSend cmd: 0x" + ((Object) Integer.toHexString(this.a)) + "; bytes: " + ((Object) GattUtils.bytesToHexString(this.b));
        }
    }

    public DefaultInterceptor(@NotNull String str) {
        this.tag = str;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor
    public void onFinishSend(byte cmd, boolean result) {
        HMLog.info(this.tag, new a(cmd, result));
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor
    public void onReceive(byte cmd, @NotNull byte[] data) {
        HMLog.info(this.tag, new b(cmd, data));
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor
    public void onSend(byte cmd, @NotNull byte[] data) {
        HMLog.info(this.tag, new c(cmd, data));
    }
}
