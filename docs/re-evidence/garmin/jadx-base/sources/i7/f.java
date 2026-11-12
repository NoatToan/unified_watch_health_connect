package i7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Callable<j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f91919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f91920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f91921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91922d;

    public f(String str, Context context, e eVar, int i14) {
        this.f91919a = str;
        this.f91920b = context;
        this.f91921c = eVar;
        this.f91922d = i14;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() {
        Object[] objArr = {this.f91921c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return j.b(this.f91919a, this.f91920b, Collections.unmodifiableList(arrayList), this.f91922d);
    }
}
