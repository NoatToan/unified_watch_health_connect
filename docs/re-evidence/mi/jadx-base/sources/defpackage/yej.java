package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class yej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadableMap f40101a;

    public yej(ReadableMap readableMap) {
        this.f40101a = readableMap;
    }

    public boolean a(String str, boolean z) {
        return this.f40101a.isNull(str) ? z : this.f40101a.getBoolean(str);
    }

    public float b(String str, float f) {
        return this.f40101a.isNull(str) ? f : (float) this.f40101a.getDouble(str);
    }

    public int c(String str, int i) {
        return this.f40101a.isNull(str) ? i : this.f40101a.getInt(str);
    }

    public ReadableMap d(String str) {
        return this.f40101a.getMap(str);
    }

    public String e(String str) {
        return this.f40101a.getString(str);
    }

    public boolean f(String str) {
        return this.f40101a.hasKey(str);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f40101a.toString() + " }";
    }
}
