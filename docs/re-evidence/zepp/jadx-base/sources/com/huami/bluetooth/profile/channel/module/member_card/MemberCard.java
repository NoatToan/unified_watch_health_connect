package com.huami.bluetooth.profile.channel.module.member_card;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010)\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "", "component4", "component5", "nameID", "number", "data", "codeType", "color", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getNameID", "()Ljava/lang/String;", "b", "getNumber", "c", "getData", GoogleApiAvailabilityLight.a, "B", "getCodeType", "()B", "e", "getColor", "", "f", "[B", "getByteArray", "()[B", "byteArray", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BB)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MemberCard implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String nameID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String number;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final byte codeType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final byte color;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final byte[] byteArray;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard$Companion;", "", "Ljava/nio/ByteBuffer;", "byteBuffer", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "toMemberCard", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MemberCard toMemberCard(@NotNull ByteBuffer byteBuffer) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return new MemberCard(ByteBufferExtendsKt.getString(byteBuffer), ByteBufferExtendsKt.getString(byteBuffer), ByteBufferExtendsKt.getString(byteBuffer), byteBuffer.get(), byteBuffer.get());
        }
    }

    public MemberCard(@NotNull String str, @NotNull String str2, @NotNull String str3, byte b, byte b2) {
        this.nameID = str;
        this.number = str2;
        this.data = str3;
        this.codeType = b;
        this.color = b2;
        ArrayList arrayList = new ArrayList();
        String nameID = getNameID();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(nameID, "null cannot be cast to non-null type java.lang.String");
        arrayList.addAll(ArraysKt___ArraysKt.toList(nameID.getBytes(charset)));
        byte b3 = (byte) 0;
        arrayList.add(Byte.valueOf(b3));
        String number = getNumber();
        Objects.requireNonNull(number, "null cannot be cast to non-null type java.lang.String");
        arrayList.addAll(ArraysKt___ArraysKt.toList(number.getBytes(charset)));
        arrayList.add(Byte.valueOf(b3));
        String data = getData();
        Objects.requireNonNull(data, "null cannot be cast to non-null type java.lang.String");
        arrayList.addAll(ArraysKt___ArraysKt.toList(data.getBytes(charset)));
        arrayList.add(Byte.valueOf(b3));
        arrayList.add(Byte.valueOf(getCodeType()));
        arrayList.add(Byte.valueOf(getColor()));
        Unit unit = Unit.INSTANCE;
        this.byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    public static /* synthetic */ MemberCard copy$default(MemberCard memberCard, String str, String str2, String str3, byte b, byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memberCard.nameID;
        }
        if ((i & 2) != 0) {
            str2 = memberCard.number;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = memberCard.data;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            b = memberCard.codeType;
        }
        byte b3 = b;
        if ((i & 16) != 0) {
            b2 = memberCard.color;
        }
        return memberCard.copy(str, str4, str5, b3, b2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNameID() {
        return this.nameID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte getCodeType() {
        return this.codeType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte getColor() {
        return this.color;
    }

    @NotNull
    public final MemberCard copy(@NotNull String nameID, @NotNull String number, @NotNull String data, byte codeType, byte color) {
        return new MemberCard(nameID, number, data, codeType, color);
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

    @NotNull
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    public final byte getCodeType() {
        return this.codeType;
    }

    public final byte getColor() {
        return this.color;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getNameID() {
        return this.nameID;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return (((((((this.nameID.hashCode() * 31) + this.number.hashCode()) * 31) + this.data.hashCode()) * 31) + this.codeType) * 31) + this.color;
    }

    @NotNull
    public String toString() {
        return "MemberCard(nameID=" + this.nameID + ", number=" + this.number + ", data=" + this.data + ", codeType=" + ((int) this.codeType) + ", color=" + ((int) this.color) + ')';
    }
}
