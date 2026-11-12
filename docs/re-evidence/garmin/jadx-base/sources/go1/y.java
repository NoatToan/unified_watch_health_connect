package go1;

import am.c2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import fo1.e1;
import fo1.j1;
import fo1.o0;
import fo1.q0;
import fo1.t0;
import fo1.u0;
import fo1.v0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgo1/y;", "Lgo1/k;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends k {
    public static final a D = new a(null);

    @Override // xg0.a
    public final void J0(wg0.a aVar) {
        aVar.getClass();
        Long l14 = aVar.f185042a;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            c2 c2Var = c2.ACTIVITY;
            String strValueOf = String.valueOf(jLongValue);
            aVar2.getClass();
            requireActivity().startActivity(ConversationActivity.a.h(mVarRequireActivity, c2Var, strValueOf));
        }
    }

    @Override // go1.k, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o0 o0VarC6 = C6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        long j8 = this.f78263m;
        ge1.b.T(v1.a(o0VarC6), null, null, new v0(o0VarC6, contextRequireContext, new fe2.z(this, 23), j8, new g12.f(this, 16), null), 3);
    }

    @Override // xg0.a
    public final void r1(wg0.a aVar, String str) {
        o0 o0VarC6 = C6();
        y0 y0VarK = xy2.b.K(o0VarC6, new j1(o0VarC6, str, null));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0VarK, viewLifecycleOwner, new e(aVar, this, 1));
    }

    @Override // go1.k
    public final void u6(SpannableStringBuilder spannableStringBuilder) {
        o0 o0VarC6 = C6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new t0(o0VarC6, contextRequireContext, new q0(o0VarC6), spannableStringBuilder, null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, this.f78272x);
    }

    @Override // go1.k
    public final void v6(boolean z14) {
        c cVar = z14 ? this.f78270v : this.f78271w;
        o0 o0VarC6 = C6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new u0(o0VarC6, contextRequireContext, z14, new e1(o0VarC6, null), null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgo1/y$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
