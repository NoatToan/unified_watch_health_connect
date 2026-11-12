package ry2;

import android.app.Activity;
import e23.p;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;
import u53.o;
import uy2.w0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class b extends q implements p<List<? extends w0>, t13.d<? super w0>, Object> {
    public b(Object obj) {
        super(2, obj, xy2.b.class, "pickReturn", "pickReturn(Landroid/app/Activity;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // e23.p
    public final Object invoke(List<? extends w0> list, t13.d<? super w0> dVar) {
        Activity activity = (Activity) this.receiver;
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(o.f168762a, new xy2.a(activity, list, null), dVar);
    }
}
