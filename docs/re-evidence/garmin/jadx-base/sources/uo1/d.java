package uo1;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.x0;
import c53.c0;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;
import u1.y1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Luo1/d;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "layoutRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/animation/AnimatorSet;", "a", "Landroid/animation/AnimatorSet;", "getAnimatorSet$gcm_domain_social_vanillaRelease", "()Landroid/animation/AnimatorSet;", "animatorSet", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f172122b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final AnimatorSet animatorSet;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f172124a = new a();

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ViewGroup);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14);
        context.getClass();
        this.animatorSet = new AnimatorSet();
        LayoutInflater.from(context).inflate(i15, (ViewGroup) this, true);
        c();
    }

    public final void a() {
        this.animatorSet.pause();
        setVisibility(8);
    }

    public final void b(View... viewArr) {
        this.animatorSet.playTogether(c0.s(c0.o(c0.k(c0.h(u.v(Arrays.copyOf(viewArr, viewArr.length)), a.f172124a), new y1(19)), new uo1.a(this, 0))));
    }

    public void c() {
        View[] viewArr = (View[]) c0.s(new x0(this)).toArray(new View[0]);
        b((View[]) Arrays.copyOf(viewArr, viewArr.length));
    }

    /* JADX INFO: renamed from: getAnimatorSet$gcm_domain_social_vanillaRelease, reason: from getter */
    public final AnimatorSet getAnimatorSet() {
        return this.animatorSet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, 0, i14, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, int i14) {
        this(context, null, 0, i14, 6, null);
        context.getClass();
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i14, int i15, int i16, j jVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? 0 : i14, i15);
    }
}
