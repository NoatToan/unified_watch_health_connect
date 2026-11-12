package defpackage;

import android.content.Intent;
import com.huawei.android.bundlecore.install.ModuleInstallTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class bbg extends ModuleInstallTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f936a;
    private final bbb d;

    bbg(bba bbaVar, List<baj> list, int i, bbb bbbVar) {
        super(bbaVar, true, list);
        this.f936a = i;
        this.d = bbbVar;
    }

    @Override // com.huawei.android.bundlecore.install.ModuleInstallTask
    public void onPreInstall() {
        super.onPreInstall();
        bax baxVarA = this.d.a(this.f936a);
        if (baxVarA != null) {
            this.d.c(this.f936a, 4);
            d(baxVarA);
        }
    }

    @Override // com.huawei.android.bundlecore.install.ModuleInstallTask
    public void onInstallCompleted(List<bba.c> list) {
        super.onInstallCompleted(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (bba.c cVar : list) {
            Intent intent = new Intent();
            if (cVar.f927a != null) {
                intent.putStringArrayListExtra("added-dex", (ArrayList) cVar.f927a);
            }
            intent.putExtra("apk", cVar.f928b.getAbsolutePath());
            intent.putExtra("moduleName", cVar.f929c);
            arrayList.add(intent);
        }
        bax baxVarA = this.d.a(this.f936a);
        if (baxVarA != null) {
            baxVarA.d(arrayList);
            this.d.c(this.f936a, 10);
            d(baxVarA);
        }
    }

    @Override // com.huawei.android.bundlecore.install.ModuleInstallTask
    public void onInstallFailed(List<bbr> list) {
        super.onInstallFailed(list);
        bax baxVarA = this.d.a(this.f936a);
        if (baxVarA != null) {
            if (!list.isEmpty()) {
                baxVarA.a(list.get(0).d());
            }
            this.d.c(this.f936a, 6);
            d(baxVarA);
        }
    }

    private void d(bax baxVar) {
        this.d.c(baxVar);
    }
}
