package vg1;

import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferActivityProfilesActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferActivityProfilesActivity f178188b;

    public /* synthetic */ t0(TransferActivityProfilesActivity transferActivityProfilesActivity, int i14) {
        this.f178187a = i14;
        this.f178188b = transferActivityProfilesActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Long l14;
        int i14 = this.f178187a;
        boolean z14 = true;
        TransferActivityProfilesActivity transferActivityProfilesActivity = this.f178188b;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj;
                TransferActivityProfilesActivity.a aVar = TransferActivityProfilesActivity.f42791h;
                if (g3Var != null) {
                    int i15 = TransferActivityProfilesActivity.b.f42799a[g3Var.f35300a.ordinal()];
                    if (i15 == 1) {
                        transferActivityProfilesActivity.showProgressOverlay();
                    } else if (i15 == 2) {
                        transferActivityProfilesActivity.hideProgressOverlay();
                        r22.m0 m0VarD = r22.m0.a.d(r22.m0.f149759e, 2131231871, null, transferActivityProfilesActivity.getString(R.string.msg_transfer_activity_profiles_confirmation, transferActivityProfilesActivity.f42797f), 0, null, 0, null, null, 2042);
                        m0VarD.show(transferActivityProfilesActivity.getSupportFragmentManager(), (String) null);
                        new Handler(Looper.getMainLooper()).postDelayed(new d(3, m0VarD, transferActivityProfilesActivity), 3000L);
                    } else {
                        if (i15 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        transferActivityProfilesActivity.hideProgressOverlay();
                        transferActivityProfilesActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var2 = (g3) obj;
                TransferActivityProfilesActivity.a aVar2 = TransferActivityProfilesActivity.f42791h;
                if (g3Var2 != null) {
                    int i16 = TransferActivityProfilesActivity.b.f42799a[g3Var2.f35300a.ordinal()];
                    if (i16 == 1) {
                        transferActivityProfilesActivity.showProgressOverlay();
                    } else if (i16 == 2) {
                        transferActivityProfilesActivity.hideProgressOverlay();
                        qv.a aVar3 = (qv.a) g3Var2.f35301b;
                        List<qv.c> listF = aVar3 != null ? aVar3.f() : null;
                        if (aVar3 == null || !aVar3.getHasSportFileBackups() || listF == null || listF.isEmpty()) {
                            View view2 = transferActivityProfilesActivity.f42792a;
                            if (view2 == null) {
                                p005kotlin.jvm.internal.s.m("emptyStateContainer");
                                throw null;
                            }
                            view2.setVisibility(0);
                            View view3 = transferActivityProfilesActivity.f42793b;
                            if (view3 == null) {
                                p005kotlin.jvm.internal.s.m("backupsContainer");
                                throw null;
                            }
                            view3.setVisibility(8);
                        } else {
                            View view4 = transferActivityProfilesActivity.f42792a;
                            if (view4 == null) {
                                p005kotlin.jvm.internal.s.m("emptyStateContainer");
                                throw null;
                            }
                            view4.setVisibility(8);
                            View view5 = transferActivityProfilesActivity.f42793b;
                            if (view5 == null) {
                                p005kotlin.jvm.internal.s.m("backupsContainer");
                                throw null;
                            }
                            view5.setVisibility(0);
                            List listN0 = p13.h0.N0(listF, new u0());
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj2 : listN0) {
                                Long lValueOf = Long.valueOf(((qv.c) obj2).getDeviceId());
                                Object arrayList = linkedHashMap.get(lValueOf);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    linkedHashMap.put(lValueOf, arrayList);
                                }
                                ((List) arrayList).add(obj2);
                            }
                            boolean z15 = linkedHashMap.size() == 1;
                            v0 v0Var = transferActivityProfilesActivity.f42795d;
                            if (v0Var == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            TextView textView = new TextView(new ContextThemeWrapper(transferActivityProfilesActivity, R.style.Text_Body2_Primary), null, 0);
                            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            textView.setTextAlignment(4);
                            textView.setText(z15 ? transferActivityProfilesActivity.getString(R.string.bic_activity_profiles_restore_message) : transferActivityProfilesActivity.getString(R.string.header_transfer_activity_profiles, transferActivityProfilesActivity.f42797f));
                            int dimensionPixelSize = textView.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                            v0Var.t(textView);
                            v0 v0Var2 = transferActivityProfilesActivity.f42795d;
                            if (v0Var2 == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            long jLongValue = 0;
                            if (z15 && (l14 = (Long) p13.h0.c0(linkedHashMap.keySet())) != null) {
                                jLongValue = l14.longValue();
                            }
                            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                long jLongValue2 = ((Number) entry.getKey()).longValue();
                                qv.c cVar = (qv.c) p13.h0.d0((List) entry.getValue());
                                String deviceName = cVar != null ? cVar.getDeviceName() : null;
                                qv.c cVar2 = (qv.c) p13.h0.d0((List) entry.getValue());
                                String deviceImageUrl = cVar2 != null ? cVar2.getDeviceImageUrl() : null;
                                boolean z16 = z14;
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList3 = new ArrayList(p13.y.r(iterable, 10));
                                Iterator it = iterable.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(((qv.c) it.next()).getProfileName());
                                }
                                boolean z17 = ((Number) entry.getKey()).longValue() == jLongValue ? z16 : false;
                                boolean z18 = !z15;
                                qv.c cVar3 = (qv.c) p13.h0.d0((List) entry.getValue());
                                String string = cVar3 != null ? new DateTime(cVar3.getBackupCreationTimestamp()).toString("MMM d, yyyy") : null;
                                if (string == null) {
                                    string = "";
                                }
                                arrayList2.add(new qv.b(jLongValue2, deviceName, deviceImageUrl, arrayList3, z17, z18, string));
                                z14 = z16;
                            }
                            boolean z19 = z14;
                            ArrayList arrayList4 = v0Var2.f178193d;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList2);
                            v0Var2.notifyDataSetChanged();
                            v0 v0Var3 = transferActivityProfilesActivity.f42795d;
                            if (v0Var3 == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            TextView textView2 = new TextView(new ContextThemeWrapper(transferActivityProfilesActivity, R.style.Text_Caption_Secondary), null, 0);
                            textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            textView2.setText(R.string.footer_transfer_activity_profiles);
                            int dimensionPixelSize2 = textView2.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                            int dimensionPixelSize3 = textView2.getResources().getDimensionPixelSize(R.dimen.spacing_micro);
                            textView2.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
                            v0Var3.r(textView2);
                            View view6 = transferActivityProfilesActivity.f42794c;
                            if (view6 == null) {
                                p005kotlin.jvm.internal.s.m("transferBtn");
                                throw null;
                            }
                            v0 v0Var4 = transferActivityProfilesActivity.f42795d;
                            if (v0Var4 == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            view6.setEnabled(v0Var4.A() != null ? z19 : false);
                        }
                    } else {
                        if (i16 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        transferActivityProfilesActivity.hideProgressOverlay();
                        transferActivityProfilesActivity.displayFailedMessage();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
