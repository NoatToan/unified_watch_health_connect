package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class tfh {
    private static volatile tfh e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f49064a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f49065c;
    private List<Integer> d;

    private tfh(Context context) {
        if (context == null) {
            this.f49065c = BaseApplication.b();
        } else {
            this.f49065c = context.getApplicationContext();
        }
        c();
    }

    public static tfh c(Context context) {
        if (e == null) {
            e = new tfh(context);
        }
        return e;
    }

    private void c() {
        HiHealthNativeApi.a(this.f49065c).subscribeHiHealthData(102, new HiSubscribeListener() { // from class: tfh.4
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                if (!njy.e(list)) {
                    tfh.this.d = list;
                } else {
                    LogUtil.e("UIHLH_SubscribeUserPrefUtil", "successList is null");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                if (i == 102) {
                    LogUtil.a("UIHLH_SubscribeUserPrefUtil", "PREFERENCE_INFO onChange");
                    if (tfh.this.f49064a != null) {
                        Message messageObtainMessage = tfh.this.f49064a.obtainMessage();
                        messageObtainMessage.what = 6;
                        tfh.this.f49064a.sendMessage(messageObtainMessage);
                    }
                }
            }
        });
    }

    public void c(Handler handler) {
        this.f49064a = handler;
        if (handler == null) {
            if (njy.b(this.d)) {
                HiHealthNativeApi.a(this.f49065c).unSubscribeHiHealthData(this.d, new HiUnSubscribeListener() { // from class: tfh.1
                    @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                    public void onResult(boolean z) {
                        LogUtil.a("UIHLH_SubscribeUserPrefUtil", "unSubscribeUserPreference isSuccess = ", Boolean.valueOf(z));
                    }
                });
            }
            e = null;
        }
    }

    public static void c(skw skwVar, HealthTextView healthTextView) {
        LogUtil.a("UIHLH_SubscribeUserPrefUtil", "bindViewHolder enter");
        if (skwVar == null) {
            LogUtil.a("UIHLH_SubscribeUserPrefUtil", "managementViewCardData is null");
        } else {
            healthTextView.setText(skwVar.c());
        }
    }

    public static void b(Context context, skw skwVar, HealthTextView healthTextView, ImageView imageView) {
        int identifier;
        LogUtil.a("UIHLH_SubscribeUserPrefUtil", "bindViewHolder enter");
        if (skwVar == null) {
            LogUtil.a("UIHLH_SubscribeUserPrefUtil", "managementViewCardData is null");
            return;
        }
        healthTextView.setText(skwVar.c());
        String strD = skwVar.d();
        if (strD == null || strD.length() == 0 || (identifier = context.getResources().getIdentifier(strD, "drawable", context.getPackageName())) <= 0) {
            return;
        }
        imageView.setBackground(context.getResources().getDrawable(identifier));
    }
}
