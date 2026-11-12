package ohos.ace.plugin.playerplugin;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class PlayerPlugin {
    private static final String LOG_TAG = "PlayerPlugin";
    private static final int PLAYER_CODEC_MIME_LENGTH = 5;
    public static final int PLAYER_INFO_TYPE_BITRATEDONE = 3;
    public static final int PLAYER_INFO_TYPE_DURATION_UPDATE = 15;
    public static final int PLAYER_INFO_TYPE_EOS = 4;
    public static final int PLAYER_INFO_TYPE_POSITION_UPDATE = 6;
    public static final int PLAYER_INFO_TYPE_SPEEDDONE = 2;
    public static final int PLAYER_INFO_TYPE_STATE_CHANGE = 5;
    public static final int PLAYER_STATE_ERROR = 0;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_INITIALIZED = 2;
    public static final int PLAYER_STATE_PAUSED = 6;
    public static final int PLAYER_STATE_PLAYBACK_COMPLETE = 8;
    public static final int PLAYER_STATE_PREPARED = 4;
    public static final int PLAYER_STATE_RELEASED = 9;
    public static final int PLAYER_STATE_STARTED = 5;
    public static final int PLAYER_STATE_STOPPED = 7;
    public static final int PLAYER_TIME_UPDATE_TIME_DELAY = 100;
    private static final String PLAYER_TRACK_CODEC_MIME = "codec_mime";
    private Map<Long, MediaDataSourceImpl> mediaDataSourceMap;
    private volatile Map<Long, MediaPlayer> mediaPlayerMap;

    private float convertModeToSpeed(int i) {
        if (i == 0) {
            return 0.75f;
        }
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return 1.25f;
        }
        if (i != 3) {
            return i != 4 ? 1.0f : 2.0f;
        }
        return 1.75f;
    }

    protected native void nativeInit();

    protected native void nativeOnBufferingUpdate(long j, int i);

    protected native void nativeOnError(long j, int i);

    protected native void nativeOnInfo(long j, int i, int i2);

    protected native void nativeOnSeekComplete(long j, int i);

    protected native void nativeOnVideoSizeChanged(long j, int i, int i2);

    protected native void nativeOnVolumnChanged(long j, float f);

    protected native int nativeReadAt(long j, long j2, byte[] bArr, int i, int i2);

    public PlayerPlugin(Context context) {
        if (context == null) {
            Log.e(LOG_TAG, "context is null");
            return;
        }
        this.mediaPlayerMap = new HashMap();
        this.mediaDataSourceMap = new HashMap();
        runTimeUpdate();
        nativeInit();
    }

    public class PreparedCallbackImpl implements MediaPlayer.OnPreparedListener {
        public PreparedCallbackImpl() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            long mediaPlayerKey = PlayerPlugin.this.getMediaPlayerKey(mediaPlayer);
            if (mediaPlayerKey != 0) {
                PlayerPlugin.this.notifyInfo(mediaPlayerKey, 5, 4);
                PlayerPlugin.this.notifyInfo(mediaPlayerKey, 15, mediaPlayer.getDuration());
                PlayerPlugin.this.notifyInfo(mediaPlayerKey, 6, 0);
            }
        }
    }

    public class CompletionCallbackImpl implements MediaPlayer.OnCompletionListener {
        public CompletionCallbackImpl() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            long mediaPlayerKey = PlayerPlugin.this.getMediaPlayerKey(mediaPlayer);
            if (mediaPlayerKey != 0) {
                PlayerPlugin.this.nativeOnInfo(mediaPlayerKey, 4, 0);
                PlayerPlugin.this.nativeOnInfo(mediaPlayerKey, 5, 8);
                PlayerPlugin.this.nativeOnInfo(mediaPlayerKey, 6, mediaPlayer.getDuration());
            }
        }
    }

    public class SeekCompletionCallbackImpl implements MediaPlayer.OnSeekCompleteListener {
        public SeekCompletionCallbackImpl() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            long mediaPlayerKey = PlayerPlugin.this.getMediaPlayerKey(mediaPlayer);
            if (mediaPlayerKey != 0) {
                PlayerPlugin.this.nativeOnSeekComplete(mediaPlayerKey, mediaPlayer.getCurrentPosition());
                PlayerPlugin.this.notifyInfo(mediaPlayerKey, 6, mediaPlayer.getCurrentPosition());
            }
        }
    }

    public class BufferingUpdateCallbackImpl implements MediaPlayer.OnBufferingUpdateListener {
        public BufferingUpdateCallbackImpl() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            long mediaPlayerKey = PlayerPlugin.this.getMediaPlayerKey(mediaPlayer);
            if (mediaPlayerKey != 0) {
                PlayerPlugin.this.nativeOnBufferingUpdate(mediaPlayerKey, i);
            }
        }
    }

    public class VideoSizeChangedCallbackImpl implements MediaPlayer.OnVideoSizeChangedListener {
        public VideoSizeChangedCallbackImpl() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            long mediaPlayerKey = PlayerPlugin.this.getMediaPlayerKey(mediaPlayer);
            if (mediaPlayerKey != 0) {
                PlayerPlugin.this.nativeOnVideoSizeChanged(mediaPlayerKey, i, i2);
            }
        }
    }

    public class ErrorCallbackImpl implements MediaPlayer.OnErrorListener {
        public ErrorCallbackImpl() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            long mediaPlayerKey = PlayerPlugin.this.getMediaPlayerKey(mediaPlayer);
            if (mediaPlayerKey == 0) {
                return false;
            }
            PlayerPlugin playerPlugin = PlayerPlugin.this;
            if (i != 1 && i != 100) {
                i = i2;
            }
            playerPlugin.nativeOnError(mediaPlayerKey, i);
            return true;
        }
    }

    public class MediaDataSourceImpl extends MediaDataSource {
        private long key;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        public MediaDataSourceImpl(long j) {
            this.key = j;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            return PlayerPlugin.this.nativeReadAt(this.key, j, bArr, i, i2);
        }
    }

    class CallbackThread extends Thread {
        private long id;
        private int info;
        private int infoType;

        private CallbackThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            PlayerPlugin.this.nativeOnInfo(this.id, this.infoType, this.info);
        }

        public void setParams(long j, int i, int i2) {
            this.id = j;
            this.infoType = i;
            this.info = i2;
        }
    }

    public void addMediaPlayer(long j) {
        if (this.mediaPlayerMap.get(Long.valueOf(j)) != null) {
            Log.e(LOG_TAG, "addMediaPlayer mediaPlayer exist.");
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayerMap.put(Long.valueOf(j), mediaPlayer);
        notifyInfo(j, 5, 1);
        mediaPlayer.setOnPreparedListener(new PreparedCallbackImpl());
        mediaPlayer.setOnErrorListener(new ErrorCallbackImpl());
        mediaPlayer.setOnCompletionListener(new CompletionCallbackImpl());
        mediaPlayer.setOnSeekCompleteListener(new SeekCompletionCallbackImpl());
        mediaPlayer.setOnBufferingUpdateListener(new BufferingUpdateCallbackImpl());
        mediaPlayer.setOnVideoSizeChangedListener(new VideoSizeChangedCallbackImpl());
    }

    private MediaPlayer getMediaPlayerById(long j) {
        return this.mediaPlayerMap.get(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMediaPlayerKey(MediaPlayer mediaPlayer) {
        for (Long l : this.mediaPlayerMap.keySet()) {
            long jLongValue = l.longValue();
            if (this.mediaPlayerMap.get(l) == mediaPlayer) {
                return jLongValue;
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyInfo(long j, int i, int i2) {
        CallbackThread callbackThread = new CallbackThread();
        callbackThread.setParams(j, i, i2);
        callbackThread.start();
    }

    private void runTimeUpdate() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() { // from class: ohos.ace.plugin.playerplugin.PlayerPlugin.1
            @Override // java.lang.Runnable
            public void run() {
                for (Long l : PlayerPlugin.this.mediaPlayerMap.keySet()) {
                    long jLongValue = l.longValue();
                    MediaPlayer mediaPlayer = (MediaPlayer) PlayerPlugin.this.mediaPlayerMap.get(l);
                    if (mediaPlayer.isPlaying()) {
                        PlayerPlugin.this.notifyInfo(jLongValue, 6, mediaPlayer.getCurrentPosition());
                    }
                }
                handler.postDelayed(this, 100L);
            }
        }, 0L);
    }

    public void releaseMediaPlayer(long j) {
        this.mediaPlayerMap.remove(Long.valueOf(j));
    }

    public void setDataSource(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        MediaDataSourceImpl mediaDataSourceImpl = new MediaDataSourceImpl(j);
        this.mediaDataSourceMap.put(Long.valueOf(j), mediaDataSourceImpl);
        mediaPlayerById.setDataSource(mediaDataSourceImpl);
        notifyInfo(j, 5, 2);
    }

    public void setDataSourceWithUrl(long j, String str) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        try {
            mediaPlayerById.setDataSource(str);
            notifyInfo(j, 5, 2);
        } catch (IOException e) {
            Log.e(LOG_TAG, "setDataSourceWithUrl IOException:" + e.getMessage());
        }
    }

    public void setDataSourceWithFd(long j, String str, long j2, long j3) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        if (j3 <= 0) {
            try {
                j3 = new File(str).length();
            } catch (IOException e) {
                Log.e(LOG_TAG, "setDataSourceWithFd IOException:" + e.getMessage());
                return;
            }
        }
        mediaPlayerById.setDataSource(new FileInputStream(str).getFD(), j2, j3);
        notifyInfo(j, 5, 2);
    }

    public void prepare(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        try {
            mediaPlayerById.prepare();
            notifyInfo(j, 5, 4);
            notifyInfo(j, 15, mediaPlayerById.getDuration());
        } catch (IOException e) {
            Log.e(LOG_TAG, "prepare IOException:" + e.getMessage());
        }
    }

    public void prepareAsync(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.prepareAsync();
    }

    public void play(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.start();
        notifyInfo(j, 5, 5);
    }

    public void pause(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.pause();
        notifyInfo(j, 5, 6);
    }

    public void stop(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.stop();
        notifyInfo(j, 5, 7);
    }

    public void reset(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.reset();
        notifyInfo(j, 5, 1);
    }

    public void release(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        this.mediaPlayerMap.remove(Long.valueOf(j));
        mediaPlayerById.release();
        notifyInfo(j, 5, 9);
    }

    public void seekTo(long j, int i, int i2) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.seekTo(i, i2);
    }

    public void setVolume(long j, float f, float f2) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.setVolume(f, f2);
        nativeOnVolumnChanged(j, f);
    }

    public int getTrackIndex(long j, int i) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return -1;
        }
        return mediaPlayerById.getSelectedTrack(i);
    }

    private String getTrackMime(MediaPlayer.TrackInfo trackInfo) {
        String string = trackInfo.toString();
        if (string.indexOf("mime=") != -1) {
            String strSubstring = string.substring(string.indexOf("mime="));
            return strSubstring.substring(5, strSubstring.indexOf(","));
        }
        return "unknow";
    }

    public String getTrackInfoString(long j, int i, String str) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return "";
        }
        for (MediaPlayer.TrackInfo trackInfo : mediaPlayerById.getTrackInfo()) {
            if (trackInfo.getTrackType() == i) {
                if (PLAYER_TRACK_CODEC_MIME.equals(str)) {
                    return getTrackMime(trackInfo);
                }
                if (trackInfo.getFormat() == null) {
                    return "";
                }
                return trackInfo.getFormat().getString(str);
            }
        }
        return "";
    }

    public boolean isLooping(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return false;
        }
        return mediaPlayerById.isLooping();
    }

    public void setLooping(long j, boolean z) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.setLooping(z);
    }

    public int getCurrentPosition(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return -1;
        }
        return mediaPlayerById.getCurrentPosition();
    }

    public int getDuration(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return -1;
        }
        return mediaPlayerById.getDuration();
    }

    public void setSurface(long j, int i, long j2) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        Object objInvoke = invoke("ohos.ace.adapter.AceSurfaceHolder", "getSurface", new Class[]{Integer.TYPE, Long.TYPE}, Integer.valueOf(i), Long.valueOf(j2));
        if (objInvoke instanceof Surface) {
            mediaPlayerById.setSurface((Surface) objInvoke);
        }
    }

    private static Object invoke(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException e) {
            e = e;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (SecurityException e5) {
            e = e5;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (InvocationTargetException e6) {
            e = e6;
            Log.e(LOG_TAG, "invoke " + e.getClass().getSimpleName());
            return null;
        } catch (Exception e7) {
            Log.e(LOG_TAG, "unknown Exception in invoke");
            e7.printStackTrace();
            return null;
        }
    }

    public int getVideoWidth(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return 0;
        }
        return mediaPlayerById.getVideoWidth();
    }

    public int getVideoHeight(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return 0;
        }
        return mediaPlayerById.getVideoHeight();
    }

    public void setVideoScalingMode(long j, int i) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        mediaPlayerById.setVideoScalingMode(i);
    }

    private int convertSpeedToMode(float f) {
        if (Float.compare(f, 1.0f) < 0) {
            return 0;
        }
        if (Float.compare(f, 1.0f) == 0) {
            return 1;
        }
        if (Float.compare(f, 1.25f) <= 0) {
            return 2;
        }
        return Float.compare(f, 1.75f) <= 0 ? 3 : 4;
    }

    public void setPlaybackParams(long j, int i) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        boolean zIsPlaying = mediaPlayerById.isPlaying();
        mediaPlayerById.setPlaybackParams(mediaPlayerById.getPlaybackParams().setSpeed(convertModeToSpeed(i)));
        if (!zIsPlaying) {
            mediaPlayerById.pause();
        }
        notifyInfo(j, 2, convertSpeedToMode(mediaPlayerById.getPlaybackParams().getSpeed()));
    }

    public int getPlaybackParams(long j) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return 0;
        }
        return convertSpeedToMode(mediaPlayerById.getPlaybackParams().getSpeed());
    }

    public void selectBitrate(long j, int i) {
        MediaPlayer mediaPlayerById = getMediaPlayerById(j);
        if (mediaPlayerById == null) {
            return;
        }
        for (MediaPlayer.TrackInfo trackInfo : mediaPlayerById.getTrackInfo()) {
            if (trackInfo.getTrackType() == 1) {
                if (trackInfo.getFormat() != null) {
                    trackInfo.getFormat().setInteger("bitrate", i);
                    notifyInfo(j, 3, i);
                    return;
                }
                return;
            }
        }
    }
}
