package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1345b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence g;
    public final long h;
    public List<CustomAction> i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f1346k;
    public PlaybackState l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Actions {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CustomAction> f1347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1348b;
        public long c;
        public long d;
        public float e;
        public long f;
        public int g;
        public CharSequence h;
        public long i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Bundle f1349k;

        public Builder() {
            this.f1347a = new ArrayList();
            this.j = -1L;
        }

        public Builder addCustomAction(String str, String str2, int i) {
            return addCustomAction(new CustomAction(str, str2, i, null));
        }

        public PlaybackStateCompat build() {
            return new PlaybackStateCompat(this.f1348b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.f1347a, this.j, this.f1349k);
        }

        public Builder setActions(long j) {
            this.f = j;
            return this;
        }

        public Builder setActiveQueueItemId(long j) {
            this.j = j;
            return this;
        }

        public Builder setBufferedPosition(long j) {
            this.d = j;
            return this;
        }

        @Deprecated
        public Builder setErrorMessage(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.f1349k = bundle;
            return this;
        }

        public Builder setState(int i, long j, float f) {
            return setState(i, j, f, SystemClock.elapsedRealtime());
        }

        public Builder addCustomAction(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.f1347a.add(customAction);
            return this;
        }

        public Builder setErrorMessage(int i, CharSequence charSequence) {
            this.g = i;
            this.h = charSequence;
            return this;
        }

        public Builder setState(int i, long j, float f, long j2) {
            this.f1348b = i;
            this.c = j;
            this.i = j2;
            this.e = f;
            return this;
        }

        public Builder(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f1347a = arrayList;
            this.j = -1L;
            this.f1348b = playbackStateCompat.f1344a;
            this.c = playbackStateCompat.f1345b;
            this.e = playbackStateCompat.d;
            this.i = playbackStateCompat.h;
            this.d = playbackStateCompat.c;
            this.f = playbackStateCompat.e;
            this.g = playbackStateCompat.f;
            this.h = playbackStateCompat.g;
            List<CustomAction> list = playbackStateCompat.i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.j;
            this.f1349k = playbackStateCompat.f1346k;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface State {
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1344a = i;
        this.f1345b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = i2;
        this.g = charSequence;
        this.h = j4;
        this.i = new ArrayList(list);
        this.j = j5;
        this.f1346k = bundle;
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            Iterator<PlaybackState.CustomAction> it = customActions.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.fromCustomAction(it.next()));
            }
        }
        Bundle extras = playbackState.getExtras();
        MediaSessionCompat.ensureClassLoader(extras);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras);
        playbackStateCompat.l = playbackState;
        return playbackStateCompat;
    }

    public static int toKeyCode(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getActions() {
        return this.e;
    }

    public long getActiveQueueItemId() {
        return this.j;
    }

    public long getBufferedPosition() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getCurrentPosition(Long l) {
        return Math.max(0L, this.f1345b + ((long) (this.d * (l != null ? l.longValue() : SystemClock.elapsedRealtime() - this.h))));
    }

    public List<CustomAction> getCustomActions() {
        return this.i;
    }

    public int getErrorCode() {
        return this.f;
    }

    public CharSequence getErrorMessage() {
        return this.g;
    }

    public Bundle getExtras() {
        return this.f1346k;
    }

    public long getLastPositionUpdateTime() {
        return this.h;
    }

    public float getPlaybackSpeed() {
        return this.d;
    }

    public Object getPlaybackState() {
        if (this.l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f1344a, this.f1345b, this.d, this.h);
            builder.setBufferedPosition(this.c);
            builder.setActions(this.e);
            builder.setErrorMessage(this.g);
            Iterator<CustomAction> it = this.i.iterator();
            while (it.hasNext()) {
                builder.addCustomAction((PlaybackState.CustomAction) it.next().getCustomAction());
            }
            builder.setActiveQueueItemId(this.j);
            builder.setExtras(this.f1346k);
            this.l = builder.build();
        }
        return this.l;
    }

    public long getPosition() {
        return this.f1345b;
    }

    public int getState() {
        return this.f1344a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f1344a + ", position=" + this.f1345b + ", buffered position=" + this.c + ", speed=" + this.d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1344a);
        parcel.writeLong(this.f1345b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.f1346k);
        parcel.writeInt(this.f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f1351b;
        public final int c;
        public final Bundle d;
        public PlaybackState.CustomAction e;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f1352a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CharSequence f1353b;
            public final int c;
            public Bundle d;

            public Builder(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f1352a = str;
                this.f1353b = charSequence;
                this.c = i;
            }

            public CustomAction build() {
                return new CustomAction(this.f1352a, this.f1353b, this.c, this.d);
            }

            public Builder setExtras(Bundle bundle) {
                this.d = bundle;
                return this;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1350a = str;
            this.f1351b = charSequence;
            this.c = i;
            this.d = bundle;
        }

        public static CustomAction fromCustomAction(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            MediaSessionCompat.ensureClassLoader(extras);
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            customAction2.e = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAction() {
            return this.f1350a;
        }

        public Object getCustomAction() {
            PlaybackState.CustomAction customAction = this.e;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.f1350a, this.f1351b, this.c);
            builder.setExtras(this.d);
            return builder.build();
        }

        public Bundle getExtras() {
            return this.d;
        }

        public int getIcon() {
            return this.c;
        }

        public CharSequence getName() {
            return this.f1351b;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f1351b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1350a);
            TextUtils.writeToParcel(this.f1351b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }

        public CustomAction(Parcel parcel) {
            this.f1350a = parcel.readString();
            this.f1351b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1344a = parcel.readInt();
        this.f1345b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.f1346k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
    }
}
