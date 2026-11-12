package z12;

import am.x0;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.card.view.CardSummaryRowView;
import com.garmin.android.apps.connectmobile.g3;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lz12/y;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "b", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f201500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Integer> f201501c = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz12/y$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {
        public b(ViewGroup viewGroup) {
            super(e5.e(viewGroup, R.layout.user_profile_stats_section_header, viewGroup, false));
            ((TextView) this.itemView.findViewById(R.id.section_header)).setText(R.string.lbl_lifetime_totals);
        }
    }

    static {
        new a(null);
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            return new b(viewGroup);
        }
        if (i14 == 1) {
            return new z(viewGroup);
        }
        if (i14 != 2) {
            return i14 != 3 ? new b32.b(viewGroup) : new v(viewGroup);
        }
        return new x(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 4;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        if (cVar instanceof g12.e) {
            this.f201500b = new w((g12.e) cVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        j12.m mVar;
        j12.m mVar2;
        j12.m mVar3;
        f0Var.getClass();
        w wVar = this.f201500b;
        if (wVar != null) {
            com.garmin.android.apps.connectmobile.userprofile.i iVar = wVar.f201496a;
            int itemViewType = getItemViewType(i14);
            int i15 = R.string.lbl_km;
            boolean z14 = false;
            if (itemViewType == 1) {
                z zVar = (z) f0Var;
                Context context = zVar.itemView.getContext();
                TextView textView = zVar.f61662g;
                textView.getClass();
                if (!iVar.y4() && wVar.b()) {
                    z14 = true;
                }
                v22.e.r(textView, z14);
                g3 g3Var = (g3) iVar.f46759k.d();
                j12.d lifeTimeGoal = (g3Var == null || (mVar = (j12.m) g3Var.f35301b) == null) ? null : mVar.getLifeTimeGoal();
                j12.o wellness = lifeTimeGoal != null ? lifeTimeGoal.getWellness() : null;
                if (wellness != null) {
                    CardSummaryRowView cardSummaryRowView = zVar.f201502h;
                    if (cardSummaryRowView == null) {
                        p005kotlin.jvm.internal.s.m("totalSteps");
                        throw null;
                    }
                    o12.h.a(cardSummaryRowView, wellness.getSteps(), context.getString(R.string.lbl_steps));
                    if (wellness.getDistance() > 0) {
                        l3.a aVar = l3.f23124b;
                        double distance = wellness.getDistance();
                        m3 m3VarB = ar.b.b(x0.f4331t, null);
                        m3VarB.getClass();
                        DecimalFormat decimalFormat = l3.f23126d;
                        aVar.getClass();
                        String strP = l3.a.P(context, distance, m3VarB, decimalFormat, false, null);
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strP, context.getString(zY ? R.string.lbl_kilometers : R.string.lbl_miles)}, 2));
                        CardSummaryRowView cardSummaryRowView2 = zVar.f201503i;
                        if (cardSummaryRowView2 == null) {
                            p005kotlin.jvm.internal.s.m("totalDistance");
                            throw null;
                        }
                        o12.h.b(cardSummaryRowView2, strP, context.getString(zY ? R.string.lbl_km : R.string.lbl_mile), str);
                    } else {
                        CardSummaryRowView cardSummaryRowView3 = zVar.f201503i;
                        if (cardSummaryRowView3 == null) {
                            p005kotlin.jvm.internal.s.m("totalDistance");
                            throw null;
                        }
                        cardSummaryRowView3.setVisibility(8);
                    }
                    CardSummaryRowView cardSummaryRowView4 = zVar.f201504j;
                    if (cardSummaryRowView4 != null) {
                        o12.h.a(cardSummaryRowView4, (int) wellness.getDailyAverageSteps(), context.getString(R.string.lbl_steps));
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("dailyAverageSteps");
                        throw null;
                    }
                }
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                v vVar = (v) f0Var;
                Context context2 = vVar.itemView.getContext();
                TextView textView2 = vVar.f61662g;
                textView2.getClass();
                if (!iVar.y4() && wVar.b()) {
                    z14 = true;
                }
                v22.e.r(textView2, z14);
                g3 g3Var2 = (g3) iVar.f46759k.d();
                j12.d lifeTimeGoal2 = (g3Var2 == null || (mVar3 = (j12.m) g3Var2.f35301b) == null) ? null : mVar3.getLifeTimeGoal();
                j12.b activities = lifeTimeGoal2 != null ? lifeTimeGoal2.getActivities() : null;
                if (activities != null) {
                    CardSummaryRowView cardSummaryRowView5 = vVar.f201494h;
                    if (cardSummaryRowView5 == null) {
                        p005kotlin.jvm.internal.s.m("totalActivities");
                        throw null;
                    }
                    o12.h.a(cardSummaryRowView5, activities.getTotalActivities(), context2.getString(R.string.concept_activities));
                    if (activities.getTotalDistance() <= 0.0d) {
                        CardSummaryRowView cardSummaryRowView6 = vVar.f201495i;
                        if (cardSummaryRowView6 != null) {
                            cardSummaryRowView6.setVisibility(8);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("totalDistance");
                            throw null;
                        }
                    }
                    l3.a aVar2 = l3.f23124b;
                    double totalDistance = activities.getTotalDistance();
                    m3 m3VarB2 = ar.b.b(x0.f4308n, null);
                    m3VarB2.getClass();
                    DecimalFormat decimalFormat2 = l3.f23126d;
                    aVar2.getClass();
                    String strP2 = l3.a.P(context2, totalDistance, m3VarB2, decimalFormat2, false, null);
                    boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    String string = context2.getString(zY2 ? R.string.lbl_km : R.string.lbl_mile);
                    string.getClass();
                    p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                    String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{strP2, context2.getString(zY2 ? R.string.lbl_kilometers : R.string.lbl_miles)}, 2));
                    CardSummaryRowView cardSummaryRowView7 = vVar.f201495i;
                    if (cardSummaryRowView7 != null) {
                        o12.h.b(cardSummaryRowView7, strP2, string, str2);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("totalDistance");
                        throw null;
                    }
                }
                return;
            }
            x xVar = (x) f0Var;
            Context context3 = xVar.itemView.getContext();
            if (!iVar.y4() && wVar.b()) {
                z14 = true;
            }
            TextView textView3 = xVar.f61662g;
            textView3.getClass();
            v22.e.v(textView3, z14);
            g3 g3Var3 = (g3) iVar.f46759k.d();
            j12.d lifeTimeGoal3 = (g3Var3 == null || (mVar2 = (j12.m) g3Var3.f35301b) == null) ? null : mVar2.getLifeTimeGoal();
            j12.o wellness2 = lifeTimeGoal3 != null ? lifeTimeGoal3.getWellness() : null;
            if (wellness2 != null) {
                CardSummaryRowView cardSummaryRowView8 = xVar.f201497h;
                if (cardSummaryRowView8 == null) {
                    p005kotlin.jvm.internal.s.m("totalPushes");
                    throw null;
                }
                o12.h.a(cardSummaryRowView8, wellness2.getPushes(), context3.getString(R.string.lbl_pushes));
                if (wellness2.getPushDistance() > 0) {
                    boolean zY3 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    l3.a aVar3 = l3.f23124b;
                    double pushDistance = wellness2.getPushDistance();
                    m3 m3VarB3 = ar.b.b(x0.f4331t, null);
                    m3VarB3.getClass();
                    DecimalFormat decimalFormat3 = l3.f23126d;
                    aVar3.getClass();
                    String strP3 = l3.a.P(context3, pushDistance, m3VarB3, decimalFormat3, false, null);
                    p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                    String str3 = String.format("%s %s", Arrays.copyOf(new Object[]{strP3, context3.getString(zY3 ? R.string.lbl_kilometers : R.string.lbl_miles)}, 2));
                    CardSummaryRowView cardSummaryRowView9 = xVar.f201498i;
                    if (cardSummaryRowView9 == null) {
                        p005kotlin.jvm.internal.s.m("totalDistance");
                        throw null;
                    }
                    if (!zY3) {
                        i15 = R.string.lbl_mile;
                    }
                    o12.h.b(cardSummaryRowView9, strP3, context3.getString(i15), str3);
                } else {
                    CardSummaryRowView cardSummaryRowView10 = xVar.f201498i;
                    if (cardSummaryRowView10 == null) {
                        p005kotlin.jvm.internal.s.m("totalDistance");
                        throw null;
                    }
                    cardSummaryRowView10.setVisibility(8);
                }
                CardSummaryRowView cardSummaryRowView11 = xVar.f201499j;
                if (cardSummaryRowView11 != null) {
                    o12.h.a(cardSummaryRowView11, (int) wellness2.getDailyAveragePushes(), context3.getString(R.string.lbl_pushes));
                } else {
                    p005kotlin.jvm.internal.s.m("dailyAveragePushes");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b32.a, b32.d
    public final void e(b32.c cVar) {
        j12.m mVar;
        j12.m mVar2;
        j12.m mVar3;
        cVar.getClass();
        ArrayList<Integer> arrayList = this.f201501c;
        arrayList.clear();
        w wVar = this.f201500b;
        if (wVar != null) {
            g3 g3Var = (g3) wVar.f201496a.f46759k.d();
            j12.d lifeTimeGoal = (g3Var == null || (mVar3 = (j12.m) g3Var.f35301b) == null) ? null : mVar3.getLifeTimeGoal();
            j12.o wellness = lifeTimeGoal != null ? lifeTimeGoal.getWellness() : null;
            if (wellness != null && (wellness.getPushes() > 0 || wellness.getDailyAveragePushes() > 0.0f || wellness.getPushDistance() > 0)) {
                arrayList.add(2);
            }
        }
        w wVar2 = this.f201500b;
        if (wVar2 != null) {
            g3 g3Var2 = (g3) wVar2.f201496a.f46759k.d();
            j12.d lifeTimeGoal2 = (g3Var2 == null || (mVar2 = (j12.m) g3Var2.f35301b) == null) ? null : mVar2.getLifeTimeGoal();
            j12.o wellness2 = lifeTimeGoal2 != null ? lifeTimeGoal2.getWellness() : null;
            if (wellness2 != null && (wellness2.getSteps() > 0 || wellness2.getDistance() > 0 || wellness2.getDailyAverageSteps() > 0.0f)) {
                arrayList.add(1);
            }
        }
        w wVar3 = this.f201500b;
        if (wVar3 != null) {
            g3 g3Var3 = (g3) wVar3.f201496a.f46759k.d();
            j12.d lifeTimeGoal3 = (g3Var3 == null || (mVar = (j12.m) g3Var3.f35301b) == null) ? null : mVar.getLifeTimeGoal();
            j12.b activities = lifeTimeGoal3 != null ? lifeTimeGoal3.getActivities() : null;
            if (activities != null && (activities.getTotalActivities() > 0 || activities.getTotalDistance() > 0.0d)) {
                arrayList.add(3);
            }
        }
        if (arrayList.size() > 0) {
            arrayList.add(0, 0);
        }
    }

    @Override // b32.d
    public final int getItemCount() {
        return this.f201501c.size();
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        Integer num = this.f201501c.get(i14);
        num.getClass();
        return num.intValue();
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        j12.j jVarA;
        w wVar = this.f201500b;
        return (wVar == null || (jVarA = wVar.a()) == null || (!wVar.f201496a.x4() && !jVarA.getIsShowLifetimeTotals())) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lz12/y$a;", "", "<init>", "()V", "", "ITEM_HEADER", "I", "ITEM_WELLNESS", "ITEM_PUSHES", "ITEM_ACTIVITIES", "ITEM_TYPE_COUNT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
