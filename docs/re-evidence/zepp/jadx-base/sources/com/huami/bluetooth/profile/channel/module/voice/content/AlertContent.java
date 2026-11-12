package com.huami.bluetooth.profile.channel.module.voice.content;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0005\u0017\u0016\u0018\u0019\u001aB1\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "", "b", "", "version", "getBytes", LogUtil.I, AdRemindParserKt.KEY_OP, "c", "type", "", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "ids", "Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$AlertParameter;", "e", "Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$AlertParameter;", "parameter", "<init>", "(IILjava/util/List;Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$AlertParameter;)V", "Companion", "AlertParameter", "NormalParameter", "NormalV3Parameter", "TimerParameter", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AlertContent extends NLPContent {
    public static final int EVERY_MONTH = 512;
    public static final int EVERY_WEEK = 128;
    public static final int EVERY_YEAR = 1024;
    public static final int FORTNIGHT = 256;
    public static final int FRIDAY = 16;
    public static final int MONDAY = 1;
    public static final int OP_ADD_OR_UPDATE = 1;
    public static final int OP_DELETE = 2;
    public static final int SATURDAY = 32;
    public static final int SUNDAY = 64;
    public static final int THURSDAY = 8;
    public static final int TUESDAY = 2;
    public static final int TYPE_ALARM = 1;
    public static final int TYPE_REMINDER = 2;
    public static final int TYPE_TIMER = 3;
    public static final int TYPE_TODO_LIST = 4;
    public static final int WEDNESDAY = 4;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int op;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<String> ids;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final AlertParameter parameter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$AlertParameter;", "", "", "getBytes", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class AlertParameter {
        @NotNull
        public abstract byte[] getBytes();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$NormalParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$AlertParameter;", "", "getBytes", "", "a", "Ljava/lang/String;", "title", "b", "content", "", "c", "J", "start", GoogleApiAvailabilityLight.a, Command.STOP, "", "e", LogUtil.I, "repeat", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static class NormalParameter extends AlertParameter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String content;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long start;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long stop;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int repeat;

        public NormalParameter(@NotNull String str, @NotNull String str2, long j, long j2, int i) {
            this.title = str;
            this.content = str2;
            this.start = j;
            this.stop = j2;
            this.repeat = i;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.AlertContent.AlertParameter
        @NotNull
        public byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.title;
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str.getBytes(charset));
            byteArrayOutputStream.write(0);
            String str2 = this.content;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str2.getBytes(charset));
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(GattUtils.intToBytes((int) this.start));
            byteArrayOutputStream.write(GattUtils.intToBytes((int) this.stop));
            byteArrayOutputStream.write(GattUtils.intToBytes(this.repeat));
            return byteArrayOutputStream.toByteArray();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$NormalV3Parameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$NormalParameter;", "", "getBytes", "", "f", "Z", Constants.ENABLED, "", "title", "content", "", "start", Command.STOP, "", "repeat", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NormalV3Parameter extends NormalParameter {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean enabled;

        public NormalV3Parameter(@NotNull String str, @NotNull String str2, long j, long j2, int i, boolean z) {
            super(str, str2, j, j2, i);
            this.enabled = z;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.AlertContent.NormalParameter, com.huami.bluetooth.profile.channel.module.voice.content.AlertContent.AlertParameter
        @NotNull
        public byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(super.getBytes());
            byteArrayOutputStream.write(ByteUtilsKt.toInt(this.enabled));
            return byteArrayOutputStream.toByteArray();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$TimerParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/AlertContent$AlertParameter;", "", "getBytes", "", "a", LogUtil.I, "hour", "b", "minute", "c", "second", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class TimerParameter extends AlertParameter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int hour;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int minute;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int second;

        public TimerParameter(int i, int i2, int i3) {
            this.hour = i;
            this.minute = i2;
            this.second = i3;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.AlertContent.AlertParameter
        @NotNull
        public byte[] getBytes() {
            return new byte[]{(byte) this.hour, (byte) this.minute, (byte) this.second};
        }
    }

    public /* synthetic */ AlertContent(int i, int i2, List list, AlertParameter alertParameter, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, (i3 & 8) != 0 ? null : alertParameter);
    }

    private final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.op);
        byteArrayOutputStream.write(this.type);
        byteArrayOutputStream.write(this.ids.size());
        for (String str : this.ids) {
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str.getBytes(charset));
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.NLPContent
    @NotNull
    public byte[] getBytes(int version) {
        if (this.op == 2 && version >= 3) {
            return b();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.op);
        byteArrayOutputStream.write(this.type);
        String str = this.ids.get(0);
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        AlertParameter alertParameter = this.parameter;
        if (alertParameter != null) {
            byteArrayOutputStream.write(alertParameter.getBytes());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public AlertContent(int i, int i2, @NotNull List<String> list, @Nullable AlertParameter alertParameter) {
        super(2);
        this.op = i;
        this.type = i2;
        this.ids = list;
        this.parameter = alertParameter;
    }
}
