package com.huami.bluetooth.profile.channel.module.voice.content;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B/\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR&\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/ListContent;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "Ljava/io/Serializable;", "", "version", "", "getBytes", "", "b", "Ljava/lang/String;", "title", "c", MessengerShareContentUtility.SUBTITLE, "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/ListContent$Item;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "Companion", "Item", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ListContent extends NLPContent implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Item> items;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/ListContent$Item;", "Ljava/io/Serializable;", "", "getBytes", "", "a", "Ljava/lang/String;", "name", "b", "value", "c", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Item implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final String url;

        public Item(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.name = str;
            this.value = str2;
            this.url = str3;
        }

        @NotNull
        public final byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.name;
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str.getBytes(charset));
            byteArrayOutputStream.write(0);
            String str2 = this.value;
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

    public ListContent(@NotNull String str, @NotNull String str2, @NotNull ArrayList<Item> arrayList) {
        super(3);
        this.title = str;
        this.subtitle = str2;
        this.items = arrayList;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.NLPContent
    @NotNull
    public byte[] getBytes(int version) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
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
        String str2 = this.subtitle;
        Charset charset2 = Charsets.UTF_8;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str2.getBytes(charset2));
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }
}
