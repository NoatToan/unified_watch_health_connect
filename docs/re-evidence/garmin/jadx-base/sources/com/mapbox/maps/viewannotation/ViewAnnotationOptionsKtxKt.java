package com.mapbox.maps.viewannotation;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u00012*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00000\u0007\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lkotlin/Function1;", "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "", "block", "Lcom/mapbox/maps/ViewAnnotationOptions;", "viewAnnotationOptions", "(Le23/l;)Lcom/mapbox/maps/ViewAnnotationOptions;", "", "Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;", "blocks", "annotationAnchors", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;[Le23/l;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "annotationAnchor", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Le23/l;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "", "layerId", "Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;", "annotatedLayerFeature", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "Lcom/mapbox/geojson/Geometry;", "geometry", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationOptionsKtxKt {
    public static final ViewAnnotationOptions.Builder annotatedLayerFeature(ViewAnnotationOptions.Builder builder, String str, l<? super AnnotatedLayerFeature.Builder, Unit> lVar) {
        builder.getClass();
        str.getClass();
        lVar.getClass();
        AnnotatedLayerFeature.Builder builderLayerId = new AnnotatedLayerFeature.Builder().layerId(str);
        lVar.invoke(builderLayerId);
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(builderLayerId.build()));
        builderAnnotatedFeature.getClass();
        return builderAnnotatedFeature;
    }

    public static /* synthetic */ ViewAnnotationOptions.Builder annotatedLayerFeature$default(ViewAnnotationOptions.Builder builder, String str, l lVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        builder.getClass();
        str.getClass();
        lVar.getClass();
        AnnotatedLayerFeature.Builder builderLayerId = new AnnotatedLayerFeature.Builder().layerId(str);
        lVar.invoke(builderLayerId);
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(builderLayerId.build()));
        builderAnnotatedFeature.getClass();
        return builderAnnotatedFeature;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchor(ViewAnnotationOptions.Builder builder, l<? super ViewAnnotationAnchorConfig.Builder, Unit> lVar) {
        builder.getClass();
        lVar.getClass();
        ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
        lVar.invoke(builder2);
        ViewAnnotationOptions.Builder builderVariableAnchors = builder.variableAnchors(w.c(builder2.build()));
        builderVariableAnchors.getClass();
        return builderVariableAnchors;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchors(ViewAnnotationOptions.Builder builder, l<? super ViewAnnotationAnchorConfig.Builder, Unit>... lVarArr) {
        builder.getClass();
        lVarArr.getClass();
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l<? super ViewAnnotationAnchorConfig.Builder, Unit> lVar : lVarArr) {
            ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
            lVar.invoke(builder2);
            arrayList.add(builder2.build());
        }
        Object[] array = arrayList.toArray(new ViewAnnotationAnchorConfig[0]);
        array.getClass();
        ViewAnnotationAnchorConfig[] viewAnnotationAnchorConfigArr = (ViewAnnotationAnchorConfig[]) array;
        ViewAnnotationOptions.Builder builderVariableAnchors = builder.variableAnchors(x.k(Arrays.copyOf(viewAnnotationAnchorConfigArr, viewAnnotationAnchorConfigArr.length)));
        builderVariableAnchors.getClass();
        return builderVariableAnchors;
    }

    public static final ViewAnnotationOptions.Builder geometry(ViewAnnotationOptions.Builder builder, Geometry geometry) {
        builder.getClass();
        geometry.getClass();
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(geometry));
        builderAnnotatedFeature.getClass();
        return builderAnnotatedFeature;
    }

    public static final ViewAnnotationOptions viewAnnotationOptions(l<? super ViewAnnotationOptions.Builder, Unit> lVar) {
        lVar.getClass();
        ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
        lVar.invoke(builder);
        ViewAnnotationOptions viewAnnotationOptionsBuild = builder.build();
        viewAnnotationOptionsBuild.getClass();
        return viewAnnotationOptionsBuild;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.viewannotation.ViewAnnotationOptionsKtxKt$annotatedLayerFeature$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 extends p005kotlin.jvm.internal.w implements l<AnnotatedLayerFeature.Builder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(AnnotatedLayerFeature.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AnnotatedLayerFeature.Builder builder) {
            builder.getClass();
        }
    }
}
