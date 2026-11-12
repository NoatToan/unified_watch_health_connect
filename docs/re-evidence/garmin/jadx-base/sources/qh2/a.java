package qh2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0018R*\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lqh2/a;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getRequiredControlStartPosition", "()I", "Lqh2/a$a;", "a", "Lqh2/a$a;", "getOnWatchFaceIconClicked", "()Lqh2/a$a;", "setOnWatchFaceIconClicked", "(Lqh2/a$a;)V", "onWatchFaceIconClicked", "b", "I", "getNoOfOptions", "setNoOfOptions", "(I)V", "noOfOptions", "", "Landroid/widget/ImageView;", "c", "[Landroid/widget/ImageView;", "getWatchFaceIconImageViews", "()[Landroid/widget/ImageView;", "setWatchFaceIconImageViews", "([Landroid/widget/ImageView;)V", "watchFaceIconImageViews", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2731a onWatchFaceIconClicked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int noOfOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ImageView[] watchFaceIconImageViews;

    /* JADX INFO: renamed from: qh2.a$a, reason: collision with other inner class name */
    public interface InterfaceC2731a {
        void p0(int i14);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    public final int getNoOfOptions() {
        return this.noOfOptions;
    }

    public final InterfaceC2731a getOnWatchFaceIconClicked() {
        return this.onWatchFaceIconClicked;
    }

    public abstract int getRequiredControlStartPosition();

    public final ImageView[] getWatchFaceIconImageViews() {
        return this.watchFaceIconImageViews;
    }

    public abstract void i(int i14);

    public void j(int i14, boolean z14) {
        ImageView imageView = (ImageView) u.L(i14, this.watchFaceIconImageViews);
        if (imageView == null) {
            return;
        }
        imageView.setSelected(z14);
    }

    public final void setNoOfOptions(int i14) {
        this.noOfOptions = i14;
    }

    public final void setOnWatchFaceIconClicked(InterfaceC2731a interfaceC2731a) {
        this.onWatchFaceIconClicked = interfaceC2731a;
    }

    public final void setWatchFaceIconImageViews(ImageView[] imageViewArr) {
        imageViewArr.getClass();
        this.watchFaceIconImageViews = imageViewArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.watchFaceIconImageViews = new ImageView[0];
    }
}
