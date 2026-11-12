package com.garmin.android.apps.connectmobile.connections.groups.details;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.e;
import d53.w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupSettingsActivitiesActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "groupOtherActivity", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupSettingsActivitiesActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31417b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupDTO f31418a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e[] f31419a;

        public b(e[] eVarArr) {
            this.f31419a = eVarArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            e[] eVarArr = this.f31419a;
            return r13.a.b(Integer.valueOf(u.M(eVarArr, (e) t7)), Integer.valueOf(u.M(eVarArr, (e) t14)));
        }
    }

    public final void da(String str, Set set) {
        Intent intent = new Intent();
        GroupDTO groupDTO = this.f31418a;
        if (groupDTO == null) {
            s.m("groupDTO");
            throw null;
        }
        ArrayList<e> arrayListD1 = h0.d1(h0.N0(set, new b(jm0.e.b())));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (e eVar : arrayListD1) {
            if (eVar != e.ACT_OTHER || (str != null && !w.J(str))) {
                arrayList.add(eVar);
                arrayList3.addAll(eVar.a());
                arrayList2.addAll(eVar.b());
            }
        }
        groupDTO.f31573p = arrayList;
        groupDTO.f31574q = str;
        groupDTO.f31577v = arrayList3;
        groupDTO.D(arrayList2);
        Unit unit = Unit.INSTANCE;
        intent.putExtra("GCM_extra_connection_group", groupDTO);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("GCM_extra_connection_group") : null;
            parcelable = (GroupDTO) (parcelableExtra instanceof GroupDTO ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_connection_group", GroupDTO.class);
        }
        GroupDTO groupDTO = (GroupDTO) parcelable;
        if (groupDTO == null) {
            groupDTO = new GroupDTO();
        }
        this.f31418a = groupDTO;
        initComposeScreen(new z3.e(684881121, true, new ik1.c(this, 7)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupSettingsActivitiesActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
