package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ucr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FaCardAgdsApi f49940c = etv.b();
    private final View d;
    private final PopupWindow e;

    public boolean c() {
        int i = this.f49939b;
        boolean zB = false;
        if (i == 0) {
            zB = SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "FA_BUBBLE_SHOWN", false);
        } else if (i == 1) {
            zB = SharedPreferenceManager.b(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "FA_BUBBLE_SHOWN", false);
        }
        LogUtil.a("FaCardHelper", "isShown: ", Boolean.valueOf(zB), "type:", Integer.valueOf(this.f49939b));
        return zB;
    }

    public boolean d() {
        int i = this.f49939b;
        boolean zB = false;
        if (i == 0) {
            zB = SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "SERVICE_EXPRESS_CARD_CLICKED", false);
        } else if (i == 1) {
            zB = SharedPreferenceManager.b(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "SERVICE_EXPRESS_CARD_CLICKED", false);
        } else {
            LogUtil.e("FaCardHelper", "error type: ", Integer.valueOf(i));
        }
        LogUtil.a("FaCardHelper", "isClicked: ", Boolean.valueOf(zB), "type:", Integer.valueOf(this.f49939b));
        return zB;
    }

    public void a(int i) {
        LogUtil.a("FaCardHelper", "setBubbleShownSp type:", Integer.valueOf(i));
        if (i == 0) {
            SharedPreferenceManager.a("MMKV_SUGGEST_MODULE_TAG", "FA_BUBBLE_SHOWN", true);
        } else if (i == 1) {
            SharedPreferenceManager.a(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "FA_BUBBLE_SHOWN", true);
        }
    }

    public void a() {
        LogUtil.a("FaCardHelper", "setCardClickedSp type:", Integer.valueOf(this.f49939b));
        int i = this.f49939b;
        if (i == 0) {
            SharedPreferenceManager.a("MMKV_SUGGEST_MODULE_TAG", "SERVICE_EXPRESS_CARD_CLICKED", true);
        } else if (i == 1) {
            SharedPreferenceManager.a(String.valueOf(PrebakedEffectId.RT_COIN_DROP), "SERVICE_EXPRESS_CARD_CLICKED", true);
        }
    }

    public void d(int i) {
        LogUtil.a("FaCardHelper", "jumpToServiceExpressCard, type:", Integer.valueOf(this.f49939b), "requestCode:", Integer.valueOf(i));
        etv.b().faQuickServicesBiEvent(1, (i == 300 || i == 200) ? 3 : 2, ucq.e(this.f49939b));
        this.f49940c.open(i, e(this.f49939b), new FaCardAgdsApi.OpenAgdsResultCallback() { // from class: ucp
            @Override // com.huawei.health.facardagds.FaCardAgdsApi.OpenAgdsResultCallback
            public final void onResponse(int i2) {
                ucr.c(i2);
            }
        });
    }

    static /* synthetic */ void c(int i) {
        if (i != 0) {
            LogUtil.e("FaCardHelper", "jumpToServiceExpressCard error,", " errorCode: ", Integer.valueOf(i));
            ReleaseLogUtil.a("R_Sleep_FaCardHelper", "JTSE error");
        }
    }

    public PopupWindow a(Activity activity, int i) {
        if (activity == null) {
            LogUtil.e("FaCardHelper", "activity == null");
            return null;
        }
        if (!ucq.b()) {
            LogUtil.e("FaCardHelper", "!isSupportFaCardShow");
            return null;
        }
        if (c()) {
            LogUtil.e("FaCardHelper", "BubbleHaveShown");
            return null;
        }
        LogUtil.a("FaCardHelper", "start initFaBubble");
        PopupWindow popupWindow = new PopupWindow(activity.getLayoutInflater().inflate(R.layout.fa_bubble, (ViewGroup) null), activity.getResources().getDisplayMetrics().widthPixels < 730 ? -2 : 730, -2);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setFocusable(false);
        d(popupWindow.getContentView(), i);
        return popupWindow;
    }

    public void d(View view, final int i) {
        if (view == null) {
            LogUtil.e("FaCardHelper", "faBubbleLayout == null");
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.fa_cancel);
        if (textView == null) {
            LogUtil.e("FaCardHelper", "cancelTx == null");
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: uco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.c(i, view2);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ucn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f49937a.e(i, view2);
            }
        };
        TextView textView2 = (TextView) view.findViewById(R.id.fa_add_card);
        if (textView2 == null) {
            LogUtil.e("FaCardHelper", "addCardTx == null");
            return;
        }
        textView2.setOnClickListener(onClickListener);
        View viewFindViewById = view.findViewById(R.id.fa_bubble_layout);
        if (viewFindViewById == null) {
            LogUtil.e("FaCardHelper", "relativeLayout == null");
            return;
        }
        viewFindViewById.setOnClickListener(onClickListener);
        TextView textView3 = (TextView) view.findViewById(R.id.fa_bubble_content);
        if (textView3 == null) {
            LogUtil.e("FaCardHelper", "fa_content == null");
        } else if (i == 0) {
            textView3.setText(qre.f(R.string.IDS_fa_bubble_text));
        } else if (i == 1) {
            textView3.setText(qre.f(R.string.IDS_fa_bubble_text_sleep));
        }
    }

    /* synthetic */ void c(int i, View view) {
        a(i);
        this.e.dismiss();
    }

    /* synthetic */ void e(int i, View view) {
        d(i == 0 ? 300 : 200);
        a(i);
        this.e.dismiss();
    }

    public ucr(Activity activity, View view, int i) {
        this.f49939b = i;
        this.d = view;
        this.e = a(activity, i);
    }

    public void e() {
        PopupWindow popupWindow = this.e;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
        this.f49940c.close();
    }

    public void b(int i) {
        View view;
        PopupWindow popupWindow = this.e;
        if (popupWindow == null) {
            return;
        }
        if (i != 0) {
            if (i == 8) {
                popupWindow.dismiss();
                return;
            }
            return;
        }
        if (c() || (view = this.d) == null) {
            return;
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                LogUtil.a("FaCardHelper", "activity isFinishing");
                return;
            }
            if (activity.isDestroyed()) {
                LogUtil.a("FaCardHelper", "activity isDestroyed");
            } else if (this.d.getWindowToken() != null) {
                try {
                    this.e.showAsDropDown(this.d, 0, 0);
                } catch (WindowManager.BadTokenException e) {
                    LogUtil.e("FaCardHelper", "setDismissOrShow exception", LogAnonymous.b(e));
                }
            }
        }
    }

    private String e(int i) {
        if (i == 0) {
            return FaCardAgdsApi.SPORT_FA_CARD;
        }
        if (i == 1) {
            return FaCardAgdsApi.SLEEP_FA_CARD;
        }
        LogUtil.e("FaCardHelper", "type error: ", Integer.valueOf(i));
        return "ErrorConstants.ERROR";
    }
}
