package hz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$checkForUpdates$1", f = "NewsFeedViewModel.kt", l = {140, 141, 154, 158, 175, 177}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NewsFeedViewModel f86496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a f86497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.a f86498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l f86499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f86500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f86501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f86504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ NewsFeedViewModel f86506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f86507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f86508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e23.l<wg0.a, Unit> f86509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f86510o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lwg0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel$checkForUpdates$1$1$activityPostResult$1", f = "NewsFeedViewModel.kt", l = {159}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends wg0.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewsFeedViewModel f86512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f86513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f86514d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NewsFeedViewModel newsFeedViewModel, Context context, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86512b = newsFeedViewModel;
            this.f86513c = context;
            this.f86514d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86512b, this.f86513c, this.f86514d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends wg0.a>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86511a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            int i15 = NewsFeedViewModel.f39455j;
            iz0.a aVar2 = (iz0.a) this.f86512b.f39460f.getValue();
            this.f86511a = 1;
            Object objR = aVar2.r(this.f86513c, this.f86514d, this);
            return objR == aVar ? aVar : objR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(NewsFeedViewModel newsFeedViewModel, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super wg0.a, Unit> lVar, Context context, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f86506k = newsFeedViewModel;
        this.f86507l = aVar;
        this.f86508m = aVar2;
        this.f86509n = lVar;
        this.f86510o = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f86506k, this.f86507l, this.f86508m, this.f86509n, this.f86510o, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00de  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0102  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [android.content.Context, com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel, e23.a, e23.l, java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0179 -> B:50:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01ae -> B:64:0x01af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz0.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
