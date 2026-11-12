package hc0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c22.b3;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.z1;
import com.garmin.android.consent.network.GdprRevokeException406;
import com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.ControlsMenuActivity;
import ei0.q0;
import fw.p;
import j10.s;
import java.util.List;
import lc.u0;
import q92.y;
import v92.f0;
import z10.d1;
import z10.i3;
import z10.j3;
import z10.m0;
import zb0.g0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83243c;

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f83241a = i14;
        this.f83242b = obj;
        this.f83243c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        Integer num;
        String strR;
        f0 f0Var;
        int i14 = this.f83241a;
        Object obj2 = this.f83243c;
        Object obj3 = this.f83242b;
        switch (i14) {
            case 0:
                k kVar = (k) obj3;
                sd2.f fVar = (sd2.f) obj2;
                g3 g3Var = (g3) obj;
                if (g3Var != null) {
                    p pVar = g3Var.f35300a;
                    if (pVar == p.LOADING) {
                        s2 s2Var = kVar.I;
                        if (s2Var != null) {
                            s2Var.showProgressOverlay(kVar.getString(R.string.device_action_msg_removing_device));
                            return;
                        }
                        return;
                    }
                    if (pVar == p.SUCCESS) {
                        kVar.T6(fVar, (gj1.c) g3Var.f35301b);
                        return;
                    } else {
                        if (pVar == p.ERROR) {
                            s2 s2Var2 = kVar.I;
                            if (s2Var2 != null) {
                                s2Var2.hideProgressOverlay();
                            }
                            Toast.makeText(kVar.requireContext(), kVar.getString(R.string.device_action_msg_remove_device_failure, !TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName()), 1).show();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                s sVar = (s) obj3;
                String str = (String) obj2;
                g3 g3Var2 = (g3) obj;
                int i15 = s.V0;
                int i16 = s.a.f96403a[g3Var2.f35300a.ordinal()];
                if (i16 == 1) {
                    ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) g3Var2.f35301b;
                    if (conversationCommentDTO != null) {
                        sVar.e7(str, conversationCommentDTO);
                        return;
                    } else {
                        g22.e.b(sVar, lj0.b.f112956j);
                        return;
                    }
                }
                if (i16 != 2) {
                    return;
                }
                sVar.d7(str);
                if (sVar.getActivity() == null || (num = g3Var2.f35304e) == null || num.intValue() != 429) {
                    g22.e.b(sVar, lj0.b.f112956j);
                    return;
                } else {
                    b3.b(sVar.getActivity());
                    return;
                }
            case 2:
                lo.b bVar = (lo.b) obj3;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) obj2;
                g3 g3Var3 = (g3) obj;
                int i17 = lo.b.a.f113712a[g3Var3.f35300a.ordinal()];
                if (i17 == 1) {
                    g22.e.l(bVar);
                    return;
                }
                if (i17 != 2) {
                    if (i17 != 3) {
                        return;
                    }
                    g22.e.f(bVar);
                    g22.e.a(bVar, null);
                    return;
                }
                ht.d.f85467a.getClass();
                ht.d.a(hVar, true);
                g22.e.f(bVar);
                bVar.requireActivity().onBackPressed();
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) g3Var3.f35301b;
                if (hVar2 != null) {
                    long j8 = hVar2.f29448a;
                    String str2 = hVar2.C().f4358a;
                    aq.b bVar2 = new aq.b();
                    bVar2.f11823b = j8;
                    am.h hVar3 = am.h.VIEW_EDIT;
                    if (hVar3 != null) {
                        bVar2.f11824c = hVar3;
                    }
                    bVar2.f11825d = true;
                    bVar2.f11827f = str2;
                    bVar.getActivity().startActivity(bVar2.a(bVar.getActivity()));
                    return;
                }
                return;
            case 3:
                mr2.c.Y4((mr2.c) obj3, (w0) obj2, (List) obj);
                return;
            case 4:
                ControlsMenuActivity controlsMenuActivity = (ControlsMenuActivity) obj3;
                rh2.b bVar3 = (rh2.b) obj2;
                int i18 = ControlsMenuActivity.f50609v;
                uh2.a aVar = controlsMenuActivity.f50615q;
                if (aVar == null) {
                    p005kotlin.jvm.internal.s.m("controlsMenuViewModel");
                    throw null;
                }
                boolean zG = p005kotlin.jvm.internal.s.g(aVar.f171142d.d(), Boolean.TRUE);
                ei2.c cVar = controlsMenuActivity.f50617t;
                if (zG) {
                    if (cVar == null) {
                        p005kotlin.jvm.internal.s.m("controlsMenuWatchFaceTransform");
                        throw null;
                    }
                    strR = cVar.r(bVar3 != null ? bVar3.f152761b : null, bVar3 != null ? bVar3.f152763d : null);
                } else {
                    if (cVar == null) {
                        p005kotlin.jvm.internal.s.m("controlsMenuWatchFaceTransform");
                        throw null;
                    }
                    strR = cVar.r(bVar3 != null ? bVar3.f152760a : null, bVar3 != null ? bVar3.f152762c : null);
                }
                if (strR == null) {
                    ImageView imageView = controlsMenuActivity.f50613o;
                    if (imageView != null) {
                        imageView.setImageResource(2131231499);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("watchFaceImage");
                        throw null;
                    }
                }
                com.bumptech.glide.j<Drawable> jVarL = com.bumptech.glide.b.c(controlsMenuActivity).e(controlsMenuActivity).l(strR);
                ImageView imageView2 = controlsMenuActivity.f50613o;
                if (imageView2 != null) {
                    jVarL.E(imageView2);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("watchFaceImage");
                    throw null;
                }
            case 5:
                Context context = (Context) obj3;
                i3 i3Var = (i3) obj2;
                v92.i iVar = (v92.i) obj;
                int i19 = i3.f201047d;
                iVar.getClass();
                if (iVar instanceof v92.i.e) {
                    v92.i.e eVar = (v92.i.e) iVar;
                    GCMWebViewActivity.fa(context, eVar.f176402a, eVar.f176403b);
                    return;
                }
                if (iVar instanceof v92.i.b) {
                    d1.u(d1.f200951a, context, (v92.i.b) iVar);
                    return;
                }
                if (iVar instanceof v92.i.c) {
                    v92.i.c cVar2 = (v92.i.c) iVar;
                    if (cVar2.f176399b == y.OPT_IN && ((f0Var = cVar2.f176400c) == f0.ENABLED || f0Var == f0.NO_UPDATE)) {
                        i3Var.y4(m0.UPLOAD_CONSENT_GRANTED);
                        return;
                    } else {
                        i3Var.y4(m0.UPLOAD_CONSENT_REVOKED);
                        return;
                    }
                }
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "UploadConsentEnforcementActivity", "ConsentParentAction " + iVar);
                return;
            case 6:
                z1 z1Var = (z1) obj3;
                i3 i3Var2 = (i3) obj2;
                v92.k kVar2 = (v92.k) obj;
                int i24 = i3.f201047d;
                kVar2.getClass();
                if (kVar2 instanceof v92.k.d) {
                    z1Var.showProgressOverlay();
                    return;
                }
                if (kVar2 instanceof v92.k.c) {
                    z1Var.hideProgressOverlay();
                    return;
                }
                if (!(kVar2 instanceof v92.k.b)) {
                    if (kVar2 instanceof v92.k.a) {
                        ge1.b.T(v1.a(i3Var2), null, null, new j3(i3Var2, null), 3);
                        return;
                    } else {
                        u0.r();
                        return;
                    }
                }
                v92.e eVar2 = ((v92.k.b) kVar2).f176415a;
                if (eVar2 instanceof v92.e.a) {
                    i3Var2.y4(m0.CONSENT_CHECK_ERROR);
                    return;
                } else if (eVar2 instanceof v92.e.b) {
                    i3Var2.y4(((v92.e.b) eVar2).f176358b instanceof GdprRevokeException406 ? m0.UPLOAD_CONSENT_REVOKE_406_ERROR : m0.UPLOAD_CONSENT_UPDATE_ERROR);
                    return;
                } else {
                    i3Var2.y4(m0.UPLOAD_CONSENT_UPDATE_ERROR);
                    return;
                }
            default:
                g0 g0Var = (g0) obj3;
                sd2.f fVar2 = (sd2.f) obj2;
                g3 g3Var4 = (g3) obj;
                if (g3Var4 != null) {
                    p pVar2 = g3Var4.f35300a;
                    if (pVar2 == p.LOADING) {
                        s2 s2Var3 = g0Var.f203506q;
                        if (s2Var3 != null) {
                            s2Var3.showProgressOverlay(g0Var.getString(R.string.device_action_msg_removing_device));
                            return;
                        }
                        return;
                    }
                    if (pVar2 == p.SUCCESS) {
                        gc0.i iVar2 = g0Var.f203492c;
                        if (iVar2 != null) {
                            iVar2.a(fVar2, true);
                            return;
                        }
                        return;
                    }
                    q0.b(g0Var.requireContext());
                    s2 s2Var4 = g0Var.f203506q;
                    if (s2Var4 != null) {
                        s2Var4.hideProgressOverlay();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
