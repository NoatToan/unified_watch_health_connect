package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import c22.j0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.view.DynamicHeightAdaptedTouchSwitchViewPager;
import com.google.android.material.tabs.TabLayout;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import mz1.g1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {
    public static final C0883a T0 = new C0883a(null);
    public ImageView A;
    public FrameLayout B;
    public AppCompatButton C;
    public TextView D;
    public ImageView E;
    public LinearLayout F;
    public MenuItem H0;
    public ImageView I;
    public MenuItem I0;
    public MenuItem J0;
    public fg0.k K0;
    public com.garmin.android.apps.connectmobile.courses.model.e L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public TextView P;
    public boolean P0;
    public boolean Q0;
    public final f.c<Intent> R0;
    public final d S0;
    public String T;
    public MenuItem X;
    public MenuItem Y;
    public MenuItem Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f45739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TabLayout f45740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager f45741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f45742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f45743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f45744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f45745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f45747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f45748k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public MenuItem f45749k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f45750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f45751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FrameLayout f45752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f45753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f45754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f45755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f45756r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f45757t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f45758v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f45759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f45760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f45761y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f45762z;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/a$b;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/v;", "fragmentManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfg0/k;", "eventDTO", "", "isFromFindAnEvent", "shouldShowStrategy", "<init>", "(Landroidx/fragment/app/v;Landroid/content/Context;Lfg0/k;ZZ)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends e0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Context f45763h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final fg0.k f45764i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f45765j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f45766k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f45767l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.v vVar, Context context, fg0.k kVar, boolean z14, boolean z15) {
            super(vVar);
            vVar.getClass();
            context.getClass();
            kVar.getClass();
            this.f45763h = context;
            this.f45764i = kVar;
            this.f45765j = z14;
            this.f45766k = z15;
            this.f45767l = -1;
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF44034e() {
            return this.f45766k ? 3 : 2;
        }

        @Override // androidx.fragment.app.e0
        public final Fragment getItem(int i14) {
            if (i14 == 0) {
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c cVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.c();
                Bundle bundle = new Bundle();
                bundle.putBoolean("GCM_extra_is_find_an_event", this.f45765j);
                cVar.setArguments(bundle);
                return cVar;
            }
            fg0.k kVar = this.f45764i;
            if (i14 == 1) {
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o.getClass();
                kVar.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.e();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("EXTRA_EVENT_DTO", kVar);
                eVar.setArguments(bundle2);
                return eVar;
            }
            if (i14 != 2) {
                return new Fragment();
            }
            com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e.getClass();
            kVar.getClass();
            com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.d();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("Event", kVar);
            dVar.setArguments(bundle3);
            return dVar;
        }

        @Override // fe.a
        public final int getItemPosition(Object obj) {
            obj.getClass();
            return super.getItemPosition(obj);
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            Context context = this.f45763h;
            if (i14 == 0) {
                return tn.k.g(context.getString(R.string.lbl_overview), StringUtils.SPACE);
            }
            if (i14 == 1) {
                String string = context.getString(R.string.lbl_training);
                string.getClass();
                return string;
            }
            if (i14 != 2) {
                return "";
            }
            String string2 = context.getString(R.string.lbl_strategy);
            string2.getClass();
            return string2;
        }

        @Override // androidx.fragment.app.e0, fe.a
        public final void setPrimaryItem(ViewGroup viewGroup, int i14, Object obj) {
            viewGroup.getClass();
            obj.getClass();
            super.setPrimaryItem(viewGroup, i14, obj);
            if (i14 != this.f45767l) {
                Fragment fragment = (Fragment) obj;
                DynamicHeightAdaptedTouchSwitchViewPager dynamicHeightAdaptedTouchSwitchViewPager = (DynamicHeightAdaptedTouchSwitchViewPager) viewGroup;
                if (fragment.getView() != null) {
                    this.f45767l = i14;
                    dynamicHeightAdaptedTouchSwitchViewPager.f47402h1 = fragment.getView();
                    dynamicHeightAdaptedTouchSwitchViewPager.requestLayout();
                }
            }
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45768a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45768a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/a$d", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = a.this;
            if (aVar.N0 && !aVar.O0 && !aVar.z6().f204399p) {
                androidx.fragment.app.m activity = aVar.getActivity();
                if (activity != null) {
                    activity.setResult(0);
                }
                androidx.fragment.app.m activity2 = aVar.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
            }
            Intent intent = new Intent();
            mz1.e0 e0VarZ6 = aVar.z6();
            intent.putExtra("extra_event_dashboard_refresh_needed", !p005kotlin.jvm.internal.s.g(e0VarZ6.f121693n1, e0VarZ6.l5().d()) || aVar.z6().f204399p);
            mz1.e0 e0VarZ7 = aVar.z6();
            intent.putExtra("GCM_extra_event_updated", !p005kotlin.jvm.internal.s.g(e0VarZ7.f121693n1, e0VarZ7.l5().d()));
            aVar.z6().f204399p = false;
            androidx.fragment.app.m activity3 = aVar.getActivity();
            if (activity3 != null) {
                activity3.setResult(-1, intent);
            }
            androidx.fragment.app.m activity4 = aVar.getActivity();
            if (activity4 != null) {
                activity4.finish();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/a$e", "Landroidx/core/view/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements androidx.core.view.s {
        public e() {
        }

        /* JADX WARN: Code duplicated, block: B:78:0x0162  */
        /* JADX WARN: Code duplicated, block: B:80:0x0166  */
        /* JADX WARN: Code duplicated, block: B:86:0x0185  */
        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            LocalDate date;
            MenuItem menuItem;
            gg0.a aVar;
            zl.a.f(menu, menuInflater, R.menu.event_details_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_link_activity);
            menuItemFindItem.getClass();
            a aVar2 = a.this;
            aVar2.X = menuItemFindItem;
            MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_edit_event);
            menuItemFindItem2.getClass();
            aVar2.Y = menuItemFindItem2;
            MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_item_send_to_device);
            menuItemFindItem3.getClass();
            aVar2.Z = menuItemFindItem3;
            MenuItem menuItemFindItem4 = menu.findItem(R.id.menu_item_duplicate_event);
            menuItemFindItem4.getClass();
            aVar2.f45749k0 = menuItemFindItem4;
            MenuItem menuItemFindItem5 = menu.findItem(R.id.menu_item_delete_event);
            menuItemFindItem5.getClass();
            aVar2.H0 = menuItemFindItem5;
            MenuItem menuItemFindItem6 = menu.findItem(R.id.menu_item_report_event_image);
            menuItemFindItem6.getClass();
            aVar2.I0 = menuItemFindItem6;
            MenuItem menuItemFindItem7 = menu.findItem(R.id.menu_item_remove_from_calendar);
            menuItemFindItem7.getClass();
            aVar2.J0 = menuItemFindItem7;
            MenuItem menuItemFindItem8 = menu.findItem(R.id.menu_item_exit_fbt_setup_flow);
            fg0.k kVar = aVar2.K0;
            if (kVar != null) {
                LocalDate localDateNow = LocalDate.now();
                MenuItem menuItem2 = aVar2.Z;
                if (menuItem2 == null) {
                    p005kotlin.jvm.internal.s.m("sendToDeviceMenuItem");
                    throw null;
                }
                localDateNow.getClass();
                Boolean eventOrganizer = kVar.getEventOrganizer();
                Boolean bool = Boolean.TRUE;
                menuItem2.setVisible((p005kotlin.jvm.internal.s.g(eventOrganizer, bool) || p005kotlin.jvm.internal.s.g(kVar.getSubscribed(), bool)) && kVar.getDate() != null && (localDateNow.isEqual(kVar.getDate()) || localDateNow.isBefore(kVar.getDate())));
                Boolean eventOrganizer2 = kVar.getEventOrganizer();
                if (eventOrganizer2 == null) {
                    MenuItem menuItem3 = aVar2.f45749k0;
                    if (menuItem3 == null) {
                        p005kotlin.jvm.internal.s.m("duplicateEventMenuItem");
                        throw null;
                    }
                    menuItem3.setVisible(false);
                    MenuItem menuItem4 = aVar2.I0;
                    if (menuItem4 == null) {
                        p005kotlin.jvm.internal.s.m("reportEventImageMenuItem");
                        throw null;
                    }
                    menuItem4.setVisible(false);
                    MenuItem menuItem5 = aVar2.J0;
                    if (menuItem5 == null) {
                        p005kotlin.jvm.internal.s.m("removeFromCalendarMenuItem");
                        throw null;
                    }
                    menuItem5.setVisible(false);
                    MenuItem menuItem6 = aVar2.Y;
                    if (menuItem6 == null) {
                        p005kotlin.jvm.internal.s.m("editEventMenuItem");
                        throw null;
                    }
                    menuItem6.setVisible(false);
                    MenuItem menuItem7 = aVar2.H0;
                    if (menuItem7 == null) {
                        p005kotlin.jvm.internal.s.m("deleteEventMenuItem");
                        throw null;
                    }
                    menuItem7.setVisible(false);
                } else if (eventOrganizer2.booleanValue()) {
                    if (kVar.getDate() == null || localDateNow.isEqual(kVar.getDate()) || !localDateNow.isAfter(kVar.getDate())) {
                        MenuItem menuItem8 = aVar2.Y;
                        if (menuItem8 == null) {
                            p005kotlin.jvm.internal.s.m("editEventMenuItem");
                            throw null;
                        }
                        menuItem8.setVisible(true);
                    } else {
                        MenuItem menuItem9 = aVar2.Y;
                        if (menuItem9 == null) {
                            p005kotlin.jvm.internal.s.m("editEventMenuItem");
                            throw null;
                        }
                        fg0.c eventPrivacy = kVar.getEventPrivacy();
                        menuItem9.setVisible((eventPrivacy == null || (aVar = eventPrivacy.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null || !aVar.equals(gg0.a.PRIVATE)) ? false : true);
                    }
                    MenuItem menuItem10 = aVar2.f45749k0;
                    if (menuItem10 == null) {
                        p005kotlin.jvm.internal.s.m("duplicateEventMenuItem");
                        throw null;
                    }
                    menuItem10.setVisible(true);
                    MenuItem menuItem11 = aVar2.H0;
                    if (menuItem11 == null) {
                        p005kotlin.jvm.internal.s.m("deleteEventMenuItem");
                        throw null;
                    }
                    menuItem11.setVisible(true);
                    MenuItem menuItem12 = aVar2.I0;
                    if (menuItem12 == null) {
                        p005kotlin.jvm.internal.s.m("reportEventImageMenuItem");
                        throw null;
                    }
                    menuItem12.setVisible(false);
                    MenuItem menuItem13 = aVar2.J0;
                    if (menuItem13 == null) {
                        p005kotlin.jvm.internal.s.m("removeFromCalendarMenuItem");
                        throw null;
                    }
                    menuItem13.setVisible(false);
                } else {
                    MenuItem menuItem14 = aVar2.Y;
                    if (menuItem14 == null) {
                        p005kotlin.jvm.internal.s.m("editEventMenuItem");
                        throw null;
                    }
                    menuItem14.setVisible(false);
                    MenuItem menuItem15 = aVar2.H0;
                    if (menuItem15 == null) {
                        p005kotlin.jvm.internal.s.m("deleteEventMenuItem");
                        throw null;
                    }
                    menuItem15.setVisible(false);
                    List<fg0.a0> listS = kVar.s();
                    if (listS == null || ((fg0.a0) h0.d0(listS)) == null) {
                        menuItem = aVar2.I0;
                        if (menuItem != null) {
                            p005kotlin.jvm.internal.s.m("reportEventImageMenuItem");
                            throw null;
                        }
                        menuItem.setVisible(false).getClass();
                    } else {
                        MenuItem menuItem16 = aVar2.I0;
                        if (menuItem16 == null) {
                            p005kotlin.jvm.internal.s.m("reportEventImageMenuItem");
                            throw null;
                        }
                        if (menuItem16.setVisible(true) == null) {
                            menuItem = aVar2.I0;
                            if (menuItem != null) {
                                p005kotlin.jvm.internal.s.m("reportEventImageMenuItem");
                                throw null;
                            }
                            menuItem.setVisible(false).getClass();
                        }
                    }
                    MenuItem menuItem17 = aVar2.J0;
                    if (menuItem17 == null) {
                        p005kotlin.jvm.internal.s.m("removeFromCalendarMenuItem");
                        throw null;
                    }
                    menuItem17.setVisible(p005kotlin.jvm.internal.s.g(kVar.getSubscribed(), bool)).getClass();
                }
                lz1.f.f115404a.getClass();
                lz1.f.f115405b.info("isTrackingInitiativeEnabled");
                if (((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).d() && (date = kVar.getDate()) != null && (date.isEqual(localDateNow) || date.isBefore(localDateNow))) {
                    MenuItem menuItem18 = aVar2.X;
                    if (menuItem18 == null) {
                        p005kotlin.jvm.internal.s.m("linkActivityMenuItem");
                        throw null;
                    }
                    menuItem18.setVisible(true);
                }
            }
            if (aVar2.P0) {
                int size = menu.size();
                for (int i14 = 0; i14 < size; i14++) {
                    menu.getItem(i14).setVisible(false);
                }
            }
            if (aVar2.N0 && aVar2.z6().f204395l) {
                menuItemFindItem8.setVisible(true);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            String shareableEventUuid;
            fg0.j eventCustomization;
            fg0.j eventCustomization2;
            fg0.j eventCustomization3;
            String str;
            fg0.j eventCustomization4;
            fg0.j eventCustomization5;
            fg0.j eventCustomization6;
            String str2;
            Boolean eventOrganizer;
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            a aVar = a.this;
            if (itemId == R.id.menu_item_link_activity) {
                C0883a c0883a = a.T0;
                ((y0) aVar.z6().f121686h1.getValue()).m("TILinkActivitiesFragment");
                return true;
            }
            if (itemId == R.id.menu_item_edit_event) {
                fg0.k kVar = aVar.K0;
                if (kVar != null) {
                    TrainingInitiativeEventActivity.a aVar2 = TrainingInitiativeEventActivity.f45718o;
                    androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                    mVarRequireActivity.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.e eVar = kVar.getCourseId() != null ? aVar.L0 : null;
                    List<com.garmin.android.apps.connectmobile.courses.model.e> listD = aVar.z6().h5().d();
                    fg0.x xVar = aVar.z6().f204394k;
                    String str3 = aVar.z6().f204400q;
                    ArrayList arrayList = aVar.z6().X;
                    aVar2.getClass();
                    str3.getClass();
                    ArrayList<? extends Parcelable> arrayList2 = listD == null ? null : new ArrayList<>(listD);
                    ArrayList<? extends Parcelable> arrayList3 = arrayList != null ? new ArrayList<>(arrayList) : null;
                    Bundle bundle = new Bundle();
                    Intent intent = new Intent(mVarRequireActivity, (Class<?>) TrainingInitiativeEventActivity.class);
                    intent.putExtra("GCM_extra_sharable_event_dto", kVar);
                    bundle.putParcelable("GCM_extra_sharable_course_dto", eVar);
                    intent.putParcelableArrayListExtra("GCM_extra_course_detail_list", arrayList2);
                    intent.putExtra("GCM_extra_is_garmin_coach_dto", xVar);
                    intent.putExtra("GCM_extra_is_sharable_event", true);
                    intent.putExtra("GCM_extra_training_plan_name", str3);
                    intent.putParcelableArrayListExtra("GCM_extra_available_activity_types", arrayList3);
                    com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                    mVarRequireActivity.startActivityForResult(intent, 100);
                    return true;
                }
            } else {
                if (itemId == R.id.menu_item_send_to_device) {
                    SendToDeviceActivity.a aVar3 = SendToDeviceActivity.f45711b;
                    Context contextRequireContext = aVar.requireContext();
                    contextRequireContext.getClass();
                    fg0.k kVar2 = aVar.K0;
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = aVar.L0;
                    aVar3.getClass();
                    Intent intent2 = new Intent(contextRequireContext, (Class<?>) SendToDeviceActivity.class);
                    intent2.putExtra("GCM_extra_event", kVar2);
                    intent2.putExtra("GCM_extra_course", eVar2);
                    aVar.requireActivity().startActivity(intent2);
                    return true;
                }
                if (itemId != R.id.menu_item_duplicate_event) {
                    String str4 = "";
                    if (itemId == R.id.menu_item_delete_event) {
                        fg0.k kVar3 = aVar.K0;
                        if (kVar3 != null && (eventCustomization6 = kVar3.getEventCustomization()) != null && eventCustomization6.t()) {
                            fg0.x xVar2 = aVar.z6().f204394k;
                            if (xVar2 != null && (str2 = xVar2.f71366b) != null) {
                                str4 = str2;
                            }
                            String string = aVar.getString(R.string.linked_event_delete_confirmation, str4);
                            string.getClass();
                            a.u6(aVar, true, string);
                            return true;
                        }
                        fg0.k kVar4 = aVar.K0;
                        if (kVar4 != null && (eventCustomization5 = kVar4.getEventCustomization()) != null && eventCustomization5.z()) {
                            String string2 = aVar.getString(R.string.linked_event_delete_confirmation, aVar.z6().f204400q);
                            string2.getClass();
                            a.u6(aVar, true, string2);
                            return true;
                        }
                        fg0.k kVar5 = aVar.K0;
                        if (kVar5 == null || (eventCustomization4 = kVar5.getEventCustomization()) == null || !eventCustomization4.u()) {
                            String string3 = aVar.getString(R.string.delete_event_message);
                            string3.getClass();
                            a.u6(aVar, true, string3);
                            return true;
                        }
                        String string4 = aVar.getString(R.string.named_plan, aVar.z6().f204400q);
                        string4.getClass();
                        String string5 = aVar.getString(R.string.delete_event_deletes_plan_message, string4);
                        string5.getClass();
                        a.u6(aVar, true, string5);
                        return true;
                    }
                    if (itemId == R.id.menu_item_report_event_image) {
                        ca1.d.a aVar4 = ca1.d.f26580m;
                        androidx.fragment.app.m activity = aVar.getActivity();
                        aVar4.getClass();
                        ca1.d dVarA = ca1.d.a.a(activity);
                        if (dVarA != null) {
                            dVarA.show(aVar.requireActivity().getSupportFragmentManager(), "reportImage");
                            return true;
                        }
                    } else {
                        if (itemId == R.id.menu_item_remove_from_calendar) {
                            fg0.k kVar6 = aVar.K0;
                            if (kVar6 != null && (eventCustomization3 = kVar6.getEventCustomization()) != null && eventCustomization3.t()) {
                                fg0.x xVar3 = aVar.z6().f204394k;
                                if (xVar3 != null && (str = xVar3.f71366b) != null) {
                                    str4 = str;
                                }
                                String string6 = aVar.getString(R.string.linked_event_remove_confirmation, str4);
                                string6.getClass();
                                a.u6(aVar, false, string6);
                                return true;
                            }
                            fg0.k kVar7 = aVar.K0;
                            if (kVar7 != null && (eventCustomization2 = kVar7.getEventCustomization()) != null && eventCustomization2.z()) {
                                String string7 = aVar.getString(R.string.linked_event_remove_confirmation, aVar.z6().f204400q);
                                string7.getClass();
                                a.u6(aVar, false, string7);
                                return true;
                            }
                            fg0.k kVar8 = aVar.K0;
                            if (kVar8 != null && (eventCustomization = kVar8.getEventCustomization()) != null && eventCustomization.u()) {
                                String string8 = aVar.getString(R.string.named_plan, aVar.z6().f204400q);
                                string8.getClass();
                                String string9 = aVar.getString(R.string.remove_event_deletes_plan_message, string8);
                                string9.getClass();
                                a.u6(aVar, false, string9);
                                return true;
                            }
                            fg0.k kVar9 = aVar.K0;
                            if (kVar9 == null || (shareableEventUuid = kVar9.getShareableEventUuid()) == null) {
                                g22.e.a(aVar, null);
                                return true;
                            }
                            mz1.e0 e0VarZ6 = aVar.z6();
                            ge1.b.T(v1.a(e0VarZ6), null, null, new g1(e0VarZ6, shareableEventUuid, null), 3);
                            return true;
                        }
                        if (itemId != R.id.menu_item_exit_fbt_setup_flow) {
                            return false;
                        }
                        androidx.fragment.app.m activity2 = aVar.getActivity();
                        if (activity2 != null) {
                            fy1.i.f73924a.getClass();
                            fy1.i.a.u(activity2, null);
                        }
                    }
                } else if (aVar.K0 != null) {
                    fg0.k kVarD = aVar.z6().l5().d();
                    String string10 = (kVarD == null || (eventOrganizer = kVarD.getEventOrganizer()) == null) ? false : eventOrganizer.booleanValue() ? aVar.getString(R.string.duplicate_event_message_owner) : aVar.getString(R.string.duplicate_event_message_subscriber);
                    string10.getClass();
                    androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(aVar.requireContext());
                    aVar5.setTitle(aVar.getString(R.string.duplicate_event_question));
                    aVar5.setMessage(string10);
                    aVar5.setCancelable(false);
                    aVar5.setPositiveButton(aVar.getString(R.string.lbl_common_continue), new sa2.b(aVar, 5));
                    aVar5.setNegativeButton(aVar.getString(R.string.lbl_cancel), new qh1.j(29));
                    aVar5.create().show();
                    return true;
                }
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f45771a;

        public f(e23.l lVar) {
            lVar.getClass();
            this.f45771a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45771a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45771a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f45772a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45772a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45774b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45773a = aVar;
            this.f45774b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45773a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45774b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45775a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f45775a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45775a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.event_details_fragment);
        this.f45738a = new w1(s0.f105811a.b(mz1.e0.class), new g(this), new i(this), new h(null, this));
        this.M0 = true;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new tr2.y(this, 1));
        cVarRegisterForActivityResult.getClass();
        this.R0 = cVarRegisterForActivityResult;
        this.S0 = new d();
    }

    public static final void u6(a aVar, boolean z14, String str) {
        aVar.getClass();
        int i14 = z14 ? R.string.delete_event_question : R.string.remove_from_calendar_question;
        int i15 = z14 ? R.string.lbl_delete : R.string.lbl_remove;
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(aVar.requireContext());
        aVar2.setTitle(i14);
        aVar2.setMessage(str);
        aVar2.setCancelable(false);
        aVar2.setPositiveButton(i15, new dz1.g(aVar, z14));
        aVar2.setNegativeButton(aVar.getString(R.string.lbl_cancel), new qh1.j(27));
        aVar2.create().show();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a v6(a aVar, tn2.s0 s0Var, v13.c cVar) {
        ty1.j jVar;
        aVar.getClass();
        if (cVar instanceof ty1.j) {
            jVar = (ty1.j) cVar;
            int i14 = jVar.f167142c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f167142c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new ty1.j(aVar, cVar);
            }
        } else {
            jVar = new ty1.j(aVar, cVar);
        }
        Object obj = jVar.f167140a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f167142c;
        if (i15 == 0) {
            o13.r.b(obj);
            p2 p2VarY4 = aVar.z6().y4();
            ty1.k kVar = new ty1.k(aVar, s0Var);
            jVar.f167142c = 1;
            if (p2VarY4.collect(kVar, jVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    public final void A6(boolean z14, boolean z15) {
        String strR;
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            if (z14) {
                intent.putExtra("GCM_extra_event_deleted", true);
            } else {
                intent.putExtra("extra_event_unsubscribed", true);
            }
            if (z15) {
                intent.putExtra("extra_linked_training_plan_deleted", true);
            }
            fg0.k kVar = this.K0;
            if (kVar != null) {
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                strR = kVar.r(false);
            } else {
                strR = null;
            }
            intent.putExtra("GCM_extra_event_name", strR);
            Unit unit = Unit.INSTANCE;
            activity.setResult(-1, intent);
        }
        androidx.fragment.app.m activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f45739b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventMainFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.Q0 = arguments != null ? arguments.getBoolean("GCM_extra_show_strategy_tab") : false;
        Bundle arguments2 = getArguments();
        this.N0 = arguments2 != null ? arguments2.getBoolean("GCM_extra_is_find_an_event") : false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new e(), androidx.lifecycle.b0.b.RESUMED);
        ry1.a aVar = this.f45739b;
        if (aVar != null) {
            String string = getString(R.string.lbl_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.S0, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.event_details_scroll_view);
        viewFindViewById.getClass();
        View viewFindViewById2 = view2.findViewById(R.id.event_details_tab_layout);
        viewFindViewById2.getClass();
        this.f45740c = (TabLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.event_details_view_pager);
        viewFindViewById3.getClass();
        this.f45741d = (ViewPager) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.title);
        viewFindViewById4.getClass();
        this.f45742e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.event_distance_primary_event);
        viewFindViewById5.getClass();
        this.f45743f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.count_down);
        viewFindViewById6.getClass();
        this.f45744g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.weather);
        viewFindViewById7.getClass();
        this.f45745h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.weather_avg);
        viewFindViewById8.getClass();
        this.f45746i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.goal_pace_or_speed);
        viewFindViewById9.getClass();
        this.f45747j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.goal_pace_or_speed_type);
        viewFindViewById10.getClass();
        this.f45748k = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.goal_customization);
        viewFindViewById11.getClass();
        this.f45750l = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.goal_customization_type);
        viewFindViewById12.getClass();
        this.f45751m = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.map_container);
        viewFindViewById13.getClass();
        this.f45752n = (FrameLayout) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.map_legend);
        viewFindViewById14.getClass();
        this.f45753o = (LinearLayout) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.legend_bike_line);
        viewFindViewById15.getClass();
        this.f45754p = viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.legend_bike_text);
        viewFindViewById16.getClass();
        this.f45755q = (TextView) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.legend_run_line);
        viewFindViewById17.getClass();
        this.f45756r = viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.legend_run_text);
        viewFindViewById18.getClass();
        this.f45757t = (TextView) viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.textViewCountdown);
        viewFindViewById19.getClass();
        this.f45758v = (TextView) viewFindViewById19;
        View viewFindViewById20 = view2.findViewById(R.id.ll_weather);
        viewFindViewById20.getClass();
        this.f45759w = (LinearLayout) viewFindViewById20;
        View viewFindViewById21 = view2.findViewById(R.id.ll_goal_pace_or_speed);
        viewFindViewById21.getClass();
        this.f45760x = (LinearLayout) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.ll_goal_customization);
        viewFindViewById22.getClass();
        this.f45761y = (LinearLayout) viewFindViewById22;
        View viewFindViewById23 = view2.findViewById(R.id.logo);
        viewFindViewById23.getClass();
        this.f45762z = (ImageView) viewFindViewById23;
        View viewFindViewById24 = view2.findViewById(R.id.shareImg);
        viewFindViewById24.getClass();
        this.A = (ImageView) viewFindViewById24;
        View viewFindViewById25 = view2.findViewById(R.id.save_btn_container);
        viewFindViewById25.getClass();
        this.B = (FrameLayout) viewFindViewById25;
        View viewFindViewById26 = view2.findViewById(R.id.add_to_calendar_button);
        viewFindViewById26.getClass();
        this.C = (AppCompatButton) viewFindViewById26;
        View viewFindViewById27 = view2.findViewById(R.id.view_activity);
        viewFindViewById27.getClass();
        this.D = (TextView) viewFindViewById27;
        View viewFindViewById28 = view2.findViewById(R.id.image_view_weather_icon);
        viewFindViewById28.getClass();
        this.E = (ImageView) viewFindViewById28;
        View viewFindViewById29 = view2.findViewById(R.id.provider_Layout);
        viewFindViewById29.getClass();
        this.F = (LinearLayout) viewFindViewById29;
        View viewFindViewById30 = view2.findViewById(R.id.provider_img);
        viewFindViewById30.getClass();
        this.I = (ImageView) viewFindViewById30;
        View viewFindViewById31 = view2.findViewById(R.id.provider_title);
        viewFindViewById31.getClass();
        this.P = (TextView) viewFindViewById31;
        g22.e.l(this);
        LinearLayout linearLayout = this.f45759w;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("mWeatherView");
            throw null;
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.f45760x;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("mGoalPaceOrSpeedView");
            throw null;
        }
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = this.f45761y;
        if (linearLayout3 == null) {
            p005kotlin.jvm.internal.s.m("mGoalCustomizationView");
            throw null;
        }
        linearLayout3.setVisibility(8);
        ImageView imageView = this.A;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("mShareImageView");
            throw null;
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout4 = this.f45753o;
        if (linearLayout4 == null) {
            p005kotlin.jvm.internal.s.m("mMapLegend");
            throw null;
        }
        linearLayout4.setVisibility(8);
        View view3 = this.f45754p;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mBikeLegendLine");
            throw null;
        }
        view3.setVisibility(8);
        TextView textView = this.f45755q;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mBikeLegendText");
            throw null;
        }
        textView.setVisibility(8);
        View view4 = this.f45756r;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mRunLegendLine");
            throw null;
        }
        view4.setVisibility(8);
        TextView textView2 = this.f45757t;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mRunLegendText");
            throw null;
        }
        textView2.setVisibility(8);
        if (p005kotlin.jvm.internal.s.g(z6().f204393j, Boolean.TRUE) || z6().f204395l) {
            AppCompatButton appCompatButton = this.C;
            if (appCompatButton == null) {
                p005kotlin.jvm.internal.s.m("mAddCalendarButton");
                throw null;
            }
            appCompatButton.setText(getString(R.string.add_to_plan));
            FrameLayout frameLayout = this.B;
            if (frameLayout == null) {
                p005kotlin.jvm.internal.s.m("mSaveButtonView");
                throw null;
            }
            frameLayout.setBackgroundColor(a7.b.getColor(requireContext(), R.color.surface_2));
        }
        if (!this.M0) {
            TabLayout tabLayout = this.f45740c;
            if (tabLayout == null) {
                p005kotlin.jvm.internal.s.m("mTabLayout");
                throw null;
            }
            tabLayout.setVisibility(8);
        }
        ImageView imageView2 = this.f45762z;
        if (imageView2 == null) {
            p005kotlin.jvm.internal.s.m("mProfileImageView");
            throw null;
        }
        final int i14 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167135b;

            {
                this.f167135b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                fg0.p pVar;
                xw1.k kVar;
                String str;
                fg0.j eventCustomization;
                xw1.k kVar2;
                xw1.k kVar3;
                Long associatedWithActivityId;
                String str2;
                gg0.f eventType;
                gg0.f fVarC;
                gg0.f eventType2;
                List<fg0.a0> listS;
                fg0.a0 a0Var;
                Boolean eventOrganizer;
                int i15 = i14;
                Object objValueOf = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar2 = this.f167135b;
                switch (i15) {
                    case 0:
                        String str3 = aVar2.T;
                        if (str3 != null) {
                            String string2 = aVar2.getString(R.string.check_out_my_event);
                            String string3 = aVar2.getString(R.string.beat_yesterday_hashtag);
                            aVar2.z6();
                            String strD = j20.x.d(string2, StringUtils.SPACE, string3, StringUtils.SPACE, e5.g(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).e(), "/modern/event/", str3));
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.addFlags(1);
                            intent.putExtra("android.intent.extra.TEXT", strD);
                            intent.setType("text/plain");
                            Intent intentCreateChooser = Intent.createChooser(intent, null);
                            mz1.e0 e0VarZ6 = aVar2.z6();
                            ge1.b.T(androidx.lifecycle.v1.a(e0VarZ6), null, null, new mz1.g0(e0VarZ6, null), 3);
                            aVar2.startActivity(intentCreateChooser);
                        }
                        break;
                    case 1:
                        aVar2.O0 = true;
                        mz1.e0 e0VarZ7 = aVar2.z6();
                        boolean z14 = aVar2.N0;
                        String str4 = aVar2.T;
                        androidx.lifecycle.y0<w61.f<o13.p<Object, Object>>> y0Var = e0VarZ7.f204406y;
                        fg0.k kVarD = e0VarZ7.l5().d();
                        String str5 = "";
                        if (p005kotlin.jvm.internal.s.g(e0VarZ7.f204393j, Boolean.TRUE)) {
                            fg0.x xVar = e0VarZ7.f204394k;
                            boolean zJ = (xVar == null || (kVar3 = xVar.f71373i) == null) ? false : kVar3.j(kVarD != null ? kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null, kVarD != null ? kVarD.getShareableEventUuid() : null);
                            fg0.x xVar2 = e0VarZ7.f204394k;
                            boolean z15 = (xVar2 == null || (kVar2 = xVar2.f71373i) == null || !kVar2.i()) ? false : true;
                            boolean z16 = kVarD != null && (eventCustomization = kVarD.getEventCustomization()) != null && eventCustomization.y() && (zJ ^ true);
                            boolean z17 = z15 && (zJ ^ true);
                            Context contextC = ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).c();
                            if (z16) {
                                Integer numValueOf = Integer.valueOf(R.string.event_goal_will_update);
                                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                String strR = kVarD.r(false);
                                fg0.x xVar3 = e0VarZ7.f204394k;
                                if (xVar3 != null && (str = xVar3.f71366b) != null) {
                                    str5 = str;
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, contextC.getString(R.string.event_goal_will_update_to_match_plan, strR, str5))));
                            } else if (!z17) {
                                mz1.e0.D5(e0VarZ7, z14, 2);
                            } else {
                                Integer numValueOf2 = Integer.valueOf(R.string.keep_my_event);
                                fg0.x xVar4 = e0VarZ7.f204394k;
                                if (xVar4 != null && (kVar = xVar4.f71373i) != null) {
                                    objValueOf = Boolean.valueOf(kVar.m());
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf2, objValueOf)));
                            }
                        } else if (!e0VarZ7.f204395l) {
                            if (!z14 || (pVar = e0VarZ7.I) == null || pVar.getSig() == null) {
                                if (str4 == null) {
                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.TRAINING_INITIATIVE;
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsFragment", "On Add to calendar clicked no shareableEventUuid is found");
                                } else {
                                    e0VarZ7.S0 = false;
                                    ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                                }
                            } else if (!e0VarZ7.z5()) {
                                fg0.p pVar2 = e0VarZ7.I;
                                pVar2.getClass();
                                fg0.p pVar3 = e0VarZ7.I;
                                String sig = pVar3 != null ? pVar3.getSig() : null;
                                sig.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar2, sig, null), 3);
                            } else if (str4 != null) {
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                            } else {
                                fg0.p pVar4 = e0VarZ7.I;
                                pVar4.getClass();
                                fg0.p pVar5 = e0VarZ7.I;
                                String sig2 = pVar5 != null ? pVar5.getSig() : null;
                                sig2.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar4, sig2, null), 3);
                            }
                        } else if (!p005kotlin.jvm.internal.s.g(kVarD != null ? kVarD.getProvider() : null, "gc-discoverable-events")) {
                            fg0.u uVar = e0VarZ7.f204397n;
                            if (uVar != null && uVar.f71350b) {
                                y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.set_as_primary), "")));
                            } else {
                                e0VarZ7.F5(z14);
                            }
                        } else {
                            y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.user_created_event), "")));
                        }
                        break;
                    case 2:
                        fg0.k kVar4 = aVar2.K0;
                        fg0.j eventCustomization2 = kVar4 != null ? kVar4.getEventCustomization() : null;
                        if (eventCustomization2 != null && (associatedWithActivityId = eventCustomization2.getAssociatedWithActivityId()) != null) {
                            long jLongValue = associatedWithActivityId.longValue();
                            fg0.k kVar5 = aVar2.K0;
                            if (kVar5 == null || (eventType2 = kVar5.getEventType()) == null || (str2 = eventType2.f77147a) == null) {
                                fg0.k kVar6 = aVar2.K0;
                                str2 = (kVar6 == null || (eventType = kVar6.getEventType()) == null || (fVarC = eventType.c()) == null) ? am.x0.f4346x.f4358a : fVarC.f77147a;
                            }
                            String str6 = str2;
                            Context context = aVar2.getContext();
                            if (context == null) {
                                g22.e.a(aVar2, null);
                            } else {
                                ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).x(context, aVar2.R0, jLongValue, str6, am.h.VIEW_EDIT);
                            }
                            break;
                        }
                        break;
                    default:
                        fg0.k kVar7 = aVar2.K0;
                        if (kVar7 != null && (listS = kVar7.s()) != null && (a0Var = (fg0.a0) p13.h0.d0(listS)) != null && a0Var.getUrl() != null && (eventOrganizer = kVar7.getEventOrganizer()) != null && !eventOrganizer.booleanValue()) {
                            ca1.d.a aVar3 = ca1.d.f26580m;
                            androidx.fragment.app.m activity = aVar2.getActivity();
                            aVar3.getClass();
                            ca1.d dVarA = ca1.d.a.a(activity);
                            if (dVarA != null) {
                                dVarA.show(aVar2.requireActivity().getSupportFragmentManager(), "reportImage");
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = this.A;
        if (imageView3 == null) {
            p005kotlin.jvm.internal.s.m("mShareImageView");
            throw null;
        }
        final int i15 = 0;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167135b;

            {
                this.f167135b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                fg0.p pVar;
                xw1.k kVar;
                String str;
                fg0.j eventCustomization;
                xw1.k kVar2;
                xw1.k kVar3;
                Long associatedWithActivityId;
                String str2;
                gg0.f eventType;
                gg0.f fVarC;
                gg0.f eventType2;
                List<fg0.a0> listS;
                fg0.a0 a0Var;
                Boolean eventOrganizer;
                int i16 = i15;
                Object objValueOf = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar2 = this.f167135b;
                switch (i16) {
                    case 0:
                        String str3 = aVar2.T;
                        if (str3 != null) {
                            String string2 = aVar2.getString(R.string.check_out_my_event);
                            String string3 = aVar2.getString(R.string.beat_yesterday_hashtag);
                            aVar2.z6();
                            String strD = j20.x.d(string2, StringUtils.SPACE, string3, StringUtils.SPACE, e5.g(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).e(), "/modern/event/", str3));
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.addFlags(1);
                            intent.putExtra("android.intent.extra.TEXT", strD);
                            intent.setType("text/plain");
                            Intent intentCreateChooser = Intent.createChooser(intent, null);
                            mz1.e0 e0VarZ6 = aVar2.z6();
                            ge1.b.T(androidx.lifecycle.v1.a(e0VarZ6), null, null, new mz1.g0(e0VarZ6, null), 3);
                            aVar2.startActivity(intentCreateChooser);
                        }
                        break;
                    case 1:
                        aVar2.O0 = true;
                        mz1.e0 e0VarZ7 = aVar2.z6();
                        boolean z14 = aVar2.N0;
                        String str4 = aVar2.T;
                        androidx.lifecycle.y0<w61.f<o13.p<Object, Object>>> y0Var = e0VarZ7.f204406y;
                        fg0.k kVarD = e0VarZ7.l5().d();
                        String str5 = "";
                        if (p005kotlin.jvm.internal.s.g(e0VarZ7.f204393j, Boolean.TRUE)) {
                            fg0.x xVar = e0VarZ7.f204394k;
                            boolean zJ = (xVar == null || (kVar3 = xVar.f71373i) == null) ? false : kVar3.j(kVarD != null ? kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null, kVarD != null ? kVarD.getShareableEventUuid() : null);
                            fg0.x xVar2 = e0VarZ7.f204394k;
                            boolean z15 = (xVar2 == null || (kVar2 = xVar2.f71373i) == null || !kVar2.i()) ? false : true;
                            boolean z16 = kVarD != null && (eventCustomization = kVarD.getEventCustomization()) != null && eventCustomization.y() && (zJ ^ true);
                            boolean z17 = z15 && (zJ ^ true);
                            Context contextC = ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).c();
                            if (z16) {
                                Integer numValueOf = Integer.valueOf(R.string.event_goal_will_update);
                                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                String strR = kVarD.r(false);
                                fg0.x xVar3 = e0VarZ7.f204394k;
                                if (xVar3 != null && (str = xVar3.f71366b) != null) {
                                    str5 = str;
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, contextC.getString(R.string.event_goal_will_update_to_match_plan, strR, str5))));
                            } else if (!z17) {
                                mz1.e0.D5(e0VarZ7, z14, 2);
                            } else {
                                Integer numValueOf2 = Integer.valueOf(R.string.keep_my_event);
                                fg0.x xVar4 = e0VarZ7.f204394k;
                                if (xVar4 != null && (kVar = xVar4.f71373i) != null) {
                                    objValueOf = Boolean.valueOf(kVar.m());
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf2, objValueOf)));
                            }
                        } else if (!e0VarZ7.f204395l) {
                            if (!z14 || (pVar = e0VarZ7.I) == null || pVar.getSig() == null) {
                                if (str4 == null) {
                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.TRAINING_INITIATIVE;
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsFragment", "On Add to calendar clicked no shareableEventUuid is found");
                                } else {
                                    e0VarZ7.S0 = false;
                                    ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                                }
                            } else if (!e0VarZ7.z5()) {
                                fg0.p pVar2 = e0VarZ7.I;
                                pVar2.getClass();
                                fg0.p pVar3 = e0VarZ7.I;
                                String sig = pVar3 != null ? pVar3.getSig() : null;
                                sig.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar2, sig, null), 3);
                            } else if (str4 != null) {
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                            } else {
                                fg0.p pVar4 = e0VarZ7.I;
                                pVar4.getClass();
                                fg0.p pVar5 = e0VarZ7.I;
                                String sig2 = pVar5 != null ? pVar5.getSig() : null;
                                sig2.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar4, sig2, null), 3);
                            }
                        } else if (!p005kotlin.jvm.internal.s.g(kVarD != null ? kVarD.getProvider() : null, "gc-discoverable-events")) {
                            fg0.u uVar = e0VarZ7.f204397n;
                            if (uVar != null && uVar.f71350b) {
                                y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.set_as_primary), "")));
                            } else {
                                e0VarZ7.F5(z14);
                            }
                        } else {
                            y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.user_created_event), "")));
                        }
                        break;
                    case 2:
                        fg0.k kVar4 = aVar2.K0;
                        fg0.j eventCustomization2 = kVar4 != null ? kVar4.getEventCustomization() : null;
                        if (eventCustomization2 != null && (associatedWithActivityId = eventCustomization2.getAssociatedWithActivityId()) != null) {
                            long jLongValue = associatedWithActivityId.longValue();
                            fg0.k kVar5 = aVar2.K0;
                            if (kVar5 == null || (eventType2 = kVar5.getEventType()) == null || (str2 = eventType2.f77147a) == null) {
                                fg0.k kVar6 = aVar2.K0;
                                str2 = (kVar6 == null || (eventType = kVar6.getEventType()) == null || (fVarC = eventType.c()) == null) ? am.x0.f4346x.f4358a : fVarC.f77147a;
                            }
                            String str6 = str2;
                            Context context = aVar2.getContext();
                            if (context == null) {
                                g22.e.a(aVar2, null);
                            } else {
                                ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).x(context, aVar2.R0, jLongValue, str6, am.h.VIEW_EDIT);
                            }
                            break;
                        }
                        break;
                    default:
                        fg0.k kVar7 = aVar2.K0;
                        if (kVar7 != null && (listS = kVar7.s()) != null && (a0Var = (fg0.a0) p13.h0.d0(listS)) != null && a0Var.getUrl() != null && (eventOrganizer = kVar7.getEventOrganizer()) != null && !eventOrganizer.booleanValue()) {
                            ca1.d.a aVar3 = ca1.d.f26580m;
                            androidx.fragment.app.m activity = aVar2.getActivity();
                            aVar3.getClass();
                            ca1.d dVarA = ca1.d.a.a(activity);
                            if (dVarA != null) {
                                dVarA.show(aVar2.requireActivity().getSupportFragmentManager(), "reportImage");
                            }
                            break;
                        }
                        break;
                }
            }
        });
        AppCompatButton appCompatButton2 = this.C;
        if (appCompatButton2 == null) {
            p005kotlin.jvm.internal.s.m("mAddCalendarButton");
            throw null;
        }
        final int i16 = 1;
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167135b;

            {
                this.f167135b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                fg0.p pVar;
                xw1.k kVar;
                String str;
                fg0.j eventCustomization;
                xw1.k kVar2;
                xw1.k kVar3;
                Long associatedWithActivityId;
                String str2;
                gg0.f eventType;
                gg0.f fVarC;
                gg0.f eventType2;
                List<fg0.a0> listS;
                fg0.a0 a0Var;
                Boolean eventOrganizer;
                int i17 = i16;
                Object objValueOf = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar2 = this.f167135b;
                switch (i17) {
                    case 0:
                        String str3 = aVar2.T;
                        if (str3 != null) {
                            String string2 = aVar2.getString(R.string.check_out_my_event);
                            String string3 = aVar2.getString(R.string.beat_yesterday_hashtag);
                            aVar2.z6();
                            String strD = j20.x.d(string2, StringUtils.SPACE, string3, StringUtils.SPACE, e5.g(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).e(), "/modern/event/", str3));
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.addFlags(1);
                            intent.putExtra("android.intent.extra.TEXT", strD);
                            intent.setType("text/plain");
                            Intent intentCreateChooser = Intent.createChooser(intent, null);
                            mz1.e0 e0VarZ6 = aVar2.z6();
                            ge1.b.T(androidx.lifecycle.v1.a(e0VarZ6), null, null, new mz1.g0(e0VarZ6, null), 3);
                            aVar2.startActivity(intentCreateChooser);
                        }
                        break;
                    case 1:
                        aVar2.O0 = true;
                        mz1.e0 e0VarZ7 = aVar2.z6();
                        boolean z14 = aVar2.N0;
                        String str4 = aVar2.T;
                        androidx.lifecycle.y0<w61.f<o13.p<Object, Object>>> y0Var = e0VarZ7.f204406y;
                        fg0.k kVarD = e0VarZ7.l5().d();
                        String str5 = "";
                        if (p005kotlin.jvm.internal.s.g(e0VarZ7.f204393j, Boolean.TRUE)) {
                            fg0.x xVar = e0VarZ7.f204394k;
                            boolean zJ = (xVar == null || (kVar3 = xVar.f71373i) == null) ? false : kVar3.j(kVarD != null ? kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null, kVarD != null ? kVarD.getShareableEventUuid() : null);
                            fg0.x xVar2 = e0VarZ7.f204394k;
                            boolean z15 = (xVar2 == null || (kVar2 = xVar2.f71373i) == null || !kVar2.i()) ? false : true;
                            boolean z16 = kVarD != null && (eventCustomization = kVarD.getEventCustomization()) != null && eventCustomization.y() && (zJ ^ true);
                            boolean z17 = z15 && (zJ ^ true);
                            Context contextC = ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).c();
                            if (z16) {
                                Integer numValueOf = Integer.valueOf(R.string.event_goal_will_update);
                                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                String strR = kVarD.r(false);
                                fg0.x xVar3 = e0VarZ7.f204394k;
                                if (xVar3 != null && (str = xVar3.f71366b) != null) {
                                    str5 = str;
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, contextC.getString(R.string.event_goal_will_update_to_match_plan, strR, str5))));
                            } else if (!z17) {
                                mz1.e0.D5(e0VarZ7, z14, 2);
                            } else {
                                Integer numValueOf2 = Integer.valueOf(R.string.keep_my_event);
                                fg0.x xVar4 = e0VarZ7.f204394k;
                                if (xVar4 != null && (kVar = xVar4.f71373i) != null) {
                                    objValueOf = Boolean.valueOf(kVar.m());
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf2, objValueOf)));
                            }
                        } else if (!e0VarZ7.f204395l) {
                            if (!z14 || (pVar = e0VarZ7.I) == null || pVar.getSig() == null) {
                                if (str4 == null) {
                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.TRAINING_INITIATIVE;
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsFragment", "On Add to calendar clicked no shareableEventUuid is found");
                                } else {
                                    e0VarZ7.S0 = false;
                                    ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                                }
                            } else if (!e0VarZ7.z5()) {
                                fg0.p pVar2 = e0VarZ7.I;
                                pVar2.getClass();
                                fg0.p pVar3 = e0VarZ7.I;
                                String sig = pVar3 != null ? pVar3.getSig() : null;
                                sig.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar2, sig, null), 3);
                            } else if (str4 != null) {
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                            } else {
                                fg0.p pVar4 = e0VarZ7.I;
                                pVar4.getClass();
                                fg0.p pVar5 = e0VarZ7.I;
                                String sig2 = pVar5 != null ? pVar5.getSig() : null;
                                sig2.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar4, sig2, null), 3);
                            }
                        } else if (!p005kotlin.jvm.internal.s.g(kVarD != null ? kVarD.getProvider() : null, "gc-discoverable-events")) {
                            fg0.u uVar = e0VarZ7.f204397n;
                            if (uVar != null && uVar.f71350b) {
                                y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.set_as_primary), "")));
                            } else {
                                e0VarZ7.F5(z14);
                            }
                        } else {
                            y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.user_created_event), "")));
                        }
                        break;
                    case 2:
                        fg0.k kVar4 = aVar2.K0;
                        fg0.j eventCustomization2 = kVar4 != null ? kVar4.getEventCustomization() : null;
                        if (eventCustomization2 != null && (associatedWithActivityId = eventCustomization2.getAssociatedWithActivityId()) != null) {
                            long jLongValue = associatedWithActivityId.longValue();
                            fg0.k kVar5 = aVar2.K0;
                            if (kVar5 == null || (eventType2 = kVar5.getEventType()) == null || (str2 = eventType2.f77147a) == null) {
                                fg0.k kVar6 = aVar2.K0;
                                str2 = (kVar6 == null || (eventType = kVar6.getEventType()) == null || (fVarC = eventType.c()) == null) ? am.x0.f4346x.f4358a : fVarC.f77147a;
                            }
                            String str6 = str2;
                            Context context = aVar2.getContext();
                            if (context == null) {
                                g22.e.a(aVar2, null);
                            } else {
                                ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).x(context, aVar2.R0, jLongValue, str6, am.h.VIEW_EDIT);
                            }
                            break;
                        }
                        break;
                    default:
                        fg0.k kVar7 = aVar2.K0;
                        if (kVar7 != null && (listS = kVar7.s()) != null && (a0Var = (fg0.a0) p13.h0.d0(listS)) != null && a0Var.getUrl() != null && (eventOrganizer = kVar7.getEventOrganizer()) != null && !eventOrganizer.booleanValue()) {
                            ca1.d.a aVar3 = ca1.d.f26580m;
                            androidx.fragment.app.m activity = aVar2.getActivity();
                            aVar3.getClass();
                            ca1.d dVarA = ca1.d.a.a(activity);
                            if (dVarA != null) {
                                dVarA.show(aVar2.requireActivity().getSupportFragmentManager(), "reportImage");
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ((androidx.lifecycle.s0) z6().f121695p1.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 1)));
        ((androidx.lifecycle.s0) z6().f121697r1.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 2)));
        ((androidx.lifecycle.s0) z6().f121699t1.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 3)));
        z6().k5().f(getViewLifecycleOwner(), new f(new ty1.h(this, 4)));
        ((androidx.lifecycle.s0) z6().F1.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 5)));
        ((androidx.lifecycle.s0) z6().R0.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 6)));
        ((androidx.lifecycle.s0) z6().M0.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 7)));
        ((androidx.lifecycle.s0) z6().f204403v.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 14)));
        z6().f121702w1.f(getViewLifecycleOwner(), new f(new ty1.h(this, 15)));
        z6().f204407z.f(getViewLifecycleOwner(), new f(new ty1.h(this, 16)));
        ((androidx.lifecycle.s0) z6().f121704y1.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 0)));
        TextView textView3 = this.D;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("mViewActivity");
            throw null;
        }
        final int i17 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167135b;

            {
                this.f167135b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                fg0.p pVar;
                xw1.k kVar;
                String str;
                fg0.j eventCustomization;
                xw1.k kVar2;
                xw1.k kVar3;
                Long associatedWithActivityId;
                String str2;
                gg0.f eventType;
                gg0.f fVarC;
                gg0.f eventType2;
                List<fg0.a0> listS;
                fg0.a0 a0Var;
                Boolean eventOrganizer;
                int i18 = i17;
                Object objValueOf = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar2 = this.f167135b;
                switch (i18) {
                    case 0:
                        String str3 = aVar2.T;
                        if (str3 != null) {
                            String string2 = aVar2.getString(R.string.check_out_my_event);
                            String string3 = aVar2.getString(R.string.beat_yesterday_hashtag);
                            aVar2.z6();
                            String strD = j20.x.d(string2, StringUtils.SPACE, string3, StringUtils.SPACE, e5.g(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).e(), "/modern/event/", str3));
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.addFlags(1);
                            intent.putExtra("android.intent.extra.TEXT", strD);
                            intent.setType("text/plain");
                            Intent intentCreateChooser = Intent.createChooser(intent, null);
                            mz1.e0 e0VarZ6 = aVar2.z6();
                            ge1.b.T(androidx.lifecycle.v1.a(e0VarZ6), null, null, new mz1.g0(e0VarZ6, null), 3);
                            aVar2.startActivity(intentCreateChooser);
                        }
                        break;
                    case 1:
                        aVar2.O0 = true;
                        mz1.e0 e0VarZ7 = aVar2.z6();
                        boolean z14 = aVar2.N0;
                        String str4 = aVar2.T;
                        androidx.lifecycle.y0<w61.f<o13.p<Object, Object>>> y0Var = e0VarZ7.f204406y;
                        fg0.k kVarD = e0VarZ7.l5().d();
                        String str5 = "";
                        if (p005kotlin.jvm.internal.s.g(e0VarZ7.f204393j, Boolean.TRUE)) {
                            fg0.x xVar = e0VarZ7.f204394k;
                            boolean zJ = (xVar == null || (kVar3 = xVar.f71373i) == null) ? false : kVar3.j(kVarD != null ? kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null, kVarD != null ? kVarD.getShareableEventUuid() : null);
                            fg0.x xVar2 = e0VarZ7.f204394k;
                            boolean z15 = (xVar2 == null || (kVar2 = xVar2.f71373i) == null || !kVar2.i()) ? false : true;
                            boolean z16 = kVarD != null && (eventCustomization = kVarD.getEventCustomization()) != null && eventCustomization.y() && (zJ ^ true);
                            boolean z17 = z15 && (zJ ^ true);
                            Context contextC = ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).c();
                            if (z16) {
                                Integer numValueOf = Integer.valueOf(R.string.event_goal_will_update);
                                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                                String strR = kVarD.r(false);
                                fg0.x xVar3 = e0VarZ7.f204394k;
                                if (xVar3 != null && (str = xVar3.f71366b) != null) {
                                    str5 = str;
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf, contextC.getString(R.string.event_goal_will_update_to_match_plan, strR, str5))));
                            } else if (!z17) {
                                mz1.e0.D5(e0VarZ7, z14, 2);
                            } else {
                                Integer numValueOf2 = Integer.valueOf(R.string.keep_my_event);
                                fg0.x xVar4 = e0VarZ7.f204394k;
                                if (xVar4 != null && (kVar = xVar4.f71373i) != null) {
                                    objValueOf = Boolean.valueOf(kVar.m());
                                }
                                y0Var.m(new w61.f<>(new o13.p(numValueOf2, objValueOf)));
                            }
                        } else if (!e0VarZ7.f204395l) {
                            if (!z14 || (pVar = e0VarZ7.I) == null || pVar.getSig() == null) {
                                if (str4 == null) {
                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.TRAINING_INITIATIVE;
                                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventDetailsFragment", "On Add to calendar clicked no shareableEventUuid is found");
                                } else {
                                    e0VarZ7.S0 = false;
                                    ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                                }
                            } else if (!e0VarZ7.z5()) {
                                fg0.p pVar2 = e0VarZ7.I;
                                pVar2.getClass();
                                fg0.p pVar3 = e0VarZ7.I;
                                String sig = pVar3 != null ? pVar3.getSig() : null;
                                sig.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar2, sig, null), 3);
                            } else if (str4 != null) {
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.f1(e0VarZ7, str4, null), 3);
                            } else {
                                fg0.p pVar4 = e0VarZ7.I;
                                pVar4.getClass();
                                fg0.p pVar5 = e0VarZ7.I;
                                String sig2 = pVar5 != null ? pVar5.getSig() : null;
                                sig2.getClass();
                                e0VarZ7.S0 = false;
                                ge1.b.T(androidx.lifecycle.v1.a(e0VarZ7), null, null, new mz1.c1(e0VarZ7, pVar4, sig2, null), 3);
                            }
                        } else if (!p005kotlin.jvm.internal.s.g(kVarD != null ? kVarD.getProvider() : null, "gc-discoverable-events")) {
                            fg0.u uVar = e0VarZ7.f204397n;
                            if (uVar != null && uVar.f71350b) {
                                y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.set_as_primary), "")));
                            } else {
                                e0VarZ7.F5(z14);
                            }
                        } else {
                            y0Var.m(new w61.f<>(new o13.p(Integer.valueOf(R.string.user_created_event), "")));
                        }
                        break;
                    case 2:
                        fg0.k kVar4 = aVar2.K0;
                        fg0.j eventCustomization2 = kVar4 != null ? kVar4.getEventCustomization() : null;
                        if (eventCustomization2 != null && (associatedWithActivityId = eventCustomization2.getAssociatedWithActivityId()) != null) {
                            long jLongValue = associatedWithActivityId.longValue();
                            fg0.k kVar5 = aVar2.K0;
                            if (kVar5 == null || (eventType2 = kVar5.getEventType()) == null || (str2 = eventType2.f77147a) == null) {
                                fg0.k kVar6 = aVar2.K0;
                                str2 = (kVar6 == null || (eventType = kVar6.getEventType()) == null || (fVarC = eventType.c()) == null) ? am.x0.f4346x.f4358a : fVarC.f77147a;
                            }
                            String str6 = str2;
                            Context context = aVar2.getContext();
                            if (context == null) {
                                g22.e.a(aVar2, null);
                            } else {
                                ((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).x(context, aVar2.R0, jLongValue, str6, am.h.VIEW_EDIT);
                            }
                            break;
                        }
                        break;
                    default:
                        fg0.k kVar7 = aVar2.K0;
                        if (kVar7 != null && (listS = kVar7.s()) != null && (a0Var = (fg0.a0) p13.h0.d0(listS)) != null && a0Var.getUrl() != null && (eventOrganizer = kVar7.getEventOrganizer()) != null && !eventOrganizer.booleanValue()) {
                            ca1.d.a aVar3 = ca1.d.f26580m;
                            androidx.fragment.app.m activity = aVar2.getActivity();
                            aVar3.getClass();
                            ca1.d dVarA = ca1.d.a.a(activity);
                            if (dVarA != null) {
                                dVarA.show(aVar2.requireActivity().getSupportFragmentManager(), "reportImage");
                            }
                            break;
                        }
                        break;
                }
            }
        });
        com.garmin.android.apps.connectmobile.traininginitiative.ui.b bVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.b();
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
        aVar2.l(R.id.map_container, bVar, null);
        aVar2.e();
        ((androidx.lifecycle.s0) z6().B.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 8)));
        ((androidx.lifecycle.s0) z6().f204405x.getValue()).f(getViewLifecycleOwner(), new f(new ty1.h(this, 12)));
        z6().D1.f(getViewLifecycleOwner(), new f(new ty1.h(this, 13)));
    }

    public final void w6(String str, fg0.k kVar) {
        gg0.j verifiedStatus;
        List<String> listG0;
        fg0.n nVarA4 = z6().A4(str);
        if (nVarA4 == null || (verifiedStatus = nVarA4.getVerifiedStatus()) == null) {
            return;
        }
        if (kVar != null && (listG0 = kVar.g0()) != null && listG0.contains("OFFICIAL")) {
            LinearLayout linearLayout = this.F;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("mProviderLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            ImageView imageView = this.I;
            if (imageView == null) {
                p005kotlin.jvm.internal.s.m("mProviderImage");
                throw null;
            }
            imageView.setVisibility(0);
            TextView textView = this.P;
            if (textView != null) {
                textView.setText(requireContext().getString(R.string.official_event));
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mProviderTitle");
                throw null;
            }
        }
        if (gg0.j.VERIFIED == verifiedStatus) {
            LinearLayout linearLayout2 = this.F;
            if (linearLayout2 == null) {
                p005kotlin.jvm.internal.s.m("mProviderLayout");
                throw null;
            }
            linearLayout2.setVisibility(0);
            ImageView imageView2 = this.I;
            if (imageView2 == null) {
                p005kotlin.jvm.internal.s.m("mProviderImage");
                throw null;
            }
            imageView2.setVisibility(8);
            TextView textView2 = this.P;
            if (textView2 != null) {
                textView2.setText(requireContext().getString(verifiedStatus.f77180a));
            } else {
                p005kotlin.jvm.internal.s.m("mProviderTitle");
                throw null;
            }
        }
    }

    public final void y6(h42.a aVar, boolean z14) {
        LocalDate date;
        boolean zG;
        String string;
        fg0.r eventTimeLocal;
        DateTime dateTimeP;
        fg0.k kVar = this.K0;
        if (kVar != null && (date = kVar.getDate()) != null) {
            fg0.k kVar2 = this.K0;
            if (kVar2 != null) {
                LocalDate date2 = kVar2.getDate();
                fg0.r eventTimeLocal2 = kVar2.getEventTimeLocal();
                LocalTime localTimeF = eventTimeLocal2 != null ? eventTimeLocal2.f() : null;
                if (date2 == null || localTimeF == null) {
                    dateTimeP = null;
                } else {
                    og0.a aVar2 = og0.a.f131967a;
                    fg0.r eventTimeLocal3 = kVar2.getEventTimeLocal();
                    String timeZoneId = eventTimeLocal3 != null ? eventTimeLocal3.getTimeZoneId() : null;
                    aVar2.getClass();
                    dateTimeP = og0.a.p(date2, localTimeF, timeZoneId);
                }
                zG = p005kotlin.jvm.internal.s.g(dateTimeP != null ? Boolean.valueOf(dateTimeP.isBefore(DateTime.now())) : null, Boolean.TRUE);
            } else {
                zG = false;
            }
            if (zG) {
                TextView textView = this.f45746i;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("mWeatherAvg");
                    throw null;
                }
                textView.setText(getString(R.string.weather_options_title));
            } else {
                j0 j0Var = j0.f23099a;
                fg0.k kVar3 = this.K0;
                String startTimeHhMm = (kVar3 == null || (eventTimeLocal = kVar3.getEventTimeLocal()) == null) ? null : eventTimeLocal.getStartTimeHhMm();
                j0Var.getClass();
                String strI = j0.i(startTimeHhMm);
                String string2 = getString(R.string.lbl_average);
                string2.getClass();
                String string3 = getString(R.string.common_avg);
                string3.getClass();
                if (date.isAfter(LocalDate.now().plusDays(13))) {
                    string = string3;
                } else if (z14) {
                    string = getString(R.string.weather_channel_name);
                    string.getClass();
                } else {
                    string = getString(R.string.weather_forecast_label);
                    string.getClass();
                }
                TextView textView2 = this.f45746i;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("mWeatherAvg");
                    throw null;
                }
                textView2.setText(strI + StringUtils.SPACE + string);
                if (string.equals(string3)) {
                    TextView textView3 = this.f45746i;
                    if (textView3 == null) {
                        p005kotlin.jvm.internal.s.m("mWeatherAvg");
                        throw null;
                    }
                    textView3.setContentDescription(strI + StringUtils.SPACE + string2);
                }
            }
        }
        TextView textView4 = this.f45745h;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("mWeather");
            throw null;
        }
        l3.a aVar3 = l3.f23124b;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        l22.a aVar4 = new l22.a(contextRequireContext);
        Double temperature = aVar.getTemperature();
        double dDoubleValue = temperature != null ? temperature.doubleValue() : 0.0d;
        og0.a.f131967a.getClass();
        boolean zB = og0.a.B();
        aVar3.getClass();
        textView4.setText(l3.a.V0(aVar4, dDoubleValue, zB));
        LinearLayout linearLayout = this.f45759w;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("mWeatherView");
            throw null;
        }
        linearLayout.setVisibility(0);
        Integer iconId = aVar.getIconId();
        if (iconId != null) {
            int iIntValue = iconId.intValue();
            ImageView imageView = this.E;
            if (imageView == null) {
                p005kotlin.jvm.internal.s.m("mImageViewWeatherIcon");
                throw null;
            }
            imageView.setVisibility(0);
            ImageView imageView2 = this.E;
            if (imageView2 != null) {
                imageView2.setImageResource(iIntValue);
            } else {
                p005kotlin.jvm.internal.s.m("mImageViewWeatherIcon");
                throw null;
            }
        }
    }

    public final mz1.e0 z6() {
        return (mz1.e0) this.f45738a.getValue();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INT_FORECAST_DAYS", "I", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0883a {
        public /* synthetic */ C0883a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0883a() {
        }
    }
}
