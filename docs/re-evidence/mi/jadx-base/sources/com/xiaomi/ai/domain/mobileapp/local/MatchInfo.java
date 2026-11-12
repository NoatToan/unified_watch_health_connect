package com.xiaomi.ai.domain.mobileapp.local;

/* JADX INFO: loaded from: classes7.dex */
public class MatchInfo implements Comparable<MatchInfo> {
    private String displayName;
    private double localSimScore;
    private MatchType matchType;
    private String packageName;

    public MatchInfo() {
        this.matchType = MatchType.ALTERNATIVE_PACKAGE;
        this.displayName = "";
        this.packageName = "";
        this.localSimScore = 0.0d;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public double getLocalSimScore() {
        return this.localSimScore;
    }

    public MatchType getMatchType() {
        return this.matchType;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setLocalSimScore(double d) {
        this.localSimScore = d;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(MatchInfo matchInfo) {
        MatchType matchType = this.matchType;
        MatchType matchType2 = matchInfo.matchType;
        return -(matchType != matchType2 ? matchType.compareTo(matchType2) : Double.compare(getLocalSimScore(), matchInfo.getLocalSimScore()));
    }

    public MatchInfo(MatchType matchType, String str, String str2, double d) {
        this.matchType = matchType;
        this.displayName = str;
        this.packageName = str2;
        this.localSimScore = d;
    }
}
