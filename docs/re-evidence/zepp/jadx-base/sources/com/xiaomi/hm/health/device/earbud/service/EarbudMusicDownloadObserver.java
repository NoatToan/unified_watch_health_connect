package com.xiaomi.hm.health.device.earbud.service;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/EarbudMusicDownloadObserver;", "", "Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "data", "", "onNext", "Lio/reactivex/functions/Consumer;", "consumer", "Lio/reactivex/disposables/Disposable;", "safeObserve", "", "id", "start", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "finish", "fail", "Lio/reactivex/subjects/Subject;", "a", "Lio/reactivex/subjects/Subject;", "mBus", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudMusicDownloadObserver {

    @NotNull
    private static final String b = "EarbudMusicDownloadObserver";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Subject<MusicDownloadStatus> mBus = PublishSubject.create();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final EarbudMusicDownloadObserver c = new EarbudMusicDownloadObserver();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/EarbudMusicDownloadObserver$Companion;", "", "Lcom/xiaomi/hm/health/device/earbud/service/EarbudMusicDownloadObserver;", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/device/earbud/service/EarbudMusicDownloadObserver;", "getInstance", "()Lcom/xiaomi/hm/health/device/earbud/service/EarbudMusicDownloadObserver;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EarbudMusicDownloadObserver getInstance() {
            return EarbudMusicDownloadObserver.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Throwable th) {
        HMLog.e(b, th.getMessage(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
    }

    public final void fail(long id) {
        onNext(MusicDownloadStatus.INSTANCE.fail(id));
    }

    public final void finish(long id) {
        onNext(MusicDownloadStatus.INSTANCE.finish(id));
    }

    public final void onNext(@NotNull MusicDownloadStatus data) {
        this.mBus.onNext(data);
    }

    public final void progress(long id, @NotNull Progress progress) {
        onNext(MusicDownloadStatus.INSTANCE.progress(id, progress));
    }

    @NotNull
    public final Disposable safeObserve(@NotNull Consumer<MusicDownloadStatus> consumer) {
        return this.mBus.subscribe(consumer, new Consumer() { // from class: af1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EarbudMusicDownloadObserver.c((Throwable) obj);
            }
        }, new Action() { // from class: ze1
            @Override // io.reactivex.functions.Action
            public final void run() {
                EarbudMusicDownloadObserver.d();
            }
        });
    }

    public final void start(long id) {
        onNext(MusicDownloadStatus.INSTANCE.start(id));
    }
}
