package com.google.maps.android.compose;

import java.io.Closeable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\fJ'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "", "Li5/a;", "view", "Lkotlin/Function0;", "", "onAddedToWindow", "renderViewOnce", "(Li5/a;Le23/a;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingView", "(Li5/a;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "RenderHandle", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ComposeUiViewRenderer {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "Ljava/io/Closeable;", "dispose", "", "close", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RenderHandle extends Closeable {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void close(RenderHandle renderHandle) {
                renderHandle.dispose();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void dispose();
    }

    void renderViewOnce(kotlin.a view2, e23.a<Unit> onAddedToWindow);

    RenderHandle startRenderingView(kotlin.a view2);
}
