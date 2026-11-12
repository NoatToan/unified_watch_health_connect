package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardArtsListInfo extends CommonResponseInfo {

    @SerializedName("data")
    private List<ArtInfo> mArtInfoList;

    public static class ArtInfo {

        @SerializedName("createdAt")
        private long mCreatedAt;

        @SerializedName("id")
        private int mId;

        @SerializedName("imageUrl")
        private String mImageUrl;

        @SerializedName("modifiedAt")
        private long mModifiedAt;

        @SerializedName("productId")
        private String mProductId;

        @SerializedName(TSMAuthContants.PARAM_VALID)
        private boolean mValid;

        public long getCreatedAt() {
            return this.mCreatedAt;
        }

        public int getId() {
            return this.mId;
        }

        public String getImageUrl() {
            return this.mImageUrl;
        }

        public long getModifiedAt() {
            return this.mModifiedAt;
        }

        public String getProductId() {
            return this.mProductId;
        }

        public boolean isValid() {
            return this.mValid;
        }
    }

    public List<ArtInfo> getArtInfoList() {
        List<ArtInfo> list = this.mArtInfoList;
        return list == null ? Collections.emptyList() : list;
    }

    public boolean isEmpty() {
        List<ArtInfo> list = this.mArtInfoList;
        if (list == null) {
            return false;
        }
        return list.isEmpty();
    }
}
