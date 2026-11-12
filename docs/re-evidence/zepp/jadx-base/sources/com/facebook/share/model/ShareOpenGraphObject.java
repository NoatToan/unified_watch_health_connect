package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.NativeProtocol;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0010\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/facebook/share/model/ShareOpenGraphObject;", "Lcom/facebook/share/model/ShareOpenGraphValueContainer;", "Lcom/facebook/share/model/ShareOpenGraphObject$Builder;", "builder", "<init>", "(Lcom/facebook/share/model/ShareOpenGraphObject$Builder;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Companion", ShareStoryContent.Builder.k, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Builder> {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new Parcelable.Creator<ShareOpenGraphObject>() { // from class: com.facebook.share.model.ShareOpenGraphObject$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @Nullable
        public ShareOpenGraphObject createFromParcel(@NotNull Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareOpenGraphObject[] newArray(int size) {
            return new ShareOpenGraphObject[size];
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/share/model/ShareOpenGraphObject$Builder;", "Lcom/facebook/share/model/ShareOpenGraphValueContainer$Builder;", "Lcom/facebook/share/model/ShareOpenGraphObject;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/os/Parcel;", "parcel", "readFrom$facebook_common_release", "(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareOpenGraphObject$Builder;", "readFrom", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder extends ShareOpenGraphValueContainer.Builder<ShareOpenGraphObject, Builder> {
        public Builder() {
            putBoolean(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY, true);
        }

        @Nullable
        public final Builder readFrom$facebook_common_release(@NotNull Parcel parcel) {
            return readFrom((ShareOpenGraphObject) parcel.readParcelable(ShareOpenGraphObject.class.getClassLoader()));
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareOpenGraphObject build() {
            return new ShareOpenGraphObject(this, null);
        }
    }

    public /* synthetic */ ShareOpenGraphObject(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private ShareOpenGraphObject(Builder builder) {
        super(builder);
    }

    public ShareOpenGraphObject(@Nullable Parcel parcel) {
        super(parcel);
    }
}
