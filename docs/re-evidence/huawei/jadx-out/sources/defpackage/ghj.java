package defpackage;

import com.huawei.basefitnessadvice.model.intplan.StatInfo;

/* JADX INFO: loaded from: classes29.dex */
public class ghj implements StatInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35118a;
    private Object e;

    public ghj(String str, Object obj) {
        this.f35118a = str;
        this.e = obj;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.StatInfo
    public String getStatType() {
        return this.f35118a;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.StatInfo
    public <T> T getValue() {
        return (T) this.e;
    }
}
