package com.xiaomi.ai.nlp.lattice.rule;

/* JADX INFO: loaded from: classes7.dex */
public enum RuleApplyPhase {
    BEFORE_DECODING("before_decoding", false),
    AFTER_DECODING("after_decoding", true),
    KNOWLEDGE_ACTION("knowledge_action", true);

    private boolean applyBestPath;
    private String phase;

    RuleApplyPhase(String str, boolean z) {
        this.phase = str;
        this.applyBestPath = z;
    }

    public String getPhase() {
        return this.phase;
    }

    public boolean isApplyBestPath() {
        return this.applyBestPath;
    }
}
