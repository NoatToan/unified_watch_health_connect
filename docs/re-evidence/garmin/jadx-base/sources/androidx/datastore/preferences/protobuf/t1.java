package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum t1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(h.f6707b),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6881a;

    t1(Object obj) {
        this.f6881a = obj;
    }
}
