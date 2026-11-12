package com.huami.member_card.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/member_card/bean/MemberCardProperty;", "", "", "component1", "component2", "component3", "", "component4", "component5", "name", "number", "content", "color", "codeType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getNumber", "c", "getContent", GoogleApiAvailabilityLight.a, "B", "getColor", "()B", "e", "getCodeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BB)V", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MemberCardProperty {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String number;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final byte color;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final byte codeType;

    public MemberCardProperty(@NotNull String str, @NotNull String str2, @NotNull String str3, byte b, byte b2) {
        this.name = str;
        this.number = str2;
        this.content = str3;
        this.color = b;
        this.codeType = b2;
    }

    public static /* synthetic */ MemberCardProperty copy$default(MemberCardProperty memberCardProperty, String str, String str2, String str3, byte b, byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memberCardProperty.name;
        }
        if ((i & 2) != 0) {
            str2 = memberCardProperty.number;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = memberCardProperty.content;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            b = memberCardProperty.color;
        }
        byte b3 = b;
        if ((i & 16) != 0) {
            b2 = memberCardProperty.codeType;
        }
        return memberCardProperty.copy(str, str4, str5, b3, b2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte getCodeType() {
        return this.codeType;
    }

    @NotNull
    public final MemberCardProperty copy(@NotNull String name, @NotNull String number, @NotNull String content, byte color, byte codeType) {
        return new MemberCardProperty(name, number, content, color, codeType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberCardProperty)) {
            return false;
        }
        MemberCardProperty memberCardProperty = (MemberCardProperty) other;
        return Intrinsics.areEqual(this.name, memberCardProperty.name) && Intrinsics.areEqual(this.number, memberCardProperty.number) && Intrinsics.areEqual(this.content, memberCardProperty.content) && this.color == memberCardProperty.color && this.codeType == memberCardProperty.codeType;
    }

    public final byte getCodeType() {
        return this.codeType;
    }

    public final byte getColor() {
        return this.color;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.number.hashCode()) * 31) + this.content.hashCode()) * 31) + this.color) * 31) + this.codeType;
    }

    @NotNull
    public String toString() {
        return "MemberCardProperty(name=" + this.name + ", number=" + this.number + ", content=" + this.content + ", color=" + ((int) this.color) + ", codeType=" + ((int) this.codeType) + ")";
    }
}
