package com.xiaomi.ai;

import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SpeechResult {
    public String action;
    public String answer;
    public String answerText;
    public String content;
    public boolean deleteSuccess;
    public String directive;
    public int displayDuration;
    public String domain;
    public String extraMessage;
    public String intention;
    public boolean isRegFinal;
    public boolean openMic;
    public String query;
    public boolean regSuccess;
    public String requestId;
    public String response;
    public String sessionId;
    public String toDisplay;
    public String toSpeak;
    public int unknownDomainAction;
    public int vadIdle;
    public String voiceUserId;
    public List<String> voiceUserIds;

    public String getAction() {
        return this.action;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getAnswerText() {
        return this.answerText;
    }

    public String getContent() {
        return this.content;
    }

    public String getDirective() {
        return this.directive;
    }

    public int getDisplayDuration() {
        return this.displayDuration;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getExtraMessage() {
        return this.extraMessage;
    }

    public String getIntention() {
        return this.intention;
    }

    public String getQuery() {
        return this.query;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getResponse() {
        return this.response;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getToDisplay() {
        return this.toDisplay;
    }

    public String getToSpeak() {
        return this.toSpeak;
    }

    public int getUnknownDomainAction() {
        return this.unknownDomainAction;
    }

    public int getVadIdle() {
        return this.vadIdle;
    }

    public List<String> getVoiceprintQueryUserIds() {
        return this.voiceUserIds;
    }

    public String getVoiceprintRecognizedUserId() {
        return this.voiceUserId;
    }

    public boolean isOpenMic() {
        return this.openMic;
    }

    public boolean isVoiceprintDeleteSuccess() {
        return this.deleteSuccess;
    }

    public boolean isVoiceprintRecognierSuccess() {
        return this.regSuccess;
    }

    public boolean isVoiceprintRegFinal() {
        return this.isRegFinal;
    }
}
