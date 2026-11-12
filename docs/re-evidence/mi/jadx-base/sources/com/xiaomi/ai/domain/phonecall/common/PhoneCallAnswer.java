package com.xiaomi.ai.domain.phonecall.common;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallAnswer {
    private String domain = "phonecall";
    private String action = ActionType.QUERY.toString();
    private String text = "";
    private PhoneCallContent content = null;
    private PhoneCallIntention intention = null;

    public String getAction() {
        return this.action;
    }

    public PhoneCallContent getContent() {
        return this.content;
    }

    public String getDomain() {
        return this.domain;
    }

    public PhoneCallIntention getIntention() {
        return this.intention;
    }

    public String getText() {
        return this.text;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setContent(PhoneCallContent phoneCallContent) {
        this.content = phoneCallContent;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setIntention(PhoneCallIntention phoneCallIntention) {
        this.intention = phoneCallIntention;
    }

    public void setText(String str) {
        this.text = str;
    }
}
