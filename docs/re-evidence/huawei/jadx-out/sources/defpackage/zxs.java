package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zxs<T> {
    private final String key;
    private final Class<T> valueType;

    public zxs(String str, Class<T> cls) {
        this(str, cls, null);
    }

    public zxs(String str, Class<T> cls, zxv<zxs<?>> zxvVar) {
        if (str == null) {
            throw new NullPointerException("Key must not be null!");
        }
        if (cls == null) {
            throw new NullPointerException("Value Type must not be null!");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Key must not be empty!");
        }
        this.key = str;
        this.valueType = cls;
        if (zxvVar != null) {
            zxvVar.a(this);
        }
    }

    public final Class<T> getValueType() {
        return this.valueType;
    }

    public final String getKey() {
        return this.key;
    }

    public String toString() {
        return this.key;
    }
}
