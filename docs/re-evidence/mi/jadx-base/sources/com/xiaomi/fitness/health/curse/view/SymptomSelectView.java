package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.curse.data.CurseFactor;
import com.xiaomi.fitness.health.curse.view.SymptomSelectView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.n4j;
import defpackage.pni;
import defpackage.wsb;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/SymptomSelectView;", "Landroid/widget/LinearLayout;", "", "type", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "getType", "(I)Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "curseFactor", "", "setResource", "(Lcom/xiaomi/fitness/health/curse/data/CurseFactor;)V", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V", "value", "check", "(Ljava/lang/Integer;)V", "getNameWidth", "()I", "Landroid/widget/TextView;", "nameView", "()Landroid/widget/TextView;", "Landroid/util/AttributeSet;", "attr", "Landroid/util/AttributeSet;", "getAttr", "()Landroid/util/AttributeSet;", "I", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "Lwsb;", "bind", "Lwsb;", "", "notify", "Z", "Landroid/content/Context;", "context", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SymptomSelectView extends LinearLayout {

    @Nullable
    private final AttributeSet attr;

    @NotNull
    private final wsb bind;

    @Nullable
    private RadioGroup.OnCheckedChangeListener listener;
    private boolean notify;
    private int type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymptomSelectView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SymptomSelectView this$0, RadioGroup radioGroup, int i) {
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.notify || (onCheckedChangeListener = this$0.listener) == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(radioGroup, i);
    }

    private final CurseFactor getType(int type) {
        if (type != 0) {
            return type != 1 ? CurseFactor.Motion.INSTANCE : CurseFactor.Blood.INSTANCE;
        }
        return CurseFactor.Hurt.INSTANCE;
    }

    private final void setResource(CurseFactor curseFactor) {
        int i;
        int i2;
        int i3;
        if (curseFactor instanceof CurseFactor.Hurt) {
            i = pni.v1;
            i2 = pni.w1;
            i3 = pni.u1;
            this.bind.E.setText(c0j.X5);
        } else if (curseFactor instanceof CurseFactor.Blood) {
            i = pni.s1;
            i2 = pni.t1;
            i3 = pni.r1;
            this.bind.E.setText(c0j.H5);
        } else {
            i = pni.y1;
            i2 = pni.z1;
            i3 = pni.x1;
            this.bind.E.setText(c0j.c6);
        }
        this.bind.B.setBackgroundResource(i);
        this.bind.C.setBackgroundResource(i2);
        this.bind.A.setBackgroundResource(i3);
    }

    public final void check(@Nullable Integer value) {
        int i;
        this.notify = false;
        if (value == null) {
            this.bind.D.clearCheck();
        } else {
            RadioGroup radioGroup = this.bind.D;
            if (value.intValue() == 0) {
                i = eri.Ia;
            } else {
                i = value.intValue() == 1 ? eri.Lb : eri.a0;
            }
            radioGroup.check(i);
        }
        this.notify = true;
    }

    @Nullable
    public final AttributeSet getAttr() {
        return this.attr;
    }

    public final int getNameWidth() {
        return this.bind.E.getWidth();
    }

    @NotNull
    public final TextView nameView() {
        TextView typeView = this.bind.E;
        Intrinsics.checkNotNullExpressionValue(typeView, "typeView");
        return typeView;
    }

    public final void setOnCheckedChangeListener(@NotNull RadioGroup.OnCheckedChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymptomSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymptomSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.attr = attributeSet;
        wsb wsbVarA0 = wsb.A0(ExtUtilsKt.getInflater(context), this, true);
        Intrinsics.checkNotNullExpressionValue(wsbVarA0, "inflate(...)");
        this.bind = wsbVarA0;
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, n4j.o2);
        setGravity(16);
        this.type = typedArrayObtainAttributes.getInt(n4j.p2, 0);
        typedArrayObtainAttributes.recycle();
        setResource(getType(this.type));
        wsbVarA0.D.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: jso
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                SymptomSelectView._init_$lambda$0(this.f23096a, radioGroup, i2);
            }
        });
        this.notify = true;
    }

    public /* synthetic */ SymptomSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
