package com.garmin.android.apps.connectmobile.segments.presentation;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsFilterActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import xf1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/ExploreSegmentsFilterActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExploreSegmentsFilterActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f41363q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cg1.c f41364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cg1.c f41365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cg1.c f41366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cg1.c f41367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cg1.c f41368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f41369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexOneLineButton f41370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexOneLineButton f41371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f41372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f41373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexTwoLineButton f41374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMComplexTwoLineButton f41375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexTwoLineButton f41376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMComplexTwoLineButton f41377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexTwoLineButton f41378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SegmentsFilterDTO f41379p;

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cg1.c] */
    /* JADX WARN: Type inference failed for: r0v1, types: [cg1.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [cg1.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cg1.c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [cg1.c] */
    public ExploreSegmentsFilterActivity() {
        final int i14 = 0;
        this.f41364a = new View.OnClickListener(this) { // from class: cg1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27134b;

            {
                this.f27134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                final int i16 = 0;
                final ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27134b;
                switch (i15) {
                    case 0:
                        int i17 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar = xf1.f.f190681f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            xf1.f fVar = (xf1.f) bVarN.next();
                            strArr[fVar.ordinal()] = exploreSegmentsFilterActivity.getString(fVar.f190683b);
                        }
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.txt_activity_type);
                        String[] strArr2 = strArr;
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        xf1.f fVar2 = segmentsFilterDTO.f41196h;
                        final int i18 = 1;
                        title.setSingleChoiceItems(strArr2, fVar2 != null ? fVar2.ordinal() : -1, new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                int i24 = i18;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i24) {
                                    case 0:
                                        int i25 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i19));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i26 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i19));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i19));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        break;
                    case 1:
                        int i19 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar2 = SegmentsFilterDTO.d.f41215g;
                        String[] strArr3 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (true) {
                            final int i24 = 2;
                            if (!bVar.hasNext()) {
                                SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                                segmentsFilterDTO2.getClass();
                                androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_distance).setSingleChoiceItems(strArr3, segmentsFilterDTO2.f41201m.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i110) {
                                        int i25 = i24;
                                        ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                        switch (i25) {
                                            case 0:
                                                int i26 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i110));
                                                dialogInterface.dismiss();
                                                break;
                                            case 1:
                                                int i27 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i110));
                                                dialogInterface.dismiss();
                                                break;
                                            default:
                                                int i28 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i110));
                                                dialogInterface.dismiss();
                                                break;
                                        }
                                    }
                                }).show();
                                eVarShow.getClass();
                                String[] strArr4 = (String[]) arrayListK.toArray(new String[0]);
                                oe2.f.f0(eVarShow, (String[]) Arrays.copyOf(strArr4, strArr4.length));
                            } else {
                                SegmentsFilterDTO.d dVar = (SegmentsFilterDTO.d) bVar.next();
                                strArr3[dVar.ordinal()] = dVar.a(exploreSegmentsFilterActivity);
                                arrayListK.add(oi0.d.a(exploreSegmentsFilterActivity, dVar.a(exploreSegmentsFilterActivity), new e(2)));
                            }
                            break;
                        }
                        break;
                    case 2:
                        int i25 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar3 = SegmentsFilterDTO.a.f41208g;
                        String[] strArr5 = new String[cVar3.getF134973e()];
                        ArrayList arrayListK2 = n23.j.k(cVar3);
                        p13.c.b bVar2 = new p13.c.b();
                        while (bVar2.hasNext()) {
                            SegmentsFilterDTO.a aVar = (SegmentsFilterDTO.a) bVar2.next();
                            strArr5[aVar.ordinal()] = aVar.a(exploreSegmentsFilterActivity);
                            arrayListK2.add(exploreSegmentsFilterActivity.da(aVar));
                        }
                        SegmentsFilterDTO segmentsFilterDTO3 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO3.getClass();
                        androidx.appcompat.app.e eVarShow2 = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(StringUtils.SPACE).setSingleChoiceItems(strArr5, segmentsFilterDTO3.f41202n.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i110) {
                                int i26 = i16;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i110));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i110));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i110));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        eVarShow2.getClass();
                        String[] strArr6 = (String[]) arrayListK2.toArray(new String[0]);
                        oe2.f.f0(eVarShow2, (String[]) Arrays.copyOf(strArr6, strArr6.length));
                        String string = exploreSegmentsFilterActivity.getString(R.string.lbl_avg_grade);
                        string.getClass();
                        String string2 = exploreSegmentsFilterActivity.getString(R.string.lbl_average_grade);
                        string2.getClass();
                        oe2.f.g0(eVarShow2, string, string2);
                        break;
                    case 3:
                        int i26 = ExploreSegmentsFilterActivity.f41363q;
                        xf1.e[] eVarArr = {xf1.e.TYPE_ALL, xf1.e.TYPE_SPRINT, xf1.e.TYPE_HILL_CLIMB, xf1.e.TYPE_HILLS, xf1.e.TYPE_DOWNHILL, xf1.e.TYPE_OTHER};
                        String[] strArr7 = new String[xf1.e.f190675l.getF134973e()];
                        while (i16 < 6) {
                            xf1.e eVar = eVarArr[i16];
                            strArr7[eVar.ordinal()] = exploreSegmentsFilterActivity.getString(eVar.f190677b);
                            i16++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO4 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO4.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_segment_type).setSingleChoiceItems(strArr7, segmentsFilterDTO4.f41200l.ordinal(), new ag0.d(10, exploreSegmentsFilterActivity, eVarArr)).show();
                        break;
                    default:
                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                        String[] strArr8 = new String[xf1.o.f190711j.getF134973e()];
                        xf1.o[] oVarArr = {xf1.o.TYPE_ALL, xf1.o.TYPE_PAVED, xf1.o.TYPE_GRAVEL, xf1.o.TYPE_DIRT, xf1.o.TYPE_MIXED};
                        while (i16 < 5) {
                            xf1.o oVar = oVarArr[i16];
                            strArr8[oVar.ordinal()] = exploreSegmentsFilterActivity.getString(oVar.f190713b);
                            i16++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO5 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO5.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_surface).setSingleChoiceItems(strArr8, segmentsFilterDTO5.f41203o.ordinal(), new ag0.d(9, exploreSegmentsFilterActivity, oVarArr)).show();
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f41365b = new View.OnClickListener(this) { // from class: cg1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27134b;

            {
                this.f27134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                final int i17 = 0;
                final ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27134b;
                switch (i16) {
                    case 0:
                        int i18 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar = xf1.f.f190681f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            xf1.f fVar = (xf1.f) bVarN.next();
                            strArr[fVar.ordinal()] = exploreSegmentsFilterActivity.getString(fVar.f190683b);
                        }
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.txt_activity_type);
                        String[] strArr2 = strArr;
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        xf1.f fVar2 = segmentsFilterDTO.f41196h;
                        final int i19 = 1;
                        title.setSingleChoiceItems(strArr2, fVar2 != null ? fVar2.ordinal() : -1, new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i110) {
                                int i26 = i19;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i110));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i110));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i110));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        break;
                    case 1:
                        int i110 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar2 = SegmentsFilterDTO.d.f41215g;
                        String[] strArr3 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (true) {
                            final int i24 = 2;
                            if (!bVar.hasNext()) {
                                SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                                segmentsFilterDTO2.getClass();
                                androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_distance).setSingleChoiceItems(strArr3, segmentsFilterDTO2.f41201m.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i111) {
                                        int i26 = i24;
                                        ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                        switch (i26) {
                                            case 0:
                                                int i27 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i111));
                                                dialogInterface.dismiss();
                                                break;
                                            case 1:
                                                int i28 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i111));
                                                dialogInterface.dismiss();
                                                break;
                                            default:
                                                int i29 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i111));
                                                dialogInterface.dismiss();
                                                break;
                                        }
                                    }
                                }).show();
                                eVarShow.getClass();
                                String[] strArr4 = (String[]) arrayListK.toArray(new String[0]);
                                oe2.f.f0(eVarShow, (String[]) Arrays.copyOf(strArr4, strArr4.length));
                            } else {
                                SegmentsFilterDTO.d dVar = (SegmentsFilterDTO.d) bVar.next();
                                strArr3[dVar.ordinal()] = dVar.a(exploreSegmentsFilterActivity);
                                arrayListK.add(oi0.d.a(exploreSegmentsFilterActivity, dVar.a(exploreSegmentsFilterActivity), new e(2)));
                            }
                            break;
                        }
                        break;
                    case 2:
                        int i25 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar3 = SegmentsFilterDTO.a.f41208g;
                        String[] strArr5 = new String[cVar3.getF134973e()];
                        ArrayList arrayListK2 = n23.j.k(cVar3);
                        p13.c.b bVar2 = new p13.c.b();
                        while (bVar2.hasNext()) {
                            SegmentsFilterDTO.a aVar = (SegmentsFilterDTO.a) bVar2.next();
                            strArr5[aVar.ordinal()] = aVar.a(exploreSegmentsFilterActivity);
                            arrayListK2.add(exploreSegmentsFilterActivity.da(aVar));
                        }
                        SegmentsFilterDTO segmentsFilterDTO3 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO3.getClass();
                        androidx.appcompat.app.e eVarShow2 = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(StringUtils.SPACE).setSingleChoiceItems(strArr5, segmentsFilterDTO3.f41202n.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i111) {
                                int i26 = i17;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i111));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i111));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i111));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        eVarShow2.getClass();
                        String[] strArr6 = (String[]) arrayListK2.toArray(new String[0]);
                        oe2.f.f0(eVarShow2, (String[]) Arrays.copyOf(strArr6, strArr6.length));
                        String string = exploreSegmentsFilterActivity.getString(R.string.lbl_avg_grade);
                        string.getClass();
                        String string2 = exploreSegmentsFilterActivity.getString(R.string.lbl_average_grade);
                        string2.getClass();
                        oe2.f.g0(eVarShow2, string, string2);
                        break;
                    case 3:
                        int i26 = ExploreSegmentsFilterActivity.f41363q;
                        xf1.e[] eVarArr = {xf1.e.TYPE_ALL, xf1.e.TYPE_SPRINT, xf1.e.TYPE_HILL_CLIMB, xf1.e.TYPE_HILLS, xf1.e.TYPE_DOWNHILL, xf1.e.TYPE_OTHER};
                        String[] strArr7 = new String[xf1.e.f190675l.getF134973e()];
                        while (i17 < 6) {
                            xf1.e eVar = eVarArr[i17];
                            strArr7[eVar.ordinal()] = exploreSegmentsFilterActivity.getString(eVar.f190677b);
                            i17++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO4 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO4.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_segment_type).setSingleChoiceItems(strArr7, segmentsFilterDTO4.f41200l.ordinal(), new ag0.d(10, exploreSegmentsFilterActivity, eVarArr)).show();
                        break;
                    default:
                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                        String[] strArr8 = new String[xf1.o.f190711j.getF134973e()];
                        xf1.o[] oVarArr = {xf1.o.TYPE_ALL, xf1.o.TYPE_PAVED, xf1.o.TYPE_GRAVEL, xf1.o.TYPE_DIRT, xf1.o.TYPE_MIXED};
                        while (i17 < 5) {
                            xf1.o oVar = oVarArr[i17];
                            strArr8[oVar.ordinal()] = exploreSegmentsFilterActivity.getString(oVar.f190713b);
                            i17++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO5 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO5.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_surface).setSingleChoiceItems(strArr8, segmentsFilterDTO5.f41203o.ordinal(), new ag0.d(9, exploreSegmentsFilterActivity, oVarArr)).show();
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f41366c = new View.OnClickListener(this) { // from class: cg1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27134b;

            {
                this.f27134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                final int i18 = 0;
                final ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27134b;
                switch (i17) {
                    case 0:
                        int i19 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar = xf1.f.f190681f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            xf1.f fVar = (xf1.f) bVarN.next();
                            strArr[fVar.ordinal()] = exploreSegmentsFilterActivity.getString(fVar.f190683b);
                        }
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.txt_activity_type);
                        String[] strArr2 = strArr;
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        xf1.f fVar2 = segmentsFilterDTO.f41196h;
                        final int i110 = 1;
                        title.setSingleChoiceItems(strArr2, fVar2 != null ? fVar2.ordinal() : -1, new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i111) {
                                int i26 = i110;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i111));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i111));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i111));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        break;
                    case 1:
                        int i111 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar2 = SegmentsFilterDTO.d.f41215g;
                        String[] strArr3 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (true) {
                            final int i24 = 2;
                            if (!bVar.hasNext()) {
                                SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                                segmentsFilterDTO2.getClass();
                                androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_distance).setSingleChoiceItems(strArr3, segmentsFilterDTO2.f41201m.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i112) {
                                        int i26 = i24;
                                        ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                        switch (i26) {
                                            case 0:
                                                int i27 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i112));
                                                dialogInterface.dismiss();
                                                break;
                                            case 1:
                                                int i28 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i112));
                                                dialogInterface.dismiss();
                                                break;
                                            default:
                                                int i29 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i112));
                                                dialogInterface.dismiss();
                                                break;
                                        }
                                    }
                                }).show();
                                eVarShow.getClass();
                                String[] strArr4 = (String[]) arrayListK.toArray(new String[0]);
                                oe2.f.f0(eVarShow, (String[]) Arrays.copyOf(strArr4, strArr4.length));
                            } else {
                                SegmentsFilterDTO.d dVar = (SegmentsFilterDTO.d) bVar.next();
                                strArr3[dVar.ordinal()] = dVar.a(exploreSegmentsFilterActivity);
                                arrayListK.add(oi0.d.a(exploreSegmentsFilterActivity, dVar.a(exploreSegmentsFilterActivity), new e(2)));
                            }
                            break;
                        }
                        break;
                    case 2:
                        int i25 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar3 = SegmentsFilterDTO.a.f41208g;
                        String[] strArr5 = new String[cVar3.getF134973e()];
                        ArrayList arrayListK2 = n23.j.k(cVar3);
                        p13.c.b bVar2 = new p13.c.b();
                        while (bVar2.hasNext()) {
                            SegmentsFilterDTO.a aVar = (SegmentsFilterDTO.a) bVar2.next();
                            strArr5[aVar.ordinal()] = aVar.a(exploreSegmentsFilterActivity);
                            arrayListK2.add(exploreSegmentsFilterActivity.da(aVar));
                        }
                        SegmentsFilterDTO segmentsFilterDTO3 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO3.getClass();
                        androidx.appcompat.app.e eVarShow2 = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(StringUtils.SPACE).setSingleChoiceItems(strArr5, segmentsFilterDTO3.f41202n.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i112) {
                                int i26 = i18;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i112));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i112));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i112));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        eVarShow2.getClass();
                        String[] strArr6 = (String[]) arrayListK2.toArray(new String[0]);
                        oe2.f.f0(eVarShow2, (String[]) Arrays.copyOf(strArr6, strArr6.length));
                        String string = exploreSegmentsFilterActivity.getString(R.string.lbl_avg_grade);
                        string.getClass();
                        String string2 = exploreSegmentsFilterActivity.getString(R.string.lbl_average_grade);
                        string2.getClass();
                        oe2.f.g0(eVarShow2, string, string2);
                        break;
                    case 3:
                        int i26 = ExploreSegmentsFilterActivity.f41363q;
                        xf1.e[] eVarArr = {xf1.e.TYPE_ALL, xf1.e.TYPE_SPRINT, xf1.e.TYPE_HILL_CLIMB, xf1.e.TYPE_HILLS, xf1.e.TYPE_DOWNHILL, xf1.e.TYPE_OTHER};
                        String[] strArr7 = new String[xf1.e.f190675l.getF134973e()];
                        while (i18 < 6) {
                            xf1.e eVar = eVarArr[i18];
                            strArr7[eVar.ordinal()] = exploreSegmentsFilterActivity.getString(eVar.f190677b);
                            i18++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO4 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO4.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_segment_type).setSingleChoiceItems(strArr7, segmentsFilterDTO4.f41200l.ordinal(), new ag0.d(10, exploreSegmentsFilterActivity, eVarArr)).show();
                        break;
                    default:
                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                        String[] strArr8 = new String[xf1.o.f190711j.getF134973e()];
                        xf1.o[] oVarArr = {xf1.o.TYPE_ALL, xf1.o.TYPE_PAVED, xf1.o.TYPE_GRAVEL, xf1.o.TYPE_DIRT, xf1.o.TYPE_MIXED};
                        while (i18 < 5) {
                            xf1.o oVar = oVarArr[i18];
                            strArr8[oVar.ordinal()] = exploreSegmentsFilterActivity.getString(oVar.f190713b);
                            i18++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO5 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO5.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_surface).setSingleChoiceItems(strArr8, segmentsFilterDTO5.f41203o.ordinal(), new ag0.d(9, exploreSegmentsFilterActivity, oVarArr)).show();
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f41367d = new View.OnClickListener(this) { // from class: cg1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27134b;

            {
                this.f27134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                final int i19 = 0;
                final ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27134b;
                switch (i18) {
                    case 0:
                        int i110 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar = xf1.f.f190681f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            xf1.f fVar = (xf1.f) bVarN.next();
                            strArr[fVar.ordinal()] = exploreSegmentsFilterActivity.getString(fVar.f190683b);
                        }
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.txt_activity_type);
                        String[] strArr2 = strArr;
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        xf1.f fVar2 = segmentsFilterDTO.f41196h;
                        final int i111 = 1;
                        title.setSingleChoiceItems(strArr2, fVar2 != null ? fVar2.ordinal() : -1, new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i112) {
                                int i26 = i111;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i112));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i112));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i112));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        break;
                    case 1:
                        int i112 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar2 = SegmentsFilterDTO.d.f41215g;
                        String[] strArr3 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (true) {
                            final int i24 = 2;
                            if (!bVar.hasNext()) {
                                SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                                segmentsFilterDTO2.getClass();
                                androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_distance).setSingleChoiceItems(strArr3, segmentsFilterDTO2.f41201m.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i113) {
                                        int i26 = i24;
                                        ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                        switch (i26) {
                                            case 0:
                                                int i27 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i113));
                                                dialogInterface.dismiss();
                                                break;
                                            case 1:
                                                int i28 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i113));
                                                dialogInterface.dismiss();
                                                break;
                                            default:
                                                int i29 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i113));
                                                dialogInterface.dismiss();
                                                break;
                                        }
                                    }
                                }).show();
                                eVarShow.getClass();
                                String[] strArr4 = (String[]) arrayListK.toArray(new String[0]);
                                oe2.f.f0(eVarShow, (String[]) Arrays.copyOf(strArr4, strArr4.length));
                            } else {
                                SegmentsFilterDTO.d dVar = (SegmentsFilterDTO.d) bVar.next();
                                strArr3[dVar.ordinal()] = dVar.a(exploreSegmentsFilterActivity);
                                arrayListK.add(oi0.d.a(exploreSegmentsFilterActivity, dVar.a(exploreSegmentsFilterActivity), new e(2)));
                            }
                            break;
                        }
                        break;
                    case 2:
                        int i25 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar3 = SegmentsFilterDTO.a.f41208g;
                        String[] strArr5 = new String[cVar3.getF134973e()];
                        ArrayList arrayListK2 = n23.j.k(cVar3);
                        p13.c.b bVar2 = new p13.c.b();
                        while (bVar2.hasNext()) {
                            SegmentsFilterDTO.a aVar = (SegmentsFilterDTO.a) bVar2.next();
                            strArr5[aVar.ordinal()] = aVar.a(exploreSegmentsFilterActivity);
                            arrayListK2.add(exploreSegmentsFilterActivity.da(aVar));
                        }
                        SegmentsFilterDTO segmentsFilterDTO3 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO3.getClass();
                        androidx.appcompat.app.e eVarShow2 = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(StringUtils.SPACE).setSingleChoiceItems(strArr5, segmentsFilterDTO3.f41202n.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i113) {
                                int i26 = i19;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i113));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i113));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i113));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        eVarShow2.getClass();
                        String[] strArr6 = (String[]) arrayListK2.toArray(new String[0]);
                        oe2.f.f0(eVarShow2, (String[]) Arrays.copyOf(strArr6, strArr6.length));
                        String string = exploreSegmentsFilterActivity.getString(R.string.lbl_avg_grade);
                        string.getClass();
                        String string2 = exploreSegmentsFilterActivity.getString(R.string.lbl_average_grade);
                        string2.getClass();
                        oe2.f.g0(eVarShow2, string, string2);
                        break;
                    case 3:
                        int i26 = ExploreSegmentsFilterActivity.f41363q;
                        xf1.e[] eVarArr = {xf1.e.TYPE_ALL, xf1.e.TYPE_SPRINT, xf1.e.TYPE_HILL_CLIMB, xf1.e.TYPE_HILLS, xf1.e.TYPE_DOWNHILL, xf1.e.TYPE_OTHER};
                        String[] strArr7 = new String[xf1.e.f190675l.getF134973e()];
                        while (i19 < 6) {
                            xf1.e eVar = eVarArr[i19];
                            strArr7[eVar.ordinal()] = exploreSegmentsFilterActivity.getString(eVar.f190677b);
                            i19++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO4 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO4.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_segment_type).setSingleChoiceItems(strArr7, segmentsFilterDTO4.f41200l.ordinal(), new ag0.d(10, exploreSegmentsFilterActivity, eVarArr)).show();
                        break;
                    default:
                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                        String[] strArr8 = new String[xf1.o.f190711j.getF134973e()];
                        xf1.o[] oVarArr = {xf1.o.TYPE_ALL, xf1.o.TYPE_PAVED, xf1.o.TYPE_GRAVEL, xf1.o.TYPE_DIRT, xf1.o.TYPE_MIXED};
                        while (i19 < 5) {
                            xf1.o oVar = oVarArr[i19];
                            strArr8[oVar.ordinal()] = exploreSegmentsFilterActivity.getString(oVar.f190713b);
                            i19++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO5 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO5.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_surface).setSingleChoiceItems(strArr8, segmentsFilterDTO5.f41203o.ordinal(), new ag0.d(9, exploreSegmentsFilterActivity, oVarArr)).show();
                        break;
                }
            }
        };
        final int i18 = 4;
        this.f41368e = new View.OnClickListener(this) { // from class: cg1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27134b;

            {
                this.f27134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i19 = i18;
                final int i110 = 0;
                final ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27134b;
                switch (i19) {
                    case 0:
                        int i111 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar = xf1.f.f190681f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            xf1.f fVar = (xf1.f) bVarN.next();
                            strArr[fVar.ordinal()] = exploreSegmentsFilterActivity.getString(fVar.f190683b);
                        }
                        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.txt_activity_type);
                        String[] strArr2 = strArr;
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        xf1.f fVar2 = segmentsFilterDTO.f41196h;
                        final int i112 = 1;
                        title.setSingleChoiceItems(strArr2, fVar2 != null ? fVar2.ordinal() : -1, new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i113) {
                                int i26 = i112;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i113));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i113));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i113));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        break;
                    case 1:
                        int i113 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar2 = SegmentsFilterDTO.d.f41215g;
                        String[] strArr3 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (true) {
                            final int i24 = 2;
                            if (!bVar.hasNext()) {
                                SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                                segmentsFilterDTO2.getClass();
                                androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_distance).setSingleChoiceItems(strArr3, segmentsFilterDTO2.f41201m.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i114) {
                                        int i26 = i24;
                                        ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                        switch (i26) {
                                            case 0:
                                                int i27 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i114));
                                                dialogInterface.dismiss();
                                                break;
                                            case 1:
                                                int i28 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i114));
                                                dialogInterface.dismiss();
                                                break;
                                            default:
                                                int i29 = ExploreSegmentsFilterActivity.f41363q;
                                                exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i114));
                                                dialogInterface.dismiss();
                                                break;
                                        }
                                    }
                                }).show();
                                eVarShow.getClass();
                                String[] strArr4 = (String[]) arrayListK.toArray(new String[0]);
                                oe2.f.f0(eVarShow, (String[]) Arrays.copyOf(strArr4, strArr4.length));
                            } else {
                                SegmentsFilterDTO.d dVar = (SegmentsFilterDTO.d) bVar.next();
                                strArr3[dVar.ordinal()] = dVar.a(exploreSegmentsFilterActivity);
                                arrayListK.add(oi0.d.a(exploreSegmentsFilterActivity, dVar.a(exploreSegmentsFilterActivity), new e(2)));
                            }
                            break;
                        }
                        break;
                    case 2:
                        int i25 = ExploreSegmentsFilterActivity.f41363q;
                        w13.c cVar3 = SegmentsFilterDTO.a.f41208g;
                        String[] strArr5 = new String[cVar3.getF134973e()];
                        ArrayList arrayListK2 = n23.j.k(cVar3);
                        p13.c.b bVar2 = new p13.c.b();
                        while (bVar2.hasNext()) {
                            SegmentsFilterDTO.a aVar = (SegmentsFilterDTO.a) bVar2.next();
                            strArr5[aVar.ordinal()] = aVar.a(exploreSegmentsFilterActivity);
                            arrayListK2.add(exploreSegmentsFilterActivity.da(aVar));
                        }
                        SegmentsFilterDTO segmentsFilterDTO3 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO3.getClass();
                        androidx.appcompat.app.e eVarShow2 = new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(StringUtils.SPACE).setSingleChoiceItems(strArr5, segmentsFilterDTO3.f41202n.ordinal(), new DialogInterface.OnClickListener() { // from class: cg1.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i114) {
                                int i26 = i110;
                                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity2 = exploreSegmentsFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.fa((SegmentsFilterDTO.a) SegmentsFilterDTO.a.f41208g.get(i114));
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ea((xf1.f) xf1.f.f190681f.get(i114));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = ExploreSegmentsFilterActivity.f41363q;
                                        exploreSegmentsFilterActivity2.ga((SegmentsFilterDTO.d) SegmentsFilterDTO.d.f41215g.get(i114));
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).show();
                        eVarShow2.getClass();
                        String[] strArr6 = (String[]) arrayListK2.toArray(new String[0]);
                        oe2.f.f0(eVarShow2, (String[]) Arrays.copyOf(strArr6, strArr6.length));
                        String string = exploreSegmentsFilterActivity.getString(R.string.lbl_avg_grade);
                        string.getClass();
                        String string2 = exploreSegmentsFilterActivity.getString(R.string.lbl_average_grade);
                        string2.getClass();
                        oe2.f.g0(eVarShow2, string, string2);
                        break;
                    case 3:
                        int i26 = ExploreSegmentsFilterActivity.f41363q;
                        xf1.e[] eVarArr = {xf1.e.TYPE_ALL, xf1.e.TYPE_SPRINT, xf1.e.TYPE_HILL_CLIMB, xf1.e.TYPE_HILLS, xf1.e.TYPE_DOWNHILL, xf1.e.TYPE_OTHER};
                        String[] strArr7 = new String[xf1.e.f190675l.getF134973e()];
                        while (i110 < 6) {
                            xf1.e eVar = eVarArr[i110];
                            strArr7[eVar.ordinal()] = exploreSegmentsFilterActivity.getString(eVar.f190677b);
                            i110++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO4 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO4.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_segment_type).setSingleChoiceItems(strArr7, segmentsFilterDTO4.f41200l.ordinal(), new ag0.d(10, exploreSegmentsFilterActivity, eVarArr)).show();
                        break;
                    default:
                        int i27 = ExploreSegmentsFilterActivity.f41363q;
                        String[] strArr8 = new String[xf1.o.f190711j.getF134973e()];
                        xf1.o[] oVarArr = {xf1.o.TYPE_ALL, xf1.o.TYPE_PAVED, xf1.o.TYPE_GRAVEL, xf1.o.TYPE_DIRT, xf1.o.TYPE_MIXED};
                        while (i110 < 5) {
                            xf1.o oVar = oVarArr[i110];
                            strArr8[oVar.ordinal()] = exploreSegmentsFilterActivity.getString(oVar.f190713b);
                            i110++;
                        }
                        SegmentsFilterDTO segmentsFilterDTO5 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO5.getClass();
                        new androidx.appcompat.app.e.a(exploreSegmentsFilterActivity).setTitle(R.string.lbl_segment_surface).setSingleChoiceItems(strArr8, segmentsFilterDTO5.f41203o.ordinal(), new ag0.d(9, exploreSegmentsFilterActivity, oVarArr)).show();
                        break;
                }
            }
        };
    }

    public final void ca() {
        if (g.f41446b.a() != null) {
            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).a(this, this.f41379p);
        }
        Intent intent = new Intent();
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41369f;
        gCMComplexOneLineButton.getClass();
        intent.putExtra("extra_segment_leaderboard_filter_on", gCMComplexOneLineButton.f47771k.isChecked());
        setResult(-1, intent);
        finish();
    }

    public final String da(SegmentsFilterDTO.a aVar) {
        int i14 = aVar.f41211c;
        int i15 = aVar.f41210b;
        if (i14 != -1) {
            return aVar.a(this);
        }
        int i16 = aVar.f41209a;
        if (i16 == Integer.MIN_VALUE) {
            l3.f23124b.getClass();
            String string = getString(R.string.lbl_less_than, l3.a.A0(this, i15, 0));
            string.getClass();
            return oi0.d.a(this, string, new cg1.e(0));
        }
        if (i15 == Integer.MAX_VALUE) {
            l3.f23124b.getClass();
            String string2 = getString(R.string.lbl_greater_than_value, l3.a.A0(this, i16, 0));
            string2.getClass();
            return string2;
        }
        l3.f23124b.getClass();
        String string3 = getString(R.string.lbl_value1_to_value2, l3.a.A0(this, i16, 0), l3.a.A0(this, i15, 0));
        string3.getClass();
        return oi0.d.a(this, string3, new cg1.e(1));
    }

    public final void ea(xf1.f fVar) {
        SegmentsFilterDTO segmentsFilterDTO = this.f41379p;
        segmentsFilterDTO.getClass();
        segmentsFilterDTO.f41196h = fVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41374k;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(fVar.f190683b));
    }

    public final void fa(SegmentsFilterDTO.a aVar) {
        SegmentsFilterDTO segmentsFilterDTO = this.f41379p;
        segmentsFilterDTO.getClass();
        aVar.getClass();
        segmentsFilterDTO.f41202n = aVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41376m;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.b(aVar.a(this), da(aVar));
    }

    public final void ga(SegmentsFilterDTO.d dVar) {
        SegmentsFilterDTO segmentsFilterDTO = this.f41379p;
        segmentsFilterDTO.getClass();
        dVar.getClass();
        segmentsFilterDTO.f41201m = dVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41375l;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.b(dVar.a(this), oi0.d.a(this, dVar.a(this), new cg1.e(2)));
    }

    public final void ha(xf1.e eVar) {
        SegmentsFilterDTO segmentsFilterDTO = this.f41379p;
        segmentsFilterDTO.getClass();
        eVar.getClass();
        segmentsFilterDTO.f41200l = eVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41377n;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(eVar.f190677b));
    }

    public final void ia(o oVar) {
        SegmentsFilterDTO segmentsFilterDTO = this.f41379p;
        segmentsFilterDTO.getClass();
        oVar.getClass();
        segmentsFilterDTO.f41203o = oVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41378o;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(oVar.f190713b));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o oVar;
        xf1.e eVar;
        SegmentsFilterDTO.a aVar;
        SegmentsFilterDTO.d dVar;
        xf1.f fVar;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_segment_explore_filter);
        initActionBar(true, R.string.lbl_filter);
        View viewFindViewById = findViewById(R.id.segment_explore_entire_layout);
        viewFindViewById.getClass();
        this.f41373j = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.segment_explore_advanced_extra_layout);
        viewFindViewById2.getClass();
        this.f41372i = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.segment_explore_filter_switch);
        viewFindViewById3.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById3;
        this.f41369f = gCMComplexOneLineButton;
        final int i14 = 0;
        gCMComplexOneLineButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: cg1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27144b;

            {
                this.f27144b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i15 = i14;
                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27144b;
                switch (i15) {
                    case 0:
                        int i16 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        LinearLayout linearLayout = exploreSegmentsFilterActivity.f41373j;
                        linearLayout.getClass();
                        linearLayout.setVisibility(z14 ? 0 : 8);
                        exploreSegmentsFilterActivity.ea(xf1.f.ACT_BOTH_RUNNING_AND_CYCLING);
                        GCMComplexOneLineButton gCMComplexOneLineButton2 = exploreSegmentsFilterActivity.f41370g;
                        if (gCMComplexOneLineButton2 != null) {
                            gCMComplexOneLineButton2.i(false);
                        }
                        GCMComplexOneLineButton gCMComplexOneLineButton3 = exploreSegmentsFilterActivity.f41371h;
                        if (gCMComplexOneLineButton3 != null) {
                            gCMComplexOneLineButton3.i(false);
                        }
                        break;
                    case 1:
                        int i17 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        segmentsFilterDTO.f41197i = z14;
                        break;
                    default:
                        int i18 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        LinearLayout linearLayout2 = exploreSegmentsFilterActivity.f41372i;
                        linearLayout2.getClass();
                        linearLayout2.setVisibility(z14 ? 0 : 8);
                        SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO2.getClass();
                        segmentsFilterDTO2.f41204p = z14;
                        if (!z14) {
                            exploreSegmentsFilterActivity.ga(SegmentsFilterDTO.d.ALL);
                            exploreSegmentsFilterActivity.fa(SegmentsFilterDTO.a.ALL);
                            exploreSegmentsFilterActivity.ha(xf1.e.TYPE_ALL);
                            exploreSegmentsFilterActivity.ia(xf1.o.TYPE_ALL);
                        }
                        break;
                }
            }
        });
        View viewFindViewById4 = findViewById(R.id.segment_explore_my_segments_switch);
        viewFindViewById4.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewFindViewById4;
        this.f41370g = gCMComplexOneLineButton2;
        final int i15 = 1;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: cg1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27144b;

            {
                this.f27144b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i16 = i15;
                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27144b;
                switch (i16) {
                    case 0:
                        int i17 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        LinearLayout linearLayout = exploreSegmentsFilterActivity.f41373j;
                        linearLayout.getClass();
                        linearLayout.setVisibility(z14 ? 0 : 8);
                        exploreSegmentsFilterActivity.ea(xf1.f.ACT_BOTH_RUNNING_AND_CYCLING);
                        GCMComplexOneLineButton gCMComplexOneLineButton3 = exploreSegmentsFilterActivity.f41370g;
                        if (gCMComplexOneLineButton3 != null) {
                            gCMComplexOneLineButton3.i(false);
                        }
                        GCMComplexOneLineButton gCMComplexOneLineButton4 = exploreSegmentsFilterActivity.f41371h;
                        if (gCMComplexOneLineButton4 != null) {
                            gCMComplexOneLineButton4.i(false);
                        }
                        break;
                    case 1:
                        int i18 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        segmentsFilterDTO.f41197i = z14;
                        break;
                    default:
                        int i19 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        LinearLayout linearLayout2 = exploreSegmentsFilterActivity.f41372i;
                        linearLayout2.getClass();
                        linearLayout2.setVisibility(z14 ? 0 : 8);
                        SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO2.getClass();
                        segmentsFilterDTO2.f41204p = z14;
                        if (!z14) {
                            exploreSegmentsFilterActivity.ga(SegmentsFilterDTO.d.ALL);
                            exploreSegmentsFilterActivity.fa(SegmentsFilterDTO.a.ALL);
                            exploreSegmentsFilterActivity.ha(xf1.e.TYPE_ALL);
                            exploreSegmentsFilterActivity.ia(xf1.o.TYPE_ALL);
                        }
                        break;
                }
            }
        });
        View viewFindViewById5 = findViewById(R.id.segment_explore_advanced_switch);
        viewFindViewById5.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) viewFindViewById5;
        this.f41371h = gCMComplexOneLineButton3;
        final int i16 = 2;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: cg1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExploreSegmentsFilterActivity f27144b;

            {
                this.f27144b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i17 = i16;
                ExploreSegmentsFilterActivity exploreSegmentsFilterActivity = this.f27144b;
                switch (i17) {
                    case 0:
                        int i18 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        LinearLayout linearLayout = exploreSegmentsFilterActivity.f41373j;
                        linearLayout.getClass();
                        linearLayout.setVisibility(z14 ? 0 : 8);
                        exploreSegmentsFilterActivity.ea(xf1.f.ACT_BOTH_RUNNING_AND_CYCLING);
                        GCMComplexOneLineButton gCMComplexOneLineButton4 = exploreSegmentsFilterActivity.f41370g;
                        if (gCMComplexOneLineButton4 != null) {
                            gCMComplexOneLineButton4.i(false);
                        }
                        GCMComplexOneLineButton gCMComplexOneLineButton5 = exploreSegmentsFilterActivity.f41371h;
                        if (gCMComplexOneLineButton5 != null) {
                            gCMComplexOneLineButton5.i(false);
                        }
                        break;
                    case 1:
                        int i19 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO.getClass();
                        segmentsFilterDTO.f41197i = z14;
                        break;
                    default:
                        int i110 = ExploreSegmentsFilterActivity.f41363q;
                        compoundButton.getClass();
                        LinearLayout linearLayout2 = exploreSegmentsFilterActivity.f41372i;
                        linearLayout2.getClass();
                        linearLayout2.setVisibility(z14 ? 0 : 8);
                        SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsFilterActivity.f41379p;
                        segmentsFilterDTO2.getClass();
                        segmentsFilterDTO2.f41204p = z14;
                        if (!z14) {
                            exploreSegmentsFilterActivity.ga(SegmentsFilterDTO.d.ALL);
                            exploreSegmentsFilterActivity.fa(SegmentsFilterDTO.a.ALL);
                            exploreSegmentsFilterActivity.ha(xf1.e.TYPE_ALL);
                            exploreSegmentsFilterActivity.ia(xf1.o.TYPE_ALL);
                        }
                        break;
                }
            }
        });
        View viewFindViewById6 = findViewById(R.id.segment_explore_filter_activity_type);
        viewFindViewById6.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById6;
        this.f41374k = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f41364a);
        View viewFindViewById7 = findViewById(R.id.segment_explore_filter_distance);
        viewFindViewById7.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) viewFindViewById7;
        this.f41375l = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f41365b);
        View viewFindViewById8 = findViewById(R.id.segment_explore_filter_avg_grade);
        viewFindViewById8.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) viewFindViewById8;
        this.f41376m = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setButtonTopLabelContentDescription(getString(R.string.lbl_average_grade));
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f41376m;
        gCMComplexTwoLineButton4.getClass();
        gCMComplexTwoLineButton4.setOnClickListener(this.f41366c);
        View viewFindViewById9 = findViewById(R.id.segment_explore_filter_segment_type);
        viewFindViewById9.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = (GCMComplexTwoLineButton) viewFindViewById9;
        this.f41377n = gCMComplexTwoLineButton5;
        gCMComplexTwoLineButton5.setOnClickListener(this.f41367d);
        View viewFindViewById10 = findViewById(R.id.segment_explore_filter_surface);
        viewFindViewById10.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = (GCMComplexTwoLineButton) viewFindViewById10;
        this.f41378o = gCMComplexTwoLineButton6;
        gCMComplexTwoLineButton6.setOnClickListener(this.f41368e);
        this.f41379p = g.f41446b.a() != null ? ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).c(this) : null;
        int i17 = 8;
        if (getIntent() != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("extra_segment_leaderboard_filter_on", false);
            GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f41369f;
            if (booleanExtra) {
                gCMComplexOneLineButton4.getClass();
                gCMComplexOneLineButton4.k();
            } else {
                gCMComplexOneLineButton4.getClass();
                gCMComplexOneLineButton4.j();
            }
            LinearLayout linearLayout = this.f41373j;
            linearLayout.getClass();
            linearLayout.setVisibility(booleanExtra ? 0 : 8);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f41370g;
        gCMComplexOneLineButton5.getClass();
        SegmentsFilterDTO segmentsFilterDTO = this.f41379p;
        segmentsFilterDTO.getClass();
        gCMComplexOneLineButton5.i(segmentsFilterDTO.f41197i);
        SegmentsFilterDTO segmentsFilterDTO2 = this.f41379p;
        if (segmentsFilterDTO2 != null && (fVar = segmentsFilterDTO2.f41196h) != null) {
            ea(fVar);
        }
        SegmentsFilterDTO segmentsFilterDTO3 = this.f41379p;
        if (segmentsFilterDTO3 != null && (dVar = segmentsFilterDTO3.f41201m) != null) {
            ga(dVar);
        }
        SegmentsFilterDTO segmentsFilterDTO4 = this.f41379p;
        if (segmentsFilterDTO4 != null && (aVar = segmentsFilterDTO4.f41202n) != null) {
            fa(aVar);
        }
        SegmentsFilterDTO segmentsFilterDTO5 = this.f41379p;
        if (segmentsFilterDTO5 != null && (eVar = segmentsFilterDTO5.f41200l) != null) {
            ha(eVar);
        }
        SegmentsFilterDTO segmentsFilterDTO6 = this.f41379p;
        if (segmentsFilterDTO6 != null && (oVar = segmentsFilterDTO6.f41203o) != null) {
            ia(oVar);
        }
        SegmentsFilterDTO segmentsFilterDTO7 = this.f41379p;
        if (segmentsFilterDTO7 != null) {
            boolean z14 = segmentsFilterDTO7.f41204p;
            GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f41371h;
            if (gCMComplexOneLineButton6 != null) {
                gCMComplexOneLineButton6.i(z14);
            }
        }
        LinearLayout linearLayout2 = this.f41372i;
        if (linearLayout2 != null) {
            GCMComplexOneLineButton gCMComplexOneLineButton7 = this.f41371h;
            if (gCMComplexOneLineButton7 != null && gCMComplexOneLineButton7.f47771k.isChecked()) {
                i17 = 0;
            }
            linearLayout2.setVisibility(i17);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        ca();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/ExploreSegmentsFilterActivity$a;", "", "<init>", "()V", "", "EXTRA_SEGMENT_LEADERBOARD_FILTER_ON", "Ljava/lang/String;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
