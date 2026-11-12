package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.threetarget.adpter.TargetDetailItemView;
import com.xiaomi.fitness.health.threetarget.model.TargetDetailModel;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class y0p extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<TargetDetailModel> f39658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f39659b;
    public LayoutInflater c;
    public int d;
    public int e;
    public boolean f;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TargetDetailItemView f39660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39661b;
        public boolean c;

        /* JADX INFO: renamed from: y0p$a$a, reason: collision with other inner class name */
        public class C1153a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f39662a;

            public C1153a(View view) {
                this.f39662a = view;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.f39662a.setVisibility(0);
            }
        }

        public a(View view) {
            super(view);
            this.f39661b = false;
            this.c = false;
            this.f39660a = (TargetDetailItemView) view.findViewById(eri.p3);
        }

        public void b(TargetDetailModel targetDetailModel, int i) {
            int iA = q3b.a(y0p.this.e, i);
            if (pz9.a(y0p.this.f39659b) || UIUtils.INSTANCE.isTablet()) {
                iA = 1;
            }
            this.f39660a.a(targetDetailModel, iA);
            if (this.c) {
                c(i);
            }
        }

        public final void c(final int i) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
            valueAnimatorOfFloat.setDuration(100L);
            this.f39661b = false;
            this.f39660a.setVisibility(4);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: x0p
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f38554a.d(i, valueAnimator);
                }
            });
            valueAnimatorOfFloat.start();
        }

        public final /* synthetic */ void d(int i, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (i == 0 && !this.f39661b) {
                this.f39661b = true;
                e(this.f39660a);
                return;
            }
            if (i == 1 && fFloatValue > 1.0f && !this.f39661b) {
                this.f39661b = true;
                e(this.f39660a);
            } else {
                if (fFloatValue < 2.0f || this.f39661b) {
                    return;
                }
                this.f39661b = true;
                e(this.f39660a);
            }
        }

        public final void e(View view) {
            float fDip2px = DisplayUtil.dip2px(13.0f);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, fDip2px, 0.0f);
            objectAnimatorOfFloat2.setDuration(660L);
            objectAnimatorOfFloat.setDuration(660L);
            objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat2.addListener(new C1153a(view));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.start();
        }
    }

    public y0p(Context context, List<TargetDetailModel> list) {
        this.d = -1;
        this.e = 3;
        this.f = false;
        this.f39659b = context;
        this.f39658a = list;
        this.c = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f39658a.size();
    }

    public int k(int i) {
        int i2 = this.f39658a.get(i).type;
        return 3;
    }

    public boolean l() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        TargetDetailModel targetDetailModel = this.f39658a.get(i);
        if (this.f) {
            aVar.c = true;
        }
        aVar.b(targetDetailModel, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = this.d;
        if (i2 == -1) {
            i2 = jui.A6;
        }
        return new a(this.c.inflate(i2, viewGroup, false));
    }

    public void o() {
        this.f = true;
    }

    public y0p(Context context, List<TargetDetailModel> list, int i) {
        this(context, list);
        this.d = i;
    }
}
