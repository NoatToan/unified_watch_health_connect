package om0;

import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import li0.d0;
import li0.q0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupManageMembersActivity f132908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a f132909c;

    public /* synthetic */ e(GroupManageMembersActivity groupManageMembersActivity, com.garmin.android.apps.connectmobile.group.details.about.member.a aVar, int i14) {
        this.f132907a = i14;
        this.f132908b = groupManageMembersActivity;
        this.f132909c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        b12.b bVar;
        int i14 = this.f132907a;
        String str = null;
        com.garmin.android.apps.connectmobile.group.details.about.member.a aVar = this.f132909c;
        GroupManageMembersActivity groupManageMembersActivity = this.f132908b;
        switch (i14) {
            case 0:
                GroupManageMembersActivity.a aVar2 = GroupManageMembersActivity.f36194d;
                q0 q0Var = (q0) KoinJavaComponent.get$default(q0.class, null, null, 6, null);
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2 = ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar).f36221a;
                String displayName = bVar2.getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                String fullName = bVar2.getFullName();
                String str2 = fullName != null ? fullName : "";
                d0 d0Var = bVar2.f31627o;
                if (d0Var != null && (bVar = d0Var.f112648a) != null) {
                    str = bVar.f14387a;
                }
                q0Var.a(groupManageMembersActivity, displayName, str2, str);
                break;
            case 1:
                groupManageMembersActivity.f36196b = true;
                if (s.g(((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar).f36221a.getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                    groupManageMembersActivity.finish();
                }
                break;
            default:
                groupManageMembersActivity.f36196b = true;
                if (s.g(((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar).f36221a.getDisplayName(), ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                    groupManageMembersActivity.f36197c = true;
                    groupManageMembersActivity.finish();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
