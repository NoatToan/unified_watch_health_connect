package s70;

import android.content.Context;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f157680a;

    public d(Context context) {
        this.f157680a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        Context context = this.f157680a;
        l22.a aVar = new l22.a(context);
        o70.t.a aVar2 = o70.t.f130062f;
        return r13.a.b(((o70.t) t7).d(aVar, null), ((o70.t) t14).d(new l22.a(context), null));
    }
}
