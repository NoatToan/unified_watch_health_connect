package com.garmin.android.apps.connectmobile.segments.presentation.leaderboard;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import c22.l3;
import cd0.h0;
import cg1.b0;
import cg1.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMNestedScrollView;
import ds.e0;
import ds0.g;
import e23.l;
import eg1.d;
import eg1.i;
import eg1.j;
import fw.p;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import o13.h;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/SegmentLeaderboardActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/b$b;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentLeaderboardActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b.InterfaceC0789b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f41454p = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f41456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UserRankDTO f41458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f41459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b f41460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f41461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewGroup f41462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SegmentLeaderboardDTO f41464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SegmentLeaderboardFilterDTO f41465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41468n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f41469o = true;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41473a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41473a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f41474a;

        public c(l lVar) {
            lVar.getClass();
            this.f41474a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f41474a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41474a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b.InterfaceC0789b
    public final void A0() {
        this.f41466l = false;
        if (this.f41469o) {
            ca(this.f41468n);
        }
    }

    public final void ca(int i14) {
        if (this.f41455a != null) {
            SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = this.f41465k;
            segmentLeaderboardFilterDTO.getClass();
            segmentLeaderboardFilterDTO.f41292g = i14;
            SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = this.f41465k;
            segmentLeaderboardFilterDTO2.getClass();
            segmentLeaderboardFilterDTO2.f41293h = 26;
            c0 c0Var = this.f41461g;
            c0Var.getClass();
            SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = this.f41465k;
            segmentLeaderboardFilterDTO3.getClass();
            f0.N(new b0(c0Var, segmentLeaderboardFilterDTO3, null)).f(this, new c(new g(this, 8)));
        }
    }

    public final void da() {
        if (!this.f41463i) {
            this.f41465k = new SegmentLeaderboardFilterDTO(this.f41455a);
            return;
        }
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTOE = com.garmin.android.apps.connectmobile.segments.presentation.g.f41446b.a() != null ? ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).e(this) : null;
        this.f41465k = segmentLeaderboardFilterDTOE;
        if (segmentLeaderboardFilterDTOE != null) {
            segmentLeaderboardFilterDTOE.f41286a = this.f41455a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.widget.TextView[]] */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.core.widget.NestedScrollView, com.garmin.android.apps.connectmobile.view.view_3_0.GCMNestedScrollView] */
    /* JADX WARN: Type inference failed for: r13v21, types: [android.widget.TextView[]] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v28, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eg1.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ea(SegmentLeaderboardDTO segmentLeaderboardDTO, boolean z14) {
        TextView textView;
        ?? linearLayout;
        LinearLayout linearLayout2;
        SegmentLeaderboardRowDTO segmentLeaderboardRowDTO;
        List<SegmentLeaderboardRowDTO> list;
        com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b bVar = this.f41460f;
        if (bVar != null) {
            bVar.f41507m = segmentLeaderboardDTO;
            bVar.getClass();
            if (bVar.isAdded()) {
                com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b bVar2 = this.f41460f;
                bVar2.getClass();
                TextView textView2 = bVar2.f41505k;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                GCMNestedScrollView gCMNestedScrollView = bVar2.f41504j;
                if (gCMNestedScrollView != null) {
                    gCMNestedScrollView.removeAllViews();
                }
                GCMNestedScrollView gCMNestedScrollView2 = bVar2.f41504j;
                if (gCMNestedScrollView2 != null) {
                    gCMNestedScrollView2.setVisibility(8);
                }
                SegmentLeaderboardDTO segmentLeaderboardDTO2 = bVar2.f41507m;
                if (segmentLeaderboardDTO2 != null) {
                    List<SegmentLeaderboardRowDTO> list2 = segmentLeaderboardDTO2.f41223d;
                    if (list2 == null || list2.isEmpty()) {
                        GCMNestedScrollView gCMNestedScrollView3 = bVar2.f41504j;
                        if (gCMNestedScrollView3 != null) {
                            gCMNestedScrollView3.setVisibility(8);
                        }
                        TextView textView3 = bVar2.f41505k;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        ImageView imageView = bVar2.f41506l;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        TextView textView4 = bVar2.f41509o;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                    } else {
                        GCMNestedScrollView gCMNestedScrollView4 = bVar2.f41504j;
                        if (gCMNestedScrollView4 != null) {
                            gCMNestedScrollView4.setVisibility(0);
                        }
                        ImageView imageView2 = bVar2.f41506l;
                        if (imageView2 != null) {
                            imageView2.setVisibility(0);
                        }
                        TextView textView5 = bVar2.f41509o;
                        if (textView5 != null) {
                            textView5.setVisibility(8);
                        }
                        m mVarRequireActivity = bVar2.requireActivity();
                        mVarRequireActivity.getClass();
                        ?? bVar3 = new eg1.b(mVarRequireActivity, bVar2.f41502h, bVar2.f41503i, bVar2.getResources().getConfiguration().orientation == 1);
                        SegmentLeaderboardDTO segmentLeaderboardDTO3 = bVar2.f41507m;
                        if (segmentLeaderboardDTO3 != null && (list = segmentLeaderboardDTO3.f41223d) != null) {
                            bVar3.f63977d = list;
                        }
                        boolean z15 = bVar3.f63976c;
                        x0 x0Var = bVar3.f63978e;
                        Activity activity = bVar3.f63974a;
                        if (z15) {
                            linearLayout = new LinearLayout(activity);
                            linearLayout.setOrientation(1);
                            d[] dVarArr = x0Var == x0.f4312o ? new d[]{d.TIME, d.SPEED} : new d[]{d.TIME, d.PACE};
                            eg1.h hVar = new eg1.h(activity, dVarArr);
                            Context context = hVar.f64002a;
                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm3_segment_leaderboard_list_header_row, (ViewGroup) null);
                            viewInflate.getClass();
                            LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                            d[] dVarArr2 = hVar.f64003b;
                            int length = dVarArr2.length;
                            for (int i14 = 0; i14 < length; i14++) {
                                linearLayout3.addView(hVar.b(dVarArr2[i14].f63995b, dVarArr2[i14].ordinal(), context.getString(dVarArr2[i14].f63994a)));
                            }
                            eg1.h.a(linearLayout3);
                            linearLayout3.post(new h0(linearLayout3, 29));
                            linearLayout3.setBackgroundColor(a7.b.getColor(activity, R.color.gcm_surface_1));
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(activity.getString(R.string.lbl_table_header));
                            sb3.append(". ");
                            sb3.append(activity.getString(R.string.challenge_place_label));
                            sb3.append(". ");
                            sb3.append(activity.getString(R.string.lbl_name));
                            sb3.append(". ");
                            for (d dVar : dVarArr) {
                                dVar.getClass();
                                sb3.append(activity.getString(dVar.f63994a));
                                sb3.append(". ");
                            }
                            linearLayout3.setContentDescription(sb3);
                            linearLayout.addView(linearLayout3);
                            List<SegmentLeaderboardRowDTO> list3 = bVar3.f63977d;
                            if (list3 != null) {
                                int size = list3 != null ? list3.size() : 0;
                                int i15 = 0;
                                while (i15 < size) {
                                    String str = null;
                                    View viewInflate2 = LayoutInflater.from(hVar.f64002a).inflate(R.layout.gcm3_segment_leaderboard_list_data_row, (ViewGroup) null);
                                    viewInflate2.getClass();
                                    LinearLayout linearLayout4 = (LinearLayout) viewInflate2;
                                    d[] dVarArr3 = hVar.f64003b;
                                    int length2 = dVarArr3.length;
                                    int i16 = 0;
                                    while (i16 < length2) {
                                        linearLayout4.addView(hVar.b(dVarArr3[i16].f63995b, dVarArr3[i16].ordinal(), str));
                                        i16++;
                                        str = null;
                                    }
                                    eg1.h.a(linearLayout4);
                                    linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                    linearLayout4.setBackgroundColor(eg1.b.b(activity, i15));
                                    eg1.b.a aVar = new eg1.b.a(dVarArr.length);
                                    aVar.f63980b = (ImageView) linearLayout4.findViewById(R.id.segments_privacy_icon);
                                    aVar.f63979a = (TextView) linearLayout4.findViewById(R.id.rank);
                                    aVar.f63981c = (UserLevelImageView) linearLayout4.findViewById(R.id.profile_image);
                                    aVar.f63982d = (TextView) linearLayout4.findViewById(R.id.name);
                                    ?? r14 = aVar.f63983e;
                                    int length3 = r14.length;
                                    for (int i17 = 0; i17 < length3; i17++) {
                                        r14[i17] = linearLayout4.findViewById(hVar.f64003b[i17].ordinal());
                                    }
                                    List<SegmentLeaderboardRowDTO> list4 = bVar3.f63977d;
                                    SegmentLeaderboardRowDTO segmentLeaderboardRowDTO2 = list4 != null ? list4.get(i15) : null;
                                    segmentLeaderboardRowDTO2.getClass();
                                    d[] dVarArr4 = dVarArr;
                                    j.a(activity, aVar, dVarArr4, segmentLeaderboardRowDTO2, bVar3.f63975b, linearLayout4);
                                    if (i15 != 0) {
                                        bVar3.a(linearLayout);
                                    }
                                    linearLayout.addView(linearLayout4);
                                    i15++;
                                    dVarArr = dVarArr4;
                                }
                            }
                        } else {
                            Object systemService = activity.getSystemService("layout_inflater");
                            systemService.getClass();
                            View viewInflate3 = ((LayoutInflater) systemService).inflate(R.layout.gcm3_segment_leaderboard_list_landscape, (ViewGroup) null);
                            LinearLayout linearLayout5 = (LinearLayout) viewInflate3.findViewById(R.id.segment_leaderboard_fixed_data_container);
                            LinearLayout linearLayout6 = (LinearLayout) viewInflate3.findViewById(R.id.segment_leaderboard_scrolling_data_container);
                            d[] dVarArr5 = x0Var == x0.f4312o ? new d[]{d.TIME, d.SPEED, d.HR, d.POWER, d.WIND, d.DATE} : new d[]{d.TIME, d.PACE, d.HR, d.WIND, d.DATE};
                            i iVar = new i(activity, dVarArr5);
                            View viewInflate4 = LayoutInflater.from(iVar.f64002a).inflate(R.layout.gcm3_segment_leaderboard_list_header_row_fixed, (ViewGroup) null);
                            viewInflate4.getClass();
                            viewInflate4.setBackgroundColor(a7.b.getColor(activity, R.color.gcm_surface_1));
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(activity.getString(R.string.lbl_table_header));
                            sb4.append(". ");
                            sb4.append(activity.getString(R.string.challenge_place_label));
                            sb4.append(". ");
                            sb4.append(activity.getString(R.string.lbl_name));
                            sb4.append(". ");
                            for (d dVar2 : dVarArr5) {
                                dVar2.getClass();
                                sb4.append(activity.getString(dVar2.f63994a));
                                sb4.append(". ");
                            }
                            viewInflate4.setContentDescription(sb4);
                            linearLayout5.addView(viewInflate4);
                            Context context2 = iVar.f64002a;
                            View viewInflate5 = LayoutInflater.from(context2).inflate(R.layout.gcm3_segment_leaderboard_list_header_row_scrolling, (ViewGroup) null);
                            viewInflate5.getClass();
                            LinearLayout linearLayout7 = (LinearLayout) viewInflate5;
                            d[] dVarArr6 = iVar.f64003b;
                            int length4 = dVarArr6.length;
                            for (int i18 = 0; i18 < length4; i18++) {
                                linearLayout7.addView(iVar.b(dVarArr6[i18].f63995b, dVarArr6[i18].ordinal(), context2.getString(dVarArr6[i18].f63994a)));
                            }
                            linearLayout7.setBackgroundColor(a7.b.getColor(activity, R.color.gcm_surface_1));
                            linearLayout6.addView(linearLayout7);
                            List<SegmentLeaderboardRowDTO> list5 = bVar3.f63977d;
                            if (list5 != null) {
                                int size2 = list5 != null ? list5.size() : 0;
                                int i19 = 0;
                                while (i19 < size2) {
                                    Context context3 = iVar.f64002a;
                                    View viewInflate6 = LayoutInflater.from(context3).inflate(R.layout.gcm3_segment_leaderboard_list_data_row_fixed, (ViewGroup) null);
                                    viewInflate6.setMinimumHeight((int) c22.b.c(context3, (int) context3.getResources().getDimension(R.dimen.segment_leaderboard_column_height), 1.5f));
                                    Object obj = null;
                                    View viewInflate7 = LayoutInflater.from(iVar.f64002a).inflate(R.layout.gcm3_segment_leaderboard_list_data_row_scrolling, (ViewGroup) null);
                                    viewInflate7.getClass();
                                    LinearLayout linearLayout8 = (LinearLayout) viewInflate7;
                                    d[] dVarArr7 = iVar.f64003b;
                                    int length5 = dVarArr7.length;
                                    int i24 = 0;
                                    while (i24 < length5) {
                                        int i25 = size2;
                                        TextView textViewB = iVar.b(dVarArr7[i24].f63995b, dVarArr7[i24].ordinal(), null);
                                        textViewB.setGravity(16);
                                        linearLayout8.addView(textViewB);
                                        i24++;
                                        obj = null;
                                        size2 = i25;
                                        viewInflate3 = viewInflate3;
                                    }
                                    int i26 = size2;
                                    View view2 = viewInflate3;
                                    eg1.h.a(linearLayout8);
                                    Context context4 = iVar.f64002a;
                                    linearLayout8.setMinimumHeight((int) c22.b.c(context4, (int) context4.getResources().getDimension(R.dimen.segment_leaderboard_column_height), 1.5f));
                                    if (viewInflate6.getViewTreeObserver().isAlive()) {
                                        viewInflate6.getViewTreeObserver().addOnGlobalLayoutListener(new eg1.c(linearLayout8, viewInflate6));
                                    }
                                    viewInflate6.setBackgroundColor(eg1.b.b(activity, i19));
                                    linearLayout8.setBackgroundColor(eg1.b.b(activity, i19));
                                    eg1.b.a aVar2 = new eg1.b.a(dVarArr5.length);
                                    aVar2.f63980b = (ImageView) linearLayout8.findViewById(R.id.segments_privacy_icon);
                                    aVar2.f63979a = (TextView) viewInflate6.findViewById(R.id.rank);
                                    aVar2.f63981c = (UserLevelImageView) viewInflate6.findViewById(R.id.profile_image);
                                    aVar2.f63982d = (TextView) viewInflate6.findViewById(R.id.name);
                                    ?? r15 = aVar2.f63983e;
                                    int length6 = r15.length;
                                    for (int i27 = 0; i27 < length6; i27++) {
                                        r15[i27] = linearLayout8.findViewById(iVar.f64003b[i27].ordinal());
                                    }
                                    List<SegmentLeaderboardRowDTO> list6 = bVar3.f63977d;
                                    if (list6 != null) {
                                        LinearLayout linearLayout9 = linearLayout6;
                                        segmentLeaderboardRowDTO = list6.get(i19);
                                        linearLayout2 = linearLayout9;
                                    } else {
                                        linearLayout2 = linearLayout6;
                                        segmentLeaderboardRowDTO = null;
                                    }
                                    segmentLeaderboardRowDTO.getClass();
                                    LinearLayout linearLayout10 = linearLayout2;
                                    LinearLayout linearLayout11 = linearLayout5;
                                    d[] dVarArr8 = dVarArr5;
                                    j.a(activity, aVar2, dVarArr8, segmentLeaderboardRowDTO, bVar3.f63975b, viewInflate6);
                                    if (i19 != 0) {
                                        bVar3.a(linearLayout11);
                                        bVar3.a(linearLayout10);
                                    }
                                    linearLayout11.addView(viewInflate6);
                                    linearLayout10.addView(linearLayout8);
                                    i19++;
                                    linearLayout6 = linearLayout10;
                                    dVarArr5 = dVarArr8;
                                    viewInflate3 = view2;
                                    linearLayout5 = linearLayout11;
                                    size2 = i26;
                                }
                            }
                            linearLayout = viewInflate3;
                        }
                        ?? r16 = bVar2.f41504j;
                        if (r16 != 0) {
                            r16.addView(linearLayout);
                        }
                    }
                } else if (z14 && (textView = bVar2.f41505k) != null) {
                    textView.setVisibility(0);
                }
                bVar2.w6();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i15 == -1) {
            if (i14 == 1) {
                showProgressOverlay();
                intent.getClass();
                this.f41463i = intent.getBooleanExtra("extra_segment_leaderboard_filter_on", false);
                da();
                this.f41466l = true;
                this.f41467m = false;
                this.f41468n = 1;
                ca(1);
                return;
            }
            if (i14 != 12) {
                super.onActivityResult(i14, i15, intent);
                return;
            }
            showProgressOverlay();
            intent.getClass();
            String stringExtra = intent.getStringExtra("GCM_extra_privacy_type");
            am.l.f4047c.getClass();
            am.l lVarA = am.l.a.a(stringExtra, am.l.f4051g);
            long longExtra = intent.getLongExtra("GCM_extra_activity_id", -1L);
            if (longExtra != -1) {
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
                hVar.f29448a = longExtra;
                hVar.Z(lVarA);
                ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).n(hVar, new eg1.a(this));
            }
            this.f41466l = true;
            this.f41467m = false;
            this.f41468n = 1;
            ca(1);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_segment_leaderboard);
        initActionBar(true, R.string.concept_leaderboard);
        if (bundle != null) {
            this.f41463i = bundle.getBoolean("extra_filter_on", false);
        }
        this.f41461g = (c0) new x1(this).b(s0.f105811a.b(c0.class));
        View viewFindViewById = findViewById(R.id.segment_leaderboard_snapshot_container);
        viewFindViewById.getClass();
        this.f41462h = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.segment_leaderboard_snapshot);
        viewFindViewById2.getClass();
        this.f41459e = (ViewGroup) viewFindViewById2;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f41455a = extras.getString("GCM_extra_segment_id");
            this.f41456b = extras.getDouble("GCM_extra_segment_distance");
            this.f41457c = extras.getInt("GCM_extra_activity_type", -1);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_segment_user_rank", UserRankDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_segment_user_rank");
                if (!(parcelable2 instanceof UserRankDTO)) {
                    parcelable2 = null;
                }
                parcelable = (UserRankDTO) parcelable2;
            }
            this.f41458d = (UserRankDTO) parcelable;
        }
        if (getResources().getConfiguration().orientation == 1) {
            UserRankDTO userRankDTO = this.f41458d;
            ViewGroup viewGroup = this.f41459e;
            if (viewGroup != null && userRankDTO != null) {
                viewGroup.removeAllViews();
                ge1.b.T(f0.w(this), null, null, new com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.a(this, userRankDTO, viewGroup, null), 3);
            }
        } else {
            hideActionBar();
            ViewGroup viewGroup2 = this.f41462h;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            View viewFindViewById3 = findViewById(R.id.segment_leaderboard_fragment);
            e0 e0Var = new e0(6);
            WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
            androidx.core.view.s0.d.c(viewFindViewById3, e0Var);
        }
        da();
        com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b.f41501p;
        int i14 = this.f41457c;
        double d14 = this.f41456b;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b bVar = new com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("GCM_extra_activity_type", i14);
        bundle2.putDouble("GCM_extra_segment_distance", d14);
        bVar.setArguments(bundle2);
        this.f41460f = bVar;
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b bVar2 = this.f41460f;
        bVar2.getClass();
        aVarB.l(R.id.segment_leaderboard_fragment, bVar2, null);
        aVarB.e();
        if (this.f41464j == null) {
            showProgressOverlay();
            ca(this.f41468n);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.segments_leaderboard, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_filter) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, (Class<?>) SegmentLeaderboardFilterActivity.class);
        intent.putExtra("extra_segment_leaderboard_filter_on", this.f41463i);
        intent.putExtra("GCM_extra_segment_distance", this.f41456b);
        intent.putExtra("GCM_extra_activity_type", this.f41457c);
        startActivityForResult(intent, 1);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        oc.b.G(menu.findItem(R.id.menu_item_filter), this, R.color.gcm_icon_primary);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ea(this.f41464j, this.f41467m);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("extra_filter_on", this.f41463i);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.b.InterfaceC0789b
    public final void w0() {
        this.f41466l = true;
        this.f41467m = false;
        this.f41468n = 1;
        ca(1);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/SegmentLeaderboardActivity$a;", "", "<init>", "()V", "", "FILTER_REQUEST_CODE", "I", "ACTIVITY_PRIVACY_REQUEST_CODE", "", "TAG", "Ljava/lang/String;", "EXTRA_FILTER_ON", "LEADERBOARD_UPDATE_COUNT", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static View a(Activity activity, C0788a c0788a, C0788a c0788a2, int i14) {
            String string;
            String string2;
            String string3;
            int i15 = c0788a2.f41470a;
            View viewInflate = View.inflate(activity, R.layout.gcm_leaderboard_list_header_two_rank, null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.leaderboard_header_first_rank);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_last_rank);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_first_rank_result);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_last_rank_result);
            UserLevelImageView userLevelImageView = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_header_profile_picture_left);
            UserLevelImageView userLevelImageView2 = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_header_profile_picture_right);
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            Locale locale = Locale.getDefault();
            String string4 = activity.getString(R.string.format_decimal_value);
            string4.getClass();
            int i16 = c0788a.f41470a;
            String str = String.format(locale, string4, Arrays.copyOf(new Object[]{Integer.valueOf(i16)}, 1));
            textView.setText(str);
            textView.setContentDescription(activity.getString(R.string.segments_rank, str));
            long j8 = c0788a.f41471b;
            if (j8 > 0) {
                l3.f23124b.getClass();
                string = l3.a.b1(j8);
            } else {
                string = activity.getString(R.string.no_value);
            }
            textView3.setText(string);
            textView3.setContentDescription(j.b(activity, j8));
            long j14 = c0788a2.f41471b;
            textView2.setText(i15 > 0 ? String.valueOf(i15) : activity.getString(R.string.no_value));
            if (i15 > 0) {
                string2 = String.valueOf(i15);
            } else {
                string2 = activity.getString(R.string.txt_empty_page_no_data);
                string2.getClass();
            }
            textView2.setContentDescription(activity.getString(R.string.segments_rank, string2));
            if (j14 > 0) {
                l3.f23124b.getClass();
                string3 = l3.a.b1(j14);
            } else {
                string3 = activity.getString(R.string.no_value);
            }
            textView4.setText(string3);
            textView4.setContentDescription(j.b(activity, j14));
            if (i14 == i16) {
                userLevelImageView2.setVisibility(8);
                userLevelImageView.setVisibility(0);
                userLevelImageView.setProfileImageData(c0788a.f41472c);
                return viewInflate;
            }
            userLevelImageView.setVisibility(8);
            userLevelImageView2.setVisibility(0);
            userLevelImageView2.setProfileImageData(c0788a2.f41472c);
            return viewInflate;
        }

        private a() {
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/SegmentLeaderboardActivity$a$a;", "", "", "rank", "", "elapsedMillis", "Lb12/b;", "userProfileImageData", "<init>", "(IJLb12/b;)V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0788a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f41470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f41471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b12.b f41472c;

            public C0788a(int i14, long j8, b12.b bVar) {
                bVar.getClass();
                this.f41470a = i14;
                this.f41471b = j8;
                this.f41472c = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0788a)) {
                    return false;
                }
                C0788a c0788a = (C0788a) obj;
                return this.f41470a == c0788a.f41470a && this.f41471b == c0788a.f41471b && s.g(this.f41472c, c0788a.f41472c);
            }

            public final int hashCode() {
                return this.f41472c.hashCode() + f.e(Integer.hashCode(this.f41470a) * 31, 31, this.f41471b);
            }

            public final String toString() {
                return "SnapshotElement(rank=" + this.f41470a + ", elapsedMillis=" + this.f41471b + ", userProfileImageData=" + this.f41472c + ")";
            }

            public /* synthetic */ C0788a(int i14, long j8, b12.b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
                this(i14, j8, (i15 & 4) != 0 ? b12.b.f14386g : bVar);
            }
        }
    }
}
