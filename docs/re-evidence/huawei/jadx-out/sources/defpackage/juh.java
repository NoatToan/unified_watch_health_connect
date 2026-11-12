package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class juh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f39063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private juu f39064c;
    private View d;
    private jvo e;
    private float f;

    public juh(juu juuVar, jvo jvoVar) {
        this.f39064c = juuVar;
        this.e = jvoVar;
        e();
    }

    private void e() {
        View viewJ = this.e.j();
        this.d = viewJ;
        this.f39063b = (ImageView) viewJ.findViewById(R.id.img_lock);
        this.f39062a = LanguageUtil.ba(BaseApplication.getContext());
    }

    public void b() {
        LinearLayout linearLayout = (LinearLayout) this.d.findViewById(R.id.layout_lockoperation);
        if (linearLayout == null) {
            return;
        }
        linearLayout.setOnTouchListener(new c());
    }

    public void d(boolean z) {
        this.f39064c.b(z);
    }

    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f39065a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f39066c;
        private final long e;

        private c() {
            this.e = qrs.d(BaseApplication.getContext(), 4.0f);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (juh.this.f == 0.0f) {
                juh juhVar = juh.this;
                juhVar.f = juhVar.f39063b.getX();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f39066c = motionEvent.getRawX();
            } else if (action == 1) {
                juh.this.f39063b.animate().x(juh.this.f).setDuration(300L).start();
                if (d()) {
                    e();
                }
            } else if (action == 2) {
                this.f39065a = motionEvent.getRawX();
                juh.this.f39063b.setX(c());
            }
            return true;
        }

        private float c() {
            float f;
            float f2;
            if (juh.this.f39062a) {
                f = juh.this.f;
                f2 = this.f39066c - this.f39065a;
            } else {
                f = juh.this.f + this.f39065a;
                f2 = this.f39066c;
            }
            return f - f2;
        }

        private boolean d() {
            if (juh.this.f39062a) {
                return this.f39066c - this.f39065a >= 400.0f;
            }
            return this.f39065a - this.f39066c >= 400.0f;
        }

        private void e() {
            View viewC;
            if (qrs.c(700)) {
                LogUtil.j("TrackDataShowAnimationManager", "view click too fast.");
                return;
            }
            juh.this.f39064c.d(false);
            juh.this.e.b().setVisibility(8);
            if (juh.this.e.t() != null) {
                juh.this.e.t().setClickable(true);
            }
            if (!juh.this.e.v()) {
                viewC = juh.this.e.c();
            } else {
                viewC = juh.this.d.findViewById(R.id.layout_StopOrResume);
            }
            viewC.setAnimation(a());
            viewC.setVisibility(0);
            juh.this.d(true);
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("type", 0);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MOTION_TRACK_1040028.value(), map, 0);
        }

        private TranslateAnimation a() {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(250L);
            return translateAnimation;
        }
    }
}
