package defpackage;

import com.huawei.ui.commonui.tablewidget.model.ItemData;

/* JADX INFO: loaded from: classes10.dex */
public class jpj implements ItemData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38794b;
    private String e;

    public jpj(String str, String str2) {
        this.e = str;
        this.f38794b = str2;
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.ItemData
    public String getValue() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.ItemData
    public void setValue(String str) {
        this.e = str;
    }

    public String b() {
        return this.f38794b;
    }
}
