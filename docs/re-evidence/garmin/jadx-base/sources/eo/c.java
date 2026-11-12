package eo;

import android.content.Context;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64760a;

    public c(Context context) {
        this.f64760a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int i14 = ((qs.g) t7).f147087d;
        Context context = this.f64760a;
        return r13.a.b(context.getString(i14), context.getString(((qs.g) t14).f147087d));
    }
}
