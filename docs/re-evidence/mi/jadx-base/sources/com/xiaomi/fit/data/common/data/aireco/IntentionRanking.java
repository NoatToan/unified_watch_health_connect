package com.xiaomi.fit.data.common.data.aireco;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionRanking;", "", "<init>", "()V", "score", "", "getScore", "()D", "setScore", "(D)V", "ranking", "", "getRanking", "()I", "setRanking", "(I)V", "confidence", "getConfidence", "setConfidence", "rankingType", "getRankingType", "setRankingType", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionRanking {
    private double confidence;
    private int ranking;
    private int rankingType;
    private double score;

    public final double getConfidence() {
        return this.confidence;
    }

    public final int getRanking() {
        return this.ranking;
    }

    public final int getRankingType() {
        return this.rankingType;
    }

    public final double getScore() {
        return this.score;
    }

    public final void setConfidence(double d) {
        this.confidence = d;
    }

    public final void setRanking(int i) {
        this.ranking = i;
    }

    public final void setRankingType(int i) {
        this.rankingType = i;
    }

    public final void setScore(double d) {
        this.score = d;
    }
}
