package li0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import f72.t9;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v62.i8;
import v62.j8;
import v62.j9;
import v62.r9;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BO\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00120\u0010\r\u001a,\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lli0/a0;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "Lu4/d;", "icon", "Lkotlin/Function4;", "Lli0/f;", "Landroid/content/Context;", "Lli0/d0;", "Lkotlin/Function1;", "", "", "action", "<init>", "(Ljava/lang/String;IILu4/d;Le23/r;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f112604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f112605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f112606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f112607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f112608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a0 f112609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a0 f112610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a0 f112611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a0[] f112612l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.d f112614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.r<li0.f, Context, d0, e23.l<? super Boolean, Unit>, Unit> f112615c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f112616a = new a();

        public a() {
            super(4, li0.f.class, "addFavorite", "addFavorite(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.i(lVar, new li0.h(fVar2, d0Var, context2, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f112617a = new b();

        public b() {
            super(4, li0.f.class, "removeFavorite", "removeFavorite(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.i(lVar, new k(fVar2, d0Var, context2, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f112618a = new c();

        public c() {
            super(4, li0.f.class, "muteUser", "muteUser(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.j(context2, d0Var, lVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f112619a = new d();

        public d() {
            super(4, li0.f.class, "unmuteUser", "unmuteUser(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.i(lVar, new q(fVar2, d0Var, context2, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f112620a = new e();

        public e() {
            super(4, li0.f.class, "blockUser", "blockUser(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.d(context2, d0Var, lVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f112621a = new f();

        public f() {
            super(4, li0.f.class, "unblockUser", "unblockUser(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.m(context2, d0Var, lVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f112622a = new g();

        public g() {
            super(4, li0.f.class, "unfollowUser", "unfollowUser(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.i(lVar, new p(fVar2, d0Var, context2, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.r<li0.f, Context, d0, e23.l<? super Boolean, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f112623a = new h();

        public h() {
            super(4, li0.f.class, "cancelRequest", "cancelRequest(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/follow/ui/FollowItemViewData;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(li0.f fVar, Context context, d0 d0Var, e23.l<? super Boolean, ? extends Unit> lVar) {
            li0.f fVar2 = fVar;
            Context context2 = context;
            fVar2.getClass();
            context2.getClass();
            fVar2.i(lVar, new i(fVar2, d0Var, context2, null));
            return Unit.INSTANCE;
        }
    }

    static {
        s62.a.f157643a.getClass();
        t62.b bVar = t62.b.f162798a;
        a0 a0Var = new a0("ADD_FAVORITE", 0, R.string.lbl_add_to_favorites, i8.a(bVar), a.f112616a);
        f112604d = a0Var;
        a0 a0Var2 = new a0("REMOVE_FAVORITE", 1, R.string.lbl_remove_from_favorites, j8.a(bVar), b.f112617a);
        f112605e = a0Var2;
        t62.c.f162799a.getClass();
        t9 t9Var = t9.f69810a;
        a0 a0Var3 = new a0("MUTE", 2, R.string.lbl_mute, j72.p.a(t9Var), c.f112618a);
        f112606f = a0Var3;
        a0 a0Var4 = new a0("UNMUTE", 3, R.string.lbl_unmute, j72.o.a(t9Var), d.f112619a);
        f112607g = a0Var4;
        a0 a0Var5 = new a0("BLOCK", 4, R.string.lbl_block, j9.a(bVar), e.f112620a);
        f112608h = a0Var5;
        a0 a0Var6 = new a0("UNBLOCK", 5, R.string.lbl_unblock, null, f.f112621a);
        f112609i = a0Var6;
        a0 a0Var7 = new a0("UNFOLLOW", 6, R.string.lbl_unfollow, r9.a(bVar), g.f112622a);
        f112610j = a0Var7;
        a0 a0Var8 = new a0("CANCEL_REQUEST", 7, R.string.connections_cancel_request, null, h.f112623a);
        f112611k = a0Var8;
        f112612l = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8};
    }

    private a0(String str, int i14, int i15, u4.d dVar, e23.r rVar) {
        super(str, i14);
        this.f112613a = i15;
        this.f112614b = dVar;
        this.f112615c = rVar;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f112612l.clone();
    }
}
