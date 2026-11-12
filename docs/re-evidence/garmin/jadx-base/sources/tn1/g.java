package tn1;

import androidx.lifecycle.u1;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltn1/g;", "Landroidx/lifecycle/u1;", "Ltn1/d;", "sleepEducationFeature", "Ltn1/c;", "sleepEducationDataSource", "Ltn1/a;", "sleepEducationAnalyticsLogger", "<init>", "(Ltn1/d;Ltn1/c;Ltn1/a;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f165516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f165517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tn1.a f165518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f165519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r53.u1 f165520e;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "shouldHide", "shouldShow"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleepeducation.SleepEducationViewModel$shouldShowSleepEducationBanner$1", f = "SleepEducationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements q<Boolean, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f165521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f165522b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Boolean bool, Boolean bool2, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = g.this.new a(dVar);
            aVar.f165521a = zBooleanValue;
            aVar.f165522b = zBooleanValue2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14 = this.f165521a;
            boolean z15 = this.f165522b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z16 = !z14 && z15;
            tn1.a aVar2 = g.this.f165518c;
            if (aVar2 != null) {
                aVar2.b(z16);
            }
            return Boolean.valueOf(z16);
        }
    }

    public g(d dVar, c cVar, tn1.a aVar) {
        cVar.getClass();
        this.f165516a = dVar;
        this.f165517b = cVar;
        this.f165518c = aVar;
        p2 p2VarA = q2.a(Boolean.FALSE);
        this.f165519d = p2VarA;
        this.f165520e = new r53.u1(p2VarA, cVar.a(dVar), new a(null));
    }
}
