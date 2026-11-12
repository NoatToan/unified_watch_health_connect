package z12;

import am.c2;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.ArrayList;
import java.util.Locale;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lz12/o0;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n0 f201457b;

    static {
        new a(null);
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 != 0 && i14 == 1) {
            return new p0(viewGroup);
        }
        return new z12.a(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 2;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        if (cVar instanceof com.garmin.android.apps.connectmobile.userprofile.e) {
            this.f201457b = new n0((com.garmin.android.apps.connectmobile.userprofile.e) cVar);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x0152  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0163  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:126:0x016c  */
    /* JADX WARN: Code duplicated, block: B:131:0x017a  */
    /* JADX WARN: Code duplicated, block: B:133:0x017e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0183  */
    /* JADX WARN: Code duplicated, block: B:138:0x018c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0190  */
    /* JADX WARN: Code duplicated, block: B:142:0x0197  */
    /* JADX WARN: Code duplicated, block: B:143:0x019b  */
    /* JADX WARN: Code duplicated, block: B:145:0x019f  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x01be  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:166:0x0205  */
    /* JADX WARN: Code duplicated, block: B:191:0x0250  */
    /* JADX WARN: Code duplicated, block: B:193:0x0255  */
    /* JADX WARN: Code duplicated, block: B:195:0x0259  */
    /* JADX WARN: Code duplicated, block: B:197:0x0271  */
    /* JADX WARN: Code duplicated, block: B:201:0x027b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0283  */
    /* JADX WARN: Code duplicated, block: B:205:0x0287  */
    /* JADX WARN: Code duplicated, block: B:209:0x028f  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:212:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:215:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:221:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:224:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:225:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:228:0x0322  */
    /* JADX WARN: Code duplicated, block: B:230:0x0326  */
    /* JADX WARN: Code duplicated, block: B:232:0x032a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0330  */
    /* JADX WARN: Code duplicated, block: B:236:0x0334  */
    /* JADX WARN: Code duplicated, block: B:238:0x0338  */
    /* JADX WARN: Code duplicated, block: B:240:0x033c  */
    /* JADX WARN: Code duplicated, block: B:242:0x0342  */
    /* JADX WARN: Code duplicated, block: B:41:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.joda.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) throws Throwable {
        n0 n0Var;
        q0.b bVar;
        ArrayList<ActivityListItemDTO> arrayList;
        Throwable th3;
        float dimension;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View view2;
        TextView textView;
        TextView textView2;
        LocalDate localDateC;
        String strO;
        View view3;
        m0 m0Var;
        m0 m0Var2;
        Context context;
        int i15;
        int i16;
        TextView textView3;
        Object[] objArr;
        String string;
        m0 m0Var3;
        m0 m0Var4;
        boolean z14;
        ArrayList arrayList2;
        ?? r14;
        ?? r15;
        ?? r16;
        Object objC;
        TextView textView4;
        View view4;
        ArrayList<ActivityListItemDTO> arrayList3;
        ActivityListItemDTO activityListItemDTO;
        LocalDate localDateC2;
        ArrayList<ActivityListItemDTO> arrayList4;
        ActivityListItemDTO activityListItemDTO2;
        ArrayList<ActivityListItemDTO> arrayList5;
        ArrayList<ActivityListItemDTO> arrayList6;
        f0Var.getClass();
        if (i14 == -1 || (n0Var = this.f201457b) == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar = n0Var.f201453a;
        q0 q0Var = f0Var instanceof q0 ? (q0) f0Var : null;
        if (q0Var != null) {
            boolean z15 = q0Var.f201473k;
            ActivityListItemDTO activityListItemDTO3 = (aVar == null || (arrayList6 = aVar.f46573d) == null) ? null : (ActivityListItemDTO) p13.h0.e0(i14, arrayList6);
            if (activityListItemDTO3 == null) {
                return;
            }
            if (((aVar == null || (arrayList5 = aVar.f46573d) == null) ? 0 : arrayList5.size()) <= 1) {
                bVar = q0.b.SINGLE;
            } else if (i14 == 0) {
                bVar = q0.b.BEGIN;
            } else if (aVar == null || !aVar.f46575f) {
                bVar = q0.b.NORMAL;
            } else {
                if (i14 == ((aVar == null || (arrayList = aVar.f46573d) == null) ? 0 : arrayList.size()) - 1) {
                    bVar = q0.b.END;
                } else {
                    bVar = q0.b.NORMAL;
                }
            }
            int i17 = bVar == null ? -1 : q0.c.f201479a[bVar.ordinal()];
            float dimension2 = 0.0f;
            if (i17 == -1) {
                th3 = null;
            } else {
                if (i17 != 1) {
                    th3 = null;
                    if (i17 == 2) {
                        View view5 = q0Var.f201466d;
                        if (view5 == null) {
                            p005kotlin.jvm.internal.s.m("startLine");
                            throw null;
                        }
                        view5.setVisibility(4);
                        View view6 = q0Var.f201467e;
                        if (view6 == null) {
                            p005kotlin.jvm.internal.s.m("topEndLine");
                            throw null;
                        }
                        view6.setVisibility(0);
                        View view7 = q0Var.f201468f;
                        if (view7 == null) {
                            p005kotlin.jvm.internal.s.m("bottomEndLine");
                            throw null;
                        }
                        view7.setVisibility(0);
                        dimension2 = q0Var.g().getResources().getDimension(R.dimen.spacing_normal);
                        dimension = 0.0f;
                    } else if (i17 == 3) {
                        View view8 = q0Var.f201466d;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("startLine");
                            throw null;
                        }
                        view8.setVisibility(0);
                        View view9 = q0Var.f201467e;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("topEndLine");
                            throw null;
                        }
                        view9.setVisibility(4);
                        View view10 = q0Var.f201468f;
                        if (view10 == null) {
                            p005kotlin.jvm.internal.s.m("bottomEndLine");
                            throw null;
                        }
                        view10.setVisibility(4);
                        dimension = q0Var.g().getResources().getDimension(R.dimen.spacing_micro);
                    } else {
                        if (i17 != 4) {
                            u0.r();
                            return;
                        }
                        View view11 = q0Var.f201466d;
                        if (view11 == null) {
                            p005kotlin.jvm.internal.s.m("startLine");
                            throw null;
                        }
                        view11.setVisibility(4);
                        View view12 = q0Var.f201467e;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("topEndLine");
                            throw null;
                        }
                        view12.setVisibility(4);
                        View view13 = q0Var.f201468f;
                        if (view13 == null) {
                            p005kotlin.jvm.internal.s.m("bottomEndLine");
                            throw null;
                        }
                        view13.setVisibility(4);
                    }
                    linearLayout = q0Var.f201463a;
                    if (linearLayout != null) {
                        p005kotlin.jvm.internal.s.m("timelineHeader");
                        throw th3;
                    }
                    linearLayout.setPadding(0, (int) dimension2, 0, 0);
                    linearLayout2 = q0Var.f201470h;
                    if (linearLayout2 != null) {
                        p005kotlin.jvm.internal.s.m("timelineContent");
                        throw th3;
                    }
                    linearLayout2.setPadding(0, 0, 0, (int) dimension);
                    if (i14 != 0) {
                        if (aVar != null || (arrayList4 = aVar.f46573d) == null) {
                            r14 = th3;
                        } else {
                            activityListItemDTO2 = (ActivityListItemDTO) p13.h0.e0(i14, arrayList4);
                        }
                        if (r14 != 0) {
                            localDateC2 = r14.C();
                        } else {
                            r15 = th3;
                        }
                        if (r15 != 0) {
                            r14 = activityListItemDTO2;
                            int i18 = i14 - 1;
                            if (aVar != null || (arrayList3 = aVar.f46573d) == null) {
                                r14 = activityListItemDTO2;
                                r15 = localDateC2;
                                r14 = activityListItemDTO2;
                                r15 = localDateC2;
                                r16 = th3;
                            } else {
                                activityListItemDTO = (ActivityListItemDTO) p13.h0.e0(i18, arrayList3);
                            }
                            if (r16 != 0) {
                                r14 = activityListItemDTO2;
                                r15 = localDateC2;
                                r16 = activityListItemDTO;
                                objC = r16.C();
                            } else {
                                r14 = activityListItemDTO2;
                                r15 = localDateC2;
                                r16 = activityListItemDTO;
                                objC = th3;
                            }
                            if (r15.equals(objC)) {
                                textView4 = q0Var.f201464b;
                                if (textView4 != null) {
                                    p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                                    throw th3;
                                }
                                textView4.setVisibility(8);
                                view4 = q0Var.f201465c;
                                if (view4 != null) {
                                    p005kotlin.jvm.internal.s.m("timelinePoint");
                                    throw th3;
                                }
                                view4.setVisibility(8);
                            } else {
                                r14 = activityListItemDTO2;
                                r14 = activityListItemDTO2;
                                r15 = localDateC2;
                                view2 = q0Var.f201465c;
                                if (view2 != null) {
                                    p005kotlin.jvm.internal.s.m("timelinePoint");
                                    throw th3;
                                }
                                view2.setVisibility(0);
                                textView = q0Var.f201464b;
                                if (textView != null) {
                                    p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                                    throw th3;
                                }
                                textView.setVisibility(0);
                                textView2 = q0Var.f201464b;
                                if (textView2 != null) {
                                    p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                                    throw th3;
                                }
                                localDateC = activityListItemDTO3.C();
                                if (localDateC == null) {
                                    strO = "";
                                } else if (localDateC.equals(LocalDate.now())) {
                                    strO = q0Var.g().getString(R.string.challenge_leaderboard_header_today_label);
                                    strO.getClass();
                                } else if (localDateC.equals(LocalDate.now().minusDays(1))) {
                                    strO = q0Var.g().getString(R.string.social_elapsed_time_yesterday);
                                    strO.getClass();
                                } else {
                                    strO = c22.j0.o(localDateC.toDateTimeAtStartOfDay(), 'L');
                                }
                                textView2.setText(strO);
                            }
                        } else {
                            r14 = activityListItemDTO2;
                            r14 = activityListItemDTO2;
                            r15 = localDateC2;
                            view2 = q0Var.f201465c;
                            if (view2 != null) {
                                p005kotlin.jvm.internal.s.m("timelinePoint");
                                throw th3;
                            }
                            view2.setVisibility(0);
                            textView = q0Var.f201464b;
                            if (textView != null) {
                                p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                                throw th3;
                            }
                            textView.setVisibility(0);
                            textView2 = q0Var.f201464b;
                            if (textView2 != null) {
                                p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                                throw th3;
                            }
                            localDateC = activityListItemDTO3.C();
                            if (localDateC == null) {
                                strO = "";
                            } else if (localDateC.equals(LocalDate.now())) {
                                strO = q0Var.g().getString(R.string.challenge_leaderboard_header_today_label);
                                strO.getClass();
                            } else if (localDateC.equals(LocalDate.now().minusDays(1))) {
                                strO = q0Var.g().getString(R.string.social_elapsed_time_yesterday);
                                strO.getClass();
                            } else {
                                strO = c22.j0.o(localDateC.toDateTimeAtStartOfDay(), 'L');
                            }
                            textView2.setText(strO);
                        }
                    } else {
                        r14 = activityListItemDTO2;
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        view2 = q0Var.f201465c;
                        if (view2 != null) {
                            p005kotlin.jvm.internal.s.m("timelinePoint");
                            throw th3;
                        }
                        view2.setVisibility(0);
                        textView = q0Var.f201464b;
                        if (textView != null) {
                            p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                            throw th3;
                        }
                        textView.setVisibility(0);
                        textView2 = q0Var.f201464b;
                        if (textView2 != null) {
                            p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                            throw th3;
                        }
                        localDateC = activityListItemDTO3.C();
                        if (localDateC == null) {
                            strO = "";
                        } else if (localDateC.equals(LocalDate.now())) {
                            strO = q0Var.g().getString(R.string.challenge_leaderboard_header_today_label);
                            strO.getClass();
                        } else if (localDateC.equals(LocalDate.now().minusDays(1))) {
                            strO = q0Var.g().getString(R.string.social_elapsed_time_yesterday);
                            strO.getClass();
                        } else {
                            strO = c22.j0.o(localDateC.toDateTimeAtStartOfDay(), 'L');
                        }
                        textView2.setText(strO);
                    }
                    view3 = q0Var.f201469g;
                    if (view3 != null) {
                        p005kotlin.jvm.internal.s.m("privatePrivacy");
                        throw th3;
                    }
                    v22.e.r(view3, !(aVar == null && aVar.a()) && activityListItemDTO3.D() == am.l.f4048d);
                    q0Var.d(activityListItemDTO3);
                    q0Var.f().setOnClickListener(new ty0.a(n0Var, 11, q0Var, activityListItemDTO3));
                    if (!z15 && ((arrayList2 = activityListItemDTO3.f29271i) == null || arrayList2.isEmpty() || activityListItemDTO3.S0 == 0)) {
                        m0 m0Var5 = q0Var.f201471i;
                        if (m0Var5 != null) {
                            m0Var5.b(false);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("socialViewHolder");
                            throw th3;
                        }
                    }
                    m0Var = q0Var.f201471i;
                    if (m0Var != null) {
                        p005kotlin.jvm.internal.s.m("socialViewHolder");
                        throw th3;
                    }
                    m0Var.b(true);
                    if (z15) {
                        m0Var3 = q0Var.f201471i;
                        if (m0Var3 != null) {
                            p005kotlin.jvm.internal.s.m("socialViewHolder");
                            throw th3;
                        }
                        v22.e.j(m0Var3.f60613b);
                        v22.e.j(m0Var3.f60614c);
                        v22.e.j(m0Var3.f60615d);
                        v22.e.j(m0Var3.f60616e);
                        m0Var4 = q0Var.f201471i;
                        if (m0Var4 != null) {
                            p005kotlin.jvm.internal.s.m("socialViewHolder");
                            throw th3;
                        }
                        if (aVar == null && aVar.c()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        m0Var4.f60620i = Boolean.valueOf(z14);
                    }
                    m0Var2 = q0Var.f201471i;
                    if (m0Var2 != null) {
                        p005kotlin.jvm.internal.s.m("socialViewHolder");
                        throw th3;
                    }
                    TextView textView5 = m0Var2.f60619h;
                    m0Var2.f201439k = activityListItemDTO3;
                    m0Var2.f201440l = c2.ACTIVITY;
                    m0Var2.f201441m = String.valueOf(activityListItemDTO3.f29250b);
                    context = m0Var2.f201438j;
                    m0Var2.a(context, activityListItemDTO3.S0, activityListItemDTO3.V0);
                    i15 = activityListItemDTO3.T0;
                    ImageView imageView = m0Var2.f60614c;
                    if (i15 > 0) {
                        i16 = 0;
                    } else {
                        i16 = 8;
                    }
                    if (p005kotlin.jvm.internal.s.g(m0Var2.f60620i, Boolean.FALSE)) {
                        i16 = 8;
                    }
                    textView5.setVisibility(i16);
                    textView3 = m0Var2.f60618g;
                    if (m0Var2.f60617f.getVisibility() == 0 || textView5.getVisibility() != 0) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setVisibility(0);
                    }
                    objArr = new Object[]{Integer.valueOf(i15)};
                    if (i15 == 1) {
                        string = context.getString(R.string.lbl_comments_count_singular, objArr);
                    } else {
                        string = context.getString(R.string.lbl_comments_count, objArr);
                    }
                    string.getClass();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = string.toLowerCase(locale);
                    lowerCase.getClass();
                    textView5.setText(lowerCase);
                    imageView.setImageResource(R.drawable.comment_outline);
                    imageView.setContentDescription(context.getString(R.string.lbl_comment));
                    imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
                }
                th3 = null;
                View view14 = q0Var.f201466d;
                if (view14 == null) {
                    p005kotlin.jvm.internal.s.m("startLine");
                    throw null;
                }
                view14.setVisibility(0);
                View view15 = q0Var.f201467e;
                if (view15 == null) {
                    p005kotlin.jvm.internal.s.m("topEndLine");
                    throw null;
                }
                view15.setVisibility(0);
                View view16 = q0Var.f201468f;
                if (view16 == null) {
                    p005kotlin.jvm.internal.s.m("bottomEndLine");
                    throw null;
                }
                view16.setVisibility(0);
            }
            dimension = 0.0f;
            linearLayout = q0Var.f201463a;
            if (linearLayout != null) {
                p005kotlin.jvm.internal.s.m("timelineHeader");
                throw th3;
            }
            linearLayout.setPadding(0, (int) dimension2, 0, 0);
            linearLayout2 = q0Var.f201470h;
            if (linearLayout2 != null) {
                p005kotlin.jvm.internal.s.m("timelineContent");
                throw th3;
            }
            linearLayout2.setPadding(0, 0, 0, (int) dimension);
            if (i14 != 0) {
                if (aVar != null) {
                    r14 = th3;
                } else {
                    r14 = th3;
                }
                if (r14 != 0) {
                    localDateC2 = r14.C();
                } else {
                    r15 = th3;
                }
                if (r15 != 0) {
                    r14 = activityListItemDTO2;
                    int i19 = i14 - 1;
                    if (aVar != null) {
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        r16 = th3;
                    } else {
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        r16 = th3;
                    }
                    if (r16 != 0) {
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        r16 = activityListItemDTO;
                        objC = r16.C();
                    } else {
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        r16 = activityListItemDTO;
                        objC = th3;
                    }
                    if (r15.equals(objC)) {
                        r14 = activityListItemDTO2;
                        r14 = activityListItemDTO2;
                        r15 = localDateC2;
                        view2 = q0Var.f201465c;
                        if (view2 != null) {
                            p005kotlin.jvm.internal.s.m("timelinePoint");
                            throw th3;
                        }
                        view2.setVisibility(0);
                        textView = q0Var.f201464b;
                        if (textView != null) {
                            p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                            throw th3;
                        }
                        textView.setVisibility(0);
                        textView2 = q0Var.f201464b;
                        if (textView2 != null) {
                            p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                            throw th3;
                        }
                        localDateC = activityListItemDTO3.C();
                        if (localDateC == null) {
                            strO = "";
                        } else if (localDateC.equals(LocalDate.now())) {
                            strO = q0Var.g().getString(R.string.challenge_leaderboard_header_today_label);
                            strO.getClass();
                        } else if (localDateC.equals(LocalDate.now().minusDays(1))) {
                            strO = q0Var.g().getString(R.string.social_elapsed_time_yesterday);
                            strO.getClass();
                        } else {
                            strO = c22.j0.o(localDateC.toDateTimeAtStartOfDay(), 'L');
                        }
                        textView2.setText(strO);
                    } else {
                        textView4 = q0Var.f201464b;
                        if (textView4 != null) {
                            p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                            throw th3;
                        }
                        textView4.setVisibility(8);
                        view4 = q0Var.f201465c;
                        if (view4 != null) {
                            p005kotlin.jvm.internal.s.m("timelinePoint");
                            throw th3;
                        }
                        view4.setVisibility(8);
                    }
                } else {
                    r14 = activityListItemDTO2;
                    r14 = activityListItemDTO2;
                    r15 = localDateC2;
                    view2 = q0Var.f201465c;
                    if (view2 != null) {
                        p005kotlin.jvm.internal.s.m("timelinePoint");
                        throw th3;
                    }
                    view2.setVisibility(0);
                    textView = q0Var.f201464b;
                    if (textView != null) {
                        p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                        throw th3;
                    }
                    textView.setVisibility(0);
                    textView2 = q0Var.f201464b;
                    if (textView2 != null) {
                        p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                        throw th3;
                    }
                    localDateC = activityListItemDTO3.C();
                    if (localDateC == null) {
                        strO = "";
                    } else if (localDateC.equals(LocalDate.now())) {
                        strO = q0Var.g().getString(R.string.challenge_leaderboard_header_today_label);
                        strO.getClass();
                    } else if (localDateC.equals(LocalDate.now().minusDays(1))) {
                        strO = q0Var.g().getString(R.string.social_elapsed_time_yesterday);
                        strO.getClass();
                    } else {
                        strO = c22.j0.o(localDateC.toDateTimeAtStartOfDay(), 'L');
                    }
                    textView2.setText(strO);
                }
            } else {
                r14 = activityListItemDTO2;
                r14 = activityListItemDTO2;
                r15 = localDateC2;
                view2 = q0Var.f201465c;
                if (view2 != null) {
                    p005kotlin.jvm.internal.s.m("timelinePoint");
                    throw th3;
                }
                view2.setVisibility(0);
                textView = q0Var.f201464b;
                if (textView != null) {
                    p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                    throw th3;
                }
                textView.setVisibility(0);
                textView2 = q0Var.f201464b;
                if (textView2 != null) {
                    p005kotlin.jvm.internal.s.m("timelineHeaderTitle");
                    throw th3;
                }
                localDateC = activityListItemDTO3.C();
                if (localDateC == null) {
                    strO = "";
                } else if (localDateC.equals(LocalDate.now())) {
                    strO = q0Var.g().getString(R.string.challenge_leaderboard_header_today_label);
                    strO.getClass();
                } else if (localDateC.equals(LocalDate.now().minusDays(1))) {
                    strO = q0Var.g().getString(R.string.social_elapsed_time_yesterday);
                    strO.getClass();
                } else {
                    strO = c22.j0.o(localDateC.toDateTimeAtStartOfDay(), 'L');
                }
                textView2.setText(strO);
            }
            view3 = q0Var.f201469g;
            if (view3 != null) {
                p005kotlin.jvm.internal.s.m("privatePrivacy");
                throw th3;
            }
            v22.e.r(view3, !(aVar == null && aVar.a()) && activityListItemDTO3.D() == am.l.f4048d);
            q0Var.d(activityListItemDTO3);
            q0Var.f().setOnClickListener(new ty0.a(n0Var, 11, q0Var, activityListItemDTO3));
            if (!z15) {
            }
            m0Var = q0Var.f201471i;
            if (m0Var != null) {
                p005kotlin.jvm.internal.s.m("socialViewHolder");
                throw th3;
            }
            m0Var.b(true);
            if (z15) {
                m0Var3 = q0Var.f201471i;
                if (m0Var3 != null) {
                    p005kotlin.jvm.internal.s.m("socialViewHolder");
                    throw th3;
                }
                v22.e.j(m0Var3.f60613b);
                v22.e.j(m0Var3.f60614c);
                v22.e.j(m0Var3.f60615d);
                v22.e.j(m0Var3.f60616e);
                m0Var4 = q0Var.f201471i;
                if (m0Var4 != null) {
                    p005kotlin.jvm.internal.s.m("socialViewHolder");
                    throw th3;
                }
                if (aVar == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                m0Var4.f60620i = Boolean.valueOf(z14);
            }
            m0Var2 = q0Var.f201471i;
            if (m0Var2 != null) {
                p005kotlin.jvm.internal.s.m("socialViewHolder");
                throw th3;
            }
            TextView textView6 = m0Var2.f60619h;
            m0Var2.f201439k = activityListItemDTO3;
            m0Var2.f201440l = c2.ACTIVITY;
            m0Var2.f201441m = String.valueOf(activityListItemDTO3.f29250b);
            context = m0Var2.f201438j;
            m0Var2.a(context, activityListItemDTO3.S0, activityListItemDTO3.V0);
            i15 = activityListItemDTO3.T0;
            ImageView imageView2 = m0Var2.f60614c;
            if (i15 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            if (p005kotlin.jvm.internal.s.g(m0Var2.f60620i, Boolean.FALSE)) {
                i16 = 8;
            }
            textView6.setVisibility(i16);
            textView3 = m0Var2.f60618g;
            if (m0Var2.f60617f.getVisibility() == 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(8);
            }
            objArr = new Object[]{Integer.valueOf(i15)};
            if (i15 == 1) {
                string = context.getString(R.string.lbl_comments_count_singular, objArr);
            } else {
                string = context.getString(R.string.lbl_comments_count, objArr);
            }
            string.getClass();
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            String lowerCase2 = string.toLowerCase(locale2);
            lowerCase2.getClass();
            textView6.setText(lowerCase2);
            imageView2.setImageResource(R.drawable.comment_outline);
            imageView2.setContentDescription(context.getString(R.string.lbl_comment));
            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
        }
    }

    @Override // b32.d
    public final int getItemCount() {
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar;
        ArrayList<ActivityListItemDTO> arrayList;
        n0 n0Var = this.f201457b;
        if (n0Var == null || (aVar = n0Var.f201453a) == null || (arrayList = aVar.f46573d) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        x0 x0Var;
        ArrayList<ActivityListItemDTO> arrayList;
        n0 n0Var = this.f201457b;
        String str = null;
        if (n0Var != null) {
            com.garmin.android.apps.connectmobile.userprofile.e.a aVar = n0Var.f201453a;
            ActivityListItemDTO activityListItemDTO = (aVar == null || (arrayList = aVar.f46573d) == null) ? null : (ActivityListItemDTO) p13.h0.e0(i14, arrayList);
            if (activityListItemDTO != null && (x0Var = activityListItemDTO.f29265g) != null) {
                str = x0Var.f4358a;
            }
        }
        return z0.R(str) ? 1 : 0;
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar;
        n0 n0Var = this.f201457b;
        return (n0Var == null || (aVar = n0Var.f201453a) == null || !aVar.f46574e) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz12/o0$a;", "", "<init>", "()V", "", "TYPE_COUNT", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
