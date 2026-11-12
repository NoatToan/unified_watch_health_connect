package com.xiaomi.fitness.device.manager.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.ui.AddDeviceView;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import defpackage.bji;
import defpackage.eli;
import defpackage.fai;
import defpackage.hni;
import defpackage.lq0;
import defpackage.nrd;
import defpackage.nuf;
import defpackage.s69;
import defpackage.uzi;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0003J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/AddDeviceView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addDeviceWhenLogin", "", "ctx", "addDevice", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddDeviceView extends AppCompatTextView {
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    static {
        ajc$preClinit();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddDeviceView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(AddDeviceView this$0, Context context, AddDeviceView it) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "it");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36381"), "name", "Device_page_Adddevice", "status", 0, "position_name", "Device_Card_Add");
        if (AppUtil.INSTANCE.isPlayChannel()) {
            this$0.addDevice(context);
        } else {
            this$0.addDeviceWhenLogin(context);
        }
        return Unit.INSTANCE;
    }

    private final void addDevice(Context ctx) {
        ScanDeviceActivity.INSTANCE.launch$device_manager_chinaProductRelease(ctx, null, true);
    }

    @NeedLogin
    private final void addDeviceWhenLogin(Context ctx) throws Throwable {
        nrd nrdVarC = s69.c(ajc$tjp_0, this, this, ctx);
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new lq0(new Object[]{this, ctx, nrdVarC}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = AddDeviceView.class.getDeclaredMethod("addDeviceWhenLogin", Context.class).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("AddDeviceView.kt", AddDeviceView.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g("12", "addDeviceWhenLogin", "com.xiaomi.fitness.device.manager.ui.AddDeviceView", "android.content.Context", "ctx", "", "void"), 55);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddDeviceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AddDeviceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddDeviceView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setCompoundDrawablesWithIntrinsicBounds(0, hni.h, 0, 0);
        setCompoundDrawablePadding((int) ViewExtKt.getDimen(this, eli.c));
        setBackgroundResource(hni.I);
        int dimen = (int) ViewExtKt.getDimen(this, eli.d);
        setPadding(0, dimen, 0, dimen);
        setGravity(17);
        setText(uzi.s);
        setTextColor(ViewExtKt.getColor(this, bji.d));
        nuf.f(this);
        ViewExtKt.clickWithTrigger$default(this, 0L, new Function1() { // from class: kq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddDeviceView._init_$lambda$0(this.f24154a, context, (AddDeviceView) obj);
            }
        }, 1, null);
    }
}
