package com.huami.watch.companion.esim;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.util.DoLooper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/watch/companion/esim/SimResult;", "Lcom/huami/watch/util/DoLooper$Result;", "", "toString", "a", "Ljava/lang/String;", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "info", "b", "getType", "setType", "type", "", "c", LogUtil.I, "getState", "()I", "setState", "(I)V", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class SimResult extends DoLooper.Result {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String info;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int state;

    public SimResult() {
        this(null, null, 0, 7, null);
    }

    public SimResult(@Nullable String str, @Nullable String str2, int i) {
        this.info = str;
        this.type = str2;
        this.state = i;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setInfo(@Nullable String str) {
        this.info = str;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @Override // com.huami.watch.util.DoLooper.Result
    @NotNull
    public String toString() {
        return ((Object) this.type) + JsonLexerKt.COLON + this.state + " && " + ((Object) this.info);
    }

    public /* synthetic */ SimResult(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 1 : i);
    }
}
