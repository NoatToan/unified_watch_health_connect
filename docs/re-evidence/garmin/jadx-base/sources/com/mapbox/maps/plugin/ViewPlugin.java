package com.mapbox.maps.plugin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\rJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/plugin/ViewPlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "bind", "Landroid/view/View;", "mapView", "Landroid/widget/FrameLayout;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "onPluginView", "", "view", "Initializer", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ViewPlugin extends MapPlugin {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(ViewPlugin viewPlugin) {
            MapPlugin.DefaultImpls.cleanup(viewPlugin);
        }

        public static void initialize(ViewPlugin viewPlugin) {
            MapPlugin.DefaultImpls.initialize(viewPlugin);
        }

        public static void onDelegateProvider(ViewPlugin viewPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(viewPlugin, mapDelegateProvider);
        }

        public static void onPluginView(ViewPlugin viewPlugin, View view2) {
            view2.getClass();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/plugin/ViewPlugin$Initializer;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "attributes", "Landroid/content/res/TypedArray;", "pixelRatio", "", "(Ljava/lang/ref/WeakReference;Landroid/content/res/TypedArray;F)V", "getAttributes", "()Landroid/content/res/TypedArray;", "getContext", "()Ljava/lang/ref/WeakReference;", "getPixelRatio", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Initializer {
        private final TypedArray attributes;
        private final WeakReference<Context> context;
        private final float pixelRatio;

        public Initializer(WeakReference<Context> weakReference, TypedArray typedArray, float f14) {
            weakReference.getClass();
            typedArray.getClass();
            this.context = weakReference;
            this.attributes = typedArray;
            this.pixelRatio = f14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initializer copy$default(Initializer initializer, WeakReference weakReference, TypedArray typedArray, float f14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                weakReference = initializer.context;
            }
            if ((i14 & 2) != 0) {
                typedArray = initializer.attributes;
            }
            if ((i14 & 4) != 0) {
                f14 = initializer.pixelRatio;
            }
            return initializer.copy(weakReference, typedArray, f14);
        }

        public final WeakReference<Context> component1() {
            return this.context;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TypedArray getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getPixelRatio() {
            return this.pixelRatio;
        }

        public final Initializer copy(WeakReference<Context> context, TypedArray attributes, float pixelRatio) {
            context.getClass();
            attributes.getClass();
            return new Initializer(context, attributes, pixelRatio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initializer)) {
                return false;
            }
            Initializer initializer = (Initializer) other;
            return s.g(this.context, initializer.context) && s.g(this.attributes, initializer.attributes) && Float.compare(this.pixelRatio, initializer.pixelRatio) == 0;
        }

        public final TypedArray getAttributes() {
            return this.attributes;
        }

        public final WeakReference<Context> getContext() {
            return this.context;
        }

        public final float getPixelRatio() {
            return this.pixelRatio;
        }

        public int hashCode() {
            return Float.hashCode(this.pixelRatio) + ((this.attributes.hashCode() + (this.context.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("Initializer(context=");
            sb3.append(this.context);
            sb3.append(", attributes=");
            sb3.append(this.attributes);
            sb3.append(", pixelRatio=");
            return f.p(sb3, this.pixelRatio, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    View bind(FrameLayout mapView, AttributeSet attrs, float pixelRatio);

    void onPluginView(View view2);
}
