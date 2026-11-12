package com.mapbox.maps.plugin.animation;

import android.animation.AnimatorSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.threading.AnimationThreadController;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/plugin/animation/HighLevelAnimatorSet;", "Lcom/mapbox/common/Cancelable;", "owner", "", "animatorSet", "Landroid/animation/AnimatorSet;", "(Ljava/lang/String;Landroid/animation/AnimatorSet;)V", "getAnimatorSet", "()Landroid/animation/AnimatorSet;", "getOwner", "()Ljava/lang/String;", "cancel", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HighLevelAnimatorSet implements Cancelable {
    private final AnimatorSet animatorSet;
    private final String owner;

    public HighLevelAnimatorSet(String str, AnimatorSet animatorSet) {
        animatorSet.getClass();
        this.owner = str;
        this.animatorSet = animatorSet;
    }

    public static /* synthetic */ HighLevelAnimatorSet copy$default(HighLevelAnimatorSet highLevelAnimatorSet, String str, AnimatorSet animatorSet, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = highLevelAnimatorSet.owner;
        }
        if ((i14 & 2) != 0) {
            animatorSet = highLevelAnimatorSet.animatorSet;
        }
        return highLevelAnimatorSet.copy(str, animatorSet);
    }

    @Override // com.mapbox.common.Cancelable
    public void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnimatorSet getAnimatorSet() {
        return this.animatorSet;
    }

    public final HighLevelAnimatorSet copy(String owner, AnimatorSet animatorSet) {
        animatorSet.getClass();
        return new HighLevelAnimatorSet(owner, animatorSet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighLevelAnimatorSet)) {
            return false;
        }
        HighLevelAnimatorSet highLevelAnimatorSet = (HighLevelAnimatorSet) other;
        return s.g(this.owner, highLevelAnimatorSet.owner) && s.g(this.animatorSet, highLevelAnimatorSet.animatorSet);
    }

    public final AnimatorSet getAnimatorSet() {
        return this.animatorSet;
    }

    public final String getOwner() {
        return this.owner;
    }

    public int hashCode() {
        String str = this.owner;
        return this.animatorSet.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "HighLevelAnimatorSet(owner=" + this.owner + ", animatorSet=" + this.animatorSet + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.HighLevelAnimatorSet$cancel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.a<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HighLevelAnimatorSet.this.getAnimatorSet().cancel();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
