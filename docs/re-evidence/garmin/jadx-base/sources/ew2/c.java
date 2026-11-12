package ew2;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i0;
import androidx.media3.common.f0;
import androidx.media3.common.z;
import bi2.k;
import bi2.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.stats.ebike.EBikePerformanceChartsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.BabyMovementActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.PregnancyBloodGlucoseActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.a0;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.collect.ImmutableList;
import com.google.firebase.crashlytics.internal.common.IdManager;
import cx2.i;
import d53.w;
import ew1.h1;
import gg1.h0;
import go1.g0;
import i3.e5;
import ig1.d0;
import ig1.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ls0.m;
import mv2.h;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p005kotlin.jvm.internal.y0;
import p13.u;
import p13.u0;
import pb1.l;
import r22.m0;
import r70.v;
import v.e0;
import zo0.n;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f66896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f66897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f66898e;

    public /* synthetic */ c(Fragment fragment, dx2.c cVar, Map map, zw2.f fVar) {
        this.f66894a = 23;
        this.f66897d = cVar;
        this.f66898e = map;
        this.f66896c = fragment;
        this.f66895b = fVar;
    }

    private final void a(View view2) {
        com.garmin.realtimesettings.app.presentationlayer.c cVar = (com.garmin.realtimesettings.app.presentationlayer.c) this.f66895b;
        dx2.c cVar2 = (dx2.c) this.f66897d;
        Map<String, ? extends Object> map = (Map) this.f66898e;
        String str = (String) this.f66896c;
        i.f56681a.getClass();
        if (i.a.a(cVar)) {
            cVar2.getClass();
            List listR4 = dx2.c.R4(map);
            if (listR4 != null && !listR4.isEmpty()) {
                cVar2.E4(map);
                lv2.a.f115049b.getClass();
                lv2.a.f115048a.getClass();
                lv2.a.C2189a.a(cVar, listR4, cVar2, map, str);
                return;
            }
            lv2.a.f115049b.d(null, "setDoubleLabelSelectionClickListener: Did not get selection options for " + map + ".");
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:12:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:146:0x030d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0311  */
    /* JADX WARN: Code duplicated, block: B:150:0x0323  */
    /* JADX WARN: Code duplicated, block: B:151:0x0327  */
    /* JADX WARN: Code duplicated, block: B:153:0x032b  */
    /* JADX WARN: Code duplicated, block: B:155:0x033d  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:176:0x03cb  */
    private final void b(View view2) {
        int i14;
        mv2.a aVar;
        mv2.a aVar2;
        mv2.a aVar3;
        Integer num;
        NumberPicker numberPicker;
        NumberPicker numberPicker2;
        NumberPicker numberPicker3;
        NumberPicker numberPicker4;
        NumberPicker numberPicker5;
        NumberPicker numberPicker6;
        com.garmin.realtimesettings.app.presentationlayer.c cVar = (com.garmin.realtimesettings.app.presentationlayer.c) this.f66895b;
        mv2.f fVar = (mv2.f) this.f66896c;
        dx2.c cVar2 = (dx2.c) this.f66897d;
        Map map = (Map) this.f66898e;
        i.f56681a.getClass();
        if (i.a.a(cVar)) {
            final h hVar = new h(cVar, fVar, cVar2, map);
            hVar.f121219e.getClass();
            Context context = hVar.f121220f;
            View viewInflate = View.inflate(context, R.layout.rts_time_picker_dialog, null);
            viewInflate.getClass();
            View viewFindViewById = viewInflate.findViewById(R.id.hours_picker);
            viewFindViewById.getClass();
            hVar.f121221g = viewFindViewById;
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.single_number_picker_1);
            viewFindViewById2.getClass();
            hVar.f121222h = (NumberPicker) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.minutes_picker);
            viewFindViewById3.getClass();
            hVar.f121223i = viewFindViewById3;
            View viewFindViewById4 = viewFindViewById3.findViewById(R.id.single_number_picker_1);
            viewFindViewById4.getClass();
            hVar.f121224j = (NumberPicker) viewFindViewById4;
            View viewFindViewById5 = viewInflate.findViewById(R.id.seconds_picker);
            viewFindViewById5.getClass();
            hVar.f121225k = viewFindViewById5;
            View viewFindViewById6 = viewFindViewById5.findViewById(R.id.single_number_picker_1);
            viewFindViewById6.getClass();
            hVar.f121226l = (NumberPicker) viewFindViewById6;
            hVar.f121216b.getClass();
            mv2.e eVarW4 = hVar.f121217c.W4(hVar.f121218d);
            Long lValueOf = eVarW4 != null ? Long.valueOf(eVarW4.f121207a) : null;
            if (eVarW4 != null) {
                long j8 = eVarW4.f121212f;
                if (j8 > 0) {
                    i14 = (int) j8;
                } else {
                    i14 = 1;
                }
            } else {
                i14 = 1;
            }
            mv2.a aVarM = lValueOf != null ? mv2.f.m(lValueOf.longValue()) : new mv2.a(0, 0, 0);
            Long lValueOf2 = eVarW4 != null ? Long.valueOf(eVarW4.f121210d) : null;
            mv2.a aVarM2 = lValueOf2 != null ? mv2.f.m(lValueOf2.longValue()) : new mv2.a(0, 0, 0);
            Long lValueOf3 = eVarW4 != null ? Long.valueOf(eVarW4.f121211e) : null;
            HashMap<String, Object> mapD = u0.d(new p(gw2.i.RTS_MINIMUM_VALUE.f79975a, aVarM2), new p(gw2.i.RTS_MAXIMUM_VALUE.f79975a, lValueOf3 != null ? mv2.f.m(lValueOf3.longValue()) : new mv2.a(23, 59, 59)), new p(gw2.i.RTS_GRANULARITY.f79975a, Integer.valueOf(i14)), new p(gw2.i.RTS_SELECTED_VALUE.f79975a, aVarM));
            hVar.f121230p = mapD;
            Object obj = mapD.get(gw2.i.RTS_MINIMUM_VALUE.f79975a);
            try {
                if (!(obj instanceof mv2.a)) {
                    obj = null;
                }
                aVar = (mv2.a) obj;
            } catch (ClassCastException unused) {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new mv2.a(0, 0, 0);
            }
            hVar.f121231q = aVar;
            HashMap<String, Object> map2 = hVar.f121230p;
            if (map2 == null) {
                s.m(TtmlNode.TAG_METADATA);
                throw null;
            }
            Object obj2 = map2.get(gw2.i.RTS_MAXIMUM_VALUE.f79975a);
            try {
                if (!(obj2 instanceof mv2.a)) {
                    obj2 = null;
                }
                aVar2 = (mv2.a) obj2;
            } catch (ClassCastException unused2) {
                aVar2 = null;
            }
            if (aVar2 == null) {
                aVar2 = new mv2.a(23, 59, 59);
            }
            hVar.f121232r = aVar2;
            HashMap<String, Object> map3 = hVar.f121230p;
            if (map3 == null) {
                s.m(TtmlNode.TAG_METADATA);
                throw null;
            }
            Object obj3 = map3.get(gw2.i.RTS_SELECTED_VALUE.f79975a);
            try {
                if (!(obj3 instanceof mv2.a)) {
                    obj3 = null;
                }
                aVar3 = (mv2.a) obj3;
            } catch (ClassCastException unused3) {
                aVar3 = null;
            }
            if (aVar3 == null) {
                aVar3 = new mv2.a(0, 0, 0);
            }
            hVar.f121233s = aVar3;
            HashMap<String, Object> map4 = hVar.f121230p;
            if (map4 == null) {
                s.m(TtmlNode.TAG_METADATA);
                throw null;
            }
            Object obj4 = map4.get(gw2.i.RTS_GRANULARITY.f79975a);
            try {
                if (!(obj4 instanceof Integer)) {
                    obj4 = null;
                }
                num = (Integer) obj4;
            } catch (ClassCastException unused4) {
                num = null;
            }
            int i15 = 1;
            int iIntValue = num != null ? num.intValue() : 1;
            hVar.B = iIntValue;
            if (iIntValue > 59) {
                View view3 = hVar.f121225k;
                if (view3 == null) {
                    s.m("secondsView");
                    throw null;
                }
                view3.setVisibility(8);
                i15 = hVar.B / 60;
            }
            hVar.C = i15;
            mv2.a aVar4 = hVar.f121231q;
            if (aVar4 == null) {
                s.m("minimumTime");
                throw null;
            }
            int i16 = aVar4.f121196a;
            hVar.f121234t = i16;
            mv2.a aVar5 = hVar.f121232r;
            if (aVar5 == null) {
                s.m("maximumTime");
                throw null;
            }
            int i17 = aVar5.f121196a;
            hVar.f121235u = i17;
            mv2.a aVar6 = hVar.f121233s;
            if (aVar6 == null) {
                s.m("selectedTime");
                throw null;
            }
            int i18 = aVar6.f121196a;
            hVar.f121236v = aVar4.f121197b;
            hVar.f121237w = aVar5.f121197b;
            hVar.f121238x = aVar6.f121197b;
            hVar.f121239y = aVar4.f121198c;
            hVar.f121240z = aVar5.f121198c;
            hVar.A = aVar6.f121198c;
            NumberPicker numberPicker7 = hVar.f121222h;
            if (numberPicker7 == null) {
                s.m("hoursPicker");
                throw null;
            }
            ArrayList arrayList = hVar.f121227m;
            hVar.c(numberPicker7, i16, i17, i18, 1, arrayList);
            NumberPicker numberPicker8 = hVar.f121224j;
            if (numberPicker8 == null) {
                s.m("minutesPicker");
                throw null;
            }
            int i19 = hVar.f121238x;
            int i24 = hVar.C;
            ArrayList arrayList2 = hVar.f121228n;
            hVar.c(numberPicker8, 0, 59, i19, i24, arrayList2);
            NumberPicker numberPicker9 = hVar.f121226l;
            if (numberPicker9 == null) {
                s.m("secondsPicker");
                throw null;
            }
            int i25 = hVar.A;
            int i26 = hVar.B;
            ArrayList arrayList3 = hVar.f121229o;
            hVar.c(numberPicker9, 0, 59, i25, i26, arrayList3);
            NumberPicker numberPicker10 = hVar.f121222h;
            if (numberPicker10 == null) {
                s.m("hoursPicker");
                throw null;
            }
            if (((Number) arrayList.get(numberPicker10.getValue())).intValue() != hVar.f121234t) {
                numberPicker = hVar.f121222h;
                if (numberPicker != null) {
                    s.m("hoursPicker");
                    throw null;
                }
                if (((Number) arrayList.get(numberPicker.getValue())).intValue() == hVar.f121234t) {
                    hVar.b();
                } else {
                    numberPicker2 = hVar.f121222h;
                    if (numberPicker2 != null) {
                        s.m("hoursPicker");
                        throw null;
                    }
                    if (((Number) arrayList.get(numberPicker2.getValue())).intValue() == hVar.f121235u) {
                        hVar.a();
                    }
                }
            } else {
                NumberPicker numberPicker11 = hVar.f121222h;
                if (numberPicker11 == null) {
                    s.m("hoursPicker");
                    throw null;
                }
                if (((Number) arrayList.get(numberPicker11.getValue())).intValue() == hVar.f121235u) {
                    NumberPicker numberPicker12 = hVar.f121224j;
                    if (numberPicker12 == null) {
                        s.m("minutesPicker");
                        throw null;
                    }
                    hVar.c(numberPicker12, hVar.f121236v, hVar.f121237w, ((Number) arrayList2.get(numberPicker12.getValue())).intValue(), hVar.C, arrayList2);
                    NumberPicker numberPicker13 = hVar.f121224j;
                    if (numberPicker13 == null) {
                        s.m("minutesPicker");
                        throw null;
                    }
                    if (((Number) arrayList2.get(numberPicker13.getValue())).intValue() != hVar.f121236v) {
                        numberPicker3 = hVar.f121224j;
                        if (numberPicker3 != null) {
                            s.m("minutesPicker");
                            throw null;
                        }
                        if (((Number) arrayList2.get(numberPicker3.getValue())).intValue() == hVar.f121236v) {
                            numberPicker6 = hVar.f121226l;
                            if (numberPicker6 != null) {
                                s.m("secondsPicker");
                                throw null;
                            }
                            hVar.c(numberPicker6, hVar.f121239y, 59, hVar.A, hVar.B, arrayList3);
                        } else {
                            numberPicker4 = hVar.f121224j;
                            if (numberPicker4 != null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            if (((Number) arrayList2.get(numberPicker4.getValue())).intValue() == hVar.f121237w) {
                                numberPicker5 = hVar.f121226l;
                                if (numberPicker5 != null) {
                                    s.m("secondsPicker");
                                    throw null;
                                }
                                hVar.c(numberPicker5, 0, hVar.f121240z, hVar.A, hVar.B, arrayList3);
                            }
                        }
                    } else {
                        NumberPicker numberPicker14 = hVar.f121224j;
                        if (numberPicker14 == null) {
                            s.m("minutesPicker");
                            throw null;
                        }
                        if (((Number) arrayList2.get(numberPicker14.getValue())).intValue() == hVar.f121237w) {
                            NumberPicker numberPicker15 = hVar.f121226l;
                            if (numberPicker15 == null) {
                                s.m("secondsPicker");
                                throw null;
                            }
                            hVar.c(numberPicker15, hVar.f121239y, hVar.f121240z, hVar.A, hVar.B, arrayList3);
                        } else {
                            numberPicker3 = hVar.f121224j;
                            if (numberPicker3 != null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            if (((Number) arrayList2.get(numberPicker3.getValue())).intValue() == hVar.f121236v) {
                                numberPicker6 = hVar.f121226l;
                                if (numberPicker6 != null) {
                                    s.m("secondsPicker");
                                    throw null;
                                }
                                hVar.c(numberPicker6, hVar.f121239y, 59, hVar.A, hVar.B, arrayList3);
                            } else {
                                numberPicker4 = hVar.f121224j;
                                if (numberPicker4 != null) {
                                    s.m("minutesPicker");
                                    throw null;
                                }
                                if (((Number) arrayList2.get(numberPicker4.getValue())).intValue() == hVar.f121237w) {
                                    numberPicker5 = hVar.f121226l;
                                    if (numberPicker5 != null) {
                                        s.m("secondsPicker");
                                        throw null;
                                    }
                                    hVar.c(numberPicker5, 0, hVar.f121240z, hVar.A, hVar.B, arrayList3);
                                }
                            }
                        }
                    }
                } else {
                    numberPicker = hVar.f121222h;
                    if (numberPicker != null) {
                        s.m("hoursPicker");
                        throw null;
                    }
                    if (((Number) arrayList.get(numberPicker.getValue())).intValue() == hVar.f121234t) {
                        hVar.b();
                    } else {
                        numberPicker2 = hVar.f121222h;
                        if (numberPicker2 != null) {
                            s.m("hoursPicker");
                            throw null;
                        }
                        if (((Number) arrayList.get(numberPicker2.getValue())).intValue() == hVar.f121235u) {
                            hVar.a();
                        }
                    }
                }
            }
            NumberPicker numberPicker16 = hVar.f121222h;
            if (numberPicker16 == null) {
                s.m("hoursPicker");
                throw null;
            }
            final int i27 = 0;
            numberPicker16.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: mv2.g
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker17, int i28, int i29) {
                    switch (i27) {
                        case 0:
                            h hVar2 = hVar;
                            ArrayList arrayList4 = hVar2.f121227m;
                            ArrayList arrayList5 = hVar2.f121229o;
                            ArrayList arrayList6 = hVar2.f121228n;
                            cx2.h hVar3 = hVar2.f121219e;
                            NumberPicker numberPicker18 = hVar2.f121222h;
                            if (numberPicker18 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList4.get(numberPicker18.getValue())).intValue() == hVar2.f121234t) {
                                hVar3.getClass();
                                hVar2.b();
                                return;
                            }
                            NumberPicker numberPicker19 = hVar2.f121222h;
                            if (numberPicker19 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList4.get(numberPicker19.getValue())).intValue() == hVar2.f121235u) {
                                hVar3.getClass();
                                hVar2.a();
                                return;
                            }
                            hVar3.getClass();
                            NumberPicker numberPicker20 = hVar2.f121224j;
                            if (numberPicker20 == null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            hVar2.c(numberPicker20, 0, 59, ((Number) arrayList6.get(numberPicker20.getValue())).intValue(), 1, arrayList6);
                            NumberPicker numberPicker21 = hVar2.f121226l;
                            if (numberPicker21 != null) {
                                hVar2.c(numberPicker21, 0, 59, ((Number) arrayList5.get(numberPicker21.getValue())).intValue(), hVar2.B, arrayList5);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                        default:
                            h hVar4 = hVar;
                            ArrayList arrayList7 = hVar4.f121227m;
                            ArrayList arrayList8 = hVar4.f121228n;
                            cx2.h hVar5 = hVar4.f121219e;
                            ArrayList arrayList9 = hVar4.f121229o;
                            NumberPicker numberPicker22 = hVar4.f121222h;
                            if (numberPicker22 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList7.get(numberPicker22.getValue())).intValue() == hVar4.f121234t) {
                                NumberPicker numberPicker23 = hVar4.f121224j;
                                if (numberPicker23 == null) {
                                    s.m("minutesPicker");
                                    throw null;
                                }
                                if (((Number) arrayList8.get(numberPicker23.getValue())).intValue() == hVar4.f121236v) {
                                    hVar5.getClass();
                                    NumberPicker numberPicker24 = hVar4.f121226l;
                                    if (numberPicker24 != null) {
                                        hVar4.c(numberPicker24, hVar4.f121239y, 59, ((Number) arrayList9.get(numberPicker24.getValue())).intValue(), hVar4.B, arrayList9);
                                        return;
                                    } else {
                                        s.m("secondsPicker");
                                        throw null;
                                    }
                                }
                            }
                            NumberPicker numberPicker25 = hVar4.f121222h;
                            if (numberPicker25 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList7.get(numberPicker25.getValue())).intValue() == hVar4.f121235u) {
                                NumberPicker numberPicker26 = hVar4.f121224j;
                                if (numberPicker26 == null) {
                                    s.m("minutesPicker");
                                    throw null;
                                }
                                if (((Number) arrayList8.get(numberPicker26.getValue())).intValue() == hVar4.f121237w) {
                                    hVar5.getClass();
                                    NumberPicker numberPicker27 = hVar4.f121226l;
                                    if (numberPicker27 != null) {
                                        hVar4.c(numberPicker27, 0, hVar4.f121240z, ((Number) arrayList9.get(numberPicker27.getValue())).intValue(), hVar4.B, arrayList9);
                                        return;
                                    } else {
                                        s.m("secondsPicker");
                                        throw null;
                                    }
                                }
                            }
                            hVar5.getClass();
                            NumberPicker numberPicker28 = hVar4.f121226l;
                            if (numberPicker28 != null) {
                                hVar4.c(numberPicker28, 0, 59, ((Number) arrayList9.get(numberPicker28.getValue())).intValue(), hVar4.B, arrayList9);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                    }
                }
            });
            NumberPicker numberPicker17 = hVar.f121224j;
            if (numberPicker17 == null) {
                s.m("minutesPicker");
                throw null;
            }
            final int i28 = 1;
            numberPicker17.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: mv2.g
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker18, int i29, int i210) {
                    switch (i28) {
                        case 0:
                            h hVar2 = hVar;
                            ArrayList arrayList4 = hVar2.f121227m;
                            ArrayList arrayList5 = hVar2.f121229o;
                            ArrayList arrayList6 = hVar2.f121228n;
                            cx2.h hVar3 = hVar2.f121219e;
                            NumberPicker numberPicker19 = hVar2.f121222h;
                            if (numberPicker19 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList4.get(numberPicker19.getValue())).intValue() == hVar2.f121234t) {
                                hVar3.getClass();
                                hVar2.b();
                                return;
                            }
                            NumberPicker numberPicker110 = hVar2.f121222h;
                            if (numberPicker110 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList4.get(numberPicker110.getValue())).intValue() == hVar2.f121235u) {
                                hVar3.getClass();
                                hVar2.a();
                                return;
                            }
                            hVar3.getClass();
                            NumberPicker numberPicker20 = hVar2.f121224j;
                            if (numberPicker20 == null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            hVar2.c(numberPicker20, 0, 59, ((Number) arrayList6.get(numberPicker20.getValue())).intValue(), 1, arrayList6);
                            NumberPicker numberPicker21 = hVar2.f121226l;
                            if (numberPicker21 != null) {
                                hVar2.c(numberPicker21, 0, 59, ((Number) arrayList5.get(numberPicker21.getValue())).intValue(), hVar2.B, arrayList5);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                        default:
                            h hVar4 = hVar;
                            ArrayList arrayList7 = hVar4.f121227m;
                            ArrayList arrayList8 = hVar4.f121228n;
                            cx2.h hVar5 = hVar4.f121219e;
                            ArrayList arrayList9 = hVar4.f121229o;
                            NumberPicker numberPicker22 = hVar4.f121222h;
                            if (numberPicker22 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList7.get(numberPicker22.getValue())).intValue() == hVar4.f121234t) {
                                NumberPicker numberPicker23 = hVar4.f121224j;
                                if (numberPicker23 == null) {
                                    s.m("minutesPicker");
                                    throw null;
                                }
                                if (((Number) arrayList8.get(numberPicker23.getValue())).intValue() == hVar4.f121236v) {
                                    hVar5.getClass();
                                    NumberPicker numberPicker24 = hVar4.f121226l;
                                    if (numberPicker24 != null) {
                                        hVar4.c(numberPicker24, hVar4.f121239y, 59, ((Number) arrayList9.get(numberPicker24.getValue())).intValue(), hVar4.B, arrayList9);
                                        return;
                                    } else {
                                        s.m("secondsPicker");
                                        throw null;
                                    }
                                }
                            }
                            NumberPicker numberPicker25 = hVar4.f121222h;
                            if (numberPicker25 == null) {
                                s.m("hoursPicker");
                                throw null;
                            }
                            if (((Number) arrayList7.get(numberPicker25.getValue())).intValue() == hVar4.f121235u) {
                                NumberPicker numberPicker26 = hVar4.f121224j;
                                if (numberPicker26 == null) {
                                    s.m("minutesPicker");
                                    throw null;
                                }
                                if (((Number) arrayList8.get(numberPicker26.getValue())).intValue() == hVar4.f121237w) {
                                    hVar5.getClass();
                                    NumberPicker numberPicker27 = hVar4.f121226l;
                                    if (numberPicker27 != null) {
                                        hVar4.c(numberPicker27, 0, hVar4.f121240z, ((Number) arrayList9.get(numberPicker27.getValue())).intValue(), hVar4.B, arrayList9);
                                        return;
                                    } else {
                                        s.m("secondsPicker");
                                        throw null;
                                    }
                                }
                            }
                            hVar5.getClass();
                            NumberPicker numberPicker28 = hVar4.f121226l;
                            if (numberPicker28 != null) {
                                hVar4.c(numberPicker28, 0, 59, ((Number) arrayList9.get(numberPicker28.getValue())).intValue(), hVar4.B, arrayList9);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                    }
                }
            });
            mv2.e eVarW5 = hVar.f121217c.W4(hVar.f121218d);
            tv2.c cVar3 = eVarW5 != null ? eVarW5.f121209c : null;
            mv2.f fVar2 = hVar.f121216b;
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.RTSBaseDialogStyle).setTitle(new ev2.d(fVar2.b(eVarW5 != null ? eVarW5.f121208b : null), fVar2.b(cVar3), null, 4, null).f66170b).setPositiveButton(context.getString(R.string.lbl_ok), new kx0.f(hVar, 10)).setNegativeButton(context.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate).create();
            e.a aVar7 = e.f66901a;
            alertDialogCreate.getClass();
            aVar7.getClass();
            e.a.b(alertDialogCreate, context);
        }
    }

    private final void c(View view2) {
        com.garmin.realtimesettings.app.presentationlayer.c cVar = (com.garmin.realtimesettings.app.presentationlayer.c) this.f66895b;
        nv2.e eVar = (nv2.e) this.f66896c;
        dx2.c cVar2 = (dx2.c) this.f66897d;
        Map map = (Map) this.f66898e;
        i.f56681a.getClass();
        if (i.a.a(cVar)) {
            nv2.f fVar = new nv2.f(cVar, eVar, cVar2, map);
            fVar.f127980e.getClass();
            fVar.f127977b.getClass();
            nv2.d dVarV4 = fVar.f127978c.V4(fVar.f127979d);
            long j8 = dVarV4 != null ? dVarV4.f127973a : 0L;
            long j14 = DateTimeConstants.SECONDS_PER_HOUR;
            HashMap mapD = u0.d(new p(gw2.i.RTS_SELECTED_HOURS.f79975a, Integer.valueOf((int) (j8 / j14))), new p(gw2.i.RTS_SELECTED_MINUTES.f79975a, Integer.valueOf((int) ((j8 % j14) / ((long) 60)))), new p(gw2.i.TIME_FORMAT.f79975a, Boolean.valueOf(dVarV4 != null ? dVarV4.f127975c : true)));
            Object obj = mapD.get(gw2.i.RTS_SELECTED_HOURS.f79975a);
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = mapD.get(gw2.i.RTS_SELECTED_MINUTES.f79975a);
            obj2.getClass();
            int iIntValue2 = ((Integer) obj2).intValue();
            Object obj3 = mapD.get(gw2.i.TIME_FORMAT.f79975a);
            obj3.getClass();
            TimePickerDialog timePickerDialog = new TimePickerDialog(fVar.f127981f, R.style.RTSTimePickerDialogStyle, new m(fVar, 6), iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
            e.f66901a.getClass();
            e.a.b(timePickerDialog, fVar.f127981f);
        }
    }

    private final void d(View view2) {
        androidx.fragment.app.m mVar = (androidx.fragment.app.m) this.f66895b;
        l lVar = (l) this.f66896c;
        p0 p0Var = (p0) this.f66897d;
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) this.f66898e;
        l.a aVar = l.f136861l;
        h0[] h0VarArrValues = h0.values();
        ArrayList arrayList = new ArrayList(h0VarArrValues.length);
        for (h0 h0Var : h0VarArrValues) {
            arrayList.add(lVar.getString(h0Var.f77243b));
        }
        new androidx.appcompat.app.e.a(mVar).setTitle(lVar.getString(R.string.lbl_units)).setSingleChoiceItems((String[]) arrayList.toArray(new String[0]), p0Var.f105807a, (DialogInterface.OnClickListener) null).setNegativeButton(lVar.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(lVar.getString(R.string.lbl_done), new k(lVar, 25, p0Var, userSettingsDTO)).show();
    }

    private final void e(View view2) {
        androidx.fragment.app.m mVar = (androidx.fragment.app.m) this.f66895b;
        l lVar = (l) this.f66896c;
        p0 p0Var = (p0) this.f66897d;
        db1.m mVar2 = (db1.m) this.f66898e;
        l.a aVar = l.f136861l;
        db1.b[] bVarArrValues = db1.b.values();
        ArrayList arrayList = new ArrayList(bVarArrValues.length);
        for (db1.b bVar : bVarArrValues) {
            arrayList.add(bVar.a(mVar));
        }
        new androidx.appcompat.app.e.a(mVar).setTitle(lVar.getString(R.string.pregnancy_expecting)).setSingleChoiceItems((String[]) arrayList.toArray(new String[0]), p0Var.f105807a, (DialogInterface.OnClickListener) null).setNegativeButton(lVar.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(lVar.getString(R.string.lbl_done), new c32.c(lVar, mVar, p0Var, mVar2, 9)).show();
    }

    private final void f(View view2) {
        ((com.garmin.feature.garminpay.ui.userwallet.c) this.f66895b).f52258b.startActivity(FitPayAddCardActivity.a.c(FitPayAddCardActivity.f51376x, null, (String) this.f66896c, (String) this.f66897d, (String) this.f66898e, gp2.g.VERIFY_CREDENTIAL, gp2.b.LOAD_CREDENTIAL_REQUIRED_FIELDS));
    }

    private final void g(View view2) {
        ge1.b.T((i0) this.f66895b, null, null, new tu1.d((View) this.f66896c, (Context) this.f66897d, (e23.a) this.f66898e, null), 3);
    }

    private final void h(View view2) {
        a0 a0Var = (a0) this.f66895b;
        String[] strArr = (String[]) this.f66896c;
        p0 p0Var = (p0) this.f66897d;
        List list = (List) this.f66898e;
        a0.a aVar = a0.I1;
        rk1.b.e eVar = new rk1.b.e(a0Var.requireContext());
        eVar.h(strArr, false);
        String string = a0Var.getString(R.string.time_zone);
        rk1.b.d dVar = eVar.f153344b;
        dVar.f153346b = string;
        eVar.e(0);
        eVar.d(strArr.length - 1);
        eVar.c(Integer.valueOf(p0Var.f105807a));
        dVar.f153345a = 1;
        eVar.f(new t0(list, 2, a0Var, p0Var));
        eVar.a();
    }

    private final void i(View view2) {
        com.garmin.realtimesettings.app.presentationlayer.c cVar = (com.garmin.realtimesettings.app.presentationlayer.c) this.f66895b;
        vv2.d dVar = (vv2.d) this.f66896c;
        dx2.c cVar2 = (dx2.c) this.f66897d;
        Map map = (Map) this.f66898e;
        i.f56681a.getClass();
        if (i.a.a(cVar)) {
            dVar.h(cVar2, map, "");
        }
    }

    private final void j(View view2) {
        Map map;
        dx2.c cVar = (dx2.c) this.f66897d;
        Map map2 = (Map) this.f66898e;
        Fragment fragment = (Fragment) this.f66896c;
        zw2.f fVar = (zw2.f) this.f66895b;
        cx2.h hVar = wu2.a.f187328b;
        cVar.getClass();
        dx2.c.P4(map2);
        hVar.getClass();
        i.f56681a.getClass();
        if (i.a.a(fragment)) {
            Integer numP4 = dx2.c.P4(map2);
            if (numP4 == null) {
                map2.toString();
                Logger logger = cx2.h.f56678c;
                return;
            }
            int iIntValue = numP4.intValue();
            Object obj = map2.get(gw2.i.ACTION_OPTIONS.f79975a);
            try {
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                map = (Map) obj;
            } catch (ClassCastException unused) {
                map = null;
            }
            wu2.b bVarZ4 = map != null ? dx2.c.z4(map) : null;
            if (bVarZ4 == null) {
                wu2.a.f187327a.getClass();
                wu2.a.a(fragment, cVar, iIntValue);
                return;
            }
            int i14 = cVar.f61484a.f154869i;
            wu2.i iVar = wu2.i.f187354a;
            wu2.a.C3485a c3485a = new wu2.a.C3485a(iIntValue);
            iVar.getClass();
            wu2.i.a(fragment, c3485a, cVar, fVar, bVarZ4);
        }
    }

    private final void k(View view2) {
        Map map;
        yv2.f fVar = (yv2.f) this.f66895b;
        dx2.c cVar = (dx2.c) this.f66897d;
        Map<String, ? extends Object> map2 = (Map) this.f66898e;
        com.garmin.realtimesettings.app.presentationlayer.c cVar2 = (com.garmin.realtimesettings.app.presentationlayer.c) this.f66896c;
        yv2.c cVar3 = yv2.c.f199858a;
        cVar.getClass();
        boolean zZ4 = cVar.Z4(map2);
        rw2.a aVar = cVar.f61484a;
        if (zZ4) {
            return;
        }
        String str = aVar.f154870j;
        if (str == null) {
            yv2.c cVar4 = yv2.c.f199858a;
            i.f56681a.getClass();
            if (i.a.a(cVar2)) {
                cVar4.getClass();
                wu2.b bVarZ4 = dx2.c.z4(map2);
                if (bVarZ4 == null) {
                    yv2.c.a(cVar2, cVar, map2, fVar);
                    return;
                }
                yv2.b bVar = new yv2.b(fVar, map2);
                wu2.i.f187354a.getClass();
                wu2.i.a(cVar2, bVar, cVar, fVar, bVarZ4);
                return;
            }
            return;
        }
        i.f56681a.getClass();
        if (!i.a.b(cVar2) || cVar.Z4(map2)) {
            return;
        }
        cVar2.f52658r.set(map2);
        g.f66907a.getClass();
        g.f66908b.getClass();
        Object obj = map2.get(gw2.i.TITLE.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map = (Map) obj;
        } catch (ClassCastException unused) {
            map = null;
        }
        String.valueOf(map != null ? map.get(gw2.i.TEXT.f79975a) : null);
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        vw2.a aVarA = com.garmin.realtimesettings.app.initialization.b.a();
        Context contextRequireContext = cVar2.requireContext();
        contextRequireContext.getClass();
        Intent intentG = aVarA.g(contextRequireContext, str);
        if (intentG != null) {
            cVar2.f52659t.a(intentG, null);
        } else {
            g.f66908b.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    private final void l(View view2) {
        Intent intentG;
        com.garmin.android.apps.connectmobile.badges.service.model.p pVar = (com.garmin.android.apps.connectmobile.badges.service.model.p) this.f66895b;
        z12.e eVar = (z12.e) this.f66896c;
        Context context = (Context) this.f66897d;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar = (com.garmin.android.apps.connectmobile.badges.service.model.m) this.f66898e;
        if (pVar != null) {
            z12.e.a aVar = z12.e.f201385c;
            intentG = null;
            if (s.g(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName(), pVar.getDisplayName())) {
                intentG = eVar.f201387b.g(mVar.getBadgeId(), context);
            } else {
                String displayName = pVar.getDisplayName();
                if (displayName != null) {
                    intentG = eVar.f201387b.u(context, mVar.getBadgeId(), displayName);
                }
            }
        } else {
            intentG = eVar.f201387b.g(mVar.getBadgeId(), context);
        }
        context.startActivity(intentG);
    }

    /* JADX WARN: Code duplicated, block: B:381:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:382:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:384:0x0ad4  */
    /* JADX WARN: Code duplicated, block: B:386:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:387:0x0adf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v84, types: [zo0.c] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        HashMap map;
        final HashMap mapD;
        ArrayList arrayList;
        Map map2;
        Object obj;
        int i14;
        String str;
        List listW;
        int iM;
        String str2;
        String str3;
        String str4;
        String str5;
        int i15;
        int i16;
        r22.u0 u0Var;
        String strJ;
        long unitID;
        String str6;
        int i17 = this.f66894a;
        final int i18 = 2;
        final int i19 = 0;
        final int i24 = 1;
        Object obj2 = this.f66898e;
        Object obj3 = this.f66897d;
        Object obj4 = this.f66896c;
        Object obj5 = this.f66895b;
        switch (i17) {
            case 0:
                d.a aVar = d.f66899a;
                ((d) obj5).a((Fragment) obj4, (dx2.c) obj3, (Map) obj2);
                return;
            case 1:
                o.a aVar2 = o.E;
                PregnancyBloodGlucoseActivity.f40449c.getClass();
                ((o) obj2).startActivityForResult(PregnancyBloodGlucoseActivity.a.a((LocalDate) obj5, (Context) obj4, null, (ArrayList) obj3), 26);
                return;
            case 2:
                o.a aVar3 = o.E;
                BabyMovementActivity.f40448c.getClass();
                ((o) obj5).startActivityForResult(BabyMovementActivity.a.a((LocalDate) obj4, (Context) obj3, (ww0.b) obj2, -1), 25);
                return;
            case 3:
                com.garmin.realtimesettings.app.presentationlayer.c cVar = (com.garmin.realtimesettings.app.presentationlayer.c) obj5;
                fv2.g gVar = (fv2.g) obj4;
                dx2.c cVar2 = (dx2.c) obj3;
                Map map3 = (Map) obj2;
                i.f56681a.getClass();
                if (i.a.a(cVar)) {
                    fv2.h hVar = new fv2.h(cVar, gVar, cVar2, map3);
                    cx2.h hVar2 = fv2.h.f73755f;
                    hVar2.getClass();
                    fv2.g gVar2 = hVar.f73757b;
                    gVar2.getClass();
                    fv2.f fVarB4 = hVar.f73758c.B4(hVar.f73759d);
                    if (fVarB4 != null) {
                        map = new HashMap();
                        fv2.b bVar = fVarB4.f73752c;
                        if (bVar != null) {
                            map.put(gw2.i.RTS_MINIMUM_VALUE.f79975a, new DateTime(bVar.f73741c, bVar.f73739a, bVar.f73740b, 0, 0));
                        }
                        fv2.b bVar2 = fVarB4.f73753d;
                        if (bVar2 != null) {
                            map.put(gw2.i.RTS_MAXIMUM_VALUE.f79975a, new DateTime(bVar2.f73741c, bVar2.f73739a, bVar2.f73740b, 0, 0));
                        }
                        fv2.b bVar3 = fVarB4.f73751b;
                        if (bVar3 != null) {
                            map.put(gw2.i.RTS_SELECTED_VALUE.f79975a, new DateTime(bVar3.f73741c, bVar3.f73739a, bVar3.f73740b, 0, 0));
                        }
                    } else {
                        gVar2.f73754c.d(null, "getMetaDataFromDataModel: Unable to get date options from device.");
                        map = null;
                    }
                    Context context = hVar.f73760e;
                    if (map == null) {
                        hVar2.d(null, "showDatePicker: Did not get date picker values");
                        e.a.a(e.f66901a, context, context.getString(R.string.unable_to_update_settings), context.getString(R.string.unable_to_update_settings_description), new p(hVar.f73756a.requireContext().getString(R.string.lbl_ok), new fn.f(23)), null, 880).show();
                        return;
                    }
                    DateTime dateTimeNow = (DateTime) map.get(gw2.i.RTS_SELECTED_VALUE.f79975a);
                    if (dateTimeNow == null) {
                        dateTimeNow = DateTime.now();
                    }
                    DateTime dateTime = (DateTime) map.get(gw2.i.RTS_MINIMUM_VALUE.f79975a);
                    DateTime dateTime2 = (DateTime) map.get(gw2.i.RTS_MAXIMUM_VALUE.f79975a);
                    DatePickerDialog datePickerDialog = new DatePickerDialog(hVar.f73760e, R.style.RTSDatePickerDialogStyle, new bi2.p(hVar, 1), dateTimeNow.getYear(), dateTimeNow.getMonthOfYear() - 1, dateTimeNow.getDayOfMonth());
                    if (dateTime != null) {
                        datePickerDialog.getDatePicker().setMinDate(dateTime.getMillis());
                    }
                    if (dateTime2 != null) {
                        datePickerDialog.getDatePicker().setMaxDate(dateTime2.getMillis());
                    }
                    e.f66901a.getClass();
                    e.a.b(datePickerDialog, context);
                    return;
                }
                return;
            case 4:
                im.b bVar4 = (im.b) obj5;
                EBikePerformanceChartsActivity.a aVar4 = EBikePerformanceChartsActivity.f29816a;
                FullscreenChartActivity.pa((EBikePerformanceChartsActivity) obj4, new ArrayList((ArrayList) obj3), new im.e(bVar4.getB1(), bVar4.K0(), null), Boolean.FALSE, (fz.c) obj2);
                return;
            case 5:
                com.garmin.realtimesettings.app.presentationlayer.c cVar3 = (com.garmin.realtimesettings.app.presentationlayer.c) obj5;
                gv2.e eVar = (gv2.e) obj4;
                dx2.c cVar4 = (dx2.c) obj3;
                Map map4 = (Map) obj2;
                i.f56681a.getClass();
                if (i.a.a(cVar3)) {
                    final gv2.h hVar3 = new gv2.h(cVar3, eVar, cVar4, map4);
                    Fragment fragment = hVar3.f79468a;
                    View viewInflate = View.inflate(fragment.requireContext(), R.layout.rts_float_picker, null);
                    viewInflate.getClass();
                    View viewFindViewById = viewInflate.findViewById(R.id.number_picker);
                    viewFindViewById.getClass();
                    hVar3.f79473f = viewFindViewById;
                    View viewFindViewById2 = viewFindViewById.findViewById(R.id.single_number_picker_1);
                    viewFindViewById2.getClass();
                    hVar3.f79474g = (NumberPicker) viewFindViewById2;
                    View viewFindViewById3 = viewInflate.findViewById(R.id.decimal_picker);
                    viewFindViewById3.getClass();
                    hVar3.f79475h = viewFindViewById3;
                    View viewFindViewById4 = viewFindViewById3.findViewById(R.id.single_number_picker_1);
                    viewFindViewById4.getClass();
                    hVar3.f79476i = (NumberPicker) viewFindViewById4;
                    View viewFindViewById5 = viewInflate.findViewById(R.id.float_picker_unit);
                    viewFindViewById5.getClass();
                    hVar3.f79477j = (StyledTextView) viewFindViewById5;
                    gv2.e eVar2 = hVar3.f79469b;
                    eVar2.getClass();
                    cx2.h hVar4 = gv2.e.f79462c;
                    Map<String, ? extends Object> map5 = hVar3.f79471d;
                    map5.toString();
                    hVar4.getClass();
                    dx2.c cVar5 = hVar3.f79470c;
                    gv2.d dVarG4 = cVar5.G4(map5);
                    if (dVarG4 == null) {
                        mapD = null;
                    } else {
                        double d14 = dVarG4.f79458e;
                        double d15 = dVarG4.f79459f;
                        double d16 = dVarG4.f79461h;
                        int i25 = dVarG4.f79460g;
                        String str7 = "%.";
                        double d17 = d14;
                        String strF = e0.f(i25, "%.", "f");
                        x0 x0Var = x0.f105818a;
                        double d18 = Double.parseDouble(String.format(Locale.ENGLISH, strF, Arrays.copyOf(new Object[]{Double.valueOf(d16)}, 1)));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList2 = null;
                        while (d17 <= d15) {
                            x0 x0Var2 = x0.f105818a;
                            double d19 = d15;
                            Locale locale = Locale.ENGLISH;
                            Object[] objArr = {Double.valueOf(d17)};
                            double d24 = d18;
                            double d25 = Double.parseDouble(String.format(locale, strF, Arrays.copyOf(objArr, 1)));
                            int i26 = (int) d25;
                            if (linkedHashMap.containsKey(Integer.valueOf(i26))) {
                                arrayList = arrayList2;
                            } else {
                                arrayList = new ArrayList();
                                linkedHashMap.put(Integer.valueOf(i26), arrayList);
                            }
                            String str8 = str7;
                            String str9 = String.format(locale, e0.f(i25, str7, "f"), Arrays.copyOf(new Object[]{Double.valueOf(d25)}, 1));
                            String string = str9.subSequence(w.H(str9, ".", 0, false, 6) + 1, str9.length()).toString();
                            if (arrayList == null) {
                                s.m("decimalValues");
                                throw null;
                            }
                            arrayList.add(string);
                            d17 = d25 + d24;
                            d18 = d24;
                            str7 = str8;
                            arrayList2 = arrayList;
                            d15 = d19;
                        }
                        double d26 = dVarG4.f79454a;
                        x0 x0Var3 = x0.f105818a;
                        mapD = u0.d(new p(gw2.i.RTS_FLOAT_PICKER.f79975a, linkedHashMap), new p(gw2.i.RTS_SELECTED_VALUE.f79975a, String.format(Locale.ENGLISH, strF, Arrays.copyOf(new Object[]{Double.valueOf(d26)}, 1))));
                    }
                    cx2.h hVar5 = hVar3.f79472e;
                    if (mapD != null && !mapD.isEmpty()) {
                        NumberPicker numberPicker = hVar3.f79474g;
                        if (numberPicker == null) {
                            s.m(r3);
                            throw null;
                        }
                        NumberPicker numberPicker2 = hVar3.f79476i;
                        String str10 = "decimalPicker";
                        if (numberPicker2 == null) {
                            s.m("decimalPicker");
                            throw null;
                        }
                        gw2.i iVar = gw2.i.RTS_FLOAT_PICKER;
                        if (mapD.containsKey(iVar.f79975a)) {
                            Object obj6 = mapD.get(iVar.f79975a);
                            try {
                                if (!y0.h(obj6)) {
                                    obj6 = null;
                                }
                                map2 = (Map) obj6;
                            } catch (ClassCastException unused) {
                                map2 = null;
                            }
                            if (map2 == null || map2.isEmpty()) {
                                str10 = "decimalPicker";
                                hVar5.d(null, "Did not receive number picker values");
                            } else {
                                int[] iArrA1 = p13.h0.a1(map2.keySet());
                                if (iArrA1.length == 0) {
                                    hVar5.d(null, "Did not get the integer values.");
                                    str10 = "decimalPicker";
                                } else {
                                    int length = iArrA1.length;
                                    hVar3.f79479l = new String[length];
                                    for (int i27 = 0; i27 < length; i27++) {
                                        hVar3.f79479l[i27] = String.valueOf(iArrA1[i27]);
                                    }
                                    numberPicker.setMinValue(0);
                                    numberPicker.setMaxValue(hVar3.f79479l.length - 1);
                                    numberPicker.setDisplayedValues(hVar3.f79479l);
                                    String str11 = hVar3.f79479l[0];
                                    int i28 = str11 != null ? Integer.parseInt(str11) : 0;
                                    gw2.i iVar2 = gw2.i.RTS_SELECTED_VALUE;
                                    if (mapD.containsKey(iVar2.f79975a)) {
                                        Object obj7 = mapD.get(iVar2.f79975a);
                                        try {
                                            if (!(obj7 instanceof String)) {
                                                obj7 = null;
                                            }
                                            str = (String) obj7;
                                        } catch (ClassCastException unused2) {
                                            str = null;
                                        }
                                        if (str == null || str.length() == 0) {
                                            i14 = 0;
                                        } else {
                                            i14 = 0;
                                            if (!w.z(str, ".", false)) {
                                            }
                                            listW = w.W(str.toString(), new String[]{"."});
                                            i28 = Integer.parseInt((String) listW.get(i14));
                                            if (listW.isEmpty()) {
                                                obj = "0";
                                            } else {
                                                iM = u.M(hVar3.f79479l, listW.get(i14));
                                                if (iM < 0) {
                                                    str2 = hVar3.f79479l[i14];
                                                    if (str2 != null) {
                                                        iM = Integer.parseInt(str2);
                                                    } else {
                                                        iM = 0;
                                                    }
                                                }
                                                numberPicker.setValue(iM);
                                                obj = listW.get(1);
                                                i14 = iM;
                                            }
                                        }
                                        str = IdManager.DEFAULT_VERSION_NAME;
                                        listW = w.W(str.toString(), new String[]{"."});
                                        i28 = Integer.parseInt((String) listW.get(i14));
                                        if (listW.isEmpty()) {
                                            obj = "0";
                                        } else {
                                            iM = u.M(hVar3.f79479l, listW.get(i14));
                                            if (iM < 0) {
                                                str2 = hVar3.f79479l[i14];
                                                if (str2 != null) {
                                                    iM = Integer.parseInt(str2);
                                                } else {
                                                    iM = 0;
                                                }
                                            }
                                            numberPicker.setValue(iM);
                                            obj = listW.get(1);
                                            i14 = iM;
                                        }
                                    } else {
                                        obj = "0";
                                        i14 = 0;
                                    }
                                    List list = (List) map2.get(Integer.valueOf(i28));
                                    if (list == null) {
                                        list = (List) map2.get(Integer.valueOf(i14));
                                    }
                                    if (list != null) {
                                        int size = list.size();
                                        hVar3.f79478k = new String[size];
                                        for (int i29 = 0; i29 < size; i29++) {
                                            hVar3.f79478k[i29] = list.get(i29);
                                        }
                                        numberPicker2.setMinValue(0);
                                        numberPicker2.setMaxValue(hVar3.f79478k.length - 1);
                                        numberPicker2.setDisplayedValues(hVar3.f79478k);
                                        numberPicker2.setValue(u.M(hVar3.f79478k, obj));
                                    } else {
                                        hVar5.d(null, "Did not get the decimal values.");
                                        hVar3.f79478k = new String[]{"0"};
                                    }
                                }
                            }
                        } else {
                            str10 = "decimalPicker";
                        }
                        gv2.d dVarG5 = cVar5.G4(map5);
                        final double d27 = dVarG5 != null ? dVarG5.f79459f : 0.0d;
                        hVar5.getClass();
                        NumberPicker numberPicker3 = hVar3.f79474g;
                        if (numberPicker3 == null) {
                            s.m("numberPicker");
                            throw null;
                        }
                        numberPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: gv2.f
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.widget.NumberPicker.OnValueChangeListener
                            public final void onValueChange(NumberPicker numberPicker4, int i30, int i34) {
                                Map map6;
                                Object obj8 = mapD.get(gw2.i.RTS_FLOAT_PICKER.f79975a);
                                try {
                                    if (!y0.h(obj8)) {
                                        obj8 = null;
                                    }
                                    map6 = (Map) obj8;
                                } catch (ClassCastException unused3) {
                                    map6 = null;
                                }
                                if (map6 != null) {
                                    h hVar6 = hVar3;
                                    String[] strArr = hVar6.f79479l;
                                    NumberPicker numberPicker5 = hVar6.f79474g;
                                    if (numberPicker5 == null) {
                                        s.m("numberPicker");
                                        throw null;
                                    }
                                    String str12 = strArr[numberPicker5.getValue()];
                                    String[] strArr2 = hVar6.f79478k;
                                    NumberPicker numberPicker6 = hVar6.f79476i;
                                    if (numberPicker6 == null) {
                                        s.m("decimalPicker");
                                        throw null;
                                    }
                                    String str13 = strArr2[numberPicker6.getValue()];
                                    NumberPicker numberPicker7 = hVar6.f79474g;
                                    if (numberPicker7 == null) {
                                        s.m("numberPicker");
                                        throw null;
                                    }
                                    List list2 = (List) map6.get(Integer.valueOf(numberPicker7.getValue()));
                                    if (list2 != null) {
                                        int size2 = list2.size();
                                        hVar6.f79478k = new String[size2];
                                        for (int i35 = 0; i35 < size2; i35++) {
                                            hVar6.f79478k[i35] = list2.get(i35);
                                        }
                                        NumberPicker numberPicker8 = hVar6.f79476i;
                                        if (numberPicker8 == null) {
                                            s.m("decimalPicker");
                                            throw null;
                                        }
                                        numberPicker8.setDisplayedValues(null);
                                        NumberPicker numberPicker9 = hVar6.f79476i;
                                        if (numberPicker9 == null) {
                                            s.m("decimalPicker");
                                            throw null;
                                        }
                                        numberPicker9.setMinValue(0);
                                        NumberPicker numberPicker10 = hVar6.f79476i;
                                        if (numberPicker10 == null) {
                                            s.m("decimalPicker");
                                            throw null;
                                        }
                                        numberPicker10.setMaxValue(hVar6.f79478k.length - 1);
                                        NumberPicker numberPicker11 = hVar6.f79476i;
                                        if (numberPicker11 == null) {
                                            s.m("decimalPicker");
                                            throw null;
                                        }
                                        numberPicker11.setDisplayedValues(hVar6.f79478k);
                                        double d28 = Double.parseDouble(str12 + "." + str13);
                                        hVar6.f79472e.getClass();
                                        if (d28 > d27) {
                                            NumberPicker numberPicker12 = hVar6.f79476i;
                                            if (numberPicker12 != null) {
                                                numberPicker12.setValue(0);
                                                return;
                                            } else {
                                                s.m("decimalPicker");
                                                throw null;
                                            }
                                        }
                                        int iM2 = u.M(hVar6.f79478k, str13);
                                        NumberPicker numberPicker13 = hVar6.f79476i;
                                        if (iM2 >= 0) {
                                            if (numberPicker13 != null) {
                                                numberPicker13.setValue(iM2);
                                                return;
                                            } else {
                                                s.m("decimalPicker");
                                                throw null;
                                            }
                                        }
                                        if (numberPicker13 == null) {
                                            s.m("decimalPicker");
                                            throw null;
                                        }
                                        numberPicker13.setValue(0);
                                    }
                                }
                            }
                        });
                        NumberPicker numberPicker4 = hVar3.f79476i;
                        if (numberPicker4 == null) {
                            s.m(str10);
                            throw null;
                        }
                        numberPicker4.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: gv2.g
                            @Override // android.widget.NumberPicker.OnValueChangeListener
                            public final void onValueChange(NumberPicker numberPicker5, int i30, int i34) {
                                h hVar6 = hVar3;
                                String[] strArr = hVar6.f79479l;
                                NumberPicker numberPicker6 = hVar6.f79474g;
                                if (numberPicker6 == null) {
                                    s.m("numberPicker");
                                    throw null;
                                }
                                String str12 = strArr[numberPicker6.getValue()];
                                String[] strArr2 = hVar6.f79478k;
                                NumberPicker numberPicker7 = hVar6.f79476i;
                                if (numberPicker7 == null) {
                                    s.m("decimalPicker");
                                    throw null;
                                }
                                double d28 = Double.parseDouble(str12 + "." + strArr2[numberPicker7.getValue()]);
                                hVar6.f79472e.getClass();
                                if (d28 > d27) {
                                    NumberPicker numberPicker8 = hVar6.f79474g;
                                    if (numberPicker8 != null) {
                                        numberPicker8.setValue(numberPicker8.getValue() - 1);
                                    } else {
                                        s.m("numberPicker");
                                        throw null;
                                    }
                                }
                            }
                        });
                        break;
                    } else {
                        hVar5.getClass();
                        Toast.makeText(fragment.requireContext(), R.string.txt_something_went_wrong_try_again, 0).show();
                    }
                    gv2.e.f79462c.getClass();
                    gv2.d dVarG6 = cVar5.G4(map5);
                    ev2.d dVar = new ev2.d(eVar2.b(dVarG6 != null ? dVarG6.f79455b : null), eVar2.b(dVarG6 != null ? dVarG6.f79456c : null), eVar2.b(dVarG6 != null ? dVarG6.f79457d : null));
                    StyledTextView styledTextView = hVar3.f79477j;
                    if (styledTextView == null) {
                        s.m("floatPickerUnit");
                        throw null;
                    }
                    cx2.g.g(styledTextView, dVar.f66171c);
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(viewInflate.getContext(), R.style.RTSBaseDialogStyle).setTitle(dVar.f66170b).setPositiveButton(fragment.requireContext().getString(R.string.lbl_ok), new h1(hVar3, 11)).setNegativeButton(viewInflate.getContext().getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate).create();
                    e.a aVar5 = e.f66901a;
                    alertDialogCreate.getClass();
                    Context contextRequireContext = fragment.requireContext();
                    contextRequireContext.getClass();
                    aVar5.getClass();
                    e.a.b(alertDialogCreate, contextRequireContext);
                    return;
                }
                return;
            case 6:
                com.garmin.realtimesettings.app.presentationlayer.c cVar6 = (com.garmin.realtimesettings.app.presentationlayer.c) obj5;
                hv2.e eVar3 = (hv2.e) obj4;
                dx2.c cVar7 = (dx2.c) obj3;
                Map map6 = (Map) obj2;
                i.f56681a.getClass();
                if (i.a.a(cVar6)) {
                    hv2.f fVar = new hv2.f(cVar6, eVar3, cVar7, map6);
                    fVar.f85913e.getClass();
                    Context context2 = fVar.f85914f;
                    View viewInflate2 = View.inflate(context2, R.layout.rts_height_picker, null);
                    viewInflate2.getClass();
                    NumberPicker numberPicker5 = (NumberPicker) viewInflate2.findViewById(R.id.double_number_picker_1);
                    StyledTextView styledTextView2 = (StyledTextView) viewInflate2.findViewById(R.id.double_label_1);
                    numberPicker5.getClass();
                    styledTextView2.getClass();
                    fVar.a(1, numberPicker5, styledTextView2);
                    NumberPicker numberPicker6 = (NumberPicker) viewInflate2.findViewById(R.id.double_number_picker_2);
                    StyledTextView styledTextView3 = (StyledTextView) viewInflate2.findViewById(R.id.double_label_2);
                    numberPicker6.getClass();
                    styledTextView3.getClass();
                    fVar.a(2, numberPicker6, styledTextView3);
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context2, R.style.RTSBaseDialogStyle).setTitle(fVar.f85910b.f(fVar.f85911c, fVar.f85912d)).setPositiveButton(context2.getString(R.string.lbl_ok), new k(fVar, 17, numberPicker5, numberPicker6)).setNegativeButton(context2.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setView(viewInflate2).create();
                    e.a aVar6 = e.f66901a;
                    alertDialogCreate2.getClass();
                    aVar6.getClass();
                    e.a.b(alertDialogCreate2, context2);
                    if (numberPicker5.getValue() >= fVar.f85915g) {
                        numberPicker6.setMaxValue(fVar.f85917i);
                    } else {
                        numberPicker6.setMaxValue(fVar.f85916h);
                    }
                    numberPicker5.setOnValueChangedListener(new t(1, numberPicker5, numberPicker6, fVar));
                    return;
                }
                return;
            case 7:
                d0 d0Var = (d0) obj5;
                int i30 = d0.f93294l;
                new com.garmin.android.apps.connectmobile.settings.activityoptions.b(d0Var.f70343a, new hc0.c(3, d0Var, (com.garmin.android.apps.connectmobile.devices.model.f) obj4), d0Var.f93324g.getButtonRightLabel(), d0Var.f70343a.getString(R.string.lbl_distance), 8192, (String) obj3, "0123456789.", d0Var.f93295j, -1, -1).f41720h.setContentDescription((String) obj2);
                return;
            case 8:
                com.garmin.realtimesettings.app.presentationlayer.c cVar8 = (com.garmin.realtimesettings.app.presentationlayer.c) obj5;
                iv2.e eVar4 = (iv2.e) obj4;
                dx2.c cVar9 = (dx2.c) obj3;
                Map map7 = (Map) obj2;
                i.f56681a.getClass();
                if (i.a.a(cVar8)) {
                    iv2.g gVar3 = new iv2.g(cVar8, eVar4, cVar9, map7);
                    gVar3.f95237e.getClass();
                    Fragment fragment2 = gVar3.f95233a;
                    View viewInflate3 = View.inflate(fragment2.requireContext(), R.layout.rts_integer_input_view, null);
                    viewInflate3.getClass();
                    gVar3.f95238f = viewInflate3;
                    View viewFindViewById6 = viewInflate3.findViewById(R.id.input_view_edit_text);
                    viewFindViewById6.getClass();
                    gVar3.f95239g = (EditText) viewFindViewById6;
                    View view3 = gVar3.f95238f;
                    if (view3 == null) {
                        s.m("view");
                        throw null;
                    }
                    View viewFindViewById7 = view3.findViewById(R.id.input_view_title_text_view);
                    viewFindViewById7.getClass();
                    gVar3.f95240h = (StyledTextView) viewFindViewById7;
                    View view4 = gVar3.f95238f;
                    if (view4 == null) {
                        s.m("view");
                        throw null;
                    }
                    View viewFindViewById8 = view4.findViewById(R.id.input_view_use_default_button);
                    viewFindViewById8.getClass();
                    gVar3.f95241i = (StyledTextView) viewFindViewById8;
                    View view5 = gVar3.f95238f;
                    if (view5 == null) {
                        s.m("view");
                        throw null;
                    }
                    View viewFindViewById9 = view5.findViewById(R.id.usage_description_text_view);
                    viewFindViewById9.getClass();
                    gVar3.f95242j = (StyledTextView) viewFindViewById9;
                    View view6 = gVar3.f95238f;
                    if (view6 == null) {
                        s.m("view");
                        throw null;
                    }
                    View viewFindViewById10 = view6.findViewById(R.id.input_view_error_text_view);
                    viewFindViewById10.getClass();
                    gVar3.f95243k = (StyledTextView) viewFindViewById10;
                    iv2.e eVar5 = gVar3.f95234b;
                    eVar5.getClass();
                    iv2.d dVarJ4 = gVar3.f95235c.J4(gVar3.f95236d);
                    HashMap mapD2 = dVarJ4 != null ? u0.d(new p(gw2.i.TITLE.f79975a, eVar5.b(dVarJ4.f95229g)), new p(gw2.i.MINIMUM_VALUE.f79975a, Integer.valueOf(dVarJ4.f95226d)), new p(gw2.i.MAXIMUM_VALUE.f79975a, Integer.valueOf(dVarJ4.f95227e)), new p(gw2.i.RTS_SELECTED_VALUE.f79975a, Integer.valueOf(dVarJ4.f95223a)), new p(gw2.i.DEFAULT_VALUE.f79975a, Integer.valueOf(dVarJ4.f95228f)), new p(gw2.i.INFORMATION_MESSAGE.f79975a, eVar5.b(dVarJ4.f95230h)), new p(gw2.i.ERROR_MESSAGE.f79975a, eVar5.b(dVarJ4.f95231i))) : null;
                    if (mapD2 == null) {
                        e.a aVar7 = e.f66901a;
                        androidx.fragment.app.m mVarRequireActivity = fragment2.requireActivity();
                        mVarRequireActivity.getClass();
                        String string2 = fragment2.getString(R.string.txt_something_went_wrong_try_again);
                        string2.getClass();
                        e.a.d(aVar7, mVarRequireActivity, string2);
                        return;
                    }
                    Object obj8 = mapD2.get(gw2.i.TITLE.f79975a);
                    try {
                        if (!(obj8 instanceof String)) {
                            obj8 = null;
                        }
                        str3 = (String) obj8;
                        break;
                    } catch (ClassCastException unused3) {
                        str3 = null;
                    }
                    cx2.b.a aVar8 = cx2.b.f56665a;
                    String strValueOf = String.valueOf(mapD2.get(gw2.i.MINIMUM_VALUE.f79975a));
                    aVar8.getClass();
                    gVar3.f95245m = cx2.b.a.c(strValueOf);
                    gVar3.f95246n = cx2.b.a.c(String.valueOf(mapD2.get(gw2.i.MAXIMUM_VALUE.f79975a)));
                    gVar3.f95247o = cx2.b.a.c(String.valueOf(mapD2.get(gw2.i.DEFAULT_VALUE.f79975a)));
                    gVar3.f95248p = cx2.b.a.c(String.valueOf(mapD2.get(gw2.i.RTS_SELECTED_VALUE.f79975a)));
                    Object obj9 = mapD2.get(gw2.i.INFORMATION_MESSAGE.f79975a);
                    try {
                        if (!(obj9 instanceof String)) {
                            obj9 = null;
                        }
                        str4 = (String) obj9;
                        break;
                    } catch (ClassCastException unused4) {
                        str4 = null;
                    }
                    Object obj10 = mapD2.get(gw2.i.ERROR_MESSAGE.f79975a);
                    try {
                        if (!(obj10 instanceof String)) {
                            obj10 = null;
                        }
                        str5 = (String) obj10;
                        break;
                    } catch (ClassCastException unused5) {
                        str5 = null;
                    }
                    if (str3 == null || str3.length() == 0) {
                        StyledTextView styledTextView4 = gVar3.f95240h;
                        if (styledTextView4 == null) {
                            s.m("titleTextView");
                            throw null;
                        }
                        styledTextView4.setVisibility(8);
                    } else {
                        StyledTextView styledTextView5 = gVar3.f95240h;
                        if (styledTextView5 == null) {
                            s.m("titleTextView");
                            throw null;
                        }
                        styledTextView5.setText(str3);
                    }
                    int i34 = gVar3.f95247o;
                    StyledTextView styledTextView6 = gVar3.f95241i;
                    if (i34 >= 0) {
                        if (styledTextView6 == null) {
                            s.m("useDefaultButton");
                            throw null;
                        }
                        styledTextView6.setVisibility(0);
                    } else {
                        if (styledTextView6 == null) {
                            s.m("useDefaultButton");
                            throw null;
                        }
                        styledTextView6.setVisibility(8);
                    }
                    if (str4 == null || str4.length() == 0) {
                        StyledTextView styledTextView7 = gVar3.f95242j;
                        if (styledTextView7 == null) {
                            s.m("usageDescription");
                            throw null;
                        }
                        i15 = 8;
                        styledTextView7.setVisibility(8);
                    } else {
                        StyledTextView styledTextView8 = gVar3.f95242j;
                        if (styledTextView8 == null) {
                            s.m("usageDescription");
                            throw null;
                        }
                        styledTextView8.setVisibility(0);
                        StyledTextView styledTextView9 = gVar3.f95242j;
                        if (styledTextView9 == null) {
                            s.m("usageDescription");
                            throw null;
                        }
                        styledTextView9.setText(str4);
                        i15 = 8;
                    }
                    if (str5 == null || str5.length() == 0) {
                        StyledTextView styledTextView10 = gVar3.f95243k;
                        if (styledTextView10 == null) {
                            s.m("errorMessageText");
                            throw null;
                        }
                        styledTextView10.setVisibility(8);
                    } else {
                        StyledTextView styledTextView11 = gVar3.f95243k;
                        if (styledTextView11 == null) {
                            s.m("errorMessageText");
                            throw null;
                        }
                        styledTextView11.setVisibility(i15);
                        StyledTextView styledTextView12 = gVar3.f95243k;
                        if (styledTextView12 == null) {
                            s.m("errorMessageText");
                            throw null;
                        }
                        styledTextView12.setText(str5);
                    }
                    StyledTextView styledTextView13 = gVar3.f95241i;
                    if (styledTextView13 == null) {
                        s.m("useDefaultButton");
                        throw null;
                    }
                    styledTextView13.setText(styledTextView13.getContext().getString(R.string.common_use_default));
                    styledTextView13.setOnClickListener(new g0(gVar3, 24));
                    AlertDialog.Builder negativeButton = new AlertDialog.Builder(fragment2.requireContext(), R.style.RTSBaseDialogStyle).setPositiveButton(fragment2.requireContext().getString(R.string.lbl_done), (DialogInterface.OnClickListener) null).setNegativeButton(fragment2.requireContext().getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null);
                    View view7 = gVar3.f95238f;
                    if (view7 == null) {
                        s.m("view");
                        throw null;
                    }
                    AlertDialog alertDialogCreate3 = negativeButton.setView(view7).create();
                    alertDialogCreate3.getClass();
                    int i35 = gVar3.f95248p;
                    String strValueOf2 = i35 >= 0 ? String.valueOf(i35) : "";
                    EditText editText = gVar3.f95239g;
                    if (editText == null) {
                        s.m("inputField");
                        throw null;
                    }
                    editText.setText(strValueOf2);
                    editText.requestFocus();
                    editText.setSelection(0, strValueOf2.length());
                    editText.setOnKeyListener(new bi2.a(gVar3, editText, alertDialogCreate3, 1));
                    editText.addTextChangedListener(new iv2.f(gVar3));
                    Window window = alertDialogCreate3.getWindow();
                    if (window != null) {
                        window.setSoftInputMode(4);
                    }
                    alertDialogCreate3.setOnShowListener(new bi2.d(alertDialogCreate3, gVar3, i18));
                    e.a aVar9 = e.f66901a;
                    Context contextRequireContext2 = fragment2.requireContext();
                    contextRequireContext2.getClass();
                    aVar9.getClass();
                    e.a.b(alertDialogCreate3, contextRequireContext2);
                    return;
                }
                return;
            case 9:
                com.garmin.realtimesettings.app.presentationlayer.c cVar10 = (com.garmin.realtimesettings.app.presentationlayer.c) obj5;
                jv2.e eVar6 = (jv2.e) obj4;
                dx2.c cVar11 = (dx2.c) obj3;
                Map map8 = (Map) obj2;
                i.f56681a.getClass();
                if (i.a.a(cVar10)) {
                    jv2.f fVar2 = new jv2.f(cVar10, eVar6, cVar11, map8);
                    cx2.h hVar6 = fVar2.f101208e;
                    hVar6.getClass();
                    Context context3 = fVar2.f101209f;
                    View viewInflate4 = View.inflate(context3, R.layout.rts_integer_picker_view, null);
                    viewInflate4.getClass();
                    fVar2.f101211h = viewInflate4;
                    View viewFindViewById11 = viewInflate4.findViewById(R.id.number_picker);
                    viewFindViewById11.getClass();
                    fVar2.f101212i = viewFindViewById11;
                    View viewFindViewById12 = viewFindViewById11.findViewById(R.id.single_number_picker_1);
                    viewFindViewById12.getClass();
                    fVar2.f101213j = (NumberPicker) viewFindViewById12;
                    View view8 = fVar2.f101211h;
                    if (view8 == null) {
                        s.m("view");
                        throw null;
                    }
                    View viewFindViewById13 = view8.findViewById(R.id.integer_picker_unit);
                    viewFindViewById13.getClass();
                    fVar2.f101214k = (StyledTextView) viewFindViewById13;
                    NumberPicker numberPicker7 = fVar2.f101213j;
                    if (numberPicker7 == null) {
                        s.m("numberPicker");
                        throw null;
                    }
                    jv2.e eVar7 = fVar2.f101205b;
                    eVar7.getClass();
                    dx2.c cVar12 = fVar2.f101206c;
                    Map<String, ? extends Object> map9 = fVar2.f101207d;
                    jv2.d dVarK4 = cVar12.K4(map9);
                    if (dVarK4 == null || (i16 = dVarK4.f101203g) <= 0) {
                        i16 = 1;
                    }
                    HashMap mapD3 = dVarK4 != null ? u0.d(new p(gw2.i.RTS_MINIMUM_VALUE.f79975a, Integer.valueOf(dVarK4.f101201e)), new p(gw2.i.RTS_MAXIMUM_VALUE.f79975a, Integer.valueOf(dVarK4.f101202f)), new p(gw2.i.RTS_SELECTED_VALUE.f79975a, Integer.valueOf(dVarK4.f101197a)), new p(gw2.i.RTS_GRANULARITY.f79975a, Integer.valueOf(i16))) : null;
                    if (mapD3 == null || mapD3.isEmpty()) {
                        Logger logger = cx2.h.f56678c;
                        numberPicker7.setVisibility(8);
                    } else {
                        gw2.i iVar3 = gw2.i.RTS_GRANULARITY;
                        boolean zContainsKey = mapD3.containsKey(iVar3.f79975a);
                        ArrayList arrayList3 = fVar2.f101210g;
                        if (zContainsKey) {
                            cx2.b.a aVar10 = cx2.b.f56665a;
                            String strValueOf3 = String.valueOf(mapD3.get(gw2.i.RTS_MINIMUM_VALUE.f79975a));
                            aVar10.getClass();
                            int iC = cx2.b.a.c(strValueOf3);
                            int iC2 = cx2.b.a.c(String.valueOf(mapD3.get(gw2.i.RTS_MAXIMUM_VALUE.f79975a)));
                            int iC3 = cx2.b.a.c(String.valueOf(mapD3.get(iVar3.f79975a)));
                            int i36 = (iC2 - iC) / iC3;
                            int i37 = i36 + 1;
                            if (i37 > 0) {
                                String[] strArr = new String[i37];
                                int iD = 0;
                                while (iC <= iC2) {
                                    strArr[iD] = String.valueOf(iC);
                                    iD = e5.d(iC, iD, arrayList3, 1);
                                    iC += iC3;
                                }
                                numberPicker7.setMinValue(0);
                                numberPicker7.setMaxValue(i36);
                                numberPicker7.setDisplayedValues(strArr);
                            } else {
                                hVar6.d(null, "Size for the integer array is less than 0. Mininum value is greater than maximum value.");
                                numberPicker7.setVisibility(8);
                            }
                        } else {
                            cx2.b.a aVar11 = cx2.b.f56665a;
                            String strValueOf4 = String.valueOf(mapD3.get(gw2.i.RTS_MINIMUM_VALUE.f79975a));
                            aVar11.getClass();
                            numberPicker7.setMinValue(cx2.b.a.c(strValueOf4));
                            numberPicker7.setMaxValue(cx2.b.a.c(String.valueOf(mapD3.get(gw2.i.RTS_MAXIMUM_VALUE.f79975a))));
                        }
                        gw2.i iVar4 = gw2.i.RTS_SELECTED_VALUE;
                        if (mapD3.containsKey(iVar4.f79975a)) {
                            Object obj11 = mapD3.get(iVar4.f79975a);
                            obj11.getClass();
                            Integer num = (Integer) obj11;
                            int iIntValue = num.intValue();
                            if (arrayList3.size() > 0) {
                                numberPicker7.setValue(arrayList3.indexOf(num));
                            } else {
                                numberPicker7.setValue(iIntValue);
                            }
                        }
                    }
                    jv2.d dVarK5 = cVar12.K4(map9);
                    ev2.d dVar2 = new ev2.d(eVar7.b(dVarK5 != null ? dVarK5.f101198b : null), eVar7.b(dVarK5 != null ? dVarK5.f101199c : null), eVar7.b(dVarK5 != null ? dVarK5.f101200d : null));
                    StyledTextView styledTextView14 = fVar2.f101214k;
                    if (styledTextView14 == null) {
                        s.m("numberPickerUnit");
                        throw null;
                    }
                    cx2.g.g(styledTextView14, dVar2.f66171c);
                    AlertDialog.Builder negativeButton2 = new AlertDialog.Builder(context3, R.style.RTSBaseDialogStyle).setTitle(dVar2.f66170b).setPositiveButton(context3.getString(R.string.lbl_ok), new h1(fVar2, 26)).setNegativeButton(context3.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null);
                    View view9 = fVar2.f101211h;
                    if (view9 == null) {
                        s.m("view");
                        throw null;
                    }
                    AlertDialog alertDialogCreate4 = negativeButton2.setView(view9).create();
                    e.a aVar12 = e.f66901a;
                    alertDialogCreate4.getClass();
                    aVar12.getClass();
                    e.a.b(alertDialogCreate4, context3);
                    return;
                }
                return;
            case 10:
                androidx.media3.ui.c.l lVar = (androidx.media3.ui.c.l) obj5;
                z zVar = (z) obj4;
                androidx.media3.common.e0 e0Var = (androidx.media3.common.e0) obj3;
                androidx.media3.ui.c.k kVar = (androidx.media3.ui.c.k) obj2;
                if (zVar.isCommandAvailable(29)) {
                    zVar.c(zVar.getTrackSelectionParameters().a().f(new f0(e0Var, ImmutableList.of(Integer.valueOf(kVar.f10102b)))).j(kVar.f10101a.f8304b.f8216c).a());
                    lVar.onTrackSelection(kVar.f10103c);
                    androidx.media3.ui.c.this.f10057k.dismiss();
                    return;
                }
                return;
            case 11:
                ei2.e eVar8 = (ei2.e) obj5;
                ii2.b bVar5 = (ii2.b) obj4;
                Map<String, ? extends Object> map10 = (Map) obj2;
                lh2.p.a aVar13 = (lh2.p.a) obj3;
                bVar5.getClass();
                eVar8.n(bVar5, map10, null);
                String strI4 = ii2.b.I4(map10);
                eVar8.r(strI4 != null ? strI4 : "");
                aVar13.l2();
                return;
            case 12:
                int i38 = lh2.t.f112552e;
                ((ei2.h) obj5).n((ii2.b) obj4, (Map) obj2, Boolean.valueOf(!((lh2.t) obj3).switchView.isChecked()));
                return;
            case 13:
                a(view2);
                return;
            case 14:
                String str12 = (String) obj5;
                m10.c cVar13 = (m10.c) obj4;
                String str13 = (String) obj3;
                String str14 = (String) obj2;
                m10.c.a aVar14 = m10.c.f115765g;
                if (TextUtils.isEmpty(str12)) {
                    return;
                }
                UserProfileActivity.a aVar15 = UserProfileActivity.f46494x;
                Context context4 = cVar13.f115766a;
                str12.getClass();
                aVar15.getClass();
                UserProfileActivity.a.c(context4, str12, str13, str14);
                return;
            case 15:
                b(view2);
                return;
            case 16:
                c(view2);
                return;
            case 17:
                d(view2);
                return;
            case 18:
                e(view2);
                return;
            case 19:
                f(view2);
                return;
            case 20:
                g(view2);
                return;
            case 21:
                h(view2);
                return;
            case 22:
                i(view2);
                return;
            case 23:
                j(view2);
                return;
            case 24:
                k(view2);
                return;
            case 25:
                l(view2);
                return;
            default:
                final d31.d dVar3 = (d31.d) obj5;
                final zo0.d dVar4 = (zo0.d) obj4;
                n nVar = (n) obj3;
                Context context5 = (Context) obj2;
                int i39 = zo0.d.f206108j;
                ht.a aVar16 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new p("FeatureType", dVar3.name()));
                aVar16.getClass();
                ht.a.a(bundleA, "OnboardingNotNowClicked");
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: zo0.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view10) {
                        int i44 = i19;
                        d dVar5 = dVar4;
                        d31.d dVar6 = dVar3;
                        switch (i44) {
                            case 0:
                                int i45 = d.f206108j;
                                ht.a aVar17 = ht.a.f85464a;
                                Bundle bundleA2 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar17.getClass();
                                ht.a.a(bundleA2, "OnboardingReminderTomorrowClicked");
                                i31.z zVar2 = dVar5.f206114f;
                                ge1.b.T(zVar2, null, null, new i31.y(zVar2, dVar6, 1, null), 3);
                                break;
                            case 1:
                                int i46 = d.f206108j;
                                ht.a aVar18 = ht.a.f85464a;
                                Bundle bundleA3 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar18.getClass();
                                ht.a.a(bundleA3, "OnboardingReminderNextWeekClicked");
                                i31.z zVar3 = dVar5.f206114f;
                                ge1.b.T(zVar3, null, null, new i31.y(zVar3, dVar6, 7, null), 3);
                                break;
                            default:
                                int i47 = d.f206108j;
                                ht.a aVar19 = ht.a.f85464a;
                                Bundle bundleA4 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar19.getClass();
                                ht.a.a(bundleA4, "OnboardingReminderNoThanksClicked");
                                i31.x xVar = dVar5.f206113e;
                                ge1.b.T(xVar, null, null, new i31.w(xVar, dVar6, null), 3);
                                break;
                        }
                    }
                };
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: zo0.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view10) {
                        int i44 = i24;
                        d dVar5 = dVar4;
                        d31.d dVar6 = dVar3;
                        switch (i44) {
                            case 0:
                                int i45 = d.f206108j;
                                ht.a aVar17 = ht.a.f85464a;
                                Bundle bundleA2 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar17.getClass();
                                ht.a.a(bundleA2, "OnboardingReminderTomorrowClicked");
                                i31.z zVar2 = dVar5.f206114f;
                                ge1.b.T(zVar2, null, null, new i31.y(zVar2, dVar6, 1, null), 3);
                                break;
                            case 1:
                                int i46 = d.f206108j;
                                ht.a aVar18 = ht.a.f85464a;
                                Bundle bundleA3 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar18.getClass();
                                ht.a.a(bundleA3, "OnboardingReminderNextWeekClicked");
                                i31.z zVar3 = dVar5.f206114f;
                                ge1.b.T(zVar3, null, null, new i31.y(zVar3, dVar6, 7, null), 3);
                                break;
                            default:
                                int i47 = d.f206108j;
                                ht.a aVar19 = ht.a.f85464a;
                                Bundle bundleA4 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar19.getClass();
                                ht.a.a(bundleA4, "OnboardingReminderNoThanksClicked");
                                i31.x xVar = dVar5.f206113e;
                                ge1.b.T(xVar, null, null, new i31.w(xVar, dVar6, null), 3);
                                break;
                        }
                    }
                };
                ?? r14 = new View.OnClickListener() { // from class: zo0.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view10) {
                        int i44 = i18;
                        d dVar5 = dVar4;
                        d31.d dVar6 = dVar3;
                        switch (i44) {
                            case 0:
                                int i45 = d.f206108j;
                                ht.a aVar17 = ht.a.f85464a;
                                Bundle bundleA2 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar17.getClass();
                                ht.a.a(bundleA2, "OnboardingReminderTomorrowClicked");
                                i31.z zVar2 = dVar5.f206114f;
                                ge1.b.T(zVar2, null, null, new i31.y(zVar2, dVar6, 1, null), 3);
                                break;
                            case 1:
                                int i46 = d.f206108j;
                                ht.a aVar18 = ht.a.f85464a;
                                Bundle bundleA3 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar18.getClass();
                                ht.a.a(bundleA3, "OnboardingReminderNextWeekClicked");
                                i31.z zVar3 = dVar5.f206114f;
                                ge1.b.T(zVar3, null, null, new i31.y(zVar3, dVar6, 7, null), 3);
                                break;
                            default:
                                int i47 = d.f206108j;
                                ht.a aVar19 = ht.a.f85464a;
                                Bundle bundleA4 = h7.c.a(new o13.p("FeatureType", dVar6.name()));
                                aVar19.getClass();
                                ht.a.a(bundleA4, "OnboardingReminderNoThanksClicked");
                                i31.x xVar = dVar5.f206113e;
                                ge1.b.T(xVar, null, null, new i31.w(xVar, dVar6, null), 3);
                                break;
                        }
                    }
                };
                m0 m0Var = dVar4.f206117i;
                if (m0Var == null || (u0Var = m0Var.f149762c) == null) {
                    return;
                }
                v.a aVar17 = v.f151104f;
                if (nVar instanceof n.d) {
                    com.garmin.android.apps.connectmobile.badges.service.model.u uVar = ((n.d) nVar).f206174a;
                    strJ = androidx.room.a0.j("BadgesDialog_", uVar.getBadgeChallengeUUID(), "_", uVar.getBadgeChallengeUUID());
                } else if (nVar instanceof n.q) {
                    strJ = "VoiceAssistantDialog";
                } else if (nVar instanceof n.f) {
                    strJ = "MCTDialog";
                } else if (nVar instanceof n.g) {
                    strJ = "NonSupportedCountryGEOSDialog";
                } else {
                    if (nVar instanceof n.p) {
                        unitID = ((n.p) nVar).f206193a.getUnitID();
                        str6 = "SystemBondingLostDialog_";
                    } else if (nVar instanceof n.e) {
                        unitID = ((n.e) nVar).f206175a.f17361a;
                        str6 = "DeviceReconnectDialog_";
                    } else if (nVar instanceof n.c) {
                        sd2.f fVar3 = ((n.c) nVar).f206173a;
                        strJ = "BLEUpgradeDialog_" + (fVar3 != null ? Long.valueOf(fVar3.getUnitID()) : null);
                    } else if (nVar instanceof n.C3845n) {
                        strJ = "ScheduledServerMaintenanceDialog";
                    } else if (nVar instanceof n.k) {
                        unitID = ((n.k) nVar).f206182a.getUnitID();
                        str6 = "OnboardingWelcomeDialog_";
                    } else if (nVar instanceof n.o) {
                        strJ = "SubscriptionAllSetDialog";
                    } else if (nVar instanceof n.a) {
                        strJ = "ActiveIntelligenceDialog";
                    } else if (nVar instanceof n.i) {
                        strJ = "OnboardingSafetyFeaturesDialog";
                    } else if (nVar instanceof n.h) {
                        strJ = "OnboardingRaceEventSearchDialog";
                    } else if (nVar instanceof n.j) {
                        strJ = "OnboardingWeatherDialog";
                    } else if (nVar instanceof n.m) {
                        strJ = fb1.c.n("PromoAlertDialog_", ((n.m) nVar).f206189a);
                    } else if (nVar instanceof n.b) {
                        strJ = "AppOnboardingDialog_" + ((n.b) nVar).f206172a.f102645a;
                    } else {
                        if (!(nVar instanceof n.l)) {
                            lc.u0.r();
                            return;
                        }
                        n.l lVar2 = (n.l) nVar;
                        String str15 = lVar2.f206184a;
                        String str16 = lVar2.f206185b;
                        strJ = androidx.room.a0.j("PartnerChallengePromote_", str15, "_", str16 != null ? str16 : "");
                    }
                    strJ = org.apache.commons.lang3.e.e(unitID, str6);
                }
                String str17 = strJ;
                String string3 = context5.getString(R.string.onboarding_want_a_reminder);
                aVar17.getClass();
                u0Var.b(v.a.a(str17, string3, onClickListener, onClickListener2, R.string.feedback_no_thanks_btn, r14));
                return;
        }
    }

    public /* synthetic */ c(ei2.h hVar, ii2.b bVar, Map map, Object obj, int i14) {
        this.f66894a = i14;
        this.f66895b = hVar;
        this.f66896c = bVar;
        this.f66898e = map;
        this.f66897d = obj;
    }

    public /* synthetic */ c(Object obj, dx2.c cVar, Map map, Object obj2, int i14) {
        this.f66894a = i14;
        this.f66895b = obj;
        this.f66897d = cVar;
        this.f66898e = map;
        this.f66896c = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f66894a = i14;
        this.f66895b = obj;
        this.f66896c = obj2;
        this.f66897d = obj3;
        this.f66898e = obj4;
    }
}
