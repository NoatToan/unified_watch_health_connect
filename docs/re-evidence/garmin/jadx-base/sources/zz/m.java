package zz;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzz/m;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f207552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f207553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f207554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f207555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f207556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f207557f;

    public m(View view2) {
        this.f207552a = view2;
        this.f207553b = view2 != null ? (ImageView) view2.findViewById(R.id.highlight_image) : null;
        this.f207554c = view2 != null ? (TextView) view2.findViewById(R.id.highlight_value) : null;
        this.f207555d = view2 != null ? (TextView) view2.findViewById(R.id.highlight_unit) : null;
        this.f207556e = view2 != null ? (TextView) view2.findViewById(R.id.highlight_label) : null;
        this.f207557f = view2 != null ? (TextView) view2.findViewById(R.id.highlight_secondary_label) : null;
    }

    public final void a(l lVar) {
        lVar.getClass();
        Integer num = lVar.f207550g;
        String str = lVar.f207545b;
        TextView textView = this.f207557f;
        TextView textView2 = this.f207554c;
        if (str != null) {
            if (textView2 != null) {
                textView2.setText(str);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(4);
        }
        String str2 = lVar.f207547d;
        TextView textView3 = this.f207555d;
        if (str2 != null) {
            if (textView3 != null) {
                textView3.setText(str2);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else if (textView3 != null) {
            textView3.setVisibility(8);
        }
        String str3 = lVar.f207546c;
        TextView textView4 = this.f207556e;
        if (str3 != null) {
            if (textView4 != null) {
                textView4.setText(str3);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (textView4 != null) {
            textView4.setVisibility(8);
        }
        String str4 = lVar.f207548e;
        if (str4 != null) {
            if (textView != null) {
                textView.setText(str4);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        Integer num2 = lVar.f207549f;
        View view2 = this.f207552a;
        ImageView imageView = this.f207553b;
        if (num2 != null || num != null) {
            if (num2 != null) {
                int iIntValue = num2.intValue();
                if (imageView != null) {
                    v22.e.h(imageView, iIntValue);
                }
                if (imageView != null) {
                    imageView.setImageDrawable(null);
                }
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                Integer num3 = lVar.f207551h;
                if (view2 != null && view2.getContext() != null) {
                    Drawable drawable = a7.b.getDrawable(view2.getContext(), iIntValue2);
                    if (num3 != null && drawable != null) {
                        Context context = view2.getContext();
                        context.getClass();
                        og2.k.F(num3.intValue(), context, drawable);
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                    if (imageView != null) {
                        imageView.setBackground(null);
                    }
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                }
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (view2 != null) {
            view2.setVisibility(0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b() {
        View view2 = this.f207552a;
        if (view2 != null) {
            Context context = view2.getContext();
            context.getClass();
            float fB = c22.b.b(context, view2.getResources().getDimension(R.dimen.andfont_body_2), 1.4f);
            TextView textView = this.f207554c;
            if (textView != null) {
                textView.setTextSize(0, fB);
            }
            Context context2 = view2.getContext();
            context2.getClass();
            float fB2 = c22.b.b(context2, view2.getResources().getDimension(R.dimen.andfont_label), 1.4f);
            TextView textView2 = this.f207555d;
            if (textView2 != null) {
                textView2.setTextSize(0, fB2);
            }
            TextView textView3 = this.f207556e;
            if (textView3 != null) {
                textView3.setTextSize(0, fB2);
            }
            TextView textView4 = this.f207557f;
            if (textView4 != null) {
                textView4.setTextSize(0, fB2);
            }
        }
    }

    public final void c() {
        View view2 = this.f207552a;
        if (view2 != null) {
            view2.setVisibility(8);
            Unit unit = Unit.INSTANCE;
        }
    }
}
