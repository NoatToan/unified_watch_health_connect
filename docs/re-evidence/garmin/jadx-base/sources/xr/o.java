package xr;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.g.w f192008b;

    public /* synthetic */ o(nr.g.w wVar, int i14) {
        this.f192007a = i14;
        this.f192008b = wVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i14 = this.f192007a;
        nr.g.w wVar = this.f192008b;
        switch (i14) {
            case 0:
                int i15 = p.f192009g;
                ((View) obj).getClass();
                wVar.f127170f.invoke();
                break;
            default:
                p pVar = (p) obj;
                pVar.getClass();
                TextView textView = pVar.f192014e;
                View view2 = pVar.f192012c;
                Integer num = wVar.f127173i;
                Boolean bool = wVar.f127176l;
                k32.k kVar = pVar.f192011b;
                if (kVar != null) {
                    k32.k.a(kVar, wVar.f127166b, wVar.f127167c);
                }
                int iIntValue = 0;
                if (kVar != null) {
                    String str = wVar.f127168d;
                    ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                    ImageView imageView = kVar.f102705d;
                    scaleType.getClass();
                    int iApplyDimension = (int) TypedValue.applyDimension(1, 48, imageView.getContext().getResources().getDisplayMetrics());
                    imageView.getLayoutParams().height = iApplyDimension;
                    imageView.getLayoutParams().width = iApplyDimension;
                    imageView.requestLayout();
                    imageView.setScaleType(scaleType);
                    Context context = imageView.getContext();
                    context.getClass();
                    zp0.c cVar = new zp0.c(context);
                    cVar.f206565e = str;
                    cVar.f206570j = R.drawable.no_trail_photo_placeholder;
                    cVar.h(imageView);
                    imageView.setVisibility(0);
                }
                v22.e.n(pVar, new o(wVar, iIntValue));
                if (wVar.f127172h) {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    String str2 = wVar.f127175k;
                    Boolean bool2 = Boolean.TRUE;
                    boolean zG = s.g(bool, bool2);
                    UserLevelImageView userLevelImageView = pVar.f192013d;
                    if (userLevelImageView != null) {
                        userLevelImageView.setProfileImageData(new b12.b((zG || !g22.n.d(str2)) ? null : str2, zG ? 2131231047 : null, null, null, null, 28, null));
                    }
                    float fApplyDimension = TypedValue.applyDimension(1, 48, pVar.getContext().getResources().getDisplayMetrics());
                    if (userLevelImageView != null && (layoutParams2 = userLevelImageView.getLayoutParams()) != null) {
                        layoutParams2.height = (int) fApplyDimension;
                    }
                    if (userLevelImageView != null && (layoutParams = userLevelImageView.getLayoutParams()) != null) {
                        layoutParams.width = (int) fApplyDimension;
                    }
                    if (userLevelImageView != null) {
                        userLevelImageView.setVisibility(0);
                    }
                    if (num == null || num.intValue() == 0) {
                        if (textView != null) {
                            textView.setText(pVar.getContext().getString(R.string.trail_leave_a_review));
                        }
                        if (view2 != null) {
                            view2.setOnClickListener(null);
                        }
                    } else {
                        if (textView != null) {
                            textView.setText(pVar.getContext().getString(s.g(bool, bool2) ? R.string.lbl_reviewed_anonymously_on_date : R.string.lbl_reviewed_on_date, wVar.f127174j));
                        }
                        if (view2 != null) {
                            view2.setOnClickListener(new xp0.d(wVar, 3));
                        }
                    }
                    r rVar = pVar.f192015f;
                    if (rVar != null) {
                        iIntValue = num != null ? num.intValue() : 0;
                        x9.b bVar = new x9.b(6, pVar, wVar);
                        rVar.f192018a.t(iIntValue);
                        rVar.f192019b.setValue(bVar);
                    }
                } else if (view2 != null) {
                    view2.setVisibility(8);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
