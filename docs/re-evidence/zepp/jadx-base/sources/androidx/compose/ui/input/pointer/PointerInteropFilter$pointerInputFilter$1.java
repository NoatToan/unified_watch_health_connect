package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.huami.passport.Configs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J-\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", Configs.Params.RESET, "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "dispatchToView", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    @NotNull
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    public final /* synthetic */ PointerInteropFilter this$0;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        boolean z;
        Offset offsetM972boximpl;
        int size;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size2 = changes.size() - 1;
        int i = 0;
        if (size2 < 0) {
            z = false;
            break;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (PointerEventKt.anyChangeConsumed(changes.get(i2))) {
                z = true;
                break;
            } else {
                if (i3 > size2) {
                    z = false;
                    break;
                }
                i2 = i3;
            }
        }
        if (z) {
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
                offsetM972boximpl = layoutCoordinates != null ? Offset.m972boximpl(layoutCoordinates.mo2482localToRootMKHz9U(Offset.INSTANCE.m999getZeroF1C5BW0())) : null;
                if (offsetM972boximpl == null) {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
                long packedValue = offsetM972boximpl.getPackedValue();
                final PointerInteropFilter pointerInteropFilter = this.this$0;
                PointerInteropUtils_androidKt.m2420toCancelMotionEventScoped4ec7I(pointerEvent, packedValue, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                        invoke2(motionEvent);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull MotionEvent motionEvent) {
                        pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                    }
                });
            }
            this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        LayoutCoordinates layoutCoordinates2 = getLayoutCoordinates();
        offsetM972boximpl = layoutCoordinates2 != null ? Offset.m972boximpl(layoutCoordinates2.mo2482localToRootMKHz9U(Offset.INSTANCE.m999getZeroF1C5BW0())) : null;
        if (offsetM972boximpl == null) {
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }
        long packedValue2 = offsetM972boximpl.getPackedValue();
        final PointerInteropFilter pointerInteropFilter2 = this.this$0;
        PointerInteropUtils_androidKt.m2421toMotionEventScoped4ec7I(pointerEvent, packedValue2, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                invoke2(motionEvent);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent);
                } else {
                    this.this$0.state = pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }
        });
        if (this.state != PointerInteropFilter.DispatchToViewState.Dispatching || (size = changes.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            PointerEventKt.consumeAllChanges(changes.get(i));
            if (i4 > size) {
                return;
            } else {
                i = i4;
            }
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(jUptimeMillis, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MotionEvent motionEvent) {
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }
            });
            reset();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo2400onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        boolean z;
        boolean z2;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        boolean z3 = false;
        if (this.this$0.getDisallowIntercept()) {
            z = true;
        } else {
            int size = changes.size() - 1;
            if (size < 0) {
                z2 = false;
                break;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                PointerInputChange pointerInputChange = changes.get(i);
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    z2 = true;
                    break;
                } else {
                    if (i2 > size) {
                        z2 = false;
                        break;
                    }
                    i = i2;
                }
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pass == PointerEventPass.Initial && z) {
                dispatchToView(pointerEvent);
            }
            if (pass == PointerEventPass.Final && !z) {
                dispatchToView(pointerEvent);
            }
        }
        if (pass == PointerEventPass.Final) {
            int size2 = changes.size() - 1;
            if (size2 < 0) {
                z3 = true;
                break;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i3))) {
                    break;
                }
                if (i4 > size2) {
                    z3 = true;
                    break;
                }
                i3 = i4;
            }
            if (z3) {
                reset();
            }
        }
    }
}
