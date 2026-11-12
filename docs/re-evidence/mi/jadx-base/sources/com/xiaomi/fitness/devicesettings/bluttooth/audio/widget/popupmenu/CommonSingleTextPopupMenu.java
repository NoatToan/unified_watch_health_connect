package com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.popupmenu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.popupmenu.CommonSingleTextPopupMenu;
import defpackage.c7e;
import defpackage.m4i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,Bb\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010)\u001a\u00020\u0004\u0012!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0004\b*\u0010+J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R2\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b0\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonSingleTextPopupMenu;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "anchor", "", "xoff", "yoff", "gravity", "", "show", "(Landroid/view/View;III)V", "dismiss", "()V", "Lc7e;", "binding", "Lc7e;", "getBinding", "()Lc7e;", "", "", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "callback", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonPopupSingleTextAdapter;", "adapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonPopupSingleTextAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonPopupSingleTextAdapter;", "width", "height", "", "focusable", "checkedPosition", "<init>", "(Lc7e;IIZLjava/util/List;ILkotlin/jvm/functions/Function1;)V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CommonSingleTextPopupMenu extends PopupWindow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CommonPopupSingleTextAdapter adapter;

    @NotNull
    private final c7e binding;

    @NotNull
    private final Function1<Integer, Unit> callback;

    @NotNull
    private final List<String> list;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonSingleTextPopupMenu$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonSingleTextPopupMenu;", "context", "Landroid/content/Context;", "list", "", "", "checkedPosition", "", "height", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CommonSingleTextPopupMenu create$default(Companion companion, Context context, List list, int i, int i2, Function1 function1, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                i2 = 80;
            }
            return companion.create(context, list, i, i2, function1);
        }

        @NotNull
        public final CommonSingleTextPopupMenu create(@NotNull Context context, @NotNull List<String> list, int checkedPosition, int height, @NotNull Function1<? super Integer, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(callback, "callback");
            c7e c7eVarA0 = c7e.A0(LayoutInflater.from(context), null, false);
            Intrinsics.checkNotNullExpressionValue(c7eVarA0, "inflate(...)");
            return new CommonSingleTextPopupMenu(c7eVarA0, ExtUtilsKt.getDp(Integer.valueOf(height)), -2, true, list, checkedPosition, callback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommonSingleTextPopupMenu(@NotNull c7e binding, int i, int i2, boolean z, @NotNull List<String> list, int i3, @NotNull Function1<? super Integer, Unit> callback) {
        super(binding.getRoot(), i, i2, z);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.binding = binding;
        this.list = list;
        this.callback = callback;
        binding.getRoot().setFocusableInTouchMode(true);
        binding.getRoot().setElevation(ExtUtilsKt.getDp(1));
        setOutsideTouchable(true);
        RecyclerView recyclerView = binding.A;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        CommonPopupSingleTextAdapter commonPopupSingleTextAdapter = new CommonPopupSingleTextAdapter(list, i3, new Function1() { // from class: a74
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CommonSingleTextPopupMenu._init_$lambda$0(this.f701a, ((Integer) obj).intValue());
            }
        });
        this.adapter = commonPopupSingleTextAdapter;
        binding.A.setAdapter(commonPopupSingleTextAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(CommonSingleTextPopupMenu this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callback.invoke2(Integer.valueOf(i));
        this$0.dismiss();
        return Unit.INSTANCE;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        Context context = this.binding.getRoot().getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.alpha = 1.0f;
            activity.getWindow().setAttributes(attributes);
        }
    }

    @NotNull
    public final CommonPopupSingleTextAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final c7e getBinding() {
        return this.binding;
    }

    @NotNull
    public final Function1<Integer, Unit> getCallback() {
        return this.callback;
    }

    @NotNull
    public final List<String> getList() {
        return this.list;
    }

    public final void show(@NotNull View anchor, int xoff, int yoff, int gravity) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        m4i.a(this, true);
        showAsDropDown(anchor, xoff, yoff, gravity);
        Context context = this.binding.getRoot().getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.alpha = 0.7f;
            activity.getWindow().setAttributes(attributes);
        }
    }

    public /* synthetic */ CommonSingleTextPopupMenu(c7e c7eVar, int i, int i2, boolean z, List list, int i3, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7eVar, i, i2, (i4 & 8) != 0 ? true : z, list, i3, function1);
    }
}
