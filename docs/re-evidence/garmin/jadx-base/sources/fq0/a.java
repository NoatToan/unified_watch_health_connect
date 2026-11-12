package fq0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import cq0.j;
import iu1.k;
import java.util.List;
import l20.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq0/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/e;", "Ll20/r;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.library.backgroundtaskmanagement.e<r> {

    /* JADX INFO: renamed from: fq0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fq0/a$a", "Liu1/k;", "Ll20/r;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1474a implements k<r> {
        public C1474a() {
        }

        @Override // iu1.k
        public final void onSuccess(r rVar) {
            r rVar2 = rVar;
            a.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, rVar2);
            j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
            List<l20.a> listF = rVar2.f();
            jVar.r(listF != null ? !listF.isEmpty() : false);
        }
    }

    public a(com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.HIGH_PRIORITY, aVar);
        cw.e.a(this, new gq0.c(new C1474a()));
    }
}
