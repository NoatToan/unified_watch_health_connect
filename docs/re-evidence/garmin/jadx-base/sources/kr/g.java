package kr;

import android.content.Context;
import bq0.k;
import ch.qos.logback.core.CoreConstants;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkr/g;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f106215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bq0.c f106216b;

    static {
        new a(null);
    }

    public g(Context context) {
        context.getClass();
        this.f106215a = context;
        this.f106216b = new bq0.c(10, 0, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j8, k kVar, v13.c cVar) throws Throwable {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f106219c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f106219c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objE0 = hVar.f106217a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f106219c;
        try {
            if (i15 == 0) {
                r.b(objE0);
                x53.c cVar2 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                i iVar = new i(this, kVar, j8, null);
                hVar.f106219c = 1;
                objE0 = ge1.b.e0(bVar, iVar, hVar);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE0);
            }
            zp0.f fVar = (zp0.f) objE0;
            return new com.garmin.android.apps.connectmobile.activities.newmodel.d.a("image.".concat(fVar.f206589b), fVar.f206588a);
        } catch (Exception e4) {
            return new com.garmin.android.apps.connectmobile.activities.newmodel.d.b(e4);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkr/g$a;", "", "<init>", "()V", "", "MAX_IMAGE_SIZE_MB", "I", "", "MAX_IMAGE_SIZE_MB_STRING", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
