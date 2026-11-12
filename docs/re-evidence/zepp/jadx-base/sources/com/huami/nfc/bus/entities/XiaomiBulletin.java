package com.huami.nfc.bus.entities;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "", "", "component1", "component2", "component3", "Lcom/huami/nfc/bus/entities/ButtonInfo;", "component4", "component5", "id", "title", "content", "positiveButton", "negativeButton", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getTitle", "c", "getContent", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/bus/entities/ButtonInfo;", "getPositiveButton", "()Lcom/huami/nfc/bus/entities/ButtonInfo;", "e", "getNegativeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/nfc/bus/entities/ButtonInfo;Lcom/huami/nfc/bus/entities/ButtonInfo;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class XiaomiBulletin {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("content")
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("positiveButton")
    @Nullable
    private final ButtonInfo positiveButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("negativeButton")
    @Nullable
    private final ButtonInfo negativeButton;

    public XiaomiBulletin(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable ButtonInfo buttonInfo, @Nullable ButtonInfo buttonInfo2) {
        this.id = str;
        this.title = str2;
        this.content = str3;
        this.positiveButton = buttonInfo;
        this.negativeButton = buttonInfo2;
    }

    public static /* synthetic */ XiaomiBulletin copy$default(XiaomiBulletin xiaomiBulletin, String str, String str2, String str3, ButtonInfo buttonInfo, ButtonInfo buttonInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xiaomiBulletin.id;
        }
        if ((i & 2) != 0) {
            str2 = xiaomiBulletin.title;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = xiaomiBulletin.content;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            buttonInfo = xiaomiBulletin.positiveButton;
        }
        ButtonInfo buttonInfo3 = buttonInfo;
        if ((i & 16) != 0) {
            buttonInfo2 = xiaomiBulletin.negativeButton;
        }
        return xiaomiBulletin.copy(str, str4, str5, buttonInfo3, buttonInfo2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ButtonInfo getPositiveButton() {
        return this.positiveButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ButtonInfo getNegativeButton() {
        return this.negativeButton;
    }

    @NotNull
    public final XiaomiBulletin copy(@NotNull String id, @NotNull String title, @NotNull String content, @Nullable ButtonInfo positiveButton, @Nullable ButtonInfo negativeButton) {
        return new XiaomiBulletin(id, title, content, positiveButton, negativeButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XiaomiBulletin)) {
            return false;
        }
        XiaomiBulletin xiaomiBulletin = (XiaomiBulletin) other;
        return Intrinsics.areEqual(this.id, xiaomiBulletin.id) && Intrinsics.areEqual(this.title, xiaomiBulletin.title) && Intrinsics.areEqual(this.content, xiaomiBulletin.content) && Intrinsics.areEqual(this.positiveButton, xiaomiBulletin.positiveButton) && Intrinsics.areEqual(this.negativeButton, xiaomiBulletin.negativeButton);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final ButtonInfo getNegativeButton() {
        return this.negativeButton;
    }

    @Nullable
    public final ButtonInfo getPositiveButton() {
        return this.positiveButton;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31;
        ButtonInfo buttonInfo = this.positiveButton;
        int iHashCode2 = (iHashCode + (buttonInfo == null ? 0 : buttonInfo.hashCode())) * 31;
        ButtonInfo buttonInfo2 = this.negativeButton;
        return iHashCode2 + (buttonInfo2 != null ? buttonInfo2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "XiaomiBulletin(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ')';
    }
}
