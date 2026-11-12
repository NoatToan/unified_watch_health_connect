package com.xmlywind.sdk.videoAd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.common.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class BaseAdActivity extends Activity {
    private static Intent a(Context context, Class<? extends BaseAdActivity> cls, String str, String str2) {
        Intent intent = new Intent(context, cls);
        intent.setFlags(268435456);
        intent.putExtra("ad_view_class_name", str2);
        intent.putExtra("adUnit_requestId_key", str);
        int requestedOrientation = context instanceof Activity ? ((Activity) context).getRequestedOrientation() : 3;
        if (requestedOrientation != 7 && requestedOrientation != 6) {
            requestedOrientation = context.getResources().getDisplayMetrics().widthPixels > context.getResources().getDisplayMetrics().heightPixels ? 6 : 7;
        }
        intent.putExtra(Constants.REQUESTED_ORIENTATION, requestedOrientation);
        intent.putExtra(Constants.BROADCAST_IDENTIFIER_KEY, str);
        return intent;
    }

    public static void a(Context context, Class<? extends BaseAdActivity> cls, String str) {
        a(context, cls, str, null, "LandPage");
    }

    public static void a(Context context, Class<? extends BaseAdActivity> cls, String str, Bundle bundle, String str2) {
        Intent intentA = a(context, cls, str, str2);
        if (bundle != null) {
            try {
                intentA.putExtras(bundle);
            } catch (Throwable th) {
                HashMap map = new HashMap();
                map.put("error", th.getMessage());
                BaseBroadcastReceiver.a(context, str, map, IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL);
                return;
            }
        }
        context.startActivity(intentA);
    }

    public static void b(Context context, Class<? extends BaseAdActivity> cls, String str) {
        try {
            Intent intent = new Intent(context, cls);
            intent.setFlags(268435456);
            intent.putExtra("ad_view_class_name", "DisLike");
            intent.putExtra("adUnit_requestId_key", str);
            int requestedOrientation = context instanceof Activity ? ((Activity) context).getRequestedOrientation() : 3;
            if (requestedOrientation != 7 && requestedOrientation != 6) {
                requestedOrientation = context.getResources().getDisplayMetrics().widthPixels > context.getResources().getDisplayMetrics().heightPixels ? 6 : 7;
            }
            intent.putExtra(Constants.REQUESTED_ORIENTATION, requestedOrientation);
            intent.putExtra(Constants.BROADCAST_IDENTIFIER_KEY, "dislike_broadcastIdentifier");
            context.startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(new ContextWrapper(context) { // from class: com.xmlywind.sdk.videoAd.BaseAdActivity.1
            @Override // android.content.ContextWrapper, android.content.Context
            public Object getSystemService(String str) {
                return "audio".equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(null);
        }
        SigmobLog.d("BaseAdActivity onDestroy() called");
    }
}
