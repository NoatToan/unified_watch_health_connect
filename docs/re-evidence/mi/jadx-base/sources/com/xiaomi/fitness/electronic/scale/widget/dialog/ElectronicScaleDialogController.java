package com.xiaomi.fitness.electronic.scale.widget.dialog;

import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.xiaomi.passport.ui.settings.SimpleDialogFragment;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0002\\]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010Y\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u000eH\u0016J\b\u0010[\u001a\u00020\u000eH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001e\u0010%\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010.\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR.\u00108\u001a\u0016\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u000201\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0010\"\u0004\bS\u0010\u0012R\u001c\u0010T\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006^"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleDialogController;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "offsetY", "", "getOffsetY", "()I", "setOffsetY", "(I)V", "offsetX", "getOffsetX", "setOffsetX", SimpleDialogFragment.ARG_CANCELABLE, "", "getCancelable", "()Z", "setCancelable", "(Z)V", "width", "getWidth", "setWidth", "height", "getHeight", "setHeight", "gravity", "getGravity", "setGravity", "animationStyle", "getAnimationStyle", "setAnimationStyle", "clickIds", "", "getClickIds", "()[I", "setClickIds", "([I)V", "onViewBind", "Lkotlin/Function1;", "Landroid/view/View;", "", "getOnViewBind", "()Lkotlin/jvm/functions/Function1;", "setOnViewBind", "(Lkotlin/jvm/functions/Function1;)V", "isCanceledOnTouchOutside", "setCanceledOnTouchOutside", "onViewClick", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleMedalDialog;", "getOnViewClick", "()Lkotlin/jvm/functions/Function2;", "setOnViewClick", "(Lkotlin/jvm/functions/Function2;)V", "onKeyListener", "Landroid/content/DialogInterface$OnKeyListener;", "getOnKeyListener", "()Landroid/content/DialogInterface$OnKeyListener;", "setOnKeyListener", "(Landroid/content/DialogInterface$OnKeyListener;)V", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getOnDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setOnDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "getOnCancelListener", "()Landroid/content/DialogInterface$OnCancelListener;", "setOnCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "layoutRes", "getLayoutRes", "setLayoutRes", "view", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "writeToParcel", "flags", "describeContents", "Params", "CREATOR", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleDialogController implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int animationStyle;
    private boolean cancelable;

    @Nullable
    private int[] clickIds;
    private int gravity;
    private int height;
    private boolean isCanceledOnTouchOutside;
    private int layoutRes;
    private int offsetX;
    private int offsetY;

    @Nullable
    private DialogInterface.OnCancelListener onCancelListener;

    @Nullable
    private DialogInterface.OnDismissListener onDismissListener;

    @Nullable
    private DialogInterface.OnKeyListener onKeyListener;

    @Nullable
    private Function1<? super View, Unit> onViewBind;

    @Nullable
    private Function2<? super View, ? super ElectronicScaleMedalDialog, Unit> onViewClick;

    @Nullable
    private String tag;

    @Nullable
    private View view;
    private int width;

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.widget.dialog.ElectronicScaleDialogController$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleDialogController$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleDialogController;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleDialogController;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ElectronicScaleDialogController> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ElectronicScaleDialogController createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ElectronicScaleDialogController(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ElectronicScaleDialogController[] newArray(int size) {
            return new ElectronicScaleDialogController[size];
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001a\u00105\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R\u001a\u00108\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001a\u0010;\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R\u001a\u0010>\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010*\"\u0004\b@\u0010,R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0010\"\u0004\bU\u0010\u0012R\u001e\u0010V\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleDialogController$Params;", "", "<init>", "()V", "apply", "", "controller", "Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleDialogController;", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "isCanceledOnTouchOutside", "", "()Z", "setCanceledOnTouchOutside", "(Z)V", "onViewBind", "Lkotlin/Function1;", "Landroid/view/View;", "getOnViewBind", "()Lkotlin/jvm/functions/Function1;", "setOnViewBind", "(Lkotlin/jvm/functions/Function1;)V", "onViewClick", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/electronic/scale/widget/dialog/ElectronicScaleMedalDialog;", "getOnViewClick", "()Lkotlin/jvm/functions/Function2;", "setOnViewClick", "(Lkotlin/jvm/functions/Function2;)V", "clickIds", "", "getClickIds", "()[I", "setClickIds", "([I)V", "animationStyle", "", "getAnimationStyle", "()I", "setAnimationStyle", "(I)V", "view", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "offsetX", "getOffsetX", "setOffsetX", "offsetY", "getOffsetY", "setOffsetY", "gravity", "getGravity", "setGravity", "height", "getHeight", "setHeight", "width", "getWidth", "setWidth", "onKeyListener", "Landroid/content/DialogInterface$OnKeyListener;", "getOnKeyListener", "()Landroid/content/DialogInterface$OnKeyListener;", "setOnKeyListener", "(Landroid/content/DialogInterface$OnKeyListener;)V", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getOnDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setOnDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "getOnCancelListener", "()Landroid/content/DialogInterface$OnCancelListener;", "setOnCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", SimpleDialogFragment.ARG_CANCELABLE, "getCancelable", "setCancelable", "layoutRes", "getLayoutRes", "setLayoutRes", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Params {

        @Nullable
        private int[] clickIds;
        private boolean isCanceledOnTouchOutside;
        private int layoutRes;
        private int offsetX;
        private int offsetY;

        @Nullable
        private DialogInterface.OnCancelListener onCancelListener;

        @Nullable
        private DialogInterface.OnDismissListener onDismissListener;

        @Nullable
        private DialogInterface.OnKeyListener onKeyListener;

        @Nullable
        private Function1<? super View, Unit> onViewBind;

        @Nullable
        private Function2<? super View, ? super ElectronicScaleMedalDialog, Unit> onViewClick;

        @Nullable
        private String tag;

        @Nullable
        private View view;
        private int animationStyle = -1;
        private int gravity = 17;
        private int height = -2;
        private int width = -1;
        private boolean cancelable = true;

        public final void apply(@NotNull ElectronicScaleDialogController controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            controller.setOffsetX(this.offsetX);
            controller.setOffsetY(this.offsetY);
            controller.setGravity(this.gravity);
            controller.setWidth(this.width);
            controller.setHeight(this.height);
            controller.setCancelable(this.cancelable);
            controller.setOnKeyListener(this.onKeyListener);
            controller.setOnDismissListener(this.onDismissListener);
            controller.setOnCancelListener(this.onCancelListener);
            controller.setLayoutRes(this.layoutRes);
            controller.setAnimationStyle(this.animationStyle);
            controller.setView(this.view);
            controller.setClickIds(this.clickIds);
            controller.setOnViewClick(this.onViewClick);
            controller.setOnViewBind(this.onViewBind);
            controller.setCanceledOnTouchOutside(this.isCanceledOnTouchOutside);
            controller.setTag(this.tag);
        }

        public final int getAnimationStyle() {
            return this.animationStyle;
        }

        public final boolean getCancelable() {
            return this.cancelable;
        }

        @Nullable
        public final int[] getClickIds() {
            return this.clickIds;
        }

        public final int getGravity() {
            return this.gravity;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getLayoutRes() {
            return this.layoutRes;
        }

        public final int getOffsetX() {
            return this.offsetX;
        }

        public final int getOffsetY() {
            return this.offsetY;
        }

        @Nullable
        public final DialogInterface.OnCancelListener getOnCancelListener() {
            return this.onCancelListener;
        }

        @Nullable
        public final DialogInterface.OnDismissListener getOnDismissListener() {
            return this.onDismissListener;
        }

        @Nullable
        public final DialogInterface.OnKeyListener getOnKeyListener() {
            return this.onKeyListener;
        }

        @Nullable
        public final Function1<View, Unit> getOnViewBind() {
            return this.onViewBind;
        }

        @Nullable
        public final Function2<View, ElectronicScaleMedalDialog, Unit> getOnViewClick() {
            return this.onViewClick;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        @Nullable
        public final View getView() {
            return this.view;
        }

        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: isCanceledOnTouchOutside, reason: from getter */
        public final boolean getIsCanceledOnTouchOutside() {
            return this.isCanceledOnTouchOutside;
        }

        public final void setAnimationStyle(int i) {
            this.animationStyle = i;
        }

        public final void setCancelable(boolean z) {
            this.cancelable = z;
        }

        public final void setCanceledOnTouchOutside(boolean z) {
            this.isCanceledOnTouchOutside = z;
        }

        public final void setClickIds(@Nullable int[] iArr) {
            this.clickIds = iArr;
        }

        public final void setGravity(int i) {
            this.gravity = i;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setLayoutRes(int i) {
            this.layoutRes = i;
        }

        public final void setOffsetX(int i) {
            this.offsetX = i;
        }

        public final void setOffsetY(int i) {
            this.offsetY = i;
        }

        public final void setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
            this.onCancelListener = onCancelListener;
        }

        public final void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
            this.onDismissListener = onDismissListener;
        }

        public final void setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
            this.onKeyListener = onKeyListener;
        }

        public final void setOnViewBind(@Nullable Function1<? super View, Unit> function1) {
            this.onViewBind = function1;
        }

        public final void setOnViewClick(@Nullable Function2<? super View, ? super ElectronicScaleMedalDialog, Unit> function2) {
            this.onViewClick = function2;
        }

        public final void setTag(@Nullable String str) {
            this.tag = str;
        }

        public final void setView(@Nullable View view) {
            this.view = view;
        }

        public final void setWidth(int i) {
            this.width = i;
        }
    }

    public ElectronicScaleDialogController() {
        this.width = -1;
        this.height = -2;
        this.gravity = 17;
        this.animationStyle = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAnimationStyle() {
        return this.animationStyle;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @Nullable
    public final int[] getClickIds() {
        return this.clickIds;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLayoutRes() {
        return this.layoutRes;
    }

    public final int getOffsetX() {
        return this.offsetX;
    }

    public final int getOffsetY() {
        return this.offsetY;
    }

    @Nullable
    public final DialogInterface.OnCancelListener getOnCancelListener() {
        return this.onCancelListener;
    }

    @Nullable
    public final DialogInterface.OnDismissListener getOnDismissListener() {
        return this.onDismissListener;
    }

    @Nullable
    public final DialogInterface.OnKeyListener getOnKeyListener() {
        return this.onKeyListener;
    }

    @Nullable
    public final Function1<View, Unit> getOnViewBind() {
        return this.onViewBind;
    }

    @Nullable
    public final Function2<View, ElectronicScaleMedalDialog, Unit> getOnViewClick() {
        return this.onViewClick;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final View getView() {
        return this.view;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: isCanceledOnTouchOutside, reason: from getter */
    public final boolean getIsCanceledOnTouchOutside() {
        return this.isCanceledOnTouchOutside;
    }

    public final void setAnimationStyle(int i) {
        this.animationStyle = i;
    }

    public final void setCancelable(boolean z) {
        this.cancelable = z;
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        this.isCanceledOnTouchOutside = z;
    }

    public final void setClickIds(@Nullable int[] iArr) {
        this.clickIds = iArr;
    }

    public final void setGravity(int i) {
        this.gravity = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setLayoutRes(int i) {
        this.layoutRes = i;
    }

    public final void setOffsetX(int i) {
        this.offsetX = i;
    }

    public final void setOffsetY(int i) {
        this.offsetY = i;
    }

    public final void setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
    }

    public final void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public final void setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
        this.onKeyListener = onKeyListener;
    }

    public final void setOnViewBind(@Nullable Function1<? super View, Unit> function1) {
        this.onViewBind = function1;
    }

    public final void setOnViewClick(@Nullable Function2<? super View, ? super ElectronicScaleMedalDialog, Unit> function2) {
        this.onViewClick = function2;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setView(@Nullable View view) {
        this.view = view;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.isCanceledOnTouchOutside ? (byte) 1 : (byte) 0);
        parcel.writeIntArray(this.clickIds);
        parcel.writeInt(this.animationStyle);
        parcel.writeString(this.tag);
        parcel.writeInt(this.offsetY);
        parcel.writeInt(this.offsetX);
        parcel.writeInt(this.gravity);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
        parcel.writeByte(this.cancelable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.layoutRes);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ElectronicScaleDialogController(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.isCanceledOnTouchOutside = parcel.readByte() != 0;
        this.clickIds = parcel.createIntArray();
        this.animationStyle = parcel.readInt();
        this.tag = parcel.readString();
        this.offsetY = parcel.readInt();
        this.offsetX = parcel.readInt();
        this.gravity = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
        this.cancelable = parcel.readByte() != 0;
        this.layoutRes = parcel.readInt();
    }
}
