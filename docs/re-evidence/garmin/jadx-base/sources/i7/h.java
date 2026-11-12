package i7;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class h implements Callable<j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f91924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f91925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f91926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91927d;

    public h(String str, Context context, List list, int i14) {
        this.f91924a = str;
        this.f91925b = context;
        this.f91926c = list;
        this.f91927d = i14;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() {
        try {
            return j.b(this.f91924a, this.f91925b, this.f91926c, this.f91927d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
