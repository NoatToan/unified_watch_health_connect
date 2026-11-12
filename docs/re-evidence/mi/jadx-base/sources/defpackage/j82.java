package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes7.dex */
public class j82 implements Comparable<j82> {
    private String action;
    private boolean complete;
    private JsonObject debugInfo;
    private String domain;
    private JsonObject intentionInfo;
    private JsonArray optIntentions;
    private double prob;
    private String query;
    private double score;

    public j82(j82 j82Var) {
        this.intentionInfo = new JsonObject();
        this.query = j82Var.query;
        this.domain = j82Var.domain;
        this.score = j82Var.score;
        this.action = j82Var.action;
        this.complete = j82Var.complete;
        this.prob = j82Var.prob;
        this.optIntentions = j82Var.optIntentions;
        this.debugInfo = j82Var.debugInfo;
        this.intentionInfo = j82Var.intentionInfo;
    }

    public String getAction() {
        return this.action;
    }

    public JsonObject getDebugInfo() {
        return this.debugInfo;
    }

    public String getDomain() {
        return this.domain;
    }

    public JsonObject getIntentionInfo() {
        return this.intentionInfo;
    }

    public JsonArray getOptIntentions() {
        return this.optIntentions;
    }

    public double getProb() {
        return this.prob;
    }

    public String getQuery() {
        return this.query;
    }

    public double getScore() {
        return this.score;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setComplete(boolean z) {
        this.complete = z;
    }

    public void setDebugInfo(JsonObject jsonObject) {
        this.debugInfo = jsonObject;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setIntentionInfo(JsonObject jsonObject) {
        this.intentionInfo = jsonObject;
    }

    public void setOptIntentions(JsonArray jsonArray) {
        this.optIntentions = jsonArray;
    }

    public void setProb(double d) {
        this.prob = d;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setScore(double d) {
        this.score = d;
    }

    @Override // java.lang.Comparable
    public int compareTo(j82 j82Var) {
        return Double.compare(j82Var.score, this.score);
    }

    public j82() {
        this.intentionInfo = new JsonObject();
        this.debugInfo = new JsonObject();
    }
}
