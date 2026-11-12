package com.xiaomi.ai.api.intent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.common.Optional;
import defpackage.zsd;

/* JADX INFO: loaded from: classes7.dex */
public class IntentionInfo {
    private Optional<Confidence> confidence;
    private Optional<Integer> dialog_round;
    private DialogStatus dialog_status;
    private Optional<Integer> dialog_trace_index;
    private String domain;
    private Optional<String> experiment;
    private String query;
    private Optional<Boolean> scenario;
    private double score;

    public IntentionInfo() {
        this.dialog_round = Optional.a();
        this.experiment = Optional.a();
        this.scenario = Optional.a();
        this.confidence = Optional.a();
        this.dialog_trace_index = Optional.a();
    }

    public static IntentionInfo read(zsd zsdVar) throws JsonProcessingException {
        IntentionInfo intentionInfo = new IntentionInfo();
        if (zsdVar.z("domain")) {
            intentionInfo.setDomain((String) IntentUtils.fromJsonNode(zsdVar.w("domain"), String.class));
        }
        if (zsdVar.z(SearchIntents.EXTRA_QUERY)) {
            intentionInfo.setQuery((String) IntentUtils.fromJsonNode(zsdVar.w(SearchIntents.EXTRA_QUERY), String.class));
        }
        if (zsdVar.z("score")) {
            intentionInfo.setScore(((Double) IntentUtils.fromJsonNode(zsdVar.w("score"), Double.class)).doubleValue());
        }
        if (zsdVar.z("dialog_status")) {
            intentionInfo.setDialogStatus(DialogStatus.read((String) IntentUtils.fromJsonNode(zsdVar.w("dialog_status"), String.class)));
        }
        if (zsdVar.z("dialog_round")) {
            intentionInfo.setDialogRound(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("dialog_round"), Integer.class)));
        }
        if (zsdVar.z("experiment")) {
            intentionInfo.setExperiment(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("experiment"), String.class)));
        }
        if (zsdVar.z("scenario")) {
            intentionInfo.setScenario(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("scenario"), Boolean.class)));
        }
        if (zsdVar.z("confidence")) {
            intentionInfo.setConfidence(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("confidence"), Confidence.class)));
        }
        if (zsdVar.z("dialog_trace_index")) {
            intentionInfo.setDialog_trace_index(Optional.e(IntentUtils.fromJsonNode(zsdVar.w("dialog_trace_index"), Integer.class)));
        }
        return intentionInfo;
    }

    public Optional<Confidence> getConfidence() {
        return this.confidence;
    }

    public Optional<Integer> getDialogRound() {
        return this.dialog_round;
    }

    public DialogStatus getDialogStatus() {
        return this.dialog_status;
    }

    public Optional<Integer> getDialog_round() {
        return this.dialog_round;
    }

    public Optional<Integer> getDialog_trace_index() {
        return this.dialog_trace_index;
    }

    public String getDomain() {
        return this.domain;
    }

    public Optional<String> getExperiment() {
        return this.experiment;
    }

    public String getQuery() {
        return this.query;
    }

    public Optional<Boolean> getScenario() {
        return this.scenario;
    }

    public double getScore() {
        return this.score;
    }

    public void setConfidence(Optional<Confidence> optional) {
        this.confidence = optional;
    }

    public void setDialogRound(Optional<Integer> optional) {
        this.dialog_round = optional;
    }

    public void setDialogStatus(DialogStatus dialogStatus) {
        this.dialog_status = dialogStatus;
    }

    public void setDialog_round(Optional<Integer> optional) {
        this.dialog_round = optional;
    }

    public void setDialog_trace_index(Optional<Integer> optional) {
        this.dialog_trace_index = optional;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setExperiment(Optional<String> optional) {
        this.experiment = optional;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setScenario(Optional<Boolean> optional) {
        this.scenario = optional;
    }

    public void setScore(double d) {
        this.score = d;
    }

    public IntentionInfo(String str, String str2, double d, DialogStatus dialogStatus, Optional<Integer> optional, Optional<String> optional2, Optional<Boolean> optional3, Optional<Confidence> optional4) {
        this.dialog_round = Optional.a();
        this.experiment = Optional.a();
        this.scenario = Optional.a();
        this.confidence = Optional.a();
        this.dialog_trace_index = Optional.a();
        this.domain = str;
        this.query = str2;
        this.score = d;
        this.dialog_status = dialogStatus;
        this.dialog_round = optional;
        this.experiment = optional2;
        this.scenario = optional3;
        this.confidence = optional4;
    }

    public IntentionInfo(String str, String str2, double d, DialogStatus dialogStatus, Optional<Integer> optional, Optional<String> optional2, Optional<Boolean> optional3) {
        this.dialog_round = Optional.a();
        this.experiment = Optional.a();
        this.scenario = Optional.a();
        this.confidence = Optional.a();
        this.dialog_trace_index = Optional.a();
        this.domain = str;
        this.query = str2;
        this.score = d;
        this.dialog_status = dialogStatus;
        this.dialog_round = optional;
        this.experiment = optional2;
        this.scenario = optional3;
    }

    public IntentionInfo(String str, String str2, double d, DialogStatus dialogStatus, Optional<Integer> optional, Optional<String> optional2) {
        this.dialog_round = Optional.a();
        this.experiment = Optional.a();
        this.scenario = Optional.a();
        this.confidence = Optional.a();
        this.dialog_trace_index = Optional.a();
        this.domain = str;
        this.query = str2;
        this.score = d;
        this.dialog_status = dialogStatus;
        this.dialog_round = optional;
        this.experiment = optional2;
    }

    public IntentionInfo(String str, String str2, double d) {
        this.dialog_round = Optional.a();
        this.experiment = Optional.a();
        this.scenario = Optional.a();
        this.confidence = Optional.a();
        this.dialog_trace_index = Optional.a();
        this.domain = str;
        this.query = str2;
        this.score = d;
        this.dialog_status = DialogStatus.FINISH;
    }

    public IntentionInfo(String str, String str2, double d, DialogStatus dialogStatus) {
        this.dialog_round = Optional.a();
        this.experiment = Optional.a();
        this.scenario = Optional.a();
        this.confidence = Optional.a();
        this.dialog_trace_index = Optional.a();
        this.domain = str;
        this.query = str2;
        this.score = d;
        this.dialog_status = dialogStatus;
    }
}
