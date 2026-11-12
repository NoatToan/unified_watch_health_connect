package com.huami.mifit.sportlib.webkit;

/* JADX INFO: loaded from: classes11.dex */
public class SportHttpKit {
    private static volatile SportHttpKit b;
    private ISportHttpRequester a;

    private SportHttpKit() {
    }

    public static SportHttpKit getInstance() {
        if (b == null) {
            synchronized (SportHttpKit.class) {
                if (b == null) {
                    b = new SportHttpKit();
                }
            }
        }
        return b;
    }

    public ISportHttpRequester getRequester() {
        return this.a;
    }

    public void setRequester(ISportHttpRequester iSportHttpRequester) {
        this.a = iSportHttpRequester;
    }
}
