package com.garmin.android.apps.connectmobile.userprofile.presentation;

import androidx.lifecycle.v1;
import e23.p;
import gg1.v0;
import i3.e5;
import lc.u0;
import m12.o;
import m12.t;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$handleNavigation$1", f = "EditProfileViewModel.kt", l = {272}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f47015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f47016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t tVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f47015b = dVar;
        this.f47016c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f47015b, this.f47016c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m12.p bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f47014a;
        if (i14 == 0) {
            r.b(obj);
            d dVar = this.f47015b;
            o oVar = dVar.f47023g;
            boolean z14 = dVar.f47026j;
            oVar.getClass();
            t tVar = this.f47016c;
            tVar.getClass();
            String str = tVar.f115884a;
            switch (o.a.f115851a[tVar.ordinal()]) {
                case 1:
                    bVar = !z14 ? new m12.p.b(new w12.d.c(str)) : new m12.p.a("ChildProfilePrivacyTapped");
                    break;
                case 2:
                    bVar = !z14 ? new m12.p.b(new w12.d.c(str)) : new m12.p.a("ChildStepsPrivacyTapped");
                    break;
                case 3:
                    bVar = !z14 ? new m12.p.b(new w12.d.c(str)) : new m12.p.a("ChildBadgesPrivacyTapped");
                    break;
                case 4:
                    bVar = new m12.p.b(new w12.d.c(str));
                    break;
                case 5:
                    bVar = new m12.p.b(new w12.d.c(str));
                    break;
                case 6:
                    c22.d.f23016a.getClass();
                    bVar = new m12.p.c(c22.d.a.a());
                    break;
                case 7:
                    c22.d.f23016a.getClass();
                    v0.T.getClass();
                    bVar = new m12.p.c(e5.g(v0.a.b().k(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() ? "/zh-CN" : "", "/account/datamanagement/deletedata/"));
                    break;
                default:
                    bVar = null;
                    break;
            }
            if (bVar instanceof m12.p.b) {
                e2 e2Var = dVar.f47033q;
                a.b bVar2 = new a.b(((m12.p.b) bVar).f115853a);
                this.f47014a = 1;
                if (e2Var.emit(bVar2, this) == aVar) {
                    return aVar;
                }
            } else if (bVar instanceof m12.p.c) {
                String str2 = ((m12.p.c) bVar).f115854a;
                w9.a aVarA = v1.a(dVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new b(dVar, str2, null), 2);
            } else if (bVar instanceof m12.p.a) {
                ht.a aVar2 = ht.a.f85464a;
                String str3 = ((m12.p.a) bVar).f115852a;
                aVar2.getClass();
                ht.a.a(null, str3);
            } else if (bVar != null) {
                u0.r();
                return null;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
