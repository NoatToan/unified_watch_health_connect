package com.xiaomi.hm.health.training.media.factory;

import com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoBottomProgressStrategy;
import com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoCircleProgressStrategy;
import com.xiaomi.hm.health.training.media.strategy.IPlayControlStrategy;

/* JADX INFO: loaded from: classes21.dex */
public class PlayActionVideoOptions {
    private IPlayActionVideoBottomProgressStrategy a;
    private IPlayActionVideoCircleProgressStrategy b;
    private IPlayControlStrategy c;
    private IActionBroadCastFactory d;
    private boolean e;

    public static class Builder {
        private IPlayActionVideoBottomProgressStrategy a;
        private IPlayActionVideoCircleProgressStrategy b;
        private IPlayControlStrategy c;
        private IActionBroadCastFactory d;
        private boolean e = false;

        public Builder actionBroadCastFactory(IActionBroadCastFactory iActionBroadCastFactory) {
            this.d = iActionBroadCastFactory;
            return this;
        }

        public Builder bottomProgressStrategy(IPlayActionVideoBottomProgressStrategy iPlayActionVideoBottomProgressStrategy) {
            this.a = iPlayActionVideoBottomProgressStrategy;
            return this;
        }

        public PlayActionVideoOptions build() {
            return new PlayActionVideoOptions(this);
        }

        public Builder circleProgressStrategy(IPlayActionVideoCircleProgressStrategy iPlayActionVideoCircleProgressStrategy) {
            this.b = iPlayActionVideoCircleProgressStrategy;
            return this;
        }

        public Builder isResultActionNumber(boolean z) {
            this.e = z;
            return this;
        }

        public Builder playControlStrategy(IPlayControlStrategy iPlayControlStrategy) {
            this.c = iPlayControlStrategy;
            return this;
        }
    }

    public PlayActionVideoOptions(Builder builder) {
        this.e = false;
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    public IActionBroadCastFactory getActionBroadCastFactory() {
        return this.d;
    }

    public IPlayActionVideoBottomProgressStrategy getBottomProgressStrategy() {
        return this.a;
    }

    public IPlayActionVideoCircleProgressStrategy getCircleProgressStrategy() {
        return this.b;
    }

    public IPlayControlStrategy getPlayControlStrategy() {
        return this.c;
    }

    public boolean isResultActionNumber() {
        return this.e;
    }
}
