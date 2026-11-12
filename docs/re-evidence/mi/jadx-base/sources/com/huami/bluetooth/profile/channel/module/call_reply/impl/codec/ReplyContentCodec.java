package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.huami.bluetooth.profile.channel.module.call_reply.ReplyContent;
import defpackage.ql;
import defpackage.u4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyContentCodec;", "Lu4;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ReplyContentCodec implements u4<ReplyContent, byte[]> {

    @NotNull
    private final ContentCodec contentCodec;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyContentCodec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReplyContentCodec(@NotNull ContentCodec contentCodec) {
        Intrinsics.checkNotNullParameter(contentCodec, "contentCodec");
        this.contentCodec = contentCodec;
    }

    @Override // defpackage.u4
    @NotNull
    public ReplyContent decode(@NotNull final byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        final Ref.IntRef intRef = new Ref.IntRef();
        Function0<String> function0 = new Function0<String>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ReplyContentCodec$decode$parseStr$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                int i = intRef.element;
                byte[] bArr = value;
                if (i >= bArr.length) {
                    return null;
                }
                int iA = ql.a(bArr, i);
                if (iA < 0) {
                    byte[] bArr2 = value;
                    byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr2, intRef.element, bArr2.length);
                    intRef.element = value.length;
                    return new String(bArrCopyOfRange, Charsets.UTF_8);
                }
                Ref.IntRef intRef2 = intRef;
                int i2 = intRef2.element;
                if (i2 == iA) {
                    intRef2.element = i2 + 1;
                    return "";
                }
                byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(value, i2, iA);
                intRef.element = iA + 1;
                return new String(bArrCopyOfRange2, Charsets.UTF_8);
            }
        };
        String strInvoke = function0.invoke();
        String str = strInvoke == null ? "" : strInvoke;
        String strInvoke2 = function0.invoke();
        String str2 = strInvoke2 == null ? "" : strInvoke2;
        int i = intRef.element;
        return new ReplyContent(str, str2, i >= value.length ? null : this.contentCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, i, value.length)).getContent(), false, 8, null);
    }

    @Override // defpackage.u4
    @NotNull
    public byte[] encode(@NotNull ReplyContent value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String title = value.getTitle();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = title.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] bytes2 = value.getPhoneNo().getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes2);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(!value.getCancel() ? 1 : 0);
        if (!value.getCancel()) {
            byteArrayOutputStream.write(this.contentCodec.encode(value.getContent()));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    public /* synthetic */ ReplyContentCodec(ContentCodec contentCodec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ContentCodecImpl() : contentCodec);
    }
}
