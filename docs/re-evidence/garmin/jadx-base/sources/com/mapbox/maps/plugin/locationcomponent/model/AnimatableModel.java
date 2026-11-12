package com.mapbox.maps.plugin.locationcomponent.model;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.extension.style.expressions.dsl.generated.ExpressionDslKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.delegates.MapFeatureStateDelegate;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p13.d0;
import p13.u0;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010(\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020,H\u0007J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002R,\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R,\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR,\u0010\u001e\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R8\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00062"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/model/AnimatableModel;", "", "modelUri", "", "modelParts", "", "Lcom/mapbox/maps/plugin/locationcomponent/model/ModelPart;", "(Ljava/lang/String;Ljava/util/List;)V", "value", TtmlNode.ATTR_TTS_COLOR, "getColor$annotations", "()V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "", "colorMixIntensity", "getColorMixIntensity$annotations", "getColorMixIntensity", "()D", "setColorMixIntensity", "(D)V", "emissiveStrength", "getEmissiveStrength$annotations", "getEmissiveStrength", "setEmissiveStrength", "mapFeatureStateDelegate", "Lcom/mapbox/maps/plugin/delegates/MapFeatureStateDelegate;", "getModelUri", "opacity", "getOpacity$annotations", "getOpacity", "setOpacity", "rotation", "getRotation$annotations", "getRotation", "()Ljava/util/List;", "setRotation", "(Ljava/util/List;)V", "bindTo", "", "bindTo$plugin_locationcomponent_release", "getLocationPuck3D", "Lcom/mapbox/maps/plugin/LocationPuck3D;", "updateFeatureState", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/bindgen/Value;", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class AnimatableModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_COLOR = "#ffffff";
    private static final String DEFAULT_COLOR_FEATURE_STATE_KEY = "MBX_default_color";
    public static final double DEFAULT_COLOR_MIX_INTENSITY = 0.0d;
    private static final String DEFAULT_COLOR_MIX_INTENSITY_FEATURE_STATE_KEY = "MBX_default_color_mix_intensity";
    public static final double DEFAULT_EMISSIVE_STRENGTH = 0.0d;
    private static final String DEFAULT_EMISSIVE_STRENGTH_FEATURE_STATE_KEY = "MBX_default_emissive_strength";
    public static final double DEFAULT_OPACITY = 1.0d;
    private static final String DEFAULT_OPACITY_FEATURE_STATE_KEY = "MBX_default_opacity";
    private static final List<Double> DEFAULT_ROTATION;
    private static final String DEFAULT_ROTATION_FEATURE_STATE_KEY = "MBX_default_rotation";
    private static final String PART_KEY = "part";
    private static final String TAG = "AnimatableModel";
    private String color;
    private double colorMixIntensity;
    private double emissiveStrength;
    private MapFeatureStateDelegate mapFeatureStateDelegate;
    private final List<ModelPart> modelParts;
    private final String modelUri;
    private double opacity;
    private List<Double> rotation;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_ROTATION = x.k(dValueOf, dValueOf, dValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatableModel(String str, List<? extends ModelPart> list) {
        str.getClass();
        list.getClass();
        this.modelUri = str;
        this.modelParts = list;
        this.rotation = DEFAULT_ROTATION;
        this.opacity = 1.0d;
        this.color = DEFAULT_COLOR;
    }

    @MapboxExperimental
    public static /* synthetic */ void getColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorMixIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getEmissiveStrength$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getOpacity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRotation$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateFeatureState(Value state) {
        MapFeatureStateDelegate mapFeatureStateDelegate = this.mapFeatureStateDelegate;
        return (mapFeatureStateDelegate == null || MapFeatureStateDelegate.DefaultImpls.setFeatureState$default(mapFeatureStateDelegate, LocationComponentConstants.MODEL_SOURCE, null, ModelSourceWrapper.DEFAULT_MODEL_NAME, state, new p(25), 2, null) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFeatureState$lambda$1(Expected expected) {
        expected.getClass();
        expected.onError(new p(26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFeatureState$lambda$1$lambda$0(String str) {
        str.getClass();
        MapboxLogger.logE(TAG, "Update feature state error: ".concat(str));
    }

    public final void bindTo$plugin_locationcomponent_release(MapFeatureStateDelegate mapFeatureStateDelegate) {
        mapFeatureStateDelegate.getClass();
        this.mapFeatureStateDelegate = mapFeatureStateDelegate;
        Iterator<T> it = this.modelParts.iterator();
        while (it.hasNext()) {
            ((ModelPart) it.next()).bindTo$plugin_locationcomponent_release(new AnimatableModel$bindTo$1$1(this));
        }
    }

    public final String getColor() {
        return this.color;
    }

    public final double getColorMixIntensity() {
        return this.colorMixIntensity;
    }

    public final double getEmissiveStrength() {
        return this.emissiveStrength;
    }

    @SuppressLint({"IncorrectNumberOfArgumentsInExpression"})
    @MapboxExperimental
    public final LocationPuck3D getLocationPuck3D() {
        String str = this.modelUri;
        Expression.Companion companion = Expression.INSTANCE;
        String json = companion.match(new AnonymousClass1()).toJson();
        String json2 = companion.match(new AnonymousClass2()).toJson();
        String json3 = companion.match(new AnonymousClass3()).toJson();
        String json4 = companion.match(new AnonymousClass4()).toJson();
        String json5 = companion.match(new AnonymousClass5()).toJson();
        List<ModelPart> list = this.modelParts;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ModelMaterialPart) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d0.v(arrayList2, ((ModelMaterialPart) it.next()).getMaterialOverrides());
        }
        List<ModelPart> list2 = this.modelParts;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof ModelNodePart) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            d0.v(arrayList4, ((ModelNodePart) it3.next()).getNodeOverrides());
        }
        return new LocationPuck3D(str, null, 0.0f, null, null, null, null, false, false, null, 0.0f, json4, json5, json, 0, json2, 0.0f, json3, arrayList2, arrayList4, null, null, null, 7423998, null);
    }

    public final String getModelUri() {
        return this.modelUri;
    }

    public final double getOpacity() {
        return this.opacity;
    }

    public final List<Double> getRotation() {
        return this.rotation;
    }

    public final void setColor(String str) {
        str.getClass();
        this.color = str;
        updateFeatureState(new Value((HashMap<String, Value>) u0.d(new o13.p(DEFAULT_COLOR_FEATURE_STATE_KEY, new Value(str)))));
    }

    public final void setColorMixIntensity(double d14) {
        this.colorMixIntensity = d14;
        updateFeatureState(new Value((HashMap<String, Value>) u0.d(new o13.p(DEFAULT_COLOR_MIX_INTENSITY_FEATURE_STATE_KEY, new Value(d14)))));
    }

    public final void setEmissiveStrength(double d14) {
        this.emissiveStrength = d14;
        updateFeatureState(new Value((HashMap<String, Value>) u0.d(new o13.p(DEFAULT_EMISSIVE_STRENGTH_FEATURE_STATE_KEY, new Value(d14)))));
    }

    public final void setOpacity(double d14) {
        this.opacity = d14;
        updateFeatureState(new Value((HashMap<String, Value>) u0.d(new o13.p(DEFAULT_OPACITY_FEATURE_STATE_KEY, new Value(d14)))));
    }

    public final void setRotation(List<Double> list) {
        list.getClass();
        this.rotation = list;
        updateFeatureState(new Value((HashMap<String, Value>) u0.d(new o13.p(DEFAULT_ROTATION_FEATURE_STATE_KEY, ExpressionDslKt.literal(list)))));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/model/AnimatableModel$Companion;", "", "()V", "DEFAULT_COLOR", "", "DEFAULT_COLOR_FEATURE_STATE_KEY", "DEFAULT_COLOR_MIX_INTENSITY", "", "DEFAULT_COLOR_MIX_INTENSITY_FEATURE_STATE_KEY", "DEFAULT_EMISSIVE_STRENGTH", "DEFAULT_EMISSIVE_STRENGTH_FEATURE_STATE_KEY", "DEFAULT_OPACITY", "DEFAULT_OPACITY_FEATURE_STATE_KEY", "DEFAULT_ROTATION", "", "getDEFAULT_ROTATION$plugin_locationcomponent_release", "()Ljava/util/List;", "DEFAULT_ROTATION_FEATURE_STATE_KEY", "PART_KEY", "TAG", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final List<Double> getDEFAULT_ROTATION$plugin_locationcomponent_release() {
            return AnimatableModel.DEFAULT_ROTATION;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Expression.ExpressionBuilder, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
            expressionBuilder.getClass();
            expressionBuilder.get(AnimatableModel.PART_KEY);
            List list = AnimatableModel.this.modelParts;
            ArrayList<ModelNodePart> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ModelNodePart) {
                    arrayList.add(obj);
                }
            }
            for (ModelNodePart modelNodePart : arrayList) {
                Iterator<T> it = modelNodePart.getNodeOverrides().iterator();
                while (it.hasNext()) {
                    expressionBuilder.literal((String) it.next());
                    expressionBuilder.switchCase(new AnimatableModel$getLocationPuck3D$1$1$1$1(modelNodePart));
                }
            }
            expressionBuilder.switchCase(new AnonymousClass2(AnimatableModel.this));
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class AnonymousClass2 extends w implements l<Expression.ExpressionBuilder, Unit> {
            final /* synthetic */ AnimatableModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AnimatableModel animatableModel) {
                super(1);
                this.this$0 = animatableModel;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                expressionBuilder.getClass();
                expressionBuilder.eq(C11851.INSTANCE);
                expressionBuilder.featureState(C11882.INSTANCE);
                expressionBuilder.literal(this.this$0.getRotation());
            }

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$1$2$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class C11851 extends w implements l<Expression.ExpressionBuilder, Unit> {
                public static final C11851 INSTANCE = new C11851();

                public C11851() {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                    expressionBuilder.getClass();
                    expressionBuilder.typeofExpression(C11861.INSTANCE);
                    expressionBuilder.literal("array<number, 3>");
                }

                /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$1$2$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class C11861 extends w implements l<Expression.ExpressionBuilder, Unit> {
                    public static final C11861 INSTANCE = new C11861();

                    public C11861() {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                        expressionBuilder.getClass();
                        expressionBuilder.featureState(C11871.INSTANCE);
                    }

                    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
                    public static final class C11871 extends w implements l<Expression.ExpressionBuilder, Unit> {
                        public static final C11871 INSTANCE = new C11871();

                        public C11871() {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                            expressionBuilder.getClass();
                            expressionBuilder.literal(AnimatableModel.DEFAULT_ROTATION_FEATURE_STATE_KEY);
                        }

                        @Override // e23.l
                        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                            invoke2(expressionBuilder);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // e23.l
                    public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                        invoke2(expressionBuilder);
                        return Unit.INSTANCE;
                    }
                }

                @Override // e23.l
                public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                    invoke2(expressionBuilder);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$1$2$2, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class C11882 extends w implements l<Expression.ExpressionBuilder, Unit> {
                public static final C11882 INSTANCE = new C11882();

                public C11882() {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                    expressionBuilder.getClass();
                    expressionBuilder.literal(AnimatableModel.DEFAULT_ROTATION_FEATURE_STATE_KEY);
                }

                @Override // e23.l
                public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                    invoke2(expressionBuilder);
                    return Unit.INSTANCE;
                }
            }

            @Override // e23.l
            public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                invoke2(expressionBuilder);
                return Unit.INSTANCE;
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
            invoke2(expressionBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<Expression.ExpressionBuilder, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
            expressionBuilder.getClass();
            expressionBuilder.get(AnimatableModel.PART_KEY);
            List list = AnimatableModel.this.modelParts;
            ArrayList<ModelMaterialPart> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ModelMaterialPart) {
                    arrayList.add(obj);
                }
            }
            for (ModelMaterialPart modelMaterialPart : arrayList) {
                Iterator<T> it = modelMaterialPart.getMaterialOverrides().iterator();
                while (it.hasNext()) {
                    expressionBuilder.literal((String) it.next());
                    expressionBuilder.toColor(new AnimatableModel$getLocationPuck3D$2$1$1$1(modelMaterialPart));
                }
            }
            expressionBuilder.toColor(new C11892(AnimatableModel.this));
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11892 extends w implements l<Expression.ExpressionBuilder, Unit> {
            final /* synthetic */ AnimatableModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11892(AnimatableModel animatableModel) {
                super(1);
                this.this$0 = animatableModel;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                expressionBuilder.getClass();
                expressionBuilder.featureState(AnonymousClass1.INSTANCE);
                expressionBuilder.literal(this.this$0.getColor());
            }

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$2$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class AnonymousClass1 extends w implements l<Expression.ExpressionBuilder, Unit> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                    expressionBuilder.getClass();
                    expressionBuilder.literal(AnimatableModel.DEFAULT_COLOR_FEATURE_STATE_KEY);
                }

                @Override // e23.l
                public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                    invoke2(expressionBuilder);
                    return Unit.INSTANCE;
                }
            }

            @Override // e23.l
            public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                invoke2(expressionBuilder);
                return Unit.INSTANCE;
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
            invoke2(expressionBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements l<Expression.ExpressionBuilder, Unit> {
        public AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
            expressionBuilder.getClass();
            expressionBuilder.get(AnimatableModel.PART_KEY);
            List list = AnimatableModel.this.modelParts;
            ArrayList<ModelMaterialPart> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ModelMaterialPart) {
                    arrayList.add(obj);
                }
            }
            for (ModelMaterialPart modelMaterialPart : arrayList) {
                Iterator<T> it = modelMaterialPart.getMaterialOverrides().iterator();
                while (it.hasNext()) {
                    expressionBuilder.literal((String) it.next());
                    expressionBuilder.number(new AnimatableModel$getLocationPuck3D$3$1$1$1(modelMaterialPart));
                }
            }
            expressionBuilder.number(new AnonymousClass2(AnimatableModel.this));
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$3$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class AnonymousClass2 extends w implements l<Expression.ExpressionBuilder, Unit> {
            final /* synthetic */ AnimatableModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AnimatableModel animatableModel) {
                super(1);
                this.this$0 = animatableModel;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                expressionBuilder.getClass();
                expressionBuilder.featureState(AnonymousClass1.INSTANCE);
                expressionBuilder.literal(this.this$0.getColorMixIntensity());
            }

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$3$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class AnonymousClass1 extends w implements l<Expression.ExpressionBuilder, Unit> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                    expressionBuilder.getClass();
                    expressionBuilder.literal(AnimatableModel.DEFAULT_COLOR_MIX_INTENSITY_FEATURE_STATE_KEY);
                }

                @Override // e23.l
                public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                    invoke2(expressionBuilder);
                    return Unit.INSTANCE;
                }
            }

            @Override // e23.l
            public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                invoke2(expressionBuilder);
                return Unit.INSTANCE;
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
            invoke2(expressionBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements l<Expression.ExpressionBuilder, Unit> {
        public AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
            expressionBuilder.getClass();
            expressionBuilder.get(AnimatableModel.PART_KEY);
            List list = AnimatableModel.this.modelParts;
            ArrayList<ModelMaterialPart> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ModelMaterialPart) {
                    arrayList.add(obj);
                }
            }
            for (ModelMaterialPart modelMaterialPart : arrayList) {
                Iterator<T> it = modelMaterialPart.getMaterialOverrides().iterator();
                while (it.hasNext()) {
                    expressionBuilder.literal((String) it.next());
                    expressionBuilder.number(new AnimatableModel$getLocationPuck3D$4$1$1$1(modelMaterialPart));
                }
            }
            expressionBuilder.number(new AnonymousClass2(AnimatableModel.this));
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$4$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class AnonymousClass2 extends w implements l<Expression.ExpressionBuilder, Unit> {
            final /* synthetic */ AnimatableModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AnimatableModel animatableModel) {
                super(1);
                this.this$0 = animatableModel;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                expressionBuilder.getClass();
                expressionBuilder.featureState(AnonymousClass1.INSTANCE);
                expressionBuilder.literal(this.this$0.getEmissiveStrength());
            }

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$4$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class AnonymousClass1 extends w implements l<Expression.ExpressionBuilder, Unit> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                    expressionBuilder.getClass();
                    expressionBuilder.literal(AnimatableModel.DEFAULT_EMISSIVE_STRENGTH_FEATURE_STATE_KEY);
                }

                @Override // e23.l
                public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                    invoke2(expressionBuilder);
                    return Unit.INSTANCE;
                }
            }

            @Override // e23.l
            public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                invoke2(expressionBuilder);
                return Unit.INSTANCE;
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
            invoke2(expressionBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass5 extends w implements l<Expression.ExpressionBuilder, Unit> {
        public AnonymousClass5() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
            expressionBuilder.getClass();
            expressionBuilder.get(AnimatableModel.PART_KEY);
            List list = AnimatableModel.this.modelParts;
            ArrayList<ModelMaterialPart> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ModelMaterialPart) {
                    arrayList.add(obj);
                }
            }
            for (ModelMaterialPart modelMaterialPart : arrayList) {
                Iterator<T> it = modelMaterialPart.getMaterialOverrides().iterator();
                while (it.hasNext()) {
                    expressionBuilder.literal((String) it.next());
                    expressionBuilder.number(new AnimatableModel$getLocationPuck3D$5$1$1$1(modelMaterialPart));
                }
            }
            expressionBuilder.number(new AnonymousClass2(AnimatableModel.this));
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$5$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class AnonymousClass2 extends w implements l<Expression.ExpressionBuilder, Unit> {
            final /* synthetic */ AnimatableModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AnimatableModel animatableModel) {
                super(1);
                this.this$0 = animatableModel;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                expressionBuilder.getClass();
                expressionBuilder.featureState(AnonymousClass1.INSTANCE);
                expressionBuilder.literal(this.this$0.getOpacity());
            }

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel$getLocationPuck3D$5$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class AnonymousClass1 extends w implements l<Expression.ExpressionBuilder, Unit> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
                    expressionBuilder.getClass();
                    expressionBuilder.literal(AnimatableModel.DEFAULT_OPACITY_FEATURE_STATE_KEY);
                }

                @Override // e23.l
                public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                    invoke2(expressionBuilder);
                    return Unit.INSTANCE;
                }
            }

            @Override // e23.l
            public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
                invoke2(expressionBuilder);
                return Unit.INSTANCE;
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
            invoke2(expressionBuilder);
            return Unit.INSTANCE;
        }
    }
}
