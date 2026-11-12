package wq;

import am.v1;
import am.x0;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import c22.l3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ms.z;
import ns.o3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import ps.o1;
import ps.u0;
import ps.x1;
import ps.z1;
import qs.w;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lwq/i;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lam/x0;", "activityType", "", "Lps/x1;", "activitySplits", "unfilteredSplits", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/i0;", "summary", "Lps/o1;", "splitSummaries", "Lqs/x;", "filters", "Luq/k;", "splitsViewMode", "Lkotlin/Function2;", "", "Lcom/garmin/android/apps/connectmobile/activity/model/SplitIndex;", "", "editListener", "", "isLandscapeSupported", "Lps/i0;", "diveActivityDTO", "hasFiveHz", "", "deviceName", "<init>", "(Landroid/content/Context;Lam/x0;Ljava/util/List;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/activities/newmodel/i0;Ljava/util/List;Ljava/util/List;Luq/k;Le23/p;ZLps/i0;ZLjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f186557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f186558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<x1> f186559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<x1> f186560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f186561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<o1> f186562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<x> f186563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uq.k f186564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e23.p<x1, Integer, Unit> f186565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f186566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ps.i0 f186567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f186568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f186569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f186570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f186571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uq.b f186572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uq.a f186573q;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f186575b;

        static {
            int[] iArr = new int[uq.k.values().length];
            try {
                iArr[uq.k.COMPARISON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uq.k.ALTERNATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f186574a = iArr;
            int[] iArr2 = new int[x0.values().length];
            try {
                iArr2[x0.D2.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[x0.W1.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[x0.X1.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x0.V1.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x0.S0.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x0.T0.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[x0.O0.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[x0.f4318p2.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[x0.W2.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            f186575b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(Context context, x0 x0Var, List<x1> list, List<x1> list2, i0 i0Var, List<o1> list3, List<? extends x> list4, uq.k kVar, e23.p<? super x1, ? super Integer, Unit> pVar, boolean z14, ps.i0 i0Var2, boolean z15, String str) {
        context.getClass();
        x0Var.getClass();
        list.getClass();
        list2.getClass();
        i0Var.getClass();
        kVar.getClass();
        this.f186557a = context;
        this.f186558b = x0Var;
        this.f186559c = list;
        this.f186560d = list2;
        this.f186561e = i0Var;
        this.f186562f = list3;
        this.f186563g = list4;
        this.f186564h = kVar;
        this.f186565i = pVar;
        this.f186566j = z14;
        this.f186567k = i0Var2;
        this.f186568l = z15;
        this.f186569m = str;
        this.f186570n = new LinkedHashMap();
        l22.a aVar = new l22.a(context);
        this.f186571o = (int) TypedValue.applyDimension(1, 15.0f, context.getResources().getDisplayMetrics());
        this.f186572p = new uq.b(context, aVar, x0Var);
        this.f186573q = new uq.a(aVar, x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0303 A[PHI: r37
      0x0303: PHI (r37v77 wq.a) = (r37v16 wq.a), (r37v16 wq.a), (r37v18 wq.a), (r37v19 wq.a), (r37v73 wq.a), (r37v78 wq.a) binds: [B:252:0x070e, B:254:0x0714, B:246:0x06db, B:232:0x06a7, B:140:0x03aa, B:111:0x0301] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:305:0x084b  */
    /* JADX WARN: Code duplicated, block: B:312:0x088e  */
    /* JADX WARN: Code duplicated, block: B:314:0x089b  */
    /* JADX WARN: Code duplicated, block: B:316:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b4 A[PHI: r22 r23
      0x01b4: PHI (r22v2 int) = (r22v1 int), (r22v3 int) binds: [B:84:0x0223, B:59:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r23v2 java.lang.Integer) = (r23v1 java.lang.Integer), (r23v3 java.lang.Integer) binds: [B:84:0x0223, B:59:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x0288. Please report as an issue. */
    public static ArrayList b(i iVar, List list, boolean z14, Integer num, int i14) {
        int i15;
        Integer num2;
        int iIndexOf;
        wq.a aVar;
        String string;
        Integer messageIndex;
        int iIntValue;
        boolean z15;
        String valueKey;
        Integer numFalls;
        com.garmin.android.apps.connectmobile.activities.newmodel.u uVar;
        String string2;
        int i16;
        String string3;
        String string4;
        String strValueOf;
        int i17;
        int i18;
        int i19;
        int i24;
        i iVar2 = iVar;
        boolean z16 = (i14 & 2) != 0 ? false : z14;
        Integer num3 = (i14 & 4) != 0 ? null : num;
        int i25 = iVar2.f186571o;
        x0 x0Var = iVar2.f186558b;
        List<x> list2 = iVar2.f186563g;
        Context context = iVar2.f186557a;
        List<x1> list3 = iVar2.f186559c;
        x1 x1Var = (x1) h0.d0(list3);
        if (x1Var != null) {
            x1Var.getMessageIndex();
        }
        ArrayList arrayList = new ArrayList(y.r(list3, 10));
        int i26 = 0;
        for (Object obj : list3) {
            int i27 = i26 + 1;
            if (i26 < 0) {
                p13.x.q();
                throw null;
            }
            x1 x1Var2 = (x1) obj;
            int color = a7.b.getColor(context, i26 % 2 == 0 ? R.color.gcm_table_row_odd : R.color.gcm_table_row_even);
            uq.a aVar2 = iVar2.f186573q;
            int i28 = 2;
            switch (a.f186575b[x0Var.ordinal()]) {
                case 1:
                    i15 = i26;
                    num2 = num3;
                    if (iVar2.f186564h == uq.k.COMPARISON) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list3) {
                            if (((x1) obj2).a2() == x.PACE_PRO_SPLIT) {
                                arrayList2.add(obj2);
                            }
                        }
                        iIndexOf = h0.N0(arrayList2, new m()).indexOf(x1Var2);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list3) {
                            if (((x1) obj3).a2() == x.RUN_ACTIVE) {
                                arrayList3.add(obj3);
                            }
                        }
                        List listN0 = h0.N0(arrayList3, new n());
                        if (x1Var2.a2() == x.RUN_ACTIVE) {
                            iIndexOf = listN0.indexOf(x1Var2);
                        } else {
                            iIndexOf = -1;
                        }
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    i15 = i26;
                    num2 = num3;
                    if (list2 != null && list2.contains(x.ASCENT) && list2.size() == 1) {
                        iIndexOf = h0.N0(list3, new o()).indexOf(x1Var2) * 2;
                    } else if (list2 != null && list2.contains(x.DESCENT) && list2.size() == 1) {
                        iIndexOf = ((h0.N0(list3, new p()).indexOf(x1Var2) + 1) * 2) - 1;
                    } else if (x1Var2.a2() != x.TRANSITION) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list3) {
                            if (((x1) obj4).a2() != x.TRANSITION) {
                                arrayList4.add(obj4);
                            }
                        }
                        iIndexOf = h0.N0(arrayList4, new q()).indexOf(x1Var2);
                    } else {
                        iIndexOf = -1;
                    }
                    break;
                case 5:
                case 6:
                    i15 = i26;
                    num2 = num3;
                    iIndexOf = h0.N0(h0.N0(h0.N0(list3, new r()), new s()), new t()).indexOf(x1Var2);
                    break;
                case 7:
                    if (x1Var2.a2() == x.OBSTACLE) {
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : list3) {
                            int i29 = i26;
                            Integer num4 = num3;
                            if (((x1) obj5).a2() == x.OBSTACLE) {
                                arrayList5.add(obj5);
                            }
                            i26 = i29;
                            num3 = num4;
                        }
                        i15 = i26;
                        num2 = num3;
                        iIndexOf = h0.N0(arrayList5, new u()).indexOf(x1Var2);
                    } else {
                        i15 = i26;
                        num2 = num3;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : list3) {
                            if (((x1) obj6).a2() != x.OBSTACLE) {
                                arrayList6.add(obj6);
                            }
                        }
                        iIndexOf = h0.N0(arrayList6, new j()).indexOf(x1Var2);
                    }
                    break;
                case 8:
                case 9:
                    iIndexOf = h0.N0(iVar2.f186560d, new k()).indexOf(x1Var2);
                    i15 = i26;
                    num2 = num3;
                    break;
                default:
                    iIndexOf = h0.N0(list3, new l()).indexOf(x1Var2);
                    i15 = i26;
                    num2 = num3;
                    break;
            }
            aVar2.getClass();
            x1Var2.getClass();
            ArrayList arrayList7 = new ArrayList();
            wq.a aVar3 = new wq.a(aVar2.f172172a);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uq.h hVar = (uq.h) it.next();
                x0 x0Var2 = aVar2.f172173b;
                Iterator it3 = it;
                uq.i iVar3 = hVar.f172205a;
                int i30 = color;
                boolean z17 = z16;
                uq.a aVar4 = aVar2;
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                double dV3 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).v3();
                String str = x0Var2.f4358a;
                iVar3.getClass();
                int i34 = wq.a.C3471a.f186537a[iVar3.ordinal()];
                l22.b bVar = aVar3.f186536a;
                switch (i34) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        aVar = aVar3;
                        string = Integer.valueOf(iIndexOf + 1).toString();
                        z15 = false;
                        break;
                    case 10:
                        aVar = aVar3;
                        x xVarA2 = x1Var2.a2();
                        if (xVarA2 != null) {
                            x.f147196b.getClass();
                            if (p13.u.z(new x[]{x.RUN_REST, x.CLIMB_REST, x.ROUND_REST, x.DIVE_INTERVAL_REST}, xVarA2)) {
                                string = bVar.getString(R.string.lbl_break);
                            } else {
                                messageIndex = x1Var2.getMessageIndex();
                                l3.f23124b.getClass();
                                DecimalFormat decimalFormat = l3.f23131i;
                                if (messageIndex != null) {
                                    iIntValue = messageIndex.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                string = decimalFormat.format(Math.ceil(((double) (iIntValue + 1)) / 2.0d));
                            }
                        } else {
                            messageIndex = x1Var2.getMessageIndex();
                            l3.f23124b.getClass();
                            DecimalFormat decimalFormat2 = l3.f23131i;
                            if (messageIndex != null) {
                                iIntValue = messageIndex.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            string = decimalFormat2.format(Math.ceil(((double) (iIntValue + 1)) / 2.0d));
                        }
                        z15 = false;
                        break;
                    case 11:
                        aVar = aVar3;
                        string = Integer.valueOf(iIndexOf + 1).toString();
                        z15 = false;
                        break;
                    case 12:
                        aVar = aVar3;
                        x xVarA3 = x1Var2.a2();
                        if (xVarA3 != null) {
                            x.f147196b.getClass();
                            if (p13.u.z(new x[]{x.RUN_REST, x.CLIMB_REST, x.ROUND_REST, x.DIVE_INTERVAL_REST}, xVarA3)) {
                                string = bVar.getString(R.string.workout_step_type_rest);
                            } else {
                                string = Integer.valueOf(iIndexOf + 1).toString();
                            }
                        } else {
                            string = Integer.valueOf(iIndexOf + 1).toString();
                        }
                        z15 = false;
                        break;
                    case 13:
                        aVar = aVar3;
                        string = (list2 == null || list2.size() != 1) ? x1Var2.a2() == x.DESCENT ? "" : Integer.valueOf((iIndexOf / 2) + 1).toString() : Integer.valueOf(iIndexOf + 1).toString();
                        z15 = true;
                        break;
                    case 14:
                        aVar = aVar3;
                        string = x1Var2.a2() == x.TRANSITION ? "  " : Integer.valueOf(iIndexOf + 1).toString();
                        z15 = true;
                        break;
                    case 15:
                        aVar = aVar3;
                        string = x1Var2.a2() == x.OBSTACLE ? bVar.a(R.string.lbl_ocr_obstacle_split_index, Integer.valueOf(iIndexOf + 1)) : bVar.a(R.string.lbl_ocr_run_split_index, Integer.valueOf(iIndexOf + 1));
                        z15 = false;
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        aVar = aVar3;
                        string = f.f(x1Var2.getDuration());
                        z15 = false;
                        break;
                    case 21:
                        aVar = aVar3;
                        string = f.f(x1Var2.f140403x1);
                        z15 = false;
                        break;
                    case 22:
                        aVar = aVar3;
                        string = f.w(x1Var2.f140407z1);
                        z15 = false;
                        break;
                    case 23:
                        aVar = aVar3;
                        string = f.w(x1Var2.A1);
                        z15 = false;
                        break;
                    case 24:
                    case 25:
                        aVar = aVar3;
                        string = f.f(x1Var2.getMovingDuration());
                        z15 = false;
                        break;
                    case 26:
                        aVar = aVar3;
                        Double duration = x1Var2.getDuration();
                        double dDoubleValue = duration != null ? duration.doubleValue() : 0.0d;
                        Double movingDuration = x1Var2.getMovingDuration();
                        string = f.f(Double.valueOf(dDoubleValue - (movingDuration != null ? movingDuration.doubleValue() : 0.0d)));
                        z15 = false;
                        break;
                    case 27:
                        aVar = aVar3;
                        Double bottomTime = x1Var2.getBottomTime();
                        string = f.f(Double.valueOf((bottomTime == null && (bottomTime = x1Var2.getDuration()) == null) ? 0.0d : bottomTime.doubleValue()));
                        z15 = false;
                        break;
                    case 28:
                        aVar = aVar3;
                        string = aq.a.X(bVar, x1Var2.getSurfaceInterval());
                        z15 = false;
                        break;
                    case 29:
                        aVar = aVar3;
                        u0 difficulty = x1Var2.getDifficulty();
                        str.getClass();
                        if (difficulty == null || (valueKey = difficulty.getValueKey()) == null) {
                            string = null;
                        } else {
                            string = v1.d(str, valueKey);
                        }
                        z15 = false;
                        break;
                    case 30:
                        aVar = aVar3;
                        qs.q.a aVar5 = qs.q.f147145e;
                        String maxPisteDifficulty = x1Var2.getMaxPisteDifficulty();
                        aVar5.getClass();
                        qs.q qVarA = qs.q.a.a(maxPisteDifficulty);
                        if (qVarA != null) {
                            string = bVar.getString(qVarA.f147149b);
                            z15 = false;
                        } else {
                            z15 = false;
                            string = null;
                        }
                        break;
                    case 31:
                        aVar = aVar3;
                        if (x1Var2.getClimbSend() && (numFalls = x1Var2.getNumFalls()) != null && numFalls.intValue() == 0) {
                            string = bVar.getString(R.string.activities_climb_send);
                        } else {
                            w wVarG1 = x1Var2.G1();
                            if ((wVarG1 != null ? Integer.valueOf(wVarG1.f147195b) : null) != null) {
                                w wVarG2 = x1Var2.G1();
                                wVarG2.getClass();
                                string = bVar.getString(wVarG2.f147195b);
                            } else {
                                string = null;
                            }
                        }
                        z15 = false;
                        break;
                    case 32:
                        aVar = aVar3;
                        Integer numFalls2 = x1Var2.getNumFalls();
                        if (numFalls2 != null) {
                            string = numFalls2.toString();
                        } else {
                            string = null;
                        }
                        z15 = false;
                        break;
                    case 33:
                        aVar = aVar3;
                        string = f.c(x1Var2.getCalories());
                        z15 = false;
                        break;
                    case 34:
                        aVar = aVar3;
                        string = f.j(bVar, x1Var2.C1);
                        z15 = false;
                        break;
                    case 35:
                    case 36:
                        aVar = aVar3;
                        string = f.j(bVar, x1Var2.getAverageHR());
                        z15 = false;
                        break;
                    case 37:
                    case 38:
                        aVar = aVar3;
                        string = f.j(bVar, x1Var2.getMaxHR());
                        z15 = false;
                        break;
                    case 39:
                    case 40:
                        aVar = aVar3;
                        string = f.g(x1Var2.getElevationGain(), zY);
                        z15 = false;
                        break;
                    case 41:
                    case 42:
                        aVar = aVar3;
                        string = f.g(x1Var2.getElevationLoss(), zY);
                        z15 = false;
                        break;
                    case 43:
                        aVar = aVar3;
                        string = f.r(zY ? q3.METERS_PER_HOUR : q3.FEET_PER_HOUR, x1Var2.getAvgDescentSpeed());
                        z15 = false;
                        break;
                    case 44:
                        aVar = aVar3;
                        string = aq.a.i(bVar, x1Var2.getMaxDepth());
                        z15 = false;
                        break;
                    case 45:
                    case 46:
                        aVar = aVar3;
                        string = f.s(str, x1Var2.getMaxSpeed(), zY);
                        z15 = false;
                        break;
                    case 47:
                    case 48:
                        aVar = aVar3;
                        string = f.s(str, x1Var2.getAverageSpeed(), zY);
                        z15 = false;
                        break;
                    case 49:
                        aVar = aVar3;
                        string = f.s(str, x1Var2.getAverageMovingSpeed(), zY);
                        z15 = false;
                        break;
                    case 50:
                        aVar = aVar3;
                        string = f.o(x1Var2.getNormalizedPower());
                        z15 = false;
                        break;
                    case 51:
                        aVar = aVar3;
                        string = f.k(bVar, x1Var2.getLeftBalance(), x1Var2.getRightBalance());
                        z15 = false;
                        break;
                    case 52:
                        aVar = aVar3;
                        string = f.o(x1Var2.getAvgPower());
                        z15 = false;
                        break;
                    case 53:
                        aVar = aVar3;
                        string = f.o(x1Var2.getMaxPower());
                        z15 = false;
                        break;
                    case 54:
                        aVar = aVar3;
                        Double avgPower = x1Var2.getAvgPower();
                        string = f.p(bVar, Double.valueOf((avgPower != null ? avgPower.doubleValue() : 0.0d) / (dV3 != 0.0d ? dV3 : 1.0d)));
                        z15 = false;
                        break;
                    case 55:
                        aVar = aVar3;
                        Double maxPower = x1Var2.getMaxPower();
                        string = f.p(bVar, Double.valueOf((maxPower != null ? maxPower.doubleValue() : 0.0d) / (dV3 != 0.0d ? dV3 : 1.0d)));
                        z15 = false;
                        break;
                    case 56:
                        aVar = aVar3;
                        string = f.d(x1Var2.getAvgPower());
                        z15 = false;
                        break;
                    case 57:
                        aVar = aVar3;
                        string = f.d(x1Var2.getTargetPower());
                        z15 = false;
                        break;
                    case 58:
                        aVar = aVar3;
                        string = ss.k.b(ls.e.AVERAGE_BIKE_FORCE, bVar, x1Var2.getAvgBikeForce(), 24);
                        z15 = false;
                        break;
                    case 59:
                        aVar = aVar3;
                        string = ss.k.b(ls.e.MAX_BIKE_FORCE, bVar, x1Var2.getMaxBikeForce(), 24);
                        z15 = false;
                        break;
                    case 60:
                        aVar = aVar3;
                        string = ss.k.b(ls.e.NORMALIZED_FORCE, bVar, x1Var2.getNormalizedForce(), 24);
                        z15 = false;
                        break;
                    case 61:
                        aVar = aVar3;
                        string = f.q(x1Var2.getAverageRunCadence());
                        z15 = false;
                        break;
                    case 62:
                        aVar = aVar3;
                        string = f.q(x1Var2.getMaxRunCadence());
                        z15 = false;
                        break;
                    case 63:
                        aVar = aVar3;
                        string = f.b(x1Var2.getAvgBikeCadence());
                        z15 = false;
                        break;
                    case 64:
                        aVar = aVar3;
                        string = f.b(x1Var2.getMaxBikeCadence());
                        z15 = false;
                        break;
                    case 65:
                        aVar = aVar3;
                        string = f.u(x1Var2.getStrideLength());
                        z15 = false;
                        break;
                    case 66:
                    case 67:
                        aVar = aVar3;
                        string = f.e(x1Var2.getDistance(), str);
                        z15 = false;
                        break;
                    case 68:
                        aVar = aVar3;
                        string = f.v(x1Var2.getMinTemperature(), zY);
                        z15 = false;
                        break;
                    case 69:
                        aVar = aVar3;
                        string = f.v(x1Var2.getMaxTemperature(), zY);
                        z15 = false;
                        break;
                    case 70:
                        aVar = aVar3;
                        string = f.v(x1Var2.getAvgTemperature(), zY);
                        z15 = false;
                        break;
                    case 71:
                        aVar = aVar3;
                        string = f.v(x1Var2.getMinTemperature(), zY);
                        z15 = false;
                        break;
                    case 72:
                        aVar = aVar3;
                        string = aq.a.w(bVar, x1Var2.getStartLatitude(), x1Var2.getStartLongitude());
                        z15 = false;
                        break;
                    case 73:
                        aVar = aVar3;
                        string = f.h(bVar, x1Var2.getGroundContactTime());
                        z15 = false;
                        break;
                    case 74:
                        aVar = aVar3;
                        string = f.i(bVar, x1Var2.getGroundContactBalanceLeft());
                        z15 = false;
                        break;
                    case 75:
                        aVar = aVar3;
                        string = ss.k.b(ls.e.AVERAGE_STEP_SPEED_LOSS, bVar, x1Var2.getStepSpeedLoss(), 24);
                        z15 = false;
                        break;
                    case 76:
                        aVar = aVar3;
                        string = ss.k.b(ls.e.AVERAGE_STEP_SPEED_LOSS_PERCENT, bVar, x1Var2.getStepSpeedLossPercent(), 24);
                        z15 = false;
                        break;
                    case 77:
                        aVar = aVar3;
                        string = f.x(bVar, x1Var2.getVerticalOscillation());
                        z15 = false;
                        break;
                    case 78:
                        aVar = aVar3;
                        string = f.y(bVar, x1Var2.getVerticalRatio());
                        z15 = false;
                        break;
                    case 79:
                        aVar = aVar3;
                        string = f.l(bVar, x1Var2.getAverageSpeed(), zY);
                        z15 = false;
                        break;
                    case 80:
                        aVar = aVar3;
                        string = f.l(bVar, x1Var2.getAvgGradeAdjustedSpeed(), zY);
                        z15 = false;
                        break;
                    case 81:
                        aVar = aVar3;
                        string = f.l(bVar, x1Var2.getAverageMovingSpeed(), zY);
                        z15 = false;
                        break;
                    case 82:
                        aVar = aVar3;
                        string = f.l(bVar, x1Var2.getMaxSpeed(), zY);
                        z15 = false;
                        break;
                    case 83:
                        aVar = aVar3;
                        string = f.l(bVar, x1Var2.getTargetAvgSpeed(), zY);
                        z15 = false;
                        break;
                    case 84:
                        aVar = aVar3;
                        string = f.l(bVar, x1Var2.getAverageSpeed(), zY);
                        z15 = false;
                        break;
                    case 85:
                        aVar = aVar3;
                        string = f.r(q3.NAUTICAL_MILES_PER_HOUR, x1Var2.getMax2SecondSpeed());
                        z15 = false;
                        break;
                    case 86:
                    case 87:
                        aVar = aVar3;
                        string = f.r(q3.NAUTICAL_MILES_PER_HOUR, x1Var2.getMax10SecondSpeed());
                        z15 = false;
                        break;
                    case 88:
                        aVar = aVar3;
                        string = f.r(q3.NAUTICAL_MILES_PER_HOUR, x1Var2.getAverageSpeed());
                        z15 = false;
                        break;
                    case 89:
                        aVar = aVar3;
                        string = f.r(q3.NAUTICAL_MILES_PER_HOUR, x1Var2.getMaxSpeed());
                        z15 = false;
                        break;
                    case 90:
                        aVar = aVar3;
                        string = f.r(zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, x1Var2.getMax2SecondSpeed());
                        z15 = false;
                        break;
                    case 91:
                        aVar = aVar3;
                        string = f.r(zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, x1Var2.getMax10SecondSpeed());
                        z15 = false;
                        break;
                    case 92:
                        aVar = aVar3;
                        string = f.r(zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, x1Var2.getAverageSpeed());
                        z15 = false;
                        break;
                    case 93:
                        aVar = aVar3;
                        string = f.r(zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, x1Var2.getMaxSpeed());
                        z15 = false;
                        break;
                    case 94:
                    default:
                        aVar = aVar3;
                        z15 = false;
                        string = null;
                        break;
                    case 95:
                        aVar = aVar3;
                        String gamesStatus = x1Var2.getGamesStatus();
                        com.garmin.android.apps.connectmobile.activities.newmodel.u.f29682b.getClass();
                        com.garmin.android.apps.connectmobile.activities.newmodel.u[] uVarArrValues = com.garmin.android.apps.connectmobile.activities.newmodel.u.values();
                        int length = uVarArrValues.length;
                        int i35 = 0;
                        while (true) {
                            if (i35 < length) {
                                com.garmin.android.apps.connectmobile.activities.newmodel.u uVar2 = uVarArrValues[i35];
                                if (p005kotlin.jvm.internal.s.g(uVar2.name(), gamesStatus)) {
                                    uVar = uVar2;
                                } else {
                                    i35++;
                                }
                            } else {
                                uVar = null;
                            }
                        }
                        if (uVar != null) {
                            string = bVar.getString(uVar.f29684a);
                        } else {
                            string = null;
                        }
                        z15 = false;
                        break;
                    case 96:
                        aVar = aVar3;
                        x xVarA4 = x1Var2.a2();
                        Integer gameRank = x1Var2.getGameRank();
                        Integer gameRanksPossible = x1Var2.getGameRanksPossible();
                        if (xVarA4 == x.ROUND_ACTIVE) {
                            if (gameRank == null || (strValueOf = String.valueOf(gameRank.intValue())) == null) {
                                i16 = R.string.no_value;
                                string3 = bVar.getString(R.string.no_value);
                            } else {
                                string3 = strValueOf;
                                i16 = R.string.no_value;
                            }
                            if (gameRanksPossible == null || (string4 = String.valueOf(gameRanksPossible.intValue())) == null) {
                                string4 = bVar.getString(i16);
                            }
                            string2 = e5.g(string3, " / ", string4);
                        } else {
                            string2 = bVar.getString(R.string.no_value);
                        }
                        string = string2;
                        z15 = false;
                        break;
                    case 97:
                        aVar = aVar3;
                        string = f.t(bVar, x1Var2.getAvgStress());
                        z15 = false;
                        break;
                    case 98:
                        aVar = aVar3;
                        string = f.t(bVar, x1Var2.getMaxStress());
                        z15 = false;
                        break;
                    case 99:
                        aVar = aVar3;
                        x xVarA5 = x1Var2.a2();
                        int i36 = xVarA5 == null ? -1 : f.a.f186551b[xVarA5.ordinal()];
                        if (i36 == 1) {
                            string = bVar.getString(R.string.pool_apnea_dyn);
                        } else if (i36 == i28) {
                            string = bVar.getString(R.string.pool_apnea_sta);
                        } else if (i36 != 3) {
                            string = null;
                        } else {
                            string = bVar.getString(R.string.workout_step_type_rest);
                        }
                        z15 = false;
                        break;
                    case 100:
                        aVar = aVar3;
                        string = f.n(x1Var2.getAverageSpeed(), zY);
                        z15 = false;
                        break;
                    case 101:
                        aVar = aVar3;
                        string = f.m(x1Var2.getDistance());
                        z15 = false;
                        break;
                    case 102:
                        aVar = aVar3;
                        string = u00.b.c(new o3(bVar, true, new z()), new ps.h0(x1Var2.getPackWeight(), new z1((Double) null, (Integer) null, (zY ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null)), 16, 4);
                        z15 = false;
                        break;
                }
                if (z15) {
                    if (string == null) {
                        string = bVar.getString(R.string.no_value);
                    }
                } else if (string == null || d53.w.J(string)) {
                    string = bVar.getString(R.string.no_value);
                }
                String str2 = string;
                boolean z18 = hVar.f172206b;
                int[] iArr = wq.a.C3471a.f186537a;
                if (iArr[iVar3.ordinal()] == 84) {
                    int iA = f.a(x1Var2.getTargetAvgSpeed(), true);
                    double dAbs = Math.abs(((double) (iA - f.a(x1Var2.getAverageSpeed(), true))) / ((double) iA)) * 100.0d;
                    i17 = (0.0d > dAbs || dAbs > 2.0d) ? (2.0d > dAbs || dAbs > 5.0d) ? R.drawable.split_comparison_dot_red : R.drawable.split_comparison_dot_yellow : R.drawable.split_comparison_dot_green;
                } else {
                    i17 = 0;
                }
                int i37 = iArr[iVar3.ordinal()];
                if (i37 == 13 || i37 == 14) {
                    x xVarA6 = x1Var2.a2();
                    int i38 = xVarA6 == null ? -1 : wq.a.C3471a.f186539c[xVarA6.ordinal()];
                    if (i38 != 1) {
                        i18 = 2;
                        if (i38 != 2) {
                            if (i38 == 3) {
                                i19 = R.drawable.multisport_transition;
                            }
                            arrayList7.add(new uq.f(iVar3, z18, str2, i17, i24));
                            i28 = i18;
                            x1Var2 = x1Var2;
                            it = it3;
                            color = i30;
                            z16 = z17;
                            aVar2 = aVar4;
                            aVar3 = aVar;
                        } else {
                            i19 = 2131232533;
                        }
                    } else {
                        i18 = 2;
                        i19 = 2131232472;
                    }
                    i24 = i19;
                    arrayList7.add(new uq.f(iVar3, z18, str2, i17, i24));
                    i28 = i18;
                    x1Var2 = x1Var2;
                    it = it3;
                    color = i30;
                    z16 = z17;
                    aVar2 = aVar4;
                    aVar3 = aVar;
                } else {
                    i18 = 2;
                }
                i24 = 0;
                arrayList7.add(new uq.f(iVar3, z18, str2, i17, i24));
                i28 = i18;
                x1Var2 = x1Var2;
                it = it3;
                color = i30;
                z16 = z17;
                aVar2 = aVar4;
                aVar3 = aVar;
            }
            iVar2 = iVar;
            num3 = num2;
            LinearLayout linearLayoutA = iVar2.a(x1Var2, arrayList7, i15, num3, false, z16);
            linearLayoutA.setBackgroundColor(color);
            linearLayoutA.setPadding(i25, i25, i25, i25);
            arrayList.add(linearLayoutA);
            i26 = i27;
        }
        boolean z19 = z16;
        ArrayList arrayList8 = new ArrayList(arrayList);
        if (!z19) {
            x0Var.getClass();
            if (uq.d.b(x0Var).f172187j) {
                uq.a aVar6 = iVar2.f186573q;
                List<x> list4 = iVar2.f186563g;
                i0 i0Var = iVar2.f186561e;
                List list5 = iVar2.f186562f;
                if (list5 == null) {
                    list5 = j0.f134944a;
                }
                LinearLayout linearLayoutA2 = iVar2.a(null, aVar6.a(list, list4, i0Var, list5, iVar2.f186559c, iVar2.f186567k), arrayList8.size(), num3, true, false);
                linearLayoutA2.setBackgroundColor(a7.b.getColor(context, arrayList8.size() % 2 == 0 ? R.color.gcm_table_row_odd : R.color.gcm_table_row_even));
                linearLayoutA2.setPadding(i25, i25, i25, i25);
                arrayList8.add(linearLayoutA2);
            }
        }
        return arrayList8;
    }

    public static LinearLayout d(i iVar) {
        LayoutInflater layoutInflater;
        int i14;
        String string;
        Double weightedMeanBestFiveMaxSpeedOverTenSeconds;
        x0 x0Var = iVar.f186558b;
        Context context = iVar.f186557a;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(iVar.g() ? -1 : -2, -2));
        int i15 = iVar.f186571o;
        linearLayout.setPadding(i15, i15, i15, i15);
        linearLayout.setBackgroundResource(R.color.gcm_surface_1);
        uq.k kVar = iVar.f186564h;
        boolean zG = iVar.g();
        x0Var.getClass();
        kVar.getClass();
        int i16 = tq.k.a.f166034a[x0Var.ordinal()];
        Object obj = null;
        if ((i16 != 18 && i16 != 19) || kVar != uq.k.TOP_SPLITS || !zG) {
            return null;
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (layoutInflater = activity.getLayoutInflater()) != null) {
            l22.a aVar = new l22.a(context);
            List list = iVar.f186562f;
            if (list == null) {
                list = j0.f134944a;
            }
            uq.g gVar = new uq.g(layoutInflater, aVar, x0Var, list);
            int[] iArr = uq.g.a.f172204a;
            x0 x0Var2 = gVar.f172202c;
            int i17 = iArr[x0Var2.ordinal()];
            View viewInflate = (i17 == 1 || i17 == 2) ? gVar.f172200a.inflate(R.layout.windsurf_top_5_footer, (ViewGroup) null) : null;
            if (viewInflate != null && ((i14 = iArr[x0Var2.ordinal()]) == 1 || i14 == 2)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.top_5_avg_speed_value);
                for (Object obj2 : gVar.f172203d) {
                    if (p005kotlin.jvm.internal.s.g(x.WINDSURF_ACTIVE.f147220a, ((o1) obj2).getSplitType())) {
                        obj = obj2;
                        break;
                    }
                }
                o1 o1Var = (o1) obj;
                l22.b bVar = gVar.f172201b;
                if (o1Var == null || (weightedMeanBestFiveMaxSpeedOverTenSeconds = o1Var.getWeightedMeanBestFiveMaxSpeedOverTenSeconds()) == null) {
                    string = bVar.getString(R.string.no_value);
                } else {
                    l3.a aVar2 = l3.f23124b;
                    double dDoubleValue = weightedMeanBestFiveMaxSpeedOverTenSeconds.doubleValue();
                    q3 q3Var = q3.NAUTICAL_MILES_PER_HOUR;
                    aVar2.getClass();
                    string = l3.a.L0(dDoubleValue, q3Var, l3.f23130h);
                }
                textView.setText(string);
            }
            if (viewInflate != null) {
                viewInflate.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 4.2f));
            }
            linearLayout.addView(viewInflate);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.gcm_divider_line_thin, linearLayout2);
        linearLayout2.addView(linearLayout);
        return linearLayout2;
    }

    public static LinearLayout e(i iVar, ArrayList arrayList, boolean z14, Integer num, int i14) {
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        if ((i14 & 4) != 0) {
            num = null;
        }
        Context context = iVar.f186557a;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(iVar.g() ? -1 : -2, -2));
        linearLayout.setVerticalGravity(16);
        int i15 = iVar.f186571o;
        linearLayout.setPadding(i15, i15, i15, i15);
        linearLayout.setBackgroundResource(R.color.gcm_surface_1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uq.e eVar = (uq.e) it.next();
            ComposeView composeView = new ComposeView(iVar.f186557a, null, 0, 6, null);
            composeView.setLayoutParams(iVar.f(eVar.f172189a));
            composeView.setContent(new z3.e(-1153251095, true, new g(eVar, z14, 0)));
            linearLayout.addView(composeView);
        }
        if (num != null) {
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Float.valueOf(((uq.e) it3.next()).f172189a));
            }
            linearLayout.addView(iVar.c(arrayList2, num));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(linearLayout);
        LayoutInflater.from(context).inflate(R.layout.gcm_divider_line_thin, linearLayout2);
        return linearLayout2;
    }

    public final LinearLayout a(x1 x1Var, ArrayList arrayList, int i14, Integer num, boolean z14, boolean z15) {
        int i15;
        Context context = this.f186557a;
        LinearLayout linearLayout = new LinearLayout(context);
        Integer numValueOf = Integer.valueOf(i14);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = this.f186570n;
        linkedHashMap.put(numValueOf, arrayList2);
        int i16 = 0;
        for (Object obj : arrayList) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            uq.f fVar = (uq.f) obj;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.activity_stats_splits_list_data_row_item, (ViewGroup) null);
            viewInflate.getClass();
            TextView textView = (TextView) viewInflate;
            int i18 = fVar.f172198d;
            boolean z16 = fVar.f172196b;
            String str = fVar.f172197c;
            int i19 = 1;
            if (i18 != 0) {
                SpannableString spannableString = new SpannableString("   ".concat(str));
                spannableString.setSpan(new r22.r(context, i18, new r22.q()), 0, 1, 0);
                textView.setText(spannableString);
                i19 = 1;
            } else {
                int i24 = fVar.f172199e;
                if (i24 != 0) {
                    SpannableString spannableString2 = new SpannableString(str.concat("   "));
                    if ((x1Var != null ? x1Var.a2() : null) == x.TRANSITION) {
                        Drawable drawableA = j.a.a(context, i24);
                        if (drawableA != null) {
                            drawableA.setTint(context.getColor(R.color.gcm_activity_icon));
                            int textSize = (int) textView.getTextSize();
                            drawableA.setBounds(0, 0, (drawableA.getIntrinsicWidth() * textSize) / drawableA.getIntrinsicHeight(), textSize);
                            spannableString2.setSpan(new ImageSpan(drawableA, 2), spannableString2.length() - 1, spannableString2.length(), 0);
                            textView.setText(spannableString2);
                        }
                    } else {
                        spannableString2.setSpan(new r22.r(context, i24, new r22.n()), spannableString2.length() - 1, spannableString2.length(), 0);
                        textView.setText(spannableString2);
                    }
                    textView.setTextAlignment(6);
                } else {
                    i19 = 1;
                    textView.setText(str);
                }
            }
            textView.setLayoutParams(f(fVar.f172195a.f172257b));
            if (!z15 || (z16 && !z14)) {
                textView.setTextColor(a7.b.getColor(context, R.color.gcm_text_primary));
            } else {
                textView.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            }
            textView.setMaxLines(i19);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView);
            if (!z16 || this.f186565i == null || x1Var == null) {
                i15 = i14;
            } else {
                i15 = i14;
                textView.setOnClickListener(new lg1.b(this, x1Var, i15, fVar));
            }
            List list = (List) linkedHashMap.get(Integer.valueOf(i15));
            if (list != null) {
                list.add(textView);
            }
            i16 = i17;
        }
        if (num != null) {
            ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(Float.valueOf(((uq.f) it.next()).f172195a.f172257b));
            }
            linearLayout.addView(c(arrayList3, num));
        }
        return linearLayout;
    }

    public final FrameLayout c(ArrayList arrayList, Integer num) {
        Context context = this.f186557a;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (num != null) {
            int i14 = context.getResources().getDisplayMetrics().widthPixels;
            Iterator it = h0.V(1, arrayList).iterator();
            int i15 = 0;
            while (it.hasNext()) {
                i15 += f(((Number) it.next()).floatValue()).width;
            }
            if (num.intValue() + i15 < context.getResources().getDisplayMetrics().widthPixels) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = i14 - (num.intValue() + i15);
                frameLayout.setLayoutParams(layoutParams);
            }
        }
        return frameLayout;
    }

    public final LinearLayout.LayoutParams f(float f14) {
        return g() ? new LinearLayout.LayoutParams(0, -2, f14) : new LinearLayout.LayoutParams((int) (this.f186557a.getResources().getDimension(R.dimen.activities_laps_column_base_width) * f14), -2);
    }

    public final boolean g() {
        return this.f186557a.getResources().getConfiguration().orientation == 1;
    }

    public /* synthetic */ i(Context context, x0 x0Var, List list, List list2, i0 i0Var, List list3, List list4, uq.k kVar, e23.p pVar, boolean z14, ps.i0 i0Var2, boolean z15, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, x0Var, list, list2, i0Var, list3, (i14 & 64) != 0 ? null : list4, kVar, (i14 & 256) != 0 ? null : pVar, (i14 & 512) != 0 ? false : z14, i0Var2, z15, str);
    }
}
