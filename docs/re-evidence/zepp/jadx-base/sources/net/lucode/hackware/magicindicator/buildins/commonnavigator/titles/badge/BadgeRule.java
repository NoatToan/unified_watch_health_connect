package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge;

/* JADX INFO: loaded from: classes23.dex */
public class BadgeRule {
    private BadgeAnchor a;
    private int b;

    public BadgeRule(BadgeAnchor badgeAnchor, int i) {
        this.a = badgeAnchor;
        this.b = i;
    }

    public BadgeAnchor getAnchor() {
        return this.a;
    }

    public int getOffset() {
        return this.b;
    }

    public void setAnchor(BadgeAnchor badgeAnchor) {
        this.a = badgeAnchor;
    }

    public void setOffset(int i) {
        this.b = i;
    }
}
