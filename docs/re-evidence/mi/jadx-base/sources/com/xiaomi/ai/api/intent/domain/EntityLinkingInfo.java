package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class EntityLinkingInfo {

    @Required
    private String kg_id;

    @Required
    private String mention;

    @Required
    private String title;
    private Optional<List<String>> kg_tags = Optional.a();
    private Optional<List<List<String>>> mi_tags = Optional.a();
    private Optional<Integer> len = Optional.a();
    private Optional<Integer> offset = Optional.a();
    private Optional<Double> rank_score = Optional.a();
    private Optional<String> desc = Optional.a();

    public EntityLinkingInfo() {
    }

    public Optional<String> getDesc() {
        return this.desc;
    }

    @Required
    public String getKgId() {
        return this.kg_id;
    }

    public Optional<List<String>> getKgTags() {
        return this.kg_tags;
    }

    public Optional<Integer> getLen() {
        return this.len;
    }

    @Required
    public String getMention() {
        return this.mention;
    }

    public Optional<List<List<String>>> getMiTags() {
        return this.mi_tags;
    }

    public Optional<Integer> getOffset() {
        return this.offset;
    }

    public Optional<Double> getRankScore() {
        return this.rank_score;
    }

    @Required
    public String getTitle() {
        return this.title;
    }

    public EntityLinkingInfo setDesc(String str) {
        this.desc = Optional.e(str);
        return this;
    }

    @Required
    public EntityLinkingInfo setKgId(String str) {
        this.kg_id = str;
        return this;
    }

    public EntityLinkingInfo setKgTags(List<String> list) {
        this.kg_tags = Optional.e(list);
        return this;
    }

    public EntityLinkingInfo setLen(int i) {
        this.len = Optional.e(Integer.valueOf(i));
        return this;
    }

    @Required
    public EntityLinkingInfo setMention(String str) {
        this.mention = str;
        return this;
    }

    public EntityLinkingInfo setMiTags(List<List<String>> list) {
        this.mi_tags = Optional.e(list);
        return this;
    }

    public EntityLinkingInfo setOffset(int i) {
        this.offset = Optional.e(Integer.valueOf(i));
        return this;
    }

    public EntityLinkingInfo setRankScore(double d) {
        this.rank_score = Optional.e(Double.valueOf(d));
        return this;
    }

    @Required
    public EntityLinkingInfo setTitle(String str) {
        this.title = str;
        return this;
    }

    public EntityLinkingInfo(String str, String str2, String str3) {
        this.title = str;
        this.mention = str2;
        this.kg_id = str3;
    }
}
