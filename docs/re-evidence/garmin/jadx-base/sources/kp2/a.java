package kp2;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.v1;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b63.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.liveeventsharing.recipients.LiveEventRecipientsActivity;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassThresholdSettingActivity;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.compose.CameraPositionState;
import e23.l;
import fw.m;
import i3.ij;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Objects;
import kk1.h;
import l3.t;
import lc.u0;
import li0.f;
import ll1.n;
import ly0.q;
import m12.z;
import m30.v;
import m63.a2;
import m63.f1;
import mg2.u;
import okhttp3.Response;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.f3;
import p006l2.l1;
import p3.z1;
import p5.h0;
import p5.k;
import p5.k0;
import r53.p2;
import retrofit2.HttpException;
import yr1.e;
import z2.p;
import z2.v0;
import z2.w0;
import z2.x0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f106011b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f106010a = i14;
        this.f106011b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v80, types: [T, com.google.maps.android.compose.CameraPositionState, java.lang.Object] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        int i14 = this.f106010a;
        Object obj2 = this.f106011b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                b.C2044b c2044b = b.f106012f;
                str.getClass();
                ((b) obj2).f106016d.c(new b.c.C2046c(str));
                return Unit.INSTANCE;
            case 1:
                LiveEventRecipientsActivity liveEventRecipientsActivity = (LiveEventRecipientsActivity) obj2;
                m mVar = (m) obj;
                LiveEventRecipientsActivity.a aVar = LiveEventRecipientsActivity.f38506l;
                int i15 = LiveEventRecipientsActivity.b.f38518a[mVar.f73769b.ordinal()];
                if (i15 == 1) {
                    e.b("LiveEventRecipientsActivity");
                    liveEventRecipientsActivity.hideProgressOverlay();
                    liveEventRecipientsActivity.setResult(-1);
                    liveEventRecipientsActivity.finish();
                } else if (i15 == 2) {
                    liveEventRecipientsActivity.hideProgressOverlay();
                    g22.a.a(liveEventRecipientsActivity, mVar.f73771d);
                    liveEventRecipientsActivity.setResult(-1);
                    liveEventRecipientsActivity.finish();
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    liveEventRecipientsActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 2:
                o oVar = (o) obj;
                oVar.getClass();
                return Boolean.valueOf(oVar.compareTo((o) obj2) <= 0);
            case 3:
                EventTrainingPlanIntegrationActivity eventTrainingPlanIntegrationActivity = (EventTrainingPlanIntegrationActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                EventTrainingPlanIntegrationActivity.a aVar2 = EventTrainingPlanIntegrationActivity.f46267e;
                if (zBooleanValue) {
                    eventTrainingPlanIntegrationActivity.da();
                }
                return Unit.INSTANCE;
            case 4:
                ((k0) obj).a(x0.f201843c, new w0(l1.Cursor, ((p) obj2).a(), v0.Middle, true, null));
                return Unit.INSTANCE;
            case 5:
                f3 f3Var = (f3) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                z1 z1Var = f3Var.f108480a;
                float floatValue = z1Var.getFloatValue() + fFloatValue;
                z1 z1Var2 = f3Var.f108481b;
                if (floatValue > z1Var2.getFloatValue()) {
                    fFloatValue = z1Var2.getFloatValue() - z1Var.getFloatValue();
                } else if (floatValue < 0.0f) {
                    fFloatValue = -z1Var.getFloatValue();
                }
                z1Var.i(z1Var.getFloatValue() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 6:
                return new t((ij) obj2);
            case 7:
                ((lg1.a) obj2).notifyItemChanged(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((lg1.a.b) obj2).f112182d.invoke(bool);
                return Unit.INSTANCE;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((lg1.a.c) obj2).f112185b.invoke(bool2);
                return Unit.INSTANCE;
            case 10:
                f fVar = (f) obj2;
                ki0.a aVar3 = (ki0.a) obj;
                f.a aVar4 = f.f112657g;
                aVar3.getClass();
                if (aVar3 instanceof ki0.a.C2006a) {
                    ki0.a.C2006a c2006a = (ki0.a.C2006a) aVar3;
                    fVar.n(c2006a.f104807a, c2006a.f104808b);
                } else {
                    if (!(aVar3 instanceof ki0.a.b)) {
                        u0.r();
                        return null;
                    }
                    List<ki0.a.b.EnumC2007a> list = fVar.f112661b;
                    ki0.a.b bVar = (ki0.a.b) aVar3;
                    String str2 = bVar.f104809a;
                    ki0.a.b.EnumC2007a enumC2007a = bVar.f104810b;
                    if (list.contains(enumC2007a)) {
                        fVar.l(4, str2);
                    }
                    if (fVar.f112662c.contains(enumC2007a)) {
                        fVar.l(0, str2);
                    }
                }
                return Unit.INSTANCE;
            case 11:
                ll1.m mVar2 = (ll1.m) obj2;
                zd0.o.a aVar5 = (zd0.o.a) obj;
                aVar5.getClass();
                mVar2.getClass();
                ge1.b.T(v1.a(mVar2), null, null, new n(aVar5, mVar2, null), 3);
                return Unit.INSTANCE;
            case 12:
                lq2.e eVar = (lq2.e) obj2;
                a0 a0Var = (a0) obj;
                int i16 = lq2.e.f114359e;
                a0Var.getClass();
                T t7 = a0Var.f25746b;
                Response response = a0Var.f25745a;
                if (!response.isSuccessful()) {
                    throw new HttpException(a0Var);
                }
                jw.c cVar = eVar.f114362c;
                cVar.e(response.request().url().getUrl());
                cVar.d(Unit.INSTANCE, GsonUtil.a(t7));
                return (jq2.c) t7;
            case 13:
                LostWatchActivity.a aVar6 = LostWatchActivity.f52015j;
                ((SwipeRefreshLayout) obj2).setRefreshing(s.g((Boolean) obj, Boolean.TRUE));
                return Unit.INSTANCE;
            case 14:
                RapidPassThresholdSettingActivity.a aVar7 = (RapidPassThresholdSettingActivity.a) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i17 = aVar7.f52055e;
                if (i17 != iIntValue) {
                    aVar7.f52055e = iIntValue;
                    aVar7.notifyItemChanged(i17);
                    aVar7.notifyItemChanged(iIntValue);
                }
                return Unit.INSTANCE;
            case 15:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                return Boolean.valueOf(dateTime.compareTo((ReadableInstant) ((Interval) obj2).getEnd()) < 0);
            case 16:
                ((lv.a) obj2).getClass();
                gm2.b bVar2 = gm2.b.f78015a;
                Objects.requireNonNull(bVar2);
                return new ik2.a(new h(bVar2, 27));
            case 17:
                GCMMapView gCMMapView = (GCMMapView) obj;
                gCMMapView.getClass();
                q.c((ly0.s) obj2, gCMMapView);
                return Unit.INSTANCE;
            case 18:
                GCMMapView gCMMapView2 = (GCMMapView) obj2;
                ((Context) obj).getClass();
                ViewParent parent = gCMMapView2.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(gCMMapView2);
                }
                return gCMMapView2;
            case 19:
                z zVar = (z) obj2;
                o53.s sVar = zVar.f115915m;
                if (sVar == null) {
                    s.m("deferredResult");
                    throw null;
                }
                if (sVar.isCancelled()) {
                    zVar.d();
                }
                return Unit.INSTANCE;
            case 20:
                l3.x0 x0Var = (l3.x0) obj2;
                k0 k0Var = (k0) obj;
                if (x0Var.invoke() > 0.0f) {
                    h0.v(k0Var, new k(x0Var.invoke(), new j23.e(0.0f, 1.0f), 0));
                }
                return Unit.INSTANCE;
            case 21:
                v vVar = (v) obj2;
                n30.e eVar2 = (n30.e) obj;
                v.a aVar8 = v.f116406k;
                eVar2.getClass();
                vVar.f116409j = eVar2;
                vVar.w6();
                return Unit.INSTANCE;
            case 22:
                k63.a aVar9 = (k63.a) obj;
                aVar9.getClass();
                List<? extends Annotation> list2 = ((f1) obj2).f116944b;
                list2.getClass();
                aVar9.f103213b = list2;
                return Unit.INSTANCE;
            case 23:
                k63.e eVar3 = (k63.e) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return eVar3.d(iIntValue2) + ": " + eVar3.h(iIntValue2).getF103221c();
            case 24:
                a2 a2Var = (a2) obj2;
                k63.a aVar10 = (k63.a) obj;
                aVar10.getClass();
                k63.a.b(aVar10, "first", a2Var.f116914a.getF158591b());
                k63.a.b(aVar10, "second", a2Var.f116915b.getF158591b());
                k63.a.b(aVar10, "third", a2Var.f116916c.getF158591b());
                return Unit.INSTANCE;
            case 25:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                l22.a aVar11 = ((gc1.a) obj2).f76926b;
                h0.n(k0Var2, aVar11.a(R.string.lbl_level_peripheral_oxygen_saturation, aVar11.getString(R.string.lbl_average)));
                return Unit.INSTANCE;
            case 26:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                p2 p2Var = ((fe1.n) obj2).f70560d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, fe1.o.a((fe1.o) value, zBooleanValue2, null, null, null, null, 30)));
                return Unit.INSTANCE;
            case 27:
                me2.e eVar4 = (me2.e) obj2;
                ?? r15 = (CameraPositionState) obj;
                r15.getClass();
                eVar4.f98598b = r15;
                je2.a aVar12 = eVar4.f98597a;
                CameraPosition cameraPositionFromLatLngZoom = CameraPosition.fromLatLngZoom(aVar12.f98593a, aVar12.f98594b);
                cameraPositionFromLatLngZoom.getClass();
                r15.setPosition(cameraPositionFromLatLngZoom);
                return Unit.INSTANCE;
            case 28:
                ((mf.b) obj2).f118259n = true;
                return Unit.INSTANCE;
            default:
                u uVar = (u) obj;
                uVar.getClass();
                return Boolean.valueOf(s.g(uVar.f118427a, (mg2.f) obj2));
        }
    }
}
