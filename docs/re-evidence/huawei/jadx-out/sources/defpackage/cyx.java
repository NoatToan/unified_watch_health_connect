package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.datatype.TodoSwitchSync;
import com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cyx implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31514b;
    private final Activity d;
    private ImageView e;
    private View f;
    private View g;
    private View h;
    private volatile int i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f31515c = new a(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f31513a = new d();

    static class d extends BaseHandler<cyx> {
        private d(cyx cyxVar) {
            super(cyxVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(cyx cyxVar, Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                SharedPreferenceManager.e(cyxVar.d, String.valueOf(10006), "SP_KEY_HOME_TODO_ICON_VISIBLE", "false", null);
                cyxVar.d();
                return;
            }
            int i2 = message.arg1;
            cyxVar.i = i2;
            cyxVar.d(i2, message.arg2);
            cyxVar.d();
        }
    }

    public cyx(Activity activity) {
        this.d = activity;
    }

    public void a() {
        this.f = this.d.getLayoutInflater().inflate(R.layout.home_todo_float_view, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_61_5dp);
        layoutParams.rightMargin = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_14dp);
        ((FrameLayout) this.d.getWindow().getDecorView().findViewById(android.R.id.content)).addView(this.f, layoutParams);
        this.f.bringToFront();
        this.g = this.f.findViewById(R.id.todo_float_prompt_layout);
        this.h = this.f.findViewById(R.id.todo_float_icon_layout);
        this.e = (ImageView) this.f.findViewById(R.id.todo_float_icon);
        View viewFindViewById = this.f.findViewById(R.id.todo_float_clickable);
        viewFindViewById.setOnClickListener(this);
        lrd.a(viewFindViewById, qre.f(R.string.sug_fitness_today_todo), (Class<?>) Button.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        String strE = SharedPreferenceManager.e(this.d, Integer.toString(10006), "SP_KEY_HOME_TODO_ICON_VISIBLE");
        boolean z = TextUtils.isEmpty(strE) || "true".equalsIgnoreCase(strE);
        if (z) {
            Handler handler = this.f31513a;
            handler.sendMessageDelayed(Message.obtain(handler, 2), 30000L);
        }
        this.g.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        LogUtil.a("TodoFloatingViewInteractor", "updateIcon", Integer.valueOf(i));
        View view = this.f;
        if (view == null) {
            LogUtil.j("TodoFloatingViewInteractor", "updateIcon mRootView is null, return");
            return;
        }
        boolean z = i != 2;
        if (view.getVisibility() == 0 && z) {
            czv.c(this.d, AnalyticsValue.HEALTH_LIFE_TODO_ICON_EXPOSE_2040177, null, i2, 0);
        }
        this.h.setVisibility(z ? 0 : 8);
        if (this.e == null || !z) {
            return;
        }
        int i3 = R.drawable.ic_todo_list;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            i3 = R.drawable.ic_todo_list_mirr;
        }
        ImageView imageView = this.e;
        if (i != 0) {
            i3 = R.drawable.ic_todo_done;
        }
        imageView.setImageResource(i3);
    }

    private void c() {
        LogUtil.a("TodoFloatingViewInteractor", "fetchTodo1:");
        this.f31514b = SystemClock.elapsedRealtime();
        czq.b().b(this.f31515c);
    }

    public void b(boolean z) {
        LogUtil.a("TodoFloatingViewInteractor", "refreshUi isVisible = ", Boolean.valueOf(z));
        if (this.f == null) {
            LogUtil.j("TodoFloatingViewInteractor", "refreshUi mRootView is null");
            return;
        }
        boolean z2 = czv.b(this.d) && z;
        LogUtil.a("TodoFloatingViewInteractor", "refreshUi isShowFloatView = ", Boolean.valueOf(z2));
        d(z2);
        if (z2) {
            if (this.f31514b == 0) {
                this.f31515c.a(0, czq.b().e());
            }
            c();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!qrs.e(view) && view.getId() == R.id.todo_float_clickable) {
            Message.obtain(this.f31513a, 2).sendToTarget();
            b(false);
            new cyv(this.d).show();
        }
    }

    private void d(boolean z) {
        if (z) {
            if (this.f.getVisibility() == 8) {
                this.f.setVisibility(0);
                e(z);
            } else {
                this.f.setVisibility(0);
            }
        } else {
            this.f.setVisibility(8);
        }
        qso.d().a(this.f, true);
    }

    private void e(final boolean z) {
        TodoAnimatorUtil.e(z, this.e, new Animation.AnimationListener() { // from class: cyx.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                cyx.this.f.setVisibility(z ? 0 : 8);
            }
        });
    }

    static class a implements IBaseResponseCallback {
        private final WeakReference<cyx> d;

        a(cyx cyxVar) {
            this.d = new WeakReference<>(cyxVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("TodoFloatingViewInteractor", "fetchTodo2:");
            cyx cyxVar = this.d.get();
            if (cyxVar == null) {
                return;
            }
            int size = 0;
            int i2 = 2;
            if (obj instanceof List) {
                List list = (List) obj;
                if (njy.b(list) && njy.b(obj, ikw.class)) {
                    TodoSwitchSync todoSwitchSyncD = Looper.myLooper() == Looper.getMainLooper() ? czv.d(cyxVar.d) : czv.e(cyxVar.d);
                    ArrayList arrayList = new ArrayList();
                    if (njy.b(list)) {
                        arrayList.addAll(list);
                    }
                    czv.b(arrayList, todoSwitchSyncD, false);
                    size = arrayList.size();
                    if (njy.b(arrayList)) {
                        czv.b(arrayList, todoSwitchSyncD, true);
                        i2 = !njy.b(arrayList) ? 1 : 0;
                    }
                }
            }
            cyxVar.f31513a.obtainMessage(1, i2, size).sendToTarget();
        }
    }
}
