package com.huami.bluetooth.profile.channel.module.notification.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactItemModify;", "", "", "component1", "component2", "", "component3", "component4", "component5", "pkg", "contactOld", "vibrationOld", "contactNew", "vibrationNew", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPkg", "()Ljava/lang/String;", "b", "getContactOld", "c", LogUtil.I, "getVibrationOld", "()I", GoogleApiAvailabilityLight.a, "getContactNew", "e", "getVibrationNew", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ContactItemModify {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String pkg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String contactOld;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int vibrationOld;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String contactNew;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int vibrationNew;

    public ContactItemModify(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        this.pkg = str;
        this.contactOld = str2;
        this.vibrationOld = i;
        this.contactNew = str3;
        this.vibrationNew = i2;
    }

    public static /* synthetic */ ContactItemModify copy$default(ContactItemModify contactItemModify, String str, String str2, int i, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = contactItemModify.pkg;
        }
        if ((i3 & 2) != 0) {
            str2 = contactItemModify.contactOld;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = contactItemModify.vibrationOld;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str3 = contactItemModify.contactNew;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = contactItemModify.vibrationNew;
        }
        return contactItemModify.copy(str, str4, i4, str5, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContactOld() {
        return this.contactOld;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVibrationOld() {
        return this.vibrationOld;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContactNew() {
        return this.contactNew;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVibrationNew() {
        return this.vibrationNew;
    }

    @NotNull
    public final ContactItemModify copy(@NotNull String pkg, @NotNull String contactOld, int vibrationOld, @NotNull String contactNew, int vibrationNew) {
        return new ContactItemModify(pkg, contactOld, vibrationOld, contactNew, vibrationNew);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactItemModify)) {
            return false;
        }
        ContactItemModify contactItemModify = (ContactItemModify) other;
        return Intrinsics.areEqual(this.pkg, contactItemModify.pkg) && Intrinsics.areEqual(this.contactOld, contactItemModify.contactOld) && this.vibrationOld == contactItemModify.vibrationOld && Intrinsics.areEqual(this.contactNew, contactItemModify.contactNew) && this.vibrationNew == contactItemModify.vibrationNew;
    }

    @NotNull
    public final String getContactNew() {
        return this.contactNew;
    }

    @NotNull
    public final String getContactOld() {
        return this.contactOld;
    }

    @NotNull
    public final String getPkg() {
        return this.pkg;
    }

    public final int getVibrationNew() {
        return this.vibrationNew;
    }

    public final int getVibrationOld() {
        return this.vibrationOld;
    }

    public int hashCode() {
        return (((((((this.pkg.hashCode() * 31) + this.contactOld.hashCode()) * 31) + this.vibrationOld) * 31) + this.contactNew.hashCode()) * 31) + this.vibrationNew;
    }

    @NotNull
    public String toString() {
        return "ContactItemModify(pkg=" + this.pkg + ", contactOld=" + this.contactOld + ", vibrationOld=" + this.vibrationOld + ", contactNew=" + this.contactNew + ", vibrationNew=" + this.vibrationNew + ')';
    }
}
