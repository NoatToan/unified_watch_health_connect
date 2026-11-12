package h10;

import android.content.DialogInterface;
import android.widget.Toast;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.JoinGroupResponseDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f80803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupDTO f80804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f80805d;

    public /* synthetic */ q(r rVar, GroupDTO groupDTO, ArrayList arrayList, int i14) {
        this.f80802a = i14;
        this.f80803b = rVar;
        this.f80804c = groupDTO;
        this.f80805d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        T t7;
        String strValueOf;
        int i14 = this.f80802a;
        List list = this.f80805d;
        GroupDTO groupDTO = this.f80804c;
        r rVar = this.f80803b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                if (rVar.getActivity() != null) {
                    int i15 = r.b.f80817a[g3Var.f35300a.ordinal()];
                    if (i15 == 1) {
                        T t14 = g3Var.f35301b;
                        if (t14 != 0) {
                            groupDTO.f31578w = ((JoinGroupResponseDTO) t14).f36394a;
                            list.remove(groupDTO.f31558a);
                            rVar.f80808b.notifyDataSetChanged();
                            rVar.f80809c.J8();
                        }
                        break;
                    } else if (i15 == 2) {
                        list.remove(groupDTO.f31558a);
                        rVar.f80808b.notifyDataSetChanged();
                        new androidx.appcompat.app.e.a(rVar.requireContext()).setMessage(rVar.getString(R.string.msg_group_join_failed)).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                        break;
                    }
                }
                break;
            case 1:
                rVar.getClass();
                if (g3Var.f35300a != fw.p.SUCCESS || (t7 = g3Var.f35301b) == 0) {
                    i2.a(a2.GENERAL, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Accept invitation failed: " + g3Var.f35303d);
                    Toast.makeText(rVar.getContext(), rVar.getString(R.string.txt_error_occurred), 0).show();
                } else if (((Boolean) t7).booleanValue()) {
                    rVar.f80809c.J8();
                    groupDTO.f31578w = GroupDTO.c.MEMBER;
                    o oVar = rVar.f80815i;
                    String str = groupDTO.f31558a;
                    oVar.getClass();
                    str.getClass();
                    y0<List<uz0.b>> y0Var = oVar.f80799c;
                    List<uz0.b> listD = y0Var.d();
                    if (listD != null) {
                        for (uz0.b bVar : listD) {
                            Long groupId = bVar.getGroupId();
                            if (groupId != null && (strValueOf = String.valueOf(groupId.longValue())) != null && strValueOf.equals(str)) {
                                listD.remove(bVar);
                                y0Var.j(listD);
                            }
                        }
                    }
                } else {
                    i2.a(a2.GENERAL, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Accept invitation failed: Server response False");
                    Toast.makeText(rVar.getContext(), rVar.getString(R.string.txt_error_occurred), 0).show();
                }
                list.remove(groupDTO.f31558a);
                rVar.f80808b.notifyDataSetChanged();
                break;
            default:
                if (rVar.getActivity() != null) {
                    int i16 = r.b.f80817a[g3Var.f35300a.ordinal()];
                    if (i16 == 1) {
                        T t15 = g3Var.f35301b;
                        if (t15 != 0) {
                            if (((com.garmin.android.apps.connectmobile.group.service.model.d) t15).f36413a == com.garmin.android.apps.connectmobile.group.service.model.d.b.REQUESTED) {
                                groupDTO.f31578w = GroupDTO.c.REQUEST_SENT;
                            }
                            list.remove(groupDTO.f31558a);
                            rVar.f80808b.notifyDataSetChanged();
                        }
                        break;
                    } else if (i16 == 2) {
                        new androidx.appcompat.app.e.a(rVar.requireContext()).setMessage(rVar.getString(R.string.msg_cannot_request_group_invite)).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                        list.remove(groupDTO.f31558a);
                        rVar.f80808b.notifyDataSetChanged();
                        break;
                    }
                }
                break;
        }
    }
}
