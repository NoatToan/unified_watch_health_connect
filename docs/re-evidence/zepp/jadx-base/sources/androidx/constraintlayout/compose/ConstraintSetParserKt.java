package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a \u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u001a \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a(\u0010$\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"H\u0000\u001a \u0010&\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0014H\u0000\u001a \u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u0014H\u0000\u001a(\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*H\u0000\u001a \u0010-\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0000\u001a(\u00100\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0000H\u0002\u001a \u00102\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0000H\u0000\u001a(\u00103\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0000H\u0000\u001a \u00107\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u001a0\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\fH\u0002\u001a\u0010\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\fH\u0002\u001a \u0010<\u001a\u00020:2\u0006\u0010%\u001a\u00020\u00002\u0006\u00106\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u001cH\u0002\u001a\u0019\u0010>\u001a\u0004\u0018\u00010\u000e2\u0006\u0010=\u001a\u00020\fH\u0002¢\u0006\u0004\b>\u0010?\u001a\u0012\u0010@\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\u0000H\u0000\"\u0016\u0010B\u001a\u00020A8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Landroidx/constraintlayout/core/parser/CLObject;", "json", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "parseTransition", "keyPosition", "parseKeyPosition", "keyAttribute", "parseKeyAttribute", "keyCycleData", "parseKeyCycle", "", "content", "", "state", "parseJSON", "Landroidx/constraintlayout/compose/MotionScene;", "scene", "parseMotionSceneJSON", "", "parseConstraintSets", "baseJson", "name", "overrideValue", "override", "parseTransitions", "parseHeader", "Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/compose/LayoutVariables;", "layoutVariables", "parseVariables", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "list", "parseDesignElementsJSON", "element", "parseHelpers", "parseGenerate", "orientation", "margins", "Landroidx/constraintlayout/core/parser/CLArray;", "helper", "parseChain", "parseGuideline", "guidelineId", "params", "parseGuidelineParams", "elementName", "parseBarrier", "parseWidget", "Landroidx/constraintlayout/core/state/ConstraintReference;", "reference", "constraintName", "parseCustomProperties", "parseConstraint", "dimensionString", "Landroidx/constraintlayout/core/state/Dimension;", "parseDimensionMode", "parseDimension", "value", "parseColorString", "(Ljava/lang/String;)Ljava/lang/Integer;", "lookForType", "", "PARSER_DEBUG", "Z", "compose_release"}, k = 2, mv = {1, 5, 1})
public final class ConstraintSetParserKt {
    public static final boolean PARSER_DEBUG = false;

    @Nullable
    public static final String lookForType(@NotNull CLObject cLObject) {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return null;
        }
        Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
        while (it2.hasNext()) {
            if (arrayListNames.get(((IntIterator) it2).nextInt()).equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }

    public static final void override(@NotNull CLObject cLObject, @NotNull String str, @NotNull CLObject cLObject2) throws CLParsingException {
        if (!cLObject.has(str)) {
            cLObject.put(str, cLObject2);
            return;
        }
        CLObject object = cLObject.getObject(str);
        for (String str2 : cLObject2.names()) {
            if (str2.equals("clear")) {
                CLArray array = cLObject2.getArray("clear");
                Iterator<Integer> it2 = e.until(0, array.size()).iterator();
                while (it2.hasNext()) {
                    String stringOrNull = array.getStringOrNull(((IntIterator) it2).nextInt());
                    if (stringOrNull != null) {
                        int iHashCode = stringOrNull.hashCode();
                        if (iHashCode != -1727069561) {
                            if (iHashCode != -1606703562) {
                                if (iHashCode == 414334925 && stringOrNull.equals("dimensions")) {
                                    object.remove(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                                    object.remove("height");
                                } else {
                                    object.remove(stringOrNull);
                                }
                            } else if (stringOrNull.equals("constraints")) {
                                object.remove("start");
                                object.remove("end");
                                object.remove("top");
                                object.remove("bottom");
                                object.remove("baseline");
                                object.remove(b.m0);
                                object.remove("centerHorizontally");
                                object.remove("centerVertically");
                            } else {
                                object.remove(stringOrNull);
                            }
                        } else if (stringOrNull.equals("transforms")) {
                            object.remove("visibility");
                            object.remove("alpha");
                            object.remove("pivotX");
                            object.remove("pivotY");
                            object.remove("rotationX");
                            object.remove("rotationY");
                            object.remove("rotationZ");
                            object.remove("scaleX");
                            object.remove("scaleY");
                            object.remove("translationX");
                            object.remove("translationY");
                        } else {
                            object.remove(stringOrNull);
                        }
                    }
                }
            } else {
                object.put(str2, cLObject2.get(str2));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void parseBarrier(@NotNull State state, @NotNull String str, @NotNull CLObject cLObject) {
        CLArray arrayOrNull;
        int size;
        String string;
        BarrierReference barrierReferenceBarrier = state.barrier(str, androidx.constraintlayout.core.state.State.Direction.END);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
        while (it2.hasNext()) {
            String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -1081309778) {
                    if (iHashCode != -962590849) {
                        if (iHashCode == -567445985 && str2.equals(SearchCriteria.CONTAINS) && (arrayOrNull = cLObject.getArrayOrNull(str2)) != null && (size = arrayOrNull.size()) > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                barrierReferenceBarrier.add(state.constraints(arrayOrNull.get(i).content()));
                                if (i2 >= size) {
                                    break;
                                } else {
                                    i = i2;
                                }
                            }
                        }
                    } else if (str2.equals("direction") && (string = cLObject.getString(str2)) != null) {
                        switch (string.hashCode()) {
                            case -1383228885:
                                if (string.equals("bottom")) {
                                    barrierReferenceBarrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.BOTTOM);
                                }
                                break;
                            case 100571:
                                if (string.equals("end")) {
                                    barrierReferenceBarrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.END);
                                }
                                break;
                            case 115029:
                                if (string.equals("top")) {
                                    barrierReferenceBarrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.TOP);
                                }
                                break;
                            case 3317767:
                                if (string.equals("left")) {
                                    barrierReferenceBarrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.LEFT);
                                }
                                break;
                            case 108511772:
                                if (string.equals("right")) {
                                    barrierReferenceBarrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.RIGHT);
                                }
                                break;
                            case 109757538:
                                if (string.equals("start")) {
                                    barrierReferenceBarrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.START);
                                }
                                break;
                        }
                    }
                } else if (str2.equals("margin")) {
                    float floatOrNaN = cLObject.getFloatOrNaN(str2);
                    if (!Float.isNaN(floatOrNaN)) {
                        barrierReferenceBarrier.margin((int) floatOrNaN);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    public static final void parseChain(int i, @NotNull State state, @NotNull LayoutVariables layoutVariables, @NotNull CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        ArrayList<String> arrayListNames;
        String strContent;
        ChainReference chainReferenceHorizontalChain = i == 0 ? state.horizontalChain() : state.verticalChain();
        CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray2 = (CLArray) cLElement;
            if (cLArray2.size() < 1) {
                return;
            }
            Iterator<Integer> it2 = e.until(0, cLArray2.size()).iterator();
            while (it2.hasNext()) {
                chainReferenceHorizontalChain.add(cLArray2.getString(((IntIterator) it2).nextInt()));
            }
            if (cLArray.size() > 2) {
                CLElement cLElement2 = cLArray.get(2);
                if ((cLElement2 instanceof CLObject) && (arrayListNames = (cLObject = (CLObject) cLElement2).names()) != null) {
                    Iterator<Integer> it3 = e.until(0, arrayListNames.size()).iterator();
                    while (it3.hasNext()) {
                        String str = arrayListNames.get(((IntIterator) it3).nextInt());
                        if (Intrinsics.areEqual(str, "style")) {
                            CLElement cLElement3 = cLObject.get(str);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement3;
                                if (cLArray3.size() > 1) {
                                    strContent = cLArray3.getString(0);
                                    chainReferenceHorizontalChain.bias(cLArray3.getFloat(1));
                                } else {
                                    strContent = cLElement3.content();
                                }
                            } else {
                                strContent = cLElement3.content();
                            }
                            if (Intrinsics.areEqual(strContent, "packed")) {
                                chainReferenceHorizontalChain.style(androidx.constraintlayout.core.state.State.Chain.PACKED);
                            } else if (Intrinsics.areEqual(strContent, "spread_inside")) {
                                chainReferenceHorizontalChain.style(androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE);
                            } else {
                                chainReferenceHorizontalChain.style(androidx.constraintlayout.core.state.State.Chain.SPREAD);
                            }
                        } else {
                            Objects.requireNonNull(chainReferenceHorizontalChain, "null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference");
                            parseConstraint(state, layoutVariables, cLObject, chainReferenceHorizontalChain, str);
                        }
                    }
                }
            }
        }
    }

    private static final Integer parseColorString(String str) {
        if (!StringsKt__StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            return null;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = Intrinsics.stringPlus("FF", strSubstring);
        }
        return Integer.valueOf((int) Long.parseLong(strSubstring, 16));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull == null || arrayOrNull.size() <= 1) {
            String stringOrNull = cLObject.getStringOrNull(str);
            if (stringOrNull != null) {
                ConstraintReference constraintReferenceConstraints = stringOrNull.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(stringOrNull);
                switch (str.hashCode()) {
                    case -1720785339:
                        if (str.equals("baseline")) {
                            state.baselineNeededFor$compose_release(constraintReference.getKey());
                            state.baselineNeededFor$compose_release(constraintReferenceConstraints.getKey());
                            constraintReference.baselineToBaseline(constraintReferenceConstraints);
                            break;
                        }
                        break;
                    case -1383228885:
                        if (str.equals("bottom")) {
                            constraintReference.bottomToBottom(constraintReferenceConstraints);
                            break;
                        }
                        break;
                    case 100571:
                        if (str.equals("end")) {
                            constraintReference.endToEnd(constraintReferenceConstraints);
                            break;
                        }
                        break;
                    case 115029:
                        if (str.equals("top")) {
                            constraintReference.topToTop(constraintReferenceConstraints);
                            break;
                        }
                        break;
                    case 109757538:
                        if (str.equals("start")) {
                            constraintReference.startToStart(constraintReferenceConstraints);
                            break;
                        }
                        break;
                }
                return;
            }
            return;
        }
        String string = arrayOrNull.getString(0);
        String stringOrNull2 = arrayOrNull.getStringOrNull(1);
        float fConvertDimension = arrayOrNull.size() > 2 ? state.convertDimension(Dp.m2963boximpl(Dp.m2965constructorimpl(layoutVariables.get(arrayOrNull.getOrNull(2))))) : 0.0f;
        float fConvertDimension2 = arrayOrNull.size() > 3 ? state.convertDimension(Dp.m2963boximpl(Dp.m2965constructorimpl(layoutVariables.get(arrayOrNull.getOrNull(3))))) : 0.0f;
        ConstraintReference constraintReferenceConstraints2 = string.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string);
        float f = fConvertDimension2;
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline") && stringOrNull2 != null) {
                    int iHashCode = stringOrNull2.hashCode();
                    if (iHashCode == -1720785339) {
                        if (stringOrNull2.equals("baseline")) {
                            state.baselineNeededFor$compose_release(constraintReference.getKey());
                            state.baselineNeededFor$compose_release(constraintReferenceConstraints2.getKey());
                            constraintReference.baselineToBaseline(constraintReferenceConstraints2);
                        }
                    } else if (iHashCode == -1383228885) {
                        if (stringOrNull2.equals("bottom")) {
                            state.baselineNeededFor$compose_release(constraintReference.getKey());
                            state.baselineNeededFor$compose_release(constraintReferenceConstraints2.getKey());
                            constraintReference.baselineToBottom(constraintReferenceConstraints2);
                        }
                    } else if (iHashCode == 115029 && stringOrNull2.equals("top")) {
                        state.baselineNeededFor$compose_release(constraintReference.getKey());
                        state.baselineNeededFor$compose_release(constraintReferenceConstraints2.getKey());
                        constraintReference.baselineToTop(constraintReferenceConstraints2);
                    }
                }
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    constraintReference.circularConstraint(constraintReferenceConstraints2, layoutVariables.get(arrayOrNull.get(1)), 0.0f);
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    if (Intrinsics.areEqual(stringOrNull2, "top")) {
                        constraintReference.bottomToTop(constraintReferenceConstraints2);
                    } else if (Intrinsics.areEqual(stringOrNull2, "bottom")) {
                        constraintReference.bottomToBottom(constraintReferenceConstraints2);
                    }
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    if (Intrinsics.areEqual(stringOrNull2, "start")) {
                        constraintReference.endToStart(constraintReferenceConstraints2);
                    } else if (Intrinsics.areEqual(stringOrNull2, "end")) {
                        constraintReference.endToEnd(constraintReferenceConstraints2);
                    }
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    if (Intrinsics.areEqual(stringOrNull2, "top")) {
                        constraintReference.topToTop(constraintReferenceConstraints2);
                    } else if (Intrinsics.areEqual(stringOrNull2, "bottom")) {
                        constraintReference.topToBottom(constraintReferenceConstraints2);
                    }
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    if (Intrinsics.areEqual(stringOrNull2, "left")) {
                        constraintReference.leftToLeft(constraintReferenceConstraints2);
                    } else if (Intrinsics.areEqual(stringOrNull2, "right")) {
                        constraintReference.leftToRight(constraintReferenceConstraints2);
                    }
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    if (Intrinsics.areEqual(stringOrNull2, "left")) {
                        constraintReference.rightToLeft(constraintReferenceConstraints2);
                    } else if (Intrinsics.areEqual(stringOrNull2, "right")) {
                        constraintReference.rightToRight(constraintReferenceConstraints2);
                    }
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    if (Intrinsics.areEqual(stringOrNull2, "start")) {
                        constraintReference.startToStart(constraintReferenceConstraints2);
                    } else if (Intrinsics.areEqual(stringOrNull2, "end")) {
                        constraintReference.startToEnd(constraintReferenceConstraints2);
                    }
                }
                break;
        }
        constraintReference.margin(Float.valueOf(fConvertDimension)).marginGone((int) f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    public static final void parseConstraintSets(@NotNull MotionScene motionScene, @NotNull Object obj) throws CLParsingException {
        CLObject cLObject;
        ArrayList<String> arrayListNames;
        String constraintSet;
        if ((obj instanceof CLObject) && (arrayListNames = (cLObject = (CLObject) obj).names()) != null) {
            Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
            while (it2.hasNext()) {
                String str = arrayListNames.get(((IntIterator) it2).nextInt());
                CLObject object = cLObject.getObject(str);
                String stringOrNull = object.getStringOrNull("Extends");
                boolean z = true;
                if (stringOrNull == null) {
                    z = false;
                } else {
                    if (!(stringOrNull.length() > 0) || (constraintSet = motionScene.getConstraintSet(stringOrNull)) == null) {
                        z = false;
                    } else {
                        CLObject cLObject2 = CLParser.parse(constraintSet);
                        ArrayList<String> arrayListNames2 = object.names();
                        if (arrayListNames2 != null) {
                            Iterator<Integer> it3 = e.until(0, arrayListNames2.size()).iterator();
                            while (it3.hasNext()) {
                                String str2 = arrayListNames2.get(((IntIterator) it3).nextInt());
                                CLElement cLElement = object.get(str2);
                                if (cLElement instanceof CLObject) {
                                    override(cLObject2, str2, (CLObject) cLElement);
                                }
                            }
                            motionScene.setConstraintSetContent(str, cLObject2.toJSON());
                        } else {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    motionScene.setConstraintSetContent(str, object.toJSON());
                }
            }
        }
    }

    private static final void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ArrayList<String> arrayListNames;
        Integer colorString;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (arrayListNames = objectOrNull.names()) == null) {
            return;
        }
        Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
        while (it2.hasNext()) {
            String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
            CLElement cLElement = objectOrNull.get(str2);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(str2, cLElement.getFloat());
            } else if ((cLElement instanceof CLString) && (colorString = parseColorString(cLElement.content())) != null) {
                constraintReference.addCustomColor(str2, colorString.intValue());
            }
        }
    }

    public static final void parseDesignElementsJSON(@NotNull String str, @NotNull ArrayList<DesignElement> arrayList) throws CLParsingException {
        CLObject cLObject = CLParser.parse(str);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        int i = 0;
        Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
        while (it2.hasNext()) {
            String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
            CLElement cLElement = cLObject.get(str2);
            if (Intrinsics.areEqual(str2, "Design")) {
                Objects.requireNonNull(cLElement, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                CLObject cLObject2 = (CLObject) cLElement;
                ArrayList<String> arrayListNames2 = cLObject2.names();
                if (arrayListNames2 == null) {
                    return;
                }
                Iterator<Integer> it3 = e.until(i, arrayListNames2.size()).iterator();
                while (it3.hasNext()) {
                    String str3 = arrayListNames2.get(((IntIterator) it3).nextInt());
                    CLElement cLElement2 = cLObject2.get(str3);
                    Objects.requireNonNull(cLElement2, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                    CLObject cLObject3 = (CLObject) cLElement2;
                    System.out.printf("element found <" + ((Object) str3) + Typography.greater, new Object[i]);
                    String stringOrNull = cLObject3.getStringOrNull("type");
                    if (stringOrNull != null) {
                        HashMap map = new HashMap();
                        int size = cLObject3.size() - 1;
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                CLElement cLElement3 = cLObject3.get(i2);
                                Objects.requireNonNull(cLElement3, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                                CLKey cLKey = (CLKey) cLElement3;
                                String strContent = cLKey.content();
                                CLElement value = cLKey.getValue();
                                String strContent2 = value == null ? null : value.content();
                                if (strContent2 != null) {
                                    map.put(strContent, strContent2);
                                }
                                if (i2 == size) {
                                    break;
                                } else {
                                    i2 = i3;
                                }
                            }
                        }
                        arrayList.add(new DesignElement(str3, stringOrNull, map));
                    }
                    i = 0;
                }
            }
            i = 0;
        }
    }

    private static final androidx.constraintlayout.core.state.Dimension parseDimension(CLObject cLObject, String str, State state) throws CLParsingException {
        CLElement cLElement = cLObject.get(str);
        androidx.constraintlayout.core.state.Dimension dimensionFixed = androidx.constraintlayout.core.state.Dimension.Fixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return androidx.constraintlayout.core.state.Dimension.Fixed(state.convertDimension(Dp.m2963boximpl(Dp.m2965constructorimpl(cLObject.getFloat(str)))));
        }
        if (!(cLElement instanceof CLObject)) {
            return dimensionFixed;
        }
        CLObject cLObject2 = (CLObject) cLElement;
        String stringOrNull = cLObject2.getStringOrNull("value");
        if (stringOrNull != null) {
            dimensionFixed = parseDimensionMode(stringOrNull);
        }
        CLElement orNull = cLObject2.getOrNull("min");
        if (orNull != null) {
            if (orNull instanceof CLNumber) {
                dimensionFixed.min(state.convertDimension(Dp.m2963boximpl(Dp.m2965constructorimpl(orNull.getFloat()))));
            } else if (orNull instanceof CLString) {
                dimensionFixed.min(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
            }
        }
        CLElement orNull2 = cLObject2.getOrNull("max");
        if (orNull2 == null) {
            return dimensionFixed;
        }
        if (orNull2 instanceof CLNumber) {
            dimensionFixed.max(state.convertDimension(Dp.m2963boximpl(Dp.m2965constructorimpl(orNull2.getFloat()))));
            return dimensionFixed;
        }
        if (!(orNull2 instanceof CLString)) {
            return dimensionFixed;
        }
        dimensionFixed.max(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionFixed;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final androidx.constraintlayout.core.state.Dimension parseDimensionMode(String str) {
        androidx.constraintlayout.core.state.Dimension dimensionFixed = androidx.constraintlayout.core.state.Dimension.Fixed(0);
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    return androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    return androidx.constraintlayout.core.state.Dimension.Parent();
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    return androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    return androidx.constraintlayout.core.state.Dimension.Wrap();
                }
                break;
        }
        if (StringsKt__StringsKt.endsWith$default((CharSequence) str, '%', false, 2, (Object) null)) {
            return androidx.constraintlayout.core.state.Dimension.Percent(0, Float.parseFloat(StringsKt__StringsKt.substringBefore$default(str, '%', (String) null, 2, (Object) null)) / 100.0f).suggested(0);
        }
        return StringsKt__StringsKt.contains$default((CharSequence) str, JsonLexerKt.COLON, false, 2, (Object) null) ? androidx.constraintlayout.core.state.Dimension.Ratio(str).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION) : dimensionFixed;
    }

    public static final void parseGenerate(@NotNull State state, @NotNull LayoutVariables layoutVariables, @NotNull Object obj) throws CLParsingException {
        CLObject cLObject;
        ArrayList<String> arrayListNames;
        if ((obj instanceof CLObject) && (arrayListNames = (cLObject = (CLObject) obj).names()) != null) {
            Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
            while (it2.hasNext()) {
                String str = arrayListNames.get(((IntIterator) it2).nextInt());
                CLElement cLElement = cLObject.get(str);
                ArrayList<String> list = layoutVariables.getList(str);
                if (list != null && (cLElement instanceof CLObject)) {
                    Iterator<String> it3 = list.iterator();
                    while (it3.hasNext()) {
                        parseWidget(state, layoutVariables, it3.next(), (CLObject) cLElement);
                    }
                }
            }
        }
    }

    public static final void parseGuideline(int i, @NotNull State state, @NotNull CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) != null) {
            parseGuidelineParams(i, state, stringOrNull, cLObject);
        }
    }

    private static final void parseGuidelineParams(int i, State state, String str, CLObject cLObject) {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        ConstraintReference constraintReferenceConstraints = state.constraints(str);
        if (i == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        Facade facade = constraintReferenceConstraints.getFacade();
        Objects.requireNonNull(facade, "null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.GuidelineReference");
        GuidelineReference guidelineReference = (GuidelineReference) facade;
        Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
        while (it2.hasNext()) {
            String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -678927291) {
                    if (iHashCode != 100571) {
                        if (iHashCode == 109757538 && str2.equals("start")) {
                            guidelineReference.start(Integer.valueOf(state.convertDimension(Dp.m2963boximpl(Dp.m2965constructorimpl(cLObject.getFloat(str2))))));
                        }
                    } else if (str2.equals("end")) {
                        guidelineReference.end(Integer.valueOf(state.convertDimension(Dp.m2963boximpl(Dp.m2965constructorimpl(cLObject.getFloat(str2))))));
                    }
                } else if (str2.equals("percent")) {
                    guidelineReference.percent(cLObject.getFloat(str2));
                }
            }
        }
    }

    public static final void parseHeader(@NotNull MotionScene motionScene, @NotNull Object obj) {
        String stringOrNull;
        if ((obj instanceof CLObject) && (stringOrNull = ((CLObject) obj).getStringOrNull("export")) != null) {
            motionScene.setDebugName(stringOrNull);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void parseHelpers(@NotNull State state, @NotNull LayoutVariables layoutVariables, @NotNull Object obj) throws CLParsingException {
        String string;
        if (obj instanceof CLArray) {
            CLArray cLArray = (CLArray) obj;
            Iterator<Integer> it2 = e.until(0, cLArray.size()).iterator();
            while (it2.hasNext()) {
                CLElement cLElement = cLArray.get(((IntIterator) it2).nextInt());
                if (cLElement instanceof CLArray) {
                    CLArray cLArray2 = (CLArray) cLElement;
                    if (cLArray2.size() > 1 && (string = cLArray2.getString(0)) != null) {
                        switch (string.hashCode()) {
                            case -1785507558:
                                if (string.equals("vGuideline")) {
                                    parseGuideline(1, state, cLArray2);
                                }
                                break;
                            case -1252464839:
                                if (string.equals("hChain")) {
                                    parseChain(0, state, layoutVariables, cLArray2);
                                }
                                break;
                            case -851656725:
                                if (string.equals("vChain")) {
                                    parseChain(1, state, layoutVariables, cLArray2);
                                }
                                break;
                            case 965681512:
                                if (string.equals("hGuideline")) {
                                    parseGuideline(0, state, cLArray2);
                                }
                                break;
                        }
                    }
                }
            }
        }
    }

    public static final void parseJSON(@NotNull String str, @NotNull androidx.constraintlayout.core.state.Transition transition, int i) {
        CLObject objectOrNull;
        Integer colorString;
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
            while (it2.hasNext()) {
                String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
                CLElement cLElement = cLObject.get(str2);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                    ArrayList<String> arrayListNames2 = objectOrNull.names();
                    if (arrayListNames2 == null) {
                        return;
                    }
                    Iterator<Integer> it3 = e.until(0, arrayListNames2.size()).iterator();
                    while (it3.hasNext()) {
                        String str3 = arrayListNames2.get(((IntIterator) it3).nextInt());
                        CLElement cLElement2 = objectOrNull.get(str3);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i, str2, str3, cLElement2.getFloat());
                        } else if ((cLElement2 instanceof CLString) && (colorString = parseColorString(cLElement2.content())) != null) {
                            transition.addCustomColor(i, str2, str3, colorString.intValue());
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }

    public static final void parseKeyAttribute(@NotNull CLObject cLObject, @NotNull androidx.constraintlayout.core.state.Transition transition) throws CLParsingException {
        CLArray arrayOrNull;
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("target");
        if (arrayOrNull2 == null || (arrayOrNull = cLObject.getArrayOrNull("frames")) == null) {
            return;
        }
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf("scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha");
        ArrayList arrayListArrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf(311, 312, 304, 305, 306, 308, 309, 310, 303);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = e.until(0, arrayOrNull.size()).iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            arrayList.add(new TypedBundle());
        }
        int size = arrayListArrayListOf.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String str = (String) arrayListArrayListOf.get(i);
                int iIntValue = ((Number) arrayListArrayListOf2.get(i)).intValue();
                CLArray arrayOrNull3 = cLObject.getArrayOrNull(str);
                if (arrayOrNull3 != null && arrayOrNull3.size() != arrayList.size()) {
                    throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
                }
                if (arrayOrNull3 != null) {
                    Iterator<Integer> it3 = e.until(0, arrayList.size()).iterator();
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        ((TypedBundle) arrayList.get(iNextInt)).add(iIntValue, arrayOrNull3.getFloat(iNextInt));
                    }
                } else {
                    float floatOrNaN = cLObject.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        Iterator<Integer> it4 = e.until(0, arrayList.size()).iterator();
                        while (it4.hasNext()) {
                            ((TypedBundle) arrayList.get(((IntIterator) it4).nextInt())).add(iIntValue, floatOrNaN);
                        }
                    }
                }
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        Iterator<Integer> it5 = e.until(0, arrayOrNull2.size()).iterator();
        while (it5.hasNext()) {
            int iNextInt2 = ((IntIterator) it5).nextInt();
            Iterator<Integer> it6 = e.until(0, arrayList.size()).iterator();
            while (it6.hasNext()) {
                int iNextInt3 = ((IntIterator) it6).nextInt();
                String string = arrayOrNull2.getString(iNextInt2);
                TypedBundle typedBundle = (TypedBundle) arrayList.get(iNextInt3);
                if (stringOrNull2 != null) {
                    if (Intrinsics.areEqual(stringOrNull2, "spline")) {
                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 0);
                    } else if (Intrinsics.areEqual(stringOrNull2, "linear")) {
                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 1);
                    }
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                typedBundle.add(100, arrayOrNull.getInt(iNextInt3));
                transition.addKeyAttribute(string, typedBundle);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0201  */
    /* JADX WARN: Code duplicated, block: B:52:0x0208  */
    /* JADX WARN: Code duplicated, block: B:64:0x020d A[SYNTHETIC] */
    public static final void parseKeyCycle(@NotNull CLObject cLObject, @NotNull androidx.constraintlayout.core.state.Transition transition) throws CLParsingException {
        CLArray cLArray;
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray("frames");
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf("scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", TypedValues.CycleType.S_WAVE_PERIOD, "offset", TypedValues.CycleType.S_WAVE_PHASE);
        ArrayList arrayListArrayListOf2 = CollectionsKt__CollectionsKt.arrayListOf(311, 312, 304, 305, 306, 308, 309, 310, 403, Integer.valueOf(TypedValues.CycleType.TYPE_WAVE_PERIOD), 424, 425);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = e.until(0, array2.size()).iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            arrayList.add(new TypedBundle());
        }
        int size = arrayListArrayListOf.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String str = (String) arrayListArrayListOf.get(i);
                int iIntValue = ((Number) arrayListArrayListOf2.get(i)).intValue();
                CLArray arrayOrNull = cLObject.getArrayOrNull(str);
                if (arrayOrNull != null && arrayOrNull.size() != arrayList.size()) {
                    throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
                }
                if (arrayOrNull != null) {
                    Iterator<Integer> it3 = e.until(0, arrayList.size()).iterator();
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        ((TypedBundle) arrayList.get(iNextInt)).add(iIntValue, arrayOrNull.getFloat(iNextInt));
                    }
                } else {
                    float floatOrNaN = cLObject.getFloatOrNaN(str);
                    if (!Float.isNaN(floatOrNaN)) {
                        Iterator<Integer> it4 = e.until(0, arrayList.size()).iterator();
                        while (it4.hasNext()) {
                            ((TypedBundle) arrayList.get(((IntIterator) it4).nextInt())).add(iIntValue, floatOrNaN);
                        }
                    }
                }
                if (i == size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        String stringOrNull3 = cLObject.getStringOrNull("easing");
        String stringOrNull4 = cLObject.getStringOrNull("waveShape");
        String stringOrNull5 = cLObject.getStringOrNull(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE);
        Iterator<Integer> it5 = e.until(0, array.size()).iterator();
        while (it5.hasNext()) {
            int iNextInt2 = ((IntIterator) it5).nextInt();
            Iterator<Integer> it6 = e.until(0, arrayList.size()).iterator();
            while (it6.hasNext()) {
                int iNextInt3 = ((IntIterator) it6).nextInt();
                String string = array.getString(iNextInt2);
                TypedBundle typedBundle = (TypedBundle) arrayList.get(iNextInt3);
                if (stringOrNull2 != null) {
                    cLArray = array;
                    if (Intrinsics.areEqual(stringOrNull2, "spline")) {
                        typedBundle.add(401, 0);
                    } else {
                        if (Intrinsics.areEqual(stringOrNull2, "linear")) {
                            typedBundle.add(401, 1);
                        }
                        typedBundle.addIfNotNull(501, stringOrNull);
                        if (stringOrNull3 != null) {
                            typedBundle.add(420, stringOrNull3);
                        }
                        if (stringOrNull4 != null) {
                            typedBundle.add(421, stringOrNull4);
                        }
                        if (stringOrNull5 != null) {
                            typedBundle.add(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, stringOrNull5);
                        }
                        typedBundle.add(100, array2.getInt(iNextInt3));
                        transition.addKeyCycle(string, typedBundle);
                        array = cLArray;
                    }
                } else {
                    cLArray = array;
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                if (stringOrNull3 != null) {
                    typedBundle.add(420, stringOrNull3);
                }
                if (stringOrNull4 != null) {
                    typedBundle.add(421, stringOrNull4);
                }
                if (stringOrNull5 != null) {
                    typedBundle.add(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, stringOrNull5);
                }
                typedBundle.add(100, array2.getInt(iNextInt3));
                transition.addKeyCycle(string, typedBundle);
                array = cLArray;
            }
            array = array;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void parseKeyPosition(@NotNull CLObject cLObject, @NotNull androidx.constraintlayout.core.state.Transition transition) throws CLParsingException {
        int i;
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = cLObject.getArray("target");
        CLArray array2 = cLObject.getArray("frames");
        CLArray arrayOrNull = cLObject.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = cLObject.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = cLObject.getArrayOrNull("percentHeight");
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = cLObject.getStringOrNull("transitionEasing");
        String stringOrNull3 = cLObject.getStringOrNull("curveFit");
        String stringOrNull4 = cLObject.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull == null || array2.size() == arrayOrNull.size()) {
            if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
                Iterator<Integer> it2 = e.until(0, array.size()).iterator();
                while (it2.hasNext()) {
                    String string = array.getString(((IntIterator) it2).nextInt());
                    typedBundle.clear();
                    int iHashCode = stringOrNull4.hashCode();
                    CLArray cLArray = array;
                    if (iHashCode == -1740452335) {
                        i = !stringOrNull4.equals("pathRelative") ? 0 : 1;
                    } else if (iHashCode == -960240988) {
                        stringOrNull4.equals("deltaRelative");
                    } else if (iHashCode == 1700994454 && stringOrNull4.equals("parentRelative")) {
                        i = 2;
                    }
                    typedBundle.add(510, i);
                    if (stringOrNull3 != null) {
                        if (Intrinsics.areEqual(stringOrNull3, "spline")) {
                            typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 0);
                        } else if (Intrinsics.areEqual(stringOrNull3, "linear")) {
                            typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, 1);
                        }
                    }
                    typedBundle.addIfNotNull(501, stringOrNull2);
                    if (stringOrNull != null) {
                        switch (stringOrNull.hashCode()) {
                            case -1857024520:
                                if (stringOrNull.equals("startVertical")) {
                                    typedBundle.add(509, 1);
                                }
                                break;
                            case -1007052250:
                                if (stringOrNull.equals("startHorizontal")) {
                                    typedBundle.add(509, 2);
                                }
                                break;
                            case 3145837:
                                if (stringOrNull.equals("flip")) {
                                    typedBundle.add(509, 3);
                                }
                                break;
                            case 3387192:
                                if (stringOrNull.equals("none")) {
                                    typedBundle.add(509, 0);
                                }
                                break;
                        }
                    }
                    Iterator<Integer> it3 = e.until(0, array2.size()).iterator();
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        String str = stringOrNull4;
                        typedBundle.add(100, array2.getInt(iNextInt));
                        if (arrayOrNull != null) {
                            typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, arrayOrNull.getFloat(iNextInt));
                        }
                        if (arrayOrNull2 != null) {
                            typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_Y, arrayOrNull2.getFloat(iNextInt));
                        }
                        if (arrayOrNull3 != null) {
                            typedBundle.add(503, arrayOrNull3.getFloat(iNextInt));
                        }
                        if (arrayOrNull4 != null) {
                            typedBundle.add(504, arrayOrNull4.getFloat(iNextInt));
                        }
                        transition.addKeyPosition(string, typedBundle);
                        stringOrNull4 = str;
                    }
                    stringOrNull4 = stringOrNull4;
                    array = cLArray;
                }
            }
        }
    }

    public static final void parseMotionSceneJSON(@NotNull MotionScene motionScene, @NotNull String str) {
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
            while (it2.hasNext()) {
                String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
                CLElement cLElement = cLObject.get(str2);
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -2137403731) {
                        if (iHashCode != -241441378) {
                            if (iHashCode == 1101852654 && str2.equals("ConstraintSets")) {
                                parseConstraintSets(motionScene, cLElement);
                            }
                        } else if (str2.equals("Transitions")) {
                            parseTransitions(motionScene, cLElement);
                        }
                    } else if (str2.equals("Header")) {
                        parseHeader(motionScene, cLElement);
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void parseTransition(@NotNull CLObject cLObject, @NotNull androidx.constraintlayout.core.state.Transition transition) throws CLParsingException {
        boolean z;
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z2 = true;
        if (stringOrNull != null) {
            switch (stringOrNull.hashCode()) {
                case -1857024520:
                    if (stringOrNull.equals("startVertical")) {
                        typedBundle.add(509, 1);
                    }
                    break;
                case -1007052250:
                    if (stringOrNull.equals("startHorizontal")) {
                        typedBundle.add(509, 2);
                    }
                    break;
                case 3145837:
                    if (stringOrNull.equals("flip")) {
                        typedBundle.add(509, 3);
                    }
                    break;
                case 3387192:
                    if (stringOrNull.equals("none")) {
                        typedBundle.add(509, 0);
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
            z = true;
        }
        float floatOrNaN = cLObject.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (Float.isNaN(floatOrNaN)) {
            z2 = z;
        } else {
            typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        }
        if (z2) {
            transition.setTransitionProperties(typedBundle);
        }
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        if (arrayOrNull != null) {
            Iterator<Integer> it2 = e.until(0, arrayOrNull.size()).iterator();
            while (it2.hasNext()) {
                CLElement cLElement = arrayOrNull.get(((IntIterator) it2).nextInt());
                if (cLElement instanceof CLObject) {
                    parseKeyPosition((CLObject) cLElement, transition);
                }
            }
        }
        CLArray arrayOrNull2 = objectOrNull.getArrayOrNull("KeyAttributes");
        if (arrayOrNull2 != null) {
            Iterator<Integer> it3 = e.until(0, arrayOrNull2.size()).iterator();
            while (it3.hasNext()) {
                CLElement cLElement2 = arrayOrNull2.get(((IntIterator) it3).nextInt());
                if (cLElement2 instanceof CLObject) {
                    parseKeyAttribute((CLObject) cLElement2, transition);
                }
            }
        }
        CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
        if (arrayOrNull3 != null) {
            Iterator<Integer> it4 = e.until(0, arrayOrNull3.size()).iterator();
            while (it4.hasNext()) {
                CLElement cLElement3 = arrayOrNull3.get(((IntIterator) it4).nextInt());
                if (cLElement3 instanceof CLObject) {
                    parseKeyCycle((CLObject) cLElement3, transition);
                }
            }
        }
    }

    public static final void parseTransitions(@NotNull MotionScene motionScene, @NotNull Object obj) {
        CLObject cLObject;
        ArrayList<String> arrayListNames;
        if ((obj instanceof CLObject) && (arrayListNames = (cLObject = (CLObject) obj).names()) != null) {
            Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
            while (it2.hasNext()) {
                String str = arrayListNames.get(((IntIterator) it2).nextInt());
                motionScene.setTransitionContent(str, cLObject.getObject(str).toJSON());
            }
        }
    }

    public static final void parseVariables(@NotNull State state, @NotNull LayoutVariables layoutVariables, @NotNull Object obj) throws CLParsingException {
        CLObject cLObject;
        ArrayList<String> arrayListNames;
        if ((obj instanceof CLObject) && (arrayListNames = (cLObject = (CLObject) obj).names()) != null) {
            Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
            while (it2.hasNext()) {
                String str = arrayListNames.get(((IntIterator) it2).nextInt());
                CLElement cLElement = cLObject.get(str);
                if (cLElement instanceof CLNumber) {
                    layoutVariables.put(str, ((CLNumber) cLElement).getInt());
                } else if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    if (cLObject2.has("from") && cLObject2.has("to")) {
                        float f = layoutVariables.get(cLObject2.get("from"));
                        float f2 = layoutVariables.get(cLObject2.get("to"));
                        String stringOrNull = cLObject2.getStringOrNull("prefix");
                        String str2 = stringOrNull == null ? "" : stringOrNull;
                        String stringOrNull2 = cLObject2.getStringOrNull("postfix");
                        layoutVariables.put(str, f, f2, 1.0f, str2, stringOrNull2 == null ? "" : stringOrNull2);
                    } else if (cLObject2.has("from") && cLObject2.has("step")) {
                        layoutVariables.put(str, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("step")));
                    } else if (cLObject2.has("ids")) {
                        CLArray array = cLObject2.getArray("ids");
                        ArrayList<String> arrayList = new ArrayList<>();
                        int size = array.size();
                        if (size > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                arrayList.add(array.getString(i));
                                if (i2 >= size) {
                                    break;
                                } else {
                                    i = i2;
                                }
                            }
                        }
                        layoutVariables.put(str, arrayList);
                    } else if (cLObject2.has("tag")) {
                        layoutVariables.put(str, state.getIdsForTag(cLObject2.getString("tag")));
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void parseWidget(@NotNull State state, @NotNull LayoutVariables layoutVariables, @NotNull String str, @NotNull CLObject cLObject) throws CLParsingException {
        ConstraintReference constraintReferenceConstraints = state.constraints(str);
        if (constraintReferenceConstraints.getWidth() == null) {
            constraintReferenceConstraints.setWidth(androidx.constraintlayout.core.state.Dimension.Wrap());
        }
        if (constraintReferenceConstraints.getHeight() == null) {
            constraintReferenceConstraints.setHeight(androidx.constraintlayout.core.state.Dimension.Wrap());
        }
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
        while (it2.hasNext()) {
            String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1448775240:
                        if (str2.equals("centerVertically")) {
                            String string = cLObject.getString(str2);
                            ConstraintReference constraintReferenceConstraints2 = string.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string);
                            constraintReferenceConstraints.topToTop(constraintReferenceConstraints2);
                            constraintReferenceConstraints.bottomToBottom(constraintReferenceConstraints2);
                        }
                        break;
                    case -1364013995:
                        if (str2.equals(b.m0)) {
                            String string2 = cLObject.getString(str2);
                            ConstraintReference constraintReferenceConstraints3 = string2.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string2);
                            constraintReferenceConstraints.startToStart(constraintReferenceConstraints3);
                            constraintReferenceConstraints.endToEnd(constraintReferenceConstraints3);
                            constraintReferenceConstraints.topToTop(constraintReferenceConstraints3);
                            constraintReferenceConstraints.bottomToBottom(constraintReferenceConstraints3);
                        }
                        break;
                    case -1349088399:
                        if (str2.equals("custom")) {
                            parseCustomProperties(cLObject, constraintReferenceConstraints, str2);
                        }
                        break;
                    case -1249320806:
                        if (str2.equals("rotationX")) {
                            constraintReferenceConstraints.rotationX(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -1249320805:
                        if (str2.equals("rotationY")) {
                            constraintReferenceConstraints.rotationY(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -1249320804:
                        if (str2.equals("rotationZ")) {
                            constraintReferenceConstraints.rotationZ(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -1225497657:
                        if (str2.equals("translationX")) {
                            constraintReferenceConstraints.translationX(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -1225497656:
                        if (str2.equals("translationY")) {
                            constraintReferenceConstraints.translationY(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -1225497655:
                        if (str2.equals("translationZ")) {
                            constraintReferenceConstraints.translationZ(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -1221029593:
                        if (str2.equals("height")) {
                            constraintReferenceConstraints.setHeight(parseDimension(cLObject, str2, state));
                        }
                        break;
                    case -987906986:
                        if (str2.equals("pivotX")) {
                            constraintReferenceConstraints.pivotX(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -987906985:
                        if (str2.equals("pivotY")) {
                            constraintReferenceConstraints.pivotY(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -908189618:
                        if (str2.equals("scaleX")) {
                            constraintReferenceConstraints.scaleX(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -908189617:
                        if (str2.equals("scaleY")) {
                            constraintReferenceConstraints.scaleY(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case -61505906:
                        if (str2.equals("vWeight")) {
                            constraintReferenceConstraints.setVerticalChainWeight(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case 92909918:
                        if (str2.equals("alpha")) {
                            constraintReferenceConstraints.alpha(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case 98116417:
                        if (str2.equals("hBias")) {
                            constraintReferenceConstraints.horizontalBias(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case 111045711:
                        if (str2.equals("vBias")) {
                            constraintReferenceConstraints.verticalBias(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case 113126854:
                        if (str2.equals(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) {
                            constraintReferenceConstraints.setWidth(parseDimension(cLObject, str2, state));
                        }
                        break;
                    case 398344448:
                        if (str2.equals("hWeight")) {
                            constraintReferenceConstraints.setHorizontalChainWeight(layoutVariables.get(cLObject.get(str2)));
                        }
                        break;
                    case 1404070310:
                        if (str2.equals("centerHorizontally")) {
                            String string3 = cLObject.getString(str2);
                            ConstraintReference constraintReferenceConstraints4 = string3.equals("parent") ? state.constraints(androidx.constraintlayout.core.state.State.PARENT) : state.constraints(string3);
                            constraintReferenceConstraints.startToStart(constraintReferenceConstraints4);
                            constraintReferenceConstraints.endToEnd(constraintReferenceConstraints4);
                        }
                        break;
                    case 1941332754:
                        if (str2.equals("visibility")) {
                            String string4 = cLObject.getString(str2);
                            if (string4 != null) {
                                int iHashCode = string4.hashCode();
                                if (iHashCode == -1901805651) {
                                    if (string4.equals("invisible")) {
                                        constraintReferenceConstraints.visibility(4);
                                    }
                                } else if (iHashCode == 3178655) {
                                    if (string4.equals("gone")) {
                                        constraintReferenceConstraints.visibility(8);
                                    }
                                } else if (iHashCode == 466743410 && string4.equals("visible")) {
                                    constraintReferenceConstraints.visibility(0);
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            parseConstraint(state, layoutVariables, cLObject, constraintReferenceConstraints, str2);
        }
    }

    public static final void parseJSON(@NotNull String str, @NotNull State state, @NotNull LayoutVariables layoutVariables) {
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            Iterator<Integer> it2 = e.until(0, arrayListNames.size()).iterator();
            while (it2.hasNext()) {
                String str2 = arrayListNames.get(((IntIterator) it2).nextInt());
                CLElement cLElement = cLObject.get(str2);
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -1824489883) {
                        if (iHashCode != 1875016085) {
                            if (iHashCode == 1921490263 && str2.equals("Variables")) {
                                parseVariables(state, layoutVariables, cLElement);
                            }
                        } else if (str2.equals("Generate")) {
                            parseGenerate(state, layoutVariables, cLElement);
                        }
                    } else if (str2.equals("Helpers")) {
                        parseHelpers(state, layoutVariables, cLElement);
                    }
                }
                if (cLElement instanceof CLObject) {
                    String strLookForType = lookForType((CLObject) cLElement);
                    if (strLookForType != null) {
                        int iHashCode2 = strLookForType.hashCode();
                        if (iHashCode2 != -1785507558) {
                            if (iHashCode2 != -333143113) {
                                if (iHashCode2 == 965681512 && strLookForType.equals("hGuideline")) {
                                    parseGuidelineParams(0, state, str2, (CLObject) cLElement);
                                }
                            } else if (strLookForType.equals("barrier")) {
                                parseBarrier(state, str2, (CLObject) cLElement);
                            }
                        } else if (strLookForType.equals("vGuideline")) {
                            parseGuidelineParams(1, state, str2, (CLObject) cLElement);
                        }
                    } else {
                        parseWidget(state, layoutVariables, str2, (CLObject) cLElement);
                    }
                } else if (cLElement instanceof CLNumber) {
                    layoutVariables.put(str2, ((CLNumber) cLElement).getInt());
                }
            }
        } catch (CLParsingException e) {
            System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
        }
    }
}
