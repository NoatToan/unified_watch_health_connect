package com.huami.bluetooth.profile.channel.module.voice.content;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B'\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/NewsContent;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "", "version", "", "getBytes", "", "b", "Ljava/lang/String;", "title", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NewsContent$Item;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "items", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "Companion", "Item", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NewsContent extends NLPContent {
    public static final int PLAY = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Item> items;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/NewsContent$Item;", "", "", "getBytes", "", "a", "Ljava/lang/String;", "id", "b", "title", "c", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Item {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final String url;

        public Item(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.id = str;
            this.title = str2;
            this.url = str3;
        }

        @NotNull
        public final byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.id;
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str.getBytes(charset));
            byteArrayOutputStream.write(0);
            String str2 = this.title;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str2.getBytes(charset));
            byteArrayOutputStream.write(0);
            String str3 = this.url;
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str3.getBytes(charset));
            byteArrayOutputStream.write(0);
            return byteArrayOutputStream.toByteArray();
        }
    }

    public NewsContent(@NotNull String str, @NotNull ArrayList<Item> arrayList) {
        super(5);
        this.title = str;
        this.items = arrayList;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.NLPContent
    @NotNull
    public byte[] getBytes(int version) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        String str = this.title;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(this.items.size());
        Iterator<Item> it2 = this.items.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(it2.next().getBytes());
        }
        return byteArrayOutputStream.toByteArray();
    }
}
