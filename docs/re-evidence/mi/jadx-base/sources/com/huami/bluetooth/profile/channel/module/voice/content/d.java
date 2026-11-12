package com.huami.bluetooth.profile.channel.module.voice.content;

import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.entity.CardUIInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0004\u0007\f\r\u000eB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/d;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/b;", "", "version", "", "getBytes", "Lcom/huami/bluetooth/profile/channel/module/voice/content/d$d;", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/voice/content/d$d;", "weatherInfo", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/voice/content/d$d;)V", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class d extends com.huami.bluetooth.profile.channel.module.voice.content.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final C0287d weatherInfo;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/d$b;", "", "", PluginDeviceInfo.FMODEL, "", "J", DialWidgetType.DATE, "", PluginDeviceInfo.FDESC, "Ljava/lang/String;", "highTemperature", PluginDeviceInfo.FICONON, "lowTemperature", "Lcom/huami/bluetooth/profile/channel/module/voice/content/d$c;", PluginDeviceInfo.FICONOFF, "Lcom/huami/bluetooth/profile/channel/module/voice/content/d$c;", "icon", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/voice/content/d$c;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String highTemperature;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String lowTemperature;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final c icon;

        public b(long j, @NotNull String highTemperature, @NotNull String lowTemperature, @NotNull c icon) {
            Intrinsics.checkNotNullParameter(highTemperature, "highTemperature");
            Intrinsics.checkNotNullParameter(lowTemperature, "lowTemperature");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.date = j;
            this.highTemperature = highTemperature;
            this.lowTemperature = lowTemperature;
            this.icon = icon;
        }

        @NotNull
        public final byte[] a() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(tet.p((int) this.date));
            String str = this.highTemperature;
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
            byte[] bytes2 = this.lowTemperature.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(this.icon.a());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
            return byteArray;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/d$c;", "", "", PluginDeviceInfo.FMODEL, "", "Ljava/lang/String;", "description", PluginDeviceInfo.FDESC, "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        public c(@NotNull String description, @NotNull String url) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(url, "url");
            this.description = description;
            this.url = url;
        }

        @NotNull
        public final byte[] a() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.description;
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
            byte[] bytes2 = this.url.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
            return byteArray;
        }
    }

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.voice.content.d$d, reason: collision with other inner class name */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\tR(\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\t¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/d$d;", "", "", PluginDeviceInfo.FMODEL, "", "Ljava/lang/Long;", DialWidgetType.DATE, "", PluginDeviceInfo.FDESC, "Ljava/lang/String;", "location", PluginDeviceInfo.FICONON, "title", PluginDeviceInfo.FICONOFF, CardUIInfo.KEY_SUBTITILE, PluginDeviceInfo.FICONOFFLINE, "description", "Lcom/huami/bluetooth/profile/channel/module/voice/content/d$c;", PluginDeviceInfo.FBLUETOOTHPAIR, "Lcom/huami/bluetooth/profile/channel/module/voice/content/d$c;", "icon", PluginDeviceInfo.FLOCALIZATIONS, "temperature", "h", "highTemperature", "i", "lowTemperature", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/d$b;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "forecastWeather", Constant.KeyValue.KEY_COLUMN, "aqi", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/voice/content/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0287d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Long date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String location;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final String subTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final String description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public final c icon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public final String temperature;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final String highTemperature;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public final String lowTemperature;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public final ArrayList<b> forecastWeather;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String aqi;

        public C0287d(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable c cVar, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable ArrayList<b> arrayList, @Nullable String str8) {
            this.date = l;
            this.location = str;
            this.title = str2;
            this.subTitle = str3;
            this.description = str4;
            this.icon = cVar;
            this.temperature = str5;
            this.highTemperature = str6;
            this.lowTemperature = str7;
            this.forecastWeather = arrayList;
            this.aqi = str8;
        }

        @NotNull
        public final byte[] a() throws IOException {
            int i;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Long l = this.date;
            if (l != null) {
                byteArrayOutputStream.write(tet.p((int) l.longValue()));
                i = 1;
            } else {
                i = 0;
            }
            String str = this.location;
            if (str != null) {
                i |= 2;
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes);
                byteArrayOutputStream.write(0);
            }
            String str2 = this.title;
            if (str2 != null) {
                i |= 4;
                byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes2);
                byteArrayOutputStream.write(0);
            }
            String str3 = this.subTitle;
            if (str3 != null) {
                i |= 8;
                byte[] bytes3 = str3.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes3);
                byteArrayOutputStream.write(0);
            }
            String str4 = this.description;
            if (str4 != null) {
                i |= 16;
                byte[] bytes4 = str4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes4);
                byteArrayOutputStream.write(0);
            }
            c cVar = this.icon;
            if (cVar != null) {
                i |= 32;
                byteArrayOutputStream.write(cVar.a());
            }
            String str5 = this.temperature;
            if (str5 != null) {
                i |= 64;
                byte[] bytes5 = str5.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes5);
                byteArrayOutputStream.write(0);
            }
            String str6 = this.highTemperature;
            if (str6 != null) {
                i |= 128;
                byte[] bytes6 = str6.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes6, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes6);
                byteArrayOutputStream.write(0);
            }
            String str7 = this.lowTemperature;
            if (str7 != null) {
                i |= 256;
                byte[] bytes7 = str7.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes7, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes7);
                byteArrayOutputStream.write(0);
            }
            ArrayList<b> arrayList = this.forecastWeather;
            if (arrayList != null) {
                i |= 512;
                byteArrayOutputStream.write(arrayList.size());
                if (this.forecastWeather.size() > 0) {
                    Iterator<b> it = this.forecastWeather.iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream.write(it.next().a());
                    }
                }
            }
            String str8 = this.aqi;
            if (str8 != null) {
                i |= 1024;
                byte[] bytes8 = str8.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes8, "this as java.lang.String).getBytes(charset)");
                byteArrayOutputStream.write(bytes8);
                byteArrayOutputStream.write(0);
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(tet.p(i));
            byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
            return byteArray;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull C0287d weatherInfo) {
        super(1);
        Intrinsics.checkNotNullParameter(weatherInfo, "weatherInfo");
        this.weatherInfo = weatherInfo;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.b
    @NotNull
    public byte[] getBytes(int version) {
        return this.weatherInfo.a();
    }
}
