package androidx.camera.core.impl;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class b1 implements l0.c<List<Surface>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f5507b;

    public b1(boolean z14, androidx.concurrent.futures.b.a aVar) {
        this.f5506a = z14;
        this.f5507b = aVar;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        boolean z14 = th3 instanceof TimeoutException;
        androidx.concurrent.futures.b.a aVar = this.f5507b;
        if (z14) {
            aVar.d(th3);
        } else {
            aVar.b(Collections.EMPTY_LIST);
        }
    }

    @Override // l0.c
    public final void onSuccess(List<Surface> list) {
        List<Surface> list2 = list;
        list2.getClass();
        ArrayList arrayList = new ArrayList(list2);
        if (this.f5506a) {
            arrayList.removeAll(Collections.singleton(null));
        }
        this.f5507b.b(arrayList);
    }
}
