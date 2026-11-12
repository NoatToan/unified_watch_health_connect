package ot;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lc.u0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.p0;
import p13.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lot/b;", "Lot/l;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/a;", "achievementData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/a;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends l implements bu.g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f133563w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tt.a f133564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f133565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f133566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o13.t f133567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o13.t f133568v;

    /* JADX INFO: renamed from: ot.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.AchievementsChapter$handleLottieDrawable$1", f = "AchievementsChapter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2538b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f133570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LottieDrawable f133571c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2538b(Context context, LottieDrawable lottieDrawable, t13.d<? super C2538b> dVar) {
            super(2, dVar);
            this.f133570b = context;
            this.f133571c = lottieDrawable;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C2538b(this.f133570b, this.f133571c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2538b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            String str = b.f133563w;
            b bVar = b.this;
            Context context = this.f133570b;
            LottieDrawable lottieDrawable = this.f133571c;
            bVar.t(context, lottieDrawable, 64, 7);
            bVar.s(context, lottieDrawable);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f133563w = b.class.getSimpleName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, tt.a aVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133564r = aVar;
        this.f133565s = "AchievementsChapter";
        this.f133566t = new ArrayList();
        final int i14 = 0;
        this.f133567u = o13.m.b(new e23.a(this) { // from class: ot.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f133559b;

            {
                this.f133559b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object next;
                Object next2;
                switch (i14) {
                    case 0:
                        Iterator it = this.f133559b.f133566t.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            if (((qt.a) next) instanceof qt.c) {
                                return (qt.a) next;
                            }
                        }
                        next = null;
                        return (qt.a) next;
                    default:
                        Iterator it3 = this.f133559b.f133566t.iterator();
                        while (it3.hasNext()) {
                            next2 = it3.next();
                            if (((qt.a) next2) instanceof qt.h) {
                                return (qt.a) next2;
                            }
                        }
                        next2 = null;
                        return (qt.a) next2;
                }
            }
        });
        final int i15 = 1;
        this.f133568v = o13.m.b(new e23.a(this) { // from class: ot.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f133559b;

            {
                this.f133559b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object next;
                Object next2;
                switch (i15) {
                    case 0:
                        Iterator it = this.f133559b.f133566t.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            if (((qt.a) next) instanceof qt.c) {
                                return (qt.a) next;
                            }
                        }
                        next = null;
                        return (qt.a) next;
                    default:
                        Iterator it3 = this.f133559b.f133566t.iterator();
                        while (it3.hasNext()) {
                            next2 = it3.next();
                            if (((qt.a) next2) instanceof qt.h) {
                                return (qt.a) next2;
                            }
                        }
                        next2 = null;
                        return (qt.a) next2;
                }
            }
        });
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133587s() {
        return this.f133565s;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/achievement";
    }

    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        List<Long> listT;
        String string;
        List<String> listC;
        ArrayList arrayList = this.f133566t;
        tt.a aVar = this.f133564r;
        if (aVar != null && (listC = aVar.c()) != null && (!listC.isEmpty()) && aVar.getBadgeCount() != null && aVar.getBadgeCount().intValue() > 0 && aVar.getBadgePoints() != null) {
            arrayList.add(new qt.c(aVar.getBadgeCount().intValue(), aVar.getBadgePoints().intValue(), aVar.c()));
        }
        if ((aVar != null ? aVar.getPrCount() : null) != null && aVar.getPrCount().intValue() > 0 && (listT = aVar.t()) != null && (!listT.isEmpty())) {
            List<Long> listT2 = aVar.t();
            ArrayList arrayList2 = new ArrayList(p13.y.r(listT2, 10));
            Iterator<T> it = listT2.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                q91.d.a aVar2 = q91.d.f143558e;
                Long lValueOf = Long.valueOf(jLongValue);
                aVar2.getClass();
                q91.d dVarA = q91.d.a.a(lValueOf);
                if (dVarA != null) {
                    qt.b.f147432a.getClass();
                    string = "";
                    switch (qt.b.a.f147433a[dVarA.ordinal()]) {
                        case 1:
                            string = context.getString(R.string.annual_report_achievement_personal_record_running_1k);
                            string.getClass();
                            break;
                        case 2:
                            string = context.getString(R.string.annual_report_achievement_personal_record_running_1mi);
                            string.getClass();
                            break;
                        case 3:
                            string = context.getString(R.string.annual_report_achievement_personal_record_running_5k);
                            string.getClass();
                            break;
                        case 4:
                            string = context.getString(R.string.annual_report_achievement_personal_record_running_10k);
                            string.getClass();
                            break;
                        case 5:
                            string = context.getString(R.string.annual_report_achievement_personal_record_running_half_marathon);
                            string.getClass();
                            break;
                        case 6:
                            string = context.getString(R.string.annual_report_achievement_personal_record_running_marathon);
                            string.getClass();
                            break;
                        case 7:
                            string = context.getString(R.string.annual_report_achievement_personal_record_running_longest);
                            string.getClass();
                            break;
                        case 8:
                            string = context.getString(R.string.annual_report_achievement_personal_record_cycling_longest);
                            string.getClass();
                            break;
                        case 9:
                            string = context.getString(R.string.annual_report_achievement_personal_record_cycling_elevation_gain);
                            string.getClass();
                            break;
                        case 10:
                            string = context.getString(R.string.annual_report_achievement_personal_record_cycling_max_avg_power);
                            string.getClass();
                            break;
                        case 11:
                            string = context.getString(R.string.annual_report_achievement_personal_record_cycling_40k);
                            string.getClass();
                            break;
                        case 12:
                            string = context.getString(R.string.personal_records_label_steps_best_day);
                            string.getClass();
                            break;
                        case 13:
                            string = context.getString(R.string.personal_records_label_steps_best_week);
                            string.getClass();
                            break;
                        case 14:
                            string = context.getString(R.string.personal_records_label_steps_best_month);
                            string.getClass();
                            break;
                        case 15:
                            string = context.getString(R.string.annual_report_achievement_personal_record_walk_longest_goal_streak);
                            string.getClass();
                            break;
                        case 16:
                        case 43:
                            break;
                        case 17:
                            string = context.getString(R.string.personal_records_label_longest_poolswim);
                            string.getClass();
                            break;
                        case 18:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_100m);
                            string.getClass();
                            break;
                        case 19:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_100y);
                            string.getClass();
                            break;
                        case 20:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_400m);
                            string.getClass();
                            break;
                        case 21:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_500y);
                            string.getClass();
                            break;
                        case 22:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_750m);
                            string.getClass();
                            break;
                        case 23:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_1000m);
                            string.getClass();
                            break;
                        case 24:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_1000y);
                            string.getClass();
                            break;
                        case 25:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_1500m);
                            string.getClass();
                            break;
                        case 26:
                            string = context.getString(R.string.annual_report_achievement_personal_record_swimming_1650y);
                            string.getClass();
                            break;
                        case 27:
                            string = context.getString(R.string.lbl_barbell_bench_press);
                            string.getClass();
                            break;
                        case 28:
                            string = context.getString(R.string.lbl_barbell_overhead_press);
                            string.getClass();
                            break;
                        case 29:
                            string = context.getString(R.string.lbl_barbell_back_squat);
                            string.getClass();
                            break;
                        case 30:
                            string = context.getString(R.string.lbl_barbell_deadlift);
                            string.getClass();
                            break;
                        case 31:
                            string = context.getString(R.string.lbl_barbell_row);
                            string.getClass();
                            break;
                        case 32:
                            string = context.getString(R.string.lbl_barbell_biceps_curl);
                            string.getClass();
                            break;
                        case 33:
                            string = context.getString(R.string.lbl_dumbbell_squat);
                            string.getClass();
                            break;
                        case 34:
                            string = context.getString(R.string.lbl_dumbbell_row);
                            string.getClass();
                            break;
                        case 35:
                            string = context.getString(R.string.lbl_dumbbell_deadlift);
                            string.getClass();
                            break;
                        case 36:
                            string = context.getString(R.string.lbl_dumbbell_biceps_curl);
                            string.getClass();
                            break;
                        case 37:
                            string = context.getString(R.string.lbl_dumbbell_bench_press);
                            string.getClass();
                            break;
                        case 38:
                            string = context.getString(R.string.lbl_overhead_dumbbell_press);
                            string.getClass();
                            break;
                        case 39:
                            string = context.getString(R.string.lbl_most_pushes_day);
                            string.getClass();
                            break;
                        case 40:
                            string = context.getString(R.string.lbl_most_pushes_week);
                            string.getClass();
                            break;
                        case 41:
                            string = context.getString(R.string.lbl_most_pushes_month);
                            string.getClass();
                            break;
                        case 42:
                            string = context.getString(R.string.annual_report_achievement_personal_record_push_longest_goal_streak);
                            string.getClass();
                            break;
                        case 44:
                            string = context.getString(R.string.annual_report_achievement_personal_record_parasports_1k);
                            string.getClass();
                            break;
                        case 45:
                            string = context.getString(R.string.annual_report_achievement_personal_record_parasports_1mi);
                            string.getClass();
                            break;
                        case 46:
                            string = context.getString(R.string.annual_report_achievement_personal_record_parasports_5k);
                            string.getClass();
                            break;
                        case 47:
                            string = context.getString(R.string.annual_report_achievement_personal_record_parasports_10k);
                            string.getClass();
                            break;
                        case 48:
                            string = context.getString(R.string.annual_report_achievement_personal_record_parasports_half_marathon);
                            string.getClass();
                            break;
                        case 49:
                            string = context.getString(R.string.annual_report_achievement_personal_record_parasports_marathon);
                            string.getClass();
                            break;
                        case 50:
                            string = context.getString(R.string.annual_report_achievement_personal_record_parasports_longest);
                            string.getClass();
                            break;
                        default:
                            u0.r();
                            return null;
                    }
                } else {
                    string = null;
                }
                arrayList2.add(string);
            }
            arrayList.add(new qt.h(aVar.getPrCount().intValue(), arrayList2));
        }
        if ((aVar != null ? aVar.getFirstFitnessAge() : null) != null && aVar.getLastFitnessAge() != null && aVar.getFirstFitnessAgeDate() != null) {
            arrayList.add(new qt.f(aVar.getFirstFitnessAge().doubleValue(), aVar.getFirstFitnessAgeDate(), aVar.getLastFitnessAge().doubleValue()));
        }
        if ((aVar != null ? aVar.getFirstGenericVo2Max() : null) != null && aVar.getLastGenericVo2Max() != null && aVar.getFirstGenericVo2MaxDate() != null) {
            arrayList.add(new qt.i(aVar.getFirstGenericVo2Max().doubleValue(), aVar.getFirstGenericVo2MaxDate(), aVar.getLastGenericVo2Max().doubleValue()));
        }
        if ((aVar != null ? aVar.getFirstCyclingVo2Max() : null) != null && aVar.getLastCyclingVo2Max() != null && aVar.getFirstCyclingVo2MaxDate() != null) {
            arrayList.add(new qt.d(aVar.getFirstCyclingVo2Max().doubleValue(), aVar.getFirstCyclingVo2MaxDate(), aVar.getLastCyclingVo2Max().doubleValue()));
        }
        if ((aVar != null ? aVar.getFirstHillScore() : null) != null && aVar.getLastHillScore() != null && aVar.getFirstHillScoreDate() != null) {
            arrayList.add(new qt.g(aVar.getFirstHillScore().intValue(), aVar.getFirstHillScoreDate(), aVar.getLastHillScore().intValue()));
        }
        if ((aVar != null ? aVar.getFirstEnduranceScore() : null) != null && aVar.getLastEnduranceScore() != null && aVar.getFirstEnduranceScoreDate() != null) {
            arrayList.add(new qt.e(aVar.getFirstEnduranceScore().intValue(), aVar.getFirstEnduranceScoreDate(), aVar.getLastEnduranceScore().intValue()));
        }
        JsonObject jsonObjectC = c(d(context), pVar, pVar2, i14);
        b(context);
        String string2 = context.getString(R.string.lbl_achievements);
        string2.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string2.toUpperCase(locale);
        upperCase.getClass();
        pt.i.g(context, jsonObjectC, "Text_Topic", upperCase);
        pt.i iVar = pt.i.f140571a;
        float f14 = this.f133656j;
        String string3 = context.getString(R.string.lbl_achievements);
        string3.getClass();
        String upperCase2 = string3.toUpperCase(locale);
        upperCase2.getClass();
        pt.i.b(iVar, context, jsonObjectC, f14, upperCase2);
        String string4 = context.getString(R.string.annual_report_achievement_intro_text);
        string4.getClass();
        pt.i.z(jsonObjectC, "intro_layer_name", string4, oe2.f.O(context));
        pt.i.f(jsonObjectC, this.f133656j);
        r(context, jsonObjectC, false);
        String string5 = jsonObjectC.toString();
        string5.getClass();
        byte[] bytes = string5.getBytes(d53.c.f57666b);
        bytes.getClass();
        return LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), null).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        Object next;
        Object next2;
        Object next3;
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.lbl_achievements);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        x53.c cVar = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new C2538b(context, lottieDrawable, null), 3);
        ArrayList arrayList = new ArrayList();
        o13.t tVar = this.f133567u;
        Object value = tVar.getValue();
        o13.t tVar2 = this.f133568v;
        ArrayList arrayList2 = this.f133650d;
        if (value == null && tVar2.getValue() == null) {
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((Marker) next3).getName(), "List_Display_01"));
            Marker marker = (Marker) next3;
            if (marker != null) {
                arrayList.add(marker);
            }
        }
        if (tVar.getValue() == null || tVar2.getValue() == null) {
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(((Marker) next).getName(), "List_Display_02"));
            Marker marker2 = (Marker) next;
            if (marker2 != null) {
                arrayList.add(marker2);
            }
        }
        Iterator<Integer> it4 = j23.t.o(0, 7).iterator();
        while (((j23.k) it4).f96801c) {
            int iNextInt = ((p0) it4).nextInt();
            if (iNextInt >= this.f133566t.size()) {
                qt.b.f147432a.getClass();
                String strA = qt.b.a(iNextInt, "Achievement_%02d");
                Iterator it5 = arrayList2.iterator();
                do {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                } while (!p005kotlin.jvm.internal.s.g(((Marker) next2).getName(), strA));
                Marker marker3 = (Marker) next2;
                if (marker3 != null) {
                    arrayList.add(marker3);
                }
            }
        }
        a(lottieDrawable, arrayList);
        p(context, lottieDrawable, t0.b(new o13.p("image_71", "bg_icon.png")));
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.ACHIEVEMENTS;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0281  */
    @Override // ot.l
    public final Object m(Context context, yt.o oVar) throws Throwable {
        String str;
        l.a aVar;
        b bVar;
        l.a aVar2;
        Object next;
        LottieDrawable lottieDrawable;
        LottieDrawable lottieDrawable2;
        String str2;
        b bVar2 = this;
        Context context2 = context;
        ArrayList arrayList = new ArrayList();
        o13.t tVar = bVar2.f133567u;
        qt.a aVar3 = (qt.a) tVar.getValue();
        String str3 = "Text_Topic";
        if (aVar3 == null || !(aVar3 instanceof qt.c)) {
            arrayList = arrayList;
            str = "Text_Topic";
            aVar = null;
            bVar = bVar2;
        } else {
            LottieDrawable lottieDrawable3 = new LottieDrawable();
            JsonObject jsonObjectK = bVar2.k(context2, bVar2, "sharing_badges.json");
            if (jsonObjectK != null) {
                qt.a aVar4 = (qt.a) tVar.getValue();
                if (aVar4 == null || !(aVar4 instanceof qt.c)) {
                    lottieDrawable2 = lottieDrawable3;
                } else {
                    qt.c cVar = (qt.c) aVar4;
                    String strD = cVar.d();
                    Typeface typefaceO = oe2.f.O(context2);
                    JsonObject jsonObjectM = pt.i.m(jsonObjectK, "Badge_Data_Main");
                    JsonObject jsonObjectM2 = pt.i.m(jsonObjectK, "Badge_Unit_Sub");
                    Float fT = pt.i.t(jsonObjectM);
                    String strP = pt.i.p(jsonObjectM);
                    if (strP == null) {
                        strP = "";
                    }
                    TextPaint textPaint = new TextPaint();
                    if (fT != null) {
                        textPaint.setTextSize(fT.floatValue());
                    }
                    textPaint.setTypeface(typefaceO);
                    float fMeasureText = textPaint.measureText(strP);
                    float fMeasureText2 = textPaint.measureText(strD);
                    String str4 = "changeUnitLayerPosition defaultData = " + strP + ", originTextMeasureWidth = " + fMeasureText + ", changeDataValue = " + strD + ", modifyTextMeasureWidth = " + fMeasureText2;
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var, "LottieUtils", str4);
                    float f14 = fMeasureText2 - fMeasureText;
                    JsonElement jsonElement = jsonObjectM2 != null ? jsonObjectM2.get("ks") : null;
                    JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
                    JsonElement jsonElement2 = jsonObject != null ? jsonObject.get("p") : null;
                    JsonObject jsonObject2 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
                    if (jsonObject2 != null) {
                        JsonArray asJsonArray = jsonObject2.getAsJsonArray(JWKParameterNames.OCT_KEY_VALUE);
                        asJsonArray.getClass();
                        JsonElement jsonElement3 = (JsonElement) h0.l0(asJsonArray);
                        lottieDrawable2 = lottieDrawable3;
                        JsonArray jsonArray = new JsonArray();
                        str2 = "Badge_Unit_Sub";
                        if (jsonElement3.isJsonObject()) {
                            JsonObject jsonObject3 = jsonElement3 instanceof JsonObject ? (JsonObject) jsonElement3 : null;
                            if (jsonObject3 != null) {
                                JsonElement jsonElement4 = jsonObject3.get("s");
                                JsonArray jsonArray2 = jsonElement4 instanceof JsonArray ? (JsonArray) jsonElement4 : null;
                                if (jsonArray2 != null) {
                                    float asFloat = jsonArray2.get(0).getAsFloat() + f14;
                                    float asFloat2 = jsonArray2.get(1).getAsFloat();
                                    jsonArray.add(Float.valueOf(asFloat));
                                    jsonArray.add(Float.valueOf(asFloat2));
                                    if (jsonArray2.size() > 2) {
                                        jsonArray.add(Float.valueOf(jsonArray2.get(2).getAsFloat()));
                                    }
                                    jsonObject3.add("s", jsonArray);
                                }
                            }
                        } else {
                            float asFloat3 = asJsonArray.get(0).getAsFloat();
                            StringBuilder sbI = p6.b.i("changeUnitLayerPosition defaultData = ", strP, ", changeDataValue = ", strD, ", originX = ");
                            sbI.append(asFloat3);
                            sbI.append(", changeWidth = ");
                            sbI.append(f14);
                            i2.a.b(a2Var, "LottieUtils", sbI.toString());
                            jsonArray.add(Float.valueOf(asFloat3 + f14));
                            jsonArray.add(Float.valueOf(asJsonArray.get(1).getAsFloat()));
                            if (asJsonArray.size() > 2) {
                                jsonArray.add(Float.valueOf(asJsonArray.get(2).getAsFloat()));
                            }
                            jsonObject2.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray);
                        }
                    } else {
                        lottieDrawable2 = lottieDrawable3;
                        str2 = "Badge_Unit_Sub";
                    }
                    pt.i.y(jsonObjectK, "Badge_Data_Main", strD);
                    String quantityString = context.getResources().getQuantityString(R.plurals.achievement_badge_count_format, cVar.f147434a);
                    quantityString.getClass();
                    pt.i.y(jsonObjectK, str2, quantityString);
                }
                lottieDrawable = lottieDrawable2;
            } else {
                arrayList = arrayList;
                str3 = "Text_Topic";
                lottieDrawable = lottieDrawable3;
            }
            b bVar3 = this;
            context2 = context;
            bVar3.q(context2, jsonObjectK, lottieDrawable);
            bVar3.p(context2, lottieDrawable, p13.u0.e(new o13.p("image_0", "shadow_mask.png"), new o13.p("image_67", "sharing_bg_badges.png")));
            pt.i iVar = pt.i.f140571a;
            String string = context2.getString(R.string.lbl_achievements);
            string.getClass();
            String upperCase = string.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            iVar.getClass();
            str = str3;
            pt.i.d(lottieDrawable, str, upperCase);
            bVar3.t(context2, lottieDrawable, 66, 1);
            aVar = new l.a(bVar3, lottieDrawable, "AchievementsChapterBadge");
            bVar = bVar3;
        }
        ArrayList arrayList2 = bVar.f133566t;
        if (arrayList2.isEmpty()) {
            aVar2 = null;
        } else {
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((qt.a) next) instanceof qt.c);
            if (next != null) {
                LottieDrawable lottieDrawable4 = new LottieDrawable();
                JsonObject jsonObjectK2 = bVar.k(context2, bVar, "sharing_stats.json");
                if (jsonObjectK2 != null) {
                    bVar.r(context2, jsonObjectK2, true);
                }
                bVar.q(context2, jsonObjectK2, lottieDrawable4);
                bVar.p(context2, lottieDrawable4, t0.b(new o13.p("image_7", "sharing_bg_stats.png")));
                pt.i iVar2 = pt.i.f140571a;
                String string2 = context2.getString(R.string.lbl_achievements);
                string2.getClass();
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                iVar2.getClass();
                pt.i.d(lottieDrawable4, str, upperCase2);
                bVar.s(context2, lottieDrawable4);
                aVar2 = new l.a(bVar, lottieDrawable4, "AchievementsChapterList");
            } else {
                aVar2 = null;
            }
        }
        ArrayList arrayList3 = arrayList;
        if (aVar2 != null) {
            arrayList3.add(aVar2);
        }
        if (aVar != null) {
            arrayList3.add(aVar);
        }
        Object objO = bVar.o(context2, arrayList3, oVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133564r == null || e() == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028c  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x0304  */
    /* JADX WARN: Code duplicated, block: B:45:0x019f  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x01da  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x0214  */
    /* JADX WARN: Code duplicated, block: B:76:0x024e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0254  */
    /* JADX WARN: Code duplicated, block: B:79:0x0259  */
    /* JADX WARN: Code duplicated, block: B:82:0x025f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0262  */
    /* JADX WARN: Code duplicated, block: B:86:0x0268  */
    /* JADX WARN: Code duplicated, block: B:87:0x026d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0273  */
    /* JADX WARN: Code duplicated, block: B:91:0x0276  */
    /* JADX WARN: Code duplicated, block: B:93:0x027a  */
    /* JADX WARN: Code duplicated, block: B:94:0x027f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0285  */
    /* JADX WARN: Code duplicated, block: B:98:0x0288  */
    public final void r(Context context, JsonObject jsonObject, boolean z14) {
        String str;
        Integer num;
        String str2;
        qt.a aVar;
        Iterator<Integer> it;
        String str3;
        int i14;
        boolean z15;
        Float fR;
        float fFloatValue;
        JsonElement jsonElement;
        JsonObject jsonObject2;
        JsonElement jsonElement2;
        JsonObject jsonObject3;
        JsonArray asJsonArray;
        JsonArray jsonArray;
        boolean z16;
        float f14;
        Context context2;
        JsonObject jsonObjectM;
        float fFloatValue2;
        JsonElement jsonElement3;
        JsonObject jsonObject4;
        String str4;
        JsonElement jsonElement4;
        JsonObject jsonObject5;
        JsonElement jsonElement5;
        JsonArray jsonArray2;
        Float fT;
        TextPaint textPaint;
        JsonElement jsonElement6;
        JsonArray jsonArray3;
        JsonElement jsonElement7;
        float asFloat;
        JsonElement jsonElement8;
        JsonObject asJsonObject;
        Context context3 = context;
        boolean z17 = false;
        Integer num2 = 0;
        Iterator<Integer> it3 = j23.t.o(0, 7).iterator();
        while (((j23.k) it3).f96801c) {
            int iNextInt = ((p0) it3).nextInt();
            ArrayList arrayList = this.f133566t;
            if (iNextInt >= arrayList.size()) {
                qt.b.f147432a.getClass();
                JsonObject jsonObjectM2 = pt.i.m(jsonObject, qt.b.a(iNextInt, "Achievement_%d_root"));
                if (jsonObjectM2 != null) {
                    pt.i.f140571a.getClass();
                    JsonObject jsonObjectU = pt.i.u(jsonObjectM2);
                    JsonArray jsonArray4 = new JsonArray();
                    jsonArray4.add(num2);
                    jsonArray4.add(num2);
                    jsonArray4.add(num2);
                    if (jsonObjectU != null && (jsonElement8 = jsonObjectU.get("s")) != null && (asJsonObject = jsonElement8.getAsJsonObject()) != null) {
                        asJsonObject.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray4);
                    }
                } else {
                    JsonObject jsonObjectM3 = pt.i.m(jsonObject, qt.b.a(iNextInt, "A%d_Data_Main"));
                    if (jsonObjectM3 != null) {
                        pt.i.w(jsonObjectM3);
                    }
                    JsonObject jsonObjectM4 = pt.i.m(jsonObject, qt.b.a(iNextInt, "A%d_Unit"));
                    if (jsonObjectM4 != null) {
                        pt.i.w(jsonObjectM4);
                    }
                }
                context2 = context3;
                num = num2;
                it = it3;
                z16 = z17;
            } else {
                qt.a aVar2 = (qt.a) arrayList.get(iNextInt);
                if (z14) {
                    qt.b.f147432a.getClass();
                    String strA = qt.b.a(iNextInt, "A%d_Data_Main");
                    String strA2 = qt.b.a(iNextInt, "A%d_Unit");
                    String strD = aVar2.d();
                    String strC = aVar2.c(context3);
                    Typeface typefaceQ = oe2.f.Q(context3);
                    Typeface typefaceS = oe2.f.S(context3);
                    str = "ks";
                    num = num2;
                    str2 = JWKParameterNames.OCT_KEY_VALUE;
                    qt.b.b(jsonObject, strA, strA2, strD, strC, typefaceQ, typefaceS, 200.0f, null);
                    str3 = "s";
                    aVar = aVar2;
                    it = it3;
                } else {
                    str = "ks";
                    num = num2;
                    str2 = JWKParameterNames.OCT_KEY_VALUE;
                    qt.b.f147432a.getClass();
                    String strA3 = qt.b.a(iNextInt, "A%d_Data_Main");
                    String strA4 = qt.b.a(iNextInt, "A%d_Unit");
                    String strD2 = aVar2.d();
                    aVar = aVar2;
                    String strC2 = aVar.c(context3);
                    Typeface typefaceQ2 = oe2.f.Q(context3);
                    Typeface typefaceS2 = oe2.f.S(context3);
                    String strConcat = "setupMainDataAndUnit , unit = ".concat(strC2);
                    i2.a aVar3 = i2.f36769a;
                    it = it3;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var, "AchievementUtils", strConcat);
                    JsonObject jsonObjectM5 = pt.i.m(jsonObject, strA3);
                    JsonObject jsonObjectM6 = pt.i.m(jsonObject, strA4);
                    Float fT2 = pt.i.t(jsonObjectM5);
                    Float fT3 = pt.i.t(jsonObjectM6);
                    String strP = pt.i.p(jsonObjectM5);
                    if (strP == null) {
                        strP = "";
                    }
                    str3 = "s";
                    String str5 = strP;
                    TextPaint textPaint2 = new TextPaint();
                    textPaint2.setTypeface(typefaceQ2);
                    if (fT2 != null) {
                        textPaint2.setTextSize(fT2.floatValue());
                    }
                    TextPaint textPaint3 = new TextPaint();
                    textPaint3.setTypeface(typefaceS2);
                    if (fT3 != null) {
                        textPaint3.setTextSize(fT3.floatValue());
                    }
                    float fMeasureText = textPaint2.measureText(strD2) - textPaint2.measureText(str5);
                    i2.a.b(a2Var, "AchievementUtils", "measureRectangleWidth = 260.0");
                    float f15 = 260.0f - fMeasureText;
                    if (f15 > 0.0f) {
                        pt.h.f140570a.getClass();
                        pt.v vVarG = pt.h.g(strC2, f15, textPaint3);
                        i14 = vVarG.f140607b;
                        strC2 = vVarG.f140606a;
                        z15 = i14 > 1;
                        i2.a.b(a2Var, "AchievementUtils", androidx.room.a0.j("setupMainDataAndUnit", strD2, StringUtils.SPACE, strC2));
                        pt.i.y(jsonObject, strA3, strD2);
                        pt.i.y(jsonObject, strA4, strC2);
                        fR = pt.i.r(jsonObjectM6);
                        if (fR != null) {
                            fFloatValue = fR.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        if (jsonObjectM6 != null) {
                            jsonElement = jsonObjectM6.get(str);
                        } else {
                            jsonElement = null;
                        }
                        if (jsonElement instanceof JsonObject) {
                            jsonObject2 = (JsonObject) jsonElement;
                        } else {
                            jsonObject2 = null;
                        }
                        if (jsonObject2 != null) {
                            jsonElement2 = jsonObject2.get("p");
                        } else {
                            jsonElement2 = null;
                        }
                        if (jsonElement2 instanceof JsonObject) {
                            jsonObject3 = (JsonObject) jsonElement2;
                        } else {
                            jsonObject3 = null;
                        }
                        if (jsonObject3 != null) {
                            asJsonArray = jsonObject3.getAsJsonArray(str2);
                            if (asJsonArray.size() <= 0) {
                                jsonArray = new JsonArray();
                                z16 = false;
                                jsonArray.add(Float.valueOf(asJsonArray.get(0).getAsFloat() + fMeasureText));
                                if (z15) {
                                    f14 = (i14 - 1) * fFloatValue;
                                } else {
                                    f14 = 0.0f;
                                }
                                jsonArray.add(Float.valueOf(asJsonArray.get(1).getAsFloat() - f14));
                                if (asJsonArray.size() > 2) {
                                    jsonArray.add(Float.valueOf(asJsonArray.get(2).getAsFloat()));
                                }
                                jsonObject3.add(str2, jsonArray);
                            }
                        }
                        qt.b.f147432a.getClass();
                        context2 = context;
                        pt.i.z(jsonObject, qt.b.a(iNextInt, "A%d_Content"), aVar.a(context2), oe2.f.T(context2));
                        jsonObjectM = pt.i.m(jsonObject, qt.b.a(iNextInt, "A%d_Data_Sub"));
                        Float fT4 = pt.i.t(jsonObjectM);
                        fFloatValue2 = fT4 != null ? fT4.floatValue() : 0.0f;
                        if (jsonObjectM != null) {
                            jsonElement3 = jsonObjectM.get(str);
                        } else {
                            jsonElement3 = null;
                        }
                        if (jsonElement3 instanceof JsonObject) {
                            jsonObject4 = (JsonObject) jsonElement3;
                        } else {
                            jsonObject4 = null;
                        }
                        str4 = str3;
                        if (jsonObject4 != null) {
                            jsonElement4 = jsonObject4.get(str4);
                        } else {
                            jsonElement4 = null;
                        }
                        if (jsonElement4 instanceof JsonObject) {
                            jsonObject5 = (JsonObject) jsonElement4;
                        } else {
                            jsonObject5 = null;
                        }
                        if (jsonObject5 != null) {
                            jsonElement5 = jsonObject5.get(str2);
                        } else {
                            jsonElement5 = null;
                        }
                        if (jsonElement5 instanceof JsonArray) {
                            jsonArray2 = (JsonArray) jsonElement5;
                        } else {
                            jsonArray2 = null;
                        }
                        if (jsonArray2 != null && (jsonElement6 = (JsonElement) h0.l0(jsonArray2)) != null && (jsonElement6 instanceof JsonObject)) {
                            JsonElement jsonElement9 = ((JsonObject) jsonElement6).get(str4);
                            jsonArray3 = jsonElement9 instanceof JsonArray ? (JsonArray) jsonElement9 : null;
                            if (jsonArray3 != null) {
                                jsonElement7 = (JsonElement) h0.c0(jsonArray3);
                                if (jsonElement7 != null) {
                                    asFloat = jsonElement7.getAsFloat();
                                } else {
                                    asFloat = 100.0f;
                                }
                                fFloatValue2 *= asFloat / 100.0f;
                            }
                        }
                        qt.a aVar4 = aVar;
                        qt.b.b(jsonObject, qt.b.a(iNextInt, "A%d_Data_Sub"), qt.b.a(iNextInt, "A%d_Unit_Sub"), aVar.d(), aVar4.c(context2), oe2.f.S(context2), oe2.f.T(context2), 248.0f, Float.valueOf(fFloatValue2));
                        pt.h hVar = pt.h.f140570a;
                        String strB = aVar4.b(context2);
                        String strA5 = qt.b.a(iNextInt, "A%d_Info");
                        Typeface typefaceT = oe2.f.T(context2);
                        hVar.getClass();
                        fT = pt.i.t(pt.i.m(jsonObject, strA5));
                        textPaint = new TextPaint();
                        textPaint.setTypeface(typefaceT);
                        if (fT != null) {
                            textPaint.setTextSize(fT.floatValue());
                        }
                        pt.i.y(jsonObject, qt.b.a(iNextInt, "A%d_Info"), TextUtils.ellipsize(strB, textPaint, 290.0f, TextUtils.TruncateAt.END).toString());
                    } else {
                        i14 = 0;
                    }
                    i2.a.b(a2Var, "AchievementUtils", androidx.room.a0.j("setupMainDataAndUnit", strD2, StringUtils.SPACE, strC2));
                    pt.i.y(jsonObject, strA3, strD2);
                    pt.i.y(jsonObject, strA4, strC2);
                    fR = pt.i.r(jsonObjectM6);
                    if (fR != null) {
                        fFloatValue = fR.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    if (jsonObjectM6 != null) {
                        jsonElement = jsonObjectM6.get(str);
                    } else {
                        jsonElement = null;
                    }
                    if (jsonElement instanceof JsonObject) {
                        jsonObject2 = (JsonObject) jsonElement;
                    } else {
                        jsonObject2 = null;
                    }
                    if (jsonObject2 != null) {
                        jsonElement2 = jsonObject2.get("p");
                    } else {
                        jsonElement2 = null;
                    }
                    if (jsonElement2 instanceof JsonObject) {
                        jsonObject3 = (JsonObject) jsonElement2;
                    } else {
                        jsonObject3 = null;
                    }
                    if (jsonObject3 != null) {
                        asJsonArray = jsonObject3.getAsJsonArray(str2);
                        if (asJsonArray.size() <= 0) {
                            jsonArray = new JsonArray();
                            z16 = false;
                            jsonArray.add(Float.valueOf(asJsonArray.get(0).getAsFloat() + fMeasureText));
                            if (z15) {
                                f14 = (i14 - 1) * fFloatValue;
                            } else {
                                f14 = 0.0f;
                            }
                            jsonArray.add(Float.valueOf(asJsonArray.get(1).getAsFloat() - f14));
                            if (asJsonArray.size() > 2) {
                                jsonArray.add(Float.valueOf(asJsonArray.get(2).getAsFloat()));
                            }
                            jsonObject3.add(str2, jsonArray);
                        }
                    }
                    qt.b.f147432a.getClass();
                    context2 = context;
                    pt.i.z(jsonObject, qt.b.a(iNextInt, "A%d_Content"), aVar.a(context2), oe2.f.T(context2));
                    jsonObjectM = pt.i.m(jsonObject, qt.b.a(iNextInt, "A%d_Data_Sub"));
                    Float fT5 = pt.i.t(jsonObjectM);
                    if (fT5 != null) {
                    }
                    if (jsonObjectM != null) {
                        jsonElement3 = jsonObjectM.get(str);
                    } else {
                        jsonElement3 = null;
                    }
                    if (jsonElement3 instanceof JsonObject) {
                        jsonObject4 = (JsonObject) jsonElement3;
                    } else {
                        jsonObject4 = null;
                    }
                    str4 = str3;
                    if (jsonObject4 != null) {
                        jsonElement4 = jsonObject4.get(str4);
                    } else {
                        jsonElement4 = null;
                    }
                    if (jsonElement4 instanceof JsonObject) {
                        jsonObject5 = (JsonObject) jsonElement4;
                    } else {
                        jsonObject5 = null;
                    }
                    if (jsonObject5 != null) {
                        jsonElement5 = jsonObject5.get(str2);
                    } else {
                        jsonElement5 = null;
                    }
                    if (jsonElement5 instanceof JsonArray) {
                        jsonArray2 = (JsonArray) jsonElement5;
                    } else {
                        jsonArray2 = null;
                    }
                    if (jsonArray2 != null) {
                        JsonElement jsonElement10 = ((JsonObject) jsonElement6).get(str4);
                        if (jsonElement10 instanceof JsonArray) {
                        }
                        if (jsonArray3 != null) {
                            jsonElement7 = (JsonElement) h0.c0(jsonArray3);
                            if (jsonElement7 != null) {
                                asFloat = jsonElement7.getAsFloat();
                            } else {
                                asFloat = 100.0f;
                            }
                            fFloatValue2 *= asFloat / 100.0f;
                        }
                    }
                    qt.a aVar5 = aVar;
                    qt.b.b(jsonObject, qt.b.a(iNextInt, "A%d_Data_Sub"), qt.b.a(iNextInt, "A%d_Unit_Sub"), aVar.d(), aVar5.c(context2), oe2.f.S(context2), oe2.f.T(context2), 248.0f, Float.valueOf(fFloatValue2));
                    pt.h hVar2 = pt.h.f140570a;
                    String strB2 = aVar5.b(context2);
                    String strA6 = qt.b.a(iNextInt, "A%d_Info");
                    Typeface typefaceT2 = oe2.f.T(context2);
                    hVar2.getClass();
                    fT = pt.i.t(pt.i.m(jsonObject, strA6));
                    textPaint = new TextPaint();
                    textPaint.setTypeface(typefaceT2);
                    if (fT != null) {
                        textPaint.setTextSize(fT.floatValue());
                    }
                    pt.i.y(jsonObject, qt.b.a(iNextInt, "A%d_Info"), TextUtils.ellipsize(strB2, textPaint, 290.0f, TextUtils.TruncateAt.END).toString());
                }
                z16 = false;
                qt.b.f147432a.getClass();
                context2 = context;
                pt.i.z(jsonObject, qt.b.a(iNextInt, "A%d_Content"), aVar.a(context2), oe2.f.T(context2));
                jsonObjectM = pt.i.m(jsonObject, qt.b.a(iNextInt, "A%d_Data_Sub"));
                Float fT6 = pt.i.t(jsonObjectM);
                if (fT6 != null) {
                }
                if (jsonObjectM != null) {
                    jsonElement3 = jsonObjectM.get(str);
                } else {
                    jsonElement3 = null;
                }
                if (jsonElement3 instanceof JsonObject) {
                    jsonObject4 = (JsonObject) jsonElement3;
                } else {
                    jsonObject4 = null;
                }
                str4 = str3;
                if (jsonObject4 != null) {
                    jsonElement4 = jsonObject4.get(str4);
                } else {
                    jsonElement4 = null;
                }
                if (jsonElement4 instanceof JsonObject) {
                    jsonObject5 = (JsonObject) jsonElement4;
                } else {
                    jsonObject5 = null;
                }
                if (jsonObject5 != null) {
                    jsonElement5 = jsonObject5.get(str2);
                } else {
                    jsonElement5 = null;
                }
                if (jsonElement5 instanceof JsonArray) {
                    jsonArray2 = (JsonArray) jsonElement5;
                } else {
                    jsonArray2 = null;
                }
                if (jsonArray2 != null) {
                    JsonElement jsonElement11 = ((JsonObject) jsonElement6).get(str4);
                    if (jsonElement11 instanceof JsonArray) {
                    }
                    if (jsonArray3 != null) {
                        jsonElement7 = (JsonElement) h0.c0(jsonArray3);
                        if (jsonElement7 != null) {
                            asFloat = jsonElement7.getAsFloat();
                        } else {
                            asFloat = 100.0f;
                        }
                        fFloatValue2 *= asFloat / 100.0f;
                    }
                }
                qt.a aVar6 = aVar;
                qt.b.b(jsonObject, qt.b.a(iNextInt, "A%d_Data_Sub"), qt.b.a(iNextInt, "A%d_Unit_Sub"), aVar.d(), aVar6.c(context2), oe2.f.S(context2), oe2.f.T(context2), 248.0f, Float.valueOf(fFloatValue2));
                pt.h hVar3 = pt.h.f140570a;
                String strB3 = aVar6.b(context2);
                String strA7 = qt.b.a(iNextInt, "A%d_Info");
                Typeface typefaceT3 = oe2.f.T(context2);
                hVar3.getClass();
                fT = pt.i.t(pt.i.m(jsonObject, strA7));
                textPaint = new TextPaint();
                textPaint.setTypeface(typefaceT3);
                if (fT != null) {
                    textPaint.setTextSize(fT.floatValue());
                }
                pt.i.y(jsonObject, qt.b.a(iNextInt, "A%d_Info"), TextUtils.ellipsize(strB3, textPaint, 290.0f, TextUtils.TruncateAt.END).toString());
            }
            z17 = z16;
            context3 = context2;
            num2 = num;
            it3 = it;
        }
    }

    public final void s(Context context, LottieDrawable lottieDrawable) {
        int i14 = 0;
        for (Object obj : this.f133566t) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            String strE = ((qt.a) obj).e();
            String strH = am.j.h(i14, "image_");
            bu.f fVar = bu.f.f21180a;
            String strConcat = strE.concat(".png");
            fVar.getClass();
            Bitmap bitmapD = bu.f.d(context, this, strConcat);
            if (bitmapD != null) {
                if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) != null) {
                    lottieDrawable.updateBitmap(strH, bitmapD);
                }
            }
            i14 = i15;
        }
    }

    public final void t(Context context, LottieDrawable lottieDrawable, int i14, int i15) throws Throwable {
        tt.a aVar;
        if (this.f133567u.getValue() == null || (aVar = this.f133564r) == null) {
            return;
        }
        pt.h.f140570a.getClass();
        ArrayList arrayListF = pt.h.f(aVar);
        if (arrayListF != null) {
            int i16 = 0;
            int i17 = 0;
            for (Object obj : arrayListF) {
                int i18 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                String str = (String) obj;
                if (i16 < i14 + i17) {
                    String strH = am.j.h((i16 + i15) - i17, "image_");
                    zp0.c.f206560v.getClass();
                    zp0.c cVarA = zp0.c.a.a(context);
                    cVarA.f206565e = str;
                    Bitmap bitmapC = cVarA.c();
                    if (bitmapC != null) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, SyslogConstants.LOG_LOCAL1, 156, true);
                        if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) != null) {
                            lottieDrawable.updateBitmap(strH, bitmapCreateScaledBitmap);
                            String str2 = "setupBadgeIconList imageLayerId = " + strH + " , badgeBitmap = " + bitmapCreateScaledBitmap + ", updateBitmap finish";
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var, f133563w, str2);
                        }
                    } else {
                        i17++;
                    }
                }
                i16 = i18;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lot/b$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "ACHIEVEMENT_SHARE_IMAGE_BADGES_FILE_NAME", "ACHIEVEMENT_SHARE_IMAGE_AC_LIST_FILE_NAME", "", "MAX_ACHIEVEMENT_COUNT", "I", "BADGE_IMAGE_INDEX_START_MAIN", "BADGE_IMAGE_INDEX_START_SHARE", "MAX_BADGE_ICON_INDEX_MAIN", "MAX_BADGE_ICON_INDEX_SHARE_IMAGE", "BADGE_ICON_WIDTH", "BADGE_ICON_HEIGHT", "BADGE_TOTAL_COUNT_LAYER_SHARE", "BADGE_UNIT_LAYER_SHARE", "ACHIEVEMENT_DISPLAY_ONE_MARKER", "ACHIEVEMENT_DISPLAY_TWO_MARKER", "", "INFO_TEXT_MAX_WIDTH", "F", "UNIT_TEXT_MAX_WIDTH", "SUB_UNIT_TEXT_MAX_WIDTH", "SHARING_UNIT_TEXT_MAX_WIDTH", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
