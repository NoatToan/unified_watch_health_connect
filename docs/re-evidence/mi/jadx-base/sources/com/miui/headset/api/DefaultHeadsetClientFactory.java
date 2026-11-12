package com.miui.headset.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/miui/headset/api/DefaultHeadsetClientFactory;", "Lcom/miui/headset/api/HeadsetClientFactory;", "()V", "create", "Lcom/miui/headset/api/IHeadset;", "context", "Landroid/content/Context;", "headsetServiceListener", "Lcom/miui/headset/api/HeadsetServiceListener;", "headsetHostListener", "Lcom/miui/headset/api/HeadsetHostListener;", "alias", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultHeadsetClientFactory implements HeadsetClientFactory {

    @NotNull
    public static final DefaultHeadsetClientFactory INSTANCE = new DefaultHeadsetClientFactory();

    private DefaultHeadsetClientFactory() {
    }

    @Override // com.miui.headset.api.HeadsetClientFactory
    @NotNull
    public IHeadset create(@NotNull Context context, @NotNull HeadsetServiceListener headsetServiceListener, @NotNull HeadsetHostListener headsetHostListener, @NotNull String alias) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(headsetServiceListener, "headsetServiceListener");
        Intrinsics.checkNotNullParameter(headsetHostListener, "headsetHostListener");
        Intrinsics.checkNotNullParameter(alias, "alias");
        return new HeadsetClient(context, headsetServiceListener, headsetHostListener, alias);
    }
}
