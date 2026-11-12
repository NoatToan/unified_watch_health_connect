package com.xiaomi.fitness.nfc.bean.result;

import defpackage.vqg;

/* JADX INFO: loaded from: classes9.dex */
public class ResultStateFactory {
    private ResultStateFactory() {
    }

    public static <T extends ResultState> T getResultState(String str) {
        vqg.d("getResultState:" + str);
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Exception e) {
            vqg.c("getResultState failed.", e);
            return null;
        }
    }
}
