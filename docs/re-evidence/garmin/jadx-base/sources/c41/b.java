package c41;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v22.e;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc41/b;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f24337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f24338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f24339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f24340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f24341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f24342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f24343g;

    public b(View view2) {
        this.f24337a = view2;
        this.f24338b = view2 != null ? (ImageView) view2.findViewById(R.id.highlight_image) : null;
        this.f24339c = view2 != null ? (TextView) view2.findViewById(R.id.highlight_image_text) : null;
        this.f24340d = view2 != null ? (TextView) view2.findViewById(R.id.highlight_value) : null;
        this.f24341e = view2 != null ? (TextView) view2.findViewById(R.id.highlight_unit) : null;
        this.f24342f = view2 != null ? (TextView) view2.findViewById(R.id.highlight_label) : null;
        this.f24343g = view2 != null ? (TextView) view2.findViewById(R.id.highlight_secondary_label) : null;
    }

    public final void a(l lVar) {
        Integer num = lVar.f207550g;
        String str = lVar.f207545b;
        TextView textView = this.f24340d;
        if (str != null) {
            if (textView != null) {
                textView.setText(str);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(4);
        }
        String str2 = lVar.f207547d;
        TextView textView2 = this.f24341e;
        if (str2 != null) {
            if (textView2 != null) {
                textView2.setText(str2);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        String str3 = lVar.f207546c;
        TextView textView3 = this.f24342f;
        if (str3 != null) {
            if (textView3 != null) {
                textView3.setText(str3);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else if (textView3 != null) {
            textView3.setVisibility(8);
        }
        String str4 = lVar.f207548e;
        TextView textView4 = this.f24343g;
        if (str4 != null) {
            if (textView4 != null) {
                textView4.setText(str4);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (textView4 != null) {
            textView4.setVisibility(8);
        }
        Integer num2 = lVar.f207549f;
        View view2 = this.f24337a;
        TextView textView5 = this.f24339c;
        ImageView imageView = this.f24338b;
        if (num2 == null && num == null) {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        } else {
            if (num2 != null) {
                int iIntValue = num2.intValue();
                if (imageView != null) {
                    e.h(imageView, iIntValue);
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
                if (view2 != null && view2.getContext() != null) {
                    if (imageView != null) {
                        imageView.setImageDrawable(a7.b.getDrawable(view2.getContext(), iIntValue2));
                    }
                    if (imageView != null) {
                        imageView.setBackground(null);
                    }
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                }
            }
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        if (view2 != null) {
            view2.setVisibility(0);
            Unit unit = Unit.INSTANCE;
        }
    }
}
