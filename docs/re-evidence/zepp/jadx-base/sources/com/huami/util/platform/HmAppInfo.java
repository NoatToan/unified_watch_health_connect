package com.huami.util.platform;

import android.app.Application;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.util.platform.interal.HmAppApiVersionDecoration;
import com.huami.util.platform.interal.HmAppInfoImpl;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/util/platform/HmAppInfo;", "", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "init$hmutil_release", "(Landroid/app/Application;)V", PointCategory.INIT, "Lcom/huami/util/platform/HmAppInfoApi;", "hmAppInfo", "Lcom/huami/util/platform/HmAppApiVersionApi;", "hmAppCv", "", "a", "Ljava/lang/String;", "tag", "b", "Lcom/huami/util/platform/HmAppInfoApi;", "hmAppInfoApi", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class HmAppInfo {

    @NotNull
    public static final HmAppInfo INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static HmAppInfoApi hmAppInfoApi;

    static {
        HmAppInfo hmAppInfo = new HmAppInfo();
        INSTANCE = hmAppInfo;
        tag = hmAppInfo.getClass().getSimpleName();
    }

    private HmAppInfo() {
    }

    @NotNull
    public final HmAppApiVersionApi hmAppCv() {
        HmAppInfoApi hmAppInfoApi2 = hmAppInfoApi;
        Objects.requireNonNull(hmAppInfoApi2);
        return new HmAppApiVersionDecoration(hmAppInfoApi2);
    }

    @NotNull
    public final HmAppInfoApi hmAppInfo() {
        HmAppInfoApi hmAppInfoApi2 = hmAppInfoApi;
        Objects.requireNonNull(hmAppInfoApi2);
        return hmAppInfoApi2;
    }

    public final void init$hmutil_release(@NotNull Application application) {
        hmAppInfoApi = new HmAppInfoImpl(application);
    }
}
