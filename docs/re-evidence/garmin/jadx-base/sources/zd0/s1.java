package zd0;

import android.content.Context;
import okhttp3.OkHttpClient;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzd0/s1;", "Lby2/a;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s1 implements by2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f204131a;

    public s1(Context context) {
        this.f204131a = context;
    }

    @Override // ed2.a
    public final OkHttpClient c() {
        bz0.o.f22274a.getClass();
        return (OkHttpClient) bz0.o.i().get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(OkHttpClient.class), QualifierKt.named("omtHttpClient"), (e23.a<? extends ParametersHolder>) null);
    }

    @Override // by2.a
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final Context getF204131a() {
        return this.f204131a;
    }
}
