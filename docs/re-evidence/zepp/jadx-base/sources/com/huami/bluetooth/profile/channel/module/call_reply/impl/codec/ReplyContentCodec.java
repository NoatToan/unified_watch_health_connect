package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyContent;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyContentCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "a", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ReplyContentCodec implements Codec<ReplyContent, byte[]> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ContentCodec contentCodec;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ byte[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.IntRef intRef, byte[] bArr) {
            super(0);
            this.a = intRef;
            this.b = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int i = this.a.element;
            byte[] bArr = this.b;
            if (i >= bArr.length) {
                return null;
            }
            int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(bArr, i);
            if (iFindStringEndFlag < 0) {
                byte[] bArr2 = this.b;
                byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr2, this.a.element, bArr2.length);
                this.a.element = this.b.length;
                return new String(bArrCopyOfRange, Charsets.UTF_8);
            }
            Ref.IntRef intRef = this.a;
            int i2 = intRef.element;
            if (i2 == iFindStringEndFlag) {
                intRef.element = i2 + 1;
                return "";
            }
            byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(this.b, i2, iFindStringEndFlag);
            this.a.element = iFindStringEndFlag + 1;
            return new String(bArrCopyOfRange2, Charsets.UTF_8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyContentCodec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReplyContentCodec(@NotNull ContentCodec contentCodec) {
        this.contentCodec = contentCodec;
    }

    public /* synthetic */ ReplyContentCodec(ContentCodec contentCodec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ContentCodecImpl() : contentCodec);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public ReplyContent decode(@NotNull byte[] value) {
        Ref.IntRef intRef = new Ref.IntRef();
        a aVar = new a(intRef, value);
        String strInvoke = aVar.invoke();
        String str = strInvoke == null ? "" : strInvoke;
        String strInvoke2 = aVar.invoke();
        String str2 = strInvoke2 == null ? "" : strInvoke2;
        int i = intRef.element;
        return new ReplyContent(str, str2, i >= value.length ? null : this.contentCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, i, value.length)).getContent(), false, 8, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull ReplyContent value) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String title = value.getTitle();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(title, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(title.getBytes(charset));
        byteArrayOutputStream.write(0);
        String phoneNo = value.getPhoneNo();
        Objects.requireNonNull(phoneNo, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(phoneNo.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(!value.getCancel() ? 1 : 0);
        if (!value.getCancel()) {
            byteArrayOutputStream.write(this.contentCodec.encode(value.getContent()));
        }
        return byteArrayOutputStream.toByteArray();
    }
}
