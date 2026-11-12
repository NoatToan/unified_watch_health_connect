package ff2;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.room.x;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.library.promotionlibrary.database.CampaignDatabase;
import ds.e0;
import ew1.c2;
import fb1.d0;
import java.io.File;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lff2/i;", "Lo53/b0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f71158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CampaignDatabase f71159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f71160d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71161a;

        static {
            int[] iArr = new int[kf2.d.values().length];
            try {
                iArr[kf2.d.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kf2.d.NO_OFFERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kf2.d.KILL_SWITCH_ACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71161a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.promotionlibrary.domain.CampaignRepository$clearAllData$1", f = "CampaignRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f71163b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f71163b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new b(this.f71163b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            hf2.a.C1650a c1650a = hf2.a.f83640a;
            i iVar = i.this;
            Context context = iVar.f71157a;
            c1650a.getClass();
            File dir = new ContextWrapper(context).getDir("campaignimages", 0);
            dir.getClass();
            wr.g.y("Deleted all images in subdirectories: ", a23.g.d(dir), hf2.a.C1650a.e());
            iVar.f71159c.clearAllTables();
            e23.a<Unit> aVar2 = this.f71163b;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ff2/i$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.a {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f71165a;

            static {
                int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f71165a = iArr;
            }
        }

        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
        public final void E(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
            com.garmin.android.library.backgroundtaskmanagement.b.c cVarF = bVar.f();
            int i14 = cVarF == null ? -1 : a.f71165a[cVarF.ordinal()];
            i iVar = i.this;
            if (i14 == 1) {
                iVar.b().debug("fetchCampaignsOperationListener success with code 200");
            } else if (i14 != 2) {
                com.airbnb.lottie.animation.keyframe.a.w("fetchCampaignsOperationListener failure: ", bVar.f().name(), iVar.b());
            } else {
                iVar.b().debug("fetchCampaignsOperationListener success with code 204: deleting cache");
                iVar.a(new h(iVar, 1));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
        public final void J(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            bVar.getClass();
            eVar.getClass();
            obj.getClass();
            f fVar = (f) obj;
            i iVar = i.this;
            iVar.b().debug("fetchCampaignsOperationListener onResults: Got " + fVar.a().size() + " campaigns ");
            iVar.a(new c2(15, iVar, fVar));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.promotionlibrary.domain.CampaignRepository$removeCampaignFromCache$1", f = "CampaignRepository.kt", l = {147}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71166a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f71168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f71168c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new d(this.f71168c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f71166a;
            long j8 = this.f71168c;
            i iVar = i.this;
            if (i14 == 0) {
                r.b(obj);
                df2.a aVarE = iVar.f71159c.e();
                this.f71166a = 1;
                if (aVarE.a(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            hf2.a.C1650a c1650a = hf2.a.f83640a;
            Context context = iVar.f71157a;
            c1650a.getClass();
            for (kf2.c cVar : kf2.c.values()) {
                hf2.a.f83640a.getClass();
                String strB = hf2.a.C1650a.b(j8, cVar);
                File fileC = hf2.a.C1650a.c(context, strB);
                hf2.a.C1650a.e().debug("Deleting file: " + fileC.getPath());
                hf2.a.C1650a.e().debug("Delete success for " + strB + " : " + fileC.delete());
            }
            return Unit.INSTANCE;
        }
    }

    public i(Context context) {
        context.getClass();
        this.f71157a = context;
        this.f71158b = o13.m.b(new d0(8));
        CampaignDatabase.b bVar = CampaignDatabase.f50536a;
        bVar.getClass();
        CampaignDatabase campaignDatabase = CampaignDatabase.f50537b;
        if (campaignDatabase == null) {
            synchronized (bVar) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                androidx.room.b0.a aVarA = x.a(applicationContext, CampaignDatabase.class, "Campaign_Database");
                aVarA.a(CampaignDatabase.f50538c);
                campaignDatabase = (CampaignDatabase) aVarA.b();
                CampaignDatabase.f50537b = campaignDatabase;
            }
        }
        this.f71159c = campaignDatabase;
        this.f71160d = new c();
    }

    public final void a(e23.a<Unit> aVar) {
        b().debug("clearAllData: ");
        ge1.b.T(this, null, null, new b(aVar, null), 3);
    }

    public final Logger b() {
        return (Logger) this.f71158b.getValue();
    }

    public final void c(ff2.a aVar, String str) {
        e0.v("handleFailedCaching: exception = ", str, b());
        e(kf2.a.CACHE_FAILED, aVar != null ? aVar.getCampaignId() : -1L);
        a(new h(this, 0));
    }

    public final void d(long j8) {
        b().debug("removeCampaignFromCache: " + j8);
        ge1.b.T(this, null, null, new d(j8, null), 3);
    }

    public final void e(kf2.a aVar, long j8) {
        aVar.getClass();
        b().debug("report user action " + aVar + "  on campaign " + j8);
        cf2.f.f27037a.getClass();
        cf2.b bVar = new cf2.b(aVar, j8, null, 4, null);
        bVar.b(new cf2.c(bVar));
        com.garmin.android.library.backgroundtaskmanagement.c.d(bVar, null);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a;
    }
}
