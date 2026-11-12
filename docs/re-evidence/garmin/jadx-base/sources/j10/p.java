package j10;

import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsPrivacyActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupSettingsPrivacyActivity f96393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f96394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f96395d;

    public /* synthetic */ p(GroupSettingsPrivacyActivity groupSettingsPrivacyActivity, p1 p1Var, p1 p1Var2, int i14) {
        this.f96392a = i14;
        this.f96393b = groupSettingsPrivacyActivity;
        this.f96394c = p1Var;
        this.f96395d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f96392a;
        p1 p1Var = this.f96395d;
        p1 p1Var2 = this.f96394c;
        GroupSettingsPrivacyActivity groupSettingsPrivacyActivity = this.f96393b;
        switch (i14) {
            case 0:
                GroupSettingsPrivacyActivity.a aVar = GroupSettingsPrivacyActivity.f31458b;
                GroupDTO.e eVar = (GroupDTO.e) p1Var2.getF182175a();
                eVar.getClass();
                GroupDTO.d dVar = (GroupDTO.d) p1Var.getF182175a();
                dVar.getClass();
                groupSettingsPrivacyActivity.ea(eVar, dVar);
                break;
            default:
                GroupSettingsPrivacyActivity.a aVar2 = GroupSettingsPrivacyActivity.f31458b;
                GroupDTO.e eVar2 = (GroupDTO.e) p1Var2.getF182175a();
                eVar2.getClass();
                GroupDTO.d dVar2 = (GroupDTO.d) p1Var.getF182175a();
                dVar2.getClass();
                groupSettingsPrivacyActivity.ea(eVar2, dVar2);
                break;
        }
        return Unit.INSTANCE;
    }
}
