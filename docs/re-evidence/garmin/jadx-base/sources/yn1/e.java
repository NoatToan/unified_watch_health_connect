package yn1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleUserInfoDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyn1/e;", "Lew/a;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f198180j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.operations.LegacySetUserInfoOperation$addTasks$1", f = "LegacySetUserInfoOperation.kt", l = {24}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f198181a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f198183c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f198181a = obj;
            this.f198183c |= Integer.MIN_VALUE;
            return e.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(fVar);
        this.f198180j = fVar;
        fVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f198183c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f198183c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f198181a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f198183c;
        f fVar = this.f198180j;
        if (i15 == 0) {
            r.b(objJ);
            zn1.a aVarA = zn1.a.C3840a.a(zn1.a.f205392b);
            String strValueOf = String.valueOf(fVar.f198184l);
            WeightScaleUserInfoDTO weightScaleUserInfoDTO = fVar.f198185m;
            aVar.f198183c = 1;
            objJ = f0.J(aVarA, new zn1.d(aVarA, strValueOf, weightScaleUserInfoDTO, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            fVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, ((v2.b) v2Var).f47386a);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
