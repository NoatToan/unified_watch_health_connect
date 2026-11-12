package wn1;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$loadFriendData$1", f = "InviteFriendsViewModel.kt", l = {99, 110, 121, 132, SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f186318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.i0 f186319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f186320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f186321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f186322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f186323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f186324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f186325h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lhi0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$loadFriendData$1$childAccountsTask$1", f = "InviteFriendsViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends hi0.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f186327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f186327b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f186327b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends hi0.a>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186326a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            j0 j0Var = this.f186327b.f186270g;
            this.f186326a = 1;
            Object objD = j0Var.d(this);
            return objD == aVar ? aVar : objD;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lhi0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$loadFriendData$1$getFriendsTask$1", f = "InviteFriendsViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends hi0.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f186329b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f186329b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f186329b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends hi0.a>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186328a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ei0.d dVar = this.f186329b.f186264a;
            this.f186328a = 1;
            Object objE0 = ei0.d.E0(dVar, null, this, 7);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/smartscale/model/e;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$loadFriendData$1$invitedFriendsTask$1", f = "InviteFriendsViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.smartscale.model.e>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f186331b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f186331b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f186331b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends com.garmin.android.apps.connectmobile.smartscale.model.e>>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186330a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            n nVar = this.f186331b;
            t tVar = nVar.f186265b;
            long j8 = nVar.f186273j;
            this.f186330a = 1;
            tVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(tVar, new x(j8, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n nVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f186325h = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f186325h, dVar);
        rVar.f186324g = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00df A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0119 A[Catch: all -> 0x002d, PHI: r2 r3 r4
      0x0119: PHI (r2v7 java.util.List) = (r2v4 java.util.List), (r2v11 java.util.List) binds: [B:48:0x0116, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r3v8 java.util.List) = (r3v7 java.util.List), (r3v15 java.util.List) binds: [B:48:0x0116, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v10 java.lang.Object) binds: [B:48:0x0116, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011f A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0126 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012a A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b A[Catch: all -> 0x002d, PHI: r0 r2 r3
      0x015b: PHI (r0v10 java.util.List) = (r0v7 java.util.List), (r0v16 java.util.List) binds: [B:57:0x0158, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r2v8 java.util.List) = (r2v7 java.util.List), (r2v12 java.util.List) binds: [B:57:0x0158, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r3v10 java.lang.Object) = (r3v9 java.lang.Object), (r3v16 java.lang.Object) binds: [B:57:0x0158, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0164 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0192 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0198 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x0026, B:67:0x0181, B:16:0x003b, B:59:0x015b, B:61:0x0164, B:64:0x016b, B:19:0x0046, B:50:0x0119, B:52:0x011f, B:56:0x0146, B:53:0x0126, B:55:0x012a, B:70:0x0192, B:71:0x0197, B:22:0x0051, B:41:0x00d9, B:43:0x00df, B:47:0x0106, B:44:0x00e6, B:46:0x00ea, B:72:0x0198, B:73:0x019d, B:25:0x005d, B:32:0x009a, B:34:0x00a0, B:38:0x00c7, B:35:0x00a7, B:37:0x00ab, B:74:0x019e, B:75:0x01a3, B:28:0x0067), top: B:78:0x001a }] */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        if (r0 == r5) goto L66;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00ea, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x012a, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.i0 i0VarJ;
        Object objC;
        o53.j0 j0Var;
        List list;
        Object objAwait;
        v2 v2Var;
        List list2;
        Object objAwait2;
        v2 v2Var2;
        List list3;
        Object objY4;
        Object objX4;
        o53.b0 b0Var = (o53.b0) this.f186324g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186323f;
        n nVar = this.f186325h;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                nVar.f186271h.k(null, Boolean.TRUE);
                o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(nVar, null), 3);
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(nVar, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new a(nVar, null), 3);
                this.f186324g = b0Var;
                this.f186318a = j0VarJ2;
                this.f186319b = i0VarJ;
                this.f186323f = 1;
                objC = j0VarJ.C(this);
                if (objC != aVar) {
                    j0Var = j0VarJ2;
                }
                return aVar;
            }
            if (i14 == 1) {
                o53.i0 i0Var = this.f186319b;
                j0Var = this.f186318a;
                o13.r.b(obj);
                i0VarJ = i0Var;
                objC = obj;
            } else {
                if (i14 == 2) {
                    list = this.f186320c;
                    o53.i0 i0Var2 = this.f186319b;
                    o13.r.b(obj);
                    i0VarJ = i0Var2;
                    objAwait = obj;
                    v2Var = (v2) objAwait;
                    if (v2Var instanceof v2.b) {
                        list2 = (List) ((v2.b) v2Var).f47386a;
                    } else {
                        if (v2Var instanceof v2.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = "Failed to get invited friends: " + ((v2.a) v2Var).f47383a;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "InviteFriendsViewModel", str);
                        list2 = p13.j0.f134944a;
                    }
                    this.f186324g = b0Var;
                    this.f186318a = null;
                    this.f186319b = null;
                    this.f186320c = list;
                    this.f186321d = list2;
                    this.f186323f = 3;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 == aVar) {
                        v2Var2 = (v2) objAwait2;
                        if (v2Var2 instanceof v2.b) {
                            list3 = (List) ((v2.b) v2Var2).f47386a;
                        } else {
                            if (!(v2Var2 instanceof v2.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String str2 = "Failed to get child accounts: " + ((v2.a) v2Var2).f47383a;
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var2, "InviteFriendsViewModel", str2);
                            list3 = p13.j0.f134944a;
                        }
                        this.f186324g = null;
                        this.f186318a = null;
                        this.f186319b = null;
                        this.f186320c = null;
                        this.f186321d = list2;
                        this.f186322e = list3;
                        this.f186323f = 4;
                        objY4 = nVar.y4(list, list2, this);
                        if (objY4 != aVar) {
                            nVar.f186266c.setValue((List) objY4);
                            if (list3 != null) {
                                this.f186324g = null;
                                this.f186318a = null;
                                this.f186319b = null;
                                this.f186320c = null;
                                this.f186321d = null;
                                this.f186322e = null;
                                this.f186323f = 5;
                                objX4 = nVar.x4(list3, list2, this);
                            }
                            nVar.f186271h.k(null, Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    list2 = this.f186321d;
                    list = this.f186320c;
                    o13.r.b(obj);
                    objAwait2 = obj;
                    v2Var2 = (v2) objAwait2;
                    if (v2Var2 instanceof v2.b) {
                        list3 = (List) ((v2.b) v2Var2).f47386a;
                    } else {
                        if (!(v2Var2 instanceof v2.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str3 = "Failed to get child accounts: " + ((v2.a) v2Var2).f47383a;
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var3, "InviteFriendsViewModel", str3);
                        list3 = p13.j0.f134944a;
                    }
                    this.f186324g = null;
                    this.f186318a = null;
                    this.f186319b = null;
                    this.f186320c = null;
                    this.f186321d = list2;
                    this.f186322e = list3;
                    this.f186323f = 4;
                    objY4 = nVar.y4(list, list2, this);
                    if (objY4 != aVar) {
                        nVar.f186266c.setValue((List) objY4);
                        if (list3 != null) {
                            this.f186324g = null;
                            this.f186318a = null;
                            this.f186319b = null;
                            this.f186320c = null;
                            this.f186321d = null;
                            this.f186322e = null;
                            this.f186323f = 5;
                            objX4 = nVar.x4(list3, list2, this);
                        }
                        nVar.f186271h.k(null, Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
                if (i14 == 4) {
                    list3 = this.f186322e;
                    list2 = this.f186321d;
                    o13.r.b(obj);
                    objY4 = obj;
                    nVar.f186266c.setValue((List) objY4);
                    if (list3 != null && !list3.isEmpty()) {
                        this.f186324g = null;
                        this.f186318a = null;
                        this.f186319b = null;
                        this.f186320c = null;
                        this.f186321d = null;
                        this.f186322e = null;
                        this.f186323f = 5;
                        objX4 = nVar.x4(list3, list2, this);
                    }
                    nVar.f186271h.k(null, Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objX4 = obj;
            }
            nVar.f186268e.setValue((List) objX4);
            nVar.f186271h.k(null, Boolean.FALSE);
            return Unit.INSTANCE;
            v2 v2Var3 = (v2) objC;
            if (v2Var3 instanceof v2.b) {
                list = (List) ((v2.b) v2Var3).f47386a;
            } else {
                if (!(v2Var3 instanceof v2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = "Failed to get friends: " + ((v2.a) v2Var3).f47383a;
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var4, "InviteFriendsViewModel", str4);
                list = p13.j0.f134944a;
            }
            this.f186324g = b0Var;
            this.f186318a = null;
            this.f186319b = i0VarJ;
            this.f186320c = list;
            this.f186323f = 2;
            objAwait = j0Var.await(this);
            if (objAwait != aVar) {
                v2Var = (v2) objAwait;
                if (v2Var instanceof v2.b) {
                    list2 = (List) ((v2.b) v2Var).f47386a;
                } else {
                    if (v2Var instanceof v2.a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str5 = "Failed to get invited friends: " + ((v2.a) v2Var).f47383a;
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var5, "InviteFriendsViewModel", str5);
                    list2 = p13.j0.f134944a;
                }
                this.f186324g = b0Var;
                this.f186318a = null;
                this.f186319b = null;
                this.f186320c = list;
                this.f186321d = list2;
                this.f186323f = 3;
                objAwait2 = i0VarJ.await(this);
                if (objAwait2 == aVar) {
                    v2Var2 = (v2) objAwait2;
                    if (v2Var2 instanceof v2.b) {
                        list3 = (List) ((v2.b) v2Var2).f47386a;
                    } else {
                        if (!(v2Var2 instanceof v2.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str6 = "Failed to get child accounts: " + ((v2.a) v2Var2).f47383a;
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var6 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.f(a2Var6, "InviteFriendsViewModel", str6);
                        list3 = p13.j0.f134944a;
                    }
                    this.f186324g = null;
                    this.f186318a = null;
                    this.f186319b = null;
                    this.f186320c = null;
                    this.f186321d = list2;
                    this.f186322e = list3;
                    this.f186323f = 4;
                    objY4 = nVar.y4(list, list2, this);
                    if (objY4 != aVar) {
                        nVar.f186266c.setValue((List) objY4);
                        if (list3 != null) {
                            this.f186324g = null;
                            this.f186318a = null;
                            this.f186319b = null;
                            this.f186320c = null;
                            this.f186321d = null;
                            this.f186322e = null;
                            this.f186323f = 5;
                            objX4 = nVar.x4(list3, list2, this);
                        }
                        nVar.f186271h.k(null, Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        } catch (Throwable th3) {
            nVar.f186271h.k(null, Boolean.FALSE);
            throw th3;
        }
    }
}
