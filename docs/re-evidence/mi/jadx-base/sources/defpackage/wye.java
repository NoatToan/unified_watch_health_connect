package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class wye extends e4h.a {
    public static e4h<wye> e;
    public static final Parcelable.Creator<wye> f;
    public float c;
    public float d;

    public class a implements Parcelable.Creator<wye> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wye createFromParcel(Parcel parcel) {
            wye wyeVar = new wye(0.0f, 0.0f);
            wyeVar.e(parcel);
            return wyeVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public wye[] newArray(int i) {
            return new wye[i];
        }
    }

    static {
        e4h<wye> e4hVarA = e4h.a(32, new wye(0.0f, 0.0f));
        e = e4hVarA;
        e4hVarA.g(0.5f);
        f = new a();
    }

    public wye() {
    }

    public static wye b() {
        return (wye) e.b();
    }

    public static wye c(float f2, float f3) {
        wye wyeVar = (wye) e.b();
        wyeVar.c = f2;
        wyeVar.d = f3;
        return wyeVar;
    }

    public static wye d(wye wyeVar) {
        wye wyeVar2 = (wye) e.b();
        wyeVar2.c = wyeVar.c;
        wyeVar2.d = wyeVar.d;
        return wyeVar2;
    }

    public static void f(wye wyeVar) {
        e.c(wyeVar);
    }

    @Override // e4h.a
    public e4h.a a() {
        return new wye(0.0f, 0.0f);
    }

    public void e(Parcel parcel) {
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
    }

    public wye(float f2, float f3) {
        this.c = f2;
        this.d = f3;
    }
}
