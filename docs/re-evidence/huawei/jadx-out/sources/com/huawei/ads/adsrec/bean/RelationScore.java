package com.huawei.ads.adsrec.bean;

import com.huawei.ads.fund.anno.DataKeep;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class RelationScore {
    private String contentId;
    private double intentScore;
    private double mergedScore;
    private double score;

    public double a() {
        return this.score;
    }

    public double c() {
        return this.mergedScore;
    }

    public double b() {
        return this.intentScore;
    }

    public String d() {
        return this.contentId;
    }

    public RelationScore(RelationScore relationScore) {
        this.contentId = relationScore.d();
        this.score = relationScore.a();
        this.intentScore = relationScore.b();
        this.mergedScore = relationScore.c();
    }

    public RelationScore() {
    }
}
