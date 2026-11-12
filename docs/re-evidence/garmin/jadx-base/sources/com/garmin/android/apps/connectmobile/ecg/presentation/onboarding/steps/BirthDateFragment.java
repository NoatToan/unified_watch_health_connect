package com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.UploadConsentActivity;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Calendar;
import nf0.z;
import o13.h;
import o62.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.h0;
import q92.x;
import r22.c0;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/BirthDateFragment;", "Lnf0/z;", "<init>", "()V", "a", "b", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BirthDateFragment extends z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f34780k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f34781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f34782j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/BirthDateFragment$a;", "", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/BirthDateFragment;Landroid/view/View;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f34783a;

        public a(BirthDateFragment birthDateFragment, View view2) {
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.text1);
            viewFindViewById.getClass();
            View viewFindViewById2 = view2.findViewById(R.id.text2);
            viewFindViewById2.getClass();
            TextView textView = (TextView) viewFindViewById2;
            this.f34783a = textView;
            View viewFindViewById3 = view2.findViewById(R.id.icon_start);
            viewFindViewById3.getClass();
            ((ImageView) viewFindViewById3).setVisibility(8);
            ((TextView) viewFindViewById).setText(R.string.lbl_birthdate);
            textView.setText(R.string.activities_value_not_set);
            textView.setText(R.string.activities_value_not_set);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34784a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34784a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34785a;

        public d(l lVar) {
            lVar.getClass();
            this.f34785a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f34785a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34785a.invoke(obj);
        }
    }

    static {
        new b(null);
    }

    public BirthDateFragment() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 14));
        cVarRegisterForActivityResult.getClass();
        this.f34782j = cVarRegisterForActivityResult;
    }

    @Override // nf0.z
    public final void C6(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        View viewInflate = layoutInflater.inflate(R.layout.container_birth_date, (ViewGroup) linearLayout, false);
        View viewFindViewById = viewInflate.findViewById(R.id.ecg_birth_date);
        viewFindViewById.setOnClickListener(new of0.b(this, 0));
        this.f34781i = new a(this, viewFindViewById);
        w6().setEnabled(false);
        linearLayout.addView(viewInflate);
    }

    @Override // nf0.z
    public final void E6() {
        z6();
        int i14 = nf0.d.f125783b;
        if (d1.h(x.DI_CONNECT_UPLOAD, true) && !d1.k()) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BirthDateFragment", "[onNextPress] data storage and device upload consent granted");
            G6();
            return;
        }
        a2 a2Var2 = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "BirthDateFragment", "[onNextPress] data storage or device upload consent is revoked");
        this.f34782j.a(new Intent(requireContext(), (Class<?>) UploadConsentActivity.class), null);
    }

    public final void G6() {
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BirthDateFragment", "[checkMultiFactorAuthentication] check MFA");
        z6().y4().f(getViewLifecycleOwner(), new d(new of0.c(this, 0)));
    }

    public final void H6() {
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BirthDateFragment", "[createGHSAccount] creating GHS account");
        z6().z4().f(getViewLifecycleOwner(), new d(new of0.c(this, 1)));
    }

    public final void I6() {
        long millis = DateTime.now().minusYears(150).getMillis();
        Calendar calendar = Calendar.getInstance();
        c0 c0Var = new c0(requireContext(), millis, c0.a(DateTime.now()).getMillis(), calendar, new b0(1, calendar, this));
        ArrayList<View> touchables = c0Var.getDatePicker().getTouchables();
        touchables.getClass();
        View view2 = (View) h0.e0(0, touchables);
        if (view2 != null) {
            view2.performClick();
        }
        c0Var.show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/BirthDateFragment$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "AGE_RESTRICTION", "I", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
