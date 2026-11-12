package com.xiaomi.hm.health.training.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.util.SparseIntArray;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingSoundPool {
    public static final int TRAINING_END = 100;
    public static final int TRAINING_INSIST = 103;
    public static final int TRAINING_REST_END = 105;
    public static final int TRAINING_REST_START = 104;
    public static final int TRAINING_TICK = 102;
    public static final int TRAINING_UNIT_END = 101;
    private static final String d = "TrainingSoundPool";
    private MediaPlayer a;
    private SparseIntArray b = new SparseIntArray();
    private Context c;

    public class a implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ MediaPlayer.OnCompletionListener a;

        public a(MediaPlayer.OnCompletionListener onCompletionListener) {
            this.a = onCompletionListener;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (IllegalStateException e) {
                e.printStackTrace();
                HMLog.i(TrainingSoundPool.d, Log.getStackTraceString(e), new Object[0]);
            }
            TrainingSoundPool.this.a = null;
            MediaPlayer.OnCompletionListener onCompletionListener = this.a;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(null);
            }
        }
    }

    public class b implements MediaPlayer.OnErrorListener {
        public final /* synthetic */ MediaPlayer.OnCompletionListener a;

        public b(MediaPlayer.OnCompletionListener onCompletionListener) {
            this.a = onCompletionListener;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (IllegalStateException e) {
                e.printStackTrace();
                HMLog.i(TrainingSoundPool.d, Log.getStackTraceString(e), new Object[0]);
            }
            TrainingSoundPool.this.a = null;
            MediaPlayer.OnCompletionListener onCompletionListener = this.a;
            if (onCompletionListener == null) {
                return true;
            }
            onCompletionListener.onCompletion(null);
            return true;
        }
    }

    public TrainingSoundPool(Context context) {
        this.c = context;
        initSoundPool(context);
    }

    public void initSoundPool(Context context) {
        this.a = new MediaPlayer();
        this.b.put(0, R.raw.go);
        this.b.put(1, R.raw.num_1);
        this.b.put(2, R.raw.num_2);
        this.b.put(3, R.raw.num_3);
        this.b.put(4, R.raw.num_4);
        this.b.put(5, R.raw.num_5);
        this.b.put(6, R.raw.num_6);
        this.b.put(7, R.raw.num_7);
        this.b.put(8, R.raw.num_8);
        this.b.put(9, R.raw.num_9);
        this.b.put(10, R.raw.num_ten_10);
        this.b.put(20, R.raw.num_ten_20);
        this.b.put(30, R.raw.num_ten_30);
        this.b.put(40, R.raw.num_ten_40);
        this.b.put(50, R.raw.num_ten_50);
        this.b.put(60, R.raw.num_ten_60);
        this.b.put(70, R.raw.num_ten_70);
        this.b.put(80, R.raw.num_ten_80);
        this.b.put(90, R.raw.num_ten_90);
        this.b.put(100, R.raw.completed_training);
        this.b.put(101, R.raw.whistle);
        this.b.put(102, R.raw.tick);
        this.b.put(103, R.raw.insist_on_five_seconds);
        this.b.put(104, R.raw.take_rest);
        this.b.put(105, R.raw.take_rest_over);
    }

    public void play(int i) {
        play(i, null);
    }

    public void release() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.a.release();
        }
    }

    public void play(int i, MediaPlayer.OnCompletionListener onCompletionListener) {
        if (i < 0 || i > 105) {
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(null);
                return;
            }
            return;
        }
        int i2 = this.b.get(i);
        try {
            MediaPlayer mediaPlayer = this.a;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.a.release();
            }
            MediaPlayer mediaPlayerCreate = MediaPlayer.create(this.c, i2);
            this.a = mediaPlayerCreate;
            mediaPlayerCreate.setOnCompletionListener(new a(onCompletionListener));
            this.a.setOnErrorListener(new b(onCompletionListener));
            this.a.start();
        } catch (Exception e) {
            e.printStackTrace();
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(null);
            }
        }
    }
}
