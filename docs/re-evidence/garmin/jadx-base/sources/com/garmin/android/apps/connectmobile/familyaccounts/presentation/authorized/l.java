package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ue0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$onInviteRemoved$1", f = "AuthorizedViewersViewModel.kt", l = {441}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f35145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f35146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d.a f35147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f35149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d.a f35150f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35151a;

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
            f35151a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, d.a aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f35149e = hVar;
        this.f35150f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f35149e, this.f35150f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        z53.b bVar;
        d.a aVar;
        h.c cVarA;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f35148d;
        if (i14 == 0) {
            r.b(obj);
            hVar = this.f35149e;
            bVar = hVar.f35095k;
            this.f35145a = bVar;
            this.f35146b = hVar;
            d.a aVar3 = this.f35150f;
            this.f35147c = aVar3;
            this.f35148d = 1;
            if (bVar.c(this) == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = this.f35147c;
            hVar = this.f35146b;
            bVar = this.f35145a;
            r.b(obj);
        }
        try {
            h.c cVar = hVar.f35096l;
            if (cVar != null) {
                AuthorizedViewerDetailActivity.b bVar2 = aVar.f35049g;
                Long l14 = aVar.f35043a;
                int i15 = a.f35151a[bVar2.ordinal()];
                if (i15 == 1) {
                    List<n> list = cVar.f35107b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!s.g(((n) obj2).getInviteId(), l14)) {
                            arrayList.add(obj2);
                        }
                    }
                    cVarA = h.c.a(cVar, null, arrayList, null, 29);
                } else if (i15 != 2) {
                    cVarA = null;
                } else {
                    List<ue0.j> list2 = cVar.f35106a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!s.g(((ue0.j) obj3).getInviteId(), l14)) {
                            arrayList2.add(obj3);
                        }
                    }
                    cVarA = h.c.a(cVar, arrayList2, null, null, 30);
                }
                hVar.H4(cVarA);
                hVar.f35104v.set(true);
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
