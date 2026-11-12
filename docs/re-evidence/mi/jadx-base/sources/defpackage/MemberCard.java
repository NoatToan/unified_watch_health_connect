package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: el, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lel;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "byteArray", "[B", PluginDeviceInfo.FMODEL, "()[B", "nameID", RealNameWebViewActivity.NUMBER, "data", "", "codeType", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BB)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class MemberCard implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a z = new a(null);

    /* JADX INFO: renamed from: t, reason: from toString */
    @NotNull
    public final String nameID;

    /* JADX INFO: renamed from: u, reason: from toString */
    @NotNull
    public final String number;

    /* JADX INFO: renamed from: v, reason: from toString */
    @NotNull
    public final String data;

    /* JADX INFO: renamed from: w, reason: from toString */
    public final byte codeType;

    /* JADX INFO: renamed from: x, reason: from toString */
    public final byte color;

    @NotNull
    public final byte[] y;

    /* JADX INFO: renamed from: el$a */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lel$a;", "", "Ljava/nio/ByteBuffer;", "byteBuffer", "Lel;", PluginDeviceInfo.FMODEL, "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MemberCard a(@NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return new MemberCard(z2.q(byteBuffer), z2.q(byteBuffer), z2.q(byteBuffer), byteBuffer.get(), byteBuffer.get());
        }
    }

    public MemberCard(@NotNull String nameID, @NotNull String number, @NotNull String data, byte b2, byte b3) {
        Intrinsics.checkNotNullParameter(nameID, "nameID");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(data, "data");
        this.nameID = nameID;
        this.number = number;
        this.data = data;
        this.codeType = b2;
        this.color = b3;
        ArrayList arrayList = new ArrayList();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = nameID.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        arrayList.addAll(ArraysKt___ArraysKt.toList(bytes));
        arrayList.add((byte) 0);
        byte[] bytes2 = number.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        arrayList.addAll(ArraysKt___ArraysKt.toList(bytes2));
        arrayList.add((byte) 0);
        byte[] bytes3 = data.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        arrayList.addAll(ArraysKt___ArraysKt.toList(bytes3));
        arrayList.add((byte) 0);
        arrayList.add(Byte.valueOf(b2));
        arrayList.add(Byte.valueOf(b3));
        this.y = CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getY() {
        return this.y;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberCard)) {
            return false;
        }
        MemberCard memberCard = (MemberCard) other;
        return Intrinsics.areEqual(this.nameID, memberCard.nameID) && Intrinsics.areEqual(this.number, memberCard.number) && Intrinsics.areEqual(this.data, memberCard.data) && this.codeType == memberCard.codeType && this.color == memberCard.color;
    }

    public int hashCode() {
        return (((((((this.nameID.hashCode() * 31) + this.number.hashCode()) * 31) + this.data.hashCode()) * 31) + Byte.hashCode(this.codeType)) * 31) + Byte.hashCode(this.color);
    }

    @NotNull
    public String toString() {
        return "MemberCard(nameID=" + this.nameID + ", number=" + this.number + ", data=" + this.data + ", codeType=" + ((int) this.codeType) + ", color=" + ((int) this.color) + ')';
    }
}
