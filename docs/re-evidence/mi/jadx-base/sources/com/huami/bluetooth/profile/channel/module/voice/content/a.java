package com.huami.bluetooth.profile.channel.module.voice.content;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.c3;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0005\u0006\t\r\u0011\u0016B1\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/a;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/b;", "", "version", "", "getBytes", PluginDeviceInfo.FMODEL, "I", "op", PluginDeviceInfo.FDESC, "type", "", "", PluginDeviceInfo.FICONON, "Ljava/util/List;", "ids", "Lcom/huami/bluetooth/profile/channel/module/voice/content/a$a;", PluginDeviceInfo.FICONOFF, "Lcom/huami/bluetooth/profile/channel/module/voice/content/a$a;", "parameter", "<init>", "(IILjava/util/List;Lcom/huami/bluetooth/profile/channel/module/voice/content/a$a;)V", PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int op;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<String> ids;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final AbstractC0285a parameter;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.voice.content.a$a, reason: collision with other inner class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/a$a;", "", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class AbstractC0285a {
        @NotNull
        public abstract byte[] a();
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/a$c;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/a$a;", "", PluginDeviceInfo.FMODEL, "", "Ljava/lang/String;", "title", PluginDeviceInfo.FDESC, MiuiCursorConstants.CONTENT, "", PluginDeviceInfo.FICONON, "J", StatConstants.PARAM_START, PluginDeviceInfo.FICONOFF, BroadcastsKt.SILENT_PUSHING_STOP, "", PluginDeviceInfo.FICONOFFLINE, "I", "repeat", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJI)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static class c extends AbstractC0285a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String content;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long start;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final long stop;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final int repeat;

        public c(@NotNull String title, @NotNull String content, long j, long j2, int i) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            this.title = title;
            this.content = content;
            this.start = j;
            this.stop = j2;
            this.repeat = i;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.a.AbstractC0285a
        @NotNull
        public byte[] a() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.title;
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
            byte[] bytes2 = this.content.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(tet.p((int) this.start));
            byteArrayOutputStream.write(tet.p((int) this.stop));
            byteArrayOutputStream.write(tet.p(this.repeat));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
            return byteArray;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/a$d;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/a$c;", "", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FBLUETOOTHPAIR, "Z", "enabled", "", "title", MiuiCursorConstants.CONTENT, "", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "", "repeat", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIZ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends c {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final boolean enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String title, @NotNull String content, long j, long j2, int i, boolean z) {
            super(title, content, j, j2, i);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            this.enabled = z;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.a.c, com.huami.bluetooth.profile.channel.module.voice.content.a.AbstractC0285a
        @NotNull
        public byte[] a() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(super.a());
            byteArrayOutputStream.write(c3.b(this.enabled));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
            return byteArray;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/a$e;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/a$a;", "", PluginDeviceInfo.FMODEL, "", "I", "hour", PluginDeviceInfo.FDESC, "minute", PluginDeviceInfo.FICONON, "second", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends AbstractC0285a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int hour;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int minute;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int second;

        public e(int i, int i2, int i3) {
            this.hour = i;
            this.minute = i2;
            this.second = i3;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.a.AbstractC0285a
        @NotNull
        public byte[] a() {
            return new byte[]{(byte) this.hour, (byte) this.minute, (byte) this.second};
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, int i2, @NotNull List<String> ids, @Nullable AbstractC0285a abstractC0285a) {
        super(2);
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.op = i;
        this.type = i2;
        this.ids = ids;
        this.parameter = abstractC0285a;
    }

    public final byte[] a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.op);
        byteArrayOutputStream.write(this.type);
        byteArrayOutputStream.write(this.ids.size());
        Iterator<T> it = this.ids.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
        return byteArray;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.b
    @NotNull
    public byte[] getBytes(int version) throws IOException {
        if (this.op == 2 && version >= 3) {
            return a();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.op);
        byteArrayOutputStream.write(this.type);
        byte[] bytes = this.ids.get(0).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        AbstractC0285a abstractC0285a = this.parameter;
        if (abstractC0285a != null) {
            byteArrayOutputStream.write(abstractC0285a.a());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
        return byteArray;
    }
}
