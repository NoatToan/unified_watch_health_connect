package uy1;

import am.j;
import am.r1;
import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import c22.l3;
import c22.m3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.r;
import com.garmin.android.apps.connectmobile.f1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import f12.l;
import g22.n;
import gg1.o0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.o1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Luy1/i;", "Lcom/garmin/android/apps/connectmobile/f1;", "Luy1/h$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Luy1/i$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Luy1/i$a;)V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends f1 implements h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f173447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f173448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f173449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f173450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<ActivityListItemDTO> f173451g;

    public interface a {
        void t2(ActivityListItemDTO activityListItemDTO, boolean z14);
    }

    public i(Context context, a aVar) {
        context.getClass();
        aVar.getClass();
        this.f173447c = context;
        this.f173448d = aVar;
        this.f173449e = -1;
        this.f173451g = new ArrayList<>();
    }

    @Override // uy1.h.a
    public final void g(int i14) {
        this.f173450f = null;
        this.f173449e = i14;
        notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f173451g.size();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028f  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:126:0x0304  */
    /* JADX WARN: Code duplicated, block: B:128:0x0312  */
    /* JADX WARN: Code duplicated, block: B:129:0x0336  */
    /* JADX WARN: Code duplicated, block: B:131:0x0340  */
    /* JADX WARN: Code duplicated, block: B:132:0x0351  */
    /* JADX WARN: Code duplicated, block: B:134:0x036e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0385  */
    /* JADX WARN: Code duplicated, block: B:136:0x0398  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:154:0x0413  */
    /* JADX WARN: Code duplicated, block: B:157:0x0427  */
    /* JADX WARN: Code duplicated, block: B:159:0x042f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0435  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:184:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:185:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:193:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:196:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:197:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:199:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:201:0x0504  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Code duplicated, block: B:203:0x051d  */
    /* JADX WARN: Code duplicated, block: B:206:0x053d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0548  */
    /* JADX WARN: Code duplicated, block: B:209:0x054d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0560  */
    /* JADX WARN: Code duplicated, block: B:212:0x056a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0578  */
    /* JADX WARN: Code duplicated, block: B:215:0x057d  */
    /* JADX WARN: Code duplicated, block: B:218:0x0589  */
    /* JADX WARN: Code duplicated, block: B:219:0x058d  */
    /* JADX WARN: Code duplicated, block: B:227:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:230:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:234:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:235:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0167  */
    /* JADX WARN: Code duplicated, block: B:47:0x0182  */
    /* JADX WARN: Code duplicated, block: B:49:0x0192  */
    /* JADX WARN: Code duplicated, block: B:50:0x0194  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x020a  */
    /* JADX WARN: Code duplicated, block: B:71:0x022a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0264  */
    /* JADX WARN: Code duplicated, block: B:92:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x027c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0281  */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        View view2;
        ImageView imageView;
        int i15;
        String str;
        TextView textView;
        TextView textView2;
        Date date;
        String strQ;
        x0 x0Var;
        double d14;
        String string;
        String strA;
        String str2;
        String strA2;
        o1 o1VarA;
        l22.a aVar;
        String str3;
        int[] iArr;
        int i16;
        int[] iArr2;
        TextView textView3;
        CharSequence charSequence;
        o1 o1VarA2;
        String mode;
        String string2;
        double dDoubleValue;
        Double maxDistance;
        String string3;
        bb2.d dVar;
        ArrayList arrayList;
        r rVar;
        double d15;
        String string4;
        m3 m3Var;
        String strP;
        String str4;
        boolean z14;
        boolean zI;
        m3 m3Var2;
        int i17;
        String string5;
        String string6;
        String string7;
        o1 o1VarA3;
        Double elevationLoss;
        double dDoubleValue2;
        x0 x0VarM;
        x0 x0VarG;
        long j8;
        Integer noOfSplits;
        int iIntValue;
        long jIntValue;
        boolean z15;
        Integer numValueOf = f0Var != null ? Integer.valueOf(f0Var.getBindingAdapterPosition()) : null;
        if (f0Var == null || numValueOf == null || !(f0Var instanceof h)) {
            return;
        }
        h hVar = (h) f0Var;
        String str5 = hVar.f173444m;
        ImageView imageView2 = hVar.f173443l;
        TextView textView4 = hVar.f173442k;
        int iIntValue2 = numValueOf.intValue();
        int i18 = this.f173449e;
        ActivityListItemDTO activityListItemDTO = this.f173451g.get(numValueOf.intValue());
        activityListItemDTO.getClass();
        ActivityListItemDTO activityListItemDTO2 = activityListItemDTO;
        Long l14 = this.f173450f;
        TextView textView5 = hVar.f173437f;
        TextView textView6 = hVar.f173438g;
        ImageView imageView3 = hVar.f173436e;
        RelativeLayout relativeLayout = hVar.f173434c;
        TextView textView7 = hVar.f173440i;
        ImageView imageView4 = hVar.f173435d;
        TextView textView8 = hVar.f173441j;
        a aVar2 = this.f173448d;
        aVar2.getClass();
        View view3 = hVar.f173432a;
        Context context = view3.getContext();
        if (context != null) {
            imageView = imageView2;
            x0 x0Var2 = activityListItemDTO2.f29265g;
            x0Var2.getClass();
            i15 = i18;
            String str6 = x0Var2.f4358a;
            view2 = view3;
            boolean z16 = j.z(l.f68084a);
            o0 o0VarG = l.a.a().g();
            z0 z0Var = z0.f4390a;
            z0.b(x0.D, str6);
            String str7 = activityListItemDTO2.f29253c;
            if (n.d(str7)) {
                str7.getClass();
            } else {
                str7 = hVar.f173445n;
            }
            String str8 = str7;
            br.a aVar3 = br.a.f19572a;
            String str9 = activityListItemDTO2.f29259e;
            if (TextUtils.isEmpty(str9)) {
                textView = textView8;
                str = str5;
                textView2 = textView7;
            } else {
                str = str5;
                textView = textView8;
                textView2 = textView7;
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(str9);
                    date.getClass();
                } catch (ParseException unused) {
                    try {
                        date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str9);
                        date.getClass();
                    } catch (ParseException e4) {
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var = a2.ACTIVITIES;
                        aVar4.getClass();
                        i2.a.d(a2Var, e4);
                        strQ = null;
                    }
                }
                strQ = j0.q(context, new DateTime(date));
                aVar3.getClass();
                String strA3 = br.a.a(context, strQ);
                x0Var = x0.D;
                if (z0.b(x0Var, str6)) {
                    d14 = activityListItemDTO2.f29279l1;
                } else {
                    d14 = activityListItemDTO2.f29275k;
                }
                br.a aVar5 = br.a.f19572a;
                if (!Double.isNaN(d14) || d14 <= 0.0d) {
                    string = context.getString(R.string.no_duration_value);
                } else {
                    l3.a aVar6 = l3.f23124b;
                    long jRound = Math.round(d14);
                    aVar6.getClass();
                    string = l3.a.e1(jRound);
                }
                aVar5.getClass();
                String strA4 = br.a.a(context, string);
                strA = br.a.a(context, ar.b.f(context, activityListItemDTO2, z16, null));
                if (strA == null) {
                    strA = "";
                }
                str2 = strA;
                strA2 = br.a.a(context, l3.a.H(l3.f23124b, new l22.a(context), activityListItemDTO2.T, true));
                o1VarA = ly1.a.a(activityListItemDTO2);
                aVar = new l22.a(context);
                relativeLayout.setVisibility(8);
                imageView4.setVisibility(8);
                imageView3.setVisibility(8);
                if (x0Var2.f4361d != -1) {
                    relativeLayout.setVisibility(0);
                    str3 = strA2;
                    if (s.g(activityListItemDTO2.B, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (k1.f37122a.l0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                    imageView4.setImageResource(x0Var2.u(z15));
                    imageView4.setColorFilter(new PorterDuffColorFilter(a7.b.getColor(imageView4.getContext(), R.color.gcm_text_primary), PorterDuff.Mode.SRC_ATOP));
                    imageView4.setVisibility(0);
                    if (z0.b(x0Var, str6) && activityListItemDTO2.f29274j1) {
                        relativeLayout.setVisibility(0);
                        imageView3.setImageResource(2131232531);
                        imageView3.setVisibility(0);
                    }
                } else {
                    str3 = strA2;
                }
                if (z0.M(str6) || Double.isNaN(activityListItemDTO2.f29285o1) || activityListItemDTO2.f29285o1 <= 0) {
                    textView6.setVisibility(8);
                    textView5.setText(str8);
                } else {
                    textView6.setVisibility(0);
                    int i19 = activityListItemDTO2.f29285o1;
                    textView5.setText(i19 == 1 ? context.getString(R.string.lbl_dive) : context.getString(R.string.lbl_dives, String.valueOf(i19)));
                    textView6.setText(str8);
                }
                hVar.f173439h.setText(strA3);
                iArr = h.b.f173446a;
                i16 = iArr[x0Var2.ordinal()];
                if (i16 != 1) {
                    textView2.setText(l3.a.m1((long) (activityListItemDTO2.f29275k * ((double) 1000)), aVar, true));
                } else if (i16 != 2 || i16 == 3) {
                    TextView textView9 = textView2;
                    j8 = activityListItemDTO2.C1;
                    if (j8 == 0 && o1VarA != null && o1VarA.getNoOfSplits() != null) {
                        noOfSplits = o1VarA.getNoOfSplits();
                        if (noOfSplits != null) {
                            iIntValue = noOfSplits.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        j8 = iIntValue;
                    }
                    textView9.setText(r1.k(context, j8, context.getString(R.string.no_value)));
                } else if (i16 != 4) {
                    textView2.setText(strA4);
                } else {
                    TextView textView10 = textView2;
                    if ((o1VarA != null ? o1VarA.getNoOfSplits() : null) != null) {
                        Integer noOfSplits2 = o1VarA.getNoOfSplits();
                        jIntValue = noOfSplits2 != null ? noOfSplits2.intValue() : 0;
                    } else {
                        jIntValue = 0;
                    }
                    textView10.setText(r1.m(context, jIntValue, context.getString(R.string.no_value)));
                }
                switch (iArr[x0Var2.ordinal()]) {
                    case 2:
                        iArr2 = iArr;
                        textView3 = textView;
                        charSequence = "";
                        o1VarA2 = ly1.a.a(activityListItemDTO2);
                        if (o1VarA2 != null) {
                            mode = o1VarA2.getMode();
                        } else {
                            mode = activityListItemDTO2.I1;
                        }
                        if (s.g(to.i.ADVANCED.f165805a, mode)) {
                            string2 = context.getString(R.string.no_value);
                            if (o1VarA2 != null || o1VarA2.getElevationGain() == null) {
                                dDoubleValue = activityListItemDTO2.f29280m;
                            } else {
                                Double elevationGain = o1VarA2.getElevationGain();
                                dDoubleValue = elevationGain != null ? elevationGain.doubleValue() : 0.0d;
                            }
                            if (!Double.isNaN(dDoubleValue)) {
                                string2 = l3.a.a0(context, dDoubleValue, o0VarG, true, false);
                            }
                            textView3.setText(string2);
                        } else {
                            hVar.d(context, activityListItemDTO2, str6, o1VarA);
                        }
                        break;
                    case 3:
                        iArr2 = iArr;
                        charSequence = "";
                        hVar.d(context, activityListItemDTO2, str6, o1VarA);
                        break;
                    case 4:
                        iArr2 = iArr;
                        String str10 = str;
                        TextView textView11 = textView;
                        charSequence = "";
                        if (o1VarA != null) {
                            maxDistance = o1VarA.getMaxDistance();
                        } else {
                            maxDistance = null;
                        }
                        m3 m3VarC = ar.b.c(activityListItemDTO2);
                        m3VarC.getClass();
                        textView11.setText(r1.g(context, maxDistance, m3VarC, str10, R.string.activities_thumbnail_map_legend_longest_wave));
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        iArr2 = iArr;
                        TextView textView12 = textView;
                        charSequence = "";
                        string3 = context.getString(R.string.no_value);
                        string3.getClass();
                        dVar = activityListItemDTO2.f29277k1;
                        if (dVar != null && (arrayList = dVar.f17347o) != null && !arrayList.isEmpty()) {
                            rVar = (r) activityListItemDTO2.f29277k1.f17347o.get(0);
                            if (rVar == null) {
                                string4 = null;
                            } else {
                                d15 = rVar.f29644c;
                                if (d15 == 100.0d) {
                                    string4 = context.getString(R.string.dive_gas_oxygen);
                                } else if (rVar.f29643b == 0.0d) {
                                    string4 = context.getString(R.string.dive_gas_trimix, Integer.valueOf((int) d15), Integer.valueOf((int) rVar.f29643b));
                                } else if (d15 == 21.0d) {
                                    string4 = context.getString(R.string.dive_gas_air);
                                } else {
                                    string4 = context.getString(R.string.dive_gas_eanx_mix, Integer.valueOf((int) d15));
                                }
                            }
                            string3 = String.valueOf(string4);
                        }
                        textView12.setText(string3);
                        break;
                    case 9:
                        iArr2 = iArr;
                        charSequence = "";
                        textView.setText(charSequence);
                        break;
                    case 10:
                    case 11:
                        TextView textView13 = textView;
                        m3Var = m3.CENTIMETER;
                        strP = hVar.f173444m;
                        if (Double.isNaN(activityListItemDTO2.f29273j)) {
                            iArr2 = iArr;
                        } else {
                            double d16 = activityListItemDTO2.f29272i1;
                            l.f68084a.getClass();
                            l.a.a().y();
                            str4 = z0.l(x0.f4346x, activityListItemDTO2.f29265g.f4358a).f4358a;
                            if (!z0.Q(str4) || z0.b(x0.f4297k1, str4)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zI = z0.I(str4);
                            boolean zB = z0.b(x0.I0, str4);
                            boolean zB2 = z0.b(x0.f4301l1, str4);
                            if (zI) {
                                m3Var2 = m3.NAUTICAL;
                                iArr2 = iArr;
                            } else if (!z14 || zB || zB2) {
                                iArr2 = iArr;
                                m3Var2 = m3.METER;
                            } else {
                                boolean zB3 = z0.b(x0.f4324r, str4);
                                boolean zB4 = z0.b(x0Var, str4);
                                boolean zX = z0.X(str4);
                                boolean zA0 = z0.a0(str4);
                                iArr2 = iArr;
                                if (ar.b.i(activityListItemDTO2.f29265g.f4358a, activityListItemDTO2.f29273j, activityListItemDTO2.f29254c1, l.a.a().y(), activityListItemDTO2.N0)) {
                                    m3Var2 = (zB3 || zB4 || zX || zA0) ? m3.METER : m3.KILOMETER;
                                } else if (zB3) {
                                    m3Var2 = m3.YARD;
                                } else {
                                    m3Var2 = (zB4 || zX || zA0) ? m3.FOOT : m3.MILE;
                                }
                            }
                            strP = l3.a.P(context, l3.a.h(d16, m3Var), m3Var2, l3.m(), true, strP);
                        }
                        textView13.setText(strP);
                        charSequence = "";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        textView.setText(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).f(activityListItemDTO2.f29301x1, x0Var2, context));
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                    case 15:
                        String str11 = str;
                        TextView textView14 = textView;
                        i17 = activityListItemDTO2.f29287p1;
                        if (i17 == 1) {
                            string5 = context.getString(R.string.lbl_one_floor);
                        } else if (i17 != 0 || i17 > 1) {
                            string5 = context.getString(R.string.lbl_floors_plural, String.valueOf(i17));
                        } else {
                            string5 = str11;
                        }
                        textView14.setText(string5);
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                    case 16:
                        textView.setText(r1.h(context, Double.valueOf(activityListItemDTO2.f29297v1), str));
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                    case 17:
                    case 18:
                        textView.setText(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).o(context, activityListItemDTO2.f29294t1, str));
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                    case 19:
                    case 20:
                        TextView textView15 = textView;
                        if (Double.isNaN(activityListItemDTO2.f29286p)) {
                            string6 = context.getString(R.string.no_value);
                            string6.getClass();
                        } else {
                            string6 = l3.a.M0(context, activityListItemDTO2.f29286p, q3.NAUTICAL_MILES_PER_HOUR, l3.f23130h, true);
                        }
                        String string8 = context.getString(R.string.lbl_max_nautical_sog_shortened);
                        string8.getClass();
                        p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                        q6.f.y(new Object[]{string6, string8}, 2, "%s %s", textView15);
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                    case 21:
                    case 22:
                    case 23:
                        p005kotlin.jvm.internal.x0 x0Var4 = p005kotlin.jvm.internal.x0.f105818a;
                        textView.setText(l3.a.k0(aVar, activityListItemDTO2.X, true, String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.no_value), context.getString(R.string.lbl_bpm)}, 2))));
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                    case 24:
                        TextView textView16 = textView;
                        string7 = context.getString(R.string.no_value);
                        string7.getClass();
                        o1VarA3 = ly1.a.a(activityListItemDTO2);
                        if (o1VarA3 != null) {
                            elevationLoss = o1VarA3.getElevationLoss();
                        } else {
                            elevationLoss = null;
                        }
                        if (elevationLoss != null) {
                            Double elevationLoss2 = o1VarA3.getElevationLoss();
                            dDoubleValue2 = elevationLoss2 != null ? elevationLoss2.doubleValue() : 0.0d;
                        } else {
                            dDoubleValue2 = activityListItemDTO2.f29282n;
                        }
                        if (!Double.isNaN(dDoubleValue2)) {
                            string7 = l3.a.a0(context, dDoubleValue2, o0VarG, true, false);
                        }
                        textView16.setText(string7);
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                    default:
                        x0VarM = z0.m(str6);
                        if (x0VarM != null) {
                            x0VarG = z0.g(x0VarM);
                        } else {
                            x0VarG = null;
                        }
                        if (x0VarG == x0.f4316p) {
                            textView.setText(str3);
                        } else {
                            textView.setText(str2);
                        }
                        iArr2 = iArr;
                        charSequence = "";
                        break;
                }
                if (iArr2[x0Var2.ordinal()] == 25) {
                    String string9 = context.getString(R.string.string_space_string_pattern, context.getString(R.string.no_value), context.getString(R.string.lbl_bpm));
                    string9.getClass();
                    textView4.setText(l3.a.k0(aVar, activityListItemDTO2.X, true, string9));
                } else {
                    textView4.setText(charSequence);
                }
            }
            strQ = null;
            aVar3.getClass();
            String strA5 = br.a.a(context, strQ);
            x0Var = x0.D;
            if (z0.b(x0Var, str6)) {
                d14 = activityListItemDTO2.f29279l1;
            } else {
                d14 = activityListItemDTO2.f29275k;
            }
            br.a aVar7 = br.a.f19572a;
            if (Double.isNaN(d14)) {
                string = context.getString(R.string.no_duration_value);
            } else {
                string = context.getString(R.string.no_duration_value);
            }
            aVar7.getClass();
            String strA6 = br.a.a(context, string);
            strA = br.a.a(context, ar.b.f(context, activityListItemDTO2, z16, null));
            if (strA == null) {
                strA = "";
            }
            str2 = strA;
            strA2 = br.a.a(context, l3.a.H(l3.f23124b, new l22.a(context), activityListItemDTO2.T, true));
            o1VarA = ly1.a.a(activityListItemDTO2);
            aVar = new l22.a(context);
            relativeLayout.setVisibility(8);
            imageView4.setVisibility(8);
            imageView3.setVisibility(8);
            if (x0Var2.f4361d != -1) {
                relativeLayout.setVisibility(0);
                str3 = strA2;
                if (s.g(activityListItemDTO2.B, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (k1.f37122a.l0()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
                imageView4.setImageResource(x0Var2.u(z15));
                imageView4.setColorFilter(new PorterDuffColorFilter(a7.b.getColor(imageView4.getContext(), R.color.gcm_text_primary), PorterDuff.Mode.SRC_ATOP));
                imageView4.setVisibility(0);
                if (z0.b(x0Var, str6)) {
                    relativeLayout.setVisibility(0);
                    imageView3.setImageResource(2131232531);
                    imageView3.setVisibility(0);
                }
            } else {
                str3 = strA2;
            }
            if (z0.M(str6)) {
                textView6.setVisibility(8);
                textView5.setText(str8);
            } else {
                textView6.setVisibility(8);
                textView5.setText(str8);
            }
            hVar.f173439h.setText(strA5);
            iArr = h.b.f173446a;
            i16 = iArr[x0Var2.ordinal()];
            if (i16 != 1) {
                textView2.setText(l3.a.m1((long) (activityListItemDTO2.f29275k * ((double) 1000)), aVar, true));
            } else if (i16 != 2) {
                TextView textView17 = textView2;
                j8 = activityListItemDTO2.C1;
                if (j8 == 0) {
                    noOfSplits = o1VarA.getNoOfSplits();
                    if (noOfSplits != null) {
                        iIntValue = noOfSplits.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    j8 = iIntValue;
                }
                textView17.setText(r1.k(context, j8, context.getString(R.string.no_value)));
            } else {
                TextView textView18 = textView2;
                j8 = activityListItemDTO2.C1;
                if (j8 == 0) {
                    noOfSplits = o1VarA.getNoOfSplits();
                    if (noOfSplits != null) {
                        iIntValue = noOfSplits.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    j8 = iIntValue;
                }
                textView18.setText(r1.k(context, j8, context.getString(R.string.no_value)));
            }
            switch (iArr[x0Var2.ordinal()]) {
                case 2:
                    iArr2 = iArr;
                    textView3 = textView;
                    charSequence = "";
                    o1VarA2 = ly1.a.a(activityListItemDTO2);
                    if (o1VarA2 != null) {
                        mode = o1VarA2.getMode();
                    } else {
                        mode = activityListItemDTO2.I1;
                    }
                    if (s.g(to.i.ADVANCED.f165805a, mode)) {
                        string2 = context.getString(R.string.no_value);
                        if (o1VarA2 != null) {
                            dDoubleValue = activityListItemDTO2.f29280m;
                        } else {
                            dDoubleValue = activityListItemDTO2.f29280m;
                        }
                        if (!Double.isNaN(dDoubleValue)) {
                            string2 = l3.a.a0(context, dDoubleValue, o0VarG, true, false);
                        }
                        textView3.setText(string2);
                    } else {
                        hVar.d(context, activityListItemDTO2, str6, o1VarA);
                    }
                    break;
                case 3:
                    iArr2 = iArr;
                    charSequence = "";
                    hVar.d(context, activityListItemDTO2, str6, o1VarA);
                    break;
                case 4:
                    iArr2 = iArr;
                    String str12 = str;
                    TextView textView19 = textView;
                    charSequence = "";
                    if (o1VarA != null) {
                        maxDistance = o1VarA.getMaxDistance();
                    } else {
                        maxDistance = null;
                    }
                    m3 m3VarC2 = ar.b.c(activityListItemDTO2);
                    m3VarC2.getClass();
                    textView19.setText(r1.g(context, maxDistance, m3VarC2, str12, R.string.activities_thumbnail_map_legend_longest_wave));
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    iArr2 = iArr;
                    TextView textView110 = textView;
                    charSequence = "";
                    string3 = context.getString(R.string.no_value);
                    string3.getClass();
                    dVar = activityListItemDTO2.f29277k1;
                    if (dVar != null) {
                        rVar = (r) activityListItemDTO2.f29277k1.f17347o.get(0);
                        if (rVar == null) {
                            string4 = null;
                        } else {
                            d15 = rVar.f29644c;
                            if (d15 == 100.0d) {
                                string4 = context.getString(R.string.dive_gas_oxygen);
                            } else if (rVar.f29643b == 0.0d) {
                                string4 = context.getString(R.string.dive_gas_trimix, Integer.valueOf((int) d15), Integer.valueOf((int) rVar.f29643b));
                            } else if (d15 == 21.0d) {
                                string4 = context.getString(R.string.dive_gas_air);
                            } else {
                                string4 = context.getString(R.string.dive_gas_eanx_mix, Integer.valueOf((int) d15));
                            }
                        }
                        string3 = String.valueOf(string4);
                    }
                    textView110.setText(string3);
                    break;
                case 9:
                    iArr2 = iArr;
                    charSequence = "";
                    textView.setText(charSequence);
                    break;
                case 10:
                case 11:
                    TextView textView111 = textView;
                    m3Var = m3.CENTIMETER;
                    strP = hVar.f173444m;
                    if (Double.isNaN(activityListItemDTO2.f29273j)) {
                        double d17 = activityListItemDTO2.f29272i1;
                        l.f68084a.getClass();
                        l.a.a().y();
                        str4 = z0.l(x0.f4346x, activityListItemDTO2.f29265g.f4358a).f4358a;
                        if (z0.Q(str4)) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        zI = z0.I(str4);
                        boolean zB5 = z0.b(x0.I0, str4);
                        boolean zB6 = z0.b(x0.f4301l1, str4);
                        if (zI) {
                            m3Var2 = m3.NAUTICAL;
                            iArr2 = iArr;
                        } else if (z14) {
                            iArr2 = iArr;
                            m3Var2 = m3.METER;
                        } else {
                            iArr2 = iArr;
                            m3Var2 = m3.METER;
                        }
                        strP = l3.a.P(context, l3.a.h(d17, m3Var), m3Var2, l3.m(), true, strP);
                    } else {
                        iArr2 = iArr;
                    }
                    textView111.setText(strP);
                    charSequence = "";
                    break;
                case 12:
                case 13:
                case 14:
                    textView.setText(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).f(activityListItemDTO2.f29301x1, x0Var2, context));
                    iArr2 = iArr;
                    charSequence = "";
                    break;
                case 15:
                    String str13 = str;
                    TextView textView112 = textView;
                    i17 = activityListItemDTO2.f29287p1;
                    if (i17 == 1) {
                        string5 = context.getString(R.string.lbl_one_floor);
                    } else if (i17 != 0) {
                        string5 = context.getString(R.string.lbl_floors_plural, String.valueOf(i17));
                    } else {
                        string5 = context.getString(R.string.lbl_floors_plural, String.valueOf(i17));
                    }
                    textView112.setText(string5);
                    iArr2 = iArr;
                    charSequence = "";
                    break;
                case 16:
                    textView.setText(r1.h(context, Double.valueOf(activityListItemDTO2.f29297v1), str));
                    iArr2 = iArr;
                    charSequence = "";
                    break;
                case 17:
                case 18:
                    textView.setText(((jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null)).o(context, activityListItemDTO2.f29294t1, str));
                    iArr2 = iArr;
                    charSequence = "";
                    break;
                case 19:
                case 20:
                    TextView textView113 = textView;
                    if (Double.isNaN(activityListItemDTO2.f29286p)) {
                        string6 = l3.a.M0(context, activityListItemDTO2.f29286p, q3.NAUTICAL_MILES_PER_HOUR, l3.f23130h, true);
                    } else {
                        string6 = context.getString(R.string.no_value);
                        string6.getClass();
                    }
                    String string10 = context.getString(R.string.lbl_max_nautical_sog_shortened);
                    string10.getClass();
                    p005kotlin.jvm.internal.x0 x0Var5 = p005kotlin.jvm.internal.x0.f105818a;
                    q6.f.y(new Object[]{string6, string10}, 2, "%s %s", textView113);
                    iArr2 = iArr;
                    charSequence = "";
                    break;
                case 21:
                case 22:
                case 23:
                    p005kotlin.jvm.internal.x0 x0Var6 = p005kotlin.jvm.internal.x0.f105818a;
                    textView.setText(l3.a.k0(aVar, activityListItemDTO2.X, true, String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.no_value), context.getString(R.string.lbl_bpm)}, 2))));
                    iArr2 = iArr;
                    charSequence = "";
                    break;
                case 24:
                    TextView textView114 = textView;
                    string7 = context.getString(R.string.no_value);
                    string7.getClass();
                    o1VarA3 = ly1.a.a(activityListItemDTO2);
                    if (o1VarA3 != null) {
                        elevationLoss = o1VarA3.getElevationLoss();
                    } else {
                        elevationLoss = null;
                    }
                    if (elevationLoss != null) {
                        Double elevationLoss3 = o1VarA3.getElevationLoss();
                        dDoubleValue2 = elevationLoss3 != null ? elevationLoss3.doubleValue() : 0.0d;
                    } else {
                        dDoubleValue2 = activityListItemDTO2.f29282n;
                    }
                    if (!Double.isNaN(dDoubleValue2)) {
                        string7 = l3.a.a0(context, dDoubleValue2, o0VarG, true, false);
                    }
                    textView114.setText(string7);
                    iArr2 = iArr;
                    charSequence = "";
                    break;
                default:
                    x0VarM = z0.m(str6);
                    if (x0VarM != null) {
                        x0VarG = z0.g(x0VarM);
                    } else {
                        x0VarG = null;
                    }
                    if (x0VarG == x0.f4316p) {
                        textView.setText(str3);
                    } else {
                        textView.setText(str2);
                    }
                    iArr2 = iArr;
                    charSequence = "";
                    break;
            }
            if (iArr2[x0Var2.ordinal()] == 25) {
                String string11 = context.getString(R.string.string_space_string_pattern, context.getString(R.string.no_value), context.getString(R.string.lbl_bpm));
                string11.getClass();
                textView4.setText(l3.a.k0(aVar, activityListItemDTO2.X, true, string11));
            } else {
                textView4.setText(charSequence);
            }
        } else {
            view2 = view3;
            imageView = imageView2;
            i15 = i18;
        }
        view2.setOnClickListener(new lg1.b(hVar, aVar2, activityListItemDTO2, iIntValue2, 3));
        if (i15 != iIntValue2) {
            long j14 = activityListItemDTO2.f29250b;
            if (l14 == null || j14 != l14.longValue()) {
                v22.e.j(imageView);
                return;
            }
        }
        v22.e.q(imageView);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = LayoutInflater.from(this.f173447c).inflate(R.layout.event_activity_list_item, viewGroup, false);
        viewInflate.getClass();
        return new h(viewInflate, this);
    }
}
