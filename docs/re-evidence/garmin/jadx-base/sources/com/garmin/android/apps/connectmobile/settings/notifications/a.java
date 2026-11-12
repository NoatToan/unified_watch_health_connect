package com.garmin.android.apps.connectmobile.settings.notifications;

import a03.f;
import a73.j;
import aj1.p;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import e23.l;
import gh2.i;
import java.util.ArrayList;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/a;", "Landroidx/preference/b;", "Lcom/garmin/android/apps/connectmobile/settings/notifications/NotificationSettingsActivity$b;", "Laj1/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends androidx.preference.b implements NotificationSettingsActivity.b, aj1.d {
    public static final C0807a Q0 = new C0807a(null);
    public SwitchPreferenceCompat A;
    public SwitchPreferenceCompat B;
    public SwitchPreferenceCompat C;
    public SwitchPreferenceCompat D;
    public SwitchPreferenceCompat E;
    public SwitchPreferenceCompat F;
    public SwitchPreferenceCompat H0;
    public SwitchPreferenceCompat I;
    public PreferenceCategory I0;
    public PreferenceCategory J0;
    public PreferenceCategory K0;
    public PreferenceCategory L0;
    public PreferenceCategory M0;
    public PreferenceCategory N0;
    public PreferenceCategory O0;
    public SwitchPreferenceCompat P;
    public com.garmin.android.apps.connectmobile.settings.notifications.model.a P0;
    public SwitchPreferenceCompat T;
    public SwitchPreferenceCompat X;
    public SwitchPreferenceCompat Y;
    public SwitchPreferenceCompat Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f43575i = new w1(s0.f105811a.b(p.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f43576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43577k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SwitchPreferenceCompat f43578k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SwitchPreferenceCompat f43579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SwitchPreferenceCompat f43580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SwitchPreferenceCompat f43581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SwitchPreferenceCompat f43582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SwitchPreferenceCompat f43583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SwitchPreferenceCompat f43584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SwitchPreferenceCompat f43585r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SwitchPreferenceCompat f43586t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SwitchPreferenceCompat f43587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SwitchPreferenceCompat f43588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SwitchPreferenceCompat f43589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SwitchPreferenceCompat f43590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SwitchPreferenceCompat f43591z;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43592a;

        public b(l lVar) {
            lVar.getClass();
            this.f43592a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43592a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43592a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f43593a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43593a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43594a = aVar;
            this.f43595b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43594a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43595b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f43596a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43596a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity.b
    public final com.garmin.android.apps.connectmobile.settings.notifications.model.a E() {
        SwitchPreferenceCompat switchPreferenceCompat;
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar = this.P0;
        if (aVar != null) {
            NotificationPreferencesDTO notificationPreferencesDTO = aVar.f43659a;
            boolean z14 = false;
            if (notificationPreferencesDTO != null) {
                SwitchPreferenceCompat switchPreferenceCompat2 = this.f43579l;
                notificationPreferencesDTO.f43652r = switchPreferenceCompat2 != null && switchPreferenceCompat2.K0;
                SwitchPreferenceCompat switchPreferenceCompat3 = this.f43582o;
                notificationPreferencesDTO.f43640g = switchPreferenceCompat3 != null && switchPreferenceCompat3.K0;
                SwitchPreferenceCompat switchPreferenceCompat4 = this.f43583p;
                notificationPreferencesDTO.f43638f = switchPreferenceCompat4 != null && switchPreferenceCompat4.K0;
                SwitchPreferenceCompat switchPreferenceCompat5 = this.f43584q;
                notificationPreferencesDTO.f43636e = switchPreferenceCompat5 != null && switchPreferenceCompat5.K0;
                SwitchPreferenceCompat switchPreferenceCompat6 = this.f43585r;
                notificationPreferencesDTO.f43653t = switchPreferenceCompat6 != null && switchPreferenceCompat6.K0;
                SwitchPreferenceCompat switchPreferenceCompat7 = this.f43586t;
                notificationPreferencesDTO.f43656x = switchPreferenceCompat7 != null && switchPreferenceCompat7.K0;
                SwitchPreferenceCompat switchPreferenceCompat8 = this.f43587v;
                notificationPreferencesDTO.f43650p = switchPreferenceCompat8 != null && switchPreferenceCompat8.K0;
                SwitchPreferenceCompat switchPreferenceCompat9 = this.f43588w;
                notificationPreferencesDTO.f43651q = switchPreferenceCompat9 != null && switchPreferenceCompat9.K0;
                SwitchPreferenceCompat switchPreferenceCompat10 = this.f43589x;
                notificationPreferencesDTO.f43657y = switchPreferenceCompat10 != null && switchPreferenceCompat10.K0;
                SwitchPreferenceCompat switchPreferenceCompat11 = this.f43590y;
                notificationPreferencesDTO.f43658z = switchPreferenceCompat11 != null && switchPreferenceCompat11.K0;
                SwitchPreferenceCompat switchPreferenceCompat12 = this.f43591z;
                notificationPreferencesDTO.f43630b = switchPreferenceCompat12 != null && switchPreferenceCompat12.K0;
                SwitchPreferenceCompat switchPreferenceCompat13 = this.A;
                notificationPreferencesDTO.f43632c = switchPreferenceCompat13 != null && switchPreferenceCompat13.K0;
                SwitchPreferenceCompat switchPreferenceCompat14 = this.B;
                notificationPreferencesDTO.f43628a = switchPreferenceCompat14 != null && switchPreferenceCompat14.K0;
                SwitchPreferenceCompat switchPreferenceCompat15 = this.C;
                notificationPreferencesDTO.f43634d = switchPreferenceCompat15 != null && switchPreferenceCompat15.K0;
                SwitchPreferenceCompat switchPreferenceCompat16 = this.D;
                notificationPreferencesDTO.f43641h = switchPreferenceCompat16 != null && switchPreferenceCompat16.K0;
                SwitchPreferenceCompat switchPreferenceCompat17 = this.E;
                notificationPreferencesDTO.f43647m = switchPreferenceCompat17 != null && switchPreferenceCompat17.K0;
                SwitchPreferenceCompat switchPreferenceCompat18 = this.F;
                notificationPreferencesDTO.f43648n = switchPreferenceCompat18 != null && switchPreferenceCompat18.K0;
                SwitchPreferenceCompat switchPreferenceCompat19 = this.I;
                notificationPreferencesDTO.f43649o = switchPreferenceCompat19 != null && switchPreferenceCompat19.K0;
                SwitchPreferenceCompat switchPreferenceCompat20 = this.P;
                notificationPreferencesDTO.f43642i = switchPreferenceCompat20 != null && switchPreferenceCompat20.K0;
                SwitchPreferenceCompat switchPreferenceCompat21 = this.T;
                notificationPreferencesDTO.f43643j = switchPreferenceCompat21 != null && switchPreferenceCompat21.K0;
                SwitchPreferenceCompat switchPreferenceCompat22 = this.X;
                notificationPreferencesDTO.f43644k = switchPreferenceCompat22 != null && switchPreferenceCompat22.K0;
                SwitchPreferenceCompat switchPreferenceCompat23 = this.Y;
                notificationPreferencesDTO.f43646l = switchPreferenceCompat23 != null && switchPreferenceCompat23.K0;
                SwitchPreferenceCompat switchPreferenceCompat24 = this.Z;
                notificationPreferencesDTO.f43654v = switchPreferenceCompat24 != null && switchPreferenceCompat24.K0;
                SwitchPreferenceCompat switchPreferenceCompat25 = this.f43578k0;
                notificationPreferencesDTO.f43655w = switchPreferenceCompat25 != null && switchPreferenceCompat25.K0;
                SwitchPreferenceCompat switchPreferenceCompat26 = this.H0;
                notificationPreferencesDTO.f43631b1 = switchPreferenceCompat26 != null && switchPreferenceCompat26.K0;
                SwitchPreferenceCompat switchPreferenceCompat27 = this.f43581n;
                notificationPreferencesDTO.A = switchPreferenceCompat27 != null && switchPreferenceCompat27.K0;
                notificationPreferencesDTO.B = switchPreferenceCompat11 != null && switchPreferenceCompat11.K0;
            }
            aVar.f43659a = notificationPreferencesDTO;
            if (this.f43577k && (switchPreferenceCompat = this.f43580m) != null && this.f43581n != null) {
                boolean z15 = switchPreferenceCompat.K0;
                rl0.a.b bVar = rl0.a.f153399c;
                String strValueOf = String.valueOf(z15);
                bVar.getClass();
                strValueOf.getClass();
                aVar.f43660b = new rl0.a("send.email.summary.weekly", strValueOf, null);
                SwitchPreferenceCompat switchPreferenceCompat28 = this.f43581n;
                if (switchPreferenceCompat28 != null && switchPreferenceCompat28.K0) {
                    z14 = true;
                }
                String strValueOf2 = String.valueOf(z14);
                strValueOf2.getClass();
                aVar.f43661c = new rl0.a("send.email.summary.monthly", strValueOf2, null);
            }
        }
        return this.P0;
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((p) this.f43575i.getValue()).y4().f(this, new b(new f(this, 9)));
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    @SuppressLint({"WrongViewCast"})
    public final void onViewCreated(View view2, Bundle bundle) {
        PreferenceCategory preferenceCategory;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = this.f10194c;
        recyclerView.getClass();
        recyclerView.setItemAnimator(null);
        com.garmin.android.apps.connectmobile.l.g().getClass();
        this.f43577k = i.f77458c.a().f77477b.c("garmin_email_summary_enabled");
        ArrayList arrayList = new ArrayList();
        this.f43576j = arrayList;
        PreferenceScreen preferenceScreen = this.f10193b.f17494g;
        preferenceScreen.getClass();
        int size = preferenceScreen.M0.size();
        for (int i14 = 0; i14 < size; i14++) {
            Preference preferenceG = preferenceScreen.G(i14);
            preferenceG.getClass();
            arrayList.add(preferenceG);
        }
        ArrayList arrayList2 = this.f43576j;
        if (arrayList2 == null) {
            s.m("mPreferenceList");
            throw null;
        }
        y0.a(arrayList2).remove(H0(getString(R.string.key_preference_header_category)));
        ArrayList arrayList3 = this.f43576j;
        if (arrayList3 == null) {
            s.m("mPreferenceList");
            throw null;
        }
        y0.a(arrayList3).remove(H0(getString(R.string.key_preference_footer_category)));
        ArrayList arrayList4 = this.f43576j;
        if (arrayList4 == null) {
            s.m("mPreferenceList");
            throw null;
        }
        y0.a(arrayList4).remove(H0(getString(R.string.key_email_notifications_implicit_consent)));
        if (!this.f43577k) {
            bd.f fVar = this.f10193b;
            String string = getString(R.string.key_preference_email_summary_category);
            PreferenceScreen preferenceScreen2 = fVar.f17494g;
            PreferenceCategory preferenceCategory2 = (PreferenceCategory) (preferenceScreen2 == null ? null : preferenceScreen2.F(string));
            if (preferenceCategory2 != null) {
                this.f10193b.f17494g.H(preferenceCategory2);
            }
        }
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications));
        this.f43579l = switchPreferenceCompat;
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.f10151e = new j(this, 4);
        }
        this.f43580m = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_weekly_summary_reports));
        this.f43581n = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_monthly_summary_reports));
        this.J0 = (PreferenceCategory) H0(getString(R.string.key_email_notifications_connection_category));
        this.f43582o = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_connection_requests));
        this.f43583p = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_connection_confirmations));
        this.K0 = (PreferenceCategory) H0(getString(R.string.key_email_notifications_activities_category));
        this.f43584q = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_connection_comments_on_my_activities));
        this.f43585r = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_connection_comments_after_mine));
        this.f43586t = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_activity_comment_mentions));
        this.f43587v = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_activity_likes));
        this.f43588w = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_comment_likes));
        this.f43589x = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_weight_scale_invitations));
        this.f43590y = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_weekly_wellness_summary_reports));
        this.L0 = (PreferenceCategory) H0(getString(R.string.key_email_notifications_challenges_category));
        this.f43591z = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_challenge_invitations));
        this.A = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_challenge_reminders));
        this.B = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_challenge_comments));
        this.C = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_challenge_results));
        this.D = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_gear_max_distance_alerts));
        this.M0 = (PreferenceCategory) H0(getString(R.string.key_email_notifications_groups_category));
        this.E = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_group_invitations));
        this.F = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_group_membership_confirmations));
        this.I = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_group_posts_and_announcements));
        this.P = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_group_comments_on_my_posts));
        this.T = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_group_comments_after_mine));
        this.X = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_group_post_like));
        this.Y = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_group_post_comment_like));
        this.N0 = (PreferenceCategory) H0(getString(R.string.key_email_notifications_segment_category));
        this.Z = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_segment_comments_on_my_segments));
        this.f43578k0 = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_segment_updates_to_favorites));
        SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) H0(getString(R.string.key_email_notifications_consent_permissions));
        this.H0 = switchPreferenceCompat2;
        if (switchPreferenceCompat2 != null) {
            switchPreferenceCompat2.z(getString(R.string.lbl_permissions));
        }
        this.O0 = (PreferenceCategory) H0(getString(R.string.key_email_notifications_consent_permissions_category));
        this.I0 = (PreferenceCategory) H0(getString(R.string.key_preference_email_wellness_summary_category));
        com.garmin.android.apps.connectmobile.l.g().getClass();
        if (!i.f77458c.a().f77477b.c("wellness_weekly_summary_email_enabled") && (preferenceCategory = this.I0) != null) {
            this.f10193b.f17494g.H(preferenceCategory);
        }
        PreferenceCategory preferenceCategory3 = (PreferenceCategory) H0(getString(R.string.key_email_notifications_connection_category));
        if (preferenceCategory3 != null) {
            preferenceCategory3.A(false);
            ArrayList arrayList5 = this.f43576j;
            if (arrayList5 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            arrayList5.remove(preferenceCategory3);
        }
        if (!s3.b()) {
            s3.f23252a.getClass();
            boolean zA = s3.a("ROLE_USER_MANAGED_ACCOUNTS_ADMIN");
            PreferenceCategory preferenceCategory4 = this.O0;
            if (zA) {
                if (preferenceCategory4 != null) {
                    preferenceCategory4.z(getString(R.string.lbl_child_accounts));
                    return;
                }
                return;
            }
            if (preferenceCategory4 != null) {
                preferenceCategory4.A(false);
            }
            PreferenceCategory preferenceCategory5 = this.O0;
            if (preferenceCategory5 != null) {
                ArrayList arrayList6 = this.f43576j;
                if (arrayList6 != null) {
                    arrayList6.remove(preferenceCategory5);
                    return;
                } else {
                    s.m("mPreferenceList");
                    throw null;
                }
            }
            return;
        }
        PreferenceCategory preferenceCategory6 = this.J0;
        if (preferenceCategory6 != null) {
            ArrayList arrayList7 = this.f43576j;
            if (arrayList7 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            arrayList7.remove(preferenceCategory6);
        }
        PreferenceCategory preferenceCategory7 = this.J0;
        if (preferenceCategory7 != null) {
            preferenceCategory7.A(false);
        }
        PreferenceCategory preferenceCategory8 = this.K0;
        if (preferenceCategory8 != null) {
            ArrayList arrayList8 = this.f43576j;
            if (arrayList8 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            arrayList8.remove(preferenceCategory8);
        }
        PreferenceCategory preferenceCategory9 = this.K0;
        if (preferenceCategory9 != null) {
            preferenceCategory9.A(false);
        }
        PreferenceCategory preferenceCategory10 = this.L0;
        if (preferenceCategory10 != null) {
            ArrayList arrayList9 = this.f43576j;
            if (arrayList9 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            arrayList9.remove(preferenceCategory10);
        }
        PreferenceCategory preferenceCategory11 = this.L0;
        if (preferenceCategory11 != null) {
            preferenceCategory11.A(false);
        }
        PreferenceCategory preferenceCategory12 = this.M0;
        if (preferenceCategory12 != null) {
            ArrayList arrayList10 = this.f43576j;
            if (arrayList10 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            arrayList10.remove(preferenceCategory12);
        }
        PreferenceCategory preferenceCategory13 = this.M0;
        if (preferenceCategory13 != null) {
            preferenceCategory13.A(false);
        }
        SwitchPreferenceCompat switchPreferenceCompat3 = this.Z;
        if (switchPreferenceCompat3 != null) {
            ArrayList arrayList11 = this.f43576j;
            if (arrayList11 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            arrayList11.remove(switchPreferenceCompat3);
        }
        SwitchPreferenceCompat switchPreferenceCompat4 = this.Z;
        if (switchPreferenceCompat4 != null) {
            switchPreferenceCompat4.A(false);
        }
        PreferenceCategory preferenceCategory14 = this.N0;
        if (preferenceCategory14 != null) {
            preferenceCategory14.z(getString(R.string.card_segments_title));
        }
    }

    @Override // aj1.d
    public final String v1() {
        String string = getString(R.string.settings_email_notifications);
        string.getClass();
        return string;
    }

    @Override // androidx.preference.b
    public final void v6() {
        u6(R.xml.gcm_settings_email_notifications);
    }

    public final void w6(boolean z14) {
        SwitchPreferenceCompat switchPreferenceCompat = this.f43579l;
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.E(z14);
        }
        ArrayList arrayList = this.f43576j;
        if (arrayList == null) {
            s.m("mPreferenceList");
            throw null;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ArrayList arrayList2 = this.f43576j;
            if (arrayList2 == null) {
                s.m("mPreferenceList");
                throw null;
            }
            Preference preference = (Preference) arrayList2.get(i14);
            if (preference != this.f43579l) {
                preference.A(z14);
            }
        }
    }

    @Override // aj1.d
    public final String x3() {
        return "EmailNotificationSettingsFragment";
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.notifications.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0807a {
        public /* synthetic */ C0807a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0807a() {
        }
    }
}
