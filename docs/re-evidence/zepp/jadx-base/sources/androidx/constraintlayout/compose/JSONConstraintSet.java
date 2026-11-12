package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0001\u0010&\u001a\u00020\u0017\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0014\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00190!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Landroidx/constraintlayout/compose/JSONConstraintSet;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/LayoutVariables;", "layoutVariables", "", "applyLayoutVariables", "", "other", "", "equals", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "type", "applyTo", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "designElements", "emitDesignElements", "Landroidx/constraintlayout/compose/State;", "state", "applyToState", "", "name", "", "value", "Landroidx/constraintlayout/compose/ConstraintSet;", "override", "extendFrom", "Landroidx/constraintlayout/compose/ConstraintSet;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "Ljava/util/HashMap;", "overridedVariables", "Ljava/util/HashMap;", "overrideVariables", "Ljava/lang/String;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/ConstraintSet;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {

    @Nullable
    private final ConstraintSet extendFrom;

    @Nullable
    private final String overrideVariables;

    @NotNull
    private final HashMap<String, Float> overridedVariables;

    public /* synthetic */ JSONConstraintSet(String str, String str2, ConstraintSet constraintSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : constraintSet);
    }

    private final void applyLayoutVariables(LayoutVariables layoutVariables) {
        String str = this.overrideVariables;
        if (str != null) {
            try {
                CLObject cLObject = CLParser.parse(str);
                int i = 0;
                int size = cLObject.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        CLElement cLElement = cLObject.get(i);
                        if (cLElement == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                        }
                        CLKey cLKey = (CLKey) cLElement;
                        layoutVariables.putOverride(cLKey.content(), cLKey.getValue().getFloat());
                        if (i == size) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                }
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("exception: ", e));
            }
        }
        for (String str2 : this.overridedVariables.keySet()) {
            layoutVariables.putOverride(str2, this.overridedVariables.get(str2).floatValue());
        }
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@NotNull State state, @NotNull List<? extends Measurable> list) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, state, list);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@NotNull State state) {
        LayoutVariables layoutVariables = new LayoutVariables();
        applyLayoutVariables(layoutVariables);
        try {
            ConstraintSetParserKt.parseJSON(getCurrentContent(), state, layoutVariables);
        } catch (Exception unused) {
        }
    }

    public final void emitDesignElements(@NotNull ArrayList<DesignElement> designElements) {
        try {
            designElements.clear();
            ConstraintSetParserKt.parseDesignElementsJSON(getCurrentContent(), designElements);
        } catch (Exception unused) {
        }
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof JSONConstraintSet) {
            return Intrinsics.areEqual(getCurrentContent(), ((JSONConstraintSet) other).getCurrentContent());
        }
        return false;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    @Nullable
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@NotNull List<? extends Measurable> list) {
        return DerivedConstraintSet.DefaultImpls.isDirty(this, list);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    @NotNull
    public ConstraintSet override(@NotNull String name, float value) {
        this.overridedVariables.put(name, Float.valueOf(value));
        return this;
    }

    public JSONConstraintSet(@Language("json5") @NotNull String str, @Language("json5") @Nullable String str2, @Nullable ConstraintSet constraintSet) {
        super(str);
        this.extendFrom = constraintSet;
        this.overridedVariables = new HashMap<>();
        this.overrideVariables = str2;
        initialization();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@NotNull androidx.constraintlayout.core.state.Transition transition, int type) {
        applyLayoutVariables(new LayoutVariables());
        ConstraintSetParserKt.parseJSON(getCurrentContent(), transition, type);
    }
}
