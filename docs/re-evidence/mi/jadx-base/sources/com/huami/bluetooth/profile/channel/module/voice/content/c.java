package com.huami.bluetooth.profile.channel.module.voice.content;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\b\u0006\n\u000f\u0010\u0011\u0012\u0013\u0014B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/b;", "", "version", "", "getBytes", PluginDeviceInfo.FMODEL, "I", "app", "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", PluginDeviceInfo.FDESC, "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "parameter", "<init>", "(ILcom/huami/bluetooth/profile/channel/module/voice/content/c$a;)V", PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class c extends com.huami.bluetooth.profile.channel.module.voice.content.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int app;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final a parameter;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a {
        @NotNull
        public abstract byte[] a();
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B'\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c$b;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "", PluginDeviceInfo.FMODEL, "", "I", "action", PluginDeviceInfo.FDESC, "Ljava/lang/Integer;", "absolute", PluginDeviceInfo.FICONON, "percent", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", PluginDeviceInfo.FICONOFF, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int action;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer absolute;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Integer percent;

        public b(int i, @Nullable Integer num, @Nullable Integer num2) {
            this.action = i;
            this.absolute = num;
            this.percent = num2;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.c.a
        @NotNull
        public byte[] a() {
            int i = this.action;
            if (i == 0) {
                return new byte[]{(byte) i};
            }
            byte[] bArr = new byte[2];
            bArr[0] = (byte) i;
            if (i == 1) {
                Integer num = this.absolute;
                Intrinsics.checkNotNull(num);
                bArr[1] = (byte) num.intValue();
            } else if (i == 2) {
                Integer num2 = this.percent;
                Intrinsics.checkNotNull(num2);
                bArr[1] = (byte) num2.intValue();
            }
            return bArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u00102\u00020\u0001:\u0001\u0003B3\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c$d;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "", PluginDeviceInfo.FMODEL, "", "I", "code", PluginDeviceInfo.FDESC, "Ljava/lang/Integer;", "hours", PluginDeviceInfo.FICONON, "minutes", PluginDeviceInfo.FICONOFF, "seconds", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer hours;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Integer minutes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Integer seconds;

        public d(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            this.code = i;
            this.hours = num;
            this.minutes = num2;
            this.seconds = num3;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.c.a
        @NotNull
        public byte[] a() {
            int i = this.code;
            if (i != 0) {
                return new byte[]{(byte) i};
            }
            Integer num = this.hours;
            Intrinsics.checkNotNull(num);
            byte bIntValue = (byte) num.intValue();
            Integer num2 = this.minutes;
            Intrinsics.checkNotNull(num2);
            byte bIntValue2 = (byte) num2.intValue();
            Integer num3 = this.seconds;
            Intrinsics.checkNotNull(num3);
            return new byte[]{(byte) i, bIntValue, bIntValue2, (byte) num3.intValue()};
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c$e;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "", PluginDeviceInfo.FMODEL, "", "I", "mode", "<init>", "(I)V", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int mode;

        public e(int i) {
            this.mode = i;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.c.a
        @NotNull
        public byte[] a() {
            return new byte[]{(byte) this.mode};
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\u0003B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c$f;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "", PluginDeviceInfo.FMODEL, "", "I", "action", PluginDeviceInfo.FDESC, "Ljava/lang/Integer;", "percentOfVolume", "<init>", "(ILjava/lang/Integer;)V", PluginDeviceInfo.FICONON, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int action;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer percentOfVolume;

        public f(int i, @Nullable Integer num) {
            this.action = i;
            this.percentOfVolume = num;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.c.a
        @NotNull
        public byte[] a() {
            int i = this.action;
            if (i != 7) {
                return new byte[]{(byte) i};
            }
            Integer num = this.percentOfVolume;
            Intrinsics.checkNotNull(num);
            return new byte[]{(byte) i, (byte) num.intValue()};
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c$g;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "", PluginDeviceInfo.FMODEL, "", "I", "type", "<init>", "(I)V", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int type;

        public g(int i) {
            this.type = i;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.c.a
        @NotNull
        public byte[] a() {
            return new byte[]{(byte) this.type};
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/c$h;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/c$a;", "", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportType;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportType;", "type", "", PluginDeviceInfo.FDESC, "Ljava/lang/Integer;", "typeValue", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportType;)V", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SportType type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Integer typeValue;

        public h(@NotNull SportType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.c.a
        @NotNull
        public byte[] a() {
            Integer num = this.typeValue;
            byte[] bArrS = tet.s((short) (num != null ? num.intValue() : this.type.getValue()));
            Intrinsics.checkNotNullExpressionValue(bArrS, "shortToBytes(value.toShort())");
            return bArrS;
        }

        public h(int i) {
            this(SportType.SPORT_TYPE_NONE);
            this.typeValue = Integer.valueOf(i);
        }
    }

    public /* synthetic */ c(int i, a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : aVar);
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.b
    @NotNull
    public byte[] getBytes(int version) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.app);
        a aVar = this.parameter;
        if (aVar != null) {
            byteArrayOutputStream.write(aVar.a());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    public c(int i, @Nullable a aVar) {
        super(4);
        this.app = i;
        this.parameter = aVar;
    }
}
