package com.facebook.share;

/* JADX INFO: loaded from: classes2.dex */
public interface Sharer {

    public static class Result {
        public final String a;

        public Result(String str) {
            this.a = str;
        }

        public String getPostId() {
            return this.a;
        }
    }

    boolean getShouldFailOnDataError();

    void setShouldFailOnDataError(boolean z);
}
