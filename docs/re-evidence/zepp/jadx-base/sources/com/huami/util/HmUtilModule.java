package com.huami.util;

import android.app.Application;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.util.platform.HmAppInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/util/HmUtilModule;", "", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", PointCategory.INIT, "getContext", "a", "Landroid/app/Application;", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class HmUtilModule {

    @NotNull
    public static final HmUtilModule INSTANCE = new HmUtilModule();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static Application application;

    private HmUtilModule() {
    }

    @NotNull
    public final Application getContext() throws Exception {
        Application application2 = application;
        if (application2 == null) {
            throw new Exception("application context not init.");
        }
        Objects.requireNonNull(application2);
        return application2;
    }

    public final void init(@NotNull Application application2) {
        application = application2;
        HmAppInfo.INSTANCE.init$hmutil_release(application2);
    }
}
