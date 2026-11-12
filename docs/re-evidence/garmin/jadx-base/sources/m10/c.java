package m10;

import am.r1;
import am.v1;
import am.x0;
import am.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.j0;
import c22.l3;
import c22.m3;
import c22.p0;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import f12.l;
import gg1.o0;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import tn.k;
import to.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lm10/c;", "", "Landroid/content/Context;", "mContext", "", "dateFormat", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f115765g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f115770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SimpleDateFormat f115771f;

    public c(Context context, String str) {
        context.getClass();
        this.f115766a = context;
        String string = context.getString(R.string.no_value);
        string.getClass();
        this.f115767b = string;
        this.f115768c = a7.b.getColor(context, R.color.gcm_text_primary_action);
        this.f115769d = a7.b.getColor(context, R.color.gcm_text_secondary_disabled);
        String string2 = context.getString(R.string.txt_untitle);
        string2.getClass();
        this.f115770e = string2;
        this.f115771f = new SimpleDateFormat(str, Locale.getDefault());
    }

    public static int f(String str) {
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.X2, str)) {
            return 32;
        }
        if (z0.b(x0.D, str)) {
            return z0.M(str) ? 5 : 0;
        }
        if (z0.b(x0.C2, str)) {
            return 9;
        }
        if (z0.b(x0.f4344w2, str)) {
            return 13;
        }
        if (z0.P(str) || z0.o(str)) {
            return 10;
        }
        if (z0.O(str)) {
            return 11;
        }
        if (z0.e0(str)) {
            return 9;
        }
        if (z0.L(str)) {
            return 19;
        }
        if (z0.G(str)) {
            return 2;
        }
        if (z0.b(x0.O1, str)) {
            return 11;
        }
        return (z0.z(str) || z0.W(str) || z0.t(str) || z0.e0(str) || z0.N(str) || z0.b(x0.f4352y2, str) || z0.b(x0.f4356z2, str) || z0.J(str) || z0.X(str) || z0.a0(str) || z0.b(x0.E2, str)) ? 0 : 12;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x024e  */
    /* JADX WARN: Code duplicated, block: B:141:0x027d  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    public final void a(d dVar, ActivityListItemDTO activityListItemDTO, int i14) {
        boolean z14;
        int i15;
        TextView textView = dVar.f115781j;
        TextView textView2 = dVar.f115784m;
        UserLevelImageView userLevelImageView = dVar.f115776e;
        TextView textView3 = dVar.f115777f;
        TextView textView4 = dVar.f115780i;
        TextView textView5 = dVar.f115783l;
        TextView textView6 = dVar.f115786o;
        TextView textView7 = dVar.f115785n;
        ImageView imageView = dVar.f115774c;
        ImageView imageView2 = dVar.f115773b;
        if (activityListItemDTO != null) {
            x0 x0Var = activityListItemDTO.f29265g;
            if (s.g(activityListItemDTO.B, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.l0()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            int iU = x0Var.u(z14);
            ImageView imageView3 = dVar.f115775d;
            if (iU == -1) {
                iU = 0;
            }
            imageView3.setImageResource(iU);
            int i16 = activityListItemDTO.S0;
            boolean z15 = activityListItemDTO.V0;
            l3.f23124b.getClass();
            textView7.setText(l3.a.B(i16));
            int i17 = this.f115769d;
            textView7.setTextColor(z15 ? this.f115768c : i17);
            textView7.setVisibility(i16 > 0 ? 0 : 8);
            imageView2.setImageResource(z15 ? R.drawable.favorite_fill : R.drawable.favorite_outline);
            Context context = this.f115766a;
            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
            imageView2.setVisibility(i16 > 0 ? 0 : 8);
            imageView2.setTag(Integer.valueOf(i14));
            int i18 = activityListItemDTO.T0;
            textView6.setText(l3.a.B(i18));
            textView6.setTextColor(i17);
            textView6.setVisibility(i18 > 0 ? 0 : 8);
            imageView.setTag(Integer.valueOf(i14));
            imageView.setImageResource(R.drawable.comment_outline);
            imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
            imageView.setVisibility(i18 > 0 ? 0 : 8);
            textView4.setText(context.getString(z15 ? R.string.lbl_unlike : R.string.lbl_like));
            textView3.setText(p0.a(activityListItemDTO.C, activityListItemDTO.B));
            String str = activityListItemDTO.F;
            if (TextUtils.isEmpty(str)) {
                str = activityListItemDTO.E;
            }
            if (TextUtils.isEmpty(str)) {
                str = activityListItemDTO.D;
            }
            String str2 = str;
            userLevelImageView.setImageUrl(str2);
            String str3 = activityListItemDTO.C;
            str3.getClass();
            String str4 = activityListItemDTO.B;
            str2.getClass();
            ew2.c cVar = new ew2.c(str4, this, str3, str2, 14);
            textView3.setOnClickListener(cVar);
            userLevelImageView.setOnClickListener(cVar);
            boolean zIsEmpty = TextUtils.isEmpty(activityListItemDTO.f29253c);
            TextView textView8 = dVar.f115778g;
            if (zIsEmpty) {
                textView8.setText(this.f115770e);
            } else {
                textView8.setText(activityListItemDTO.f29253c);
            }
            dVar.f115779h.setText(e(activityListItemDTO.f29259e));
            String str5 = x0Var.f4358a;
            String str6 = activityListItemDTO.I1;
            TextView textView9 = dVar.f115782k;
            z0 z0Var = z0.f4390a;
            x0 x0Var2 = x0.D;
            int i19 = 3;
            int i24 = 2;
            if (z0.b(x0Var2, str5)) {
                i15 = 6;
            } else if (z0.b(x0.f4344w2, str5) || z0.b(x0.E2, str5)) {
                i15 = 3;
            } else if (z0.z(str5)) {
                i15 = 2;
            } else if (z0.f0(str5) && !z0.t(str5) && !z0.b(x0.C2, str5) && !z0.b(x0.f4357z3, str5) && !z0.b(x0.A3, str5) && !z0.G(str5)) {
                i15 = 14;
            } else if (z0.b(x0.f4297k1, str5) || z0.b(x0.f4301l1, str5)) {
                i15 = 4;
            } else if (z0.b(x0.f4352y2, str5) || z0.b(x0.f4356z2, str5)) {
                i15 = 16;
            } else if (z0.J(str5) || z0.L(str5)) {
                i15 = 3;
            } else if (z0.X(str5)) {
                i15 = 20;
            } else if (z0.a0(str5)) {
                i15 = 28;
            } else if (z0.b(x0.C2, str5) || z0.G(str5)) {
                i15 = 3;
            } else {
                x0 x0VarM = z0.m(str5);
                if ((x0VarM != null ? z0.g(x0VarM) : null) == x0.f4316p) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
            }
            textView9.setText(c(i15, activityListItemDTO));
            if (z0.b(x0Var2, str5)) {
                i19 = 7;
            } else if (z0.b(x0.C2, str5)) {
                i19 = i24;
            } else if (z0.b(x0.f4344w2, str5) || z0.b(x0.E2, str5)) {
                i19 = 9;
            } else if (z0.o(str5)) {
                i19 = 15;
            } else {
                i24 = 17;
                if (z0.b(x0.f4352y2, str5)) {
                    if (!s.g(i.ADVANCED.f165805a, str6)) {
                        i19 = 15;
                    }
                } else if (!z0.b(x0.f4356z2, str5)) {
                    if (z0.J(str5)) {
                        i19 = 18;
                    } else if (z0.L(str5) || z0.G(str5)) {
                        i19 = 9;
                    } else if (z0.X(str5)) {
                        i19 = 21;
                    } else if (z0.a0(str5)) {
                        i19 = 27;
                    }
                }
                i19 = i24;
            }
            textView5.setText(c(i19, activityListItemDTO));
            ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (f(str5) != 0) {
                textView2.setVisibility(0);
                textView2.setText(c(f(str5), activityListItemDTO));
                layoutParams2.weight = 0.3f;
            } else {
                textView2.setVisibility(8);
                layoutParams2.weight = 0.7f;
            }
            textView5.setLayoutParams(layoutParams2);
            textView5.requestLayout();
            textView4.setVisibility(0);
            textView.setVisibility(0);
        }
    }

    public final void b(d dVar, oq1.a aVar) {
        int i14;
        boolean likedByUser;
        int numberOfComments;
        TextView textView = dVar.f115778g;
        TextView textView2 = dVar.f115780i;
        UserLevelImageView userLevelImageView = dVar.f115776e;
        TextView textView3 = dVar.f115777f;
        TextView textView4 = dVar.f115786o;
        ImageView imageView = dVar.f115773b;
        TextView textView5 = dVar.f115785n;
        ImageView imageView2 = dVar.f115774c;
        if (aVar != null) {
            dVar.f115775d.setVisibility(8);
            mo1.d dVar2 = aVar.f133297m;
            if (dVar2 != null) {
                int numberOfLikes = dVar2.getNumberOfLikes();
                numberOfComments = dVar2.getNumberOfComments();
                likedByUser = dVar2.getLikedByUser();
                i14 = numberOfLikes;
            } else {
                i14 = 0;
                likedByUser = false;
                numberOfComments = 0;
            }
            textView5.setText(String.valueOf(i14));
            int i15 = this.f115769d;
            textView5.setTextColor(likedByUser ? this.f115768c : i15);
            textView5.setVisibility(i14 > 0 ? 0 : 8);
            imageView.setImageResource(likedByUser ? R.drawable.favorite_fill : R.drawable.favorite_outline);
            Context context = this.f115766a;
            imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
            imageView.setVisibility(i14 > 0 ? 0 : 8);
            textView4.setText(String.valueOf(numberOfComments));
            textView4.setTextColor(i15);
            textView4.setVisibility(numberOfComments > 0 ? 0 : 8);
            imageView2.setTag(0);
            imageView2.setImageResource(R.drawable.comment_outline);
            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
            imageView2.setVisibility(numberOfComments > 0 ? 0 : 8);
            String strA = aVar.f133286b;
            com.garmin.android.apps.connectmobile.connections.model.c cVar = aVar.f133288d;
            if (cVar != null) {
                strA = p0.a(cVar.f31697c, strA);
            }
            textView3.setText(strA);
            com.garmin.android.apps.connectmobile.connections.model.c cVar2 = aVar.f133288d;
            cVar2.getClass();
            String str = cVar2.f31699e;
            userLevelImageView.setImageUrl(str);
            com.garmin.android.apps.connectmobile.connections.model.c cVar3 = aVar.f133288d;
            cVar3.getClass();
            String str2 = cVar3.f31697c;
            str2.getClass();
            String str3 = aVar.f133286b;
            str.getClass();
            ew2.c cVar4 = new ew2.c(str3, this, str2, str, 14);
            textView3.setOnClickListener(cVar4);
            userLevelImageView.setOnClickListener(cVar4);
            textView2.setText(context.getString(likedByUser ? R.string.lbl_unlike : R.string.lbl_like));
            textView2.setTag(0);
            textView.setText(R.string.txt_title_daily_steps);
            textView.setTextColor(-1);
            dVar.f115779h.setText(e(aVar.f133292h));
            l3.a aVar2 = l3.f23124b;
            int i16 = aVar.f133291g;
            aVar2.getClass();
            String strZ0 = l3.a.Z0(i16);
            TextView textView6 = dVar.f115782k;
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            String string = context.getString(R.string.steps_with_label);
            string.getClass();
            f.y(new Object[]{strZ0}, 1, string, textView6);
            TextView textView7 = dVar.f115783l;
            String string2 = context.getString(R.string.connections_news_feed_steps_goal_attained_with_label, NumberFormat.getInstance().format(l3.a.a(aVar.f133290f, aVar.f133291g)));
            string2.getClass();
            textView7.setText(string2);
            dVar.f115784m.setVisibility(8);
            dVar.f115772a.setEnabled(false);
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public final String c(int i14, ActivityListItemDTO activityListItemDTO) {
        String strG;
        String string;
        String strK0;
        q3 q3Var;
        Context context = this.f115766a;
        l22.a aVar = new l22.a(context);
        String str = this.f115767b;
        a aVar2 = f115765g;
        switch (i14) {
            case 1:
                Object obj = KoinJavaComponent.get$default(l.class, null, null, 6, null);
                obj.getClass();
                return ar.b.f(context, activityListItemDTO, ((l) obj).y(), str);
            case 2:
                l3.a aVar3 = l3.f23124b;
                double d14 = activityListItemDTO.T;
                aVar3.getClass();
                return l3.a.G(aVar, d14, true);
            case 3:
                x0 x0Var = activityListItemDTO.f29265g;
                x0Var.getClass();
                return d(x0Var, activityListItemDTO.f29275k);
            case 4:
                new mn.a(aVar);
                return mn.a.c(context, activityListItemDTO.f29294t1, context.getString(R.string.no_value));
            case 5:
                long j8 = activityListItemDTO.f29255c2;
                if (j8 > 1) {
                    return context.getString(R.string.lbl_dives, String.valueOf(j8));
                }
                return j8 == 1 ? context.getString(R.string.lbl_dive) : context.getString(R.string.no_value);
            case 6:
                Object obj2 = KoinJavaComponent.get$default(l.class, null, null, 6, null);
                obj2.getClass();
                m3 m3Var = ((l) obj2).y() ? m3.METER : m3.FOOT;
                l3.f23124b.getClass();
                return l3.a.P(context, Double.isNaN(activityListItemDTO.f29272i1) ? 0.0d : activityListItemDTO.f29272i1, m3Var, l3.f23130h, true, "");
            case 7:
                x0 x0Var2 = activityListItemDTO.f29265g;
                x0Var2.getClass();
                return d(x0Var2, activityListItemDTO.f29279l1);
            case 8:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            default:
                return "";
            case 9:
                p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{str, context.getString(R.string.lbl_bpm)}, 2));
                l3.a aVar4 = l3.f23124b;
                double d15 = activityListItemDTO.X;
                aVar4.getClass();
                return l3.a.k0(aVar, d15, true, str2);
            case 10:
                aVar2.getClass();
                double d16 = activityListItemDTO.f29282n;
                o0 o0VarG = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
                boolean zO = z0.o(activityListItemDTO.f29265g.f4358a);
                DecimalFormat decimalFormat = zO ? l3.f23135m : l3.f23126d;
                l3.f23124b.getClass();
                String strZ = l3.a.Z(context, d16, o0VarG, false, decimalFormat);
                return zO ? "-".concat(strZ) : strZ;
            case 11:
                aVar2.getClass();
                Object obj3 = KoinJavaComponent.get$default(l.class, null, null, 6, null);
                obj3.getClass();
                boolean zH = ar.b.h(activityListItemDTO, ((l) obj3).y());
                double d17 = activityListItemDTO.f29286p;
                q3 q3Var2 = zH ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.f23124b.getClass();
                return l3.a.M0(context, d17, q3Var2, l3.f23130h, true);
            case 12:
                aVar2.getClass();
                String str3 = activityListItemDTO.f29265g.f4358a;
                z0 z0Var = z0.f4390a;
                boolean zB = z0.b(x0.f4324r, str3);
                boolean zI = z0.I(activityListItemDTO.f29265g.f4358a);
                Object obj4 = KoinJavaComponent.get$default(l.class, null, null, 6, null);
                obj4.getClass();
                boolean zH2 = ar.b.h(activityListItemDTO, ((l) obj4).y());
                boolean zB2 = z0.b(x0.D2, activityListItemDTO.f29265g.f4358a);
                if (z0.c(activityListItemDTO.f29265g.f4358a)) {
                    if (zI) {
                        q3Var = q3.NAUTICAL_MILES_PER_HOUR;
                    } else {
                        q3Var = zH2 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                    }
                    q3 q3Var3 = q3Var;
                    l3.a aVar5 = l3.f23124b;
                    double d18 = activityListItemDTO.f29284o;
                    aVar5.getClass();
                    return l3.a.M0(context, d18, q3Var3, l3.f23130h, true);
                }
                if (!zB2) {
                    l3.a aVar6 = l3.f23124b;
                    double d19 = activityListItemDTO.f29284o;
                    aVar6.getClass();
                    String string2 = context.getString(R.string.no_duration_value);
                    string2.getClass();
                    return aVar6.J1(context, d19, zB, zH2, true, string2);
                }
                double d24 = activityListItemDTO.f29284o;
                String str4 = activityListItemDTO.f29265g.f4358a;
                Object string3 = context.getString(R.string.no_value_card);
                if (Double.isNaN(d24) || d24 <= 0.0d) {
                    strG = string3;
                } else {
                    if (z0.b(x0.f4297k1, str4) || z0.b(x0.f4301l1, str4)) {
                        l3.a aVar7 = l3.f23124b;
                        aVar7.getClass();
                        strK0 = aVar7.K0(context, l3.a.q(d24), false, string3);
                        string = StringUtils.SPACE + context.getString(R.string.lbl_minute_500_meters);
                    } else {
                        l3.f23124b.getClass();
                        strK0 = l3.a.u0(d24, string3, new l22.a(context), zH2, false, true);
                        string3 = string3;
                        string = context.getString(l3.a.N1(zH2));
                    }
                    strG = strK0;
                    if (!strG.equals(string3)) {
                        strG = k.g(strG, string);
                    }
                }
                strG.getClass();
                return strG;
            case 13:
                return new l3(context).k(activityListItemDTO.f29297v1, true);
            case 14:
                new mn.a(aVar);
                int i15 = activityListItemDTO.f29301x1;
                x0 x0Var4 = activityListItemDTO.f29265g;
                x0Var4.getClass();
                return mn.a.b(i15, x0Var4, context);
            case 15:
                aVar2.getClass();
                double d25 = activityListItemDTO.f29280m;
                double d26 = activityListItemDTO.J1;
                o0 o0VarG2 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
                boolean zO2 = z0.o(activityListItemDTO.f29265g.f4358a);
                boolean z14 = z0.b(x0.f4352y2, activityListItemDTO.f29265g.f4358a) && s.g(i.SIMPLE.f165805a, activityListItemDTO.I1);
                DecimalFormat decimalFormat2 = zO2 ? l3.f23135m : l3.f23126d;
                l3.a aVar8 = l3.f23124b;
                if (z14) {
                    d25 = d26;
                }
                aVar8.getClass();
                return l3.a.Z(context, d25, o0VarG2, zO2, decimalFormat2);
            case 16:
                return r1.k(context, activityListItemDTO.C1, context.getString(R.string.no_value));
            case 17:
                String strE = v1.e(activityListItemDTO.f29265g.f4358a, activityListItemDTO.D1);
                String string4 = context.getString(R.string.no_value);
                string4.getClass();
                return fr.b.e(context, strE, string4);
            case 18:
                aVar2.getClass();
                if (Double.isNaN(activityListItemDTO.f29286p)) {
                    String string5 = context.getString(R.string.no_value);
                    string5.getClass();
                    return string5;
                }
                l3.a aVar9 = l3.f23124b;
                double d27 = activityListItemDTO.f29286p;
                q3 q3Var4 = q3.NAUTICAL_MILES_PER_HOUR;
                aVar9.getClass();
                String strN0 = l3.a.N0(context, d27, q3Var4, l3.f23130h, true, context.getString(R.string.no_value));
                String string6 = context.getString(R.string.lbl_max_nautical_sog_shortened);
                string6.getClass();
                p005kotlin.jvm.internal.x0 x0Var5 = p005kotlin.jvm.internal.x0.f105818a;
                return String.format("%s %s", Arrays.copyOf(new Object[]{strN0, string6}, 2));
            case 19:
                p005kotlin.jvm.internal.x0 x0Var6 = p005kotlin.jvm.internal.x0.f105818a;
                String str5 = String.format("%s %s", Arrays.copyOf(new Object[]{str, context.getString(R.string.lbl_watts)}, 2));
                l3.a aVar10 = l3.f23124b;
                double d28 = activityListItemDTO.f29276k0;
                aVar10.getClass();
                return l3.a.D0(context, d28, true, str5);
            case 20:
                return r1.m(context, activityListItemDTO.C1, context.getString(R.string.no_value));
            case 21:
                return r1.g(context, Double.valueOf(activityListItemDTO.F1), ar.b.c(activityListItemDTO), context.getString(R.string.no_value), R.string.activities_extended_map_legend_longest_wave);
            case 22:
                new mn.a(aVar);
                int i16 = (int) activityListItemDTO.C1;
                x0 x0Var7 = activityListItemDTO.f29265g;
                x0Var7.getClass();
                return mn.a.b(i16, x0Var7, context);
            case 26:
                return r1.j(context, Double.valueOf(activityListItemDTO.A1), context.getString(R.string.no_value));
            case 27:
                return r1.g(context, Double.valueOf(activityListItemDTO.F1), ar.b.c(activityListItemDTO), context.getString(R.string.no_value), R.string.activity_wakesports_run_distance_longest_run);
            case 28:
                return r1.l(context, activityListItemDTO.C1, context.getString(R.string.no_value));
            case 32:
                aVar2.getClass();
                l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
                l3.a aVar11 = l3.f23124b;
                double d29 = activityListItemDTO.f29272i1;
                boolean zY = lVar.y();
                aVar11.getClass();
                return l3.a.M(context, d29, zY, true);
        }
    }

    public final String d(x0 x0Var, double d14) {
        if (Double.isNaN(d14)) {
            return "";
        }
        boolean zO = z0.O(x0Var.f4358a);
        Context context = this.f115766a;
        if (zO) {
            l3.f23124b.getClass();
            return new mn.a(new l22.a(context)).d((long) (d14 * ((double) 1000)));
        }
        if (d14 > 0.0d) {
            l3.f23124b.getClass();
            return l3.a.b1(((long) d14) * 1000);
        }
        String string = context.getString(R.string.no_duration_value);
        string.getClass();
        return string;
    }

    public final String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return j0.p(new DateTime(this.f115771f.parse(str)));
        } catch (ParseException e4) {
            try {
                return j0.p(new DateTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str)));
            } catch (ParseException unused) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.CONNECTIONS;
                aVar.getClass();
                i2.a.g(a2Var, "ConnectionNewsFeedBinder", e4);
                return "";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm10/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
