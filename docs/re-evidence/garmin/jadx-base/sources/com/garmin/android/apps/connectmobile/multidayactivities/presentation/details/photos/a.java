package com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import ey0.c;
import ey0.g0;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicViewImageActivity$EpicViewImageViewModel$deleteEpicImage$1", f = "EpicViewImageActivity.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class a extends i implements l<d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EpicViewImageActivity.b f39288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EpicViewImageActivity.b bVar, String str, String str2, d<? super a> dVar) {
        super(1, dVar);
        this.f39288b = bVar;
        this.f39289c = str;
        this.f39290d = str2;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new a(this.f39288b, this.f39289c, this.f39290d, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super v2<? extends Unit>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f39287a;
        if (i14 == 0) {
            r.b(obj);
            g0 g0Var = this.f39288b.f39280a;
            this.f39287a = 1;
            g0Var.getClass();
            obj = f0.J(g0Var, new c(g0Var, this.f39289c, this.f39290d, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(Unit.INSTANCE, bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        u0.r();
        return null;
    }
}
