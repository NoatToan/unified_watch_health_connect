package com.huami.moving.ui.utils;

import android.content.Context;
import android.media.SoundPool;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.moving.ui.utils.BeatUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.mediac.Command;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/ui/utils/BeatUtil;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class BeatUtil {

    @Nullable
    private static SoundPool a;
    private static int b;

    @Nullable
    private static Disposable d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static Integer c = 0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/moving/ui/utils/BeatUtil$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "resId", "", "initBeat", "", "interval", "beatOn", "release", Command.STOP, "Lio/reactivex/disposables/Disposable;", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable$moving_release", "()Lio/reactivex/disposables/Disposable;", "setDisposable$moving_release", "(Lio/reactivex/disposables/Disposable;)V", "beatId", LogUtil.I, "Landroid/media/SoundPool;", "pool", "Landroid/media/SoundPool;", "streamId", "Ljava/lang/Integer;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Long l) {
            int iIntValue;
            SoundPool soundPool;
            Integer num = BeatUtil.c;
            if (num != null && (iIntValue = num.intValue()) > 0 && (soundPool = BeatUtil.a) != null) {
                soundPool.stop(iIntValue);
            }
            Companion companion = BeatUtil.INSTANCE;
            SoundPool soundPool2 = BeatUtil.a;
            BeatUtil.c = soundPool2 == null ? null : Integer.valueOf(soundPool2.play(BeatUtil.b, 1.0f, 1.0f, 1, 0, 1.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Throwable th) {
            th.printStackTrace();
        }

        @JvmStatic
        public final void beatOn(long interval) {
            Disposable disposable$moving_release = getDisposable$moving_release();
            if (disposable$moving_release != null) {
                disposable$moving_release.dispose();
            }
            setDisposable$moving_release(Flowable.interval(interval, TimeUnit.MILLISECONDS, Schedulers.computation()).subscribe(new Consumer() { // from class: us
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BeatUtil.Companion.c((Long) obj);
                }
            }, new Consumer() { // from class: vs
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BeatUtil.Companion.d((Throwable) obj);
                }
            }));
        }

        @Nullable
        public final Disposable getDisposable$moving_release() {
            return BeatUtil.d;
        }

        @JvmStatic
        public final void initBeat(@NotNull Context context, int resId) {
            if (BeatUtil.a == null) {
                BeatUtil.a = new SoundPool(1, 3, 0);
                SoundPool soundPool = BeatUtil.a;
                if (soundPool == null) {
                    return;
                }
                Companion companion = BeatUtil.INSTANCE;
                BeatUtil.b = soundPool.load(context, resId, 1);
            }
        }

        @JvmStatic
        public final void release() {
            stop();
            SoundPool soundPool = BeatUtil.a;
            if (soundPool != null) {
                soundPool.release();
            }
            BeatUtil.a = null;
        }

        public final void setDisposable$moving_release(@Nullable Disposable disposable) {
            BeatUtil.d = disposable;
        }

        @JvmStatic
        public final void stop() {
            Disposable disposable$moving_release = getDisposable$moving_release();
            if (disposable$moving_release != null) {
                disposable$moving_release.dispose();
            }
            Integer num = BeatUtil.c;
            if (num != null) {
                int iIntValue = num.intValue();
                SoundPool soundPool = BeatUtil.a;
                if (soundPool != null) {
                    soundPool.stop(iIntValue);
                }
            }
            BeatUtil.c = null;
        }
    }

    @JvmStatic
    public static final void beatOn(long j) {
        INSTANCE.beatOn(j);
    }

    @JvmStatic
    public static final void initBeat(@NotNull Context context, int i) {
        INSTANCE.initBeat(context, i);
    }

    @JvmStatic
    public static final void release() {
        INSTANCE.release();
    }

    @JvmStatic
    public static final void stop() {
        INSTANCE.stop();
    }
}
