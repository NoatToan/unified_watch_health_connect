package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Template;

/* JADX INFO: loaded from: classes7.dex */
public class ParsedInstructions {
    private Phone.PhoneIntention intention = null;
    private Template.Toast toast = null;
    private SpeechSynthesizer.Speak speak = null;
    private SpeechRecognizer.ExpectSpeech expectSpeech = null;

    public SpeechRecognizer.ExpectSpeech getExpectSpeech() {
        return this.expectSpeech;
    }

    public Phone.PhoneIntention getIntention() {
        return this.intention;
    }

    public SpeechSynthesizer.Speak getSpeak() {
        return this.speak;
    }

    public Template.Toast getToast() {
        return this.toast;
    }

    public void setExpectSpeech(SpeechRecognizer.ExpectSpeech expectSpeech) {
        this.expectSpeech = expectSpeech;
    }

    public void setIntention(Phone.PhoneIntention phoneIntention) {
        this.intention = phoneIntention;
    }

    public void setSpeak(SpeechSynthesizer.Speak speak) {
        this.speak = speak;
    }

    public void setToast(Template.Toast toast) {
        this.toast = toast;
    }
}
