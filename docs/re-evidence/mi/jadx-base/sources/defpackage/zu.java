package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\f\u0010\u0005\u001a\u00020\u0007*\u00020\u0006H\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002J!\u0010\u0005\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0005\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u0012"}, d2 = {"Lzu;", "Lu4;", "Luu;", "", "value", PluginDeviceInfo.FMODEL, "Luu$a;", "", "", "millis", "bits", "(Ljava/lang/Long;I)[B", "offset", "([BII)Ljava/lang/Long;", "", "firstRemindEnable", "<init>", "(Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class zu implements u4<Todo, byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41675b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41676a;

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0016"}, d2 = {"Lzu$a;", "", "", "bytes", "", "offset", "", "firstRemindEnable", "", PluginDeviceInfo.FMODEL, "([BIZ)Ljava/util/List;", "BYTES_LEN", "I", "COMPLETED_TIME_BYTE_LEN", "DATE_BYTE_LEN", "FIRST_REMIND_LEN", "ID_BYTE_LEN", "REPEAT_BYTE_LEN", "SOURCE_BYTE_LEN", "TIME_BYTE_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<byte[]> a(@NotNull byte[] bytes, int offset, boolean firstRemindEnable) {
            int i;
            int iA;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            ArrayList arrayList = new ArrayList();
            if (offset < 0) {
                offset = 0;
            }
            while (offset < bytes.length && (i = offset + 4) < bytes.length && (iA = ql.a(bytes, i)) >= 0) {
                int i2 = ((iA + 1) + (firstRemindEnable ? 25 : 21)) - 4;
                if (i2 > bytes.length) {
                    break;
                }
                arrayList.add(ArraysKt___ArraysJvmKt.copyOfRange(bytes, offset, i2));
                offset = i2;
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
    }

    public zu(boolean z) {
        this.f41676a = z;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull Todo value) throws IOException {
        byte[] bArrPlus;
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(a(Long.valueOf(value.getId()), 4));
        String content = value.getContent();
        Charset charset = Charsets.UTF_8;
        if (content != null) {
            byte[] bytes = content.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bytes, (byte) 0);
            if (bArrPlus == null) {
                bArrPlus = new byte[]{0};
            }
        } else {
            bArrPlus = new byte[]{0};
        }
        byteArrayOutputStream.write(bArrPlus);
        byteArrayOutputStream.write(a(value.getSource()));
        if (this.f41676a) {
            byteArrayOutputStream.write(a(value.getFirstRemind(), 4));
        }
        byteArrayOutputStream.write(a(value.getDate(), 4));
        byteArrayOutputStream.write(a(value.getTime(), 4));
        byteArrayOutputStream.write(c3.a(value.getRepeat(), 4));
        byteArrayOutputStream.write(a(value.getCompleteTime(), 4));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…)\n        }.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Todo decode(@NotNull byte[] value) {
        ByteString byteString;
        Long lA;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length > (this.f41676a ? 25 : 21)) {
            Long lA2 = a(value, 4, 0);
            long jLongValue = lA2 != null ? lA2.longValue() : 0L;
            Charset charset = Charsets.UTF_8;
            if (value.length > 0 && 4 < value.length) {
                int iA = ql.a(value, 4);
                if (iA < 0) {
                    byteString = new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(value, 4, value.length), charset), value.length - 4);
                } else {
                    byteString = new ByteString(new String(ArraysKt___ArraysJvmKt.copyOfRange(value, 4, iA), charset), iA - 3);
                }
            } else {
                byteString = new ByteString("", 0);
            }
            String str = byteString.getStr();
            int bytes = byteString.getBytes();
            Todo.a aVarA = a(c3.a(value, 1, 4 + bytes));
            int i = bytes + 5;
            if (this.f41676a) {
                lA = a(value, 4, i);
                i = bytes + 9;
            } else {
                lA = null;
            }
            return new Todo(jLongValue, str, aVarA, a(value, 4, i), a(value, 4, i + 4), c3.a(value, 4, i + 8), a(value, 4, i + 12), lA);
        }
        throw new oo("Byte length invalid!");
    }

    public final int a(Todo.a aVar) {
        if (Intrinsics.areEqual(aVar, Todo.a.b.f36134a)) {
            return 0;
        }
        if (Intrinsics.areEqual(aVar, Todo.a.c.f36135a)) {
            return 1;
        }
        if (Intrinsics.areEqual(aVar, Todo.a.C1120a.f36133a)) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Todo.a a(int i) {
        if (i == 1) {
            return Todo.a.c.f36135a;
        }
        if (i != 2) {
            return Todo.a.b.f36134a;
        }
        return Todo.a.C1120a.f36133a;
    }

    public final byte[] a(Long millis, int bits) {
        byte[] bArrR = tet.r(millis != null ? millis.longValue() / ((long) 1000) : 0L, bits);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(seconds, bits)");
        return bArrR;
    }

    public final Long a(byte[] bArr, int i, int i2) {
        Long lValueOf;
        if (i2 >= bArr.length) {
            lValueOf = null;
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            lValueOf = Long.valueOf(c3.b(bArr, i, i2));
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
}
