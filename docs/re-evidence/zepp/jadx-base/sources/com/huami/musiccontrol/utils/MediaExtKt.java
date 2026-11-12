package com.huami.musiccontrol.utils;

import android.media.MediaMetadata;
import android.media.RemoteController;
import android.media.session.PlaybackState;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.RequiresApi;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.MusicState;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u00060\u0006R\u00020\u0007\u001a\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\r\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u000e¨\u0006\u000f"}, d2 = {"Landroid/media/MediaMetadata;", "Lcom/huami/musiccontrol/bean/MusicInfo;", "getMusicInfo", "Landroid/media/session/PlaybackState;", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "getPlayingInfo", "Landroid/media/RemoteController$MetadataEditor;", "Landroid/media/RemoteController;", "", "state", "", "position", "fromState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "Landroid/support/v4/media/MediaMetadataCompat;", "music_control_release"}, k = 2, mv = {1, 4, 1})
public final class MediaExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef objectRef) {
            super(0);
            this.a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get title failed and get from desc, value is: " + ((String) this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "invalid duration: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ PlaybackStateCompat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PlaybackStateCompat playbackStateCompat) {
            super(0);
            this.a = playbackStateCompat;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "invalid position: " + this.a.getPosition();
        }
    }

    @NotNull
    public static final MusicPlayInfo fromState(int i, long j) {
        MusicState musicState;
        if (i != 1) {
            musicState = i != 3 ? MusicState.PAUSED : MusicState.PLAYING;
        } else {
            musicState = MusicState.STOPPED;
        }
        return new MusicPlayInfo(musicState, j);
    }

    public static /* synthetic */ MusicPlayInfo fromState$default(int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = -1;
        }
        return fromState(i, j);
    }

    @RequiresApi(21)
    @NotNull
    public static final MusicInfo getMusicInfo(@NotNull MediaMetadata mediaMetadata) {
        return new MusicInfo(mediaMetadata.getText(MediaMetadataCompat.METADATA_KEY_ARTIST).toString(), mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM), mediaMetadata.getText(MediaMetadataCompat.METADATA_KEY_TITLE).toString(), mediaMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION));
    }

    @RequiresApi(21)
    @NotNull
    public static final MusicPlayInfo getPlayingInfo(@NotNull PlaybackState playbackState) {
        MusicState musicState;
        int state = playbackState.getState();
        if (state == 1) {
            musicState = MusicState.STOPPED;
        } else if (state != 3) {
            musicState = state != 6 ? MusicState.PAUSED : MusicState.BUFFERING;
        } else {
            musicState = MusicState.PLAYING;
        }
        return new MusicPlayInfo(musicState, playbackState.getPosition());
    }

    @NotNull
    public static final MusicInfo getMusicInfo(@NotNull RemoteController.MetadataEditor metadataEditor) {
        return new MusicInfo(metadataEditor.getString(2, null), metadataEditor.getString(1, null), metadataEditor.getString(7, null), metadataEditor.getLong(9, -1L));
    }

    @NotNull
    public static final MusicPlayInfo getPlayingInfo(@NotNull PlaybackStateCompat playbackStateCompat) {
        MusicState musicState;
        int state = playbackStateCompat.getState();
        if (state == 1) {
            musicState = MusicState.STOPPED;
        } else if (state != 3) {
            musicState = MusicState.PAUSED;
        } else {
            musicState = MusicState.PLAYING;
        }
        long position = 0;
        if (playbackStateCompat.getPosition() < 0) {
            HMLog.info("OuterPlayer", new c(playbackStateCompat));
        } else {
            position = playbackStateCompat.getPosition();
        }
        return new MusicPlayInfo(musicState, position);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final MusicInfo getMusicInfo(@NotNull MediaMetadataCompat mediaMetadataCompat) {
        CharSequence description;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CharSequence text = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_TITLE);
        T string = text != null ? text.toString() : 0;
        objectRef.element = string;
        if (((String) string) == null) {
            MediaDescriptionCompat description2 = mediaMetadataCompat.getDescription();
            objectRef.element = (description2 == null || (description = description2.getDescription()) == null) ? 0 : description.toString();
            HMLog.info("OuterPlayer", new a(objectRef));
        }
        CharSequence text2 = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_ARTIST);
        String string2 = text2 != null ? text2.toString() : null;
        String string3 = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_ALBUM);
        long j = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (j < 0) {
            HMLog.info("OuterPlayer", new b(j));
            j = 1;
        }
        return new MusicInfo(string2, string3, (String) objectRef.element, j);
    }
}
