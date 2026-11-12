package defpackage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;

/* JADX INFO: loaded from: classes3.dex */
public class za3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Callback f41062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Callback f41063b;

    public za3(Callback callback, Callback callback2) {
        this.f41062a = callback;
        this.f41063b = callback2;
    }

    public void a(String str) {
        this.f41063b.invoke(str);
    }

    public void b(WritableArray writableArray) {
        this.f41062a.invoke(writableArray);
    }

    public void c(String str) {
        this.f41062a.invoke(str);
    }
}
