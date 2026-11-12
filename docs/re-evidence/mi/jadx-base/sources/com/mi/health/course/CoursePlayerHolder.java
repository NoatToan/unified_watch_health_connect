package com.mi.health.course;

import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.e;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.bop;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/CoursePlayerHolder;", "", "Lcom/google/android/exoplayer2/q;", "constructPlayer", "()Lcom/google/android/exoplayer2/q;", "getPlayer", "Lbop;", "getTrackSelector", "()Lbop;", "", "release", "()V", "player", "Lcom/google/android/exoplayer2/q;", "trackSelector", "Lbop;", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CoursePlayerHolder {
    private q player;

    @NotNull
    private final bop trackSelector = new DefaultTrackSelector(ApplicationExtKt.getApplication());

    private final q constructPlayer() {
        t.b bVarA = new t.b(ApplicationExtKt.getApplication()).A(this.trackSelector);
        Intrinsics.checkNotNullExpressionValue(bVarA, "setTrackSelector(...)");
        a.c cVarE = new a.c().d(CoursePlayerHolderKt.getCache()).e(new e.b());
        Intrinsics.checkNotNullExpressionValue(cVarE, "setUpstreamDataSourceFactory(...)");
        bVarA.z(new com.google.android.exoplayer2.source.e(cVarE));
        t tVarX = bVarA.x();
        Intrinsics.checkNotNullExpressionValue(tVarX, "build(...)");
        return tVarX;
    }

    @NotNull
    public final q getPlayer() {
        if (this.player == null) {
            this.player = constructPlayer();
        }
        q qVar = this.player;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("player");
        return null;
    }

    @NotNull
    public final bop getTrackSelector() {
        return this.trackSelector;
    }

    public final void release() {
        q qVar = this.player;
        if (qVar != null) {
            if (qVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                qVar = null;
            }
            qVar.release();
        }
    }
}
