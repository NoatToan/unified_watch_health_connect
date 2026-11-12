package mz1;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.SendToDeviceViewModel$sendEventToDevice$1", f = "SendToDeviceViewModel.kt", l = {125}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f121818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.i f121819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f121820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f121821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(i1 i1Var, fg0.i iVar, String str, String str2, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f121818c = i1Var;
        this.f121819d = iVar;
        this.f121820e = str;
        this.f121821f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k1 k1Var = new k1(this.f121818c, this.f121819d, this.f121820e, this.f121821f, dVar);
        k1Var.f121817b = obj;
        return k1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strM;
        String strR;
        Object objJ;
        o53.b0 b0Var = (o53.b0) this.f121817b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121816a;
        fg0.i iVar = this.f121819d;
        i1 i1Var = this.f121818c;
        if (i14 == 0) {
            o13.r.b(obj);
            i1.a aVar2 = i1.f121784h;
            fg0.k kVar = (fg0.k) ((androidx.lifecycle.y0) i1Var.f121789d.getValue()).d();
            if (kVar != null ? p005kotlin.jvm.internal.s.g(kVar.getEventOrganizer(), Boolean.TRUE) : false) {
                strM = "calendar-service/event/fit/" + kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            } else {
                strM = am.j.m("calendar-service/event/", kVar != null ? kVar.getShareableEventUuid() : null, "/shareable/fit");
            }
            String str = strM;
            Long unitId = iVar.getUnitId();
            if (kVar != null) {
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                strR = kVar.r(false);
            } else {
                strR = null;
            }
            fg0.q qVar = new fg0.q(unitId, this.f121820e, this.f121821f, strR, null, kVar != null ? p005kotlin.jvm.internal.s.g(kVar.getEventOrganizer(), Boolean.TRUE) : false ? kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : new Long(0L), str, new Integer(0), 16, null);
            i1.f121784h.getClass();
            zf0.d dVar = i1.f121785i;
            List listC = p13.w.c(qVar);
            this.f121817b = b0Var;
            this.f121816a = 1;
            dVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.z(dVar, listC, null), this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            i1.a aVar3 = i1.f121784h;
            ((androidx.lifecycle.y0) i1Var.f121791f.getValue()).j(new o13.p(iVar.getDisplayName(), Boolean.TRUE));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            i1.a aVar4 = i1.f121784h;
            ((androidx.lifecycle.y0) i1Var.f121791f.getValue()).j(new o13.p("", Boolean.FALSE));
            String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "there is a problem in send to device data ");
            p92.y.f136664a.getClass();
            p92.y.a.c("SendToDeviceViewModel", strG);
        }
        return Unit.INSTANCE;
    }
}
