package com.huami.http.listener;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.watch.notification.TransportUri;
import com.squareup.picasso.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001a\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006J\u001a\u0010\n\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0006J\u001e\u0010\f\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R2\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019¨\u0006%"}, d2 = {"Lcom/huami/http/listener/DownLoadListener;", "", "Lkotlin/Function0;", "", TransportUri.ACTION_BLOCK, "onStarted", "Lkotlin/Function1;", "", "onProgress", "", "onFailed", "", "onCompleted", "a", "Lkotlin/jvm/functions/Function0;", "getStarted$httpkit_release", "()Lkotlin/jvm/functions/Function0;", "setStarted$httpkit_release", "(Lkotlin/jvm/functions/Function0;)V", SnoreMonitorActivity.PAGE_STARTED, "b", "Lkotlin/jvm/functions/Function1;", "getProgress$httpkit_release", "()Lkotlin/jvm/functions/Function1;", "setProgress$httpkit_release", "(Lkotlin/jvm/functions/Function1;)V", "progress", "c", "getFailed$httpkit_release", "setFailed$httpkit_release", "failed", GoogleApiAvailabilityLight.a, "getCompleted$httpkit_release", "setCompleted$httpkit_release", u.D, "<init>", "()V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class DownLoadListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> started;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Integer, Unit> progress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Throwable, Unit> failed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super String, Unit> completed;

    @Nullable
    public final Function1<String, Unit> getCompleted$httpkit_release() {
        return this.completed;
    }

    @Nullable
    public final Function1<Throwable, Unit> getFailed$httpkit_release() {
        return this.failed;
    }

    @Nullable
    public final Function1<Integer, Unit> getProgress$httpkit_release() {
        return this.progress;
    }

    @Nullable
    public final Function0<Unit> getStarted$httpkit_release() {
        return this.started;
    }

    public final void onCompleted(@Nullable Function1<? super String, Unit> block) {
        this.completed = block;
    }

    public final void onFailed(@NotNull Function1<? super Throwable, Unit> block) {
        this.failed = block;
    }

    public final void onProgress(@NotNull Function1<? super Integer, Unit> block) {
        this.progress = block;
    }

    public final void onStarted(@NotNull Function0<Unit> block) {
        this.started = block;
    }

    public final void setCompleted$httpkit_release(@Nullable Function1<? super String, Unit> function1) {
        this.completed = function1;
    }

    public final void setFailed$httpkit_release(@Nullable Function1<? super Throwable, Unit> function1) {
        this.failed = function1;
    }

    public final void setProgress$httpkit_release(@Nullable Function1<? super Integer, Unit> function1) {
        this.progress = function1;
    }

    public final void setStarted$httpkit_release(@Nullable Function0<Unit> function0) {
        this.started = function0;
    }
}
