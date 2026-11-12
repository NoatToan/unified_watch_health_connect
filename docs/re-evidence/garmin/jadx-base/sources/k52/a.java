package k52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk52/a;", "Lk52/e;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f102937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l22.b bVar) {
        super(bVar);
        bVar.getClass();
        this.f102937c = bVar;
    }

    public final String c(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar) {
        String benchmarkKey;
        String benchmarkName = bVar != null ? bVar.getBenchmarkName() : null;
        if (benchmarkName == null || benchmarkName.length() <= 0) {
            return (bVar == null || (benchmarkKey = bVar.getBenchmarkKey()) == null) ? this.f102948b : benchmarkKey;
        }
        return benchmarkName;
    }
}
