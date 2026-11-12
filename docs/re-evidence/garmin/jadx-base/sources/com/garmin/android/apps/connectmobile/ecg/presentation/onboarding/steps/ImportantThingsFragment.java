package com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import l0.e;
import nf0.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import pf0.s;
import w13.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/ImportantThingsFragment;", "Lnf0/z;", "<init>", "()V", "b", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ImportantThingsFragment extends z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f34805k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34806i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f34807j;

    static {
        new a(null);
    }

    @Override // nf0.z
    public final boolean A6() {
        return false;
    }

    @Override // nf0.z
    public final void C6(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        SpannableString spannableStringA;
        View viewInflate = layoutInflater.inflate(R.layout.container_important_independent, (ViewGroup) linearLayout, false);
        viewInflate.getClass();
        this.f34807j = viewInflate;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        s sVar = new s(contextRequireContext);
        c cVar = b.f34809f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        int i14 = 0;
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            b bVar = (b) next;
            TextView textView = (TextView) viewInflate.findViewById(bVar.f34811b);
            Integer num = bVar.f34813d;
            int i16 = bVar.f34812c;
            l22.a aVar = sVar.f137530b;
            if (num != null) {
                String string = aVar.getString(num.intValue());
                String str = u.y(string, ",", false) ? "" : StringUtils.SPACE;
                spannableStringA = s.a("<span>" + aVar.getString(i16) + "</span>" + str + string);
            } else {
                spannableStringA = s.a(aVar.getString(i16));
            }
            textView.setText(spannableStringA);
            View viewFindViewById = viewInflate.findViewById(((b) cVar.get(i14)).f34810a);
            if (i14 < this.f34806i) {
                viewFindViewById.getClass();
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.getClass();
                viewFindViewById.setVisibility(8);
            }
            i14 = i15;
        }
        if (this.f34806i == b.f34809f.getF134973e()) {
            w6().setText(getString(R.string.lbl_got_it));
        }
        linearLayout.addView(viewInflate);
    }

    @Override // nf0.z
    public final void E6() {
        int i14 = this.f34806i;
        c cVar = b.f34809f;
        if (i14 > cVar.getF134973e() - 1) {
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(this).g(R.id.action_first_time_use, null);
            return;
        }
        View view2 = this.f34807j;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("rootContent");
            throw null;
        }
        View viewFindViewById = view2.findViewById(((b) cVar.get(this.f34806i)).f34810a);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(0);
        y6().post(new e(18, this, viewFindViewById));
        int i15 = this.f34806i + 1;
        this.f34806i = i15;
        if (i15 == cVar.getF134973e()) {
            w6().setText(getString(R.string.lbl_got_it));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/ImportantThingsFragment$a;", "", "<init>", "()V", "", "FIRST_CONTAINER", "I", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.ImportantThingsFragment$b[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.ImportantThingsFragment$b[]) from 0x0061: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.ImportantThingsFragment$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/ImportantThingsFragment$b;", "", "", "containerId", "textId", "textLabelResId1", "textLabelResId2", "<init>", "(Ljava/lang/String;IIIILjava/lang/Integer;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        /* JADX INFO: Fake field, exist only in values array */
        REMEMBER_1(R.id.msg_remember_ecg_container_1, R.id.msg_remember_ecg_text_1, R.string.msg_remember_ecg_app_1_a, Integer.valueOf(R.string.msg_remember_ecg_app_1_b)),
        /* JADX INFO: Fake field, exist only in values array */
        REMEMBER_2(R.id.msg_remember_ecg_container_2, R.id.msg_remember_ecg_text_2, R.string.msg_remember_ecg_app_2, null, 8, null),
        /* JADX INFO: Fake field, exist only in values array */
        REMEMBER_3(R.id.msg_remember_ecg_container_3, R.id.msg_remember_ecg_text_3, R.string.msg_remember_ecg_app_3_a, Integer.valueOf(R.string.msg_remember_ecg_app_3_b)),
        /* JADX INFO: Fake field, exist only in values array */
        REMEMBER_4(R.id.msg_remember_ecg_container_4, R.id.msg_remember_ecg_text_4, R.string.msg_remember_ecg_app_4, 0 == true ? 1 : 0, 8, null);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ c f34809f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f34810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f34812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f34813d;

        /* JADX WARN: Multi-variable type inference failed */
        static {
            f34809f = new c(bVarArr);
        }

        public /* synthetic */ b(int i14, int i15, int i16, Integer num, int i17, j jVar) {
            this(i14, i15, i16, (i17 & 8) != 0 ? null : num);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f34808e.clone();
        }

        private b(int i14, int i15, int i16, Integer num) {
            super(str, i);
            this.f34810a = i14;
            this.f34811b = i15;
            this.f34812c = i16;
            this.f34813d = num;
        }
    }
}
