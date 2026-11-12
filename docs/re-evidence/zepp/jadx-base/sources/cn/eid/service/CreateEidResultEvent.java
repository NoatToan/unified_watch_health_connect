package cn.eid.service;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcn/eid/service/CreateEidResultEvent;", "", "", "result", "Z", "getResult", "()Z", "setResult", "(Z)V", "", "info", "Ljava/lang/String;", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "<init>", "()V", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class CreateEidResultEvent {

    @Nullable
    private String info;
    private boolean result;

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    public final boolean getResult() {
        return this.result;
    }

    public final void setInfo(@Nullable String str) {
        this.info = str;
    }

    public final void setResult(boolean z) {
        this.result = z;
    }
}
