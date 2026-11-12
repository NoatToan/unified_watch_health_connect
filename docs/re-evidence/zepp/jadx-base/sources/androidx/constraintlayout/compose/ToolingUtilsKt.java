package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u000e\u0010\u0012\u001a\u00020\u0007*\u0004\u0018\u00010\u0010H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u001a$\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00130\u0013*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001aB\u0010 \u001a\u00020\u000e*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\"\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"5\u00100\u001a\u00020\"*\u00020'2\u0006\u0010(\u001a\u00020\"8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b)\u0010$\u0012\u0004\b.\u0010/\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\"\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", RootDescription.ROOT_ELEMENT, "Landroidx/constraintlayout/compose/State;", "state", "", "startX", "startY", "", "parseConstraintsToJson", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperWidget", "", "helperReferences", "rootId", "", "addReferencesIds", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "getHelperId", "getRefId", "Lorg/json/JSONObject;", "content", "createDesignInfoJson", "kotlin.jvm.PlatformType", "boundsToJson", "viewId", "boxJson", "", "isHelper", "isRoot", "", "Lorg/json/JSONArray;", "constraintsInfoArray", "putViewIdToBoundsAndConstraints", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "<set-?>", "designInfoProvider$delegate", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "designInfoProvider", "CONSTRAINTS_JSON_VERSION", LogUtil.I, "compose_release"}, k = 2, mv = {1, 5, 1})
public final class ToolingUtilsKt {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(ToolingUtilsKt.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
    private static final int CONSTRAINTS_JSON_VERSION = 1;

    @NotNull
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey;

    @NotNull
    private static final SemanticsPropertyKey designInfoProvider$delegate;

    static {
        SemanticsPropertyKey<DesignInfoProvider> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);
        DesignInfoDataKey = semanticsPropertyKey;
        designInfoProvider$delegate = semanticsPropertyKey;
    }

    private static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        int i = helperWidget.mWidgetsCount;
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            ConstraintWidget constraintWidget = helperWidget.mWidgets[i2];
            list.add(Intrinsics.areEqual(constraintWidget, constraintWidgetContainer) ? str : getRefId(constraintWidget));
            if (i3 >= i) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    private static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i, int i2) {
        return new JSONObject().put("left", constraintWidget.getLeft() + i).put("top", constraintWidget.getTop() + i2).put("right", constraintWidget.getRight() + i).put("bottom", constraintWidget.getBottom() + i2);
    }

    private static final String createDesignInfoJson(JSONObject jSONObject) {
        return new JSONObject().put("type", "CONSTRAINTS").put("version", 1).put("content", jSONObject).toString();
    }

    @NotNull
    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    @NotNull
    public static final DesignInfoProvider getDesignInfoProvider(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (DesignInfoProvider) designInfoProvider$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @PublishedApi
    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    private static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        return String.valueOf(state.getKeyId$compose_release((HelperWidget) constraintWidget));
    }

    private static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        Object companionWidget = constraintWidget == null ? null : constraintWidget.getCompanionWidget();
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        String string = (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null) ? null : layoutId.toString();
        if (string == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return string;
    }

    @NotNull
    public static final String parseConstraintsToJson(@NotNull ConstraintWidgetContainer constraintWidgetContainer, @NotNull State state, int i, int i2) throws JSONException {
        String strValueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject = new JSONObject();
        Iterator it2 = constraintWidgetContainer.getChildren().iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            boolean z = constraintWidget instanceof HelperWidget;
            String str = constraintWidget.stringId;
            if (z) {
                addReferencesIds((HelperWidget) constraintWidget, arrayList, constraintWidgetContainer, strValueOf);
            }
            for (ConstraintAnchor constraintAnchor : constraintWidget.getAnchors()) {
                if (constraintAnchor.isConnected()) {
                    ConstraintWidget owner = constraintAnchor.getTarget().getOwner();
                    jSONArray.put(new JSONObject().put("originAnchor", constraintAnchor.getType()).put("targetAnchor", constraintAnchor.getTarget().getType()).put("target", Intrinsics.areEqual(constraintWidgetContainer, owner) ? strValueOf : owner instanceof HelperWidget ? getHelperId(owner, state) : getRefId(owner)).put("margin", constraintAnchor.getMargin()));
                }
                it2 = it2;
            }
            putViewIdToBoundsAndConstraints(jSONObject, str, boundsToJson(constraintWidget, i, i2), constraintWidget instanceof HelperWidget, false, arrayList, jSONArray);
            it2 = it2;
        }
        putViewIdToBoundsAndConstraints(jSONObject, strValueOf, boundsToJson(constraintWidgetContainer, i, i2), false, true, CollectionsKt__CollectionsKt.emptyList(), new JSONArray());
        return createDesignInfoJson(jSONObject);
    }

    private static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z, boolean z2, List<String> list, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        jSONObject3.put("box", jSONObject2);
        jSONObject3.put("isHelper", z);
        jSONObject3.put("isRoot", z2);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(it2.next());
        }
        jSONObject3.put("helperReferences", jSONArray2);
        jSONObject3.put("constraints", jSONArray);
        jSONObject.put(str, jSONObject3);
    }

    public static final void setDesignInfoProvider(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull DesignInfoProvider designInfoProvider) {
        designInfoProvider$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }
}
