package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Knowledge {

    public static class InfoBox implements DomainType {

        @Required
        private String key;

        @Required
        private String keyId;

        @Required
        private List<BoxValue> value;

        public InfoBox() {
        }

        public InfoBox(String str, List<BoxValue> list, String str2) {
            this.key = str;
            this.value = list;
            this.keyId = str2;
        }

        @Required
        public String getKey() {
            return this.key;
        }

        @Required
        public String getKeyId() {
            return this.keyId;
        }

        @Required
        public List<BoxValue> getValue() {
            return this.value;
        }

        @Required
        public InfoBox setKey(String str) {
            this.key = str;
            return this;
        }

        @Required
        public InfoBox setKeyId(String str) {
            this.keyId = str;
            return this;
        }

        @Required
        public InfoBox setValue(List<BoxValue> list) {
            this.value = list;
            return this;
        }
    }

    public static class KgImage implements DomainType {

        @Required
        private String image;

        public KgImage() {
        }

        public KgImage(String str) {
            this.image = str;
        }

        @Required
        public String getImage() {
            return this.image;
        }

        @Required
        public KgImage setImage(String str) {
            this.image = str;
            return this;
        }
    }

    public static class Lexicon implements DomainType {

        @Required
        private String lexeme;

        @Required
        private String target;

        public Lexicon() {
        }

        public Lexicon(String str, String str2) {
            this.lexeme = str;
            this.target = str2;
        }

        @Required
        public String getLexeme() {
            return this.lexeme;
        }

        @Required
        public String getTarget() {
            return this.target;
        }

        @Required
        public Lexicon setLexeme(String str) {
            this.lexeme = str;
            return this;
        }

        @Required
        public Lexicon setTarget(String str) {
            this.target = str;
            return this;
        }
    }

    public static class Relation implements DomainType {

        @Required
        private String object;

        @Required
        private String relation;

        @Required
        private String subject;

        public Relation() {
        }

        public Relation(String str, String str2, String str3) {
            this.subject = str;
            this.relation = str2;
            this.object = str3;
        }

        @Required
        public String getObject() {
            return this.object;
        }

        @Required
        public String getRelation() {
            return this.relation;
        }

        @Required
        public String getSubject() {
            return this.subject;
        }

        @Required
        public Relation setObject(String str) {
            this.object = str;
            return this;
        }

        @Required
        public Relation setRelation(String str) {
            this.relation = str;
            return this;
        }

        @Required
        public Relation setSubject(String str) {
            this.subject = str;
            return this;
        }
    }

    public static class RelationEntity implements DomainType {

        @Required
        private String sid;

        public RelationEntity() {
        }

        public RelationEntity(String str) {
            this.sid = str;
        }

        @Required
        public String getSid() {
            return this.sid;
        }

        @Required
        public RelationEntity setSid(String str) {
            this.sid = str;
            return this;
        }
    }

    public static class SemanticInfo implements DomainType {

        @Required
        private String clause_category;

        @Required
        private String debug;

        public SemanticInfo() {
        }

        public SemanticInfo(String str, String str2) {
            this.clause_category = str;
            this.debug = str2;
        }

        @Required
        public String getClauseCategory() {
            return this.clause_category;
        }

        @Required
        public String getDebug() {
            return this.debug;
        }

        @Required
        public SemanticInfo setClauseCategory(String str) {
            this.clause_category = str;
            return this;
        }

        @Required
        public SemanticInfo setDebug(String str) {
            this.debug = str;
            return this;
        }
    }

    public static class BoxValue implements DomainType {

        @Required
        private String object;
        private Optional<Double> confidence = Optional.a();
        private Optional<String> target = Optional.a();
        private Optional<List<String>> src = Optional.a();
        private Optional<List<String>> role = Optional.a();
        private Optional<String> introduction = Optional.a();
        private Optional<String> actor = Optional.a();
        private Optional<String> image = Optional.a();

        public BoxValue() {
        }

        public Optional<String> getActor() {
            return this.actor;
        }

        public Optional<Double> getConfidence() {
            return this.confidence;
        }

        public Optional<String> getImage() {
            return this.image;
        }

        public Optional<String> getIntroduction() {
            return this.introduction;
        }

        @Required
        public String getObject() {
            return this.object;
        }

        public Optional<List<String>> getRole() {
            return this.role;
        }

        public Optional<List<String>> getSrc() {
            return this.src;
        }

        public Optional<String> getTarget() {
            return this.target;
        }

        public BoxValue setActor(String str) {
            this.actor = Optional.e(str);
            return this;
        }

        public BoxValue setConfidence(double d) {
            this.confidence = Optional.e(Double.valueOf(d));
            return this;
        }

        public BoxValue setImage(String str) {
            this.image = Optional.e(str);
            return this;
        }

        public BoxValue setIntroduction(String str) {
            this.introduction = Optional.e(str);
            return this;
        }

        @Required
        public BoxValue setObject(String str) {
            this.object = str;
            return this;
        }

        public BoxValue setRole(List<String> list) {
            this.role = Optional.e(list);
            return this;
        }

        public BoxValue setSrc(List<String> list) {
            this.src = Optional.e(list);
            return this;
        }

        public BoxValue setTarget(String str) {
            this.target = Optional.e(str);
            return this;
        }

        public BoxValue(String str) {
            this.object = str;
        }
    }

    public static class Individual implements DomainType {

        @Required
        private List<KgImage> IMAGE;

        @Required
        private List<InfoBox> INFO;

        @Required
        private String id;

        @Required
        private String label;

        @Required
        private long popularity;

        @Required
        private String summary;
        private Optional<String> desc = Optional.a();
        private Optional<List<String>> domain = Optional.a();
        private Optional<String> baidubaike_url = Optional.a();
        private Optional<List<String>> synonym = Optional.a();
        private Optional<List<String>> type = Optional.a();
        private Optional<List<String>> newType = Optional.a();
        private Optional<List<String>> tag = Optional.a();

        public Individual() {
        }

        public Optional<String> getBaidubaikeUrl() {
            return this.baidubaike_url;
        }

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<List<String>> getDomain() {
            return this.domain;
        }

        @Required
        public List<KgImage> getIMAGE() {
            return this.IMAGE;
        }

        @Required
        public List<InfoBox> getINFO() {
            return this.INFO;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getLabel() {
            return this.label;
        }

        public Optional<List<String>> getNewType() {
            return this.newType;
        }

        @Required
        public long getPopularity() {
            return this.popularity;
        }

        @Required
        public String getSummary() {
            return this.summary;
        }

        public Optional<List<String>> getSynonym() {
            return this.synonym;
        }

        public Optional<List<String>> getTag() {
            return this.tag;
        }

        public Optional<List<String>> getType() {
            return this.type;
        }

        public Individual setBaidubaikeUrl(String str) {
            this.baidubaike_url = Optional.e(str);
            return this;
        }

        public Individual setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public Individual setDomain(List<String> list) {
            this.domain = Optional.e(list);
            return this;
        }

        @Required
        public Individual setIMAGE(List<KgImage> list) {
            this.IMAGE = list;
            return this;
        }

        @Required
        public Individual setINFO(List<InfoBox> list) {
            this.INFO = list;
            return this;
        }

        @Required
        public Individual setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public Individual setLabel(String str) {
            this.label = str;
            return this;
        }

        public Individual setNewType(List<String> list) {
            this.newType = Optional.e(list);
            return this;
        }

        @Required
        public Individual setPopularity(long j) {
            this.popularity = j;
            return this;
        }

        @Required
        public Individual setSummary(String str) {
            this.summary = str;
            return this;
        }

        public Individual setSynonym(List<String> list) {
            this.synonym = Optional.e(list);
            return this;
        }

        public Individual setTag(List<String> list) {
            this.tag = Optional.e(list);
            return this;
        }

        public Individual setType(List<String> list) {
            this.type = Optional.e(list);
            return this;
        }

        public Individual(String str, String str2, long j, String str3, List<KgImage> list, List<InfoBox> list2) {
            this.id = str;
            this.label = str2;
            this.popularity = j;
            this.summary = str3;
            this.IMAGE = list;
            this.INFO = list2;
        }
    }
}
