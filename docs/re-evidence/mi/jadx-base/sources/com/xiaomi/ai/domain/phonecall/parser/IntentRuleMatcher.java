package com.xiaomi.ai.domain.phonecall.parser;

import com.xiaomi.ai.domain.phonecall.util.DomainRecognizer;
import defpackage.aqe;
import defpackage.qpe;
import defpackage.y2e;

/* JADX INFO: loaded from: classes7.dex */
public class IntentRuleMatcher {
    private static final qpe LOGGER = aqe.f(IntentRuleMatcher.class);
    private static final IntentRuleMatcher instance = new IntentRuleMatcher();
    private volatile DomainRecognizer yellowPageRecognizer;

    private IntentRuleMatcher() {
        try {
            this.yellowPageRecognizer = new DomainRecognizer("phonecall", "phonecall-rules.conf", "phonecall.intention.yellowpage.positive", "phonecall.intention.yellowpage.negative");
        } catch (Exception e) {
            LOGGER.error("phonecall recognizer construct failed [{}]", e.getMessage());
            System.exit(-1);
        }
    }

    public static IntentRuleMatcher getInstance() {
        return instance;
    }

    public boolean isYellowPageCall(y2e y2eVar, String str) {
        return this.yellowPageRecognizer.isDomain(y2eVar, str) && !this.yellowPageRecognizer.hitNegative(y2eVar, str);
    }
}
