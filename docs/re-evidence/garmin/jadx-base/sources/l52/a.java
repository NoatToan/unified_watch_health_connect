package l52;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.v2;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ll52/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110209a;

    static {
        new C2106a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f110209a = tn.k.g(context.getCacheDir().getAbsolutePath(), "/audioNotes/");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, v13.c cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f110227c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f110227c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f110225a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f110227c;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            File file = new File(tn.k.g(this.f110209a, str2));
            x53.c cVar3 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            d dVar = new d(str, file, null);
            cVar2.f110227c = 1;
            Object objE0 = ge1.b.e0(bVar, dVar, cVar2);
            return objE0 == aVar ? aVar : objE0;
        } catch (Exception e4) {
            return new v2.a(new Exception(e4.getMessage()), null, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: l52.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll52/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_FILE_AGE", "J", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2106a {
        public /* synthetic */ C2106a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2106a() {
        }
    }
}
