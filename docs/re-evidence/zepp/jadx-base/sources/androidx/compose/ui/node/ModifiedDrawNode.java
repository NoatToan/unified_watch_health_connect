package androidx.compose.ui.node;

import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00138V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/ModifiedDrawNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/DrawCacheModifier;", "updateCacheDrawModifier", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "", "onMeasureResultChanged", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "cacheDrawModifier", "Landroidx/compose/ui/draw/DrawCacheModifier;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "buildCacheParams", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "", "invalidateCache", "Z", "Lkotlin/Function0;", "updateCache", "Lkotlin/jvm/functions/Function0;", "value", "getModifier", "()Landroidx/compose/ui/draw/DrawModifier;", "setModifier", "(Landroidx/compose/ui/draw/DrawModifier;)V", "modifier", "isValid", "()Z", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "drawModifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/draw/DrawModifier;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ModifiedDrawNode extends DelegatingLayoutNodeWrapper<DrawModifier> implements OwnerScope {

    @NotNull
    private static final Function1<ModifiedDrawNode, Unit> onCommitAffectingModifiedDrawNode = new Function1<ModifiedDrawNode, Unit>() { // from class: androidx.compose.ui.node.ModifiedDrawNode$Companion$onCommitAffectingModifiedDrawNode$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ModifiedDrawNode modifiedDrawNode) {
            invoke2(modifiedDrawNode);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ModifiedDrawNode modifiedDrawNode) {
            if (modifiedDrawNode.isValid()) {
                modifiedDrawNode.invalidateCache = true;
                modifiedDrawNode.invalidateLayer();
            }
        }
    };

    @NotNull
    private final BuildDrawCacheParams buildCacheParams;

    @Nullable
    private DrawCacheModifier cacheDrawModifier;
    private boolean invalidateCache;

    @NotNull
    private final Function0<Unit> updateCache;

    public ModifiedDrawNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull DrawModifier drawModifier) {
        super(layoutNodeWrapper, drawModifier);
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.buildCacheParams = new BuildDrawCacheParams() { // from class: androidx.compose.ui.node.ModifiedDrawNode$buildCacheParams$1

            @NotNull
            private final Density density;

            {
                this.density = this.this$0.getLayoutNode().getDensity();
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            @NotNull
            public Density getDensity() {
                return this.density;
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            @NotNull
            public LayoutDirection getLayoutDirection() {
                return this.this$0.getLayoutNode().getLayoutDirection();
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            /* JADX INFO: renamed from: getSize-NH-jbRc */
            public long mo916getSizeNHjbRc() {
                return IntSizeKt.m3095toSizeozmzZPI(this.this$0.getMeasuredSize());
            }
        };
        this.invalidateCache = true;
        this.updateCache = new Function0<Unit>() { // from class: androidx.compose.ui.node.ModifiedDrawNode$updateCache$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DrawCacheModifier drawCacheModifier = this.this$0.cacheDrawModifier;
                if (drawCacheModifier != null) {
                    drawCacheModifier.onBuildCache(this.this$0.buildCacheParams);
                }
                this.this$0.invalidateCache = false;
            }
        };
    }

    private final DrawCacheModifier updateCacheDrawModifier() {
        DrawModifier modifier = getModifier();
        if (modifier instanceof DrawCacheModifier) {
            return (DrawCacheModifier) modifier;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return isAttached();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onMeasureResultChanged(int width, int height) {
        super.onMeasureResultChanged(width, height);
        this.invalidateCache = true;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(@NotNull Canvas canvas) {
        long jM3095toSizeozmzZPI = IntSizeKt.m3095toSizeozmzZPI(getMeasuredSize());
        if (this.cacheDrawModifier != null && this.invalidateCache) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingModifiedDrawNode, this.updateCache);
        }
        LayoutNodeDrawScope mDrawScope = getLayoutNode().getMDrawScope();
        LayoutNodeWrapper wrapped = getWrapped();
        LayoutNodeWrapper layoutNodeWrapper = mDrawScope.wrapped;
        mDrawScope.wrapped = wrapped;
        CanvasDrawScope canvasDrawScope = mDrawScope.canvasDrawScope;
        MeasureScope measureScope = wrapped.getMeasureScope();
        LayoutDirection layoutDirection = wrapped.getMeasureScope().getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.getDensity();
        LayoutDirection layoutDirectionComponent2 = drawParams.getLayoutDirection();
        Canvas canvasComponent3 = drawParams.getCanvas();
        long jM1587component4NHjbRc = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1590setSizeuvyYCjk(jM3095toSizeozmzZPI);
        canvas.save();
        getModifier().draw(mDrawScope);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m1590setSizeuvyYCjk(jM1587component4NHjbRc);
        mDrawScope.wrapped = layoutNodeWrapper;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    @NotNull
    public DrawModifier getModifier() {
        return (DrawModifier) super.getModifier();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void setModifier(@NotNull DrawModifier drawModifier) {
        super.setModifier(drawModifier);
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.invalidateCache = true;
    }
}
