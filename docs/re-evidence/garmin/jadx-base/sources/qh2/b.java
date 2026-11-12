package qh2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import aq.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqh2/b;", "Lqh2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "getRequiredControlStartPosition", "()I", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends qh2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f144803d = 0;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0, 6, null);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.dsl_bounded_controls_menu_round_preview, (ViewGroup) this, true);
    }

    @Override // qh2.a
    public int getRequiredControlStartPosition() {
        return 0;
    }

    @Override // qh2.a
    public final void i(int i14) {
        setNoOfOptions(i14);
        int i15 = 360 / i14;
        setWatchFaceIconImageViews(new ImageView[i14]);
        for (int i16 = 0; i16 < i14; i16++) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
            linearLayout.setRotation(i15 * i16);
            getWatchFaceIconImageViews()[i16] = new ImageView(getContext());
            ImageView imageView = getWatchFaceIconImageViews()[i16];
            if (imageView != null) {
                imageView.setImageResource(2131231194);
            }
            ImageView imageView2 = getWatchFaceIconImageViews()[i16];
            if (imageView2 != null) {
                imageView2.setBackgroundResource(R.drawable.control_round_watch_face_item_selector);
            }
            int i17 = (int) (5 * getResources().getDisplayMetrics().density);
            ImageView imageView3 = getWatchFaceIconImageViews()[i16];
            if (imageView3 != null) {
                imageView3.setPadding(i17, i17, i17, i17);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, (int) ((i14 == 10 ? 140 : 120) * getResources().getDisplayMetrics().density));
            ImageView imageView4 = getWatchFaceIconImageViews()[i16];
            if (imageView4 != null) {
                imageView4.setLayoutParams(layoutParams);
            }
            ImageView imageView5 = getWatchFaceIconImageViews()[i16];
            if (imageView5 != null) {
                imageView5.setOnClickListener(new b0(this, i16, 16));
            }
            ImageView imageView6 = getWatchFaceIconImageViews()[i16];
            if (imageView6 != null) {
                imageView6.setRotation(-(i15 * i16));
            }
            linearLayout.addView(getWatchFaceIconImageViews()[i16]);
            addView(linearLayout);
            linearLayout.setId(View.generateViewId());
            d dVar = new d();
            dVar.f(this);
            dVar.h(linearLayout.getId(), 3, 0, 3);
            dVar.h(linearLayout.getId(), 4, 0, 4);
            dVar.h(linearLayout.getId(), 6, 0, 6);
            dVar.h(linearLayout.getId(), 7, 0, 7);
            dVar.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqh2/b$a;", "", "<init>", "()V", "", "BACKGROUND_CIRCLE_PADDING", "I", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
