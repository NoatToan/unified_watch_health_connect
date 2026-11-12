package com.amazon.alexa.avs.message.response.templateruntime;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class RenderTemplate extends Payload {
    private String textField;
    private Title title;
    private String type;

    public final String getTextField() {
        return this.textField;
    }

    public final Title getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final void setTextField(String str) {
        this.textField = str;
    }

    public final void setTitle(Title title) {
        this.title = title;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
