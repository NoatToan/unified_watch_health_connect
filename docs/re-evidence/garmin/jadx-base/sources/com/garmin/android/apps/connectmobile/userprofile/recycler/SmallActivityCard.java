package com.garmin.android.apps.connectmobile.userprofile.recycler;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.k1;
import f12.b;
import fm.a;
import fm.g;
import java.util.List;
import og2.k;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import ss.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/recycler/SmallActivityCard;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activity", "", "setActivityMetrics", "(Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SmallActivityCard extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f47198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f47199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f47200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f47201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f47202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f47203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f47204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f47205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f47206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f47207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f47208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f47209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f47210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Guideline f47211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f47212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConstraintLayout f47213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConstraintLayout f47214r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallActivityCard(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47197a = R.color.gcm_text_primary;
        LayoutInflater.from(context).inflate(R.layout.card_activity_small, (ViewGroup) this, true);
        this.f47198b = (CardView) findViewById(R.id.card_activity_container);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.card_activity_details_container);
        this.f47199c = viewGroup;
        if (viewGroup instanceof ConstraintLayout) {
            d dVar = new d();
            this.f47210n = dVar;
            ViewGroup viewGroup2 = this.f47199c;
            viewGroup2.getClass();
            dVar.f((ConstraintLayout) viewGroup2);
        }
        this.f47200d = (ImageView) findViewById(R.id.card_activity_icon);
        this.f47201e = (TextView) findViewById(R.id.card_activity_title);
        this.f47203g = (TextView) findViewById(R.id.card_activity_primary_value);
        this.f47204h = (TextView) findViewById(R.id.card_activity_primary_value_alternate);
        this.f47202f = (ImageView) findViewById(R.id.card_activity_external_icon);
        this.f47205i = (TextView) findViewById(R.id.card_activity_secondary_value);
        this.f47206j = (TextView) findViewById(R.id.card_activity_data_field_1_name);
        this.f47207k = (TextView) findViewById(R.id.card_activity_data_field_1_value);
        this.f47208l = (TextView) findViewById(R.id.card_activity_data_field_2_name);
        this.f47209m = (TextView) findViewById(R.id.card_activity_data_field_2_value);
        this.f47211o = (Guideline) findViewById(R.id.guideline);
        this.f47212p = (LinearLayout) findViewById(R.id.card_activity_header);
        this.f47213q = (ConstraintLayout) findViewById(R.id.card_activity_data_1_layout);
        this.f47214r = (ConstraintLayout) findViewById(R.id.card_activity_data_2_layout);
    }

    private final void setActivityMetrics(ActivityListItemDTO activity) {
        ImageView imageView;
        Context context = getContext();
        context.getClass();
        g gVar = new g(context, this.f47197a);
        a aVar = (a) KoinJavaComponent.get$default(a.class, null, null, 6, null);
        Context context2 = getContext();
        context2.getClass();
        List listA = aVar.a(context2, c.a(activity), gVar);
        aq.c cVar = (aq.c) h0.e0(0, listA);
        aq.c cVar2 = (aq.c) h0.e0(1, listA);
        aq.c cVar3 = (aq.c) h0.e0(2, listA);
        if (cVar != null) {
            CharSequence charSequence = cVar.f11850d;
            CharSequence charSequence2 = cVar.f11849c;
            Integer num = cVar.f11851e;
            TextView textView = this.f47204h;
            if (num != null) {
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f47203g;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                }
                TextView textView3 = this.f47204h;
                if (textView3 != null) {
                    textView3.setText(charSequence2);
                }
                TextView textView4 = this.f47204h;
                if (textView4 != null) {
                    textView4.setContentDescription(charSequence);
                }
                TextView textView5 = this.f47205i;
                if (textView5 != null) {
                    textView5.setCompoundDrawablesWithIntrinsicBounds(0, 2131232532, 0, 0);
                }
                TextView textView6 = this.f47205i;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
            } else {
                if (textView != null) {
                    textView.setVisibility(4);
                }
                TextView textView7 = this.f47203g;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
                TextView textView8 = this.f47203g;
                if (textView8 != null) {
                    textView8.setText(charSequence2);
                }
                TextView textView9 = this.f47203g;
                if (textView9 != null) {
                    textView9.setContentDescription(charSequence);
                }
            }
        }
        if (cVar2 != null) {
            TextView textView10 = this.f47206j;
            if (textView10 != null) {
                textView10.setText(cVar2.f11847a);
            }
            TextView textView11 = this.f47206j;
            if (textView11 != null) {
                textView11.setContentDescription(cVar2.f11848b);
            }
            TextView textView12 = this.f47207k;
            if (textView12 != null) {
                textView12.setText(cVar2.f11849c);
            }
            TextView textView13 = this.f47207k;
            if (textView13 != null) {
                textView13.setContentDescription(cVar2.f11850d);
            }
        }
        if (cVar3 != null) {
            TextView textView14 = this.f47208l;
            if (textView14 != null) {
                textView14.setText(cVar3.f11847a);
            }
            TextView textView15 = this.f47208l;
            if (textView15 != null) {
                textView15.setContentDescription(cVar3.f11848b);
            }
            TextView textView16 = this.f47209m;
            if (textView16 != null) {
                textView16.setText(cVar3.f11849c);
            }
            TextView textView17 = this.f47209m;
            if (textView17 != null) {
                textView17.setContentDescription(cVar3.f11850d);
            }
        }
        boolean zG = s.g(((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).getUserDisplayName(), activity.B);
        boolean zA = z0.a(activity.f29265g.f4358a, hb2.g.b(getContext(), hb2.g.a.GARMIN_DIVE));
        if (zG && zA && (imageView = this.f47202f) != null) {
            imageView.setVisibility(0);
        }
    }

    public final void a(ActivityListItemDTO activityListItemDTO) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        d dVar;
        x0 x0Var = activityListItemDTO.f29265g;
        b bVar = (b) KoinJavaComponent.get$default(b.class, null, null, 6, null);
        bv.b.f21239a.getClass();
        bv.b.a();
        Drawable drawableA = j.a.a(getContext(), activityListItemDTO.f29265g.u(activityListItemDTO.A == bVar.getUserProfilePk() && k1.f37122a.l0()));
        Context context = getContext();
        context.getClass();
        k.F(R.color.gcm_color_on_light_surface, context, drawableA);
        ImageView imageView = this.f47200d;
        if (imageView != null) {
            imageView.setImageDrawable(drawableA);
        }
        CardView cardView = this.f47198b;
        if (cardView != null) {
            cardView.setVisibility(0);
        }
        TextView textView = this.f47201e;
        if (textView != null) {
            textView.setText(new mn.a(new l22.a(getContext())).a(activityListItemDTO.f29253c));
        }
        ViewGroup viewGroup = this.f47199c;
        if ((viewGroup instanceof ConstraintLayout) && (dVar = this.f47210n) != null) {
            dVar.b((ConstraintLayout) viewGroup);
        }
        Context context2 = getContext();
        context2.getClass();
        if (c22.b.e(context2)) {
            Context context3 = getContext();
            context3.getClass();
            int iC = (int) c22.b.c(context3, getResources().getDimensionPixelSize(R.dimen.icon_small), 1.5f);
            ImageView imageView2 = this.f47200d;
            if (imageView2 != null && (layoutParams2 = imageView2.getLayoutParams()) != null) {
                layoutParams2.width = iC;
            }
            ImageView imageView3 = this.f47200d;
            if (imageView3 != null && (layoutParams = imageView3.getLayoutParams()) != null) {
                layoutParams.height = iC;
            }
        }
        Context context4 = getContext();
        context4.getClass();
        if (c22.b.a(context4) >= 1.5f) {
            TextView textView2 = this.f47201e;
            if (textView2 != null) {
                textView2.setMaxLines(2);
            }
            d dVar2 = new d();
            dVar2.f((ConstraintLayout) this.f47199c);
            TextView textView3 = this.f47203g;
            if (textView3 != null) {
                int id3 = textView3.getId();
                dVar2.e(id3, 4);
                TextView textView4 = this.f47206j;
                if (textView4 != null) {
                    dVar2.h(id3, 4, textView4.getId(), 3);
                }
                LinearLayout linearLayout = this.f47212p;
                if (linearLayout != null) {
                    dVar2.h(id3, 3, linearLayout.getId(), 4);
                }
                dVar2.h(id3, 7, 0, 7);
            }
            TextView textView5 = this.f47204h;
            if (textView5 != null) {
                int id4 = textView5.getId();
                dVar2.e(id4, 4);
                TextView textView6 = this.f47206j;
                if (textView6 != null) {
                    dVar2.h(id4, 4, textView6.getId(), 3);
                }
                LinearLayout linearLayout2 = this.f47212p;
                if (linearLayout2 != null) {
                    dVar2.h(id4, 3, linearLayout2.getId(), 4);
                }
            }
            TextView textView7 = this.f47205i;
            if (textView7 != null) {
                int id5 = textView7.getId();
                dVar2.e(id5, 7);
                Guideline guideline = this.f47211o;
                if (guideline != null) {
                    dVar2.h(id5, 7, guideline.getId(), 6);
                }
            }
            ConstraintLayout constraintLayout = this.f47213q;
            if (constraintLayout != null) {
                int id6 = constraintLayout.getId();
                dVar2.e(id6, 6);
                dVar2.e(id6, 7);
                dVar2.e(id6, 3);
                dVar2.e(id6, 4);
                dVar2.h(id6, 6, 0, 6);
                TextView textView8 = this.f47203g;
                if (textView8 == null || textView8.getVisibility() != 0) {
                    TextView textView9 = this.f47204h;
                    if (textView9 != null) {
                        dVar2.h(id6, 3, textView9.getId(), 4);
                    }
                } else {
                    TextView textView10 = this.f47203g;
                    if (textView10 != null) {
                        dVar2.h(id6, 3, textView10.getId(), 4);
                    }
                }
                dVar2.s(id6, 6, getContext().getResources().getDimensionPixelSize(R.dimen.spacing_normal));
            }
            ConstraintLayout constraintLayout2 = this.f47214r;
            if (constraintLayout2 != null) {
                int id7 = constraintLayout2.getId();
                dVar2.e(id7, 3);
                dVar2.e(id7, 6);
                dVar2.e(id7, 7);
                dVar2.e(id7, 4);
                dVar2.h(id7, 6, 0, 6);
                dVar2.h(id7, 7, 0, 7);
                ConstraintLayout constraintLayout3 = this.f47213q;
                if (constraintLayout3 != null) {
                    dVar2.h(id7, 3, constraintLayout3.getId(), 4);
                }
                dVar2.s(id7, 6, getContext().getResources().getDimensionPixelSize(R.dimen.spacing_normal));
            }
            dVar2.b((ConstraintLayout) this.f47199c);
        }
        ImageView imageView4 = this.f47202f;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        TextView textView11 = this.f47203g;
        if (textView11 != null) {
            textView11.setVisibility(0);
        }
        TextView textView12 = this.f47204h;
        if (textView12 != null) {
            textView12.setVisibility(4);
        }
        TextView textView13 = this.f47205i;
        if (textView13 != null) {
            textView13.setVisibility(4);
        }
        int color = a7.b.getColor(getContext(), R.color.gray_black_static);
        TextView textView14 = this.f47201e;
        if (textView14 != null) {
            textView14.setTextColor(color);
        }
        TextView textView15 = this.f47206j;
        if (textView15 != null) {
            textView15.setTextColor(color);
        }
        TextView textView16 = this.f47208l;
        if (textView16 != null) {
            textView16.setTextColor(color);
        }
        int color2 = a7.b.getColor(getContext(), R.color.gcm_text_on_color);
        TextView textView17 = this.f47203g;
        if (textView17 != null) {
            textView17.setTextColor(color2);
        }
        TextView textView18 = this.f47205i;
        if (textView18 != null) {
            textView18.setTextColor(color2);
        }
        TextView textView19 = this.f47204h;
        if (textView19 != null) {
            textView19.setTextColor(color2);
        }
        TextView textView20 = this.f47207k;
        if (textView20 != null) {
            textView20.setTextColor(color2);
        }
        TextView textView21 = this.f47209m;
        if (textView21 != null) {
            textView21.setTextColor(color2);
        }
        ViewGroup viewGroup2 = this.f47199c;
        Drawable background = viewGroup2 != null ? viewGroup2.getBackground() : null;
        background.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        Context context5 = getContext();
        context5.getClass();
        x0Var.getClass();
        gradientDrawable.mutate();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(gm.c.a(context5, x0Var));
        setActivityMetrics(activityListItemDTO);
    }

    public /* synthetic */ SmallActivityCard(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallActivityCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
