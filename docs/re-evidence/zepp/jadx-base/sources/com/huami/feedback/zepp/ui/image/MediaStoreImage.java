package com.huami.feedback.zepp.ui.image;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import defpackage.b;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/feedback/zepp/ui/image/MediaStoreImage;", "", "", "component1", "", "component2", "Ljava/util/Date;", "component3", "Landroid/net/Uri;", "component4", "id", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, "dateAdded", "contentUri", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "Ljava/util/Date;", "getDateAdded", "()Ljava/util/Date;", GoogleApiAvailabilityLight.a, "Landroid/net/Uri;", "getContentUri", "()Landroid/net/Uri;", "<init>", "(JLjava/lang/String;Ljava/util/Date;Landroid/net/Uri;)V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MediaStoreImage {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date dateAdded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Uri contentUri;

    public MediaStoreImage(long j, @NotNull String str, @NotNull Date date, @NotNull Uri uri) {
        this.id = j;
        this.displayName = str;
        this.dateAdded = date;
        this.contentUri = uri;
    }

    public static /* synthetic */ MediaStoreImage copy$default(MediaStoreImage mediaStoreImage, long j, String str, Date date, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mediaStoreImage.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = mediaStoreImage.displayName;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            date = mediaStoreImage.dateAdded;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            uri = mediaStoreImage.contentUri;
        }
        return mediaStoreImage.copy(j2, str2, date2, uri);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getDateAdded() {
        return this.dateAdded;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Uri getContentUri() {
        return this.contentUri;
    }

    @NotNull
    public final MediaStoreImage copy(long id, @NotNull String displayName, @NotNull Date dateAdded, @NotNull Uri contentUri) {
        return new MediaStoreImage(id, displayName, dateAdded, contentUri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaStoreImage)) {
            return false;
        }
        MediaStoreImage mediaStoreImage = (MediaStoreImage) other;
        return this.id == mediaStoreImage.id && Intrinsics.areEqual(this.displayName, mediaStoreImage.displayName) && Intrinsics.areEqual(this.dateAdded, mediaStoreImage.dateAdded) && Intrinsics.areEqual(this.contentUri, mediaStoreImage.contentUri);
    }

    @NotNull
    public final Uri getContentUri() {
        return this.contentUri;
    }

    @NotNull
    public final Date getDateAdded() {
        return this.dateAdded;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((b.a(this.id) * 31) + this.displayName.hashCode()) * 31) + this.dateAdded.hashCode()) * 31) + this.contentUri.hashCode();
    }

    @NotNull
    public String toString() {
        return "MediaStoreImage(id=" + this.id + ", displayName=" + this.displayName + ", dateAdded=" + this.dateAdded + ", contentUri=" + this.contentUri + ')';
    }
}
