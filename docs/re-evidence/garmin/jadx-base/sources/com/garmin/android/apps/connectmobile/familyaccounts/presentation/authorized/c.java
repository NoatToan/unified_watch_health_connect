package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import e23.r;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f35029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f35030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f35031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f35032d;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0599a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f35033a;

            static {
                int[] iArr = new int[AuthorizedViewerDetailActivity.b.values().length];
                try {
                    iArr[AuthorizedViewerDetailActivity.b.ViewableAccount.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AuthorizedViewerDetailActivity.b.ViewerOfThisAccount.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AuthorizedViewerDetailActivity.b.ManagedByThisAccount.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AuthorizedViewerDetailActivity.b.ManagedAccount.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f35033a = iArr;
            }
        }

        public a(d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3) {
            this.f35029a = dVar;
            this.f35030b = aVar;
            this.f35031c = aVar2;
            this.f35032d = aVar3;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = n.f135158a;
                b82.c.b(null, null, z3.f.c(-1174644395, new qy0.d(this.f35029a, this.f35030b, this.f35031c, this.f35032d, 6), mVar2), null, j8, mVar2, ((iIntValue << 9) & 57344) | 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35034a;

        static {
            int[] iArr = new int[AuthorizedViewerDetailActivity.b.values().length];
            try {
                iArr[AuthorizedViewerDetailActivity.b.ViewableAccount.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorizedViewerDetailActivity.b.ViewerOfThisAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthorizedViewerDetailActivity.b.ManagedByThisAccount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthorizedViewerDetailActivity.b.ManagedAccount.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f35034a = iArr;
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, d dVar, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(-1123398381);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128) | (o0VarE.r(aVar4) ? 2048 : 1024) | (o0VarE.r(aVar5) ? 16384 : 8192) | (o0VarE.r(dVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-645684323, new rg0.n(dVar, aVar, aVar2, aVar3, aVar5, aVar4), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rg0.n(aVar, aVar2, aVar3, aVar4, aVar5, dVar, i14);
        }
    }
}
