package hz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.newsfeed.db.NewsFeedDatabase;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhz0/m;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lpz0/c;", "newsFeedApi", "Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase;", "newsFeedDatabase", "<init>", "(Lpz0/c;Lcom/garmin/android/apps/connectmobile/newsfeed/db/NewsFeedDatabase;)V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f86458c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz0.c f86459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NewsFeedDatabase f86460b;

    public m(pz0.c cVar, NewsFeedDatabase newsFeedDatabase) {
        cVar.getClass();
        newsFeedDatabase.getClass();
        this.f86459a = cVar;
        this.f86460b = newsFeedDatabase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i14, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i15 = rVar.f86475c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                rVar.f86475c = i15 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objB = rVar.f86473a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = rVar.f86475c;
        if (i16 == 0) {
            o13.r.b(objB);
            kz0.a aVarE = this.f86460b.e();
            rVar.f86475c = 1;
            objB = aVarE.b(i14, rVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        return Boolean.valueOf(p005kotlin.jvm.internal.s.g(objB, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j8, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f86478c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f86478c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objC = sVar.f86476a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f86478c;
        if (i15 == 0) {
            o13.r.b(objC);
            kz0.c cVarF = this.f86460b.f();
            sVar.f86478c = 1;
            objC = cVarF.c(j8, sVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return Boolean.valueOf(p005kotlin.jvm.internal.s.g(objC, Boolean.TRUE));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhz0/m$a;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(Context context) {
            context.getClass();
            pz0.c cVar = (pz0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.c.class, new c83.h.a[0], null, null, null, 120);
            NewsFeedDatabase.a aVar = NewsFeedDatabase.f39517a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            aVar.getClass();
            return new m(cVar, NewsFeedDatabase.a.a(applicationContext));
        }

        private a() {
        }
    }
}
