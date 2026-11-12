package com.garmin.android.apps.connectmobile.strava;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import c22.q0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import gg1.v0;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import z10.b3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/m;", "Lz10/b3;", "<init>", "()V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends b3 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f45000y = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fr1.h f45001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<String> f45002o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f45004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GCMComplexOneLineButton f45005r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexOneLineButton f45006t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f45007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f45008w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f45003p = new ArrayList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f45009x = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/strava/m$b", "Lcom/garmin/android/apps/connectmobile/strava/j$a;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements j.a {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.strava.j.a
        public final void onSuccess() {
            m mVar = m.this;
            if (mVar.isAdded()) {
                GCMComplexOneLineButton gCMComplexOneLineButton = mVar.f45005r;
                if (gCMComplexOneLineButton == null) {
                    s.m("courseImportBtn");
                    throw null;
                }
                gCMComplexOneLineButton.i(mVar.f45003p.contains("COURSE_IMPORT"));
                GCMComplexOneLineButton gCMComplexOneLineButton2 = mVar.f45006t;
                if (gCMComplexOneLineButton2 == null) {
                    s.m("workoutImportBtn");
                    throw null;
                }
                gCMComplexOneLineButton2.i(mVar.f45003p.contains("WORKOUT_IMPORT"));
                GCMComplexOneLineButton gCMComplexOneLineButton3 = mVar.f45007v;
                if (gCMComplexOneLineButton3 != null) {
                    gCMComplexOneLineButton3.i(mVar.f45003p.contains("ACTIVITY_EXPORT"));
                } else {
                    s.m("activityExportBtn");
                    throw null;
                }
            }
        }
    }

    @Override // z10.b3, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        StravaStatusDTO.c cVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("CONNECTED_STATUS", fr1.h.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("CONNECTED_STATUS");
                if (!(parcelable2 instanceof fr1.h)) {
                    parcelable2 = null;
                }
                parcelable = (fr1.h) parcelable2;
            }
            fr1.h hVar = (fr1.h) parcelable;
            this.f45001n = hVar;
            if (hVar != null) {
                StravaStatusDTO stravaStatusDTO = hVar.f73307b;
                if (stravaStatusDTO == null || (cVar = stravaStatusDTO.f41333e) == null) {
                    cVar = StravaStatusDTO.c.OPT_IN;
                }
                ((fr1.i) KoinJavaComponent.get$default(fr1.i.class, null, null, 6, null)).a(cVar == StravaStatusDTO.c.OPT_IN ? zf1.a.STRAVA : zf1.a.GARMIN);
            }
            this.f45002o = arguments.getStringArrayList("CAPABILITY_LIST");
            ArrayList<String> stringArrayList = arguments.getStringArrayList("PERMISSION_LIST");
            if (stringArrayList != null) {
                this.f45003p = stringArrayList;
            }
            this.f45004q = arguments.getString("STRAVA_CONSUMER_KEY");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        j jVar = this.f45008w;
        if (jVar != null) {
            jVar.f142199a.c(null);
        }
    }

    @Override // z10.b3
    public final int v6() {
        return R.layout.third_party_strava_details;
    }

    @Override // z10.b3
    public final void w6(View view2) throws Throwable {
        int i14;
        StravaSegmentStatusDTO stravaSegmentStatusDTO;
        View viewFindViewById = view2.findViewById(R.id.strava_header_message);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.strava_connect_container);
        viewFindViewById2.getClass();
        fr1.j jVar = new fr1.j(view2.findViewById(R.id.strava_live_segments_container));
        fr1.j jVar2 = new fr1.j(view2.findViewById(R.id.strava_beacon_container));
        View viewFindViewById3 = view2.findViewById(R.id.strava_imports_container);
        View viewFindViewById4 = view2.findViewById(R.id.strava_activities_container);
        View viewFindViewById5 = viewFindViewById3.findViewById(R.id.course_sharing_btn);
        viewFindViewById5.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById5;
        this.f45005r = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnSwitchClickListener(new bv2.j(gCMComplexOneLineButton, 4, this, "COURSE_IMPORT"));
        View viewFindViewById6 = viewFindViewById3.findViewById(R.id.workout_sharing_btn);
        viewFindViewById6.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewFindViewById6;
        this.f45006t = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnSwitchClickListener(new bv2.j(gCMComplexOneLineButton2, 4, this, "WORKOUT_IMPORT"));
        View viewFindViewById7 = viewFindViewById4.findViewById(R.id.activities_btn);
        viewFindViewById7.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) viewFindViewById7;
        this.f45007v = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setOnSwitchClickListener(new bv2.j(gCMComplexOneLineButton3, 4, this, "ACTIVITY_EXPORT"));
        Throwable th3 = null;
        if (this.f200901c) {
            fr1.h hVar = this.f45001n;
            StravaStatusDTO stravaStatusDTO = hVar != null ? hVar.f73307b : null;
            boolean z14 = stravaStatusDTO != null ? stravaStatusDTO.f41332d : false;
            textView.setText(R.string.strava_you_are_connected);
            textView.setGravity(1);
            fr1.j jVar3 = new fr1.j(viewFindViewById2);
            String string = getString(R.string.strava_share_garmin_activities_automatically_info);
            string.getClass();
            jVar3.a(2131231879, string);
            fr1.h hVar2 = this.f45001n;
            if (hVar2 == null || (stravaSegmentStatusDTO = hVar2.f73306a) == null || !stravaSegmentStatusDTO.f44977b || !z14) {
                th3 = null;
                String string2 = getString(R.string.strava_upgrade_to_segment_compatible_msg);
                string2.getClass();
                jVar.a(2131231880, string2);
                String string3 = getString(R.string.strava_shop_segment_compatible_device_title);
                string3.getClass();
                final int i15 = 2;
                fr1.j.c(jVar.f73311d, string3, new View.OnClickListener(this) { // from class: fr1.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.strava.m f73303b;

                    {
                        this.f73303b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        PackageManager packageManager;
                        int i16 = i15;
                        Intent launchIntentForPackage = null;
                        com.garmin.android.apps.connectmobile.strava.m mVar = this.f73303b;
                        switch (i16) {
                            case 0:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                try {
                                    mVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("strava://beacon/settings")));
                                    break;
                                } catch (ActivityNotFoundException unused) {
                                    androidx.fragment.app.m activity = mVar.getActivity();
                                    if (activity != null && (packageManager = activity.getPackageManager()) != null) {
                                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(hb2.g.a.STRAVA.f82804a);
                                    }
                                    if (launchIntentForPackage != null) {
                                        mVar.startActivity(launchIntentForPackage);
                                        return;
                                    }
                                    try {
                                        q0.a aVar2 = q0.f23203a;
                                        String str = hb2.g.a.STRAVA.f82804a;
                                        str.getClass();
                                        Context contextRequireContext = mVar.requireContext();
                                        contextRequireContext.getClass();
                                        aVar2.getClass();
                                        q0.a.b(contextRequireContext, str);
                                        return;
                                    } catch (ActivityNotFoundException unused2) {
                                        Uri uri = Uri.parse("https://www.strava.com/settings");
                                        uri.getClass();
                                        g22.e.i(mVar, uri);
                                        return;
                                    }
                                }
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar3 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                v0.a aVar4 = v0.T;
                                String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
                                aVar4.getClass();
                                Uri uri2 = Uri.parse(v0.a.a(strName).i().concat("/search/shopResults.faces?site=Shop&filter=0&client=garmin_fe&contentType=Shop&q=LiveTrack+compatible"));
                                uri2.getClass();
                                g22.e.i(mVar, uri2);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar5 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                v0.a aVar6 = v0.T;
                                String strName2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
                                aVar6.getClass();
                                Uri uri3 = Uri.parse(v0.a.a(strName2).i().concat("/search/shopResults.faces?site=Shop&filter=0&client=garmin_fe&contentType=Shop&q=Live+Segments"));
                                uri3.getClass();
                                g22.e.i(mVar, uri3);
                                break;
                        }
                    }
                });
            } else {
                fr1.i iVar = (fr1.i) KoinJavaComponent.get$default(fr1.i.class, null, null, 6, null);
                String string4 = getString(R.string.strava_use_strava_segments);
                string4.getClass();
                zf1.a aVarD = iVar.d();
                zf1.a aVar = zf1.a.STRAVA;
                boolean z15 = aVarD == aVar;
                jVar.a(z15 ? 2131231882 : 2131231880, string4);
                if (!z15) {
                    aVar = zf1.a.GARMIN;
                }
                iVar.a(aVar);
                bl0.b bVar = new bl0.b(1, jVar, iVar);
                SwitchCompat switchCompat = jVar.f73313f;
                if (switchCompat != null) {
                    switchCompat.setVisibility(0);
                    switchCompat.setChecked(z15);
                    switchCompat.setOnCheckedChangeListener(bVar);
                }
            }
            if (stravaStatusDTO == null || !z14) {
                String string5 = getString(R.string.strava_upgrade_to_livetrack_compatible_device_msg);
                string5.getClass();
                jVar2.a(2131232039, string5);
                String string6 = getString(R.string.strava_shop_live_track_compatible_devices_title);
                string6.getClass();
                final int i16 = 1;
                fr1.j.c(jVar2.f73311d, string6, new View.OnClickListener(this) { // from class: fr1.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.strava.m f73303b;

                    {
                        this.f73303b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        PackageManager packageManager;
                        int i17 = i16;
                        Intent launchIntentForPackage = null;
                        com.garmin.android.apps.connectmobile.strava.m mVar = this.f73303b;
                        switch (i17) {
                            case 0:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar2 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                try {
                                    mVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("strava://beacon/settings")));
                                    break;
                                } catch (ActivityNotFoundException unused) {
                                    androidx.fragment.app.m activity = mVar.getActivity();
                                    if (activity != null && (packageManager = activity.getPackageManager()) != null) {
                                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(hb2.g.a.STRAVA.f82804a);
                                    }
                                    if (launchIntentForPackage != null) {
                                        mVar.startActivity(launchIntentForPackage);
                                        return;
                                    }
                                    try {
                                        q0.a aVar3 = q0.f23203a;
                                        String str = hb2.g.a.STRAVA.f82804a;
                                        str.getClass();
                                        Context contextRequireContext = mVar.requireContext();
                                        contextRequireContext.getClass();
                                        aVar3.getClass();
                                        q0.a.b(contextRequireContext, str);
                                        return;
                                    } catch (ActivityNotFoundException unused2) {
                                        Uri uri = Uri.parse("https://www.strava.com/settings");
                                        uri.getClass();
                                        g22.e.i(mVar, uri);
                                        return;
                                    }
                                }
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar4 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                v0.a aVar5 = v0.T;
                                String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
                                aVar5.getClass();
                                Uri uri2 = Uri.parse(v0.a.a(strName).i().concat("/search/shopResults.faces?site=Shop&filter=0&client=garmin_fe&contentType=Shop&q=LiveTrack+compatible"));
                                uri2.getClass();
                                g22.e.i(mVar, uri2);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar6 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                v0.a aVar7 = v0.T;
                                String strName2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
                                aVar7.getClass();
                                Uri uri3 = Uri.parse(v0.a.a(strName2).i().concat("/search/shopResults.faces?site=Shop&filter=0&client=garmin_fe&contentType=Shop&q=Live+Segments"));
                                uri3.getClass();
                                g22.e.i(mVar, uri3);
                                break;
                        }
                    }
                });
            } else {
                boolean z16 = stravaStatusDTO.f41334f;
                String string7 = getString(R.string.strava_beacon_available_title);
                string7.getClass();
                String string8 = getString(R.string.strava_beacon_disable_title);
                string8.getClass();
                int i17 = z16 ? 2131231881 : 2131232039;
                if (!z16) {
                    string7 = string8;
                }
                jVar2.a(i17, string7);
                String string9 = getString(R.string.lbl_manage);
                string9.getClass();
                final int i18 = 0;
                fr1.j.c(jVar2.f73312e, string9, new View.OnClickListener(this) { // from class: fr1.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.strava.m f73303b;

                    {
                        this.f73303b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        PackageManager packageManager;
                        int i19 = i18;
                        Intent launchIntentForPackage = null;
                        com.garmin.android.apps.connectmobile.strava.m mVar = this.f73303b;
                        switch (i19) {
                            case 0:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar2 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                try {
                                    mVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("strava://beacon/settings")));
                                    break;
                                } catch (ActivityNotFoundException unused) {
                                    androidx.fragment.app.m activity = mVar.getActivity();
                                    if (activity != null && (packageManager = activity.getPackageManager()) != null) {
                                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(hb2.g.a.STRAVA.f82804a);
                                    }
                                    if (launchIntentForPackage != null) {
                                        mVar.startActivity(launchIntentForPackage);
                                        return;
                                    }
                                    try {
                                        q0.a aVar3 = q0.f23203a;
                                        String str = hb2.g.a.STRAVA.f82804a;
                                        str.getClass();
                                        Context contextRequireContext = mVar.requireContext();
                                        contextRequireContext.getClass();
                                        aVar3.getClass();
                                        q0.a.b(contextRequireContext, str);
                                        return;
                                    } catch (ActivityNotFoundException unused2) {
                                        Uri uri = Uri.parse("https://www.strava.com/settings");
                                        uri.getClass();
                                        g22.e.i(mVar, uri);
                                        return;
                                    }
                                }
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar4 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                v0.a aVar5 = v0.T;
                                String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
                                aVar5.getClass();
                                Uri uri2 = Uri.parse(v0.a.a(strName).i().concat("/search/shopResults.faces?site=Shop&filter=0&client=garmin_fe&contentType=Shop&q=LiveTrack+compatible"));
                                uri2.getClass();
                                g22.e.i(mVar, uri2);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.strava.m.a aVar6 = com.garmin.android.apps.connectmobile.strava.m.f45000y;
                                v0.a aVar7 = v0.T;
                                String strName2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
                                aVar7.getClass();
                                Uri uri3 = Uri.parse(v0.a.a(strName2).i().concat("/search/shopResults.faces?site=Shop&filter=0&client=garmin_fe&contentType=Shop&q=Live+Segments"));
                                uri3.getClass();
                                g22.e.i(mVar, uri3);
                                break;
                        }
                    }
                });
            }
        } else {
            th3 = null;
            textView.setText(R.string.strava_enable_features_msg);
            textView.setGravity(8388611);
            viewFindViewById2.setVisibility(8);
            String string10 = getString(R.string.strava_view_live_segments_on_garmin_label);
            string10.getClass();
            String string11 = getString(R.string.bracket_pattern, getString(R.string.strava_require_segment_device_label));
            string11.getClass();
            jVar.b(2131231880, string10, string11);
            String string12 = getString(R.string.strava_watch_livetrack_using_beacon_label);
            string12.getClass();
            String string13 = getString(R.string.bracket_pattern, getString(R.string.strava_require_livetrack_device_label));
            string13.getClass();
            jVar2.b(2131232038, string12, string13);
        }
        View view3 = jVar2.f73314g;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        ArrayList<String> arrayList = this.f45002o;
        if (arrayList != null) {
            if (arrayList.contains(hk1.d.f84136h.f84140a) || arrayList.contains(hk1.d.f84133e.f84140a)) {
                i14 = 8;
                viewFindViewById3.setVisibility(0);
            } else {
                i14 = 8;
                viewFindViewById3.setVisibility(8);
            }
            if (arrayList.contains(hk1.d.f84134f.f84140a)) {
                viewFindViewById4.setVisibility(0);
            } else {
                viewFindViewById4.setVisibility(i14);
            }
        }
        GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f45005r;
        if (gCMComplexOneLineButton4 == null) {
            s.m("courseImportBtn");
            throw th3;
        }
        gCMComplexOneLineButton4.i(this.f45003p.contains("COURSE_IMPORT"));
        GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f45006t;
        if (gCMComplexOneLineButton5 == null) {
            s.m("workoutImportBtn");
            throw th3;
        }
        gCMComplexOneLineButton5.i(this.f45003p.contains("WORKOUT_IMPORT"));
        GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f45007v;
        if (gCMComplexOneLineButton6 != null) {
            gCMComplexOneLineButton6.i(this.f45003p.contains("ACTIVITY_EXPORT"));
        } else {
            s.m("activityExportBtn");
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/m$a;", "", "<init>", "()V", "", "ARGS_CONNECTED_STATUS", "Ljava/lang/String;", "ARGS_CAPABILITY_LIST", "ARGS_PERMISSION_LIST", "ARGS_STRAVA_CONSUMER_KEY", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
