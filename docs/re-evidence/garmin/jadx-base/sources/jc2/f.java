package jc2;

/* JADX INFO: loaded from: classes11.dex */
public enum f {
    SUCCESS("Success"),
    FAILURE("Failure"),
    ABORT("Abort");

    public String jsonValue;

    f(String str) {
        this.jsonValue = str;
    }
}
