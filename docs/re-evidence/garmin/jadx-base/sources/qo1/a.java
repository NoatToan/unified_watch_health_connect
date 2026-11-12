package qo1;

import am.b2;
import c83.h;
import com.garmin.android.apps.connectmobile.f0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqo1/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lam/b2;", "activityApi", "<init>", "(Lam/b2;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2749a f145955b = new C2749a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f145956a;

    public a(b2 b2Var) {
        b2Var.getClass();
        this.f145956a = b2Var;
    }

    /* JADX INFO: renamed from: qo1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqo1/a$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2749a {
        public /* synthetic */ C2749a(j jVar) {
            this();
        }

        public static a a() {
            Gson gsonCreate = new GsonBuilder().serializeNulls().create();
            gsonCreate.getClass();
            return new a((b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new h.a[0], gsonCreate, null, null, 112));
        }

        private C2749a() {
        }
    }
}
