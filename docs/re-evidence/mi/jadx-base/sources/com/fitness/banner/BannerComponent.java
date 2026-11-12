package com.fitness.banner;

import com.fitness.banner.schema.BannerSchemaHandler;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import defpackage.xfl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/fitness/banner/BannerComponent;", "", "<init>", "()V", "initPush", "", "Companion", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "banner")
public final class BannerComponent {

    @NotNull
    public static final String TAG = "BannerComponent";

    @ComponentTask(notLaterThan = 4, onMainThread = false)
    public final void initPush() {
        xfl.a().d(new BannerSchemaHandler());
    }
}
