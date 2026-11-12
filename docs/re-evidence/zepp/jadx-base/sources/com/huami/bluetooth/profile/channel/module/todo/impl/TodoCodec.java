package com.huami.bluetooth.profile.channel.module.todo.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.ex.ParseException;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.bluetooth.utils.ByteString;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0005H\u0002J!\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "", "b", "c", "", "millis", "bits", "a", "(Ljava/lang/Long;I)[B", "offset", GoogleApiAvailabilityLight.a, "([BII)Ljava/lang/Long;", "value", "encode", "decode", "", "Z", "firstRemindEnable", "<init>", "(Z)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TodoCodec implements Codec<Todo, byte[]> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 4;
    private static final int c = 1;
    private static final int d = 4;
    private static final int e = 4;
    private static final int f = 4;
    private static final int g = 4;
    private static final int h = 4;
    private static final int i = 21;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean firstRemindEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCodec$Companion;", "", "", HTTP.CONTENT_RANGE_BYTES, "", "offset", "", "firstRemindEnable", "", "split$bluetooth_release", "([BIZ)Ljava/util/List;", "split", "BYTES_LEN", LogUtil.I, "COMPLETED_TIME_BYTE_LEN", "DATE_BYTE_LEN", "FIRST_REMIND_LEN", "ID_BYTE_LEN", "REPEAT_BYTE_LEN", "SOURCE_BYTE_LEN", "TIME_BYTE_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List split$bluetooth_release$default(Companion companion, byte[] bArr, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.split$bluetooth_release(bArr, i, z);
        }

        @NotNull
        public final List<byte[]> split$bluetooth_release(@NotNull byte[] bytes, int offset, boolean firstRemindEnable) {
            int i;
            int iFindStringEndFlag;
            ArrayList arrayList = new ArrayList();
            if (offset < 0) {
                offset = 0;
            }
            while (offset < bytes.length && (i = offset + 4) < bytes.length && (iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(bytes, i)) >= 0) {
                int i2 = ((iFindStringEndFlag + 1) + (firstRemindEnable ? 25 : 21)) - 4;
                if (i2 > bytes.length) {
                    break;
                }
                arrayList.add(ArraysKt___ArraysJvmKt.copyOfRange(bytes, offset, i2));
                offset = i2;
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
    }

    public TodoCodec() {
        this(false, 1, null);
    }

    public TodoCodec(boolean z) {
        this.firstRemindEnable = z;
    }

    private final byte[] a(Long millis, int bits) {
        return GattUtils.numberToBytes(millis == null ? 0L : millis.longValue() / ((long) 1000), bits);
    }

    private final int b(Todo.Source source) {
        if (Intrinsics.areEqual(source, Todo.Source.Default.INSTANCE)) {
            return 0;
        }
        if (Intrinsics.areEqual(source, Todo.Source.XiaoAi.INSTANCE)) {
            return 1;
        }
        if (Intrinsics.areEqual(source, Todo.Source.Alexa.INSTANCE)) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Todo.Source c(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? Todo.Source.Default.INSTANCE : Todo.Source.Alexa.INSTANCE;
        }
        return Todo.Source.XiaoAi.INSTANCE;
    }

    private final Long d(byte[] bArr, int i2, int i3) {
        Long lValueOf;
        if (i3 >= bArr.length) {
            lValueOf = null;
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            lValueOf = Long.valueOf(ByteUtilsKt.toLong(bArr, i2, i3));
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue == 0) {
            return null;
        }
        return Long.valueOf(jLongValue * ((long) 1000));
    }

    public static /* synthetic */ Long e(TodoCodec todoCodec, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return todoCodec.d(bArr, i2, i3);
    }

    public /* synthetic */ TodoCodec(boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public Todo decode(@NotNull byte[] value) {
        ByteString byteString;
        if (value.length <= (this.firstRemindEnable ? 25 : 21)) {
            throw new ParseException("Byte length invalid!");
        }
        Long lD = d(value, 4, 0);
        long jLongValue = lD == null ? 0L : lD.longValue();
        Charset charset = Charsets.UTF_8;
        if (value.length <= 0 || 4 >= value.length) {
            byteString = new ByteString("", 0);
        } else {
            int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(value, 4);
            byteString = iFindStringEndFlag < 0 ? new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(value, 4, value.length), charset), value.length - 4) : new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(value, 4, iFindStringEndFlag), charset), (iFindStringEndFlag - 4) + 1);
        }
        String str = byteString.getStr();
        int bytes = byteString.getBytes() + 4;
        Todo.Source sourceC = c(ByteUtilsKt.toInt(value, 1, bytes));
        int i2 = bytes + 1;
        Long lD2 = null;
        if (this.firstRemindEnable) {
            lD2 = d(value, 4, i2);
            i2 += 4;
        }
        Long lD3 = d(value, 4, i2);
        int i3 = i2 + 4;
        Long lD4 = d(value, 4, i3);
        int i4 = i3 + 4;
        return new Todo(jLongValue, str, sourceC, lD3, lD4, ByteUtilsKt.toInt(value, 4, i4), d(value, 4, i4 + 4), lD2);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull Todo value) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(a(Long.valueOf(value.getId()), 4));
        String content = value.getContent();
        byte[] bArrPlus = content == null ? null : ArraysKt___ArraysJvmKt.plus(content.getBytes(Charsets.UTF_8), (byte) 0);
        if (bArrPlus == null) {
            bArrPlus = new byte[]{0};
        }
        byteArrayOutputStream.write(bArrPlus);
        byteArrayOutputStream.write(b(value.getSource()));
        if (this.firstRemindEnable) {
            byteArrayOutputStream.write(a(value.getFirstRemind(), 4));
        }
        byteArrayOutputStream.write(a(value.getDate(), 4));
        byteArrayOutputStream.write(a(value.getTime(), 4));
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.getRepeat(), 4));
        byteArrayOutputStream.write(a(value.getCompleteTime(), 4));
        return byteArrayOutputStream.toByteArray();
    }
}
