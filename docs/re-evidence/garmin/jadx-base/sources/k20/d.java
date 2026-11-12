package k20;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import f20.d0;
import g20.i;
import g22.e;
import java.util.ArrayList;
import java.util.List;
import l20.k;
import o13.h;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p13.x;
import r22.g1;
import r22.o;
import r22.q0;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk20/d;", "Lcom/garmin/android/apps/connectmobile/contacts/details/b;", "Lk20/a$c;", "Lk20/a$b;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.contacts.details.b implements k20.a.c, k20.a.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f102434j = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k20.a f102435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f102436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f102437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f102438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<Intent> f102439i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k20/d$b", "Lr22/g1;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements g1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0.b f102441b;

        public b(d0.b bVar) {
            this.f102441b = bVar;
        }

        @Override // r22.g1
        public final void a(int i14) {
            d0.b bVar = this.f102441b;
            d dVar = d.this;
            if (i14 == 0) {
                a aVar = d.f102434j;
                dVar.v6().A4(bVar.f68369b);
            } else {
                if (i14 == 1) {
                    d.z6(dVar, bVar);
                    return;
                }
                a2 a2Var = a2.SAFETY_FEATURES;
                String strF = e0.f(i14, "[onConfirmedContactClicked] Error! There is no option with position ", "!");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "EmergencyContactDetailsFragment", strF);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f102442a;

        public c(l lVar) {
            lVar.getClass();
            this.f102442a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f102442a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f102442a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: k20.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k20/d$d", "Lr22/g1;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1964d implements g1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0.b f102444b;

        public C1964d(d0.b bVar) {
            this.f102444b = bVar;
        }

        @Override // r22.g1
        public final void a(int i14) {
            d0.b bVar = this.f102444b;
            d dVar = d.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    a aVar = d.f102434j;
                    dVar.v6().A4(bVar.f68369b);
                    return;
                } else {
                    if (i14 == 2) {
                        d.z6(dVar, bVar);
                        return;
                    }
                    a2 a2Var = a2.SAFETY_FEATURES;
                    String strF = e0.f(i14, "[showOtherContactMethodDialog] Error! There is no option with position ", "!");
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "EmergencyContactDetailsFragment", strF);
                    return;
                }
            }
            a aVar2 = d.f102434j;
            dVar.getClass();
            p<Integer, Integer> pVar = bVar.f68375h;
            Integer num = pVar.f128594a;
            Integer num2 = pVar.f128595b;
            if (num == null || num2 == null) {
                a2 a2Var2 = a2.SAFETY_FEATURES;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "EmergencyContactDetailsFragment", "[showSendAnotherRequestDialog] Error! item is not opted out, pending, or declined. We should not have arrived here.");
            } else {
                f fVar = f.f23050a;
                Context contextRequireContext = dVar.requireContext();
                contextRequireContext.getClass();
                Integer num3 = pVar.f128594a;
                f.d(fVar, contextRequireContext, dVar.getString(num3 != null ? num3.intValue() : 0), dVar.getString(num2.intValue()), new p(dVar.getString(R.string.lbl_common_continue), new i20.b(28, dVar, bVar)), new p(dVar.getString(R.string.lbl_cancel), new k11.c((byte) 0, 11)), null, false, 96).show();
            }
        }
    }

    public d() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 1));
        cVarRegisterForActivityResult.getClass();
        this.f102439i = cVarRegisterForActivityResult;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    public static final void z6(d dVar, d0.b bVar) {
        l20.a aVarG;
        l20.a aVar;
        i iVarV6 = dVar.v6();
        iVarV6.getClass();
        bVar.getClass();
        l20.a aVar2 = iVarV6.f75341e;
        if (aVar2 == null) {
            s.m("contactDTO");
            throw null;
        }
        l20.c cVarH = aVar2.h(bVar.f68369b);
        if (cVarH != null) {
            l20.c cVarB = l20.c.b(cVarH, null, null, null, null, null, null, null, null, null, Boolean.FALSE, 0, 983039);
            List<l20.c> listZ = aVar2.z();
            if (listZ == null || !listZ.contains(cVarH)) {
                List<l20.c> listR = aVar2.r();
                if (listR == null || !listR.contains(cVarH)) {
                    i2.f36769a.getClass();
                    i2.a.f(a2.SAFETY_FEATURES, "ContactDetailsViewModel", "[removeContentItemAsEmergencyContact] Tried to remove contact method " + cVarH + " as an emergency contact method for " + aVar2 + " and failed!");
                } else {
                    List<l20.c> listR2 = aVar2.r();
                    ArrayList arrayList = listR2 != null ? new ArrayList(listR2) : null;
                    if (s.g(arrayList != null ? Boolean.valueOf(com.garmin.android.apps.connectmobile.contacts.b.l(arrayList, cVarB)) : null, Boolean.TRUE)) {
                        aVarG = l20.a.g(aVar2, null, null, null, null, null, null, arrayList, null, null, 8127);
                        iVarV6.B4(aVarG);
                        if (!aVarG.f()) {
                            aVar = iVarV6.f75341e;
                            if (aVar != null) {
                                s.m("contactDTO");
                                throw null;
                            }
                            iVarV6.B4(com.garmin.android.apps.connectmobile.contacts.b.j(aVar));
                        }
                        q0.b bVar2 = q0.f149800b;
                        RecyclerView recyclerViewW6 = dVar.w6();
                        bVar2.getClass();
                        q0.b.a(recyclerViewW6, R.string.contact_method_removed_message, 0).show();
                        return;
                    }
                    i2.f36769a.getClass();
                    i2.a.f(a2.SAFETY_FEATURES, "ContactDetailsViewModel", "[removeContentItemAsEmergencyContact] Tried to remove contact method " + cVarH + " as an emergency contact method for " + aVar2 + " and failed!");
                }
            } else {
                List<l20.c> listZ2 = aVar2.z();
                ArrayList arrayList2 = listZ2 != null ? new ArrayList(listZ2) : null;
                if (s.g(arrayList2 != null ? Boolean.valueOf(com.garmin.android.apps.connectmobile.contacts.b.l(arrayList2, cVarB)) : null, Boolean.TRUE)) {
                    aVarG = l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList2, null, 8063);
                    iVarV6.B4(aVarG);
                    if (!aVarG.f()) {
                        aVar = iVarV6.f75341e;
                        if (aVar != null) {
                            s.m("contactDTO");
                            throw null;
                        }
                        iVarV6.B4(com.garmin.android.apps.connectmobile.contacts.b.j(aVar));
                    }
                    q0.b bVar3 = q0.f149800b;
                    RecyclerView recyclerViewW7 = dVar.w6();
                    bVar3.getClass();
                    q0.b.a(recyclerViewW7, R.string.contact_method_removed_message, 0).show();
                    return;
                }
                i2.f36769a.getClass();
                i2.a.f(a2.SAFETY_FEATURES, "ContactDetailsViewModel", "[removeContentItemAsEmergencyContact] Tried to remove contact method " + cVarH + " as an emergency contact method for " + aVar2 + " and failed!");
            }
        } else {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "ContactDetailsViewModel", "[removeContentItemAsEmergencyContact] Tried to get contactMethod from content and it was null!");
        }
        Context contextRequireContext = dVar.requireContext();
        contextRequireContext.getClass();
        ei0.q0.b(contextRequireContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A6(d0.b bVar) {
        String str;
        g20.n nVar = (g20.n) v6().f75347k.d();
        l20.a aVar = nVar != null ? nVar.f75368i : null;
        if (aVar != null) {
            l20.c cVarH = (bVar == null || (str = bVar.f68369b) == null) ? null : aVar.h(str);
            List listC = cVarH == null ? j0.f134944a : w.c(cVarH);
            EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
            m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            this.f102439i.a(EmergencyContactSendRequestActivity.a.b(aVar2, mVarRequireActivity, aVar, listC, true, false, v6().f75339c, 48), null);
        }
    }

    public final void C6(d0.b bVar) {
        o.a aVar = o.f149769b;
        String string = getString(R.string.send_request);
        string.getClass();
        String string2 = getString(bVar.f68370c instanceof k ? R.string.edit_email : R.string.edit_phone_number);
        string2.getClass();
        String string3 = getString(R.string.remove_contact_method);
        string3.getClass();
        ArrayList<String> arrayListD = x.d(string, string2, string3);
        String str = bVar.f68369b;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("LABELS_LIST", arrayListD);
        bundle.putString("DIALOG_TITLE", str);
        o oVar = new o();
        oVar.setArguments(bundle);
        oVar.f149770a = new C1964d(bVar);
        oVar.show(getParentFragmentManager(), "EmergencyContactDetailsFragment");
    }

    @Override // k20.a.c
    public final void F4() {
        A6(null);
    }

    @Override // k20.a.b
    public final void I(d0.b bVar) {
        o.a aVar = o.f149769b;
        String string = getString(bVar.f68370c instanceof k ? R.string.edit_email : R.string.edit_phone_number);
        string.getClass();
        String string2 = getString(R.string.remove_contact_method);
        string2.getClass();
        ArrayList<String> arrayListD = x.d(string, string2);
        String str = bVar.f68369b;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("LABELS_LIST", arrayListD);
        bundle.putString("DIALOG_TITLE", str);
        o oVar = new o();
        oVar.setArguments(bundle);
        oVar.f149770a = new b(bVar);
        oVar.show(getParentFragmentManager(), "EmergencyContactDetailsFragment");
    }

    @Override // k20.a.c
    public final void V4() {
        v6().z4();
    }

    @Override // k20.a.b
    public final void e5(d0.b bVar) {
        C6(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k20.a.c
    public final void h2() {
        l20.a aVar;
        f fVar = f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = getString(R.string.remove_contact_alert_title);
        g20.n nVar = (g20.n) v6().f75347k.d();
        f.d(fVar, contextRequireContext, string, getString(R.string.remove_assistance_contact_alert_message, (nVar == null || (aVar = nVar.f75368i) == null) ? null : aVar.j()), new p(getString(R.string.lbl_remove), new ik1.c(this, 19)), new p(getString(R.string.lbl_cancel), new k11.c((byte) 0, 10)), null, false, 96).show();
    }

    @Override // k20.a.b
    public final void j3(d0.b bVar) {
        C6(bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.details.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        String string = getString(R.string.assistance_contacts_title);
        string.getClass();
        e.g(this, string);
        View viewFindViewById = view2.findViewById(R.id.banner_layout);
        viewFindViewById.getClass();
        this.f102436f = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.banner_text_view);
        viewFindViewById2.getClass();
        this.f102437g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.banner_close_btn);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f102438h = imageView;
        imageView.setOnClickListener(new js0.d(this, 1));
        this.f102435e = new k20.a(this, this);
        RecyclerView recyclerViewW6 = w6();
        k20.a aVar = this.f102435e;
        if (aVar != null) {
            recyclerViewW6.setAdapter(aVar);
        } else {
            s.m("contactInfoAdapter");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.details.b
    public final void u6() {
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.details.b
    public final void y6() {
        v6().f75347k.f(getViewLifecycleOwner(), new c(new iz1.f(this, 13)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk20/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
