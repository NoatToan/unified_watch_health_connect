package h10;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.q1;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class f extends ArrayAdapter<GroupDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f80752i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.c f80753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f80754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h10.b f80755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f80756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f80757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f80758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1 f80759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f80760h;

    public interface a {
    }

    public enum b {
        OWN_CONNECTION_GROUPS,
        CONNECTION_GROUP_SEARCH_RESULT,
        GROUP_INFO
    }

    public f(i.c cVar, h10.b bVar, b bVar2, a aVar) {
        super(cVar, R.layout.simple_list_item_2);
        this.f80758f = new ArrayList();
        this.f80760h = new ArrayList();
        this.f80753a = cVar;
        this.f80754b = (LayoutInflater) cVar.getSystemService("layout_inflater");
        this.f80755c = bVar;
        this.f80756d = bVar2;
        this.f80757e = aVar;
    }

    public final String a(GroupDTO groupDTO) {
        GroupDTO.c cVar = groupDTO.f31578w;
        GroupDTO.c cVar2 = GroupDTO.c.ADMIN;
        i.c cVar3 = this.f80753a;
        if (cVar == cVar2) {
            return cVar3.getString(com.garmin.android.apps.connectmobile.R.string.lbl_admin);
        }
        if (cVar == GroupDTO.c.OWNER) {
            return cVar3.getString(com.garmin.android.apps.connectmobile.R.string.lbl_owner);
        }
        if (cVar == GroupDTO.c.MEMBER) {
            return cVar3.getString(com.garmin.android.apps.connectmobile.R.string.lbl_member);
        }
        if (cVar == GroupDTO.c.REQUEST_SENT) {
            return cVar3.getString(com.garmin.android.apps.connectmobile.R.string.lbl_request_sent);
        }
        return null;
    }

    public final boolean c(GroupDTO groupDTO) {
        for (uz0.b bVar : this.f80760h) {
            if (bVar.getGroupId() != null && bVar.getGroupId().toString().equals(groupDTO.f31558a)) {
                return true;
            }
        }
        return false;
    }

    public final void d(c cVar, String str) {
        this.f80758f.add(str);
        cVar.f80747f.setVisibility(8);
        cVar.f80748g.setVisibility(0);
        cVar.f80742a.setClickable(false);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVar;
        View viewInflate;
        String strA;
        String str;
        Object next;
        int i15;
        if (view2 == null) {
            cVar = new c();
            viewInflate = this.f80754b.inflate(com.garmin.android.apps.connectmobile.R.layout.gcm_connection_groups_row, viewGroup, false);
            cVar.f80742a = (ConstraintLayout) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_groups_row_container);
            cVar.f80743b = (TextView) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_groups_group_name);
            cVar.f80745d = (TextView) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_groups_group_type);
            cVar.f80746e = (TextView) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_groups_group_location);
            cVar.f80744c = (ImageView) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_groups_group_icon);
            cVar.f80747f = (TextView) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_groups_group_text_action);
            cVar.f80748g = (ProgressBar) viewInflate.findViewById(com.garmin.android.apps.connectmobile.R.id.gcm_groups_group_action_progress);
            viewInflate.setTag(cVar);
        } else {
            cVar = (c) view2.getTag();
            viewInflate = view2;
        }
        GroupDTO groupDTO = (GroupDTO) getItem(i14);
        i.c cVar2 = this.f80753a;
        if (groupDTO != null) {
            String str2 = groupDTO.f31559b;
            if (TextUtils.isEmpty(str2)) {
                cVar.f80743b.setVisibility(8);
            } else {
                cVar.f80743b.setText(str2);
                cVar.f80743b.setVisibility(0);
            }
            ArrayList arrayList = groupDTO.f31573p;
            ArrayList arrayListJ = arrayList != null ? jm0.e.j(arrayList) : null;
            ArrayList arrayList2 = new ArrayList();
            if (arrayListJ != null) {
                Iterator it = arrayListJ.iterator();
                while (it.hasNext()) {
                    int i16 = ((com.garmin.android.apps.connectmobile.connections.groups.services.model.e) it.next()).f31647b;
                    if (i16 > 0) {
                        arrayList2.add(cVar2.getString(i16));
                    } else if (!TextUtils.isEmpty(groupDTO.f31574q)) {
                        arrayList2.add(0, groupDTO.f31574q);
                    }
                }
            }
            String strJoin = TextUtils.join(", ", arrayList2);
            ConstraintLayout constraintLayout = cVar.f80742a;
            int i17 = jm0.a.f99561a;
            strJoin.getClass();
            String str3 = groupDTO.f31559b;
            String strConcat = g22.n.d(strJoin) ? "The activity types of the group are: ".concat(strJoin) : "";
            String strN = g22.n.d(groupDTO.f31569l) ? fb1.c.n("The members of the group are located at: ", groupDTO.f31569l) : "";
            if (jm0.e.f(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), groupDTO)) {
                str = "You are the owner of the group";
            } else {
                jm0.e eVar = jm0.e.f99565a;
                GroupDTO.c cVar3 = groupDTO.f31578w;
                eVar.getClass();
                if (jm0.e.d(cVar3)) {
                    str = "You are the admin of the group";
                } else {
                    GroupDTO.c cVar4 = groupDTO.f31578w;
                    cVar4.getClass();
                    str = jm0.e.e(cVar4) ? "You are the member of the group" : "You have not joined the group";
                }
            }
            StringBuilder sbL = e5.l(str3, "; ", strConcat, "; ", strN);
            sbL.append("; ");
            sbL.append(str);
            constraintLayout.setContentDescription(sbL.toString());
            boolean zIsEmpty = TextUtils.isEmpty(strJoin);
            TextView textView = cVar.f80745d;
            if (zIsEmpty) {
                textView.setVisibility(8);
            } else {
                textView.setText(strJoin);
                cVar.f80745d.setVisibility(0);
            }
            String str4 = groupDTO.f31569l;
            boolean zIsEmpty2 = TextUtils.isEmpty(str4);
            TextView textView2 = cVar.f80746e;
            if (zIsEmpty2) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str4);
                cVar.f80746e.setVisibility(0);
            }
            if (TextUtils.isEmpty(groupDTO.f31566i)) {
                String str5 = groupDTO.I;
                k10.a aVar = k10.a.f102143a;
                cVar2.getClass();
                ArrayList arrayList3 = new ArrayList();
                TypedArray typedArrayObtainTypedArray = cVar2.getResources().obtainTypedArray(com.garmin.android.apps.connectmobile.R.array.group_defaut_image_id);
                typedArrayObtainTypedArray.getClass();
                TypedArray typedArrayObtainTypedArray2 = cVar2.getResources().obtainTypedArray(com.garmin.android.apps.connectmobile.R.array.group_defaut_image_small);
                typedArrayObtainTypedArray2.getClass();
                int length = typedArrayObtainTypedArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    arrayList3.add(new l10.a(typedArrayObtainTypedArray2.getResourceId(i18, -1), String.valueOf(typedArrayObtainTypedArray.getString(i18))));
                }
                typedArrayObtainTypedArray2.recycle();
                typedArrayObtainTypedArray.recycle();
                Iterator it3 = arrayList3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!((l10.a) next).f108051b.equals(str5));
                l10.a aVar2 = (l10.a) next;
                if (aVar2 != null) {
                    i15 = aVar2.f108050a;
                } else {
                    k10.a.f102143a.getClass();
                    i15 = 2131232830;
                }
                zp0.c cVar5 = new zp0.c((Context) cVar2);
                cVar5.f206567g = i15;
                cVar5.f206570j = 2131232309;
                cVar5.a("circle_mask");
                cVar5.h(cVar.f80744c);
            } else {
                zp0.c cVar6 = new zp0.c((Context) cVar2);
                cVar6.f206565e = groupDTO.f31566i;
                cVar6.f206570j = 2131232309;
                cVar6.a("circle_mask");
                cVar6.h(cVar.f80744c);
            }
        }
        b bVar = b.OWN_CONNECTION_GROUPS;
        b bVar2 = this.f80756d;
        if (bVar2 == bVar) {
            cVar.f80747f.setVisibility(0);
            cVar.f80747f.setText(a(groupDTO));
        } else if (bVar2 == b.GROUP_INFO) {
            cVar.f80747f.setVisibility(8);
        } else if (bVar2 == b.CONNECTION_GROUP_SEARCH_RESULT) {
            boolean z14 = true;
            if (this.f80758f.contains(groupDTO.f31558a)) {
                cVar.f80747f.setVisibility(8);
                cVar.f80748g.setVisibility(0);
                cVar.f80742a.setClickable(false);
            } else {
                cVar.f80747f.setVisibility(0);
                cVar.f80748g.setVisibility(8);
                cVar.f80742a.setClickable(true);
            }
            TextView textView3 = cVar.f80747f;
            if (c(groupDTO)) {
                strA = cVar2.getString(com.garmin.android.apps.connectmobile.R.string.lbl_accept);
            } else {
                strA = a(groupDTO);
                if (strA == null) {
                    GroupDTO.d dVar = groupDTO.f31568k;
                    strA = dVar == GroupDTO.d.INVITE ? cVar2.getString(com.garmin.android.apps.connectmobile.R.string.lbl_invite_only) : (dVar == GroupDTO.d.PUBLIC || dVar == GroupDTO.d.PRIVATE) ? cVar2.getString(com.garmin.android.apps.connectmobile.R.string.lbl_join) : null;
                }
            }
            textView3.setText(strA);
            if (!c(groupDTO)) {
                GroupDTO.c cVar7 = groupDTO.f31578w;
                GroupDTO.d dVar2 = groupDTO.f31568k;
                GroupDTO.c cVar8 = GroupDTO.c.NOT_DEFINED;
                if (((cVar7 != cVar8 && cVar7 != GroupDTO.c.INVITE_SENT) || dVar2 != GroupDTO.d.PUBLIC) && (cVar7 != cVar8 || dVar2 != GroupDTO.d.PRIVATE)) {
                    z14 = false;
                }
            }
            TextView textView4 = cVar.f80747f;
            if (z14) {
                textView4.setOnClickListener(new bv2.j(this, 7, groupDTO, cVar));
            } else {
                textView4.setClickable(false);
            }
            cVar.f80747f.setTextColor(cVar2.getResources().getColor(z14 ? com.garmin.android.apps.connectmobile.R.color.gcm_text_primary_action : com.garmin.android.apps.connectmobile.R.color.gcm_text_secondary));
        }
        cVar.f80742a.setOnClickListener(new cw2.b(21, this, groupDTO));
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return false;
    }
}
