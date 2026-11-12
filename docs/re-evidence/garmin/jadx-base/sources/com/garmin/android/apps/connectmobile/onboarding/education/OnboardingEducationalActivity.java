package com.garmin.android.apps.connectmobile.onboarding.education;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.GCMCustomViewPager;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.List;
import js0.d;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/OnboardingEducationalActivity;", "Li/c;", "Lcom/garmin/android/apps/connectmobile/onboarding/education/c$b;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnboardingEducationalActivity extends i.c implements c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39689c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39690a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.onboarding.education.a.c f39691b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/OnboardingEducationalActivity$b;", "Landroidx/fragment/app/a0;", "Landroidx/fragment/app/v;", "supportFragmentManager", "Lcom/garmin/android/apps/connectmobile/onboarding/education/a$c;", "featureEducationEnum", "<init>", "(Lcom/garmin/android/apps/connectmobile/onboarding/education/OnboardingEducationalActivity;Landroidx/fragment/app/v;Lcom/garmin/android/apps/connectmobile/onboarding/education/a$c;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends com.garmin.android.apps.connectmobile.onboarding.education.a.d> f39692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnboardingEducationalActivity f39693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OnboardingEducationalActivity onboardingEducationalActivity, v vVar, com.garmin.android.apps.connectmobile.onboarding.education.a.c cVar) {
            super(vVar);
            vVar.getClass();
            cVar.getClass();
            this.f39693b = onboardingEducationalActivity;
            com.garmin.android.apps.connectmobile.onboarding.education.a.f39696a.getClass();
            if (com.garmin.android.apps.connectmobile.onboarding.education.a.C0714a.C0715a.f39698a[cVar.ordinal()] == 1) {
                this.f39692a = h0.b1(com.garmin.android.apps.connectmobile.onboarding.education.a.f39697b);
            } else {
                u0.r();
                throw null;
            }
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF149591t() {
            return this.f39692a.size();
        }

        @Override // androidx.fragment.app.a0
        public final Fragment getItem(int i14) {
            List<? extends com.garmin.android.apps.connectmobile.onboarding.education.a.d> list = this.f39692a;
            com.garmin.android.apps.connectmobile.onboarding.education.a.d dVar = list.get(i14);
            c.a aVar = c.f39715b;
            int i15 = dVar.f39711a;
            int i16 = dVar.f39712b;
            int i17 = dVar.f39713c;
            boolean z14 = i14 == list.size() - 1;
            OnboardingEducationalActivity onboardingEducationalActivity = this.f39693b;
            long j8 = onboardingEducationalActivity.f39690a;
            com.garmin.android.apps.connectmobile.onboarding.education.a.c cVar = onboardingEducationalActivity.f39691b;
            String strName = cVar != null ? cVar.name() : null;
            aVar.getClass();
            c cVar2 = new c();
            Bundle bundle = new Bundle();
            bundle.putInt("argImageRes", i15);
            bundle.putInt("argTitleRes", i16);
            bundle.putInt("argDescriptionRes", i17);
            bundle.putBoolean("argShowButton", z14);
            bundle.putLong("GCM_deviceUnitID", j8);
            bundle.putString("argEnumName", strName);
            cVar2.setArguments(bundle);
            return cVar2;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.slide_out_from_top);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        com.garmin.android.apps.connectmobile.onboarding.education.a.c cVar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_onboarding_educational);
        Intent intent = getIntent();
        if (intent != null) {
            this.f39690a = intent.getLongExtra("GCM_deviceUnitID", -1L);
            com.garmin.android.apps.connectmobile.onboarding.education.a.c.C0716a c0716a = com.garmin.android.apps.connectmobile.onboarding.education.a.c.f39699f;
            String stringExtra = intent.getStringExtra("onboardingEducationType");
            if (stringExtra == null) {
                stringExtra = "";
            }
            c0716a.getClass();
            com.garmin.android.apps.connectmobile.onboarding.education.a.c[] cVarArrValues = com.garmin.android.apps.connectmobile.onboarding.education.a.c.values();
            int length = cVarArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i15];
                if (s.g(cVar.name(), stringExtra)) {
                    break;
                } else {
                    i15++;
                }
            }
            this.f39691b = cVar;
        }
        GCMCustomViewPager gCMCustomViewPager = (GCMCustomViewPager) findViewById(R.id.education_view_pager);
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) findViewById(R.id.education_page_indicator);
        TextView textView = (TextView) findViewById(R.id.education_footer);
        com.garmin.android.apps.connectmobile.onboarding.education.a.c cVar2 = this.f39691b;
        if (cVar2 != null) {
            int i16 = cVar2.f39706e;
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            gCMCustomViewPager.setAdapter(new b(this, supportFragmentManager, cVar2));
            fe.a adapter = gCMCustomViewPager.getAdapter();
            if ((adapter != null ? Integer.valueOf(adapter.getF149591t()) : null) != null) {
                fe.a adapter2 = gCMCustomViewPager.getAdapter();
                adapter2.getClass();
                if (((b) adapter2).f39692a.size() > 1) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
            } else {
                i14 = 8;
            }
            circlePageIndicator.setVisibility(i14);
            circlePageIndicator.setViewPager(gCMCustomViewPager);
            if (cVar2.f39702a) {
                textView.setVisibility(0);
                String string = getString(cVar2.f39703b);
                string.getClass();
                int length2 = string.length();
                SpannableString spannableString = new SpannableString(string);
                int i17 = length2 - i16;
                spannableString.setSpan(cVar2.f39705d, i17, length2, 18);
                spannableString.setSpan(new ForegroundColorSpan(a7.b.getColor(this, R.color.gcm_text_primary_action)), i17, length2, 18);
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                textView.setVisibility(8);
            }
        }
        findViewById(R.id.education_close_image_view).setOnClickListener(new d(this, 11));
    }

    @Override // com.garmin.android.apps.connectmobile.onboarding.education.c.b
    public final void x4(com.garmin.android.apps.connectmobile.onboarding.education.a.b bVar) {
        if (bVar != null) {
            bVar.a(this.f39690a);
        }
        finish();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/OnboardingEducationalActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
