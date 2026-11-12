package mh1;

import com.garmin.android.apps.connectmobile.a2;
import o53.b0;
import o53.m1;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmh1/o;", "Lo53/b0;", "Lmh1/o$a;", "resultListener", "<init>", "(Lmh1/o$a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f118487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f118488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f118489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pc0.j f118490d;

    public interface a {
        void a(Long l14, String str);
    }

    public o(a aVar) {
        aVar.getClass();
        this.f118487a = aVar;
        this.f118488b = g8.i.c();
        this.f118489c = gt2.c.b(a2.DEVICES.f28756a);
        this.f118490d = pc0.j.a.a(pc0.j.f137223i);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f118488b);
    }
}
