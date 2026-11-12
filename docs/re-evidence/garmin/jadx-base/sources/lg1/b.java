package lg1;

import am.v1;
import am.x0;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.NumberPicker;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.h;
import com.garmin.android.apps.connectmobile.leaderboard.model.u;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import e23.p;
import j23.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mt0.r;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import p13.x;
import p13.y;
import ps.u0;
import ps.x1;
import qs.w;
import r22.y1;
import ue0.n;
import uq.j;
import vn2.t0;
import vu1.k;
import wq.i;
import xz0.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f112189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f112191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f112192e;

    public /* synthetic */ b(i iVar, x1 x1Var, int i14, uq.f fVar) {
        this.f112188a = 4;
        this.f112190c = iVar;
        this.f112191d = x1Var;
        this.f112189b = i14;
        this.f112192e = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Integer numFalls;
        int i14 = this.f112188a;
        final int i15 = 1;
        int i16 = this.f112189b;
        final int i17 = 0;
        Object obj = this.f112192e;
        Object obj2 = this.f112191d;
        Object obj3 = this.f112190c;
        switch (i14) {
            case 0:
                a.b bVar = (a.b) obj2;
                ((IDeveloperItemStrategy) obj3).handleClick(bVar.f112179a, new ag0.a(bVar, i16, 11), new kp2.a(bVar, 8), (mg1.a) obj);
                break;
            case 1:
                r rVar = (r) obj3;
                r.a aVar = (r.a) obj2;
                u uVar = (u) obj;
                if (rVar.f120830c != i16) {
                    aVar.f120832a.setChecked(true);
                    rVar.f120829b = uVar;
                    rVar.f120828a.a(uVar);
                    int i18 = rVar.f120830c;
                    if (i18 != -1) {
                        rVar.notifyItemChanged(i18, 0);
                    }
                    rVar.f120830c = aVar.getBindingAdapterPosition();
                }
                break;
            case 2:
                h hVar = (h) obj3;
                h.a aVar2 = (h.a) obj2;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.i.a aVar3 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.i.a) obj;
                if (hVar.f37559c != i16) {
                    View view3 = aVar2.f37561a;
                    view3.getClass();
                    ((GCMCheckableRow) view3).setChecked(true);
                    hVar.f37560d = aVar3 != null ? Integer.valueOf(aVar3.f37597b) : null;
                    hVar.f37557a.a(aVar3);
                    int i19 = hVar.f37559c;
                    if (i19 != -1) {
                        hVar.notifyItemChanged(i19, 0);
                    }
                    hVar.f37559c = aVar2.getBindingAdapterPosition();
                }
                break;
            case 3:
                uy1.h hVar2 = (uy1.h) obj3;
                uy1.i.a aVar4 = (uy1.i.a) obj2;
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
                ImageView imageView = hVar2.f173443l;
                uy1.h.a aVar5 = hVar2.f173433b;
                boolean zD = v22.e.d(imageView);
                ImageView imageView2 = hVar2.f173443l;
                if (zD) {
                    v22.e.j(imageView2);
                    aVar5.g(-1);
                    if (aVar4 != null) {
                        aVar4.t2(activityListItemDTO, v22.e.d(imageView2));
                    }
                } else {
                    v22.e.q(imageView2);
                    aVar5.g(i16);
                    if (aVar4 != null) {
                        aVar4.t2(activityListItemDTO, v22.e.d(imageView2));
                    }
                }
                v22.e.q(imageView2);
                break;
            case 4:
                i iVar = (i) obj3;
                x1 x1Var = (x1) obj2;
                view2.setEnabled(false);
                Context context = iVar.f186557a;
                x0 x0Var = iVar.f186558b;
                uq.i iVar2 = ((uq.f) obj).f172195a;
                p<x1, Integer, Unit> pVar = iVar.f186565i;
                final int i24 = 3;
                final g20.e eVar = new g20.e(view2, 3);
                context.getClass();
                x0Var.getClass();
                x1Var.getClass();
                pVar.getClass();
                x1 x1VarB = x1.b(x1Var, null, -1);
                int i25 = wq.e.f186549a[iVar2.ordinal()];
                int i26 = this.f112189b;
                if (i25 == 1) {
                    wq.b bVar2 = new wq.b(x1VarB, pVar, i26, 0);
                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_create_manual_activity_number_of_lengths, (ViewGroup) null);
                    NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.create_activity_number_of_lengths_number_picker);
                    l lVar = j.f172259a;
                    numberPicker.setMinValue(lVar.f96796a);
                    numberPicker.setMaxValue(lVar.f96797b);
                    Integer numFalls2 = x1VarB.getNumFalls();
                    numberPicker.setValue(numFalls2 != null ? numFalls2.intValue() : 0);
                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(context).setView(viewInflate).setTitle(iVar2.a(context)).setNegativeButton(R.string.lbl_cancel, new k(10)).setPositiveButton(R.string.lbl_done, new wq.c(i17, bVar2, numberPicker)).create();
                    eVarCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wq.d
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (i17) {
                                case 0:
                                    eVar.invoke();
                                    break;
                                case 1:
                                    eVar.invoke();
                                    break;
                                case 2:
                                    eVar.invoke();
                                    break;
                                default:
                                    eVar.invoke();
                                    break;
                            }
                        }
                    });
                    eVarCreate.show();
                    break;
                } else {
                    final int i27 = 2;
                    if (i25 == 2) {
                        u0 difficulty = x1VarB.getDifficulty();
                        if (difficulty != null) {
                            b81.b bVar3 = new b81.b(x1VarB, x0Var, difficulty, pVar, i26, 6);
                            LinkedHashMap linkedHashMapF = v1.f(x0Var.f4358a, difficulty.getScale());
                            if (linkedHashMapF == null) {
                                linkedHashMapF = new LinkedHashMap();
                            }
                            Map<Object, String> mapC = y0.c(linkedHashMapF);
                            if (!mapC.isEmpty()) {
                                y1 y1Var = new y1();
                                String strA = iVar2.a(context);
                                u0 difficulty2 = x1VarB.getDifficulty();
                                y1Var.a(context, strA, mapC, difficulty2 != null ? difficulty2.getValueKey() : null, new t0(bVar3, 20)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wq.d
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        switch (i24) {
                                            case 0:
                                                eVar.invoke();
                                                break;
                                            case 1:
                                                eVar.invoke();
                                                break;
                                            case 2:
                                                eVar.invoke();
                                                break;
                                            default:
                                                eVar.invoke();
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    } else {
                        int i28 = 19;
                        if (i25 == 3) {
                            if (!x1VarB.getClimbSend() || (numFalls = x1VarB.getNumFalls()) == null || numFalls.intValue() != 0) {
                                wq.b bVar4 = new wq.b(x1VarB, pVar, i26, 1);
                                List listK = x.k(w.CLIMB_COMPLETED, w.CLIMB_ATTEMPTED);
                                int iA = p13.t0.a(y.r(listK, 10));
                                if (iA < 16) {
                                    iA = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                                for (Object obj4 : listK) {
                                    linkedHashMap.put(obj4, context.getString(((w) obj4).f147195b));
                                }
                                new y1().a(context, iVar2.a(context), new LinkedHashMap(linkedHashMap), x1VarB.G1(), new t0(bVar4, i28)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wq.d
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        switch (i27) {
                                            case 0:
                                                eVar.invoke();
                                                break;
                                            case 1:
                                                eVar.invoke();
                                                break;
                                            case 2:
                                                eVar.invoke();
                                                break;
                                            default:
                                                eVar.invoke();
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        } else if (i25 == 4) {
                            wq.b bVar5 = new wq.b(x1VarB, pVar, i26, 2);
                            boolean z14 = am.j.z(f12.l.f68084a);
                            l3.a aVar6 = l3.f23124b;
                            Double packWeight = x1VarB.getPackWeight();
                            long jDoubleValue = packWeight != null ? (long) packWeight.doubleValue() : 0L;
                            aVar6.getClass();
                            androidx.appcompat.app.e eVarB = m32.c.b(context, Double.valueOf(l3.a.Q1(jDoubleValue, z14)), z14, R.string.lbl_pack_weight, z14 ? 100.0d : 220.0d, new as2.d(bVar5, z14, i28));
                            eVarB.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wq.d
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i15) {
                                        case 0:
                                            eVar.invoke();
                                            break;
                                        case 1:
                                            eVar.invoke();
                                            break;
                                        case 2:
                                            eVar.invoke();
                                            break;
                                        default:
                                            eVar.invoke();
                                            break;
                                    }
                                }
                            });
                            eVarB.show();
                            break;
                        }
                    }
                }
                break;
            default:
                n nVar = (n) obj3;
                o oVar = (o) obj2;
                InboxRequestItem<?> inboxRequestItem = (InboxRequestItem) obj;
                int i29 = o.f192801j;
                if (nVar != null) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "AuthorizedViewersInviteDeclined");
                    oVar.f192802a.I3(inboxRequestItem, i16);
                }
                break;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f112188a = i15;
        this.f112190c = obj;
        this.f112191d = obj2;
        this.f112192e = obj3;
        this.f112189b = i14;
    }

    public /* synthetic */ b(RecyclerView.h hVar, int i14, RecyclerView.f0 f0Var, Object obj, int i15) {
        this.f112188a = i15;
        this.f112190c = hVar;
        this.f112189b = i14;
        this.f112191d = f0Var;
        this.f112192e = obj;
    }
}
