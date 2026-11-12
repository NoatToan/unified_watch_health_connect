package com.xiaomi.ai.api.core.nlp;

/* JADX INFO: loaded from: classes6.dex */
public class Externals {

    public enum PPRejectionType {
        UNKNOWN(0),
        Accept(1),
        Reject(2),
        Unclear(3);

        private int id;

        PPRejectionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
