package com.twitter.sdk.android.core.internal.scribe;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class ScribeItem implements Serializable {
    public static final int TYPE_MESSAGE = 6;
    public static final int TYPE_TWEET = 0;
    public static final int TYPE_USER = 3;

    @SerializedName("card_event")
    public final CardEvent cardEvent;

    @SerializedName("description")
    public final String description;

    @SerializedName("id")
    public final Long id;

    @SerializedName("item_type")
    public final Integer itemType;

    @SerializedName("media_details")
    public final MediaDetails mediaDetails;

    public static class Builder {
        private Integer a;
        private Long b;
        private String c;
        private CardEvent d;
        private MediaDetails e;

        public ScribeItem build() {
            return new ScribeItem(this.a, this.b, this.c, this.d, this.e);
        }

        public Builder setCardEvent(CardEvent cardEvent) {
            this.d = cardEvent;
            return this;
        }

        public Builder setDescription(String str) {
            this.c = str;
            return this;
        }

        public Builder setId(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public Builder setItemType(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public Builder setMediaDetails(MediaDetails mediaDetails) {
            this.e = mediaDetails;
            return this;
        }
    }

    public static class CardEvent implements Serializable {

        @SerializedName("promotion_card_type")
        public final int a;

        public CardEvent(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.a == ((CardEvent) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public static class MediaDetails implements Serializable {
        public static final String GIF_TYPE = "animated_gif";
        public static final int TYPE_AMPLIFY = 2;
        public static final int TYPE_ANIMATED_GIF = 3;
        public static final int TYPE_CONSUMER = 1;
        public static final int TYPE_VINE = 4;

        @SerializedName(DownloadService.KEY_CONTENT_ID)
        public final long contentId;

        @SerializedName(MessengerShareContentUtility.MEDIA_TYPE)
        public final int mediaType;

        @SerializedName("publisher_id")
        public final long publisherId;

        public MediaDetails(long j, int i, long j2) {
            this.contentId = j;
            this.mediaType = i;
            this.publisherId = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaDetails mediaDetails = (MediaDetails) obj;
            return this.contentId == mediaDetails.contentId && this.mediaType == mediaDetails.mediaType && this.publisherId == mediaDetails.publisherId;
        }

        public int hashCode() {
            long j = this.contentId;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + this.mediaType) * 31;
            long j2 = this.publisherId;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }
    }

    public static MediaDetails a(long j, Card card) {
        return new MediaDetails(j, 4, Long.valueOf(VineCardUtils.getPublisherId(card)).longValue());
    }

    public static MediaDetails b(long j, MediaEntity mediaEntity) {
        return new MediaDetails(j, c(mediaEntity), mediaEntity.id);
    }

    public static int c(MediaEntity mediaEntity) {
        return MediaDetails.GIF_TYPE.equals(mediaEntity.type) ? 3 : 1;
    }

    public static ScribeItem fromMediaEntity(long j, MediaEntity mediaEntity) {
        return new Builder().setItemType(0).setId(j).setMediaDetails(b(j, mediaEntity)).build();
    }

    public static ScribeItem fromMessage(String str) {
        return new Builder().setItemType(6).setDescription(str).build();
    }

    public static ScribeItem fromTweet(Tweet tweet) {
        return new Builder().setItemType(0).setId(tweet.id).build();
    }

    public static ScribeItem fromTweetCard(long j, Card card) {
        return new Builder().setItemType(0).setId(j).setMediaDetails(a(j, card)).build();
    }

    public static ScribeItem fromUser(User user) {
        return new Builder().setItemType(3).setId(user.id).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScribeItem scribeItem = (ScribeItem) obj;
        Integer num = this.itemType;
        if (num == null ? scribeItem.itemType != null : !num.equals(scribeItem.itemType)) {
            return false;
        }
        Long l = this.id;
        if (l == null ? scribeItem.id != null : !l.equals(scribeItem.id)) {
            return false;
        }
        String str = this.description;
        if (str == null ? scribeItem.description != null : !str.equals(scribeItem.description)) {
            return false;
        }
        CardEvent cardEvent = this.cardEvent;
        if (cardEvent == null ? scribeItem.cardEvent != null : !cardEvent.equals(scribeItem.cardEvent)) {
            return false;
        }
        MediaDetails mediaDetails = this.mediaDetails;
        MediaDetails mediaDetails2 = scribeItem.mediaDetails;
        if (mediaDetails != null) {
            if (mediaDetails.equals(mediaDetails2)) {
                return true;
            }
        } else if (mediaDetails2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.itemType;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Long l = this.id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        CardEvent cardEvent = this.cardEvent;
        int iHashCode4 = (iHashCode3 + (cardEvent != null ? cardEvent.hashCode() : 0)) * 31;
        MediaDetails mediaDetails = this.mediaDetails;
        return iHashCode4 + (mediaDetails != null ? mediaDetails.hashCode() : 0);
    }

    private ScribeItem(Integer num, Long l, String str, CardEvent cardEvent, MediaDetails mediaDetails) {
        this.itemType = num;
        this.id = l;
        this.description = str;
        this.cardEvent = cardEvent;
        this.mediaDetails = mediaDetails;
    }
}
