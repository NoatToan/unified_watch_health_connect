package com.xiaomi.fitness.login.bean;

/* JADX INFO: loaded from: classes9.dex */
public class PrivacyModel {

    public static class ChangeRequest {
        public int client = 1;
        public int privacyId;
        public String ver;

        public ChangeRequest(int i, String str) {
            this.privacyId = i;
            this.ver = str;
        }
    }

    public class ChangeResult {
        public String changeLog;
        public int popType;
        public String ver;

        public ChangeResult() {
        }
    }
}
