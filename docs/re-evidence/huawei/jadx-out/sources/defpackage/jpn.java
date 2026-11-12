package defpackage;

import com.huawei.ui.commonui.tablewidget.model.ItemData;

/* JADX INFO: loaded from: classes10.dex */
public class jpn implements ItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38803c;
    private String d;

    public jpn(String str) {
        this.f38801a = false;
        this.f38803c = 0;
        this.f38802b = false;
        this.d = str;
    }

    public jpn(String str, boolean z, int i) {
        this.d = str;
        this.f38801a = z;
        this.f38803c = i;
        this.f38802b = true;
    }

    public boolean d() {
        return this.f38802b;
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.ItemData
    public String getValue() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.tablewidget.model.ItemData
    public void setValue(String str) {
        this.d = str;
    }

    public boolean e() {
        return this.f38801a;
    }

    public int b() {
        return this.f38803c;
    }
}
