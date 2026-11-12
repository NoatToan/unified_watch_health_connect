package com.huami.bluetooth.profile.channel.module.voice.content;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/ArticleContent;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "", "version", "", "getBytes", "", "b", "Ljava/lang/String;", "title", "c", "subTitle", GoogleApiAvailabilityLight.a, "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ArticleContent extends NLPContent {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String content;

    public ArticleContent(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        super(6);
        this.title = str;
        this.subTitle = str2;
        this.content = str3;
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
        String str2 = this.subTitle;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str2.getBytes(charset));
        byteArrayOutputStream.write(0);
        String str3 = this.content;
        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str3.getBytes(charset));
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }
}
