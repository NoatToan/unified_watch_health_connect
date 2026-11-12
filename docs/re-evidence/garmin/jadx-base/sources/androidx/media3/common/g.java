package androidx.media3.common;

import androidx.media3.exoplayer.p0;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0.c f8225a = new d0.c();

    @Override // androidx.media3.common.z
    public final long getContentDuration() {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        d0 currentTimeline = vVar.getCurrentTimeline();
        return currentTimeline.p() ? C.TIME_UNSET : fa.z.Y(currentTimeline.m(vVar.getCurrentMediaItemIndex(), this.f8225a, 0L).f8208m);
    }

    @Override // androidx.media3.common.z
    public final int getMediaItemCount() {
        return ((androidx.media3.exoplayer.v) this).getCurrentTimeline().o();
    }

    public final void h(int i14) {
        i(C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.z
    public final boolean hasNextMediaItem() {
        int iE;
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        d0 currentTimeline = vVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            iE = -1;
        } else {
            int currentMediaItemIndex = vVar.getCurrentMediaItemIndex();
            vVar.E();
            int i14 = vVar.F;
            if (i14 == 1) {
                i14 = 0;
            }
            vVar.E();
            iE = currentTimeline.e(currentMediaItemIndex, i14, vVar.G);
        }
        return iE != -1;
    }

    @Override // androidx.media3.common.z
    public final boolean hasPreviousMediaItem() {
        int iK;
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        d0 currentTimeline = vVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            iK = -1;
        } else {
            int currentMediaItemIndex = vVar.getCurrentMediaItemIndex();
            vVar.E();
            int i14 = vVar.F;
            if (i14 == 1) {
                i14 = 0;
            }
            vVar.E();
            iK = currentTimeline.k(currentMediaItemIndex, i14, vVar.G);
        }
        return iK != -1;
    }

    public abstract void i(long j8, int i14, boolean z14);

    @Override // androidx.media3.common.z
    public final boolean isCommandAvailable(int i14) {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        vVar.E();
        return vVar.N.f8587a.f8347a.get(i14);
    }

    @Override // androidx.media3.common.z
    public final boolean isCurrentMediaItemDynamic() {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        d0 currentTimeline = vVar.getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(vVar.getCurrentMediaItemIndex(), this.f8225a, 0L).f8204i;
    }

    @Override // androidx.media3.common.z
    public final boolean isCurrentMediaItemLive() {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        d0 currentTimeline = vVar.getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(vVar.getCurrentMediaItemIndex(), this.f8225a, 0L).a();
    }

    @Override // androidx.media3.common.z
    public final boolean isCurrentMediaItemSeekable() {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        d0 currentTimeline = vVar.getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(vVar.getCurrentMediaItemIndex(), this.f8225a, 0L).f8203h;
    }

    @Override // androidx.media3.common.z
    public final boolean isPlaying() {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        return vVar.getPlaybackState() == 3 && vVar.getPlayWhenReady() && vVar.getPlaybackSuppressionReason() == 0;
    }

    public final void j(int i14, long j8) {
        long contentDuration;
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        long currentPosition = vVar.getCurrentPosition() + j8;
        vVar.E();
        if (vVar.isPlayingAd()) {
            p0 p0Var = vVar.f9744g0;
            androidx.media3.exoplayer.source.j.b bVar = p0Var.f9319b;
            d0 d0Var = p0Var.f9318a;
            Object obj = bVar.f9519a;
            d0.b bVar2 = vVar.f9753n;
            d0Var.g(obj, bVar2);
            contentDuration = fa.z.Y(bVar2.a(bVar.f9520b, bVar.f9521c));
        } else {
            contentDuration = vVar.getContentDuration();
        }
        if (contentDuration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, contentDuration);
        }
        i(Math.max(currentPosition, 0L), vVar.getCurrentMediaItemIndex(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(t tVar) {
        ImmutableList immutableListOf = ImmutableList.of(tVar);
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        vVar.E();
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < immutableListOf.size(); i14++) {
            arrayList.add(vVar.f9756q.b((t) immutableListOf.get(i14)));
        }
        vVar.x(arrayList);
    }

    @Override // androidx.media3.common.z
    public final void pause() {
        ((androidx.media3.exoplayer.v) this).setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.z
    public final void play() {
        ((androidx.media3.exoplayer.v) this).setPlayWhenReady(true);
    }

    @Override // androidx.media3.common.z
    public final void seekBack() {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        vVar.E();
        j(11, -vVar.f9760u);
    }

    @Override // androidx.media3.common.z
    public final void seekForward() {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        vVar.E();
        j(12, vVar.f9761v);
    }

    @Override // androidx.media3.common.z
    public final void seekTo(long j8) {
        i(j8, ((androidx.media3.exoplayer.v) this).getCurrentMediaItemIndex(), false);
    }

    @Override // androidx.media3.common.z
    public final void seekToDefaultPosition() {
        i(C.TIME_UNSET, ((androidx.media3.exoplayer.v) this).getCurrentMediaItemIndex(), false);
    }

    @Override // androidx.media3.common.z
    public final void seekToNext() {
        int iE;
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        if (vVar.getCurrentTimeline().p() || vVar.isPlayingAd()) {
            h(9);
            return;
        }
        if (!hasNextMediaItem()) {
            if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                i(C.TIME_UNSET, vVar.getCurrentMediaItemIndex(), false);
                return;
            } else {
                h(9);
                return;
            }
        }
        d0 currentTimeline = vVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            iE = -1;
        } else {
            int currentMediaItemIndex = vVar.getCurrentMediaItemIndex();
            vVar.E();
            int i14 = vVar.F;
            if (i14 == 1) {
                i14 = 0;
            }
            vVar.E();
            iE = currentTimeline.e(currentMediaItemIndex, i14, vVar.G);
        }
        if (iE == -1) {
            h(9);
        } else if (iE == vVar.getCurrentMediaItemIndex()) {
            i(C.TIME_UNSET, vVar.getCurrentMediaItemIndex(), true);
        } else {
            i(C.TIME_UNSET, iE, false);
        }
    }

    @Override // androidx.media3.common.z
    public final void seekToPrevious() {
        int iK;
        int iK2;
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        if (vVar.getCurrentTimeline().p() || vVar.isPlayingAd()) {
            h(7);
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (!zHasPreviousMediaItem) {
                h(7);
                return;
            }
            d0 currentTimeline = vVar.getCurrentTimeline();
            if (currentTimeline.p()) {
                iK2 = -1;
            } else {
                int currentMediaItemIndex = vVar.getCurrentMediaItemIndex();
                vVar.E();
                int i14 = vVar.F;
                if (i14 == 1) {
                    i14 = 0;
                }
                vVar.E();
                iK2 = currentTimeline.k(currentMediaItemIndex, i14, vVar.G);
            }
            if (iK2 == -1) {
                h(7);
                return;
            } else if (iK2 == vVar.getCurrentMediaItemIndex()) {
                i(C.TIME_UNSET, vVar.getCurrentMediaItemIndex(), true);
                return;
            } else {
                i(C.TIME_UNSET, iK2, false);
                return;
            }
        }
        if (zHasPreviousMediaItem) {
            long currentPosition = vVar.getCurrentPosition();
            vVar.E();
            if (currentPosition <= vVar.f9762w) {
                d0 currentTimeline2 = vVar.getCurrentTimeline();
                if (currentTimeline2.p()) {
                    iK = -1;
                } else {
                    int currentMediaItemIndex2 = vVar.getCurrentMediaItemIndex();
                    vVar.E();
                    int i15 = vVar.F;
                    if (i15 == 1) {
                        i15 = 0;
                    }
                    vVar.E();
                    iK = currentTimeline2.k(currentMediaItemIndex2, i15, vVar.G);
                }
                if (iK == -1) {
                    h(7);
                    return;
                } else if (iK == vVar.getCurrentMediaItemIndex()) {
                    i(C.TIME_UNSET, vVar.getCurrentMediaItemIndex(), true);
                    return;
                } else {
                    i(C.TIME_UNSET, iK, false);
                    return;
                }
            }
        }
        i(0L, vVar.getCurrentMediaItemIndex(), false);
    }

    @Override // androidx.media3.common.z
    public final void setPlaybackSpeed(float f14) {
        androidx.media3.exoplayer.v vVar = (androidx.media3.exoplayer.v) this;
        vVar.b(new y(f14, vVar.getPlaybackParameters().f8585b));
    }

    @Override // androidx.media3.common.z
    public final void seekTo(int i14, long j8) {
        i(j8, i14, false);
    }
}
