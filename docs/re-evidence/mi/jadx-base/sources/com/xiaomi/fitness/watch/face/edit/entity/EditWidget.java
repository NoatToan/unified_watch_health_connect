package com.xiaomi.fitness.watch.face.edit.entity;

import android.graphics.Bitmap;
import com.miui.tsmclient.entity.CardInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;", "", "keyName", "", "widgetName", CardInfo.KEY_CARD_GROUP_NAME, "widgetBitmap", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getKeyName", "()Ljava/lang/String;", "getWidgetName", "getGroupName", "getWidgetBitmap", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EditWidget {

    @NotNull
    private final String groupName;

    @NotNull
    private final String keyName;

    @Nullable
    private final Bitmap widgetBitmap;

    @NotNull
    private final String widgetName;

    public EditWidget(@NotNull String keyName, @NotNull String widgetName, @NotNull String groupName, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        this.keyName = keyName;
        this.widgetName = widgetName;
        this.groupName = groupName;
        this.widgetBitmap = bitmap;
    }

    public static /* synthetic */ EditWidget copy$default(EditWidget editWidget, String str, String str2, String str3, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editWidget.keyName;
        }
        if ((i & 2) != 0) {
            str2 = editWidget.widgetName;
        }
        if ((i & 4) != 0) {
            str3 = editWidget.groupName;
        }
        if ((i & 8) != 0) {
            bitmap = editWidget.widgetBitmap;
        }
        return editWidget.copy(str, str2, str3, bitmap);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyName() {
        return this.keyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bitmap getWidgetBitmap() {
        return this.widgetBitmap;
    }

    @NotNull
    public final EditWidget copy(@NotNull String keyName, @NotNull String widgetName, @NotNull String groupName, @Nullable Bitmap widgetBitmap) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        return new EditWidget(keyName, widgetName, groupName, widgetBitmap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditWidget)) {
            return false;
        }
        EditWidget editWidget = (EditWidget) other;
        return Intrinsics.areEqual(this.keyName, editWidget.keyName) && Intrinsics.areEqual(this.widgetName, editWidget.widgetName) && Intrinsics.areEqual(this.groupName, editWidget.groupName) && Intrinsics.areEqual(this.widgetBitmap, editWidget.widgetBitmap);
    }

    @NotNull
    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final String getKeyName() {
        return this.keyName;
    }

    @Nullable
    public final Bitmap getWidgetBitmap() {
        return this.widgetBitmap;
    }

    @NotNull
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iHashCode = ((((this.keyName.hashCode() * 31) + this.widgetName.hashCode()) * 31) + this.groupName.hashCode()) * 31;
        Bitmap bitmap = this.widgetBitmap;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "EditWidget(keyName=" + this.keyName + ", widgetName=" + this.widgetName + ", groupName=" + this.groupName + ", widgetBitmap=" + this.widgetBitmap + ")";
    }
}
