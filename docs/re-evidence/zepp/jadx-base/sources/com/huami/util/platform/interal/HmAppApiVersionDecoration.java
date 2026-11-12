package com.huami.util.platform.interal;

import com.huami.util.platform.HmAppApiVersionApi;
import com.huami.util.platform.HmAppInfoApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/util/platform/interal/HmAppApiVersionDecoration;", "Lcom/huami/util/platform/HmAppApiVersionApi;", "", "requestHeaderCurrentVersion", "Lcom/huami/util/platform/HmAppInfoApi;", "a", "Lcom/huami/util/platform/HmAppInfoApi;", "hmAppInfoApi", "<init>", "(Lcom/huami/util/platform/HmAppInfoApi;)V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class HmAppApiVersionDecoration implements HmAppApiVersionApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HmAppInfoApi hmAppInfoApi;

    public HmAppApiVersionDecoration(@NotNull HmAppInfoApi hmAppInfoApi) {
        this.hmAppInfoApi = hmAppInfoApi;
    }

    @Override // com.huami.util.platform.HmAppApiVersionApi
    @NotNull
    public String requestHeaderCurrentVersion() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hmAppInfoApi.versionNumber());
        sb.append('_');
        sb.append((Object) this.hmAppInfoApi.versionName());
        return sb.toString();
    }
}
