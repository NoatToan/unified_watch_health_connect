package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckedTextView f5109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f5110b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f5111c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5112d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5113e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5114f;

    public g(CheckedTextView checkedTextView) {
        this.f5109a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f5109a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f5112d || this.f5113e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f5112d) {
                    drawableMutate.setTintList(this.f5110b);
                }
                if (this.f5113e) {
                    drawableMutate.setTintMode(this.f5111c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
