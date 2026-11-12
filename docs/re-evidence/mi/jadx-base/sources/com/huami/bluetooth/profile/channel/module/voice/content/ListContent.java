package com.huami.bluetooth.profile.channel.module.voice.content;

import com.miui.circulate.device.api.Column;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B/\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/ListContent;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/b;", "Ljava/io/Serializable;", "", "version", "", "getBytes", "", "title", "Ljava/lang/String;", Column.SUBTITLE, "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/ListContent$Item;", "Lkotlin/collections/ArrayList;", "items", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "Companion", PluginDeviceInfo.FMODEL, "Item", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ListContent extends b implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final ArrayList<Item> items;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/ListContent$Item;", "Ljava/io/Serializable;", "", "getBytes", "", "name", "Ljava/lang/String;", "value", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Item implements Serializable {
        private static final long serialVersionUID = 1;

        @NotNull
        private final String name;

        @NotNull
        private final String url;

        @NotNull
        private final String value;

        public Item(@NotNull String name, @NotNull String value, @NotNull String url) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(url, "url");
            this.name = name;
            this.value = value;
            this.url = url;
        }

        @NotNull
        public final byte[] getBytes() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.name;
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
            byte[] bytes2 = this.value.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
            byte[] bytes3 = this.url.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes3);
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
            return byteArray;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListContent(@NotNull String title, @NotNull String subtitle, @NotNull ArrayList<Item> items) {
        super(3);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.subtitle = subtitle;
        this.items = items;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.b
    @NotNull
    public byte[] getBytes(int version) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = this.title.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(this.items.size());
        Iterator<Item> it = this.items.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(it.next().getBytes());
        }
        byte[] bytes2 = this.subtitle.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes2);
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "data.toByteArray()");
        return byteArray;
    }
}
