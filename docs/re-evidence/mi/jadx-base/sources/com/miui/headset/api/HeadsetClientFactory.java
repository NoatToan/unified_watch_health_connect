package com.miui.headset.api;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/miui/headset/api/HeadsetClientFactory;", "", "create", "Lcom/miui/headset/api/IHeadset;", "context", "Landroid/content/Context;", "headsetServiceListener", "Lcom/miui/headset/api/HeadsetServiceListener;", "headsetHostListener", "Lcom/miui/headset/api/HeadsetHostListener;", "alias", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HeadsetClientFactory {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ IHeadset create$default(HeadsetClientFactory headsetClientFactory, Context context, HeadsetServiceListener headsetServiceListener, HeadsetHostListener headsetHostListener, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 8) != 0) {
                str = "";
            }
            return headsetClientFactory.create(context, headsetServiceListener, headsetHostListener, str);
        }
    }

    @NotNull
    IHeadset create(@NotNull Context context, @NotNull HeadsetServiceListener headsetServiceListener, @NotNull HeadsetHostListener headsetHostListener, @NotNull String alias);
}
