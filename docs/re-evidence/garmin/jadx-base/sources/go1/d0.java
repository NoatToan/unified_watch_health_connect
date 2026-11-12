package go1;

import am.c2;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.lifecycle.n0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import fo1.h1;
import fo1.k1;
import fo1.o0;
import fo1.s0;
import fo1.t0;
import fo1.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgo1/d0;", "Lgo1/k;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends k {
    public static final a D = new a(null);

    @Override // go1.k
    public final boolean I6(boolean z14) {
        return false;
    }

    @Override // xg0.a
    public final void J0(wg0.a aVar) {
        aVar.getClass();
        c2 c2VarG = aVar.g();
        String strF = aVar.f();
        if (c2VarG != null && strF != null) {
            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            long jK6 = K6();
            aVar2.getClass();
            requireActivity().startActivity(ConversationActivity.a.f(mVarRequireActivity, jK6, c2VarG, strF));
            return;
        }
        String str = "Invalid params, resourceType=[" + c2VarG + "], resourceId=[" + strF + "]";
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "GroupCommentListFragment", str);
    }

    public final long K6() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("Group_Id");
        }
        return -1L;
    }

    @Override // go1.k, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        po1.m.f139066b.remove(this);
    }

    @Override // go1.k, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        po1.m.f139066b.add(this);
    }

    @Override // go1.k, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        C6().D = K6();
    }

    @Override // xg0.a
    public final void r1(wg0.a aVar, String str) {
        c2 c2VarG = aVar.g();
        if (c2VarG == null) {
            String strM = am.j.m("Invalid params, resourceType=[null], resourceId=[", str, "]");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "GroupCommentListFragment", strM);
            return;
        }
        o0 o0VarC6 = C6();
        String strValueOf = String.valueOf(K6());
        strValueOf.getClass();
        y0 y0VarK = xy2.b.K(o0VarC6, new k1(o0VarC6, strValueOf, c2VarG, str, null));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0VarK, viewLifecycleOwner, new e(aVar, this, 1));
    }

    @Override // go1.k
    public final void u6(SpannableStringBuilder spannableStringBuilder) {
        o0 o0VarC6 = C6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String strValueOf = String.valueOf(K6());
        strValueOf.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new t0(o0VarC6, contextRequireContext, new s0(o0VarC6, strValueOf, null), spannableStringBuilder, null), 3);
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
        String strValueOf = String.valueOf(K6());
        strValueOf.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new u0(o0VarC6, contextRequireContext, z14, new h1(o0VarC6, strValueOf, null), null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, cVar);
    }

    @Override // go1.k, cs1.f
    public final void w3(String str) {
        str.getClass();
    }

    @Override // go1.k
    public final String w6() {
        String string = getString(R.string.comment_placeholder);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lgo1/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GROUP_ID", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d0 a(long j8) {
            d0 d0Var = new d0();
            Bundle bundle = new Bundle();
            bundle.putLong("Group_Id", j8);
            d0Var.setArguments(bundle);
            return d0Var;
        }

        private a() {
        }
    }
}
