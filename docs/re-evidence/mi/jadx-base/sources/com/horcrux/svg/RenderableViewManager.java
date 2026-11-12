package com.horcrux.svg;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a;
import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import defpackage.cbe;
import defpackage.dyp;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;
import defpackage.iz6;
import defpackage.jej;
import defpackage.oej;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
class RenderableViewManager extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final MatrixDecompositionContext sMatrixDecompositionContext = new MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];
    private final String mClassName;
    private final SVGClass svgClass;

    /* JADX INFO: renamed from: com.horcrux.svg.RenderableViewManager$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass;

        static {
            int[] iArr = new int[SVGClass.values().length];
            $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr2;
            try {
                iArr2[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public static class CircleViewManager extends RenderableViewManager {
        public CircleViewManager() {
            super(SVGClass.RNSVGCircle);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = "cx")
        public void setCx(CircleView circleView, Dynamic dynamic) {
            circleView.setCx(dynamic);
        }

        @iej(name = "cy")
        public void setCy(CircleView circleView, Dynamic dynamic) {
            circleView.setCy(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "r")
        public void setR(CircleView circleView, Dynamic dynamic) {
            circleView.setR(dynamic);
        }
    }

    public static class ClipPathViewManager extends GroupViewManager {
        public ClipPathViewManager() {
            super(SVGClass.RNSVGClipPath);
        }
    }

    public static class DefsViewManager extends RenderableViewManager {
        public DefsViewManager() {
            super(SVGClass.RNSVGDefs);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }
    }

    public static class EllipseViewManager extends RenderableViewManager {
        public EllipseViewManager() {
            super(SVGClass.RNSVGEllipse);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = "cx")
        public void setCx(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setCx(dynamic);
        }

        @iej(name = "cy")
        public void setCy(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setCy(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "rx")
        public void setRx(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setRx(dynamic);
        }

        @iej(name = "ry")
        public void setRy(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setRy(dynamic);
        }
    }

    public static class GroupViewManager extends RenderableViewManager {
        public GroupViewManager() {
            super(SVGClass.RNSVGGroup);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = SlotType.FONT)
        public void setFont(GroupView groupView, ReadableMap readableMap) {
            groupView.setFont(readableMap);
        }

        @iej(name = "fontSize")
        public void setFontSize(GroupView groupView, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            groupView.setFont(javaOnlyMap);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        public GroupViewManager(SVGClass sVGClass) {
            super(sVGClass);
        }
    }

    public static class ImageViewManager extends RenderableViewManager {
        public ImageViewManager() {
            super(SVGClass.RNSVGImage);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = "align")
        public void setAlign(ImageView imageView, String str) {
            imageView.setAlign(str);
        }

        @iej(name = "height")
        public void setHeight(ImageView imageView, Dynamic dynamic) {
            imageView.setHeight(dynamic);
        }

        @iej(name = "meetOrSlice")
        public void setMeetOrSlice(ImageView imageView, int i) {
            imageView.setMeetOrSlice(i);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "src")
        public void setSrc(ImageView imageView, ReadableMap readableMap) {
            imageView.setSrc(readableMap);
        }

        @iej(name = "width")
        public void setWidth(ImageView imageView, Dynamic dynamic) {
            imageView.setWidth(dynamic);
        }

        @iej(name = "x")
        public void setX(ImageView imageView, Dynamic dynamic) {
            imageView.setX(dynamic);
        }

        @iej(name = "y")
        public void setY(ImageView imageView, Dynamic dynamic) {
            imageView.setY(dynamic);
        }
    }

    public static class LineViewManager extends RenderableViewManager {
        public LineViewManager() {
            super(SVGClass.RNSVGLine);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "x1")
        public void setX1(LineView lineView, Dynamic dynamic) {
            lineView.setX1(dynamic);
        }

        @iej(name = "x2")
        public void setX2(LineView lineView, Dynamic dynamic) {
            lineView.setX2(dynamic);
        }

        @iej(name = "y1")
        public void setY1(LineView lineView, Dynamic dynamic) {
            lineView.setY1(dynamic);
        }

        @iej(name = "y2")
        public void setY2(LineView lineView, Dynamic dynamic) {
            lineView.setY2(dynamic);
        }
    }

    public static class LinearGradientManager extends RenderableViewManager {
        public LinearGradientManager() {
            super(SVGClass.RNSVGLinearGradient);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = "gradient")
        public void setGradient(LinearGradientView linearGradientView, ReadableArray readableArray) {
            linearGradientView.setGradient(readableArray);
        }

        @iej(name = "gradientTransform")
        public void setGradientTransform(LinearGradientView linearGradientView, ReadableArray readableArray) {
            linearGradientView.setGradientTransform(readableArray);
        }

        @iej(name = "gradientUnits")
        public void setGradientUnits(LinearGradientView linearGradientView, int i) {
            linearGradientView.setGradientUnits(i);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "x1")
        public void setX1(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setX1(dynamic);
        }

        @iej(name = "x2")
        public void setX2(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setX2(dynamic);
        }

        @iej(name = "y1")
        public void setY1(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setY1(dynamic);
        }

        @iej(name = "y2")
        public void setY2(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setY2(dynamic);
        }
    }

    public static class MaskManager extends GroupViewManager {
        public MaskManager() {
            super(SVGClass.RNSVGMask);
        }

        @iej(name = "height")
        public void setHeight(MaskView maskView, Dynamic dynamic) {
            maskView.setHeight(dynamic);
        }

        @iej(name = "maskContentUnits")
        public void setMaskContentUnits(MaskView maskView, int i) {
            maskView.setMaskContentUnits(i);
        }

        @iej(name = "maskTransform")
        public void setMaskTransform(MaskView maskView, ReadableArray readableArray) {
            maskView.setMaskTransform(readableArray);
        }

        @iej(name = "maskUnits")
        public void setMaskUnits(MaskView maskView, int i) {
            maskView.setMaskUnits(i);
        }

        @iej(name = "width")
        public void setWidth(MaskView maskView, Dynamic dynamic) {
            maskView.setWidth(dynamic);
        }

        @iej(name = "x")
        public void setX(MaskView maskView, Dynamic dynamic) {
            maskView.setX(dynamic);
        }

        @iej(name = "y")
        public void setY(MaskView maskView, Dynamic dynamic) {
            maskView.setY(dynamic);
        }
    }

    public static class MatrixDecompositionContext extends a.C0169a {
        final double[] perspective = new double[4];
        final double[] scale = new double[3];
        final double[] skew = new double[3];
        final double[] translation = new double[3];
        final double[] rotationDegrees = new double[3];
    }

    public static class PathViewManager extends RenderableViewManager {
        public PathViewManager() {
            super(SVGClass.RNSVGPath);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = PluginDeviceInfo.FICONOFF)
        public void setD(PathView pathView, String str) {
            pathView.setD(str);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }
    }

    public static class PatternManager extends GroupViewManager {
        public PatternManager() {
            super(SVGClass.RNSVGPattern);
        }

        @iej(name = "align")
        public void setAlign(PatternView patternView, String str) {
            patternView.setAlign(str);
        }

        @iej(name = "height")
        public void setHeight(PatternView patternView, Dynamic dynamic) {
            patternView.setHeight(dynamic);
        }

        @iej(name = "meetOrSlice")
        public void setMeetOrSlice(PatternView patternView, int i) {
            patternView.setMeetOrSlice(i);
        }

        @iej(name = "minX")
        public void setMinX(PatternView patternView, float f) {
            patternView.setMinX(f);
        }

        @iej(name = "minY")
        public void setMinY(PatternView patternView, float f) {
            patternView.setMinY(f);
        }

        @iej(name = "patternContentUnits")
        public void setPatternContentUnits(PatternView patternView, int i) {
            patternView.setPatternContentUnits(i);
        }

        @iej(name = "patternTransform")
        public void setPatternTransform(PatternView patternView, ReadableArray readableArray) {
            patternView.setPatternTransform(readableArray);
        }

        @iej(name = "patternUnits")
        public void setPatternUnits(PatternView patternView, int i) {
            patternView.setPatternUnits(i);
        }

        @iej(name = "vbHeight")
        public void setVbHeight(PatternView patternView, float f) {
            patternView.setVbHeight(f);
        }

        @iej(name = "vbWidth")
        public void setVbWidth(PatternView patternView, float f) {
            patternView.setVbWidth(f);
        }

        @iej(name = "width")
        public void setWidth(PatternView patternView, Dynamic dynamic) {
            patternView.setWidth(dynamic);
        }

        @iej(name = "x")
        public void setX(PatternView patternView, Dynamic dynamic) {
            patternView.setX(dynamic);
        }

        @iej(name = "y")
        public void setY(PatternView patternView, Dynamic dynamic) {
            patternView.setY(dynamic);
        }
    }

    public static class RadialGradientManager extends RenderableViewManager {
        public RadialGradientManager() {
            super(SVGClass.RNSVGRadialGradient);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = "cx")
        public void setCx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setCx(dynamic);
        }

        @iej(name = "cy")
        public void setCy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setCy(dynamic);
        }

        @iej(name = "fx")
        public void setFx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setFx(dynamic);
        }

        @iej(name = "fy")
        public void setFy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setFy(dynamic);
        }

        @iej(name = "gradient")
        public void setGradient(RadialGradientView radialGradientView, ReadableArray readableArray) {
            radialGradientView.setGradient(readableArray);
        }

        @iej(name = "gradientTransform")
        public void setGradientTransform(RadialGradientView radialGradientView, ReadableArray readableArray) {
            radialGradientView.setGradientTransform(readableArray);
        }

        @iej(name = "gradientUnits")
        public void setGradientUnits(RadialGradientView radialGradientView, int i) {
            radialGradientView.setGradientUnits(i);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "rx")
        public void setRx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setRx(dynamic);
        }

        @iej(name = "ry")
        public void setRy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setRy(dynamic);
        }
    }

    public static class RectViewManager extends RenderableViewManager {
        public RectViewManager() {
            super(SVGClass.RNSVGRect);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = "height")
        public void setHeight(RectView rectView, Dynamic dynamic) {
            rectView.setHeight(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "rx")
        public void setRx(RectView rectView, Dynamic dynamic) {
            rectView.setRx(dynamic);
        }

        @iej(name = "ry")
        public void setRy(RectView rectView, Dynamic dynamic) {
            rectView.setRy(dynamic);
        }

        @iej(name = "width")
        public void setWidth(RectView rectView, Dynamic dynamic) {
            rectView.setWidth(dynamic);
        }

        @iej(name = "x")
        public void setX(RectView rectView, Dynamic dynamic) {
            rectView.setX(dynamic);
        }

        @iej(name = "y")
        public void setY(RectView rectView, Dynamic dynamic) {
            rectView.setY(dynamic);
        }
    }

    public class RenderableShadowNode extends cbe {
        public RenderableShadowNode() {
        }

        @jej(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", TSMAuthContants.PARAM_KEY_RIGHT, "top", "bottom", "left", StatConstants.PARAM_START, StatConstants.PARAM_END, "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i, Dynamic dynamic) {
        }
    }

    public enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask
    }

    public static class SymbolManager extends GroupViewManager {
        public SymbolManager() {
            super(SVGClass.RNSVGSymbol);
        }

        @iej(name = "align")
        public void setAlign(SymbolView symbolView, String str) {
            symbolView.setAlign(str);
        }

        @iej(name = "meetOrSlice")
        public void setMeetOrSlice(SymbolView symbolView, int i) {
            symbolView.setMeetOrSlice(i);
        }

        @iej(name = "minX")
        public void setMinX(SymbolView symbolView, float f) {
            symbolView.setMinX(f);
        }

        @iej(name = "minY")
        public void setMinY(SymbolView symbolView, float f) {
            symbolView.setMinY(f);
        }

        @iej(name = "vbHeight")
        public void setVbHeight(SymbolView symbolView, float f) {
            symbolView.setVbHeight(f);
        }

        @iej(name = "vbWidth")
        public void setVbWidth(SymbolView symbolView, float f) {
            symbolView.setVbWidth(f);
        }
    }

    public static class TSpanViewManager extends TextViewManager {
        public TSpanViewManager() {
            super(SVGClass.RNSVGTSpan);
        }

        @iej(name = MiuiCursorConstants.CONTENT)
        public void setContent(TSpanView tSpanView, String str) {
            tSpanView.setContent(str);
        }
    }

    public static class TextPathViewManager extends TextViewManager {
        public TextPathViewManager() {
            super(SVGClass.RNSVGTextPath);
        }

        @iej(name = "href")
        public void setHref(TextPathView textPathView, String str) {
            textPathView.setHref(str);
        }

        @iej(name = "method")
        public void setMethod(TextPathView textPathView, String str) {
            textPathView.setMethod(str);
        }

        @iej(name = "midLine")
        public void setSharp(TextPathView textPathView, String str) {
            textPathView.setSharp(str);
        }

        @iej(name = "side")
        public void setSide(TextPathView textPathView, String str) {
            textPathView.setSide(str);
        }

        @iej(name = "spacing")
        public void setSpacing(TextPathView textPathView, String str) {
            textPathView.setSpacing(str);
        }

        @iej(name = "startOffset")
        public void setStartOffset(TextPathView textPathView, Dynamic dynamic) {
            textPathView.setStartOffset(dynamic);
        }
    }

    public static class TextViewManager extends GroupViewManager {
        public TextViewManager() {
            super(SVGClass.RNSVGText);
        }

        @iej(name = "baselineShift")
        public void setBaselineShift(TextView textView, Dynamic dynamic) {
            textView.setBaselineShift(dynamic);
        }

        @iej(name = "dx")
        public void setDeltaX(TextView textView, Dynamic dynamic) {
            textView.setDeltaX(dynamic);
        }

        @iej(name = "dy")
        public void setDeltaY(TextView textView, Dynamic dynamic) {
            textView.setDeltaY(dynamic);
        }

        @iej(name = SlotType.FONT)
        public void setFont(TextView textView, ReadableMap readableMap) {
            textView.setFont(readableMap);
        }

        @iej(name = "lengthAdjust")
        public void setLengthAdjust(TextView textView, String str) {
            textView.setLengthAdjust(str);
        }

        @iej(name = "alignmentBaseline")
        public void setMethod(TextView textView, String str) {
            textView.setMethod(str);
        }

        @iej(name = "rotate")
        public void setRotate(TextView textView, Dynamic dynamic) {
            textView.setRotate(dynamic);
        }

        @iej(name = "textLength")
        public void setTextLength(TextView textView, Dynamic dynamic) {
            textView.setTextLength(dynamic);
        }

        @iej(name = "verticalAlign")
        public void setVerticalAlign(TextView textView, String str) {
            textView.setVerticalAlign(str);
        }

        @iej(name = "x")
        public void setX(TextView textView, Dynamic dynamic) {
            textView.setPositionX(dynamic);
        }

        @iej(name = "y")
        public void setY(TextView textView, Dynamic dynamic) {
            textView.setPositionY(dynamic);
        }

        public TextViewManager(SVGClass sVGClass) {
            super(sVGClass);
        }
    }

    public static class UseViewManager extends RenderableViewManager {
        public UseViewManager() {
            super(SVGClass.RNSVGUse);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(g9p g9pVar, View view) {
            super.addEventEmitters(g9pVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ oej createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ View createViewInstance(g9p g9pVar) {
            return super.createViewInstance(g9pVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @iej(name = "height")
        public void setHeight(UseView useView, Dynamic dynamic) {
            useView.setHeight(dynamic);
        }

        @iej(name = "href")
        public void setHref(UseView useView, String str) {
            useView.setHref(str);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager
        @iej(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @iej(name = "width")
        public void setWidth(UseView useView, Dynamic dynamic) {
            useView.setWidth(dynamic);
        }

        @iej(name = "x")
        public void setX(UseView useView, Dynamic dynamic) {
            useView.setX(dynamic);
        }

        @iej(name = "y")
        public void setY(UseView useView, Dynamic dynamic) {
            useView.setY(dynamic);
        }
    }

    private static void decomposeMatrix() {
        MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        double[] dArr = matrixDecompositionContext.perspective;
        double[] dArr2 = matrixDecompositionContext.scale;
        double[] dArr3 = matrixDecompositionContext.skew;
        double[] dArr4 = matrixDecompositionContext.translation;
        double[] dArr5 = matrixDecompositionContext.rotationDegrees;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 4, 4);
        double[] dArr7 = new double[16];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                double[] dArr8 = sTransformDecompositionArray;
                int i3 = (i * 4) + i2;
                double d = dArr8[i3] / dArr8[15];
                dArr6[i][i2] = d;
                if (i2 == 3) {
                    d = 0.0d;
                }
                dArr7[i3] = d;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(a.m(dArr7))) {
            return;
        }
        if (isZero(dArr6[0][3]) && isZero(dArr6[1][3]) && isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            a.q(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, a.t(a.n(dArr7)), dArr);
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);
        for (int i4 = 0; i4 < 3; i4++) {
            double[] dArr10 = dArr9[i4];
            double[] dArr11 = dArr6[i4];
            dArr10[0] = dArr11[0];
            dArr10[1] = dArr11[1];
            dArr10[2] = dArr11[2];
        }
        double dX = a.x(dArr9[0]);
        dArr2[0] = dX;
        double[] dArrY = a.y(dArr9[0], dX);
        dArr9[0] = dArrY;
        double dW = a.w(dArrY, dArr9[1]);
        dArr3[0] = dW;
        double[] dArrU = a.u(dArr9[1], dArr9[0], 1.0d, -dW);
        dArr9[1] = dArrU;
        double dW2 = a.w(dArr9[0], dArrU);
        dArr3[0] = dW2;
        double[] dArrU2 = a.u(dArr9[1], dArr9[0], 1.0d, -dW2);
        dArr9[1] = dArrU2;
        double dX2 = a.x(dArrU2);
        dArr2[1] = dX2;
        dArr9[1] = a.y(dArr9[1], dX2);
        dArr3[0] = dArr3[0] / dArr2[1];
        double dW3 = a.w(dArr9[0], dArr9[2]);
        dArr3[1] = dW3;
        double[] dArrU3 = a.u(dArr9[2], dArr9[0], 1.0d, -dW3);
        dArr9[2] = dArrU3;
        double dW4 = a.w(dArr9[1], dArrU3);
        dArr3[2] = dW4;
        double[] dArrU4 = a.u(dArr9[2], dArr9[1], 1.0d, -dW4);
        dArr9[2] = dArrU4;
        double dX3 = a.x(dArrU4);
        dArr2[2] = dX3;
        double[] dArrY2 = a.y(dArr9[2], dX3);
        dArr9[2] = dArrY2;
        double d2 = dArr3[1];
        double d3 = dArr2[2];
        dArr3[1] = d2 / d3;
        dArr3[2] = dArr3[2] / d3;
        if (a.w(dArr9[0], a.v(dArr9[1], dArrY2)) < 0.0d) {
            for (int i5 = 0; i5 < 3; i5++) {
                dArr2[i5] = dArr2[i5] * (-1.0d);
                double[] dArr12 = dArr9[i5];
                dArr12[0] = dArr12[0] * (-1.0d);
                dArr12[1] = dArr12[1] * (-1.0d);
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        double[] dArr13 = dArr9[2];
        dArr5[0] = a.s((-Math.atan2(dArr13[1], dArr13[2])) * 57.29577951308232d);
        double[] dArr14 = dArr9[2];
        double d4 = -dArr14[0];
        double d5 = dArr14[1];
        double d6 = dArr14[2];
        dArr5[1] = a.s((-Math.atan2(d4, Math.sqrt((d5 * d5) + (d6 * d6)))) * 57.29577951308232d);
        dArr5[2] = a.s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(VirtualView virtualView) {
        SvgView svgView = virtualView.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (virtualView instanceof TextView) {
            ((TextView) virtualView).getTextContainer().clearChildCache();
        }
    }

    private static boolean isZero(double d) {
        return !Double.isNaN(d) && Math.abs(d) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(exh.c(0.0f));
        view.setTranslationY(exh.c(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        dyp.b(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        view.setTranslationX(exh.c((float) matrixDecompositionContext.translation[0]));
        view.setTranslationY(exh.c((float) matrixDecompositionContext.translation[1]));
        view.setRotation((float) matrixDecompositionContext.rotationDegrees[2]);
        view.setRotationX((float) matrixDecompositionContext.rotationDegrees[0]);
        view.setRotationY((float) matrixDecompositionContext.rotationDegrees[1]);
        view.setScaleX((float) matrixDecompositionContext.scale[0]);
        view.setScaleY((float) matrixDecompositionContext.scale[1]);
        double[] dArr = matrixDecompositionContext.perspective;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = iz6.e().density;
            view.setCameraDistance(f3 * f3 * f2 * 5.0f);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<RenderableShadowNode> getShadowNodeClass() {
        return RenderableShadowNode.class;
    }

    @iej(name = "clipPath")
    public void setClipPath(VirtualView virtualView, String str) {
        virtualView.setClipPath(str);
    }

    @iej(name = "clipRule")
    public void setClipRule(VirtualView virtualView, int i) {
        virtualView.setClipRule(i);
    }

    @iej(name = "fill")
    public void setFill(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setFill(dynamic);
    }

    @iej(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(RenderableView renderableView, float f) {
        renderableView.setFillOpacity(f);
    }

    @iej(defaultInt = 1, name = "fillRule")
    public void setFillRule(RenderableView renderableView, int i) {
        renderableView.setFillRule(i);
    }

    @iej(name = "mask")
    public void setMask(VirtualView virtualView, String str) {
        virtualView.setMask(str);
    }

    @iej(name = "matrix")
    public void setMatrix(VirtualView virtualView, Dynamic dynamic) {
        virtualView.setMatrix(dynamic);
    }

    @iej(name = "name")
    public void setName(VirtualView virtualView, String str) {
        virtualView.setName(str);
    }

    @iej(name = "propList")
    public void setPropList(RenderableView renderableView, ReadableArray readableArray) {
        renderableView.setPropList(readableArray);
    }

    @iej(name = "responsible")
    public void setResponsible(VirtualView virtualView, boolean z) {
        virtualView.setResponsible(z);
    }

    @iej(name = "stroke")
    public void setStroke(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setStroke(dynamic);
    }

    @iej(name = "strokeDasharray")
    public void setStrokeDasharray(RenderableView renderableView, ReadableArray readableArray) {
        renderableView.setStrokeDasharray(readableArray);
    }

    @iej(name = "strokeDashoffset")
    public void setStrokeDashoffset(RenderableView renderableView, float f) {
        renderableView.setStrokeDashoffset(f);
    }

    @iej(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(RenderableView renderableView, int i) {
        renderableView.setStrokeLinecap(i);
    }

    @iej(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(RenderableView renderableView, int i) {
        renderableView.setStrokeLinejoin(i);
    }

    @iej(defaultFloat = BaseMapView.TRACE_WIDTH, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(RenderableView renderableView, float f) {
        renderableView.setStrokeMiterlimit(f);
    }

    @iej(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(RenderableView renderableView, float f) {
        renderableView.setStrokeOpacity(f);
    }

    @iej(name = "strokeWidth")
    public void setStrokeWidth(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setStrokeWidth(dynamic);
    }

    @iej(name = "transform")
    public void setTransform(VirtualView virtualView, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        if (readableArrayAsArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, readableArrayAsArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @iej(name = "vectorEffect")
    public void setVectorEffect(RenderableView renderableView, int i) {
        renderableView.setVectorEffect(i);
    }

    private RenderableViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, VirtualView virtualView) {
        super.addEventEmitters(g9pVar, virtualView);
        virtualView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.horcrux.svg.RenderableViewManager.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (view instanceof VirtualView) {
                    RenderableViewManager.this.invalidateSvgView((VirtualView) view);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                if (view instanceof VirtualView) {
                    RenderableViewManager.this.invalidateSvgView((VirtualView) view);
                }
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public cbe createShadowNodeInstance() {
        return new RenderableShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(g9p g9pVar) {
        switch (AnonymousClass2.$SwitchMap$com$horcrux$svg$RenderableViewManager$SVGClass[this.svgClass.ordinal()]) {
            case 1:
                return new GroupView(g9pVar);
            case 2:
                return new PathView(g9pVar);
            case 3:
                return new CircleView(g9pVar);
            case 4:
                return new EllipseView(g9pVar);
            case 5:
                return new LineView(g9pVar);
            case 6:
                return new RectView(g9pVar);
            case 7:
                return new TextView(g9pVar);
            case 8:
                return new TSpanView(g9pVar);
            case 9:
                return new TextPathView(g9pVar);
            case 10:
                return new ImageView(g9pVar);
            case 11:
                return new ClipPathView(g9pVar);
            case 12:
                return new DefsView(g9pVar);
            case 13:
                return new UseView(g9pVar);
            case 14:
                return new SymbolView(g9pVar);
            case 15:
                return new LinearGradientView(g9pVar);
            case 16:
                return new RadialGradientView(g9pVar);
            case 17:
                return new PatternView(g9pVar);
            case 18:
                return new MaskView(g9pVar);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @iej(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(VirtualView virtualView, float f) {
        virtualView.setOpacity(f);
    }
}
