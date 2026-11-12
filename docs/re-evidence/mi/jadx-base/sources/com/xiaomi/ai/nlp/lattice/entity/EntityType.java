package com.xiaomi.ai.nlp.lattice.entity;

/* JADX INFO: loaded from: classes7.dex */
public enum EntityType {
    INIT_PARSED_ENTITY("init"),
    QC_PARSED_ENTITY("qc"),
    FACTOID_PARSED_ENTITY("factoid"),
    TRANSFORM_PARSED_ENTITY("transform"),
    MERGE_PARSED_ENTITY("merge"),
    NORM_PARSED_ENTITY("norm"),
    CONSTRAINT_PARSED_ENTITY("constraint"),
    HINTS_PARSED_ENTITY("hints"),
    PRIORITY_ENTITY("priority"),
    BIGRAM_ENTITY("bigram"),
    NUMBER_NAME("number_name"),
    ALIAS_ENTITY("alias"),
    FUZZY_SYLLABLES_ENTITY("fuzzy_syllables");

    private String entityType;

    EntityType(String str) {
        this.entityType = str;
    }

    public String getEntityType() {
        return this.entityType;
    }
}
