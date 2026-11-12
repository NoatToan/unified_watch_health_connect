package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class rj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32597b;
    public String c;
    public Double d;

    public rj3(String str, String str2, String str3, Double d) {
        this.f32596a = str;
        this.f32597b = str2;
        this.c = str3;
        this.d = d;
    }

    public static rj3 a(ReadableMap readableMap) {
        return new rj3(readableMap.getString("format"), readableMap.getString("type"), readableMap.getString("filePath"), Double.valueOf(readableMap.getDouble("quality")));
    }

    public WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("format", this.f32596a);
        writableMapCreateMap.putString("type", this.f32597b);
        writableMapCreateMap.putString("filePath", this.c);
        writableMapCreateMap.putDouble("quality", this.d.doubleValue());
        return writableMapCreateMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rj3 rj3Var = (rj3) obj;
        String str = this.f32596a;
        if (str == null ? rj3Var.f32596a != null : !str.equals(rj3Var.f32596a)) {
            return false;
        }
        String str2 = this.f32597b;
        if (str2 == null ? rj3Var.f32597b != null : !str2.equals(rj3Var.f32597b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null ? rj3Var.c != null : !str3.equals(rj3Var.c)) {
            return false;
        }
        Double d = this.d;
        Double d2 = rj3Var.d;
        if (d != null) {
            if (d.equals(d2)) {
                return true;
            }
        } else if (d2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f32596a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32597b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Double d = this.d;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }
}
