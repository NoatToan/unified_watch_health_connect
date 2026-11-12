package r31;

import i3.fe;
import i3.se;
import i3.wd;
import i3.yd;
import lc.u0;
import o53.b0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingScreenKt$OnboardingSwipableItemsSection$1$1$3$1$1", f = "DeviceOnboardingScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f149995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<k31.c, d31.c, Unit> f149996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k31.c f149997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f149998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f149999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f150000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f150001g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingScreenKt$OnboardingSwipableItemsSection$1$1$3$1$1$1", f = "DeviceOnboardingScreen.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<k31.c, d31.c, Unit> f150003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k31.c f150004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fe f150005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f150006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f150007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f150008g;

        /* JADX INFO: renamed from: r31.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2818a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f150009a;

            static {
                int[] iArr = new int[se.values().length];
                try {
                    iArr[se.Dismissed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[se.ActionPerformed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f150009a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super k31.c, ? super d31.c, Unit> pVar, k31.c cVar, fe feVar, String str, String str2, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f150003b = pVar;
            this.f150004c = cVar;
            this.f150005d = feVar;
            this.f150006e = str;
            this.f150007f = str2;
            this.f150008g = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f150003b, this.f150004c, this.f150005d, this.f150006e, this.f150007f, this.f150008g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150002a;
            e23.p<k31.c, d31.c, Unit> pVar = this.f150003b;
            k31.c cVar = this.f150004c;
            if (i14 == 0) {
                o13.r.b(obj);
                pVar.invoke(cVar, d31.c.IGNORED);
                wd wdVar = (wd) this.f150005d.f88108b.getF182175a();
                if (wdVar != null) {
                    wdVar.dismiss();
                }
                yd ydVar = yd.Short;
                this.f150002a = 1;
                aVar = this;
                obj = fe.b(this.f150005d, this.f150006e, this.f150007f, ydVar, aVar, 4);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                aVar = this;
            }
            int i15 = C2818a.f150009a[((se) obj).ordinal()];
            e23.a<Unit> aVar3 = aVar.f150008g;
            if (i15 == 1) {
                aVar3.invoke();
                f.e(cVar.f102645a, d31.c.IGNORED);
            } else {
                if (i15 != 2) {
                    u0.r();
                    return null;
                }
                pVar.invoke(cVar, d31.c.NOT_STARTED);
                aVar3.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(b0 b0Var, e23.p<? super k31.c, ? super d31.c, Unit> pVar, k31.c cVar, fe feVar, String str, String str2, e23.a<Unit> aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f149995a = b0Var;
        this.f149996b = pVar;
        this.f149997c = cVar;
        this.f149998d = feVar;
        this.f149999e = str;
        this.f150000f = str2;
        this.f150001g = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f149995a, this.f149996b, this.f149997c, this.f149998d, this.f149999e, this.f150000f, this.f150001g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(this.f149995a, null, null, new a(this.f149996b, this.f149997c, this.f149998d, this.f149999e, this.f150000f, this.f150001g, null), 3);
        return Unit.INSTANCE;
    }
}
